package ai;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.cg0;
import org.telegram.ui.g31;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
                org.telegram.ui.web.c1 c1Var = ((org.telegram.ui.web.n0) this.b).e.Q;
                if (c1Var != null && (h0Var = c1Var.c) != null) {
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
                rg.k0 k0Var = (rg.k0) this.b;
                k0Var.f0 = false;
                k0Var.x0.d0 = true;
                k0Var.E0.invalidate();
                k0Var.x0.invalidate();
                break;
            case 10:
                rg.m1 m1Var = (rg.m1) this.b;
                cg0 cg0Var = m1Var.r0;
                if (cg0Var != null) {
                    cg0Var.setDialogVisible(false);
                }
                m1Var.q0.setPaused(false);
                break;
            case 11:
                ((wh.n) this.b).s = null;
                break;
            case 12:
                ((g31) this.b).run();
                break;
            case 13:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.b);
                break;
            default:
                ((u2.i0) this.b).run();
                break;
        }
    }
}
