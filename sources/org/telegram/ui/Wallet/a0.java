package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.wb0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class a0 implements Runnable, NotificationCenter.NotificationCenterDelegate {
    public boolean a;
    public final /* synthetic */ NotificationCenter b;
    public final /* synthetic */ wb0 c;
    public final /* synthetic */ l0 d;

    public a0(NotificationCenter notificationCenter, wb0 wb0Var, l0 l0Var) {
        this.b = notificationCenter;
        this.c = wb0Var;
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
