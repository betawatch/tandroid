package ch;

import org.telegram.ui.Components.eb0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                ai.h0 h0Var = b0Var.c;
                if (h0Var.getParent() != null) {
                    if (b0Var.d) {
                        org.telegram.messenger.g0.E2(h0Var);
                    } else {
                        try {
                            b0Var.b.removeView(h0Var);
                        } catch (Exception unused) {
                        }
                    }
                    eb0 eb0Var = b0Var.p;
                    if (eb0Var != null) {
                        eb0Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
