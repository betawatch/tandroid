package mh;

import java.util.ArrayList;
import org.telegram.messenger.BaseController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y8(Object obj, long j10, int i10, Object obj2, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = j10;
        this.c = i10;
        this.e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qh.d dVar = (qh.d) this.d;
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) this.e;
                dVar.setLoading(false);
                org.telegram.ui.ActionBar.h3 h3Var = h3VarArr[0];
                if (h3Var != null) {
                    h3Var.dismiss();
                }
                t7.y(this.c, false).S();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(xn.R9(this.b));
                    break;
                }
                break;
            case 1:
                ((MediaDataController) this.d).lambda$putMenuBotsToCache$6((TLRPC.TL_attachMenuBots) this.e, this.b, this.c);
                break;
            case 2:
                ((MediaDataController) this.d).lambda$processLoadedStickers$104((ArrayList) this.e, this.b, this.c);
                break;
            case 3:
                ((MessagesController) this.d).lambda$checkPromoInfoInternal$168(this.b, (TLRPC.TL_help_promoData) this.e, this.c);
                break;
            case 4:
                ((MessagesController) this.d).lambda$processUpdateArray$388(this.b, this.c, (TLRPC.TL_sendMessageTextDraftAction) this.e);
                break;
            case 5:
                ((MessagesController) this.d).lambda$processUpdateArray$389(this.b, this.c, (TLRPC.TL_sendMessageRichMessageDraftAction) this.e);
                break;
            case 6:
                ((MessagesStorage) this.d).lambda$updateTopicData$48(this.b, (TLRPC.TL_forumTopic) this.e, this.c);
                break;
            case 7:
                ((MessagesStorage) this.d).lambda$updateMessageVoiceTranscriptionOpen$107(this.c, this.b, (TLRPC.Message) this.e);
                break;
            case 8:
                ((MessagesStorage) this.d).lambda$updateMessageReactions$104(this.c, this.b, (TLRPC.TL_messageReactions) this.e);
                break;
            case 9:
                ((MessagesStorage) this.d).lambda$updateChatDefaultBannedRights$180(this.b, this.c, (TLRPC.TL_chatBannedRights) this.e);
                break;
            case 10:
                ((SendMessagesHelper) this.d).lambda$sendNotificationCallback$30(this.b, this.c, (byte[]) this.e);
                break;
            case 11:
                ((TranslateController) this.d).lambda$checkLanguage$14((MessageObject) this.e, this.b, this.c);
                break;
            case 12:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) this.d;
                TLObject tLObject = (TLObject) this.e;
                if (l4Var.D0 != 0) {
                    l4Var.D0 = 0;
                    l4Var.b0(false);
                    if (tLObject != null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        int i10 = this.c;
                        MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                        MessagesStorage.getInstance(i10).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                        if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                            l4Var.P(this.b, tL_contacts_resolvedPeer.users.get(0));
                            break;
                        }
                    }
                }
                break;
            case 13:
                ((org.telegram.ui.p6) this.d).run(Float.valueOf(((int[]) this.e)[0] / this.c), Boolean.valueOf(System.currentTimeMillis() - this.b > 250));
                break;
            default:
                ((ProfileActivity) this.d).getMessagesController().getStoriesController().b(this.c, this.b, (ArrayList) this.e);
                break;
        }
    }

    public /* synthetic */ y8(Object obj, Object obj2, int i10, long j10, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.c = i10;
        this.b = j10;
    }

    public /* synthetic */ y8(BaseController baseController, long j10, TLObject tLObject, int i10, int i11) {
        this.a = i11;
        this.d = baseController;
        this.b = j10;
        this.e = tLObject;
        this.c = i10;
    }

    public /* synthetic */ y8(BaseController baseController, Object obj, long j10, int i10, int i11) {
        this.a = i11;
        this.d = baseController;
        this.e = obj;
        this.b = j10;
        this.c = i10;
    }

    public /* synthetic */ y8(MessagesStorage messagesStorage, int i10, long j10, TLObject tLObject, int i11) {
        this.a = i11;
        this.d = messagesStorage;
        this.c = i10;
        this.b = j10;
        this.e = tLObject;
    }
}
