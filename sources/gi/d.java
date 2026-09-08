package gi;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.b2;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements MessagesStorage.LongCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ b2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    public /* synthetic */ d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, b2 b2Var, long j3, boolean z10, int i10) {
        this.a = i10;
        this.e = notificationCenterDelegate;
        this.b = b2Var;
        this.c = j3;
        this.d = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public final void run(long j3) {
        switch (this.a) {
            case 0:
                f fVar = (f) this.e;
                fVar.getClass();
                this.b.dismiss();
                if (j3 != 0) {
                    fVar.a = -j3;
                    fVar.b = fVar.getMessagesController().getChat(Long.valueOf(j3));
                    fVar.W(this.c, this.d);
                    break;
                }
                break;
            default:
                k0.p((k0) this.e, this.b, this.c, this.d, j3);
                break;
        }
    }
}
