package e0;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public abstract class p {
    public static AudioAttributes a(AudioAttributes.Builder builder) {
        return builder.build();
    }

    public static AudioAttributes.Builder b() {
        return new AudioAttributes.Builder();
    }

    public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i7) {
        return builder.setContentType(i7);
    }

    public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i7) {
        return builder.setLegacyStreamType(i7);
    }

    public static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i7) {
        return builder.setUsage(i7);
    }
}
