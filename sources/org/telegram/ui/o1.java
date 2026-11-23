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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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

    /* JADX WARN: Code restructure failed: missing block: B:196:0x0474, code lost:
    
        if (r7 == null) goto L169;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0484 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        MediaMetadataRetriever mediaMetadataRetriever;
        boolean z10;
        String str;
        int i7;
        String str2;
        int i10;
        int i11 = this.a;
        String str3 = "";
        int i12 = 4;
        int i13 = 29;
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
                ml0 ml0Var = ((PaymentFormActivity$TelegramWebviewProxy) obj3).a;
                if (ml0Var.getParentActivity() != null && str5.equals("payment_form_submit")) {
                    try {
                        JSONObject jSONObject = new JSONObject(str6);
                        ml0Var.x0 = jSONObject.getJSONObject("credentials").toString();
                        ml0Var.y0 = jSONObject.getString("title");
                    } catch (Throwable th2) {
                        ml0Var.x0 = str6;
                        org.telegram.messenger.a8.g(th2, true);
                    }
                    ml0Var.z0();
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
                x6 x6Var = (x6) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj;
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    ((ei.b) arrayList.get(i14)).a.delete();
                }
                org.telegram.messenger.g0.g3(new oi.t(29, x6Var, t1Var));
                return;
            case 4:
                s7 s7Var = (s7) obj3;
                ei.b bVar = (ei.b) obj2;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) obj;
                try {
                    try {
                        mediaMetadataRetriever = new MediaMetadataRetriever();
                        try {
                            mediaMetadataRetriever.setDataSource(s7Var.getContext(), Uri.fromFile(bVar.a));
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
                org.telegram.messenger.g0.g3(new ai.b(s7Var, bVar, tL_documentAttributeAudio, str, str3, 22));
                return;
            case 5:
                ((d8) obj3).b.y.finishFragment();
                ((bn) obj2).ha(((g8) obj).h);
                return;
            case 6:
                j9.Z((j9) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
            case 7:
                org.telegram.messenger.g0.g(((String[]) obj3)[0]);
                org.telegram.messenger.o10.t(null, 2131748728, new org.telegram.ui.Components.lc(((org.telegram.ui.ActionBar.w2) obj2).F, (org.telegram.ui.ActionBar.h6) obj));
                return;
            case 8:
                la.c0((la) obj3, (org.telegram.ui.ActionBar.t1) obj2, (TLRPC.User) obj);
                return;
            case 9:
                lb.e0((lb) obj3, (TLRPC.TL_error) obj2, (TLObject) obj);
                return;
            case 10:
                TLObject tLObject2 = (TLObject) obj2;
                org.telegram.ui.ActionBar.l6 l6Var = (org.telegram.ui.ActionBar.l6) obj;
                HashMap hashMap = ((oc) obj3).x;
                if (!(tLObject2 instanceof TLRPC.TL_wallPaper)) {
                    l6Var.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject2;
                String r10 = org.telegram.messenger.w7.r(null, wallPaper.document);
                if (hashMap.containsKey(r10)) {
                    return;
                }
                hashMap.put(r10, l6Var);
                org.telegram.messenger.w7.G(l6Var.F).W(wallPaper.document, wallPaper, 1, 1);
                return;
            case 11:
                ad adVar = (ad) obj3;
                TLObject tLObject3 = (TLObject) obj;
                if (((TLRPC.TL_error) obj2) == null) {
                    adVar.getClass();
                    adVar.e0 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvites) tLObject3).invites.get(0);
                }
                adVar.d0 = false;
                org.telegram.ui.Components.g80 g80Var = adVar.R;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = adVar.e0;
                g80Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
                return;
            case 12:
                ((c51) obj3).showDialog(xd.I((Context) obj2, (org.telegram.ui.ActionBar.h6) obj, false));
                return;
            case 13:
                xd xdVar = (xd) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                Context context = (Context) obj;
                if (tLObject4 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    vf.c.t(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject4).url);
                }
                org.telegram.messenger.g0.h3(new cd(xdVar, i12), 1000L);
                return;
            case 14:
                bn bnVar = (bn) obj3;
                bnVar.f = ((org.telegram.messenger.ur) obj2).j0(bnVar.h.user_id);
                ((CountDownLatch) obj).countDown();
                return;
            case 15:
                org.telegram.messenger.g0.g3(new u8(19, (di.n2) obj, ((bn) obj3).getMessagesStorage().j0(((TLRPC.TL_contact) obj2).user_id)));
                return;
            case 16:
                bn.l0((bn) obj3, (TLRPC.User) obj2, (TLRPC.EmojiStatus) obj);
                return;
            case 17:
                bn bnVar2 = (bn) obj3;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) obj2;
                org.telegram.ui.Components.c5.Q(bnVar2.getParentActivity(), suggestedPost != null ? suggestedPost.schedule_date : 0L, new z6(bnVar2, suggestedPost, (org.telegram.messenger.gj) obj, 5), bnVar2.getResourceProvider(), 0).C2();
                return;
            case 18:
                bn bnVar3 = (bn) obj3;
                bnVar3.getClass();
                ((org.telegram.ui.Components.yk0) obj2).dismiss();
                bnVar3.presentFragment(ProfileActivity.D4(((TLRPC.User) obj).id));
                return;
            case 19:
                bn bnVar4 = (bn) obj3;
                ((org.telegram.ui.Components.a70) obj).v();
                fh0 fh0Var = new fh0(bnVar4.getParentActivity(), bnVar4);
                fh0Var.O0((String) obj2, false);
                fh0Var.show();
                return;
            case 20:
                bn.o1((bn) obj3, (cg.a) obj2, (Runnable) obj);
                return;
            case 21:
                bn.f0((bn) obj3, (TLObject) obj2, (TLRPC.User) obj);
                return;
            case 22:
                org.telegram.ui.Components.c5.c0(r11.currentAccount, (TLRPC.TL_error) obj2, (bn) obj3, (TLRPC.TL_messages_editMessage) obj, new Object[0]);
                return;
            case 23:
                el elVar = (el) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
                fl flVar = elVar.c;
                if (tLObject5 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject5;
                    bn bnVar5 = flVar.a.R;
                    bnVar5.getMessagesController().f4(tL_photos_photo.users, false);
                    TLRPC.User c22 = bnVar5.getMessagesController().c2(Long.valueOf(bnVar5.getUserConfig().n));
                    if ((tL_photos_photo.photo instanceof TLRPC.TL_photo) && c22 != null) {
                        bg.n0.a(gjVar.k.action.photo, c22, false);
                        bnVar5.getUserConfig().w(c22);
                        bnVar5.getUserConfig().v(true);
                        org.telegram.ui.Components.lc.b0(bnVar5).V(Collections.singletonList(c22), org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131754216, null)), org.telegram.messenger.g0.T2(org.telegram.messenger.hd.N0(2131754217, null), new bh(elVar, 6)), null).j();
                    }
                }
                gjVar.q = false;
                return;
            case 24:
                ((mm) obj3).k((org.telegram.ui.Cells.r1) obj2, (TLRPC.User) obj);
                return;
            case 25:
                ((mm) obj3).j((org.telegram.ui.Cells.r1) obj2, (TLRPC.Chat) obj, 0, false);
                return;
            case 26:
                final mm mmVar = (mm) obj3;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) obj2;
                final TLRPC.Document document = (TLRPC.Document) obj;
                bn bnVar6 = mmVar.a;
                if (bnVar6.getParentActivity() == null || document == null) {
                    return;
                }
                if ((Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.s2.b) && bnVar6.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    bnVar6.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                org.telegram.messenger.gj messageObject = r1Var == null ? null : r1Var.getMessageObject();
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
                int i15 = tL_message.flags;
                tL_message.flags = i15 | 512;
                if (tL_message.from_id != null) {
                    tL_message.flags = i15 | 768;
                }
                ArrayList arrayList2 = new ArrayList();
                i7 = ((org.telegram.ui.ActionBar.g2) bnVar6).currentAccount;
                arrayList2.add(new org.telegram.messenger.gj(i7, tL_message, false, true));
                MediaController.g0(bnVar6.getParentActivity(), bnVar6.getAccountInstance(), arrayList2, new org.telegram.messenger.or() { // from class: org.telegram.ui.am
                    @Override // org.telegram.messenger.or
                    public final void a(int i16) {
                        bn bnVar7 = mm.this.a;
                        if (i16 <= 0 || bnVar7.getParentActivity() == null || bnVar7.fragmentView == null) {
                            return;
                        }
                        org.telegram.ui.Components.lc.b0(bnVar7).m(org.telegram.messenger.gj.J3(document) ? org.telegram.ui.Components.kc.H : org.telegram.ui.Components.kc.J, i16, 0, 0, bnVar7.Ba).j();
                    }
                });
                return;
            case 27:
                rn rnVar = (rn) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject6 = (TLObject) obj;
                rnVar.getClass();
                if (tL_error2 == null) {
                    rnVar.y0.invitesCount = ((TLRPC.TL_messages_exportedChatInvites) tLObject6).count;
                    rnVar.getMessagesStorage().w1(rnVar.y0.invitesCount, rnVar.w0);
                    rnVar.u0(false, false);
                    return;
                }
                return;
            case 28:
                uo uoVar = (uo) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                uoVar.getClass();
                String lowerCase = ((String) obj2).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.g3(new o1(uoVar, new ArrayList(), new ArrayList(), i13));
                    return;
                }
                String T0 = org.telegram.messenger.hd.E0().T0(lowerCase, true, false);
                if (lowerCase.equals(T0) || T0.length() == 0) {
                    T0 = null;
                }
                int i16 = (T0 != null ? 1 : 0) + 1;
                String[] strArr = new String[i16];
                strArr[0] = lowerCase;
                if (T0 != null) {
                    strArr[1] = T0;
                }
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int i17 = 0;
                while (i17 < arrayList3.size()) {
                    TLRPC.Chat chat = (TLRPC.Chat) arrayList3.get(i17);
                    String lowerCase2 = chat.title.toLowerCase();
                    String T02 = org.telegram.messenger.hd.E0().T0(lowerCase2, z11, z12);
                    if (lowerCase2.equals(T02)) {
                        T02 = null;
                    }
                    int i18 = z12;
                    int i19 = i18;
                    String str7 = null;
                    while (true) {
                        if (i18 < i16) {
                            String str8 = strArr[i18];
                            if (lowerCase2.startsWith(str8) || i5.c.B(" ", str8, lowerCase2) || (T02 != null && (T02.startsWith(str8) || i5.c.B(" ", str8, T02)))) {
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
                                    arrayList5.add(org.telegram.messenger.g0.r0(p5.c.k("@", str2), null, "@" + str8));
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
                org.telegram.messenger.g0.g3(new o1(uoVar, arrayList4, arrayList5, 29));
                return;
            default:
                uo.E((uo) obj3, (ArrayList) obj2, (ArrayList) obj);
                return;
        }
    }

    public /* synthetic */ o1(bn bnVar, org.telegram.ui.Components.a70 a70Var, String str) {
        this.a = 19;
        this.d = bnVar;
        this.c = a70Var;
        this.b = str;
    }
}
