package o8;

import java.util.Comparator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r extends t {
    public static t f(int i9) {
        return i9 < 0 ? t.b : i9 > 0 ? t.c : t.a;
    }

    @Override // o8.t
    public final t a(int i9, int i10) {
        return f(i9 < i10 ? -1 : i9 > i10 ? 1 : 0);
    }

    @Override // o8.t
    public final t b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // o8.t
    public final t c(boolean z10, boolean z11) {
        return f(z10 == z11 ? 0 : z10 ? 1 : -1);
    }

    @Override // o8.t
    public final t d(boolean z10, boolean z11) {
        return f(z11 == z10 ? 0 : z11 ? 1 : -1);
    }

    @Override // o8.t
    public final int e() {
        return 0;
    }
}
