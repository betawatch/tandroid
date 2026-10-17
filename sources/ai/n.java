package ai;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        ki.g1 g1Var;
        switch (this.a) {
            case 0:
                x xVar = (x) this.b;
                if (i10 == 5) {
                    xVar.k0();
                    return true;
                }
                xVar.getClass();
                return false;
            case 1:
                ig.r0 r0Var = (ig.r0) this.b;
                ig.n0 n0Var = r0Var.F;
                boolean z10 = false;
                if (i10 == 6) {
                    r0Var.x = false;
                    AndroidUtilities.cancelRunOnUIThread(n0Var);
                    z10 = true;
                    if (TextUtils.isEmpty(r0Var.f.getText())) {
                        r0Var.y = null;
                        r0Var.d.b();
                        r0Var.c.W2.N(true);
                    } else {
                        AndroidUtilities.runOnUIThread(n0Var);
                    }
                    r0Var.b0();
                }
                return z10;
            default:
                ki.h1 h1Var = (ki.h1) this.b;
                if (i10 != 5 || (g1Var = h1Var.c) == null || h1Var.w) {
                    return false;
                }
                if (h1Var.r) {
                    h1Var.p();
                } else {
                    g1Var.l(h1Var);
                }
                return true;
        }
    }
}
