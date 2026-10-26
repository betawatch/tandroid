package hi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
