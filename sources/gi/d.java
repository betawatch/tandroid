package gi;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.a2;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements MessagesStorage.LongCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ a2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    public /* synthetic */ d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, a2 a2Var, long j10, boolean z10, int i10) {
        this.a = i10;
        this.e = notificationCenterDelegate;
        this.b = a2Var;
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
                    fVar.W(this.c, this.d);
                    break;
                }
                break;
            default:
                k0.r((k0) this.e, this.b, this.c, this.d, j10);
                break;
        }
    }
}
