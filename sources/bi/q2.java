package bi;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.m80;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class q2 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q5 b;

    public /* synthetic */ q2(q5 q5Var, int i10) {
        this.a = i10;
        this.b = q5Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                q5 q5Var = this.b;
                if (!q5Var.D0(true)) {
                    m80 F = m80.F(q5Var.J0.v, q5Var.B0, view);
                    F.c(R.drawable.msg_edit, LocaleController.getString(R.string.LiveStoryMessageEditStars), new r2(q5Var, 6), false);
                    F.l(R.drawable.menu_delete_paid, LocaleController.getString(R.string.LiveStoryMessageRemoveStars), new r2(q5Var, 7), q5Var.L3 > 0);
                    F.V(5);
                    F.U = true;
                    F.Z();
                    break;
                } else {
                    break;
                }
            default:
                q5 q5Var2 = this.b;
                q5Var2.L0.k(q5Var2.D0(false));
                break;
        }
        return true;
    }
}
