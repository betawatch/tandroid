package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class d31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g31 b;

    public /* synthetic */ d31(g31 g31Var, int i10) {
        this.a = i10;
        this.b = g31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g31 g31Var = this.b;
                AndroidUtilities.cancelRunOnUIThread(g31Var.N);
                boolean z10 = g31Var.r;
                if (z10) {
                    if (z10 && g31Var.F == null) {
                        org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(R.raw.qr_matrix, AndroidUtilities.dp(200.0f), AndroidUtilities.dp(200.0f));
                        g31Var.F = yj0Var;
                        yj0Var.R(g31Var);
                        g31Var.F.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        g31Var.F.K(1);
                        g31Var.F.start();
                    }
                    if (g31Var.J == 0 || System.currentTimeMillis() / 1000 >= g31Var.J) {
                        if (g31Var.J != 0) {
                            g31Var.I = null;
                            Utilities.themeQueue.postRunnable(new e31(g31Var, g31Var.getWidth(), g31Var.getHeight(), 2));
                            g31Var.s.t("", true, true);
                        }
                        MessagesController.getInstance(UserConfig.selectedAccount).requestContactToken(g31Var.J == 0 ? 750L : 1750L, new v3(g31Var, 22));
                    }
                    int i10 = g31Var.J;
                    if (i10 > 0 && g31Var.I != null) {
                        long max = Math.max(0L, (i10 - (System.currentTimeMillis() / 1000)) - 1);
                        int i11 = (int) (max % 60);
                        int min = Math.min(99, (int) (max / 60));
                        org.telegram.ui.Components.kp0 kp0Var = g31Var.s;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(min < 10 ? "0" : "");
                        sb2.append(min);
                        sb2.append(":");
                        sb2.append(i11 < 10 ? "0" : "");
                        sb2.append(i11);
                        kp0Var.t(sb2.toString(), true, false);
                    }
                    if (g31Var.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(g31Var.N, 1000L);
                        break;
                    }
                }
                break;
            default:
                g31 g31Var2 = this.b;
                g31Var2.S = false;
                Bitmap bitmap = g31Var2.h;
                if (bitmap != null) {
                    g31Var2.h = null;
                    g31Var2.x.d(0.0f, true);
                    Bitmap bitmap2 = g31Var2.n;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    g31Var2.n = bitmap;
                    g31Var2.invalidate();
                    break;
                }
                break;
        }
    }
}
