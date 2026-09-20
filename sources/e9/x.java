package e9;

import java.util.Comparator;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class x extends z {
    public static z f(int i10) {
        return i10 < 0 ? z.b : i10 > 0 ? z.c : z.a;
    }

    @Override // e9.z
    public final z a(int i10, int i11) {
        return f(Integer.compare(i10, i11));
    }

    @Override // e9.z
    public final z b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // e9.z
    public final z c(boolean z10, boolean z11) {
        return f(Boolean.compare(z10, z11));
    }

    @Override // e9.z
    public final z d(boolean z10, boolean z11) {
        return f(Boolean.compare(z11, z10));
    }

    @Override // e9.z
    public final int e() {
        return 0;
    }
}
