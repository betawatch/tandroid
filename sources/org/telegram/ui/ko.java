package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class ko implements org.telegram.ui.ActionBar.a2, MessagesStorage.LongCallback, bd0, MessagesStorage.BooleanCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ to b;

    public /* synthetic */ ko(to toVar, int i10) {
        this.a = i10;
        this.b = toVar;
    }

    @Override // org.telegram.ui.bd0
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        to toVar = this.b;
        TLRPC.ChatFull chatFull = toVar.y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        toVar.p0(false, true);
        toVar.getMessagesController().loadFullChat(toVar.w0, 0, true);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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
        to toVar = this.b;
        toVar.getClass();
        if (AndroidUtilities.isTablet()) {
            toVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-toVar.w0));
        } else {
            toVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        toVar.finishFragment();
        toVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-toVar.x0.id), null, toVar.x0, Boolean.valueOf(z10));
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j3) {
        switch (this.a) {
            case 4:
                this.b.t0(Long.valueOf(j3));
                break;
            default:
                to toVar = this.b;
                if (j3 == 0) {
                    toVar.N0 = false;
                    break;
                } else {
                    toVar.w0 = j3;
                    toVar.x0 = toVar.getMessagesController().getChat(Long.valueOf(j3));
                    toVar.N0 = false;
                    TLRPC.ChatFull chatFull = toVar.y0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    toVar.j0();
                    break;
                }
        }
    }
}
