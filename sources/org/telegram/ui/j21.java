package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class j21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y21 b;

    public /* synthetic */ j21(y21 y21Var, int i10) {
        this.a = i10;
        this.b = y21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x21 x21Var = this.b.f;
                if (x21Var != null) {
                    x21Var.s.setClickable(true);
                    break;
                }
                break;
            case 1:
                y21 y21Var = this.b;
                y21Var.d0(0, y21Var.J, true);
                org.telegram.ui.Components.kj0 animatedDrawable = y21Var.F.getAnimatedDrawable();
                if (y21Var.I == null && animatedDrawable != null) {
                    y21Var.I = Bitmap.createBitmap(animatedDrawable.b, animatedDrawable.c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.C0 = 33;
                    animatedDrawable.a(y21Var.I);
                    animatedDrawable.c();
                    break;
                }
                break;
            case 2:
                int i10 = R.raw.default_pattern;
                y21 y21Var2 = this.b;
                AndroidUtilities.runOnUIThread(new wx0(17, y21Var2, SvgHelper.getBitmap(i10, y21Var2.w.getWidth(), y21Var2.w.getHeight(), -16777216)));
                break;
            case 3:
                y21 y21Var3 = this.b;
                o0.a aVar = y21Var3.a;
                aVar.b = y21Var3.J.b(((org.telegram.ui.ActionBar.n2) ((y21) aVar.c)).currentAccount, y21Var3.K ? 1 : 0);
                break;
            case 4:
                y21.W(this.b);
                break;
            default:
                y21.T(this.b);
                break;
        }
    }
}
