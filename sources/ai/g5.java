package ai;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.gg0;
import org.telegram.ui.o31;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.h0 h0Var;
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
                AndroidUtilities.hideKeyboard((hg.s) this.b);
                break;
            case 3:
                AndroidUtilities.hideKeyboard((hg.r1) this.b);
                break;
            case 4:
                ((ii.r) this.b).O = null;
                break;
            case 5:
                ((ii.d2) this.b).O0 = null;
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
                org.telegram.ui.web.d1 d1Var = ((org.telegram.ui.web.n0) this.b).e.Q;
                if (d1Var != null && (h0Var = d1Var.c) != null) {
                    h0Var.y();
                    break;
                }
                break;
            case 8:
                org.telegram.ui.web.h0 h0Var2 = ((org.telegram.ui.web.v0) this.b).b.e.Q.c;
                if (h0Var2 != null) {
                    h0Var2.y();
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
                gg0 gg0Var = k1Var.r0;
                if (gg0Var != null) {
                    gg0Var.setDialogVisible(false);
                }
                k1Var.q0.setPaused(false);
                break;
            case 11:
                ((wh.n) this.b).s = null;
                break;
            case 12:
                ((o31) this.b).run();
                break;
            case 13:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.b);
                break;
            default:
                ((uh.i) this.b).run();
                break;
        }
    }
}
