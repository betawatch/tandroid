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
import kotlin.collections.CollectionsKt;
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

    public final String getFileExtension() {
        return fileExtension;
    }

    @Override // androidx.datastore.core.Serializer
    public Preferences getDefaultValue() {
        return PreferencesFactory.createEmpty();
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

    private final PreferencesProto$Value getValueProto(Object obj) {
        if (obj instanceof Boolean) {
            GeneratedMessageLite build = PreferencesProto$Value.newBuilder().setBoolean(((Boolean) obj).booleanValue()).build();
            Intrinsics.checkNotNullExpressionValue(build, "newBuilder().setBoolean(value).build()");
            return (PreferencesProto$Value) build;
        }
        if (obj instanceof Float) {
            GeneratedMessageLite build2 = PreferencesProto$Value.newBuilder().setFloat(((Number) obj).floatValue()).build();
            Intrinsics.checkNotNullExpressionValue(build2, "newBuilder().setFloat(value).build()");
            return (PreferencesProto$Value) build2;
        }
        if (obj instanceof Double) {
            GeneratedMessageLite build3 = PreferencesProto$Value.newBuilder().setDouble(((Number) obj).doubleValue()).build();
            Intrinsics.checkNotNullExpressionValue(build3, "newBuilder().setDouble(value).build()");
            return (PreferencesProto$Value) build3;
        }
        if (obj instanceof Integer) {
            GeneratedMessageLite build4 = PreferencesProto$Value.newBuilder().setInteger(((Number) obj).intValue()).build();
            Intrinsics.checkNotNullExpressionValue(build4, "newBuilder().setInteger(value).build()");
            return (PreferencesProto$Value) build4;
        }
        if (obj instanceof Long) {
            GeneratedMessageLite build5 = PreferencesProto$Value.newBuilder().setLong(((Number) obj).longValue()).build();
            Intrinsics.checkNotNullExpressionValue(build5, "newBuilder().setLong(value).build()");
            return (PreferencesProto$Value) build5;
        }
        if (obj instanceof String) {
            GeneratedMessageLite build6 = PreferencesProto$Value.newBuilder().setString((String) obj).build();
            Intrinsics.checkNotNullExpressionValue(build6, "newBuilder().setString(value).build()");
            return (PreferencesProto$Value) build6;
        }
        if (obj instanceof Set) {
            GeneratedMessageLite build7 = PreferencesProto$Value.newBuilder().setStringSet(PreferencesProto$StringSet.newBuilder().addAllStrings((Set) obj)).build();
            Intrinsics.checkNotNullExpressionValue(build7, "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()");
            return (PreferencesProto$Value) build7;
        }
        throw new IllegalStateException(Intrinsics.stringPlus("PreferencesSerializer does not support type: ", obj.getClass().getName()));
    }

    private final void addProtoEntryToPreferences(String str, PreferencesProto$Value preferencesProto$Value, MutablePreferences mutablePreferences) {
        PreferencesProto$Value.ValueCase valueCase = preferencesProto$Value.getValueCase();
        switch (valueCase == null ? -1 : WhenMappings.$EnumSwitchMapping$0[valueCase.ordinal()]) {
            case -1:
                throw new CorruptionException("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                mutablePreferences.set(PreferencesKeys.booleanKey(str), Boolean.valueOf(preferencesProto$Value.getBoolean()));
                return;
            case 2:
                mutablePreferences.set(PreferencesKeys.floatKey(str), Float.valueOf(preferencesProto$Value.getFloat()));
                return;
            case 3:
                mutablePreferences.set(PreferencesKeys.doubleKey(str), Double.valueOf(preferencesProto$Value.getDouble()));
                return;
            case 4:
                mutablePreferences.set(PreferencesKeys.intKey(str), Integer.valueOf(preferencesProto$Value.getInteger()));
                return;
            case 5:
                mutablePreferences.set(PreferencesKeys.longKey(str), Long.valueOf(preferencesProto$Value.getLong()));
                return;
            case 6:
                Preferences.Key stringKey = PreferencesKeys.stringKey(str);
                String string = preferencesProto$Value.getString();
                Intrinsics.checkNotNullExpressionValue(string, "value.string");
                mutablePreferences.set(stringKey, string);
                return;
            case 7:
                Preferences.Key stringSetKey = PreferencesKeys.stringSetKey(str);
                List stringsList = preferencesProto$Value.getStringSet().getStringsList();
                Intrinsics.checkNotNullExpressionValue(stringsList, "value.stringSet.stringsList");
                mutablePreferences.set(stringSetKey, CollectionsKt.toSet(stringsList));
                return;
            case 8:
                throw new CorruptionException("Value not set.", null, 2, null);
        }
    }
}
