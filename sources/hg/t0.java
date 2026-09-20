package hg;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        ii.h1 h1Var;
        switch (this.a) {
            case 0:
                u0 u0Var = (u0) this.b;
                n0 n0Var = u0Var.F;
                boolean z10 = false;
                if (i10 == 6) {
                    u0Var.x = false;
                    AndroidUtilities.cancelRunOnUIThread(n0Var);
                    z10 = true;
                    if (TextUtils.isEmpty(u0Var.f.getText())) {
                        u0Var.y = null;
                        u0Var.d.b();
                        u0Var.c.Y2.N(true);
                    } else {
                        AndroidUtilities.runOnUIThread(n0Var);
                    }
                    u0Var.b0();
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
                    h1Var.n(i1Var);
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
