package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class ao implements org.telegram.ui.ActionBar.a2, MessagesStorage.LongCallback, ic0, MessagesStorage.BooleanCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ io b;

    public /* synthetic */ ao(io ioVar, int i10) {
        this.a = i10;
        this.b = ioVar;
    }

    @Override // org.telegram.ui.ic0
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        io ioVar = this.b;
        TLRPC.ChatFull chatFull = ioVar.y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        ioVar.p0(false, true);
        ioVar.getMessagesController().loadFullChat(ioVar.w0, 0, true);
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
        io ioVar = this.b;
        ioVar.getClass();
        if (AndroidUtilities.isTablet()) {
            ioVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-ioVar.w0));
        } else {
            ioVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        ioVar.finishFragment();
        ioVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-ioVar.x0.id), null, ioVar.x0, Boolean.valueOf(z10));
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j10) {
        switch (this.a) {
            case 4:
                this.b.t0(Long.valueOf(j10));
                break;
            default:
                io ioVar = this.b;
                if (j10 == 0) {
                    ioVar.N0 = false;
                    break;
                } else {
                    ioVar.w0 = j10;
                    ioVar.x0 = ioVar.getMessagesController().getChat(Long.valueOf(j10));
                    ioVar.N0 = false;
                    TLRPC.ChatFull chatFull = ioVar.y0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    ioVar.j0();
                    break;
                }
        }
    }
}
