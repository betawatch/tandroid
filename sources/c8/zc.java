package c8;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class zc {
    public static boolean a(int i7, int i10) {
        return (i7 & i10) != 0;
    }

    public static int b(int i7, int i10, boolean z9) {
        return z9 ? i7 | i10 : i7 & (~i10);
    }
}
