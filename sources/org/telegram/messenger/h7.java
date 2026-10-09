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
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class h7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h7(Object obj, long j3, int i10, Object obj2, int i11) {
        this.a = i11;
        this.b = obj;
        this.c = j3;
        this.d = i10;
        this.e = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j3 = this.c;
        int i11 = this.d;
        Object obj = this.e;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ((MediaDataController) obj2).lambda$putMenuBotsToCache$6((TLRPC.TL_attachMenuBots) obj, j3, i11);
                break;
            case 1:
                ((MediaDataController) obj2).lambda$processLoadedStickers$104((ArrayList) obj, j3, i11);
                break;
            case 2:
                ((MessagesController) obj2).lambda$checkPromoInfoInternal$167(j3, (TLRPC.TL_help_promoData) obj, i11);
                break;
            case 3:
                ((MessagesController) obj2).lambda$processUpdateArray$391(j3, i11, (TLRPC.TL_sendMessageTextDraftAction) obj);
                break;
            case 4:
                ((MessagesController) obj2).lambda$processUpdateArray$392(j3, i11, (TLRPC.TL_sendMessageRichMessageDraftAction) obj);
                break;
            case 5:
                ((MessagesStorage) obj2).lambda$updateTopicData$48(j3, (TLRPC.TL_forumTopic) obj, i11);
                break;
            case 6:
                ((MessagesStorage) obj2).lambda$updateMessageVoiceTranscriptionOpen$107(i11, j3, (TLRPC.Message) obj);
                break;
            case 7:
                ((MessagesStorage) obj2).lambda$updateMessageReactions$104(i11, j3, (TLRPC.TL_messageReactions) obj);
                break;
            case 8:
                ((MessagesStorage) obj2).lambda$updateChatDefaultBannedRights$180(j3, i11, (TLRPC.TL_chatBannedRights) obj);
                break;
            case 9:
                ((SendMessagesHelper) obj2).lambda$sendNotificationCallback$33(j3, i11, (byte[]) obj);
                break;
            case 10:
                ((TelegramMediaSession) obj2).lambda$loadMusicForDialog$7((MessagesStorage) obj, j3, i11);
                break;
            case 11:
                ((TranslateController) obj2).lambda$checkLanguage$14((MessageObject) obj, j3, i11);
                break;
            case 12:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) obj2;
                TLObject tLObject = (TLObject) obj;
                if (i4Var.G0 != 0) {
                    i4Var.G0 = 0;
                    i4Var.b0(false);
                    if (tLObject != null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        MessagesController.getInstance(i11).putUsers(tL_contacts_resolvedPeer.users, false);
                        MessagesStorage.getInstance(i11).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                        if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                            i4Var.P(j3, tL_contacts_resolvedPeer.users.get(0));
                            break;
                        }
                    }
                }
                break;
            case 13:
                ((org.telegram.ui.l6) obj2).run(Float.valueOf(((int[]) obj)[0] / i11), Boolean.valueOf(System.currentTimeMillis() - j3 > 250));
                break;
            case 14:
                ((ProfileActivity) obj2).getMessagesController().getStoriesController().b(i11, j3, (ArrayList) obj);
                break;
            case 15:
                sc.u uVar = (sc.u) obj;
                org.telegram.ui.Wallet.z0 z0Var = ((org.telegram.ui.Wallet.y0) obj2).c;
                if (!z0Var.c(uVar, i11)) {
                    z0Var.d("closing stale connected websocket; attempt=" + i11);
                    uVar.c();
                    break;
                } else {
                    z0Var.d("websocket connected after " + (SystemClock.elapsedRealtime() - j3) + " ms");
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
                org.telegram.ui.Wallet.d2 d2Var = (org.telegram.ui.Wallet.d2) obj2;
                jh jhVar = (jh) obj;
                d2Var.getClass();
                TL_wallet.tonConnectGetPending tonconnectgetpending = new TL_wallet.tonConnectGetPending();
                long j10 = this.c;
                tonconnectgetpending.session_id = Long.valueOf(j10);
                d2Var.f.sendRequestTyped(tonconnectgetpending, new a(), new org.telegram.ui.Wallet.q1(d2Var, jhVar, j10, this.d, 0));
                break;
            case 17:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj2, 0, (org.telegram.ui.ActionBar.e6) obj);
                String string = LocaleController.getString(R.string.WalletNetworkFee);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.WalletNetworkFeeInfo, org.telegram.ui.Wallet.k0.v(i11).l(j3, true)));
                q.p(R.string.WalletOK, alertDialog$Builder, null);
                break;
            default:
                ((ci.d) obj2).setLoading(false);
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.ActionBar.f3[]) obj)[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                yh.m5.y(i11, false).S();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(zn.W9(j3));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ h7(Object obj, long j3, Object obj2, int i10, int i11) {
        this.a = i11;
        this.b = obj;
        this.c = j3;
        this.e = obj2;
        this.d = i10;
    }

    public /* synthetic */ h7(Object obj, Object obj2, int i10, long j3, int i11) {
        this.a = i11;
        this.b = obj;
        this.e = obj2;
        this.d = i10;
        this.c = j3;
    }

    public /* synthetic */ h7(Object obj, Object obj2, long j3, int i10, int i11) {
        this.a = i11;
        this.b = obj;
        this.e = obj2;
        this.c = j3;
        this.d = i10;
    }

    public /* synthetic */ h7(MessagesStorage messagesStorage, int i10, long j3, TLObject tLObject, int i11) {
        this.a = i11;
        this.b = messagesStorage;
        this.d = i10;
        this.c = j3;
        this.e = tLObject;
    }
}
