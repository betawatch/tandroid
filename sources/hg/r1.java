package hg;

import ei.p6;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.ot;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class r1 extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ hm0 c;

    public /* synthetic */ r1(hm0 hm0Var, String str, int i10) {
        this.a = i10;
        this.c = hm0Var;
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
                AndroidUtilities.runOnUIThread(new p6(27, t1Var, str));
                break;
            default:
                try {
                    ((ot) this.c).d.cancel();
                    ((ot) this.c).d = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                Utilities.searchQueue.postRunnable(new go0(29, (ot) this.c, this.b));
                break;
        }
    }
}
