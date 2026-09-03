package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u21 b;

    public /* synthetic */ f21(u21 u21Var, int i10) {
        this.a = i10;
        this.b = u21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t21 t21Var = this.b.f;
                if (t21Var != null) {
                    t21Var.s.setClickable(true);
                    break;
                }
                break;
            case 1:
                u21 u21Var = this.b;
                u21Var.d0(0, u21Var.G, true);
                org.telegram.ui.Components.hj0 animatedDrawable = u21Var.C.getAnimatedDrawable();
                if (u21Var.F == null && animatedDrawable != null) {
                    u21Var.F = Bitmap.createBitmap(animatedDrawable.b, animatedDrawable.c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.B0 = 33;
                    animatedDrawable.a(u21Var.F);
                    animatedDrawable.c();
                    break;
                }
                break;
            case 2:
                int i10 = R.raw.default_pattern;
                u21 u21Var2 = this.b;
                AndroidUtilities.runOnUIThread(new h21(0, u21Var2, SvgHelper.getBitmap(i10, u21Var2.w.getWidth(), u21Var2.w.getHeight(), -16777216)));
                break;
            case 3:
                u21 u21Var3 = this.b;
                n7.qa qaVar = u21Var3.a;
                qaVar.b = u21Var3.G.b(((org.telegram.ui.ActionBar.p2) ((u21) qaVar.c)).currentAccount, u21Var3.H ? 1 : 0);
                break;
            case 4:
                u21.X(this.b);
                break;
            default:
                u21.V(this.b);
                break;
        }
    }
}
