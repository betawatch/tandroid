package com.google.android.gms.internal.vision;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class w1 extends s1 {
    @Override // com.google.android.gms.internal.vision.s1
    public final void a(Object obj, long j3, Object obj2) {
        o1 o1Var = (o1) y2.l(obj, j3);
        o1 o1Var2 = (o1) y2.l(obj2, j3);
        int size = o1Var.size();
        int size2 = o1Var2.size();
        if (size > 0 && size2 > 0) {
            if (!o1Var.zza()) {
                o1Var = o1Var.zza(size2 + size);
            }
            o1Var.addAll(o1Var2);
        }
        if (size > 0) {
            o1Var2 = o1Var;
        }
        y2.d(obj, j3, o1Var2);
    }

    @Override // com.google.android.gms.internal.vision.s1
    public final void b(Object obj, long j3) {
        ((o1) y2.l(obj, j3)).zzb();
    }
}
