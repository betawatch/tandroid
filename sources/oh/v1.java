package oh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.q70;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v1 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f4 b;

    public /* synthetic */ v1(f4 f4Var, int i10) {
        this.a = i10;
        this.b = f4Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                f4 f4Var = this.b;
                if (!f4Var.D0(true)) {
                    q70 F = q70.F(f4Var.G0.v, f4Var.y0, view);
                    F.c(R.drawable.msg_edit, LocaleController.getString(R.string.LiveStoryMessageEditStars), new w1(f4Var, 6), false);
                    F.l(R.drawable.menu_delete_paid, LocaleController.getString(R.string.LiveStoryMessageRemoveStars), new w1(f4Var, 7), f4Var.I3 > 0);
                    F.V(5);
                    F.U = true;
                    F.Z();
                    break;
                }
                break;
            default:
                f4 f4Var2 = this.b;
                f4Var2.I0.k(f4Var2.D0(false));
                break;
        }
        return true;
    }
}
