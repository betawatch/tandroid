package bi;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.l80;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                    l80 F = l80.F(q5Var.J0.v, q5Var.B0, view);
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
