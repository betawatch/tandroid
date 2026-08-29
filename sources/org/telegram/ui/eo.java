package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eo implements org.telegram.ui.ActionBar.b2, MessagesStorage.LongCallback, mc0, MessagesStorage.BooleanCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ko b;

    public /* synthetic */ eo(ko koVar, int i10) {
        this.a = i10;
        this.b = koVar;
    }

    @Override // org.telegram.ui.mc0
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        ko koVar = this.b;
        TLRPC.ChatFull chatFull = koVar.u0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        koVar.p0(false, true);
        koVar.getMessagesController().loadFullChat(koVar.s0, 0, true);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
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
        ko koVar = this.b;
        koVar.getClass();
        if (AndroidUtilities.isTablet()) {
            koVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-koVar.s0));
        } else {
            koVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        koVar.finishFragment();
        koVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-koVar.t0.id), null, koVar.t0, Boolean.valueOf(z10));
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        switch (this.a) {
            case 4:
                this.b.t0(Long.valueOf(j10));
                break;
            default:
                ko koVar = this.b;
                if (j10 == 0) {
                    koVar.J0 = false;
                    break;
                } else {
                    koVar.s0 = j10;
                    koVar.t0 = koVar.getMessagesController().getChat(Long.valueOf(j10));
                    koVar.J0 = false;
                    TLRPC.ChatFull chatFull = koVar.u0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    koVar.j0();
                    break;
                }
        }
    }
}
