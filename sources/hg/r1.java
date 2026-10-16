package hg;

import fi.q3;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.n51;
import org.telegram.ui.du;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class r1 extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ lm0 c;

    public /* synthetic */ r1(lm0 lm0Var, String str, int i10) {
        this.a = i10;
        this.c = lm0Var;
        this.b = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t1 t1Var = (t1) this.c;
                try {
                    t1Var.n.cancel();
                    t1Var.n = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                String str = this.b;
                t1Var.getClass();
                AndroidUtilities.runOnUIThread(new q3(10, t1Var, str));
                break;
            default:
                try {
                    ((du) this.c).d.cancel();
                    ((du) this.c).d = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                Utilities.searchQueue.postRunnable(new n51(11, (du) this.c, this.b));
                break;
        }
    }
}
