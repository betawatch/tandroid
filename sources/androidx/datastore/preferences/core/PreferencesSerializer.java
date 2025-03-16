package androidx.datastore.preferences.core;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import androidx.datastore.preferences.PreferencesMapCompat;
import androidx.datastore.preferences.PreferencesProto$PreferenceMap;
import androidx.datastore.preferences.PreferencesProto$StringSet;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PreferencesSerializer implements Serializer {
    public static final PreferencesSerializer INSTANCE = new PreferencesSerializer();
    private static final String fileExtension = "preferences_pb";

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PreferencesProto$Value.ValueCase.values().length];
            iArr[PreferencesProto$Value.ValueCase.BOOLEAN.ordinal()] = 1;
            iArr[PreferencesProto$Value.ValueCase.FLOAT.ordinal()] = 2;
            iArr[PreferencesProto$Value.ValueCase.DOUBLE.ordinal()] = 3;
            iArr[PreferencesProto$Value.ValueCase.INTEGER.ordinal()] = 4;
            iArr[PreferencesProto$Value.ValueCase.LONG.ordinal()] = 5;
            iArr[PreferencesProto$Value.ValueCase.STRING.ordinal()] = 6;
            iArr[PreferencesProto$Value.ValueCase.STRING_SET.ordinal()] = 7;
            iArr[PreferencesProto$Value.ValueCase.VALUE_NOT_SET.ordinal()] = 8;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private PreferencesSerializer() {
    }

    private final void addProtoEntryToPreferences(String str, PreferencesProto$Value preferencesProto$Value, MutablePreferences mutablePreferences) {
        Preferences.Key booleanKey;
        Object valueOf;
        PreferencesProto$Value.ValueCase valueCase = preferencesProto$Value.getValueCase();
        switch (valueCase == null ? -1 : WhenMappings.$EnumSwitchMapping$0[valueCase.ordinal()]) {
            case -1:
                throw new CorruptionException("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                booleanKey = PreferencesKeys.booleanKey(str);
                valueOf = Boolean.valueOf(preferencesProto$Value.getBoolean());
                break;
            case 2:
                booleanKey = PreferencesKeys.floatKey(str);
                valueOf = Float.valueOf(preferencesProto$Value.getFloat());
                break;
            case 3:
                booleanKey = PreferencesKeys.doubleKey(str);
                valueOf = Double.valueOf(preferencesProto$Value.getDouble());
                break;
            case 4:
                booleanKey = PreferencesKeys.intKey(str);
                valueOf = Integer.valueOf(preferencesProto$Value.getInteger());
                break;
            case 5:
                booleanKey = PreferencesKeys.longKey(str);
                valueOf = Long.valueOf(preferencesProto$Value.getLong());
                break;
            case 6:
                booleanKey = PreferencesKeys.stringKey(str);
                valueOf = preferencesProto$Value.getString();
                Intrinsics.checkNotNullExpressionValue(valueOf, "value.string");
                break;
            case 7:
                booleanKey = PreferencesKeys.stringSetKey(str);
                List stringsList = preferencesProto$Value.getStringSet().getStringsList();
                Intrinsics.checkNotNullExpressionValue(stringsList, "value.stringSet.stringsList");
                valueOf = CollectionsKt___CollectionsKt.toSet(stringsList);
                break;
            case 8:
                throw new CorruptionException("Value not set.", null, 2, null);
        }
        mutablePreferences.set(booleanKey, valueOf);
    }

    private final PreferencesProto$Value getValueProto(Object obj) {
        GeneratedMessageLite build;
        String str;
        if (obj instanceof Boolean) {
            build = PreferencesProto$Value.newBuilder().setBoolean(((Boolean) obj).booleanValue()).build();
            str = "newBuilder().setBoolean(value).build()";
        } else if (obj instanceof Float) {
            build = PreferencesProto$Value.newBuilder().setFloat(((Number) obj).floatValue()).build();
            str = "newBuilder().setFloat(value).build()";
        } else if (obj instanceof Double) {
            build = PreferencesProto$Value.newBuilder().setDouble(((Number) obj).doubleValue()).build();
            str = "newBuilder().setDouble(value).build()";
        } else if (obj instanceof Integer) {
            build = PreferencesProto$Value.newBuilder().setInteger(((Number) obj).intValue()).build();
            str = "newBuilder().setInteger(value).build()";
        } else if (obj instanceof Long) {
            build = PreferencesProto$Value.newBuilder().setLong(((Number) obj).longValue()).build();
            str = "newBuilder().setLong(value).build()";
        } else if (obj instanceof String) {
            build = PreferencesProto$Value.newBuilder().setString((String) obj).build();
            str = "newBuilder().setString(value).build()";
        } else {
            if (!(obj instanceof Set)) {
                throw new IllegalStateException(Intrinsics.stringPlus("PreferencesSerializer does not support type: ", obj.getClass().getName()));
            }
            build = PreferencesProto$Value.newBuilder().setStringSet(PreferencesProto$StringSet.newBuilder().addAllStrings((Set) obj)).build();
            str = "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()";
        }
        Intrinsics.checkNotNullExpressionValue(build, str);
        return (PreferencesProto$Value) build;
    }

    @Override // androidx.datastore.core.Serializer
    public Preferences getDefaultValue() {
        return PreferencesFactory.createEmpty();
    }

    public final String getFileExtension() {
        return fileExtension;
    }

    @Override // androidx.datastore.core.Serializer
    public Object readFrom(InputStream inputStream, Continuation continuation) {
        PreferencesProto$PreferenceMap readFrom = PreferencesMapCompat.Companion.readFrom(inputStream);
        MutablePreferences createMutable = PreferencesFactory.createMutable(new Preferences.Pair[0]);
        Map preferencesMap = readFrom.getPreferencesMap();
        Intrinsics.checkNotNullExpressionValue(preferencesMap, "preferencesProto.preferencesMap");
        for (Map.Entry entry : preferencesMap.entrySet()) {
            String name = (String) entry.getKey();
            PreferencesProto$Value value = (PreferencesProto$Value) entry.getValue();
            PreferencesSerializer preferencesSerializer = INSTANCE;
            Intrinsics.checkNotNullExpressionValue(name, "name");
            Intrinsics.checkNotNullExpressionValue(value, "value");
            preferencesSerializer.addProtoEntryToPreferences(name, value, createMutable);
        }
        return createMutable.toPreferences();
    }

    @Override // androidx.datastore.core.Serializer
    public Object writeTo(Preferences preferences, OutputStream outputStream, Continuation continuation) {
        Map asMap = preferences.asMap();
        PreferencesProto$PreferenceMap.Builder newBuilder = PreferencesProto$PreferenceMap.newBuilder();
        for (Map.Entry entry : asMap.entrySet()) {
            newBuilder.putPreferences(((Preferences.Key) entry.getKey()).getName(), getValueProto(entry.getValue()));
        }
        ((PreferencesProto$PreferenceMap) newBuilder.build()).writeTo(outputStream);
        return Unit.INSTANCE;
    }
}
