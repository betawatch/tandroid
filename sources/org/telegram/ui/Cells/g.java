package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.ey;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h hVar = (h) this.b;
                ca0 ca0Var = hVar.d;
                if (ca0Var != null) {
                    hVar.h.E.l(ca0Var, true);
                    break;
                }
                break;
            case 1:
                k1 k1Var = ((u1) this.b).e;
                if (k1Var != null) {
                    k1Var.j();
                    break;
                }
                break;
            case 2:
                ((a2) this.b).a();
                break;
            case 3:
                AndroidUtilities.hideKeyboard(((yh.s4) this.b).b.getEditText());
                break;
            case 4:
                AndroidUtilities.hideKeyboard(((h3) this.b).d);
                break;
            case 5:
                i6 i6Var = (i6) this.b;
                if (!(i6Var.getParent() instanceof mm0)) {
                    i6Var.callOnClick();
                    break;
                } else {
                    ((mm0) i6Var.getParent()).getOnItemClickListener().d(RecyclerView.R(i6Var), i6Var);
                    break;
                }
            case 6:
                ((s7) this.b).h();
                break;
            case 7:
                ba baVar = (ba) this.b;
                baVar.C.invalidate();
                baVar.T();
                break;
            case 8:
                ((l9) this.b).b.T();
                break;
            case 9:
                ga gaVar = (ga) this.b;
                gaVar.s = -1;
                int i10 = 0;
                while (true) {
                    t1[] t1VarArr = gaVar.e;
                    if (i10 >= t1VarArr.length) {
                        break;
                    } else {
                        t1 t1Var = t1VarArr[i10];
                        if (t1Var != null) {
                            t1Var.invalidate();
                        }
                        i10++;
                    }
                }
            case 10:
                ey eyVar = (ey) this.b;
                qc.e();
                eyVar.presentFragment(new SessionsActivity(0));
                break;
            default:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.b;
                h3Var.setCanDismissWithSwipe(true);
                h3Var.setCanDismissWithTouchOutside(true);
                break;
        }
    }
}
