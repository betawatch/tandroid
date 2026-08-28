package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ao implements org.telegram.ui.ActionBar.b2, MessagesStorage.LongCallback, kc0, MessagesStorage.BooleanCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ho b;

    public /* synthetic */ ao(ho hoVar, int i9) {
        this.a = i9;
        this.b = hoVar;
    }

    @Override // org.telegram.ui.kc0
    public void d(TLRPC.MessageMedia messageMedia, int i9, boolean z10, int i10, long j10) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        ho hoVar = this.b;
        TLRPC.ChatFull chatFull = hoVar.u0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        hoVar.o0(false, true);
        hoVar.getMessagesController().loadFullChat(hoVar.s0, 0, true);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 0:
                this.b.i0();
                break;
            case 1:
                this.b.finishFragment();
                break;
            case 2:
                this.b.i0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public void run(boolean z10) {
        ho hoVar = this.b;
        hoVar.getClass();
        if (AndroidUtilities.isTablet()) {
            hoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-hoVar.s0));
        } else {
            hoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        hoVar.finishFragment();
        hoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-hoVar.t0.id), null, hoVar.t0, Boolean.valueOf(z10));
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        switch (this.a) {
            case 4:
                this.b.s0(Long.valueOf(j10));
                break;
            default:
                ho hoVar = this.b;
                if (j10 == 0) {
                    hoVar.J0 = false;
                    break;
                } else {
                    hoVar.s0 = j10;
                    hoVar.t0 = hoVar.getMessagesController().getChat(Long.valueOf(j10));
                    hoVar.J0 = false;
                    TLRPC.ChatFull chatFull = hoVar.u0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    hoVar.i0();
                    break;
                }
        }
    }
}
