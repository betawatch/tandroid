package fi;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class i1 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ f1 d;

    public i1(long j3, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr, int i10, f1 f1Var) {
        this.a = j3;
        this.b = notificationCenterDelegateArr;
        this.c = i10;
        this.d = f1Var;
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
