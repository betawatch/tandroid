package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ea0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sa0 b;
    public final /* synthetic */ org.telegram.messenger.za c;

    public /* synthetic */ ea0(sa0 sa0Var, org.telegram.messenger.za zaVar, int i7) {
        this.a = i7;
        this.b = sa0Var;
        this.c = zaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sa0 sa0Var = this.b;
                org.telegram.messenger.za zaVar = this.c;
                if (sa0Var.G != null && sa0Var.getParentActivity() != null) {
                    try {
                        ((a8.r7) zaVar).u();
                        ((nb.a) org.telegram.messenger.t0.k()).initializeMaps(org.telegram.messenger.t0.b);
                        ((a8.r7) sa0Var.G).p(new ga0(sa0Var, 0));
                        sa0Var.w0 = true;
                        if (sa0Var.x0) {
                            ((a8.r7) sa0Var.G).z();
                            break;
                        }
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                break;
            default:
                sa0 sa0Var2 = this.b;
                org.telegram.messenger.za zaVar2 = this.c;
                try {
                    ((a8.r7) zaVar2).u();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new ea0(sa0Var2, zaVar2, 0));
                break;
        }
    }
}
