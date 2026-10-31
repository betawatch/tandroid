package m4;

import ag.d3;
import ag.f3;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.android.billingclient.api.Purchase;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.ad;
import org.telegram.messenger.b8;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.hc;
import org.telegram.messenger.hs;
import org.telegram.messenger.ic;
import org.telegram.messenger.j20;
import org.telegram.messenger.jj;
import org.telegram.messenger.u3;
import org.telegram.messenger.ui;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.vp;
import org.telegram.messenger.yx;
import org.telegram.messenger.zc;
import org.telegram.messenger.zr;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.PollVotesAlert$UserCell;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.k50;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.vg;
import org.telegram.ui.ch0;
import org.telegram.ui.e01;
import org.telegram.ui.ep0;
import org.telegram.ui.f4;
import org.telegram.ui.fu0;
import org.telegram.ui.hj0;
import org.telegram.ui.j9;
import org.telegram.ui.jj0;
import org.telegram.ui.l50;
import org.telegram.ui.m60;
import org.telegram.ui.ns;
import org.telegram.ui.ra1;
import org.telegram.ui.rh;
import org.telegram.ui.s31;
import rh.e6;
import th.l6;
import v7.t6;
import w7.y5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ a1(KeyEvent.Callback callback, Object obj, int i10, Object obj2, Object obj3, TLObject tLObject, int i11) {
        this.a = i11;
        this.c = callback;
        this.d = obj;
        this.b = i10;
        this.e = obj2;
        this.f = obj3;
        this.h = tLObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:279:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0896  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean booleanValue;
        int i10;
        int i11 = 24;
        int i12 = 4;
        TLRPC.GroupCall groupCall = null;
        int i13 = 1;
        char c10 = 1;
        char c11 = 1;
        char c12 = 1;
        char c13 = 1;
        char c14 = 1;
        switch (this.a) {
            case 0:
                j1 j1Var = (j1) this.c;
                w wVar = (w) this.d;
                p1 p1Var = (p1) this.e;
                String str = p1Var.b;
                f0 f0Var = (f0) this.f;
                int i14 = this.b;
                m mVar = (m) this.h;
                xa.n nVar = j1Var.b;
                if (nVar.L(wVar)) {
                    try {
                        e d = e.d(p1Var);
                        Object obj = d.g;
                        int i15 = d.b;
                        if (!d.b()) {
                            e2.a.l("MediaSessionStub", "Can't execute predefined custom command: " + str);
                            j1.R0(f0Var, wVar, i14, new t1(-6));
                            break;
                        } else {
                            p1 p1Var2 = d.a;
                            if (p1Var2 != null) {
                                t6.p(p1Var2.a == 40010);
                                j1Var.J0(mVar, i14, null, 40010, new z0(new d1(d), c13 == true ? 1 : 0));
                                break;
                            } else {
                                n1 n1Var = f0Var.t;
                                if (i15 == 1) {
                                    if (obj != null) {
                                        booleanValue = ((Boolean) obj).booleanValue();
                                    } else if (!n1Var.t()) {
                                        booleanValue = true;
                                    }
                                    if (!booleanValue) {
                                        j1Var.O0(wVar, i14);
                                    } else if (i15 == 31) {
                                        obj.getClass();
                                        j1Var.Q0(wVar, i14, 31, new z0(new ag.m(23, new ag.w0(c12 == true ? 1 : 0, (b2.p0) obj, c11 == true ? 1 : 0), new v0(11)), c10 == true ? 1 : 0));
                                    } else {
                                        j1Var.Q0(wVar, i14, i15, j1.S0(new d1(d)));
                                    }
                                    nVar.u(wVar);
                                    break;
                                }
                                booleanValue = false;
                                if (!booleanValue) {
                                }
                                nVar.u(wVar);
                            }
                        }
                    } catch (RuntimeException e) {
                        e2.a.m("MediaSessionStub", "Failed to convert predefined custom command: " + str, e);
                        j1.R0(f0Var, wVar, i14, new t1(-3));
                        return;
                    }
                }
                break;
            case 1:
                u3 u3Var = (u3) this.c;
                int i16 = this.b;
                TLObject tLObject = (TLObject) this.d;
                org.telegram.messenger.voip.d0 d0Var = (org.telegram.messenger.voip.d0) this.e;
                ArrayList arrayList = (ArrayList) this.f;
                HashSet hashSet = (HashSet) this.h;
                HashSet hashSet2 = u3Var.n;
                ArrayList arrayList2 = u3Var.e;
                if (u3Var.G.remove(Integer.valueOf(i16))) {
                    if (tLObject != null) {
                        TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject;
                        vp.r1(u3Var.C.a).V3(groupparticipants.users, false);
                        vp.r1(u3Var.C.a).P3(groupparticipants.chats, false);
                        int size = groupparticipants.participants.size();
                        for (int i17 = 0; i17 < size; i17++) {
                            TLRPC.GroupCallParticipant groupCallParticipant = groupparticipants.participants.get(i17);
                            long C1 = jj.C1(groupCallParticipant.peer);
                            TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) u3Var.d.f(C1);
                            if (groupCallParticipant2 != null) {
                                arrayList2.remove(groupCallParticipant2);
                                u3Var.n(groupCallParticipant2, false);
                            }
                            u3Var.d.k(groupCallParticipant, C1);
                            arrayList2.add(groupCallParticipant);
                            u3Var.n(groupCallParticipant, true);
                            if (hashSet2.contains(Long.valueOf(C1))) {
                                Long valueOf = Long.valueOf(C1);
                                hashSet2.remove(valueOf);
                                u3Var.j.remove(valueOf);
                            }
                        }
                        if (u3Var.b.participants_count < u3Var.d.m()) {
                            u3Var.b.participants_count = u3Var.d.m();
                        }
                        u3Var.z();
                        zs.f(u3Var.C.a).k(zs.w2, Long.valueOf(u3Var.c), Long.valueOf(u3Var.b.id), Boolean.FALSE);
                        if (d0Var != null) {
                            ((VoIPService) d0Var.c).lambda$createGroupInstance$69(d0Var.b, (int[]) d0Var.d, arrayList);
                        } else {
                            u3Var.w();
                        }
                    }
                    hashSet.removeAll(arrayList);
                    break;
                }
                break;
            case 2:
                cd cdVar = (cd) this.c;
                int i18 = this.b;
                zc zcVar = (zc) this.d;
                TLRPC.TL_langPackDifference tL_langPackDifference = (TLRPC.TL_langPackDifference) this.e;
                HashMap hashMap = (HashMap) this.f;
                Runnable runnable = (Runnable) this.h;
                if (i18 == 0) {
                    zcVar.h = tL_langPackDifference.version;
                } else {
                    zcVar.i = tL_langPackDifference.version;
                }
                cdVar.X0();
                try {
                    if (cdVar.B == zcVar) {
                        String[] split = !TextUtils.isEmpty(zcVar.f) ? zcVar.f.split("_") : !TextUtils.isEmpty(zcVar.e) ? zcVar.e.split("_") : zcVar.c.split("_");
                        Locale locale = split.length == 1 ? new Locale(split[0]) : new Locale(split[0], split[1]);
                        cdVar.C = zcVar.c;
                        SharedPreferences.Editor edit = vp.d1().edit();
                        edit.putString("language", zcVar.b());
                        edit.commit();
                        ii.a aVar = new ii.a();
                        aVar.a(hashMap);
                        cdVar.V = new ii.b(aVar);
                        cdVar.W = cd.h(hashMap);
                        cdVar.y = locale;
                        cdVar.B = zcVar;
                        if (!TextUtils.isEmpty(zcVar.f)) {
                            cdVar.A = (ad) cdVar.x.get(cdVar.B.f);
                        }
                        if (cdVar.A == null) {
                            ad adVar = (ad) cdVar.x.get(cdVar.y.getLanguage());
                            cdVar.A = adVar;
                            if (adVar == null) {
                                cdVar.A = (ad) cdVar.x.get("en");
                            }
                        }
                        cdVar.D = true;
                        Locale.setDefault(cdVar.y);
                        Configuration configuration = new Configuration();
                        configuration.locale = cdVar.y;
                        org.telegram.messenger.w0.b.getResources().updateConfiguration(configuration, org.telegram.messenger.w0.b.getResources().getDisplayMetrics());
                        cdVar.D = false;
                        e01.s = false;
                    } else {
                        f8.b("saveRemoteLocaleStrings: currentLocaleInfo != localeInfo, do nothing");
                    }
                    i10 = 0;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    i10 = 0;
                    cdVar.D = false;
                }
                cdVar.V0();
                zs.e().k(zs.x4, new Object[i10]);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 3:
                ui uiVar = (ui) this.c;
                boolean[] zArr = (boolean[]) this.d;
                ArrayList arrayList3 = (ArrayList) this.e;
                Context context = (Context) this.f;
                k2 k2Var = (k2) this.h;
                int i19 = this.b;
                uiVar.getClass();
                if (!zArr[0]) {
                    zArr[0] = true;
                    for (int i20 = 0; i20 < arrayList3.size(); i20++) {
                        uiVar.h2(context, 0, k2Var, null, true, (TLObject) arrayList3.get(i20), ((TLRPC.TL_messages_stickerSet) arrayList3.get(i20)).set, null, i19, false);
                    }
                    break;
                }
                break;
            case 4:
                m60 m60Var = (m60) this.c;
                f4 f4Var = (f4) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                TLObject tLObject2 = (TLObject) this.f;
                int i21 = this.b;
                org.telegram.ui.c1 c1Var = (org.telegram.ui.c1) this.h;
                m60Var.r = false;
                if (!f4Var.e.isEmpty()) {
                    if (tL_error == null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                        if (tL_contacts_resolvedPeer.chats.isEmpty()) {
                            c1Var.a(4, false);
                            break;
                        } else {
                            vp.r1(i21).V3(tL_contacts_resolvedPeer.users, false);
                            vp.r1(i21).P3(tL_contacts_resolvedPeer.chats, false);
                            hs.a0(i21).m1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                            TLRPC.Chat chat = tL_contacts_resolvedPeer.chats.get(0);
                            m60Var.n = chat;
                            if (!chat.left || chat.kicked) {
                                c1Var.a(4, false);
                                break;
                            } else {
                                c1Var.a(0, false);
                                break;
                            }
                        }
                    } else {
                        c1Var.a(4, false);
                        break;
                    }
                }
                break;
            case 5:
                TLObject tLObject3 = (TLObject) this.c;
                int i22 = this.b;
                x1 x1Var = (x1) this.d;
                Context context2 = (Context) this.e;
                p6 p6Var = (p6) this.f;
                l50 l50Var = (l50) this.h;
                if (tLObject3 instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject3;
                    vp.r1(i22).V3(updates.users, false);
                    vp.r1(i22).P3(updates.chats, false);
                    ArrayList z02 = vp.z0(updates, TL_update.TL_updateGroupCall.class);
                    int size2 = z02.size();
                    int i23 = 0;
                    while (i23 < size2) {
                        Object obj2 = z02.get(i23);
                        i23++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj2).call;
                    }
                    x1Var.dismiss();
                    if (groupCall != null) {
                        TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                        tL_inputGroupCall.id = groupCall.id;
                        tL_inputGroupCall.access_hash = groupCall.access_hash;
                        j9.m0(context2, i22, tL_inputGroupCall, groupCall.invite_link, p6Var, true, true);
                        org.telegram.messenger.i0.g3(l50Var);
                        break;
                    }
                } else if (tLObject3 instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject3;
                    vp.r1(i22).V3(groupcall.users, false);
                    vp.r1(i22).P3(groupcall.chats, false);
                    TL_phone.exportGroupCallInvite exportgroupcallinvite = new TL_phone.exportGroupCallInvite();
                    TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
                    exportgroupcallinvite.call = tL_inputGroupCall2;
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall2.id = groupCall2.id;
                    tL_inputGroupCall2.access_hash = groupCall2.access_hash;
                    ConnectionsManager.getInstance(i22).sendRequest(exportgroupcallinvite, new yx(x1Var, context2, i22, exportgroupcallinvite, p6Var, l50Var));
                    break;
                } else {
                    x1Var.dismiss();
                    org.telegram.messenger.i0.g3(l50Var);
                    break;
                }
                break;
            case 6:
                new s31((Context) this.c, (TLRPC.Chat) this.d, (TLRPC.User) this.e, new d3(this.b, (zr) this.f, i11), (p6) this.h).show();
                break;
            case 7:
                f9.a((f9) this.c, (Runnable[]) this.d, (Bitmap) this.e, (k50) this.f, this.b, (y5[]) this.h);
                break;
            case 8:
                tf0 tf0Var = (tf0) this.c;
                Integer[] numArr = (Integer[]) this.d;
                int i24 = this.b;
                TLObject tLObject4 = (TLObject) this.e;
                ArrayList arrayList4 = (ArrayList) this.f;
                TLRPC.PollAnswerVoters pollAnswerVoters = (TLRPC.PollAnswerVoters) this.h;
                pf0 pf0Var = tf0Var.j1;
                ArrayList arrayList5 = tf0Var.t1;
                nf0 nf0Var = tf0Var.i1;
                ArrayList arrayList6 = tf0Var.w1;
                arrayList6.remove(numArr[i24]);
                if (tLObject4 != null) {
                    TLRPC.TL_messages_votesList tL_messages_votesList = (TLRPC.TL_messages_votesList) tLObject4;
                    vp.r1(tf0Var.a).V3(tL_messages_votesList.users, false);
                    if (!tL_messages_votesList.votes.isEmpty()) {
                        arrayList4.add(new sf0(tL_messages_votesList, pollAnswerVoters.option));
                    }
                    if (arrayList6.isEmpty()) {
                        int size3 = arrayList4.size();
                        boolean z10 = false;
                        for (int i25 = 0; i25 < size3; i25++) {
                            sf0 sf0Var = (sf0) arrayList4.get(i25);
                            int size4 = arrayList5.size();
                            int i26 = 0;
                            while (true) {
                                if (i26 < size4) {
                                    sf0 sf0Var2 = (sf0) arrayList5.get(i26);
                                    if (Arrays.equals(sf0Var.d, sf0Var2.d)) {
                                        sf0Var2.c = sf0Var.c;
                                        if (sf0Var2.a != sf0Var.a || sf0Var2.b.size() != sf0Var.b.size()) {
                                            z10 = true;
                                        }
                                        sf0Var2.a = sf0Var.a;
                                        sf0Var2.b = sf0Var.b;
                                    } else {
                                        i26++;
                                    }
                                }
                            }
                        }
                        tf0Var.C1 = false;
                        if (nf0Var != null) {
                            if (tf0Var.A0 != 0 || tf0Var.G != null || z10) {
                                if (z10) {
                                    tf0Var.L0();
                                }
                                pf0Var.X(false);
                                break;
                            } else {
                                int childCount = nf0Var.getChildCount();
                                ArrayList arrayList7 = new ArrayList();
                                for (int i27 = 0; i27 < childCount; i27++) {
                                    View childAt = nf0Var.getChildAt(i27);
                                    if (childAt instanceof PollVotesAlert$UserCell) {
                                        View F = nf0Var.F(childAt);
                                        s4.c1 T = F == null ? null : nf0Var.T(F);
                                        if (T != null) {
                                            PollVotesAlert$UserCell pollVotesAlert$UserCell = (PollVotesAlert$UserCell) childAt;
                                            pollVotesAlert$UserCell.D = arrayList7;
                                            pollVotesAlert$UserCell.setEnabled(true);
                                            pf0Var.y(T);
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
                                tf0Var.C1 = false;
                                break;
                            }
                        }
                    }
                } else {
                    tf0Var.dismiss();
                    break;
                }
                break;
            case 9:
                ns.b0((ns) this.c, (TLRPC.FileLocation) this.d, (TLRPC.InputFile) this.e, (TLObject) this.f, (TLRPC.FileLocation) this.h, this.b);
                break;
            case 10:
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) this.c;
                String[] strArr = (String[]) this.d;
                Context context3 = (Context) this.e;
                int i28 = this.b;
                hj0 hj0Var = (hj0) this.f;
                k2 k2Var2 = (k2) this.h;
                if (tL_urlAuthResultRequest.match_codes.isEmpty() || !TextUtils.isEmpty(strArr[0])) {
                    hj0Var.run();
                    break;
                } else {
                    jj0.c(context3, i28, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new vg(i11, strArr, hj0Var), true, new f3(13), k2Var2.getResourceProvider());
                    break;
                }
            case 11:
                c5.g gVar = (c5.g) this.c;
                k2 k2Var3 = (k2) this.d;
                List<Purchase> list = (List) this.e;
                int i29 = this.b;
                ba.a aVar2 = (ba.a) this.f;
                fu0 fu0Var = (fu0) this.h;
                if (gVar.a == 0) {
                    ch0 ch0Var = new ch0(c14 == true ? 1 : 0, k2Var3);
                    if (list != null && !list.isEmpty() && !d20.i(i29).q()) {
                        for (Purchase purchase : list) {
                            if (purchase.b().contains("telegram_premium")) {
                                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                                tL_dataJSON.data = purchase.a;
                                TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                                tL_inputStorePaymentPremiumSubscription.restore = true;
                                if (aVar2 != null) {
                                    tL_inputStorePaymentPremiumSubscription.upgrade = true;
                                }
                                tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentPremiumSubscription;
                                ConnectionsManager.getInstance(i29).sendRequest(tL_payments_assignPlayMarketTransaction, new org.telegram.ui.b0(i29, ch0Var, k2Var3, tL_payments_assignPlayMarketTransaction), 66);
                                break;
                            }
                        }
                    }
                    org.telegram.messenger.u1.i().d("telegram_premium", new org.telegram.ui.f3(ch0Var, i12));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    TLRPC.TL_inputStorePaymentPremiumSubscription tL_inputStorePaymentPremiumSubscription2 = new TLRPC.TL_inputStorePaymentPremiumSubscription();
                    if (aVar2 != null) {
                        tL_inputStorePaymentPremiumSubscription2.upgrade = true;
                    }
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumSubscription2;
                    ConnectionsManager.getInstance(i29).sendRequest(tL_payments_canPurchaseStore, new yx(k2Var3, tL_inputStorePaymentPremiumSubscription2, fu0Var, aVar2, i29, tL_payments_canPurchaseStore, 5));
                    break;
                }
                break;
            case 12:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                int i30 = this.b;
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.e;
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                if (tLObject5 instanceof TLRPC.TL_boolTrue) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "allowed");
                        org.telegram.ui.web.z0.w(i30, v0Var, x0Var, "write_access_requested", jSONObject);
                        break;
                    } catch (Exception e10) {
                        f8.g(e10, true);
                        return;
                    }
                } else if (tL_error2 != null) {
                    z0Var.Y(tL_error2.text);
                    break;
                } else {
                    String[] strArr2 = {"cancelled"};
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z0Var.getContext());
                    alertDialog$Builder.a.R = cd.L0(2131752898, null);
                    alertDialog$Builder.a.T = cd.L0(2131752899, null);
                    alertDialog$Builder.k(cd.L0(2131752909, null), new ep0(29, z0Var, strArr2));
                    alertDialog$Builder.h(cd.L0(2131752904, null), new ra1(7));
                    z0Var.X(3, alertDialog$Builder.a, new org.telegram.ui.web.u(strArr2, i30, v0Var, x0Var, 1));
                    break;
                }
            case 13:
                TLObject tLObject6 = (TLObject) this.c;
                int i31 = this.b;
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) this.d;
                TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) this.e;
                rh rhVar = (rh) this.f;
                z4 z4Var = (z4) this.h;
                if (tLObject6 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject6;
                    vp.r1(i31).V3(tL_photos_photo.users, false);
                    TLRPC.User Z1 = vp.r1(i31).Z1(Long.valueOf(d20.i(i31).n));
                    TLRPC.Photo photo = tL_photos_photo.photo;
                    if ((photo instanceof TLRPC.TL_photo) && Z1 != null) {
                        TLRPC.PhotoSize w9 = b8.w(photo.sizes, 100, false, null, false);
                        TLRPC.PhotoSize w10 = b8.w(tL_photos_photo.photo.sizes, 1000, false, null, false);
                        if (w9 != null && photoSize != null && photoSize.location != null) {
                            b8.G(i31);
                            File K = b8.K(w9, null, true, true);
                            b8.G(i31);
                            b8.K(photoSize.location, null, true, true).renameTo(K);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(photoSize.location.volume_id);
                            sb2.append("_");
                            String p5 = a1.g.p(sb2, photoSize.location.local_id, "@50_50");
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(w9.location.volume_id);
                            sb3.append("_");
                            hc.D().S(p5, a1.g.p(sb3, w9.location.local_id, "@50_50"), ic.l(i31, 1, Z1));
                        }
                        if (w10 != null && photoSize2 != null && photoSize2.location != null) {
                            b8.G(i31);
                            File K2 = b8.K(w10, null, true, true);
                            b8.G(i31);
                            b8.K(photoSize2.location, null, true, true).renameTo(K2);
                        }
                        rf.z.a(tL_photos_photo.photo, Z1, false);
                        d20.i(i31).w(Z1);
                        d20.i(i31).v(true);
                        rhVar.run();
                        cc.a0(z4Var.getLastFragment()).V(Collections.singletonList(Z1), org.telegram.messenger.i0.W2(cd.L0(2131754219, null)), org.telegram.messenger.i0.T2(cd.L0(2131754220, null), new org.telegram.utils.twidget.v(i31, z4Var, i13)), null).j();
                        break;
                    }
                }
                break;
            case 14:
                vh.d dVar = (vh.d) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                z2[] z2VarArr = (z2[]) this.e;
                p6 p6Var2 = (p6) this.f;
                final int i32 = this.b;
                TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = (TLRPC.TL_messages_checkChatInvite) this.h;
                dVar.setLoading(false);
                if (tLObject7 instanceof TLRPC.ChatInvite) {
                    TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject7;
                    TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                    if (tL_starsSubscriptionPricing == null) {
                        new cc(z2VarArr[0].E, p6Var2).t(cd.L0(2131743904, null), null).k(false);
                        break;
                    } else {
                        final long j10 = tL_starsSubscriptionPricing.amount;
                        e6.y(i32, false).h0(tL_messages_checkChatInvite.hash, chatInvite, new j20() { // from class: rh.g6
                            @Override // org.telegram.messenger.j20
                            public final void a(Object obj3, Object obj4) {
                                Long l4 = (Long) obj4;
                                if (!"paid".equals((String) obj3) || l4.longValue() == 0) {
                                    return;
                                }
                                org.telegram.messenger.i0.g3(new dd(l4, i32, j10, 7));
                            }
                        });
                        break;
                    }
                } else {
                    new cc(z2VarArr[0].E, p6Var2).t(cd.L0(2131748923, null), null).k(false);
                    break;
                }
            default:
                l6.a((l6) this.c, (TLObject) this.d, this.e, (ArrayList) this.f, (boolean[]) this.h, this.b);
                break;
        }
    }

    public /* synthetic */ a1(Object obj, int i10, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
    }

    public /* synthetic */ a1(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
        this.f = obj4;
        this.h = obj5;
    }

    public /* synthetic */ a1(Object obj, Object obj2, Object obj3, Object obj4, int i10, Object obj5, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i10;
        this.h = obj5;
    }

    public /* synthetic */ a1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.h = obj5;
        this.b = i10;
    }
}
