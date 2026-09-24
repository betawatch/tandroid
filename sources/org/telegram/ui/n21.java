package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q21 b;

    public /* synthetic */ n21(q21 q21Var, int i10) {
        this.a = i10;
        this.b = q21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q21 q21Var = this.b;
                AndroidUtilities.cancelRunOnUIThread(q21Var.N);
                boolean z10 = q21Var.r;
                if (z10) {
                    if (z10 && q21Var.F == null) {
                        org.telegram.ui.Components.ij0 ij0Var = new org.telegram.ui.Components.ij0(R.raw.qr_matrix, AndroidUtilities.dp(200.0f), AndroidUtilities.dp(200.0f));
                        q21Var.F = ij0Var;
                        ij0Var.R(q21Var);
                        q21Var.F.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        q21Var.F.K(1);
                        q21Var.F.start();
                    }
                    if (q21Var.J == 0 || System.currentTimeMillis() / 1000 >= q21Var.J) {
                        if (q21Var.J != 0) {
                            q21Var.I = null;
                            Utilities.themeQueue.postRunnable(new o21(q21Var, q21Var.getWidth(), q21Var.getHeight(), 2));
                            q21Var.s.q("", true, true);
                        }
                        MessagesController.getInstance(UserConfig.selectedAccount).requestContactToken(q21Var.J == 0 ? 750L : 1750L, new t3(q21Var, 22));
                    }
                    int i10 = q21Var.J;
                    if (i10 > 0 && q21Var.I != null) {
                        long max = Math.max(0L, (i10 - (System.currentTimeMillis() / 1000)) - 1);
                        int i11 = (int) (max % 60);
                        int min = Math.min(99, (int) (max / 60));
                        org.telegram.ui.Components.wo0 wo0Var = q21Var.s;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(min < 10 ? "0" : "");
                        sb2.append(min);
                        sb2.append(":");
                        sb2.append(i11 < 10 ? "0" : "");
                        sb2.append(i11);
                        wo0Var.q(sb2.toString(), true, false);
                    }
                    if (q21Var.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(q21Var.N, 1000L);
                        break;
                    }
                }
                break;
            default:
                q21 q21Var2 = this.b;
                q21Var2.S = false;
                Bitmap bitmap = q21Var2.h;
                if (bitmap != null) {
                    q21Var2.h = null;
                    q21Var2.x.d(0.0f, true);
                    Bitmap bitmap2 = q21Var2.n;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    q21Var2.n = bitmap;
                    q21Var2.invalidate();
                    break;
                }
                break;
        }
    }
}
