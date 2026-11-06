package c8;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class yc {
    public static boolean a(int i7, int i10) {
        return (i7 & i10) != 0;
    }

    public static int b(int i7, int i10, boolean z9) {
        return z9 ? i7 | i10 : i7 & (~i10);
    }
}
