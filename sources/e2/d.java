package e2;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public abstract class d {
    public static void a(AudioAttributes.Builder builder, boolean z9) {
        builder.setIsContentSpatialized(z9);
    }

    public static void b(AudioAttributes.Builder builder, int i7) {
        builder.setSpatializationBehavior(i7);
    }
}
