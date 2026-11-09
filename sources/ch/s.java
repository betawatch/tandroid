package ch;

import bi.x5;
import org.telegram.ui.Components.pb0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                x5 x5Var = b0Var.c;
                if (x5Var.getParent() != null) {
                    if (b0Var.d) {
                        org.telegram.messenger.g0.E2(x5Var);
                    } else {
                        try {
                            b0Var.b.removeView(x5Var);
                        } catch (Exception unused) {
                        }
                    }
                    pb0 pb0Var = b0Var.p;
                    if (pb0Var != null) {
                        pb0Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
