package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class p21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s21 b;

    public /* synthetic */ p21(s21 s21Var, int i10) {
        this.a = i10;
        this.b = s21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s21 s21Var = this.b;
                AndroidUtilities.cancelRunOnUIThread(s21Var.N);
                boolean z10 = s21Var.r;
                if (z10) {
                    if (z10 && s21Var.F == null) {
                        org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(R.raw.qr_matrix, AndroidUtilities.dp(200.0f), AndroidUtilities.dp(200.0f));
                        s21Var.F = kj0Var;
                        kj0Var.R(s21Var);
                        s21Var.F.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        s21Var.F.K(1);
                        s21Var.F.start();
                    }
                    if (s21Var.J == 0 || System.currentTimeMillis() / 1000 >= s21Var.J) {
                        if (s21Var.J != 0) {
                            s21Var.I = null;
                            Utilities.themeQueue.postRunnable(new q21(s21Var, s21Var.getWidth(), s21Var.getHeight(), 2));
                            s21Var.s.q("", true, true);
                        }
                        MessagesController.getInstance(UserConfig.selectedAccount).requestContactToken(s21Var.J == 0 ? 750L : 1750L, new t3(s21Var, 22));
                    }
                    int i10 = s21Var.J;
                    if (i10 > 0 && s21Var.I != null) {
                        long max = Math.max(0L, (i10 - (System.currentTimeMillis() / 1000)) - 1);
                        int i11 = (int) (max % 60);
                        int min = Math.min(99, (int) (max / 60));
                        org.telegram.ui.Components.dp0 dp0Var = s21Var.s;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(min < 10 ? "0" : "");
                        sb2.append(min);
                        sb2.append(":");
                        sb2.append(i11 < 10 ? "0" : "");
                        sb2.append(i11);
                        dp0Var.q(sb2.toString(), true, false);
                    }
                    if (s21Var.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(s21Var.N, 1000L);
                        break;
                    }
                }
                break;
            default:
                s21 s21Var2 = this.b;
                s21Var2.S = false;
                Bitmap bitmap = s21Var2.h;
                if (bitmap != null) {
                    s21Var2.h = null;
                    s21Var2.x.d(0.0f, true);
                    Bitmap bitmap2 = s21Var2.n;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    s21Var2.n = bitmap;
                    s21Var2.invalidate();
                    break;
                }
                break;
        }
    }
}
