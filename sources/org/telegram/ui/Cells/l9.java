package org.telegram.ui.Cells;

import android.os.Build;
import android.view.ActionMode;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
