package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class i4 implements org.telegram.ui.ActionBar.a2, o4, GenericProvider {
    public final /* synthetic */ q4 a;

    public /* synthetic */ i4(q4 q4Var) {
        this.a = q4Var;
    }

    @Override // ei.o4
    public void i(boolean z10) {
        q4 q4Var = this.a;
        if (q4Var.K()) {
            return;
        }
        q4Var.J.e(0.0f);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.a.b.dismiss();
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Boolean.valueOf(this.a.b.r1.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
    }
}
