package kh;

import ag.n0;
import android.widget.FrameLayout;
import android.widget.ImageView;
import cg.x0;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class u extends qa {
    public final int T;
    public final CharSequence U;
    public b51 V;

    public u(n2 n2Var, String str, n0 n0Var) {
        super(n2Var.getParentActivity(), n2Var, true, false, false, 1, n2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.T = n2Var.getCurrentAccount();
        this.U = str;
        N();
        this.v = 0.6f;
        this.y = true;
        this.A = true;
        fixNavigationBar();
        K();
        zk0 zk0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new x0(3, this, n0Var));
    }

    @Override // org.telegram.ui.Components.qa
    public final yk0 w(zk0 zk0Var) {
        b51 b51Var = new b51(zk0Var, getContext(), this.T, 0, false, new ch.c(this, 23), this.resourcesProvider);
        this.V = b51Var;
        b51Var.r = false;
        return b51Var;
    }

    @Override // org.telegram.ui.Components.qa
    public final CharSequence z() {
        return this.U;
    }
}
