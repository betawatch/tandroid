package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j4 implements org.telegram.ui.ActionBar.a2, p4, GenericProvider {
    public final /* synthetic */ r4 a;

    public /* synthetic */ j4(r4 r4Var) {
        this.a = r4Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.a.b.dismiss();
    }

    @Override // ei.p4
    public void o(boolean z10) {
        r4 r4Var = this.a;
        if (r4Var.I()) {
            return;
        }
        r4Var.J.e(0.0f);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Boolean.valueOf(this.a.b.r1.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
    }
}
