package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
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
import c8.i9;
import c8.ja;
import c8.na;
import di.t7;
import di.ub;
import hi.g7;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.ou;
import org.telegram.messenger.q10;
import org.telegram.messenger.vq;
import org.telegram.messenger.vr;
import org.telegram.messenger.xp;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.d70;
import org.telegram.ui.Components.df;
import org.telegram.ui.Components.dr;
import org.telegram.ui.Components.e70;
import org.telegram.ui.Components.ef;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fy;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.ih;
import org.telegram.ui.Components.ix;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.lx;
import org.telegram.ui.Components.oe;
import org.telegram.ui.Components.pe;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.re;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.vs;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.y31;
import org.telegram.ui.Components.zz;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.an;
import org.telegram.ui.br;
import org.telegram.ui.hp;
import org.telegram.ui.hz;
import org.telegram.ui.i8;
import org.telegram.ui.la;
import org.telegram.ui.mp;
import org.telegram.ui.pq;
import org.telegram.ui.qq;
import org.telegram.ui.to;
import org.telegram.ui.up;
import org.telegram.ui.vp;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class m5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m5(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        fy fyVar = (fy) this.b;
        TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.c;
        TLObject tLObject = (TLObject) this.d;
        Runnable runnable = (Runnable) this.e;
        ArrayList arrayList = fyVar.s;
        gy gyVar = fyVar.x;
        if (gyVar.N != fyVar.b) {
            return;
        }
        gyVar.M = 0;
        if (tL_messages_getStickers.emoticon.equals(fyVar.a)) {
            if (!(tLObject instanceof TLRPC.TL_messages_stickers)) {
                runnable.run();
                return;
            }
            TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
            int size = arrayList.size();
            int size2 = tL_messages_stickers.stickers.size();
            for (int i7 = 0; i7 < size2; i7++) {
                TLRPC.Document document = tL_messages_stickers.stickers.get(i7);
                if (fyVar.w.indexOfKey(document.id) < 0) {
                    arrayList.add(document);
                }
            }
            if (size != arrayList.size()) {
                fyVar.f.put(arrayList, gyVar.O);
                if (size == 0) {
                    fyVar.h.add(arrayList);
                }
            }
        }
        runnable.run();
    }

    private final void b() {
        zz zzVar = (zz) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLObject tLObject = (TLObject) this.d;
        z10 z10Var = (z10) this.e;
        int i7 = -1;
        zzVar.v2 = -1;
        e2 e2Var = zzVar.s1;
        hz.x0(tL_error, e2Var, cc.a0(e2Var));
        int i10 = 0;
        if (tLObject == null) {
            zzVar.h2.a(false);
            return;
        }
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            ArrayList<TLRPC.Update> arrayList = updates.updates;
            if (arrayList.isEmpty()) {
                TLRPC.Update update = updates.update;
                if (update instanceof TL_update.TL_updateDialogFilter) {
                    i7 = ((TL_update.TL_updateDialogFilter) update).id;
                }
            } else {
                while (true) {
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    if (arrayList.get(i10) instanceof TL_update.TL_updateDialogFilter) {
                        i7 = ((TL_update.TL_updateDialogFilter) arrayList.get(i10)).id;
                        break;
                    }
                    i10++;
                }
            }
        }
        if (zzVar.V1 instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            e2Var.getMessagesController().c3(true, new bi.w2(zzVar, z10Var, i7, 5));
            return;
        }
        if (zzVar.W1 != null) {
            e2Var.getMessagesController().H(zzVar.U1, true);
        }
        zzVar.w2 = true;
        zzVar.dismiss();
        z10Var.a(Integer.valueOf(i7));
    }

    private final void c() {
        int b10;
        a0.h hVar;
        ArrayList arrayList;
        a0.h hVar2;
        k20 k20Var = (k20) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLObject tLObject = (TLObject) this.d;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) this.e;
        cv0 cv0Var = k20Var.u1;
        a0.h hVar3 = k20Var.V1;
        a0.h hVar4 = k20Var.W1;
        ArrayList arrayList2 = k20Var.S1;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            np.s1(k20Var.a).Y3(tL_channels_channelParticipants.users, false);
            np.s1(k20Var.a).S3(tL_channels_channelParticipants.chats, false);
            long e10 = m10.i(k20Var.a).e();
            int i7 = 0;
            while (true) {
                if (i7 >= tL_channels_channelParticipants.participants.size()) {
                    break;
                }
                if (gj.B1(tL_channels_channelParticipants.participants.get(i7).peer) == e10) {
                    tL_channels_channelParticipants.participants.remove(i7);
                    break;
                }
                i7++;
            }
            k20Var.P1--;
            if (tL_channels_getParticipants.filter instanceof TLRPC.TL_channelParticipantsContacts) {
                arrayList = k20Var.T1;
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
                hVar.k(channelParticipant, gj.B1(channelParticipant.peer));
            }
            int size2 = arrayList2.size();
            int i11 = 0;
            while (i11 < size2) {
                long B1 = gj.B1(((TLRPC.ChannelParticipant) arrayList2.get(i11)).peer);
                boolean z10 = hVar4.f(B1) != null || ((hVar2 = k20Var.Z1) != null && hVar2.h(B1) >= 0);
                TLRPC.User a22 = np.s1(k20Var.a).a2(Long.valueOf(B1));
                if ((a22 != null && a22.bot) || q10.x(a22)) {
                    z10 = true;
                }
                if (z10) {
                    arrayList2.remove(i11);
                    hVar3.l(B1);
                    i11--;
                    size2--;
                }
                i11++;
            }
            try {
                if (k20Var.R1.participants_count <= 200) {
                    Collections.sort(arrayList, new up(k20Var, ConnectionsManager.getInstance(k20Var.a).getCurrentTime(), 1));
                }
            } catch (Exception e11) {
                a8.g(e11, true);
            }
        }
        if (k20Var.P1 <= 0) {
            k20Var.X1 = false;
            k20Var.Y1 = true;
            if (k20Var.l2 == 1) {
                b10 = 1;
            } else {
                tj0 tj0Var = k20Var.q1;
                b10 = tj0Var != null ? tj0Var.b() - 1 : 0;
            }
            k20Var.O0(b10);
            if (arrayList2.isEmpty()) {
                k20Var.c2 = true;
                k20Var.R0();
            }
        }
        k20Var.T0();
        tj0 tj0Var2 = k20Var.q1;
        if (tj0Var2 != null) {
            tj0Var2.f();
            if (cv0Var != null && k20Var.q1.b() == 0 && k20Var.Y1) {
                cv0Var.e(false, true);
            }
        }
    }

    private final void d() {
        e70 e70Var = (e70) this.b;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
        TLRPC.Updates updates = (TLRPC.Updates) this.d;
        TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.e;
        e2 e2Var = e70Var.o1;
        if (e2Var == null || e2Var.getParentActivity() == null) {
            return;
        }
        if (tL_error != null) {
            "USER_ALREADY_PARTICIPANT".equals(tL_error.text);
            org.telegram.ui.Components.t4.c0(e70Var.a, tL_error, e2Var, tL_messages_importChatInvite, new Object[0]);
            return;
        }
        if (updates == null || updates.chats.isEmpty()) {
            return;
        }
        TLRPC.Chat chat = updates.chats.get(0);
        chat.left = false;
        chat.kicked = false;
        np.s1(e70Var.a).Y3(updates.users, false);
        np.s1(e70Var.a).S3(updates.chats, false);
        long j3 = chat.id;
        boolean z10 = !org.telegram.messenger.t3.V(chat);
        e70Var.getClass();
        Bundle j10 = a8.p0.j(j3, "chat_id");
        np s12 = np.s1(e70Var.a);
        e2 e2Var2 = e70Var.o1;
        if (s12.E(j10, e2Var2, null, null)) {
            e2Var2.presentFragment(new d70(e70Var, j10, z10, j3), e2Var2 instanceof an);
        }
    }

    private final void f() {
        t70 t70Var = (t70) this.b;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLObject tLObject = (TLObject) this.e;
        t70Var.E = false;
        t70Var.M = tL_chatInviteExported.link;
        if (tL_error == null) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) tLObject;
            if (tL_chatInviteExported.importers == null) {
                tL_chatInviteExported.importers = new ArrayList<>(3);
            }
            tL_chatInviteExported.importers.clear();
            for (int i7 = 0; i7 < tL_messages_chatInviteImporters.users.size(); i7++) {
                tL_chatInviteExported.importers.addAll(tL_messages_chatInviteImporters.users);
            }
            t70Var.d(tL_chatInviteExported.usage, tL_chatInviteExported.importers, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        TLRPC.User user;
        Throwable th2;
        TLRPC.TL_webPage tL_webPage;
        String[] strArr;
        pq pqVar;
        qq qqVar;
        ArrayList arrayList;
        int i10;
        int i11;
        long B1;
        int i12;
        String lowerCase;
        boolean z10;
        String K;
        String str;
        String str2;
        float f10;
        r1.g gVar;
        char c10;
        float f11;
        final float f12;
        r1.g gVar2;
        FrameLayout frameLayout;
        int i13 = this.a;
        int i14 = 13;
        int i15 = 2;
        int i16 = 1;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i13) {
            case 0:
                ((bi.w2) obj4).a(j6.T0((File) obj3, (String) obj2, (String[]) obj));
                break;
            case 1:
                org.telegram.ui.q6 q6Var = (org.telegram.ui.q6) obj4;
                q6Var.getClass();
                ((ai.j0) obj3).f(((float[]) obj2)[0]);
                if (((boolean[]) obj)[0]) {
                    q6Var.d.A0(true);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.q6 q6Var2 = (org.telegram.ui.q6) obj4;
                long[] jArr = (long[]) obj2;
                org.telegram.ui.p6 p6Var = (org.telegram.ui.p6) obj;
                if (!((boolean[]) obj3)[0]) {
                    jArr[0] = System.currentTimeMillis();
                    q6Var2.d.showDialog(p6Var);
                    break;
                }
                break;
            case 3:
                i8.Z((i8) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (Calendar) obj);
                break;
            case 4:
                la.Z((la) obj4, (t1) obj3, (TLRPC.TL_error) obj2, (TL_account.updateUsername) obj);
                break;
            case 5:
                an anVar = (an) obj4;
                e2 e2Var = (e2) obj3;
                gj gjVar = (gj) obj2;
                o4 o4Var = (o4) obj;
                if (e2Var instanceof is) {
                    i7 = 4;
                    anVar.getNotificationCenter().n((is) e2Var, 4);
                } else {
                    i7 = 4;
                }
                anVar.getNotificationCenter().k(i7, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", gjVar.k.action.channel_id);
                ((ActionBarLayout) o4Var).c(o4Var.getFragmentStack().size() - 1, new an(bundle));
                e2Var.finishFragment();
                break;
            case 6:
                an anVar2 = (an) obj4;
                TLObject tLObject = (TLObject) obj2;
                di.i2 i2Var = (di.i2) obj;
                ((vf.b) obj3).b();
                if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                    anVar2.getMessagesController().Y3(tL_contacts_resolvedPeer.users, false);
                    anVar2.getMessagesController().S3(tL_contacts_resolvedPeer.chats, false);
                    long o4 = org.telegram.messenger.m5.o(tL_contacts_resolvedPeer.peer);
                    if (o4 >= 0) {
                        user = anVar2.getMessagesController().a2(Long.valueOf(o4));
                        i2Var.a(user);
                        break;
                    }
                }
                user = null;
                i2Var.a(user);
            case 7:
                ImageView imageView = (ImageView) obj2;
                ImageView imageView2 = (ImageView) obj;
                ((long[]) obj4)[0] = SystemClock.elapsedRealtime();
                if (!((boolean[]) obj3)[0]) {
                    imageView = imageView2;
                }
                dr drVar = (dr) imageView.getDrawable();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new org.telegram.ui.a3(drVar, 4));
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(er.f);
                ofFloat.start();
                break;
            case 8:
                an anVar3 = (an) obj4;
                gj gjVar2 = (gj) obj3;
                t1 t1Var = (t1) obj2;
                boolean[] zArr = (boolean[]) obj;
                try {
                    tL_webPage = q80.g(gjVar2);
                    th2 = null;
                } catch (Throwable th3) {
                    a8.g(th3, true);
                    th2 = th3;
                    tL_webPage = null;
                }
                org.telegram.messenger.g0.h3(new di.m3(anVar3, t1Var, zArr, th2 == null && tL_webPage != null, gjVar2, tL_webPage));
                break;
            case 9:
                an anVar4 = (an) obj4;
                vr vrVar = (vr) obj;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) ((TLObject) obj3);
                if (((TLRPC.TL_error) obj2) != null || messages_messages.messages.isEmpty()) {
                    if (messages_messages != null) {
                        anVar4.C6 = messages_messages.count;
                    } else {
                        anVar4.C6 = 0;
                    }
                    vrVar.a.c(new vq(vrVar, anVar4.b(), anVar4.k6, anVar4.C6, 7));
                    int i17 = anVar4.C6;
                    if (i17 == 0) {
                        anVar4.D6 = true;
                        anVar4.rc(false);
                        break;
                    } else {
                        anVar4.y1.c(2, i17, true);
                        anVar4.ka();
                        break;
                    }
                } else {
                    int i18 = messages_messages.messages.get(0).id;
                    gj gjVar3 = (gj) anVar4.F6[0].get(i18);
                    vrVar.a.c(new xp(vrVar, i18, anVar4.k6, 4));
                    if (gjVar3 != null) {
                        TLRPC.Message message = gjVar3.k;
                        message.media_unread = true;
                        message.mentioned = true;
                    }
                    anVar4.l(i18, 0, false, 0, true, 0);
                    break;
                }
            case 10:
                an.T0((an) obj4, (TLRPC.TL_messageMediaWebPage) obj3, (TLRPC.TL_webPageAttributeStory) obj2, (org.telegram.ui.n6) obj);
                break;
            case 11:
                to.b0((to) obj4, (t1[]) obj3, (TLRPC.Chat) obj2, (e2) obj);
                break;
            case 12:
                mp mpVar = (mp) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                mpVar.getClass();
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.r0(password);
                    mpVar.u0(twoStepVerificationActivity.q0(), twoStepVerificationActivity);
                    break;
                }
                break;
            case 13:
                qq qqVar2 = (qq) obj4;
                TLObject tLObject3 = (TLObject) obj3;
                TLRPC.User user2 = (TLRPC.User) obj2;
                vp vpVar = (vp) obj;
                if (!(tLObject3 instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject3 instanceof TLRPC.TL_chatParticipantAdmin)) {
                    vpVar.a(1);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qqVar2.getParentActivity());
                    String M0 = hd.M0(R.string.AppName, "AppName");
                    t1 t1Var2 = alertDialog$Builder.a;
                    t1Var2.S = M0;
                    t1Var2.U = hd.a0(null, null, 2131754350, q10.p(user2));
                    alertDialog$Builder.k(hd.M0(2131747831, "OK"), new org.telegram.ui.w0(vpVar, 26));
                    alertDialog$Builder.h(hd.M0(2131752589, "Cancel"), null);
                    qqVar2.showDialog(t1Var2);
                    break;
                }
                break;
            case 14:
                pq pqVar2 = (pq) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                qq qqVar3 = pqVar2.E;
                String lowerCase2 = ((String) obj2).trim().toLowerCase();
                if (lowerCase2.length() == 0) {
                    org.telegram.messenger.g0.h3(new hp(pqVar2, new ArrayList(), new a0.h(), new ArrayList(), new ArrayList(), 1));
                    break;
                } else {
                    pq pqVar3 = pqVar2;
                    String S0 = hd.E0().S0(lowerCase2, true, false);
                    if (lowerCase2.equals(S0) || S0.length() == 0) {
                        S0 = null;
                    }
                    int i19 = (S0 != null ? 1 : 0) + 1;
                    String[] strArr2 = new String[i19];
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
                        int i20 = 0;
                        while (i20 < size) {
                            TLObject tLObject4 = (TLObject) arrayList2.get(i20);
                            if (tLObject4 instanceof TLRPC.ChatParticipant) {
                                strArr = strArr3;
                                pqVar = pqVar3;
                                B1 = ((TLRPC.ChatParticipant) tLObject4).user_id;
                            } else {
                                strArr = strArr3;
                                pqVar = pqVar3;
                                if (tLObject4 instanceof TLRPC.ChannelParticipant) {
                                    B1 = gj.B1(((TLRPC.ChannelParticipant) tLObject4).peer);
                                } else {
                                    qqVar = qqVar3;
                                    arrayList = arrayList2;
                                    i10 = size;
                                    i11 = i20;
                                    i20 = i11 + 1;
                                    pqVar3 = pqVar;
                                    strArr3 = strArr;
                                    qqVar3 = qqVar;
                                    arrayList2 = arrayList;
                                    size = i10;
                                }
                            }
                            if (B1 > 0) {
                                TLRPC.User a22 = qqVar3.getMessagesController().a2(Long.valueOf(B1));
                                i12 = size;
                                i11 = i20;
                                if (a22.id == qqVar3.getUserConfig().e()) {
                                    qqVar = qqVar3;
                                    arrayList = arrayList2;
                                    i10 = i12;
                                    i20 = i11 + 1;
                                    pqVar3 = pqVar;
                                    strArr3 = strArr;
                                    qqVar3 = qqVar;
                                    arrayList2 = arrayList;
                                    size = i10;
                                } else {
                                    lowerCase = q10.p(a22).toLowerCase();
                                    String n10 = q10.n(a22);
                                    String str3 = a22.first_name;
                                    qqVar = qqVar3;
                                    str2 = a22.last_name;
                                    str = str3;
                                    K = n10;
                                    z10 = false;
                                }
                            } else {
                                i12 = size;
                                i11 = i20;
                                TLRPC.Chat M02 = qqVar3.getMessagesController().M0(Long.valueOf(-B1));
                                lowerCase = M02.title.toLowerCase();
                                z10 = false;
                                K = org.telegram.messenger.t3.K(M02, false);
                                str = M02.title;
                                qqVar = qqVar3;
                                str2 = null;
                            }
                            arrayList = arrayList2;
                            i10 = i12;
                            String S02 = hd.E0().S0(lowerCase, true, z10);
                            if (lowerCase.equals(S02)) {
                                S02 = null;
                            }
                            int i21 = 0;
                            boolean z11 = false;
                            while (true) {
                                if (i21 < i19) {
                                    int i22 = i21;
                                    String str4 = strArr[i22];
                                    if (lowerCase.startsWith(str4) || i5.c.A(" ", str4, lowerCase) || (S02 != null && (S02.startsWith(str4) || i5.c.A(" ", str4, S02)))) {
                                        z11 = true;
                                    } else if (K != null && K.startsWith(str4)) {
                                        z11 = 2;
                                    }
                                    if (z11) {
                                        if (z11) {
                                            arrayList5.add(org.telegram.messenger.g0.r0(str, str2, str4));
                                        } else {
                                            arrayList5.add(org.telegram.messenger.g0.r0(r.b.k("@", K), null, "@" + str4));
                                        }
                                        arrayList6.add(tLObject4);
                                    } else {
                                        i21 = i22 + 1;
                                    }
                                }
                            }
                            i20 = i11 + 1;
                            pqVar3 = pqVar;
                            strArr3 = strArr;
                            qqVar3 = qqVar;
                            arrayList2 = arrayList;
                            size = i10;
                        }
                    }
                    qq qqVar4 = qqVar3;
                    String[] strArr4 = strArr3;
                    pq pqVar4 = pqVar3;
                    if (arrayList3 != null) {
                        for (int i23 = 0; i23 < arrayList3.size(); i23++) {
                            TLRPC.User a23 = qqVar4.getMessagesController().a2(Long.valueOf(((TLRPC.TL_contact) arrayList3.get(i23)).user_id));
                            if (a23.id != qqVar4.getUserConfig().e()) {
                                String lowerCase3 = q10.p(a23).toLowerCase();
                                String S03 = hd.E0().S0(lowerCase3, true, false);
                                if (lowerCase3.equals(S03)) {
                                    S03 = null;
                                }
                                int i24 = 0;
                                boolean z12 = false;
                                while (true) {
                                    if (i24 < i19) {
                                        String str5 = strArr4[i24];
                                        if (lowerCase3.startsWith(str5) || i5.c.A(" ", str5, lowerCase3) || (S03 != null && (S03.startsWith(str5) || i5.c.A(" ", str5, S03)))) {
                                            z12 = true;
                                        } else {
                                            String n11 = q10.n(a23);
                                            if (n11 != null && n11.startsWith(str5)) {
                                                z12 = 2;
                                            }
                                        }
                                        if (z12) {
                                            if (z12) {
                                                arrayList5.add(org.telegram.messenger.g0.r0(a23.first_name, a23.last_name, str5));
                                            } else {
                                                arrayList5.add(org.telegram.messenger.g0.r0("@" + q10.n(a23), null, "@" + str5));
                                            }
                                            arrayList4.add(a23);
                                            hVar.k(a23, a23.id);
                                        } else {
                                            i24++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    org.telegram.messenger.g0.h3(new hp(pqVar4, arrayList4, hVar, arrayList5, arrayList6, 1));
                    break;
                }
                break;
            case 15:
                String str6 = "https://t.me/addstyle/" + ((TL_aicompose.TL_aiComposeTone) obj3).slug;
                new org.telegram.ui.Components.l((org.telegram.ui.Components.d0) obj4, (Context) obj2, str6, str6, (e6) obj).show();
                break;
            case 16:
                org.telegram.ui.Components.s4 s4Var = (org.telegram.ui.Components.s4) obj4;
                t7 t7Var = (t7) obj3;
                t1[] t1VarArr = (t1[]) obj2;
                View view = (View) obj;
                String trim = s4Var.getText().toString().trim();
                Uri parse = Uri.parse(trim);
                if (parse == null || parse.getHost() == null) {
                    parse = Uri.parse("https://" + trim);
                }
                if (parse != null && parse.getHost() != null) {
                    String lowerCase4 = parse.getHost().toLowerCase();
                    if (lowerCase4.startsWith("www.")) {
                        lowerCase4 = lowerCase4.substring(4);
                    }
                    t7Var.a(lowerCase4);
                    t1 t1Var3 = t1VarArr[0];
                    if (t1Var3 != null) {
                        t1Var3.dismiss();
                    }
                    if (view != null) {
                        view.requestFocus();
                        break;
                    }
                } else {
                    org.telegram.messenger.g0.E3(s4Var);
                    break;
                }
                break;
            case 17:
                int[] iArr = (int[]) obj4;
                int[] iArr2 = (int[]) obj3;
                String[] strArr5 = (String[]) obj;
                TextView textView = (TextView) obj2;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) hd.M0(2131748506, null));
                spannableStringBuilder.append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                int i25 = 0;
                while (true) {
                    if (i25 < iArr.length) {
                        if (iArr2[0] == iArr[i25]) {
                            spannableStringBuilder.append((CharSequence) strArr5[i25]);
                            spannableStringBuilder.setSpan(new y31(org.telegram.messenger.g0.o()), length, spannableStringBuilder.length(), 33);
                        } else {
                            i25++;
                        }
                    }
                }
                spannableStringBuilder.append((CharSequence) " v");
                if (m10.i(m10.t0).q()) {
                    eq eqVar = new eq(R.drawable.arrows_select, 0);
                    eqVar.H = 0.7f;
                    float L = org.telegram.messenger.g0.L(-1.33f);
                    float L2 = org.telegram.messenger.g0.L(0.0f);
                    eqVar.r = L;
                    eqVar.s = L2;
                    eqVar.x = 0.75f;
                    spannableStringBuilder.setSpan(eqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                } else {
                    eq eqVar2 = new eq(R.drawable.mini_switch_lock, 0);
                    eqVar2.H = 0.7f;
                    float L3 = org.telegram.messenger.g0.L(-1.33f);
                    float L4 = org.telegram.messenger.g0.L(0.0f);
                    eqVar2.r = L3;
                    eqVar2.s = L4;
                    eqVar2.x = 0.75f;
                    spannableStringBuilder.setSpan(eqVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                textView.setText(spannableStringBuilder);
                break;
            case 18:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj4;
                int i26 = ChatActivityEnterView.N6;
                chatActivityEnterView.getClass();
                chatActivityEnterView.k1(((Boolean) obj3).booleanValue(), ((Integer) obj2).intValue(), ((Integer) obj).intValue(), 0L, true);
                break;
            case 19:
                final ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj4;
                final jt0 jt0Var = (jt0) obj3;
                int[] iArr3 = (int[]) obj2;
                en0 en0Var = (en0) obj;
                int[] iArr4 = chatActivityEnterView2.v3;
                if (chatActivityEnterView2.r0 != null) {
                    final Dialog dialog = new Dialog(chatActivityEnterView2.getContext(), R.style.TransparentDialogNoAnimation);
                    FrameLayout frameLayout2 = new FrameLayout(chatActivityEnterView2.getContext());
                    frameLayout2.addView(jt0Var, ja.e(40, 40, 3));
                    dialog.setContentView(frameLayout2);
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
                    org.telegram.messenger.g0.q3(dialog, j6.x0(null, j6.s8, true) == -1);
                    if (Build.VERSION.SDK_INT >= 26) {
                        org.telegram.messenger.g0.n3(dialog, org.telegram.messenger.g0.B(j6.x0(null, j6.a7, true)) >= 0.721f);
                    }
                    chatActivityEnterView2.t0 = chatActivityEnterView2.getRootWindowInsets().getSystemWindowInsetLeft() + chatActivityEnterView2.t0;
                    chatActivityEnterView2.q0.getLocationInWindow(iArr4);
                    final float f13 = iArr4[0];
                    float f14 = iArr4[1];
                    float L5 = org.telegram.messenger.g0.L(5.0f);
                    float L6 = iArr3[0] + chatActivityEnterView2.t0 + L5 + org.telegram.messenger.g0.L(4.0f) + 0.0f;
                    float f15 = iArr3[1] + chatActivityEnterView2.u0 + L5 + 0.0f;
                    jt0Var.setTranslationX(L6);
                    jt0Var.setTranslationY(f15);
                    float scaleX = (chatActivityEnterView2.q0.getLayoutParams().width * (chatActivityEnterView2.K6 ? chatActivityEnterView2.q0.getScaleX() : 1.0f)) / org.telegram.messenger.g0.L(40.0f);
                    jt0Var.setPivotX(0.0f);
                    jt0Var.setPivotY(0.0f);
                    jt0Var.setScaleX(0.75f);
                    jt0Var.setScaleY(0.75f);
                    jt0Var.getViewTreeObserver().addOnDrawListener(new pe(jt0Var, en0Var));
                    dialog.show();
                    if (chatActivityEnterView2.K6) {
                        f10 = 1.0f;
                    } else {
                        f10 = 1.0f;
                        chatActivityEnterView2.q0.setScaleX(1.0f);
                        chatActivityEnterView2.q0.setScaleY(1.0f);
                    }
                    chatActivityEnterView2.q0.setAlpha(f10);
                    oe oeVar = chatActivityEnterView2.r0;
                    boolean z13 = chatActivityEnterView2.K6;
                    r1.b bVar = r1.g.q;
                    if (z13) {
                        c10 = 3;
                        gVar = null;
                        f11 = 0.5f;
                    } else {
                        gVar = new r1.g(chatActivityEnterView2.q0, bVar);
                        c10 = 3;
                        f11 = 0.5f;
                        gVar.m = org.telegram.ui.Cells.y0.n(0.5f, 750.0f, f10);
                    }
                    boolean z14 = chatActivityEnterView2.K6;
                    r1.b bVar2 = r1.g.r;
                    if (z14) {
                        f12 = f14;
                        gVar2 = null;
                    } else {
                        f12 = f14;
                        r1.g gVar3 = new r1.g(chatActivityEnterView2.q0, bVar2);
                        gVar3.m = org.telegram.ui.Cells.y0.n(f11, 750.0f, f10);
                        gVar2 = gVar3;
                    }
                    r1.g gVar4 = new r1.g(chatActivityEnterView2.q0, r1.g.v);
                    gVar4.m = org.telegram.ui.Cells.y0.n(0.0f, 750.0f, f10);
                    final int i27 = 0;
                    r1.c cVar = new r1.c() { // from class: org.telegram.ui.Components.dd
                        @Override // r1.c
                        public final void a(r1.g gVar5, boolean z15, float f16, float f17) {
                            int i28 = i27;
                            float f18 = f12;
                            float f19 = f13;
                            jt0 jt0Var2 = jt0Var;
                            Dialog dialog2 = dialog;
                            ChatActivityEnterView chatActivityEnterView3 = chatActivityEnterView2;
                            switch (i28) {
                                case 0:
                                    int i29 = ChatActivityEnterView.N6;
                                    if (dialog2.isShowing()) {
                                        jt0Var2.setTranslationX(f19);
                                        jt0Var2.setTranslationY(f18);
                                        gn0 gn0Var = chatActivityEnterView3.q0;
                                        gn0Var.getClass();
                                        gn0Var.a(false, false, 0.0f);
                                        if (!chatActivityEnterView3.K6) {
                                            chatActivityEnterView3.q0.setScaleX(1.0f);
                                            chatActivityEnterView3.q0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView3.q0.setAlpha(1.0f);
                                        chatActivityEnterView3.q0.getViewTreeObserver().addOnPreDrawListener(new qe(chatActivityEnterView3, dialog2, 0));
                                        break;
                                    }
                                    break;
                                default:
                                    int i30 = ChatActivityEnterView.N6;
                                    if (dialog2.isShowing()) {
                                        jt0Var2.setTranslationX(f19);
                                        jt0Var2.setTranslationY(f18);
                                        gn0 gn0Var2 = chatActivityEnterView3.q0;
                                        gn0Var2.getClass();
                                        gn0Var2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView3.K6) {
                                            chatActivityEnterView3.q0.setScaleX(1.0f);
                                            chatActivityEnterView3.q0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView3.q0.setAlpha(1.0f);
                                        chatActivityEnterView3.q0.getViewTreeObserver().addOnPreDrawListener(new qe(chatActivityEnterView3, dialog2, 1));
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    float f16 = f12;
                    gVar4.a(cVar);
                    r1.g gVar5 = new r1.g(jt0Var, r1.g.o);
                    gVar5.b = i9.a(L6, f13 - org.telegram.messenger.g0.L(6.0f), L6);
                    gVar5.c = true;
                    gVar5.m = org.telegram.ui.Cells.y0.n(f13, 700.0f, 0.75f);
                    gVar5.h = f13 - org.telegram.messenger.g0.L(6.0f);
                    r1.g gVar6 = new r1.g(jt0Var, r1.g.p);
                    gVar6.b = i9.a(f15, f15, org.telegram.messenger.g0.L(6.0f) + f16);
                    gVar6.c = true;
                    gVar6.m = org.telegram.ui.Cells.y0.n(f16, 700.0f, 0.75f);
                    gVar6.g = org.telegram.messenger.g0.L(6.0f) + f16;
                    gVar6.b(new re(f16, jt0Var));
                    final int i28 = 1;
                    gVar6.a(new r1.c() { // from class: org.telegram.ui.Components.dd
                        @Override // r1.c
                        public final void a(r1.g gVar52, boolean z15, float f162, float f17) {
                            int i282 = i28;
                            float f18 = f12;
                            float f19 = f13;
                            jt0 jt0Var2 = jt0Var;
                            Dialog dialog2 = dialog;
                            ChatActivityEnterView chatActivityEnterView3 = chatActivityEnterView2;
                            switch (i282) {
                                case 0:
                                    int i29 = ChatActivityEnterView.N6;
                                    if (dialog2.isShowing()) {
                                        jt0Var2.setTranslationX(f19);
                                        jt0Var2.setTranslationY(f18);
                                        gn0 gn0Var = chatActivityEnterView3.q0;
                                        gn0Var.getClass();
                                        gn0Var.a(false, false, 0.0f);
                                        if (!chatActivityEnterView3.K6) {
                                            chatActivityEnterView3.q0.setScaleX(1.0f);
                                            chatActivityEnterView3.q0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView3.q0.setAlpha(1.0f);
                                        chatActivityEnterView3.q0.getViewTreeObserver().addOnPreDrawListener(new qe(chatActivityEnterView3, dialog2, 0));
                                        break;
                                    }
                                    break;
                                default:
                                    int i30 = ChatActivityEnterView.N6;
                                    if (dialog2.isShowing()) {
                                        jt0Var2.setTranslationX(f19);
                                        jt0Var2.setTranslationY(f18);
                                        gn0 gn0Var2 = chatActivityEnterView3.q0;
                                        gn0Var2.getClass();
                                        gn0Var2.a(false, false, 0.0f);
                                        if (!chatActivityEnterView3.K6) {
                                            chatActivityEnterView3.q0.setScaleX(1.0f);
                                            chatActivityEnterView3.q0.setScaleY(1.0f);
                                        }
                                        chatActivityEnterView3.q0.setAlpha(1.0f);
                                        chatActivityEnterView3.q0.getViewTreeObserver().addOnPreDrawListener(new qe(chatActivityEnterView3, dialog2, 1));
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    r1.g gVar7 = new r1.g(jt0Var, bVar);
                    gVar7.m = org.telegram.ui.Cells.y0.n(scaleX, 1000.0f, 1.0f);
                    r1.g gVar8 = new r1.g(jt0Var, bVar2);
                    gVar8.m = org.telegram.ui.Cells.y0.n(scaleX, 1000.0f, 1.0f);
                    r1.g[] gVarArr = new r1.g[7];
                    gVarArr[0] = gVar;
                    gVarArr[1] = gVar2;
                    gVarArr[2] = gVar4;
                    gVarArr[c10] = gVar5;
                    gVarArr[4] = gVar6;
                    gVarArr[5] = gVar7;
                    gVarArr[6] = gVar8;
                    oeVar.l(gVarArr);
                    break;
                }
                break;
            case 20:
                gf gfVar = (gf) obj4;
                FrameLayout frameLayout3 = (FrameLayout) obj3;
                View view2 = (View) obj2;
                ChatActivityEnterView chatActivityEnterView3 = gfVar.a;
                int i29 = ChatActivityEnterView.N6;
                ai.m0 o02 = chatActivityEnterView3.o0();
                ef efVar = new ef(gfVar, frameLayout3, 1);
                org.telegram.ui.Components.q2 q2Var = new org.telegram.ui.Components.q2((g7) obj, i15);
                df dfVar = new df(0, frameLayout3);
                o02.g();
                Context context = o02.h;
                e6 e6Var = o02.n;
                bi.x0 x0Var = new bi.x0(context, view2, e6Var, efVar);
                int[] iArr5 = new int[2];
                view2.getLocationInWindow(iArr5);
                x0Var.R = iArr5[1] > org.telegram.messenger.g0.q.y / 2;
                x0Var.K = org.telegram.messenger.g0.L(ns.x3);
                x0Var.J = 0;
                x0Var.f = org.telegram.messenger.g0.L(ns.P4);
                int w02 = j6.w0(j6.G6, e6Var);
                ArrayList y10 = o02.y();
                int size2 = y10.size();
                int i30 = 0;
                while (i30 < size2) {
                    Object obj5 = y10.get(i30);
                    i30++;
                    ai.h hVar2 = (ai.h) obj5;
                    x0Var.a(new ai.l0(o02.h, hVar2, w02, o02.f.b.R, false), 44, new a1.e(16, q2Var, hVar2));
                }
                x0Var.setFocusableInTouchMode(true);
                x0Var.setOnKeyListener(new ai.d0(2, x0Var));
                x0Var.P = dfVar;
                frameLayout3.addView(x0Var, new FrameLayout.LayoutParams(-1, -1));
                x0Var.requestFocus();
                x0Var.f();
                break;
            case 21:
                jn jnVar = (jn) obj4;
                Context context2 = (Context) obj3;
                e6 e6Var2 = (e6) obj;
                long j3 = jnVar.W;
                final org.telegram.ui.Components.f1 f1Var = new org.telegram.ui.Components.f1(14, jnVar, (View) obj2);
                ih ihVar = new ih(i16);
                int i31 = j6.j5;
                int f17 = e6Var2 != null ? e6Var2.f(i31) : j6.x0(null, i31, false);
                int i32 = j6.h5;
                int f18 = e6Var2 != null ? e6Var2.f(i32) : j6.x0(null, i32, false);
                int i33 = j6.Aj;
                if (e6Var2 != null) {
                    e6Var2.f(i33);
                } else {
                    j6.x0(null, i33, false);
                }
                int i34 = j6.Ej;
                if (e6Var2 != null) {
                    e6Var2.f(i34);
                } else {
                    j6.x0(null, i34, false);
                }
                int i35 = j6.E8;
                if (e6Var2 != null) {
                    e6Var2.f(i35);
                } else {
                    j6.x0(null, i35, false);
                }
                int i36 = j6.G8;
                if (e6Var2 != null) {
                    e6Var2.f(i36);
                } else {
                    j6.x0(null, i36, false);
                }
                int i37 = j6.i6;
                if (e6Var2 != null) {
                    e6Var2.f(i37);
                } else {
                    j6.x0(null, i37, false);
                }
                int i38 = j6.Ji;
                int f19 = e6Var2 != null ? e6Var2.f(i38) : j6.x0(null, i38, false);
                int i39 = j6.Fi;
                int f20 = e6Var2 != null ? e6Var2.f(i39) : j6.x0(null, i39, false);
                int i40 = j6.Hi;
                if (e6Var2 != null) {
                    e6Var2.f(i40);
                } else {
                    j6.x0(null, i40, false);
                }
                Pattern pattern = org.telegram.ui.Components.t4.a;
                if (context2 != null) {
                    int i41 = f19;
                    final int z02 = (int) np.s1(m10.t0).y7.E.z0(TimeUnit.SECONDS);
                    final ou ouVar = new ou(context2, e6Var2);
                    ((u2) ouVar.b).w0 = false;
                    final ib0 ib0Var = new ib0(context2, e6Var2);
                    ib0Var.setTextColor(f17);
                    ib0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
                    ib0Var.setItemCount(5);
                    final org.telegram.ui.Components.x3 x3Var = new org.telegram.ui.Components.x3(context2, e6Var2);
                    x3Var.setWrapSelectorWheel(true);
                    x3Var.setAllItemsCount(24);
                    x3Var.setItemCount(5);
                    x3Var.setTextColor(f17);
                    x3Var.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
                    final org.telegram.ui.Components.y3 y3Var = new org.telegram.ui.Components.y3(context2, e6Var2);
                    y3Var.setWrapSelectorWheel(true);
                    y3Var.setAllItemsCount(60);
                    y3Var.setItemCount(5);
                    y3Var.setTextColor(f17);
                    y3Var.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
                    FrameLayout frameLayout4 = new FrameLayout(context2);
                    org.telegram.ui.Components.n3 n3Var = new org.telegram.ui.Components.n3(context2, ib0Var, x3Var, y3Var, 3);
                    n3Var.setOrientation(1);
                    frameLayout4.addView(n3Var, ja.c(-1.0f, -1));
                    frameLayout4.addView(new FrameLayout(context2), ja.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
                    FrameLayout frameLayout5 = new FrameLayout(context2);
                    n3Var.addView(frameLayout5, ja.t(-1, -2, 51, 22, 0, 0, 4));
                    TextView textView2 = new TextView(context2);
                    textView2.setText(hd.M0(2131744827, null));
                    textView2.setTextColor(f17);
                    i5.c.v(textView2, 1, 20.0f);
                    frameLayout5.addView(textView2, ja.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                    textView2.setOnTouchListener(new gi.a(10));
                    LinearLayout linearLayout = new LinearLayout(context2);
                    linearLayout.setOrientation(0);
                    linearLayout.setWeightSum(1.0f);
                    n3Var.addView(linearLayout, ja.q(-1, -2, 1.0f, 0, 0, 23, 0, 23));
                    final TextView textView3 = new TextView(context2);
                    textView3.setTextSize(1, 12.0f);
                    q6.U(textView3, j6.q5, e6Var2);
                    textView3.setGravity(17);
                    final Calendar calendar = Calendar.getInstance();
                    ub ubVar = new ub(context2, 16);
                    ubVar.setText(hd.M0(2131744828, null));
                    na.b(ubVar, 0.02f, 1.2f);
                    linearLayout.addView(ib0Var, ja.l(0.5f, 0, ns.t4));
                    ib0Var.setMinValue(0);
                    ib0Var.setMaxValue(365);
                    ib0Var.setWrapSelectorWheel(false);
                    ib0Var.setFormatter(new br(27));
                    bi.b3 b3Var = new bi.b3(z02, ib0Var, x3Var, y3Var, textView3);
                    ib0Var.setOnValueChangedListener(b3Var);
                    x3Var.setMinValue(0);
                    x3Var.setMaxValue(23);
                    int i42 = f18;
                    linearLayout.addView(x3Var, ja.l(0.2f, 0, ns.t4));
                    x3Var.setFormatter(new br(28));
                    x3Var.setOnValueChangedListener(b3Var);
                    y3Var.setMinValue(0);
                    y3Var.setMaxValue(59);
                    y3Var.setValue(0);
                    y3Var.setFormatter(new br(29));
                    linearLayout.addView(y3Var, ja.l(0.3f, 0, ns.t4));
                    y3Var.setOnValueChangedListener(b3Var);
                    if (j3 <= 0 || j3 == 2147483646) {
                        frameLayout = frameLayout4;
                    } else {
                        long j10 = 1000 * j3;
                        calendar.setTimeInMillis(System.currentTimeMillis());
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        calendar.set(11, 0);
                        frameLayout = frameLayout4;
                        int timeInMillis = (int) ((j10 - calendar.getTimeInMillis()) / 86400000);
                        calendar.setTimeInMillis(j10);
                        if (timeInMillis >= 0) {
                            y3Var.setValue(calendar.get(12));
                            x3Var.setValue(calendar.get(11));
                            ib0Var.setValue(timeInMillis);
                        }
                    }
                    final boolean[] zArr2 = {true};
                    org.telegram.ui.Components.t4.g(null, null, 0L, z02, 3, ib0Var, x3Var, y3Var);
                    org.telegram.ui.Components.t4.e(textView3, ib0Var, x3Var, y3Var);
                    ubVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
                    ubVar.setGravity(17);
                    ubVar.setTextColor(i41);
                    ubVar.setTextSize(1, 14.0f);
                    ubVar.setTypeface(org.telegram.messenger.g0.o());
                    ubVar.setBackground(y5.e(f20, 24.0f));
                    n3Var.addView(ubVar, ja.t(-1, 48, 83, 14, 15, 14, 16));
                    ubVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.b2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            zArr2[0] = false;
                            long j11 = z02;
                            ib0 ib0Var2 = ib0Var;
                            x3 x3Var2 = x3Var;
                            y3 y3Var2 = y3Var;
                            boolean g10 = t4.g(null, null, 0L, j11, 3, ib0Var2, x3Var2, y3Var2);
                            t4.e(textView3, ib0Var2, x3Var2, y3Var2);
                            long currentTimeMillis = System.currentTimeMillis();
                            Calendar calendar2 = calendar;
                            calendar2.setTimeInMillis(currentTimeMillis);
                            calendar2.add(6, ib0Var2.getValue());
                            calendar2.set(11, x3Var2.getValue());
                            calendar2.set(12, y3Var2.getValue());
                            if (g10) {
                                calendar2.set(13, 0);
                                calendar2.set(14, 0);
                            }
                            f1Var.L((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                            ((org.telegram.ui.ActionBar.u2) ouVar.b).y0.run();
                        }
                    });
                    n3Var.addView(textView3, ja.t(-1, -2, 83, 14, 0, 14, 16));
                    u2 u2Var = (u2) ouVar.b;
                    u2Var.O = frameLayout;
                    u2Var.show();
                    u2Var.setOnDismissListener(new org.telegram.ui.Components.c2(0, ihVar, zArr2));
                    u2Var.v0(i42);
                    u2Var.P(i42);
                    break;
                }
                break;
            case 22:
                ix ixVar = (ix) obj4;
                t1[] t1VarArr2 = (t1[]) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                ou ouVar2 = (ou) obj;
                try {
                    t1VarArr2[0].dismiss();
                } catch (Throwable unused) {
                }
                t1VarArr2[0] = null;
                if (tLObject5 instanceof TLRPC.TL_emojiURL) {
                    vf.c.t(((lx) ixVar.c.b).G.getContext(), ((TLRPC.TL_emojiURL) tLObject5).url);
                    ((u2) ouVar2.b).y0.run();
                    break;
                }
                break;
            case 23:
                a();
                break;
            case 24:
                b();
                break;
            case 25:
                ((yw) obj4).I4(((Integer) obj3).intValue());
                org.telegram.messenger.g0.i3(new vs(i14, (gh) obj2, (e2) obj), 200L);
                break;
            case 26:
                c();
                break;
            case 27:
                d();
                break;
            case 28:
                f();
                break;
            default:
                x80 x80Var = (x80) obj4;
                ArrayList arrayList7 = (ArrayList) obj2;
                boolean[] zArr3 = (boolean[]) obj;
                ((boolean[]) obj3)[0] = true;
                org.telegram.messenger.g0.r(x80Var.R);
                for (int i43 = 0; i43 < arrayList7.size(); i43++) {
                    ((TL_stories.StoryItem) arrayList7.get(i43)).pinned = zArr3[i43];
                }
                x80Var.getMessagesController().P1().q0(x80Var.e, arrayList7, false);
                break;
        }
    }

    public /* synthetic */ m5(pq pqVar, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.a = 14;
        this.b = pqVar;
        this.d = str;
        this.c = arrayList;
        this.e = arrayList2;
    }

    public /* synthetic */ m5(int[] iArr, int[] iArr2, String[] strArr, TextView textView) {
        this.a = 17;
        this.b = iArr;
        this.c = iArr2;
        this.e = strArr;
        this.d = textView;
    }
}
