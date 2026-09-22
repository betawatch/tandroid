package org.telegram.ui.Cells;

import android.os.Build;
import android.view.ActionMode;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class m9 implements Runnable {
    public final /* synthetic */ ea a;

    public m9(ea eaVar) {
        this.a = eaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ea eaVar;
        ActionMode actionMode;
        if (Build.VERSION.SDK_INT < 23 || (actionMode = (eaVar = this.a).Y) == null || eaVar.P) {
            return;
        }
        actionMode.hide(Long.MAX_VALUE);
        AndroidUtilities.runOnUIThread(eaVar.s0, 1000L);
    }
}
