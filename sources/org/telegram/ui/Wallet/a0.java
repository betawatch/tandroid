package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.f80;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class a0 implements Runnable, NotificationCenter.NotificationCenterDelegate {
    public boolean a;
    public final /* synthetic */ NotificationCenter b;
    public final /* synthetic */ f80 c;
    public final /* synthetic */ l0 d;

    public a0(NotificationCenter notificationCenter, f80 f80Var, l0 l0Var) {
        this.b = notificationCenter;
        this.c = f80Var;
        this.d = l0Var;
    }

    public final void a() {
        if (this.a) {
            return;
        }
        l0 l0Var = this.d;
        if (l0Var.e == null) {
            return;
        }
        ArrayList arrayList = l0Var.G;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((h0) obj).d) {
                return;
            }
        }
        run();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.walletUpdate) {
            a();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a) {
            return;
        }
        this.a = true;
        AndroidUtilities.cancelRunOnUIThread(this);
        this.b.removeObserver(this, NotificationCenter.walletUpdate);
        this.c.run();
    }
}
