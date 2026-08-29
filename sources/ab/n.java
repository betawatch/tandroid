package ab;

import android.os.Trace;
import lh.l7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.voip.o2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.y2;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ n(int i10) {
        this.a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = true;
        switch (this.a) {
            case 0:
                return;
            case 1:
                try {
                    int i10 = n0.g.a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (androidx.emoji2.text.l.j == null) {
                        z10 = false;
                    }
                    if (z10) {
                        androidx.emoji2.text.l.a().c();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th2) {
                    int i11 = n0.g.a;
                    Trace.endSection();
                    throw th2;
                }
            case 2:
                Math.abs(Utilities.random.nextInt() % 3);
                k20[] k20VarArr = l7.a;
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
                AndroidUtilities.runOnUIThread(l7.o, 1000L);
                LaunchActivity.R().getFragmentView();
                return;
            case 3:
                g6.j = false;
                g6.l(false);
                return;
            case 4:
                g6.k = false;
                g6.l(true);
                return;
            case 5:
                return;
            default:
                o2 o2Var = o2.Q;
                if (o2Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(o2Var.b.f.I);
                    return;
                }
                return;
        }
    }

    public n(y2 y2Var) {
        this.a = 5;
    }

    private final void a() {
    }

    private final void b() {
    }
}
