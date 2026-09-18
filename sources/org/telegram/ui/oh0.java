package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class oh0 implements Runnable {
    public final /* synthetic */ zh0 a;

    public oh0(zh0 zh0Var) {
        this.a = zh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zh0 zh0Var = this.a;
        if (zh0Var.b == null) {
            return;
        }
        for (int i10 = 0; i10 < zh0Var.b.getChildCount(); i10++) {
            View childAt = zh0Var.b.getChildAt(i10);
            if (childAt instanceof wh0) {
                wh0 wh0Var = (wh0) childAt;
                if (wh0Var.I) {
                    wh0Var.b(wh0Var.n, wh0Var.r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
