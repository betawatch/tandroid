package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
