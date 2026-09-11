package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class d1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t1 b;

    public /* synthetic */ d1(int i10, t1 t1Var) {
        this.a = i10;
        this.b = t1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean e32;
        switch (this.a) {
            case 0:
                k1 k1Var = this.b.Jc;
                if (k1Var != null) {
                    k1Var.s();
                    break;
                }
                break;
            default:
                t1 t1Var = this.b;
                d1 d1Var = t1Var.od;
                MessageObject messageObject = t1Var.y7;
                if (messageObject != null && (e32 = t1Var.e3(messageObject)) != t1Var.W3) {
                    t1Var.W3 = e32;
                    if (e32) {
                        MessageObject messageObject2 = t1Var.y7;
                        t1Var.y7 = null;
                        t1Var.X3(messageObject2, t1Var.K, t1Var.F, t1Var.E, t1Var.G, false);
                    } else {
                        AndroidUtilities.runOnUIThread(d1Var, 1000L);
                        t1Var.Wc = true;
                        int dp = t1Var.J8 - AndroidUtilities.dp(91.0f);
                        t1Var.T3 = new StaticLayout(TextUtils.ellipsize(LocaleController.getString(R.string.AttachLiveLocation), org.telegram.ui.ActionBar.j6.H2, dp, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.j6.H2, dp, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                }
                if (!t1Var.W3) {
                    RectF rectF = t1Var.c5;
                    t1Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                    if (t1Var.Wc) {
                        AndroidUtilities.runOnUIThread(d1Var, 1000L);
                        break;
                    }
                } else {
                    t1Var.invalidate();
                    t1Var.Wc = false;
                    break;
                }
                break;
        }
    }
}
