package org.telegram.ui.Wallet;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.b80;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class b0 implements Runnable, NotificationCenter.NotificationCenterDelegate {
    public boolean a;
    public final /* synthetic */ NotificationCenter b;
    public final /* synthetic */ b80 c;
    public final /* synthetic */ m0 d;

    public b0(NotificationCenter notificationCenter, b80 b80Var, m0 m0Var) {
        this.b = notificationCenter;
        this.c = b80Var;
        this.d = m0Var;
    }

    public final void a() {
        if (this.a) {
            return;
        }
        m0 m0Var = this.d;
        if (m0Var.e == null) {
            return;
        }
        ArrayList arrayList = m0Var.G;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((i0) obj).d) {
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
