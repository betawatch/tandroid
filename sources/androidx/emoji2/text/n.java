package androidx.emoji2.text;

import android.os.Trace;
import bi.s9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b30;
import org.telegram.ui.Components.voip.k2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.w2;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                } catch (Throwable th2) {
                    int i11 = n0.g.a;
                    Trace.endSection();
                    throw th2;
                }
            case 1:
                Math.abs(Utilities.random.nextInt() % 3);
                b30[] b30VarArr = s9.a;
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
                AndroidUtilities.runOnUIThread(s9.o, 1000L);
                LaunchActivity.R().getFragmentView();
                return;
            case 2:
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
            case 6:
                k2 k2Var = k2.V;
                if (k2Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(k2Var.b.f.N);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public n(w2 w2Var) {
        this.a = 5;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }
}
