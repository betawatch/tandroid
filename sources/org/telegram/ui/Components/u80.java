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
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class u80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ u80(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        org.telegram.ui.be0 be0Var = (org.telegram.ui.be0) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLObject tLObject = (TLObject) this.d;
        String str = (String) this.e;
        be0Var.N = false;
        org.telegram.ui.ce0 ce0Var = be0Var.h0;
        ce0Var.N1(false, true);
        if (tL_error != null) {
            ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), tL_error.text);
            return;
        }
        TL_account.Password password = (TL_account.Password) tLObject;
        if (!TwoStepVerificationActivity.n0(password, true)) {
            t4.u0(ce0Var.getParentActivity(), org.telegram.messenger.hd.M0(2131743820, "UpdateAppAlert"), true);
            return;
        }
        Bundle bundle = new Bundle();
        SerializedData serializedData = new SerializedData(password.getObjectSize());
        password.serializeToStream(serializedData);
        bundle.putString("password", Utilities.f(serializedData.toByteArray()));
        bundle.putString("phoneFormated", str);
        ce0Var.M1(6, true, bundle, false);
    }

    private final void b() {
        int i7;
        org.telegram.ui.gg0 gg0Var = (org.telegram.ui.gg0) this.b;
        mg.b bVar = (mg.b) this.c;
        String str = (String) this.d;
        org.telegram.ui.y41 y41Var = (org.telegram.ui.y41) this.e;
        org.telegram.ui.jg0 jg0Var = gg0Var.w.d;
        if (bVar != null) {
            jg0Var.w.l(str, bVar);
        }
        if (bVar != null && !y41Var.b && (i7 = y41Var.a) >= 0) {
            View m10 = jg0Var.h.m(i7);
            if (m10 instanceof org.telegram.ui.j41) {
                gg0Var.r.e = bVar;
                org.telegram.ui.j41 j41Var = (org.telegram.ui.j41) m10;
                j41Var.b.u0.d(false, false);
                j41Var.g(false);
            }
        }
        gg0Var.f();
    }

    private final void c() {
        org.telegram.ui.oh0 oh0Var = (org.telegram.ui.oh0) this.b;
        ArrayList arrayList = (ArrayList) this.e;
        ArrayList arrayList2 = (ArrayList) this.c;
        ArrayList arrayList3 = (ArrayList) this.d;
        jg.z1 z1Var = oh0Var.h;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = oh0Var.n;
        if (notificationsCustomSettingsActivity.f) {
            oh0Var.f = null;
            oh0Var.d = arrayList;
            oh0Var.e = arrayList2;
            z1Var.f(arrayList3, null);
            if (notificationsCustomSettingsActivity.f && !z1Var.e()) {
                notificationsCustomSettingsActivity.c.c();
            }
            oh0Var.f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Type inference failed for: r0v117, types: [org.telegram.ui.ce0] */
    /* JADX WARN: Type inference failed for: r0v95, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r14v18, types: [android.content.Context, java.lang.Object, org.telegram.ui.LaunchActivity] */
    /* JADX WARN: Type inference failed for: r23v10 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r23v9 */
    /* JADX WARN: Type inference failed for: r6v59 */
    /* JADX WARN: Type inference failed for: r6v60 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean, int] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.StickerSet stickerSet;
        org.telegram.messenger.c cVar;
        ?? r92;
        String str;
        boolean z10;
        String a02;
        int i7;
        int i10;
        char c10;
        String G;
        int i11;
        String str2;
        boolean z11;
        String a03;
        org.telegram.ui.ActionBar.e2 T;
        xb I;
        org.telegram.ui.jl0 jl0Var;
        org.telegram.ui.jl0 jl0Var2;
        int i12 = this.a;
        int i13 = 18;
        int i14 = 17;
        int i15 = 3;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i12) {
            case 0:
                y80 y80Var = (y80) obj4;
                ArrayList arrayList = (ArrayList) obj;
                boolean[] zArr = (boolean[]) obj2;
                ((boolean[]) obj3)[0] = true;
                org.telegram.messenger.g0.r(y80Var.R);
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    ((TL_stories.StoryItem) arrayList.get(i16)).pinned = zArr[i16];
                }
                y80Var.getMessagesController().P1().q0(y80Var.e, arrayList, false);
                break;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                hi.d dVar = (hi.d) obj3;
                org.telegram.ui.p6 p6Var = (org.telegram.ui.p6) obj2;
                Runnable runnable = (Runnable) obj;
                if (tL_error != null) {
                    cc.X().f0(tL_error, false);
                    break;
                } else {
                    dVar.setLoading(false);
                    p6Var.dismiss();
                    org.telegram.messenger.k5.n(null, 2131747043, cc.X(), R.raw.chats_infotip, 36);
                    runnable.run();
                    break;
                }
            case 2:
                org.telegram.ui.yw ywVar = (org.telegram.ui.yw) obj3;
                ywVar.showDialog(new p20((Context) obj2, ywVar.getResourceProvider(), new hh0(2, (cm0) obj4, ywVar)));
                ((m60) obj).u();
                break;
            case 3:
                org.telegram.ui.yw ywVar2 = (org.telegram.ui.yw) obj3;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                m60 m60Var = (m60) obj;
                byte[] bArr = tL_sponsoredPeer.random_id;
                org.telegram.ui.ActionBar.e6 resourceProvider = ywVar2.getResourceProvider();
                hh0 hh0Var = new hh0(1, (cm0) obj4, tL_sponsoredPeer);
                int i17 = org.telegram.ui.my0.w1;
                int currentAccount = ywVar2.getCurrentAccount();
                Activity parentActivity = ywVar2.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new org.telegram.messenger.lx(parentActivity, resourceProvider, bArr, ywVar2, hh0Var, currentAccount));
                }
                m60Var.u();
                break;
            case 4:
                ((AtomicReference) obj3).set(null);
                ((yn0) obj2).didReceivedNotification(org.telegram.messenger.ns.q5, ((po0) obj4).a, Long.valueOf(-((TLRPC.Dialog) obj).id));
                break;
            case 5:
                bw0 bw0Var = (bw0) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                org.telegram.messenger.si siVar = (org.telegram.messenger.si) obj;
                bw0Var.a2 = 0;
                if (tL_error2 == null) {
                    sk0 sk0Var = new sk0(bw0Var, 1);
                    sk0Var.addTarget(bw0Var.b);
                    TransitionManager.beginDelayedTransition(bw0Var.c, sk0Var);
                    bw0Var.s1.setVisibility(0);
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                    bw0Var.N1 = tL_messages_stickerSet;
                    siVar.I1(tL_messages_stickerSet, false);
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = bw0Var.N1;
                    if (tL_messages_stickerSet2 == null || !tL_messages_stickerSet2.documents.isEmpty()) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = bw0Var.N1;
                        bw0Var.c2 = (tL_messages_stickerSet3 == null || (stickerSet = tL_messages_stickerSet3.set) == null || stickerSet.masks) ? false : true;
                        bw0Var.J0();
                        siVar.q1(bw0Var.N1);
                        bw0Var.a1();
                        bw0Var.Z0();
                        bw0Var.Y0();
                        bw0Var.o1.f();
                        break;
                    } else {
                        bw0Var.dismiss();
                        break;
                    }
                } else {
                    bw0Var.dismiss();
                    org.telegram.ui.ActionBar.e2 e2Var = bw0Var.G1;
                    if (e2Var != null) {
                        org.telegram.messenger.k5.o(null, 2131754385, cc.a0(e2Var), null);
                        break;
                    }
                }
                break;
            case 6:
                org.telegram.ui.no0 no0Var = (org.telegram.ui.no0) obj4;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj;
                no0Var.a2 = 0;
                if (tL_error3 != null || !(tLObject2 instanceof Vector)) {
                    t4.c0(no0Var.a, tL_error3, no0Var.G1, tL_messages_getAttachedStickers, new Object[0]);
                    no0Var.dismiss();
                    break;
                } else {
                    Vector vector = (Vector) tLObject2;
                    if (vector.objects.isEmpty()) {
                        no0Var.dismiss();
                        break;
                    } else if (vector.objects.size() == 1) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(0);
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        no0Var.Q1 = tL_inputStickerSetID;
                        TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                        tL_inputStickerSetID.id = stickerSet2.id;
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        no0Var.R0();
                        break;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        no0Var.R1 = arrayList2;
                        arrayList2.addAll(vector.objects);
                        no0Var.n1.setLayoutParams(c8.ja.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
                        no0Var.r1.setVisibility(8);
                        no0Var.E1[0].setVisibility(8);
                        no0Var.o1.f();
                        break;
                    }
                }
                break;
            case 7:
                ny0 ny0Var = (ny0) obj4;
                TLObject tLObject3 = (TLObject) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                try {
                    ((org.telegram.ui.ActionBar.t1) obj3).dismiss();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.np.s1(ny0Var.d).A3(0);
                    break;
                } else if (tL_error4 == null || tL_error4.code != -1000) {
                    String M0 = org.telegram.messenger.hd.M0(2131751105, null);
                    if (tL_error4 != null) {
                        StringBuilder m10 = r.b.m(M0, "\n");
                        m10.append(tL_error4.text);
                        M0 = m10.toString();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ny0Var.getContext());
                    String M02 = org.telegram.messenger.hd.M0(R.string.AppName, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.S = M02;
                    t1Var.U = M0;
                    i5.c.C(null, 2131747831, alertDialog$Builder, null);
                    break;
                }
                break;
            case 8:
                p11 p11Var = (p11) obj4;
                ((m60) obj3).u();
                ((org.telegram.messenger.np) obj2).r7.t(-p11Var.f, ((TLRPC.TL_forumTopic) obj).id, !r12.pinned, p11Var.s);
                break;
            case 9:
                p21 p21Var = (p21) obj4;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) obj;
                a21 a21Var = p21Var.z1;
                o21 o21Var = p21Var.I1;
                p21Var.m1 = null;
                if (tL_error5 == null || !"TRANSLATIONS_DISABLED_ALT".equalsIgnoreCase(tL_error5.text)) {
                    if (tLObject4 instanceof TLRPC.TL_messages_translateResult) {
                        TLRPC.TL_messages_translateResult tL_messages_translateResult = (TLRPC.TL_messages_translateResult) tLObject4;
                        if (!tL_messages_translateResult.result.isEmpty() && tL_messages_translateResult.result.get(0) != null && tL_messages_translateResult.result.get(0).text != null) {
                            p21Var.P1 = false;
                            TLRPC.TL_textWithEntities Q0 = p21.Q0(tL_textWithEntities, tL_messages_translateResult.result.get(0));
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(Q0.text);
                            org.telegram.messenger.gj.b(valueOf, Q0.entities, false, true, false, false, 0);
                            p21Var.A1.setText(p21Var.R0(valueOf));
                            o21Var.D(a21Var);
                            break;
                        }
                    }
                    if (p21Var.P1) {
                        p21Var.dismiss();
                        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.P4, 1, org.telegram.messenger.hd.M0(2131743946, null));
                        break;
                    } else {
                        org.telegram.messenger.k5.o(null, 2131743946, new cc((FrameLayout) p21Var.b, p21Var.J0), null);
                        l21 l21Var = p21Var.x1.e;
                        String str3 = p21Var.w1;
                        p21Var.v1 = str3;
                        l21Var.setText(p21.O0(str3, null, null));
                        o21Var.D(a21Var);
                        break;
                    }
                } else {
                    p21Var.Y0();
                    break;
                }
                break;
            case 10:
                org.telegram.ui.c40 c40Var = (org.telegram.ui.c40) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                TL_update.TL_updateGroupCall tL_updateGroupCall = (TL_update.TL_updateGroupCall) obj;
                org.telegram.messenger.c cVar2 = c40Var.o1;
                org.telegram.messenger.r3 r3Var = new org.telegram.messenger.r3();
                c40Var.V2 = r3Var;
                r3Var.b = new TLRPC.TL_groupCall();
                org.telegram.messenger.r3 r3Var2 = c40Var.V2;
                TLRPC.GroupCall groupCall = r3Var2.b;
                groupCall.participants_count = 0;
                groupCall.version = 1;
                groupCall.can_start_video = true;
                groupCall.can_change_join_muted = true;
                r3Var2.c = chat == null ? 0L : chat.id;
                groupCall.schedule_date = c40Var.j4;
                groupCall.flags |= 128;
                r3Var2.C = cVar2;
                r3Var2.x(inputPeer);
                org.telegram.messenger.r3 r3Var3 = c40Var.V2;
                TLRPC.GroupCall groupCall2 = r3Var3.b;
                TLRPC.GroupCall groupCall3 = tL_updateGroupCall.call;
                groupCall2.access_hash = groupCall3.access_hash;
                groupCall2.id = groupCall3.id;
                r3Var3.e();
                l10 l10Var = c40Var.o4;
                org.telegram.messenger.r3 r3Var4 = c40Var.V2;
                l10Var.c = r3Var4;
                c40Var.Z3.setGroupCall(r3Var4);
                org.telegram.ui.f40 f40Var = c40Var.n4;
                org.telegram.messenger.r3 r3Var5 = c40Var.V2;
                f40Var.c = r3Var5;
                c40Var.X1.D0(cVar2.a, r3Var5.g(false));
                org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(cVar2.a);
                org.telegram.messenger.r3 r3Var6 = c40Var.V2;
                s12.W3(r3Var6.c, r3Var6);
                break;
            case 11:
                org.telegram.ui.c40 c40Var2 = (org.telegram.ui.c40) obj4;
                org.telegram.messenger.r3 r3Var7 = (org.telegram.messenger.r3) obj2;
                String str4 = (String) obj;
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
                    arrayList3.add(org.telegram.messenger.np.s1(c40Var2.a).a2(l10));
                    ArrayList<TLRPC.InputUser> arrayList6 = getrequirementstocontact.id;
                    org.telegram.messenger.np s13 = org.telegram.messenger.np.s1(c40Var2.a);
                    arrayList6.add(s13.q1(s13.a2(l10)));
                }
                org.telegram.ui.hp hpVar = new org.telegram.ui.hp(c40Var2, arrayList3, arrayList4, arrayList5, str4, 10);
                if (org.telegram.messenger.m10.i(c40Var2.a).q()) {
                    hpVar.run();
                    break;
                } else {
                    ConnectionsManager.getInstance(c40Var2.a).sendRequest(getrequirementstocontact, new org.telegram.ui.z9(arrayList3, arrayList4, hpVar, 13));
                    break;
                }
            case 12:
                TLObject tLObject5 = (TLObject) obj4;
                ArrayList arrayList7 = (ArrayList) obj;
                ArrayList arrayList8 = (ArrayList) obj3;
                org.telegram.ui.hp hpVar2 = (org.telegram.ui.hp) obj2;
                if (tLObject5 instanceof Vector) {
                    Vector vector2 = (Vector) tLObject5;
                    for (int i18 = 0; i18 < Math.min(arrayList7.size(), vector2.objects.size()); i18++) {
                        if (vector2.objects.get(i18) instanceof TL_account.requirementToContactPremium) {
                            arrayList8.add(Long.valueOf(((TLRPC.User) arrayList7.get(i18)).id));
                        }
                    }
                }
                hpVar2.run();
                break;
            case 13:
                org.telegram.ui.l30 l30Var = (org.telegram.ui.l30) obj4;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                String str5 = (String) obj;
                org.telegram.ui.c40 c40Var3 = l30Var.f;
                org.telegram.messenger.c cVar3 = c40Var3.o1;
                org.telegram.ui.a20 a20Var = c40Var3.m1;
                org.telegram.messenger.gc gcVar = l30Var.d;
                if (gcVar != null) {
                    a20Var.L0 = gcVar;
                    a20Var.r1 = null;
                    a20Var.s1 = null;
                    l30Var.d = null;
                }
                if (tL_error6 == null) {
                    org.telegram.messenger.np s14 = org.telegram.messenger.np.s1(cVar3.a);
                    int i19 = cVar3.a;
                    TLRPC.User a22 = s14.a2(Long.valueOf(org.telegram.messenger.m10.i(i19).e()));
                    if (a22 == null) {
                        a22 = org.telegram.messenger.m10.i(i19).f();
                        if (a22 != null) {
                            r92 = 0;
                            org.telegram.messenger.np.s1(i19).X3(a22, false, false);
                        }
                    } else {
                        r92 = 0;
                        org.telegram.messenger.m10.i(i19).w(a22);
                    }
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject6;
                    ArrayList<TLRPC.PhotoSize> arrayList9 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList9, org.telegram.messenger.ns.g2, r92, null, r92);
                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(arrayList9, 800, r92, null, r92);
                    TLRPC.VideoSize videoSize = tL_photos_photo.photo.video_sizes.isEmpty() ? null : tL_photos_photo.photo.video_sizes.get(r92);
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    a22.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
                    if (w10 != null) {
                        tL_userProfilePhoto.photo_small = w10.location;
                    }
                    if (w11 != null) {
                        tL_userProfilePhoto.photo_big = w11.location;
                    }
                    if (w10 == null || l30Var.c == null) {
                        str = str5;
                        z10 = true;
                    } else {
                        org.telegram.messenger.w7.G(c40Var3.a);
                        File J = org.telegram.messenger.w7.J(w10, null, true, true);
                        org.telegram.messenger.w7.G(c40Var3.a);
                        org.telegram.messenger.w7.J(l30Var.c, null, true, true).renameTo(J);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(l30Var.c.volume_id);
                        sb2.append("_");
                        String n10 = a8.p0.n(l30Var.c.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        str = str5;
                        sb3.append(w10.location.volume_id);
                        sb3.append("_");
                        String n11 = a8.p0.n(w10.location.local_id, "@50_50", sb3);
                        z10 = true;
                        org.telegram.messenger.fc.D().S(n10, n11, org.telegram.messenger.gc.l(c40Var3.a, 1, a22));
                    }
                    if (w11 != null && l30Var.b != null) {
                        org.telegram.messenger.w7.G(c40Var3.a);
                        File J2 = org.telegram.messenger.w7.J(w11, null, z10, z10);
                        org.telegram.messenger.w7.G(c40Var3.a);
                        org.telegram.messenger.w7.J(l30Var.b, null, z10, z10).renameTo(J2);
                    }
                    if (videoSize != null && str != null) {
                        org.telegram.messenger.w7.G(c40Var3.a);
                        new File(str).renameTo(org.telegram.messenger.w7.J(videoSize, "mp4", z10, z10));
                    }
                    org.telegram.messenger.np.s1(i19).U0(a22.id).f();
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.add(a22);
                    org.telegram.messenger.vr.a0(i19).m1(arrayList10, null, false, true);
                    TLRPC.User a23 = org.telegram.messenger.np.s1(i19).a2(Long.valueOf(l30Var.e));
                    org.telegram.messenger.gc l11 = org.telegram.messenger.gc.l(i19, 0, a23);
                    org.telegram.messenger.gc l12 = org.telegram.messenger.gc.l(i19, 1, a23);
                    if (org.telegram.messenger.gc.e(l30Var.b) == null) {
                        l12 = org.telegram.messenger.gc.e(l30Var.c);
                    }
                    a20Var.setCreateThumbFromParent(false);
                    a20Var.H(null, l11, l12, true);
                    l30Var.c = null;
                    l30Var.b = null;
                    org.telegram.messenger.g0.a4(c40Var3.L1);
                    l30Var.a(1.0f);
                    cVar = cVar3;
                } else {
                    cVar = cVar3;
                }
                int i20 = cVar.a;
                int i21 = cVar.a;
                org.telegram.messenger.ns.f(i20).k(2, Integer.valueOf(org.telegram.messenger.np.D8));
                org.telegram.messenger.ns.f(i21).k(46, new Object[0]);
                org.telegram.messenger.m10.i(i21).v(true);
                break;
            case 14:
                org.telegram.ui.c50.Z((org.telegram.ui.c50) obj4, (ArrayList) obj, (ArrayList) obj3, (CountDownLatch) obj2);
                break;
            case 15:
                org.telegram.ui.k50 k50Var = (org.telegram.ui.k50) obj4;
                k50Var.d = (ArrayList) obj;
                k50Var.e = (ArrayList) obj3;
                k50Var.f();
                org.telegram.ui.l50 l50Var = k50Var.r;
                l50Var.b.d.setVisibility(8);
                l50Var.b.e.setText(org.telegram.messenger.hd.a0(null, null, 2131752117, (String) obj2));
                l50Var.b.e(false, true);
                break;
            case 16:
                ?? r14 = (LaunchActivity) obj4;
                org.telegram.ui.g50 g50Var = (org.telegram.ui.g50) obj3;
                TLObject tLObject7 = (TLObject) obj2;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj;
                String str6 = LaunchActivity.C1;
                try {
                    g50Var.run();
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
                if (tLObject7 instanceof TLRPC.TL_langPackLanguage) {
                    TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) tLObject7;
                    Pattern pattern = t4.a;
                    tL_langPackLanguage.lang_code = tL_langPackLanguage.lang_code.replace('-', '_').toLowerCase();
                    tL_langPackLanguage.plural_code = tL_langPackLanguage.plural_code.replace('-', '_').toLowerCase();
                    String str7 = tL_langPackLanguage.base_lang_code;
                    if (str7 != null) {
                        tL_langPackLanguage.base_lang_code = str7.replace('-', '_').toLowerCase();
                    }
                    ?? alertDialog$Builder2 = new AlertDialog$Builder(r14);
                    boolean equals = org.telegram.messenger.hd.E0().B.c.equals(tL_langPackLanguage.lang_code);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.a;
                    if (equals) {
                        t1Var2.S = org.telegram.messenger.hd.M0(2131749054, null);
                        a02 = org.telegram.messenger.hd.a0("LanguageSame", null, 2131749047, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131747831, null), null);
                        alertDialog$Builder2.i(org.telegram.messenger.hd.M0(2131745983, null), new v0(r14, 0));
                    } else if (tL_langPackLanguage.strings_count == 0) {
                        t1Var2.S = org.telegram.messenger.hd.M0(2131749044, null);
                        a02 = org.telegram.messenger.hd.a0("LanguageUnknownCustomAlert", null, 2131749045, tL_langPackLanguage.name);
                        alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131747831, null), null);
                    } else {
                        t1Var2.S = org.telegram.messenger.hd.M0(2131749046, null);
                        a02 = tL_langPackLanguage.official ? org.telegram.messenger.hd.a0("LanguageAlert", null, 2131749053, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f))) : org.telegram.messenger.hd.a0("LanguageCustomAlert", null, 2131749050, tL_langPackLanguage.name, Integer.valueOf((int) Math.ceil((tL_langPackLanguage.translated_count / tL_langPackLanguage.strings_count) * 100.0f)));
                        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131752552, null), new m2.d(28, tL_langPackLanguage, (Object) r14));
                        alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(a02));
                    int indexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '[');
                    if (indexOf != -1) {
                        int i22 = indexOf + 1;
                        i7 = TextUtils.indexOf((CharSequence) spannableStringBuilder, ']', i22);
                        if (i7 != -1) {
                            spannableStringBuilder.delete(i7, i7 + 1);
                            spannableStringBuilder.delete(indexOf, i22);
                        }
                    } else {
                        i7 = -1;
                    }
                    if (indexOf != -1 && i7 != -1) {
                        spannableStringBuilder.setSpan(new l3(tL_langPackLanguage.translations_url, alertDialog$Builder2), indexOf, i7 - 1, 33);
                    }
                    TextView textView = new TextView(r14);
                    textView.setText(spannableStringBuilder);
                    textView.setTextSize(1, 16.0f);
                    org.telegram.ui.ActionBar.q6.G(textView, org.telegram.ui.ActionBar.j6.k5, null);
                    org.telegram.ui.ActionBar.q6.C(textView, org.telegram.ui.ActionBar.j6.l5, null);
                    textView.setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
                    textView.setMovementMethod(new org.telegram.messenger.c0(false));
                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.j5, null);
                    alertDialog$Builder2.o(textView);
                    r14.F0(alertDialog$Builder2);
                    break;
                } else if (tL_error7 != null) {
                    if ("LANG_CODE_NOT_SUPPORTED".equals(tL_error7.text)) {
                        r14.F0(t4.K(r14, null, org.telegram.messenger.hd.M0(2131749043, null)));
                        break;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        org.telegram.ui.Cells.y0.r(null, 2131751105, sb4, "\n");
                        sb4.append(tL_error7.text);
                        r14.F0(t4.K(r14, null, sb4.toString()));
                        break;
                    }
                }
                break;
            case 17:
                org.telegram.ui.ActionBar.t1 t1Var3 = (org.telegram.ui.ActionBar.t1) obj4;
                TLObject tLObject8 = (TLObject) obj3;
                org.telegram.ui.g gVar = (org.telegram.ui.g) obj2;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj;
                String str8 = LaunchActivity.C1;
                try {
                    t1Var3.dismiss();
                } catch (Exception unused) {
                }
                if (!(tLObject8 instanceof TLRPC.TL_authorization)) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.g50(7, gVar, tL_error8));
                    break;
                }
                break;
            case 18:
                org.telegram.ui.q90 q90Var = (org.telegram.ui.q90) obj4;
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                sq.e(e2Var2.getContext(), q90Var.b, userArr[0], (TLRPC.TL_requestPeerTypeCreateBot) obj, true, new gh(i13, q90Var, userArr), e2Var2.getResourceProvider(), org.telegram.ui.q90.d());
                break;
            case 19:
                org.telegram.ui.n90.z0((org.telegram.ui.n90) obj4, (TLObject) obj3, (HashSet) obj2, (TLRPC.TL_error) obj);
                break;
            case 20:
                EditText editText = (EditText) obj2;
                bi.v vVar = (bi.v) obj;
                ((mb0) obj4).a(0.0f);
                ((View) obj3).setTag(R.id.timeout_callback, null);
                if (editText != null) {
                    editText.post(new org.telegram.ui.g50(19, editText, vVar));
                    break;
                }
                break;
            case 21:
                org.telegram.ui.tb0 tb0Var = (org.telegram.ui.tb0) obj4;
                String str9 = (String) obj3;
                String str10 = (String) obj2;
                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = (TLRPC.TL_auth_recoverPassword) obj;
                byte[] h12 = str9 != null ? org.telegram.messenger.g0.h1(str9) : null;
                org.telegram.ui.sb0 sb0Var = new org.telegram.ui.sb0(tb0Var, str9, str10, 0);
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = tb0Var.s.new_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    if (str9 != null) {
                        tL_auth_recoverPassword.new_settings.new_password_hash = org.telegram.messenger.nv.b(h12, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                        if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                            TLRPC.TL_error tL_error9 = new TLRPC.TL_error();
                            tL_error9.text = "ALGO_INVALID";
                            sb0Var.run(null, tL_error9);
                        }
                    }
                    i10 = ((org.telegram.ui.ActionBar.e2) tb0Var.H).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_auth_recoverPassword, sb0Var, 10);
                    break;
                } else {
                    TLRPC.TL_error tL_error10 = new TLRPC.TL_error();
                    tL_error10.text = "PASSWORD_HASH_INVALID";
                    sb0Var.run(null, tL_error10);
                    break;
                }
            case 22:
                org.telegram.ui.gc0 gc0Var = (org.telegram.ui.gc0) obj4;
                String str11 = (String) obj2;
                TLRPC.TL_error tL_error11 = (TLRPC.TL_error) obj;
                org.telegram.ui.ce0 ce0Var = gc0Var.E;
                ce0Var.C1(false, true);
                gc0Var.n = false;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    Bundle bundle = new Bundle();
                    bundle.putString("emailCode", str11);
                    bundle.putString("password", gc0Var.h);
                    ce0Var.M1(9, true, bundle, false);
                    break;
                } else if (tL_error11 != null && !tL_error11.text.startsWith("CODE_INVALID")) {
                    if (tL_error11.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.z(tL_error11.text).intValue();
                        if (intValue < 60) {
                            c10 = 0;
                            G = org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]);
                        } else {
                            c10 = 0;
                            G = org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0]);
                        }
                        String M03 = org.telegram.messenger.hd.M0(2131746071, null);
                        Object[] objArr = new Object[1];
                        objArr[c10] = G;
                        ce0Var.D1(M03, org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750686, objArr));
                        break;
                    } else {
                        ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), tL_error11.text);
                        break;
                    }
                } else {
                    gc0Var.n(true);
                    break;
                }
                break;
            case 23:
                org.telegram.ui.ed0 ed0Var = (org.telegram.ui.ed0) obj4;
                TLRPC.TL_error tL_error12 = (TLRPC.TL_error) obj3;
                Bundle bundle2 = (Bundle) obj2;
                TLObject tLObject9 = (TLObject) obj;
                ?? r02 = ed0Var.v0;
                ed0Var.g0 = false;
                if (tL_error12 == null) {
                    ed0Var.r0 = bundle2;
                    if (tLObject9 instanceof TLRPC.TL_auth_sentCode) {
                        TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject9;
                        ed0Var.s0 = tL_auth_sentCode;
                        TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                        if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                            ed0Var.j0 = 17;
                        } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                            ed0Var.j0 = 16;
                        }
                        r02.y1(bundle2, tL_auth_sentCode, true);
                    } else if (tLObject9 instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
                        TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) tLObject9;
                        bundle2.putString("product", tL_auth_sentCodePaymentRequired.store_product);
                        bundle2.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
                        bundle2.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
                        bundle2.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
                        bundle2.putString("currency", tL_auth_sentCodePaymentRequired.currency);
                        bundle2.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
                        bundle2.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
                        r02.M1(18, true, bundle2, true);
                    }
                } else {
                    String str12 = tL_error12.text;
                    if (str12 != null) {
                        if (str12.contains("PHONE_NUMBER_INVALID")) {
                            r02.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131749179, null));
                        } else if (tL_error12.text.contains("PHONE_CODE_EMPTY") || tL_error12.text.contains("PHONE_CODE_INVALID")) {
                            r02.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131749183, null));
                        } else if (tL_error12.text.contains("PHONE_CODE_EXPIRED")) {
                            ed0Var.c(true);
                            r02.M1(0, true, null, true);
                            r02.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131752021, null));
                        } else if (tL_error12.text.startsWith("FLOOD_WAIT")) {
                            r02.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131750687, null));
                        } else if (tL_error12.code != -1000) {
                            String M04 = org.telegram.messenger.hd.M0(2131746071, null);
                            StringBuilder sb5 = new StringBuilder();
                            org.telegram.ui.Cells.y0.r(null, 2131751105, sb5, "\n");
                            sb5.append(tL_error12.text);
                            r02.D1(M04, sb5.toString());
                        }
                    }
                }
                ed0Var.y(false);
                break;
            case 24:
                org.telegram.ui.kd0.n((org.telegram.ui.kd0) obj4, (String) obj3, (String) obj2, (String) obj);
                break;
            case 25:
                f5.m mVar = (f5.m) obj3;
                org.telegram.ui.r3 r3Var8 = (org.telegram.ui.r3) obj2;
                org.telegram.ui.ce0 ce0Var2 = ((org.telegram.ui.kd0) obj4).w;
                ce0Var2.e = true;
                org.telegram.messenger.r1.i().d(mVar.c, new org.telegram.ui.f3(r3Var8, i15));
                org.telegram.messenger.r1.i().h = new org.telegram.ui.id0(r3Var8, 0);
                org.telegram.messenger.r1 i23 = org.telegram.messenger.r1.i();
                Activity parentActivity2 = ce0Var2.getParentActivity();
                i11 = ((org.telegram.ui.ActionBar.e2) ce0Var2).currentAccount;
                org.telegram.messenger.c a10 = org.telegram.messenger.c.a(i11);
                wf.b bVar = new wf.b(i14, (boolean) (0 == true ? 1 : 0));
                bVar.R(mVar);
                i23.l(parentActivity2, a10, (TLRPC.TL_inputStorePaymentAuthCode) obj, Collections.singletonList(bVar.p()));
                break;
            case 26:
                a();
                break;
            case 27:
                b();
                break;
            case 28:
                c();
                break;
            default:
                org.telegram.ui.kl0 kl0Var = (org.telegram.ui.kl0) obj4;
                TLRPC.Message message = (TLRPC.Message) obj;
                kl0Var.b1 = true;
                kl0Var.g1 = 1;
                kl0Var.D0((org.telegram.ui.ActionBar.o4) obj3, (Activity) obj2);
                TLRPC.InputInvoice inputInvoice = kl0Var.c1;
                boolean z12 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                boolean z13 = z12 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                boolean z14 = z12 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                if (!z12 && (jl0Var2 = kl0Var.a1) != null) {
                    jl0Var2.e(kl0Var.g1);
                }
                kl0Var.z0();
                if (z12 && (jl0Var = kl0Var.a1) != null) {
                    jl0Var.e(kl0Var.g1);
                }
                long w02 = kl0Var.w0();
                if (w02 > 0) {
                    str2 = org.telegram.messenger.q10.k(kl0Var.getMessagesController().a2(Long.valueOf(w02)));
                } else {
                    str2 = "";
                    if (w02 < 0) {
                        z11 = 0;
                        z11 = 0;
                        TLRPC.Chat M05 = kl0Var.getMessagesController().M0(Long.valueOf(-w02));
                        str2 = M05 != null ? M05.title : "";
                        long v02 = kl0Var.v0();
                        int i24 = !z12 ? (z13 || z14) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                        String M06 = z12 ? null : org.telegram.messenger.hd.M0(z14 ? 2131745092 : z13 ? 2131745100 : 2131745159, null);
                        if (z12) {
                            String str13 = kl0Var.S0[z11];
                            String str14 = kl0Var.r0;
                            Object[] objArr2 = new Object[2];
                            objArr2[z11] = str13;
                            objArr2[1] = str14;
                            a03 = org.telegram.messenger.hd.a0(null, null, 2131747401, objArr2);
                        } else if (z14) {
                            a03 = org.telegram.messenger.hd.H(',', "StarsGiveawaySentPopupInfo", (int) v02);
                        } else {
                            String str15 = z13 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo";
                            Object[] objArr3 = new Object[1];
                            objArr3[z11] = str2;
                            a03 = org.telegram.messenger.hd.K(str15, (int) v02, ',', objArr3);
                        }
                        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(a03);
                        T = LaunchActivity.T();
                        if (T == null) {
                            cc a04 = cc.a0(T);
                            if (w02 == 0 || M06 == null || z14) {
                                String str16 = M06;
                                I = str16 != null ? a04.I(i24, str16, X2) : a04.Q(i24, 36, X2);
                            } else {
                                I = a04.L(i24, M06, X2, org.telegram.messenger.hd.M0(2131743552, null), new di.l3(w02, i15));
                            }
                            I.r = z11;
                            I.j = 5000;
                            if (message != null) {
                                fi.m3 m3Var = new fi.m3(kl0Var, I, z13, message, 4);
                                cb cbVar = I.e;
                                if (cbVar != null) {
                                    cbVar.setOnClickListener(m3Var);
                                }
                            }
                            I.k(z14);
                            break;
                        }
                    }
                }
                z11 = 0;
                long v022 = kl0Var.v0();
                int i242 = !z12 ? (z13 || z14) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                if (z12) {
                }
                if (z12) {
                }
                SpannableStringBuilder X22 = org.telegram.messenger.g0.X2(a03);
                T = LaunchActivity.T();
                if (T == null) {
                }
                break;
        }
    }

    public /* synthetic */ u80(Object obj, ArrayList arrayList, ArrayList arrayList2, Object obj2, int i7) {
        this.a = i7;
        this.b = obj;
        this.e = arrayList;
        this.c = arrayList2;
        this.d = obj2;
    }

    public /* synthetic */ u80(y80 y80Var, boolean[] zArr, ArrayList arrayList, boolean[] zArr2) {
        this.a = 0;
        this.b = y80Var;
        this.c = zArr;
        this.e = arrayList;
        this.d = zArr2;
    }
}
