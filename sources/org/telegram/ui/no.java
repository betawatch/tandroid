package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class no implements org.telegram.ui.ActionBar.a2, MessagesStorage.LongCallback, dd0, MessagesStorage.BooleanCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ wo b;

    public /* synthetic */ no(wo woVar, int i10) {
        this.a = i10;
        this.b = woVar;
    }

    @Override // org.telegram.ui.dd0
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        wo woVar = this.b;
        TLRPC.ChatFull chatFull = woVar.y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        woVar.p0(false, true);
        woVar.getMessagesController().loadFullChat(woVar.w0, 0, true);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.j0();
                break;
            case 1:
                this.b.finishFragment();
                break;
            case 2:
                this.b.j0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        wo woVar = this.b;
        woVar.getClass();
        if (AndroidUtilities.isTablet()) {
            woVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-woVar.w0));
        } else {
            woVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        woVar.finishFragment();
        woVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-woVar.x0.id), null, woVar.x0, Boolean.valueOf(z10));
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j3) {
        switch (this.a) {
            case 4:
                this.b.t0(Long.valueOf(j3));
                break;
            default:
                wo woVar = this.b;
                if (j3 == 0) {
                    woVar.N0 = false;
                    break;
                } else {
                    woVar.w0 = j3;
                    woVar.x0 = woVar.getMessagesController().getChat(Long.valueOf(j3));
                    woVar.N0 = false;
                    TLRPC.ChatFull chatFull = woVar.y0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    woVar.j0();
                    break;
                }
        }
    }
}
