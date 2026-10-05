package gg;

import ci.x8;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.vo0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.xt;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class s1 extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ yl0 c;

    public /* synthetic */ s1(yl0 yl0Var, String str, int i10) {
        this.a = i10;
        this.c = yl0Var;
        this.b = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u1 u1Var = (u1) this.c;
                try {
                    u1Var.n.cancel();
                    u1Var.n = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                String str = this.b;
                u1Var.getClass();
                AndroidUtilities.runOnUIThread(new x8(29, u1Var, str));
                break;
            default:
                try {
                    ((xt) this.c).d.cancel();
                    ((xt) this.c).d = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                Utilities.searchQueue.postRunnable(new vo0(28, (xt) this.c, this.b));
                break;
        }
    }
}
