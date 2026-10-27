package hi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h4 implements org.telegram.ui.ActionBar.b2, m4, GenericProvider {
    public final /* synthetic */ o4 a;

    public /* synthetic */ h4(o4 o4Var) {
        this.a = o4Var;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        this.a.b.dismiss();
    }

    @Override // hi.m4
    public void o(boolean z10) {
        o4 o4Var = this.a;
        if (o4Var.N()) {
            return;
        }
        o4Var.J.e(0.0f);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Boolean.valueOf(this.a.b.u1.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
    }
}
