package fi;

import org.telegram.messenger.ks;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class e6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h6 b;

    public /* synthetic */ e6(h6 h6Var, int i7) {
        this.a = i7;
        this.b = h6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        h6 h6Var = this.b;
        switch (i7) {
            case 0:
                ks.f(h6Var.c).k(ks.A5, h6Var);
                break;
            case 1:
                h6Var.u = false;
                h6Var.w = true;
                ks.f(h6Var.c).k(ks.A5, h6Var, Boolean.FALSE);
                break;
            case 2:
                h6Var.z = false;
                break;
            default:
                h6Var.k.clear();
                h6Var.d(true);
                break;
        }
    }
}
