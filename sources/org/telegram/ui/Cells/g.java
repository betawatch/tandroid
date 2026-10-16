package org.telegram.ui.Cells;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.yy;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                ha0 ha0Var = hVar.d;
                if (ha0Var != null) {
                    hVar.h.E.l(ha0Var, true);
                    break;
                }
                break;
            case 1:
                l1 l1Var = ((v1) this.b).e;
                if (l1Var != null) {
                    l1Var.j();
                    break;
                }
                break;
            case 2:
                ((b2) this.b).a();
                break;
            case 3:
                AndroidUtilities.hideKeyboard(((yh.s4) this.b).b.getEditText());
                break;
            case 4:
                AndroidUtilities.hideKeyboard(((j3) this.b).b);
                break;
            case 5:
                i6 i6Var = (i6) this.b;
                if (!(i6Var.getParent() instanceof mm0)) {
                    i6Var.callOnClick();
                    break;
                } else {
                    ((mm0) i6Var.getParent()).getOnItemClickListener().a(RecyclerView.R(i6Var), i6Var);
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
                yy yyVar = (yy) this.b;
                sc.e();
                yyVar.presentFragment(new SessionsActivity(0));
                break;
            default:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.b;
                e3Var.setCanDismissWithSwipe(true);
                e3Var.setCanDismissWithTouchOutside(true);
                break;
        }
    }
}
