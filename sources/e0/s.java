package e0;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
