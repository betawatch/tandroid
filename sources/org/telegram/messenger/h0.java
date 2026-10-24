package org.telegram.messenger;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h0(Object obj, int i10) {
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
                ((DownloadController) this.b).lambda$loadAutoDownloadConfig$2(tLObject, tL_error);
                break;
            case 2:
                ((FileLoadOperation) this.b).lambda$requestFileOffsets$22(tLObject, tL_error);
                break;
            case 3:
                MessagesController.lambda$unblockPeer$110((Runnable) this.b, tLObject, tL_error);
                break;
            case 4:
                MessagesController.lambda$checkIsInChat$476((MessagesController.IsInChatCheckedCallback) this.b, tLObject, tL_error);
                break;
            case 5:
                ((MessagesController.SavedMusicIds) this.b).lambda$load$1(tLObject, tL_error);
                break;
            case 6:
                ((MessagesController.SavedMusicList) this.b).lambda$load$1(tLObject, tL_error);
                break;
            case 7:
                ((TopicsController) this.b).lambda$toggleViewForumAsMessages$18(tLObject, tL_error);
                break;
            default:
                ((UserConfig) this.b).lambda$loadGlobalTTl$4(tLObject, tL_error);
                break;
        }
    }
}
