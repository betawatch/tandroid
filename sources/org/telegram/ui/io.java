package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class io implements org.telegram.ui.ActionBar.c2, MessagesStorage.LongCallback, wc0, MessagesStorage.BooleanCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ po b;

    public /* synthetic */ io(po poVar, int i10) {
        this.a = i10;
        this.b = poVar;
    }

    @Override // org.telegram.ui.wc0
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        po poVar = this.b;
        TLRPC.ChatFull chatFull = poVar.v0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        poVar.p0(false, true);
        poVar.getMessagesController().loadFullChat(poVar.t0, 0, true);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
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
        po poVar = this.b;
        poVar.getClass();
        if (AndroidUtilities.isTablet()) {
            poVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-poVar.t0));
        } else {
            poVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        poVar.finishFragment();
        poVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-poVar.u0.id), null, poVar.u0, Boolean.valueOf(z4));
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        switch (this.a) {
            case 4:
                this.b.t0(Long.valueOf(j10));
                break;
            default:
                po poVar = this.b;
                if (j10 == 0) {
                    poVar.K0 = false;
                    break;
                } else {
                    poVar.t0 = j10;
                    poVar.u0 = poVar.getMessagesController().getChat(Long.valueOf(j10));
                    poVar.K0 = false;
                    TLRPC.ChatFull chatFull = poVar.v0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    poVar.j0();
                    break;
                }
        }
    }
}
