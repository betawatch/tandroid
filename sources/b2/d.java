package b2;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public abstract class d {
    public static void a(AudioAttributes.Builder builder, boolean z10) {
        builder.setIsContentSpatialized(z10);
    }

    public static void b(AudioAttributes.Builder builder, int i10) {
        builder.setSpatializationBehavior(i10);
    }
}
