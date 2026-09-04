package bi;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.eg0;
import org.telegram.ui.o31;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class r4 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r4(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.i0 i0Var;
        switch (this.a) {
            case 0:
                ((a3.c) this.b).run();
                break;
            case 1:
                pb pbVar = (pb) this.b;
                if (dialogInterface == pbVar.u0) {
                    pbVar.u0 = null;
                    pbVar.P();
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
                ((ji.c2) this.b).O0 = null;
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
                org.telegram.ui.web.d1 d1Var = ((org.telegram.ui.web.o0) this.b).e.Q;
                if (d1Var != null && (i0Var = d1Var.c) != null) {
                    i0Var.y();
                    break;
                }
                break;
            case 8:
                org.telegram.ui.web.i0 i0Var2 = ((org.telegram.ui.web.v0) this.b).b.e.Q.c;
                if (i0Var2 != null) {
                    i0Var2.y();
                    break;
                }
                break;
            case 9:
                sg.k0 k0Var = (sg.k0) this.b;
                k0Var.f0 = false;
                k0Var.x0.d0 = true;
                k0Var.E0.invalidate();
                k0Var.x0.invalidate();
                break;
            case 10:
                sg.o1 o1Var = (sg.o1) this.b;
                eg0 eg0Var = o1Var.r0;
                if (eg0Var != null) {
                    eg0Var.setDialogVisible(false);
                }
                o1Var.q0.setPaused(false);
                break;
            case 11:
                ((xh.n) this.b).s = null;
                break;
            case 12:
                ((o31) this.b).run();
                break;
            case 13:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.b);
                break;
            default:
                ((ug.r) this.b).run();
                break;
        }
    }
}
