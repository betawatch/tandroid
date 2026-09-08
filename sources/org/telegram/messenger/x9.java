package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class x9 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;

    public /* synthetic */ x9(MessagesController messagesController, long j3, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = j3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                this.b.lambda$markMessageAsRead2$235(this.c, tLObject, tL_error);
                break;
            case 1:
                this.b.lambda$markMessageAsRead2$236(this.c, tLObject, tL_error);
                break;
            case 2:
                this.b.lambda$pinDialog$364(this.c, tLObject, tL_error);
                break;
            case 3:
                this.b.lambda$saveWallpaperToServer$121(this.c, tLObject, tL_error);
                break;
            case 4:
                this.b.lambda$updateTimerProc$160(this.c, tLObject, tL_error);
                break;
            case 5:
                this.b.lambda$deleteUserPhoto$115(this.c, tLObject, tL_error);
                break;
            case 6:
                this.b.lambda$reorderPinnedDialogs$363(this.c, tLObject, tL_error);
                break;
            case 7:
                this.b.lambda$loadPeerSettings$80(this.c, tLObject, tL_error);
                break;
            case 8:
                this.b.lambda$setChannelSlowMode$94(this.c, tLObject, tL_error);
                break;
            case 9:
                this.b.lambda$loadChannelAdmins$65(this.c, tLObject, tL_error);
                break;
            case 10:
                this.b.lambda$deleteDialog$141(this.c, tLObject, tL_error);
                break;
            case 11:
                this.b.lambda$addDialogToFolder$198(this.c, tLObject, tL_error);
                break;
            case 12:
                this.b.lambda$setDefaultSendAs$275(this.c, tLObject, tL_error);
                break;
            case 13:
                this.b.lambda$deleteMessages$122(this.c, tLObject, tL_error);
                break;
            case 14:
                this.b.lambda$deleteMessages$123(this.c, tLObject, tL_error);
                break;
            case 15:
                this.b.lambda$deleteMessages$125(this.c, tLObject, tL_error);
                break;
            case 16:
                this.b.lambda$setBoostsToUnblockRestrictions$96(this.c, tLObject, tL_error);
                break;
            default:
                this.b.lambda$markDialogAsUnread$360(this.c, tLObject, tL_error);
                break;
        }
    }
}
