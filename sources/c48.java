// default package

import android.view.KeyEvent;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class c48 implements gj, k8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g48 b;

    public /* synthetic */ c48(g48 g48Var, byte b) {
        this.a = b;
        this.b = g48Var;
    }

    @Override // k8
    public final void r(KeyEvent keyEvent) {
        g48 g48Var;
        m8 m8Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m8Var = (g48Var = this.b).J) != null && m8Var.isShowing()) {
            g48Var.J.d(true);
        }
    }

    @Override // gj
    public final void s(int i, int i2, boolean z) {
        byte b = this.a;
        g48 g48Var = this.b;
        switch (b) {
            case 0:
                g48Var.Z(g48Var.b, g48Var.c, z, i);
                g48Var.finishFragment();
                break;
            default:
                g48Var.Z(g48Var.b, g48Var.c, z, i);
                g48Var.finishFragment();
                break;
        }
    }
}
