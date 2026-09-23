package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class j21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x21 b;

    public /* synthetic */ j21(x21 x21Var, int i10) {
        this.a = i10;
        this.b = x21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w21 w21Var = this.b.f;
                if (w21Var != null) {
                    w21Var.s.setClickable(true);
                    break;
                }
                break;
            case 1:
                x21 x21Var = this.b;
                x21Var.d0(0, x21Var.J, true);
                org.telegram.ui.Components.yi0 animatedDrawable = x21Var.F.getAnimatedDrawable();
                if (x21Var.I == null && animatedDrawable != null) {
                    x21Var.I = Bitmap.createBitmap(animatedDrawable.b, animatedDrawable.c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.C0 = 33;
                    animatedDrawable.a(x21Var.I);
                    animatedDrawable.c();
                    break;
                }
                break;
            case 2:
                int i10 = R.raw.default_pattern;
                x21 x21Var2 = this.b;
                AndroidUtilities.runOnUIThread(new by0(14, x21Var2, SvgHelper.getBitmap(i10, x21Var2.w.getWidth(), x21Var2.w.getHeight(), -16777216)));
                break;
            case 3:
                x21 x21Var3 = this.b;
                o0.a aVar = x21Var3.a;
                aVar.b = x21Var3.J.b(((org.telegram.ui.ActionBar.n2) ((x21) aVar.c)).currentAccount, x21Var3.K ? 1 : 0);
                break;
            case 4:
                x21.X(this.b);
                break;
            default:
                x21.V(this.b);
                break;
        }
    }
}
