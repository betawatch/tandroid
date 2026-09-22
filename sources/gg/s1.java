package gg;

import ci.b9;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ar0;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.yt;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class s1 extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ kl0 c;

    public /* synthetic */ s1(kl0 kl0Var, String str, int i10) {
        this.a = i10;
        this.c = kl0Var;
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
                    ((yt) this.c).d.cancel();
                    ((yt) this.c).d = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                Utilities.searchQueue.postRunnable(new ar0(24, (yt) this.c, this.b));
                break;
        }
    }
}
