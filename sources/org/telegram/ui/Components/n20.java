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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n20(KeyEvent.Callback callback, Object obj, TLObject tLObject, TLRPC.TL_error tL_error, int i7) {
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
                    de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131748987, null));
                } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                    de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131748991, null));
                } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                    gd0Var.c(true);
                    de0Var.M1(0, true, null, true);
                    de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, null));
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131750671, null));
                } else if (tL_error.code != -1000) {
                    String M0 = org.telegram.messenger.gd.M0(2131745876, null);
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.Cells.c0.u(null, 2131751094, sb2, "\n");
                    sb2.append(tL_error.text);
                    de0Var.D1(M0, sb2.toString());
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
        i7 = ((org.telegram.ui.ActionBar.h2) de0Var).currentAccount;
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
                s20 s20Var = (s20) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) obj;
                kv0 kv0Var = s20Var.u1;
                a0.h hVar3 = s20Var.V1;
                a0.h hVar4 = s20Var.W1;
                ArrayList arrayList2 = s20Var.S1;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    org.telegram.messenger.mp.u1(s20Var.a).f4(tL_channels_channelParticipants.users, false);
                    org.telegram.messenger.mp.u1(s20Var.a).Z3(tL_channels_channelParticipants.chats, false);
                    long e10 = org.telegram.messenger.j10.i(s20Var.a).e();
                    int i13 = 0;
                    while (true) {
                        if (i13 < tL_channels_channelParticipants.participants.size()) {
                            if (org.telegram.messenger.fj.B1(tL_channels_channelParticipants.participants.get(i13).peer) == e10) {
                                tL_channels_channelParticipants.participants.remove(i13);
                            } else {
                                i13++;
                            }
                        }
                    }
                    s20Var.P1--;
                    if (tL_channels_getParticipants.filter instanceof TLRPC.TL_channelParticipantsContacts) {
                        arrayList = s20Var.T1;
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
                        hVar.k(channelParticipant, org.telegram.messenger.fj.B1(channelParticipant.peer));
                    }
                    int size2 = arrayList2.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        long B1 = org.telegram.messenger.fj.B1(((TLRPC.ChannelParticipant) arrayList2.get(i15)).peer);
                        boolean z11 = hVar4.f(B1) != null || ((hVar2 = s20Var.Z1) != null && hVar2.h(B1) >= 0);
                        TLRPC.User c22 = org.telegram.messenger.mp.u1(s20Var.a).c2(Long.valueOf(B1));
                        if ((c22 != null && c22.bot) || org.telegram.messenger.o10.y(c22)) {
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
                        if (s20Var.R1.participants_count <= 200) {
                            Collections.sort(arrayList, new org.telegram.ui.vp(s20Var, ConnectionsManager.getInstance(s20Var.a).getCurrentTime(), 1));
                        }
                    } catch (Exception e11) {
                        r92 = 1;
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                r92 = 1;
                if (s20Var.P1 <= 0) {
                    s20Var.X1 = false;
                    s20Var.Y1 = r92;
                    if (s20Var.l2 == r92) {
                        b10 = r92;
                    } else {
                        bk0 bk0Var = s20Var.q1;
                        b10 = bk0Var != null ? bk0Var.b() - r92 : 0;
                    }
                    s20Var.P0(b10);
                    if (arrayList2.isEmpty()) {
                        s20Var.c2 = r92;
                        s20Var.S0();
                    }
                }
                s20Var.U0();
                bk0 bk0Var2 = s20Var.q1;
                if (bk0Var2 != null) {
                    bk0Var2.f();
                    if (kv0Var != null && s20Var.q1.b() == 0 && s20Var.Y1) {
                        kv0Var.e(false, true);
                        break;
                    }
                }
                break;
            case 1:
                p70 p70Var = (p70) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj2;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) obj;
                org.telegram.ui.ActionBar.h2 h2Var = p70Var.o1;
                if (h2Var != null && h2Var.getParentActivity() != null) {
                    if (tL_error2 != null) {
                        "USER_ALREADY_PARTICIPANT".equals(tL_error2.text);
                        b5.c0(p70Var.a, tL_error2, h2Var, tL_messages_importChatInvite, new Object[0]);
                        break;
                    } else if (updates != null && !updates.chats.isEmpty()) {
                        TLRPC.Chat chat = updates.chats.get(0);
                        chat.left = false;
                        chat.kicked = false;
                        org.telegram.messenger.mp.u1(p70Var.a).f4(updates.users, false);
                        org.telegram.messenger.mp.u1(p70Var.a).Z3(updates.chats, false);
                        long j3 = chat.id;
                        boolean z12 = !org.telegram.messenger.v3.V(chat);
                        p70Var.getClass();
                        Bundle j10 = a8.p0.j(j3, "chat_id");
                        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(p70Var.a);
                        org.telegram.ui.ActionBar.h2 h2Var2 = p70Var.o1;
                        if (u12.E(j10, h2Var2, null, null)) {
                            h2Var2.presentFragment(new o70(p70Var, j10, z12, j3), h2Var2 instanceof org.telegram.ui.bn);
                            break;
                        }
                    }
                }
                break;
            case 2:
                e80 e80Var = (e80) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                e80Var.E = false;
                e80Var.M = tL_chatInviteExported.link;
                if (tL_error3 == null) {
                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject2;
                    if (tL_chatInviteExported.importers == null) {
                        tL_chatInviteExported.importers = new ArrayList<>(3);
                    }
                    tL_chatInviteExported.importers.clear();
                    for (int i16 = 0; i16 < tL_messages_chatInviteImporters.users.size(); i16++) {
                        tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
                    }
                    e80Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
                    break;
                }
                break;
            case 3:
                i90 i90Var = (i90) obj4;
                ArrayList arrayList3 = (ArrayList) obj2;
                boolean[] zArr = (boolean[]) obj;
                ((boolean[]) obj3)[0] = true;
                org.telegram.messenger.g0.r(i90Var.R);
                for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                    ((TL_stories.StoryItem) arrayList3.get(i17)).pinned = zArr[i17];
                }
                i90Var.getMessagesController().R1().q0(i90Var.e, arrayList3, false);
                break;
            case 4:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj3;
                hi.d dVar = (hi.d) obj4;
                org.telegram.ui.o6 o6Var = (org.telegram.ui.o6) obj2;
                Runnable runnable = (Runnable) obj;
                if (tL_error4 != null) {
                    lc.Y().g0(tL_error4, false);
                    break;
                } else {
                    dVar.setLoading(false);
                    o6Var.dismiss();
                    org.telegram.messenger.f3.n(null, 2131746850, lc.Y(), R.raw.chats_infotip, 36);
                    runnable.run();
                    break;
                }
            case 5:
                org.telegram.ui.cx cxVar = (org.telegram.ui.cx) obj3;
                cxVar.showDialog(new x20((Context) obj2, cxVar.getResourceProvider(), new dw(28, (km0) obj4, cxVar)));
                ((y60) obj).v();
                break;
            case 6:
                org.telegram.ui.cx cxVar2 = (org.telegram.ui.cx) obj3;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                y60 y60Var = (y60) obj;
                byte[] bArr = tL_sponsoredPeer.random_id;
                org.telegram.ui.ActionBar.i6 resourceProvider = cxVar2.getResourceProvider();
                dw dwVar = new dw(27, (km0) obj4, tL_sponsoredPeer);
                int i18 = org.telegram.ui.qy0.w1;
                int currentAccount = cxVar2.getCurrentAccount();
                Activity parentActivity = cxVar2.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new org.telegram.messenger.gx(parentActivity, resourceProvider, bArr, cxVar2, dwVar, currentAccount));
                }
                y60Var.v();
                break;
            case 7:
                ((AtomicReference) obj3).set(null);
                ((ho0) obj2).didReceivedNotification(org.telegram.messenger.ks.s5, ((yo0) obj4).a, Long.valueOf(-((TLRPC.Dialog) obj).id));
                break;
            case 8:
                iw0 iw0Var = (iw0) obj4;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                org.telegram.messenger.ri riVar = (org.telegram.messenger.ri) obj;
                iw0Var.a2 = 0;
                if (tL_error5 == null) {
                    al0 al0Var = new al0(iw0Var, 1);
                    al0Var.addTarget(iw0Var.b);
                    TransitionManager.beginDelayedTransition(iw0Var.c, al0Var);
                    iw0Var.s1.setVisibility(0);
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    iw0Var.N1 = tL_messages_stickerSet;
                    riVar.N1(tL_messages_stickerSet, false);
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = iw0Var.N1;
                    if (tL_messages_stickerSet2 == null || !tL_messages_stickerSet2.documents.isEmpty()) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = iw0Var.N1;
                        iw0Var.c2 = (tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || stickerSet.masks) ? false : true;
                        iw0Var.K0();
                        riVar.t1(iw0Var.N1);
                        iw0Var.b1();
                        iw0Var.a1();
                        iw0Var.Z0();
                        iw0Var.o1.f();
                        break;
                    } else {
                        iw0Var.dismiss();
                        break;
                    }
                } else {
                    iw0Var.dismiss();
                    org.telegram.ui.ActionBar.h2 h2Var3 = iw0Var.G1;
                    if (h2Var3 != null) {
                        org.telegram.messenger.f3.o(null, 2131754383, lc.b0(h2Var3), null);
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
                    b5.c0(qo0Var.a, tL_error6, qo0Var.G1, tL_messages_getAttachedStickers, new Object[0]);
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
                uy0 uy0Var = (uy0) obj4;
                TLObject tLObject5 = (TLObject) obj2;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj3;
                try {
                    ((org.telegram.ui.ActionBar.u1) obj).dismiss();
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
                if (tLObject5 instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.mp.u1(uy0Var.d).H3(0);
                    break;
                } else if (tL_error7 == null || tL_error7.code != -1000) {
                    String M0 = org.telegram.messenger.gd.M0(2131751094, null);
                    if (tL_error7 != null) {
                        StringBuilder n10 = p5.c.n(M0, "\n");
                        n10.append(tL_error7.text);
                        M0 = n10.toString();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uy0Var.getContext());
                    String M02 = org.telegram.messenger.gd.M0(R.string.AppName, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.S = M02;
                    u1Var.U = M0;
                    org.telegram.messenger.f3.m(null, 2131747638, alertDialog$Builder, null);
                    break;
                }
                break;
            case 11:
                z11 z11Var = (z11) obj4;
                ((y60) obj3).v();
                ((org.telegram.messenger.mp) obj2).t7.t(-z11Var.f, ((TLRPC.TL_forumTopic) obj).id, !r11.pinned, z11Var.s);
                break;
            case 12:
                y21 y21Var = (y21) obj4;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                j21 j21Var = y21Var.z1;
                x21 x21Var = y21Var.I1;
                y21Var.m1 = null;
                if (tL_error8 == null || !"TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error8.text)) {
                    if (tLObject6 instanceof TLRPC.TL_messages_translateResult) {
                        TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) tLObject6;
                        if (!tL_messages_translateResult.result.isEmpty() && tL_messages_translateResult.result.get(0) != null && tL_messages_translateResult.result.get(0).text != null) {
                            y21Var.P1 = false;
                            TLRPC.TL_textWithEntities R0 = y21.R0(tL_textWithEntities, tL_messages_translateResult.result.get(0));
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(R0.text);
                            org.telegram.messenger.fj.b(valueOf, R0.entities, false, true, false, false, 0);
                            y21Var.A1.setText(y21Var.S0(valueOf));
                            x21Var.D(j21Var);
                            break;
                        }
                    }
                    if (y21Var.P1) {
                        y21Var.dismiss();
                        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.R4, 1, org.telegram.messenger.gd.M0(2131743709, null));
                        break;
                    } else {
                        org.telegram.messenger.f3.o(null, 2131743709, new lc((FrameLayout) y21Var.b, y21Var.J0), null);
                        u21 u21Var = y21Var.x1.e;
                        String str = y21Var.w1;
                        y21Var.v1 = str;
                        u21Var.setText(y21.P0(str, null, null));
                        x21Var.D(j21Var);
                        break;
                    }
                } else {
                    y21Var.Z0();
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
                s10 s10Var = f40Var.o4;
                org.telegram.messenger.t3 t3Var4 = f40Var.V2;
                s10Var.c = t3Var4;
                f40Var.Z3.setGroupCall(t3Var4);
                org.telegram.ui.i40 i40Var = f40Var.n4;
                org.telegram.messenger.t3 t3Var5 = f40Var.V2;
                i40Var.c = t3Var5;
                f40Var.X1.D0(cVar3.a, t3Var5.g(false));
                org.telegram.messenger.mp u13 = org.telegram.messenger.mp.u1(cVar3.a);
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
                    arrayList5.add(org.telegram.messenger.mp.u1(f40Var2.a).c2(l10));
                    ArrayList<TLRPC.InputUser> arrayList8 = getrequirementstocontact.id;
                    org.telegram.messenger.mp u14 = org.telegram.messenger.mp.u1(f40Var2.a);
                    arrayList8.add(u14.s1(u14.c2(l10)));
                }
                org.telegram.ui.wn wnVar = new org.telegram.ui.wn((Object) f40Var2, (Object) arrayList5, (Object) arrayList6, (Object) arrayList7, str2, 11);
                if (org.telegram.messenger.j10.i(f40Var2.a).q()) {
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
                org.telegram.messenger.fc fcVar = o30Var.d;
                if (fcVar != null) {
                    d20Var.L0 = fcVar;
                    d20Var.r1 = null;
                    d20Var.s1 = null;
                    o30Var.d = null;
                }
                if (tL_error9 == null) {
                    org.telegram.messenger.mp u15 = org.telegram.messenger.mp.u1(cVar4.a);
                    int i20 = cVar4.a;
                    TLRPC.User c23 = u15.c2(Long.valueOf(org.telegram.messenger.j10.i(i20).e()));
                    if (c23 == null) {
                        c23 = org.telegram.messenger.j10.i(i20).f();
                        if (c23 != null) {
                            org.telegram.messenger.mp.u1(i20).e4(c23, false, false);
                        }
                    } else {
                        org.telegram.messenger.j10.i(i20).w(c23);
                    }
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject8;
                    ArrayList<TLRPC.PhotoSize> arrayList11 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList11, org.telegram.messenger.ks.g2, false, null, false);
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
                        org.telegram.messenger.ec.D().S(n11, a8.p0.n(w10.location.local_id, "@50_50", sb3), org.telegram.messenger.fc.l(f40Var3.a, 1, c23));
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
                    org.telegram.messenger.mp.u1(i20).W0(c23.id).f();
                    ArrayList arrayList12 = new ArrayList();
                    arrayList12.add(c23);
                    org.telegram.messenger.tr.a0(i20).m1(arrayList12, null, false, true);
                    TLRPC.User c24 = org.telegram.messenger.mp.u1(i20).c2(Long.valueOf(o30Var.e));
                    org.telegram.messenger.fc l11 = org.telegram.messenger.fc.l(i20, 0, c24);
                    org.telegram.messenger.fc l12 = org.telegram.messenger.fc.l(i20, 1, c24);
                    if (org.telegram.messenger.fc.e(o30Var.b) == null) {
                        l12 = org.telegram.messenger.fc.e(o30Var.c);
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
                org.telegram.messenger.ks.f(i21).k(2, Integer.valueOf(org.telegram.messenger.mp.I8));
                org.telegram.messenger.ks.f(i22).k(46, new Object[0]);
                org.telegram.messenger.j10.i(i22).v(true);
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
                n50Var.b.e.setText(org.telegram.messenger.gd.a0(null, null, 2131752106, (String) obj));
                n50Var.b.e(false, true);
                break;
            case 19:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                org.telegram.ui.n60 n60Var = (org.telegram.ui.n60) obj;
                TLObject tLObject9 = (TLObject) obj2;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj3;
                String str4 = LaunchActivity.C1;
                try {
                    n60Var.run();
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                }
                if (tLObject9 instanceof TLRPC.TL_langPackLanguage) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) tLObject9;
                    Pattern pattern = b5.a;
                    tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    String str5 = tL_langPackLanguage.base_lang_code;
                    if (str5 != null) {
                        tL_langPackLanguage.base_lang_code = str5.replace('-', '_').toLowerCase();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(launchActivity);
                    boolean equals = org.telegram.messenger.gd.E0().B.c.equals(tL_langPackLanguage.lang_code);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                    if (equals) {
                        u1Var2.S = org.telegram.messenger.gd.M0(2131748862, null);
                        a02 = org.telegram.messenger.gd.a0("LanguageSame", null, 2131748855, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131747638, null), null);
                        alertDialog$Builder2.i(org.telegram.messenger.gd.M0(2131745788, null), new g1(launchActivity, i12));
                    } else if (tL_langPackLanguage.strings_count == 0) {
                        u1Var2.S = org.telegram.messenger.gd.M0(2131748852, null);
                        a02 = org.telegram.messenger.gd.a0("LanguageUnknownCustomAlert", null, 2131748853, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131747638, null), null);
                    } else {
                        u1Var2.S = org.telegram.messenger.gd.M0(2131748854, null);
                        a02 = tL_langPackLanguage.official ? org.telegram.messenger.gd.a0("LanguageAlert", null, 2131748861, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f))) : org.telegram.messenger.gd.a0("LanguageCustomAlert", null, 2131748858, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        alertDialog$Builder2.k(org.telegram.messenger.gd.M0(2131752541, null), new oi.e0(26, tL_langPackLanguage, launchActivity));
                        alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131752578, null), null);
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
                        spannableStringBuilder.setSpan(new t3(tL_langPackLanguage.translations_url, alertDialog$Builder2), indexOf, i7 - 1, 33);
                    }
                    TextView textView = new TextView(launchActivity);
                    textView.setText(spannableStringBuilder);
                    textView.setTextSize(1, 16.0f);
                    org.telegram.ui.ActionBar.u6.G(textView, org.telegram.ui.ActionBar.n6.k5, null);
                    org.telegram.ui.ActionBar.u6.C(textView, org.telegram.ui.ActionBar.n6.l5, null);
                    textView.setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
                    textView.setMovementMethod(new org.telegram.messenger.c0(false));
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.j5, null);
                    alertDialog$Builder2.o(textView);
                    launchActivity.F0(alertDialog$Builder2);
                    break;
                } else if (tL_error10 != null) {
                    if ("LANG_CODE_NOT_SUPPORTED".equals(tL_error10.text)) {
                        launchActivity.F0(b5.K(launchActivity, null, org.telegram.messenger.gd.M0(2131748851, null)));
                        break;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        org.telegram.ui.Cells.c0.u(null, 2131751094, sb4, "\n");
                        sb4.append(tL_error10.text);
                        launchActivity.F0(b5.K(launchActivity, null, sb4.toString()));
                        break;
                    }
                }
                break;
            case 20:
                org.telegram.ui.ActionBar.u1 u1Var3 = (org.telegram.ui.ActionBar.u1) obj4;
                TLObject tLObject10 = (TLObject) obj2;
                org.telegram.ui.g gVar = (org.telegram.ui.g) obj;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj3;
                String str6 = LaunchActivity.C1;
                try {
                    u1Var3.dismiss();
                } catch (Exception unused) {
                }
                if (!(tLObject10 instanceof TLRPC.TL_authorization)) {
                    org.telegram.messenger.g0.g3(new org.telegram.ui.n60(2, gVar, tL_error11));
                    break;
                }
                break;
            case 21:
                org.telegram.ui.r90 r90Var = (org.telegram.ui.r90) obj4;
                org.telegram.ui.ActionBar.h2 h2Var4 = (org.telegram.ui.ActionBar.h2) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                zq.e(h2Var4.getContext(), r90Var.b, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) obj, true, new ph(17, r90Var, userArr), h2Var4.getResourceProvider(), org.telegram.ui.r90.d());
                break;
            case 22:
                org.telegram.ui.o90.z0((org.telegram.ui.o90) obj4, (TLObject) obj2, (HashSet) obj, (TLRPC.TL_error) obj3);
                break;
            case 23:
                EditText editText = (EditText) obj2;
                bi.v vVar = (bi.v) obj;
                ((xb0) obj4).a(0.0f);
                ((View) obj3).setTag(R.id.timeout_callback, null);
                if (editText != null) {
                    editText.post(new org.telegram.ui.n60(14, editText, vVar));
                    break;
                }
                break;
            case 24:
                org.telegram.ui.tb0 tb0Var = (org.telegram.ui.tb0) obj4;
                String str7 = (String) obj3;
                String str8 = (String) obj2;
                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = (TLRPC.TL_auth_recoverPassword) obj;
                byte[] h12 = str7 != null ? org.telegram.messenger.g0.h1(str7) : null;
                org.telegram.ui.sb0 sb0Var = new org.telegram.ui.sb0(tb0Var, str7, str8, i12);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = tb0Var.s.new_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    if (str7 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = org.telegram.messenger.jv.b(h12, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error12 = new TLRPC.TL_error();
                            tL_error12.text = "ALGO_INVALID";
                            sb0Var.run(null, tL_error12);
                        }
                    }
                    i10 = ((org.telegram.ui.ActionBar.h2) tb0Var.H).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_auth_recoverPassword, sb0Var, 10);
                    break;
                } else {
                    TLRPC.TL_error tL_error13 = new TLRPC.TL_error();
                    tL_error13.text = "PASSWORD_HASH_INVALID";
                    sb0Var.run(null, tL_error13);
                    break;
                }
            case 25:
                org.telegram.ui.gc0 gc0Var = (org.telegram.ui.gc0) obj4;
                String str9 = (String) obj;
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj3;
                org.telegram.ui.de0 de0Var = gc0Var.E;
                de0Var.C1(false, true);
                gc0Var.n = false;
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", str9);
                    bundle.putString("password", gc0Var.h);
                    de0Var.M1(9, true, bundle, false);
                    break;
                } else if (tL_error14 != null && !tL_error14.text.startsWith("CODE_INVALID")) {
                    if (tL_error14.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error14.text).intValue();
                        de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750670, intValue < 60 ? org.telegram.messenger.gd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.gd.G(intValue / 60, "Minutes", new Object[0])));
                        break;
                    } else {
                        de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), tL_error14.text);
                        break;
                    }
                } else {
                    gc0Var.n(true);
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
                        b5.u0(de0Var2.getParentActivity(), org.telegram.messenger.gd.M0(2131743583, "UpdateAppAlert"), true);
                        break;
                    }
                } else {
                    de0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), tL_error15.text);
                    break;
                }
        }
    }

    public /* synthetic */ n20(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ n20(Object obj, TLObject tLObject, Object obj2, TLRPC.TL_error tL_error, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = tLObject;
        this.e = obj2;
        this.b = tL_error;
    }

    public /* synthetic */ n20(TLObject tLObject, ArrayList arrayList, ArrayList arrayList2, org.telegram.ui.wn wnVar) {
        this.a = 15;
        this.d = tLObject;
        this.c = arrayList;
        this.b = arrayList2;
        this.e = wnVar;
    }

    public /* synthetic */ n20(TLRPC.TL_error tL_error, hi.d dVar, org.telegram.ui.o6 o6Var, Runnable runnable) {
        this.a = 4;
        this.b = tL_error;
        this.c = dVar;
        this.d = o6Var;
        this.e = runnable;
    }

    public /* synthetic */ n20(e80 e80Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject) {
        this.a = 2;
        this.c = e80Var;
        this.e = tL_chatInviteExported;
        this.b = tL_error;
        this.d = tLObject;
    }

    public /* synthetic */ n20(org.telegram.ui.gd0 gd0Var, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
        this.a = 26;
        this.c = gd0Var;
        this.b = tL_error;
        this.e = bundle;
        this.d = tLObject;
    }
}
