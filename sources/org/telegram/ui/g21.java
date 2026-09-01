package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j21 b;

    public /* synthetic */ g21(j21 j21Var, int i10) {
        this.a = i10;
        this.b = j21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j21 j21Var = this.b;
                AndroidUtilities.cancelRunOnUIThread(j21Var.K);
                boolean z4 = j21Var.r;
                if (z4) {
                    if (z4 && j21Var.C == null) {
                        org.telegram.ui.Components.ij0 ij0Var = new org.telegram.ui.Components.ij0(R.raw.qr_matrix, AndroidUtilities.dp(200.0f), "qr_matrix", AndroidUtilities.dp(200.0f));
                        j21Var.C = ij0Var;
                        ij0Var.s0 = j21Var;
                        ij0Var.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        j21Var.C.I(1);
                        j21Var.C.start();
                    }
                    if (j21Var.G == 0 || System.currentTimeMillis() / 1000 >= j21Var.G) {
                        if (j21Var.G != 0) {
                            j21Var.F = null;
                            Utilities.themeQueue.postRunnable(new h21(j21Var, j21Var.getWidth(), j21Var.getHeight(), 2));
                            j21Var.s.q("", true, true);
                        }
                        MessagesController.getInstance(UserConfig.selectedAccount).requestContactToken(j21Var.G == 0 ? 750L : 1750L, new w3(j21Var, 18));
                    }
                    int i10 = j21Var.G;
                    if (i10 > 0 && j21Var.F != null) {
                        long max = Math.max(0L, (i10 - (System.currentTimeMillis() / 1000)) - 1);
                        int i11 = (int) (max % 60);
                        int min = Math.min(99, (int) (max / 60));
                        org.telegram.ui.Components.oo0 oo0Var = j21Var.s;
                        StringBuilder sb = new StringBuilder();
                        sb.append(min < 10 ? "0" : "");
                        sb.append(min);
                        sb.append(":");
                        sb.append(i11 < 10 ? "0" : "");
                        sb.append(i11);
                        oo0Var.q(sb.toString(), true, false);
                    }
                    if (j21Var.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(j21Var.K, 1000L);
                        break;
                    }
                }
                break;
            default:
                j21 j21Var2 = this.b;
                j21Var2.P = false;
                Bitmap bitmap = j21Var2.h;
                if (bitmap != null) {
                    j21Var2.h = null;
                    j21Var2.x.d(0.0f, true);
                    Bitmap bitmap2 = j21Var2.n;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    j21Var2.n = bitmap;
                    j21Var2.invalidate();
                    break;
                }
                break;
        }
    }
}
