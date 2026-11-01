package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xb0 b;
    public final /* synthetic */ org.telegram.messenger.ab c;

    public /* synthetic */ gb0(xb0 xb0Var, org.telegram.messenger.ab abVar, int i10) {
        this.a = i10;
        this.b = xb0Var;
        this.c = abVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xb0 xb0Var = this.b;
                org.telegram.messenger.ab abVar = this.c;
                if (xb0Var.I != null && xb0Var.getParentActivity() != null) {
                    try {
                        ((bh.d) abVar).z();
                        ((t7.u) org.telegram.messenger.w0.k()).initializeMaps(org.telegram.messenger.w0.b);
                        ((bh.d) xb0Var.I).w(new ib0(xb0Var, 0));
                        xb0Var.C0 = true;
                        if (xb0Var.D0) {
                            ((bh.d) xb0Var.I).F();
                            break;
                        }
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        return;
                    }
                }
                break;
            default:
                xb0 xb0Var2 = this.b;
                org.telegram.messenger.ab abVar2 = this.c;
                try {
                    ((bh.d) abVar2).z();
                } catch (Exception unused) {
                }
                org.telegram.messenger.i0.g3(new gb0(xb0Var2, abVar2, 0));
                break;
        }
    }
}
