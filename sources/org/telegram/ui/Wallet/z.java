package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.se0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class z implements Runnable, NotificationCenter.NotificationCenterDelegate {
    public boolean a;
    public final /* synthetic */ NotificationCenter b;
    public final /* synthetic */ se0 c;
    public final /* synthetic */ k0 d;

    public z(NotificationCenter notificationCenter, se0 se0Var, k0 k0Var) {
        this.b = notificationCenter;
        this.c = se0Var;
        this.d = k0Var;
    }

    public final void a() {
        if (this.a) {
            return;
        }
        k0 k0Var = this.d;
        if (k0Var.e == null) {
            return;
        }
        ArrayList arrayList = k0Var.C;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((g0) obj).d) {
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
