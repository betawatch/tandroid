// default package

import android.view.KeyEvent;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class m58 implements ed, gj, e39, k8 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u58 b;

    public /* synthetic */ m58(u58 u58Var, byte b) {
        this.a = b;
        this.b = u58Var;
    }

    @Override // e39
    public final boolean d(int i, View view) {
        u58 u58Var = this.b;
        if (u58Var.Z) {
            u58Var.e0(view, u58Var.K.e.get(i));
            return true;
        }
        if (!(view instanceof o48)) {
            return false;
        }
        w49 w49Var = u58Var.W;
        boolean z = !((o48) view).a();
        u58Var.Y = z;
        w49Var.d(i, view, z);
        return false;
    }

    @Override // k8
    public final void r(KeyEvent keyEvent) {
        u58 u58Var;
        m8 m8Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m8Var = (u58Var = this.b).n0) != null && m8Var.isShowing()) {
            u58Var.n0.d(true);
        }
    }

    @Override // gj
    public final void s(int i, int i2, boolean z) {
        byte b = this.a;
        u58 u58Var = this.b;
        switch (b) {
            case 1:
                u58Var.i0(i, z);
                break;
            default:
                u58Var.i0(i, z);
                break;
        }
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        u58 u58Var = this.b;
        t58 t58Var = u58Var.u0;
        if (t58Var != null) {
            t58Var.d();
        } else {
            u58Var.b0();
        }
    }
}
