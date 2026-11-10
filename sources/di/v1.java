package di;

import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.ui.Components.k60;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v1 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4 b;

    public /* synthetic */ v1(j4 j4Var, int i7) {
        this.a = i7;
        this.b = j4Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i7 = this.a;
        j4 j4Var = this.b;
        switch (i7) {
            case 0:
                if (!j4Var.B0(true)) {
                    k60 F = k60.F(j4Var.s0.w, j4Var.k0, view);
                    F.c(R.drawable.msg_edit, id.M0(2131748810, null), new w1(j4Var, 6), false);
                    F.l(R.drawable.menu_delete_paid, id.M0(2131748809, null), new w1(j4Var, 7), j4Var.u3 > 0);
                    F.V(5);
                    F.U = true;
                    F.Z();
                    break;
                } else {
                    break;
                }
            default:
                j4Var.u0.k(j4Var.B0(false));
                break;
        }
        return true;
    }
}
