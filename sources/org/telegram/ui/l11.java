package org.telegram.ui;

import android.graphics.Bitmap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y11 b;

    public /* synthetic */ l11(y11 y11Var, int i10) {
        this.a = i10;
        this.b = y11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x11 x11Var = this.b.f;
                if (x11Var != null) {
                    x11Var.s.setClickable(true);
                    break;
                }
                break;
            case 1:
                y11 y11Var = this.b;
                y11Var.d0(0, y11Var.F, true);
                org.telegram.ui.Components.oi0 animatedDrawable = y11Var.B.getAnimatedDrawable();
                if (y11Var.E == null && animatedDrawable != null) {
                    y11Var.E = Bitmap.createBitmap(animatedDrawable.b, animatedDrawable.c, Bitmap.Config.ARGB_8888);
                    animatedDrawable.b();
                    animatedDrawable.A0 = 33;
                    animatedDrawable.a(y11Var.E);
                    animatedDrawable.c();
                    break;
                }
                break;
            case 2:
                int i10 = R.raw.default_pattern;
                y11 y11Var2 = this.b;
                AndroidUtilities.runOnUIThread(new zs0(26, y11Var2, SvgHelper.getBitmap(i10, y11Var2.w.getWidth(), y11Var2.w.getHeight(), -16777216)));
                break;
            case 3:
                y11 y11Var3 = this.b;
                i6 i6Var = y11Var3.a;
                i6Var.b = y11Var3.F.b(((org.telegram.ui.ActionBar.n2) ((y11) i6Var.c)).currentAccount, y11Var3.G ? 1 : 0);
                break;
            case 4:
                y11.X(this.b);
                break;
            default:
                y11.V(this.b);
                break;
        }
    }
}
