package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z11 b;

    public /* synthetic */ m11(z11 z11Var, int i9) {
        this.a = i9;
        this.b = z11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y11 y11Var = this.b.f;
                if (y11Var != null) {
                    y11Var.s.setClickable(true);
                    break;
                }
                break;
            case 1:
                z11 z11Var = this.b;
                z11Var.c0(0, z11Var.F, true);
                org.telegram.ui.Components.mi0 animatedDrawable = z11Var.B.getAnimatedDrawable();
                if (z11Var.E == null && animatedDrawable != null) {
                    z11Var.E = Bitmap.createBitmap(animatedDrawable.b, animatedDrawable.c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.A0 = 33;
                    animatedDrawable.a(z11Var.E);
                    animatedDrawable.c();
                    break;
                }
                break;
            case 2:
                int i9 = R.raw.default_pattern;
                z11 z11Var2 = this.b;
                AndroidUtilities.runOnUIThread(new ys0(26, z11Var2, SvgHelper.getBitmap(i9, z11Var2.w.getWidth(), z11Var2.w.getHeight(), -16777216)));
                break;
            case 3:
                z11 z11Var3 = this.b;
                org.telegram.ui.Cells.e3 e3Var = z11Var3.a;
                e3Var.b = z11Var3.F.b(((org.telegram.ui.ActionBar.o2) ((z11) e3Var.c)).currentAccount, z11Var3.G ? 1 : 0);
                break;
            case 4:
                z11.W(this.b);
                break;
            default:
                z11.U(this.b);
                break;
        }
    }
}
