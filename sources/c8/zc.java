package c8;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class zc {
    public static boolean a(int i7, int i10) {
        return (i7 & i10) != 0;
    }

    public static int b(int i7, int i10, boolean z9) {
        return z9 ? i7 | i10 : i7 & (~i10);
    }
}
