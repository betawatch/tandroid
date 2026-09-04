package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class oo implements org.telegram.ui.ActionBar.a2, MessagesStorage.LongCallback, dd0, MessagesStorage.BooleanCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ xo b;

    public /* synthetic */ oo(xo xoVar, int i10) {
        this.a = i10;
        this.b = xoVar;
    }

    @Override // org.telegram.ui.dd0
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        xo xoVar = this.b;
        TLRPC.ChatFull chatFull = xoVar.y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        xoVar.p0(false, true);
        xoVar.getMessagesController().loadFullChat(xoVar.w0, 0, true);
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
        xo xoVar = this.b;
        xoVar.getClass();
        if (AndroidUtilities.isTablet()) {
            xoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-xoVar.w0));
        } else {
            xoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        xoVar.finishFragment();
        xoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-xoVar.x0.id), null, xoVar.x0, Boolean.valueOf(z10));
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j3) {
        switch (this.a) {
            case 4:
                this.b.t0(Long.valueOf(j3));
                break;
            default:
                xo xoVar = this.b;
                if (j3 == 0) {
                    xoVar.N0 = false;
                    break;
                } else {
                    xoVar.w0 = j3;
                    xoVar.x0 = xoVar.getMessagesController().getChat(Long.valueOf(j3));
                    xoVar.N0 = false;
                    TLRPC.ChatFull chatFull = xoVar.y0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    xoVar.j0();
                    break;
                }
        }
    }
}
