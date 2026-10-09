package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class z9 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ long c;

    public /* synthetic */ z9(MessagesController messagesController, long j3, int i10) {
        this.a = i10;
        this.b = messagesController;
        this.c = j3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                this.b.lambda$markMessageAsRead2$234(this.c, tLObject, tL_error);
                break;
            case 1:
                this.b.lambda$markMessageAsRead2$235(this.c, tLObject, tL_error);
                break;
            case 2:
                this.b.lambda$pinDialog$363(this.c, tLObject, tL_error);
                break;
            case 3:
                this.b.lambda$saveWallpaperToServer$120(this.c, tLObject, tL_error);
                break;
            case 4:
                this.b.lambda$updateTimerProc$159(this.c, tLObject, tL_error);
                break;
            case 5:
                this.b.lambda$deleteUserPhoto$114(this.c, tLObject, tL_error);
                break;
            case 6:
                this.b.lambda$reorderPinnedDialogs$362(this.c, tLObject, tL_error);
                break;
            case 7:
                this.b.lambda$loadPeerSettings$79(this.c, tLObject, tL_error);
                break;
            case 8:
                this.b.lambda$setChannelSlowMode$93(this.c, tLObject, tL_error);
                break;
            case 9:
                this.b.lambda$loadChannelAdmins$64(this.c, tLObject, tL_error);
                break;
            case 10:
                this.b.lambda$deleteDialog$140(this.c, tLObject, tL_error);
                break;
            case 11:
                this.b.lambda$addDialogToFolder$197(this.c, tLObject, tL_error);
                break;
            case 12:
                this.b.lambda$setDefaultSendAs$274(this.c, tLObject, tL_error);
                break;
            case 13:
                this.b.lambda$deleteMessages$121(this.c, tLObject, tL_error);
                break;
            case 14:
                this.b.lambda$deleteMessages$122(this.c, tLObject, tL_error);
                break;
            case 15:
                this.b.lambda$deleteMessages$124(this.c, tLObject, tL_error);
                break;
            case 16:
                this.b.lambda$setBoostsToUnblockRestrictions$95(this.c, tLObject, tL_error);
                break;
            default:
                this.b.lambda$markDialogAsUnread$359(this.c, tLObject, tL_error);
                break;
        }
    }
}
