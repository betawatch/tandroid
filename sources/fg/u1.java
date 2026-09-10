package fg;

import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.zt;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class u1 extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ul0 c;

    public /* synthetic */ u1(ul0 ul0Var, String str, int i10) {
        this.a = i10;
        this.c = ul0Var;
        this.b = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w1 w1Var = (w1) this.c;
                try {
                    w1Var.n.cancel();
                    w1Var.n = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                String str = this.b;
                w1Var.getClass();
                AndroidUtilities.runOnUIThread(new s1(0, w1Var, str));
                break;
            default:
                try {
                    ((zt) this.c).d.cancel();
                    ((zt) this.c).d = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                Utilities.searchQueue.postRunnable(new yo0(27, (zt) this.c, this.b));
                break;
        }
    }
}
