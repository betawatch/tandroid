package ai;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
                ig.s0 s0Var = (ig.s0) this.b;
                ig.m0 m0Var = s0Var.H;
                boolean z10 = false;
                if (i10 == 6) {
                    s0Var.E = false;
                    AndroidUtilities.cancelRunOnUIThread(m0Var);
                    z10 = true;
                    if (TextUtils.isEmpty(s0Var.n.getText())) {
                        s0Var.F = null;
                        s0Var.f.b();
                        s0Var.e.Z2.N(true);
                    } else {
                        AndroidUtilities.runOnUIThread(m0Var);
                    }
                    s0Var.b0();
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
