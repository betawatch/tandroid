package ai;

import android.os.Trace;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.p20;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class z9 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ z9(int i10) {
        this.a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = true;
        switch (this.a) {
            case 0:
                Math.abs(Utilities.random.nextInt() % 3);
                p20[] p20VarArr = ia.a;
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, 0);
                AndroidUtilities.runOnUIThread(ia.o, 1000L);
                LaunchActivity.R().getFragmentView();
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
                return;
            case 3:
                org.telegram.ui.ActionBar.h6.j = false;
                org.telegram.ui.ActionBar.h6.l(false);
                return;
            case 4:
                org.telegram.ui.ActionBar.h6.k = false;
                org.telegram.ui.ActionBar.h6.l(true);
                return;
            case 5:
                return;
            case 6:
                org.telegram.ui.Components.voip.m2 m2Var = org.telegram.ui.Components.voip.m2.U;
                if (m2Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(m2Var.b.f.M);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public z9(org.telegram.ui.u2 u2Var) {
        this.a = 5;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }
}
