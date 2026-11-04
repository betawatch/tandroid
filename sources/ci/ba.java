package ci;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ba implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ba(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.d0 d0Var;
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.v1((EditTextBoldCursor) this.b);
                break;
            case 1:
                ((e0) this.b).run();
                break;
            case 2:
                ((l8) this.b).run();
                break;
            case 3:
                ((ei.z5) this.b).run();
                break;
            case 4:
                ei.r9 r9Var = (ei.r9) this.b;
                if (dialogInterface == r9Var.v0) {
                    r9Var.v0 = null;
                    r9Var.d0();
                    break;
                }
                break;
            case 5:
                org.telegram.messenger.g0.v1((lg.s) this.b);
                break;
            case 6:
                org.telegram.messenger.g0.v1((lg.y0) this.b);
                break;
            case 7:
                ((mi.p) this.b).P = null;
                break;
            case 8:
                ((mi.c2) this.b).P0 = null;
                break;
            case 9:
                ((org.telegram.ui.ActionBar.s1) this.b).L = null;
                break;
            case 10:
                Runnable[] runnableArr = (Runnable[]) this.b;
                Runnable runnable = runnableArr[0];
                if (runnable != null) {
                    runnable.run();
                    runnableArr[0] = null;
                    break;
                }
                break;
            case 11:
                org.telegram.ui.web.w0 w0Var = ((org.telegram.ui.web.j0) this.b).e.R;
                if (w0Var != null && (d0Var = w0Var.c) != null) {
                    d0Var.z();
                    break;
                }
                break;
            case 12:
                org.telegram.ui.web.d0 d0Var2 = ((org.telegram.ui.web.p0) this.b).b.e.R.c;
                if (d0Var2 != null) {
                    d0Var2.z();
                    break;
                }
                break;
            case 13:
                vg.i0 i0Var = (vg.i0) this.b;
                i0Var.Y1 = false;
                i0Var.q2.e0 = true;
                i0Var.x2.invalidate();
                i0Var.q2.invalidate();
                break;
            case 14:
                vg.h1 h1Var = (vg.h1) this.b;
                ic icVar = h1Var.k2;
                if (icVar != null) {
                    icVar.setDialogVisible(false);
                }
                h1Var.j2.setPaused(false);
                break;
            default:
                ((zh.k) this.b).s = null;
                break;
        }
    }
}
