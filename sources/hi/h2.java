package hi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
