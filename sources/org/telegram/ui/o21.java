package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class o21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r21 b;

    public /* synthetic */ o21(r21 r21Var, int i10) {
        this.a = i10;
        this.b = r21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r21 r21Var = this.b;
                AndroidUtilities.cancelRunOnUIThread(r21Var.N);
                boolean z10 = r21Var.r;
                if (z10) {
                    if (z10 && r21Var.F == null) {
                        org.telegram.ui.Components.yi0 yi0Var = new org.telegram.ui.Components.yi0(R.raw.qr_matrix, AndroidUtilities.dp(200.0f), AndroidUtilities.dp(200.0f));
                        r21Var.F = yi0Var;
                        yi0Var.R(r21Var);
                        r21Var.F.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        r21Var.F.K(1);
                        r21Var.F.start();
                    }
                    if (r21Var.J == 0 || System.currentTimeMillis() / 1000 >= r21Var.J) {
                        if (r21Var.J != 0) {
                            r21Var.I = null;
                            Utilities.themeQueue.postRunnable(new p21(r21Var, r21Var.getWidth(), r21Var.getHeight(), 2));
                            r21Var.s.q("", true, true);
                        }
                        MessagesController.getInstance(UserConfig.selectedAccount).requestContactToken(r21Var.J == 0 ? 750L : 1750L, new t3(r21Var, 22));
                    }
                    int i10 = r21Var.J;
                    if (i10 > 0 && r21Var.I != null) {
                        long max = Math.max(0L, (i10 - (System.currentTimeMillis() / 1000)) - 1);
                        int i11 = (int) (max % 60);
                        int min = Math.min(99, (int) (max / 60));
                        org.telegram.ui.Components.jo0 jo0Var = r21Var.s;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(min < 10 ? "0" : "");
                        sb2.append(min);
                        sb2.append(":");
                        sb2.append(i11 < 10 ? "0" : "");
                        sb2.append(i11);
                        jo0Var.q(sb2.toString(), true, false);
                    }
                    if (r21Var.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(r21Var.N, 1000L);
                        break;
                    }
                }
                break;
            default:
                r21 r21Var2 = this.b;
                r21Var2.S = false;
                Bitmap bitmap = r21Var2.h;
                if (bitmap != null) {
                    r21Var2.h = null;
                    r21Var2.x.d(0.0f, true);
                    Bitmap bitmap2 = r21Var2.n;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    r21Var2.n = bitmap;
                    r21Var2.invalidate();
                    break;
                }
                break;
        }
    }
}
