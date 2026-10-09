package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e31 b;

    public /* synthetic */ p21(e31 e31Var, int i10) {
        this.a = i10;
        this.b = e31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d31 d31Var = this.b.f;
                if (d31Var != null) {
                    d31Var.s.setClickable(true);
                    break;
                }
                break;
            case 1:
                e31 e31Var = this.b;
                e31Var.c0(0, e31Var.J, true);
                org.telegram.ui.Components.ck0 animatedDrawable = e31Var.F.getAnimatedDrawable();
                if (e31Var.I == null && animatedDrawable != null) {
                    e31Var.I = Bitmap.createBitmap(animatedDrawable.b, animatedDrawable.c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.C0 = 33;
                    animatedDrawable.a(e31Var.I);
                    animatedDrawable.c();
                    break;
                }
                break;
            case 2:
                int i10 = R.raw.default_pattern;
                e31 e31Var2 = this.b;
                AndroidUtilities.runOnUIThread(new rt0(28, e31Var2, SvgHelper.getBitmap(i10, e31Var2.w.getWidth(), e31Var2.w.getHeight(), -16777216)));
                break;
            case 3:
                e31 e31Var3 = this.b;
                org.telegram.ui.ActionBar.b5 b5Var = e31Var3.a;
                b5Var.b = e31Var3.J.b(((org.telegram.ui.ActionBar.n2) ((e31) b5Var.c)).currentAccount, e31Var3.K ? 1 : 0);
                break;
            case 4:
                e31.W(this.b);
                break;
            default:
                e31.U(this.b);
                break;
        }
    }
}
