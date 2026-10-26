package androidx.emoji2.text;

import android.os.Trace;
import di.a8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.voip.n2;
import org.telegram.ui.Components.z20;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.t2;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                z20[] z20VarArr = a8.a;
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
                AndroidUtilities.runOnUIThread(a8.o, 1000L);
                LaunchActivity.R().getFragmentView();
                return;
            case 2:
                return;
            case 3:
                y6.j = false;
                y6.l(false);
                return;
            case 4:
                y6.k = false;
                y6.l(true);
                return;
            case 5:
                return;
            case 6:
                n2 n2Var = n2.V;
                if (n2Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(n2Var.b.f.N);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public n(t2 t2Var) {
        this.a = 5;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }
}
