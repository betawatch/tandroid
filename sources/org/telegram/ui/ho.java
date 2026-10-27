package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ho implements org.telegram.ui.ActionBar.b2, MessagesStorage.LongCallback, mc0, MessagesStorage.BooleanCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ oo b;

    public /* synthetic */ ho(oo ooVar, int i10) {
        this.a = i10;
        this.b = ooVar;
    }

    @Override // org.telegram.ui.mc0
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        oo ooVar = this.b;
        TLRPC.ChatFull chatFull = ooVar.x0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        ooVar.q0(false, true);
        ooVar.getMessagesController().loadFullChat(ooVar.v0, 0, true);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.k0();
                break;
            case 1:
                this.b.finishFragment();
                break;
            case 2:
                this.b.k0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        oo ooVar = this.b;
        ooVar.getClass();
        if (AndroidUtilities.isTablet()) {
            ooVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-ooVar.v0));
        } else {
            ooVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        ooVar.finishFragment();
        ooVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-ooVar.w0.id), null, ooVar.w0, Boolean.valueOf(z10));
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        switch (this.a) {
            case 4:
                this.b.u0(Long.valueOf(j10));
                break;
            default:
                oo ooVar = this.b;
                if (j10 == 0) {
                    ooVar.M0 = false;
                    break;
                } else {
                    ooVar.v0 = j10;
                    ooVar.w0 = ooVar.getMessagesController().getChat(Long.valueOf(j10));
                    ooVar.M0 = false;
                    TLRPC.ChatFull chatFull = ooVar.x0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    ooVar.k0();
                    break;
                }
        }
    }
}
