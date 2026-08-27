package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bo implements org.telegram.ui.ActionBar.a2, MessagesStorage.LongCallback, oc0, MessagesStorage.BooleanCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ jo b;

    public /* synthetic */ bo(jo joVar, int i10) {
        this.a = i10;
        this.b = joVar;
    }

    @Override // org.telegram.ui.oc0
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        jo joVar = this.b;
        TLRPC.ChatFull chatFull = joVar.u0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        joVar.p0(false, true);
        joVar.getMessagesController().loadFullChat(joVar.s0, 0, true);
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
        jo joVar = this.b;
        joVar.getClass();
        if (AndroidUtilities.isTablet()) {
            joVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-joVar.s0));
        } else {
            joVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        joVar.finishFragment();
        joVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-joVar.t0.id), null, joVar.t0, Boolean.valueOf(z10));
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        switch (this.a) {
            case 4:
                this.b.t0(Long.valueOf(j10));
                break;
            default:
                jo joVar = this.b;
                if (j10 == 0) {
                    joVar.J0 = false;
                    break;
                } else {
                    joVar.s0 = j10;
                    joVar.t0 = joVar.getMessagesController().getChat(Long.valueOf(j10));
                    joVar.J0 = false;
                    TLRPC.ChatFull chatFull = joVar.u0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    joVar.j0();
                    break;
                }
        }
    }
}
