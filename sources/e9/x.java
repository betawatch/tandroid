package e9;

import java.util.Comparator;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
