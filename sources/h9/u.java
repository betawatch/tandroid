package h9;

import java.util.Comparator;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
    public final w c(boolean z9, boolean z10) {
        return f(Boolean.compare(z9, z10));
    }

    @Override // h9.w
    public final w d(boolean z9, boolean z10) {
        return f(Boolean.compare(z10, z9));
    }

    @Override // h9.w
    public final int e() {
        return 0;
    }
}
