package fi;

import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.a70;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q1 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3 b;

    public /* synthetic */ q1(z3 z3Var, int i7) {
        this.a = i7;
        this.b = z3Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i7 = this.a;
        z3 z3Var = this.b;
        switch (i7) {
            case 0:
                if (!z3Var.B0(true)) {
                    a70 G = a70.G(z3Var.t0.w, z3Var.l0, view);
                    G.c(R.drawable.msg_edit, hd.N0(2131748617, null), new r1(z3Var, 6), false);
                    G.l(R.drawable.menu_delete_paid, hd.N0(2131748616, null), new r1(z3Var, 7), z3Var.v3 > 0);
                    G.W(5);
                    G.X = true;
                    G.a0();
                    break;
                } else {
                    break;
                }
            default:
                z3Var.v0.k(z3Var.B0(false));
                break;
        }
        return true;
    }
}
