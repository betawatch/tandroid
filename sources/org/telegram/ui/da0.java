package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class da0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ra0 b;
    public final /* synthetic */ org.telegram.messenger.za c;

    public /* synthetic */ da0(ra0 ra0Var, org.telegram.messenger.za zaVar, int i7) {
        this.a = i7;
        this.b = ra0Var;
        this.c = zaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ra0 ra0Var = this.b;
                org.telegram.messenger.za zaVar = this.c;
                if (ra0Var.G != null && ra0Var.getParentActivity() != null) {
                    try {
                        ((a8.r7) zaVar).u();
                        ((nb.a) org.telegram.messenger.t0.k()).initializeMaps(org.telegram.messenger.t0.b);
                        ((a8.r7) ra0Var.G).p(new fa0(ra0Var, 0));
                        ra0Var.w0 = true;
                        if (ra0Var.x0) {
                            ((a8.r7) ra0Var.G).z();
                            break;
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                break;
            default:
                ra0 ra0Var2 = this.b;
                org.telegram.messenger.za zaVar2 = this.c;
                try {
                    ((a8.r7) zaVar2).u();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new da0(ra0Var2, zaVar2, 0));
                break;
        }
    }
}
