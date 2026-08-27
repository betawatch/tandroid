package org.telegram.ui.Cells;

import android.os.Build;
import android.view.ActionMode;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class e9 implements Runnable {
    public final /* synthetic */ w9 a;

    public e9(w9 w9Var) {
        this.a = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w9 w9Var;
        ActionMode actionMode;
        if (Build.VERSION.SDK_INT < 23 || (actionMode = (w9Var = this.a).Y) == null || w9Var.P) {
            return;
        }
        actionMode.hide(Long.MAX_VALUE);
        AndroidUtilities.runOnUIThread(w9Var.s0, 1000L);
    }
}
