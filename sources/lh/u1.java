package lh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.j70;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u1 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d4 b;

    public /* synthetic */ u1(d4 d4Var, int i10) {
        this.a = i10;
        this.b = d4Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                d4 d4Var = this.b;
                if (!d4Var.D0(true)) {
                    j70 F = j70.F(d4Var.F0.v, d4Var.x0, view);
                    F.c(R.drawable.msg_edit, LocaleController.getString(R.string.LiveStoryMessageEditStars), new v1(d4Var, 6), false);
                    F.l(R.drawable.menu_delete_paid, LocaleController.getString(R.string.LiveStoryMessageRemoveStars), new v1(d4Var, 7), d4Var.H3 > 0);
                    F.V(5);
                    F.U = true;
                    F.Z();
                    break;
                }
                break;
            default:
                d4 d4Var2 = this.b;
                d4Var2.H0.k(d4Var2.D0(false));
                break;
        }
        return true;
    }
}
