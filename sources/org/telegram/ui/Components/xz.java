package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.TransitionManager;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class xz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xz(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        org.telegram.ui.gd0 gd0Var = (org.telegram.ui.gd0) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        Bundle bundle = (Bundle) this.d;
        TLObject tLObject = (TLObject) this.e;
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
                    de0Var.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131748986, null));
                } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                    de0Var.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131748990, null));
                } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                    gd0Var.c(true);
                    de0Var.M1(0, true, null, true);
                    de0Var.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131752009, null));
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    de0Var.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.N0(2131750670, null));
                } else if (tL_error.code != -1000) {
                    String N0 = org.telegram.messenger.gd.N0(2131745875, null);
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.Cells.c0.u(null, 2131751093, sb2, "\n");
                    sb2.append(tL_error.text);
                    de0Var.D1(N0, sb2.toString());
                }
            }
        }
        gd0Var.y(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v7 */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r11;
        int b10;
        a0.h hVar;
        ArrayList arrayList;
        a0.h hVar2;
        TLRPC.StickerSet stickerSet;
        boolean z10;
        String str;
        String a02;
        int i7;
        int i10;
        int i11;
        int i12 = this.a;
        int i13 = 13;
        int i14 = 8;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        int i15 = 0;
        switch (i12) {
            case 0:
                ((org.telegram.ui.bx) obj4).Q4(((Integer) obj3).intValue());
                org.telegram.messenger.g0.h3(new bt(i13, (ph) obj2, (org.telegram.ui.ActionBar.g2) obj), 200L);
                break;
            case 1:
                s20 s20Var = (s20) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) obj;
                mv0 mv0Var = s20Var.u1;
                a0.h hVar3 = s20Var.V1;
                a0.h hVar4 = s20Var.W1;
                ArrayList arrayList2 = s20Var.S1;
                if (tL_error == null) {
                    TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
                    org.telegram.messenger.mp.u1(s20Var.a).f4(tL_channels_channelParticipants.users, false);
                    org.telegram.messenger.mp.u1(s20Var.a).Z3(tL_channels_channelParticipants.chats, false);
                    long e10 = org.telegram.messenger.i10.i(s20Var.a).e();
                    int i16 = 0;
                    while (true) {
                        if (i16 < tL_channels_channelParticipants.participants.size()) {
                            if (org.telegram.messenger.fj.B1(tL_channels_channelParticipants.participants.get(i16).peer) == e10) {
                                tL_channels_channelParticipants.participants.remove(i16);
                            } else {
                                i16++;
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
                    for (int i17 = 0; i17 < size; i17++) {
                        TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i17);
                        hVar.k(channelParticipant, org.telegram.messenger.fj.B1(channelParticipant.peer));
                    }
                    int size2 = arrayList2.size();
                    int i18 = 0;
                    while (i18 < size2) {
                        long B1 = org.telegram.messenger.fj.B1(((TLRPC.ChannelParticipant) arrayList2.get(i18)).peer);
                        boolean z11 = hVar4.f(B1) != null || ((hVar2 = s20Var.Z1) != null && hVar2.h(B1) >= 0);
                        TLRPC.User c22 = org.telegram.messenger.mp.u1(s20Var.a).c2(Long.valueOf(B1));
                        if ((c22 != null && c22.bot) || org.telegram.messenger.n10.y(c22)) {
                            z11 = true;
                        }
                        if (z11) {
                            arrayList2.remove(i18);
                            hVar3.l(B1);
                            i18--;
                            size2--;
                        }
                        i18++;
                    }
                    try {
                        if (s20Var.R1.participants_count <= 200) {
                            Collections.sort(arrayList, new org.telegram.ui.vp(s20Var, ConnectionsManager.getInstance(s20Var.a).getCurrentTime(), 1));
                        }
                    } catch (Exception e11) {
                        r11 = 1;
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                r11 = 1;
                if (s20Var.P1 <= 0) {
                    s20Var.X1 = false;
                    s20Var.Y1 = r11;
                    if (s20Var.l2 == r11) {
                        b10 = r11;
                    } else {
                        dk0 dk0Var = s20Var.q1;
                        b10 = dk0Var != null ? dk0Var.b() - r11 : 0;
                    }
                    s20Var.P0(b10);
                    if (arrayList2.isEmpty()) {
                        s20Var.c2 = r11;
                        s20Var.S0();
                    }
                }
                s20Var.U0();
                dk0 dk0Var2 = s20Var.q1;
                if (dk0Var2 != null) {
                    dk0Var2.f();
                    if (mv0Var != null && s20Var.q1.b() == 0 && s20Var.Y1) {
                        mv0Var.e(false, true);
                        break;
                    }
                }
                break;
            case 2:
                o70 o70Var = (o70) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj2;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) obj;
                org.telegram.ui.ActionBar.g2 g2Var = o70Var.o1;
                if (g2Var != null && g2Var.getParentActivity() != null) {
                    if (tL_error2 != null) {
                        "USER_ALREADY_PARTICIPANT".equals(tL_error2.text);
                        b5.c0(o70Var.a, tL_error2, g2Var, tL_messages_importChatInvite, new Object[0]);
                        break;
                    } else if (updates != null && !updates.chats.isEmpty()) {
                        TLRPC.Chat chat = updates.chats.get(0);
                        chat.left = false;
                        chat.kicked = false;
                        org.telegram.messenger.mp.u1(o70Var.a).f4(updates.users, false);
                        org.telegram.messenger.mp.u1(o70Var.a).Z3(updates.chats, false);
                        long j3 = chat.id;
                        boolean z12 = !org.telegram.messenger.v3.V(chat);
                        o70Var.getClass();
                        Bundle j10 = a8.p0.j(j3, "chat_id");
                        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(o70Var.a);
                        org.telegram.ui.ActionBar.g2 g2Var2 = o70Var.o1;
                        if (u12.E(j10, g2Var2, null, null)) {
                            g2Var2.presentFragment(new n70(o70Var, j10, z12, j3), g2Var2 instanceof org.telegram.ui.bn);
                            break;
                        }
                    }
                }
                break;
            case 3:
                d80 d80Var = (d80) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj3;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                TLObject tLObject2 = (TLObject) obj;
                d80Var.E = false;
                d80Var.M = tL_chatInviteExported.link;
                if (tL_error3 == null) {
                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject2;
                    if (tL_chatInviteExported.importers == null) {
                        tL_chatInviteExported.importers = new ArrayList<>(3);
                    }
                    tL_chatInviteExported.importers.clear();
                    for (int i19 = 0; i19 < tL_messages_chatInviteImporters.users.size(); i19++) {
                        tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
                    }
                    d80Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
                    break;
                }
                break;
            case 4:
                h90 h90Var = (h90) obj4;
                ArrayList arrayList3 = (ArrayList) obj2;
                boolean[] zArr = (boolean[]) obj;
                ((boolean[]) obj3)[0] = true;
                org.telegram.messenger.g0.r(h90Var.R);
                for (int i20 = 0; i20 < arrayList3.size(); i20++) {
                    ((TL_stories.StoryItem) arrayList3.get(i20)).pinned = zArr[i20];
                }
                h90Var.getMessagesController().R1().q0(h90Var.e, arrayList3, false);
                break;
            case 5:
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj4;
                hi.e eVar = (hi.e) obj3;
                org.telegram.ui.p6 p6Var = (org.telegram.ui.p6) obj2;
                Runnable runnable = (Runnable) obj;
                if (tL_error4 != null) {
                    kc.Y().g0(tL_error4, false);
                    break;
                } else {
                    eVar.setLoading(false);
                    p6Var.dismiss();
                    org.telegram.messenger.f3.n(null, 2131746849, kc.Y(), R.raw.chats_infotip, 36);
                    runnable.run();
                    break;
                }
            case 6:
                org.telegram.ui.bx bxVar = (org.telegram.ui.bx) obj4;
                bxVar.showDialog(new x20((Context) obj2, bxVar.getResourceProvider(), new sh0(2, (mm0) obj3, bxVar)));
                ((x60) obj).v();
                break;
            case 7:
                org.telegram.ui.bx bxVar2 = (org.telegram.ui.bx) obj4;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                x60 x60Var = (x60) obj;
                byte[] bArr = tL_sponsoredPeer.random_id;
                org.telegram.ui.ActionBar.i6 resourceProvider = bxVar2.getResourceProvider();
                sh0 sh0Var = new sh0(1, (mm0) obj3, tL_sponsoredPeer);
                int i21 = org.telegram.ui.py0.w1;
                int currentAccount = bxVar2.getCurrentAccount();
                Activity parentActivity = bxVar2.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new org.telegram.messenger.gx(parentActivity, resourceProvider, bArr, bxVar2, sh0Var, currentAccount));
                }
                x60Var.v();
                break;
            case 8:
                ((AtomicReference) obj3).set(null);
                ((io0) obj2).didReceivedNotification(org.telegram.messenger.ks.t5, ((zo0) obj4).a, Long.valueOf(-((TLRPC.Dialog) obj).id));
                break;
            case 9:
                jw0 jw0Var = (jw0) obj4;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                org.telegram.messenger.ri riVar = (org.telegram.messenger.ri) obj;
                jw0Var.a2 = 0;
                if (tL_error5 == null) {
                    cl0 cl0Var = new cl0(jw0Var, 1);
                    cl0Var.addTarget(jw0Var.b);
                    TransitionManager.beginDelayedTransition(jw0Var.c, cl0Var);
                    jw0Var.s1.setVisibility(0);
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject3;
                    jw0Var.N1 = tL_messages_stickerSet;
                    riVar.N1(tL_messages_stickerSet, false);
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = jw0Var.N1;
                    if (tL_messages_stickerSet2 == null || !tL_messages_stickerSet2.documents.isEmpty()) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = jw0Var.N1;
                        jw0Var.c2 = (tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || stickerSet.masks) ? false : true;
                        jw0Var.K0();
                        riVar.t1(jw0Var.N1);
                        jw0Var.b1();
                        jw0Var.a1();
                        jw0Var.Z0();
                        jw0Var.o1.f();
                        break;
                    } else {
                        jw0Var.dismiss();
                        break;
                    }
                } else {
                    jw0Var.dismiss();
                    org.telegram.ui.ActionBar.g2 g2Var3 = jw0Var.G1;
                    if (g2Var3 != null) {
                        org.telegram.messenger.f3.o(null, 2131754382, kc.b0(g2Var3), null);
                        break;
                    }
                }
                break;
            case 10:
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
                        qo0Var.n1.setLayoutParams(c8.na.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                        qo0Var.r1.setVisibility(8);
                        qo0Var.E1[0].setVisibility(8);
                        qo0Var.o1.f();
                        break;
                    }
                }
                break;
            case 11:
                vy0 vy0Var = (vy0) obj4;
                TLObject tLObject5 = (TLObject) obj2;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj;
                try {
                    ((org.telegram.ui.ActionBar.t1) obj3).dismiss();
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
                if (tLObject5 instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.mp.u1(vy0Var.d).H3(0);
                    break;
                } else if (tL_error7 == null || tL_error7.code != -1000) {
                    String N0 = org.telegram.messenger.gd.N0(2131751093, null);
                    if (tL_error7 != null) {
                        StringBuilder n10 = p5.c.n(N0, "\n");
                        n10.append(tL_error7.text);
                        N0 = n10.toString();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vy0Var.getContext());
                    String N02 = org.telegram.messenger.gd.N0(R.string.AppName, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.S = N02;
                    t1Var.U = N0;
                    org.telegram.messenger.f3.m(null, 2131747637, alertDialog$Builder, null);
                    break;
                }
                break;
            case 12:
                z11 z11Var = (z11) obj4;
                ((x60) obj3).v();
                ((org.telegram.messenger.mp) obj2).t7.t(-z11Var.f, ((TLRPC.TL_forumTopic) obj).id, !r10.pinned, z11Var.s);
                break;
            case 13:
                a31 a31Var = (a31) obj4;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                l21 l21Var = a31Var.z1;
                z21 z21Var = a31Var.I1;
                a31Var.m1 = null;
                if (tL_error8 == null || !"TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error8.text)) {
                    if (tLObject6 instanceof TLRPC.TL_messages_translateResult) {
                        TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) tLObject6;
                        if (!tL_messages_translateResult.result.isEmpty() && tL_messages_translateResult.result.get(0) != null && tL_messages_translateResult.result.get(0).text != null) {
                            a31Var.P1 = false;
                            TLRPC.TL_textWithEntities R0 = a31.R0(tL_textWithEntities, tL_messages_translateResult.result.get(0));
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(R0.text);
                            org.telegram.messenger.fj.b(valueOf, R0.entities, false, true, false, false, 0);
                            a31Var.A1.setText(a31Var.S0(valueOf));
                            z21Var.D(l21Var);
                            break;
                        }
                    }
                    if (a31Var.P1) {
                        a31Var.dismiss();
                        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.S4, 1, org.telegram.messenger.gd.N0(2131743699, null));
                        break;
                    } else {
                        org.telegram.messenger.f3.o(null, 2131743699, new kc((FrameLayout) a31Var.b, a31Var.J0), null);
                        w21 w21Var = a31Var.x1.e;
                        String str2 = a31Var.w1;
                        a31Var.v1 = str2;
                        w21Var.setText(a31.P0(str2, null, null));
                        z21Var.D(l21Var);
                        break;
                    }
                } else {
                    a31Var.Z0();
                    break;
                }
            case 14:
                org.telegram.ui.e40 e40Var = (org.telegram.ui.e40) obj4;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) obj;
                org.telegram.messenger.c cVar = e40Var.o1;
                org.telegram.messenger.t3 t3Var = new org.telegram.messenger.t3();
                e40Var.V2 = t3Var;
                t3Var.b = new TLRPC.TL_groupCall();
                org.telegram.messenger.t3 t3Var2 = e40Var.V2;
                TLRPC.GroupCall groupCall = t3Var2.b;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                t3Var2.c = chat2 == null ? 0L : chat2.id;
                groupCall.schedule_date = e40Var.j4;
                groupCall.flags |= 128;
                t3Var2.C = cVar;
                t3Var2.x(inputPeer);
                org.telegram.messenger.t3 t3Var3 = e40Var.V2;
                TLRPC.GroupCall groupCall2 = t3Var3.b;
                TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
                groupCall2.access_hash = groupCall3.access_hash;
                groupCall2.id = groupCall3.id;
                t3Var3.e();
                t10 t10Var = e40Var.o4;
                org.telegram.messenger.t3 t3Var4 = e40Var.V2;
                t10Var.c = t3Var4;
                e40Var.Z3.setGroupCall(t3Var4);
                org.telegram.ui.h40 h40Var = e40Var.n4;
                org.telegram.messenger.t3 t3Var5 = e40Var.V2;
                h40Var.c = t3Var5;
                e40Var.X1.D0(cVar.a, t3Var5.g(false));
                org.telegram.messenger.mp u13 = org.telegram.messenger.mp.u1(cVar.a);
                org.telegram.messenger.t3 t3Var6 = e40Var.V2;
                u13.d4(t3Var6.c, t3Var6);
                break;
            case 15:
                org.telegram.ui.e40 e40Var2 = (org.telegram.ui.e40) obj4;
                org.telegram.messenger.t3 t3Var7 = (org.telegram.messenger.t3) obj2;
                String str3 = (String) obj;
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
                    arrayList5.add(org.telegram.messenger.mp.u1(e40Var2.a).c2(l10));
                    ArrayList<TLRPC.InputUser> arrayList8 = getrequirementstocontact.id;
                    org.telegram.messenger.mp u14 = org.telegram.messenger.mp.u1(e40Var2.a);
                    arrayList8.add(u14.s1(u14.c2(l10)));
                }
                org.telegram.ui.ip ipVar = new org.telegram.ui.ip(e40Var2, arrayList5, arrayList6, arrayList7, str3, 10);
                if (org.telegram.messenger.i10.i(e40Var2.a).q()) {
                    ipVar.run();
                    break;
                } else {
                    ConnectionsManager.getInstance(e40Var2.a).sendRequest(getrequirementstocontact, new org.telegram.ui.z9(arrayList5, arrayList6, ipVar, i13));
                    break;
                }
            case 16:
                TLObject tLObject7 = (TLObject) obj4;
                ArrayList arrayList9 = (ArrayList) obj3;
                ArrayList arrayList10 = (ArrayList) obj2;
                org.telegram.ui.ip ipVar2 = (org.telegram.ui.ip) obj;
                if (tLObject7 instanceof Vector) {
                    Vector vector2 = (Vector) tLObject7;
                    for (int i22 = 0; i22 < Math.min(arrayList9.size(), vector2.objects.size()); i22++) {
                        if (vector2.objects.get(i22) instanceof TL_account.requirementToContactPremium) {
                            arrayList10.add(Long.valueOf(((TLRPC.User) arrayList9.get(i22)).id));
                        }
                    }
                }
                ipVar2.run();
                break;
            case 17:
                org.telegram.ui.n30 n30Var = (org.telegram.ui.n30) obj4;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj3;
                TLObject tLObject8 = (TLObject) obj2;
                String str4 = (String) obj;
                org.telegram.ui.e40 e40Var3 = n30Var.f;
                org.telegram.messenger.c cVar2 = e40Var3.o1;
                org.telegram.ui.c20 c20Var = e40Var3.m1;
                org.telegram.messenger.fc fcVar = n30Var.d;
                if (fcVar != null) {
                    c20Var.L0 = fcVar;
                    c20Var.r1 = null;
                    c20Var.s1 = null;
                    n30Var.d = null;
                }
                if (tL_error9 == null) {
                    org.telegram.messenger.mp u15 = org.telegram.messenger.mp.u1(cVar2.a);
                    int i23 = cVar2.a;
                    TLRPC.User c23 = u15.c2(Long.valueOf(org.telegram.messenger.i10.i(i23).e()));
                    if (c23 == null) {
                        c23 = org.telegram.messenger.i10.i(i23).f();
                        if (c23 != null) {
                            org.telegram.messenger.mp.u1(i23).e4(c23, false, false);
                        }
                    } else {
                        org.telegram.messenger.i10.i(i23).w(c23);
                    }
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject8;
                    ArrayList<TLRPC.PhotoSize> arrayList11 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList11, org.telegram.messenger.ks.g2, false, null, false);
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(arrayList11, 800, false, null, false);
                    TLRPC.VideoSize videoSize = tL_photos_photo.photo.video_sizes.isEmpty() ? null : tL_photos_photo.photo.video_sizes.get(0);
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    c23.photo = tL_userProfilePhoto;
                    TLRPC.VideoSize videoSize2 = videoSize;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
                    if (w10 != null) {
                        tL_userProfilePhoto.photo_small = w10.location;
                    }
                    if (w11 != null) {
                        tL_userProfilePhoto.photo_big = w11.location;
                    }
                    if (w10 == null || n30Var.c == null) {
                        z10 = true;
                        str = str4;
                    } else {
                        org.telegram.messenger.w7.G(e40Var3.a);
                        File J = org.telegram.messenger.w7.J(w10, null, true, true);
                        org.telegram.messenger.w7.G(e40Var3.a);
                        org.telegram.messenger.w7.J(n30Var.c, null, true, true).renameTo(J);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(n30Var.c.volume_id);
                        sb2.append("_");
                        String n11 = a8.p0.n(n30Var.c.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        str = str4;
                        sb3.append(w10.location.volume_id);
                        sb3.append("_");
                        z10 = true;
                        org.telegram.messenger.ec.D().S(n11, a8.p0.n(w10.location.local_id, "@50_50", sb3), org.telegram.messenger.fc.l(e40Var3.a, 1, c23));
                    }
                    if (w11 != null && n30Var.b != null) {
                        org.telegram.messenger.w7.G(e40Var3.a);
                        File J2 = org.telegram.messenger.w7.J(w11, null, z10, z10);
                        org.telegram.messenger.w7.G(e40Var3.a);
                        org.telegram.messenger.w7.J(n30Var.b, null, z10, z10).renameTo(J2);
                    }
                    if (videoSize2 != null && str != null) {
                        org.telegram.messenger.w7.G(e40Var3.a);
                        new File(str).renameTo(org.telegram.messenger.w7.J(videoSize2, "mp4", z10, z10));
                    }
                    org.telegram.messenger.mp.u1(i23).W0(c23.id).f();
                    ArrayList arrayList12 = new ArrayList();
                    arrayList12.add(c23);
                    org.telegram.messenger.tr.a0(i23).m1(arrayList12, null, false, true);
                    TLRPC.User c24 = org.telegram.messenger.mp.u1(i23).c2(Long.valueOf(n30Var.e));
                    org.telegram.messenger.fc l11 = org.telegram.messenger.fc.l(i23, 0, c24);
                    org.telegram.messenger.fc l12 = org.telegram.messenger.fc.l(i23, 1, c24);
                    if (org.telegram.messenger.fc.e(n30Var.b) == null) {
                        l12 = org.telegram.messenger.fc.e(n30Var.c);
                    }
                    c20Var.setCreateThumbFromParent(false);
                    c20Var.H(null, l11, l12, true);
                    n30Var.c = null;
                    n30Var.b = null;
                    org.telegram.messenger.g0.Z3(e40Var3.L1);
                    n30Var.a(1.0f);
                }
                int i24 = cVar2.a;
                int i25 = cVar2.a;
                org.telegram.messenger.ks.f(i24).k(2, Integer.valueOf(org.telegram.messenger.mp.I8));
                org.telegram.messenger.ks.f(i25).k(46, new Object[0]);
                org.telegram.messenger.i10.i(i25).v(true);
                break;
            case 18:
                org.telegram.ui.e50.Z((org.telegram.ui.e50) obj4, (ArrayList) obj3, (ArrayList) obj2, (CountDownLatch) obj);
                break;
            case 19:
                org.telegram.ui.m50 m50Var = (org.telegram.ui.m50) obj4;
                m50Var.d = (ArrayList) obj3;
                m50Var.e = (ArrayList) obj2;
                m50Var.f();
                org.telegram.ui.n50 n50Var = m50Var.r;
                n50Var.b.d.setVisibility(8);
                n50Var.b.e.setText(org.telegram.messenger.gd.a0(null, null, 2131752105, (String) obj));
                n50Var.b.e(false, true);
                break;
            case 20:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                org.telegram.ui.i50 i50Var = (org.telegram.ui.i50) obj3;
                TLObject tLObject9 = (TLObject) obj2;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj;
                String str5 = LaunchActivity.C1;
                try {
                    i50Var.run();
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                }
                if (tLObject9 instanceof TLRPC.TL_langPackLanguage) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) tLObject9;
                    Pattern pattern = b5.a;
                    tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    String str6 = tL_langPackLanguage.base_lang_code;
                    if (str6 != null) {
                        tL_langPackLanguage.base_lang_code = str6.replace('-', '_').toLowerCase();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(launchActivity);
                    boolean equals = org.telegram.messenger.gd.E0().B.c.equals(tL_langPackLanguage.lang_code);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                    if (equals) {
                        t1Var2.S = org.telegram.messenger.gd.N0(2131748861, null);
                        a02 = org.telegram.messenger.gd.a0("LanguageSame", null, 2131748854, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(org.telegram.messenger.gd.N0(2131747637, null), null);
                        alertDialog$Builder2.i(org.telegram.messenger.gd.N0(2131745787, null), new g1(launchActivity, null == true ? 1 : 0));
                    } else if (tL_langPackLanguage.strings_count == 0) {
                        t1Var2.S = org.telegram.messenger.gd.N0(2131748851, null);
                        a02 = org.telegram.messenger.gd.a0("LanguageUnknownCustomAlert", null, 2131748852, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(org.telegram.messenger.gd.N0(2131747637, null), null);
                    } else {
                        t1Var2.S = org.telegram.messenger.gd.N0(2131748853, null);
                        a02 = tL_langPackLanguage.official ? org.telegram.messenger.gd.a0("LanguageAlert", null, 2131748860, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f))) : org.telegram.messenger.gd.a0("LanguageCustomAlert", null, 2131748857, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        alertDialog$Builder2.k(org.telegram.messenger.gd.N0(2131752540, null), new oi.f0(26, tL_langPackLanguage, launchActivity));
                        alertDialog$Builder2.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.W2(a02));
                    int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '[');
                    if (indexOf != -1) {
                        int i26 = indexOf + 1;
                        i7 = TextUtils.indexOf((CharSequence) spannableStringBuilder, ']', i26);
                        if (i7 != -1) {
                            spannableStringBuilder.delete(i7, i7 + 1);
                            spannableStringBuilder.delete(indexOf, i26);
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
                        launchActivity.F0(b5.K(launchActivity, null, org.telegram.messenger.gd.N0(2131748850, null)));
                        break;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        org.telegram.ui.Cells.c0.u(null, 2131751093, sb4, "\n");
                        sb4.append(tL_error10.text);
                        launchActivity.F0(b5.K(launchActivity, null, sb4.toString()));
                        break;
                    }
                }
                break;
            case 21:
                org.telegram.ui.ActionBar.t1 t1Var3 = (org.telegram.ui.ActionBar.t1) obj4;
                TLObject tLObject10 = (TLObject) obj3;
                org.telegram.ui.g gVar = (org.telegram.ui.g) obj2;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj;
                String str7 = LaunchActivity.C1;
                try {
                    t1Var3.dismiss();
                } catch (Exception unused) {
                }
                if (!(tLObject10 instanceof TLRPC.TL_authorization)) {
                    org.telegram.messenger.g0.g3(new org.telegram.ui.i50(i14, gVar, tL_error11));
                    break;
                }
                break;
            case 22:
                org.telegram.ui.r90 r90Var = (org.telegram.ui.r90) obj4;
                org.telegram.ui.ActionBar.g2 g2Var4 = (org.telegram.ui.ActionBar.g2) obj;
                TLRPC.User[] userArr = (TLRPC.User[]) obj3;
                yq.e(g2Var4.getContext(), r90Var.b, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) obj2, true, new ph(18, r90Var, userArr), g2Var4.getResourceProvider(), org.telegram.ui.r90.d());
                break;
            case 23:
                org.telegram.ui.o90.z0((org.telegram.ui.o90) obj4, (TLObject) obj3, (HashSet) obj2, (TLRPC.TL_error) obj);
                break;
            case 24:
                EditText editText = (EditText) obj2;
                bi.v vVar = (bi.v) obj;
                ((vb0) obj4).a(0.0f);
                ((View) obj3).setTag(R.id.timeout_callback, null);
                if (editText != null) {
                    editText.post(new org.telegram.ui.i50(20, editText, vVar));
                    break;
                }
                break;
            case 25:
                org.telegram.ui.tb0 tb0Var = (org.telegram.ui.tb0) obj4;
                String str8 = (String) obj3;
                String str9 = (String) obj2;
                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = (TLRPC.TL_auth_recoverPassword) obj;
                byte[] h12 = str8 != null ? org.telegram.messenger.g0.h1(str8) : null;
                org.telegram.ui.sb0 sb0Var = new org.telegram.ui.sb0(tb0Var, str8, str9, null == true ? 1 : 0);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = tb0Var.s.new_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    if (str8 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = org.telegram.messenger.jv.b(h12, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error12 = new TLRPC.TL_error();
                            tL_error12.text = "ALGO_INVALID";
                            sb0Var.run(null, tL_error12);
                        }
                    }
                    i10 = ((org.telegram.ui.ActionBar.g2) tb0Var.H).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_auth_recoverPassword, sb0Var, 10);
                    break;
                } else {
                    TLRPC.TL_error tL_error13 = new TLRPC.TL_error();
                    tL_error13.text = "PASSWORD_HASH_INVALID";
                    sb0Var.run(null, tL_error13);
                    break;
                }
            case 26:
                org.telegram.ui.gc0 gc0Var = (org.telegram.ui.gc0) obj4;
                String str10 = (String) obj2;
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj;
                org.telegram.ui.de0 de0Var = gc0Var.E;
                de0Var.C1(false, true);
                gc0Var.n = false;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", str10);
                    bundle.putString("password", gc0Var.h);
                    de0Var.M1(9, true, bundle, false);
                    break;
                } else if (tL_error14 != null && !tL_error14.text.startsWith("CODE_INVALID")) {
                    if (tL_error14.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error14.text).intValue();
                        de0Var.D1(org.telegram.messenger.gd.N0(2131745875, null), org.telegram.messenger.gd.a0("FloodWaitTime", null, 2131750669, intValue < 60 ? org.telegram.messenger.gd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.gd.G(intValue / 60, "Minutes", new Object[0])));
                        break;
                    } else {
                        de0Var.D1(org.telegram.messenger.gd.N0(2131745875, null), tL_error14.text);
                        break;
                    }
                } else {
                    gc0Var.n(true);
                    break;
                }
                break;
            case 27:
                a();
                break;
            case 28:
                org.telegram.ui.ld0.n((org.telegram.ui.ld0) obj4, (String) obj3, (String) obj2, (String) obj);
                break;
            default:
                f5.m mVar = (f5.m) obj3;
                org.telegram.ui.r3 r3Var = (org.telegram.ui.r3) obj2;
                org.telegram.ui.de0 de0Var2 = ((org.telegram.ui.ld0) obj4).w;
                de0Var2.e = true;
                org.telegram.messenger.r1.i().d(mVar.c, new org.telegram.ui.f3(r3Var, 4));
                org.telegram.messenger.r1.i().h = new org.telegram.ui.kd0(r3Var, i15);
                org.telegram.messenger.r1 i27 = org.telegram.messenger.r1.i();
                Activity parentActivity2 = de0Var2.getParentActivity();
                i11 = ((org.telegram.ui.ActionBar.g2) de0Var2).currentAccount;
                org.telegram.messenger.c a10 = org.telegram.messenger.c.a(i11);
                wf.b bVar = new wf.b(17, (boolean) (null == true ? 1 : 0));
                bVar.R(mVar);
                i27.l(parentActivity2, a10, (TLRPC.TL_inputStorePaymentAuthCode) obj, Collections.singletonList(bVar.q()));
                break;
        }
    }

    public /* synthetic */ xz(mm0 mm0Var, org.telegram.ui.bx bxVar, Object obj, x60 x60Var, int i7) {
        this.a = i7;
        this.c = mm0Var;
        this.b = bxVar;
        this.d = obj;
        this.e = x60Var;
    }

    public /* synthetic */ xz(org.telegram.ui.r90 r90Var, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.User[] userArr, TLRPC.TL_requestPeerTypeCreateBot tL_requestPeerTypeCreateBot) {
        this.a = 22;
        this.b = r90Var;
        this.e = g2Var;
        this.c = userArr;
        this.d = tL_requestPeerTypeCreateBot;
    }
}
