package hh;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        rh.c1 c1Var;
        switch (this.a) {
            case 0:
                r rVar = (r) this.b;
                if (i10 == 5) {
                    rVar.k0();
                    return true;
                }
                rVar.getClass();
                return false;
            case 1:
                qf.m0 m0Var = (qf.m0) this.b;
                qf.i0 i0Var = m0Var.B;
                boolean z10 = false;
                if (i10 == 6) {
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
                    m0Var.b0();
                }
                return z10;
            default:
                rh.d1 d1Var = (rh.d1) this.b;
                if (i10 != 5 || (c1Var = d1Var.c) == null || d1Var.w) {
                    return false;
                }
                if (d1Var.r) {
                    d1Var.p();
                } else {
                    c1Var.w1(d1Var);
                }
                return true;
        }
    }
}
