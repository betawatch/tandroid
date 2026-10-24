package a3;

import ai.bc;
import ai.l7;
import ai.v3;
import ai.vb;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import ci.b8;
import ci.g7;
import ci.h7;
import ci.q7;
import ci.s7;
import ci.v7;
import ci.z9;
import ei.a1;
import ei.a8;
import ei.k9;
import ei.z0;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.vm;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.ym;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dn;
import org.telegram.ui.ey;
import org.telegram.ui.jr;
import org.telegram.ui.lq;
import org.telegram.ui.s90;
import org.telegram.ui.sn;
import org.telegram.ui.u50;
import org.telegram.ui.xt;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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

    /* JADX WARN: Removed duplicated region for block: B:160:0x0393  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        ym ymVar;
        int i12 = this.a;
        int i13 = 2;
        int i14 = 0;
        long j10 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i12) {
            case 0:
                m0 m0Var = (m0) ((n4.s) obj2).c;
                String str = e2.m0.a;
                i2.h0 h0Var = ((i2.b0) m0Var).a;
                j2.e eVar = h0Var.s;
                j2.a p5 = eVar.p();
                eVar.q(p5, 26, new ah.h0(p5, obj, j10));
                if (h0Var.T == obj) {
                    h0Var.m.e(26, new fh.b(27));
                    break;
                }
                break;
            case 1:
                l7 l7Var = (l7) obj2;
                l7Var.getClass();
                ((pf.c) obj).b();
                l7Var.S2((int) j10, l7Var.getContext(), true);
                break;
            case 2:
                l7 l7Var2 = (l7) obj2;
                Runnable runnable = (Runnable) obj;
                l7Var2.S2((int) j10, l7Var2.getContext(), true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 3:
                TL_stories.Boost boost = (TL_stories.Boost) obj;
                h3 h3Var = ((h3[]) obj2)[0];
                if (h3Var != null) {
                    h3Var.dismiss();
                }
                o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(sn.V9(boost.giveaway_msg_id, j10));
                    break;
                }
                break;
            case 4:
                ci.r rVar = (ci.r) obj2;
                ci.q qVar = (ci.q) obj;
                h7 h7Var = rVar.s;
                ArrayList arrayList = rVar.x;
                ey eyVar = rVar.e0;
                if (eyVar != null && eyVar.getParentActivity() != null) {
                    int i15 = qVar.b;
                    ArrayList arrayList2 = new ArrayList();
                    int i16 = 0;
                    while (true) {
                        if (i16 < arrayList.size()) {
                            long j11 = ((ci.o) arrayList.get(i16)).c;
                            if (j11 == UserConfig.getInstance(rVar.f).clientUserId || !h7Var.J(j11)) {
                                i16++;
                            } else {
                                z10 = false;
                            }
                        } else {
                            z10 = true;
                        }
                    }
                    if (!qVar.F || (z10 && arrayList.size() != 1)) {
                        if (qVar.F || !h7Var.J(qVar.E)) {
                            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                if (h7Var.I(((ci.o) arrayList.get(i17)).c)) {
                                    arrayList2.add(Long.valueOf(((ci.o) arrayList.get(i17)).c));
                                } else if (i17 <= i15) {
                                    i15--;
                                }
                            }
                            i10 = i15;
                            z11 = false;
                        } else {
                            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                                long j12 = ((ci.o) arrayList.get(i18)).c;
                                if (!qVar.F && h7Var.J(j12)) {
                                    arrayList2.add(Long.valueOf(j12));
                                }
                                if (j12 == qVar.E) {
                                    i15 = arrayList2.size() - 1;
                                }
                            }
                            i10 = i15;
                            z11 = true;
                        }
                        z12 = false;
                    } else {
                        arrayList2.add(Long.valueOf(qVar.E));
                        i10 = i15;
                        z11 = false;
                        z12 = true;
                    }
                    z9 orCreateStoryViewer = eyVar.getOrCreateStoryViewer();
                    orCreateStoryViewer.s(new v3(rVar, j10, 2));
                    Context context = rVar.getContext();
                    q7 a2 = q7.a(rVar.h);
                    a2.e = new ci.f(0, rVar, z12);
                    a2.f = rVar.b == 1;
                    a2.h = z11;
                    a2.n = z12;
                    a2.r = true;
                    orCreateStoryViewer.G(context, null, arrayList2, i10, null, null, a2, false);
                    break;
                }
                break;
            case 5:
                h7 h7Var2 = (h7) obj2;
                TLObject tLObject = (TLObject) obj;
                int i19 = h7Var2.a;
                h7Var2.C.remove(Long.valueOf(j10));
                if (tLObject != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                    MessagesController.getInstance(i19).putUsers(tL_stories_peerStories.users, false);
                    TLRPC.User user = MessagesController.getInstance(i19).getUser(Long.valueOf(j10));
                    TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                    h7Var2.i.k(peerStories, DialogObject.getPeerDialogId(peerStories.peer));
                    if (user != null && (h7Var2.M(user) || user.self)) {
                        h7Var2.g(peerStories);
                        v7 v7Var = h7Var2.k;
                        v7Var.b.getStorageQueue().postRunnable(new s7(v7Var, peerStories, 0));
                    }
                    StringBuilder t10 = a1.g.t(j10, "StoriesController processAllStoriesResponse dialogId=", " overwrite stories ");
                    t10.append(tL_stories_peerStories.stories.stories.size());
                    FileLog.d(t10.toString());
                    NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    break;
                }
                break;
            case 6:
                g7 g7Var = (g7) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                h7 h7Var3 = g7Var.M;
                a1 a1Var = h7Var3.w;
                g7Var.d = true;
                a8 a8Var = g7Var.c;
                if (a8Var.w) {
                    a1Var.b(a8Var);
                }
                a8Var.w = false;
                a8Var.x = null;
                if (!a8Var.b0) {
                    ArrayList arrayList3 = a1Var.b;
                    if (!a8Var.u && storyItem.media != null) {
                        ArrayList arrayList4 = new ArrayList();
                        int size = arrayList3.size();
                        int i20 = 0;
                        while (i20 < size) {
                            Object obj3 = arrayList3.get(i20);
                            i20++;
                            a8 a8Var2 = (a8) obj3;
                            if (a8Var2.g && a8Var2.f == storyItem.id) {
                                arrayList4.add(a8Var2);
                            }
                        }
                        a1Var.c(arrayList4);
                        a1Var.e(a8Var);
                        a8Var.b = Utilities.random.nextLong();
                        z0 z0Var = new z0(a8Var);
                        a8Var.g = true;
                        z0Var.G = true;
                        a8Var.e = j10;
                        z0Var.I = j10;
                        int i21 = storyItem.id;
                        a8Var.f = i21;
                        z0Var.H = i21;
                        long j13 = storyItem.expire_date * 1000;
                        a8Var.J = j13;
                        z0Var.L = j13;
                        TLRPC.MessageMedia messageMedia = storyItem.media;
                        TLRPC.Document document = messageMedia.document;
                        if (document != null) {
                            long j14 = document.id;
                            a8Var.H = j14;
                            z0Var.J = j14;
                        } else {
                            TLRPC.Photo photo = messageMedia.photo;
                            if (photo != null) {
                                long j15 = photo.id;
                                a8Var.I = j15;
                                z0Var.K = j15;
                            }
                        }
                        arrayList3.remove(a8Var);
                        z13 = false;
                        arrayList3.add(0, a8Var);
                        a1Var.a(z0Var);
                        if (g7Var.b) {
                            h7Var3.R = z13;
                            h7Var3.S = null;
                            break;
                        }
                    }
                }
                z13 = false;
                if (g7Var.b) {
                }
                break;
            case 7:
                ArrayList arrayList5 = (ArrayList) obj;
                MessagesStorage messagesStorage = ((v7) obj2).b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    String join = TextUtils.join(", ", arrayList5);
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM stories WHERE dialog_id = " + j10 + " AND story_id IN (" + join + ")").stepThis().dispose();
                    break;
                } catch (Throwable th2) {
                    messagesStorage.checkSQLException(th2);
                    return;
                }
            case 8:
                ((v7) obj2).l(j10, (TL_stories.StoryItem) obj);
                break;
            case 9:
                b8 b8Var = (b8) obj2;
                b8Var.getClass();
                ((View) obj).invalidate();
                MessagesController.getInstance(b8Var.a).getStoriesController().e0(j10, false);
                break;
            case 10:
                k9 k9Var = (k9) obj2;
                k9Var.getClass();
                k9Var.d(j10, ((TLRPC.ChatFull) obj).participants);
                break;
            case 11:
                ((long[]) obj2)[0] = j10;
                ((vb) obj).run();
                break;
            case 12:
                ((VideoFramesRewinder) obj2).lambda$new$1((ArrayList) obj, j10);
                break;
            case 13:
                ((NativeInstance) obj2).lambda$onParticipantDescriptionsRequired$2(j10, (int[]) obj);
                break;
            case 14:
                ((VideoCapturerDevice) obj2).lambda$init$5(j10, (String) obj);
                break;
            case 15:
                ((VideoCapturerDevice) obj2).lambda$init$2(j10, (Point) obj);
                break;
            case 16:
                sn snVar = (sn) obj2;
                snVar.getMessagesController().lambda$checkDeletingTask$83(this.b, snVar.f6, ((MessageObject) obj).getId());
                break;
            case 17:
                sn snVar2 = ((dn) obj2).a;
                i11 = ((o2) snVar2).currentAccount;
                f5.t0(SendMessagesHelper.getInstance(i11).sendMessage((ArrayList) obj, this.b, false, false, true, 0, 0, null, -1, 0L, snVar2.S8(), snVar2.s5), snVar2, null);
                break;
            case 18:
                jr jrVar = (jr) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                jrVar.getMessagesController().deleteParticipantFromChat(jrVar.N, user2);
                jrVar.v0(j10);
                if (jrVar.r != null && user2 != null && xc.a(jrVar)) {
                    xc.D(jrVar, user2, jrVar.r.title).j();
                    break;
                }
                break;
            case 19:
                Runnable runnable2 = (Runnable) obj2;
                o2 o2Var = (o2) obj;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (o2Var != null) {
                    o2Var.presentFragment(sn.W9(j10));
                    break;
                }
                break;
            case 20:
                int i22 = ChatActivityEnterView.r5;
                ((bg) obj).run();
                SharedPrefsHelper.setWebViewConfirmShown(((ChatActivityEnterView) obj2).Q, j10, true);
                break;
            case 21:
                ti tiVar = (ti) obj2;
                f5.M(tiVar.getContext(), j10, new dh(tiVar, 14), (g6) obj);
                break;
            case 22:
                an anVar = (an) obj2;
                ym ymVar2 = (ym) obj;
                bn bnVar = anVar.P;
                if (!bnVar.r.I1 && anVar.y == j10 && (ymVar = anVar.F) == ymVar2) {
                    bnVar.J = ymVar;
                    bnVar.M = ymVar.a.a;
                    bnVar.K = false;
                    anVar.G = 0.0f;
                    anVar.invalidate();
                    ValueAnimator valueAnimator = bnVar.L;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    bnVar.L = ofFloat;
                    ofFloat.addUpdateListener(new vm(anVar, 0));
                    bnVar.L.setDuration(200L);
                    bnVar.L.start();
                    ym ymVar3 = bnVar.J;
                    RectF f7 = ymVar3.f(ymVar3.e());
                    RectF d = bnVar.J.d();
                    bnVar.G = (((bnVar.y - f7.left) / f7.width()) + 0.5f) / 2.0f;
                    bnVar.F = (bnVar.E - f7.top) / f7.height();
                    bnVar.H = d.width();
                    bnVar.I = d.height();
                    try {
                        bnVar.performHapticFeedback(0, 2);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 23:
                a90.ed((a90) obj2, j10, (TLRPC.Chat) obj);
                break;
            case 24:
                ((xv0) obj2).v1.presentFragment(sn.V9(((MessageObject) obj).getId(), j10));
                break;
            case 25:
                ux0.D1((ux0) obj2, (TLRPC.TL_messages_emojiGroups) obj, j10);
                break;
            case 26:
                ey eyVar2 = (ey) obj2;
                h0 h0Var2 = (h0) obj;
                if (eyVar2.G.bot_admin_rights != null) {
                    eyVar2.getMessagesController().setUserAdminRole(-j10, eyVar2.getMessagesController().getUser(Long.valueOf(eyVar2.H)), eyVar2.G.bot_admin_rights, null, false, eyVar2, true, true, null, h0Var2, new xt(h0Var2, i13));
                    break;
                } else {
                    h0Var2.run();
                    break;
                }
            case 27:
                u50 u50Var = (u50) obj2;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                u50Var.getClass();
                TLRPC.Update update = updates.update;
                if (update instanceof TL_update.TL_updateNewMessage) {
                    TLRPC.Message message = ((TL_update.TL_updateNewMessage) update).message;
                    if (message != null && (message.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                        i14 = message.id;
                    }
                } else if (update instanceof TL_update.TL_updateMessageID) {
                    i14 = ((TL_update.TL_updateMessageID) update).id;
                } else if (updates.updates != null) {
                    int i23 = 0;
                    while (true) {
                        if (i23 < updates.updates.size()) {
                            TLRPC.Update update2 = updates.updates.get(i23);
                            if (update2 instanceof TL_update.TL_updateNewMessage) {
                                TLRPC.Message message2 = ((TL_update.TL_updateNewMessage) update2).message;
                                if (message2 != null && (message2.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                                    i14 = message2.id;
                                }
                                i23++;
                            } else if (update2 instanceof TL_update.TL_updateMessageID) {
                                i14 = ((TL_update.TL_updateMessageID) update2).id;
                            } else {
                                i23++;
                            }
                        }
                    }
                }
                ChatObject.Call call = u50Var.a1;
                if (call != null && i14 != 0) {
                    call.invitedUsersMessageIds.put(Long.valueOf(j10), ChatObject.Call.InvitedUser.make(i14));
                    u50Var.O0(true);
                    break;
                }
                break;
            case 28:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Long l4 = (Long) obj;
                o2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    sn W9 = sn.W9(l4.longValue());
                    U2.presentFragment(W9);
                    TLRPC.Chat chat = MessagesController.getInstance(launchActivity.O).getChat(Long.valueOf(-l4.longValue()));
                    if (chat != null) {
                        AndroidUtilities.runOnUIThread(new bc(W9, this.b, chat, 1), 250L);
                        break;
                    }
                }
                break;
            default:
                LaunchActivity launchActivity2 = (LaunchActivity) obj2;
                Pattern pattern = LaunchActivity.E1;
                AndroidUtilities.runOnUIThread(new lq(launchActivity2, MessagesStorage.getInstance(launchActivity2.O).getUser(j10), (s90) obj, 19));
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
