package ch;

import org.telegram.ui.Components.hb0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0 b;

    public /* synthetic */ t(b0 b0Var, int i7) {
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
                ai.l0 l0Var = b0Var.c;
                if (l0Var.getParent() != null) {
                    if (b0Var.d) {
                        org.telegram.messenger.g0.E2(l0Var);
                    } else {
                        try {
                            b0Var.b.removeView(l0Var);
                        } catch (Exception unused) {
                        }
                    }
                    hb0 hb0Var = b0Var.p;
                    if (hb0Var != null) {
                        hb0Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
