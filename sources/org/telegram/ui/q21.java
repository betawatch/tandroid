package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class q21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f31 b;

    public /* synthetic */ q21(f31 f31Var, int i10) {
        this.a = i10;
        this.b = f31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e31 e31Var = this.b.f;
                if (e31Var != null) {
                    e31Var.s.setClickable(true);
                    break;
                }
                break;
            case 1:
                f31 f31Var = this.b;
                f31Var.d0(0, f31Var.J, true);
                org.telegram.ui.Components.kj0 animatedDrawable = f31Var.F.getAnimatedDrawable();
                if (f31Var.I == null && animatedDrawable != null) {
                    f31Var.I = Bitmap.createBitmap(animatedDrawable.b, animatedDrawable.c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.C0 = 33;
                    animatedDrawable.a(f31Var.I);
                    animatedDrawable.c();
                    break;
                }
                break;
            case 2:
                int i10 = R.raw.default_pattern;
                f31 f31Var2 = this.b;
                AndroidUtilities.runOnUIThread(new rx0(20, f31Var2, SvgHelper.getBitmap(i10, f31Var2.w.getWidth(), f31Var2.w.getHeight(), -16777216)));
                break;
            case 3:
                f31 f31Var3 = this.b;
                m5.e eVar = f31Var3.a;
                eVar.b = f31Var3.J.b(((org.telegram.ui.ActionBar.n2) ((f31) eVar.c)).currentAccount, f31Var3.K ? 1 : 0);
                break;
            case 4:
                f31.X(this.b);
                break;
            default:
                f31.V(this.b);
                break;
        }
    }
}
