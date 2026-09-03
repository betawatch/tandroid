package eg;

import android.content.DialogInterface;
import lh.l6;
import nh.i9;
import nh.n5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.g0 g0Var;
        switch (this.a) {
            case 0:
                v0 v0Var = (v0) this.b;
                v0Var.c0 = false;
                v0Var.u0.a0 = true;
                v0Var.B0.invalidate();
                v0Var.u0.invalidate();
                break;
            case 1:
                e2 e2Var = (e2) this.b;
                i iVar = e2Var.o0;
                if (iVar != null) {
                    iVar.setDialogVisible(false);
                }
                e2Var.n0.setPaused(false);
                break;
            case 2:
                ((jh.v) this.b).s = null;
                break;
            case 3:
                ((l6) this.b).run();
                break;
            case 4:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.b);
                break;
            case 5:
                ((lh.n2) this.b).run();
                break;
            case 6:
                ((n5) this.b).run();
                break;
            case 7:
                i9 i9Var = (i9) this.b;
                if (dialogInterface == i9Var.r0) {
                    i9Var.r0 = null;
                    i9Var.P();
                    break;
                }
                break;
            case 8:
                Runnable[] runnableArr = (Runnable[]) this.b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    break;
                }
                break;
            case 9:
                org.telegram.ui.web.c1 c1Var = ((org.telegram.ui.web.m0) this.b).e.N;
                if (c1Var != null && (g0Var = c1Var.c) != null) {
                    g0Var.y();
                    break;
                }
                break;
            case 10:
                org.telegram.ui.web.g0 g0Var2 = ((org.telegram.ui.web.u0) this.b).b.e.N.c;
                if (g0Var2 != null) {
                    g0Var2.y();
                    break;
                }
                break;
            case 11:
                AndroidUtilities.hideKeyboard((uf.n) this.b);
                break;
            case 12:
                AndroidUtilities.hideKeyboard((uf.g1) this.b);
                break;
            case 13:
                ((vh.q) this.b).L = null;
                break;
            default:
                ((vh.y1) this.b).L0 = null;
                break;
        }
    }
}
