package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a21 b;

    public /* synthetic */ n11(a21 a21Var, int i10) {
        this.a = i10;
        this.b = a21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z11 z11Var = this.b.f;
                if (z11Var != null) {
                    z11Var.s.setClickable(true);
                    break;
                }
                break;
            case 1:
                a21 a21Var = this.b;
                a21Var.d0(0, a21Var.F, true);
                org.telegram.ui.Components.xi0 animatedDrawable = a21Var.B.getAnimatedDrawable();
                if (a21Var.E == null && animatedDrawable != null) {
                    a21Var.E = Bitmap.createBitmap(animatedDrawable.b, animatedDrawable.c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.A0 = 33;
                    animatedDrawable.a(a21Var.E);
                    animatedDrawable.c();
                    break;
                }
                break;
            case 2:
                int i10 = R.raw.default_pattern;
                a21 a21Var2 = this.b;
                AndroidUtilities.runOnUIThread(new av0(23, a21Var2, SvgHelper.getBitmap(i10, a21Var2.w.getWidth(), a21Var2.w.getHeight(), -16777216)));
                break;
            case 3:
                a21 a21Var3 = this.b;
                oc.i iVar = a21Var3.a;
                iVar.b = a21Var3.F.b(((org.telegram.ui.ActionBar.o2) ((a21) iVar.c)).currentAccount, a21Var3.G ? 1 : 0);
                break;
            case 4:
                a21.X(this.b);
                break;
            default:
                a21.V(this.b);
                break;
        }
    }
}
