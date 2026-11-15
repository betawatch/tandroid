package gi;

import ai.f0;
import android.widget.FrameLayout;
import android.widget.ImageView;
import fi.i4;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class p extends ja {
    public final int T1;
    public final CharSequence U1;
    public p41 V1;

    public p(e2 e2Var, String str, f0 f0Var) {
        super(e2Var, true, false, e2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.T1 = e2Var.getCurrentAccount();
        this.U1 = str;
        b1();
        this.v1 = 0.6f;
        this.y1 = true;
        this.z1 = true;
        O();
        Y0();
        uj0 uj0Var = this.o1;
        int i7 = this.u0;
        uj0Var.setPadding(i7, 0, i7, 0);
        this.o1.setOnItemClickListener(new i4(1, this, f0Var));
    }

    @Override // org.telegram.ui.Components.ja
    public final tj0 L0(uj0 uj0Var) {
        p41 p41Var = new p41(uj0Var, getContext(), this.T1, 0, false, new bi.b(this, 24), this.J0);
        this.V1 = p41Var;
        p41Var.r = false;
        return p41Var;
    }

    @Override // org.telegram.ui.Components.ja
    public final CharSequence O0() {
        return this.U1;
    }
}
