package fg;

import android.content.DialogInterface;
import mh.l6;
import oh.i9;
import oh.t3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                v0Var.c0 = false;
                v0Var.u0.a0 = true;
                v0Var.B0.invalidate();
                v0Var.u0.invalidate();
                break;
            case 1:
                d2 d2Var = (d2) this.b;
                i iVar = d2Var.o0;
                if (iVar != null) {
                    iVar.setDialogVisible(false);
                }
                d2Var.n0.setPaused(false);
                break;
            case 2:
                ((kh.v) this.b).s = null;
                break;
            case 3:
                ((l6) this.b).run();
                break;
            case 4:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.b);
                break;
            case 5:
                ((mh.m2) this.b).run();
                break;
            case 6:
                ((t3) this.b).run();
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
                org.telegram.ui.web.a1 a1Var = ((org.telegram.ui.web.l0) this.b).e.N;
                if (a1Var != null && (f0Var = a1Var.c) != null) {
                    f0Var.y();
                    break;
                }
                break;
            case 10:
                org.telegram.ui.web.f0 f0Var2 = ((org.telegram.ui.web.t0) this.b).b.e.N.c;
                if (f0Var2 != null) {
                    f0Var2.y();
                    break;
                }
                break;
            case 11:
                AndroidUtilities.hideKeyboard((vf.n) this.b);
                break;
            case 12:
                AndroidUtilities.hideKeyboard((vf.g1) this.b);
                break;
            case 13:
                ((wh.q) this.b).L = null;
                break;
            default:
                ((wh.z1) this.b).L0 = null;
                break;
        }
    }
}
