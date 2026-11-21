package bi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import fi.f9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fj;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.x10;
import org.telegram.messenger.zy;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.om;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.rm;
import org.telegram.ui.Components.ui;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.f40;
import org.telegram.ui.mm;
import org.telegram.ui.rq;
import org.telegram.ui.zr;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q2(Object obj, long j3, Object obj2, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:198:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04e9  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        int i7;
        boolean z11;
        boolean z12;
        int i10;
        om omVar;
        int i11 = this.a;
        boolean z13 = false;
        r3 = 0;
        r3 = 0;
        r3 = 0;
        int i12 = 0;
        z13 = false;
        z13 = false;
        int i13 = 1;
        long j3 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i11) {
            case 0:
                n3 n3Var = (n3) obj2;
                x10 x10Var = (x10) obj;
                n3Var.getClass();
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    n3Var.dismiss();
                    if (x10Var != null) {
                        x10Var.a(Boolean.FALSE);
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
                m2.d dVar = f0Var.s;
                m2.a U = dVar.U();
                ab.g gVar = new ab.g(U, obj, j3);
                int i14 = 26;
                dVar.V(U, 26, gVar);
                if (f0Var.T == obj) {
                    f0Var.m.e(26, new hi.e9(i14));
                    break;
                }
                break;
            case 2:
                di.f6 f6Var = (di.f6) obj2;
                Runnable runnable = (Runnable) obj;
                f6Var.D2((int) j3, f6Var.getContext(), true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 3:
                di.f6 f6Var2 = (di.f6) obj2;
                f6Var2.getClass();
                ((vf.b) obj).b();
                f6Var2.D2((int) j3, f6Var2.getContext(), true);
                break;
            case 4:
                TL_stories.Boost boost = (TL_stories.Boost) obj;
                org.telegram.ui.ActionBar.w2 w2Var = ((org.telegram.ui.ActionBar.w2[]) obj2)[0];
                if (w2Var != null) {
                    w2Var.dismiss();
                }
                org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(bn.ta(boost.giveaway_msg_id, j3));
                    break;
                }
                break;
            case 5:
                fi.q qVar = (fi.q) obj2;
                fi.p pVar = (fi.p) obj;
                fi.p6 p6Var = qVar.s;
                ArrayList arrayList = qVar.y;
                cx cxVar = qVar.f0;
                if (cxVar != null && cxVar.getParentActivity() != null) {
                    int i15 = pVar.b;
                    ArrayList arrayList2 = new ArrayList();
                    int i16 = 0;
                    while (true) {
                        if (i16 < arrayList.size()) {
                            long j10 = ((fi.n) arrayList.get(i16)).c;
                            if (j10 == j10.i(qVar.f).n || !p6Var.L(j10)) {
                                i16++;
                            } else {
                                z10 = false;
                            }
                        } else {
                            z10 = true;
                        }
                    }
                    if (pVar.G && (!z10 || arrayList.size() == 1)) {
                        arrayList2.add(Long.valueOf(pVar.F));
                        z11 = true;
                        i7 = i15;
                    } else if (!pVar.G && p6Var.L(pVar.F)) {
                        int i17 = i15;
                        for (int i18 = 0; i18 < arrayList.size(); i18++) {
                            long j11 = ((fi.n) arrayList.get(i18)).c;
                            if (!pVar.G && p6Var.L(j11)) {
                                arrayList2.add(Long.valueOf(j11));
                            }
                            if (j11 == pVar.F) {
                                i17 = arrayList2.size() - 1;
                            }
                        }
                        z12 = true;
                        i7 = i17;
                        z11 = false;
                        f9 orCreateStoryViewer = cxVar.getOrCreateStoryViewer();
                        orCreateStoryViewer.x(new c4(qVar, j3, 3));
                        Context context = qVar.getContext();
                        fi.y6 a10 = fi.y6.a(qVar.h);
                        a10.e = new ab.z(i13, qVar, z11);
                        a10.f = qVar.b != 1;
                        a10.h = z12;
                        a10.n = z11;
                        a10.r = true;
                        orCreateStoryViewer.M(context, null, arrayList2, i7, null, null, a10, false);
                        break;
                    } else {
                        for (int i19 = 0; i19 < arrayList.size(); i19++) {
                            if (p6Var.K(((fi.n) arrayList.get(i19)).c)) {
                                arrayList2.add(Long.valueOf(((fi.n) arrayList.get(i19)).c));
                            } else if (i19 <= i15) {
                                i15--;
                            }
                        }
                        i7 = i15;
                        z11 = false;
                    }
                    z12 = false;
                    f9 orCreateStoryViewer2 = cxVar.getOrCreateStoryViewer();
                    orCreateStoryViewer2.x(new c4(qVar, j3, 3));
                    Context context2 = qVar.getContext();
                    fi.y6 a102 = fi.y6.a(qVar.h);
                    a102.e = new ab.z(i13, qVar, z11);
                    a102.f = qVar.b != 1;
                    a102.h = z12;
                    a102.n = z11;
                    a102.r = true;
                    orCreateStoryViewer2.M(context2, null, arrayList2, i7, null, null, a102, false);
                }
                break;
            case 6:
                fi.p6 p6Var2 = (fi.p6) obj2;
                TLObject tLObject = (TLObject) obj;
                int i20 = p6Var2.a;
                p6Var2.C.remove(Long.valueOf(j3));
                if (tLObject != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                    mp.u1(i20).f4(tL_stories_peerStories.users, false);
                    TLRPC.User c22 = mp.u1(i20).c2(Long.valueOf(j3));
                    TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                    p6Var2.i.k(peerStories, org.telegram.messenger.n5.o(peerStories.peer));
                    if (c22 != null && (p6Var2.O(c22) || c22.self)) {
                        p6Var2.g(peerStories);
                        fi.c7 c7Var = p6Var2.k;
                        c7Var.b.a.c(new fi.a7(c7Var, peerStories, i13));
                    }
                    StringBuilder t6 = a8.p0.t(j3, "StoriesController processAllStoriesResponse dialogId=", " overwrite stories ");
                    t6.append(tL_stories_peerStories.stories.stories.size());
                    org.telegram.messenger.a8.b(t6.toString());
                    ks.f(i20).k(ks.y5, new Object[0]);
                    break;
                }
                break;
            case 7:
                fi.o6 o6Var = (fi.o6) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                fi.p6 p6Var3 = o6Var.N;
                hi.b1 b1Var = p6Var3.w;
                o6Var.d = true;
                hi.c7 c7Var2 = o6Var.c;
                if (c7Var2.w) {
                    b1Var.b(c7Var2);
                }
                c7Var2.w = false;
                c7Var2.x = null;
                if (!c7Var2.b0) {
                    ArrayList arrayList3 = b1Var.b;
                    if (!c7Var2.u && storyItem.media != null) {
                        ArrayList arrayList4 = new ArrayList();
                        int size = arrayList3.size();
                        int i21 = 0;
                        while (i21 < size) {
                            Object obj3 = arrayList3.get(i21);
                            i21++;
                            hi.c7 c7Var3 = (hi.c7) obj3;
                            if (c7Var3.g && c7Var3.f == storyItem.id) {
                                arrayList4.add(c7Var3);
                            }
                        }
                        b1Var.c(arrayList4);
                        b1Var.e(c7Var2);
                        c7Var2.b = Utilities.b.nextLong();
                        hi.a1 a1Var = new hi.a1(c7Var2);
                        c7Var2.g = true;
                        a1Var.G = true;
                        c7Var2.e = j3;
                        a1Var.I = j3;
                        int i22 = storyItem.id;
                        c7Var2.f = i22;
                        a1Var.H = i22;
                        long j12 = storyItem.expire_date * 1000;
                        c7Var2.J = j12;
                        a1Var.L = j12;
                        TLRPC.MessageMedia messageMedia = storyItem.media;
                        TLRPC.Document document = messageMedia.document;
                        if (document != null) {
                            long j13 = document.id;
                            c7Var2.H = j13;
                            a1Var.J = j13;
                        } else {
                            TLRPC.Photo photo = messageMedia.photo;
                            if (photo != null) {
                                long j14 = photo.id;
                                c7Var2.I = j14;
                                a1Var.K = j14;
                            }
                        }
                        arrayList3.remove(c7Var2);
                        z13 = false;
                        arrayList3.add(0, c7Var2);
                        b1Var.a(a1Var);
                    }
                }
                if (!o6Var.b) {
                    p6Var3.R = z13;
                    p6Var3.S = null;
                    break;
                }
                break;
            case 8:
                ((fi.c7) obj2).l(j3, (TL_stories.StoryItem) obj);
                break;
            case 9:
                ArrayList arrayList5 = (ArrayList) obj;
                tr trVar = ((fi.c7) obj2).b;
                SQLiteDatabase sQLiteDatabase = trVar.b;
                try {
                    String join = TextUtils.join(", ", arrayList5);
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + j3 + " AND story_id IN (" + join + ")").stepThis().dispose();
                    break;
                } catch (Throwable th2) {
                    trVar.o(th2, true);
                    return;
                }
            case 10:
                ((View) obj).invalidate();
                mp.u1(((fi.h7) obj2).a).R1().h0(j3, false);
                break;
            case 11:
                hi.k8 k8Var = (hi.k8) obj2;
                k8Var.getClass();
                k8Var.e(j3, ((TLRPC.ChatFull) obj).participants);
                break;
            case 12:
                ((long[]) obj2)[0] = j3;
                ((ai.i1) obj).run();
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
                bn bnVar = (bn) obj2;
                bnVar.getMessagesController().q0(this.b, ((fj) obj).e1(), bnVar.l6);
                break;
            case 18:
                bn bnVar2 = ((mm) obj2).a;
                i10 = ((org.telegram.ui.ActionBar.g2) bnVar2).currentAccount;
                org.telegram.ui.Components.c5.q0(zy.C(i10).q0((ArrayList) obj, this.b, false, false, true, 0, 0, null, -1, 0L, bnVar2.j9(), bnVar2.y5), bnVar2, null);
                break;
            case 19:
                rq rqVar = (rq) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                rqVar.getMessagesController().f0(rqVar.N, user);
                rqVar.A0(j3);
                if (rqVar.n != null && user != null && lc.a(rqVar)) {
                    lc.D(rqVar, user, rqVar.n.title).j();
                    break;
                }
                break;
            case 20:
                Runnable runnable2 = (Runnable) obj2;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (g2Var != null) {
                    g2Var.presentFragment(bn.ua(j3));
                    break;
                }
                break;
            case 21:
                int i23 = ChatActivityEnterView.s7;
                ((dg) obj).run();
                org.telegram.messenger.c6.p(((ChatActivityEnterView) obj2).R, j3);
                break;
            case 22:
                ui uiVar = (ui) obj2;
                org.telegram.ui.Components.c5.J(uiVar.getContext(), j3, new dh(uiVar, 16), (org.telegram.ui.ActionBar.h6) obj);
                break;
            case 23:
                qm qmVar = (qm) obj2;
                om omVar2 = (om) obj;
                rm rmVar = qmVar.Q;
                if (!rmVar.r.J1 && qmVar.E == j3 && (omVar = qmVar.G) == omVar2) {
                    rmVar.K = omVar;
                    rmVar.N = omVar.a.a;
                    rmVar.L = false;
                    qmVar.H = 0.0f;
                    qmVar.invalidate();
                    ValueAnimator valueAnimator = rmVar.M;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    rmVar.M = ofFloat;
                    ofFloat.addUpdateListener(new org.telegram.ui.Components.mm(qmVar, 0));
                    rmVar.M.setDuration(200L);
                    rmVar.M.start();
                    om omVar3 = rmVar.K;
                    RectF f10 = omVar3.f(omVar3.e());
                    RectF d = rmVar.K.d();
                    rmVar.H = (((rmVar.E - f10.left) / f10.width()) + 0.5f) / 2.0f;
                    rmVar.G = (rmVar.F - f10.top) / f10.height();
                    rmVar.I = d.width();
                    rmVar.J = d.height();
                    try {
                        rmVar.performHapticFeedback(0, 2);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 24:
                q70.Hd((q70) obj2, j3, (TLRPC.Chat) obj);
                break;
            case 25:
                ((jt0) obj2).y1.presentFragment(bn.ta(((fj) obj).e1(), j3));
                break;
            case 26:
                lv0.A1((lv0) obj2, (TLRPC.TL_messages_emojiGroups) obj, j3);
                break;
            case 27:
                cx cxVar2 = (cx) obj2;
                d3.e0 e0Var = (d3.e0) obj;
                if (cxVar2.H.bot_admin_rights != null) {
                    cxVar2.getMessagesController().b5(-j3, cxVar2.getMessagesController().c2(Long.valueOf(cxVar2.I)), cxVar2.H.bot_admin_rights, null, false, cxVar2, true, true, null, e0Var, new zr(e0Var, 6));
                    break;
                } else {
                    e0Var.run();
                    break;
                }
            case 28:
                f40 f40Var = (f40) obj2;
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
                    int i24 = 0;
                    while (true) {
                        if (i24 < updates.updates.size()) {
                            TLRPC.Update update2 = updates.updates.get(i24);
                            if (update2 instanceof TL_update.TL_updateNewMessage) {
                                TLRPC.Message message2 = ((TL_update.TL_updateNewMessage) update2).message;
                                if (message2 != null && (message2.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                                    i12 = message2.id;
                                }
                                i24++;
                            } else if (update2 instanceof TL_update.TL_updateMessageID) {
                                i12 = ((TL_update.TL_updateMessageID) update2).id;
                            } else {
                                i24++;
                            }
                        }
                    }
                }
                org.telegram.messenger.t3 t3Var = f40Var.V2;
                if (t3Var != null && i12 != 0) {
                    HashMap hashMap = t3Var.k;
                    Long valueOf = Long.valueOf(j3);
                    org.telegram.messenger.s3 s3Var = new org.telegram.messenger.s3();
                    s3Var.a = i12;
                    s3Var.b = true;
                    s3Var.c = System.currentTimeMillis();
                    hashMap.put(valueOf, s3Var);
                    f40Var.R0(true);
                    break;
                }
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Long l10 = (Long) obj;
                org.telegram.ui.ActionBar.g2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    bn ua2 = bn.ua(l10.longValue());
                    T3.presentFragment(ua2);
                    TLRPC.Chat O0 = mp.u1(launchActivity.P).O0(Long.valueOf(-l10.longValue()));
                    if (O0 != null) {
                        org.telegram.messenger.g0.h3(new di.d9(ua2, this.b, O0, 1), 250L);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ q2(Object obj, Object obj2, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
    }
}
