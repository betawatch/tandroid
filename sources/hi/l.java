package hi;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.f5;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    public /* synthetic */ l(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, boolean z10, boolean z11, long j10, int i10) {
        this.a = i10;
        this.e = notificationCenterDelegate;
        this.b = z10;
        this.c = z11;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o oVar = (o) this.e;
                f5.u0(oVar, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), LocaleController.getString(this.b ? R.string.CommunityMenuRemoveBotFromCommunityConfirm : this.c ? R.string.CommunityMenuRemoveChannelFromCommunityConfirm : R.string.CommunityMenuRemoveGroupFromCommunityConfirm), LocaleController.getString(R.string.Remove), true, new g(oVar, this.d, 0));
                break;
            case 1:
                k0.r((k0) this.e, this.b, this.c, this.d);
                break;
            case 2:
                ((MessagesController) this.e).lambda$setLastCreatedDialogId$54(this.b, this.c, this.d);
                break;
            default:
                sn.F0((sn) this.e, this.d, this.b, this.c);
                break;
        }
    }

    public /* synthetic */ l(sn snVar, long j10, boolean z10, boolean z11) {
        this.a = 3;
        this.e = snVar;
        this.d = j10;
        this.b = z10;
        this.c = z11;
    }
}
