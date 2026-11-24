// default package

import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class d18 implements View.OnLongClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y28 b;

    public /* synthetic */ d18(y28 y28Var, byte b) {
        this.a = b;
        this.b = y28Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        byte b = this.a;
        y28 y28Var = this.b;
        switch (b) {
            case 0:
                if (!y28Var.v0(true)) {
                    cs5 G = cs5.G(y28Var.z0.w, y28Var.r0, view);
                    G.b(R.drawable.msg_edit, k96.M0(2131748618, null), new e18(y28Var, (byte) 6), false);
                    G.k(R.drawable.menu_delete_paid, k96.M0(2131748617, null), new e18(y28Var, (byte) 7), y28Var.A3 > 0);
                    G.W(5);
                    G.X = true;
                    G.a0();
                    break;
                } else {
                    break;
                }
            default:
                y28Var.B0.j(y28Var.v0(false));
                break;
        }
        return true;
    }
}
