package org.telegram.ui.Cells;

import android.os.Build;
import android.view.ActionMode;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class l9 implements Runnable {
    public final /* synthetic */ da a;

    public l9(da daVar) {
        this.a = daVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        da daVar;
        ActionMode actionMode;
        if (Build.VERSION.SDK_INT < 23 || (actionMode = (daVar = this.a).Y) == null || daVar.P) {
            return;
        }
        actionMode.hide(Long.MAX_VALUE);
        AndroidUtilities.runOnUIThread(daVar.s0, 1000L);
    }
}
