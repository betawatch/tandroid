package j3;

import h3.q2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ k(n nVar, Exception exc, int i10) {
        this.a = i10;
        this.b = nVar;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Exception exc = this.c;
        n nVar = this.b;
        switch (i10) {
            case 0:
                o oVar = nVar.b;
                int i11 = d5.g0.a;
                i3.f fVar = ((h3.h0) oVar).a.r;
                i3.a k10 = fVar.k();
                fVar.l(k10, 1029, new q2(k10, exc, 9));
                break;
            default:
                o oVar2 = nVar.b;
                int i12 = d5.g0.a;
                i3.f fVar2 = ((h3.h0) oVar2).a.r;
                i3.a k11 = fVar2.k();
                fVar2.l(k11, 1014, new i3.d(k11, exc, 6));
                break;
        }
    }
}
