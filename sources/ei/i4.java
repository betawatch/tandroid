package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
