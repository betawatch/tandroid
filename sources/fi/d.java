package fi;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.a2;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements MessagesStorage.LongCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ a2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    public /* synthetic */ d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, a2 a2Var, long j3, boolean z10, int i10) {
        this.a = i10;
        this.e = notificationCenterDelegate;
        this.b = a2Var;
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
