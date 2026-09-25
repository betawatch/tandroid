package org.telegram.ui.Cells;

import android.os.Build;
import android.view.ActionMode;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
