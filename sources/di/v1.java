package di;

import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.k60;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
                    F.c(R.drawable.msg_edit, hd.M0(2131748809, null), new w1(i4Var, 6), false);
                    F.l(R.drawable.menu_delete_paid, hd.M0(2131748808, null), new w1(i4Var, 7), i4Var.u3 > 0);
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
