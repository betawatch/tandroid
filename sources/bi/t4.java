package bi;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.jg0;
import org.telegram.ui.t31;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class t4 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t4(Object obj, int i10) {
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
                sb sbVar = (sb) this.b;
                if (dialogInterface == sbVar.u0) {
                    sbVar.u0 = null;
                    sbVar.P();
                    break;
                }
                break;
            case 2:
                AndroidUtilities.hideKeyboard((ig.s) this.b);
                break;
            case 3:
                AndroidUtilities.hideKeyboard((ig.r1) this.b);
                break;
            case 4:
                ((ji.r) this.b).O = null;
                break;
            case 5:
                ((ji.d2) this.b).O0 = null;
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
                org.telegram.ui.web.b1 b1Var = ((org.telegram.ui.web.n0) this.b).e.Q;
                if (b1Var != null && (h0Var = b1Var.c) != null) {
                    h0Var.y();
                    break;
                }
                break;
            case 8:
                org.telegram.ui.web.h0 h0Var2 = ((org.telegram.ui.web.u0) this.b).b.e.Q.c;
                if (h0Var2 != null) {
                    h0Var2.y();
                    break;
                }
                break;
            case 9:
                sg.j0 j0Var = (sg.j0) this.b;
                j0Var.f0 = false;
                j0Var.x0.d0 = true;
                j0Var.E0.invalidate();
                j0Var.x0.invalidate();
                break;
            case 10:
                sg.m1 m1Var = (sg.m1) this.b;
                jg0 jg0Var = m1Var.r0;
                if (jg0Var != null) {
                    jg0Var.setDialogVisible(false);
                }
                m1Var.q0.setPaused(false);
                break;
            case 11:
                ((xh.l) this.b).s = null;
                break;
            case 12:
                ((t31) this.b).run();
                break;
            case 13:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.b);
                break;
            default:
                ((zh.m) this.b).run();
                break;
        }
    }
}
