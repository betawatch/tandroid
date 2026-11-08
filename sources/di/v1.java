package di;

import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.ui.Components.k60;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v1 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i4 b;

    public /* synthetic */ v1(i4 i4Var, int i7) {
        this.a = i7;
        this.b = i4Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i7 = this.a;
        i4 i4Var = this.b;
        switch (i7) {
            case 0:
                if (!i4Var.B0(true)) {
                    k60 F = k60.F(i4Var.s0.w, i4Var.k0, view);
                    F.c(R.drawable.msg_edit, id.M0(2131748811, null), new w1(i4Var, 6), false);
                    F.l(R.drawable.menu_delete_paid, id.M0(2131748810, null), new w1(i4Var, 7), i4Var.u3 > 0);
                    F.V(5);
                    F.U = true;
                    F.Z();
                    break;
                } else {
                    break;
                }
            default:
                i4Var.u0.k(i4Var.B0(false));
                break;
        }
        return true;
    }
}
