// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class i56 implements gk, ee, gla {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s56 b;

    public /* synthetic */ i56(s56 s56Var, byte b) {
        this.a = b;
        this.b = s56Var;
    }

    @Override // gla
    public final void i(int i) {
        byte b = this.a;
        s56 s56Var = this.b;
        switch (b) {
            case 2:
                if (i >= s56Var.P.size()) {
                    s56Var.x.setText("");
                    break;
                } else {
                    s56Var.x.setText(jb6.s(s56Var.getConnectionsManager().getCurrentTime() + ((Integer) r0.get(i)).intValue(), false));
                    break;
                }
            default:
                s56Var.G.clearFocus();
                s56Var.O = true;
                ArrayList arrayList = s56Var.R;
                int size = arrayList.size();
                n56 n56Var = s56Var.G;
                if (i < size) {
                    n56Var.setText(((Integer) arrayList.get(i)).toString());
                } else {
                    n56Var.setText("");
                }
                s56Var.O = false;
                break;
        }
    }

    @Override // gla
    public final void m() {
        byte b = this.a;
    }

    @Override // ee
    public final void r(he heVar, int i) {
        s56 s56Var = this.b;
        s56Var.T.a(s56Var.e);
        s56Var.finishFragment();
    }

    @Override // gk
    public final void y(int i, int i2, boolean z) {
        this.b.a0(i);
    }

    private final void a() {
    }

    private final void b() {
    }
}
