package ei;

import android.widget.FrameLayout;
import android.widget.ImageView;
import di.q4;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qj0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class q extends na {
    public final int P1;
    public final CharSequence Q1;
    public m41 R1;

    public q(f2 f2Var, String str, ai.i iVar) {
        super(f2Var, true, false, f2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.P1 = f2Var.getCurrentAccount();
        this.Q1 = str;
        b1();
        this.r1 = 0.6f;
        this.u1 = true;
        this.v1 = true;
        N();
        Y0();
        qj0 qj0Var = this.k1;
        int i7 = this.t0;
        qj0Var.setPadding(i7, 0, i7, 0);
        this.k1.setOnItemClickListener(new q4(1, this, iVar));
    }

    @Override // org.telegram.ui.Components.na
    public final pj0 L0(qj0 qj0Var) {
        m41 m41Var = new m41(qj0Var, getContext(), this.P1, 0, false, new ai.e(this, 14), this.I0);
        this.R1 = m41Var;
        m41Var.r = false;
        return m41Var;
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        return this.Q1;
    }
}
