package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class e1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u1 b;

    public /* synthetic */ e1(int i10, u1 u1Var) {
        this.a = i10;
        this.b = u1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean e32;
        switch (this.a) {
            case 0:
                l1 l1Var = this.b.Jc;
                if (l1Var != null) {
                    l1Var.s();
                    break;
                }
                break;
            default:
                u1 u1Var = this.b;
                e1 e1Var = u1Var.od;
                MessageObject messageObject = u1Var.y7;
                if (messageObject != null && (e32 = u1Var.e3(messageObject)) != u1Var.W3) {
                    u1Var.W3 = e32;
                    if (e32) {
                        MessageObject messageObject2 = u1Var.y7;
                        u1Var.y7 = null;
                        u1Var.X3(messageObject2, u1Var.K, u1Var.F, u1Var.E, u1Var.G, false);
                    } else {
                        AndroidUtilities.runOnUIThread(e1Var, 1000L);
                        u1Var.Wc = true;
                        int dp = u1Var.J8 - AndroidUtilities.dp(91.0f);
                        u1Var.T3 = new StaticLayout(TextUtils.ellipsize(LocaleController.getString(R.string.AttachLiveLocation), org.telegram.ui.ActionBar.h6.H2, dp, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.h6.H2, dp, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                }
                if (!u1Var.W3) {
                    RectF rectF = u1Var.c5;
                    u1Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                    if (u1Var.Wc) {
                        AndroidUtilities.runOnUIThread(e1Var, 1000L);
                        break;
                    }
                } else {
                    u1Var.invalidate();
                    u1Var.Wc = false;
                    break;
                }
                break;
        }
    }
}
