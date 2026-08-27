package androidx.emoji2.text;

import android.os.Trace;
import jh.l7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.voip.l2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.y2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class n implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ n(int i10) {
        this.a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = true;
        switch (this.a) {
            case 0:
                try {
                    int i10 = n0.g.a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (l.j == null) {
                        z10 = false;
                    }
                    if (z10) {
                        l.a().c();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i11 = n0.g.a;
                    Trace.endSection();
                    throw th;
                }
            case 1:
                Math.abs(Utilities.random.nextInt() % 3);
                c20[] c20VarArr = l7.a;
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
                AndroidUtilities.runOnUIThread(l7.o, 1000L);
                LaunchActivity.R().getFragmentView();
                return;
            case 2:
                g6.j = false;
                g6.l(false);
                return;
            case 3:
                g6.k = false;
                g6.l(true);
                return;
            case 4:
                return;
            case 5:
                l2 l2Var = l2.Q;
                if (l2Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(l2Var.b.f.I);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public n(y2 y2Var) {
        this.a = 4;
    }

    private final void a() {
    }

    private final void b() {
    }
}
