package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.fy;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                c90 c90Var = hVar.d;
                if (c90Var != null) {
                    hVar.h.A.l(c90Var, true);
                    break;
                }
                break;
            case 1:
                j1 j1Var = ((t1) this.b).e;
                if (j1Var != null) {
                    j1Var.k();
                    break;
                }
                break;
            case 2:
                ((z1) this.b).a();
                break;
            case 3:
                AndroidUtilities.hideKeyboard(((ih.z5) this.b).b.getEditText());
                break;
            case 4:
                AndroidUtilities.hideKeyboard(((g3) this.b).b);
                break;
            case 5:
                f6 f6Var = (f6) this.b;
                if (!(f6Var.getParent() instanceof jl0)) {
                    f6Var.callOnClick();
                    break;
                } else {
                    ((jl0) f6Var.getParent()).getOnItemClickListener().c(RecyclerView.R(f6Var), f6Var);
                    break;
                }
            case 6:
                ((p7) this.b).h();
                break;
            case 7:
                x9 x9Var = (x9) this.b;
                x9Var.C.invalidate();
                x9Var.U();
                break;
            case 8:
                ((h9) this.b).b.U();
                break;
            case 9:
                ca caVar = (ca) this.b;
                caVar.s = -1;
                int i10 = 0;
                while (true) {
                    s1[] s1VarArr = caVar.e;
                    if (i10 >= s1VarArr.length) {
                        break;
                    } else {
                        s1 s1Var = s1VarArr[i10];
                        if (s1Var != null) {
                            s1Var.invalidate();
                        }
                        i10++;
                    }
                }
            case 10:
                fy fyVar = (fy) this.b;
                mc.e();
                fyVar.presentFragment(new SessionsActivity(0));
                break;
            default:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.b;
                f3Var.setCanDismissWithSwipe(true);
                f3Var.setCanDismissWithTouchOutside(true);
                break;
        }
    }
}
