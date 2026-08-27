package jh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.b70;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u1 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4 b;

    public /* synthetic */ u1(e4 e4Var, int i10) {
        this.a = i10;
        this.b = e4Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                e4 e4Var = this.b;
                if (!e4Var.D0(true)) {
                    b70 F = b70.F(e4Var.F0.v, e4Var.x0, view);
                    F.c(R.drawable.msg_edit, LocaleController.getString(R.string.LiveStoryMessageEditStars), new v1(e4Var, 6), false);
                    F.l(R.drawable.menu_delete_paid, LocaleController.getString(R.string.LiveStoryMessageRemoveStars), new v1(e4Var, 7), e4Var.H3 > 0);
                    F.V(5);
                    F.U = true;
                    F.Z();
                    break;
                }
                break;
            default:
                e4 e4Var2 = this.b;
                e4Var2.H0.k(e4Var2.D0(false));
                break;
        }
        return true;
    }
}
