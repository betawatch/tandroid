package hi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h2 implements m4, GenericProvider, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ m3 a;

    public /* synthetic */ h2(m3 m3Var) {
        this.a = m3Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        this.a.k(false);
    }

    @Override // hi.m4
    public void o(boolean z10) {
        m3 m3Var = this.a;
        if (m3Var.e0 && z10) {
            return;
        }
        m3Var.k(true);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Boolean.valueOf(this.a.f.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
    }
}
