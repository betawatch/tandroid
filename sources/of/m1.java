package of;

import java.util.TimerTask;
import kh.o8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.ot;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m1 extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ vk0 c;

    public /* synthetic */ m1(vk0 vk0Var, String str, int i9) {
        this.a = i9;
        this.c = vk0Var;
        this.b = str;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o1 o1Var = (o1) this.c;
                try {
                    o1Var.n.cancel();
                    o1Var.n = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                String str = this.b;
                o1Var.getClass();
                AndroidUtilities.runOnUIThread(new o8(17, o1Var, str));
                break;
            default:
                try {
                    ((ot) this.c).d.cancel();
                    ((ot) this.c).d = null;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                Utilities.searchQueue.postRunnable(new p61(6, (ot) this.c, this.b));
                break;
        }
    }
}
