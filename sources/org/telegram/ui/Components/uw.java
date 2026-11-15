package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class uw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uw(Object obj, float f10, int i7, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = f10;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vw vwVar = (vw) this.d;
                float f10 = this.b;
                int i7 = this.c;
                ly lyVar = vwVar.G;
                try {
                    pi.l lVar = new pi.l(lyVar.Q.getContext(), 0, f10);
                    lVar.a = i7;
                    lyVar.R.w0(lVar);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                org.telegram.ui.n11 n11Var = (org.telegram.ui.n11) this.d;
                float f11 = this.b;
                int i10 = this.c;
                try {
                    pi.l lVar2 = new pi.l(n11Var.i0.getContext(), 0, f11);
                    lVar2.a = i10;
                    n11Var.s0.w0(lVar2);
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
        }
    }
}
