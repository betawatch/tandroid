package ii;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.e2;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements MessagesStorage.LongCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ e2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    public /* synthetic */ d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, e2 e2Var, long j10, boolean z10, int i10) {
        this.a = i10;
        this.e = notificationCenterDelegate;
        this.b = e2Var;
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
                    fVar.X(this.c, this.d);
                    break;
                }
                break;
            default:
                j0.p((j0) this.e, this.b, this.c, this.d, j10);
                break;
        }
    }
}
