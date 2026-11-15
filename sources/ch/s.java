package ch;

import org.telegram.ui.Components.wa0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0 b;

    public /* synthetic */ s(b0 b0Var, int i7) {
        this.a = i7;
        this.b = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a.invalidate();
                break;
            default:
                b0 b0Var = this.b;
                ai.j0 j0Var = b0Var.c;
                if (j0Var.getParent() != null) {
                    if (b0Var.d) {
                        org.telegram.messenger.g0.E2(j0Var);
                    } else {
                        try {
                            b0Var.b.removeView(j0Var);
                        } catch (Exception unused) {
                        }
                    }
                    wa0 wa0Var = b0Var.p;
                    if (wa0Var != null) {
                        wa0Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
