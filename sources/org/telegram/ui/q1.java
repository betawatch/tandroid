package org.telegram.ui;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q1(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0468 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference failed for: r3v72 */
    /* JADX WARN: Type inference failed for: r3v80 */
    /* JADX WARN: Type inference failed for: r3v86 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        String str2;
        ArrayList arrayList;
        ?? r32;
        switch (this.a) {
            case 0:
                ArticleViewer$BlockEmbedCell$TelegramWebviewProxy articleViewer$BlockEmbedCell$TelegramWebviewProxy = (ArticleViewer$BlockEmbedCell$TelegramWebviewProxy) this.d;
                String str3 = (String) this.b;
                String str4 = (String) this.c;
                s1 s1Var = articleViewer$BlockEmbedCell$TelegramWebviewProxy.a;
                if ("resize_frame".equals(str3)) {
                    try {
                        s1Var.r = Utilities.parseInt((CharSequence) new JSONObject(str4).getString("height")).intValue();
                        s1Var.requestLayout();
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                return;
            case 1:
                PaymentFormActivity$TelegramWebviewProxy paymentFormActivity$TelegramWebviewProxy = (PaymentFormActivity$TelegramWebviewProxy) this.d;
                String str5 = (String) this.b;
                String str6 = (String) this.c;
                wo0 wo0Var = paymentFormActivity$TelegramWebviewProxy.a;
                if (wo0Var.getParentActivity() != null && str5.equals("payment_form_submit")) {
                    try {
                        JSONObject jSONObject = new JSONObject(str6);
                        wo0Var.w0 = jSONObject.getJSONObject("credentials").toString();
                        wo0Var.x0 = jSONObject.getString("title");
                    } catch (Throwable th2) {
                        wo0Var.w0 = str6;
                        FileLog.e(th2);
                    }
                    wo0Var.t0();
                    return;
                }
                return;
            case 2:
                p pVar = (p) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                TLObject tLObject = (TLObject) this.c;
                pVar.getClass();
                if (tL_error == null) {
                    pVar.X((TLRPC.TL_messages_archivedStickers) tLObject);
                    return;
                }
                return;
            case 3:
                z6 z6Var = (z6) this.d;
                ArrayList arrayList2 = (ArrayList) this.b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.c;
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    ((zh.a) arrayList2.get(i10)).a.delete();
                }
                AndroidUtilities.runOnUIThread(new l4(3, z6Var, b2Var));
                return;
            case 4:
                s7 s7Var = (s7) this.d;
                zh.a aVar = (zh.a) this.b;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) this.c;
                String str7 = "";
                MediaMetadataRetriever mediaMetadataRetriever = null;
                try {
                    try {
                        MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                        try {
                            try {
                                mediaMetadataRetriever2.setDataSource(s7Var.getContext(), Uri.fromFile(aVar.a));
                                str2 = mediaMetadataRetriever2.extractMetadata(7);
                            } catch (Throwable th3) {
                                th = th3;
                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                if (mediaMetadataRetriever != null) {
                                    try {
                                        mediaMetadataRetriever.release();
                                    } catch (Throwable unused2) {
                                    }
                                }
                                throw th;
                            }
                        } catch (Exception e) {
                            e = e;
                            mediaMetadataRetriever = mediaMetadataRetriever2;
                            str = "";
                            FileLog.e(e);
                            if (mediaMetadataRetriever != null) {
                                try {
                                    mediaMetadataRetriever.release();
                                } catch (Throwable unused3) {
                                }
                            }
                            str2 = str;
                            AndroidUtilities.runOnUIThread(new ai.m3(s7Var, aVar, tL_documentAttributeAudio, str2, str7, 12));
                            return;
                        }
                        try {
                            str7 = mediaMetadataRetriever2.extractMetadata(2);
                            try {
                                mediaMetadataRetriever2.release();
                            } catch (Throwable unused4) {
                            }
                        } catch (Exception e7) {
                            e = e7;
                            str = str2;
                            mediaMetadataRetriever = mediaMetadataRetriever2;
                            FileLog.e(e);
                            if (mediaMetadataRetriever != null) {
                            }
                            str2 = str;
                            AndroidUtilities.runOnUIThread(new ai.m3(s7Var, aVar, tL_documentAttributeAudio, str2, str7, 12));
                            return;
                        }
                    } catch (Exception e10) {
                        e = e10;
                    }
                    AndroidUtilities.runOnUIThread(new ai.m3(s7Var, aVar, tL_documentAttributeAudio, str2, str7, 12));
                    return;
                } catch (Throwable th4) {
                    th = th4;
                }
            case 5:
                c8 c8Var = (c8) this.d;
                bo boVar = (bo) this.b;
                f8 f8Var = (f8) this.c;
                c8Var.b.x.finishFragment();
                boVar.G9(f8Var.h);
                return;
            case 6:
                k9.W((k9) this.d, (TLRPC.TL_error) this.b, (TLObject) this.c);
                return;
            case 7:
                String[] strArr = (String[]) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.b;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.c;
                AndroidUtilities.addToClipboard(strArr[0]);
                org.telegram.messenger.vl.p(R.string.LinkCopied, new org.telegram.ui.Components.vc(f3Var.topBulletinContainer, e6Var));
                return;
            case 8:
                qa.X((qa) this.d, (org.telegram.ui.ActionBar.b2) this.b, (TLRPC.User) this.c);
                return;
            case 9:
                ub.Z((ub) this.d, (TLRPC.TL_error) this.b, (TLObject) this.c);
                return;
            case 10:
                yc ycVar = (yc) this.d;
                TLObject tLObject2 = (TLObject) this.b;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.c;
                HashMap hashMap = ycVar.w;
                if (!(tLObject2 instanceof TLRPC.TL_wallPaper)) {
                    h6Var.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject2;
                String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                if (hashMap.containsKey(attachFileName)) {
                    return;
                }
                hashMap.put(attachFileName, h6Var);
                FileLoader.getInstance(h6Var.E).loadFile(wallPaper.document, wallPaper, 1, 1);
                return;
            case 11:
                ld ldVar = (ld) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                if (tL_error2 == null) {
                    ldVar.getClass();
                    ldVar.c0 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvites) tLObject3).invites.get(0);
                }
                ldVar.b0 = false;
                org.telegram.ui.Components.v80 v80Var = ldVar.P;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = ldVar.c0;
                v80Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
                return;
            case 12:
                je jeVar = (je) this.d;
                TLObject tLObject4 = (TLObject) this.b;
                Context context = (Context) this.c;
                if (tLObject4 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    nf.f.s(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject4).url);
                }
                AndroidUtilities.runOnUIThread(new nd(jeVar, 5), 1000L);
                return;
            case 13:
                ((za1) this.d).showDialog(je.d0((Context) this.b, (org.telegram.ui.ActionBar.e6) this.c, false));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new l4(21, (sa) this.c, ((bo) this.d).getMessagesStorage().getUser(((TLRPC.TL_contact) this.b).user_id)));
                return;
            case 15:
                bo.J0((bo) this.d, (TLRPC.User) this.b, (TLRPC.EmojiStatus) this.c);
                return;
            case 16:
                bo boVar2 = (bo) this.d;
                org.telegram.ui.Components.am0 am0Var = (org.telegram.ui.Components.am0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                boVar2.getClass();
                am0Var.dismiss();
                boVar2.presentFragment(ProfileActivity.m4(user.id));
                return;
            case 17:
                bo boVar3 = (bo) this.d;
                org.telegram.ui.Components.n70 n70Var = (org.telegram.ui.Components.n70) this.c;
                String str8 = (String) this.b;
                n70Var.u();
                ck0 ck0Var = new ck0(boVar3.getParentActivity(), boVar3);
                ck0Var.v(str8, false);
                ck0Var.show();
                return;
            case 18:
                bo boVar4 = (bo) this.d;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.b;
                org.telegram.ui.Components.c5.T(boVar4.getParentActivity(), suggestedPost != null ? suggestedPost.schedule_date : 0L, new b7(boVar4, suggestedPost, (MessageObject) this.c, 5), boVar4.getResourceProvider(), 0).a.show();
                return;
            case 19:
                bo.f0((bo) this.d, (zf.a) this.b, (Runnable) this.c);
                return;
            case 20:
                bo.l0((bo) this.d, (TLObject) this.b, (TLRPC.User) this.c);
                return;
            case 21:
                org.telegram.ui.Components.c5.f0(r0.currentAccount, (TLRPC.TL_error) this.b, (bo) this.d, (TLRPC.TL_messages_editMessage) this.c, new Object[0]);
                return;
            case 22:
                bo boVar5 = (bo) this.d;
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                boVar5.f = messagesStorage.getUser(boVar5.h.user_id);
                countDownLatch.countDown();
                return;
            case 23:
                dm dmVar = (dm) this.d;
                TLObject tLObject5 = (TLObject) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                em emVar = dmVar.c;
                if (tLObject5 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject5;
                    bo boVar6 = emVar.a.Q;
                    boVar6.getMessagesController().putUsers(tL_photos_photo.users, false);
                    TLRPC.User user2 = boVar6.getMessagesController().getUser(Long.valueOf(boVar6.getUserConfig().clientUserId));
                    if ((tL_photos_photo.photo instanceof TLRPC.TL_photo) && user2 != null) {
                        yf.d0.a(messageObject.messageOwner.action.photo, user2, false);
                        boVar6.getUserConfig().setCurrentUser(user2);
                        boVar6.getUserConfig().saveConfig(true);
                        org.telegram.ui.Components.vc.a0(boVar6).V(Collections.singletonList(user2), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new dj(dmVar, 5)), null).j();
                    }
                }
                messageObject.settingAvatar = false;
                return;
            case 24:
                nn.a((nn) this.d, (org.telegram.ui.Cells.t1) this.b, (TLRPC.Document) this.c);
                return;
            case 25:
                ((nn) this.d).v((org.telegram.ui.Cells.t1) this.b, (TLRPC.User) this.c);
                return;
            case 26:
                ((nn) this.d).q((org.telegram.ui.Cells.t1) this.b, (TLRPC.Chat) this.c, 0, false);
                return;
            case 27:
                wo woVar = (wo) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                woVar.getClass();
                if (tL_error3 == null) {
                    woVar.y0.invitesCount = ((TLRPC.TL_messages_exportedChatInvites) tLObject6).count;
                    woVar.getMessagesStorage().saveChatLinksCount(woVar.w0, woVar.y0.invitesCount);
                    woVar.p0(false, false);
                    return;
                }
                return;
            case 28:
                vp vpVar = (vp) this.d;
                String str9 = (String) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                vpVar.getClass();
                String lowerCase = str9.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new q1(vpVar, new ArrayList(), new ArrayList(), 29));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (lowerCase.equals(translitString) || translitString.length() == 0) {
                    translitString = null;
                }
                int i11 = (translitString != null ? 1 : 0) + 1;
                String[] strArr2 = new String[i11];
                strArr2[0] = lowerCase;
                if (translitString != null) {
                    strArr2[1] = translitString;
                }
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int i12 = 0;
                while (i12 < arrayList3.size()) {
                    TLRPC.Chat chat = (TLRPC.Chat) arrayList3.get(i12);
                    String lowerCase2 = chat.title.toLowerCase();
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                    if (lowerCase2.equals(translitString2)) {
                        translitString2 = null;
                    }
                    int i13 = 0;
                    String str10 = null;
                    boolean z10 = false;
                    while (true) {
                        if (i13 < i11) {
                            String str11 = strArr2[i13];
                            if (lowerCase2.startsWith(str11) || org.telegram.messenger.y0.w(" ", str11, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str11) || org.telegram.messenger.y0.w(" ", str11, translitString2)))) {
                                arrayList = arrayList3;
                                r32 = 1;
                            } else {
                                String str12 = chat.username;
                                if (str12 == null || !str12.startsWith(str11)) {
                                    ArrayList<TLRPC.TL_username> arrayList6 = chat.usernames;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        int i14 = 0;
                                        while (i14 < chat.usernames.size()) {
                                            TLRPC.TL_username tL_username = chat.usernames.get(i14);
                                            arrayList = arrayList3;
                                            if (tL_username.active && tL_username.username.startsWith(str11)) {
                                                str10 = tL_username.username;
                                            } else {
                                                i14++;
                                                arrayList3 = arrayList;
                                            }
                                        }
                                    }
                                    arrayList = arrayList3;
                                    r32 = z10;
                                } else {
                                    str10 = chat.username;
                                    arrayList = arrayList3;
                                }
                                r32 = 2;
                            }
                            if (r32 != 0) {
                                if (r32 == 1) {
                                    arrayList5.add(AndroidUtilities.generateSearchName(chat.title, null, str11));
                                } else {
                                    arrayList5.add(AndroidUtilities.generateSearchName(org.telegram.ui.Cells.q3.i("@", str10), null, "@" + str11));
                                }
                                arrayList4.add(chat);
                            } else {
                                i13++;
                                z10 = r32;
                                arrayList3 = arrayList;
                            }
                        } else {
                            arrayList = arrayList3;
                        }
                    }
                    i12++;
                    arrayList3 = arrayList;
                }
                AndroidUtilities.runOnUIThread(new q1(vpVar, arrayList4, arrayList5, 29));
                return;
            default:
                vp.E((vp) this.d, (ArrayList) this.b, (ArrayList) this.c);
                return;
        }
    }

    public /* synthetic */ q1(bo boVar, org.telegram.ui.Components.n70 n70Var, String str) {
        this.a = 17;
        this.d = boVar;
        this.c = n70Var;
        this.b = str;
    }
}
