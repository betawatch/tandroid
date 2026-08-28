package e5;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import bg.i2;
import d5.f0;
import fh.g1;
import fh.p2;
import fh.y5;
import gh.f9;
import gh.k5;
import h3.h0;
import h3.k0;
import ih.e7;
import ih.f7;
import ih.i7;
import ih.m9;
import ih.o7;
import ih.u6;
import ih.v6;
import java.util.ArrayList;
import java.util.Locale;
import kh.a1;
import kh.a8;
import kh.b1;
import kh.n9;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bm;
import org.telegram.ui.Components.em;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.gm;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.sf;
import org.telegram.ui.Components.tg;
import org.telegram.ui.Components.y4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cn;
import org.telegram.ui.dy;
import org.telegram.ui.jr;
import org.telegram.ui.o50;
import org.telegram.ui.qn;
import org.telegram.ui.wt;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w(Object obj, long j10, Object obj2, int i9) {
        this.a = i9;
        this.c = obj;
        this.b = j10;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04ef  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        int i9;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        em emVar;
        int i11 = this.a;
        int i12 = 2;
        int i13 = 1;
        int i14 = 0;
        long j10 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i11) {
            case 0:
                h0 h0Var = (h0) ((we.b) obj2).c;
                int i15 = f0.a;
                k0 k0Var = h0Var.a;
                i3.f fVar = k0Var.r;
                i3.a k10 = fVar.k();
                fVar.l(k10, 26, new b5.d(k10, obj, j10));
                if (k0Var.R == obj) {
                    k0Var.l.e(26, new y5(13));
                    break;
                }
                break;
            case 1:
                p2 p2Var = (p2) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                p2Var.getClass();
                o2 U = LaunchActivity.U();
                if (U != null) {
                    p2Var.dismiss();
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
                k5 k5Var = (k5) obj2;
                Runnable runnable = (Runnable) obj;
                k5Var.p2((int) j10, k5Var.getContext(), true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 3:
                k5 k5Var2 = (k5) obj2;
                k5Var2.getClass();
                ((ve.d) obj).b();
                k5Var2.p2((int) j10, k5Var2.getContext(), true);
                break;
            case 4:
                TL_stories.Boost boost = (TL_stories.Boost) obj;
                f3 f3Var = ((f3[]) obj2)[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                o2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(qn.Q9(boost.giveaway_msg_id, j10));
                    break;
                }
                break;
            case 5:
                ih.r rVar = (ih.r) obj2;
                ih.q qVar = (ih.q) obj;
                v6 v6Var = rVar.s;
                ArrayList arrayList = rVar.x;
                dy dyVar = rVar.a0;
                if (dyVar != null && dyVar.getParentActivity() != null) {
                    int i16 = qVar.b;
                    ArrayList arrayList2 = new ArrayList();
                    int i17 = 0;
                    while (true) {
                        if (i17 < arrayList.size()) {
                            long j11 = ((ih.o) arrayList.get(i17)).c;
                            if (j11 == UserConfig.getInstance(rVar.f).clientUserId || !v6Var.J(j11)) {
                                i17++;
                            } else {
                                z10 = false;
                            }
                        } else {
                            z10 = true;
                        }
                    }
                    if (qVar.B && (!z10 || arrayList.size() == 1)) {
                        arrayList2.add(Long.valueOf(qVar.A));
                        i9 = i16;
                        z11 = true;
                    } else if (!qVar.B && v6Var.J(qVar.A)) {
                        int i18 = i16;
                        for (int i19 = 0; i19 < arrayList.size(); i19++) {
                            long j12 = ((ih.o) arrayList.get(i19)).c;
                            if (!qVar.B && v6Var.J(j12)) {
                                arrayList2.add(Long.valueOf(j12));
                            }
                            if (j12 == qVar.A) {
                                i18 = arrayList2.size() - 1;
                            }
                        }
                        i9 = i18;
                        z11 = false;
                        z12 = true;
                        m9 orCreateStoryViewer = dyVar.getOrCreateStoryViewer();
                        orCreateStoryViewer.s(new i2(rVar, j10, 3));
                        Context context = rVar.getContext();
                        e7 a2 = e7.a(rVar.h);
                        a2.e = new dh.s(i13, rVar, z11);
                        a2.f = rVar.b != 1;
                        a2.h = z12;
                        a2.n = z11;
                        a2.r = true;
                        orCreateStoryViewer.G(context, null, arrayList2, i9, null, null, a2, false);
                        break;
                    } else {
                        int i20 = i16;
                        for (int i21 = 0; i21 < arrayList.size(); i21++) {
                            if (v6Var.I(((ih.o) arrayList.get(i21)).c)) {
                                arrayList2.add(Long.valueOf(((ih.o) arrayList.get(i21)).c));
                            } else if (i21 <= i20) {
                                i20--;
                            }
                        }
                        i9 = i20;
                        z11 = false;
                    }
                    z12 = false;
                    m9 orCreateStoryViewer2 = dyVar.getOrCreateStoryViewer();
                    orCreateStoryViewer2.s(new i2(rVar, j10, 3));
                    Context context2 = rVar.getContext();
                    e7 a22 = e7.a(rVar.h);
                    a22.e = new dh.s(i13, rVar, z11);
                    a22.f = rVar.b != 1;
                    a22.h = z12;
                    a22.n = z11;
                    a22.r = true;
                    orCreateStoryViewer2.G(context2, null, arrayList2, i9, null, null, a22, false);
                }
                break;
            case 6:
                v6 v6Var2 = (v6) obj2;
                TLObject tLObject = (TLObject) obj;
                int i22 = v6Var2.a;
                v6Var2.C.remove(Long.valueOf(j10));
                if (tLObject != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                    MessagesController.getInstance(i22).putUsers(tL_stories_peerStories.users, false);
                    TLRPC.User user = MessagesController.getInstance(i22).getUser(Long.valueOf(j10));
                    TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                    v6Var2.i.k(peerStories, DialogObject.getPeerDialogId(peerStories.peer));
                    if (user != null && (v6Var2.M(user) || user.self)) {
                        v6Var2.g(peerStories);
                        i7 i7Var = v6Var2.k;
                        i7Var.b.getStorageQueue().postRunnable(new f7(i7Var, peerStories, 0));
                    }
                    StringBuilder s10 = aa.d.s(j10, "StoriesController processAllStoriesResponse dialogId=", " overwrite stories ");
                    s10.append(tL_stories_peerStories.stories.stories.size());
                    FileLog.d(s10.toString());
                    NotificationCenter.getInstance(i22).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    break;
                }
                break;
            case 7:
                u6 u6Var = (u6) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                v6 v6Var3 = u6Var.I;
                b1 b1Var = v6Var3.w;
                u6Var.d = true;
                a8 a8Var = u6Var.c;
                if (a8Var.w) {
                    b1Var.c(a8Var);
                }
                a8Var.w = false;
                a8Var.x = null;
                if (!a8Var.b0) {
                    ArrayList arrayList3 = b1Var.b;
                    if (!a8Var.u && storyItem.media != null) {
                        ArrayList arrayList4 = new ArrayList();
                        int size = arrayList3.size();
                        int i23 = 0;
                        while (i23 < size) {
                            Object obj3 = arrayList3.get(i23);
                            i23++;
                            a8 a8Var2 = (a8) obj3;
                            if (a8Var2.g && a8Var2.f == storyItem.id) {
                                arrayList4.add(a8Var2);
                            }
                        }
                        b1Var.b(arrayList4);
                        b1Var.e(a8Var);
                        a8Var.b = Utilities.random.nextLong();
                        a1 a1Var = new a1(a8Var);
                        a8Var.g = true;
                        a1Var.G = true;
                        a8Var.e = j10;
                        a1Var.I = j10;
                        int i24 = storyItem.id;
                        a8Var.f = i24;
                        a1Var.H = i24;
                        long j13 = storyItem.expire_date * 1000;
                        a8Var.J = j13;
                        a1Var.L = j13;
                        TLRPC.MessageMedia messageMedia = storyItem.media;
                        TLRPC.Document document = messageMedia.document;
                        if (document != null) {
                            long j14 = document.id;
                            a8Var.H = j14;
                            a1Var.J = j14;
                        } else {
                            TLRPC.Photo photo = messageMedia.photo;
                            if (photo != null) {
                                long j15 = photo.id;
                                a8Var.I = j15;
                                a1Var.K = j15;
                            }
                        }
                        arrayList3.remove(a8Var);
                        z13 = false;
                        arrayList3.add(0, a8Var);
                        b1Var.a(a1Var);
                        if (u6Var.b) {
                            v6Var3.R = z13;
                            v6Var3.S = null;
                            break;
                        }
                    }
                }
                z13 = false;
                if (u6Var.b) {
                }
                break;
            case 8:
                ArrayList arrayList5 = (ArrayList) obj;
                MessagesStorage messagesStorage = ((i7) obj2).b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    String join = TextUtils.join(", ", arrayList5);
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM stories WHERE dialog_id = " + j10 + " AND story_id IN (" + join + ")").stepThis().dispose();
                    break;
                } catch (Throwable th) {
                    messagesStorage.checkSQLException(th);
                    return;
                }
            case 9:
                ((i7) obj2).l(j10, (TL_stories.StoryItem) obj);
                break;
            case 10:
                o7 o7Var = (o7) obj2;
                o7Var.getClass();
                ((View) obj).invalidate();
                MessagesController.getInstance(o7Var.a).getStoriesController().e0(j10, false);
                break;
            case 11:
                n9 n9Var = (n9) obj2;
                n9Var.getClass();
                n9Var.d(j10, ((TLRPC.ChatFull) obj).participants);
                break;
            case 12:
                ((long[]) obj2)[0] = j10;
                ((g1) obj).run();
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
                qn qnVar = (qn) obj2;
                qnVar.getMessagesController().lambda$checkDeletingTask$84(this.b, qnVar.P5, ((MessageObject) obj).getId());
                break;
            case 18:
                qn qnVar2 = ((cn) obj2).a;
                i10 = ((o2) qnVar2).currentAccount;
                y4.t0(SendMessagesHelper.getInstance(i10).sendMessage((ArrayList) obj, this.b, false, false, true, 0, 0, null, -1, 0L, qnVar2.N8(), qnVar2.c5), qnVar2, null);
                break;
            case 19:
                jr jrVar = (jr) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                jrVar.getMessagesController().deleteParticipantFromChat(jrVar.J, user2);
                jrVar.u0(j10);
                if (jrVar.r != null && user2 != null && oc.a(jrVar)) {
                    oc.D(jrVar, user2, jrVar.r.title).j();
                    break;
                }
                break;
            case 20:
                Runnable runnable2 = (Runnable) obj2;
                o2 o2Var = (o2) obj;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (o2Var != null) {
                    o2Var.presentFragment(qn.R9(j10));
                    break;
                }
                break;
            case 21:
                int i25 = ChatActivityEnterView.i5;
                ((sf) obj).run();
                SharedPrefsHelper.setWebViewConfirmShown(((ChatActivityEnterView) obj2).M, j10, true);
                break;
            case 22:
                ki kiVar = (ki) obj2;
                y4.M(kiVar.getContext(), j10, new tg(kiVar, 14), (b6) obj);
                break;
            case 23:
                gm gmVar = (gm) obj2;
                em emVar2 = (em) obj;
                hm hmVar = gmVar.L;
                if (!hmVar.r.G1 && gmVar.y == j10 && (emVar = gmVar.B) == emVar2) {
                    hmVar.F = emVar;
                    hmVar.I = emVar.a.a;
                    hmVar.G = false;
                    gmVar.C = 0.0f;
                    gmVar.invalidate();
                    ValueAnimator valueAnimator = hmVar.H;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    hmVar.H = ofFloat;
                    ofFloat.addUpdateListener(new bm(gmVar, 0));
                    hmVar.H.setDuration(200L);
                    hmVar.H.start();
                    em emVar3 = hmVar.F;
                    RectF f10 = emVar3.f(emVar3.e());
                    RectF d = hmVar.F.d();
                    hmVar.C = (((hmVar.y - f10.left) / f10.width()) + 0.5f) / 2.0f;
                    hmVar.B = (hmVar.A - f10.top) / f10.height();
                    hmVar.D = d.width();
                    hmVar.E = d.height();
                    try {
                        hmVar.performHapticFeedback(0, 2);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 24:
                o70.Xc((o70) obj2, j10, (TLRPC.Chat) obj);
                break;
            case 25:
                ((eu0) obj2).r1.presentFragment(qn.Q9(((MessageObject) obj).getId(), j10));
                break;
            case 26:
                ew0.x1((ew0) obj2, (TLRPC.TL_messages_emojiGroups) obj, j10);
                break;
            case 27:
                dy dyVar2 = (dy) obj2;
                y yVar = (y) obj;
                if (dyVar2.C.bot_admin_rights != null) {
                    dyVar2.getMessagesController().setUserAdminRole(-j10, dyVar2.getMessagesController().getUser(Long.valueOf(dyVar2.D)), dyVar2.C.bot_admin_rights, null, false, dyVar2, true, true, null, yVar, new wt(yVar, i12));
                    break;
                } else {
                    yVar.run();
                    break;
                }
            case 28:
                o50 o50Var = (o50) obj2;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                o50Var.getClass();
                TLRPC.Update update = updates.update;
                if (update instanceof TL_update.TL_updateNewMessage) {
                    TLRPC.Message message = ((TL_update.TL_updateNewMessage) update).message;
                    if (message != null && (message.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                        i14 = message.id;
                    }
                } else if (update instanceof TL_update.TL_updateMessageID) {
                    i14 = ((TL_update.TL_updateMessageID) update).id;
                } else if (updates.updates != null) {
                    int i26 = 0;
                    while (true) {
                        if (i26 < updates.updates.size()) {
                            TLRPC.Update update2 = updates.updates.get(i26);
                            if (update2 instanceof TL_update.TL_updateNewMessage) {
                                TLRPC.Message message2 = ((TL_update.TL_updateNewMessage) update2).message;
                                if (message2 != null && (message2.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                                    i14 = message2.id;
                                }
                                i26++;
                            } else if (update2 instanceof TL_update.TL_updateMessageID) {
                                i14 = ((TL_update.TL_updateMessageID) update2).id;
                            } else {
                                i26++;
                            }
                        }
                    }
                }
                ChatObject.Call call = o50Var.W0;
                if (call != null && i14 != 0) {
                    call.invitedUsersMessageIds.put(Long.valueOf(j10), ChatObject.Call.InvitedUser.make(i14));
                    o50Var.O0(true);
                    break;
                }
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Long l10 = (Long) obj;
                o2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    qn R9 = qn.R9(l10.longValue());
                    U3.presentFragment(R9);
                    TLRPC.Chat chat = MessagesController.getInstance(launchActivity.K).getChat(Long.valueOf(-l10.longValue()));
                    if (chat != null) {
                        AndroidUtilities.runOnUIThread(new f9(R9, this.b, chat, 1), 250L);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ w(Object obj, Object obj2, long j10, int i9) {
        this.a = i9;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }
}
