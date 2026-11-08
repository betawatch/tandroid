package e2;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class d {
    public static void a(AudioAttributes.Builder builder, boolean z9) {
        builder.setIsContentSpatialized(z9);
    }

    public static void b(AudioAttributes.Builder builder, int i7) {
        builder.setSpatializationBehavior(i7);
    }
}
