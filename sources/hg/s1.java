package hg;

import fi.j4;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.yt;
import org.telegram.ui.zt;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                String str = this.b;
                u1Var.getClass();
                AndroidUtilities.runOnUIThread(new j4(8, u1Var, str));
                break;
            default:
                try {
                    ((zt) this.c).d.cancel();
                    ((zt) this.c).d = null;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                Utilities.searchQueue.postRunnable(new yt(0, (zt) this.c, this.b));
                break;
        }
    }
}
