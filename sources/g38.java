// default package

import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class g38 implements View.OnLongClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a58 b;

    public /* synthetic */ g38(a58 a58Var, byte b) {
        this.a = b;
        this.b = a58Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        byte b = this.a;
        a58 a58Var = this.b;
        switch (b) {
            case 0:
                if (!a58Var.v0(true)) {
                    bu5 G = bu5.G(a58Var.z0.w, a58Var.r0, view);
                    G.b(R.drawable.msg_edit, jb6.M0(2131748567, null), new h38(a58Var, (byte) 6), false);
                    G.k(R.drawable.menu_delete_paid, jb6.M0(2131748566, null), new h38(a58Var, (byte) 7), a58Var.A3 > 0);
                    G.W(5);
                    G.X = true;
                    G.a0();
                    break;
                } else {
                    break;
                }
            default:
                a58Var.B0.j(a58Var.v0(false));
                break;
        }
        return true;
    }
}
