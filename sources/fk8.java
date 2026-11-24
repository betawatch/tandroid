// default package

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fk8 extends q59 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ gk8 d;

    public fk8(gk8 gk8Var, Context context) {
        this.d = gk8Var;
        this.c = context;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return !((ik8) this.d.n.d.get(u69Var.b())).a.current;
    }

    @Override // y59
    public final int b() {
        return this.d.n.d.size();
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        tk8 tk8Var = (tk8) u69Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        tk8Var.a((ik8) premiumPreviewFragment.d.get(i), i != b() - 1);
        tk8Var.c(premiumPreviewFragment.e == i, false);
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        ek8 ek8Var = new ek8(this, this.c);
        ek8Var.setCirclePaintProvider(new cz6((Object) this, (Object) ek8Var, (byte) 24));
        return new b59(ek8Var);
    }
}
