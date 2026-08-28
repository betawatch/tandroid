package eh;

import android.content.DialogInterface;
import gh.o6;
import ih.m9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.web.e0;
import org.telegram.ui.web.k0;
import org.telegram.ui.web.r0;
import org.telegram.ui.web.y0;
import pf.h1;
import qh.x1;
import zf.j0;
import zf.k1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        e0 e0Var;
        switch (this.a) {
            case 0:
                ((x) this.b).s = null;
                break;
            case 1:
                ((o6) this.b).run();
                break;
            case 2:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.b);
                break;
            case 3:
                ((e5.u) this.b).run();
                break;
            case 4:
                ((ih.g) this.b).run();
                break;
            case 5:
                m9 m9Var = (m9) this.b;
                if (dialogInterface == m9Var.q0) {
                    m9Var.q0 = null;
                    m9Var.P();
                    break;
                }
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
                y0 y0Var = ((k0) this.b).e.M;
                if (y0Var != null && (e0Var = y0Var.c) != null) {
                    e0Var.y();
                    break;
                }
                break;
            case 8:
                e0 e0Var2 = ((r0) this.b).b.e.M.c;
                if (e0Var2 != null) {
                    e0Var2.y();
                    break;
                }
                break;
            case 9:
                AndroidUtilities.hideKeyboard((pf.o) this.b);
                break;
            case 10:
                AndroidUtilities.hideKeyboard((h1) this.b);
                break;
            case 11:
                ((qh.p) this.b).K = null;
                break;
            case 12:
                ((x1) this.b).K0 = null;
                break;
            case 13:
                j0 j0Var = (j0) this.b;
                j0Var.b0 = false;
                j0Var.t0.W = true;
                j0Var.A0.invalidate();
                j0Var.t0.invalidate();
                break;
            default:
                k1 k1Var = (k1) this.b;
                dg.q qVar = k1Var.n0;
                if (qVar != null) {
                    qVar.setDialogVisible(false);
                }
                k1Var.m0.setPaused(false);
                break;
        }
    }
}
