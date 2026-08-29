package org.telegram.ui.Cells;

import android.os.Build;
import android.view.ActionMode;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class f9 implements Runnable {
    public final /* synthetic */ x9 a;

    public f9(x9 x9Var) {
        this.a = x9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x9 x9Var;
        ActionMode actionMode;
        if (Build.VERSION.SDK_INT < 23 || (actionMode = (x9Var = this.a).Y) == null || x9Var.P) {
            return;
        }
        actionMode.hide(Long.MAX_VALUE);
        AndroidUtilities.runOnUIThread(x9Var.s0, 1000L);
    }
}
