package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class ed implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate e;

    public /* synthetic */ ed(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, boolean z4, boolean z10, long j10, int i10) {
        this.a = i10;
        this.e = notificationCenterDelegate;
        this.c = z4;
        this.d = z10;
        this.b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MessagesController) this.e).lambda$setLastCreatedDialogId$55(this.c, this.d, this.b);
                break;
            case 1:
                xn.c1((xn) this.e, this.b, this.c, this.d);
                break;
            case 2:
                sh.n nVar = (sh.n) this.e;
                org.telegram.ui.Components.z4.v0(nVar, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), LocaleController.getString(this.c ? R.string.CommunityMenuRemoveBotFromCommunityConfirm : this.d ? R.string.CommunityMenuRemoveChannelFromCommunityConfirm : R.string.CommunityMenuRemoveGroupFromCommunityConfirm), LocaleController.getString(R.string.Remove), true, new sh.h(nVar, this.b, 0));
                break;
            default:
                sh.i0.q((sh.i0) this.e, this.c, this.d, this.b);
                break;
        }
    }

    public /* synthetic */ ed(xn xnVar, long j10, boolean z4, boolean z10) {
        this.a = 1;
        this.e = xnVar;
        this.b = j10;
        this.c = z4;
        this.d = z10;
    }
}
