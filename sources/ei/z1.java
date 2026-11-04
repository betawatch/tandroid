package ei;

import android.view.View;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.f60;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z1 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4 b;

    public /* synthetic */ z1(j4 j4Var, int i3) {
        this.a = i3;
        this.b = j4Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i3 = this.a;
        j4 j4Var = this.b;
        switch (i3) {
            case 0:
                if (!j4Var.B0(true)) {
                    f60 F = f60.F(j4Var.t0.w, j4Var.l0, view);
                    F.c(R.drawable.msg_edit, bd.M0(2131748818, null), new a2(j4Var, 6), false);
                    F.l(R.drawable.menu_delete_paid, bd.M0(2131748817, null), new a2(j4Var, 7), j4Var.v3 > 0);
                    F.V(5);
                    F.U = true;
                    F.Z();
                    break;
                } else {
                    break;
                }
            default:
                j4Var.v0.k(j4Var.B0(false));
                break;
        }
        return true;
    }
}
