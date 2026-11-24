// default package

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class bi3 extends UndoView {
    public final /* synthetic */ cj3 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi3(cj3 cj3Var, Activity activity) {
        super(activity);
        this.k0 = cj3Var;
    }

    @Override // org.telegram.ui.Components.UndoView
    public final boolean a() {
        int i = 0;
        while (true) {
            bj3[] bj3VarArr = this.k0.f0;
            if (i >= bj3VarArr.length) {
                return true;
            }
            if (bj3VarArr[i].y.k()) {
                return false;
            }
            i++;
        }
    }

    @Override // org.telegram.ui.Components.UndoView
    public final void g(int i, long j) {
        if (i == 1 || i == 27) {
            cj3 cj3Var = this.k0;
            cj3Var.Q4(true, true);
            if (cj3Var.T1 != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= cj3Var.T1.size()) {
                        i2 = -1;
                        break;
                    } else if (((TLRPC.Dialog) cj3Var.T1.get(i2)).id == j) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 >= 0) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) cj3Var.T1.remove(i2);
                    cj3Var.f0[0].d.f();
                    gl.c3(new va7(this, i2, dialog, (byte) 18));
                } else {
                    cj3Var.Q4(false, true);
                }
            }
            cj3Var.G2();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        cj3 cj3Var = this.k0;
        UndoView[] undoViewArr = cj3Var.z0;
        if (this == undoViewArr[0]) {
            UndoView undoView = undoViewArr[1];
            if (undoView == null || undoView.getVisibility() != 0) {
                cj3Var.w1 = Math.max(0.0f, (gl.L(8.0f) + getMeasuredHeight()) - f);
                cj3Var.q5();
            }
        }
    }
}
