package ag;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.qz0;
import th.o7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        org.telegram.ui.web.d0 d0Var;
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.v1((f0) this.b);
                break;
            case 1:
                org.telegram.messenger.i0.v1((a2) this.b);
                break;
            case 2:
                ((bi.t) this.b).O = null;
                break;
            case 3:
                ((bi.k2) this.b).O0 = null;
                break;
            case 4:
                kg.q0 q0Var = (kg.q0) this.b;
                q0Var.X1 = false;
                q0Var.p2.d0 = true;
                q0Var.w2.invalidate();
                q0Var.p2.invalidate();
                break;
            case 5:
                kg.v1 v1Var = (kg.v1) this.b;
                kg.h hVar = v1Var.j2;
                if (hVar != null) {
                    hVar.setDialogVisible(false);
                }
                v1Var.i2.setPaused(false);
                break;
            case 6:
                ((oh.q) this.b).s = null;
                break;
            case 7:
                ((org.telegram.ui.ActionBar.x1) this.b).K = null;
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
                org.telegram.ui.web.z0 z0Var = ((org.telegram.ui.web.j0) this.b).e.Q;
                if (z0Var != null && (d0Var = z0Var.c) != null) {
                    d0Var.z();
                    break;
                }
                break;
            case 10:
                org.telegram.ui.web.d0 d0Var2 = ((org.telegram.ui.web.r0) this.b).b.e.Q.c;
                if (d0Var2 != null) {
                    d0Var2.z();
                    break;
                }
                break;
            case 11:
                org.telegram.messenger.i0.v1((EditTextBoldCursor) this.b);
                break;
            case 12:
                ((rh.o) this.b).run();
                break;
            case 13:
                ((qz0) this.b).run();
                break;
            case 14:
                ((sg.v) this.b).run();
                break;
            default:
                o7 o7Var = (o7) this.b;
                if (dialogInterface == o7Var.u0) {
                    o7Var.u0 = null;
                    o7Var.d0();
                    break;
                }
                break;
        }
    }
}
