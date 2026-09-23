package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class jo implements org.telegram.ui.ActionBar.a2, MessagesStorage.LongCallback, yc0, MessagesStorage.BooleanCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ so b;

    public /* synthetic */ jo(so soVar, int i10) {
        this.a = i10;
        this.b = soVar;
    }

    @Override // org.telegram.ui.yc0
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        so soVar = this.b;
        TLRPC.ChatFull chatFull = soVar.y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        soVar.p0(false, true);
        soVar.getMessagesController().loadFullChat(soVar.w0, 0, true);
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
        so soVar = this.b;
        soVar.getClass();
        if (AndroidUtilities.isTablet()) {
            soVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-soVar.w0));
        } else {
            soVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        soVar.finishFragment();
        soVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-soVar.x0.id), null, soVar.x0, Boolean.valueOf(z10));
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j3) {
        switch (this.a) {
            case 4:
                this.b.t0(Long.valueOf(j3));
                break;
            default:
                so soVar = this.b;
                if (j3 == 0) {
                    soVar.N0 = false;
                    break;
                } else {
                    soVar.w0 = j3;
                    soVar.x0 = soVar.getMessagesController().getChat(Long.valueOf(j3));
                    soVar.N0 = false;
                    TLRPC.ChatFull chatFull = soVar.y0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    soVar.j0();
                    break;
                }
        }
    }
}
