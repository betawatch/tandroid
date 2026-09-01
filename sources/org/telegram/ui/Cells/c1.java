package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class c1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t1 b;

    public /* synthetic */ c1(int i10, t1 t1Var) {
        this.a = i10;
        this.b = t1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean e32;
        switch (this.a) {
            case 0:
                k1 k1Var = this.b.Gc;
                if (k1Var != null) {
                    k1Var.r();
                    break;
                }
                break;
            default:
                t1 t1Var = this.b;
                c1 c1Var = t1Var.ld;
                MessageObject messageObject = t1Var.v7;
                if (messageObject != null && (e32 = t1Var.e3(messageObject)) != t1Var.T3) {
                    t1Var.T3 = e32;
                    if (e32) {
                        MessageObject messageObject2 = t1Var.v7;
                        t1Var.v7 = null;
                        t1Var.X3(messageObject2, t1Var.H, t1Var.C, t1Var.B, t1Var.D, false);
                    } else {
                        AndroidUtilities.runOnUIThread(c1Var, 1000L);
                        t1Var.Tc = true;
                        int dp = t1Var.G8 - AndroidUtilities.dp(91.0f);
                        t1Var.Q3 = new StaticLayout(TextUtils.ellipsize(LocaleController.getString(R.string.AttachLiveLocation), org.telegram.ui.ActionBar.k6.H2, dp, TextUtils.TruncateAt.END), org.telegram.ui.ActionBar.k6.H2, dp, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                }
                if (!t1Var.T3) {
                    RectF rectF = t1Var.Z4;
                    t1Var.invalidate(((int) rectF.left) - 5, ((int) rectF.top) - 5, ((int) rectF.right) + 5, ((int) rectF.bottom) + 5);
                    if (t1Var.Tc) {
                        AndroidUtilities.runOnUIThread(c1Var, 1000L);
                        break;
                    }
                } else {
                    t1Var.invalidate();
                    t1Var.Tc = false;
                    break;
                }
                break;
        }
    }
}
