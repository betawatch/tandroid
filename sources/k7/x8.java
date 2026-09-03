package k7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class x8 {
    public static boolean a(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public static int b(int i10, int i11, boolean z4) {
        return z4 ? i10 | i11 : i10 & (~i11);
    }
}
