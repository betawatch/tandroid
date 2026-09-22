package fi;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d5;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                d5.v0(pVar, LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity), LocaleController.getString(this.b ? R.string.CommunityMenuRemoveBotFromCommunityConfirm : this.c ? R.string.CommunityMenuRemoveChannelFromCommunityConfirm : R.string.CommunityMenuRemoveGroupFromCommunityConfirm), LocaleController.getString(R.string.Remove), true, new g(pVar, this.d, 0));
                break;
            case 1:
                k0.q((k0) this.e, this.b, this.c, this.d);
                break;
            case 2:
                ((MessagesController) this.e).lambda$setLastCreatedDialogId$55(this.b, this.c, this.d);
                break;
            default:
                zn.Q0((zn) this.e, this.d, this.b, this.c);
                break;
        }
    }

    public /* synthetic */ l(zn znVar, long j3, boolean z10, boolean z11) {
        this.a = 3;
        this.e = znVar;
        this.d = j3;
        this.b = z10;
        this.c = z11;
    }
}
