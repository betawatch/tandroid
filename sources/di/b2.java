package di;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.l80;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b2 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q4 b;

    public /* synthetic */ b2(q4 q4Var, int i10) {
        this.a = i10;
        this.b = q4Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                q4 q4Var = this.b;
                if (!q4Var.B0(true)) {
                    l80 F = l80.F(q4Var.y0.v, q4Var.q0, view);
                    F.c(R.drawable.msg_edit, LocaleController.getString(R.string.LiveStoryMessageEditStars), new c2(q4Var, 6), false);
                    F.l(R.drawable.menu_delete_paid, LocaleController.getString(R.string.LiveStoryMessageRemoveStars), new c2(q4Var, 7), q4Var.A3 > 0);
                    F.V(5);
                    F.U = true;
                    F.Z();
                    break;
                } else {
                    break;
                }
            default:
                q4 q4Var2 = this.b;
                q4Var2.A0.k(q4Var2.B0(false));
                break;
        }
        return true;
    }
}
