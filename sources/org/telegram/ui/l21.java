package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o21 b;

    public /* synthetic */ l21(o21 o21Var, int i10) {
        this.a = i10;
        this.b = o21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o21 o21Var = this.b;
                AndroidUtilities.cancelRunOnUIThread(o21Var.K);
                boolean z4 = o21Var.r;
                if (z4) {
                    if (z4 && o21Var.C == null) {
                        org.telegram.ui.Components.hj0 hj0Var = new org.telegram.ui.Components.hj0(R.raw.qr_matrix, AndroidUtilities.dp(200.0f), AndroidUtilities.dp(200.0f));
                        o21Var.C = hj0Var;
                        hj0Var.s0 = o21Var;
                        hj0Var.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        o21Var.C.I(1);
                        o21Var.C.start();
                    }
                    if (o21Var.G == 0 || System.currentTimeMillis() / 1000 >= o21Var.G) {
                        if (o21Var.G != 0) {
                            o21Var.F = null;
                            Utilities.themeQueue.postRunnable(new m21(o21Var, o21Var.getWidth(), o21Var.getHeight(), 2));
                            o21Var.s.q("", true, true);
                        }
                        MessagesController.getInstance(UserConfig.selectedAccount).requestContactToken(o21Var.G == 0 ? 750L : 1750L, new w3(o21Var, 18));
                    }
                    int i10 = o21Var.G;
                    if (i10 > 0 && o21Var.F != null) {
                        long max = Math.max(0L, (i10 - (System.currentTimeMillis() / 1000)) - 1);
                        int i11 = (int) (max % 60);
                        int min = Math.min(99, (int) (max / 60));
                        org.telegram.ui.Components.no0 no0Var = o21Var.s;
                        StringBuilder sb = new StringBuilder();
                        sb.append(min < 10 ? "0" : "");
                        sb.append(min);
                        sb.append(":");
                        sb.append(i11 < 10 ? "0" : "");
                        sb.append(i11);
                        no0Var.q(sb.toString(), true, false);
                    }
                    if (o21Var.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(o21Var.K, 1000L);
                        break;
                    }
                }
                break;
            default:
                o21 o21Var2 = this.b;
                o21Var2.P = false;
                Bitmap bitmap = o21Var2.h;
                if (bitmap != null) {
                    o21Var2.h = null;
                    o21Var2.x.d(0.0f, true);
                    Bitmap bitmap2 = o21Var2.n;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    o21Var2.n = bitmap;
                    o21Var2.invalidate();
                    break;
                }
                break;
        }
    }
}
