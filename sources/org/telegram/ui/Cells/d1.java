package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t1 b;

    public /* synthetic */ d1(int i9, t1 t1Var) {
        this.a = i9;
        this.b = t1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean e32;
        switch (this.a) {
            case 0:
                k1 k1Var = this.b.Fc;
                if (k1Var != null) {
                    k1Var.w();
                    break;
                }
                break;
            default:
                t1 t1Var = this.b;
                d1 d1Var = t1Var.kd;
                MessageObject messageObject = t1Var.u7;
                if (messageObject != null && (e32 = t1Var.e3(messageObject)) != t1Var.S3) {
                    t1Var.S3 = e32;
                    if (e32) {
                        MessageObject messageObject2 = t1Var.u7;
                        t1Var.u7 = null;
                        t1Var.X3(messageObject2, t1Var.G, t1Var.B, t1Var.A, t1Var.C, false);
                    } else {
                        AndroidUtilities.runOnUIThread(d1Var, 1000L);
                        t1Var.Sc = true;
                        int dp = t1Var.F8 - AndroidUtilities.dp(91.0f);
                        t1Var.P3 = new StaticLayout(TextUtils.ellipsize(LocaleController.getString(R.string.AttachLiveLocation), org.telegram.ui.ActionBar.f6.H2, dp, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.f6.H2, dp, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                }
                if (!t1Var.S3) {
                    RectF rectF = t1Var.Y4;
                    t1Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                    if (t1Var.Sc) {
                        AndroidUtilities.runOnUIThread(d1Var, 1000L);
                        break;
                    }
                } else {
                    t1Var.invalidate();
                    t1Var.Sc = false;
                    break;
                }
                break;
        }
    }
}
