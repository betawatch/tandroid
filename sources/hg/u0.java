package hg;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        ii.h1 h1Var;
        switch (this.a) {
            case 0:
                v0 v0Var = (v0) this.b;
                o0 o0Var = v0Var.F;
                boolean z10 = false;
                if (i10 == 6) {
                    v0Var.x = false;
                    AndroidUtilities.cancelRunOnUIThread(o0Var);
                    z10 = true;
                    if (TextUtils.isEmpty(v0Var.f.getText())) {
                        v0Var.y = null;
                        v0Var.d.b();
                        v0Var.c.Y2.N(true);
                    } else {
                        AndroidUtilities.runOnUIThread(o0Var);
                    }
                    v0Var.b0();
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
                    h1Var.m(i1Var);
                }
                return true;
            default:
                yh.g gVar = (yh.g) this.b;
                if (i10 == 5) {
                    gVar.k0();
                    return true;
                }
                gVar.getClass();
                return false;
        }
    }
}
