package ag;

import android.content.DialogInterface;
import hh.m5;
import hh.n6;
import hh.y9;
import jh.i9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.f0 f0Var;
        switch (this.a) {
            case 0:
                i1 i1Var = (i1) this.b;
                i1Var.b0 = false;
                i1Var.t0.W = true;
                i1Var.A0.invalidate();
                i1Var.t0.invalidate();
                break;
            case 1:
                y2 y2Var = (y2) this.b;
                k kVar = y2Var.n0;
                if (kVar != null) {
                    kVar.setDialogVisible(false);
                }
                y2Var.m0.setPaused(false);
                break;
            case 2:
                ((fh.v) this.b).s = null;
                break;
            case 3:
                ((n6) this.b).run();
                break;
            case 4:
                AndroidUtilities.hideKeyboard((EditTextBoldCursor) this.b);
                break;
            case 5:
                ((m5) this.b).run();
                break;
            case 6:
                ((y9) this.b).run();
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
                AndroidUtilities.hideKeyboard((qf.p) this.b);
                break;
            case 12:
                AndroidUtilities.hideKeyboard((qf.h1) this.b);
                break;
            case 13:
                ((rh.p) this.b).K = null;
                break;
            default:
                ((rh.x1) this.b).K0 = null;
                break;
        }
    }
}
