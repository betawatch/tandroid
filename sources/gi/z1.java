package gi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z1 implements d4, GenericProvider, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ d3 a;

    public /* synthetic */ z1(d3 d3Var) {
        this.a = d3Var;
    }

    @Override // gi.d4
    public void f(boolean z10) {
        d3 d3Var = this.a;
        if (d3Var.d0 && z10) {
            return;
        }
        d3Var.k(true);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.a.k(false);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Boolean.valueOf(this.a.e.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
    }
}
