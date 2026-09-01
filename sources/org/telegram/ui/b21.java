package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o21 b;

    public /* synthetic */ b21(o21 o21Var, int i10) {
        this.a = i10;
        this.b = o21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n21 n21Var = this.b.f;
                if (n21Var != null) {
                    n21Var.s.setClickable(true);
                    break;
                }
                break;
            case 1:
                o21 o21Var = this.b;
                o21Var.d0(0, o21Var.G, true);
                org.telegram.ui.Components.ij0 animatedDrawable = o21Var.C.getAnimatedDrawable();
                if (o21Var.F == null && animatedDrawable != null) {
                    o21Var.F = Bitmap.createBitmap(animatedDrawable.b, animatedDrawable.c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.B0 = 33;
                    animatedDrawable.a(o21Var.F);
                    animatedDrawable.c();
                    break;
                }
                break;
            case 2:
                int i10 = R.raw.default_pattern;
                o21 o21Var2 = this.b;
                AndroidUtilities.runOnUIThread(new w01(1, o21Var2, SvgHelper.getBitmap(i10, o21Var2.w.getWidth(), o21Var2.w.getHeight(), -16777216)));
                break;
            case 3:
                o21 o21Var3 = this.b;
                n7.qa qaVar = o21Var3.a;
                qaVar.b = o21Var3.G.b(((org.telegram.ui.ActionBar.p2) ((o21) qaVar.c)).currentAccount, o21Var3.H ? 1 : 0);
                break;
            case 4:
                o21.X(this.b);
                break;
            default:
                o21.V(this.b);
                break;
        }
    }
}
