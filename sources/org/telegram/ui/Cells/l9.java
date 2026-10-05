package org.telegram.ui.Cells;

import android.os.Build;
import android.view.ActionMode;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
