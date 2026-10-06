package e0;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
