package ig;

import hi.u2;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.ot;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class r1 extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ mm0 c;

    public /* synthetic */ r1(mm0 mm0Var, String str, int i10) {
        this.a = i10;
        this.c = mm0Var;
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
                    ((ot) this.c).d.cancel();
                    ((ot) this.c).d = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                Utilities.searchQueue.postRunnable(new d71(18, (ot) this.c, this.b));
                break;
        }
    }
}
