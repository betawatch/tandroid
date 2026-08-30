package org.telegram.ui.Cells;

import android.os.Build;
import android.view.ActionMode;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class h9 implements Runnable {
    public final /* synthetic */ z9 a;

    public h9(z9 z9Var) {
        this.a = z9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z9 z9Var;
        ActionMode actionMode;
        if (Build.VERSION.SDK_INT < 23 || (actionMode = (z9Var = this.a).Y) == null || z9Var.P) {
            return;
        }
        actionMode.hide(Long.MAX_VALUE);
        AndroidUtilities.runOnUIThread(z9Var.s0, 1000L);
    }
}
