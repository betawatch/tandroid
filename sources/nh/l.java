package nh;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.y4;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    public /* synthetic */ l(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, boolean z10, boolean z11, long j10, int i9) {
        this.a = i9;
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
                y4.v0(oVar, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), LocaleController.getString(this.b ? R.string.CommunityMenuRemoveBotFromCommunityConfirm : this.c ? R.string.CommunityMenuRemoveChannelFromCommunityConfirm : R.string.CommunityMenuRemoveGroupFromCommunityConfirm), LocaleController.getString(R.string.Remove), true, new g(oVar, this.d, 0));
                break;
            case 1:
                j0.q((j0) this.e, this.b, this.c, this.d);
                break;
            case 2:
                ((MessagesController) this.e).lambda$setLastCreatedDialogId$55(this.b, this.c, this.d);
                break;
            default:
                qn.c1((qn) this.e, this.d, this.b, this.c);
                break;
        }
    }

    public /* synthetic */ l(qn qnVar, long j10, boolean z10, boolean z11) {
        this.a = 3;
        this.e = qnVar;
        this.d = j10;
        this.b = z10;
        this.c = z11;
    }
}
