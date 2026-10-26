package bi;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        li.f1 f1Var;
        switch (this.a) {
            case 0:
                y yVar = (y) this.b;
                if (i10 == 5) {
                    yVar.u0();
                    return true;
                }
                yVar.getClass();
                return false;
            case 1:
                jg.t0 t0Var = (jg.t0) this.b;
                jg.m0 m0Var = t0Var.F;
                boolean z10 = false;
                if (i10 == 6) {
                    t0Var.x = false;
                    AndroidUtilities.cancelRunOnUIThread(m0Var);
                    z10 = true;
                    if (TextUtils.isEmpty(t0Var.f.getText())) {
                        t0Var.y = null;
                        t0Var.d.b();
                        t0Var.c.g3.O(true);
                    } else {
                        AndroidUtilities.runOnUIThread(m0Var);
                    }
                    t0Var.c0();
                }
                return z10;
            default:
                li.g1 g1Var = (li.g1) this.b;
                if (i10 != 5 || (f1Var = g1Var.c) == null || g1Var.w) {
                    return false;
                }
                if (g1Var.r) {
                    g1Var.p();
                } else {
                    f1Var.t(g1Var);
                }
                return true;
        }
    }
}
