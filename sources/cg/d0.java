package cg;

import android.content.DialogInterface;
import jh.l6;
import lh.i9;
import lh.m5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        org.telegram.ui.web.f0 f0Var;
        switch (this.a) {
            case 0:
                v0 v0Var = (v0) this.b;
                v0Var.b0 = false;
                v0Var.t0.W = true;
                v0Var.A0.invalidate();
                v0Var.t0.invalidate();
                break;
            case 1:
                f2 f2Var = (f2) this.b;
                i iVar = f2Var.n0;
                if (iVar != null) {
                    iVar.setDialogVisible(false);
                }
                f2Var.m0.setPaused(false);
                break;
            case 2:
                ((hh.v) this.b).s = null;
                break;
            case 3:
                ((l6) this.b).run();
                break;
            case 4:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.b);
                break;
            case 5:
                ((jh.w2) this.b).run();
                break;
            case 6:
                ((m5) this.b).run();
                break;
            case 7:
                i9 i9Var = (i9) this.b;
                if (dialogInterface == i9Var.q0) {
                    i9Var.q0 = null;
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
                org.telegram.ui.web.z0 z0Var = ((org.telegram.ui.web.l0) this.b).e.M;
                if (z0Var != null && (f0Var = z0Var.c) != null) {
                    f0Var.y();
                    break;
                }
                break;
            case 10:
                org.telegram.ui.web.f0 f0Var2 = ((org.telegram.ui.web.s0) this.b).b.e.M.c;
                if (f0Var2 != null) {
                    f0Var2.y();
                    break;
                }
                break;
            case 11:
                AndroidUtilities.hideKeyboard((sf.o) this.b);
                break;
            case 12:
                AndroidUtilities.hideKeyboard((sf.h1) this.b);
                break;
            case 13:
                ((th.p) this.b).K = null;
                break;
            default:
                ((th.x1) this.b).K0 = null;
                break;
        }
    }
}
