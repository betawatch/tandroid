package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class c1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s1 b;

    public /* synthetic */ c1(int i10, s1 s1Var) {
        this.a = i10;
        this.b = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean e32;
        switch (this.a) {
            case 0:
                j1 j1Var = this.b.Fc;
                if (j1Var != null) {
                    j1Var.t();
                    break;
                }
                break;
            default:
                s1 s1Var = this.b;
                c1 c1Var = s1Var.kd;
                MessageObject messageObject = s1Var.u7;
                if (messageObject != null && (e32 = s1Var.e3(messageObject)) != s1Var.S3) {
                    s1Var.S3 = e32;
                    if (e32) {
                        MessageObject messageObject2 = s1Var.u7;
                        s1Var.u7 = null;
                        s1Var.X3(messageObject2, s1Var.G, s1Var.B, s1Var.A, s1Var.C, false);
                    } else {
                        AndroidUtilities.runOnUIThread(c1Var, 1000L);
                        s1Var.Sc = true;
                        int dp = s1Var.F8 - AndroidUtilities.dp(91.0f);
                        s1Var.P3 = new StaticLayout(TextUtils.ellipsize(LocaleController.getString(R.string.AttachLiveLocation), org.telegram.ui.ActionBar.g6.H2, dp, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.g6.H2, dp, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                }
                if (!s1Var.S3) {
                    RectF rectF = s1Var.Y4;
                    s1Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                    if (s1Var.Sc) {
                        AndroidUtilities.runOnUIThread(c1Var, 1000L);
                        break;
                    }
                } else {
                    s1Var.invalidate();
                    s1Var.Sc = false;
                    break;
                }
                break;
        }
    }
}
