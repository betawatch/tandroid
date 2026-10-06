package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final /* synthetic */ class g2 implements p4, GenericProvider, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ l3 a;

    public /* synthetic */ g2(l3 l3Var) {
        this.a = l3Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.a.k(false);
    }

    @Override // ei.p4
    public void o(boolean z10) {
        l3 l3Var = this.a;
        if (l3Var.d0 && z10) {
            return;
        }
        l3Var.k(true);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Boolean.valueOf(this.a.e.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
    }
}
