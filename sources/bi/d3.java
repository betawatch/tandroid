package bi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gz;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.am;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.bm;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.kf;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.wl;
import org.telegram.ui.Components.yl;
import org.telegram.ui.Components.zs0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
import org.telegram.ui.e40;
import org.telegram.ui.nm;
import org.telegram.ui.qq;
import org.telegram.ui.tp;
import org.telegram.ui.yw;
import org.telegram.ui.z70;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d3(Object obj, long j3, Object obj2, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = j3;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0397  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z9;
        int i7;
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        yl ylVar;
        int i11 = this.a;
        int i12 = 1;
        int i13 = 0;
        long j3 = this.c;
        Object obj = this.d;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                k7 k7Var = (k7) obj2;
                k7Var.getClass();
                ((vf.b) obj).b();
                k7Var.q2((int) j3, k7Var.getContext(), true);
                break;
            case 1:
                k7 k7Var2 = (k7) obj2;
                Runnable runnable = (Runnable) obj;
                k7Var2.q2((int) j3, k7Var2.getContext(), true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 2:
                TL_stories.Boost boost = (TL_stories.Boost) obj;
                org.telegram.ui.ActionBar.v2 v2Var = ((org.telegram.ui.ActionBar.v2[]) obj2)[0];
                if (v2Var != null) {
                    v2Var.dismiss();
                }
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(cn.sa(boost.giveaway_msg_id, j3));
                    break;
                }
                break;
            case 3:
                d3.h0 h0Var = (d3.h0) ((wf.b) obj2).c;
                String str = h2.m0.a;
                l2.i0 i0Var = ((l2.c0) h0Var).a;
                m2.e eVar = i0Var.s;
                m2.a U = eVar.U();
                eVar.V(U, 26, new ab.g(U, obj, j3));
                if (i0Var.T == obj) {
                    i0Var.m.e(26, new hi.x3(21));
                    break;
                }
                break;
            case 4:
                di.q qVar = (di.q) obj2;
                di.p pVar = (di.p) obj;
                di.z6 z6Var = qVar.s;
                ArrayList arrayList = qVar.y;
                yw ywVar = qVar.e0;
                if (ywVar != null && ywVar.getParentActivity() != null) {
                    int i14 = pVar.b;
                    ArrayList arrayList2 = new ArrayList();
                    int i15 = 0;
                    while (true) {
                        if (i15 < arrayList.size()) {
                            long j10 = ((di.n) arrayList.get(i15)).c;
                            if (j10 == p10.i(qVar.f).n || !z6Var.L(j10)) {
                                i15++;
                            } else {
                                z9 = false;
                            }
                        } else {
                            z9 = true;
                        }
                    }
                    if (!pVar.F || (z9 && arrayList.size() != 1)) {
                        if (pVar.F || !z6Var.L(pVar.E)) {
                            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                if (z6Var.K(((di.n) arrayList.get(i16)).c)) {
                                    arrayList2.add(Long.valueOf(((di.n) arrayList.get(i16)).c));
                                } else if (i16 <= i14) {
                                    i14--;
                                }
                            }
                            i7 = i14;
                            z10 = false;
                        } else {
                            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                long j11 = ((di.n) arrayList.get(i17)).c;
                                if (!pVar.F && z6Var.L(j11)) {
                                    arrayList2.add(Long.valueOf(j11));
                                }
                                if (j11 == pVar.E) {
                                    i14 = arrayList2.size() - 1;
                                }
                            }
                            i7 = i14;
                            z10 = true;
                        }
                        z11 = false;
                    } else {
                        arrayList2.add(Long.valueOf(pVar.E));
                        i7 = i14;
                        z10 = false;
                        z11 = true;
                    }
                    di.q9 orCreateStoryViewer = ywVar.getOrCreateStoryViewer();
                    orCreateStoryViewer.x(new r3(qVar, j3, 2));
                    Context context = qVar.getContext();
                    di.i7 a10 = di.i7.a(qVar.h);
                    a10.e = new ab.y(1, qVar, z11);
                    a10.f = qVar.b == 1;
                    a10.h = z10;
                    a10.n = z11;
                    a10.r = true;
                    orCreateStoryViewer.M(context, null, arrayList2, i7, null, null, a10, false);
                    break;
                }
                break;
            case 5:
                di.z6 z6Var2 = (di.z6) obj2;
                TLObject tLObject = (TLObject) obj;
                int i18 = z6Var2.a;
                z6Var2.C.remove(Long.valueOf(j3));
                if (tLObject != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                    qp.s1(i18).Y3(tL_stories_peerStories.users, false);
                    TLRPC.User a22 = qp.s1(i18).a2(Long.valueOf(j3));
                    TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                    z6Var2.i.k(peerStories, org.telegram.messenger.m5.o(peerStories.peer));
                    if (a22 != null && (z6Var2.O(a22) || a22.self)) {
                        z6Var2.g(peerStories);
                        di.m7 m7Var = z6Var2.k;
                        m7Var.b.a.c(new di.k7(m7Var, peerStories, i12));
                    }
                    StringBuilder t6 = a8.p0.t(j3, "StoriesController processAllStoriesResponse dialogId=", " overwrite stories ");
                    t6.append(tL_stories_peerStories.stories.stories.size());
                    org.telegram.messenger.a8.b(t6.toString());
                    qs.f(i18).k(qs.v5, new Object[0]);
                    break;
                }
                break;
            case 6:
                di.y6 y6Var = (di.y6) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                di.z6 z6Var3 = y6Var.M;
                fi.z0 z0Var = z6Var3.w;
                y6Var.d = true;
                fi.e7 e7Var = y6Var.c;
                if (e7Var.w) {
                    z0Var.b(e7Var);
                }
                e7Var.w = false;
                e7Var.x = null;
                if (!e7Var.b0) {
                    ArrayList arrayList3 = z0Var.b;
                    if (!e7Var.u && storyItem.media != null) {
                        ArrayList arrayList4 = new ArrayList();
                        int size = arrayList3.size();
                        int i19 = 0;
                        while (i19 < size) {
                            Object obj3 = arrayList3.get(i19);
                            i19++;
                            fi.e7 e7Var2 = (fi.e7) obj3;
                            if (e7Var2.g && e7Var2.f == storyItem.id) {
                                arrayList4.add(e7Var2);
                            }
                        }
                        z0Var.c(arrayList4);
                        z0Var.e(e7Var);
                        e7Var.b = Utilities.b.nextLong();
                        fi.y0 y0Var = new fi.y0(e7Var);
                        e7Var.g = true;
                        y0Var.G = true;
                        e7Var.e = j3;
                        y0Var.I = j3;
                        int i20 = storyItem.id;
                        e7Var.f = i20;
                        y0Var.H = i20;
                        long j12 = storyItem.expire_date * 1000;
                        e7Var.J = j12;
                        y0Var.L = j12;
                        TLRPC.MessageMedia messageMedia = storyItem.media;
                        TLRPC.Document document = messageMedia.document;
                        if (document != null) {
                            long j13 = document.id;
                            e7Var.H = j13;
                            y0Var.J = j13;
                        } else {
                            TLRPC.Photo photo = messageMedia.photo;
                            if (photo != null) {
                                long j14 = photo.id;
                                e7Var.I = j14;
                                y0Var.K = j14;
                            }
                        }
                        arrayList3.remove(e7Var);
                        z12 = false;
                        arrayList3.add(0, e7Var);
                        z0Var.a(y0Var);
                        if (y6Var.b) {
                            z6Var3.R = z12;
                            z6Var3.S = null;
                            break;
                        }
                    }
                }
                z12 = false;
                if (y6Var.b) {
                }
                break;
            case 7:
                ((di.m7) obj2).l(j3, (TL_stories.StoryItem) obj);
                break;
            case 8:
                ArrayList arrayList5 = (ArrayList) obj;
                yr yrVar = ((di.m7) obj2).b;
                SQLiteDatabase sQLiteDatabase = yrVar.b;
                try {
                    String join = TextUtils.join(", ", arrayList5);
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + j3 + " AND story_id IN (" + join + ")").stepThis().dispose();
                    break;
                } catch (Throwable th2) {
                    yrVar.o(th2, true);
                    return;
                }
            case 9:
                ((View) obj).invalidate();
                qp.s1(((di.r7) obj2).a).P1().h0(j3, false);
                break;
            case 10:
                fi.n8 n8Var = (fi.n8) obj2;
                n8Var.getClass();
                n8Var.e(j3, ((TLRPC.ChatFull) obj).participants);
                break;
            case 11:
                ((long[]) obj2)[0] = j3;
                ((ub) obj).run();
                break;
            case 12:
                ((VideoFramesRewinder) obj2).lambda$new$1((ArrayList) obj, j3);
                break;
            case 13:
                ((NativeInstance) obj2).lambda$onParticipantDescriptionsRequired$2(j3, (int[]) obj);
                break;
            case 14:
                ((VideoCapturerDevice) obj2).lambda$init$5(j3, (String) obj);
                break;
            case 15:
                ((VideoCapturerDevice) obj2).lambda$init$2(j3, (Point) obj);
                break;
            case 16:
                cn cnVar = (cn) obj2;
                cnVar.getMessagesController().p0(this.c, ((ij) obj).e1(), cnVar.j6);
                break;
            case 17:
                cn cnVar2 = ((nm) obj2).a;
                i10 = ((org.telegram.ui.ActionBar.f2) cnVar2).currentAccount;
                org.telegram.ui.Components.v4.q0(gz.C(i10).q0((ArrayList) obj, this.c, false, false, true, 0, 0, null, -1, 0L, cnVar2.i9(), cnVar2.w5), cnVar2, null);
                break;
            case 18:
                qq qqVar = (qq) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                qqVar.getMessagesController().f0(qqVar.M, user);
                qqVar.A0(j3);
                if (qqVar.n != null && user != null && org.telegram.ui.Components.hc.a(qqVar)) {
                    org.telegram.ui.Components.hc.D(qqVar, user, qqVar.n.title).j();
                    break;
                }
                break;
            case 19:
                Runnable runnable2 = (Runnable) obj2;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (f2Var != null) {
                    f2Var.presentFragment(cn.ta(j3));
                    break;
                }
                break;
            case 20:
                int i21 = ChatActivityEnterView.s5;
                ((kf) obj).run();
                org.telegram.messenger.b6.n(((ChatActivityEnterView) obj2).Q, j3);
                break;
            case 21:
                di diVar = (di) obj2;
                org.telegram.ui.Components.v4.J(diVar.getContext(), j3, new mg(diVar, 16), (org.telegram.ui.ActionBar.g6) obj);
                break;
            case 22:
                am amVar = (am) obj2;
                yl ylVar2 = (yl) obj;
                bm bmVar = amVar.P;
                if (!bmVar.r.I1 && amVar.D == j3 && (ylVar = amVar.F) == ylVar2) {
                    bmVar.J = ylVar;
                    bmVar.M = ylVar.a.a;
                    bmVar.K = false;
                    amVar.G = 0.0f;
                    amVar.invalidate();
                    ValueAnimator valueAnimator = bmVar.L;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    bmVar.L = ofFloat;
                    ofFloat.addUpdateListener(new wl(amVar, 0));
                    bmVar.L.setDuration(200L);
                    bmVar.L.start();
                    yl ylVar3 = bmVar.J;
                    RectF f10 = ylVar3.f(ylVar3.e());
                    RectF d = bmVar.J.d();
                    bmVar.G = (((bmVar.D - f10.left) / f10.width()) + 0.5f) / 2.0f;
                    bmVar.F = (bmVar.E - f10.top) / f10.height();
                    bmVar.H = d.width();
                    bmVar.I = d.height();
                    try {
                        bmVar.performHapticFeedback(0, 2);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 23:
                b70.Gd((b70) obj2, j3, (TLRPC.Chat) obj);
                break;
            case 24:
                ((zs0) obj2).x1.presentFragment(cn.sa(((ij) obj).e1(), j3));
                break;
            case 25:
                av0.A1((av0) obj2, (TLRPC.TL_messages_emojiGroups) obj, j3);
                break;
            case 26:
                yw ywVar2 = (yw) obj2;
                h4 h4Var = (h4) obj;
                if (ywVar2.G.bot_admin_rights != null) {
                    ywVar2.getMessagesController().P4(-j3, ywVar2.getMessagesController().a2(Long.valueOf(ywVar2.H)), ywVar2.G.bot_admin_rights, null, false, ywVar2, true, true, null, h4Var, new org.telegram.ui.yr(h4Var, 6));
                    break;
                } else {
                    h4Var.run();
                    break;
                }
            case 27:
                e40 e40Var = (e40) obj2;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.Update update = updates.update;
                if (update instanceof TL_update.TL_updateNewMessage) {
                    TLRPC.Message message = ((TL_update.TL_updateNewMessage) update).message;
                    if (message != null && (message.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                        i13 = message.id;
                    }
                } else if (update instanceof TL_update.TL_updateMessageID) {
                    i13 = ((TL_update.TL_updateMessageID) update).id;
                } else if (updates.updates != null) {
                    int i22 = 0;
                    while (true) {
                        if (i22 < updates.updates.size()) {
                            TLRPC.Update update2 = updates.updates.get(i22);
                            if (update2 instanceof TL_update.TL_updateNewMessage) {
                                TLRPC.Message message2 = ((TL_update.TL_updateNewMessage) update2).message;
                                if (message2 != null && (message2.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                                    i13 = message2.id;
                                }
                                i22++;
                            } else if (update2 instanceof TL_update.TL_updateMessageID) {
                                i13 = ((TL_update.TL_updateMessageID) update2).id;
                            } else {
                                i22++;
                            }
                        }
                    }
                }
                org.telegram.messenger.r3 r3Var = e40Var.R2;
                if (r3Var != null && i13 != 0) {
                    HashMap hashMap = r3Var.k;
                    Long valueOf = Long.valueOf(j3);
                    org.telegram.messenger.q3 q3Var = new org.telegram.messenger.q3();
                    q3Var.a = i13;
                    q3Var.b = true;
                    q3Var.c = System.currentTimeMillis();
                    hashMap.put(valueOf, q3Var);
                    e40Var.Q0(true);
                    break;
                }
                break;
            case 28:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Long l10 = (Long) obj;
                org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    cn ta2 = cn.ta(l10.longValue());
                    T2.presentFragment(ta2);
                    TLRPC.Chat M0 = qp.s1(launchActivity.O).M0(Long.valueOf(-l10.longValue()));
                    if (M0 != null) {
                        org.telegram.messenger.g0.i3(new ja(ta2, this.c, M0, 1), 250L);
                        break;
                    }
                }
                break;
            default:
                LaunchActivity launchActivity2 = (LaunchActivity) obj2;
                String str2 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new tp(launchActivity2, yr.a0(launchActivity2.O).j0(j3), (z70) obj, 19));
                break;
        }
    }

    public /* synthetic */ d3(Object obj, Object obj2, long j3, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.c = j3;
    }
}
