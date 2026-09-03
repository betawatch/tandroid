package i5;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import gg.y1;
import h5.d0;
import j3.c0;
import j3.f0;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;
import kh.g2;
import lh.b9;
import lh.g5;
import nh.c7;
import nh.d7;
import nh.g7;
import nh.i9;
import nh.l7;
import nh.s6;
import nh.t6;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.km;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mm;
import org.telegram.ui.Components.nm;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sf;
import org.telegram.ui.Components.tg;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cd0;
import org.telegram.ui.e60;
import org.telegram.ui.hu;
import org.telegram.ui.lc0;
import org.telegram.ui.ln;
import org.telegram.ui.qy;
import org.telegram.ui.rr;
import org.telegram.ui.tq;
import org.telegram.ui.y90;
import org.telegram.ui.zn;
import ph.s0;
import ph.t0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v(Object obj, long j10, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0586  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ArrayList arrayList;
        boolean z4;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        int i11;
        km kmVar;
        int i12 = this.a;
        int i13 = 4;
        int i14 = 2;
        int i15 = 1;
        int i16 = 0;
        long j10 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i12) {
            case 0:
                c0 c0Var = (c0) ((f7.b) obj2).c;
                int i17 = d0.a;
                f0 f0Var = c0Var.a;
                k3.f fVar = f0Var.q;
                k3.a p10 = fVar.p();
                int i18 = 26;
                fVar.q(p10, 26, new c1.b(p10, obj, j10));
                if (f0Var.P == obj) {
                    f0Var.l.e(26, new f0.d(i18));
                    break;
                }
                break;
            case 1:
                g2 g2Var = (g2) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                g2Var.getClass();
                p2 U = LaunchActivity.U();
                if (U != null) {
                    g2Var.dismiss();
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", j10);
                    bundle.putBoolean("open_gifts", true);
                    U.presentFragment(new ProfileActivity(bundle, null));
                    break;
                }
                break;
            case 2:
                g5 g5Var = (g5) obj2;
                Runnable runnable = (Runnable) obj;
                g5Var.p2((int) j10, g5Var.getContext(), true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 3:
                g5 g5Var2 = (g5) obj2;
                g5Var2.getClass();
                ((ze.c) obj).b();
                g5Var2.p2((int) j10, g5Var2.getContext(), true);
                break;
            case 4:
                TL_stories.Boost boost = (TL_stories.Boost) obj;
                g3 g3Var = ((g3[]) obj2)[0];
                if (g3Var != null) {
                    g3Var.dismiss();
                }
                p2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(zn.Q9(boost.giveaway_msg_id, j10));
                    break;
                }
                break;
            case 5:
                nh.q qVar = (nh.q) obj2;
                nh.p pVar = (nh.p) obj;
                t6 t6Var = qVar.s;
                ArrayList arrayList2 = qVar.x;
                qy qyVar = qVar.b0;
                if (qyVar != null && qyVar.getParentActivity() != null) {
                    int i19 = pVar.b;
                    ArrayList arrayList3 = new ArrayList();
                    int i20 = 0;
                    while (true) {
                        if (i20 < arrayList2.size()) {
                            long j11 = ((nh.n) arrayList2.get(i20)).c;
                            arrayList = arrayList2;
                            if (j11 == UserConfig.getInstance(qVar.f).clientUserId || !t6Var.J(j11)) {
                                i20++;
                                arrayList2 = arrayList;
                            } else {
                                z4 = false;
                            }
                        } else {
                            arrayList = arrayList2;
                            z4 = true;
                        }
                    }
                    if (pVar.C && (!z4 || arrayList.size() == 1)) {
                        arrayList3.add(Long.valueOf(pVar.B));
                        i10 = i19;
                        z10 = true;
                    } else if (!pVar.C && t6Var.J(pVar.B)) {
                        int i21 = 0;
                        while (i21 < arrayList.size()) {
                            ArrayList arrayList4 = arrayList;
                            long j12 = ((nh.n) arrayList4.get(i21)).c;
                            if (!pVar.C && t6Var.J(j12)) {
                                arrayList3.add(Long.valueOf(j12));
                            }
                            if (j12 == pVar.B) {
                                i19 = arrayList3.size() - 1;
                            }
                            i21++;
                            arrayList = arrayList4;
                        }
                        i10 = i19;
                        z10 = false;
                        z11 = true;
                        i9 orCreateStoryViewer = qyVar.getOrCreateStoryViewer();
                        orCreateStoryViewer.s(new y1(qVar, j10, 4));
                        Context context = qVar.getContext();
                        c7 a2 = c7.a(qVar.h);
                        a2.e = new ih.q(i15, qVar, z10);
                        a2.f = qVar.b != 1;
                        a2.h = z11;
                        a2.n = z10;
                        a2.r = true;
                        orCreateStoryViewer.F(context, null, arrayList3, i10, null, null, a2, false);
                        break;
                    } else {
                        ArrayList arrayList5 = arrayList;
                        for (int i22 = 0; i22 < arrayList5.size(); i22++) {
                            if (t6Var.I(((nh.n) arrayList5.get(i22)).c)) {
                                arrayList3.add(Long.valueOf(((nh.n) arrayList5.get(i22)).c));
                            } else if (i22 <= i19) {
                                i19--;
                            }
                        }
                        i10 = i19;
                        z10 = false;
                    }
                    z11 = false;
                    i9 orCreateStoryViewer2 = qyVar.getOrCreateStoryViewer();
                    orCreateStoryViewer2.s(new y1(qVar, j10, 4));
                    Context context2 = qVar.getContext();
                    c7 a22 = c7.a(qVar.h);
                    a22.e = new ih.q(i15, qVar, z10);
                    a22.f = qVar.b != 1;
                    a22.h = z11;
                    a22.n = z10;
                    a22.r = true;
                    orCreateStoryViewer2.F(context2, null, arrayList3, i10, null, null, a22, false);
                }
                break;
            case 6:
                t6 t6Var2 = (t6) obj2;
                TLObject tLObject = (TLObject) obj;
                int i23 = t6Var2.a;
                t6Var2.C.remove(Long.valueOf(j10));
                if (tLObject != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                    MessagesController.getInstance(i23).putUsers(tL_stories_peerStories.users, false);
                    TLRPC.User user = MessagesController.getInstance(i23).getUser(Long.valueOf(j10));
                    TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                    t6Var2.i.k(peerStories, DialogObject.getPeerDialogId(peerStories.peer));
                    if (user != null && (t6Var2.M(user) || user.self)) {
                        t6Var2.g(peerStories);
                        g7 g7Var = t6Var2.k;
                        g7Var.b.getStorageQueue().postRunnable(new d7(g7Var, peerStories, 0));
                    }
                    StringBuilder s6 = android.support.v4.media.a.s(j10, "StoriesController processAllStoriesResponse dialogId=", " overwrite stories ");
                    s6.append(tL_stories_peerStories.stories.stories.size());
                    FileLog.d(s6.toString());
                    NotificationCenter.getInstance(i23).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    break;
                }
                break;
            case 7:
                s6 s6Var = (s6) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                t6 t6Var3 = s6Var.J;
                t0 t0Var = t6Var3.w;
                s6Var.d = true;
                ph.t6 t6Var4 = s6Var.c;
                if (t6Var4.w) {
                    t0Var.c(t6Var4);
                }
                t6Var4.w = false;
                t6Var4.x = null;
                if (!t6Var4.b0) {
                    ArrayList arrayList6 = t0Var.b;
                    if (!t6Var4.u && storyItem.media != null) {
                        ArrayList arrayList7 = new ArrayList();
                        int size = arrayList6.size();
                        int i24 = 0;
                        while (i24 < size) {
                            Object obj3 = arrayList6.get(i24);
                            i24++;
                            ph.t6 t6Var5 = (ph.t6) obj3;
                            if (t6Var5.g && t6Var5.f == storyItem.id) {
                                arrayList7.add(t6Var5);
                            }
                        }
                        t0Var.b(arrayList7);
                        t0Var.e(t6Var4);
                        t6Var4.b = Utilities.random.nextLong();
                        s0 s0Var = new s0(t6Var4);
                        t6Var4.g = true;
                        s0Var.G = true;
                        t6Var4.e = j10;
                        s0Var.I = j10;
                        int i25 = storyItem.id;
                        t6Var4.f = i25;
                        s0Var.H = i25;
                        long j13 = storyItem.expire_date * 1000;
                        t6Var4.J = j13;
                        s0Var.L = j13;
                        TLRPC.MessageMedia messageMedia = storyItem.media;
                        TLRPC.Document document = messageMedia.document;
                        if (document != null) {
                            long j14 = document.id;
                            t6Var4.H = j14;
                            s0Var.J = j14;
                        } else {
                            TLRPC.Photo photo = messageMedia.photo;
                            if (photo != null) {
                                long j15 = photo.id;
                                t6Var4.I = j15;
                                s0Var.K = j15;
                            }
                        }
                        arrayList6.remove(t6Var4);
                        z12 = false;
                        arrayList6.add(0, t6Var4);
                        t0Var.a(s0Var);
                        if (s6Var.b) {
                            t6Var3.R = z12;
                            t6Var3.S = null;
                            break;
                        }
                    }
                }
                z12 = false;
                if (s6Var.b) {
                }
                break;
            case 8:
                ArrayList arrayList8 = (ArrayList) obj;
                MessagesStorage messagesStorage = ((g7) obj2).b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    String join = TextUtils.join(", ", arrayList8);
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM stories WHERE dialog_id = " + j10 + " AND story_id IN (" + join + ")").stepThis().dispose();
                    break;
                } catch (Throwable th2) {
                    messagesStorage.checkSQLException(th2);
                    return;
                }
            case 9:
                ((g7) obj2).l(j10, (TL_stories.StoryItem) obj);
                break;
            case 10:
                l7 l7Var = (l7) obj2;
                l7Var.getClass();
                ((View) obj).invalidate();
                MessagesController.getInstance(l7Var.a).getStoriesController().e0(j10, false);
                break;
            case 11:
                ((VideoFramesRewinder) obj2).lambda$new$1((ArrayList) obj, j10);
                break;
            case 12:
                ((NativeInstance) obj2).lambda$onParticipantDescriptionsRequired$2(j10, (int[]) obj);
                break;
            case 13:
                ((VideoCapturerDevice) obj2).lambda$init$5(j10, (String) obj);
                break;
            case 14:
                ((VideoCapturerDevice) obj2).lambda$init$2(j10, (Point) obj);
                break;
            case 15:
                zn znVar = (zn) obj2;
                znVar.getMessagesController().lambda$checkDeletingTask$84(this.b, znVar.Q5, ((MessageObject) obj).getId());
                break;
            case 16:
                zn znVar2 = ((ln) obj2).a;
                i11 = ((p2) znVar2).currentAccount;
                z4.t0(SendMessagesHelper.getInstance(i11).sendMessage((ArrayList) obj, this.b, false, false, true, 0, 0, null, -1, 0L, znVar2.N8(), znVar2.d5), znVar2, null);
                break;
            case 17:
                rr rrVar = (rr) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                rrVar.getMessagesController().deleteParticipantFromChat(rrVar.K, user2);
                rrVar.v0(j10);
                if (rrVar.r != null && user2 != null && qc.a(rrVar)) {
                    qc.D(rrVar, user2, rrVar.r.title).j();
                    break;
                }
                break;
            case 18:
                Runnable runnable2 = (Runnable) obj2;
                p2 p2Var = (p2) obj;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (p2Var != null) {
                    p2Var.presentFragment(zn.R9(j10));
                    break;
                }
                break;
            case 19:
                int i26 = ChatActivityEnterView.j5;
                ((sf) obj).run();
                SharedPrefsHelper.setWebViewConfirmShown(((ChatActivityEnterView) obj2).N, j10, true);
                break;
            case 20:
                li liVar = (li) obj2;
                z4.M(liVar.getContext(), j10, new tg(liVar, 14), (f6) obj);
                break;
            case 21:
                mm mmVar = (mm) obj2;
                km kmVar2 = (km) obj;
                nm nmVar = mmVar.M;
                if (!nmVar.r.H1 && mmVar.y == j10 && (kmVar = mmVar.C) == kmVar2) {
                    nmVar.G = kmVar;
                    nmVar.J = kmVar.a.a;
                    nmVar.H = false;
                    mmVar.D = 0.0f;
                    mmVar.invalidate();
                    ValueAnimator valueAnimator = nmVar.I;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    nmVar.I = ofFloat;
                    ofFloat.addUpdateListener(new hm(mmVar, 0));
                    nmVar.I.setDuration(200L);
                    nmVar.I.start();
                    km kmVar3 = nmVar.G;
                    RectF f10 = kmVar3.f(kmVar3.e());
                    RectF d = nmVar.G.d();
                    nmVar.D = (((nmVar.y - f10.left) / f10.width()) + 0.5f) / 2.0f;
                    nmVar.C = (nmVar.B - f10.top) / f10.height();
                    nmVar.E = d.width();
                    nmVar.F = d.height();
                    try {
                        nmVar.performHapticFeedback(0, 2);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 22:
                h80.Xc((h80) obj2, j10, (TLRPC.Chat) obj);
                break;
            case 23:
                ((yu0) obj2).s1.presentFragment(zn.Q9(((MessageObject) obj).getId(), j10));
                break;
            case 24:
                xw0.w1((xw0) obj2, (TLRPC.TL_messages_emojiGroups) obj, j10);
                break;
            case 25:
                qy qyVar2 = (qy) obj2;
                x xVar = (x) obj;
                if (qyVar2.D.bot_admin_rights != null) {
                    qyVar2.getMessagesController().setUserAdminRole(-j10, qyVar2.getMessagesController().getUser(Long.valueOf(qyVar2.E)), qyVar2.D.bot_admin_rights, null, false, qyVar2, true, true, null, xVar, new hu(xVar, i14));
                    break;
                } else {
                    xVar.run();
                    break;
                }
            case 26:
                e60 e60Var = (e60) obj2;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                e60Var.getClass();
                TLRPC.Update update = updates.update;
                if (update instanceof TL_update.TL_updateNewMessage) {
                    TLRPC.Message message = ((TL_update.TL_updateNewMessage) update).message;
                    if (message != null && (message.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                        i16 = message.id;
                    }
                } else if (update instanceof TL_update.TL_updateMessageID) {
                    i16 = ((TL_update.TL_updateMessageID) update).id;
                } else if (updates.updates != null) {
                    int i27 = 0;
                    while (true) {
                        if (i27 < updates.updates.size()) {
                            TLRPC.Update update2 = updates.updates.get(i27);
                            if (update2 instanceof TL_update.TL_updateNewMessage) {
                                TLRPC.Message message2 = ((TL_update.TL_updateNewMessage) update2).message;
                                if (message2 != null && (message2.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                                    i16 = message2.id;
                                }
                                i27++;
                            } else if (update2 instanceof TL_update.TL_updateMessageID) {
                                i16 = ((TL_update.TL_updateMessageID) update2).id;
                            } else {
                                i27++;
                            }
                        }
                    }
                }
                ChatObject.Call call = e60Var.X0;
                if (call != null && i16 != 0) {
                    call.invitedUsersMessageIds.put(Long.valueOf(j10), ChatObject.Call.InvitedUser.make(i16));
                    e60Var.O0(true);
                    break;
                }
                break;
            case 27:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Long l10 = (Long) obj;
                p2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    zn R9 = zn.R9(l10.longValue());
                    U3.presentFragment(R9);
                    TLRPC.Chat chat = MessagesController.getInstance(launchActivity.L).getChat(Long.valueOf(-l10.longValue()));
                    if (chat != null) {
                        AndroidUtilities.runOnUIThread(new b9(R9, this.b, chat, 1), 250L);
                        break;
                    }
                }
                break;
            case 28:
                LaunchActivity launchActivity2 = (LaunchActivity) obj2;
                Pattern pattern = LaunchActivity.y1;
                AndroidUtilities.runOnUIThread(new tq(launchActivity2, MessagesStorage.getInstance(launchActivity2.L).getUser(j10), (y90) obj, 13));
                break;
            default:
                cd0 cd0Var = (cd0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (cd0Var.F != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                    int i28 = 0;
                    while (i28 < messages_messages.messages.size()) {
                        if (!(messages_messages.messages.get(i28).media instanceof TLRPC.TL_messageMediaGeoLive)) {
                            messages_messages.messages.remove(i28);
                            i28--;
                        }
                        i28++;
                    }
                    cd0Var.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                    cd0Var.getMessagesController().putUsers(messages_messages.users, false);
                    cd0Var.getMessagesController().putChats(messages_messages.chats, false);
                    cd0Var.getLocationController().locationsCache.k(messages_messages.messages, j10);
                    cd0Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsCacheChanged, Long.valueOf(j10));
                    cd0Var.i0(messages_messages.messages);
                    cd0Var.getLocationController().markLiveLoactionsAsRead(cd0Var.b0);
                    if (cd0Var.G0 == null) {
                        lc0 lc0Var = new lc0(cd0Var, i13);
                        cd0Var.G0 = lc0Var;
                        AndroidUtilities.runOnUIThread(lc0Var, 5000L);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ v(Object obj, Object obj2, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }
}
