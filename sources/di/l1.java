package di;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class l1 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ i1 d;

    public l1(long j3, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr, int i10, i1 i1Var) {
        this.a = j3;
        this.b = notificationCenterDelegateArr;
        this.c = i10;
        this.d = i1Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a0.i iVar;
        int i12 = NotificationCenter.didReceivedWebpagesInUpdates;
        if (i10 != i12 || (iVar = (a0.i) objArr[0]) == null) {
            return;
        }
        long j3 = this.a;
        if (iVar.d(j3)) {
            TLRPC.WebPage webPage = (TLRPC.WebPage) iVar.f(j3);
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
