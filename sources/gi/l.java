package gi;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.e5;
import org.telegram.ui.co;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    public /* synthetic */ l(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, boolean z10, boolean z11, long j3, int i10) {
        this.a = i10;
        this.e = notificationCenterDelegate;
        this.b = z10;
        this.c = z11;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p pVar = (p) this.e;
                e5.v0(pVar, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), LocaleController.getString(this.b ? R.string.CommunityMenuRemoveBotFromCommunityConfirm : this.c ? R.string.CommunityMenuRemoveChannelFromCommunityConfirm : R.string.CommunityMenuRemoveGroupFromCommunityConfirm), LocaleController.getString(R.string.Remove), true, new g(pVar, this.d, 0));
                break;
            case 1:
                k0.q((k0) this.e, this.b, this.c, this.d);
                break;
            case 2:
                ((MessagesController) this.e).lambda$setLastCreatedDialogId$55(this.b, this.c, this.d);
                break;
            default:
                co.c1((co) this.e, this.d, this.b, this.c);
                break;
        }
    }

    public /* synthetic */ l(co coVar, long j3, boolean z10, boolean z11) {
        this.a = 3;
        this.e = coVar;
        this.d = j3;
        this.b = z10;
        this.c = z11;
    }
}
