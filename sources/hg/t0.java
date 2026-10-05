package hg;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        ii.h1 h1Var;
        switch (this.a) {
            case 0:
                u0 u0Var = (u0) this.b;
                n0 n0Var = u0Var.F;
                boolean z10 = false;
                if (i10 == 6) {
                    u0Var.x = false;
                    AndroidUtilities.cancelRunOnUIThread(n0Var);
                    z10 = true;
                    if (TextUtils.isEmpty(u0Var.f.getText())) {
                        u0Var.y = null;
                        u0Var.d.b();
                        u0Var.c.f3.N(true);
                    } else {
                        AndroidUtilities.runOnUIThread(n0Var);
                    }
                    u0Var.b0();
                }
                return z10;
            case 1:
                ii.i1 i1Var = (ii.i1) this.b;
                if (i10 != 5 || (h1Var = i1Var.c) == null || i1Var.w) {
                    return false;
                }
                if (i1Var.r) {
                    i1Var.p();
                } else {
                    h1Var.l(i1Var);
                }
                return true;
            default:
                yh.h hVar = (yh.h) this.b;
                if (i10 == 5) {
                    hVar.t0();
                    return true;
                }
                hVar.getClass();
                return false;
        }
    }
}
