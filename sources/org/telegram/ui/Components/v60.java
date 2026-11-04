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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v60(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.StickerSet stickerSet;
        org.telegram.messenger.c cVar;
        org.telegram.messenger.c cVar2;
        org.telegram.ui.w10 w10Var;
        boolean z10;
        String a02;
        int i3;
        int i10;
        int i11;
        int i12;
        int i13 = this.a;
        int i14 = 3;
        int i15 = 16;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.b;
        Object obj4 = this.c;
        int i16 = 0;
        switch (i13) {
            case 0:
                x60 x60Var = (x60) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj2;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) obj;
                org.telegram.ui.ActionBar.d2 d2Var = x60Var.l1;
                if (d2Var != null && d2Var.getParentActivity() != null) {
                    if (tL_error != null) {
                        "USER_ALREADY_PARTICIPANT".equals(tL_error.text);
                        t4.e0(x60Var.a, tL_error, d2Var, tL_messages_importChatInvite, new Object[0]);
                        break;
                    } else if (updates != null && !updates.chats.isEmpty()) {
                        TLRPC.Chat chat = updates.chats.get(0);
                        chat.left = false;
                        chat.kicked = false;
                        org.telegram.messenger.hp.s1(x60Var.a).Y3(updates.users, false);
                        org.telegram.messenger.hp.s1(x60Var.a).S3(updates.chats, false);
                        long j10 = chat.id;
                        boolean z11 = !org.telegram.messenger.t3.V(chat);
                        x60Var.getClass();
                        Bundle j11 = a1.g.j(j10, "chat_id");
                        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(x60Var.a);
                        org.telegram.ui.ActionBar.d2 d2Var2 = x60Var.l1;
                        if (s12.E(j11, d2Var2, null, null)) {
                            d2Var2.presentFragment(new w60(x60Var, j11, z11, j10), d2Var2 instanceof org.telegram.ui.wm);
                            break;
                        }
                    }
                }
                break;
            case 1:
                m70 m70Var = (m70) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj;
                m70Var.E = false;
                m70Var.M = tL_chatInviteExported.link;
                if (tL_error2 == null) {
                    TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
                    if (tL_chatInviteExported.importers == null) {
                        tL_chatInviteExported.importers = new ArrayList<>(3);
                    }
                    tL_chatInviteExported.importers.clear();
                    for (int i17 = 0; i17 < tL_messages_chatInviteImporters.users.size(); i17++) {
                        tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
                    }
                    m70Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
                    break;
                }
                break;
            case 2:
                r80 r80Var = (r80) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                boolean[] zArr = (boolean[]) obj;
                ((boolean[]) obj3)[0] = true;
                org.telegram.messenger.g0.r(r80Var.R);
                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                    ((TL_stories.StoryItem) arrayList.get(i18)).pinned = zArr[i18];
                }
                r80Var.getMessagesController().P1().q0(r80Var.e, arrayList, false);
                break;
            case 3:
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                gi.d dVar = (gi.d) obj4;
                org.telegram.ui.q6 q6Var = (org.telegram.ui.q6) obj2;
                Runnable runnable = (Runnable) obj;
                if (tL_error3 != null) {
                    fc.X().f0(tL_error3, false);
                    break;
                } else {
                    dVar.setLoading(false);
                    q6Var.dismiss();
                    org.telegram.messenger.k5.o(null, 2131747051, fc.X(), R.raw.chats_infotip, 36);
                    runnable.run();
                    break;
                }
            case 4:
                org.telegram.ui.uw uwVar = (org.telegram.ui.uw) obj3;
                uwVar.showDialog(new i20((Context) obj2, uwVar.getResourceProvider(), new j50(13, (bm0) obj4, uwVar)));
                ((f60) obj).u();
                break;
            case 5:
                org.telegram.ui.uw uwVar2 = (org.telegram.ui.uw) obj3;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                f60 f60Var = (f60) obj;
                byte[] bArr = tL_sponsoredPeer.random_id;
                org.telegram.ui.ActionBar.e6 resourceProvider = uwVar2.getResourceProvider();
                j50 j50Var = new j50(12, (bm0) obj4, tL_sponsoredPeer);
                int i19 = org.telegram.ui.ey0.t1;
                int currentAccount = uwVar2.getCurrentAccount();
                Activity parentActivity = uwVar2.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new org.telegram.messenger.gx(parentActivity, resourceProvider, bArr, uwVar2, j50Var, currentAccount));
                }
                f60Var.u();
                break;
            case 6:
                ((AtomicReference) obj3).set(null);
                ((xn0) obj2).didReceivedNotification(org.telegram.messenger.hs.q5, ((oo0) obj4).a, Long.valueOf(-((TLRPC.Dialog) obj).id));
                break;
            case 7:
                xv0 xv0Var = (xv0) obj4;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                org.telegram.messenger.li liVar = (org.telegram.messenger.li) obj;
                xv0Var.X1 = 0;
                if (tL_error4 == null) {
                    rk0 rk0Var = new rk0(xv0Var, 1);
                    rk0Var.addTarget(xv0Var.b);
                    TransitionManager.beginDelayedTransition(xv0Var.c, rk0Var);
                    xv0Var.p1.setVisibility(0);
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                    xv0Var.K1 = tL_messages_stickerSet;
                    liVar.I1(tL_messages_stickerSet, false);
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = xv0Var.K1;
                    if (tL_messages_stickerSet2 == null || !tL_messages_stickerSet2.documents.isEmpty()) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = xv0Var.K1;
                        xv0Var.Z1 = (tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || stickerSet.masks) ? false : true;
                        xv0Var.J0();
                        liVar.q1(xv0Var.K1);
                        xv0Var.a1();
                        xv0Var.Z0();
                        xv0Var.Y0();
                        xv0Var.l1.f();
                        break;
                    } else {
                        xv0Var.dismiss();
                        break;
                    }
                } else {
                    xv0Var.dismiss();
                    org.telegram.ui.ActionBar.d2 d2Var3 = xv0Var.D1;
                    if (d2Var3 != null) {
                        org.telegram.messenger.k5.p(null, 2131754385, fc.a0(d2Var3), null);
                        break;
                    }
                }
                break;
            case 8:
                org.telegram.ui.go0 go0Var = (org.telegram.ui.go0) obj4;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj;
                go0Var.X1 = 0;
                if (tL_error5 != null || !(tLObject3 instanceof Vector)) {
                    t4.e0(go0Var.a, tL_error5, go0Var.D1, tL_messages_getAttachedStickers, new Object[0]);
                    go0Var.dismiss();
                    break;
                } else {
                    Vector vector = (Vector) tLObject3;
                    if (vector.objects.isEmpty()) {
                        go0Var.dismiss();
                        break;
                    } else if (vector.objects.size() == 1) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(0);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        go0Var.N1 = tL_inputStickerSetID;
                        TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                        tL_inputStickerSetID.id = stickerSet2.id;
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        go0Var.R0();
                        break;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        go0Var.O1 = arrayList2;
                        arrayList2.addAll(vector.objects);
                        go0Var.k1.setLayoutParams(b8.mf.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                        go0Var.o1.setVisibility(8);
                        go0Var.B1[0].setVisibility(8);
                        go0Var.l1.f();
                        break;
                    }
                }
                break;
            case 9:
                ky0 ky0Var = (ky0) obj4;
                TLObject tLObject4 = (TLObject) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj3;
                try {
                    ((org.telegram.ui.ActionBar.s1) obj2).dismiss();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (tLObject4 instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.hp.s1(ky0Var.d).A3(0);
                    break;
                } else if (tL_error6 == null || tL_error6.code != -1000) {
                    String M0 = org.telegram.messenger.bd.M0(2131751106, null);
                    if (tL_error6 != null) {
                        StringBuilder h = t4.c.h(M0, "\n");
                        h.append(tL_error6.text);
                        M0 = h.toString();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ky0Var.getContext());
                    String M02 = org.telegram.messenger.bd.M0(R.string.AppName, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                    s1Var.S = M02;
                    s1Var.U = M0;
                    k2.p1.B(null, 2131747839, alertDialog$Builder, null);
                    break;
                }
                break;
            case 10:
                g11 g11Var = (g11) obj4;
                ((f60) obj3).u();
                ((org.telegram.messenger.hp) obj2).q7.t(-g11Var.f, ((TLRPC.TL_forumTopic) obj).id, !r2.pinned, g11Var.s);
                break;
            case 11:
                f21 f21Var = (f21) obj4;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                q11 q11Var = f21Var.w1;
                e21 e21Var = f21Var.F1;
                f21Var.j1 = null;
                if (tL_error7 == null || !"TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error7.text)) {
                    if (tLObject5 instanceof TLRPC.TL_messages_translateResult) {
                        TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) tLObject5;
                        if (!tL_messages_translateResult.result.isEmpty() && tL_messages_translateResult.result.get(0) != null && tL_messages_translateResult.result.get(0).text != null) {
                            f21Var.M1 = false;
                            TLRPC.TL_textWithEntities P0 = f21.P0(tL_textWithEntities, tL_messages_translateResult.result.get(0));
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(P0.text);
                            org.telegram.messenger.zi.b(valueOf, P0.entities, false, true, false, false, 0);
                            f21Var.x1.setText(f21Var.Q0(valueOf));
                            e21Var.D(q11Var);
                            break;
                        }
                    }
                    if (f21Var.M1) {
                        f21Var.dismiss();
                        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.P4, 1, org.telegram.messenger.bd.M0(2131743956, null));
                        break;
                    } else {
                        org.telegram.messenger.k5.p(null, 2131743956, new fc((FrameLayout) f21Var.b, f21Var.J0), null);
                        b21 b21Var = f21Var.u1.e;
                        String str = f21Var.t1;
                        f21Var.s1 = str;
                        b21Var.setText(f21.O0(str, null, null));
                        e21Var.D(q11Var);
                        break;
                    }
                } else {
                    f21Var.X0();
                    break;
                }
                break;
            case 12:
                org.telegram.ui.x30 x30Var = (org.telegram.ui.x30) obj4;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) obj;
                org.telegram.messenger.c cVar3 = x30Var.l1;
                org.telegram.messenger.r3 r3Var = new org.telegram.messenger.r3();
                x30Var.S2 = r3Var;
                r3Var.b = new TLRPC.TL_groupCall();
                org.telegram.messenger.r3 r3Var2 = x30Var.S2;
                TLRPC.GroupCall groupCall = r3Var2.b;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                r3Var2.c = chat2 == null ? 0L : chat2.id;
                groupCall.schedule_date = x30Var.c4;
                groupCall.flags |= 128;
                r3Var2.C = cVar3;
                r3Var2.x(inputPeer);
                org.telegram.messenger.r3 r3Var3 = x30Var.S2;
                TLRPC.GroupCall groupCall2 = r3Var3.b;
                TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
                groupCall2.access_hash = groupCall3.access_hash;
                groupCall2.id = groupCall3.id;
                r3Var3.e();
                e10 e10Var = x30Var.h4;
                org.telegram.messenger.r3 r3Var4 = x30Var.S2;
                e10Var.c = r3Var4;
                x30Var.S3.setGroupCall(r3Var4);
                org.telegram.ui.a40 a40Var = x30Var.g4;
                org.telegram.messenger.r3 r3Var5 = x30Var.S2;
                a40Var.c = r3Var5;
                x30Var.U1.D0(cVar3.a, r3Var5.g(false));
                org.telegram.messenger.hp s13 = org.telegram.messenger.hp.s1(cVar3.a);
                org.telegram.messenger.r3 r3Var6 = x30Var.S2;
                s13.W3(r3Var6.c, r3Var6);
                break;
            case 13:
                org.telegram.ui.x30 x30Var2 = (org.telegram.ui.x30) obj4;
                org.telegram.messenger.r3 r3Var7 = (org.telegram.messenger.r3) obj2;
                String str2 = (String) obj;
                TL_account.getRequirementsToContact getrequirementstocontact = new TL_account.getRequirementsToContact();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                Iterator it = ((HashSet) obj3).iterator();
                while (it.hasNext()) {
                    Long l10 = (Long) it.next();
                    long longValue = l10.longValue();
                    if (r3Var7 != null) {
                        r3Var7.t(longValue);
                    }
                    arrayList3.add(org.telegram.messenger.hp.s1(x30Var2.a).a2(l10));
                    ArrayList<TLRPC.InputUser> arrayList6 = getrequirementstocontact.id;
                    org.telegram.messenger.hp s14 = org.telegram.messenger.hp.s1(x30Var2.a);
                    arrayList6.add(s14.q1(s14.a2(l10)));
                }
                org.telegram.ui.lq lqVar = new org.telegram.ui.lq(x30Var2, arrayList3, arrayList4, arrayList5, str2, 8);
                if (org.telegram.messenger.h10.i(x30Var2.a).q()) {
                    lqVar.run();
                    break;
                } else {
                    ConnectionsManager.getInstance(x30Var2.a).sendRequest(getrequirementstocontact, new org.telegram.ui.y9(arrayList3, arrayList4, lqVar, 13));
                    break;
                }
            case 14:
                TLObject tLObject6 = (TLObject) obj4;
                ArrayList arrayList7 = (ArrayList) obj3;
                ArrayList arrayList8 = (ArrayList) obj2;
                org.telegram.ui.lq lqVar2 = (org.telegram.ui.lq) obj;
                if (tLObject6 instanceof Vector) {
                    Vector vector2 = (Vector) tLObject6;
                    for (int i20 = 0; i20 < Math.min(arrayList7.size(), vector2.objects.size()); i20++) {
                        if (vector2.objects.get(i20) instanceof TL_account.requirementToContactPremium) {
                            arrayList8.add(Long.valueOf(((TLRPC.User) arrayList7.get(i20)).id));
                        }
                    }
                }
                lqVar2.run();
                break;
            case 15:
                org.telegram.ui.g30 g30Var = (org.telegram.ui.g30) obj4;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                String str3 = (String) obj;
                org.telegram.ui.x30 x30Var3 = g30Var.f;
                org.telegram.messenger.c cVar4 = x30Var3.l1;
                org.telegram.ui.w10 w10Var2 = x30Var3.j1;
                org.telegram.messenger.ac acVar = g30Var.d;
                if (acVar != null) {
                    w10Var2.L0 = acVar;
                    w10Var2.r1 = null;
                    w10Var2.s1 = null;
                    g30Var.d = null;
                }
                if (tL_error8 == null) {
                    org.telegram.messenger.hp s15 = org.telegram.messenger.hp.s1(cVar4.a);
                    int i21 = cVar4.a;
                    TLRPC.User a22 = s15.a2(Long.valueOf(org.telegram.messenger.h10.i(i21).e()));
                    if (a22 == null) {
                        a22 = org.telegram.messenger.h10.i(i21).f();
                        if (a22 != null) {
                            org.telegram.messenger.hp.s1(i21).X3(a22, false, false);
                        }
                    } else {
                        org.telegram.messenger.h10.i(i21).w(a22);
                    }
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject7;
                    ArrayList<TLRPC.PhotoSize> arrayList9 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList9, org.telegram.messenger.hs.g2, false, null, false);
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(arrayList9, 800, false, null, false);
                    TLRPC.VideoSize videoSize = tL_photos_photo.photo.video_sizes.isEmpty() ? null : tL_photos_photo.photo.video_sizes.get(0);
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    a22.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
                    if (w10 != null) {
                        tL_userProfilePhoto.photo_small = w10.location;
                    }
                    if (w11 != null) {
                        tL_userProfilePhoto.photo_big = w11.location;
                    }
                    if (w10 == null || g30Var.c == null) {
                        cVar2 = cVar4;
                        w10Var = w10Var2;
                        z10 = true;
                    } else {
                        org.telegram.messenger.w7.G(x30Var3.a);
                        File K = org.telegram.messenger.w7.K(w10, null, true, true);
                        org.telegram.messenger.w7.G(x30Var3.a);
                        org.telegram.messenger.w7.K(g30Var.c, null, true, true).renameTo(K);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(g30Var.c.volume_id);
                        sb2.append("_");
                        String o10 = a1.g.o(g30Var.c.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        cVar2 = cVar4;
                        w10Var = w10Var2;
                        sb3.append(w10.location.volume_id);
                        sb3.append("_");
                        z10 = true;
                        org.telegram.messenger.zb.D().S(o10, a1.g.o(w10.location.local_id, "@50_50", sb3), org.telegram.messenger.ac.l(x30Var3.a, 1, a22));
                    }
                    if (w11 != null && g30Var.b != null) {
                        org.telegram.messenger.w7.G(x30Var3.a);
                        File K2 = org.telegram.messenger.w7.K(w11, null, z10, z10);
                        org.telegram.messenger.w7.G(x30Var3.a);
                        org.telegram.messenger.w7.K(g30Var.b, null, z10, z10).renameTo(K2);
                    }
                    if (videoSize != null && str3 != null) {
                        org.telegram.messenger.w7.G(x30Var3.a);
                        new File(str3).renameTo(org.telegram.messenger.w7.K(videoSize, "mp4", z10, z10));
                    }
                    org.telegram.messenger.hp.s1(i21).U0(a22.id).f();
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.add(a22);
                    org.telegram.messenger.qr.a0(i21).m1(arrayList10, null, false, true);
                    TLRPC.User a23 = org.telegram.messenger.hp.s1(i21).a2(Long.valueOf(g30Var.e));
                    org.telegram.messenger.ac l11 = org.telegram.messenger.ac.l(i21, 0, a23);
                    org.telegram.messenger.ac l12 = org.telegram.messenger.ac.l(i21, 1, a23);
                    if (org.telegram.messenger.ac.e(g30Var.b) == null) {
                        l12 = org.telegram.messenger.ac.e(g30Var.c);
                    }
                    org.telegram.ui.w10 w10Var3 = w10Var;
                    w10Var3.setCreateThumbFromParent(false);
                    w10Var3.H(null, l11, l12, true);
                    g30Var.c = null;
                    g30Var.b = null;
                    org.telegram.messenger.g0.b4(x30Var3.I1);
                    g30Var.a(1.0f);
                    cVar = cVar2;
                } else {
                    cVar = cVar4;
                }
                int i22 = cVar.a;
                int i23 = cVar.a;
                org.telegram.messenger.hs.f(i22).k(2, Integer.valueOf(org.telegram.messenger.hp.C8));
                org.telegram.messenger.hs.f(i23).k(46, new Object[0]);
                org.telegram.messenger.h10.i(i23).v(true);
                break;
            case 16:
                org.telegram.ui.y40.Z((org.telegram.ui.y40) obj4, (ArrayList) obj3, (ArrayList) obj2, (CountDownLatch) obj);
                break;
            case 17:
                org.telegram.ui.f50 f50Var = (org.telegram.ui.f50) obj4;
                f50Var.d = (ArrayList) obj3;
                f50Var.e = (ArrayList) obj2;
                f50Var.f();
                org.telegram.ui.g50 g50Var = f50Var.r;
                g50Var.b.d.setVisibility(8);
                g50Var.b.e.setText(org.telegram.messenger.bd.a0(null, null, 2131752117, (String) obj));
                g50Var.b.e(false, true);
                break;
            case 18:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                org.telegram.ui.ly lyVar = (org.telegram.ui.ly) obj2;
                TLObject tLObject8 = (TLObject) obj;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj3;
                String str4 = LaunchActivity.E1;
                try {
                    lyVar.run();
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
                if (tLObject8 instanceof TLRPC.TL_langPackLanguage) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) tLObject8;
                    Pattern pattern = t4.a;
                    tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    String str5 = tL_langPackLanguage.base_lang_code;
                    if (str5 != null) {
                        tL_langPackLanguage.base_lang_code = str5.replace('-', '_').toLowerCase();
                    }
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(launchActivity);
                    boolean equals = org.telegram.messenger.bd.E0().B.c.equals(tL_langPackLanguage.lang_code);
                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                    if (equals) {
                        s1Var2.S = org.telegram.messenger.bd.M0(2131749062, null);
                        a02 = org.telegram.messenger.bd.a0("LanguageSame", null, 2131749055, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131747839, null), null);
                        alertDialog$Builder2.i(org.telegram.messenger.bd.M0(2131745993, null), new x0(launchActivity, i16));
                    } else if (tL_langPackLanguage.strings_count == 0) {
                        s1Var2.S = org.telegram.messenger.bd.M0(2131749052, null);
                        a02 = org.telegram.messenger.bd.a0("LanguageUnknownCustomAlert", null, 2131749053, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131747839, null), null);
                    } else {
                        s1Var2.S = org.telegram.messenger.bd.M0(2131749054, null);
                        a02 = tL_langPackLanguage.official ? org.telegram.messenger.bd.a0("LanguageAlert", null, 2131749061, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f))) : org.telegram.messenger.bd.a0("LanguageCustomAlert", null, 2131749058, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131752552, null), new org.telegram.ui.jo(4, tL_langPackLanguage, launchActivity));
                        alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(a02));
                    int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '[');
                    if (indexOf != -1) {
                        int i24 = indexOf + 1;
                        i3 = TextUtils.indexOf((CharSequence) spannableStringBuilder, ']', i24);
                        if (i3 != -1) {
                            spannableStringBuilder.delete(i3, i3 + 1);
                            spannableStringBuilder.delete(indexOf, i24);
                        }
                    } else {
                        i3 = -1;
                    }
                    if (indexOf != -1 && i3 != -1) {
                        spannableStringBuilder.setSpan(new l3(tL_langPackLanguage.translations_url, alertDialog$Builder2), indexOf, i3 - 1, 33);
                    }
                    TextView textView = new TextView(launchActivity);
                    textView.setText(spannableStringBuilder);
                    textView.setTextSize(1, 16.0f);
                    org.telegram.ui.ActionBar.r6.H(textView, org.telegram.ui.ActionBar.k6.k5, null);
                    org.telegram.ui.ActionBar.r6.D(textView, org.telegram.ui.ActionBar.k6.l5, null);
                    textView.setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
                    textView.setMovementMethod(new org.telegram.messenger.c0(false));
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, null);
                    alertDialog$Builder2.o(textView);
                    launchActivity.F0(alertDialog$Builder2);
                    break;
                } else if (tL_error9 != null) {
                    if ("LANG_CODE_NOT_SUPPORTED".equals(tL_error9.text)) {
                        launchActivity.F0(t4.M(launchActivity, null, org.telegram.messenger.bd.M0(2131749051, null)));
                        break;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        org.telegram.messenger.camera.q.q(null, 2131751106, sb4, "\n");
                        sb4.append(tL_error9.text);
                        launchActivity.F0(t4.M(launchActivity, null, sb4.toString()));
                        break;
                    }
                }
                break;
            case 19:
                org.telegram.ui.ActionBar.s1 s1Var3 = (org.telegram.ui.ActionBar.s1) obj4;
                TLObject tLObject9 = (TLObject) obj2;
                org.telegram.ui.g gVar = (org.telegram.ui.g) obj;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj3;
                String str6 = LaunchActivity.E1;
                try {
                    s1Var3.dismiss();
                } catch (Exception unused) {
                }
                if (!(tLObject9 instanceof TLRPC.TL_authorization)) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.ly(16, gVar, tL_error10));
                    break;
                }
                break;
            case 20:
                org.telegram.ui.m90 m90Var = (org.telegram.ui.m90) obj4;
                org.telegram.ui.ActionBar.d2 d2Var4 = (org.telegram.ui.ActionBar.d2) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                lq.e(d2Var4.getContext(), m90Var.b, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) obj, true, new ei(i15, m90Var, userArr), d2Var4.getResourceProvider(), org.telegram.ui.m90.d());
                break;
            case 21:
                org.telegram.ui.j90.z0((org.telegram.ui.j90) obj4, (TLObject) obj2, (HashSet) obj, (TLRPC.TL_error) obj3);
                break;
            case 22:
                EditText editText = (EditText) obj2;
                ai.a0 a0Var = (ai.a0) obj;
                ((gb0) obj4).a(0.0f);
                ((View) obj3).setTag(R.id.timeout_callback, null);
                if (editText != null) {
                    editText.post(new org.telegram.ui.ly(28, editText, a0Var));
                    break;
                }
                break;
            case 23:
                org.telegram.ui.qb0 qb0Var = (org.telegram.ui.qb0) obj4;
                String str7 = (String) obj3;
                String str8 = (String) obj2;
                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = (TLRPC.TL_auth_recoverPassword) obj;
                byte[] h12 = str7 != null ? org.telegram.messenger.g0.h1(str7) : null;
                org.telegram.ui.pb0 pb0Var = new org.telegram.ui.pb0(qb0Var, str7, str8, i16);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = qb0Var.s.new_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    if (str7 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = org.telegram.messenger.hv.b(h12, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error11 = new TLRPC.TL_error();
                            tL_error11.text = "ALGO_INVALID";
                            pb0Var.run(null, tL_error11);
                        }
                    }
                    i10 = ((org.telegram.ui.ActionBar.d2) qb0Var.H).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_auth_recoverPassword, pb0Var, 10);
                    break;
                } else {
                    TLRPC.TL_error tL_error12 = new TLRPC.TL_error();
                    tL_error12.text = "PASSWORD_HASH_INVALID";
                    pb0Var.run(null, tL_error12);
                    break;
                }
            case 24:
                org.telegram.ui.fc0 fc0Var = (org.telegram.ui.fc0) obj4;
                String str9 = (String) obj;
                TLRPC.TL_error tL_error13 = (TLRPC.TL_error) obj3;
                org.telegram.ui.xd0 xd0Var = fc0Var.E;
                xd0Var.t1(false, true);
                fc0Var.n = false;
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", str9);
                    bundle.putString("password", fc0Var.h);
                    xd0Var.D1(9, true, bundle, false);
                    break;
                } else if (tL_error13 != null && !tL_error13.text.startsWith("CODE_INVALID")) {
                    if (tL_error13.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error13.text).intValue();
                        xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.bd.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.bd.G(intValue / 60, "Minutes", new Object[0])));
                        break;
                    } else {
                        xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), tL_error13.text);
                        break;
                    }
                } else {
                    fc0Var.n(true);
                    break;
                }
            case 25:
                org.telegram.ui.dd0 dd0Var = (org.telegram.ui.dd0) obj4;
                TLRPC.TL_error tL_error14 = (TLRPC.TL_error) obj3;
                Bundle bundle2 = (Bundle) obj2;
                TLObject tLObject10 = (TLObject) obj;
                org.telegram.ui.xd0 xd0Var2 = dd0Var.v0;
                dd0Var.g0 = false;
                if (tL_error14 == null) {
                    dd0Var.r0 = bundle2;
                    if (tLObject10 instanceof TLRPC.TL_auth_sentCode) {
                        TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject10;
                        dd0Var.s0 = tL_auth_sentCode;
                        TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                        if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                            dd0Var.j0 = 17;
                        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                            dd0Var.j0 = 16;
                        }
                        xd0Var2.p1(bundle2, tL_auth_sentCode, true);
                    } else if (tLObject10 instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
                        TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) tLObject10;
                        bundle2.putString("product", tL_auth_sentCodePaymentRequired.store_product);
                        bundle2.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
                        bundle2.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
                        bundle2.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
                        bundle2.putString("currency", tL_auth_sentCodePaymentRequired.currency);
                        bundle2.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
                        bundle2.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
                        xd0Var2.D1(18, true, bundle2, true);
                    }
                } else {
                    String str10 = tL_error14.text;
                    if (str10 != null) {
                        if (str10.contains("PHONE_NUMBER_INVALID")) {
                            xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131749187, null));
                        } else if (tL_error14.text.contains("PHONE_CODE_EMPTY") || tL_error14.text.contains("PHONE_CODE_INVALID")) {
                            xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131749191, null));
                        } else if (tL_error14.text.contains("PHONE_CODE_EXPIRED")) {
                            dd0Var.c(true);
                            xd0Var2.D1(0, true, null, true);
                            xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131752021, null));
                        } else if (tL_error14.text.startsWith("FLOOD_WAIT")) {
                            xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131750688, null));
                        } else if (tL_error14.code != -1000) {
                            String M03 = org.telegram.messenger.bd.M0(2131746081, null);
                            StringBuilder sb5 = new StringBuilder();
                            org.telegram.messenger.camera.q.q(null, 2131751106, sb5, "\n");
                            sb5.append(tL_error14.text);
                            xd0Var2.u1(M03, sb5.toString());
                        }
                    }
                }
                dd0Var.y(false);
                break;
            case 26:
                org.telegram.ui.id0.n((org.telegram.ui.id0) obj4, (String) obj3, (String) obj2, (String) obj);
                break;
            case 27:
                e5.l lVar = (e5.l) obj3;
                org.telegram.ui.s3 s3Var = (org.telegram.ui.s3) obj2;
                org.telegram.ui.xd0 xd0Var3 = ((org.telegram.ui.id0) obj4).w;
                xd0Var3.e = true;
                org.telegram.messenger.r1.i().d(lVar.c, new org.telegram.ui.g3(s3Var, i14));
                org.telegram.messenger.r1.i().h = new org.telegram.ui.hd0(s3Var, i16);
                org.telegram.messenger.r1 i25 = org.telegram.messenger.r1.i();
                Activity parentActivity2 = xd0Var3.getParentActivity();
                i11 = ((org.telegram.ui.ActionBar.d2) xd0Var3).currentAccount;
                org.telegram.messenger.c a10 = org.telegram.messenger.c.a(i11);
                tf.b bVar = new tf.b();
                bVar.B(lVar);
                i25.l(parentActivity2, a10, (TLRPC.TL_inputStorePaymentAuthCode) obj, Collections.singletonList(bVar.k()));
                break;
            case 28:
                org.telegram.ui.wd0 wd0Var = (org.telegram.ui.wd0) obj4;
                TLRPC.TL_error tL_error15 = (TLRPC.TL_error) obj3;
                TLObject tLObject11 = (TLObject) obj2;
                String str11 = (String) obj;
                wd0Var.N = false;
                org.telegram.ui.xd0 xd0Var4 = wd0Var.b0;
                xd0Var4.E1(false, true);
                if (tL_error15 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject11;
                    if (TwoStepVerificationActivity.n0(password, true)) {
                        Bundle bundle3 = new Bundle();
                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                        password.serializeToStream(serializedData);
                        bundle3.putString("password", Utilities.f(serializedData.toByteArray()));
                        bundle3.putString("phoneFormated", str11);
                        xd0Var4.D1(6, true, bundle3, false);
                        break;
                    } else {
                        t4.w0(xd0Var4.getParentActivity(), org.telegram.messenger.bd.M0(2131743830, "UpdateAppAlert"), true);
                        break;
                    }
                } else {
                    xd0Var4.u1(org.telegram.messenger.bd.M0(2131746081, null), tL_error15.text);
                    break;
                }
            default:
                org.telegram.ui.ag0 ag0Var = (org.telegram.ui.ag0) obj4;
                ng.b bVar2 = (ng.b) obj3;
                String str12 = (String) obj2;
                org.telegram.ui.q41 q41Var = (org.telegram.ui.q41) obj;
                org.telegram.ui.dg0 dg0Var = ag0Var.w.d;
                if (bVar2 != null) {
                    dg0Var.w.l(str12, bVar2);
                }
                if (bVar2 != null && !q41Var.b && (i12 = q41Var.a) >= 0) {
                    View m10 = dg0Var.h.m(i12);
                    if (m10 instanceof org.telegram.ui.b41) {
                        ag0Var.r.e = bVar2;
                        org.telegram.ui.b41 b41Var = (org.telegram.ui.b41) m10;
                        b41Var.b.u0.d(false, false);
                        b41Var.g(false);
                    }
                }
                ag0Var.f();
                break;
        }
    }

    public /* synthetic */ v60(Object obj, Object obj2, Object obj3, TLRPC.TL_error tL_error, int i3) {
        this.a = i3;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = tL_error;
    }

    public /* synthetic */ v60(TLRPC.TL_error tL_error, gi.d dVar, org.telegram.ui.q6 q6Var, Runnable runnable) {
        this.a = 3;
        this.b = tL_error;
        this.c = dVar;
        this.d = q6Var;
        this.e = runnable;
    }

    public /* synthetic */ v60(m70 m70Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject) {
        this.a = 1;
        this.c = m70Var;
        this.d = tL_chatInviteExported;
        this.b = tL_error;
        this.e = tLObject;
    }
}
