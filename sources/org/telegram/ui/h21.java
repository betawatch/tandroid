package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w21 b;

    public /* synthetic */ h21(w21 w21Var, int i10) {
        this.a = i10;
        this.b = w21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v21 v21Var = this.b.f;
                if (v21Var != null) {
                    v21Var.s.setClickable(true);
                    break;
                }
                break;
            case 1:
                w21 w21Var = this.b;
                w21Var.d0(0, w21Var.J, true);
                org.telegram.ui.Components.ij0 animatedDrawable = w21Var.F.getAnimatedDrawable();
                if (w21Var.I == null && animatedDrawable != null) {
                    w21Var.I = Bitmap.createBitmap(animatedDrawable.b, animatedDrawable.c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.C0 = 33;
                    animatedDrawable.a(w21Var.I);
                    animatedDrawable.c();
                    break;
                }
                break;
            case 2:
                int i10 = R.raw.default_pattern;
                w21 w21Var2 = this.b;
                AndroidUtilities.runOnUIThread(new jx0(19, w21Var2, SvgHelper.getBitmap(i10, w21Var2.w.getWidth(), w21Var2.w.getHeight(), -16777216)));
                break;
            case 3:
                w21 w21Var3 = this.b;
                o0.a aVar = w21Var3.a;
                aVar.b = w21Var3.J.b(((org.telegram.ui.ActionBar.m2) ((w21) aVar.c)).currentAccount, w21Var3.K ? 1 : 0);
                break;
            case 4:
                w21.X(this.b);
                break;
            default:
                w21.V(this.b);
                break;
        }
    }
}
