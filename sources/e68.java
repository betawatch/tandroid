// default package

import android.view.KeyEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class e68 implements gk, k8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j68 b;

    public /* synthetic */ e68(j68 j68Var, byte b) {
        this.a = b;
        this.b = j68Var;
    }

    @Override // k8
    public final void q(KeyEvent keyEvent) {
        j68 j68Var;
        m8 m8Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m8Var = (j68Var = this.b).J) != null && m8Var.isShowing()) {
            j68Var.J.d(true);
        }
    }

    @Override // gk
    public final void y(int i, int i2, boolean z) {
        byte b = this.a;
        j68 j68Var = this.b;
        switch (b) {
            case 0:
                j68Var.a0(j68Var.b, j68Var.c, z, i);
                j68Var.finishFragment();
                break;
            default:
                j68Var.a0(j68Var.b, j68Var.c, z, i);
                j68Var.finishFragment();
                break;
        }
    }
}
