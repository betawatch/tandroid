package ih;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.x60;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w1 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i4 b;

    public /* synthetic */ w1(i4 i4Var, int i9) {
        this.a = i9;
        this.b = i4Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                i4 i4Var = this.b;
                if (!i4Var.D0(true)) {
                    x60 F = x60.F(i4Var.F0.v, i4Var.x0, view);
                    F.c(R.drawable.msg_edit, LocaleController.getString(R.string.LiveStoryMessageEditStars), new x1(i4Var, 6), false);
                    F.l(R.drawable.menu_delete_paid, LocaleController.getString(R.string.LiveStoryMessageRemoveStars), new x1(i4Var, 7), i4Var.H3 > 0);
                    F.V(5);
                    F.U = true;
                    F.Z();
                    break;
                }
                break;
            default:
                i4 i4Var2 = this.b;
                i4Var2.H0.k(i4Var2.D0(false));
                break;
        }
        return true;
    }
}
