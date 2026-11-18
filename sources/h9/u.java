package h9;

import java.util.Comparator;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class u extends w {
    public static w f(int i7) {
        return i7 < 0 ? w.b : i7 > 0 ? w.c : w.a;
    }

    @Override // h9.w
    public final w a(int i7, int i10) {
        return f(Integer.compare(i7, i10));
    }

    @Override // h9.w
    public final w b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // h9.w
    public final w c(boolean z10, boolean z11) {
        return f(Boolean.compare(z10, z11));
    }

    @Override // h9.w
    public final w d(boolean z10, boolean z11) {
        return f(Boolean.compare(z11, z10));
    }

    @Override // h9.w
    public final int e() {
        return 0;
    }
}
