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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class jf implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ jf(u41 u41Var, TLObject tLObject, fx0[] fx0VarArr, wjb wjbVar, int i, TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite) {
        this.a = (byte) 11;
        this.c = u41Var;
        this.d = tLObject;
        this.e = fx0VarArr;
        this.h = wjbVar;
        this.b = i;
        this.f = tL_messages_checkChatInvite;
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03ed  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        boolean z2;
        byte b = this.a;
        final int i = this.b;
        byte b2 = 0;
        Object obj = this.e;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                new iy9((Activity) obj5, (TLRPC.Chat) obj4, (TLRPC.User) obj, new eg(i, (sc7) obj3, b2), (wjb) obj2).show();
                break;
            case 1:
                vg5 vg5Var = (vg5) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                TLObject tLObject = (TLObject) obj3;
                eu euVar = (eu) obj2;
                vg5Var.r = false;
                if (!((dx) obj4).e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        if (tL_contacts_resolvedPeer.chats.isEmpty()) {
                            euVar.a(4, false);
                            break;
                        } else {
                            na7.q1(i).b4(tL_contacts_resolvedPeer.users, false);
                            na7.q1(i).V3(tL_contacts_resolvedPeer.chats, false);
                            ad7.Y(i).j1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            vg5Var.n = chat;
                            if (!chat.left || chat.kicked) {
                                euVar.a(4, false);
                                break;
                            } else {
                                euVar.a(0, false);
                                break;
                            }
                        }
                    } else {
                        euVar.a(4, false);
                        break;
                    }
                }
                break;
            case 2:
                ((wd0) obj5).e((Runnable[]) obj4, (Bitmap) obj, (ip5) obj3, this.b, (tnd[]) obj2);
                break;
            case 3:
                hv0 hv0Var = (hv0) obj5;
                cv0 cv0Var = (cv0) obj;
                ev0 ev0Var = (ev0) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                boolean z3 = ((TLObject) obj4) instanceof TLRPC.TL_boolTrue;
                int i2 = this.b;
                if (z3) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        hv0.t(i2, cv0Var, ev0Var, "write_access_requested", jSONObject);
                        break;
                    } catch (Exception e) {
                        fa4.g(e, true);
                        return;
                    }
                } else if (tL_error2 != null) {
                    hv0Var.Y(tL_error2.text);
                    break;
                } else {
                    String[] strArr = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hv0Var.getContext());
                    String M0 = k96.M0(2131752886, null);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = M0;
                    hdVar.U = k96.M0(2131752887, null);
                    alertDialog$Builder.j(k96.M0(2131752897, null), new o(hv0Var, strArr, (byte) 24));
                    alertDialog$Builder.g(k96.M0(2131752892, null), new qm0((byte) 6));
                    hv0Var.W(3, hdVar, new xt0(strArr, i2, cv0Var, ev0Var, (byte) 1));
                    break;
                }
            case 4:
                TLObject tLObject2 = (TLObject) obj5;
                hd hdVar2 = (hd) obj4;
                Context context = (Context) obj;
                wjb wjbVar = (wjb) obj2;
                fa5 fa5Var = (fa5) obj3;
                boolean z4 = tLObject2 instanceof TLRPC.Updates;
                int i3 = this.b;
                if (z4) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject2;
                    na7.q1(i3).b4(updates.users, false);
                    na7.q1(i3).V3(updates.chats, false);
                    ArrayList x0 = na7.x0(updates, TL_update.TL_updateGroupCall.class);
                    int size = x0.size();
                    TLRPC.GroupCall groupCall = null;
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj6 = x0.get(i4);
                        i4++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj6).call;
                    }
                    hdVar2.dismiss();
                    if (groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.id = groupCall.id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        z81.l0(context, i3, tL_inputGroupCall, groupCall.invite_link, wjbVar, true, true);
                        gl.c3(fa5Var);
                        break;
                    }
                } else if (tLObject2 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                    na7.q1(i3).b4(groupcall.users, false);
                    na7.q1(i3).V3(groupcall.chats, false);
                    TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                    TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                    exportgroupcallinvite.call = tL_inputGroupCall2;
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall2.id = groupCall2.id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ConnectionsManager.getInstance(i3).sendRequest(exportgroupcallinvite, new ot(hdVar2, context, i3, exportgroupcallinvite, wjbVar, fa5Var));
                    break;
                } else {
                    hdVar2.dismiss();
                    gl.c3(fa5Var);
                    break;
                }
                break;
            case 5:
                fc2 fc2Var = (fc2) obj5;
                TLObject tLObject3 = (TLObject) obj4;
                hs0 hs0Var = (hs0) obj;
                ArrayList arrayList = (ArrayList) obj3;
                HashSet hashSet = (HashSet) obj2;
                HashSet hashSet2 = fc2Var.n;
                ArrayList arrayList2 = fc2Var.e;
                if (fc2Var.G.remove(Integer.valueOf(i))) {
                    if (tLObject3 != null) {
                        TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject3;
                        na7.q1(fc2Var.C.a).b4(groupparticipants.users, false);
                        na7.q1(fc2Var.C.a).V3(groupparticipants.chats, false);
                        int size2 = groupparticipants.participants.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            TLRPC.GroupCallParticipant groupCallParticipant = groupparticipants.participants.get(i5);
                            long B1 = k27.B1(groupCallParticipant.peer);
                            TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) fc2Var.d.f(B1);
                            if (groupCallParticipant2 != null) {
                                arrayList2.remove(groupCallParticipant2);
                                fc2Var.o(groupCallParticipant2, false);
                            }
                            fc2Var.d.k(groupCallParticipant, B1);
                            arrayList2.add(groupCallParticipant);
                            fc2Var.o(groupCallParticipant, true);
                            if (hashSet2.contains(Long.valueOf(B1))) {
                                Long valueOf = Long.valueOf(B1);
                                hashSet2.remove(valueOf);
                                fc2Var.j.remove(valueOf);
                            }
                        }
                        if (fc2Var.b.participants_count < fc2Var.d.m()) {
                            fc2Var.b.participants_count = fc2Var.d.m();
                        }
                        fc2Var.B();
                        kk7.f(fc2Var.C.a).k(kk7.v2, Long.valueOf(fc2Var.c), Long.valueOf(fc2Var.b.id), Boolean.FALSE);
                        if (hs0Var != null) {
                            ((VoIPService) hs0Var.c).lambda$createGroupInstance$72(hs0Var.b, (int[]) hs0Var.d, arrayList);
                        } else {
                            fc2Var.x();
                        }
                    }
                    hashSet.removeAll(arrayList);
                    break;
                }
                break;
            case 6:
                ox6 ox6Var = (ox6) obj5;
                p5a p5aVar = (p5a) obj;
                String str = p5aVar.b;
                tv6 tv6Var = (tv6) obj3;
                int i6 = this.b;
                ei5 ei5Var = (ei5) obj2;
                mv6 mv6Var = ox6Var.b;
                su6 L = mv6Var.L((IBinder) obj4);
                if (L != null && mv6Var.V(L)) {
                    try {
                        hm2 c = hm2.c(p5aVar);
                        Object obj7 = c.g;
                        int i7 = c.b;
                        if (!c.a()) {
                            lad.f("MediaSessionStub", "Can't execute predefined custom command: ".concat(str));
                            ox6.W(tv6Var, L, i6, new o6a(-6));
                            break;
                        } else {
                            p5a p5aVar2 = c.a;
                            if (p5aVar2 != null) {
                                gre.p(p5aVar2.a == 40010);
                                ox6Var.d(ei5Var, i6, null, 40010, new cx6(new gx6(c), (byte) 1));
                                break;
                            } else {
                                tv6Var.t();
                                ad8 ad8Var = tv6Var.t;
                                if (i7 == 1) {
                                    if (obj7 != null) {
                                        z = ((Boolean) obj7).booleanValue();
                                    } else if (!ad8Var.s()) {
                                        z = true;
                                    }
                                    if (!z) {
                                        ox6Var.Q(L, i6);
                                    } else if (i7 == 31) {
                                        obj7.getClass();
                                        ox6Var.S(L, i6, 31, new cx6(new h45(new im6((br6) obj7, (byte) 6), new yw6((byte) 18), (byte) 29), (byte) 1));
                                    } else {
                                        ox6Var.S(L, i6, i7, ox6.X(new gx6(c)));
                                    }
                                    mv6Var.E(L);
                                    break;
                                }
                                z = false;
                                if (!z) {
                                }
                                mv6Var.E(L);
                            }
                        }
                    } catch (RuntimeException e2) {
                        lad.g("MediaSessionStub", "Failed to convert predefined custom command: ".concat(str), e2);
                        ox6.W(tv6Var, L, i6, new o6a(-3));
                        return;
                    }
                }
                break;
            case 7:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) obj5;
                String[] strArr2 = (String[]) obj4;
                Context context2 = (Context) obj;
                sn7 sn7Var = (sn7) obj3;
                d dVar = (d) obj2;
                if (tL_urlAuthResultRequest.match_codes.isEmpty() || !TextUtils.isEmpty(strArr2[0])) {
                    sn7Var.run();
                    break;
                } else {
                    un7.c(context2, this.b, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new x15(strArr2, sn7Var, (byte) 11), true, new jc((byte) 10), dVar.getResourceProvider());
                    break;
                }
                break;
            case 8:
                TLObject tLObject4 = (TLObject) obj5;
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) obj4;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) obj;
                os1 os1Var = (os1) obj3;
                ui5 ui5Var = (ui5) obj2;
                if (tLObject4 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject4;
                    na7.q1(i).b4(tL_photos_photo.users, false);
                    TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(y6c.h(i).n));
                    TLRPC.Photo photo = tL_photos_photo.photo;
                    if ((photo instanceof TLRPC.TL_photo) && V1 != null) {
                        TLRPC.PhotoSize w = ba4.w(photo.sizes, 100, false, null, false);
                        TLRPC.PhotoSize w2 = ba4.w(tL_photos_photo.photo.sizes, 1000, false, null, false);
                        if (w == null || photoSize == null || photoSize.location == null) {
                            z2 = true;
                        } else {
                            ba4.G(i);
                            File J = ba4.J(w, null, true, true);
                            ba4.G(i);
                            ba4.J(photoSize.location, null, true, true).renameTo(J);
                            StringBuilder sb = new StringBuilder();
                            sb.append(photoSize.location.volume_id);
                            sb.append("_");
                            String l = de9.l(sb, photoSize.location.local_id, "@50_50");
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(w.location.volume_id);
                            sb2.append("_");
                            z2 = true;
                            fl5.z().O(l, de9.l(sb2, w.location.local_id, "@50_50"), gl5.l(i, 1, V1));
                        }
                        if (w2 != null && photoSize2 != null && photoSize2.location != null) {
                            ba4.G(i);
                            File J2 = ba4.J(w2, null, z2, z2);
                            ba4.G(i);
                            ba4.J(photoSize2.location, null, z2, z2).renameTo(J2);
                        }
                        d68.a(tL_photos_photo.photo, V1, false);
                        y6c.h(i).v(V1);
                        y6c.h(i).u(z2);
                        os1Var.run();
                        u21.b0(ui5Var.getLastFragment()).V(Collections.singletonList(V1), gl.S2(k96.M0(2131754216, null)), gl.N2(k96.M0(2131754217, null), -1, 0, new on7(i, ui5Var, (byte) 2), null), null).j();
                        break;
                    }
                }
                break;
            case 9:
                gf8 gf8Var = (gf8) obj5;
                TLObject tLObject5 = (TLObject) obj;
                ArrayList arrayList3 = (ArrayList) obj3;
                TLRPC.PollAnswerVoters pollAnswerVoters = (TLRPC.PollAnswerVoters) obj2;
                cf8 cf8Var = gf8Var.m1;
                ArrayList arrayList4 = gf8Var.w1;
                af8 af8Var = gf8Var.l1;
                ArrayList arrayList5 = gf8Var.z1;
                arrayList5.remove(((Integer[]) obj4)[i]);
                if (tLObject5 != null) {
                    TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject5;
                    na7.q1(gf8Var.a).b4(tL_messages_votesList.users, false);
                    if (!tL_messages_votesList.votes.isEmpty()) {
                        arrayList3.add(new ff8(tL_messages_votesList, pollAnswerVoters.option));
                    }
                    if (arrayList5.isEmpty()) {
                        int size3 = arrayList3.size();
                        boolean z5 = false;
                        for (int i8 = 0; i8 < size3; i8++) {
                            ff8 ff8Var = (ff8) arrayList3.get(i8);
                            int size4 = arrayList4.size();
                            int i9 = 0;
                            while (true) {
                                if (i9 < size4) {
                                    ff8 ff8Var2 = (ff8) arrayList4.get(i9);
                                    if (Arrays.equals(ff8Var.d, ff8Var2.d)) {
                                        ff8Var2.c = ff8Var.c;
                                        if (ff8Var2.a != ff8Var.a || ff8Var2.b.size() != ff8Var.b.size()) {
                                            z5 = true;
                                        }
                                        ff8Var2.a = ff8Var.a;
                                        ff8Var2.b = ff8Var.b;
                                    } else {
                                        i9++;
                                    }
                                }
                            }
                        }
                        gf8Var.F1 = false;
                        if (af8Var != null) {
                            if (gf8Var.B0 != 0 || gf8Var.H != null || z5) {
                                if (z5) {
                                    gf8Var.F0();
                                }
                                cf8Var.X(false);
                                break;
                            } else {
                                int childCount = af8Var.getChildCount();
                                ArrayList arrayList6 = new ArrayList();
                                for (int i10 = 0; i10 < childCount; i10++) {
                                    View childAt = af8Var.getChildAt(i10);
                                    if (childAt instanceof PollVotesAlert$UserCell) {
                                        View F = af8Var.F(childAt);
                                        s49 T = F == null ? null : af8Var.T(F);
                                        if (T != null) {
                                            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                                            pollVotesAlert$UserCell.E = arrayList6;
                                            pollVotesAlert$UserCell.setEnabled(true);
                                            cf8Var.y(T);
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
                                gf8Var.F1 = false;
                                break;
                            }
                        }
                    }
                } else {
                    gf8Var.dismiss();
                    break;
                }
                break;
            case 10:
                d dVar2 = (d) obj4;
                List<Purchase> list = (List) obj;
                nfd nfdVar = (nfd) obj3;
                gi8 gi8Var = (gi8) obj2;
                if (((fi0) obj5).a == 0) {
                    kv1 kv1Var = new kv1(dVar2, (byte) 5);
                    int i11 = this.b;
                    if (list != null && !list.isEmpty() && !y6c.h(i11).p()) {
                        for (Purchase purchase : list) {
                            if (purchase.c().contains("telegram_premium")) {
                                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                tL_dataJSON.data = purchase.a;
                                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                                tL_inputStorePaymentPremiumSubscription.restore = true;
                                if (nfdVar != null) {
                                    tL_inputStorePaymentPremiumSubscription.upgrade = true;
                                }
                                tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                                ConnectionsManager.getInstance(i11).sendRequest(tL_payments_assignPlayMarketTransaction, new ae(i11, kv1Var, dVar2, tL_payments_assignPlayMarketTransaction), 66);
                                break;
                            }
                        }
                    }
                    ci0.h().c("telegram_premium", new gw(kv1Var, (byte) 12));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (nfdVar != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_payments_canPurchaseStore, new ot(dVar2, tL_inputStorePaymentPremiumSubscription2, gi8Var, nfdVar, i11, tL_payments_canPurchaseStore));
                    break;
                }
                break;
            case 11:
                TLObject tLObject6 = (TLObject) obj4;
                fx0[] fx0VarArr = (fx0[]) obj;
                wjb wjbVar2 = (wjb) obj2;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) obj3;
                ((u41) obj5).setLoading(false);
                if (tLObject6 instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject6;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new u21(fx0VarArr[0].F, wjbVar2).t(k96.M0(2131743640, null), null).k(false);
                        break;
                    } else {
                        final long j = tL_starsSubscriptionPricing.amount;
                        gta.v(i, false).h0(tL_messages_checkChatInvite.hash, chatInvite, new i8c() { // from class: ita
                            @Override // i8c
                            public final void a(Object obj8, Object obj9) {
                                Long l2 = (Long) obj9;
                                if (!"paid".equals((String) obj8) || l2.longValue() == 0) {
                                    return;
                                }
                                gl.c3(new va2((Object) l2, i, j, (byte) 6));
                            }
                        });
                        break;
                    }
                } else {
                    new u21(fx0VarArr[0].F, wjbVar2).t(k96.M0(2131748721, null), null).k(false);
                    break;
                }
            default:
                ((x3b) obj5).c((TLObject) obj4, this.e, (ArrayList) obj3, (boolean[]) obj2, this.b);
                break;
        }
    }

    public /* synthetic */ jf(x3b x3bVar, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i) {
        this.a = (byte) 12;
        this.c = x3bVar;
        this.d = tLObject;
        this.e = obj;
        this.f = arrayList;
        this.h = zArr;
        this.b = i;
    }

    public /* synthetic */ jf(KeyEvent.Callback callback, Object obj, int i, Object obj2, Object obj3, TLObject tLObject, byte b) {
        this.a = b;
        this.c = callback;
        this.d = obj;
        this.b = i;
        this.e = obj2;
        this.f = obj3;
        this.h = tLObject;
    }

    public /* synthetic */ jf(Object obj, int i, TLObject tLObject, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = tLObject;
        this.e = obj2;
        this.f = obj3;
        this.h = obj4;
    }

    public /* synthetic */ jf(Object obj, Object obj2, Object obj3, int i, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
        this.f = obj4;
        this.h = obj5;
    }

    public /* synthetic */ jf(Object obj, Object obj2, Object obj3, Object obj4, int i, Object obj5, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i;
        this.h = obj5;
    }

    public /* synthetic */ jf(TLObject tLObject, int i, hd hdVar, Context context, wjb wjbVar, fa5 fa5Var) {
        this.a = (byte) 4;
        this.c = tLObject;
        this.b = i;
        this.d = hdVar;
        this.e = context;
        this.h = wjbVar;
        this.f = fa5Var;
    }
}
