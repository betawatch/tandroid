package org.telegram.messenger;

import android.content.Context;
import android.os.SystemClock;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fo;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class k7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k7(Object obj, long j10, int i10, Object obj2, int i11) {
        this.a = i11;
        this.b = obj;
        this.c = j10;
        this.d = i10;
        this.e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j10 = this.c;
        int i11 = this.d;
        Object obj = this.e;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ((MediaDataController) obj2).lambda$putMenuBotsToCache$6((TLRPC.TL_attachMenuBots) obj, j10, i11);
                break;
            case 1:
                ((MediaDataController) obj2).lambda$processLoadedStickers$104((ArrayList) obj, j10, i11);
                break;
            case 2:
                ((MessagesController) obj2).lambda$checkPromoInfoInternal$167(j10, (TLRPC.TL_help_promoData) obj, i11);
                break;
            case 3:
                ((MessagesController) obj2).lambda$processUpdateArray$391(j10, i11, (TLRPC.TL_sendMessageTextDraftAction) obj);
                break;
            case 4:
                ((MessagesController) obj2).lambda$processUpdateArray$392(j10, i11, (TLRPC.TL_sendMessageRichMessageDraftAction) obj);
                break;
            case 5:
                ((MessagesStorage) obj2).lambda$updateTopicData$48(j10, (TLRPC.TL_forumTopic) obj, i11);
                break;
            case 6:
                ((MessagesStorage) obj2).lambda$updateMessageVoiceTranscriptionOpen$107(i11, j10, (TLRPC.Message) obj);
                break;
            case 7:
                ((MessagesStorage) obj2).lambda$updateMessageReactions$104(i11, j10, (TLRPC.TL_messageReactions) obj);
                break;
            case 8:
                ((MessagesStorage) obj2).lambda$updateChatDefaultBannedRights$180(j10, i11, (TLRPC.TL_chatBannedRights) obj);
                break;
            case 9:
                ((SendMessagesHelper) obj2).lambda$sendNotificationCallback$33(j10, i11, (byte[]) obj);
                break;
            case 10:
                ((TelegramMediaSession) obj2).lambda$loadMusicForDialog$7((MessagesStorage) obj, j10, i11);
                break;
            case 11:
                ((TranslateController) obj2).lambda$checkLanguage$14((MessageObject) obj, j10, i11);
                break;
            case 12:
                org.telegram.ui.k4 k4Var = (org.telegram.ui.k4) obj2;
                TLObject tLObject = (TLObject) obj;
                if (k4Var.G0 != 0) {
                    k4Var.G0 = 0;
                    k4Var.b0(false);
                    if (tLObject != null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        MessagesController.getInstance(i11).putUsers(tL_contacts_resolvedPeer.users, false);
                        MessagesStorage.getInstance(i11).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                        if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                            k4Var.P(j10, tL_contacts_resolvedPeer.users.get(0));
                            break;
                        }
                    }
                }
                break;
            case 13:
                ((org.telegram.ui.q6) obj2).run(Float.valueOf(((int[]) obj)[0] / i11), Boolean.valueOf(System.currentTimeMillis() - j10 > 250));
                break;
            case 14:
                ((ProfileActivity) obj2).getMessagesController().getStoriesController().b(i11, j10, (ArrayList) obj);
                break;
            case 15:
                tc.u uVar = (tc.u) obj;
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
                        int i12 = z0Var.g + 1;
                        z0Var.g = i12;
                        sb2.append(i12);
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
            case 16:
                org.telegram.ui.Wallet.e2 e2Var = (org.telegram.ui.Wallet.e2) obj2;
                mh mhVar = (mh) obj;
                e2Var.getClass();
                TL_wallet.tonConnectGetPending tonconnectgetpending = new TL_wallet.tonConnectGetPending();
                long j11 = this.c;
                tonconnectgetpending.session_id = Long.valueOf(j11);
                e2Var.f.sendRequestTyped(tonconnectgetpending, new a(), new org.telegram.ui.Wallet.r1(e2Var, mhVar, j11, this.d, 0));
                break;
            case 17:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj2, 0, (org.telegram.ui.ActionBar.c6) obj);
                String string = LocaleController.getString(R.string.WalletNetworkFee);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                a2Var.R = string;
                a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.WalletNetworkFeeInfo, org.telegram.ui.Wallet.k0.v(i11).l(j10, true)));
                g0.p(R.string.WalletOK, alertDialog$Builder, null);
                break;
            default:
                ((di.d) obj2).setLoading(false);
                org.telegram.ui.ActionBar.e3 e3Var = ((org.telegram.ui.ActionBar.e3[]) obj)[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                }
                zh.n5.y(i11, false).S();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(fo.W9(j10));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ k7(Object obj, long j10, Object obj2, int i10, int i11) {
        this.a = i11;
        this.b = obj;
        this.c = j10;
        this.e = obj2;
        this.d = i10;
    }

    public /* synthetic */ k7(Object obj, Object obj2, int i10, long j10, int i11) {
        this.a = i11;
        this.b = obj;
        this.e = obj2;
        this.d = i10;
        this.c = j10;
    }

    public /* synthetic */ k7(Object obj, Object obj2, long j10, int i10, int i11) {
        this.a = i11;
        this.b = obj;
        this.e = obj2;
        this.c = j10;
        this.d = i10;
    }

    public /* synthetic */ k7(MessagesStorage messagesStorage, int i10, long j10, TLObject tLObject, int i11) {
        this.a = i11;
        this.b = messagesStorage;
        this.d = i10;
        this.c = j10;
        this.e = tLObject;
    }
}
