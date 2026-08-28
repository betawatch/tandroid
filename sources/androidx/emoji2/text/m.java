package androidx.emoji2.text;

import android.os.Trace;
import ih.p7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.voip.l2;
import org.telegram.ui.Components.z10;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.x2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ m(int i9) {
        this.a = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = true;
        switch (this.a) {
            case 0:
                try {
                    int i9 = n0.g.a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (k.j == null) {
                        z10 = false;
                    }
                    if (z10) {
                        k.a().c();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i10 = n0.g.a;
                    Trace.endSection();
                    throw th;
                }
            case 1:
                Math.abs(Utilities.random.nextInt() % 3);
                z10[] z10VarArr = p7.a;
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
                AndroidUtilities.runOnUIThread(p7.o, 1000L);
                LaunchActivity.R().getFragmentView();
                return;
            case 2:
                f6.j = false;
                f6.l(false);
                return;
            case 3:
                f6.k = false;
                f6.l(true);
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

    public m(x2 x2Var) {
        this.a = 4;
    }

    private final void a() {
    }

    private final void b() {
    }
}
