package org.telegram.ui.Cells;

import android.os.Build;
import android.view.ActionMode;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class n9 implements Runnable {
    public final /* synthetic */ fa a;

    public n9(fa faVar) {
        this.a = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fa faVar;
        ActionMode actionMode;
        if (Build.VERSION.SDK_INT < 23 || (actionMode = (faVar = this.a).Y) == null || faVar.P) {
            return;
        }
        actionMode.hide(Long.MAX_VALUE);
        AndroidUtilities.runOnUIThread(faVar.s0, 1000L);
    }
}
