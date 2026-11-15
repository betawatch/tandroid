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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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

    /* JADX WARN: Code restructure failed: missing block: B:196:0x0478, code lost:
    
        if (r6 == null) goto L169;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0489 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2;
        boolean z10;
        String str;
        int i7;
        String str2;
        int i10;
        int i11 = this.a;
        String str3 = "";
        int i12 = 4;
        boolean z11 = true;
        boolean z12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (i11) {
            case 0:
                String str4 = (String) obj;
                q1 q1Var = ((ArticleViewer$BlockEmbedCell$TelegramWebviewProxy) obj3).a;
                if ("resize_frame".equals((String) obj2)) {
                    try {
                        q1Var.r = Utilities.z(new JSONObject(str4).getString("height")).intValue();
                        q1Var.requestLayout();
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                return;
            case 1:
                String str5 = (String) obj2;
                String str6 = (String) obj;
                kl0 kl0Var = ((PaymentFormActivity$TelegramWebviewProxy) obj3).a;
                if (kl0Var.getParentActivity() != null && str5.equals("payment_form_submit")) {
                    try {
                        JSONObject jSONObject = new JSONObject(str6);
                        kl0Var.x0 = jSONObject.getJSONObject("credentials").toString();
                        kl0Var.y0 = jSONObject.getString("title");
                    } catch (Throwable th2) {
                        kl0Var.x0 = str6;
                        org.telegram.messenger.a8.g(th2, true);
                    }
                    kl0Var.z0();
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
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    ((ei.b) arrayList.get(i13)).a.delete();
                }
                org.telegram.messenger.g0.h3(new u5(1, y6Var, t1Var));
                return;
            case 4:
                t7 t7Var = (t7) obj3;
                ei.b bVar = (ei.b) obj2;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) obj;
                try {
                    mediaMetadataRetriever2 = new MediaMetadataRetriever();
                    try {
                        try {
                            mediaMetadataRetriever2.setDataSource(t7Var.getContext(), Uri.fromFile(bVar.a));
                            str = mediaMetadataRetriever2.extractMetadata(7);
                        } catch (Exception e10) {
                            e = e10;
                            str = "";
                        }
                        try {
                            str3 = mediaMetadataRetriever2.extractMetadata(2);
                        } catch (Exception e11) {
                            e = e11;
                            z10 = true;
                            org.telegram.messenger.a8.g(e, z10);
                            break;
                        }
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
                } catch (Exception e12) {
                    e = e12;
                    mediaMetadataRetriever2 = null;
                    z10 = true;
                    str = "";
                } catch (Throwable th4) {
                    th = th4;
                    mediaMetadataRetriever = null;
                    if (mediaMetadataRetriever != null) {
                    }
                    throw th;
                }
                try {
                    mediaMetadataRetriever2.release();
                } catch (Throwable unused3) {
                }
                org.telegram.messenger.g0.h3(new ai.b(t7Var, bVar, tL_documentAttributeAudio, str, str3, 21));
                return;
            case 5:
                ((d8) obj3).b.y.finishFragment();
                ((an) obj2).ha(((g8) obj).h);
                return;
            case 6:
                i9.Z((i9) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
            case 7:
                org.telegram.messenger.g0.g(((String[]) obj3)[0]);
                org.telegram.messenger.i20.s(null, 2131748921, new org.telegram.ui.Components.cc(((org.telegram.ui.ActionBar.u2) obj2).F, (org.telegram.ui.ActionBar.e6) obj));
                return;
            case 8:
                la.c0((la) obj3, (org.telegram.ui.ActionBar.t1) obj2, (TLRPC.User) obj);
                return;
            case 9:
                lb.e0((lb) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
            case 10:
                TLObject tLObject2 = (TLObject) obj2;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj;
                HashMap hashMap = ((oc) obj3).x;
                if (!(tLObject2 instanceof TLRPC.TL_wallPaper)) {
                    i6Var.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject2;
                String r10 = org.telegram.messenger.w7.r(null, wallPaper.document);
                if (hashMap.containsKey(r10)) {
                    return;
                }
                hashMap.put(r10, i6Var);
                org.telegram.messenger.w7.G(i6Var.F).W(wallPaper.document, wallPaper, 1, 1);
                return;
            case 11:
                ad adVar = (ad) obj3;
                TLObject tLObject3 = (TLObject) obj;
                if (((TLRPC.TL_error) obj2) == null) {
                    adVar.getClass();
                    adVar.e0 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvites) tLObject3).invites.get(0);
                }
                adVar.d0 = false;
                org.telegram.ui.Components.t70 t70Var = adVar.R;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = adVar.e0;
                t70Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
                return;
            case 12:
                ((z41) obj3).showDialog(xd.I((Context) obj2, (org.telegram.ui.ActionBar.e6) obj, false));
                return;
            case 13:
                xd xdVar = (xd) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                Context context = (Context) obj;
                if (tLObject4 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    vf.c.t(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject4).url);
                }
                org.telegram.messenger.g0.i3(new cd(xdVar, i12), 1000L);
                return;
            case 14:
                an anVar = (an) obj3;
                anVar.f = ((org.telegram.messenger.vr) obj2).j0(anVar.h.user_id);
                ((CountDownLatch) obj).countDown();
                return;
            case 15:
                org.telegram.messenger.g0.h3(new u5(21, (di.i2) obj, ((an) obj3).getMessagesStorage().j0(((TLRPC.TL_contact) obj2).user_id)));
                return;
            case 16:
                an.l0((an) obj3, (TLRPC.User) obj2, (TLRPC.EmojiStatus) obj);
                return;
            case 17:
                an anVar2 = (an) obj3;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) obj2;
                ((org.telegram.ui.ActionBar.u2) org.telegram.ui.Components.t4.Q(anVar2.getParentActivity(), suggestedPost != null ? suggestedPost.schedule_date : 0L, new a7(anVar2, suggestedPost, (org.telegram.messenger.gj) obj, 5), anVar2.getResourceProvider(), 0).b).show();
                return;
            case 18:
                an anVar3 = (an) obj3;
                anVar3.getClass();
                ((org.telegram.ui.Components.ok0) obj2).dismiss();
                anVar3.presentFragment(ProfileActivity.C4(((TLRPC.User) obj).id));
                return;
            case 19:
                an anVar4 = (an) obj3;
                ((org.telegram.ui.Components.m60) obj).u();
                bh0 bh0Var = new bh0(anVar4.getParentActivity(), anVar4);
                bh0Var.N0((String) obj2, false);
                bh0Var.show();
                return;
            case 20:
                an.o1((an) obj3, (cg.a) obj2, (Runnable) obj);
                return;
            case 21:
                an.f0((an) obj3, (TLObject) obj2, (TLRPC.User) obj);
                return;
            case 22:
                org.telegram.ui.Components.t4.c0(r10.currentAccount, (TLRPC.TL_error) obj2, (an) obj3, (TLRPC.TL_messages_editMessage) obj, new Object[0]);
                return;
            case 23:
                dl dlVar = (dl) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
                el elVar = dlVar.c;
                if (tLObject5 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject5;
                    an anVar5 = elVar.a.R;
                    anVar5.getMessagesController().Y3(tL_photos_photo.users, false);
                    TLRPC.User a22 = anVar5.getMessagesController().a2(Long.valueOf(anVar5.getUserConfig().n));
                    if ((tL_photos_photo.photo instanceof TLRPC.TL_photo) && a22 != null) {
                        bg.m0.a(gjVar.k.action.photo, a22, false);
                        anVar5.getUserConfig().w(a22);
                        anVar5.getUserConfig().v(true);
                        org.telegram.ui.Components.cc.a0(anVar5).V(Collections.singletonList(a22), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131754219, null)), org.telegram.messenger.g0.U2(org.telegram.messenger.hd.M0(2131754220, null), new bh(dlVar, 6)), null).j();
                    }
                }
                gjVar.q = false;
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
                org.telegram.messenger.gj messageObject = q1Var2 == null ? null : q1Var2.getMessageObject();
                if (messageObject == null || messageObject.k == null) {
                    return;
                }
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = messageObject.P3();
                tL_message.id = messageObject.e1();
                tL_message.realId = messageObject.L1();
                tL_message.dialog_id = org.telegram.messenger.gj.B0(messageObject.k);
                TLRPC.Message message = messageObject.k;
                tL_message.peer_id = message.peer_id;
                tL_message.from_id = message.from_id;
                tL_message.date = message.date;
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = document;
                int i14 = tL_message.flags;
                tL_message.flags = i14 | 512;
                if (tL_message.from_id != null) {
                    tL_message.flags = i14 | 768;
                }
                ArrayList arrayList2 = new ArrayList();
                i7 = ((org.telegram.ui.ActionBar.e2) anVar6).currentAccount;
                arrayList2.add(new org.telegram.messenger.gj(i7, tL_message, false, true));
                MediaController.g0(anVar6.getParentActivity(), anVar6.getAccountInstance(), arrayList2, new org.telegram.messenger.pr() { // from class: org.telegram.ui.zl
                    @Override // org.telegram.messenger.pr
                    public final void a(int i15) {
                        an anVar7 = lm.this.a;
                        if (i15 <= 0 || anVar7.getParentActivity() == null || anVar7.fragmentView == null) {
                            return;
                        }
                        org.telegram.ui.Components.cc.a0(anVar7).m(org.telegram.messenger.gj.J3(document) ? org.telegram.ui.Components.bc.H : org.telegram.ui.Components.bc.J, i15, 0, 0, anVar7.Aa).j();
                    }
                });
                return;
            case 27:
                qn qnVar = (qn) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject6 = (TLObject) obj;
                qnVar.getClass();
                if (tL_error2 == null) {
                    qnVar.y0.invitesCount = ((TLRPC.TL_messages_exportedChatInvites) tLObject6).count;
                    qnVar.getMessagesStorage().w1(qnVar.y0.invitesCount, qnVar.w0);
                    qnVar.u0(false, false);
                    return;
                }
                return;
            case 28:
                so soVar = (so) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                soVar.getClass();
                String lowerCase = ((String) obj2).trim().toLowerCase();
                int i15 = 29;
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new o1(soVar, new ArrayList(), new ArrayList(), i15));
                    return;
                }
                String S0 = org.telegram.messenger.hd.E0().S0(lowerCase, true, false);
                if (lowerCase.equals(S0) || S0.length() == 0) {
                    S0 = null;
                }
                int i16 = (S0 != null ? 1 : 0) + 1;
                String[] strArr = new String[i16];
                strArr[0] = lowerCase;
                if (S0 != null) {
                    strArr[1] = S0;
                }
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int i17 = 0;
                while (i17 < arrayList3.size()) {
                    TLRPC.Chat chat = (TLRPC.Chat) arrayList3.get(i17);
                    String lowerCase2 = chat.title.toLowerCase();
                    String S02 = org.telegram.messenger.hd.E0().S0(lowerCase2, z11, z12);
                    if (lowerCase2.equals(S02)) {
                        S02 = null;
                    }
                    int i18 = z12;
                    int i19 = i18;
                    String str7 = null;
                    while (true) {
                        if (i18 < i16) {
                            String str8 = strArr[i18];
                            if (lowerCase2.startsWith(str8) || i5.c.A(" ", str8, lowerCase2) || (S02 != null && (S02.startsWith(str8) || i5.c.A(" ", str8, S02)))) {
                                str2 = str7;
                                i10 = 1;
                            } else {
                                String str9 = chat.username;
                                if (str9 == null || !str9.startsWith(str8)) {
                                    ArrayList<TLRPC.TL_username> arrayList6 = chat.usernames;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        for (int i20 = 0; i20 < chat.usernames.size(); i20++) {
                                            TLRPC.TL_username tL_username = chat.usernames.get(i20);
                                            if (tL_username.active && tL_username.username.startsWith(str8)) {
                                                str2 = tL_username.username;
                                            }
                                        }
                                    }
                                    str2 = str7;
                                    i10 = i19;
                                } else {
                                    str2 = chat.username;
                                }
                                i10 = 2;
                            }
                            if (i10 != 0) {
                                if (i10 == 1) {
                                    arrayList5.add(org.telegram.messenger.g0.r0(chat.title, null, str8));
                                } else {
                                    arrayList5.add(org.telegram.messenger.g0.r0(r.b.k("@", str2), null, "@" + str8));
                                }
                                arrayList4.add(chat);
                            } else {
                                i18++;
                                str7 = str2;
                                i19 = i10;
                            }
                        }
                    }
                    i17++;
                    z11 = true;
                    z12 = 0;
                }
                org.telegram.messenger.g0.h3(new o1(soVar, arrayList4, arrayList5, 29));
                return;
            default:
                so.E((so) obj3, (ArrayList) obj2, (ArrayList) obj);
                return;
        }
    }

    public /* synthetic */ o1(an anVar, org.telegram.ui.Components.m60 m60Var, String str) {
        this.a = 19;
        this.d = anVar;
        this.c = m60Var;
        this.b = str;
    }
}
