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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p1(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
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
        boolean z10;
        String str;
        int i3;
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
                dl0 dl0Var = ((PaymentFormActivity$TelegramWebviewProxy) obj3).a;
                if (dl0Var.getParentActivity() != null && str5.equals("payment_form_submit")) {
                    try {
                        JSONObject jSONObject = new JSONObject(str6);
                        dl0Var.x0 = jSONObject.getJSONObject("credentials").toString();
                        dl0Var.y0 = jSONObject.getString("title");
                    } catch (Throwable th2) {
                        dl0Var.x0 = str6;
                        org.telegram.messenger.a8.g(th2, true);
                    }
                    dl0Var.z0();
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
                z6 z6Var = (z6) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) obj;
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    ((di.b) arrayList.get(i13)).a.delete();
                }
                org.telegram.messenger.g0.h3(new org.telegram.messenger.voip.l0(17, z6Var, s1Var));
                return;
            case 4:
                u7 u7Var = (u7) obj3;
                di.b bVar = (di.b) obj2;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) obj;
                try {
                    try {
                        mediaMetadataRetriever = new MediaMetadataRetriever();
                        try {
                            mediaMetadataRetriever.setDataSource(u7Var.getContext(), Uri.fromFile(bVar.a));
                            str = mediaMetadataRetriever.extractMetadata(7);
                        } catch (Exception e10) {
                            e = e10;
                            str = "";
                        }
                        try {
                            str3 = mediaMetadataRetriever.extractMetadata(2);
                        } catch (Exception e11) {
                            e = e11;
                            z10 = true;
                            org.telegram.messenger.a8.g(e, z10);
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
                    mediaMetadataRetriever.release();
                } catch (Throwable unused3) {
                }
                org.telegram.messenger.g0.h3(new ai.t6((Object) u7Var, (Object) bVar, (Object) tL_documentAttributeAudio, (Object) str, (Object) str3, 21));
                return;
            case 5:
                ((d8) obj3).b.y.finishFragment();
                ((wm) obj2).fa(((g8) obj).h);
                return;
            case 6:
                h9.Z((h9) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
            case 7:
                org.telegram.messenger.g0.g(((String[]) obj3)[0]);
                org.telegram.messenger.camera.q.r(null, 2131748929, new org.telegram.ui.Components.fc(((org.telegram.ui.ActionBar.t2) obj2).F, (org.telegram.ui.ActionBar.e6) obj));
                return;
            case 8:
                ka.c0((ka) obj3, (org.telegram.ui.ActionBar.s1) obj2, (TLRPC.User) obj);
                return;
            case 9:
                kb.e0((kb) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
            case 10:
                TLObject tLObject2 = (TLObject) obj2;
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) obj;
                HashMap hashMap = ((nc) obj3).x;
                if (!(tLObject2 instanceof TLRPC.TL_wallPaper)) {
                    j6Var.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject2;
                String r5 = org.telegram.messenger.w7.r(null, wallPaper.document);
                if (hashMap.containsKey(r5)) {
                    return;
                }
                hashMap.put(r5, j6Var);
                org.telegram.messenger.w7.G(j6Var.F).X(wallPaper.document, wallPaper, 1, 1);
                return;
            case 11:
                ad adVar = (ad) obj3;
                TLObject tLObject3 = (TLObject) obj;
                if (((TLRPC.TL_error) obj2) == null) {
                    adVar.getClass();
                    adVar.e0 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvites) tLObject3).invites.get(0);
                }
                adVar.d0 = false;
                org.telegram.ui.Components.m70 m70Var = adVar.R;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = adVar.e0;
                m70Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
                return;
            case 12:
                ((r41) obj3).showDialog(xd.I((Context) obj2, (org.telegram.ui.ActionBar.e6) obj, false));
                return;
            case 13:
                xd xdVar = (xd) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                Context context = (Context) obj;
                if (tLObject4 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    sf.c.t(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject4).url);
                }
                org.telegram.messenger.g0.i3(new cd(xdVar, i12), 1000L);
                return;
            case 14:
                wm wmVar = (wm) obj3;
                wmVar.f = ((org.telegram.messenger.qr) obj2).j0(wmVar.h.user_id);
                ((CountDownLatch) obj).countDown();
                return;
            case 15:
                org.telegram.messenger.g0.h3(new sc(8, (ci.o2) obj, ((wm) obj3).getMessagesStorage().j0(((TLRPC.TL_contact) obj2).user_id)));
                return;
            case 16:
                wm.k0((wm) obj3, (TLRPC.User) obj2, (TLRPC.EmojiStatus) obj);
                return;
            case 17:
                wm wmVar2 = (wm) obj3;
                wmVar2.getClass();
                ((org.telegram.ui.Components.nk0) obj2).dismiss();
                wmVar2.presentFragment(ProfileActivity.A4(((TLRPC.User) obj).id));
                return;
            case 18:
                wm wmVar3 = (wm) obj3;
                ((org.telegram.ui.Components.f60) obj).u();
                vg0 vg0Var = new vg0(wmVar3.getParentActivity(), wmVar3);
                vg0Var.N0((String) obj2, false);
                vg0Var.show();
                return;
            case 19:
                wm wmVar4 = (wm) obj3;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) obj2;
                ((org.telegram.ui.ActionBar.t2) org.telegram.ui.Components.t4.S(wmVar4.getParentActivity(), suggestedPost != null ? suggestedPost.schedule_date : 0L, new b7(wmVar4, suggestedPost, (org.telegram.messenger.zi) obj, 5), wmVar4.getResourceProvider(), 0).b).show();
                return;
            case 20:
                wm.w0((wm) obj3, (dg.a) obj2, (Runnable) obj);
                return;
            case 21:
                wm.e0((wm) obj3, (TLObject) obj2, (TLRPC.User) obj);
                return;
            case 22:
                org.telegram.ui.Components.t4.e0(r10.currentAccount, (TLRPC.TL_error) obj2, (wm) obj3, (TLRPC.TL_messages_editMessage) obj, new Object[0]);
                return;
            case 23:
                zk zkVar = (zk) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj;
                al alVar = zkVar.c;
                if (tLObject5 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject5;
                    wm wmVar5 = alVar.a.R;
                    wmVar5.getMessagesController().Y3(tL_photos_photo.users, false);
                    TLRPC.User a22 = wmVar5.getMessagesController().a2(Long.valueOf(wmVar5.getUserConfig().n));
                    if ((tL_photos_photo.photo instanceof TLRPC.TL_photo) && a22 != null) {
                        cg.m0.a(ziVar.k.action.photo, a22, false);
                        wmVar5.getUserConfig().w(a22);
                        wmVar5.getUserConfig().v(true);
                        org.telegram.ui.Components.fc.a0(wmVar5).V(Collections.singletonList(a22), org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131754219, null)), org.telegram.messenger.g0.U2(org.telegram.messenger.bd.M0(2131754220, null), new xg(zkVar, 6)), null).j();
                    }
                }
                ziVar.q = false;
                return;
            case 24:
                ((hm) obj3).l((org.telegram.ui.Cells.q1) obj2, (TLRPC.User) obj);
                return;
            case 25:
                ((hm) obj3).k((org.telegram.ui.Cells.q1) obj2, (TLRPC.Chat) obj, 0, false);
                return;
            case 26:
                final hm hmVar = (hm) obj3;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj2;
                final TLRPC.Document document = (TLRPC.Document) obj;
                wm wmVar6 = hmVar.a;
                if (wmVar6.getParentActivity() == null || document == null) {
                    return;
                }
                if ((Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.r2.b) && wmVar6.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    wmVar6.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                org.telegram.messenger.zi messageObject = q1Var == null ? null : q1Var.getMessageObject();
                if (messageObject == null || messageObject.k == null) {
                    return;
                }
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = messageObject.Q3();
                tL_message.id = messageObject.f1();
                tL_message.realId = messageObject.M1();
                tL_message.dialog_id = org.telegram.messenger.zi.B0(messageObject.k);
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
                i3 = ((org.telegram.ui.ActionBar.d2) wmVar6).currentAccount;
                arrayList2.add(new org.telegram.messenger.zi(i3, tL_message, false, true));
                MediaController.g0(wmVar6.getParentActivity(), wmVar6.getAccountInstance(), arrayList2, new org.telegram.messenger.kr() { // from class: org.telegram.ui.vl
                    @Override // org.telegram.messenger.kr
                    public final void a(int i15) {
                        wm wmVar7 = hm.this.a;
                        if (i15 <= 0 || wmVar7.getParentActivity() == null || wmVar7.fragmentView == null) {
                            return;
                        }
                        org.telegram.ui.Components.fc.a0(wmVar7).m(org.telegram.messenger.zi.K3(document) ? org.telegram.ui.Components.ec.H : org.telegram.ui.Components.ec.J, i15, 0, 0, wmVar7.ya).j();
                    }
                });
                return;
            case 27:
                ln lnVar = (ln) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject6 = (TLObject) obj;
                lnVar.getClass();
                if (tL_error2 == null) {
                    lnVar.y0.invitesCount = ((TLRPC.TL_messages_exportedChatInvites) tLObject6).count;
                    lnVar.getMessagesStorage().w1(lnVar.y0.invitesCount, lnVar.w0);
                    lnVar.u0(false, false);
                    return;
                }
                return;
            case 28:
                po poVar = (po) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                poVar.getClass();
                String lowerCase = ((String) obj2).trim().toLowerCase();
                int i15 = 29;
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new p1(poVar, new ArrayList(), new ArrayList(), i15));
                    return;
                }
                String S0 = org.telegram.messenger.bd.E0().S0(lowerCase, true, false);
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
                    String S02 = org.telegram.messenger.bd.E0().S0(lowerCase2, z11, z12);
                    if (lowerCase2.equals(S02)) {
                        S02 = null;
                    }
                    int i18 = z12;
                    int i19 = i18;
                    String str7 = null;
                    while (true) {
                        if (i18 < i16) {
                            String str8 = strArr[i18];
                            if (lowerCase2.startsWith(str8) || k2.p1.z(" ", str8, lowerCase2) || (S02 != null && (S02.startsWith(str8) || k2.p1.z(" ", str8, S02)))) {
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
                                    arrayList5.add(org.telegram.messenger.g0.r0(t4.c.f("@", str2), null, "@" + str8));
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
                org.telegram.messenger.g0.h3(new p1(poVar, arrayList4, arrayList5, 29));
                return;
            default:
                po.E((po) obj3, (ArrayList) obj2, (ArrayList) obj);
                return;
        }
    }

    public /* synthetic */ p1(wm wmVar, org.telegram.ui.Components.f60 f60Var, String str) {
        this.a = 18;
        this.d = wmVar;
        this.c = f60Var;
        this.b = str;
    }
}
