package gh;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
        qh.c1 c1Var;
        switch (this.a) {
            case 0:
                r rVar = (r) this.b;
                if (i9 == 5) {
                    rVar.j0();
                    return true;
                }
                rVar.getClass();
                return false;
            case 1:
                pf.m0 m0Var = (pf.m0) this.b;
                pf.i0 i0Var = m0Var.B;
                boolean z10 = false;
                if (i9 == 6) {
                    m0Var.x = false;
                    AndroidUtilities.cancelRunOnUIThread(i0Var);
                    z10 = true;
                    if (TextUtils.isEmpty(m0Var.f.getText())) {
                        m0Var.y = null;
                        m0Var.d.b();
                        m0Var.c.U2.N(true);
                    } else {
                        AndroidUtilities.runOnUIThread(i0Var);
                    }
                    m0Var.a0();
                }
                return z10;
            default:
                qh.d1 d1Var = (qh.d1) this.b;
                if (i9 != 5 || (c1Var = d1Var.c) == null || d1Var.w) {
                    return false;
                }
                if (d1Var.r) {
                    d1Var.p();
                } else {
                    c1Var.L0(d1Var);
                }
                return true;
        }
    }
}
