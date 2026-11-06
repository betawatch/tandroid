package org.telegram.ui;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o1(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:203:0x048e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        MediaMetadataRetriever mediaMetadataRetriever;
        boolean z9;
        MediaMetadataRetriever mediaMetadataRetriever2;
        int i7;
        String str;
        int i10;
        int i11 = this.a;
        int i12 = 3;
        String str2 = "";
        int i13 = 4;
        boolean z10 = true;
        boolean z11 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (i11) {
            case 0:
                String str3 = (String) obj;
                q1 q1Var = ((ArticleViewer$BlockEmbedCell$TelegramWebviewProxy) obj3).a;
                if ("resize_frame".equals((String) obj2)) {
                    try {
                        q1Var.r = Utilities.z(new JSONObject(str3).getString("height")).intValue();
                        q1Var.requestLayout();
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                return;
            case 1:
                String str4 = (String) obj2;
                String str5 = (String) obj;
                hl0 hl0Var = ((PaymentFormActivity$TelegramWebviewProxy) obj3).a;
                if (hl0Var.getParentActivity() != null && str4.equals("payment_form_submit")) {
                    try {
                        JSONObject jSONObject = new JSONObject(str5);
                        hl0Var.w0 = jSONObject.getJSONObject("credentials").toString();
                        hl0Var.x0 = jSONObject.getString("title");
                    } catch (Throwable th2) {
                        hl0Var.w0 = str5;
                        org.telegram.messenger.a8.g(th2, true);
                    }
                    hl0Var.z0();
                    return;
                }
                return;
            case 2:
                o oVar = (o) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj;
                oVar.getClass();
                if (tL_error == null) {
                    oVar.c0((TLRPC.TL_messages_archivedStickers) tLObject);
                    return;
                }
                return;
            case 3:
                y6 y6Var = (y6) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj;
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    ((ci.b) arrayList.get(i14)).a.delete();
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.p(12, y6Var, u1Var));
                return;
            case 4:
                String str6 = null;
                t7 t7Var = (t7) obj3;
                ci.b bVar = (ci.b) obj2;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) obj;
                try {
                    try {
                        mediaMetadataRetriever2 = new MediaMetadataRetriever();
                        try {
                            try {
                                mediaMetadataRetriever2.setDataSource(t7Var.getContext(), Uri.fromFile(bVar.a));
                                str6 = mediaMetadataRetriever2.extractMetadata(7);
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
                        } catch (Exception e10) {
                            e = e10;
                            mediaMetadataRetriever = mediaMetadataRetriever2;
                            str6 = "";
                        }
                    } catch (Throwable unused3) {
                    }
                    try {
                        str2 = mediaMetadataRetriever2.extractMetadata(2);
                        mediaMetadataRetriever2.release();
                    } catch (Exception e11) {
                        e = e11;
                        mediaMetadataRetriever = mediaMetadataRetriever2;
                        z9 = true;
                        try {
                            org.telegram.messenger.a8.g(e, z9);
                            if (mediaMetadataRetriever != null) {
                                mediaMetadataRetriever.release();
                            }
                            org.telegram.messenger.g0.h3(new bi.u0(t7Var, bVar, tL_documentAttributeAudio, str6, str2, 19));
                            return;
                        } catch (Throwable th4) {
                            th = th4;
                            if (mediaMetadataRetriever != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Exception e12) {
                    e = e12;
                    mediaMetadataRetriever = null;
                    z9 = true;
                    str6 = "";
                } catch (Throwable th5) {
                    th = th5;
                    mediaMetadataRetriever = null;
                }
                org.telegram.messenger.g0.h3(new bi.u0(t7Var, bVar, tL_documentAttributeAudio, str6, str2, 19));
                return;
            case 5:
                ((c8) obj3).b.y.finishFragment();
                ((an) obj2).fa(((f8) obj).h);
                return;
            case 6:
                i9.Z((i9) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
            case 7:
                org.telegram.messenger.g0.g(((String[]) obj3)[0]);
                org.telegram.messenger.camera.q.r(null, 2131748920, new org.telegram.ui.Components.hc(((org.telegram.ui.ActionBar.v2) obj2).E, (org.telegram.ui.ActionBar.f6) obj));
                return;
            case 8:
                la.c0((la) obj3, (org.telegram.ui.ActionBar.u1) obj2, (TLRPC.User) obj);
                return;
            case 9:
                mb.e0((mb) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
            case 10:
                TLObject tLObject2 = (TLObject) obj2;
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) obj;
                HashMap hashMap = ((pc) obj3).x;
                if (!(tLObject2 instanceof TLRPC.TL_wallPaper)) {
                    j6Var.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject2;
                String r10 = org.telegram.messenger.w7.r(null, wallPaper.document);
                if (hashMap.containsKey(r10)) {
                    return;
                }
                hashMap.put(r10, j6Var);
                org.telegram.messenger.w7.G(j6Var.E).W(wallPaper.document, wallPaper, 1, 1);
                return;
            case 11:
                bd bdVar = (bd) obj3;
                TLObject tLObject3 = (TLObject) obj;
                if (((TLRPC.TL_error) obj2) == null) {
                    bdVar.getClass();
                    bdVar.d0 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvites) tLObject3).invites.get(0);
                }
                bdVar.c0 = false;
                org.telegram.ui.Components.q70 q70Var = bdVar.Q;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = bdVar.d0;
                q70Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
                return;
            case 12:
                ((c51) obj3).showDialog(zd.I((Context) obj2, (org.telegram.ui.ActionBar.f6) obj, false));
                return;
            case 13:
                zd zdVar = (zd) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                Context context = (Context) obj;
                if (tLObject4 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    vf.c.t(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject4).url);
                }
                org.telegram.messenger.g0.i3(new dd(zdVar, i13), 1000L);
                return;
            case 14:
                an anVar = (an) obj3;
                anVar.f = ((org.telegram.messenger.yr) obj2).j0(anVar.h.user_id);
                ((CountDownLatch) obj).countDown();
                return;
            case 15:
                org.telegram.messenger.g0.h3(new qf(i12, (bi.z2) obj, ((an) obj3).getMessagesStorage().j0(((TLRPC.TL_contact) obj2).user_id)));
                return;
            case 16:
                an.k0((an) obj3, (TLRPC.User) obj2, (TLRPC.EmojiStatus) obj);
                return;
            case 17:
                an anVar2 = (an) obj3;
                anVar2.getClass();
                ((org.telegram.ui.Components.jk0) obj2).dismiss();
                anVar2.presentFragment(ProfileActivity.A4(((TLRPC.User) obj).id));
                return;
            case 18:
                an anVar3 = (an) obj3;
                ((org.telegram.ui.Components.k60) obj).u();
                ah0 ah0Var = new ah0(anVar3.getParentActivity(), anVar3);
                ah0Var.N0((String) obj2, false);
                ah0Var.show();
                return;
            case 19:
                an anVar4 = (an) obj3;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) obj2;
                ((org.telegram.ui.ActionBar.v2) org.telegram.ui.Components.v4.Q(anVar4.getParentActivity(), suggestedPost != null ? suggestedPost.schedule_date : 0L, new a7(anVar4, suggestedPost, (org.telegram.messenger.ij) obj, 5), anVar4.getResourceProvider(), 0).b).show();
                return;
            case 20:
                an.w0((an) obj3, (cg.a) obj2, (Runnable) obj);
                return;
            case 21:
                an.e0((an) obj3, (TLObject) obj2, (TLRPC.User) obj);
                return;
            case 22:
                org.telegram.ui.Components.v4.c0(r11.currentAccount, (TLRPC.TL_error) obj2, (an) obj3, (TLRPC.TL_messages_editMessage) obj, new Object[0]);
                return;
            case 23:
                dl dlVar = (dl) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
                el elVar = dlVar.c;
                if (tLObject5 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject5;
                    an anVar5 = elVar.a.Q;
                    anVar5.getMessagesController().Y3(tL_photos_photo.users, false);
                    TLRPC.User a22 = anVar5.getMessagesController().a2(Long.valueOf(anVar5.getUserConfig().n));
                    if ((tL_photos_photo.photo instanceof TLRPC.TL_photo) && a22 != null) {
                        bg.n0.a(ijVar.k.action.photo, a22, false);
                        anVar5.getUserConfig().w(a22);
                        anVar5.getUserConfig().v(true);
                        org.telegram.ui.Components.hc.a0(anVar5).V(Collections.singletonList(a22), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131754219, null)), org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131754220, null), new bh(dlVar, 6)), null).j();
                    }
                }
                ijVar.q = false;
                return;
            case 24:
                ((lm) obj3).l((org.telegram.ui.Cells.q1) obj2, (TLRPC.User) obj);
                return;
            case 25:
                ((lm) obj3).i((org.telegram.ui.Cells.q1) obj2, (TLRPC.Chat) obj, 0, false);
                return;
            case 26:
                final lm lmVar = (lm) obj3;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) obj2;
                final TLRPC.Document document = (TLRPC.Document) obj;
                an anVar6 = lmVar.a;
                if (anVar6.getParentActivity() == null || document == null) {
                    return;
                }
                if ((Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.r2.b) && anVar6.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    anVar6.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                org.telegram.messenger.ij messageObject = q1Var2 == null ? null : q1Var2.getMessageObject();
                if (messageObject == null || messageObject.k == null) {
                    return;
                }
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = messageObject.Q3();
                tL_message.id = messageObject.f1();
                tL_message.realId = messageObject.M1();
                tL_message.dialog_id = org.telegram.messenger.ij.B0(messageObject.k);
                TLRPC.Message message = messageObject.k;
                tL_message.peer_id = message.peer_id;
                tL_message.from_id = message.from_id;
                tL_message.date = message.date;
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags = 3 | tL_messageMediaDocument.flags;
                tL_messageMediaDocument.document = document;
                int i15 = tL_message.flags;
                tL_message.flags = i15 | 512;
                if (tL_message.from_id != null) {
                    tL_message.flags = i15 | 768;
                }
                ArrayList arrayList2 = new ArrayList();
                i7 = ((org.telegram.ui.ActionBar.f2) anVar6).currentAccount;
                arrayList2.add(new org.telegram.messenger.ij(i7, tL_message, false, true));
                MediaController.g0(anVar6.getParentActivity(), anVar6.getAccountInstance(), arrayList2, new org.telegram.messenger.sr() { // from class: org.telegram.ui.zl
                    @Override // org.telegram.messenger.sr
                    public final void a(int i16) {
                        an anVar7 = lm.this.a;
                        if (i16 <= 0 || anVar7.getParentActivity() == null || anVar7.fragmentView == null) {
                            return;
                        }
                        org.telegram.ui.Components.hc.a0(anVar7).m(org.telegram.messenger.ij.K3(document) ? org.telegram.ui.Components.gc.G : org.telegram.ui.Components.gc.I, i16, 0, 0, anVar7.xa).j();
                    }
                });
                return;
            case 27:
                pn pnVar = (pn) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject6 = (TLObject) obj;
                pnVar.getClass();
                if (tL_error2 == null) {
                    pnVar.x0.invitesCount = ((TLRPC.TL_messages_exportedChatInvites) tLObject6).count;
                    pnVar.getMessagesStorage().w1(pnVar.x0.invitesCount, pnVar.v0);
                    pnVar.u0(false, false);
                    return;
                }
                return;
            case 28:
                ro roVar = (ro) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                roVar.getClass();
                String lowerCase = ((String) obj2).trim().toLowerCase();
                int i16 = 29;
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new o1(roVar, new ArrayList(), new ArrayList(), i16));
                    return;
                }
                String S0 = org.telegram.messenger.hd.E0().S0(lowerCase, true, false);
                if (lowerCase.equals(S0) || S0.length() == 0) {
                    S0 = null;
                }
                int i17 = (S0 != null ? 1 : 0) + 1;
                String[] strArr = new String[i17];
                strArr[0] = lowerCase;
                if (S0 != null) {
                    strArr[1] = S0;
                }
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int i18 = 0;
                while (i18 < arrayList3.size()) {
                    TLRPC.Chat chat = (TLRPC.Chat) arrayList3.get(i18);
                    String lowerCase2 = chat.title.toLowerCase();
                    String S02 = org.telegram.messenger.hd.E0().S0(lowerCase2, z10, z11);
                    if (lowerCase2.equals(S02)) {
                        S02 = null;
                    }
                    int i19 = z11;
                    int i20 = i19;
                    String str7 = null;
                    while (true) {
                        if (i19 < i17) {
                            String str8 = strArr[i19];
                            if (lowerCase2.startsWith(str8) || jg.g.A(" ", str8, lowerCase2) || (S02 != null && (S02.startsWith(str8) || jg.g.A(" ", str8, S02)))) {
                                str = str7;
                                i10 = 1;
                            } else {
                                String str9 = chat.username;
                                if (str9 == null || !str9.startsWith(str8)) {
                                    ArrayList<TLRPC.TL_username> arrayList6 = chat.usernames;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        for (int i21 = 0; i21 < chat.usernames.size(); i21++) {
                                            TLRPC.TL_username tL_username = chat.usernames.get(i21);
                                            if (tL_username.active && tL_username.username.startsWith(str8)) {
                                                str = tL_username.username;
                                            }
                                        }
                                    }
                                    str = str7;
                                    i10 = i20;
                                } else {
                                    str = chat.username;
                                }
                                i10 = 2;
                            }
                            if (i10 != 0) {
                                if (i10 == 1) {
                                    arrayList5.add(org.telegram.messenger.g0.r0(chat.title, null, str8));
                                } else {
                                    arrayList5.add(org.telegram.messenger.g0.r0(rf.b.i("@", str), null, "@" + str8));
                                }
                                arrayList4.add(chat);
                            } else {
                                i19++;
                                str7 = str;
                                i20 = i10;
                            }
                        }
                    }
                    i18++;
                    z10 = true;
                    z11 = 0;
                }
                org.telegram.messenger.g0.h3(new o1(roVar, arrayList4, arrayList5, 29));
                return;
            default:
                ro.E((ro) obj3, (ArrayList) obj2, (ArrayList) obj);
                return;
        }
    }

    public /* synthetic */ o1(an anVar, org.telegram.ui.Components.k60 k60Var, String str) {
        this.a = 18;
        this.d = anVar;
        this.c = k60Var;
        this.b = str;
    }
}
