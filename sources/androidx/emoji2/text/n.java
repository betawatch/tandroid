package androidx.emoji2.text;

import android.os.Trace;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.voip.l2;
import org.telegram.ui.Components.x20;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.v2;
import zh.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                return;
            case 2:
                j6.j = false;
                j6.l(false);
                return;
            case 3:
                j6.k = false;
                j6.l(true);
                return;
            case 4:
                return;
            case 5:
                l2 l2Var = l2.U;
                if (l2Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(l2Var.b.f.M);
                    return;
                }
                return;
            case 6:
                return;
            default:
                Math.abs(Utilities.random.nextInt() % 3);
                x20[] x20VarArr = a6.a;
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
                AndroidUtilities.runOnUIThread(a6.o, 1000L);
                LaunchActivity.R().getFragmentView();
                return;
        }
    }

    public n(v2 v2Var) {
        this.a = 4;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }
}
