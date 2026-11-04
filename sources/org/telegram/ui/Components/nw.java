package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nw(Object obj, float f10, int i3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = f10;
        this.c = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ow owVar = (ow) this.d;
                float f10 = this.b;
                int i3 = this.c;
                ey eyVar = owVar.G;
                try {
                    ni.m mVar = new ni.m(eyVar.Q.getContext(), 0, f10);
                    mVar.a = i3;
                    eyVar.R.w0(mVar);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                org.telegram.ui.g11 g11Var = (org.telegram.ui.g11) this.d;
                float f11 = this.b;
                int i10 = this.c;
                try {
                    ni.m mVar2 = new ni.m(g11Var.i0.getContext(), 0, f11);
                    mVar2.a = i10;
                    g11Var.s0.w0(mVar2);
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
        }
    }
}
