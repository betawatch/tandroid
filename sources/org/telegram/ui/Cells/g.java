package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.ty;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                ia0 ia0Var = hVar.d;
                if (ia0Var != null) {
                    hVar.h.E.l(ia0Var, true);
                    break;
                }
                break;
            case 1:
                l1 l1Var = ((v1) this.b).e;
                if (l1Var != null) {
                    l1Var.k();
                    break;
                }
                break;
            case 2:
                ((b2) this.b).a();
                break;
            case 3:
                AndroidUtilities.hideKeyboard(((xh.u4) this.b).b.getEditText());
                break;
            case 4:
                AndroidUtilities.hideKeyboard(((j3) this.b).b);
                break;
            case 5:
                i6 i6Var = (i6) this.b;
                if (!(i6Var.getParent() instanceof qm0)) {
                    i6Var.callOnClick();
                    break;
                } else {
                    ((qm0) i6Var.getParent()).getOnItemClickListener().d(RecyclerView.R(i6Var), i6Var);
                    break;
                }
            case 6:
                ((t7) this.b).h();
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
                    u1[] u1VarArr = gaVar.e;
                    if (i10 >= u1VarArr.length) {
                        break;
                    } else {
                        u1 u1Var = u1VarArr[i10];
                        if (u1Var != null) {
                            u1Var.invalidate();
                        }
                        i10++;
                    }
                }
            case 10:
                ty tyVar = (ty) this.b;
                tc.e();
                tyVar.presentFragment(new SessionsActivity(0));
                break;
            default:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.b;
                f3Var.setCanDismissWithSwipe(true);
                f3Var.setCanDismissWithTouchOutside(true);
                break;
        }
    }
}
