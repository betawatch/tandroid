package ch;

import bi.x5;
import org.telegram.ui.Components.ob0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
                    ob0 ob0Var = b0Var.p;
                    if (ob0Var != null) {
                        ob0Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
