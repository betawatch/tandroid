package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class o5 extends p5 {
    @Override // com.google.android.gms.internal.cast.p5
    public final void a(Object obj, long j10) {
        t4 t4Var = (t4) ((i5) q6.h(obj, j10));
        if (t4Var.a) {
            t4Var.a = false;
        }
    }

    @Override // com.google.android.gms.internal.cast.p5
    public final void b(Object obj, long j10, Object obj2) {
        i5 i5Var = (i5) q6.h(obj, j10);
        i5 i5Var2 = (i5) q6.h(obj2, j10);
        int size = i5Var.size();
        int size2 = i5Var2.size();
        if (size > 0 && size2 > 0) {
            if (!((t4) i5Var).a) {
                i5Var = i5Var.zzg(size2 + size);
            }
            i5Var.addAll(i5Var2);
        }
        if (size > 0) {
            i5Var2 = i5Var;
        }
        q6.l(obj, j10, i5Var2);
    }
}
