package ai;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
                ig.t0 t0Var = (ig.t0) this.b;
                ig.n0 n0Var = t0Var.F;
                boolean z10 = false;
                if (i10 == 6) {
                    t0Var.x = false;
                    AndroidUtilities.cancelRunOnUIThread(n0Var);
                    z10 = true;
                    if (TextUtils.isEmpty(t0Var.f.getText())) {
                        t0Var.y = null;
                        t0Var.d.b();
                        t0Var.c.W2.N(true);
                    } else {
                        AndroidUtilities.runOnUIThread(n0Var);
                    }
                    t0Var.b0();
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
                    g1Var.k(h1Var);
                }
                return true;
        }
    }
}
