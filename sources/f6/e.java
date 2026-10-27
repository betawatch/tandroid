package f6;

import org.telegram.ui.Components.b10;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class e {
    public static int a(long j10) {
        if (j10 > 2147483647L || j10 < -2147483648L) {
            throw new RuntimeException(b10.i(j10, "A cast to int has gone wrong. Please contact the mp4parser discussion group (", ")"));
        }
        return (int) j10;
    }
}
