package nh;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.p70;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v1 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d4 b;

    public /* synthetic */ v1(d4 d4Var, int i10) {
        this.a = i10;
        this.b = d4Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                d4 d4Var = this.b;
                if (!d4Var.D0(true)) {
                    p70 F = p70.F(d4Var.G0.v, d4Var.y0, view);
                    F.c(R.drawable.msg_edit, LocaleController.getString(R.string.LiveStoryMessageEditStars), new w1(d4Var, 6), false);
                    F.l(R.drawable.menu_delete_paid, LocaleController.getString(R.string.LiveStoryMessageRemoveStars), new w1(d4Var, 7), d4Var.I3 > 0);
                    F.V(5);
                    F.U = true;
                    F.Z();
                    break;
                }
                break;
            default:
                d4 d4Var2 = this.b;
                d4Var2.I0.k(d4Var2.D0(false));
                break;
        }
        return true;
    }
}
