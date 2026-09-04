package androidx.emoji2.text;

import android.os.Trace;
import bi.p9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.voip.k2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.u2;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
                o20[] o20VarArr = p9.a;
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
                AndroidUtilities.runOnUIThread(p9.o, 1000L);
                LaunchActivity.R().getFragmentView();
                return;
            case 2:
                return;
            case 3:
                j6.j = false;
                j6.l(false);
                return;
            case 4:
                j6.k = false;
                j6.l(true);
                return;
            case 5:
                return;
            case 6:
                k2 k2Var = k2.U;
                if (k2Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(k2Var.b.f.M);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public n(u2 u2Var) {
        this.a = 5;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }
}
