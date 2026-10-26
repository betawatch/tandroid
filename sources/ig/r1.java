package ig;

import hi.u2;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.mt;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                AndroidUtilities.runOnUIThread(new u2(11, t1Var, str));
                break;
            default:
                try {
                    ((mt) this.c).d.cancel();
                    ((mt) this.c).d = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                Utilities.searchQueue.postRunnable(new c71(17, (mt) this.c, this.b));
                break;
        }
    }
}
