package gg;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        hi.j1 j1Var;
        switch (this.a) {
            case 0:
                y0 y0Var = (y0) this.b;
                r0 r0Var = y0Var.F;
                boolean z10 = false;
                if (i10 == 6) {
                    y0Var.x = false;
                    AndroidUtilities.cancelRunOnUIThread(r0Var);
                    z10 = true;
                    if (TextUtils.isEmpty(y0Var.f.getText())) {
                        y0Var.y = null;
                        y0Var.d.b();
                        y0Var.c.Y2.N(true);
                    } else {
                        AndroidUtilities.runOnUIThread(r0Var);
                    }
                    y0Var.b0();
                }
                return z10;
            case 1:
                hi.k1 k1Var = (hi.k1) this.b;
                if (i10 != 5 || (j1Var = k1Var.c) == null || k1Var.w) {
                    return false;
                }
                if (k1Var.r) {
                    k1Var.p();
                } else {
                    j1Var.x(k1Var);
                }
                return true;
            default:
                xh.h hVar = (xh.h) this.b;
                if (i10 == 5) {
                    hVar.k0();
                    return true;
                }
                hVar.getClass();
                return false;
        }
    }
}
