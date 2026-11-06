package bg;

import a8.ia;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import bi.ea;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.clearcut.z0;
import di.i8;
import di.k8;
import di.o7;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.gc;
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.ox;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qr;
import org.telegram.messenger.qs;
import org.telegram.messenger.r1;
import org.telegram.messenger.r3;
import org.telegram.messenger.ui;
import org.telegram.messenger.v10;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.w7;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.Components.ex;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.ke0;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.qe0;
import org.telegram.ui.Components.u40;
import org.telegram.ui.a1;
import org.telegram.ui.a21;
import org.telegram.ui.bh;
import org.telegram.ui.bi0;
import org.telegram.ui.e4;
import org.telegram.ui.f3;
import org.telegram.ui.go0;
import org.telegram.ui.i9;
import org.telegram.ui.m40;
import org.telegram.ui.nr;
import org.telegram.ui.o50;
import org.telegram.ui.tf0;
import org.telegram.ui.web.x0;
import org.telegram.ui.ws0;
import org.telegram.ui.zh0;
import p4.c1;
import p4.g1;
import p4.i1;
import p4.m1;
import v4.d1;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ l0(int i7, int i10, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject) {
        this.a = i10;
        this.b = tLObject;
        this.c = i7;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.h = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        int i7 = this.a;
        int i10 = 4;
        final int i11 = this.c;
        int i12 = 0;
        r6 = false;
        boolean z10 = false;
        int i13 = 0;
        int i14 = 1;
        char c10 = 1;
        char c11 = 1;
        char c12 = 1;
        Object obj = this.e;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.d;
        Object obj5 = this.b;
        switch (i7) {
            case 0:
                TLObject tLObject = (TLObject) obj5;
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) obj4;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) obj;
                bh bhVar = (bh) obj3;
                q4 q4Var = (q4) obj2;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    qp.s1(i11).Y3(tL_photos_photo.users, false);
                    TLRPC.User a22 = qp.s1(i11).a2(Long.valueOf(p10.i(i11).n));
                    TLRPC.Photo photo = tL_photos_photo.photo;
                    if ((photo instanceof TLRPC.TL_photo) && a22 != null) {
                        TLRPC.PhotoSize w10 = w7.w(photo.sizes, 100, false, null, false);
                        TLRPC.PhotoSize w11 = w7.w(tL_photos_photo.photo.sizes, 1000, false, null, false);
                        if (w10 == null || photoSize == null || photoSize.location == null) {
                            z9 = true;
                        } else {
                            w7.G(i11);
                            File J = w7.J(w10, null, true, true);
                            w7.G(i11);
                            w7.J(photoSize.location, null, true, true).renameTo(J);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(photoSize.location.volume_id);
                            sb2.append("_");
                            String n10 = a8.p0.n(photoSize.location.local_id, "@50_50", sb2);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(w10.location.volume_id);
                            sb3.append("_");
                            z9 = true;
                            gc.D().S(n10, a8.p0.n(w10.location.local_id, "@50_50", sb3), hc.l(i11, 1, a22));
                        }
                        if (w11 != null && photoSize2 != null && photoSize2.location != null) {
                            w7.G(i11);
                            File J2 = w7.J(w11, null, z9, z9);
                            w7.G(i11);
                            w7.J(photoSize2.location, null, z9, z9).renameTo(J2);
                        }
                        n0.a(tL_photos_photo.photo, a22, false);
                        p10.i(i11).w(a22);
                        p10.i(i11).v(z9);
                        bhVar.run();
                        org.telegram.ui.Components.hc.a0(q4Var.getLastFragment()).V(Collections.singletonList(a22), org.telegram.messenger.g0.X2(hd.M0(2131754219, null)), org.telegram.messenger.g0.U2(hd.M0(2131754220, null), new m0(i11, q4Var, i12)), null).j();
                        break;
                    }
                }
                break;
            case 1:
                TLObject tLObject2 = (TLObject) obj5;
                v2[] v2VarArr = (v2[]) obj;
                f6 f6Var = (f6) obj3;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) obj2;
                ((fi.d) obj4).setLoading(false);
                if (tLObject2 instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject2;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new org.telegram.ui.Components.hc(v2VarArr[0].E, f6Var).t(hd.M0(2131743880, null), null).k(false);
                        break;
                    } else {
                        final long j3 = tL_starsSubscriptionPricing.amount;
                        ea.y(i11, false).h0(tL_messages_checkChatInvite.hash, chatInvite, new v10() { // from class: bi.ga
                            @Override // org.telegram.messenger.v10
                            public final void a(Object obj6, Object obj7) {
                                Long l10 = (Long) obj7;
                                if (!"paid".equals((String) obj6) || l10.longValue() == 0) {
                                    return;
                                }
                                org.telegram.messenger.g0.h3(new ia(l10, i11, j3, 0));
                            }
                        });
                        break;
                    }
                } else {
                    new org.telegram.ui.Components.hc(v2VarArr[0].E, f6Var).t(hd.M0(2131748912, null), null).k(false);
                    break;
                }
            case 2:
                k8.a((k8) obj4, (TLObject) obj5, this.e, (ArrayList) obj3, (boolean[]) obj2, this.c);
                break;
            case 3:
                r3 r3Var = (r3) obj4;
                TLObject tLObject3 = (TLObject) obj5;
                bi.i iVar = (bi.i) obj;
                ArrayList arrayList = (ArrayList) obj3;
                HashSet hashSet = (HashSet) obj2;
                HashSet hashSet2 = r3Var.n;
                ArrayList arrayList2 = r3Var.e;
                if (r3Var.G.remove(Integer.valueOf(i11))) {
                    if (tLObject3 != null) {
                        TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject3;
                        qp.s1(r3Var.C.a).Y3(groupparticipants.users, false);
                        qp.s1(r3Var.C.a).S3(groupparticipants.chats, false);
                        int size = groupparticipants.participants.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            TLRPC.GroupCallParticipant groupCallParticipant = groupparticipants.participants.get(i15);
                            long C1 = ij.C1(groupCallParticipant.peer);
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
                        qs.f(r3Var.C.a).k(qs.w2, Long.valueOf(r3Var.c), Long.valueOf(r3Var.b.id), Boolean.FALSE);
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
            case 4:
                ui uiVar = (ui) obj5;
                boolean[] zArr = (boolean[]) obj4;
                ArrayList arrayList3 = (ArrayList) obj;
                Context context = (Context) obj3;
                f2 f2Var = (f2) obj2;
                uiVar.getClass();
                if (!zArr[0]) {
                    zArr[0] = true;
                    while (i12 < arrayList3.size()) {
                        Context context2 = context;
                        ui uiVar2 = uiVar;
                        uiVar2.h2(context2, 0, f2Var, null, true, (TLObject) arrayList3.get(i12), ((TLRPC.TL_messages_stickerSet) arrayList3.get(i12)).set, null, this.c, false);
                        i12++;
                        uiVar = uiVar2;
                        context = context2;
                    }
                    break;
                }
                break;
            case 5:
                o50 o50Var = (o50) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject4 = (TLObject) obj5;
                a1 a1Var = (a1) obj2;
                o50Var.r = false;
                if (!((e4) obj).e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject4;
                        if (tL_contacts_resolvedPeer.chats.isEmpty()) {
                            a1Var.a(4, false);
                            break;
                        } else {
                            qp.s1(i11).Y3(tL_contacts_resolvedPeer.users, false);
                            qp.s1(i11).S3(tL_contacts_resolvedPeer.chats, false);
                            yr.a0(i11).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            o50Var.n = chat;
                            if (!chat.left || chat.kicked) {
                                a1Var.a(4, false);
                                break;
                            } else {
                                a1Var.a(0, false);
                                break;
                            }
                        }
                    } else {
                        a1Var.a(4, false);
                        break;
                    }
                }
                break;
            case 6:
                TLObject tLObject5 = (TLObject) obj5;
                u1 u1Var = (u1) obj4;
                Context context3 = (Context) obj;
                f6 f6Var2 = (f6) obj3;
                m40 m40Var = (m40) obj2;
                boolean z11 = tLObject5 instanceof TLRPC.Updates;
                int i16 = this.c;
                if (z11) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject5;
                    qp.s1(i16).Y3(updates.users, false);
                    qp.s1(i16).S3(updates.chats, false);
                    ArrayList z02 = qp.z0(updates, TL_update.TL_updateGroupCall.class);
                    int size2 = z02.size();
                    TLRPC.GroupCall groupCall = null;
                    while (i13 < size2) {
                        Object obj6 = z02.get(i13);
                        i13++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj6).call;
                    }
                    u1Var.dismiss();
                    if (groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.id = groupCall.id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        i9.n0(context3, i16, tL_inputGroupCall, groupCall.invite_link, f6Var2, true, true);
                        org.telegram.messenger.g0.h3(m40Var);
                        break;
                    }
                } else if (tLObject5 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject5;
                    qp.s1(i16).Y3(groupcall.users, false);
                    qp.s1(i16).S3(groupcall.chats, false);
                    TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                    TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                    exportgroupcallinvite.call = tL_inputGroupCall2;
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall2.id = groupCall2.id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ConnectionsManager.getInstance(i16).sendRequest(exportgroupcallinvite, new ox(u1Var, context3, i16, exportgroupcallinvite, f6Var2, m40Var));
                    break;
                } else {
                    u1Var.dismiss();
                    org.telegram.messenger.g0.h3(m40Var);
                    break;
                }
                break;
            case 7:
                new a21((Context) obj5, (TLRPC.Chat) obj4, (TLRPC.User) obj, new m0(i11, (qr) obj3, 29), (f6) obj2).show();
                break;
            case 8:
                k9.a((k9) obj5, (Runnable[]) obj4, (Bitmap) obj, (u40) obj3, this.c, (c8.ea[]) obj2);
                break;
            case 9:
                qe0 qe0Var = (qe0) obj4;
                TLObject tLObject6 = (TLObject) obj5;
                ArrayList arrayList4 = (ArrayList) obj3;
                TLRPC.PollAnswerVoters pollAnswerVoters = (TLRPC.PollAnswerVoters) obj2;
                me0 me0Var = qe0Var.j1;
                ArrayList arrayList5 = qe0Var.t1;
                ke0 ke0Var = qe0Var.i1;
                ArrayList arrayList6 = qe0Var.w1;
                arrayList6.remove(((Integer[]) obj)[i11]);
                if (tLObject6 != null) {
                    TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject6;
                    qp.s1(qe0Var.a).Y3(tL_messages_votesList.users, false);
                    if (!tL_messages_votesList.votes.isEmpty()) {
                        arrayList4.add(new pe0(tL_messages_votesList, pollAnswerVoters.option));
                    }
                    if (arrayList6.isEmpty()) {
                        int size3 = arrayList4.size();
                        boolean z12 = false;
                        for (int i17 = 0; i17 < size3; i17++) {
                            pe0 pe0Var = (pe0) arrayList4.get(i17);
                            int size4 = arrayList5.size();
                            int i18 = 0;
                            while (true) {
                                if (i18 < size4) {
                                    pe0 pe0Var2 = (pe0) arrayList5.get(i18);
                                    if (Arrays.equals(pe0Var.d, pe0Var2.d)) {
                                        pe0Var2.c = pe0Var.c;
                                        if (pe0Var2.a != pe0Var.a || pe0Var2.b.size() != pe0Var.b.size()) {
                                            z12 = true;
                                        }
                                        pe0Var2.a = pe0Var.a;
                                        pe0Var2.b = pe0Var.b;
                                    } else {
                                        i18++;
                                    }
                                }
                            }
                        }
                        qe0Var.C1 = false;
                        if (ke0Var != null) {
                            if (qe0Var.A0 != 0 || qe0Var.G != null || z12) {
                                if (z12) {
                                    qe0Var.L0();
                                }
                                me0Var.X(false);
                                break;
                            } else {
                                int childCount = ke0Var.getChildCount();
                                ArrayList arrayList7 = new ArrayList();
                                for (int i19 = 0; i19 < childCount; i19++) {
                                    View childAt = ke0Var.getChildAt(i19);
                                    if (childAt instanceof PollVotesAlert$UserCell) {
                                        View F = ke0Var.F(childAt);
                                        d1 T = F == null ? null : ke0Var.T(F);
                                        if (T != null) {
                                            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                                            pollVotesAlert$UserCell.D = arrayList7;
                                            pollVotesAlert$UserCell.setEnabled(true);
                                            me0Var.y(T);
                                            pollVotesAlert$UserCell.D = null;
                                        }
                                    }
                                }
                                if (!arrayList7.isEmpty()) {
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(arrayList7);
                                    animatorSet.setDuration(180L);
                                    animatorSet.start();
                                }
                                qe0Var.C1 = false;
                                break;
                            }
                        }
                    }
                } else {
                    qe0Var.dismiss();
                    break;
                }
                break;
            case 10:
                nr.c0((nr) obj4, (TLRPC.FileLocation) obj, (TLRPC.InputFile) obj3, (TLObject) obj5, (TLRPC.FileLocation) obj2, this.c);
                break;
            case 11:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) obj5;
                String[] strArr = (String[]) obj4;
                Context context4 = (Context) obj;
                zh0 zh0Var = (zh0) obj3;
                f2 f2Var2 = (f2) obj2;
                if (tL_urlAuthResultRequest.match_codes.isEmpty() || !TextUtils.isEmpty(strArr[0])) {
                    zh0Var.run();
                    break;
                } else {
                    bi0.c(context4, this.c, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new ex(18, strArr, zh0Var), true, new ai.m0(22), f2Var2.getResourceProvider());
                    break;
                }
            case 12:
                f2 f2Var3 = (f2) obj4;
                List<Purchase> list = (List) obj;
                z0 z0Var = (z0) obj3;
                ws0 ws0Var = (ws0) obj2;
                if (((f5.f) obj5).a == 0) {
                    tf0 tf0Var = new tf0(c10 == true ? 1 : 0, f2Var3);
                    int i20 = this.c;
                    if (list != null && !list.isEmpty() && !p10.i(i20).q()) {
                        for (Purchase purchase : list) {
                            if (purchase.b().contains("telegram_premium")) {
                                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                tL_dataJSON.data = purchase.a;
                                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                                tL_inputStorePaymentPremiumSubscription.restore = true;
                                if (z0Var != null) {
                                    tL_inputStorePaymentPremiumSubscription.upgrade = true;
                                }
                                tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                                ConnectionsManager.getInstance(i20).sendRequest(tL_payments_assignPlayMarketTransaction, new i8(i20, tf0Var, f2Var3, tL_payments_assignPlayMarketTransaction), 66);
                                break;
                            }
                        }
                    }
                    r1.i().d("telegram_premium", new f3(tf0Var, i10));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (z0Var != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i20).sendRequest(tL_payments_canPurchaseStore, new ox(i20, 5, f2Var3, ws0Var, z0Var, tL_payments_canPurchaseStore, tL_inputStorePaymentPremiumSubscription2));
                    break;
                }
                break;
            case 13:
                x0 x0Var = (x0) obj4;
                org.telegram.ui.web.u0 u0Var = (org.telegram.ui.web.u0) obj;
                o7 o7Var = (o7) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                boolean z13 = ((TLObject) obj5) instanceof TLRPC.TL_boolTrue;
                int i21 = this.c;
                if (z13) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        x0.w(i21, u0Var, o7Var, "write_access_requested", jSONObject);
                        break;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        return;
                    }
                } else if (tL_error2 != null) {
                    x0Var.Z(tL_error2.text);
                    break;
                } else {
                    String[] strArr2 = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x0Var.getContext());
                    String M0 = hd.M0(2131752898, null);
                    u1 u1Var2 = alertDialog$Builder.a;
                    u1Var2.R = M0;
                    u1Var2.T = hd.M0(2131752899, null);
                    alertDialog$Builder.k(hd.M0(2131752909, null), new org.telegram.ui.web.a0(0, x0Var, strArr2));
                    alertDialog$Builder.h(hd.M0(2131752904, null), new go0(17));
                    x0Var.Y(3, u1Var2, new org.telegram.ui.web.t(strArr2, i21, u0Var, o7Var, 1));
                    break;
                }
            default:
                c1 c1Var = (c1) obj5;
                p4.v vVar = (p4.v) obj4;
                i1 i1Var = (i1) obj;
                String str = i1Var.b;
                p4.d0 d0Var = (p4.d0) obj3;
                int i22 = this.c;
                p4.l lVar = (p4.l) obj2;
                ui.e eVar = c1Var.b;
                if (eVar.D(vVar)) {
                    try {
                        p4.d d = p4.d.d(i1Var);
                        Object obj7 = d.g;
                        int i23 = d.b;
                        if (d.b()) {
                            i1 i1Var2 = d.a;
                            if (i1Var2 != null) {
                                ia.p(i1Var2.a == 40010);
                                c1Var.J0(lVar, i22, null, 40010, new p4.t0(new p4.w0(d), i14));
                                break;
                            } else {
                                g1 g1Var = d0Var.t;
                                if (i23 == 1) {
                                    if (obj7 != null) {
                                        z10 = ((Boolean) obj7).booleanValue();
                                    } else if (!g1Var.u()) {
                                        z10 = true;
                                    }
                                }
                                if (z10) {
                                    c1Var.O0(vVar, i22);
                                } else if (i23 == 31) {
                                    obj7.getClass();
                                    c1Var.Q0(vVar, i22, 31, new p4.t0(new org.telegram.ui.web.a0(8, new ab.y(9, (e2.l0) obj7, c12 == true ? 1 : 0), new p4.r0(13)), c11 == true ? 1 : 0));
                                } else {
                                    c1Var.Q0(vVar, i22, i23, c1.S0(new p4.w0(d)));
                                }
                                eVar.q(vVar);
                                break;
                            }
                        } else {
                            h2.a.l("MediaSessionStub", "Can't execute predefined custom command: " + str);
                            c1.R0(d0Var, vVar, i22, new m1(-6));
                            break;
                        }
                    } catch (RuntimeException e11) {
                        h2.a.m("MediaSessionStub", "Failed to convert predefined custom command: " + str, e11);
                        c1.R0(d0Var, vVar, i22, new m1(-3));
                    }
                }
                break;
        }
    }

    public /* synthetic */ l0(k8 k8Var, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i7) {
        this.a = 2;
        this.d = k8Var;
        this.b = tLObject;
        this.e = obj;
        this.f = arrayList;
        this.h = zArr;
        this.c = i7;
    }

    public /* synthetic */ l0(fi.d dVar, TLObject tLObject, v2[] v2VarArr, f6 f6Var, int i7, TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite) {
        this.a = 1;
        this.d = dVar;
        this.b = tLObject;
        this.e = v2VarArr;
        this.f = f6Var;
        this.c = i7;
        this.h = tL_messages_checkChatInvite;
    }

    public /* synthetic */ l0(Object obj, Object obj2, Object obj3, int i7, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = i7;
        this.f = obj4;
        this.h = obj5;
    }

    public /* synthetic */ l0(Object obj, Object obj2, Object obj3, Object obj4, int i7, Object obj5, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.c = i7;
        this.h = obj5;
    }

    public /* synthetic */ l0(r3 r3Var, int i7, TLObject tLObject, bi.i iVar, ArrayList arrayList, HashSet hashSet) {
        this.a = 3;
        this.d = r3Var;
        this.c = i7;
        this.b = tLObject;
        this.e = iVar;
        this.f = arrayList;
        this.h = hashSet;
    }

    public /* synthetic */ l0(ui uiVar, boolean[] zArr, ArrayList arrayList, Context context, f2 f2Var, int i7) {
        this.a = 4;
        this.b = uiVar;
        this.d = zArr;
        this.e = arrayList;
        this.f = context;
        this.h = f2Var;
        this.c = i7;
    }

    public /* synthetic */ l0(qe0 qe0Var, Integer[] numArr, int i7, TLObject tLObject, ArrayList arrayList, TLRPC.PollAnswerVoters pollAnswerVoters) {
        this.a = 9;
        this.d = qe0Var;
        this.e = numArr;
        this.c = i7;
        this.b = tLObject;
        this.f = arrayList;
        this.h = pollAnswerVoters;
    }

    public /* synthetic */ l0(nr nrVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i7) {
        this.a = 10;
        this.d = nrVar;
        this.e = fileLocation;
        this.f = inputFile;
        this.b = tLObject;
        this.h = fileLocation2;
        this.c = i7;
    }

    public /* synthetic */ l0(o50 o50Var, e4 e4Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7, a1 a1Var) {
        this.a = 5;
        this.d = o50Var;
        this.e = e4Var;
        this.f = tL_error;
        this.b = tLObject;
        this.c = i7;
        this.h = a1Var;
    }

    public /* synthetic */ l0(x0 x0Var, TLObject tLObject, int i7, org.telegram.ui.web.u0 u0Var, o7 o7Var, TLRPC.TL_error tL_error) {
        this.a = 13;
        this.d = x0Var;
        this.b = tLObject;
        this.c = i7;
        this.e = u0Var;
        this.f = o7Var;
        this.h = tL_error;
    }
}
