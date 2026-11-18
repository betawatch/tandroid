package ch;

import org.telegram.ui.Components.gb0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                    gb0 gb0Var = b0Var.p;
                    if (gb0Var != null) {
                        gb0Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
