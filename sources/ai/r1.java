package ai;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import ci.j9;
import ei.i7;
import ei.k7;
import ei.m7;
import ei.r7;
import ei.r9;
import gi.f7;
import gi.o8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.am;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.hf;
import org.telegram.ui.Components.kg;
import org.telegram.ui.Components.vl;
import org.telegram.ui.Components.w60;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.Components.xl;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.Components.zl;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.hm;
import org.telegram.ui.nq;
import org.telegram.ui.ur;
import org.telegram.ui.uw;
import org.telegram.ui.wm;
import org.telegram.ui.x30;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r1(Object obj, long j10, Object obj2, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = j10;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x037c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        int i3;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        xl xlVar;
        int i11 = this.a;
        int i12 = 1;
        int i13 = 0;
        long j10 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i11) {
            case 0:
                b3 b3Var = (b3) obj2;
                u10 u10Var = (u10) obj;
                b3Var.getClass();
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    b3Var.dismiss();
                    if (u10Var != null) {
                        u10Var.a(Boolean.FALSE);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", j10);
                    bundle.putBoolean("open_gifts", true);
                    T.presentFragment(new ProfileActivity(bundle, null));
                    break;
                }
                break;
            case 1:
                c3.i0 i0Var = (c3.i0) ((tf.b) obj2).b;
                String str = g2.n0.a;
                k2.i0 i0Var2 = ((k2.c0) i0Var).a;
                l2.f fVar = i0Var2.s;
                l2.a U = fVar.U();
                fVar.V(U, 26, new n(U, obj, j10));
                if (i0Var2.T == obj) {
                    i0Var2.m.e(26, new ii.y3(9));
                    break;
                }
                break;
            case 2:
                ci.l6 l6Var = (ci.l6) obj2;
                l6Var.getClass();
                ((sf.b) obj).b();
                l6Var.q2((int) j10, l6Var.getContext(), true);
                break;
            case 3:
                ci.l6 l6Var2 = (ci.l6) obj2;
                Runnable runnable = (Runnable) obj;
                l6Var2.q2((int) j10, l6Var2.getContext(), true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 4:
                TL_stories.Boost boost = (TL_stories.Boost) obj;
                org.telegram.ui.ActionBar.t2 t2Var = ((org.telegram.ui.ActionBar.t2[]) obj2)[0];
                if (t2Var != null) {
                    t2Var.dismiss();
                }
                org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(wm.qa(boost.giveaway_msg_id, j10));
                    break;
                }
                break;
            case 5:
                ei.r rVar = (ei.r) obj2;
                ei.q qVar = (ei.q) obj;
                ei.z6 z6Var = rVar.s;
                ArrayList arrayList = rVar.y;
                uw uwVar = rVar.f0;
                if (uwVar != null && uwVar.getParentActivity() != null) {
                    int i14 = qVar.b;
                    ArrayList arrayList2 = new ArrayList();
                    int i15 = 0;
                    while (true) {
                        if (i15 < arrayList.size()) {
                            long j11 = ((ei.o) arrayList.get(i15)).c;
                            if (j11 == h10.i(rVar.f).n || !z6Var.L(j11)) {
                                i15++;
                            } else {
                                z10 = false;
                            }
                        } else {
                            z10 = true;
                        }
                    }
                    if (!qVar.G || (z10 && arrayList.size() != 1)) {
                        if (qVar.G || !z6Var.L(qVar.F)) {
                            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                if (z6Var.K(((ei.o) arrayList.get(i16)).c)) {
                                    arrayList2.add(Long.valueOf(((ei.o) arrayList.get(i16)).c));
                                } else if (i16 <= i14) {
                                    i14--;
                                }
                            }
                            i3 = i14;
                            z11 = false;
                        } else {
                            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                long j12 = ((ei.o) arrayList.get(i17)).c;
                                if (!qVar.G && z6Var.L(j12)) {
                                    arrayList2.add(Long.valueOf(j12));
                                }
                                if (j12 == qVar.F) {
                                    i14 = arrayList2.size() - 1;
                                }
                            }
                            i3 = i14;
                            z11 = true;
                        }
                        z12 = false;
                    } else {
                        arrayList2.add(Long.valueOf(qVar.F));
                        i3 = i14;
                        z11 = false;
                        z12 = true;
                    }
                    r9 orCreateStoryViewer = uwVar.getOrCreateStoryViewer();
                    orCreateStoryViewer.G(new ci.e3(rVar, j10, 2));
                    Context context = rVar.getContext();
                    i7 a10 = i7.a(rVar.h);
                    a10.e = new ei.f(0, rVar, z12);
                    a10.f = rVar.b == 1;
                    a10.h = z11;
                    a10.n = z12;
                    a10.r = true;
                    orCreateStoryViewer.U(context, null, arrayList2, i3, null, null, a10, false);
                    break;
                }
                break;
            case 6:
                ei.z6 z6Var2 = (ei.z6) obj2;
                TLObject tLObject = (TLObject) obj;
                int i18 = z6Var2.a;
                z6Var2.C.remove(Long.valueOf(j10));
                if (tLObject != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                    hp.s1(i18).Y3(tL_stories_peerStories.users, false);
                    TLRPC.User a22 = hp.s1(i18).a2(Long.valueOf(j10));
                    TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                    z6Var2.i.k(peerStories, org.telegram.messenger.m5.o(peerStories.peer));
                    if (a22 != null && (z6Var2.O(a22) || a22.self)) {
                        z6Var2.g(peerStories);
                        m7 m7Var = z6Var2.k;
                        m7Var.b.a.c(new k7(m7Var, peerStories, i12));
                    }
                    StringBuilder t10 = a1.g.t(j10, "StoriesController processAllStoriesResponse dialogId=", " overwrite stories ");
                    t10.append(tL_stories_peerStories.stories.stories.size());
                    a8.b(t10.toString());
                    hs.f(i18).k(hs.v5, new Object[0]);
                    break;
                }
                break;
            case 7:
                ei.y6 y6Var = (ei.y6) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                ei.z6 z6Var3 = y6Var.N;
                gi.z0 z0Var = z6Var3.w;
                y6Var.d = true;
                f7 f7Var = y6Var.c;
                if (f7Var.w) {
                    z0Var.b(f7Var);
                }
                f7Var.w = false;
                f7Var.x = null;
                if (!f7Var.b0) {
                    ArrayList arrayList3 = z0Var.b;
                    if (!f7Var.u && storyItem.media != null) {
                        ArrayList arrayList4 = new ArrayList();
                        int size = arrayList3.size();
                        int i19 = 0;
                        while (i19 < size) {
                            Object obj3 = arrayList3.get(i19);
                            i19++;
                            f7 f7Var2 = (f7) obj3;
                            if (f7Var2.g && f7Var2.f == storyItem.id) {
                                arrayList4.add(f7Var2);
                            }
                        }
                        z0Var.c(arrayList4);
                        z0Var.e(f7Var);
                        f7Var.b = Utilities.b.nextLong();
                        gi.y0 y0Var = new gi.y0(f7Var);
                        f7Var.g = true;
                        y0Var.G = true;
                        f7Var.e = j10;
                        y0Var.I = j10;
                        int i20 = storyItem.id;
                        f7Var.f = i20;
                        y0Var.H = i20;
                        long j13 = storyItem.expire_date * 1000;
                        f7Var.J = j13;
                        y0Var.L = j13;
                        TLRPC.MessageMedia messageMedia = storyItem.media;
                        TLRPC.Document document = messageMedia.document;
                        if (document != null) {
                            long j14 = document.id;
                            f7Var.H = j14;
                            y0Var.J = j14;
                        } else {
                            TLRPC.Photo photo = messageMedia.photo;
                            if (photo != null) {
                                long j15 = photo.id;
                                f7Var.I = j15;
                                y0Var.K = j15;
                            }
                        }
                        arrayList3.remove(f7Var);
                        z13 = false;
                        arrayList3.add(0, f7Var);
                        z0Var.a(y0Var);
                        if (y6Var.b) {
                            z6Var3.R = z13;
                            z6Var3.S = null;
                            break;
                        }
                    }
                }
                z13 = false;
                if (y6Var.b) {
                }
                break;
            case 8:
                ((m7) obj2).l(j10, (TL_stories.StoryItem) obj);
                break;
            case 9:
                ArrayList arrayList5 = (ArrayList) obj;
                qr qrVar = ((m7) obj2).b;
                SQLiteDatabase sQLiteDatabase = qrVar.b;
                try {
                    String join = TextUtils.join(", ", arrayList5);
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + j10 + " AND story_id IN (" + join + ")").stepThis().dispose();
                    break;
                } catch (Throwable th2) {
                    qrVar.o(th2, true);
                    return;
                }
            case 10:
                ((View) obj).invalidate();
                hp.s1(((r7) obj2).a).P1().h0(j10, false);
                break;
            case 11:
                o8 o8Var = (o8) obj2;
                o8Var.getClass();
                o8Var.e(j10, ((TLRPC.ChatFull) obj).participants);
                break;
            case 12:
                ((long[]) obj2)[0] = j10;
                ((p1) obj).run();
                break;
            case 13:
                ((VideoFramesRewinder) obj2).lambda$new$1((ArrayList) obj, j10);
                break;
            case 14:
                ((NativeInstance) obj2).lambda$onParticipantDescriptionsRequired$2(j10, (int[]) obj);
                break;
            case 15:
                ((VideoCapturerDevice) obj2).lambda$init$5(j10, (String) obj);
                break;
            case 16:
                ((VideoCapturerDevice) obj2).lambda$init$2(j10, (Point) obj);
                break;
            case 17:
                wm wmVar = (wm) obj2;
                wmVar.getMessagesController().p0(this.b, ((zi) obj).f1(), wmVar.k6);
                break;
            case 18:
                wm wmVar2 = ((hm) obj2).a;
                i10 = ((org.telegram.ui.ActionBar.d2) wmVar2).currentAccount;
                org.telegram.ui.Components.t4.s0(yy.C(i10).q0((ArrayList) obj, this.b, false, false, true, 0, 0, null, -1, 0L, wmVar2.h9(), wmVar2.x5), wmVar2, null);
                break;
            case 19:
                nq nqVar = (nq) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                nqVar.getMessagesController().f0(nqVar.N, user);
                nqVar.A0(j10);
                if (nqVar.n != null && user != null && fc.a(nqVar)) {
                    fc.D(nqVar, user, nqVar.n.title).j();
                    break;
                }
                break;
            case 20:
                Runnable runnable2 = (Runnable) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (d2Var != null) {
                    d2Var.presentFragment(wm.ra(j10));
                    break;
                }
                break;
            case 21:
                int i21 = ChatActivityEnterView.t5;
                ((hf) obj).run();
                org.telegram.messenger.b6.n(((ChatActivityEnterView) obj2).R, j10);
                break;
            case 22:
                bi biVar = (bi) obj2;
                org.telegram.ui.Components.t4.L(biVar.getContext(), j10, new kg(biVar, 16), (org.telegram.ui.ActionBar.e6) obj);
                break;
            case 23:
                zl zlVar = (zl) obj2;
                xl xlVar2 = (xl) obj;
                am amVar = zlVar.Q;
                if (!amVar.r.J1 && zlVar.E == j10 && (xlVar = zlVar.G) == xlVar2) {
                    amVar.K = xlVar;
                    amVar.N = xlVar.a.a;
                    amVar.L = false;
                    zlVar.H = 0.0f;
                    zlVar.invalidate();
                    ValueAnimator valueAnimator = amVar.M;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    amVar.M = ofFloat;
                    ofFloat.addUpdateListener(new vl(zlVar, 0));
                    amVar.M.setDuration(200L);
                    amVar.M.start();
                    xl xlVar3 = amVar.K;
                    RectF f10 = xlVar3.f(xlVar3.e());
                    RectF d = amVar.K.d();
                    amVar.H = (((amVar.E - f10.left) / f10.width()) + 0.5f) / 2.0f;
                    amVar.G = (amVar.F - f10.top) / f10.height();
                    amVar.I = d.width();
                    amVar.J = d.height();
                    try {
                        amVar.performHapticFeedback(0, 2);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 24:
                w60.Dd((w60) obj2, j10, (TLRPC.Chat) obj);
                break;
            case 25:
                ((ws0) obj2).y1.presentFragment(wm.qa(((zi) obj).f1(), j10));
                break;
            case 26:
                xu0.A1((xu0) obj2, (TLRPC.TL_messages_emojiGroups) obj, j10);
                break;
            case 27:
                uw uwVar2 = (uw) obj2;
                c3.f0 f0Var = (c3.f0) obj;
                if (uwVar2.H.bot_admin_rights != null) {
                    uwVar2.getMessagesController().P4(-j10, uwVar2.getMessagesController().a2(Long.valueOf(uwVar2.I)), uwVar2.H.bot_admin_rights, null, false, uwVar2, true, true, null, f0Var, new ur(f0Var, 6));
                    break;
                } else {
                    f0Var.run();
                    break;
                }
            case 28:
                x30 x30Var = (x30) obj2;
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
                org.telegram.messenger.r3 r3Var = x30Var.S2;
                if (r3Var != null && i13 != 0) {
                    HashMap hashMap = r3Var.k;
                    Long valueOf = Long.valueOf(j10);
                    org.telegram.messenger.q3 q3Var = new org.telegram.messenger.q3();
                    q3Var.a = i13;
                    q3Var.b = true;
                    q3Var.c = System.currentTimeMillis();
                    hashMap.put(valueOf, q3Var);
                    x30Var.Q0(true);
                    break;
                }
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Long l10 = (Long) obj;
                org.telegram.ui.ActionBar.d2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    wm ra2 = wm.ra(l10.longValue());
                    T3.presentFragment(ra2);
                    TLRPC.Chat M0 = hp.s1(launchActivity.P).M0(Long.valueOf(-l10.longValue()));
                    if (M0 != null) {
                        org.telegram.messenger.g0.i3(new j9(ra2, this.b, M0, 1), 250L);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ r1(Object obj, Object obj2, long j10, int i3) {
        this.a = i3;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }
}
