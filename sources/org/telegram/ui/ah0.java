package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ah0 implements Runnable {
    public final /* synthetic */ lh0 a;

    public ah0(lh0 lh0Var) {
        this.a = lh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lh0 lh0Var = this.a;
        if (lh0Var.b == null) {
            return;
        }
        for (int i10 = 0; i10 < lh0Var.b.getChildCount(); i10++) {
            View childAt = lh0Var.b.getChildAt(i10);
            if (childAt instanceof ih0) {
                ih0 ih0Var = (ih0) childAt;
                if (ih0Var.I) {
                    ih0Var.b(ih0Var.n, ih0Var.r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
