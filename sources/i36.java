// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class i36 implements gj, ed, eja {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s36 b;

    public /* synthetic */ i36(s36 s36Var, byte b) {
        this.a = b;
        this.b = s36Var;
    }

    @Override // eja
    public final void k(int i) {
        byte b = this.a;
        s36 s36Var = this.b;
        switch (b) {
            case 2:
                if (i >= s36Var.P.size()) {
                    s36Var.x.setText("");
                    break;
                } else {
                    s36Var.x.setText(k96.s(s36Var.getConnectionsManager().getCurrentTime() + ((Integer) r0.get(i)).intValue(), false));
                    break;
                }
            default:
                s36Var.G.clearFocus();
                s36Var.O = true;
                ArrayList arrayList = s36Var.R;
                int size = arrayList.size();
                n36 n36Var = s36Var.G;
                if (i < size) {
                    n36Var.setText(((Integer) arrayList.get(i)).toString());
                } else {
                    n36Var.setText("");
                }
                s36Var.O = false;
                break;
        }
    }

    @Override // eja
    public final void n() {
        byte b = this.a;
    }

    @Override // gj
    public final void s(int i, int i2, boolean z) {
        this.b.Z(i);
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        s36 s36Var = this.b;
        s36Var.T.a(s36Var.e);
        s36Var.finishFragment();
    }

    private final void a() {
    }

    private final void b() {
    }
}
