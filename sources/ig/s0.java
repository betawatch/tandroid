package ig;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
                        u0Var.c.Y2.N(true);
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
                    g1Var.C(h1Var);
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
