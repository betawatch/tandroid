package jh;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        th.c1 c1Var;
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
                sf.l0 l0Var = (sf.l0) this.b;
                sf.h0 h0Var = l0Var.B;
                boolean z10 = false;
                if (i10 == 6) {
                    l0Var.x = false;
                    AndroidUtilities.cancelRunOnUIThread(h0Var);
                    z10 = true;
                    if (TextUtils.isEmpty(l0Var.f.getText())) {
                        l0Var.y = null;
                        l0Var.d.b();
                        l0Var.c.U2.N(true);
                    } else {
                        AndroidUtilities.runOnUIThread(h0Var);
                    }
                    l0Var.b0();
                }
                return z10;
            default:
                th.d1 d1Var = (th.d1) this.b;
                if (i10 != 5 || (c1Var = d1Var.c) == null || d1Var.w) {
                    return false;
                }
                if (d1Var.r) {
                    d1Var.p();
                } else {
                    c1Var.S0(d1Var);
                }
                return true;
        }
    }
}
