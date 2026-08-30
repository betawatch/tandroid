package androidx.emoji2.text;

import android.os.Trace;
import nh.m7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.voip.m2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.w2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class n implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ n(int i10) {
        this.a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4 = true;
        switch (this.a) {
            case 0:
                try {
                    int i10 = n0.g.a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (l.j == null) {
                        z4 = false;
                    }
                    if (z4) {
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
                Math.abs(Utilities.random.nextInt() % 3);
                p20[] p20VarArr = m7.a;
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
                AndroidUtilities.runOnUIThread(m7.o, 1000L);
                LaunchActivity.R().getFragmentView();
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
            default:
                m2 m2Var = m2.R;
                if (m2Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(m2Var.b.f.J);
                    return;
                }
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
}
