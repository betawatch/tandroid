package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m6(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = obj4;
    }

    private final void a() {
        ww wwVar = (ww) this.b;
        Integer num = (Integer) this.d;
        org.telegram.ui.Components.ex exVar = (org.telegram.ui.Components.ex) this.e;
        org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.c;
        wwVar.I4(num.intValue());
        org.telegram.messenger.g0.i3(new org.telegram.ui.Components.fq(19, exVar, f2Var), 200L);
    }

    private final void b() {
        int b10;
        a0.h hVar;
        ArrayList arrayList;
        a0.h hVar2;
        org.telegram.ui.Components.h20 h20Var = (org.telegram.ui.Components.h20) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLObject tLObject = (TLObject) this.e;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) this.c;
        org.telegram.ui.Components.av0 av0Var = h20Var.q1;
        a0.h hVar3 = h20Var.R1;
        a0.h hVar4 = h20Var.S1;
        ArrayList arrayList2 = h20Var.O1;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            org.telegram.messenger.qp.s1(h20Var.a).Y3(tL_channels_channelParticipants.users, false);
            org.telegram.messenger.qp.s1(h20Var.a).S3(tL_channels_channelParticipants.chats, false);
            long e10 = org.telegram.messenger.p10.i(h20Var.a).e();
            int i7 = 0;
            while (true) {
                if (i7 >= tL_channels_channelParticipants.participants.size()) {
                    break;
                }
                if (org.telegram.messenger.ij.C1(tL_channels_channelParticipants.participants.get(i7).peer) == e10) {
                    tL_channels_channelParticipants.participants.remove(i7);
                    break;
                }
                i7++;
            }
            h20Var.L1--;
            if (tL_channels_getParticipants.filter instanceof TLRPC.TL_channelParticipantsContacts) {
                arrayList = h20Var.P1;
                hVar = hVar4;
            } else {
                hVar = hVar3;
                arrayList = arrayList2;
            }
            arrayList.clear();
            arrayList.addAll(tL_channels_channelParticipants.participants);
            int size = tL_channels_channelParticipants.participants.size();
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i10);
                hVar.k(channelParticipant, org.telegram.messenger.ij.C1(channelParticipant.peer));
            }
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                long C1 = org.telegram.messenger.ij.C1(((TLRPC.ChannelParticipant) arrayList2.get(i11)).peer);
                boolean z9 = hVar4.f(C1) != null || ((hVar2 = h20Var.V1) != null && hVar2.h(C1) >= 0);
                TLRPC.User a22 = org.telegram.messenger.qp.s1(h20Var.a).a2(Long.valueOf(C1));
                if ((a22 != null && a22.bot) || org.telegram.messenger.t10.x(a22)) {
                    z9 = true;
                }
                if (z9) {
                    arrayList2.remove(i11);
                    hVar3.l(C1);
                    i11--;
                    size2--;
                }
                i11++;
            }
            try {
                if (h20Var.N1.participants_count <= 200) {
                    Collections.sort(arrayList, new sp(h20Var, ConnectionsManager.getInstance(h20Var.a).getCurrentTime(), 1));
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
        if (h20Var.L1 <= 0) {
            h20Var.T1 = false;
            h20Var.U1 = true;
            if (h20Var.h2 == 1) {
                b10 = 1;
            } else {
                org.telegram.ui.Components.oj0 oj0Var = h20Var.m1;
                b10 = oj0Var != null ? oj0Var.b() - 1 : 0;
            }
            h20Var.O0(b10);
            if (arrayList2.isEmpty()) {
                h20Var.Y1 = true;
                h20Var.R0();
            }
        }
        h20Var.T0();
        org.telegram.ui.Components.oj0 oj0Var2 = h20Var.m1;
        if (oj0Var2 != null) {
            oj0Var2.f();
            if (av0Var != null && h20Var.m1.b() == 0 && h20Var.U1) {
                av0Var.e(false, true);
            }
        }
    }

    private final void c() {
        org.telegram.ui.Components.b70 b70Var = (org.telegram.ui.Components.b70) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLRPC.Updates updates = (TLRPC.Updates) this.e;
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.c;
        org.telegram.ui.ActionBar.f2 f2Var = b70Var.k1;
        if (f2Var == null || f2Var.getParentActivity() == null) {
            return;
        }
        if (tL_error != null) {
            "USER_ALREADY_PARTICIPANT".equals(tL_error.text);
            org.telegram.ui.Components.v4.c0(b70Var.a, tL_error, f2Var, tL_messages_importChatInvite, new Object[0]);
            return;
        }
        if (updates == null || updates.chats.isEmpty()) {
            return;
        }
        TLRPC.Chat chat = updates.chats.get(0);
        chat.left = false;
        chat.kicked = false;
        org.telegram.messenger.qp.s1(b70Var.a).Y3(updates.users, false);
        org.telegram.messenger.qp.s1(b70Var.a).S3(updates.chats, false);
        long j3 = chat.id;
        boolean z9 = !org.telegram.messenger.t3.V(chat);
        b70Var.getClass();
        Bundle j10 = a8.p0.j(j3, "chat_id");
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(b70Var.a);
        org.telegram.ui.ActionBar.f2 f2Var2 = b70Var.k1;
        if (s12.E(j10, f2Var2, null, null)) {
            f2Var2.presentFragment(new org.telegram.ui.Components.a70(b70Var, j10, z9, j3), f2Var2 instanceof an);
        }
    }

    private final void d() {
        org.telegram.ui.Components.q70 q70Var = (org.telegram.ui.Components.q70) this.b;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        TLObject tLObject = (TLObject) this.c;
        q70Var.D = false;
        q70Var.L = tL_chatInviteExported.link;
        if (tL_error == null) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
            if (tL_chatInviteExported.importers == null) {
                tL_chatInviteExported.importers = new ArrayList<>(3);
            }
            tL_chatInviteExported.importers.clear();
            for (int i7 = 0; i7 < tL_messages_chatInviteImporters.users.size(); i7++) {
                tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
            }
            q70Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
        }
    }

    private final void f() {
        org.telegram.ui.Components.u80 u80Var = (org.telegram.ui.Components.u80) this.b;
        boolean[] zArr = (boolean[]) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        boolean[] zArr2 = (boolean[]) this.e;
        zArr[0] = true;
        org.telegram.messenger.g0.r(u80Var.Q);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((TL_stories.StoryItem) arrayList.get(i7)).pinned = zArr2[i7];
        }
        u80Var.getMessagesController().P1().q0(u80Var.e, arrayList, false);
    }

    private final void g() {
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
        fi.d dVar = (fi.d) this.d;
        p6 p6Var = (p6) this.e;
        Runnable runnable = (Runnable) this.c;
        if (tL_error != null) {
            org.telegram.ui.Components.hc.X().f0(tL_error, false);
            return;
        }
        dVar.setLoading(false);
        p6Var.dismiss();
        org.telegram.messenger.k5.o(null, 2131747042, org.telegram.ui.Components.hc.X(), R.raw.chats_infotip, 36);
        runnable.run();
    }

    private final void h() {
        org.telegram.ui.Components.yl0 yl0Var = (org.telegram.ui.Components.yl0) this.b;
        ww wwVar = (ww) this.d;
        Context context = (Context) this.e;
        org.telegram.ui.Components.k60 k60Var = (org.telegram.ui.Components.k60) this.c;
        wwVar.showDialog(new org.telegram.ui.Components.m20(context, wwVar.getResourceProvider(), new org.telegram.ui.Components.v80(8, yl0Var, wwVar)));
        k60Var.u();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        TLRPC.User user;
        Throwable th2;
        TLRPC.TL_webPage tL_webPage;
        String[] strArr;
        nq nqVar;
        oq oqVar;
        ArrayList arrayList;
        int i10;
        int i11;
        long C1;
        int i12;
        String lowerCase;
        boolean z9;
        String K;
        String str;
        String str2;
        String str3;
        boolean z10;
        float f10;
        r1.g gVar;
        char c10;
        float f11;
        r1.g gVar2;
        final float f12;
        org.telegram.messenger.pd pdVar;
        org.telegram.ui.Components.p3 p3Var;
        int i13;
        int i14 = this.a;
        int i15 = 7;
        int i16 = -1;
        int i17 = 4;
        int i18 = 0;
        Object obj = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (i14) {
            case 0:
                q6 q6Var = (q6) obj4;
                q6Var.getClass();
                ((bi.x5) obj3).f(((float[]) obj2)[0]);
                if (((boolean[]) obj)[0]) {
                    q6Var.d.A0(true);
                    break;
                }
                break;
            case 1:
                q6 q6Var2 = (q6) obj4;
                long[] jArr = (long[]) obj3;
                p6 p6Var = (p6) obj2;
                if (!((boolean[]) obj)[0]) {
                    jArr[0] = System.currentTimeMillis();
                    q6Var2.d.showDialog(p6Var);
                    break;
                }
                break;
            case 2:
                h8.Z((h8) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (Calendar) obj);
                break;
            case 3:
                la.Z((la) obj4, (org.telegram.ui.ActionBar.u1) obj3, (TLRPC.TL_error) obj2, (TL_account.updateUsername) obj);
                break;
            case 4:
                an anVar = (an) obj4;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj3;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj2;
                org.telegram.ui.ActionBar.q4 q4Var = (org.telegram.ui.ActionBar.q4) obj;
                if (f2Var instanceof org.telegram.messenger.ls) {
                    i7 = 4;
                    anVar.getNotificationCenter().n((org.telegram.messenger.ls) f2Var, 4);
                } else {
                    i7 = 4;
                }
                anVar.getNotificationCenter().k(i7, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", ijVar.k.action.channel_id);
                ((ActionBarLayout) q4Var).c(q4Var.getFragmentStack().size() - 1, new an(bundle));
                f2Var.finishFragment();
                break;
            case 5:
                an anVar2 = (an) obj4;
                TLObject tLObject = (TLObject) obj2;
                bi.z2 z2Var = (bi.z2) obj;
                ((vf.b) obj3).b();
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    anVar2.getMessagesController().Y3(tL_contacts_resolvedPeer.users, false);
                    anVar2.getMessagesController().S3(tL_contacts_resolvedPeer.chats, false);
                    long o4 = org.telegram.messenger.m5.o(tL_contacts_resolvedPeer.peer);
                    if (o4 >= 0) {
                        user = anVar2.getMessagesController().a2(Long.valueOf(o4));
                        z2Var.a(user);
                        break;
                    }
                }
                user = null;
                z2Var.a(user);
            case 6:
                ImageView imageView = (ImageView) obj3;
                ImageView imageView2 = (ImageView) obj2;
                ((long[]) obj4)[0] = SystemClock.elapsedRealtime();
                if (!((boolean[]) obj)[0]) {
                    imageView = imageView2;
                }
                org.telegram.ui.Components.wq wqVar = (org.telegram.ui.Components.wq) imageView.getDrawable();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a3(wqVar, 4));
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(org.telegram.ui.Components.xq.f);
                ofFloat.start();
                break;
            case 7:
                an anVar3 = (an) obj4;
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) obj3;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj2;
                boolean[] zArr = (boolean[]) obj;
                try {
                    tL_webPage = org.telegram.ui.Components.n80.g(ijVar2);
                    th2 = null;
                } catch (Throwable th3) {
                    org.telegram.messenger.a8.g(th3, true);
                    th2 = th3;
                    tL_webPage = null;
                }
                org.telegram.messenger.g0.h3(new bi.l4(anVar3, u1Var, zArr, th2 == null && tL_webPage != null, ijVar2, tL_webPage));
                break;
            case 8:
                an anVar4 = (an) obj4;
                org.telegram.messenger.yr yrVar = (org.telegram.messenger.yr) obj;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) ((TLObject) obj3);
                if (((TLRPC.TL_error) obj2) != null || messages_messages.messages.isEmpty()) {
                    if (messages_messages != null) {
                        anVar4.B6 = messages_messages.count;
                    } else {
                        anVar4.B6 = 0;
                    }
                    yrVar.a.c(new org.telegram.messenger.zq(yrVar, anVar4.b(), anVar4.j6, anVar4.B6, 7));
                    int i19 = anVar4.B6;
                    if (i19 == 0) {
                        anVar4.C6 = true;
                        anVar4.nc(false);
                        break;
                    } else {
                        anVar4.x1.c(2, i19, true);
                        anVar4.ha();
                        break;
                    }
                } else {
                    int i20 = messages_messages.messages.get(0).id;
                    org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) anVar4.E6[0].get(i20);
                    yrVar.a.c(new org.telegram.messenger.aq(yrVar, i20, anVar4.j6, 4));
                    if (ijVar3 != null) {
                        TLRPC.Message message = ijVar3.k;
                        message.media_unread = true;
                        message.mentioned = true;
                    }
                    anVar4.l(i20, 0, false, 0, true, 0);
                    break;
                }
                break;
            case 9:
                an.R0((an) obj4, (TLRPC.TL_messageMediaWebPage) obj3, (TLRPC.TL_webPageAttributeStory) obj2, (n6) obj);
                break;
            case 10:
                so.b0((so) obj4, (org.telegram.ui.ActionBar.u1[]) obj3, (TLRPC.Chat) obj2, (org.telegram.ui.ActionBar.f2) obj);
                break;
            case 11:
                kp kpVar = (kp) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                kpVar.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.I = password;
                    TwoStepVerificationActivity.r0(password);
                    kpVar.u0(twoStepVerificationActivity.q0(), twoStepVerificationActivity);
                    break;
                }
                break;
            case 12:
                oq oqVar2 = (oq) obj4;
                TLObject tLObject3 = (TLObject) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                tp tpVar = (tp) obj;
                if (!(tLObject3 instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject3 instanceof TLRPC.TL_chatParticipantAdmin)) {
                    tpVar.a(1);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oqVar2.getParentActivity());
                    String M0 = org.telegram.messenger.hd.M0(R.string.AppName, "AppName");
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.a;
                    u1Var2.R = M0;
                    u1Var2.T = org.telegram.messenger.hd.a0(null, null, 2131754350, org.telegram.messenger.t10.p(user2));
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, "OK"), new w0(tpVar, 26));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
                    oqVar2.showDialog(u1Var2);
                    break;
                }
                break;
            case 13:
                nq nqVar2 = (nq) obj4;
                ArrayList arrayList2 = (ArrayList) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                oq oqVar3 = nqVar2.D;
                String lowerCase2 = ((String) obj3).trim().toLowerCase();
                if (lowerCase2.length() == 0) {
                    org.telegram.messenger.g0.h3(new bi.u0(nqVar2, new ArrayList(), new a0.h(), new ArrayList(), new ArrayList(), 28));
                    break;
                } else {
                    String S0 = org.telegram.messenger.hd.E0().S0(lowerCase2, true, false);
                    if (lowerCase2.equals(S0) || S0.length() == 0) {
                        S0 = null;
                    }
                    int i21 = (S0 != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i21];
                    strArr2[0] = lowerCase2;
                    if (S0 != null) {
                        strArr2[1] = S0;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    String[] strArr3 = strArr2;
                    a0.h hVar = new a0.h();
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i22 = 0;
                        while (i22 < size) {
                            TLObject tLObject4 = (TLObject) arrayList2.get(i22);
                            if (tLObject4 instanceof TLRPC.ChatParticipant) {
                                strArr = strArr3;
                                nqVar = nqVar2;
                                C1 = ((TLRPC.ChatParticipant) tLObject4).user_id;
                            } else {
                                strArr = strArr3;
                                nqVar = nqVar2;
                                if (tLObject4 instanceof TLRPC.ChannelParticipant) {
                                    C1 = org.telegram.messenger.ij.C1(((TLRPC.ChannelParticipant) tLObject4).peer);
                                } else {
                                    oqVar = oqVar3;
                                    arrayList = arrayList2;
                                    i10 = size;
                                    i11 = i22;
                                    i22 = i11 + 1;
                                    nqVar2 = nqVar;
                                    strArr3 = strArr;
                                    oqVar3 = oqVar;
                                    arrayList2 = arrayList;
                                    size = i10;
                                }
                            }
                            if (C1 > 0) {
                                TLRPC.User a22 = oqVar3.getMessagesController().a2(Long.valueOf(C1));
                                i12 = size;
                                i11 = i22;
                                if (a22.id == oqVar3.getUserConfig().e()) {
                                    oqVar = oqVar3;
                                    arrayList = arrayList2;
                                    i10 = i12;
                                    i22 = i11 + 1;
                                    nqVar2 = nqVar;
                                    strArr3 = strArr;
                                    oqVar3 = oqVar;
                                    arrayList2 = arrayList;
                                    size = i10;
                                } else {
                                    lowerCase = org.telegram.messenger.t10.p(a22).toLowerCase();
                                    String n10 = org.telegram.messenger.t10.n(a22);
                                    String str4 = a22.first_name;
                                    oqVar = oqVar3;
                                    str2 = a22.last_name;
                                    str = str4;
                                    K = n10;
                                    z9 = false;
                                }
                            } else {
                                i12 = size;
                                i11 = i22;
                                TLRPC.Chat M02 = oqVar3.getMessagesController().M0(Long.valueOf(-C1));
                                lowerCase = M02.title.toLowerCase();
                                z9 = false;
                                K = org.telegram.messenger.t3.K(M02, false);
                                str = M02.title;
                                oqVar = oqVar3;
                                str2 = null;
                            }
                            arrayList = arrayList2;
                            i10 = i12;
                            String S02 = org.telegram.messenger.hd.E0().S0(lowerCase, true, z9);
                            if (lowerCase.equals(S02)) {
                                S02 = null;
                            }
                            boolean z11 = false;
                            int i23 = 0;
                            while (true) {
                                if (i23 < i21) {
                                    boolean z12 = z11;
                                    String str5 = strArr[i23];
                                    if (lowerCase.startsWith(str5) || jg.g.A(" ", str5, lowerCase) || (S02 != null && (S02.startsWith(str5) || jg.g.A(" ", str5, S02)))) {
                                        str3 = lowerCase;
                                        z10 = true;
                                    } else if (K == null || !K.startsWith(str5)) {
                                        str3 = lowerCase;
                                        z10 = z12;
                                    } else {
                                        str3 = lowerCase;
                                        z10 = 2;
                                    }
                                    if (z10) {
                                        if (z10) {
                                            arrayList5.add(org.telegram.messenger.g0.r0(str, str2, str5));
                                        } else {
                                            arrayList5.add(org.telegram.messenger.g0.r0(rf.b.i("@", K), null, "@" + str5));
                                        }
                                        arrayList6.add(tLObject4);
                                    } else {
                                        i23++;
                                        z11 = z10;
                                        lowerCase = str3;
                                    }
                                }
                            }
                            i22 = i11 + 1;
                            nqVar2 = nqVar;
                            strArr3 = strArr;
                            oqVar3 = oqVar;
                            arrayList2 = arrayList;
                            size = i10;
                        }
                    }
                    oq oqVar4 = oqVar3;
                    String[] strArr4 = strArr3;
                    nq nqVar3 = nqVar2;
                    if (arrayList3 != null) {
                        for (int i24 = 0; i24 < arrayList3.size(); i24++) {
                            TLRPC.User a23 = oqVar4.getMessagesController().a2(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i24)).user_id));
                            if (a23.id != oqVar4.getUserConfig().e()) {
                                String lowerCase3 = org.telegram.messenger.t10.p(a23).toLowerCase();
                                String S03 = org.telegram.messenger.hd.E0().S0(lowerCase3, true, false);
                                if (lowerCase3.equals(S03)) {
                                    S03 = null;
                                }
                                boolean z13 = false;
                                int i25 = 0;
                                while (true) {
                                    if (i25 < i21) {
                                        String str6 = strArr4[i25];
                                        if (lowerCase3.startsWith(str6) || jg.g.A(" ", str6, lowerCase3) || (S03 != null && (S03.startsWith(str6) || jg.g.A(" ", str6, S03)))) {
                                            z13 = true;
                                        } else {
                                            String n11 = org.telegram.messenger.t10.n(a23);
                                            if (n11 != null && n11.startsWith(str6)) {
                                                z13 = 2;
                                            }
                                        }
                                        if (z13) {
                                            if (z13) {
                                                arrayList5.add(org.telegram.messenger.g0.r0(a23.first_name, a23.last_name, str6));
                                            } else {
                                                arrayList5.add(org.telegram.messenger.g0.r0("@" + org.telegram.messenger.t10.n(a23), null, "@" + str6));
                                            }
                                            arrayList4.add(a23);
                                            hVar.k(a23, a23.id);
                                        } else {
                                            i25++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    org.telegram.messenger.g0.h3(new bi.u0(nqVar3, arrayList4, hVar, arrayList5, arrayList6, 28));
                    break;
                }
                break;
            case 14:
                String str7 = "https://t.me/addstyle/" + ((TL_aicompose.TL_aiComposeTone) obj3).slug;
                new org.telegram.ui.Components.m((org.telegram.ui.Components.g0) obj4, (Context) obj2, str7, str7, (org.telegram.ui.ActionBar.f6) obj).show();
                break;
            case 15:
                org.telegram.ui.Components.u4 u4Var = (org.telegram.ui.Components.u4) obj4;
                bi.b9 b9Var = (bi.b9) obj3;
                org.telegram.ui.ActionBar.u1[] u1VarArr = (org.telegram.ui.ActionBar.u1[]) obj2;
                View view = (View) obj;
                String trim = u4Var.getText().toString().trim();
                Uri parse = Uri.parse(trim);
                if (parse == null || parse.getHost() == null) {
                    parse = Uri.parse("https://" + trim);
                }
                if (parse != null && parse.getHost() != null) {
                    String lowerCase4 = parse.getHost().toLowerCase();
                    if (lowerCase4.startsWith("www.")) {
                        lowerCase4 = lowerCase4.substring(4);
                    }
                    b9Var.a(lowerCase4);
                    org.telegram.ui.ActionBar.u1 u1Var3 = u1VarArr[0];
                    if (u1Var3 != null) {
                        u1Var3.dismiss();
                    }
                    if (view != null) {
                        view.requestFocus();
                        break;
                    }
                } else {
                    org.telegram.messenger.g0.F3(u4Var);
                    break;
                }
                break;
            case 16:
                int[] iArr = (int[]) obj4;
                int[] iArr2 = (int[]) obj3;
                String[] strArr5 = (String[]) obj2;
                TextView textView = (TextView) obj;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.M0(2131748505, null));
                spannableStringBuilder.append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                int i26 = 0;
                while (true) {
                    if (i26 < iArr.length) {
                        if (iArr2[0] == iArr[i26]) {
                            spannableStringBuilder.append((CharSequence) strArr5[i26]);
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.u31(org.telegram.messenger.g0.o()), length, spannableStringBuilder.length(), 33);
                        } else {
                            i26++;
                        }
                    }
                }
                spannableStringBuilder.append((CharSequence) " v");
                if (org.telegram.messenger.p10.i(org.telegram.messenger.p10.s0).q()) {
                    org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.arrows_select, 0);
                    wpVar.G = 0.7f;
                    float L = org.telegram.messenger.g0.L(-1.33f);
                    float L2 = org.telegram.messenger.g0.L(0.0f);
                    wpVar.r = L;
                    wpVar.s = L2;
                    wpVar.x = 0.75f;
                    spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                } else {
                    org.telegram.ui.Components.wp wpVar2 = new org.telegram.ui.Components.wp(R.drawable.mini_switch_lock, 0);
                    wpVar2.G = 0.7f;
                    float L3 = org.telegram.messenger.g0.L(-1.33f);
                    float L4 = org.telegram.messenger.g0.L(0.0f);
                    wpVar2.r = L3;
                    wpVar2.s = L4;
                    wpVar2.x = 0.75f;
                    spannableStringBuilder.setSpan(wpVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                textView.setText(spannableStringBuilder);
                break;
            case 17:
                final ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                final org.telegram.ui.Components.it0 it0Var = (org.telegram.ui.Components.it0) obj3;
                int[] iArr3 = (int[]) obj2;
                org.telegram.ui.Components.an0 an0Var = (org.telegram.ui.Components.an0) obj;
                int[] iArr4 = chatActivityEnterView.N2;
                if (chatActivityEnterView.q0 != null) {
                    final Dialog dialog = new Dialog(chatActivityEnterView.getContext(), R.style.TransparentDialogNoAnimation);
                    FrameLayout frameLayout = new FrameLayout(chatActivityEnterView.getContext());
                    frameLayout.addView(it0Var, c8.ha.e(40, 40, 3));
                    dialog.setContentView(frameLayout);
                    dialog.getWindow().setLayout(-1, -1);
                    dialog.getWindow().clearFlags(1024);
                    dialog.getWindow().clearFlags(67108864);
                    dialog.getWindow().clearFlags(TLObject.FLAG_27);
                    dialog.getWindow().addFlags(TLObject.FLAG_31);
                    dialog.getWindow().addFlags(512);
                    dialog.getWindow().addFlags(131072);
                    dialog.getWindow().getAttributes().windowAnimations = 0;
                    dialog.getWindow().getDecorView().setSystemUiVisibility(1792);
                    dialog.getWindow().setStatusBarColor(0);
                    dialog.getWindow().setNavigationBarColor(0);
                    org.telegram.messenger.g0.q3(dialog, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.s8, true) == -1);
                    if (Build.VERSION.SDK_INT >= 26) {
                        org.telegram.messenger.g0.n3(dialog, org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.a7, true)) >= 0.721f);
                    }
                    chatActivityEnterView.s0 = chatActivityEnterView.getRootWindowInsets().getSystemWindowInsetLeft() + chatActivityEnterView.s0;
                    chatActivityEnterView.p0.getLocationInWindow(iArr4);
                    final float f13 = iArr4[0];
                    float f14 = iArr4[1];
                    float L5 = org.telegram.messenger.g0.L(5.0f);
                    float L6 = iArr3[0] + chatActivityEnterView.s0 + L5 + org.telegram.messenger.g0.L(4.0f) + 0.0f;
                    float f15 = iArr3[1] + chatActivityEnterView.t0 + L5 + 0.0f;
                    it0Var.setTranslationX(L6);
                    it0Var.setTranslationY(f15);
                    float scaleX = (chatActivityEnterView.p0.getLayoutParams().width * (chatActivityEnterView.p5 ? chatActivityEnterView.p0.getScaleX() : 1.0f)) / org.telegram.messenger.g0.L(40.0f);
                    it0Var.setPivotX(0.0f);
                    it0Var.setPivotY(0.0f);
                    it0Var.setScaleX(0.75f);
                    it0Var.setScaleY(0.75f);
                    it0Var.getViewTreeObserver().addOnDrawListener(new org.telegram.ui.Components.oe(it0Var, an0Var));
                    dialog.show();
                    if (chatActivityEnterView.p5) {
                        f10 = 1.0f;
                    } else {
                        f10 = 1.0f;
                        chatActivityEnterView.p0.setScaleX(1.0f);
                        chatActivityEnterView.p0.setScaleY(1.0f);
                    }
                    chatActivityEnterView.p0.setAlpha(f10);
                    org.telegram.ui.Components.ne neVar = chatActivityEnterView.q0;
                    boolean z14 = chatActivityEnterView.p5;
                    r1.b bVar = r1.g.q;
                    if (z14) {
                        c10 = 4;
                        f11 = 0.5f;
                        gVar = null;
                    } else {
                        c10 = 4;
                        gVar = new r1.g(chatActivityEnterView.p0, bVar);
                        f11 = 0.5f;
                        gVar.m = org.telegram.ui.Cells.f1.o(0.5f, 750.0f, f10);
                    }
                    boolean z15 = chatActivityEnterView.p5;
                    r1.b bVar2 = r1.g.r;
                    if (z15) {
                        f12 = f14;
                        gVar2 = null;
                    } else {
                        f12 = f14;
                        gVar2 = new r1.g(chatActivityEnterView.p0, bVar2);
                        gVar2.m = org.telegram.ui.Cells.f1.o(f11, 750.0f, f10);
                    }
                    r1.g gVar3 = new r1.g(chatActivityEnterView.p0, r1.g.v);
                    gVar3.m = org.telegram.ui.Cells.f1.o(0.0f, 750.0f, f10);
                    final int i27 = 0;
                    r1.c cVar = new r1.c() { // from class: org.telegram.ui.Components.fd
                        @Override // r1.c
                        public final void a(r1.g gVar4, boolean z16, float f16, float f17) {
                            int i28 = i27;
                            float f18 = f12;
                            float f19 = f13;
                            it0 it0Var2 = it0Var;
                            Dialog dialog2 = dialog;
                            ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
                            switch (i28) {
                                case 0:
                                    int i29 = ChatActivityEnterView.s5;
                                    if (dialog2.isShowing()) {
                                        it0Var2.setTranslationX(f19);
                                        it0Var2.setTranslationY(f18);
                                        cn0 cn0Var = chatActivityEnterView2.p0;
                                        cn0Var.getClass();
                                        cn0Var.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.p5) {
                                            chatActivityEnterView2.p0.setScaleX(1.0f);
                                            chatActivityEnterView2.p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.p0.setAlpha(1.0f);
                                        chatActivityEnterView2.p0.getViewTreeObserver().addOnPreDrawListener(new pe(chatActivityEnterView2, dialog2, 0));
                                        break;
                                    }
                                    break;
                                default:
                                    int i30 = ChatActivityEnterView.s5;
                                    if (dialog2.isShowing()) {
                                        it0Var2.setTranslationX(f19);
                                        it0Var2.setTranslationY(f18);
                                        cn0 cn0Var2 = chatActivityEnterView2.p0;
                                        cn0Var2.getClass();
                                        cn0Var2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.p5) {
                                            chatActivityEnterView2.p0.setScaleX(1.0f);
                                            chatActivityEnterView2.p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.p0.setAlpha(1.0f);
                                        chatActivityEnterView2.p0.getViewTreeObserver().addOnPreDrawListener(new pe(chatActivityEnterView2, dialog2, 1));
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    float f16 = f12;
                    gVar3.a(cVar);
                    r1.g gVar4 = new r1.g(it0Var, r1.g.o);
                    gVar4.b = c8.j9.a(L6, f13 - org.telegram.messenger.g0.L(6.0f), L6);
                    gVar4.c = true;
                    gVar4.m = org.telegram.ui.Cells.f1.o(f13, 700.0f, 0.75f);
                    gVar4.h = f13 - org.telegram.messenger.g0.L(6.0f);
                    r1.g gVar5 = new r1.g(it0Var, r1.g.p);
                    gVar5.b = c8.j9.a(f15, f15, org.telegram.messenger.g0.L(6.0f) + f16);
                    gVar5.c = true;
                    gVar5.m = org.telegram.ui.Cells.f1.o(f16, 700.0f, 0.75f);
                    gVar5.g = org.telegram.messenger.g0.L(6.0f) + f16;
                    gVar5.b(new org.telegram.ui.Components.re(f16, it0Var));
                    final int i28 = 1;
                    gVar5.a(new r1.c() { // from class: org.telegram.ui.Components.fd
                        @Override // r1.c
                        public final void a(r1.g gVar42, boolean z16, float f162, float f17) {
                            int i282 = i28;
                            float f18 = f12;
                            float f19 = f13;
                            it0 it0Var2 = it0Var;
                            Dialog dialog2 = dialog;
                            ChatActivityEnterView chatActivityEnterView2 = chatActivityEnterView;
                            switch (i282) {
                                case 0:
                                    int i29 = ChatActivityEnterView.s5;
                                    if (dialog2.isShowing()) {
                                        it0Var2.setTranslationX(f19);
                                        it0Var2.setTranslationY(f18);
                                        cn0 cn0Var = chatActivityEnterView2.p0;
                                        cn0Var.getClass();
                                        cn0Var.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.p5) {
                                            chatActivityEnterView2.p0.setScaleX(1.0f);
                                            chatActivityEnterView2.p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.p0.setAlpha(1.0f);
                                        chatActivityEnterView2.p0.getViewTreeObserver().addOnPreDrawListener(new pe(chatActivityEnterView2, dialog2, 0));
                                        break;
                                    }
                                    break;
                                default:
                                    int i30 = ChatActivityEnterView.s5;
                                    if (dialog2.isShowing()) {
                                        it0Var2.setTranslationX(f19);
                                        it0Var2.setTranslationY(f18);
                                        cn0 cn0Var2 = chatActivityEnterView2.p0;
                                        cn0Var2.getClass();
                                        cn0Var2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView2.p5) {
                                            chatActivityEnterView2.p0.setScaleX(1.0f);
                                            chatActivityEnterView2.p0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView2.p0.setAlpha(1.0f);
                                        chatActivityEnterView2.p0.getViewTreeObserver().addOnPreDrawListener(new pe(chatActivityEnterView2, dialog2, 1));
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    r1.g gVar6 = new r1.g(it0Var, bVar);
                    gVar6.m = org.telegram.ui.Cells.f1.o(scaleX, 1000.0f, 1.0f);
                    r1.g gVar7 = new r1.g(it0Var, bVar2);
                    gVar7.m = org.telegram.ui.Cells.f1.o(scaleX, 1000.0f, 1.0f);
                    r1.g[] gVarArr = new r1.g[7];
                    gVarArr[0] = gVar;
                    gVarArr[1] = gVar2;
                    gVarArr[2] = gVar3;
                    gVarArr[3] = gVar4;
                    gVarArr[c10] = gVar5;
                    gVarArr[5] = gVar6;
                    gVarArr[6] = gVar7;
                    neVar.l(gVarArr);
                    break;
                }
                break;
            case 18:
                org.telegram.ui.Components.bn bnVar = (org.telegram.ui.Components.bn) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                long j3 = bnVar.V;
                final org.telegram.ui.Components.f2 f2Var2 = new org.telegram.ui.Components.f2(10, bnVar, (View) obj2);
                org.telegram.messenger.pd pdVar2 = new org.telegram.messenger.pd(25);
                int i29 = org.telegram.ui.ActionBar.k6.j5;
                int f17 = f6Var != null ? f6Var.f(i29) : org.telegram.ui.ActionBar.k6.x0(null, i29, false);
                int i30 = org.telegram.ui.ActionBar.k6.h5;
                int f18 = f6Var != null ? f6Var.f(i30) : org.telegram.ui.ActionBar.k6.x0(null, i30, false);
                int i31 = org.telegram.ui.ActionBar.k6.xj;
                if (f6Var != null) {
                    f6Var.f(i31);
                } else {
                    org.telegram.ui.ActionBar.k6.x0(null, i31, false);
                }
                int i32 = org.telegram.ui.ActionBar.k6.Bj;
                if (f6Var != null) {
                    f6Var.f(i32);
                } else {
                    org.telegram.ui.ActionBar.k6.x0(null, i32, false);
                }
                int i33 = org.telegram.ui.ActionBar.k6.E8;
                if (f6Var != null) {
                    f6Var.f(i33);
                } else {
                    org.telegram.ui.ActionBar.k6.x0(null, i33, false);
                }
                int i34 = org.telegram.ui.ActionBar.k6.G8;
                if (f6Var != null) {
                    f6Var.f(i34);
                } else {
                    org.telegram.ui.ActionBar.k6.x0(null, i34, false);
                }
                int i35 = org.telegram.ui.ActionBar.k6.i6;
                if (f6Var != null) {
                    f6Var.f(i35);
                } else {
                    org.telegram.ui.ActionBar.k6.x0(null, i35, false);
                }
                int i36 = org.telegram.ui.ActionBar.k6.Gi;
                int f19 = f6Var != null ? f6Var.f(i36) : org.telegram.ui.ActionBar.k6.x0(null, i36, false);
                int i37 = org.telegram.ui.ActionBar.k6.Ci;
                int f20 = f6Var != null ? f6Var.f(i37) : org.telegram.ui.ActionBar.k6.x0(null, i37, false);
                int i38 = org.telegram.ui.ActionBar.k6.Ei;
                if (f6Var != null) {
                    f6Var.f(i38);
                } else {
                    org.telegram.ui.ActionBar.k6.x0(null, i38, false);
                }
                Pattern pattern = org.telegram.ui.Components.v4.a;
                if (context != null) {
                    final int M1 = (int) org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).x7.E.M1(TimeUnit.SECONDS);
                    final h9.f1 f1Var = new h9.f1(context, f6Var);
                    ((org.telegram.ui.ActionBar.v2) f1Var.b).v0 = false;
                    final org.telegram.ui.Components.hb0 hb0Var = new org.telegram.ui.Components.hb0(context, f6Var);
                    hb0Var.setTextColor(f17);
                    hb0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                    hb0Var.setItemCount(5);
                    final org.telegram.ui.Components.z3 z3Var = new org.telegram.ui.Components.z3(context, f6Var);
                    z3Var.setWrapSelectorWheel(true);
                    z3Var.setAllItemsCount(24);
                    z3Var.setItemCount(5);
                    z3Var.setTextColor(f17);
                    z3Var.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                    final org.telegram.ui.Components.a4 a4Var = new org.telegram.ui.Components.a4(context, f6Var);
                    a4Var.setWrapSelectorWheel(true);
                    a4Var.setAllItemsCount(60);
                    a4Var.setItemCount(5);
                    a4Var.setTextColor(f17);
                    a4Var.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    org.telegram.ui.Components.p3 p3Var2 = new org.telegram.ui.Components.p3(context, hb0Var, z3Var, a4Var, 3);
                    p3Var2.setOrientation(1);
                    frameLayout2.addView(p3Var2, c8.ha.c(-1.0f, -1));
                    frameLayout2.addView(new FrameLayout(context), c8.ha.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
                    FrameLayout frameLayout3 = new FrameLayout(context);
                    p3Var2.addView(frameLayout3, c8.ha.t(-1, -2, 51, 22, 0, 0, 4));
                    TextView textView2 = new TextView(context);
                    textView2.setText(org.telegram.messenger.hd.M0(2131744828, null));
                    textView2.setTextColor(f17);
                    com.google.android.recaptcha.internal.a.q(textView2, 1, 20.0f);
                    frameLayout3.addView(textView2, c8.ha.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                    textView2.setOnTouchListener(new ei.b(10));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(0);
                    linearLayout.setWeightSum(1.0f);
                    p3Var2.addView(linearLayout, c8.ha.q(-1, -2, 1.0f, 0, 0, 23, 0, 23));
                    final TextView textView3 = new TextView(context);
                    textView3.setTextSize(1, 12.0f);
                    org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.q5, f6Var);
                    textView3.setGravity(17);
                    final Calendar calendar = Calendar.getInstance();
                    bi.md mdVar = new bi.md(context, 16);
                    mdVar.setText(org.telegram.messenger.hd.M0(2131744829, null));
                    c8.ka.b(mdVar, 0.02f, 1.2f);
                    linearLayout.addView(hb0Var, c8.ha.l(0.5f, 0, org.telegram.messenger.qs.t4));
                    hb0Var.setMinValue(0);
                    hb0Var.setMaxValue(365);
                    hb0Var.setWrapSelectorWheel(false);
                    hb0Var.setFormatter(new zq(23));
                    bi.i6 i6Var = new bi.i6(M1, hb0Var, z3Var, a4Var, textView3);
                    hb0Var.setOnValueChangedListener(i6Var);
                    z3Var.setMinValue(0);
                    z3Var.setMaxValue(23);
                    int i39 = f18;
                    linearLayout.addView(z3Var, c8.ha.l(0.2f, 0, org.telegram.messenger.qs.t4));
                    z3Var.setFormatter(new zq(24));
                    z3Var.setOnValueChangedListener(i6Var);
                    a4Var.setMinValue(0);
                    a4Var.setMaxValue(59);
                    a4Var.setValue(0);
                    a4Var.setFormatter(new zq(25));
                    linearLayout.addView(a4Var, c8.ha.l(0.3f, 0, org.telegram.messenger.qs.t4));
                    a4Var.setOnValueChangedListener(i6Var);
                    if (j3 <= 0 || j3 == 2147483646) {
                        pdVar = pdVar2;
                        p3Var = p3Var2;
                        i13 = f20;
                    } else {
                        pdVar = pdVar2;
                        long j10 = j3 * 1000;
                        p3Var = p3Var2;
                        calendar.setTimeInMillis(System.currentTimeMillis());
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        calendar.set(11, 0);
                        i13 = f20;
                        int timeInMillis = (int) ((j10 - calendar.getTimeInMillis()) / 86400000);
                        calendar.setTimeInMillis(j10);
                        if (timeInMillis >= 0) {
                            a4Var.setValue(calendar.get(12));
                            z3Var.setValue(calendar.get(11));
                            hb0Var.setValue(timeInMillis);
                        }
                    }
                    final boolean[] zArr2 = {true};
                    org.telegram.ui.Components.v4.g(null, null, 0L, M1, 3, hb0Var, z3Var, a4Var);
                    org.telegram.ui.Components.v4.e(textView3, hb0Var, z3Var, a4Var);
                    mdVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                    mdVar.setGravity(17);
                    mdVar.setTextColor(f19);
                    mdVar.setTextSize(1, 14.0f);
                    mdVar.setTypeface(org.telegram.messenger.g0.o());
                    mdVar.setBackground(org.telegram.ui.ActionBar.z5.e(i13, 24.0f));
                    p3Var.addView(mdVar, c8.ha.t(-1, 48, 83, 14, 15, 14, 16));
                    mdVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.c2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            zArr2[0] = false;
                            long j11 = M1;
                            hb0 hb0Var2 = hb0Var;
                            z3 z3Var2 = z3Var;
                            a4 a4Var2 = a4Var;
                            boolean g10 = v4.g(null, null, 0L, j11, 3, hb0Var2, z3Var2, a4Var2);
                            v4.e(textView3, hb0Var2, z3Var2, a4Var2);
                            long currentTimeMillis = System.currentTimeMillis();
                            Calendar calendar2 = calendar;
                            calendar2.setTimeInMillis(currentTimeMillis);
                            calendar2.add(6, hb0Var2.getValue());
                            calendar2.set(11, z3Var2.getValue());
                            calendar2.set(12, a4Var2.getValue());
                            if (g10) {
                                calendar2.set(13, 0);
                                calendar2.set(14, 0);
                            }
                            f2Var2.L((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                            ((org.telegram.ui.ActionBar.v2) f1Var.b).x0.run();
                        }
                    });
                    p3Var.addView(textView3, c8.ha.t(-1, -2, 83, 14, 0, 14, 16));
                    org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) f1Var.b;
                    v2Var.N = frameLayout2;
                    v2Var.show();
                    v2Var.setOnDismissListener(new org.telegram.ui.Components.d2(0, pdVar, zArr2));
                    v2Var.v0(i39);
                    v2Var.O(i39);
                    break;
                }
                break;
            case 19:
                org.telegram.ui.Components.cx cxVar = (org.telegram.ui.Components.cx) obj4;
                org.telegram.ui.ActionBar.u1[] u1VarArr2 = (org.telegram.ui.ActionBar.u1[]) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                h9.f1 f1Var2 = (h9.f1) obj;
                try {
                    u1VarArr2[0].dismiss();
                } catch (Throwable unused) {
                }
                u1VarArr2[0] = null;
                if (tLObject5 instanceof TLRPC.TL_emojiURL) {
                    vf.c.t(((org.telegram.ui.Components.gx) cxVar.c.b).F.getContext(), ((TLRPC.TL_emojiURL) tLObject5).url);
                    ((org.telegram.ui.ActionBar.v2) f1Var2.b).x0.run();
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.zx zxVar = (org.telegram.ui.Components.zx) obj4;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                Runnable runnable = (Runnable) obj;
                ArrayList arrayList7 = zxVar.s;
                org.telegram.ui.Components.ay ayVar = zxVar.x;
                if (ayVar.M == zxVar.b) {
                    ayVar.L = 0;
                    if (tL_messages_getStickers.emoticon.equals(zxVar.a)) {
                        if (!(tLObject6 instanceof TLRPC.TL_messages_stickers)) {
                            runnable.run();
                            break;
                        } else {
                            TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject6;
                            int size2 = arrayList7.size();
                            int size3 = tL_messages_stickers.stickers.size();
                            while (i18 < size3) {
                                TLRPC.Document document = tL_messages_stickers.stickers.get(i18);
                                if (zxVar.w.indexOfKey(document.id) < 0) {
                                    arrayList7.add(document);
                                }
                                i18++;
                            }
                            if (size2 != arrayList7.size()) {
                                zxVar.f.put(arrayList7, ayVar.N);
                                if (size2 == 0) {
                                    zxVar.h.add(arrayList7);
                                }
                            }
                        }
                    }
                    runnable.run();
                    break;
                }
                break;
            case 21:
                org.telegram.ui.Components.vz vzVar = (org.telegram.ui.Components.vz) obj4;
                TLObject tLObject7 = (TLObject) obj2;
                org.telegram.messenger.c20 c20Var = (org.telegram.messenger.c20) obj;
                vzVar.r2 = -1;
                org.telegram.ui.ActionBar.f2 f2Var3 = vzVar.o1;
                gz.x0((TLRPC.TL_error) obj3, f2Var3, org.telegram.ui.Components.hc.a0(f2Var3));
                if (tLObject7 != null) {
                    if (tLObject7 instanceof TLRPC.Updates) {
                        TLRPC.Updates updates = (TLRPC.Updates) tLObject7;
                        ArrayList<TLRPC.Update> arrayList8 = updates.updates;
                        if (arrayList8.isEmpty()) {
                            TLRPC.Update update = updates.update;
                            if (update instanceof TL_update.TL_updateDialogFilter) {
                                i16 = ((TL_update.TL_updateDialogFilter) update).id;
                            }
                        } else {
                            while (true) {
                                if (i18 < arrayList8.size()) {
                                    if (arrayList8.get(i18) instanceof TL_update.TL_updateDialogFilter) {
                                        i16 = ((TL_update.TL_updateDialogFilter) arrayList8.get(i18)).id;
                                    } else {
                                        i18++;
                                    }
                                }
                            }
                        }
                    }
                    if (vzVar.R1 instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        f2Var3.getMessagesController().c3(true, new hi.d4(vzVar, c20Var, i16, i17));
                        break;
                    } else {
                        if (vzVar.S1 != null) {
                            f2Var3.getMessagesController().H(vzVar.Q1, true);
                        }
                        vzVar.s2 = true;
                        vzVar.dismiss();
                        c20Var.a(Integer.valueOf(i16));
                        break;
                    }
                } else {
                    vzVar.d2.a(false);
                    break;
                }
            case 22:
                a();
                break;
            case 23:
                b();
                break;
            case 24:
                c();
                break;
            case 25:
                d();
                break;
            case 26:
                f();
                break;
            case 27:
                g();
                break;
            case 28:
                h();
                break;
            default:
                ww wwVar = (ww) obj3;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) obj2;
                org.telegram.ui.Components.k60 k60Var = (org.telegram.ui.Components.k60) obj;
                byte[] bArr = tL_sponsoredPeer.random_id;
                org.telegram.ui.ActionBar.f6 resourceProvider = wwVar.getResourceProvider();
                org.telegram.ui.Components.v80 v80Var = new org.telegram.ui.Components.v80(i15, (org.telegram.ui.Components.yl0) obj4, tL_sponsoredPeer);
                int i40 = oy0.s1;
                int currentAccount = wwVar.getCurrentAccount();
                Activity parentActivity = wwVar.getParentActivity();
                if (parentActivity != null) {
                    TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
                    tL_messages_reportSponsoredMessage.random_id = bArr;
                    tL_messages_reportSponsoredMessage.option = new byte[0];
                    ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new org.telegram.messenger.ox(parentActivity, resourceProvider, bArr, wwVar, v80Var, currentAccount));
                }
                k60Var.u();
                break;
        }
    }

    public /* synthetic */ m6(Object obj, boolean[] zArr, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = zArr;
        this.d = obj2;
        this.e = obj3;
    }
}
