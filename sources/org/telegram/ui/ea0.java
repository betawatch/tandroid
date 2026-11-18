package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ea0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qa0 b;
    public final /* synthetic */ org.telegram.messenger.xa c;

    public /* synthetic */ ea0(qa0 qa0Var, org.telegram.messenger.xa xaVar, int i7) {
        this.a = i7;
        this.b = qa0Var;
        this.c = xaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qa0 qa0Var = this.b;
                org.telegram.messenger.xa xaVar = this.c;
                if (qa0Var.H != null && qa0Var.getParentActivity() != null) {
                    try {
                        ((a8.r7) xaVar).y();
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
                org.telegram.messenger.xa xaVar2 = this.c;
                try {
                    ((a8.r7) xaVar2).y();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.g3(new ea0(qa0Var2, xaVar2, 0));
                break;
        }
    }
}
