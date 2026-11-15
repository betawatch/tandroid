package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ca0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pa0 b;
    public final /* synthetic */ org.telegram.messenger.ya c;

    public /* synthetic */ ca0(pa0 pa0Var, org.telegram.messenger.ya yaVar, int i7) {
        this.a = i7;
        this.b = pa0Var;
        this.c = yaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pa0 pa0Var = this.b;
                org.telegram.messenger.ya yaVar = this.c;
                if (pa0Var.H != null && pa0Var.getParentActivity() != null) {
                    try {
                        ((a8.r7) yaVar).w();
                        ((pb.b) org.telegram.messenger.t0.k()).initializeMaps(org.telegram.messenger.t0.b);
                        ((a8.r7) pa0Var.H).p(new ea0(pa0Var, 0));
                        pa0Var.x0 = true;
                        if (pa0Var.y0) {
                            ((a8.r7) pa0Var.H).z();
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
                org.telegram.messenger.ya yaVar2 = this.c;
                try {
                    ((a8.r7) yaVar2).w();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new ca0(pa0Var2, yaVar2, 0));
                break;
        }
    }
}
