package gg;

import ci.y8;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ea1;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.xt;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class r1 extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ pm0 c;

    public /* synthetic */ r1(pm0 pm0Var, String str, int i10) {
        this.a = i10;
        this.c = pm0Var;
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
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                String str = this.b;
                t1Var.getClass();
                AndroidUtilities.runOnUIThread(new y8(29, t1Var, str));
                break;
            default:
                try {
                    ((xt) this.c).d.cancel();
                    ((xt) this.c).d = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                Utilities.searchQueue.postRunnable(new ea1(5, (xt) this.c, this.b));
                break;
        }
    }
}
