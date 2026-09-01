package mh;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        wh.d1 d1Var;
        switch (this.a) {
            case 0:
                p pVar = (p) this.b;
                if (i10 == 5) {
                    pVar.k0();
                    return true;
                }
                pVar.getClass();
                return false;
            case 1:
                vf.l0 l0Var = (vf.l0) this.b;
                vf.h0 h0Var = l0Var.C;
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
                wh.e1 e1Var = (wh.e1) this.b;
                if (i10 != 5 || (d1Var = e1Var.c) == null || e1Var.w) {
                    return false;
                }
                if (e1Var.r) {
                    e1Var.p();
                } else {
                    d1Var.o(e1Var);
                }
                return true;
        }
    }
}
