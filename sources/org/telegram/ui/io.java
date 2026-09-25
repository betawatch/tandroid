package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class io implements org.telegram.ui.ActionBar.z1, MessagesStorage.LongCallback, xc0, MessagesStorage.BooleanCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ro b;

    public /* synthetic */ io(ro roVar, int i10) {
        this.a = i10;
        this.b = roVar;
    }

    @Override // org.telegram.ui.xc0
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
        tL_channelLocation.address = messageMedia.address;
        tL_channelLocation.geo_point = messageMedia.geo;
        ro roVar = this.b;
        TLRPC.ChatFull chatFull = roVar.y0;
        chatFull.location = tL_channelLocation;
        chatFull.flags |= 32768;
        roVar.p0(false, true);
        roVar.getMessagesController().loadFullChat(roVar.w0, 0, true);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
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
        ro roVar = this.b;
        roVar.getClass();
        if (AndroidUtilities.isTablet()) {
            roVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(-roVar.w0));
        } else {
            roVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        }
        roVar.finishFragment();
        roVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-roVar.x0.id), null, roVar.x0, Boolean.valueOf(z10));
    }

    @Override // org.telegram.messenger.MessagesStorage.LongCallback
    public void run(long j3) {
        switch (this.a) {
            case 4:
                this.b.t0(Long.valueOf(j3));
                break;
            default:
                ro roVar = this.b;
                if (j3 == 0) {
                    roVar.N0 = false;
                    break;
                } else {
                    roVar.w0 = j3;
                    roVar.x0 = roVar.getMessagesController().getChat(Long.valueOf(j3));
                    roVar.N0 = false;
                    TLRPC.ChatFull chatFull = roVar.y0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    roVar.j0();
                    break;
                }
        }
    }
}
