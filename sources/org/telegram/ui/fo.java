package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fo implements org.telegram.ui.ActionBar.b2, MessagesStorage.LongCallback, kc0, MessagesStorage.BooleanCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ mo b;

    public /* synthetic */ fo(mo moVar, int i10) {
        this.a = i10;
        this.b = moVar;
    }

    @Override // org.telegram.ui.kc0
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        mo moVar = this.b;
        TLRPC.ChatFull chatFull = moVar.x0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        moVar.q0(false, true);
        moVar.getMessagesController().loadFullChat(moVar.v0, 0, true);
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
        mo moVar = this.b;
        moVar.getClass();
        if (AndroidUtilities.isTablet()) {
            moVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-moVar.v0));
        } else {
            moVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        moVar.finishFragment();
        moVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-moVar.w0.id), null, moVar.w0, Boolean.valueOf(z10));
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        switch (this.a) {
            case 4:
                this.b.u0(Long.valueOf(j10));
                break;
            default:
                mo moVar = this.b;
                if (j10 == 0) {
                    moVar.M0 = false;
                    break;
                } else {
                    moVar.v0 = j10;
                    moVar.w0 = moVar.getMessagesController().getChat(Long.valueOf(j10));
                    moVar.M0 = false;
                    TLRPC.ChatFull chatFull = moVar.x0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    moVar.k0();
                    break;
                }
        }
    }
}
