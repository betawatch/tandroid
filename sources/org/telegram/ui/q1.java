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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                xo0 xo0Var = paymentFormActivity$TelegramWebviewProxy.a;
                if (xo0Var.getParentActivity() != null && str5.equals("payment_form_submit")) {
                    try {
                        JSONObject jSONObject = new JSONObject(str6);
                        xo0Var.w0 = jSONObject.getJSONObject("credentials").toString();
                        xo0Var.x0 = jSONObject.getString("title");
                    } catch (Throwable th2) {
                        xo0Var.w0 = str6;
                        FileLog.e(th2);
                    }
                    xo0Var.t0();
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c6(9, z6Var, b2Var));
                return;
            case 4:
                t7 t7Var = (t7) this.d;
                zh.a aVar = (zh.a) this.b;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) this.c;
                String str7 = "";
                MediaMetadataRetriever mediaMetadataRetriever = null;
                try {
                    try {
                        MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                        try {
                            try {
                                mediaMetadataRetriever2.setDataSource(t7Var.getContext(), Uri.fromFile(aVar.a));
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
                            AndroidUtilities.runOnUIThread(new ai.m3(t7Var, aVar, tL_documentAttributeAudio, str2, str7, 12));
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
                            AndroidUtilities.runOnUIThread(new ai.m3(t7Var, aVar, tL_documentAttributeAudio, str2, str7, 12));
                            return;
                        }
                    } catch (Exception e10) {
                        e = e10;
                    }
                    AndroidUtilities.runOnUIThread(new ai.m3(t7Var, aVar, tL_documentAttributeAudio, str2, str7, 12));
                    return;
                } catch (Throwable th4) {
                    th = th4;
                }
            case 5:
                d8 d8Var = (d8) this.d;
                zn znVar = (zn) this.b;
                g8 g8Var = (g8) this.c;
                d8Var.b.x.finishFragment();
                znVar.G9(g8Var.h);
                return;
            case 6:
                l9.W((l9) this.d, (TLRPC.TL_error) this.b, (TLObject) this.c);
                return;
            case 7:
                String[] strArr = (String[]) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.b;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.c;
                AndroidUtilities.addToClipboard(strArr[0]);
                org.telegram.messenger.rk.o(R.string.LinkCopied, new org.telegram.ui.Components.xc(f3Var.topBulletinContainer, f6Var));
                return;
            case 8:
                ra.X((ra) this.d, (org.telegram.ui.ActionBar.b2) this.b, (TLRPC.User) this.c);
                return;
            case 9:
                vb.Z((vb) this.d, (TLRPC.TL_error) this.b, (TLObject) this.c);
                return;
            case 10:
                zc zcVar = (zc) this.d;
                TLObject tLObject2 = (TLObject) this.b;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.c;
                HashMap hashMap = zcVar.w;
                if (!(tLObject2 instanceof TLRPC.TL_wallPaper)) {
                    i6Var.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject2;
                String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                if (hashMap.containsKey(attachFileName)) {
                    return;
                }
                hashMap.put(attachFileName, i6Var);
                FileLoader.getInstance(i6Var.E).loadFile(wallPaper.document, wallPaper, 1, 1);
                return;
            case 11:
                md mdVar = (md) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                if (tL_error2 == null) {
                    mdVar.getClass();
                    mdVar.c0 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvites) tLObject3).invites.get(0);
                }
                mdVar.b0 = false;
                org.telegram.ui.Components.g90 g90Var = mdVar.P;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = mdVar.c0;
                g90Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
                return;
            case 12:
                ke keVar = (ke) this.d;
                TLObject tLObject4 = (TLObject) this.b;
                Context context = (Context) this.c;
                if (tLObject4 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    nf.f.s(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject4).url);
                }
                AndroidUtilities.runOnUIThread(new od(keVar, 5), 1000L);
                return;
            case 13:
                ((bb1) this.d).showDialog(ke.d0((Context) this.b, (org.telegram.ui.ActionBar.f6) this.c, false));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c6(29, (ta) this.c, ((zn) this.d).getMessagesStorage().getUser(((TLRPC.TL_contact) this.b).user_id)));
                return;
            case 15:
                zn.U((zn) this.d, (TLRPC.User) this.b, (TLRPC.EmojiStatus) this.c);
                return;
            case 16:
                zn znVar2 = (zn) this.d;
                org.telegram.ui.Components.om0 om0Var = (org.telegram.ui.Components.om0) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                znVar2.getClass();
                om0Var.dismiss();
                znVar2.presentFragment(ProfileActivity.m4(user.id));
                return;
            case 17:
                zn znVar3 = (zn) this.d;
                org.telegram.ui.Components.y70 y70Var = (org.telegram.ui.Components.y70) this.c;
                String str8 = (String) this.b;
                y70Var.u();
                fk0 fk0Var = new fk0(znVar3.getParentActivity(), znVar3);
                fk0Var.v(str8, false);
                fk0Var.show();
                return;
            case 18:
                zn znVar4 = (zn) this.d;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.b;
                org.telegram.ui.Components.d5.T(znVar4.getParentActivity(), suggestedPost != null ? suggestedPost.schedule_date : 0L, new b7(znVar4, suggestedPost, (MessageObject) this.c, 5), znVar4.getResourceProvider(), 0).a.show();
                return;
            case 19:
                zn.m0((zn) this.d, (zf.a) this.b, (Runnable) this.c);
                return;
            case 20:
                zn.i1((zn) this.d, (TLObject) this.b, (TLRPC.User) this.c);
                return;
            case 21:
                org.telegram.ui.Components.d5.f0(r0.currentAccount, (TLRPC.TL_error) this.b, (zn) this.d, (TLRPC.TL_messages_editMessage) this.c, new Object[0]);
                return;
            case 22:
                zn znVar5 = (zn) this.d;
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                znVar5.f = messagesStorage.getUser(znVar5.h.user_id);
                countDownLatch.countDown();
                return;
            case 23:
                bm bmVar = (bm) this.d;
                TLObject tLObject5 = (TLObject) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                cm cmVar = bmVar.c;
                if (tLObject5 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject5;
                    zn znVar6 = cmVar.a.Q;
                    znVar6.getMessagesController().putUsers(tL_photos_photo.users, false);
                    TLRPC.User user2 = znVar6.getMessagesController().getUser(Long.valueOf(znVar6.getUserConfig().clientUserId));
                    if ((tL_photos_photo.photo instanceof TLRPC.TL_photo) && user2 != null) {
                        yf.d0.a(messageObject.messageOwner.action.photo, user2, false);
                        znVar6.getUserConfig().setCurrentUser(user2);
                        znVar6.getUserConfig().saveConfig(true);
                        org.telegram.ui.Components.xc.a0(znVar6).V(Collections.singletonList(user2), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new dj(bmVar, 5)), null).j();
                    }
                }
                messageObject.settingAvatar = false;
                return;
            case 24:
                ln.a((ln) this.d, (org.telegram.ui.Cells.u1) this.b, (TLRPC.Document) this.c);
                return;
            case 25:
                ((ln) this.d).v((org.telegram.ui.Cells.u1) this.b, (TLRPC.User) this.c);
                return;
            case 26:
                ((ln) this.d).q((org.telegram.ui.Cells.u1) this.b, (TLRPC.Chat) this.c, 0, false);
                return;
            case 27:
                uo uoVar = (uo) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                uoVar.getClass();
                if (tL_error3 == null) {
                    uoVar.y0.invitesCount = ((TLRPC.TL_messages_exportedChatInvites) tLObject6).count;
                    uoVar.getMessagesStorage().saveChatLinksCount(uoVar.w0, uoVar.y0.invitesCount);
                    uoVar.p0(false, false);
                    return;
                }
                return;
            case 28:
                tp tpVar = (tp) this.d;
                String str9 = (String) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                tpVar.getClass();
                String lowerCase = str9.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new q1(tpVar, new ArrayList(), new ArrayList(), 29));
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
                            if (lowerCase2.startsWith(str11) || org.telegram.messenger.l0.v(" ", str11, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str11) || org.telegram.messenger.l0.v(" ", str11, translitString2)))) {
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
                                    arrayList5.add(AndroidUtilities.generateSearchName(v7.j0.g("@", str10), null, "@" + str11));
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
                AndroidUtilities.runOnUIThread(new q1(tpVar, arrayList4, arrayList5, 29));
                return;
            default:
                tp.E((tp) this.d, (ArrayList) this.b, (ArrayList) this.c);
                return;
        }
    }

    public /* synthetic */ q1(zn znVar, org.telegram.ui.Components.y70 y70Var, String str) {
        this.a = 17;
        this.d = znVar;
        this.c = y70Var;
        this.b = str;
    }
}
