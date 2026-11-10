package bi;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eb implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eb(Object obj, int i7) {
        this.a = i7;
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
                ((a4) this.b).run();
                break;
            case 2:
                ((l9) this.b).run();
                break;
            case 3:
                ((di.f8) this.b).run();
                break;
            case 4:
                di.q9 q9Var = (di.q9) this.b;
                if (dialogInterface == q9Var.u0) {
                    q9Var.u0 = null;
                    q9Var.V();
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
                ((li.p) this.b).O = null;
                break;
            case 8:
                ((li.b2) this.b).O0 = null;
                break;
            case 9:
                ((org.telegram.ui.ActionBar.u1) this.b).K = null;
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
                org.telegram.ui.web.x0 x0Var = ((org.telegram.ui.web.j0) this.b).e.Q;
                if (x0Var != null && (d0Var = x0Var.c) != null) {
                    d0Var.z();
                    break;
                }
                break;
            case 12:
                org.telegram.ui.web.d0 d0Var2 = ((org.telegram.ui.web.q0) this.b).b.e.Q.c;
                if (d0Var2 != null) {
                    d0Var2.z();
                    break;
                }
                break;
            case 13:
                ug.i0 i0Var = (ug.i0) this.b;
                i0Var.a2 = false;
                i0Var.s2.d0 = true;
                i0Var.z2.invalidate();
                i0Var.s2.invalidate();
                break;
            case 14:
                ug.f1 f1Var = (ug.f1) this.b;
                qd qdVar = f1Var.m2;
                if (qdVar != null) {
                    qdVar.setDialogVisible(false);
                }
                f1Var.l2.setPaused(false);
                break;
            default:
                ((yh.m) this.b).s = null;
                break;
        }
    }
}
