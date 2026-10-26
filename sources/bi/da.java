package bi;

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
import org.telegram.messenger.kh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class da implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ da(Object obj, long j10, int i10, Object obj2, int i11) {
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
                ((fi.d) obj2).setLoading(false);
                org.telegram.ui.ActionBar.k3 k3Var = ((org.telegram.ui.ActionBar.k3[]) obj)[0];
                if (k3Var != null) {
                    k3Var.dismiss();
                }
                ca.y(i11, false).S();
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(un.ba(j10));
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
                ((MessagesController) obj2).lambda$processUpdateArray$393(j10, i11, (TLRPC.TL_sendMessageTextDraftAction) obj);
                break;
            case 5:
                ((MessagesController) obj2).lambda$processUpdateArray$394(j10, i11, (TLRPC.TL_sendMessageRichMessageDraftAction) obj);
                break;
            case 6:
                ((MessagesStorage) obj2).lambda$updateMessageVoiceTranscriptionOpen$110(i11, j10, (TLRPC.Message) obj);
                break;
            case 7:
                ((MessagesStorage) obj2).lambda$updateMessageReactions$107(i11, j10, (TLRPC.TL_messageReactions) obj);
                break;
            case 8:
                ((MessagesStorage) obj2).lambda$putWidgetStorage$43((String) obj, j10, i11);
                break;
            case 9:
                ((MessagesStorage) obj2).lambda$updateTopicData$51(j10, (TLRPC.TL_forumTopic) obj, i11);
                break;
            case 10:
                ((MessagesStorage) obj2).lambda$updateChatDefaultBannedRights$183(j10, i11, (TLRPC.TL_chatBannedRights) obj);
                break;
            case 11:
                ((SendMessagesHelper) obj2).lambda$sendNotificationCallback$33(j10, i11, (byte[]) obj);
                break;
            case 12:
                ((TelegramMediaSession) obj2).lambda$loadMusicForDialog$7((MessagesStorage) obj, j10, i11);
                break;
            case 13:
                ((TranslateController) obj2).lambda$checkLanguage$14((MessageObject) obj, j10, i11);
                break;
            case 14:
                org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) obj2;
                TLObject tLObject = (TLObject) obj;
                if (j4Var.H0 != 0) {
                    j4Var.H0 = 0;
                    j4Var.b0(false);
                    if (tLObject != null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        MessagesController.getInstance(i11).putUsers(tL_contacts_resolvedPeer.users, false);
                        MessagesStorage.getInstance(i11).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                        if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                            j4Var.P(j10, tL_contacts_resolvedPeer.users.get(0));
                            break;
                        }
                    }
                }
                break;
            case 15:
                ((org.telegram.ui.q6) obj2).run(Float.valueOf(((int[]) obj)[0] / i11), Boolean.valueOf(System.currentTimeMillis() - j10 > 250));
                break;
            case 16:
                int i12 = ProfileActivity.R6;
                ((ProfileActivity) obj2).getMessagesController().getStoriesController().b(i11, j10, (ArrayList) obj);
                break;
            case 17:
                uc.u uVar = (uc.u) obj;
                org.telegram.ui.Wallet.z0 z0Var = ((org.telegram.ui.Wallet.y0) obj2).c;
                if (!z0Var.c(uVar, i11)) {
                    z0Var.d("closing stale connected websocket; attempt=" + i11);
                    uVar.c();
                    break;
                } else {
                    z0Var.d("websocket connected after " + (SystemClock.elapsedRealtime() - j10) + " ms");
                    org.telegram.ui.Wallet.w0 w0Var = z0Var.o;
                    try {
                        JSONArray put = new JSONArray().put(z0Var.b);
                        StringBuilder sb2 = new StringBuilder("wallet-");
                        int i13 = z0Var.g + 1;
                        z0Var.g = i13;
                        sb2.append(i13);
                        z0Var.f = sb2.toString();
                        JSONObject put2 = new JSONObject().put("operation", "subscribe").put("id", z0Var.f).put("types", new JSONArray().put("transactions").put("account_state_change")).put("include_address_book", true).put("addresses", put).put("min_finality", "pending");
                        AndroidUtilities.cancelRunOnUIThread(w0Var);
                        AndroidUtilities.runOnUIThread(w0Var, 30000L);
                        z0Var.g(put2.toString());
                        break;
                    } catch (JSONException unused) {
                        z0Var.f("could not encode subscription");
                        return;
                    }
                }
            case 18:
                org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) obj2;
                kh khVar = (kh) obj;
                e2Var.getClass();
                TL_wallet.tonConnectGetPending tonconnectgetpending = new TL_wallet.tonConnectGetPending();
                long j11 = this.b;
                tonconnectgetpending.session_id = Long.valueOf(j11);
                e2Var.f.sendRequestTyped(tonconnectgetpending, new org.telegram.messenger.a(), new org.telegram.ui.Wallet.s1(e2Var, khVar, j11, this.c, 0));
                break;
            default:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj2, 0, (org.telegram.ui.ActionBar.u6) obj);
                String string = LocaleController.getString(R.string.WalletNetworkFee);
                org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder.a;
                e2Var2.R = string;
                e2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.WalletNetworkFeeInfo, org.telegram.ui.Wallet.l0.w(i11).l(j10, true)));
                org.telegram.messenger.t.p(R.string.WalletOK, alertDialog$Builder, null);
                break;
        }
    }

    public /* synthetic */ da(Object obj, long j10, Object obj2, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = j10;
        this.e = obj2;
        this.c = i10;
    }

    public /* synthetic */ da(Object obj, Object obj2, int i10, long j10, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.c = i10;
        this.b = j10;
    }

    public /* synthetic */ da(Object obj, Object obj2, long j10, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = j10;
        this.c = i10;
    }

    public /* synthetic */ da(MessagesStorage messagesStorage, int i10, long j10, TLObject tLObject, int i11) {
        this.a = i11;
        this.d = messagesStorage;
        this.c = i10;
        this.b = j10;
        this.e = tLObject;
    }
}
