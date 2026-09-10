package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class po implements org.telegram.ui.ActionBar.c2, MessagesStorage.LongCallback, dd0, MessagesStorage.BooleanCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ yo b;

    public /* synthetic */ po(yo yoVar, int i10) {
        this.a = i10;
        this.b = yoVar;
    }

    @Override // org.telegram.ui.dd0
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        yo yoVar = this.b;
        TLRPC.ChatFull chatFull = yoVar.y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        yoVar.p0(false, true);
        yoVar.getMessagesController().loadFullChat(yoVar.w0, 0, true);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
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
        yo yoVar = this.b;
        yoVar.getClass();
        if (AndroidUtilities.isTablet()) {
            yoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-yoVar.w0));
        } else {
            yoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        yoVar.finishFragment();
        yoVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-yoVar.x0.id), null, yoVar.x0, Boolean.valueOf(z10));
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j3) {
        switch (this.a) {
            case 4:
                this.b.t0(Long.valueOf(j3));
                break;
            default:
                yo yoVar = this.b;
                if (j3 == 0) {
                    yoVar.N0 = false;
                    break;
                } else {
                    yoVar.w0 = j3;
                    yoVar.x0 = yoVar.getMessagesController().getChat(Long.valueOf(j3));
                    yoVar.N0 = false;
                    TLRPC.ChatFull chatFull = yoVar.y0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    yoVar.j0();
                    break;
                }
        }
    }
}
