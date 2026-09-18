package gg;

import ci.b9;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.br0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.au;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class s1 extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ll0 c;

    public /* synthetic */ s1(ll0 ll0Var, String str, int i10) {
        this.a = i10;
        this.c = ll0Var;
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
                } catch (Exception e) {
                    FileLog.e(e);
                }
                String str = this.b;
                u1Var.getClass();
                AndroidUtilities.runOnUIThread(new b9(29, u1Var, str));
                break;
            default:
                try {
                    ((au) this.c).d.cancel();
                    ((au) this.c).d = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                Utilities.searchQueue.postRunnable(new br0(24, (au) this.c, this.b));
                break;
        }
    }
}
