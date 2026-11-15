package ch;

import org.telegram.ui.Components.wa0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                ai.k0 k0Var = b0Var.c;
                if (k0Var.getParent() != null) {
                    if (b0Var.d) {
                        org.telegram.messenger.g0.E2(k0Var);
                    } else {
                        try {
                            b0Var.b.removeView(k0Var);
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
