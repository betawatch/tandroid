package org.telegram.ui;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ba0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pa0 b;
    public final /* synthetic */ org.telegram.messenger.za c;

    public /* synthetic */ ba0(pa0 pa0Var, org.telegram.messenger.za zaVar, int i7) {
        this.a = i7;
        this.b = pa0Var;
        this.c = zaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pa0 pa0Var = this.b;
                org.telegram.messenger.za zaVar = this.c;
                if (pa0Var.G != null && pa0Var.getParentActivity() != null) {
                    try {
                        ((a8.r7) zaVar).u();
                        ((nb.a) org.telegram.messenger.t0.k()).initializeMaps(org.telegram.messenger.t0.b);
                        ((a8.r7) pa0Var.G).p(new da0(pa0Var, 0));
                        pa0Var.w0 = true;
                        if (pa0Var.x0) {
                            ((a8.r7) pa0Var.G).z();
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
                org.telegram.messenger.za zaVar2 = this.c;
                try {
                    ((a8.r7) zaVar2).u();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new ba0(pa0Var2, zaVar2, 0));
                break;
        }
    }
}
