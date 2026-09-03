package org.telegram.ui.Cells;

import android.os.Build;
import android.view.ActionMode;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class g9 implements Runnable {
    public final /* synthetic */ y9 a;

    public g9(y9 y9Var) {
        this.a = y9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y9 y9Var;
        ActionMode actionMode;
        if (Build.VERSION.SDK_INT < 23 || (actionMode = (y9Var = this.a).Y) == null || y9Var.P) {
            return;
        }
        actionMode.hide(Long.MAX_VALUE);
        AndroidUtilities.runOnUIThread(y9Var.s0, 1000L);
    }
}
