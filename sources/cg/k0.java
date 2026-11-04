package cg;

import ai.y1;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import b8.jf;
import ci.e9;
import com.android.billingclient.api.Purchase;
import ei.i8;
import ei.k8;
import ei.p7;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import mi.d4;
import o4.a1;
import o4.h1;
import o4.l1;
import o4.n1;
import o4.r1;
import o4.x0;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.gx;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.ir;
import org.telegram.messenger.li;
import org.telegram.messenger.n10;
import org.telegram.messenger.qr;
import org.telegram.messenger.r3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.w7;
import org.telegram.messenger.zb;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.oe0;
import org.telegram.ui.Components.q40;
import org.telegram.ui.Components.re0;
import org.telegram.ui.Components.se0;
import org.telegram.ui.b1;
import org.telegram.ui.g3;
import org.telegram.ui.g4;
import org.telegram.ui.h40;
import org.telegram.ui.h9;
import org.telegram.ui.i50;
import org.telegram.ui.lr;
import org.telegram.ui.ms0;
import org.telegram.ui.na1;
import org.telegram.ui.nf0;
import org.telegram.ui.q11;
import org.telegram.ui.u70;
import org.telegram.ui.web.w0;
import org.telegram.ui.wh0;
import org.telegram.ui.xg;
import org.telegram.ui.yh0;
import u4.d1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ k0(int i3, int i10, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.a = i10;
        this.b = tLObject;
        this.c = i3;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.h = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        int i3 = this.a;
        int i10 = 4;
        final int i11 = this.c;
        boolean z11 = false;
        int i12 = 0;
        int i13 = 0;
        z11 = false;
        int i14 = 1;
        Object obj = this.e;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.b;
        Object obj5 = this.d;
        switch (i3) {
            case 0:
                TLObject tLObject = (TLObject) obj4;
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) obj5;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) obj;
                xg xgVar = (xg) obj3;
                q4 q4Var = (q4) obj2;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    hp.s1(i11).Y3(tL_photos_photo.users, false);
                    TLRPC.User a22 = hp.s1(i11).a2(Long.valueOf(h10.i(i11).n));
                    TLRPC.Photo photo = tL_photos_photo.photo;
                    if ((photo instanceof TLRPC.TL_photo) && a22 != null) {
                        TLRPC.PhotoSize w10 = w7.w(photo.sizes, 100, false, null, false);
                        TLRPC.PhotoSize w11 = w7.w(tL_photos_photo.photo.sizes, 1000, false, null, false);
                        if (w10 == null || photoSize == null || photoSize.location == null) {
                            z10 = true;
                        } else {
                            w7.G(i11);
                            File K = w7.K(w10, null, true, true);
                            w7.G(i11);
                            w7.K(photoSize.location, null, true, true).renameTo(K);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(photoSize.location.volume_id);
                            sb2.append("_");
                            String o10 = a1.g.o(photoSize.location.local_id, "@50_50", sb2);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(w10.location.volume_id);
                            sb3.append("_");
                            String o11 = a1.g.o(w10.location.local_id, "@50_50", sb3);
                            z10 = true;
                            zb.D().S(o10, o11, ac.l(i11, 1, a22));
                        }
                        if (w11 != null && photoSize2 != null && photoSize2.location != null) {
                            w7.G(i11);
                            File K2 = w7.K(w11, null, z10, z10);
                            w7.G(i11);
                            w7.K(photoSize2.location, null, z10, z10).renameTo(K2);
                        }
                        m0.a(tL_photos_photo.photo, a22, false);
                        h10.i(i11).w(a22);
                        h10.i(i11).v(z10);
                        xgVar.run();
                        fc.a0(q4Var.getLastFragment()).V(Collections.singletonList(a22), org.telegram.messenger.g0.X2(bd.M0(2131754219, null)), org.telegram.messenger.g0.U2(bd.M0(2131754220, null), new l0(i11, q4Var, z11 ? 1 : 0)), null).j();
                        break;
                    }
                }
                break;
            case 1:
                TLObject tLObject2 = (TLObject) obj4;
                t2[] t2VarArr = (t2[]) obj;
                e6 e6Var = (e6) obj3;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) obj2;
                ((gi.d) obj5).setLoading(false);
                if (tLObject2 instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject2;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new fc(t2VarArr[0].F, e6Var).t(bd.M0(2131743889, null), null).k(false);
                        break;
                    } else {
                        final long j10 = tL_starsSubscriptionPricing.amount;
                        e9.y(i11, false).h0(tL_messages_checkChatInvite.hash, chatInvite, new n10() { // from class: ci.g9
                            @Override // org.telegram.messenger.n10
                            public final void a(Object obj6, Object obj7) {
                                Long l10 = (Long) obj7;
                                if (!"paid".equals((String) obj6) || l10.longValue() == 0) {
                                    return;
                                }
                                org.telegram.messenger.g0.h3(new i9(l10, i11, j10, 0));
                            }
                        });
                        break;
                    }
                } else {
                    new fc(t2VarArr[0].F, e6Var).t(bd.M0(2131748921, null), null).k(false);
                    break;
                }
            case 2:
                k8.a((k8) obj5, (TLObject) obj4, this.e, (ArrayList) obj3, (boolean[]) obj2, this.c);
                break;
            case 3:
                int i15 = 2;
                h1 h1Var = (h1) obj4;
                o4.v vVar = (o4.v) obj5;
                n1 n1Var = (n1) obj;
                String str = n1Var.b;
                o4.e0 e0Var = (o4.e0) obj3;
                int i16 = this.c;
                o4.l lVar = (o4.l) obj2;
                ui.f fVar = h1Var.b;
                if (fVar.t(vVar)) {
                    try {
                        o4.d d = o4.d.d(n1Var);
                        Object obj6 = d.g;
                        int i17 = d.b;
                        if (d.b()) {
                            n1 n1Var2 = d.a;
                            if (n1Var2 != null) {
                                b8.zb.p(n1Var2.a == 40010);
                                h1Var.J0(lVar, i16, null, 40010, new x0(new a1(d), 1));
                                break;
                            } else {
                                l1 l1Var = e0Var.t;
                                if (i17 == 1) {
                                    if (obj6 != null) {
                                        z11 = ((Boolean) obj6).booleanValue();
                                    } else if (!l1Var.u()) {
                                        z11 = true;
                                    }
                                }
                                if (z11) {
                                    h1Var.O0(vVar, i16);
                                } else if (i17 == 31) {
                                    obj6.getClass();
                                    h1Var.Q0(vVar, i16, 31, new x0(new d4(7, new ei.f(i15, (d2.n0) obj6, true), new o4.v0(1)), 1 == true ? 1 : 0));
                                } else {
                                    h1Var.Q0(vVar, i16, i17, h1.S0(new a1(d)));
                                }
                                fVar.k(vVar);
                                break;
                            }
                        } else {
                            g2.a.l("MediaSessionStub", "Can't execute predefined custom command: " + str);
                            h1.R0(e0Var, vVar, i16, new r1(-6));
                            break;
                        }
                    } catch (RuntimeException e10) {
                        g2.a.m("MediaSessionStub", "Failed to convert predefined custom command: " + str, e10);
                        h1.R0(e0Var, vVar, i16, new r1(-3));
                        return;
                    }
                }
                break;
            case 4:
                r3 r3Var = (r3) obj5;
                TLObject tLObject3 = (TLObject) obj4;
                ci.i iVar = (ci.i) obj;
                ArrayList arrayList = (ArrayList) obj3;
                HashSet hashSet = (HashSet) obj2;
                HashSet hashSet2 = r3Var.n;
                ArrayList arrayList2 = r3Var.e;
                if (r3Var.G.remove(Integer.valueOf(i11))) {
                    if (tLObject3 != null) {
                        TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject3;
                        hp.s1(r3Var.C.a).Y3(groupparticipants.users, false);
                        hp.s1(r3Var.C.a).S3(groupparticipants.chats, false);
                        int size = groupparticipants.participants.size();
                        for (int i18 = 0; i18 < size; i18++) {
                            TLRPC.GroupCallParticipant groupCallParticipant = groupparticipants.participants.get(i18);
                            long C1 = zi.C1(groupCallParticipant.peer);
                            TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) r3Var.d.f(C1);
                            if (groupCallParticipant2 != null) {
                                arrayList2.remove(groupCallParticipant2);
                                r3Var.n(groupCallParticipant2, false);
                            }
                            r3Var.d.k(groupCallParticipant, C1);
                            arrayList2.add(groupCallParticipant);
                            r3Var.n(groupCallParticipant, true);
                            if (hashSet2.contains(Long.valueOf(C1))) {
                                Long valueOf = Long.valueOf(C1);
                                hashSet2.remove(valueOf);
                                r3Var.j.remove(valueOf);
                            }
                        }
                        if (r3Var.b.participants_count < r3Var.d.m()) {
                            r3Var.b.participants_count = r3Var.d.m();
                        }
                        r3Var.z();
                        hs.f(r3Var.C.a).k(hs.w2, Long.valueOf(r3Var.c), Long.valueOf(r3Var.b.id), Boolean.FALSE);
                        if (iVar != null) {
                            ((VoIPService) iVar.c).lambda$createGroupInstance$69(iVar.b, (int[]) iVar.d, arrayList);
                        } else {
                            r3Var.w();
                        }
                    }
                    hashSet.removeAll(arrayList);
                    break;
                }
                break;
            case 5:
                li liVar = (li) obj4;
                boolean[] zArr = (boolean[]) obj5;
                ArrayList arrayList3 = (ArrayList) obj;
                Context context = (Context) obj3;
                d2 d2Var = (d2) obj2;
                liVar.getClass();
                if (!zArr[0]) {
                    zArr[0] = true;
                    while (i13 < arrayList3.size()) {
                        li liVar2 = liVar;
                        Context context2 = context;
                        liVar2.h2(context2, 0, d2Var, null, true, (TLObject) arrayList3.get(i13), ((TLRPC.TL_messages_stickerSet) arrayList3.get(i13)).set, null, this.c, false);
                        i13++;
                        liVar = liVar2;
                        context = context2;
                    }
                    break;
                }
                break;
            case 6:
                i50 i50Var = (i50) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject4 = (TLObject) obj4;
                b1 b1Var = (b1) obj2;
                i50Var.r = false;
                if (!((g4) obj).e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject4;
                        if (tL_contacts_resolvedPeer.chats.isEmpty()) {
                            b1Var.a(4, false);
                            break;
                        } else {
                            hp.s1(i11).Y3(tL_contacts_resolvedPeer.users, false);
                            hp.s1(i11).S3(tL_contacts_resolvedPeer.chats, false);
                            qr.a0(i11).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            i50Var.n = chat;
                            if (!chat.left || chat.kicked) {
                                b1Var.a(4, false);
                                break;
                            } else {
                                b1Var.a(0, false);
                                break;
                            }
                        }
                    } else {
                        b1Var.a(4, false);
                        break;
                    }
                }
                break;
            case 7:
                TLObject tLObject5 = (TLObject) obj4;
                s1 s1Var = (s1) obj5;
                Context context3 = (Context) obj;
                e6 e6Var2 = (e6) obj3;
                h40 h40Var = (h40) obj2;
                boolean z12 = tLObject5 instanceof TLRPC.Updates;
                int i19 = this.c;
                if (z12) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject5;
                    hp.s1(i19).Y3(updates.users, false);
                    hp.s1(i19).S3(updates.chats, false);
                    ArrayList z02 = hp.z0(updates, TL_update.TL_updateGroupCall.class);
                    int size2 = z02.size();
                    TLRPC.GroupCall groupCall = null;
                    while (i12 < size2) {
                        Object obj7 = z02.get(i12);
                        i12++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj7).call;
                    }
                    s1Var.dismiss();
                    if (groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.id = groupCall.id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        h9.n0(context3, i19, tL_inputGroupCall, groupCall.invite_link, e6Var2, true, true);
                        org.telegram.messenger.g0.h3(h40Var);
                        break;
                    }
                } else if (tLObject5 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject5;
                    hp.s1(i19).Y3(groupcall.users, false);
                    hp.s1(i19).S3(groupcall.chats, false);
                    TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                    TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                    exportgroupcallinvite.call = tL_inputGroupCall2;
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall2.id = groupCall2.id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ConnectionsManager.getInstance(i19).sendRequest(exportgroupcallinvite, new gx(s1Var, context3, i19, exportgroupcallinvite, e6Var2, h40Var));
                    break;
                } else {
                    s1Var.dismiss();
                    org.telegram.messenger.g0.h3(h40Var);
                    break;
                }
                break;
            case 8:
                new q11((Context) obj4, (TLRPC.Chat) obj5, (TLRPC.User) obj, new l0(i11, (ir) obj3, 29), (e6) obj2).show();
                break;
            case 9:
                j9.a((j9) obj4, (Runnable[]) obj5, (Bitmap) obj, (q40) obj3, this.c, (jf[]) obj2);
                break;
            case 10:
                se0 se0Var = (se0) obj5;
                TLObject tLObject6 = (TLObject) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                TLRPC.PollAnswerVoters pollAnswerVoters = (TLRPC.PollAnswerVoters) obj2;
                oe0 oe0Var = se0Var.k1;
                ArrayList arrayList5 = se0Var.u1;
                me0 me0Var = se0Var.j1;
                ArrayList arrayList6 = se0Var.x1;
                arrayList6.remove(((Integer[]) obj)[i11]);
                if (tLObject6 != null) {
                    TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject6;
                    hp.s1(se0Var.a).Y3(tL_messages_votesList.users, false);
                    if (!tL_messages_votesList.votes.isEmpty()) {
                        arrayList4.add(new re0(tL_messages_votesList, pollAnswerVoters.option));
                    }
                    if (arrayList6.isEmpty()) {
                        int size3 = arrayList4.size();
                        boolean z13 = false;
                        for (int i20 = 0; i20 < size3; i20++) {
                            re0 re0Var = (re0) arrayList4.get(i20);
                            int size4 = arrayList5.size();
                            int i21 = 0;
                            while (true) {
                                if (i21 < size4) {
                                    re0 re0Var2 = (re0) arrayList5.get(i21);
                                    if (Arrays.equals(re0Var.d, re0Var2.d)) {
                                        re0Var2.c = re0Var.c;
                                        if (re0Var2.a != re0Var.a || re0Var2.b.size() != re0Var.b.size()) {
                                            z13 = true;
                                        }
                                        re0Var2.a = re0Var.a;
                                        re0Var2.b = re0Var.b;
                                    } else {
                                        i21++;
                                    }
                                }
                            }
                        }
                        se0Var.D1 = false;
                        if (me0Var != null) {
                            if (se0Var.B0 != 0 || se0Var.H != null || z13) {
                                if (z13) {
                                    se0Var.L0();
                                }
                                oe0Var.X(false);
                                break;
                            } else {
                                int childCount = me0Var.getChildCount();
                                ArrayList arrayList7 = new ArrayList();
                                for (int i22 = 0; i22 < childCount; i22++) {
                                    View childAt = me0Var.getChildAt(i22);
                                    if (childAt instanceof PollVotesAlert$UserCell) {
                                        View F = me0Var.F(childAt);
                                        d1 T = F == null ? null : me0Var.T(F);
                                        if (T != null) {
                                            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                                            pollVotesAlert$UserCell.E = arrayList7;
                                            pollVotesAlert$UserCell.setEnabled(true);
                                            oe0Var.y(T);
                                            pollVotesAlert$UserCell.E = null;
                                        }
                                    }
                                }
                                if (!arrayList7.isEmpty()) {
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(arrayList7);
                                    animatorSet.setDuration(180L);
                                    animatorSet.start();
                                }
                                se0Var.D1 = false;
                                break;
                            }
                        }
                    }
                } else {
                    se0Var.dismiss();
                    break;
                }
                break;
            case 11:
                lr.c0((lr) obj5, (TLRPC.FileLocation) obj, (TLRPC.InputFile) obj3, (TLObject) obj4, (TLRPC.FileLocation) obj2, this.c);
                break;
            case 12:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) obj4;
                String[] strArr = (String[]) obj5;
                Context context4 = (Context) obj;
                wh0 wh0Var = (wh0) obj3;
                d2 d2Var2 = (d2) obj2;
                if (tL_urlAuthResultRequest.match_codes.isEmpty() || !TextUtils.isEmpty(strArr[0])) {
                    wh0Var.run();
                    break;
                } else {
                    yh0.c(context4, this.c, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new ei(21, strArr, wh0Var), true, new y1(26), d2Var2.getResourceProvider());
                    break;
                }
                break;
            case 13:
                d2 d2Var3 = (d2) obj5;
                List<Purchase> list = (List) obj;
                ad.b bVar = (ad.b) obj3;
                ms0 ms0Var = (ms0) obj2;
                if (((e5.f) obj4).a == 0) {
                    nf0 nf0Var = new nf0(i14, d2Var3);
                    int i23 = this.c;
                    if (list != null && !list.isEmpty() && !h10.i(i23).q()) {
                        for (Purchase purchase : list) {
                            if (purchase.b().contains("telegram_premium")) {
                                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                tL_dataJSON.data = purchase.a;
                                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                                tL_inputStorePaymentPremiumSubscription.restore = true;
                                if (bVar != null) {
                                    tL_inputStorePaymentPremiumSubscription.upgrade = true;
                                }
                                tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                                ConnectionsManager.getInstance(i23).sendRequest(tL_payments_assignPlayMarketTransaction, new i8(i23, nf0Var, d2Var3, tL_payments_assignPlayMarketTransaction), 66);
                                break;
                            }
                        }
                    }
                    org.telegram.messenger.r1.i().d("telegram_premium", new g3(nf0Var, i10));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (bVar != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i23).sendRequest(tL_payments_canPurchaseStore, new gx(i23, 5, d2Var3, ms0Var, bVar, tL_payments_canPurchaseStore, tL_inputStorePaymentPremiumSubscription2));
                    break;
                }
                break;
            default:
                w0 w0Var = (w0) obj5;
                org.telegram.ui.web.t0 t0Var = (org.telegram.ui.web.t0) obj;
                p7 p7Var = (p7) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                boolean z14 = ((TLObject) obj4) instanceof TLRPC.TL_boolTrue;
                int i24 = this.c;
                if (z14) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        w0.w(i24, t0Var, p7Var, "write_access_requested", jSONObject);
                        break;
                    } catch (Exception e11) {
                        a8.g(e11, true);
                        return;
                    }
                } else if (tL_error2 != null) {
                    w0Var.Y(tL_error2.text);
                    break;
                } else {
                    String[] strArr2 = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(w0Var.getContext());
                    String M0 = bd.M0(2131752898, null);
                    s1 s1Var2 = alertDialog$Builder.a;
                    s1Var2.S = M0;
                    s1Var2.U = bd.M0(2131752899, null);
                    alertDialog$Builder.k(bd.M0(2131752909, null), new na1(8, w0Var, strArr2));
                    alertDialog$Builder.h(bd.M0(2131752904, null), new u70(22));
                    w0Var.X(3, s1Var2, new org.telegram.ui.web.v(strArr2, i24, t0Var, p7Var, 1));
                    break;
                }
        }
    }

    public /* synthetic */ k0(k8 k8Var, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i3) {
        this.a = 2;
        this.d = k8Var;
        this.b = tLObject;
        this.e = obj;
        this.f = arrayList;
        this.h = zArr;
        this.c = i3;
    }

    public /* synthetic */ k0(gi.d dVar, TLObject tLObject, t2[] t2VarArr, e6 e6Var, int i3, TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite) {
        this.a = 1;
        this.d = dVar;
        this.b = tLObject;
        this.e = t2VarArr;
        this.f = e6Var;
        this.c = i3;
        this.h = tL_messages_checkChatInvite;
    }

    public /* synthetic */ k0(Object obj, Object obj2, Object obj3, int i3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = i3;
        this.f = obj4;
        this.h = obj5;
    }

    public /* synthetic */ k0(Object obj, Object obj2, Object obj3, Object obj4, int i3, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.c = i3;
        this.h = obj5;
    }

    public /* synthetic */ k0(r3 r3Var, int i3, TLObject tLObject, ci.i iVar, ArrayList arrayList, HashSet hashSet) {
        this.a = 4;
        this.d = r3Var;
        this.c = i3;
        this.b = tLObject;
        this.e = iVar;
        this.f = arrayList;
        this.h = hashSet;
    }

    public /* synthetic */ k0(li liVar, boolean[] zArr, ArrayList arrayList, Context context, d2 d2Var, int i3) {
        this.a = 5;
        this.b = liVar;
        this.d = zArr;
        this.e = arrayList;
        this.f = context;
        this.h = d2Var;
        this.c = i3;
    }

    public /* synthetic */ k0(se0 se0Var, Integer[] numArr, int i3, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.a = 10;
        this.d = se0Var;
        this.e = numArr;
        this.c = i3;
        this.b = tLObject;
        this.f = arrayList;
        this.h = pollAnswerVoters;
    }

    public /* synthetic */ k0(lr lrVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i3) {
        this.a = 11;
        this.d = lrVar;
        this.e = fileLocation;
        this.f = inputFile;
        this.b = tLObject;
        this.h = fileLocation2;
        this.c = i3;
    }

    public /* synthetic */ k0(i50 i50Var, g4 g4Var, TLRPC.TL_error tL_error, TLObject tLObject, int i3, b1 b1Var) {
        this.a = 6;
        this.d = i50Var;
        this.e = g4Var;
        this.f = tL_error;
        this.b = tLObject;
        this.c = i3;
        this.h = b1Var;
    }

    public /* synthetic */ k0(w0 w0Var, TLObject tLObject, int i3, org.telegram.ui.web.t0 t0Var, p7 p7Var, TLRPC.TL_error tL_error) {
        this.a = 14;
        this.d = w0Var;
        this.b = tLObject;
        this.c = i3;
        this.e = t0Var;
        this.f = p7Var;
        this.h = tL_error;
    }
}
