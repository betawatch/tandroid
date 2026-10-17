package ai;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ab implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ab(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.g0 g0Var;
        switch (this.a) {
            case 0:
                ((w8) this.b).run();
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
                ci.aa aaVar = (ci.aa) this.b;
                if (dialogInterface == aaVar.u0) {
                    aaVar.u0 = null;
                    aaVar.P();
                    break;
                }
                break;
            case 5:
                AndroidUtilities.hideKeyboard((ig.s) this.b);
                break;
            case 6:
                AndroidUtilities.hideKeyboard((ig.o1) this.b);
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
                org.telegram.ui.web.a1 a1Var = ((org.telegram.ui.web.m0) this.b).e.Q;
                if (a1Var != null && (g0Var = a1Var.c) != null) {
                    g0Var.y();
                    break;
                }
                break;
            case 11:
                org.telegram.ui.web.g0 g0Var2 = ((org.telegram.ui.web.t0) this.b).b.e.Q.c;
                if (g0Var2 != null) {
                    g0Var2.y();
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
                sg.l1 l1Var = (sg.l1) this.b;
                yd ydVar = l1Var.r0;
                if (ydVar != null) {
                    ydVar.setDialogVisible(false);
                }
                l1Var.q0.setPaused(false);
                break;
            default:
                ((xh.k) this.b).s = null;
                break;
        }
    }
}
