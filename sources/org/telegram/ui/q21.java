package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e31 b;

    public /* synthetic */ q21(e31 e31Var, int i10) {
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
                e31Var.d0(0, e31Var.J, true);
                org.telegram.ui.Components.ij0 animatedDrawable = e31Var.F.getAnimatedDrawable();
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
                AndroidUtilities.runOnUIThread(new cy0(18, e31Var2, SvgHelper.getBitmap(i10, e31Var2.w.getWidth(), e31Var2.w.getHeight(), -16777216)));
                break;
            case 3:
                e31 e31Var3 = this.b;
                o0.a aVar = e31Var3.a;
                aVar.b = e31Var3.J.b(((org.telegram.ui.ActionBar.n2) ((e31) aVar.c)).currentAccount, e31Var3.K ? 1 : 0);
                break;
            case 4:
                e31.X(this.b);
                break;
            default:
                e31.V(this.b);
                break;
        }
    }
}
