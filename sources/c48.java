// default package

import android.view.KeyEvent;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
