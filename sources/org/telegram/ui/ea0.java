package org.telegram.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ea0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qa0 b;
    public final /* synthetic */ org.telegram.messenger.ya c;

    public /* synthetic */ ea0(qa0 qa0Var, org.telegram.messenger.ya yaVar, int i7) {
        this.a = i7;
        this.b = qa0Var;
        this.c = yaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qa0 qa0Var = this.b;
                org.telegram.messenger.ya yaVar = this.c;
                if (qa0Var.H != null && qa0Var.getParentActivity() != null) {
                    try {
                        ((a8.r7) yaVar).y();
                        ((pb.b) org.telegram.messenger.t0.k()).initializeMaps(org.telegram.messenger.t0.b);
                        ((a8.r7) qa0Var.H).t(new f3(qa0Var, 3));
                        qa0Var.x0 = true;
                        if (qa0Var.y0) {
                            ((a8.r7) qa0Var.H).F();
                            break;
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                break;
            default:
                qa0 qa0Var2 = this.b;
                org.telegram.messenger.ya yaVar2 = this.c;
                try {
                    ((a8.r7) yaVar2).y();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.g3(new ea0(qa0Var2, yaVar2, 0));
                break;
        }
    }
}
