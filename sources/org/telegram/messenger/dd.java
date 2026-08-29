package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class dd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    public /* synthetic */ dd(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, boolean z10, boolean z11, long j10, int i10) {
        this.a = i10;
        this.e = notificationCenterDelegate;
        this.c = z10;
        this.d = z11;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MessagesController) this.e).lambda$setLastCreatedDialogId$55(this.c, this.d, this.b);
                break;
            case 1:
                tn.c1((tn) this.e, this.b, this.c, this.d);
                break;
            case 2:
                qh.n nVar = (qh.n) this.e;
                org.telegram.ui.Components.c5.v0(nVar, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), LocaleController.getString(this.c ? R.string.CommunityMenuRemoveBotFromCommunityConfirm : this.d ? R.string.CommunityMenuRemoveChannelFromCommunityConfirm : R.string.CommunityMenuRemoveGroupFromCommunityConfirm), LocaleController.getString(R.string.Remove), true, new qh.h(nVar, this.b, 0));
                break;
            default:
                qh.i0.q((qh.i0) this.e, this.c, this.d, this.b);
                break;
        }
    }

    public /* synthetic */ dd(tn tnVar, long j10, boolean z10, boolean z11) {
        this.a = 1;
        this.e = tnVar;
        this.b = j10;
        this.c = z10;
        this.d = z11;
    }
}
