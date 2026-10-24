package e0;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public abstract class p {
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
