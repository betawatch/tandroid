package gi;

import ai.h0;
import android.widget.FrameLayout;
import android.widget.ImageView;
import fi.g4;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.sa;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class p extends sa {
    public final int T1;
    public final CharSequence U1;
    public c51 V1;

    public p(g2 g2Var, String str, h0 h0Var) {
        super(g2Var, true, false, g2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.T1 = g2Var.getCurrentAccount();
        this.U1 = str;
        c1();
        this.v1 = 0.6f;
        this.y1 = true;
        this.z1 = true;
        O();
        Z0();
        ek0 ek0Var = this.o1;
        int i7 = this.u0;
        ek0Var.setPadding(i7, 0, i7, 0);
        this.o1.setOnItemClickListener(new g4(1, this, h0Var));
    }

    @Override // org.telegram.ui.Components.sa
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(ek0Var, getContext(), this.T1, 0, false, new bi.b(this, 23), this.J0);
        this.V1 = c51Var;
        c51Var.r = false;
        return c51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        return this.U1;
    }
}
