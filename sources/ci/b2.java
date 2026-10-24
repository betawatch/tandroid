package ci;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.j80;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b2 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p4 b;

    public /* synthetic */ b2(p4 p4Var, int i10) {
        this.a = i10;
        this.b = p4Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                p4 p4Var = this.b;
                if (!p4Var.C0(true)) {
                    j80 F = j80.F(p4Var.J0.v, p4Var.B0, view);
                    F.c(R.drawable.msg_edit, LocaleController.getString(R.string.LiveStoryMessageEditStars), new c2(p4Var, 6), false);
                    F.l(R.drawable.menu_delete_paid, LocaleController.getString(R.string.LiveStoryMessageRemoveStars), new c2(p4Var, 7), p4Var.L3 > 0);
                    F.V(5);
                    F.U = true;
                    F.Z();
                    break;
                } else {
                    break;
                }
            default:
                p4 p4Var2 = this.b;
                p4Var2.L0.k(p4Var2.C0(false));
                break;
        }
        return true;
    }
}
