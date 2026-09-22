package ai;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.n70;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b3 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ b3(f6 f6Var, int i10) {
        this.a = i10;
        this.b = f6Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                f6 f6Var = this.b;
                if (!f6Var.D0(true)) {
                    n70 F = n70.F(f6Var.J0.v, f6Var.B0, view);
                    F.c(R.drawable.msg_edit, LocaleController.getString(R.string.LiveStoryMessageEditStars), new c3(f6Var, 6), false);
                    F.l(R.drawable.menu_delete_paid, LocaleController.getString(R.string.LiveStoryMessageRemoveStars), new c3(f6Var, 7), f6Var.L3 > 0);
                    F.V(5);
                    F.U = true;
                    F.Z();
                    break;
                }
                break;
            default:
                f6 f6Var2 = this.b;
                f6Var2.L0.k(f6Var2.D0(false));
                break;
        }
        return true;
    }
}
