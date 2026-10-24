package gi;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class e1 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ c1 d;

    public e1(long j10, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr, int i10, c1 c1Var) {
        this.a = j10;
        this.b = notificationCenterDelegateArr;
        this.c = i10;
        this.d = c1Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a0.h hVar;
        int i12 = NotificationCenter.didReceivedWebpagesInUpdates;
        if (i10 != i12 || (hVar = (a0.h) objArr[0]) == null) {
            return;
        }
        long j10 = this.a;
        if (hVar.d(j10)) {
            TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.f(j10);
            NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = this.b;
            if (notificationCenterDelegateArr[0] != null) {
                NotificationCenter.getInstance(this.c).addObserver(notificationCenterDelegateArr[0], i12);
                notificationCenterDelegateArr[0] = null;
            }
            if (!(webPage instanceof TLRPC.TL_webPage)) {
                webPage = null;
            }
            this.d.run(webPage);
        }
    }
}
