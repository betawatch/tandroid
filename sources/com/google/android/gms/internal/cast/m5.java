package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class m5 extends n5 {
    @Override // com.google.android.gms.internal.cast.n5
    public final void a(Object obj, long j3) {
        r4 r4Var = (r4) ((g5) o6.h(obj, j3));
        if (r4Var.a) {
            r4Var.a = false;
        }
    }

    @Override // com.google.android.gms.internal.cast.n5
    public final void b(Object obj, long j3, Object obj2) {
        g5 g5Var = (g5) o6.h(obj, j3);
        g5 g5Var2 = (g5) o6.h(obj2, j3);
        int size = g5Var.size();
        int size2 = g5Var2.size();
        if (size > 0 && size2 > 0) {
            if (!((r4) g5Var).a) {
                g5Var = g5Var.zzg(size2 + size);
            }
            g5Var.addAll(g5Var2);
        }
        if (size > 0) {
            g5Var2 = g5Var;
        }
        o6.l(obj, j3, g5Var2);
    }
}
