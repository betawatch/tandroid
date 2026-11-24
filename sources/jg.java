// default package

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.android.billingclient.api.Purchase;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.PollVotesAlert$UserCell;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class jg implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ jg(b61 b61Var, TLObject tLObject, my0[] my0VarArr, ylb ylbVar, int i, TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite) {
        this.a = (byte) 11;
        this.c = b61Var;
        this.d = tLObject;
        this.e = my0VarArr;
        this.h = ylbVar;
        this.b = i;
        this.f = tL_messages_checkChatInvite;
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03fd  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        TLRPC.PhotoSize photoSize;
        byte b = this.a;
        final int i = this.b;
        byte b2 = 1;
        byte b3 = 0;
        Object obj = this.e;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                new k0a((Activity) obj5, (TLRPC.Chat) obj4, (TLRPC.User) obj, new eh(i, (ue7) obj3, b3), (ylb) obj2).show();
                break;
            case 1:
                ui5 ui5Var = (ui5) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                TLObject tLObject = (TLObject) obj3;
                ev evVar = (ev) obj2;
                ui5Var.r = false;
                if (!((ey) obj4).e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        if (tL_contacts_resolvedPeer.chats.isEmpty()) {
                            evVar.a(4, false);
                            break;
                        } else {
                            oc7.r1(i).d4(tL_contacts_resolvedPeer.users, false);
                            oc7.r1(i).X3(tL_contacts_resolvedPeer.chats, false);
                            cf7.Y(i).j1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            ui5Var.n = chat;
                            if (!chat.left || chat.kicked) {
                                evVar.a(4, false);
                                break;
                            } else {
                                evVar.a(0, false);
                                break;
                            }
                        }
                    } else {
                        evVar.a(4, false);
                        break;
                    }
                }
                break;
            case 2:
                ((we0) obj5).e((Runnable[]) obj4, (Bitmap) obj, (ir5) obj3, this.b, (wpd[]) obj2);
                break;
            case 3:
                qw0 qw0Var = (qw0) obj5;
                mw0 mw0Var = (mw0) obj;
                ow0 ow0Var = (ow0) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                boolean z2 = ((TLObject) obj4) instanceof TLRPC.TL_boolTrue;
                int i2 = this.b;
                if (z2) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        qw0.t(i2, mw0Var, ow0Var, "write_access_requested", jSONObject);
                        break;
                    } catch (Exception e) {
                        fc4.g(e, true);
                        return;
                    }
                } else if (tL_error2 != null) {
                    qw0Var.Y(tL_error2.text);
                    break;
                } else {
                    String[] strArr = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qw0Var.getContext());
                    String M0 = jb6.M0(2131752851, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.S = M0;
                    heVar.U = jb6.M0(2131752852, null);
                    alertDialog$Builder.j(jb6.M0(2131752862, null), new o(qw0Var, strArr, (byte) 25));
                    alertDialog$Builder.g(jb6.M0(2131752857, null), new qn0((byte) 6));
                    qw0Var.W(3, heVar, new gv0(strArr, i2, mw0Var, ow0Var, (byte) 1));
                    break;
                }
            case 4:
                TLObject tLObject2 = (TLObject) obj5;
                he heVar2 = (he) obj4;
                Context context = (Context) obj;
                ylb ylbVar = (ylb) obj2;
                dc5 dc5Var = (dc5) obj3;
                boolean z3 = tLObject2 instanceof TLRPC.Updates;
                int i3 = this.b;
                if (z3) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    oc7.r1(i3).d4(updates.users, false);
                    oc7.r1(i3).X3(updates.chats, false);
                    ArrayList x0 = oc7.x0(updates, TL_update.TL_updateGroupCall.class);
                    int size = x0.size();
                    TLRPC.GroupCall groupCall = null;
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj6 = x0.get(i4);
                        i4++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj6).call;
                    }
                    heVar2.dismiss();
                    if (groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.id = groupCall.id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        ia1.l0(context, i3, tL_inputGroupCall, groupCall.invite_link, ylbVar, true, true);
                        gm.c3(dc5Var);
                        break;
                    }
                } else if (tLObject2 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                    oc7.r1(i3).d4(groupcall.users, false);
                    oc7.r1(i3).X3(groupcall.chats, false);
                    TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                    TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                    exportgroupcallinvite.call = tL_inputGroupCall2;
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall2.id = groupCall2.id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ConnectionsManager.getInstance(i3).sendRequest(exportgroupcallinvite, new ou(heVar2, context, i3, exportgroupcallinvite, ylbVar, dc5Var));
                    break;
                } else {
                    heVar2.dismiss();
                    gm.c3(dc5Var);
                    break;
                }
                break;
            case 5:
                qd2 qd2Var = (qd2) obj5;
                TLObject tLObject3 = (TLObject) obj4;
                pt0 pt0Var = (pt0) obj;
                ArrayList arrayList = (ArrayList) obj3;
                HashSet hashSet = (HashSet) obj2;
                HashSet hashSet2 = qd2Var.n;
                ArrayList arrayList2 = qd2Var.e;
                if (qd2Var.G.remove(Integer.valueOf(i))) {
                    if (tLObject3 != null) {
                        TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject3;
                        oc7.r1(qd2Var.C.a).d4(groupparticipants.users, false);
                        oc7.r1(qd2Var.C.a).X3(groupparticipants.chats, false);
                        int size2 = groupparticipants.participants.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            TLRPC.GroupCallParticipant groupCallParticipant = groupparticipants.participants.get(i5);
                            long B1 = k47.B1(groupCallParticipant.peer);
                            TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) qd2Var.d.f(B1);
                            if (groupCallParticipant2 != null) {
                                arrayList2.remove(groupCallParticipant2);
                                qd2Var.o(groupCallParticipant2, false);
                            }
                            qd2Var.d.k(groupCallParticipant, B1);
                            arrayList2.add(groupCallParticipant);
                            qd2Var.o(groupCallParticipant, true);
                            if (hashSet2.contains(Long.valueOf(B1))) {
                                Long valueOf = Long.valueOf(B1);
                                hashSet2.remove(valueOf);
                                qd2Var.j.remove(valueOf);
                            }
                        }
                        if (qd2Var.b.participants_count < qd2Var.d.m()) {
                            qd2Var.b.participants_count = qd2Var.d.m();
                        }
                        qd2Var.B();
                        nm7.f(qd2Var.C.a).k(nm7.w2, Long.valueOf(qd2Var.c), Long.valueOf(qd2Var.b.id), Boolean.FALSE);
                        if (pt0Var != null) {
                            ((VoIPService) pt0Var.c).lambda$createGroupInstance$72(pt0Var.b, (int[]) pt0Var.d, arrayList);
                        } else {
                            qd2Var.x();
                        }
                    }
                    hashSet.removeAll(arrayList);
                    break;
                }
                break;
            case 6:
                oz6 oz6Var = (oz6) obj5;
                r7a r7aVar = (r7a) obj;
                String str = r7aVar.b;
                tx6 tx6Var = (tx6) obj3;
                int i6 = this.b;
                dk5 dk5Var = (dk5) obj2;
                mx6 mx6Var = oz6Var.b;
                sw6 N = mx6Var.N((IBinder) obj4);
                if (N != null && mx6Var.X(N)) {
                    try {
                        un2 c = un2.c(r7aVar);
                        Object obj7 = c.g;
                        int i7 = c.b;
                        if (!c.a()) {
                            ncd.f("MediaSessionStub", "Can't execute predefined custom command: ".concat(str));
                            oz6.W(tx6Var, N, i6, new q8a(-6));
                            break;
                        } else {
                            r7a r7aVar2 = c.a;
                            if (r7aVar2 != null) {
                                jte.p(r7aVar2.a == 40010);
                                oz6Var.d(dk5Var, i6, null, 40010, new dz6(new gz6(c), b2));
                                break;
                            } else {
                                tx6Var.t();
                                cf8 cf8Var = tx6Var.t;
                                if (i7 == 1) {
                                    if (obj7 != null) {
                                        z = ((Boolean) obj7).booleanValue();
                                    } else if (!cf8Var.s()) {
                                        z = true;
                                    }
                                    if (!z) {
                                        oz6Var.Q(N, i6);
                                    } else if (i7 == 31) {
                                        obj7.getClass();
                                        oz6Var.S(N, i6, 31, new dz6(new cz6((Object) new cj6((bt6) obj7, (byte) 9), (Object) new yy6((byte) 20), (byte) 0), b2));
                                    } else {
                                        oz6Var.S(N, i6, i7, oz6.X(new gz6(c)));
                                    }
                                    mx6Var.F(N);
                                    break;
                                }
                                z = false;
                                if (!z) {
                                }
                                mx6Var.F(N);
                            }
                        }
                    } catch (RuntimeException e2) {
                        ncd.g("MediaSessionStub", "Failed to convert predefined custom command: ".concat(str), e2);
                        oz6.W(tx6Var, N, i6, new q8a(-3));
                        return;
                    }
                }
                break;
            case 7:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) obj5;
                String[] strArr2 = (String[]) obj4;
                Context context2 = (Context) obj;
                vp7 vp7Var = (vp7) obj3;
                d dVar = (d) obj2;
                if (tL_urlAuthResultRequest.match_codes.isEmpty() || !TextUtils.isEmpty(strArr2[0])) {
                    vp7Var.run();
                    break;
                } else {
                    xp7.c(context2, this.b, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new u35(strArr2, vp7Var, (byte) 12), true, new jd((byte) 10), dVar.getResourceProvider());
                    break;
                }
            case 8:
                TLObject tLObject4 = (TLObject) obj5;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) obj4;
                TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) obj;
                au1 au1Var = (au1) obj3;
                tk5 tk5Var = (tk5) obj2;
                if (tLObject4 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject4;
                    oc7.r1(i).d4(tL_photos_photo.users, false);
                    TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(z8c.h(i).n));
                    TLRPC.Photo photo = tL_photos_photo.photo;
                    if ((photo instanceof TLRPC.TL_photo) && W1 != null) {
                        TLRPC.PhotoSize w = bc4.w(photo.sizes, 100, false, null, false);
                        TLRPC.PhotoSize w2 = bc4.w(tL_photos_photo.photo.sizes, 1000, false, null, false);
                        if (w == null || photoSize2 == null || photoSize2.location == null) {
                            photoSize = photoSize3;
                        } else {
                            bc4.G(i);
                            File J = bc4.J(w, null, true, true);
                            bc4.G(i);
                            bc4.J(photoSize2.location, null, true, true).renameTo(J);
                            StringBuilder sb = new StringBuilder();
                            sb.append(photoSize2.location.volume_id);
                            sb.append("_");
                            String k = hg9.k(sb, photoSize2.location.local_id, "@50_50");
                            StringBuilder sb2 = new StringBuilder();
                            photoSize = photoSize3;
                            sb2.append(w.location.volume_id);
                            sb2.append("_");
                            fn5.z().O(k, hg9.k(sb2, w.location.local_id, "@50_50"), gn5.l(i, 1, W1));
                        }
                        if (w2 != null && photoSize != null) {
                            TLRPC.PhotoSize photoSize4 = photoSize;
                            if (photoSize4.location != null) {
                                bc4.G(i);
                                File J2 = bc4.J(w2, null, true, true);
                                bc4.G(i);
                                bc4.J(photoSize4.location, null, true, true).renameTo(J2);
                            }
                        }
                        f88.a(tL_photos_photo.photo, W1, false);
                        z8c.h(i).v(W1);
                        z8c.h(i).u(true);
                        au1Var.run();
                        c41.b0(tk5Var.getLastFragment()).V(Collections.singletonList(W1), gm.S2(jb6.M0(2131754184, null)), gm.N2(jb6.M0(2131754185, null), -1, 0, new ge7(i, tk5Var, (byte) 4), null), null).j();
                        break;
                    }
                }
                break;
            case 9:
                ih8 ih8Var = (ih8) obj5;
                TLObject tLObject5 = (TLObject) obj;
                ArrayList arrayList3 = (ArrayList) obj3;
                TLRPC.PollAnswerVoters pollAnswerVoters = (TLRPC.PollAnswerVoters) obj2;
                eh8 eh8Var = ih8Var.m1;
                ArrayList arrayList4 = ih8Var.w1;
                ch8 ch8Var = ih8Var.l1;
                ArrayList arrayList5 = ih8Var.z1;
                arrayList5.remove(((Integer[]) obj4)[i]);
                if (tLObject5 != null) {
                    TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject5;
                    oc7.r1(ih8Var.a).d4(tL_messages_votesList.users, false);
                    if (!tL_messages_votesList.votes.isEmpty()) {
                        arrayList3.add(new hh8(tL_messages_votesList, pollAnswerVoters.option));
                    }
                    if (arrayList5.isEmpty()) {
                        int size3 = arrayList3.size();
                        boolean z4 = false;
                        for (int i8 = 0; i8 < size3; i8++) {
                            hh8 hh8Var = (hh8) arrayList3.get(i8);
                            int size4 = arrayList4.size();
                            int i9 = 0;
                            while (true) {
                                if (i9 < size4) {
                                    hh8 hh8Var2 = (hh8) arrayList4.get(i9);
                                    if (Arrays.equals(hh8Var.d, hh8Var2.d)) {
                                        hh8Var2.c = hh8Var.c;
                                        if (hh8Var2.a != hh8Var.a || hh8Var2.b.size() != hh8Var.b.size()) {
                                            z4 = true;
                                        }
                                        hh8Var2.a = hh8Var.a;
                                        hh8Var2.b = hh8Var.b;
                                    } else {
                                        i9++;
                                    }
                                }
                            }
                        }
                        ih8Var.F1 = false;
                        if (ch8Var != null) {
                            if (ih8Var.B0 != 0 || ih8Var.H != null || z4) {
                                if (z4) {
                                    ih8Var.F0();
                                }
                                eh8Var.X(false);
                                break;
                            } else {
                                int childCount = ch8Var.getChildCount();
                                ArrayList arrayList6 = new ArrayList();
                                for (int i10 = 0; i10 < childCount; i10++) {
                                    View childAt = ch8Var.getChildAt(i10);
                                    if (childAt instanceof PollVotesAlert$UserCell) {
                                        View F = ch8Var.F(childAt);
                                        u69 T = F == null ? null : ch8Var.T(F);
                                        if (T != null) {
                                            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                                            pollVotesAlert$UserCell.E = arrayList6;
                                            pollVotesAlert$UserCell.setEnabled(true);
                                            eh8Var.y(T);
                                            pollVotesAlert$UserCell.E = null;
                                        }
                                    }
                                }
                                if (!arrayList6.isEmpty()) {
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(arrayList6);
                                    animatorSet.setDuration(180L);
                                    animatorSet.start();
                                }
                                ih8Var.F1 = false;
                                break;
                            }
                        }
                    }
                } else {
                    ih8Var.dismiss();
                    break;
                }
                break;
            case 10:
                d dVar2 = (d) obj4;
                List<Purchase> list = (List) obj;
                ohd ohdVar = (ohd) obj3;
                ik8 ik8Var = (ik8) obj2;
                if (((fj0) obj5).a == 0) {
                    ww1 ww1Var = new ww1(dVar2, (byte) 5);
                    int i11 = this.b;
                    if (list != null && !list.isEmpty() && !z8c.h(i11).p()) {
                        for (Purchase purchase : list) {
                            if (purchase.c().contains("telegram_premium")) {
                                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                tL_dataJSON.data = purchase.a;
                                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                                tL_inputStorePaymentPremiumSubscription.restore = true;
                                if (ohdVar != null) {
                                    tL_inputStorePaymentPremiumSubscription.upgrade = true;
                                }
                                tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                                ConnectionsManager.getInstance(i11).sendRequest(tL_payments_assignPlayMarketTransaction, new af(i11, ww1Var, dVar2, tL_payments_assignPlayMarketTransaction), 66);
                                break;
                            }
                        }
                    }
                    cj0.h().c("telegram_premium", new gx(ww1Var, (byte) 12));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (ohdVar != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_payments_canPurchaseStore, new ou(dVar2, tL_inputStorePaymentPremiumSubscription2, ik8Var, ohdVar, i11, tL_payments_canPurchaseStore));
                    break;
                }
                break;
            case 11:
                TLObject tLObject6 = (TLObject) obj4;
                my0[] my0VarArr = (my0[]) obj;
                ylb ylbVar2 = (ylb) obj2;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) obj3;
                ((b61) obj5).setLoading(false);
                if (tLObject6 instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject6;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new c41(my0VarArr[0].F, ylbVar2).t(jb6.M0(2131743566, null), null).k(false);
                        break;
                    } else {
                        final long j = tL_starsSubscriptionPricing.amount;
                        jva.v(i, false).h0(tL_messages_checkChatInvite.hash, chatInvite, new jac() { // from class: lva
                            @Override // jac
                            public final void a(Object obj8, Object obj9) {
                                Long l = (Long) obj9;
                                if (!"paid".equals((String) obj8) || l.longValue() == 0) {
                                    return;
                                }
                                gm.c3(new gc2((Object) l, i, j, (byte) 6));
                            }
                        });
                        break;
                    }
                } else {
                    new c41(my0VarArr[0].F, ylbVar2).t(jb6.M0(2131748670, null), null).k(false);
                    break;
                }
            default:
                ((y5b) obj5).c((TLObject) obj4, this.e, (ArrayList) obj3, (boolean[]) obj2, this.b);
                break;
        }
    }

    public /* synthetic */ jg(y5b y5bVar, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i) {
        this.a = (byte) 12;
        this.c = y5bVar;
        this.d = tLObject;
        this.e = obj;
        this.f = arrayList;
        this.h = zArr;
        this.b = i;
    }

    public /* synthetic */ jg(KeyEvent.Callback callback, Object obj, int i, Object obj2, Object obj3, TLObject tLObject, byte b) {
        this.a = b;
        this.c = callback;
        this.d = obj;
        this.b = i;
        this.e = obj2;
        this.f = obj3;
        this.h = tLObject;
    }

    public /* synthetic */ jg(Object obj, int i, TLObject tLObject, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = tLObject;
        this.e = obj2;
        this.f = obj3;
        this.h = obj4;
    }

    public /* synthetic */ jg(Object obj, Object obj2, Object obj3, int i, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
        this.f = obj4;
        this.h = obj5;
    }

    public /* synthetic */ jg(Object obj, Object obj2, Object obj3, Object obj4, int i, Object obj5, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i;
        this.h = obj5;
    }

    public /* synthetic */ jg(TLObject tLObject, int i, he heVar, Context context, ylb ylbVar, dc5 dc5Var) {
        this.a = (byte) 4;
        this.c = tLObject;
        this.b = i;
        this.d = heVar;
        this.e = context;
        this.h = ylbVar;
        this.f = dc5Var;
    }
}
