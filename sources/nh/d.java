package nh;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.c2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements MessagesStorage.LongCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ c2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    public /* synthetic */ d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, c2 c2Var, long j10, boolean z10, int i9) {
        this.a = i9;
        this.e = notificationCenterDelegate;
        this.b = c2Var;
        this.c = j10;
        this.d = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public final void run(long j10) {
        switch (this.a) {
            case 0:
                f fVar = (f) this.e;
                fVar.getClass();
                this.b.dismiss();
                if (j10 != 0) {
                    fVar.a = -j10;
                    fVar.b = fVar.getMessagesController().getChat(Long.valueOf(j10));
                    fVar.V(this.c, this.d);
                    break;
                }
                break;
            default:
                j0.p((j0) this.e, this.b, this.c, this.d, j10);
                break;
        }
    }
}
