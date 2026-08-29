package e0;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class s {
    public static AudioAttributes a(AudioAttributes.Builder builder) {
        return builder.build();
    }

    public static AudioAttributes.Builder b() {
        return new AudioAttributes.Builder();
    }

    public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i10) {
        return builder.setContentType(i10);
    }

    public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i10) {
        return builder.setLegacyStreamType(i10);
    }

    public static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i10) {
        return builder.setUsage(i10);
    }
}
