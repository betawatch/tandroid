package a3;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import bi.h7;
import bi.ia;
import bi.r3;
import bi.sb;
import di.g7;
import di.q7;
import di.s7;
import di.u7;
import di.y9;
import di.z7;
import fi.a1;
import fi.g9;
import fi.w7;
import fi.z0;
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
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.cn;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wm;
import org.telegram.ui.Components.zm;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ey;
import org.telegram.ui.hn;
import org.telegram.ui.mr;
import org.telegram.ui.pq;
import org.telegram.ui.r90;
import org.telegram.ui.st;
import org.telegram.ui.wn;
import org.telegram.ui.x50;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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

    /* JADX WARN: Removed duplicated region for block: B:160:0x0394  */
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
        zm zmVar;
        int i12 = this.a;
        int i13 = 0;
        long j10 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i12) {
            case 0:
                m0 m0Var = (m0) ((n4.s) obj2).c;
                String str = e2.n0.a;
                i2.j0 j0Var = ((i2.d0) m0Var).a;
                j2.e eVar = j0Var.s;
                j2.a p10 = eVar.p();
                eVar.q(p10, 26, new ai.f0(p10, obj, j10));
                if (j0Var.T == obj) {
                    j0Var.m.e(26, new gh.a(25));
                    break;
                }
                break;
            case 1:
                h7 h7Var = (h7) obj2;
                h7Var.getClass();
                ((qf.c) obj).b();
                h7Var.S2((int) j10, h7Var.getContext(), true);
                break;
            case 2:
                h7 h7Var2 = (h7) obj2;
                Runnable runnable = (Runnable) obj;
                h7Var2.S2((int) j10, h7Var2.getContext(), true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 3:
                TL_stories.Boost boost = (TL_stories.Boost) obj;
                k3 k3Var = ((k3[]) obj2)[0];
                if (k3Var != null) {
                    k3Var.dismiss();
                }
                r2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(wn.da(boost.giveaway_msg_id, j10));
                    break;
                }
                break;
            case 4:
                di.r rVar = (di.r) obj2;
                di.q qVar = (di.q) obj;
                di.h7 h7Var3 = rVar.s;
                ArrayList arrayList = rVar.x;
                ey eyVar = rVar.e0;
                if (eyVar != null && eyVar.getParentActivity() != null) {
                    int i14 = qVar.b;
                    ArrayList arrayList2 = new ArrayList();
                    int i15 = 0;
                    while (true) {
                        if (i15 < arrayList.size()) {
                            long j11 = ((di.o) arrayList.get(i15)).c;
                            if (j11 == UserConfig.getInstance(rVar.f).clientUserId || !h7Var3.L(j11)) {
                                i15++;
                            } else {
                                z10 = false;
                            }
                        } else {
                            z10 = true;
                        }
                    }
                    if (!qVar.F || (z10 && arrayList.size() != 1)) {
                        if (qVar.F || !h7Var3.L(qVar.E)) {
                            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                if (h7Var3.K(((di.o) arrayList.get(i16)).c)) {
                                    arrayList2.add(Long.valueOf(((di.o) arrayList.get(i16)).c));
                                } else if (i16 <= i14) {
                                    i14--;
                                }
                            }
                            i10 = i14;
                            z11 = false;
                        } else {
                            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                long j12 = ((di.o) arrayList.get(i17)).c;
                                if (!qVar.F && h7Var3.L(j12)) {
                                    arrayList2.add(Long.valueOf(j12));
                                }
                                if (j12 == qVar.E) {
                                    i14 = arrayList2.size() - 1;
                                }
                            }
                            i10 = i14;
                            z11 = true;
                        }
                        z12 = false;
                    } else {
                        arrayList2.add(Long.valueOf(qVar.E));
                        i10 = i14;
                        z11 = false;
                        z12 = true;
                    }
                    y9 orCreateStoryViewer = eyVar.getOrCreateStoryViewer();
                    orCreateStoryViewer.t(new r3(rVar, j10, 2));
                    Context context = rVar.getContext();
                    q7 a2 = q7.a(rVar.h);
                    a2.e = new di.f(0, rVar, z12);
                    a2.f = rVar.b == 1;
                    a2.h = z11;
                    a2.n = z12;
                    a2.r = true;
                    orCreateStoryViewer.H(context, null, arrayList2, i10, null, null, a2, false);
                    break;
                }
                break;
            case 5:
                di.h7 h7Var4 = (di.h7) obj2;
                TLObject tLObject = (TLObject) obj;
                int i18 = h7Var4.a;
                h7Var4.C.remove(Long.valueOf(j10));
                if (tLObject != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                    MessagesController.getInstance(i18).putUsers(tL_stories_peerStories.users, false);
                    TLRPC.User user = MessagesController.getInstance(i18).getUser(Long.valueOf(j10));
                    TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                    h7Var4.i.k(peerStories, DialogObject.getPeerDialogId(peerStories.peer));
                    if (user != null && (h7Var4.O(user) || user.self)) {
                        h7Var4.g(peerStories);
                        u7 u7Var = h7Var4.k;
                        u7Var.b.getStorageQueue().postRunnable(new s7(u7Var, peerStories, 0));
                    }
                    StringBuilder t10 = a1.g.t(j10, "StoriesController processAllStoriesResponse dialogId=", " overwrite stories ");
                    t10.append(tL_stories_peerStories.stories.stories.size());
                    FileLog.d(t10.toString());
                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    break;
                }
                break;
            case 6:
                g7 g7Var = (g7) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                di.h7 h7Var5 = g7Var.M;
                a1 a1Var = h7Var5.w;
                g7Var.d = true;
                w7 w7Var = g7Var.c;
                if (w7Var.w) {
                    a1Var.b(w7Var);
                }
                w7Var.w = false;
                w7Var.x = null;
                if (!w7Var.b0) {
                    ArrayList arrayList3 = a1Var.b;
                    if (!w7Var.u && storyItem.media != null) {
                        ArrayList arrayList4 = new ArrayList();
                        int size = arrayList3.size();
                        int i19 = 0;
                        while (i19 < size) {
                            Object obj3 = arrayList3.get(i19);
                            i19++;
                            w7 w7Var2 = (w7) obj3;
                            if (w7Var2.g && w7Var2.f == storyItem.id) {
                                arrayList4.add(w7Var2);
                            }
                        }
                        a1Var.c(arrayList4);
                        a1Var.e(w7Var);
                        w7Var.b = Utilities.random.nextLong();
                        z0 z0Var = new z0(w7Var);
                        w7Var.g = true;
                        z0Var.G = true;
                        w7Var.e = j10;
                        z0Var.I = j10;
                        int i20 = storyItem.id;
                        w7Var.f = i20;
                        z0Var.H = i20;
                        long j13 = storyItem.expire_date * 1000;
                        w7Var.J = j13;
                        z0Var.L = j13;
                        TLRPC.MessageMedia messageMedia = storyItem.media;
                        TLRPC.Document document = messageMedia.document;
                        if (document != null) {
                            long j14 = document.id;
                            w7Var.H = j14;
                            z0Var.J = j14;
                        } else {
                            TLRPC.Photo photo = messageMedia.photo;
                            if (photo != null) {
                                long j15 = photo.id;
                                w7Var.I = j15;
                                z0Var.K = j15;
                            }
                        }
                        arrayList3.remove(w7Var);
                        z13 = false;
                        arrayList3.add(0, w7Var);
                        a1Var.a(z0Var);
                        if (g7Var.b) {
                            h7Var5.R = z13;
                            h7Var5.S = null;
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
                MessagesStorage messagesStorage = ((u7) obj2).b;
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
                ((u7) obj2).l(j10, (TL_stories.StoryItem) obj);
                break;
            case 9:
                z7 z7Var = (z7) obj2;
                z7Var.getClass();
                ((View) obj).invalidate();
                MessagesController.getInstance(z7Var.a).getStoriesController().h0(j10, false);
                break;
            case 10:
                g9 g9Var = (g9) obj2;
                g9Var.getClass();
                g9Var.d(j10, ((TLRPC.ChatFull) obj).participants);
                break;
            case 11:
                ((long[]) obj2)[0] = j10;
                ((sb) obj).run();
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
                wn wnVar = (wn) obj2;
                wnVar.getMessagesController().lambda$checkDeletingTask$83(this.b, wnVar.j6, ((MessageObject) obj).getId());
                break;
            case 17:
                wn wnVar2 = ((hn) obj2).a;
                i11 = ((r2) wnVar2).currentAccount;
                g5.s0(SendMessagesHelper.getInstance(i11).sendMessage((ArrayList) obj, this.b, false, false, true, 0, 0, null, -1, 0L, wnVar2.a9(), wnVar2.w5), wnVar2, null);
                break;
            case 18:
                mr mrVar = (mr) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                mrVar.getMessagesController().deleteParticipantFromChat(mrVar.M, user2);
                mrVar.w0(j10);
                if (mrVar.n != null && user2 != null && wc.a(mrVar)) {
                    wc.D(mrVar, user2, mrVar.n.title).j();
                    break;
                }
                break;
            case 19:
                Runnable runnable2 = (Runnable) obj2;
                r2 r2Var = (r2) obj;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (r2Var != null) {
                    r2Var.presentFragment(wn.ea(j10));
                    break;
                }
                break;
            case 20:
                int i21 = ChatActivityEnterView.r5;
                ((bg) obj).run();
                SharedPrefsHelper.setWebViewConfirmShown(((ChatActivityEnterView) obj2).Q, j10, true);
                break;
            case 21:
                ti tiVar = (ti) obj2;
                g5.L(tiVar.getContext(), j10, new dh(tiVar, 16), (u6) obj);
                break;
            case 22:
                bn bnVar = (bn) obj2;
                zm zmVar2 = (zm) obj;
                cn cnVar = bnVar.P;
                if (!cnVar.r.I1 && bnVar.y == j10 && (zmVar = bnVar.F) == zmVar2) {
                    cnVar.J = zmVar;
                    cnVar.M = zmVar.a.a;
                    cnVar.K = false;
                    bnVar.G = 0.0f;
                    bnVar.invalidate();
                    ValueAnimator valueAnimator = cnVar.L;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    cnVar.L = ofFloat;
                    ofFloat.addUpdateListener(new wm(bnVar, 0));
                    cnVar.L.setDuration(200L);
                    cnVar.L.start();
                    zm zmVar3 = cnVar.J;
                    RectF f7 = zmVar3.f(zmVar3.e());
                    RectF d = cnVar.J.d();
                    cnVar.G = (((cnVar.y - f7.left) / f7.width()) + 0.5f) / 2.0f;
                    cnVar.F = (cnVar.E - f7.top) / f7.height();
                    cnVar.H = d.width();
                    cnVar.I = d.height();
                    try {
                        cnVar.performHapticFeedback(0, 2);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 23:
                c90.od((c90) obj2, j10, (TLRPC.Chat) obj);
                break;
            case 24:
                ((bw0) obj2).x1.presentFragment(wn.da(((MessageObject) obj).getId(), j10));
                break;
            case 25:
                cy0.D1((cy0) obj2, (TLRPC.TL_messages_emojiGroups) obj, j10);
                break;
            case 26:
                ey eyVar2 = (ey) obj2;
                h0 h0Var = (h0) obj;
                if (eyVar2.G.bot_admin_rights != null) {
                    eyVar2.getMessagesController().setUserAdminRole(-j10, eyVar2.getMessagesController().getUser(Long.valueOf(eyVar2.H)), eyVar2.G.bot_admin_rights, null, false, eyVar2, true, true, null, h0Var, new st(h0Var, 4));
                    break;
                } else {
                    h0Var.run();
                    break;
                }
            case 27:
                x50 x50Var = (x50) obj2;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                x50Var.getClass();
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
                ChatObject.Call call = x50Var.a1;
                if (call != null && i13 != 0) {
                    call.invitedUsersMessageIds.put(Long.valueOf(j10), ChatObject.Call.InvitedUser.make(i13));
                    x50Var.O0(true);
                    break;
                }
                break;
            case 28:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Long l4 = (Long) obj;
                r2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    wn ea2 = wn.ea(l4.longValue());
                    U2.presentFragment(ea2);
                    TLRPC.Chat chat = MessagesController.getInstance(launchActivity.O).getChat(Long.valueOf(-l4.longValue()));
                    if (chat != null) {
                        AndroidUtilities.runOnUIThread(new ia(ea2, this.b, chat, 1), 250L);
                        break;
                    }
                }
                break;
            default:
                LaunchActivity launchActivity2 = (LaunchActivity) obj2;
                Pattern pattern = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new pq(launchActivity2, MessagesStorage.getInstance(launchActivity2.O).getUser(j10), (r90) obj, 19));
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
