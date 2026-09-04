package a3;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import bi.d9;
import bi.e9;
import bi.h9;
import bi.o9;
import bi.pb;
import bi.t8;
import bi.u8;
import di.a1;
import di.b1;
import di.ba;
import di.o8;
import fi.l3;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.cg;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.eh;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.km;
import org.telegram.ui.Components.nm;
import org.telegram.ui.Components.pm;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.aa0;
import org.telegram.ui.co;
import org.telegram.ui.ga0;
import org.telegram.ui.id0;
import org.telegram.ui.iu;
import org.telegram.ui.j60;
import org.telegram.ui.lw0;
import org.telegram.ui.on;
import org.telegram.ui.sc0;
import org.telegram.ui.uy;
import org.telegram.ui.vr;
import org.telegram.ui.yq;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g0(Object obj, long j3, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j3;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0681  */
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
        nm nmVar;
        int i12 = 2;
        int i13 = 0;
        switch (this.a) {
            case 0:
                pf.b bVar = (pf.b) this.c;
                Object obj = this.d;
                long j3 = this.b;
                i2.c0 c0Var = (i2.c0) bVar.c;
                String str = e2.d0.a;
                i2.f0 f0Var = c0Var.a;
                j2.f fVar = f0Var.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 26, new ah.i0(p5, obj, j3));
                if (f0Var.R == obj) {
                    f0Var.m.e(26, new i0.b(6));
                    return;
                }
                return;
            case 1:
                bi.v vVar = (bi.v) this.c;
                bi.u uVar = (bi.u) this.d;
                long j10 = this.b;
                u8 u8Var = vVar.s;
                ArrayList arrayList = vVar.x;
                uy uyVar = vVar.e0;
                if (uyVar == null || uyVar.getParentActivity() == null) {
                    return;
                }
                int i14 = uVar.b;
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    if (i15 < arrayList.size()) {
                        long j11 = ((bi.r) arrayList.get(i15)).c;
                        if (j11 == UserConfig.getInstance(vVar.f).clientUserId || !u8Var.J(j11)) {
                            i15++;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = true;
                    }
                }
                if (uVar.F && (!z10 || arrayList.size() == 1)) {
                    arrayList2.add(Long.valueOf(uVar.E));
                    i10 = i14;
                    z11 = true;
                } else {
                    if (!uVar.F && u8Var.J(uVar.E)) {
                        int i16 = i14;
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            long j12 = ((bi.r) arrayList.get(i17)).c;
                            if (!uVar.F && u8Var.J(j12)) {
                                arrayList2.add(Long.valueOf(j12));
                            }
                            if (j12 == uVar.E) {
                                i16 = arrayList2.size() - 1;
                            }
                        }
                        i10 = i16;
                        z11 = false;
                        z12 = true;
                        pb orCreateStoryViewer = uyVar.getOrCreateStoryViewer();
                        orCreateStoryViewer.s(new bi.g(vVar, j10, 0 == true ? 1 : 0));
                        Context context = vVar.getContext();
                        d9 a2 = d9.a(vVar.h);
                        a2.e = new bi.h(0 == true ? 1 : 0, vVar, z11);
                        a2.f = vVar.b == 1;
                        a2.h = z12;
                        a2.n = z11;
                        a2.r = true;
                        orCreateStoryViewer.G(context, null, arrayList2, i10, null, null, a2, false);
                        return;
                    }
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        if (u8Var.I(((bi.r) arrayList.get(i18)).c)) {
                            arrayList2.add(Long.valueOf(((bi.r) arrayList.get(i18)).c));
                        } else if (i18 <= i14) {
                            i14--;
                        }
                    }
                    i10 = i14;
                    z11 = false;
                }
                z12 = false;
                pb orCreateStoryViewer2 = uyVar.getOrCreateStoryViewer();
                orCreateStoryViewer2.s(new bi.g(vVar, j10, 0 == true ? 1 : 0));
                Context context2 = vVar.getContext();
                d9 a22 = d9.a(vVar.h);
                a22.e = new bi.h(0 == true ? 1 : 0, vVar, z11);
                a22.f = vVar.b == 1;
                a22.h = z12;
                a22.n = z11;
                a22.r = true;
                orCreateStoryViewer2.G(context2, null, arrayList2, i10, null, null, a22, false);
                return;
            case 2:
                u8 u8Var2 = (u8) this.c;
                long j13 = this.b;
                TLObject tLObject = (TLObject) this.d;
                int i19 = u8Var2.a;
                u8Var2.C.remove(Long.valueOf(j13));
                if (tLObject == null) {
                    return;
                }
                TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                MessagesController.getInstance(i19).putUsers(tL_stories_peerStories.users, false);
                TLRPC.User user = MessagesController.getInstance(i19).getUser(Long.valueOf(j13));
                TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                u8Var2.i.k(peerStories, DialogObject.getPeerDialogId(peerStories.peer));
                if (user != null && (u8Var2.M(user) || user.self)) {
                    u8Var2.g(peerStories);
                    h9 h9Var = u8Var2.k;
                    h9Var.b.getStorageQueue().postRunnable(new e9(h9Var, peerStories, 0));
                }
                StringBuilder t10 = a4.a.t(j13, "StoriesController processAllStoriesResponse dialogId=", " overwrite stories ");
                t10.append(tL_stories_peerStories.stories.stories.size());
                FileLog.d(t10.toString());
                NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                return;
            case 3:
                t8 t8Var = (t8) this.c;
                long j14 = this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                u8 u8Var3 = t8Var.M;
                b1 b1Var = u8Var3.w;
                t8Var.d = true;
                o8 o8Var = t8Var.c;
                if (o8Var.w) {
                    b1Var.b(o8Var);
                }
                o8Var.w = false;
                o8Var.x = null;
                if (!o8Var.b0) {
                    ArrayList arrayList3 = b1Var.b;
                    if (!o8Var.u && storyItem.media != null) {
                        ArrayList arrayList4 = new ArrayList();
                        int size = arrayList3.size();
                        int i20 = 0;
                        while (i20 < size) {
                            Object obj2 = arrayList3.get(i20);
                            i20++;
                            o8 o8Var2 = (o8) obj2;
                            if (o8Var2.g && o8Var2.f == storyItem.id) {
                                arrayList4.add(o8Var2);
                            }
                        }
                        b1Var.c(arrayList4);
                        b1Var.e(o8Var);
                        o8Var.b = Utilities.random.nextLong();
                        a1 a1Var = new a1(o8Var);
                        o8Var.g = true;
                        a1Var.G = true;
                        o8Var.e = j14;
                        a1Var.I = j14;
                        int i21 = storyItem.id;
                        o8Var.f = i21;
                        a1Var.H = i21;
                        long j15 = storyItem.expire_date * 1000;
                        o8Var.J = j15;
                        a1Var.L = j15;
                        TLRPC.MessageMedia messageMedia = storyItem.media;
                        TLRPC.Document document = messageMedia.document;
                        if (document != null) {
                            long j16 = document.id;
                            o8Var.H = j16;
                            a1Var.J = j16;
                        } else {
                            TLRPC.Photo photo = messageMedia.photo;
                            if (photo != null) {
                                long j17 = photo.id;
                                o8Var.I = j17;
                                a1Var.K = j17;
                            }
                        }
                        arrayList3.remove(o8Var);
                        z13 = false;
                        arrayList3.add(0, o8Var);
                        b1Var.a(a1Var);
                        if (t8Var.b) {
                            u8Var3.R = z13;
                            u8Var3.S = null;
                            return;
                        }
                        return;
                    }
                }
                z13 = false;
                if (t8Var.b) {
                }
                break;
            case 4:
                h9 h9Var2 = (h9) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                long j18 = this.b;
                MessagesStorage messagesStorage = h9Var2.b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    String join = TextUtils.join(", ", arrayList5);
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM stories WHERE dialog_id = " + j18 + " AND story_id IN (" + join + ")").stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    messagesStorage.checkSQLException(th2);
                    return;
                }
            case 5:
                ((h9) this.c).l(this.b, (TL_stories.StoryItem) this.d);
                return;
            case 6:
                o9 o9Var = (o9) this.c;
                View view = (View) this.d;
                long j19 = this.b;
                o9Var.getClass();
                view.invalidate();
                MessagesController.getInstance(o9Var.a).getStoriesController().e0(j19, false);
                return;
            case 7:
                ba baVar = (ba) this.c;
                long j20 = this.b;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.d;
                baVar.getClass();
                baVar.d(j20, chatFull.participants);
                return;
            case 8:
                fg.f fVar2 = (fg.f) this.c;
                fg.e eVar = (fg.e) this.d;
                long j21 = this.b;
                if (((fg.e) fVar2.b) != eVar) {
                    return;
                }
                fg.c cVar = (fg.c) fVar2.d;
                if (cVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(cVar);
                    fVar2.d = null;
                }
                synchronized (fg.k.t) {
                    try {
                        fg.k kVar = fg.k.v;
                        if (kVar != null) {
                            kVar.m();
                            fg.k.v = null;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                fVar2.b = null;
                eVar.c.run(j21);
                fVar2.L();
                return;
            case 9:
                long[] jArr = (long[]) this.c;
                long j22 = this.b;
                l3 l3Var = (l3) this.d;
                jArr[0] = j22;
                l3Var.run();
                return;
            case 10:
                ((VideoFramesRewinder) this.c).lambda$new$1((ArrayList) this.d, this.b);
                return;
            case 11:
                ((NativeInstance) this.c).lambda$onParticipantDescriptionsRequired$2(this.b, (int[]) this.d);
                return;
            case 12:
                ((VideoCapturerDevice) this.c).lambda$init$5(this.b, (String) this.d);
                return;
            case 13:
                ((VideoCapturerDevice) this.c).lambda$init$2(this.b, (Point) this.d);
                return;
            case 14:
                co coVar = (co) this.c;
                coVar.getMessagesController().lambda$checkDeletingTask$84(this.b, coVar.T5, ((MessageObject) this.d).getId());
                return;
            case 15:
                on onVar = (on) this.c;
                ArrayList<MessageObject> arrayList6 = (ArrayList) this.d;
                long j23 = this.b;
                co coVar2 = onVar.a;
                i11 = ((n2) coVar2).currentAccount;
                e5.t0(SendMessagesHelper.getInstance(i11).sendMessage(arrayList6, j23, false, false, true, 0, 0, null, -1, 0L, coVar2.N8(), coVar2.g5), coVar2, null);
                return;
            case 16:
                vr vrVar = (vr) this.c;
                TLRPC.User user2 = (TLRPC.User) this.d;
                long j24 = this.b;
                vrVar.getMessagesController().deleteParticipantFromChat(vrVar.N, user2);
                vrVar.v0(j24);
                if (vrVar.r == null || user2 == null || !yc.a(vrVar)) {
                    return;
                }
                yc.D(vrVar, user2, vrVar.r.title).j();
                return;
            case 17:
                Runnable runnable = (Runnable) this.c;
                n2 n2Var = (n2) this.d;
                long j25 = this.b;
                if (runnable != null) {
                    runnable.run();
                }
                if (n2Var != null) {
                    n2Var.presentFragment(co.R9(j25));
                    return;
                }
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                cg cgVar = (cg) this.d;
                long j26 = this.b;
                int i22 = ChatActivityEnterView.m5;
                cgVar.run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView.Q, j26, true);
                return;
            case 19:
                vi viVar = (vi) this.c;
                e5.M(viVar.getContext(), this.b, new eh(viVar, 14), (f6) this.d);
                return;
            case 20:
                pm pmVar = (pm) this.c;
                long j27 = this.b;
                nm nmVar2 = (nm) this.d;
                qm qmVar = pmVar.P;
                if (!qmVar.r.K1 && pmVar.y == j27 && (nmVar = pmVar.F) == nmVar2) {
                    qmVar.J = nmVar;
                    qmVar.M = nmVar.a.a;
                    qmVar.K = false;
                    pmVar.G = 0.0f;
                    pmVar.invalidate();
                    ValueAnimator valueAnimator = qmVar.L;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    qmVar.L = ofFloat;
                    ofFloat.addUpdateListener(new km(pmVar, 0));
                    qmVar.L.setDuration(200L);
                    qmVar.L.start();
                    nm nmVar3 = qmVar.J;
                    RectF f7 = nmVar3.f(nmVar3.e());
                    RectF d = qmVar.J.d();
                    qmVar.G = (((qmVar.y - f7.left) / f7.width()) + 0.5f) / 2.0f;
                    qmVar.F = (qmVar.E - f7.top) / f7.height();
                    qmVar.H = d.width();
                    qmVar.I = d.height();
                    try {
                        qmVar.performHapticFeedback(0, 2);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 21:
                f80.Xc((f80) this.c, this.b, (TLRPC.Chat) this.d);
                return;
            case 22:
                ((xu0) this.c).v1.presentFragment(co.Q9(((MessageObject) this.d).getId(), this.b));
                return;
            case 23:
                vw0.w1((vw0) this.c, (TLRPC.TL_messages_emojiGroups) this.d, this.b);
                return;
            case 24:
                uy uyVar2 = (uy) this.c;
                long j28 = this.b;
                f0 f0Var2 = (f0) this.d;
                if (uyVar2.G.bot_admin_rights != null) {
                    uyVar2.getMessagesController().setUserAdminRole(-j28, uyVar2.getMessagesController().getUser(Long.valueOf(uyVar2.H)), uyVar2.G.bot_admin_rights, null, false, uyVar2, true, true, null, f0Var2, new iu(f0Var2, i12));
                    return;
                } else {
                    f0Var2.run();
                    return;
                }
            case 25:
                j60 j60Var = (j60) this.c;
                TLRPC.Updates updates = (TLRPC.Updates) this.d;
                long j29 = this.b;
                j60Var.getClass();
                TLRPC.Update update = updates.update;
                if (update instanceof TL_update.TL_updateNewMessage) {
                    TLRPC.Message message = ((TL_update.TL_updateNewMessage) update).message;
                    if (message != null && (message.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                        i13 = message.id;
                    }
                } else if (update instanceof TL_update.TL_updateMessageID) {
                    i13 = ((TL_update.TL_updateMessageID) update).id;
                } else if (updates.updates != null) {
                    int i23 = 0;
                    while (true) {
                        if (i23 < updates.updates.size()) {
                            TLRPC.Update update2 = updates.updates.get(i23);
                            if (update2 instanceof TL_update.TL_updateNewMessage) {
                                TLRPC.Message message2 = ((TL_update.TL_updateNewMessage) update2).message;
                                if (message2 != null && (message2.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                                    i13 = message2.id;
                                }
                                i23++;
                            } else if (update2 instanceof TL_update.TL_updateMessageID) {
                                i13 = ((TL_update.TL_updateMessageID) update2).id;
                            } else {
                                i23++;
                            }
                        }
                    }
                }
                ChatObject.Call call = j60Var.a1;
                if (call == null || i13 == 0) {
                    return;
                }
                call.invitedUsersMessageIds.put(Long.valueOf(j29), ChatObject.Call.InvitedUser.make(i13));
                j60Var.O0(true);
                return;
            case 26:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                Long l4 = (Long) this.d;
                long j30 = this.b;
                n2 U = LaunchActivity.U();
                if (U == null) {
                    return;
                }
                co R9 = co.R9(l4.longValue());
                U.presentFragment(R9);
                TLRPC.Chat chat = MessagesController.getInstance(launchActivity.O).getChat(Long.valueOf(-l4.longValue()));
                if (chat != null) {
                    AndroidUtilities.runOnUIThread(new aa0(R9, j30, chat, 0), 250L);
                    return;
                }
                return;
            case 27:
                LaunchActivity launchActivity2 = (LaunchActivity) this.c;
                long j31 = this.b;
                ga0 ga0Var = (ga0) this.d;
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new yq(launchActivity2, MessagesStorage.getInstance(launchActivity2.O).getUser(j31), ga0Var, 13));
                return;
            case 28:
                id0 id0Var = (id0) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                long j32 = this.b;
                if (id0Var.I == null) {
                    return;
                }
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                int i24 = 0;
                while (i24 < messages_messages.messages.size()) {
                    if (!(messages_messages.messages.get(i24).media instanceof TLRPC.TL_messageMediaGeoLive)) {
                        messages_messages.messages.remove(i24);
                        i24--;
                    }
                    i24++;
                }
                id0Var.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                id0Var.getMessagesController().putUsers(messages_messages.users, false);
                id0Var.getMessagesController().putChats(messages_messages.chats, false);
                id0Var.getLocationController().locationsCache.k(messages_messages.messages, j32);
                id0Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsCacheChanged, Long.valueOf(j32));
                id0Var.i0(messages_messages.messages);
                id0Var.getLocationController().markLiveLoactionsAsRead(id0Var.e0);
                if (id0Var.J0 == null) {
                    sc0 sc0Var = new sc0(id0Var, 4);
                    id0Var.J0 = sc0Var;
                    AndroidUtilities.runOnUIThread(sc0Var, 5000L);
                    return;
                }
                return;
            default:
                lw0 lw0Var = (lw0) this.c;
                long j33 = this.b;
                n2 n2Var2 = (n2) this.d;
                lw0Var.getClass();
                Bundle bundle = new Bundle();
                if (j33 > 0) {
                    bundle.putLong("user_id", j33);
                } else {
                    bundle.putLong("chat_id", -j33);
                }
                n2Var2.presentFragment(new ProfileActivity(bundle, null));
                lw0Var.c(false);
                return;
        }
    }

    public /* synthetic */ g0(Object obj, Object obj2, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
    }
}
