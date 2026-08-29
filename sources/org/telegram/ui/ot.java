package org.telegram.ui;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ot extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ org.telegram.ui.Components.il0 c;

    public /* synthetic */ ot(org.telegram.ui.Components.il0 il0Var, String str, int i10) {
        this.a = i10;
        this.c = il0Var;
        this.b = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    ((pt) this.c).d.cancel();
                    ((pt) this.c).d = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                Utilities.searchQueue.postRunnable(new org.telegram.ui.Components.voip.o(3, (pt) this.c, this.b));
                break;
            default:
                rf.d1 d1Var = (rf.d1) this.c;
                try {
                    d1Var.n.cancel();
                    d1Var.n = null;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                String str = this.b;
                d1Var.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.y(24, d1Var, str));
                break;
        }
    }
}
