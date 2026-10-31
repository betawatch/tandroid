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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p1(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:196:0x0476, code lost:
    
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
        String str;
        int i10;
        String str2;
        int i11;
        int i12 = this.a;
        int i13 = 7;
        String str3 = "";
        int i14 = 4;
        boolean z10 = true;
        boolean z11 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (i12) {
            case 0:
                String str4 = (String) obj;
                r1 r1Var = ((ArticleViewer$BlockEmbedCell$TelegramWebviewProxy) obj3).a;
                if ("resize_frame".equals((String) obj2)) {
                    try {
                        r1Var.r = Utilities.z(new JSONObject(str4).getString("height")).intValue();
                        r1Var.requestLayout();
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                return;
            case 1:
                String str5 = (String) obj2;
                String str6 = (String) obj;
                sm0 sm0Var = ((PaymentFormActivity$TelegramWebviewProxy) obj3).a;
                if (sm0Var.getParentActivity() != null && str5.equals("payment_form_submit")) {
                    try {
                        JSONObject jSONObject = new JSONObject(str6);
                        sm0Var.w0 = jSONObject.getJSONObject("credentials").toString();
                        sm0Var.x0 = jSONObject.getString("title");
                    } catch (Throwable th2) {
                        sm0Var.w0 = str6;
                        org.telegram.messenger.f8.g(th2, true);
                    }
                    sm0Var.y0();
                    return;
                }
                return;
            case 2:
                n nVar = (n) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj;
                nVar.getClass();
                if (tL_error == null) {
                    nVar.b0((TLRPC.TL_messages_archivedStickers) tLObject);
                    return;
                }
                return;
            case 3:
                y6 y6Var = (y6) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) obj;
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    ((sh.a) arrayList.get(i15)).a.delete();
                }
                org.telegram.messenger.i0.g3(new h0(6, y6Var, x1Var));
                return;
            case 4:
                t7 t7Var = (t7) obj3;
                sh.a aVar = (sh.a) obj2;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) obj;
                try {
                    try {
                        mediaMetadataRetriever = new MediaMetadataRetriever();
                        try {
                            mediaMetadataRetriever.setDataSource(t7Var.getContext(), Uri.fromFile(aVar.a));
                            str = mediaMetadataRetriever.extractMetadata(7);
                        } catch (Exception e) {
                            e = e;
                            str = "";
                        }
                        try {
                            str3 = mediaMetadataRetriever.extractMetadata(2);
                        } catch (Exception e7) {
                            e = e7;
                            org.telegram.messenger.f8.g(e, true);
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
                } catch (Exception e10) {
                    e = e10;
                    str = "";
                    mediaMetadataRetriever = null;
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
                org.telegram.messenger.i0.g3(new ag.e3(t7Var, aVar, tL_documentAttributeAudio, str, str3, 9));
                return;
            case 5:
                ((c8) obj3).b.y.finishFragment();
                ((un) obj2).V9(((f8) obj).h);
                return;
            case 6:
                j9.Y((j9) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
            case 7:
                org.telegram.messenger.i0.g(((String[]) obj3)[0]);
                org.telegram.messenger.z20.r(null, 2131748931, new org.telegram.ui.Components.cc(((org.telegram.ui.ActionBar.z2) obj2).E, (org.telegram.ui.ActionBar.p6) obj));
                return;
            case 8:
                oa.b0((oa) obj3, (org.telegram.ui.ActionBar.x1) obj2, (TLRPC.User) obj);
                return;
            case 9:
                sb.d0((sb) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
            case 10:
                TLObject tLObject2 = (TLObject) obj2;
                org.telegram.ui.ActionBar.s6 s6Var = (org.telegram.ui.ActionBar.s6) obj;
                HashMap hashMap = ((xc) obj3).x;
                if (!(tLObject2 instanceof TLRPC.TL_wallPaper)) {
                    s6Var.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject2;
                String r10 = org.telegram.messenger.b8.r(null, wallPaper.document);
                if (hashMap.containsKey(r10)) {
                    return;
                }
                hashMap.put(r10, s6Var);
                org.telegram.messenger.b8.G(s6Var.E).X(wallPaper.document, wallPaper, 1, 1);
                return;
            case 11:
                kd kdVar = (kd) obj3;
                TLObject tLObject3 = (TLObject) obj;
                if (((TLRPC.TL_error) obj2) == null) {
                    kdVar.getClass();
                    kdVar.d0 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvites) tLObject3).invites.get(0);
                }
                kdVar.c0 = false;
                org.telegram.ui.Components.j80 j80Var = kdVar.Q;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = kdVar.d0;
                j80Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
                return;
            case 12:
                ((u61) obj3).showDialog(le.I((Context) obj2, (org.telegram.ui.ActionBar.p6) obj, false));
                return;
            case 13:
                le leVar = (le) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                Context context = (Context) obj;
                if (tLObject4 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    gf.f.r(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject4).url);
                }
                org.telegram.messenger.i0.h3(new md(leVar, i14), 1000L);
                return;
            case 14:
                un unVar = (un) obj3;
                unVar.f = ((org.telegram.messenger.hs) obj2).j0(unVar.h.user_id);
                ((CountDownLatch) obj).countDown();
                return;
            case 15:
                org.telegram.messenger.i0.g3(new h0(27, (pa) obj, ((un) obj3).getMessagesStorage().j0(((TLRPC.TL_contact) obj2).user_id)));
                return;
            case 16:
                un.v0((un) obj3, (TLRPC.User) obj2, (TLRPC.EmojiStatus) obj);
                return;
            case 17:
                un unVar2 = (un) obj3;
                unVar2.getClass();
                ((org.telegram.ui.Components.nl0) obj2).dismiss();
                unVar2.presentFragment(ProfileActivity.z4(((TLRPC.User) obj).id));
                return;
            case 18:
                un unVar3 = (un) obj3;
                ((org.telegram.ui.Components.z60) obj).u();
                gi0 gi0Var = new gi0(unVar3.getParentActivity(), unVar3);
                gi0Var.N0((String) obj2, false);
                gi0Var.show();
                return;
            case 19:
                un unVar4 = (un) obj3;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) obj2;
                ((org.telegram.ui.ActionBar.z2) org.telegram.ui.Components.s4.S(unVar4.getParentActivity(), suggestedPost != null ? suggestedPost.schedule_date : 0L, new a7(unVar4, suggestedPost, (org.telegram.messenger.jj) obj, 5), unVar4.getResourceProvider(), 0).b).show();
                return;
            case 20:
                un.Z((un) obj3, (sf.a) obj2, (Runnable) obj);
                return;
            case 21:
                un.W0((un) obj3, (TLObject) obj2, (TLRPC.User) obj);
                return;
            case 22:
                org.telegram.ui.Components.s4.e0(r11.currentAccount, (TLRPC.TL_error) obj2, (un) obj3, (TLRPC.TL_messages_editMessage) obj, new Object[0]);
                return;
            case 23:
                zl zlVar = (zl) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) obj;
                am amVar = zlVar.c;
                if (tLObject5 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject5;
                    un unVar5 = amVar.a.Q;
                    unVar5.getMessagesController().V3(tL_photos_photo.users, false);
                    TLRPC.User Z1 = unVar5.getMessagesController().Z1(Long.valueOf(unVar5.getUserConfig().n));
                    if ((tL_photos_photo.photo instanceof TLRPC.TL_photo) && Z1 != null) {
                        rf.z.a(jjVar.k.action.photo, Z1, false);
                        unVar5.getUserConfig().w(Z1);
                        unVar5.getUserConfig().v(true);
                        org.telegram.ui.Components.cc.a0(unVar5).V(Collections.singletonList(Z1), org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131754219, null)), org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(2131754220, null), new rh(zlVar, i13)), null).j();
                    }
                }
                jjVar.q = false;
                return;
            case 24:
                fn fnVar = (fn) obj3;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj2;
                TLRPC.Document document = (TLRPC.Document) obj;
                un unVar6 = fnVar.a;
                if (unVar6.getParentActivity() == null || document == null) {
                    return;
                }
                if ((Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.v2.b) && unVar6.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    unVar6.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                org.telegram.messenger.jj messageObject = q1Var == null ? null : q1Var.getMessageObject();
                if (messageObject == null || messageObject.k == null) {
                    return;
                }
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = messageObject.P3();
                tL_message.id = messageObject.f1();
                tL_message.realId = messageObject.M1();
                tL_message.dialog_id = org.telegram.messenger.jj.B0(messageObject.k);
                TLRPC.Message message = messageObject.k;
                tL_message.peer_id = message.peer_id;
                tL_message.from_id = message.from_id;
                tL_message.date = message.date;
                tL_message.message = "";
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                tL_message.media = tL_messageMediaDocument;
                tL_messageMediaDocument.flags |= 3;
                tL_messageMediaDocument.document = document;
                int i16 = tL_message.flags;
                tL_message.flags = i16 | 512;
                if (tL_message.from_id != null) {
                    tL_message.flags = i16 | 768;
                }
                ArrayList arrayList2 = new ArrayList();
                i10 = ((org.telegram.ui.ActionBar.k2) unVar6).currentAccount;
                arrayList2.add(new org.telegram.messenger.jj(i10, tL_message, false, true));
                MediaController.g0(unVar6.getParentActivity(), unVar6.getAccountInstance(), arrayList2, new ra(fnVar, 1));
                return;
            case 25:
                ((fn) obj3).m((org.telegram.ui.Cells.q1) obj2, (TLRPC.User) obj);
                return;
            case 26:
                ((fn) obj3).k((org.telegram.ui.Cells.q1) obj2, (TLRPC.Chat) obj, 0, false);
                return;
            case 27:
                oo ooVar = (oo) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject6 = (TLObject) obj;
                ooVar.getClass();
                if (tL_error2 == null) {
                    ooVar.x0.invitesCount = ((TLRPC.TL_messages_exportedChatInvites) tLObject6).count;
                    ooVar.getMessagesStorage().w1(ooVar.x0.invitesCount, ooVar.v0);
                    ooVar.t0(false, false);
                    return;
                }
                return;
            case 28:
                pp ppVar = (pp) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                ppVar.getClass();
                String lowerCase = ((String) obj2).trim().toLowerCase();
                int i17 = 29;
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.i0.g3(new p1(ppVar, new ArrayList(), new ArrayList(), i17));
                    return;
                }
                String R0 = org.telegram.messenger.cd.D0().R0(lowerCase, true, false);
                if (lowerCase.equals(R0) || R0.length() == 0) {
                    R0 = null;
                }
                int i18 = (R0 != null ? 1 : 0) + 1;
                String[] strArr = new String[i18];
                strArr[0] = lowerCase;
                if (R0 != null) {
                    strArr[1] = R0;
                }
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int i19 = 0;
                while (i19 < arrayList3.size()) {
                    TLRPC.Chat chat = (TLRPC.Chat) arrayList3.get(i19);
                    String lowerCase2 = chat.title.toLowerCase();
                    String R02 = org.telegram.messenger.cd.D0().R0(lowerCase2, z10, z11);
                    if (lowerCase2.equals(R02)) {
                        R02 = null;
                    }
                    int i20 = z11;
                    int i21 = i20;
                    String str7 = null;
                    while (true) {
                        if (i20 < i18) {
                            String str8 = strArr[i20];
                            if (lowerCase2.startsWith(str8) || sc.e.y(" ", str8, lowerCase2) || (R02 != null && (R02.startsWith(str8) || sc.e.y(" ", str8, R02)))) {
                                str2 = str7;
                                i11 = 1;
                            } else {
                                String str9 = chat.username;
                                if (str9 == null || !str9.startsWith(str8)) {
                                    ArrayList<TLRPC.TL_username> arrayList6 = chat.usernames;
                                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                                        for (int i22 = 0; i22 < chat.usernames.size(); i22++) {
                                            TLRPC.TL_username tL_username = chat.usernames.get(i22);
                                            if (tL_username.active && tL_username.username.startsWith(str8)) {
                                                str2 = tL_username.username;
                                            }
                                        }
                                    }
                                    str2 = str7;
                                    i11 = i21;
                                } else {
                                    str2 = chat.username;
                                }
                                i11 = 2;
                            }
                            if (i11 != 0) {
                                if (i11 == 1) {
                                    arrayList5.add(org.telegram.messenger.i0.r0(chat.title, null, str8));
                                } else {
                                    arrayList5.add(org.telegram.messenger.i0.r0(sc.e.h("@", str2), null, "@" + str8));
                                }
                                arrayList4.add(chat);
                            } else {
                                i20++;
                                str7 = str2;
                                i21 = i11;
                            }
                        }
                    }
                    i19++;
                    z10 = true;
                    z11 = 0;
                }
                org.telegram.messenger.i0.g3(new p1(ppVar, arrayList4, arrayList5, 29));
                return;
            default:
                pp.E((pp) obj3, (ArrayList) obj2, (ArrayList) obj);
                return;
        }
    }

    public /* synthetic */ p1(un unVar, org.telegram.ui.Components.z60 z60Var, String str) {
        this.a = 18;
        this.d = unVar;
        this.c = z60Var;
        this.b = str;
    }
}
