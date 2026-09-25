package ai;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.e31;
import org.telegram.ui.yf0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.g0 g0Var;
        switch (this.a) {
            case 0:
                ((a3.d) this.b).run();
                break;
            case 1:
                jc jcVar = (jc) this.b;
                if (dialogInterface == jcVar.u0) {
                    jcVar.u0 = null;
                    jcVar.P();
                    break;
                }
                break;
            case 2:
                AndroidUtilities.hideKeyboard((hg.u) this.b);
                break;
            case 3:
                AndroidUtilities.hideKeyboard((hg.s1) this.b);
                break;
            case 4:
                ((ii.r) this.b).O = null;
                break;
            case 5:
                ((ii.e2) this.b).O0 = null;
                break;
            case 6:
                Runnable[] runnableArr = (Runnable[]) this.b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    break;
                }
                break;
            case 7:
                org.telegram.ui.web.b1 b1Var = ((org.telegram.ui.web.m0) this.b).e.Q;
                if (b1Var != null && (g0Var = b1Var.c) != null) {
                    g0Var.y();
                    break;
                }
                break;
            case 8:
                org.telegram.ui.web.g0 g0Var2 = ((org.telegram.ui.web.u0) this.b).b.e.Q.c;
                if (g0Var2 != null) {
                    g0Var2.y();
                    break;
                }
                break;
            case 9:
                rg.j0 j0Var = (rg.j0) this.b;
                j0Var.f0 = false;
                j0Var.x0.d0 = true;
                j0Var.E0.invalidate();
                j0Var.x0.invalidate();
                break;
            case 10:
                rg.k1 k1Var = (rg.k1) this.b;
                yf0 yf0Var = k1Var.r0;
                if (yf0Var != null) {
                    yf0Var.setDialogVisible(false);
                }
                k1Var.q0.setPaused(false);
                break;
            case 11:
                ((wh.n) this.b).s = null;
                break;
            case 12:
                ((e31) this.b).run();
                break;
            case 13:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.b);
                break;
            default:
                ((u2.p0) this.b).run();
                break;
        }
    }
}
