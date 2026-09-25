package gg;

import ci.y8;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.ut;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class s1 extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ vl0 c;

    public /* synthetic */ s1(vl0 vl0Var, String str, int i10) {
        this.a = i10;
        this.c = vl0Var;
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
                AndroidUtilities.runOnUIThread(new y8(29, u1Var, str));
                break;
            default:
                try {
                    ((ut) this.c).d.cancel();
                    ((ut) this.c).d = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                Utilities.searchQueue.postRunnable(new wn0(29, (ut) this.c, this.b));
                break;
        }
    }
}
