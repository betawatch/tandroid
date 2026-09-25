package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i4 implements org.telegram.ui.ActionBar.z1, o4, GenericProvider {
    public final /* synthetic */ q4 a;

    public /* synthetic */ i4(q4 q4Var) {
        this.a = q4Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        this.a.b.dismiss();
    }

    @Override // ei.o4
    public void j(boolean z10) {
        q4 q4Var = this.a;
        if (q4Var.K()) {
            return;
        }
        q4Var.J.e(0.0f);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Boolean.valueOf(this.a.b.r1.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
    }
}
