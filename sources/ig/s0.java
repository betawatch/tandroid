package ig;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class s0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        ji.g1 g1Var;
        switch (this.a) {
            case 0:
                u0 u0Var = (u0) this.b;
                m0 m0Var = u0Var.F;
                boolean z10 = false;
                if (i10 == 6) {
                    u0Var.x = false;
                    AndroidUtilities.cancelRunOnUIThread(m0Var);
                    z10 = true;
                    if (TextUtils.isEmpty(u0Var.f.getText())) {
                        u0Var.y = null;
                        u0Var.d.b();
                        u0Var.c.W2.N(true);
                    } else {
                        AndroidUtilities.runOnUIThread(m0Var);
                    }
                    u0Var.b0();
                }
                return z10;
            case 1:
                ji.h1 h1Var = (ji.h1) this.b;
                if (i10 != 5 || (g1Var = h1Var.c) == null || h1Var.w) {
                    return false;
                }
                if (h1Var.r) {
                    h1Var.p();
                } else {
                    g1Var.p0(h1Var);
                }
                return true;
            default:
                zh.g gVar = (zh.g) this.b;
                if (i10 == 5) {
                    gVar.k0();
                    return true;
                }
                gVar.getClass();
                return false;
        }
    }
}
