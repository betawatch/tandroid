// default package

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class o78 implements ee, gk, h59, k8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w78 b;

    public /* synthetic */ o78(w78 w78Var, byte b) {
        this.a = b;
        this.b = w78Var;
    }

    @Override // h59
    public final boolean g(int i, View view) {
        w78 w78Var = this.b;
        if (w78Var.Z) {
            w78Var.f0(view, w78Var.K.e.get(i));
            return true;
        }
        if (!(view instanceof q68)) {
            return false;
        }
        y69 y69Var = w78Var.W;
        boolean z = !((q68) view).a();
        w78Var.Y = z;
        y69Var.d(i, view, z);
        return false;
    }

    @Override // k8
    public final void q(KeyEvent keyEvent) {
        w78 w78Var;
        m8 m8Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m8Var = (w78Var = this.b).n0) != null && m8Var.isShowing()) {
            w78Var.n0.d(true);
        }
    }

    @Override // ee
    public final void r(he heVar, int i) {
        w78 w78Var = this.b;
        v78 v78Var = w78Var.u0;
        if (v78Var != null) {
            v78Var.e();
        } else {
            w78Var.c0();
        }
    }

    @Override // gk
    public final void y(int i, int i2, boolean z) {
        byte b = this.a;
        w78 w78Var = this.b;
        switch (b) {
            case 1:
                w78Var.j0(i, z);
                break;
            default:
                w78Var.j0(i, z);
                break;
        }
    }
}
