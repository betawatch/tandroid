package e2;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class d {
    public static void a(AudioAttributes.Builder builder, boolean z9) {
        builder.setIsContentSpatialized(z9);
    }

    public static void b(AudioAttributes.Builder builder, int i7) {
        builder.setSpatializationBehavior(i7);
    }
}
