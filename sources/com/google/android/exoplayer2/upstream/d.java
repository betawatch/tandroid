package com.google.android.exoplayer2.upstream;

import bg.c2;
import jh.d3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(Object obj, int i10, long j10, long j11, int i11) {
        this.a = i11;
        this.e = obj;
        this.b = i10;
        this.c = j10;
        this.d = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Object obj = this.e;
        switch (i10) {
            case 0:
                k3.f fVar = ((e) obj).b;
                c2 c2Var = fVar.d;
                k3.a i11 = fVar.i(((q8.z) c2Var.b).isEmpty() ? null : (l4.c0) q8.l.g((q8.z) c2Var.b));
                fVar.l(i11, 1006, new k3.e(i11, this.b, this.c, this.d));
                break;
            default:
                l3.o oVar = ((l3.n) obj).b;
                int i12 = f5.d0.a;
                k3.f fVar2 = ((j3.h0) oVar).a.r;
                k3.a k9 = fVar2.k();
                fVar2.l(k9, 1011, new d3(k9, this.b, this.c, this.d));
                break;
        }
    }
}
