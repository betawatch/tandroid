package lh;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        vh.d1 d1Var;
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
                uf.l0 l0Var = (uf.l0) this.b;
                uf.h0 h0Var = l0Var.C;
                boolean z4 = false;
                if (i10 == 6) {
                    l0Var.x = false;
                    AndroidUtilities.cancelRunOnUIThread(h0Var);
                    z4 = true;
                    if (TextUtils.isEmpty(l0Var.f.getText())) {
                        l0Var.y = null;
                        l0Var.d.b();
                        l0Var.c.V2.N(true);
                    } else {
                        AndroidUtilities.runOnUIThread(h0Var);
                    }
                    l0Var.b0();
                }
                return z4;
            default:
                vh.e1 e1Var = (vh.e1) this.b;
                if (i10 != 5 || (d1Var = e1Var.c) == null || e1Var.w) {
                    return false;
                }
                if (e1Var.r) {
                    e1Var.p();
                } else {
                    d1Var.g1(e1Var);
                }
                return true;
        }
    }
}
