package f9;

import java.util.Comparator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class u extends w {
    public static w f(int i10) {
        return i10 < 0 ? w.b : i10 > 0 ? w.c : w.a;
    }

    @Override // f9.w
    public final w a(int i10, int i11) {
        return f(Integer.compare(i10, i11));
    }

    @Override // f9.w
    public final w b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // f9.w
    public final w c(boolean z10, boolean z11) {
        return f(Boolean.compare(z10, z11));
    }

    @Override // f9.w
    public final w d(boolean z10, boolean z11) {
        return f(Boolean.compare(z11, z10));
    }

    @Override // f9.w
    public final int e() {
        return 0;
    }
}
