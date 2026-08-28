package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.dy;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h hVar = (h) this.b;
                p80 p80Var = hVar.d;
                if (p80Var != null) {
                    hVar.h.A.l(p80Var, true);
                    break;
                }
                break;
            case 1:
                k1 k1Var = ((u1) this.b).e;
                if (k1Var != null) {
                    k1Var.m();
                    break;
                }
                break;
            case 2:
                ((a2) this.b).a();
                break;
            case 3:
                AndroidUtilities.hideKeyboard(((fh.p6) this.b).b.getEditText());
                break;
            case 4:
                AndroidUtilities.hideKeyboard(((j3) this.b).b);
                break;
            case 5:
                h6 h6Var = (h6) this.b;
                if (!(h6Var.getParent() instanceof wk0)) {
                    h6Var.callOnClick();
                    break;
                } else {
                    ((wk0) h6Var.getParent()).getOnItemClickListener().a(RecyclerView.R(h6Var), h6Var);
                    break;
                }
            case 6:
                ((r7) this.b).h();
                break;
            case 7:
                aa aaVar = (aa) this.b;
                aaVar.C.invalidate();
                aaVar.U();
                break;
            case 8:
                ((k9) this.b).b.U();
                break;
            case 9:
                fa faVar = (fa) this.b;
                faVar.s = -1;
                int i9 = 0;
                while (true) {
                    t1[] t1VarArr = faVar.e;
                    if (i9 >= t1VarArr.length) {
                        break;
                    } else {
                        t1 t1Var = t1VarArr[i9];
                        if (t1Var != null) {
                            t1Var.invalidate();
                        }
                        i9++;
                    }
                }
            case 10:
                dy dyVar = (dy) this.b;
                gc.e();
                dyVar.presentFragment(new SessionsActivity(0));
                break;
            default:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.b;
                f3Var.setCanDismissWithSwipe(true);
                f3Var.setCanDismissWithTouchOutside(true);
                break;
        }
    }
}
