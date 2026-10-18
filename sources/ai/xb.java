package ai;

import android.content.Context;
import android.os.SystemClock;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.eh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class xb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xb(Object obj, long j10, int i10, Object obj2, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = j10;
        this.c = i10;
        this.e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j10 = this.b;
        int i11 = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                ((ei.d) obj2).setLoading(false);
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.ActionBar.f3[]) obj)[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                ga.y(i11, false).S();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(sn.W9(j10));
                    break;
                }
                break;
            case 1:
                ((MediaDataController) obj2).lambda$putMenuBotsToCache$6((TLRPC.TL_attachMenuBots) obj, j10, i11);
                break;
            case 2:
                ((MediaDataController) obj2).lambda$processLoadedStickers$104((ArrayList) obj, j10, i11);
                break;
            case 3:
                ((MessagesController) obj2).lambda$checkPromoInfoInternal$167(j10, (TLRPC.TL_help_promoData) obj, i11);
                break;
            case 4:
                ((MessagesController) obj2).lambda$processUpdateArray$391(j10, i11, (TLRPC.TL_sendMessageTextDraftAction) obj);
                break;
            case 5:
                ((MessagesController) obj2).lambda$processUpdateArray$392(j10, i11, (TLRPC.TL_sendMessageRichMessageDraftAction) obj);
                break;
            case 6:
                ((MessagesStorage) obj2).lambda$updateTopicData$48(j10, (TLRPC.TL_forumTopic) obj, i11);
                break;
            case 7:
                ((MessagesStorage) obj2).lambda$updateMessageVoiceTranscriptionOpen$107(i11, j10, (TLRPC.Message) obj);
                break;
            case 8:
                ((MessagesStorage) obj2).lambda$updateMessageReactions$104(i11, j10, (TLRPC.TL_messageReactions) obj);
                break;
            case 9:
                ((MessagesStorage) obj2).lambda$updateChatDefaultBannedRights$180(j10, i11, (TLRPC.TL_chatBannedRights) obj);
                break;
            case 10:
                ((SendMessagesHelper) obj2).lambda$sendNotificationCallback$33(j10, i11, (byte[]) obj);
                break;
            case 11:
                ((TelegramMediaSession) obj2).lambda$loadMusicForDialog$7((MessagesStorage) obj, j10, i11);
                break;
            case 12:
                ((TranslateController) obj2).lambda$checkLanguage$14((MessageObject) obj, j10, i11);
                break;
            case 13:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) obj2;
                TLObject tLObject = (TLObject) obj;
                if (l4Var.G0 != 0) {
                    l4Var.G0 = 0;
                    l4Var.b0(false);
                    if (tLObject != null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        MessagesController.getInstance(i11).putUsers(tL_contacts_resolvedPeer.users, false);
                        MessagesStorage.getInstance(i11).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                        if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                            l4Var.P(j10, tL_contacts_resolvedPeer.users.get(0));
                            break;
                        }
                    }
                }
                break;
            case 14:
                ((org.telegram.ui.p6) obj2).run(Float.valueOf(((int[]) obj)[0] / i11), Boolean.valueOf(System.currentTimeMillis() - j10 > 250));
                break;
            case 15:
                ((ProfileActivity) obj2).getMessagesController().getStoriesController().b(i11, j10, (ArrayList) obj);
                break;
            case 16:
                tc.u uVar = (tc.u) obj;
                org.telegram.ui.Wallet.a1 a1Var = ((org.telegram.ui.Wallet.z0) obj2).c;
                if (!a1Var.c(uVar, i11)) {
                    a1Var.d("closing stale connected websocket; attempt=" + i11);
                    uVar.c();
                    break;
                } else {
                    a1Var.d("websocket connected after " + (SystemClock.elapsedRealtime() - j10) + " ms");
                    org.telegram.ui.Wallet.x0 x0Var = a1Var.o;
                    try {
                        JSONArray put = new JSONArray().put(a1Var.b);
                        StringBuilder sb2 = new StringBuilder("wallet-");
                        int i12 = a1Var.g + 1;
                        a1Var.g = i12;
                        sb2.append(i12);
                        a1Var.f = sb2.toString();
                        JSONObject put2 = new JSONObject().put("operation", "subscribe").put("id", a1Var.f).put("types", new JSONArray().put("transactions").put("account_state_change")).put("include_address_book", true).put("addresses", put).put("min_finality", "pending");
                        AndroidUtilities.cancelRunOnUIThread(x0Var);
                        AndroidUtilities.runOnUIThread(x0Var, 30000L);
                        a1Var.g(put2.toString());
                        break;
                    } catch (JSONException unused) {
                        a1Var.f("could not encode subscription");
                        return;
                    }
                }
            case 17:
                org.telegram.ui.Wallet.f2 f2Var = (org.telegram.ui.Wallet.f2) obj2;
                eh ehVar = (eh) obj;
                f2Var.getClass();
                TL_wallet.tonConnectGetPending tonconnectgetpending = new TL_wallet.tonConnectGetPending();
                long j11 = this.b;
                tonconnectgetpending.session_id = Long.valueOf(j11);
                f2Var.f.sendRequestTyped(tonconnectgetpending, new org.telegram.messenger.a(), new org.telegram.ui.Wallet.t1(f2Var, ehVar, j11, this.c, 0));
                break;
            default:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj2, 0, (org.telegram.ui.ActionBar.d6) obj);
                String string = LocaleController.getString(R.string.WalletNetworkFee);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.WalletNetworkFeeInfo, org.telegram.ui.Wallet.m0.w(i11).l(j10, true)));
                org.telegram.messenger.g0.p(R.string.WalletOK, alertDialog$Builder, null);
                break;
        }
    }

    public /* synthetic */ xb(Object obj, long j10, Object obj2, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = j10;
        this.e = obj2;
        this.c = i10;
    }

    public /* synthetic */ xb(Object obj, Object obj2, int i10, long j10, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.c = i10;
        this.b = j10;
    }

    public /* synthetic */ xb(Object obj, Object obj2, long j10, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = j10;
        this.c = i10;
    }

    public /* synthetic */ xb(MessagesStorage messagesStorage, int i10, long j10, TLObject tLObject, int i11) {
        this.a = i11;
        this.d = messagesStorage;
        this.c = i10;
        this.b = j10;
        this.e = tLObject;
    }
}
