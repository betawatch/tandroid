package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class s5 extends t5 {
    @Override // com.google.android.gms.internal.cast.t5
    public final void a(Object obj, long j3) {
        w4 w4Var = (w4) ((m5) u6.h(obj, j3));
        if (w4Var.a) {
            w4Var.a = false;
        }
    }

    @Override // com.google.android.gms.internal.cast.t5
    public final void b(Object obj, long j3, Object obj2) {
        m5 m5Var = (m5) u6.h(obj, j3);
        m5 m5Var2 = (m5) u6.h(obj2, j3);
        int size = m5Var.size();
        int size2 = m5Var2.size();
        if (size > 0 && size2 > 0) {
            if (!((w4) m5Var).a) {
                m5Var = m5Var.zzg(size2 + size);
            }
            m5Var.addAll(m5Var2);
        }
        if (size > 0) {
            m5Var2 = m5Var;
        }
        u6.l(obj, j3, m5Var2);
    }
}
