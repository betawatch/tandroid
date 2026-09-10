package gg;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.eg0;
import org.telegram.ui.s31;
import zh.k5;
import zh.u7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.h0 h0Var;
        switch (this.a) {
            case 0:
                AndroidUtilities.hideKeyboard((u) this.b);
                break;
            case 1:
                AndroidUtilities.hideKeyboard((a2) this.b);
                break;
            case 2:
                ((hi.s) this.b).O = null;
                break;
            case 3:
                ((hi.g2) this.b).O0 = null;
                break;
            case 4:
                Runnable[] runnableArr = (Runnable[]) this.b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    break;
                }
                break;
            case 5:
                org.telegram.ui.web.c1 c1Var = ((org.telegram.ui.web.n0) this.b).e.Q;
                if (c1Var != null && (h0Var = c1Var.c) != null) {
                    h0Var.y();
                    break;
                }
                break;
            case 6:
                org.telegram.ui.web.h0 h0Var2 = ((org.telegram.ui.web.u0) this.b).b.e.Q.c;
                if (h0Var2 != null) {
                    h0Var2.y();
                    break;
                }
                break;
            case 7:
                qg.k0 k0Var = (qg.k0) this.b;
                k0Var.f0 = false;
                k0Var.x0.d0 = true;
                k0Var.E0.invalidate();
                k0Var.x0.invalidate();
                break;
            case 8:
                qg.m1 m1Var = (qg.m1) this.b;
                eg0 eg0Var = m1Var.r0;
                if (eg0Var != null) {
                    eg0Var.setDialogVisible(false);
                }
                m1Var.q0.setPaused(false);
                break;
            case 9:
                ((vh.p) this.b).s = null;
                break;
            case 10:
                ((s31) this.b).run();
                break;
            case 11:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.b);
                break;
            case 12:
                ((u2.k0) this.b).run();
                break;
            case 13:
                ((k5) this.b).run();
                break;
            default:
                u7 u7Var = (u7) this.b;
                if (dialogInterface == u7Var.u0) {
                    u7Var.u0 = null;
                    u7Var.P();
                    break;
                }
                break;
        }
    }
}
