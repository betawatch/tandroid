package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class b31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e31 b;

    public /* synthetic */ b31(e31 e31Var, int i10) {
        this.a = i10;
        this.b = e31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e31 e31Var = this.b;
                AndroidUtilities.cancelRunOnUIThread(e31Var.N);
                boolean z10 = e31Var.r;
                if (z10) {
                    if (z10 && e31Var.F == null) {
                        org.telegram.ui.Components.hj0 hj0Var = new org.telegram.ui.Components.hj0(R.raw.qr_matrix, AndroidUtilities.dp(200.0f), AndroidUtilities.dp(200.0f));
                        e31Var.F = hj0Var;
                        hj0Var.v0 = e31Var;
                        hj0Var.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        e31Var.F.K(1);
                        e31Var.F.start();
                    }
                    if (e31Var.J == 0 || System.currentTimeMillis() / 1000 >= e31Var.J) {
                        if (e31Var.J != 0) {
                            e31Var.I = null;
                            Utilities.themeQueue.postRunnable(new c31(e31Var, e31Var.getWidth(), e31Var.getHeight(), 2));
                            e31Var.s.q("", true, true);
                        }
                        MessagesController.getInstance(UserConfig.selectedAccount).requestContactToken(e31Var.J == 0 ? 750L : 1750L, new u3(e31Var, 18));
                    }
                    int i10 = e31Var.J;
                    if (i10 > 0 && e31Var.I != null) {
                        long max = Math.max(0L, (i10 - (System.currentTimeMillis() / 1000)) - 1);
                        int i11 = (int) (max % 60);
                        int min = Math.min(99, (int) (max / 60));
                        org.telegram.ui.Components.so0 so0Var = e31Var.s;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(min < 10 ? "0" : "");
                        sb2.append(min);
                        sb2.append(":");
                        sb2.append(i11 < 10 ? "0" : "");
                        sb2.append(i11);
                        so0Var.q(sb2.toString(), true, false);
                    }
                    if (e31Var.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(e31Var.N, 1000L);
                        break;
                    }
                }
                break;
            default:
                e31 e31Var2 = this.b;
                e31Var2.S = false;
                Bitmap bitmap = e31Var2.h;
                if (bitmap != null) {
                    e31Var2.h = null;
                    e31Var2.x.d(0.0f, true);
                    Bitmap bitmap2 = e31Var2.n;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    e31Var2.n = bitmap;
                    e31Var2.invalidate();
                    break;
                }
                break;
        }
    }
}
