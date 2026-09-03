package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ko implements org.telegram.ui.ActionBar.c2, MessagesStorage.LongCallback, xc0, MessagesStorage.BooleanCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ro b;

    public /* synthetic */ ko(ro roVar, int i10) {
        this.a = i10;
        this.b = roVar;
    }

    @Override // org.telegram.ui.xc0
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        ro roVar = this.b;
        TLRPC.ChatFull chatFull = roVar.v0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        roVar.p0(false, true);
        roVar.getMessagesController().loadFullChat(roVar.t0, 0, true);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
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
    public void run(boolean z4) {
        ro roVar = this.b;
        roVar.getClass();
        if (AndroidUtilities.isTablet()) {
            roVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-roVar.t0));
        } else {
            roVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        roVar.finishFragment();
        roVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-roVar.u0.id), null, roVar.u0, Boolean.valueOf(z4));
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        switch (this.a) {
            case 4:
                this.b.t0(Long.valueOf(j10));
                break;
            default:
                ro roVar = this.b;
                if (j10 == 0) {
                    roVar.K0 = false;
                    break;
                } else {
                    roVar.t0 = j10;
                    roVar.u0 = roVar.getMessagesController().getChat(Long.valueOf(j10));
                    roVar.K0 = false;
                    TLRPC.ChatFull chatFull = roVar.v0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    roVar.j0();
                    break;
                }
        }
    }
}
