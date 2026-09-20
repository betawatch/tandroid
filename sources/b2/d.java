package b2;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public abstract class d {
    public static void a(AudioAttributes.Builder builder, boolean z10) {
        builder.setIsContentSpatialized(z10);
    }

    public static void b(AudioAttributes.Builder builder, int i10) {
        builder.setSpatializationBehavior(i10);
    }
}
