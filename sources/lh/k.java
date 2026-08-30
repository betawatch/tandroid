package lh;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        vh.c1 c1Var;
        switch (this.a) {
            case 0:
                q qVar = (q) this.b;
                if (i10 == 5) {
                    qVar.k0();
                    return true;
                }
                qVar.getClass();
                return false;
            case 1:
                uf.k0 k0Var = (uf.k0) this.b;
                uf.g0 g0Var = k0Var.C;
                boolean z4 = false;
                if (i10 == 6) {
                    k0Var.x = false;
                    AndroidUtilities.cancelRunOnUIThread(g0Var);
                    z4 = true;
                    if (TextUtils.isEmpty(k0Var.f.getText())) {
                        k0Var.y = null;
                        k0Var.d.b();
                        k0Var.c.V2.N(true);
                    } else {
                        AndroidUtilities.runOnUIThread(g0Var);
                    }
                    k0Var.b0();
                }
                return z4;
            default:
                vh.d1 d1Var = (vh.d1) this.b;
                if (i10 != 5 || (c1Var = d1Var.c) == null || d1Var.w) {
                    return false;
                }
                if (d1Var.r) {
                    d1Var.p();
                } else {
                    c1Var.G(d1Var);
                }
                return true;
        }
    }
}
