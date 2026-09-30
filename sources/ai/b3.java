package ai;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.a80;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b3 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e6 b;

    public /* synthetic */ b3(e6 e6Var, int i10) {
        this.a = i10;
        this.b = e6Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                e6 e6Var = this.b;
                if (!e6Var.D0(true)) {
                    a80 F = a80.F(e6Var.J0.v, e6Var.B0, view);
                    F.c(R.drawable.msg_edit, LocaleController.getString(R.string.LiveStoryMessageEditStars), new c3(e6Var, 6), false);
                    F.l(R.drawable.menu_delete_paid, LocaleController.getString(R.string.LiveStoryMessageRemoveStars), new c3(e6Var, 7), e6Var.L3 > 0);
                    F.V(5);
                    F.U = true;
                    F.Z();
                    break;
                }
                break;
            default:
                e6 e6Var2 = this.b;
                e6Var2.L0.k(e6Var2.D0(false));
                break;
        }
        return true;
    }
}
