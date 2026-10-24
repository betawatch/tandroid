package hi;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.c2;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements MessagesStorage.LongCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ c2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    public /* synthetic */ d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, c2 c2Var, long j10, boolean z10, int i10) {
        this.a = i10;
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
                    fVar.b = -j10;
                    fVar.c = fVar.getMessagesController().getChat(Long.valueOf(j10));
                    fVar.W(this.c, this.d);
                    break;
                }
                break;
            default:
                k0.q((k0) this.e, this.b, this.c, this.d, j10);
                break;
        }
    }
}
