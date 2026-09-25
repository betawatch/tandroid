package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class hh0 implements Runnable {
    public final /* synthetic */ sh0 a;

    public hh0(sh0 sh0Var) {
        this.a = sh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sh0 sh0Var = this.a;
        if (sh0Var.b == null) {
            return;
        }
        for (int i10 = 0; i10 < sh0Var.b.getChildCount(); i10++) {
            View childAt = sh0Var.b.getChildAt(i10);
            if (childAt instanceof ph0) {
                ph0 ph0Var = (ph0) childAt;
                if (ph0Var.I) {
                    ph0Var.b(ph0Var.n, ph0Var.r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
