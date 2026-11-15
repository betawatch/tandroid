package di;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class r9 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r9(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.c0 c0Var;
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.v1((EditTextBoldCursor) this.b);
                break;
            case 1:
                ((s2) this.b).run();
                break;
            case 2:
                ((d8) this.b).run();
                break;
            case 3:
                ((fi.c1) this.b).run();
                break;
            case 4:
                fi.i9 i9Var = (fi.i9) this.b;
                if (dialogInterface == i9Var.v0) {
                    i9Var.v0 = null;
                    i9Var.V();
                    break;
                }
                break;
            case 5:
                org.telegram.messenger.g0.v1((kg.s) this.b);
                break;
            case 6:
                org.telegram.messenger.g0.v1((kg.x0) this.b);
                break;
            case 7:
                ((oi.o) this.b).P = null;
                break;
            case 8:
                ((oi.z1) this.b).P0 = null;
                break;
            case 9:
                ((org.telegram.ui.ActionBar.t1) this.b).L = null;
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
                org.telegram.ui.web.v0 v0Var = ((org.telegram.ui.web.i0) this.b).e.R;
                if (v0Var != null && (c0Var = v0Var.c) != null) {
                    c0Var.z();
                    break;
                }
                break;
            case 12:
                org.telegram.ui.web.c0 c0Var2 = ((org.telegram.ui.web.o0) this.b).b.e.R.c;
                if (c0Var2 != null) {
                    c0Var2.z();
                    break;
                }
                break;
            case 13:
                ug.j0 j0Var = (ug.j0) this.b;
                j0Var.b2 = false;
                j0Var.t2.e0 = true;
                j0Var.A2.invalidate();
                j0Var.t2.invalidate();
                break;
            case 14:
                ug.g1 g1Var = (ug.g1) this.b;
                yb ybVar = g1Var.n2;
                if (ybVar != null) {
                    ybVar.setDialogVisible(false);
                }
                g1Var.m2.setPaused(false);
                break;
            default:
                ((zh.l) this.b).s = null;
                break;
        }
    }
}
