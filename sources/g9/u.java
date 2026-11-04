package g9;

import java.util.Comparator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u extends w {
    public static w f(int i3) {
        return i3 < 0 ? w.b : i3 > 0 ? w.c : w.a;
    }

    @Override // g9.w
    public final w a(int i3, int i10) {
        return f(Integer.compare(i3, i10));
    }

    @Override // g9.w
    public final w b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // g9.w
    public final w c(boolean z10, boolean z11) {
        return f(Boolean.compare(z10, z11));
    }

    @Override // g9.w
    public final w d(boolean z10, boolean z11) {
        return f(Boolean.compare(z11, z10));
    }

    @Override // g9.w
    public final int e() {
        return 0;
    }
}
