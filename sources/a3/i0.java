package a3;

import ag.w0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.hs;
import org.telegram.messenger.jj;
import org.telegram.messenger.js;
import org.telegram.messenger.o5;
import org.telegram.messenger.q20;
import org.telegram.messenger.qz;
import org.telegram.messenger.t3;
import org.telegram.messenger.u3;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ef;
import org.telegram.ui.Components.em;
import org.telegram.ui.Components.gm;
import org.telegram.ui.Components.ig;
import org.telegram.ui.Components.im;
import org.telegram.ui.Components.jm;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.zt0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ay;
import org.telegram.ui.b50;
import org.telegram.ui.cb0;
import org.telegram.ui.fn;
import org.telegram.ui.kt0;
import org.telegram.ui.pr;
import org.telegram.ui.qq;
import org.telegram.ui.tt;
import org.telegram.ui.un;
import org.telegram.ui.v80;
import org.telegram.ui.y80;
import org.telegram.ui.yb0;
import ph.l1;
import rh.e4;
import th.d5;
import th.e5;
import th.n5;
import th.o7;
import th.q5;
import th.r5;
import vh.r0;
import vh.s0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i0(Object obj, long j10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ji.k kVar;
        int i10;
        gm gmVar;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        int i13 = 1;
        switch (this.a) {
            case 0:
                hf.b bVar = (hf.b) this.c;
                Object obj = this.d;
                long j10 = this.b;
                m0 m0Var = (m0) bVar.c;
                String str = e2.l0.a;
                i2.i0 i0Var = ((i2.c0) m0Var).a;
                j2.g gVar = i0Var.s;
                j2.a U = gVar.U();
                gVar.V(U, 26, new ag.m(U, obj, j10));
                if (i0Var.T == obj) {
                    i0Var.m.e(26, new d2.c(21));
                    return;
                }
                return;
            case 1:
                ji.f fVar = (ji.f) this.c;
                ji.e eVar = (ji.e) this.d;
                long j11 = this.b;
                if (((ji.e) fVar.c) != eVar) {
                    return;
                }
                ji.c cVar = (ji.c) fVar.e;
                if (cVar != null) {
                    org.telegram.messenger.i0.r(cVar);
                    kVar = null;
                    fVar.e = null;
                } else {
                    kVar = null;
                }
                synchronized (ji.k.y) {
                    try {
                        ji.k kVar2 = ji.k.A;
                        if (kVar2 != null) {
                            kVar2.q();
                            ji.k.A = kVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                fVar.c = kVar;
                eVar.c.run(j11);
                fVar.q();
                return;
            case 2:
                ki.g gVar2 = (ki.g) this.c;
                long j12 = this.b;
                Exception exc = (Exception) this.d;
                ki.k kVar3 = (ki.k) gVar2.c;
                if (j12 != kVar3.o) {
                    return;
                }
                kVar3.n = null;
                int i14 = kVar3.G;
                if (i14 != 10 && i14 != 9) {
                    kVar3.g(exc);
                    return;
                }
                kVar3.h.a("capture error after session end", exc);
                kVar3.c();
                kVar3.t();
                return;
            case 3:
                ((VideoFramesRewinder) this.c).lambda$new$1((ArrayList) this.d, this.b);
                return;
            case 4:
                ((NativeInstance) this.c).lambda$onParticipantDescriptionsRequired$2(this.b, (int[]) this.d);
                return;
            case 5:
                ((VideoCapturerDevice) this.c).lambda$init$5(this.b, (String) this.d);
                return;
            case 6:
                ((VideoCapturerDevice) this.c).lambda$init$2(this.b, (Point) this.d);
                return;
            case 7:
                un unVar = (un) this.c;
                unVar.getMessagesController().p0(this.b, ((jj) this.d).f1(), unVar.j6);
                return;
            case 8:
                fn fnVar = (fn) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                long j13 = this.b;
                un unVar2 = fnVar.a;
                i10 = ((k2) unVar2).currentAccount;
                s4.s0(qz.C(i10).q0(arrayList, j13, false, false, true, 0, 0, null, -1, 0L, unVar2.a9(), unVar2.w5), unVar2, null);
                return;
            case 9:
                pr prVar = (pr) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                long j14 = this.b;
                prVar.getMessagesController().f0(prVar.M, user);
                prVar.z0(j14);
                if (prVar.n == null || user == null || !cc.a(prVar)) {
                    return;
                }
                cc.D(prVar, user, prVar.n.title).j();
                return;
            case 10:
                Runnable runnable = (Runnable) this.c;
                k2 k2Var = (k2) this.d;
                long j15 = this.b;
                if (runnable != null) {
                    runnable.run();
                }
                if (k2Var != null) {
                    k2Var.presentFragment(un.ha(j15));
                    return;
                }
                return;
            case 11:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                ef efVar = (ef) this.d;
                long j16 = this.b;
                int i15 = ChatActivityEnterView.s5;
                efVar.run();
                js.o(chatActivityEnterView.Q, j16);
                return;
            case 12:
                bi biVar = (bi) this.c;
                s4.L(biVar.getContext(), this.b, new ig(biVar, 16), (p6) this.d);
                return;
            case 13:
                im imVar = (im) this.c;
                long j17 = this.b;
                gm gmVar2 = (gm) this.d;
                jm jmVar = imVar.P;
                if (!jmVar.r.I1 && imVar.D == j17 && (gmVar = imVar.F) == gmVar2) {
                    jmVar.J = gmVar;
                    jmVar.M = gmVar.a.a;
                    jmVar.K = false;
                    imVar.G = 0.0f;
                    imVar.invalidate();
                    ValueAnimator valueAnimator = jmVar.L;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    jmVar.L = ofFloat;
                    ofFloat.addUpdateListener(new em(imVar, 0));
                    jmVar.L.setDuration(200L);
                    jmVar.L.start();
                    gm gmVar3 = jmVar.J;
                    RectF f7 = gmVar3.f(gmVar3.e());
                    RectF d = jmVar.J.d();
                    jmVar.G = (((jmVar.D - f7.left) / f7.width()) + 0.5f) / 2.0f;
                    jmVar.F = (jmVar.E - f7.top) / f7.height();
                    jmVar.H = d.width();
                    jmVar.I = d.height();
                    try {
                        jmVar.performHapticFeedback(0, 2);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 14:
                t70.td((t70) this.c, this.b, (TLRPC.Chat) this.d);
                return;
            case 15:
                ((zt0) this.c).x1.presentFragment(un.ga(((jj) this.d).f1(), this.b));
                return;
            case 16:
                bw0.A1((bw0) this.c, (TLRPC.TL_messages_emojiGroups) this.d, this.b);
                return;
            case 17:
                ay ayVar = (ay) this.c;
                long j18 = this.b;
                h0 h0Var = (h0) this.d;
                if (ayVar.G.bot_admin_rights != null) {
                    ayVar.getMessagesController().M4(-j18, ayVar.getMessagesController().Z1(Long.valueOf(ayVar.H)), ayVar.G.bot_admin_rights, null, false, ayVar, true, true, null, h0Var, new tt(h0Var, 5));
                    return;
                } else {
                    h0Var.run();
                    return;
                }
            case 18:
                b50 b50Var = (b50) this.c;
                TLRPC.Updates updates = (TLRPC.Updates) this.d;
                long j19 = this.b;
                TLRPC.Update update = updates.update;
                if (update instanceof TL_update.TL_updateNewMessage) {
                    TLRPC.Message message = ((TL_update.TL_updateNewMessage) update).message;
                    i11 = (message == null || !(message.action instanceof TLRPC.TL_messageActionConferenceCall)) ? 0 : message.id;
                } else if (update instanceof TL_update.TL_updateMessageID) {
                    i11 = ((TL_update.TL_updateMessageID) update).id;
                } else {
                    if (updates.updates != null) {
                        for (int i16 = 0; i16 < updates.updates.size(); i16++) {
                            TLRPC.Update update2 = updates.updates.get(i16);
                            if (update2 instanceof TL_update.TL_updateNewMessage) {
                                TLRPC.Message message2 = ((TL_update.TL_updateNewMessage) update2).message;
                                if (message2 != null && (message2.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                                    i11 = message2.id;
                                }
                            } else if (update2 instanceof TL_update.TL_updateMessageID) {
                                i11 = ((TL_update.TL_updateMessageID) update2).id;
                            }
                        }
                    }
                    i11 = 0;
                }
                u3 u3Var = b50Var.R2;
                if (u3Var == null || i11 == 0) {
                    return;
                }
                HashMap hashMap = u3Var.k;
                Long valueOf = Long.valueOf(j19);
                t3 t3Var = new t3();
                t3Var.a = i11;
                t3Var.b = true;
                t3Var.c = System.currentTimeMillis();
                hashMap.put(valueOf, t3Var);
                b50Var.Q0(true);
                return;
            case 19:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                Long l4 = (Long) this.d;
                long j20 = this.b;
                k2 T = LaunchActivity.T();
                if (T == null) {
                    return;
                }
                un ha = un.ha(l4.longValue());
                T.presentFragment(ha);
                TLRPC.Chat L0 = vp.r1(launchActivity.O).L0(Long.valueOf(-l4.longValue()));
                if (L0 != null) {
                    org.telegram.messenger.i0.h3(new y80(ha, j20, L0, 0), 250L);
                    return;
                }
                return;
            case 20:
                LaunchActivity launchActivity2 = (LaunchActivity) this.c;
                long j21 = this.b;
                v80 v80Var = (v80) this.d;
                Pattern pattern = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new qq(launchActivity2, hs.a0(launchActivity2.O).j0(j21), v80Var, 19));
                return;
            case 21:
                yb0 yb0Var = (yb0) this.c;
                TLObject tLObject = (TLObject) this.d;
                long j22 = this.b;
                if (yb0Var.G == null) {
                    return;
                }
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                int i17 = 0;
                while (i17 < messages_messages.messages.size()) {
                    if (!(messages_messages.messages.get(i17).media instanceof TLRPC.TL_messageMediaGeoLive)) {
                        messages_messages.messages.remove(i17);
                        i17--;
                    }
                    i17++;
                }
                yb0Var.getMessagesStorage().m1(messages_messages.users, messages_messages.chats, true, true);
                int i18 = 0;
                yb0Var.getMessagesController().V3(messages_messages.users, false);
                yb0Var.getMessagesController().P3(messages_messages.chats, false);
                yb0Var.getLocationController().c.k(messages_messages.messages, j22);
                yb0Var.getNotificationCenter().k(zs.F4, Long.valueOf(j22));
                yb0Var.q0(messages_messages.messages);
                yb0Var.getLocationController().j(yb0Var.n0);
                if (yb0Var.R0 == null) {
                    cb0 cb0Var = new cb0(yb0Var, i18);
                    yb0Var.R0 = cb0Var;
                    org.telegram.messenger.i0.h3(cb0Var, 5000L);
                    return;
                }
                return;
            case 22:
                kt0 kt0Var = (kt0) this.c;
                long j23 = this.b;
                k2 k2Var2 = (k2) this.d;
                kt0Var.getClass();
                Bundle bundle = new Bundle();
                if (j23 > 0) {
                    bundle.putLong("user_id", j23);
                } else {
                    bundle.putLong("chat_id", -j23);
                }
                k2Var2.presentFragment(new ProfileActivity(bundle, null));
                kt0Var.c(false);
                return;
            case 23:
                l1 l1Var = (l1) this.c;
                q20 q20Var = (q20) this.d;
                long j24 = this.b;
                l1Var.getClass();
                k2 T2 = LaunchActivity.T();
                if (T2 == null) {
                    return;
                }
                l1Var.dismiss();
                if (q20Var != null) {
                    q20Var.a(Boolean.FALSE);
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", j24);
                bundle2.putBoolean("open_gifts", true);
                T2.presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 24:
                e4 e4Var = (e4) this.c;
                gf.e eVar2 = (gf.e) this.d;
                long j25 = this.b;
                e4Var.getClass();
                eVar2.b();
                e4Var.q2((int) j25, e4Var.getContext(), true);
                return;
            case 25:
                e4 e4Var2 = (e4) this.c;
                long j26 = this.b;
                Runnable runnable2 = (Runnable) this.d;
                e4Var2.q2((int) j26, e4Var2.getContext(), true);
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 26:
                z2[] z2VarArr = (z2[]) this.c;
                long j27 = this.b;
                TL_stories.Boost boost = (TL_stories.Boost) this.d;
                z2 z2Var = z2VarArr[0];
                if (z2Var != null) {
                    z2Var.dismiss();
                }
                k2 T3 = LaunchActivity.T();
                if (T3 == null) {
                    return;
                }
                T3.presentFragment(un.ga(boost.giveaway_msg_id, j27));
                return;
            case 27:
                th.m mVar = (th.m) this.c;
                th.l lVar = (th.l) this.d;
                long j28 = this.b;
                e5 e5Var = mVar.s;
                ArrayList arrayList2 = mVar.y;
                ay ayVar2 = mVar.e0;
                if (ayVar2 == null || ayVar2.getParentActivity() == null) {
                    return;
                }
                int i19 = lVar.b;
                ArrayList arrayList3 = new ArrayList();
                int i20 = 0;
                while (true) {
                    if (i20 < arrayList2.size()) {
                        long j29 = ((th.j) arrayList2.get(i20)).c;
                        if (j29 == d20.i(mVar.f).n || !e5Var.L(j29)) {
                            i20++;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = true;
                    }
                }
                if (lVar.F && (!z10 || arrayList2.size() == 1)) {
                    arrayList3.add(Long.valueOf(lVar.E));
                    z11 = true;
                    i12 = i19;
                } else {
                    if (!lVar.F && e5Var.L(lVar.E)) {
                        for (int i21 = 0; i21 < arrayList2.size(); i21++) {
                            long j30 = ((th.j) arrayList2.get(i21)).c;
                            if (!lVar.F && e5Var.L(j30)) {
                                arrayList3.add(Long.valueOf(j30));
                            }
                            if (j30 == lVar.E) {
                                i19 = arrayList3.size() - 1;
                            }
                        }
                        z12 = true;
                        i12 = i19;
                        z11 = false;
                        o7 orCreateStoryViewer = ayVar2.getOrCreateStoryViewer();
                        orCreateStoryViewer.G(new bi.e(mVar, j28, 23));
                        Context context = mVar.getContext();
                        n5 a2 = n5.a(mVar.h);
                        a2.e = new w0(12, mVar, z11);
                        a2.f = mVar.b != 1;
                        a2.h = z12;
                        a2.n = z11;
                        a2.r = true;
                        orCreateStoryViewer.T(context, null, arrayList3, i12, null, null, a2, false);
                        return;
                    }
                    for (int i22 = 0; i22 < arrayList2.size(); i22++) {
                        if (e5Var.K(((th.j) arrayList2.get(i22)).c)) {
                            arrayList3.add(Long.valueOf(((th.j) arrayList2.get(i22)).c));
                        } else if (i22 <= i19) {
                            i19--;
                        }
                    }
                    i12 = i19;
                    z11 = false;
                }
                z12 = false;
                o7 orCreateStoryViewer2 = ayVar2.getOrCreateStoryViewer();
                orCreateStoryViewer2.G(new bi.e(mVar, j28, 23));
                Context context2 = mVar.getContext();
                n5 a22 = n5.a(mVar.h);
                a22.e = new w0(12, mVar, z11);
                a22.f = mVar.b != 1;
                a22.h = z12;
                a22.n = z11;
                a22.r = true;
                orCreateStoryViewer2.T(context2, null, arrayList3, i12, null, null, a22, false);
                return;
            case 28:
                e5 e5Var2 = (e5) this.c;
                long j31 = this.b;
                TLObject tLObject2 = (TLObject) this.d;
                int i23 = e5Var2.a;
                e5Var2.C.remove(Long.valueOf(j31));
                if (tLObject2 == null) {
                    return;
                }
                TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject2;
                vp.r1(i23).V3(tL_stories_peerStories.users, false);
                TLRPC.User Z1 = vp.r1(i23).Z1(Long.valueOf(j31));
                TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                e5Var2.i.k(peerStories, o5.o(peerStories.peer));
                if (Z1 != null && (e5Var2.O(Z1) || Z1.self)) {
                    e5Var2.g(peerStories);
                    r5 r5Var = e5Var2.k;
                    r5Var.b.a.c(new q5(r5Var, peerStories, i13));
                }
                StringBuilder s10 = a1.g.s(j31, "StoriesController processAllStoriesResponse dialogId=", " overwrite stories ");
                s10.append(tL_stories_peerStories.stories.stories.size());
                f8.b(s10.toString());
                zs.f(i23).k(zs.v5, new Object[0]);
                return;
            default:
                d5 d5Var = (d5) this.c;
                long j32 = this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                e5 e5Var3 = d5Var.M;
                s0 s0Var = e5Var3.w;
                d5Var.d = true;
                vh.n5 n5Var = d5Var.c;
                if (n5Var.w) {
                    s0Var.c(n5Var);
                }
                n5Var.w = false;
                n5Var.x = null;
                if (!n5Var.b0) {
                    ArrayList arrayList4 = s0Var.b;
                    if (!n5Var.u && storyItem.media != null) {
                        ArrayList arrayList5 = new ArrayList();
                        int size = arrayList4.size();
                        int i24 = 0;
                        while (i24 < size) {
                            Object obj2 = arrayList4.get(i24);
                            i24++;
                            vh.n5 n5Var2 = (vh.n5) obj2;
                            if (n5Var2.g && n5Var2.f == storyItem.id) {
                                arrayList5.add(n5Var2);
                            }
                        }
                        s0Var.b(arrayList5);
                        s0Var.e(n5Var);
                        n5Var.b = Utilities.b.nextLong();
                        r0 r0Var = new r0(n5Var);
                        n5Var.g = true;
                        r0Var.G = true;
                        n5Var.e = j32;
                        r0Var.I = j32;
                        int i25 = storyItem.id;
                        n5Var.f = i25;
                        r0Var.H = i25;
                        long j33 = storyItem.expire_date * 1000;
                        n5Var.J = j33;
                        r0Var.L = j33;
                        TLRPC.MessageMedia messageMedia = storyItem.media;
                        TLRPC.Document document = messageMedia.document;
                        if (document != null) {
                            long j34 = document.id;
                            n5Var.H = j34;
                            r0Var.J = j34;
                        } else {
                            TLRPC.Photo photo = messageMedia.photo;
                            if (photo != null) {
                                long j35 = photo.id;
                                n5Var.I = j35;
                                r0Var.K = j35;
                            }
                        }
                        arrayList4.remove(n5Var);
                        z13 = false;
                        arrayList4.add(0, n5Var);
                        s0Var.a(r0Var);
                        if (d5Var.b) {
                            e5Var3.R = z13;
                            e5Var3.S = null;
                            return;
                        }
                        return;
                    }
                }
                z13 = false;
                if (d5Var.b) {
                }
                break;
        }
    }

    public /* synthetic */ i0(Object obj, Object obj2, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }
}
