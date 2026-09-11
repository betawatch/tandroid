package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class nh0 implements Runnable {
    public final /* synthetic */ yh0 a;

    public nh0(yh0 yh0Var) {
        this.a = yh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yh0 yh0Var = this.a;
        if (yh0Var.b == null) {
            return;
        }
        for (int i10 = 0; i10 < yh0Var.b.getChildCount(); i10++) {
            View childAt = yh0Var.b.getChildAt(i10);
            if (childAt instanceof vh0) {
                vh0 vh0Var = (vh0) childAt;
                if (vh0Var.I) {
                    vh0Var.b(vh0Var.n, vh0Var.r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
