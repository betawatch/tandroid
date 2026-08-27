package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t11 b;

    public /* synthetic */ q11(t11 t11Var, int i10) {
        this.a = i10;
        this.b = t11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t11 t11Var = this.b;
                AndroidUtilities.cancelRunOnUIThread(t11Var.J);
                boolean z10 = t11Var.r;
                if (z10) {
                    if (z10 && t11Var.B == null) {
                        org.telegram.ui.Components.oi0 oi0Var = new org.telegram.ui.Components.oi0(R.raw.qr_matrix, AndroidUtilities.dp(200.0f), "qr_matrix", AndroidUtilities.dp(200.0f));
                        t11Var.B = oi0Var;
                        oi0Var.r0 = t11Var;
                        oi0Var.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        t11Var.B.I(1);
                        t11Var.B.start();
                    }
                    if (t11Var.F == 0 || System.currentTimeMillis() / 1000 >= t11Var.F) {
                        if (t11Var.F != 0) {
                            t11Var.E = null;
                            Utilities.themeQueue.postRunnable(new r11(t11Var, t11Var.getWidth(), t11Var.getHeight(), 2));
                            t11Var.s.q("", true, true);
                        }
                        MessagesController.getInstance(UserConfig.selectedAccount).requestContactToken(t11Var.F == 0 ? 750L : 1750L, new x3(t11Var, 18));
                    }
                    int i10 = t11Var.F;
                    if (i10 > 0 && t11Var.E != null) {
                        long max = Math.max(0L, (i10 - (System.currentTimeMillis() / 1000)) - 1);
                        int i11 = (int) (max % 60);
                        int min = Math.min(99, (int) (max / 60));
                        org.telegram.ui.Components.tn0 tn0Var = t11Var.s;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(min < 10 ? "0" : "");
                        sb2.append(min);
                        sb2.append(":");
                        sb2.append(i11 < 10 ? "0" : "");
                        sb2.append(i11);
                        tn0Var.q(sb2.toString(), true, false);
                    }
                    if (t11Var.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(t11Var.J, 1000L);
                        break;
                    }
                }
                break;
            default:
                t11 t11Var2 = this.b;
                t11Var2.O = false;
                Bitmap bitmap = t11Var2.h;
                if (bitmap != null) {
                    t11Var2.h = null;
                    t11Var2.x.d(0.0f, true);
                    Bitmap bitmap2 = t11Var2.n;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    t11Var2.n = bitmap;
                    t11Var2.invalidate();
                    break;
                }
                break;
        }
    }
}
