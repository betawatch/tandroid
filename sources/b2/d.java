package b2;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public abstract class d {
    public static void a(AudioAttributes.Builder builder, boolean z10) {
        builder.setIsContentSpatialized(z10);
    }

    public static void b(AudioAttributes.Builder builder, int i10) {
        builder.setSpatializationBehavior(i10);
    }
}
