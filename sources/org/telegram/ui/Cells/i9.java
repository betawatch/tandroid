package org.telegram.ui.Cells;

import android.os.Build;
import android.view.ActionMode;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i9 implements Runnable {
    public final /* synthetic */ aa a;

    public i9(aa aaVar) {
        this.a = aaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aa aaVar;
        ActionMode actionMode;
        if (Build.VERSION.SDK_INT < 23 || (actionMode = (aaVar = this.a).Y) == null || aaVar.P) {
            return;
        }
        actionMode.hide(Long.MAX_VALUE);
        AndroidUtilities.runOnUIThread(aaVar.s0, 1000L);
    }
}
