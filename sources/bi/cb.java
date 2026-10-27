package bi;

import android.content.DialogInterface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        org.telegram.ui.web.g0 g0Var;
        switch (this.a) {
            case 0:
                ((s8) this.b).run();
                break;
            case 1:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.b);
                break;
            case 2:
                ((f2) this.b).run();
                break;
            case 3:
                ((u6) this.b).run();
                break;
            case 4:
                di.y9 y9Var = (di.y9) this.b;
                if (dialogInterface == y9Var.u0) {
                    y9Var.u0 = null;
                    y9Var.Q();
                    break;
                }
                break;
            case 5:
                AndroidUtilities.hideKeyboard((jg.t) this.b);
                break;
            case 6:
                AndroidUtilities.hideKeyboard((jg.s1) this.b);
                break;
            case 7:
                ((li.q) this.b).O = null;
                break;
            case 8:
                ((li.b2) this.b).O0 = null;
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
                    g0Var.z();
                    break;
                }
                break;
            case 11:
                org.telegram.ui.web.g0 g0Var2 = ((org.telegram.ui.web.t0) this.b).b.e.Q.c;
                if (g0Var2 != null) {
                    g0Var2.z();
                    break;
                }
                break;
            case 12:
                tg.j0 j0Var = (tg.j0) this.b;
                j0Var.f0 = false;
                j0Var.x0.d0 = true;
                j0Var.E0.invalidate();
                j0Var.x0.invalidate();
                break;
            case 13:
                tg.m1 m1Var = (tg.m1) this.b;
                qd qdVar = m1Var.r0;
                if (qdVar != null) {
                    qdVar.setDialogVisible(false);
                }
                m1Var.q0.setPaused(false);
                break;
            default:
                ((yh.k) this.b).s = null;
                break;
        }
    }
}
