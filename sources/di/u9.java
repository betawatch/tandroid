package di;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u9 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u9(Object obj, int i7) {
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
                ((f2) this.b).run();
                break;
            case 2:
                ((g8) this.b).run();
                break;
            case 3:
                ((f2.a) this.b).run();
                break;
            case 4:
                fi.f9 f9Var = (fi.f9) this.b;
                if (dialogInterface == f9Var.v0) {
                    f9Var.v0 = null;
                    f9Var.V();
                    break;
                }
                break;
            case 5:
                org.telegram.messenger.g0.v1((kg.s) this.b);
                break;
            case 6:
                org.telegram.messenger.g0.v1((kg.z0) this.b);
                break;
            case 7:
                ((oi.o) this.b).P = null;
                break;
            case 8:
                ((oi.b2) this.b).P0 = null;
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
                ug.k0 k0Var = (ug.k0) this.b;
                k0Var.b2 = false;
                k0Var.t2.e0 = true;
                k0Var.A2.invalidate();
                k0Var.t2.invalidate();
                break;
            case 14:
                ug.h1 h1Var = (ug.h1) this.b;
                bc bcVar = h1Var.n2;
                if (bcVar != null) {
                    bcVar.setDialogVisible(false);
                }
                h1Var.m2.setPaused(false);
                break;
            default:
                ((zh.l) this.b).s = null;
                break;
        }
    }
}
