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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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

    /* JADX WARN: Code restructure failed: missing block: B:196:0x0477, code lost:
    
        if (r6 == null) goto L169;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0488 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        MediaMetadataRetriever mediaMetadataRetriever;
        boolean z9;
        String str;
        int i7;
        String str2;
        int i10;
        String str3;
        int i11 = this.a;
        String str4 = "";
        int i12 = 4;
        boolean z10 = true;
        boolean z11 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (i11) {
            case 0:
                String str5 = (String) obj;
                q1 q1Var = ((ArticleViewer$BlockEmbedCell$TelegramWebviewProxy) obj3).a;
                if ("resize_frame".equals((String) obj2)) {
                    try {
                        q1Var.r = Utilities.z(new JSONObject(str5).getString("height")).intValue();
                        q1Var.requestLayout();
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                return;
            case 1:
                String str6 = (String) obj2;
                String str7 = (String) obj;
                jl0 jl0Var = ((PaymentFormActivity$TelegramWebviewProxy) obj3).a;
                if (jl0Var.getParentActivity() != null && str6.equals("payment_form_submit")) {
                    try {
                        JSONObject jSONObject = new JSONObject(str7);
                        jl0Var.w0 = jSONObject.getJSONObject("credentials").toString();
                        jl0Var.x0 = jSONObject.getString("title");
                    } catch (Throwable th2) {
                        jl0Var.w0 = str7;
                        org.telegram.messenger.a8.g(th2, true);
                    }
                    jl0Var.z0();
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
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    ((ci.b) arrayList.get(i13)).a.delete();
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.p(12, y6Var, u1Var));
                return;
            case 4:
                t7 t7Var = (t7) obj3;
                ci.b bVar = (ci.b) obj2;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) obj;
                try {
                    try {
                        mediaMetadataRetriever = new MediaMetadataRetriever();
                        try {
                            mediaMetadataRetriever.setDataSource(t7Var.getContext(), Uri.fromFile(bVar.a));
                            str = mediaMetadataRetriever.extractMetadata(7);
                        } catch (Exception e10) {
                            e = e10;
                            str = "";
                        }
                        try {
                            str4 = mediaMetadataRetriever.extractMetadata(2);
                        } catch (Exception e11) {
                            e = e11;
                            z9 = true;
                            org.telegram.messenger.a8.g(e, z9);
                            break;
                        }
                    } catch (Throwable th3) {
                        th = th3;
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
                    mediaMetadataRetriever = null;
                    z9 = true;
                    str = "";
                } catch (Throwable th4) {
                    th = th4;
                    mediaMetadataRetriever = null;
                    if (mediaMetadataRetriever != null) {
                    }
                    throw th;
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (Throwable unused3) {
                }
                org.telegram.messenger.g0.h3(new bi.u0(t7Var, bVar, tL_documentAttributeAudio, str, str4, 19));
                return;
            case 5:
                ((c8) obj3).b.y.finishFragment();
                ((cn) obj2).ga(((f8) obj).h);
                return;
            case 6:
                i9.Z((i9) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
            case 7:
                org.telegram.messenger.g0.g(((String[]) obj3)[0]);
                org.telegram.messenger.camera.q.r(null, 2131748921, new org.telegram.ui.Components.hc(((org.telegram.ui.ActionBar.v2) obj2).E, (org.telegram.ui.ActionBar.g6) obj));
                return;
            case 8:
                la.c0((la) obj3, (org.telegram.ui.ActionBar.u1) obj2, (TLRPC.User) obj);
                return;
            case 9:
                mb.e0((mb) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
            case 10:
                TLObject tLObject2 = (TLObject) obj2;
                org.telegram.ui.ActionBar.k6 k6Var = (org.telegram.ui.ActionBar.k6) obj;
                HashMap hashMap = ((pc) obj3).x;
                if (!(tLObject2 instanceof TLRPC.TL_wallPaper)) {
                    k6Var.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject2;
                String r10 = org.telegram.messenger.w7.r(null, wallPaper.document);
                if (hashMap.containsKey(r10)) {
                    return;
                }
                hashMap.put(r10, k6Var);
                org.telegram.messenger.w7.G(k6Var.E).W(wallPaper.document, wallPaper, 1, 1);
                return;
            case 11:
                bd bdVar = (bd) obj3;
                TLObject tLObject3 = (TLObject) obj;
                if (((TLRPC.TL_error) obj2) == null) {
                    bdVar.getClass();
                    bdVar.d0 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvites) tLObject3).invites.get(0);
                }
                bdVar.c0 = false;
                org.telegram.ui.Components.r70 r70Var = bdVar.Q;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = bdVar.d0;
                r70Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
                return;
            case 12:
                ((d51) obj3).showDialog(zd.I((Context) obj2, (org.telegram.ui.ActionBar.g6) obj, false));
                return;
            case 13:
                zd zdVar = (zd) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                Context context = (Context) obj;
                if (tLObject4 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    vf.c.t(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject4).url);
                }
                org.telegram.messenger.g0.i3(new dd(zdVar, i12), 1000L);
                return;
            case 14:
                cn cnVar = (cn) obj3;
                cnVar.f = ((org.telegram.messenger.yr) obj2).j0(cnVar.h.user_id);
                ((CountDownLatch) obj).countDown();
                return;
            case 15:
                org.telegram.messenger.g0.h3(new rf(2, (bi.z2) obj, ((cn) obj3).getMessagesStorage().j0(((TLRPC.TL_contact) obj2).user_id)));
                return;
            case 16:
                cn.l0((cn) obj3, (TLRPC.User) obj2, (TLRPC.EmojiStatus) obj);
                return;
            case 17:
                cn cnVar2 = (cn) obj3;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) obj2;
                ((org.telegram.ui.ActionBar.v2) org.telegram.ui.Components.v4.Q(cnVar2.getParentActivity(), suggestedPost != null ? suggestedPost.schedule_date : 0L, new a7(cnVar2, suggestedPost, (org.telegram.messenger.ij) obj, 5), cnVar2.getResourceProvider(), 0).b).show();
                return;
            case 18:
                cn cnVar3 = (cn) obj3;
                cnVar3.getClass();
                ((org.telegram.ui.Components.kk0) obj2).dismiss();
                cnVar3.presentFragment(ProfileActivity.D4(((TLRPC.User) obj).id));
                return;
            case 19:
                cn cnVar4 = (cn) obj3;
                ((org.telegram.ui.Components.l60) obj).u();
                ch0 ch0Var = new ch0(cnVar4.getParentActivity(), cnVar4);
                ch0Var.N0((String) obj2, false);
                ch0Var.show();
                return;
            case 20:
                cn.o1((cn) obj3, (cg.a) obj2, (Runnable) obj);
                return;
            case 21:
                cn.f0((cn) obj3, (TLObject) obj2, (TLRPC.User) obj);
                return;
            case 22:
                org.telegram.ui.Components.v4.c0(r10.currentAccount, (TLRPC.TL_error) obj2, (cn) obj3, (TLRPC.TL_messages_editMessage) obj, new Object[0]);
                return;
            case 23:
                fl flVar = (fl) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj;
                gl glVar = flVar.c;
                if (tLObject5 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject5;
                    cn cnVar5 = glVar.a.Q;
                    cnVar5.getMessagesController().Y3(tL_photos_photo.users, false);
                    TLRPC.User a22 = cnVar5.getMessagesController().a2(Long.valueOf(cnVar5.getUserConfig().n));
                    if ((tL_photos_photo.photo instanceof TLRPC.TL_photo) && a22 != null) {
                        bg.n0.a(ijVar.k.action.photo, a22, false);
                        cnVar5.getUserConfig().w(a22);
                        cnVar5.getUserConfig().v(true);
                        org.telegram.ui.Components.hc.a0(cnVar5).V(Collections.singletonList(a22), org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131754219, null)), org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(2131754220, null), new dh(flVar, 6)), null).j();
                    }
                }
                ijVar.q = false;
                return;
            case 24:
                ((nm) obj3).l((org.telegram.ui.Cells.q1) obj2, (TLRPC.User) obj);
                return;
            case 25:
                ((nm) obj3).i((org.telegram.ui.Cells.q1) obj2, (TLRPC.Chat) obj, 0, false);
                return;
            case 26:
                final nm nmVar = (nm) obj3;
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) obj2;
                final TLRPC.Document document = (TLRPC.Document) obj;
                cn cnVar6 = nmVar.a;
                if (cnVar6.getParentActivity() == null || document == null) {
                    return;
                }
                if ((Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.r2.b) && cnVar6.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    cnVar6.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                org.telegram.messenger.ij messageObject = q1Var2 == null ? null : q1Var2.getMessageObject();
                if (messageObject == null || messageObject.k == null) {
                    return;
                }
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = messageObject.P3();
                tL_message.id = messageObject.e1();
                tL_message.realId = messageObject.L1();
                tL_message.dialog_id = org.telegram.messenger.ij.B0(messageObject.k);
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
                i7 = ((org.telegram.ui.ActionBar.f2) cnVar6).currentAccount;
                arrayList2.add(new org.telegram.messenger.ij(i7, tL_message, false, true));
                MediaController.g0(cnVar6.getParentActivity(), cnVar6.getAccountInstance(), arrayList2, new org.telegram.messenger.sr() { // from class: org.telegram.ui.bm
                    @Override // org.telegram.messenger.sr
                    public final void a(int i15) {
                        cn cnVar7 = nm.this.a;
                        if (i15 <= 0 || cnVar7.getParentActivity() == null || cnVar7.fragmentView == null) {
                            return;
                        }
                        org.telegram.ui.Components.hc.a0(cnVar7).m(org.telegram.messenger.ij.J3(document) ? org.telegram.ui.Components.gc.G : org.telegram.ui.Components.gc.I, i15, 0, 0, cnVar7.za).j();
                    }
                });
                return;
            case 27:
                rn rnVar = (rn) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject6 = (TLObject) obj;
                rnVar.getClass();
                if (tL_error2 == null) {
                    rnVar.x0.invitesCount = ((TLRPC.TL_messages_exportedChatInvites) tLObject6).count;
                    rnVar.getMessagesStorage().w1(rnVar.x0.invitesCount, rnVar.v0);
                    rnVar.u0(false, false);
                    return;
                }
                return;
            case 28:
                to toVar = (to) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                toVar.getClass();
                String lowerCase = ((String) obj2).trim().toLowerCase();
                int i15 = 29;
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new o1(toVar, new ArrayList(), new ArrayList(), i15));
                    return;
                }
                String S0 = org.telegram.messenger.id.E0().S0(lowerCase, true, false);
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
                    String S02 = org.telegram.messenger.id.E0().S0(lowerCase2, z10, z11);
                    if (lowerCase2.equals(S02)) {
                        S02 = null;
                    }
                    int i18 = z11;
                    int i19 = i18;
                    String str8 = null;
                    while (true) {
                        if (i18 < i16) {
                            String str9 = strArr[i18];
                            if (lowerCase2.startsWith(str9) || jg.g.A(" ", str9, lowerCase2) || (S02 != null && (S02.startsWith(str9) || jg.g.A(" ", str9, S02)))) {
                                str2 = str8;
                                i10 = 1;
                            } else {
                                String str10 = chat.username;
                                if (str10 == null || !str10.startsWith(str9)) {
                                    ArrayList<TLRPC.TL_username> arrayList6 = chat.usernames;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        for (int i20 = 0; i20 < chat.usernames.size(); i20++) {
                                            TLRPC.TL_username tL_username = chat.usernames.get(i20);
                                            if (tL_username.active && tL_username.username.startsWith(str9)) {
                                                str3 = tL_username.username;
                                            }
                                        }
                                    }
                                    i10 = i19;
                                    str2 = str8;
                                } else {
                                    str3 = chat.username;
                                }
                                str2 = str3;
                                i10 = 2;
                            }
                            if (i10 != 0) {
                                if (i10 == 1) {
                                    arrayList5.add(org.telegram.messenger.g0.r0(chat.title, null, str9));
                                } else {
                                    arrayList5.add(org.telegram.messenger.g0.r0(rf.b.i("@", str2), null, "@" + str9));
                                }
                                arrayList4.add(chat);
                            } else {
                                i18++;
                                i19 = i10;
                                str8 = str2;
                            }
                        }
                    }
                    i17++;
                    z10 = true;
                    z11 = 0;
                }
                org.telegram.messenger.g0.h3(new o1(toVar, arrayList4, arrayList5, 29));
                return;
            default:
                to.E((to) obj3, (ArrayList) obj2, (ArrayList) obj);
                return;
        }
    }

    public /* synthetic */ o1(cn cnVar, org.telegram.ui.Components.l60 l60Var, String str) {
        this.a = 19;
        this.d = cnVar;
        this.c = l60Var;
        this.b = str;
    }
}
