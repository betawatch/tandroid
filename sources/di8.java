// default package

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class di8 extends n39 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ ei8 d;

    public di8(ei8 ei8Var, Context context) {
        this.d = ei8Var;
        this.c = context;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return !((gi8) this.d.n.d.get(s49Var.b())).a.current;
    }

    @Override // w39
    public final int b() {
        return this.d.n.d.size();
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        ri8 ri8Var = (ri8) s49Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.d.n;
        ri8Var.a((gi8) premiumPreviewFragment.d.get(i), i != b() - 1);
        ri8Var.c(premiumPreviewFragment.e == i, false);
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        ci8 ci8Var = new ci8(this, this.c);
        ci8Var.setCirclePaintProvider(new dx6((Object) this, (Object) ci8Var, (byte) 23));
        return new y29(ci8Var);
    }
}
