package ch;

import bi.x5;
import org.telegram.ui.Components.ob0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
