package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class da0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pa0 b;
    public final /* synthetic */ org.telegram.messenger.xa c;

    public /* synthetic */ da0(pa0 pa0Var, org.telegram.messenger.xa xaVar, int i7) {
        this.a = i7;
        this.b = pa0Var;
        this.c = xaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pa0 pa0Var = this.b;
                org.telegram.messenger.xa xaVar = this.c;
                if (pa0Var.H != null && pa0Var.getParentActivity() != null) {
                    try {
                        ((a8.r7) xaVar).B();
                        ((pb.b) org.telegram.messenger.t0.k()).initializeMaps(org.telegram.messenger.t0.b);
                        ((a8.r7) pa0Var.H).x(new f3(pa0Var, 3));
                        pa0Var.x0 = true;
                        if (pa0Var.y0) {
                            ((a8.r7) pa0Var.H).E();
                            break;
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                break;
            default:
                pa0 pa0Var2 = this.b;
                org.telegram.messenger.xa xaVar2 = this.c;
                try {
                    ((a8.r7) xaVar2).B();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.g3(new da0(pa0Var2, xaVar2, 0));
                break;
        }
    }
}
