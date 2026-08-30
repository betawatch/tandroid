package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h21 b;

    public /* synthetic */ e21(h21 h21Var, int i10) {
        this.a = i10;
        this.b = h21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h21 h21Var = this.b;
                AndroidUtilities.cancelRunOnUIThread(h21Var.K);
                boolean z4 = h21Var.r;
                if (z4) {
                    if (z4 && h21Var.C == null) {
                        org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(R.raw.qr_matrix, AndroidUtilities.dp(200.0f), "qr_matrix", AndroidUtilities.dp(200.0f));
                        h21Var.C = gj0Var;
                        gj0Var.s0 = h21Var;
                        gj0Var.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        h21Var.C.I(1);
                        h21Var.C.start();
                    }
                    if (h21Var.G == 0 || System.currentTimeMillis() / 1000 >= h21Var.G) {
                        if (h21Var.G != 0) {
                            h21Var.F = null;
                            Utilities.themeQueue.postRunnable(new f21(h21Var, h21Var.getWidth(), h21Var.getHeight(), 2));
                            h21Var.s.q("", true, true);
                        }
                        MessagesController.getInstance(UserConfig.selectedAccount).requestContactToken(h21Var.G == 0 ? 750L : 1750L, new w3(h21Var, 18));
                    }
                    int i10 = h21Var.G;
                    if (i10 > 0 && h21Var.F != null) {
                        long max = Math.max(0L, (i10 - (System.currentTimeMillis() / 1000)) - 1);
                        int i11 = (int) (max % 60);
                        int min = Math.min(99, (int) (max / 60));
                        org.telegram.ui.Components.no0 no0Var = h21Var.s;
                        StringBuilder sb = new StringBuilder();
                        sb.append(min < 10 ? "0" : "");
                        sb.append(min);
                        sb.append(":");
                        sb.append(i11 < 10 ? "0" : "");
                        sb.append(i11);
                        no0Var.q(sb.toString(), true, false);
                    }
                    if (h21Var.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(h21Var.K, 1000L);
                        break;
                    }
                }
                break;
            default:
                h21 h21Var2 = this.b;
                h21Var2.P = false;
                Bitmap bitmap = h21Var2.h;
                if (bitmap != null) {
                    h21Var2.h = null;
                    h21Var2.x.d(0.0f, true);
                    Bitmap bitmap2 = h21Var2.n;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    h21Var2.n = bitmap;
                    h21Var2.invalidate();
                    break;
                }
                break;
        }
    }
}
