package fi;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.c2;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements MessagesStorage.LongCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ c2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    public /* synthetic */ d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, c2 c2Var, long j3, boolean z10, int i10) {
        this.a = i10;
        this.e = notificationCenterDelegate;
        this.b = c2Var;
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
