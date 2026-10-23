package ai;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class bb implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bb(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.g0 g0Var;
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
                AndroidUtilities.hideKeyboard((ig.q1) this.b);
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
                sg.k0 k0Var = (sg.k0) this.b;
                k0Var.f0 = false;
                k0Var.x0.d0 = true;
                k0Var.E0.invalidate();
                k0Var.x0.invalidate();
                break;
            case 13:
                sg.m1 m1Var = (sg.m1) this.b;
                zd zdVar = m1Var.r0;
                if (zdVar != null) {
                    zdVar.setDialogVisible(false);
                }
                m1Var.q0.setPaused(false);
                break;
            default:
                ((xh.k) this.b).s = null;
                break;
        }
    }
}
