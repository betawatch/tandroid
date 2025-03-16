package androidx.datastore.preferences;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.InputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class PreferencesMapCompat {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PreferencesProto$PreferenceMap readFrom(InputStream input) {
            Intrinsics.checkNotNullParameter(input, "input");
            try {
                PreferencesProto$PreferenceMap parseFrom = PreferencesProto$PreferenceMap.parseFrom(input);
                Intrinsics.checkNotNullExpressionValue(parseFrom, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
                return parseFrom;
            } catch (InvalidProtocolBufferException e) {
                throw new CorruptionException("Unable to parse preferences proto.", e);
            }
        }
    }
}
