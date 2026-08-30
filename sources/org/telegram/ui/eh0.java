package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class eh0 implements Runnable {
    public final /* synthetic */ ph0 a;

    public eh0(ph0 ph0Var) {
        this.a = ph0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ph0 ph0Var = this.a;
        if (ph0Var.b == null) {
            return;
        }
        for (int i10 = 0; i10 < ph0Var.b.getChildCount(); i10++) {
            View childAt = ph0Var.b.getChildAt(i10);
            if (childAt instanceof mh0) {
                mh0 mh0Var = (mh0) childAt;
                if (mh0Var.F) {
                    mh0Var.b(mh0Var.n, mh0Var.r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
