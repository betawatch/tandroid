package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((BirthdayController) this.b).lambda$check$3(tLObject, tL_error);
                break;
            case 1:
                ChannelBoostsController.lambda$getBoostsStats$1((e2.h) this.b, tLObject, tL_error);
                break;
            case 2:
                ((DownloadController) this.b).lambda$loadAutoDownloadConfig$2(tLObject, tL_error);
                break;
            case 3:
                ((FileLoadOperation) this.b).lambda$requestFileOffsets$21(tLObject, tL_error);
                break;
            case 4:
                MessagesController.lambda$unblockPeer$111((Runnable) this.b, tLObject, tL_error);
                break;
            case 5:
                MessagesController.lambda$getChannelParticipant$472((Utilities.Callback) this.b, tLObject, tL_error);
                break;
            case 6:
                MessagesController.lambda$checkIsInChat$473((MessagesController.IsInChatCheckedCallback) this.b, tLObject, tL_error);
                break;
            case 7:
                ((MessagesController.SavedMusicIds) this.b).lambda$load$1(tLObject, tL_error);
                break;
            case 8:
                ((MessagesController.SavedMusicList) this.b).lambda$load$1(tLObject, tL_error);
                break;
            case 9:
                ((TopicsController) this.b).lambda$toggleViewForumAsMessages$18(tLObject, tL_error);
                break;
            default:
                ((UserConfig) this.b).lambda$loadGlobalTTl$4(tLObject, tL_error);
                break;
        }
    }
}
