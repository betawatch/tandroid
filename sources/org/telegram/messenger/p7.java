package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.eo;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class p7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p7(Object obj, long j3, int i10, Object obj2, int i11) {
        this.a = i11;
        this.b = obj;
        this.c = j3;
        this.d = i10;
        this.e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaDataController) this.b).lambda$putMenuBotsToCache$6((TLRPC.TL_attachMenuBots) this.e, this.c, this.d);
                break;
            case 1:
                ((MediaDataController) this.b).lambda$processLoadedStickers$104((ArrayList) this.e, this.c, this.d);
                break;
            case 2:
                ((MessagesController) this.b).lambda$checkPromoInfoInternal$168(this.c, (TLRPC.TL_help_promoData) this.e, this.d);
                break;
            case 3:
                ((MessagesController) this.b).lambda$processUpdateArray$388(this.c, this.d, (TLRPC.TL_sendMessageTextDraftAction) this.e);
                break;
            case 4:
                ((MessagesController) this.b).lambda$processUpdateArray$389(this.c, this.d, (TLRPC.TL_sendMessageRichMessageDraftAction) this.e);
                break;
            case 5:
                ((MessagesStorage) this.b).lambda$updateTopicData$48(this.c, (TLRPC.TL_forumTopic) this.e, this.d);
                break;
            case 6:
                ((MessagesStorage) this.b).lambda$updateMessageVoiceTranscriptionOpen$107(this.d, this.c, (TLRPC.Message) this.e);
                break;
            case 7:
                ((MessagesStorage) this.b).lambda$updateMessageReactions$104(this.d, this.c, (TLRPC.TL_messageReactions) this.e);
                break;
            case 8:
                ((MessagesStorage) this.b).lambda$updateChatDefaultBannedRights$180(this.c, this.d, (TLRPC.TL_chatBannedRights) this.e);
                break;
            case 9:
                ((SendMessagesHelper) this.b).lambda$sendNotificationCallback$30(this.c, this.d, (byte[]) this.e);
                break;
            case 10:
                ((TranslateController) this.b).lambda$checkLanguage$14((MessageObject) this.e, this.c, this.d);
                break;
            case 11:
                org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) this.b;
                TLObject tLObject = (TLObject) this.e;
                if (j4Var.G0 != 0) {
                    j4Var.G0 = 0;
                    j4Var.b0(false);
                    if (tLObject != null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        int i10 = this.d;
                        MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                        MessagesStorage.getInstance(i10).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                        if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                            j4Var.P(this.c, tL_contacts_resolvedPeer.users.get(0));
                            break;
                        }
                    }
                }
                break;
            case 12:
                ((org.telegram.ui.m6) this.b).run(Float.valueOf(((int[]) this.e)[0] / this.d), Boolean.valueOf(System.currentTimeMillis() - this.c > 250));
                break;
            case 13:
                ((ProfileActivity) this.b).getMessagesController().getStoriesController().b(this.d, this.c, (ArrayList) this.e);
                break;
            default:
                bi.d dVar = (bi.d) this.b;
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) this.e;
                dVar.setLoading(false);
                org.telegram.ui.ActionBar.h3 h3Var = h3VarArr[0];
                if (h3Var != null) {
                    h3Var.dismiss();
                }
                xh.v5.y(this.d, false).S();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(eo.R9(this.c));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ p7(Object obj, Object obj2, int i10, long j3, int i11) {
        this.a = i11;
        this.b = obj;
        this.e = obj2;
        this.d = i10;
        this.c = j3;
    }

    public /* synthetic */ p7(BaseController baseController, long j3, TLObject tLObject, int i10, int i11) {
        this.a = i11;
        this.b = baseController;
        this.c = j3;
        this.e = tLObject;
        this.d = i10;
    }

    public /* synthetic */ p7(BaseController baseController, Object obj, long j3, int i10, int i11) {
        this.a = i11;
        this.b = baseController;
        this.e = obj;
        this.c = j3;
        this.d = i10;
    }

    public /* synthetic */ p7(MessagesStorage messagesStorage, int i10, long j3, TLObject tLObject, int i11) {
        this.a = i11;
        this.b = messagesStorage;
        this.d = i10;
        this.c = j3;
        this.e = tLObject;
    }
}
