package ai;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class cb implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cb(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.h0 h0Var;
        switch (this.a) {
            case 0:
                ((x8) this.b).run();
                break;
            case 1:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.b);
                break;
            case 2:
                ((a1.f) this.b).run();
                break;
            case 3:
                ((androidx.fragment.app.d) this.b).run();
                break;
            case 4:
                ci.z9 z9Var = (ci.z9) this.b;
                if (dialogInterface == z9Var.u0) {
                    z9Var.u0 = null;
                    z9Var.P();
                    break;
                }
                break;
            case 5:
                AndroidUtilities.hideKeyboard((ig.s) this.b);
                break;
            case 6:
                AndroidUtilities.hideKeyboard((ig.p1) this.b);
                break;
            case 7:
                ((ki.q) this.b).O = null;
                break;
            case 8:
                ((ki.d2) this.b).O0 = null;
                break;
            case 9:
                Runnable[] runnableArr = (Runnable[]) this.b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    break;
                }
                break;
            case 10:
                org.telegram.ui.web.b1 b1Var = ((org.telegram.ui.web.n0) this.b).e.Q;
                if (b1Var != null && (h0Var = b1Var.c) != null) {
                    h0Var.z();
                    break;
                }
                break;
            case 11:
                org.telegram.ui.web.h0 h0Var2 = ((org.telegram.ui.web.u0) this.b).b.e.Q.c;
                if (h0Var2 != null) {
                    h0Var2.z();
                    break;
                }
                break;
            case 12:
                sg.j0 j0Var = (sg.j0) this.b;
                j0Var.f0 = false;
                j0Var.x0.d0 = true;
                j0Var.E0.invalidate();
                j0Var.x0.invalidate();
                break;
            case 13:
                sg.m1 m1Var = (sg.m1) this.b;
                ae aeVar = m1Var.r0;
                if (aeVar != null) {
                    aeVar.setDialogVisible(false);
                }
                m1Var.q0.setPaused(false);
                break;
            default:
                ((xh.k) this.b).s = null;
                break;
        }
    }
}
