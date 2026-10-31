package e9;

import java.util.Comparator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class z extends b0 {
    public static b0 f(int i10) {
        return i10 < 0 ? b0.b : i10 > 0 ? b0.c : b0.a;
    }

    @Override // e9.b0
    public final b0 a(int i10, int i11) {
        return f(Integer.compare(i10, i11));
    }

    @Override // e9.b0
    public final b0 b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // e9.b0
    public final b0 c(boolean z10, boolean z11) {
        return f(Boolean.compare(z10, z11));
    }

    @Override // e9.b0
    public final b0 d(boolean z10, boolean z11) {
        return f(Boolean.compare(z11, z10));
    }

    @Override // e9.b0
    public final int e() {
        return 0;
    }
}
