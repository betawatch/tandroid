package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q20(KeyEvent.Callback callback, Object obj, TLObject tLObject, TLRPC.TL_error tL_error, int i7) {
        this.a = i7;
        this.c = callback;
        this.e = obj;
        this.d = tLObject;
        this.b = tL_error;
    }

    private final void a() {
        org.telegram.ui.gd0 gd0Var = (org.telegram.ui.gd0) this.c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
        Bundle bundle = (Bundle) this.e;
        TLObject tLObject = (TLObject) this.d;
        org.telegram.ui.de0 de0Var = gd0Var.v0;
        gd0Var.g0 = false;
        if (tL_error == null) {
            gd0Var.r0 = bundle;
            if (tLObject instanceof TLRPC.TL_auth_sentCode) {
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                gd0Var.s0 = tL_auth_sentCode;
                TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                    gd0Var.j0 = 17;
                } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                    gd0Var.j0 = 16;
                }
                de0Var.y1(bundle, tL_auth_sentCode, true);
            } else if (tLObject instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
                TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) tLObject;
                bundle.putString("product", tL_auth_sentCodePaymentRequired.store_product);
                bundle.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
                bundle.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
                bundle.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
                bundle.putString("currency", tL_auth_sentCodePaymentRequired.currency);
                bundle.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
                bundle.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
                de0Var.M1(18, true, bundle, true);
            }
        } else {
            String str = tL_error.text;
            if (str != null) {
                if (str.contains("PHONE_NUMBER_INVALID")) {
                    de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131748986, null));
                } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                    de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131748990, null));
                } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                    gd0Var.c(true);
                    de0Var.M1(0, true, null, true);
                    de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131752009, null));
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131750670, null));
                } else if (tL_error.code != -1000) {
                    String N0 = org.telegram.messenger.hd.N0(2131745875, null);
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.Cells.c0.u(null, 2131751093, sb2, "\n");
                    sb2.append(tL_error.text);
                    de0Var.D1(N0, sb2.toString());
                }
            }
        }
        gd0Var.y(false);
    }

    private final void b() {
        int i7;
        org.telegram.ui.ld0 ld0Var = (org.telegram.ui.ld0) this.c;
        f5.m mVar = (f5.m) this.b;
        org.telegram.ui.r3 r3Var = (org.telegram.ui.r3) this.d;
        TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = (TLRPC.TL_inputStorePaymentAuthCode) this.e;
        org.telegram.ui.de0 de0Var = ld0Var.w;
        de0Var.e = true;
        org.telegram.messenger.r1.i().d(mVar.c, new org.telegram.ui.f3(r3Var, 4));
        org.telegram.messenger.r1.i().h = new org.telegram.ui.kd0(r3Var, 0);
        org.telegram.messenger.r1 i10 = org.telegram.messenger.r1.i();
        Activity parentActivity = de0Var.getParentActivity();
        i7 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
        org.telegram.messenger.c a10 = org.telegram.messenger.c.a(i7);
        wf.b bVar = new wf.b(17, false);
        bVar.R(mVar);
        i10.l(parentActivity, a10, tL_inputStorePaymentAuthCode, Collections.singletonList(bVar.q()));
    }

    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r92;
        int b10;
        a0.h hVar;
        ArrayList arrayList;
        a0.h hVar2;
        TLRPC.StickerSet stickerSet;
        org.telegram.messenger.c cVar;
        org.telegram.messenger.c cVar2;
        boolean z10;
        String a02;
        int i7;
        int i10;
        int i11 = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.b;
        Object obj4 = this.c;
        int i12 = 0;
        switch (i11) {
            case 0:
                v20 v20Var = (v20) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) obj;
                nv0 nv0Var = v20Var.u1;
                a0.h hVar3 = v20Var.V1;
                a0.h hVar4 = v20Var.W1;
                ArrayList arrayList2 = v20Var.S1;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    org.telegram.messenger.np.u1(v20Var.a).f4(tL_channels_channelParticipants.users, false);
                    org.telegram.messenger.np.u1(v20Var.a).Z3(tL_channels_channelParticipants.chats, false);
                    long e10 = org.telegram.messenger.k10.i(v20Var.a).e();
                    int i13 = 0;
                    while (true) {
                        if (i13 < tL_channels_channelParticipants.participants.size()) {
                            if (org.telegram.messenger.gj.B1(tL_channels_channelParticipants.participants.get(i13).peer) == e10) {
                                tL_channels_channelParticipants.participants.remove(i13);
                            } else {
                                i13++;
                            }
                        }
                    }
                    v20Var.P1--;
                    if (tL_channels_getParticipants.filter instanceof TLRPC.TL_channelParticipantsContacts) {
                        arrayList = v20Var.T1;
                        hVar = hVar4;
                    } else {
                        hVar = hVar3;
                        arrayList = arrayList2;
                    }
                    arrayList.clear();
                    arrayList.addAll(tL_channels_channelParticipants.participants);
                    int size = tL_channels_channelParticipants.participants.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i14);
                        hVar.k(channelParticipant, org.telegram.messenger.gj.B1(channelParticipant.peer));
                    }
                    int size2 = arrayList2.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        long B1 = org.telegram.messenger.gj.B1(((TLRPC.ChannelParticipant) arrayList2.get(i15)).peer);
                        boolean z11 = hVar4.f(B1) != null || ((hVar2 = v20Var.Z1) != null && hVar2.h(B1) >= 0);
                        TLRPC.User c22 = org.telegram.messenger.np.u1(v20Var.a).c2(Long.valueOf(B1));
                        if ((c22 != null && c22.bot) || org.telegram.messenger.p10.y(c22)) {
                            z11 = true;
                        }
                        if (z11) {
                            arrayList2.remove(i15);
                            hVar3.l(B1);
                            i15--;
                            size2--;
                        }
                        i15++;
                    }
                    try {
                        if (v20Var.R1.participants_count <= 200) {
                            Collections.sort(arrayList, new org.telegram.ui.vp(v20Var, ConnectionsManager.getInstance(v20Var.a).getCurrentTime(), 1));
                        }
                    } catch (Exception e11) {
                        r92 = 1;
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                r92 = 1;
                if (v20Var.P1 <= 0) {
                    v20Var.X1 = false;
                    v20Var.Y1 = r92;
                    if (v20Var.l2 == r92) {
                        b10 = r92;
                    } else {
                        dk0 dk0Var = v20Var.q1;
                        b10 = dk0Var != null ? dk0Var.b() - r92 : 0;
                    }
                    v20Var.P0(b10);
                    if (arrayList2.isEmpty()) {
                        v20Var.c2 = r92;
                        v20Var.S0();
                    }
                }
                v20Var.U0();
                dk0 dk0Var2 = v20Var.q1;
                if (dk0Var2 != null) {
                    dk0Var2.f();
                    if (nv0Var != null && v20Var.q1.b() == 0 && v20Var.Y1) {
                        nv0Var.e(false, true);
                        break;
                    }
                }
                break;
            case 1:
                r70 r70Var = (r70) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj2;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) obj;
                org.telegram.ui.ActionBar.g2 g2Var = r70Var.o1;
                if (g2Var != null && g2Var.getParentActivity() != null) {
                    if (tL_error2 != null) {
                        "USER_ALREADY_PARTICIPANT".equals(tL_error2.text);
                        c5.c0(r70Var.a, tL_error2, g2Var, tL_messages_importChatInvite, new Object[0]);
                        break;
                    } else if (updates != null && !updates.chats.isEmpty()) {
                        TLRPC.Chat chat = updates.chats.get(0);
                        chat.left = false;
                        chat.kicked = false;
                        org.telegram.messenger.np.u1(r70Var.a).f4(updates.users, false);
                        org.telegram.messenger.np.u1(r70Var.a).Z3(updates.chats, false);
                        long j3 = chat.id;
                        boolean z12 = !org.telegram.messenger.v3.V(chat);
                        r70Var.getClass();
                        Bundle j10 = a8.p0.j(j3, "chat_id");
                        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(r70Var.a);
                        org.telegram.ui.ActionBar.g2 g2Var2 = r70Var.o1;
                        if (u12.E(j10, g2Var2, null, null)) {
                            g2Var2.presentFragment(new q70(r70Var, j10, z12, j3), g2Var2 instanceof org.telegram.ui.bn);
                            break;
                        }
                    }
                }
                break;
            case 2:
                g80 g80Var = (g80) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                g80Var.E = false;
                g80Var.M = tL_chatInviteExported.link;
                if (tL_error3 == null) {
                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject2;
                    if (tL_chatInviteExported.importers == null) {
                        tL_chatInviteExported.importers = new ArrayList<>(3);
                    }
                    tL_chatInviteExported.importers.clear();
                    for (int i16 = 0; i16 < tL_messages_chatInviteImporters.users.size(); i16++) {
                        tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
                    }
                    g80Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
                    break;
                }
                break;
            case 3:
                k90 k90Var = (k90) obj4;
                ArrayList arrayList3 = (ArrayList) obj2;
                boolean[] zArr = (boolean[]) obj;
                ((boolean[]) obj3)[0] = true;
                org.telegram.messenger.g0.r(k90Var.R);
                for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                    ((TL_stories.StoryItem) arrayList3.get(i17)).pinned = zArr[i17];
                }
                k90Var.getMessagesController().R1().q0(k90Var.e, arrayList3, false);
                break;
            case 4:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj3;
                hi.e eVar = (hi.e) obj4;
                org.telegram.ui.o6 o6Var = (org.telegram.ui.o6) obj2;
                Runnable runnable = (Runnable) obj;
                if (tL_error4 != null) {
                    lc.Y().g0(tL_error4, false);
                    break;
                } else {
                    eVar.setLoading(false);
                    o6Var.dismiss();
                    org.telegram.messenger.f3.n(null, 2131746849, lc.Y(), R.raw.chats_infotip, 36);
                    runnable.run();
                    break;
                }
            case 5:
                org.telegram.ui.cx cxVar = (org.telegram.ui.cx) obj3;
                cxVar.showDialog(new a30((Context) obj2, cxVar.getResourceProvider(), new fm0(0, (nm0) obj4, cxVar)));
                ((a70) obj).v();
                break;
            case 6:
                org.telegram.ui.cx cxVar2 = (org.telegram.ui.cx) obj3;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                a70 a70Var = (a70) obj;
                byte[] bArr = tL_sponsoredPeer.random_id;
                org.telegram.ui.ActionBar.h6 resourceProvider = cxVar2.getResourceProvider();
                ou ouVar = new ou(29, (nm0) obj4, tL_sponsoredPeer);
                int i18 = org.telegram.ui.qy0.w1;
                int currentAccount = cxVar2.getCurrentAccount();
                Activity parentActivity = cxVar2.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new org.telegram.messenger.hx(parentActivity, resourceProvider, bArr, cxVar2, ouVar, currentAccount));
                }
                a70Var.v();
                break;
            case 7:
                ((AtomicReference) obj3).set(null);
                ((jo0) obj2).didReceivedNotification(org.telegram.messenger.ls.t5, ((ap0) obj4).a, Long.valueOf(-((TLRPC.Dialog) obj).id));
                break;
            case 8:
                kw0 kw0Var = (kw0) obj4;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                org.telegram.messenger.si siVar = (org.telegram.messenger.si) obj;
                kw0Var.a2 = 0;
                if (tL_error5 == null) {
                    cl0 cl0Var = new cl0(kw0Var, 1);
                    cl0Var.addTarget(kw0Var.b);
                    TransitionManager.beginDelayedTransition(kw0Var.c, cl0Var);
                    kw0Var.s1.setVisibility(0);
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    kw0Var.N1 = tL_messages_stickerSet;
                    siVar.N1(tL_messages_stickerSet, false);
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = kw0Var.N1;
                    if (tL_messages_stickerSet2 == null || !tL_messages_stickerSet2.documents.isEmpty()) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = kw0Var.N1;
                        kw0Var.c2 = (tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || stickerSet.masks) ? false : true;
                        kw0Var.K0();
                        siVar.t1(kw0Var.N1);
                        kw0Var.b1();
                        kw0Var.a1();
                        kw0Var.Z0();
                        kw0Var.o1.f();
                        break;
                    } else {
                        kw0Var.dismiss();
                        break;
                    }
                } else {
                    kw0Var.dismiss();
                    org.telegram.ui.ActionBar.g2 g2Var3 = kw0Var.G1;
                    if (g2Var3 != null) {
                        org.telegram.messenger.f3.o(null, 2131754382, lc.b0(g2Var3), null);
                        break;
                    }
                }
                break;
            case 9:
                org.telegram.ui.qo0 qo0Var = (org.telegram.ui.qo0) obj4;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj;
                qo0Var.a2 = 0;
                if (tL_error6 != null || !(tLObject4 instanceof Vector)) {
                    c5.c0(qo0Var.a, tL_error6, qo0Var.G1, tL_messages_getAttachedStickers, new Object[0]);
                    qo0Var.dismiss();
                    break;
                } else {
                    Vector vector = (Vector) tLObject4;
                    if (vector.objects.isEmpty()) {
                        qo0Var.dismiss();
                        break;
                    } else if (vector.objects.size() == 1) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(0);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        qo0Var.Q1 = tL_inputStickerSetID;
                        TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                        tL_inputStickerSetID.id = stickerSet2.id;
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        qo0Var.S0();
                        break;
                    } else {
                        ArrayList arrayList4 = new ArrayList();
                        qo0Var.R1 = arrayList4;
                        arrayList4.addAll(vector.objects);
                        qo0Var.n1.setLayoutParams(c8.ma.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                        qo0Var.r1.setVisibility(8);
                        qo0Var.E1[0].setVisibility(8);
                        qo0Var.o1.f();
                        break;
                    }
                }
                break;
            case 10:
                wy0 wy0Var = (wy0) obj4;
                TLObject tLObject5 = (TLObject) obj2;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj3;
                try {
                    ((org.telegram.ui.ActionBar.t1) obj).dismiss();
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
                if (tLObject5 instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.np.u1(wy0Var.d).H3(0);
                    break;
                } else if (tL_error7 == null || tL_error7.code != -1000) {
                    String N0 = org.telegram.messenger.hd.N0(2131751093, null);
                    if (tL_error7 != null) {
                        StringBuilder n10 = p5.c.n(N0, "\n");
                        n10.append(tL_error7.text);
                        N0 = n10.toString();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wy0Var.getContext());
                    String N02 = org.telegram.messenger.hd.N0(R.string.AppName, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.S = N02;
                    t1Var.U = N0;
                    org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
                    break;
                }
                break;
            case 11:
                a21 a21Var = (a21) obj4;
                ((a70) obj3).v();
                ((org.telegram.messenger.np) obj2).t7.t(-a21Var.f, ((TLRPC.TL_forumTopic) obj).id, !r11.pinned, a21Var.s);
                break;
            case 12:
                b31 b31Var = (b31) obj4;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                m21 m21Var = b31Var.z1;
                a31 a31Var = b31Var.I1;
                b31Var.m1 = null;
                if (tL_error8 == null || !"TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error8.text)) {
                    if (tLObject6 instanceof TLRPC.TL_messages_translateResult) {
                        TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) tLObject6;
                        if (!tL_messages_translateResult.result.isEmpty() && tL_messages_translateResult.result.get(0) != null && tL_messages_translateResult.result.get(0).text != null) {
                            b31Var.P1 = false;
                            TLRPC.TL_textWithEntities R0 = b31.R0(tL_textWithEntities, tL_messages_translateResult.result.get(0));
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(R0.text);
                            org.telegram.messenger.gj.b(valueOf, R0.entities, false, true, false, false, 0);
                            b31Var.A1.setText(b31Var.S0(valueOf));
                            a31Var.D(m21Var);
                            break;
                        }
                    }
                    if (b31Var.P1) {
                        b31Var.dismiss();
                        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.S4, 1, org.telegram.messenger.hd.N0(2131743701, null));
                        break;
                    } else {
                        org.telegram.messenger.f3.o(null, 2131743701, new lc((FrameLayout) b31Var.b, b31Var.J0), null);
                        x21 x21Var = b31Var.x1.e;
                        String str = b31Var.w1;
                        b31Var.v1 = str;
                        x21Var.setText(b31.P0(str, null, null));
                        a31Var.D(m21Var);
                        break;
                    }
                } else {
                    b31Var.Z0();
                    break;
                }
                break;
            case 13:
                org.telegram.ui.f40 f40Var = (org.telegram.ui.f40) obj4;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) obj;
                org.telegram.messenger.c cVar3 = f40Var.o1;
                org.telegram.messenger.t3 t3Var = new org.telegram.messenger.t3();
                f40Var.V2 = t3Var;
                t3Var.b = new TLRPC.TL_groupCall();
                org.telegram.messenger.t3 t3Var2 = f40Var.V2;
                TLRPC.GroupCall groupCall = t3Var2.b;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                t3Var2.c = chat2 == null ? 0L : chat2.id;
                groupCall.schedule_date = f40Var.j4;
                groupCall.flags |= 128;
                t3Var2.C = cVar3;
                t3Var2.x(inputPeer);
                org.telegram.messenger.t3 t3Var3 = f40Var.V2;
                TLRPC.GroupCall groupCall2 = t3Var3.b;
                TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
                groupCall2.access_hash = groupCall3.access_hash;
                groupCall2.id = groupCall3.id;
                t3Var3.e();
                v10 v10Var = f40Var.o4;
                org.telegram.messenger.t3 t3Var4 = f40Var.V2;
                v10Var.c = t3Var4;
                f40Var.Z3.setGroupCall(t3Var4);
                org.telegram.ui.i40 i40Var = f40Var.n4;
                org.telegram.messenger.t3 t3Var5 = f40Var.V2;
                i40Var.c = t3Var5;
                f40Var.X1.D0(cVar3.a, t3Var5.g(false));
                org.telegram.messenger.np u13 = org.telegram.messenger.np.u1(cVar3.a);
                org.telegram.messenger.t3 t3Var6 = f40Var.V2;
                u13.d4(t3Var6.c, t3Var6);
                break;
            case 14:
                org.telegram.ui.f40 f40Var2 = (org.telegram.ui.f40) obj4;
                org.telegram.messenger.t3 t3Var7 = (org.telegram.messenger.t3) obj2;
                String str2 = (String) obj;
                TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                Iterator it = ((HashSet) obj3).iterator();
                while (it.hasNext()) {
                    Long l10 = (Long) it.next();
                    long longValue = l10.longValue();
                    if (t3Var7 != null) {
                        t3Var7.t(longValue);
                    }
                    arrayList5.add(org.telegram.messenger.np.u1(f40Var2.a).c2(l10));
                    ArrayList<TLRPC.InputUser> arrayList8 = getrequirementstocontact.id;
                    org.telegram.messenger.np u14 = org.telegram.messenger.np.u1(f40Var2.a);
                    arrayList8.add(u14.s1(u14.c2(l10)));
                }
                org.telegram.ui.wn wnVar = new org.telegram.ui.wn((Object) f40Var2, (Object) arrayList5, (Object) arrayList6, (Object) arrayList7, str2, 11);
                if (org.telegram.messenger.k10.i(f40Var2.a).q()) {
                    wnVar.run();
                    break;
                } else {
                    ConnectionsManager.getInstance(f40Var2.a).sendRequest(getrequirementstocontact, new org.telegram.ui.z9(arrayList5, arrayList6, wnVar, 13));
                    break;
                }
            case 15:
                TLObject tLObject7 = (TLObject) obj2;
                ArrayList arrayList9 = (ArrayList) obj4;
                ArrayList arrayList10 = (ArrayList) obj3;
                org.telegram.ui.wn wnVar2 = (org.telegram.ui.wn) obj;
                if (tLObject7 instanceof Vector) {
                    Vector vector2 = (Vector) tLObject7;
                    for (int i19 = 0; i19 < Math.min(arrayList9.size(), vector2.objects.size()); i19++) {
                        if (vector2.objects.get(i19) instanceof TL_account.requirementToContactPremium) {
                            arrayList10.add(Long.valueOf(((TLRPC.User) arrayList9.get(i19)).id));
                        }
                    }
                }
                wnVar2.run();
                break;
            case 16:
                org.telegram.ui.o30 o30Var = (org.telegram.ui.o30) obj4;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj3;
                TLObject tLObject8 = (TLObject) obj2;
                String str3 = (String) obj;
                org.telegram.ui.f40 f40Var3 = o30Var.f;
                org.telegram.messenger.c cVar4 = f40Var3.o1;
                org.telegram.ui.d20 d20Var = f40Var3.m1;
                org.telegram.messenger.gc gcVar = o30Var.d;
                if (gcVar != null) {
                    d20Var.L0 = gcVar;
                    d20Var.r1 = null;
                    d20Var.s1 = null;
                    o30Var.d = null;
                }
                if (tL_error9 == null) {
                    org.telegram.messenger.np u15 = org.telegram.messenger.np.u1(cVar4.a);
                    int i20 = cVar4.a;
                    TLRPC.User c23 = u15.c2(Long.valueOf(org.telegram.messenger.k10.i(i20).e()));
                    if (c23 == null) {
                        c23 = org.telegram.messenger.k10.i(i20).f();
                        if (c23 != null) {
                            org.telegram.messenger.np.u1(i20).e4(c23, false, false);
                        }
                    } else {
                        org.telegram.messenger.k10.i(i20).w(c23);
                    }
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject8;
                    ArrayList<TLRPC.PhotoSize> arrayList11 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList11, org.telegram.messenger.ls.g2, false, null, false);
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(arrayList11, 800, false, null, false);
                    TLRPC.VideoSize videoSize = tL_photos_photo.photo.video_sizes.isEmpty() ? null : tL_photos_photo.photo.video_sizes.get(0);
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    c23.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
                    if (w10 != null) {
                        tL_userProfilePhoto.photo_small = w10.location;
                    }
                    if (w11 != null) {
                        tL_userProfilePhoto.photo_big = w11.location;
                    }
                    if (w10 == null || o30Var.c == null) {
                        cVar2 = cVar4;
                        z10 = true;
                    } else {
                        org.telegram.messenger.w7.G(f40Var3.a);
                        File J = org.telegram.messenger.w7.J(w10, null, true, true);
                        org.telegram.messenger.w7.G(f40Var3.a);
                        org.telegram.messenger.w7.J(o30Var.c, null, true, true).renameTo(J);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(o30Var.c.volume_id);
                        sb2.append("_");
                        String n11 = a8.p0.n(o30Var.c.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        cVar2 = cVar4;
                        sb3.append(w10.location.volume_id);
                        sb3.append("_");
                        z10 = true;
                        org.telegram.messenger.fc.D().S(n11, a8.p0.n(w10.location.local_id, "@50_50", sb3), org.telegram.messenger.gc.l(f40Var3.a, 1, c23));
                    }
                    if (w11 != null && o30Var.b != null) {
                        org.telegram.messenger.w7.G(f40Var3.a);
                        File J2 = org.telegram.messenger.w7.J(w11, null, z10, z10);
                        org.telegram.messenger.w7.G(f40Var3.a);
                        org.telegram.messenger.w7.J(o30Var.b, null, z10, z10).renameTo(J2);
                    }
                    if (videoSize != null && str3 != null) {
                        org.telegram.messenger.w7.G(f40Var3.a);
                        new File(str3).renameTo(org.telegram.messenger.w7.J(videoSize, "mp4", z10, z10));
                    }
                    org.telegram.messenger.np.u1(i20).W0(c23.id).f();
                    ArrayList arrayList12 = new ArrayList();
                    arrayList12.add(c23);
                    org.telegram.messenger.ur.a0(i20).m1(arrayList12, null, false, true);
                    TLRPC.User c24 = org.telegram.messenger.np.u1(i20).c2(Long.valueOf(o30Var.e));
                    org.telegram.messenger.gc l11 = org.telegram.messenger.gc.l(i20, 0, c24);
                    org.telegram.messenger.gc l12 = org.telegram.messenger.gc.l(i20, 1, c24);
                    if (org.telegram.messenger.gc.e(o30Var.b) == null) {
                        l12 = org.telegram.messenger.gc.e(o30Var.c);
                    }
                    d20Var.setCreateThumbFromParent(false);
                    d20Var.H(null, l11, l12, true);
                    o30Var.c = null;
                    o30Var.b = null;
                    org.telegram.messenger.g0.Z3(f40Var3.L1);
                    o30Var.a(1.0f);
                    cVar = cVar2;
                } else {
                    cVar = cVar4;
                }
                int i21 = cVar.a;
                int i22 = cVar.a;
                org.telegram.messenger.ls.f(i21).k(2, Integer.valueOf(org.telegram.messenger.np.I8));
                org.telegram.messenger.ls.f(i22).k(46, new Object[0]);
                org.telegram.messenger.k10.i(i22).v(true);
                break;
            case 17:
                org.telegram.ui.f50.Z((org.telegram.ui.f50) obj4, (ArrayList) obj3, (ArrayList) obj2, (CountDownLatch) obj);
                break;
            case 18:
                org.telegram.ui.m50 m50Var = (org.telegram.ui.m50) obj4;
                m50Var.d = (ArrayList) obj3;
                m50Var.e = (ArrayList) obj2;
                m50Var.f();
                org.telegram.ui.n50 n50Var = m50Var.r;
                n50Var.b.d.setVisibility(8);
                n50Var.b.e.setText(org.telegram.messenger.hd.a0(null, null, 2131752105, (String) obj));
                n50Var.b.e(false, true);
                break;
            case 19:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                org.telegram.ui.h60 h60Var = (org.telegram.ui.h60) obj;
                TLObject tLObject9 = (TLObject) obj2;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj3;
                String str4 = LaunchActivity.C1;
                try {
                    h60Var.run();
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                }
                if (tLObject9 instanceof TLRPC.TL_langPackLanguage) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) tLObject9;
                    Pattern pattern = c5.a;
                    tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    String str5 = tL_langPackLanguage.base_lang_code;
                    if (str5 != null) {
                        tL_langPackLanguage.base_lang_code = str5.replace('-', '_').toLowerCase();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(launchActivity);
                    boolean equals = org.telegram.messenger.hd.E0().B.c.equals(tL_langPackLanguage.lang_code);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                    if (equals) {
                        t1Var2.S = org.telegram.messenger.hd.N0(2131748861, null);
                        a02 = org.telegram.messenger.hd.a0("LanguageSame", null, 2131748854, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131747637, null), null);
                        alertDialog$Builder2.i(org.telegram.messenger.hd.N0(2131745787, null), new h1(launchActivity, i12));
                    } else if (tL_langPackLanguage.strings_count == 0) {
                        t1Var2.S = org.telegram.messenger.hd.N0(2131748851, null);
                        a02 = org.telegram.messenger.hd.a0("LanguageUnknownCustomAlert", null, 2131748852, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131747637, null), null);
                    } else {
                        t1Var2.S = org.telegram.messenger.hd.N0(2131748853, null);
                        a02 = tL_langPackLanguage.official ? org.telegram.messenger.hd.a0("LanguageAlert", null, 2131748860, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f))) : org.telegram.messenger.hd.a0("LanguageCustomAlert", null, 2131748857, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        alertDialog$Builder2.k(org.telegram.messenger.hd.N0(2131752540, null), new oi.f0(26, tL_langPackLanguage, launchActivity));
                        alertDialog$Builder2.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.W2(a02));
                    int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '[');
                    if (indexOf != -1) {
                        int i23 = indexOf + 1;
                        i7 = TextUtils.indexOf((CharSequence) spannableStringBuilder, ']', i23);
                        if (i7 != -1) {
                            spannableStringBuilder.delete(i7, i7 + 1);
                            spannableStringBuilder.delete(indexOf, i23);
                        }
                    } else {
                        i7 = -1;
                    }
                    if (indexOf != -1 && i7 != -1) {
                        spannableStringBuilder.setSpan(new u3(tL_langPackLanguage.translations_url, alertDialog$Builder2), indexOf, i7 - 1, 33);
                    }
                    TextView textView = new TextView(launchActivity);
                    textView.setText(spannableStringBuilder);
                    textView.setTextSize(1, 16.0f);
                    org.telegram.ui.ActionBar.t6.G(textView, org.telegram.ui.ActionBar.m6.k5, null);
                    org.telegram.ui.ActionBar.t6.C(textView, org.telegram.ui.ActionBar.m6.l5, null);
                    textView.setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
                    textView.setMovementMethod(new org.telegram.messenger.c0(false));
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.j5, null);
                    alertDialog$Builder2.o(textView);
                    launchActivity.F0(alertDialog$Builder2);
                    break;
                } else if (tL_error10 != null) {
                    if ("LANG_CODE_NOT_SUPPORTED".equals(tL_error10.text)) {
                        launchActivity.F0(c5.K(launchActivity, null, org.telegram.messenger.hd.N0(2131748850, null)));
                        break;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        org.telegram.ui.Cells.c0.u(null, 2131751093, sb4, "\n");
                        sb4.append(tL_error10.text);
                        launchActivity.F0(c5.K(launchActivity, null, sb4.toString()));
                        break;
                    }
                }
                break;
            case 20:
                org.telegram.ui.ActionBar.t1 t1Var3 = (org.telegram.ui.ActionBar.t1) obj4;
                TLObject tLObject10 = (TLObject) obj2;
                org.telegram.ui.g gVar = (org.telegram.ui.g) obj;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj3;
                String str6 = LaunchActivity.C1;
                try {
                    t1Var3.dismiss();
                } catch (Exception unused) {
                }
                if (!(tLObject10 instanceof TLRPC.TL_authorization)) {
                    org.telegram.messenger.g0.g3(new org.telegram.ui.h60(4, gVar, tL_error11));
                    break;
                }
                break;
            case 21:
                org.telegram.ui.s90 s90Var = (org.telegram.ui.s90) obj4;
                org.telegram.ui.ActionBar.g2 g2Var4 = (org.telegram.ui.ActionBar.g2) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                br.e(g2Var4.getContext(), s90Var.b, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) obj, true, new rh(17, s90Var, userArr), g2Var4.getResourceProvider(), org.telegram.ui.s90.d());
                break;
            case 22:
                org.telegram.ui.p90.z0((org.telegram.ui.p90) obj4, (TLObject) obj2, (HashSet) obj, (TLRPC.TL_error) obj3);
                break;
            case 23:
                EditText editText = (EditText) obj2;
                bi.v vVar = (bi.v) obj;
                ((yb0) obj4).a(0.0f);
                ((View) obj3).setTag(R.id.timeout_callback, null);
                if (editText != null) {
                    editText.post(new org.telegram.ui.h60(16, editText, vVar));
                    break;
                }
                break;
            case 24:
                org.telegram.ui.ub0 ub0Var = (org.telegram.ui.ub0) obj4;
                String str7 = (String) obj3;
                String str8 = (String) obj2;
                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = (TLRPC.TL_auth_recoverPassword) obj;
                byte[] h12 = str7 != null ? org.telegram.messenger.g0.h1(str7) : null;
                org.telegram.ui.tb0 tb0Var = new org.telegram.ui.tb0(ub0Var, str7, str8, i12);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = ub0Var.s.new_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    if (str7 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = org.telegram.messenger.kv.b(h12, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error12 = new TLRPC.TL_error();
                            tL_error12.text = "ALGO_INVALID";
                            tb0Var.run(null, tL_error12);
                        }
                    }
                    i10 = ((org.telegram.ui.ActionBar.g2) ub0Var.H).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_auth_recoverPassword, tb0Var, 10);
                    break;
                } else {
                    TLRPC.TL_error tL_error13 = new TLRPC.TL_error();
                    tL_error13.text = "PASSWORD_HASH_INVALID";
                    tb0Var.run(null, tL_error13);
                    break;
                }
            case 25:
                org.telegram.ui.hc0 hc0Var = (org.telegram.ui.hc0) obj4;
                String str9 = (String) obj;
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj3;
                org.telegram.ui.de0 de0Var = hc0Var.E;
                de0Var.C1(false, true);
                hc0Var.n = false;
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", str9);
                    bundle.putString("password", hc0Var.h);
                    de0Var.M1(9, true, bundle, false);
                    break;
                } else if (tL_error14 != null && !tL_error14.text.startsWith("CODE_INVALID")) {
                    if (tL_error14.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error14.text).intValue();
                        de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750669, intValue < 60 ? org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0])));
                        break;
                    } else {
                        de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), tL_error14.text);
                        break;
                    }
                } else {
                    hc0Var.n(true);
                    break;
                }
            case 26:
                a();
                break;
            case 27:
                org.telegram.ui.ld0.n((org.telegram.ui.ld0) obj4, (String) obj3, (String) obj2, (String) obj);
                break;
            case 28:
                b();
                break;
            default:
                org.telegram.ui.ce0 ce0Var = (org.telegram.ui.ce0) obj4;
                TLRPC.TL_error tL_error15 = (TLRPC.TL_error) obj3;
                TLObject tLObject11 = (TLObject) obj2;
                String str10 = (String) obj;
                ce0Var.N = false;
                org.telegram.ui.de0 de0Var2 = ce0Var.h0;
                de0Var2.N1(false, true);
                if (tL_error15 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject11;
                    if (TwoStepVerificationActivity.n0(password, true)) {
                        Bundle bundle2 = new Bundle();
                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                        password.serializeToStream(serializedData);
                        bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                        bundle2.putString("phoneFormated", str10);
                        de0Var2.M1(6, true, bundle2, false);
                        break;
                    } else {
                        c5.u0(de0Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743575, "UpdateAppAlert"), true);
                        break;
                    }
                } else {
                    de0Var2.D1(org.telegram.messenger.hd.N0(2131745875, null), tL_error15.text);
                    break;
                }
        }
    }

    public /* synthetic */ q20(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ q20(Object obj, TLObject tLObject, Object obj2, TLRPC.TL_error tL_error, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = tLObject;
        this.e = obj2;
        this.b = tL_error;
    }

    public /* synthetic */ q20(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, org.telegram.ui.wn wnVar) {
        this.a = 15;
        this.d = tLObject;
        this.c = arrayList;
        this.b = arrayList2;
        this.e = wnVar;
    }

    public /* synthetic */ q20(TLRPC.TL_error tL_error, hi.e eVar, org.telegram.ui.o6 o6Var, Runnable runnable) {
        this.a = 4;
        this.b = tL_error;
        this.c = eVar;
        this.d = o6Var;
        this.e = runnable;
    }

    public /* synthetic */ q20(g80 g80Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject) {
        this.a = 2;
        this.c = g80Var;
        this.e = tL_chatInviteExported;
        this.b = tL_error;
        this.d = tLObject;
    }

    public /* synthetic */ q20(org.telegram.ui.gd0 gd0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.a = 26;
        this.c = gd0Var;
        this.b = tL_error;
        this.e = bundle;
        this.d = tLObject;
    }
}
