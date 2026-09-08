package bi;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.n70;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class p2 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5 b;

    public /* synthetic */ p2(o5 o5Var, int i10) {
        this.a = i10;
        this.b = o5Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                o5 o5Var = this.b;
                if (!o5Var.D0(true)) {
                    n70 F = n70.F(o5Var.J0.v, o5Var.B0, view);
                    F.c(R.drawable.msg_edit, LocaleController.getString(R.string.LiveStoryMessageEditStars), new q2(o5Var, 6), false);
                    F.l(R.drawable.menu_delete_paid, LocaleController.getString(R.string.LiveStoryMessageRemoveStars), new q2(o5Var, 7), o5Var.L3 > 0);
                    F.V(5);
                    F.U = true;
                    F.Z();
                    break;
                }
                break;
            default:
                o5 o5Var2 = this.b;
                o5Var2.L0.k(o5Var2.D0(false));
                break;
        }
        return true;
    }
}
