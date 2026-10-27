package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class l5 implements RequestDelegate {
    public final /* synthetic */ int a;

    public /* synthetic */ l5(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ImageLoader.HttpImageTask.lambda$doInBackground$2(tLObject, tL_error);
                break;
            case 1:
                ChatThemeController.lambda$clearWallpaper$15(tLObject, tL_error);
                break;
            case 2:
                ContactsController.lambda$resetImportedContacts$10(tLObject, tL_error);
                break;
            case 3:
                DownloadController.lambda$savePresetToServer$3(tLObject, tL_error);
                break;
            case 4:
                FileRefController.lambda$onUpdateObjectReference$40(tLObject, tL_error);
                break;
            case 5:
                FileRefController.lambda$onUpdateObjectReference$37(tLObject, tL_error);
                break;
            case 6:
                FileRefController.lambda$onUpdateObjectReference$38(tLObject, tL_error);
                break;
            case 7:
                FileRefController.lambda$onUpdateObjectReference$39(tLObject, tL_error);
                break;
            case 8:
                MediaDataController.lambda$saveDraft$189(tLObject, tL_error);
                break;
            case 9:
                MediaDataController.lambda$removeInline$152(tLObject, tL_error);
                break;
            case 10:
                MediaDataController.lambda$removePeer$154(tLObject, tL_error);
                break;
            case 11:
                MediaDataController.lambda$markFeaturedStickersByIdAsRead$66(tLObject, tL_error);
                break;
            case 12:
                MediaDataController.lambda$markFeaturedStickersAsRead$65(tLObject, tL_error);
                break;
            case 13:
                MediaDataController.lambda$removeWebapp$153(tLObject, tL_error);
                break;
            case 14:
                MessagesController.lambda$markPollVotesAsRead$443(tLObject, tL_error);
                break;
            case 15:
                MessagesController.lambda$deleteParticipantFromChat$312(tLObject, tL_error);
                break;
            case 16:
                MessagesController.lambda$setContentSettings$510(tLObject, tL_error);
                break;
            case 17:
                MessagesController.lambda$unregistedPush$321(tLObject, tL_error);
                break;
            case 18:
                MessagesController.lambda$completeReadTask$236(tLObject, tL_error);
                break;
            case 19:
                MessagesController.lambda$completeReadTask$238(tLObject, tL_error);
                break;
            case 20:
                MessagesController.lambda$markMentionMessageAsRead$232(tLObject, tL_error);
                break;
            case 21:
                MessagesController.lambda$hidePeerSettingsBar$74(tLObject, tL_error);
                break;
            case 22:
                MessagesController.lambda$installTheme$116(tLObject, tL_error);
                break;
            case 23:
                MessagesController.lambda$markMessageContentAsRead$230(tLObject, tL_error);
                break;
            case 24:
                MessagesController.lambda$installTheme$117(tLObject, tL_error);
                break;
            case 25:
                MessagesController.lambda$saveTheme$115(tLObject, tL_error);
                break;
            case 26:
                MessagesController.lambda$markReactionsAsRead$442(tLObject, tL_error);
                break;
            case 27:
                MessagesController.lambda$removeSuggestion$39(tLObject, tL_error);
                break;
            case 28:
                MessagesController.lambda$reportSpam$75(tLObject, tL_error);
                break;
            default:
                MessagesController.lambda$reportSpam$76(tLObject, tL_error);
                break;
        }
    }
}
