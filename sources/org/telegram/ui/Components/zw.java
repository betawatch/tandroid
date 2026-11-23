package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class zw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zw(Object obj, float f10, int i7, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = f10;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ax axVar = (ax) this.d;
                float f10 = this.b;
                int i7 = this.c;
                qy qyVar = axVar.G;
                try {
                    pi.l lVar = new pi.l(qyVar.Q.getContext(), 0, f10);
                    lVar.a = i7;
                    qyVar.R.w0(lVar);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                org.telegram.ui.q11 q11Var = (org.telegram.ui.q11) this.d;
                float f11 = this.b;
                int i10 = this.c;
                try {
                    pi.l lVar2 = new pi.l(q11Var.i0.getContext(), 0, f11);
                    lVar2.a = i10;
                    q11Var.s0.w0(lVar2);
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
        }
    }
}
