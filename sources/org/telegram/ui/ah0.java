package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ah0 implements Runnable {
    public final /* synthetic */ mh0 a;

    public ah0(mh0 mh0Var) {
        this.a = mh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mh0 mh0Var = this.a;
        if (mh0Var.b == null) {
            return;
        }
        for (int i10 = 0; i10 < mh0Var.b.getChildCount(); i10++) {
            View childAt = mh0Var.b.getChildAt(i10);
            if (childAt instanceof jh0) {
                jh0 jh0Var = (jh0) childAt;
                if (jh0Var.I) {
                    jh0Var.b(jh0Var.n, jh0Var.r);
                }
            }
        }
        AndroidUtilities.runOnUIThread(this, 500L);
    }
}
