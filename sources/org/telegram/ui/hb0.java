package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class hb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yb0 b;
    public final /* synthetic */ org.telegram.messenger.za c;

    public /* synthetic */ hb0(yb0 yb0Var, org.telegram.messenger.za zaVar, int i10) {
        this.a = i10;
        this.b = yb0Var;
        this.c = zaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yb0 yb0Var = this.b;
                org.telegram.messenger.za zaVar = this.c;
                if (yb0Var.I != null && yb0Var.getParentActivity() != null) {
                    try {
                        ((bh.d) zaVar).z();
                        ((t7.u) org.telegram.messenger.w0.k()).initializeMaps(org.telegram.messenger.w0.b);
                        ((bh.d) yb0Var.I).w(new jb0(yb0Var, 0));
                        yb0Var.C0 = true;
                        if (yb0Var.D0) {
                            ((bh.d) yb0Var.I).F();
                            break;
                        }
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        return;
                    }
                }
                break;
            default:
                yb0 yb0Var2 = this.b;
                org.telegram.messenger.za zaVar2 = this.c;
                try {
                    ((bh.d) zaVar2).z();
                } catch (Exception unused) {
                }
                org.telegram.messenger.i0.g3(new hb0(yb0Var2, zaVar2, 0));
                break;
        }
    }
}
