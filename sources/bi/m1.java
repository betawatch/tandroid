package bi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import di.z8;
import fi.b7;
import fi.d7;
import fi.f7;
import fi.i9;
import fi.k7;
import hi.l8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.ez;
import org.telegram.messenger.gj;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.vr;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.d70;
import org.telegram.ui.Components.dm;
import org.telegram.ui.Components.fm;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.im;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.qf;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
import org.telegram.ui.c40;
import org.telegram.ui.lm;
import org.telegram.ui.qq;
import org.telegram.ui.yw;
import org.telegram.ui.zr;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class m1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m1(Object obj, long j3, Object obj2, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yw ywVar;
        boolean z10;
        int i7;
        boolean z11;
        boolean z12;
        int i10;
        fm fmVar;
        int i11 = this.a;
        boolean z13 = false;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        int i12 = 0;
        z13 = false;
        z13 = false;
        int i13 = 1;
        long j3 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i11) {
            case 0:
                s2 s2Var = (s2) obj2;
                z10 z10Var = (z10) obj;
                s2Var.getClass();
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    s2Var.dismiss();
                    if (z10Var != null) {
                        z10Var.a(Boolean.FALSE);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", j3);
                    bundle.putBoolean("open_gifts", true);
                    T.presentFragment(new ProfileActivity(bundle, null));
                    break;
                }
                break;
            case 1:
                d3.h0 h0Var = (d3.h0) ((wf.b) obj2).c;
                String str = h2.l0.a;
                l2.f0 f0Var = ((l2.z) h0Var).a;
                m2.e eVar = f0Var.s;
                m2.a U = eVar.U();
                eVar.V(U, 26, new m2.d(U, obj, j3));
                if (f0Var.T == obj) {
                    f0Var.m.e(26, new i0.b(25));
                    break;
                }
                break;
            case 2:
                di.c6 c6Var = (di.c6) obj2;
                c6Var.getClass();
                ((vf.b) obj).b();
                c6Var.r2((int) j3, c6Var.getContext(), true);
                break;
            case 3:
                di.c6 c6Var2 = (di.c6) obj2;
                Runnable runnable = (Runnable) obj;
                c6Var2.r2((int) j3, c6Var2.getContext(), true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 4:
                TL_stories.Boost boost = (TL_stories.Boost) obj;
                org.telegram.ui.ActionBar.u2 u2Var = ((org.telegram.ui.ActionBar.u2[]) obj2)[0];
                if (u2Var != null) {
                    u2Var.dismiss();
                }
                org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(an.ta(boost.giveaway_msg_id, j3));
                    break;
                }
                break;
            case 5:
                fi.q qVar = (fi.q) obj2;
                fi.p pVar = (fi.p) obj;
                fi.s6 s6Var = qVar.s;
                ArrayList arrayList = qVar.y;
                yw ywVar2 = qVar.f0;
                if (ywVar2 != null && ywVar2.getParentActivity() != null) {
                    int i14 = pVar.b;
                    ArrayList arrayList2 = new ArrayList();
                    int i15 = 0;
                    while (true) {
                        if (i15 < arrayList.size()) {
                            long j10 = ((fi.n) arrayList.get(i15)).c;
                            ywVar = ywVar2;
                            if (j10 == m10.i(qVar.f).n || !s6Var.L(j10)) {
                                i15++;
                                ywVar2 = ywVar;
                            } else {
                                z10 = false;
                            }
                        } else {
                            ywVar = ywVar2;
                            z10 = true;
                        }
                    }
                    if (!pVar.G || (z10 && arrayList.size() != 1)) {
                        if (pVar.G || !s6Var.L(pVar.F)) {
                            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                if (s6Var.K(((fi.n) arrayList.get(i16)).c)) {
                                    arrayList2.add(Long.valueOf(((fi.n) arrayList.get(i16)).c));
                                } else if (i16 <= i14) {
                                    i14--;
                                }
                            }
                            i7 = i14;
                            z11 = false;
                        } else {
                            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                long j11 = ((fi.n) arrayList.get(i17)).c;
                                if (!pVar.G && s6Var.L(j11)) {
                                    arrayList2.add(Long.valueOf(j11));
                                }
                                if (j11 == pVar.F) {
                                    i14 = arrayList2.size() - 1;
                                }
                            }
                            z11 = true;
                            i7 = i14;
                        }
                        z12 = false;
                    } else {
                        arrayList2.add(Long.valueOf(pVar.F));
                        z12 = true;
                        i7 = i14;
                        z11 = false;
                    }
                    i9 orCreateStoryViewer = ywVar.getOrCreateStoryViewer();
                    orCreateStoryViewer.x(new di.x2(qVar, j3, 2));
                    Context context = qVar.getContext();
                    b7 a10 = b7.a(qVar.h);
                    a10.e = new ab.z(i13, qVar, z12);
                    a10.f = qVar.b == 1;
                    a10.h = z11;
                    a10.n = z12;
                    a10.r = true;
                    orCreateStoryViewer.M(context, null, arrayList2, i7, null, null, a10, false);
                    break;
                }
                break;
            case 6:
                fi.s6 s6Var2 = (fi.s6) obj2;
                TLObject tLObject = (TLObject) obj;
                int i18 = s6Var2.a;
                s6Var2.C.remove(Long.valueOf(j3));
                if (tLObject != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                    np.s1(i18).Y3(tL_stories_peerStories.users, false);
                    TLRPC.User a22 = np.s1(i18).a2(Long.valueOf(j3));
                    TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                    s6Var2.i.k(peerStories, org.telegram.messenger.m5.o(peerStories.peer));
                    if (a22 != null && (s6Var2.O(a22) || a22.self)) {
                        s6Var2.g(peerStories);
                        f7 f7Var = s6Var2.k;
                        f7Var.b.a.c(new d7(f7Var, peerStories, i13));
                    }
                    StringBuilder t6 = a8.p0.t(j3, "StoriesController processAllStoriesResponse dialogId=", " overwrite stories ");
                    t6.append(tL_stories_peerStories.stories.stories.size());
                    a8.b(t6.toString());
                    ns.f(i18).k(ns.v5, new Object[0]);
                    break;
                }
                break;
            case 7:
                fi.r6 r6Var = (fi.r6) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                fi.s6 s6Var3 = r6Var.N;
                hi.a1 a1Var = s6Var3.w;
                r6Var.d = true;
                hi.d7 d7Var = r6Var.c;
                if (d7Var.w) {
                    a1Var.b(d7Var);
                }
                d7Var.w = false;
                d7Var.x = null;
                if (!d7Var.b0) {
                    ArrayList arrayList3 = a1Var.b;
                    if (!d7Var.u && storyItem.media != null) {
                        ArrayList arrayList4 = new ArrayList();
                        int size = arrayList3.size();
                        int i19 = 0;
                        while (i19 < size) {
                            Object obj3 = arrayList3.get(i19);
                            i19++;
                            hi.d7 d7Var2 = (hi.d7) obj3;
                            if (d7Var2.g && d7Var2.f == storyItem.id) {
                                arrayList4.add(d7Var2);
                            }
                        }
                        a1Var.c(arrayList4);
                        a1Var.e(d7Var);
                        d7Var.b = Utilities.b.nextLong();
                        hi.z0 z0Var = new hi.z0(d7Var);
                        d7Var.g = true;
                        z0Var.G = true;
                        d7Var.e = j3;
                        z0Var.I = j3;
                        int i20 = storyItem.id;
                        d7Var.f = i20;
                        z0Var.H = i20;
                        long j12 = storyItem.expire_date * 1000;
                        d7Var.J = j12;
                        z0Var.L = j12;
                        TLRPC.MessageMedia messageMedia = storyItem.media;
                        TLRPC.Document document = messageMedia.document;
                        if (document != null) {
                            long j13 = document.id;
                            d7Var.H = j13;
                            z0Var.J = j13;
                        } else {
                            TLRPC.Photo photo = messageMedia.photo;
                            if (photo != null) {
                                long j14 = photo.id;
                                d7Var.I = j14;
                                z0Var.K = j14;
                            }
                        }
                        arrayList3.remove(d7Var);
                        z13 = false;
                        arrayList3.add(0, d7Var);
                        a1Var.a(z0Var);
                    }
                }
                if (!r6Var.b) {
                    s6Var3.R = z13;
                    s6Var3.S = null;
                    break;
                }
                break;
            case 8:
                ((f7) obj2).l(j3, (TL_stories.StoryItem) obj);
                break;
            case 9:
                ArrayList arrayList5 = (ArrayList) obj;
                vr vrVar = ((f7) obj2).b;
                SQLiteDatabase sQLiteDatabase = vrVar.b;
                try {
                    String join = TextUtils.join(", ", arrayList5);
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + j3 + " AND story_id IN (" + join + ")").stepThis().dispose();
                    break;
                } catch (Throwable th2) {
                    vrVar.o(th2, true);
                    return;
                }
            case 10:
                ((View) obj).invalidate();
                np.s1(((k7) obj2).a).P1().h0(j3, false);
                break;
            case 11:
                l8 l8Var = (l8) obj2;
                l8Var.getClass();
                l8Var.e(j3, ((TLRPC.ChatFull) obj).participants);
                break;
            case 12:
                ((long[]) obj2)[0] = j3;
                ((ai.g1) obj).run();
                break;
            case 13:
                ((VideoFramesRewinder) obj2).lambda$new$1((ArrayList) obj, j3);
                break;
            case 14:
                ((NativeInstance) obj2).lambda$onParticipantDescriptionsRequired$2(j3, (int[]) obj);
                break;
            case 15:
                ((VideoCapturerDevice) obj2).lambda$init$5(j3, (String) obj);
                break;
            case 16:
                ((VideoCapturerDevice) obj2).lambda$init$2(j3, (Point) obj);
                break;
            case 17:
                an anVar = (an) obj2;
                anVar.getMessagesController().p0(this.b, ((gj) obj).e1(), anVar.k6);
                break;
            case 18:
                an anVar2 = ((lm) obj2).a;
                i10 = ((org.telegram.ui.ActionBar.e2) anVar2).currentAccount;
                org.telegram.ui.Components.t4.q0(ez.C(i10).q0((ArrayList) obj, this.b, false, false, true, 0, 0, null, -1, 0L, anVar2.j9(), anVar2.x5), anVar2, null);
                break;
            case 19:
                qq qqVar = (qq) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                qqVar.getMessagesController().f0(qqVar.N, user);
                qqVar.A0(j3);
                if (qqVar.n != null && user != null && cc.a(qqVar)) {
                    cc.D(qqVar, user, qqVar.n.title).j();
                    break;
                }
                break;
            case 20:
                Runnable runnable2 = (Runnable) obj2;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (e2Var != null) {
                    e2Var.presentFragment(an.ua(j3));
                    break;
                }
                break;
            case 21:
                int i21 = ChatActivityEnterView.N6;
                ((qf) obj).run();
                org.telegram.messenger.b6.p(((ChatActivityEnterView) obj2).R, j3);
                break;
            case 22:
                ki kiVar = (ki) obj2;
                org.telegram.ui.Components.t4.J(kiVar.getContext(), j3, new sg(kiVar, 16), (org.telegram.ui.ActionBar.e6) obj);
                break;
            case 23:
                hm hmVar = (hm) obj2;
                fm fmVar2 = (fm) obj;
                im imVar = hmVar.Q;
                if (!imVar.r.J1 && hmVar.E == j3 && (fmVar = hmVar.G) == fmVar2) {
                    imVar.K = fmVar;
                    imVar.N = fmVar.a.a;
                    imVar.L = false;
                    hmVar.H = 0.0f;
                    hmVar.invalidate();
                    ValueAnimator valueAnimator = imVar.M;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    imVar.M = ofFloat;
                    ofFloat.addUpdateListener(new dm(hmVar, 0));
                    imVar.M.setDuration(200L);
                    imVar.M.start();
                    fm fmVar3 = imVar.K;
                    RectF f10 = fmVar3.f(fmVar3.e());
                    RectF d = imVar.K.d();
                    imVar.H = (((imVar.E - f10.left) / f10.width()) + 0.5f) / 2.0f;
                    imVar.G = (imVar.F - f10.top) / f10.height();
                    imVar.I = d.width();
                    imVar.J = d.height();
                    try {
                        imVar.performHapticFeedback(0, 2);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 24:
                d70.Hd((d70) obj2, j3, (TLRPC.Chat) obj);
                break;
            case 25:
                ((ys0) obj2).y1.presentFragment(an.ta(((gj) obj).e1(), j3));
                break;
            case 26:
                av0.A1((av0) obj2, (TLRPC.TL_messages_emojiGroups) obj, j3);
                break;
            case 27:
                yw ywVar3 = (yw) obj2;
                d3.e0 e0Var = (d3.e0) obj;
                if (ywVar3.H.bot_admin_rights != null) {
                    ywVar3.getMessagesController().Q4(-j3, ywVar3.getMessagesController().a2(Long.valueOf(ywVar3.I)), ywVar3.H.bot_admin_rights, null, false, ywVar3, true, true, null, e0Var, new zr(e0Var, 6));
                    break;
                } else {
                    e0Var.run();
                    break;
                }
            case 28:
                c40 c40Var = (c40) obj2;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.Update update = updates.update;
                if (update instanceof TL_update.TL_updateNewMessage) {
                    TLRPC.Message message = ((TL_update.TL_updateNewMessage) update).message;
                    if (message != null && (message.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                        i12 = message.id;
                    }
                } else if (update instanceof TL_update.TL_updateMessageID) {
                    i12 = ((TL_update.TL_updateMessageID) update).id;
                } else if (updates.updates != null) {
                    int i22 = 0;
                    while (true) {
                        if (i22 < updates.updates.size()) {
                            TLRPC.Update update2 = updates.updates.get(i22);
                            if (update2 instanceof TL_update.TL_updateNewMessage) {
                                TLRPC.Message message2 = ((TL_update.TL_updateNewMessage) update2).message;
                                if (message2 != null && (message2.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                                    i12 = message2.id;
                                }
                                i22++;
                            } else if (update2 instanceof TL_update.TL_updateMessageID) {
                                i12 = ((TL_update.TL_updateMessageID) update2).id;
                            } else {
                                i22++;
                            }
                        }
                    }
                }
                org.telegram.messenger.r3 r3Var = c40Var.V2;
                if (r3Var != null && i12 != 0) {
                    HashMap hashMap = r3Var.k;
                    Long valueOf = Long.valueOf(j3);
                    org.telegram.messenger.q3 q3Var = new org.telegram.messenger.q3();
                    q3Var.a = i12;
                    q3Var.b = true;
                    q3Var.c = System.currentTimeMillis();
                    hashMap.put(valueOf, q3Var);
                    c40Var.Q0(true);
                    break;
                }
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Long l10 = (Long) obj;
                org.telegram.ui.ActionBar.e2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    an ua2 = an.ua(l10.longValue());
                    T3.presentFragment(ua2);
                    TLRPC.Chat M0 = np.s1(launchActivity.P).M0(Long.valueOf(-l10.longValue()));
                    if (M0 != null) {
                        org.telegram.messenger.g0.i3(new z8(ua2, this.b, M0, 1), 250L);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ m1(Object obj, Object obj2, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
    }
}
