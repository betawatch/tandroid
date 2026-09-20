package a3;

import ai.ha;
import ai.jc;
import ai.k9;
import ai.l9;
import ai.u9;
import ai.v9;
import ai.y9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import ci.a1;
import ci.b1;
import ci.ba;
import ci.o8;
import ei.l3;
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
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.hx0;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.km;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.nm;
import org.telegram.ui.Components.pm;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.aa0;
import org.telegram.ui.fu;
import org.telegram.ui.ga0;
import org.telegram.ui.i60;
import org.telegram.ui.kd0;
import org.telegram.ui.ln;
import org.telegram.ui.mw0;
import org.telegram.ui.sr;
import org.telegram.ui.uc0;
import org.telegram.ui.uy;
import org.telegram.ui.vq;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h0(Object obj, long j3, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j3;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0682  */
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
        int i12 = 0;
        switch (this.a) {
            case 0:
                of.b bVar = (of.b) this.c;
                Object obj = this.d;
                long j3 = this.b;
                l0 l0Var = (l0) bVar.c;
                String str = e2.d0.a;
                i2.e0 e0Var = ((i2.b0) l0Var).a;
                j2.f fVar = e0Var.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 26, new ah.b(p5, obj, j3));
                if (e0Var.R == obj) {
                    e0Var.m.e(26, new ga.a(12));
                    return;
                }
                return;
            case 1:
                ai.b0 b0Var = (ai.b0) this.c;
                ai.a0 a0Var = (ai.a0) this.d;
                long j10 = this.b;
                l9 l9Var = b0Var.s;
                ArrayList arrayList = b0Var.x;
                uy uyVar = b0Var.e0;
                if (uyVar == null || uyVar.getParentActivity() == null) {
                    return;
                }
                int i13 = a0Var.b;
                ArrayList arrayList2 = new ArrayList();
                int i14 = 0;
                while (true) {
                    if (i14 < arrayList.size()) {
                        long j11 = ((ai.w) arrayList.get(i14)).c;
                        if (j11 == UserConfig.getInstance(b0Var.f).clientUserId || !l9Var.J(j11)) {
                            i14++;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = true;
                    }
                }
                if (a0Var.F && (!z10 || arrayList.size() == 1)) {
                    arrayList2.add(Long.valueOf(a0Var.E));
                    i10 = i13;
                    z11 = true;
                } else {
                    if (!a0Var.F && l9Var.J(a0Var.E)) {
                        int i15 = i13;
                        for (int i16 = 0; i16 < arrayList.size(); i16++) {
                            long j12 = ((ai.w) arrayList.get(i16)).c;
                            if (!a0Var.F && l9Var.J(j12)) {
                                arrayList2.add(Long.valueOf(j12));
                            }
                            if (j12 == a0Var.E) {
                                i15 = arrayList2.size() - 1;
                            }
                        }
                        i10 = i15;
                        z11 = false;
                        z12 = true;
                        jc orCreateStoryViewer = uyVar.getOrCreateStoryViewer();
                        orCreateStoryViewer.s(new ai.j(b0Var, j10, 0 == true ? 1 : 0));
                        Context context = b0Var.getContext();
                        u9 a2 = u9.a(b0Var.h);
                        a2.e = new ai.k(0 == true ? 1 : 0, b0Var, z11);
                        a2.f = b0Var.b == 1;
                        a2.h = z12;
                        a2.n = z11;
                        a2.r = true;
                        orCreateStoryViewer.G(context, null, arrayList2, i10, null, null, a2, false);
                        return;
                    }
                    for (int i17 = 0; i17 < arrayList.size(); i17++) {
                        if (l9Var.I(((ai.w) arrayList.get(i17)).c)) {
                            arrayList2.add(Long.valueOf(((ai.w) arrayList.get(i17)).c));
                        } else if (i17 <= i13) {
                            i13--;
                        }
                    }
                    i10 = i13;
                    z11 = false;
                }
                z12 = false;
                jc orCreateStoryViewer2 = uyVar.getOrCreateStoryViewer();
                orCreateStoryViewer2.s(new ai.j(b0Var, j10, 0 == true ? 1 : 0));
                Context context2 = b0Var.getContext();
                u9 a22 = u9.a(b0Var.h);
                a22.e = new ai.k(0 == true ? 1 : 0, b0Var, z11);
                a22.f = b0Var.b == 1;
                a22.h = z12;
                a22.n = z11;
                a22.r = true;
                orCreateStoryViewer2.G(context2, null, arrayList2, i10, null, null, a22, false);
                return;
            case 2:
                l9 l9Var2 = (l9) this.c;
                long j13 = this.b;
                TLObject tLObject = (TLObject) this.d;
                int i18 = l9Var2.a;
                l9Var2.C.remove(Long.valueOf(j13));
                if (tLObject == null) {
                    return;
                }
                TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                MessagesController.getInstance(i18).putUsers(tL_stories_peerStories.users, false);
                TLRPC.User user = MessagesController.getInstance(i18).getUser(Long.valueOf(j13));
                TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                l9Var2.i.k(peerStories, DialogObject.getPeerDialogId(peerStories.peer));
                if (user != null && (l9Var2.M(user) || user.self)) {
                    l9Var2.g(peerStories);
                    y9 y9Var = l9Var2.k;
                    y9Var.b.getStorageQueue().postRunnable(new v9(y9Var, peerStories, 0));
                }
                StringBuilder t10 = a4.a.t(j13, "StoriesController processAllStoriesResponse dialogId=", " overwrite stories ");
                t10.append(tL_stories_peerStories.stories.stories.size());
                FileLog.d(t10.toString());
                NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                return;
            case 3:
                k9 k9Var = (k9) this.c;
                long j14 = this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                l9 l9Var3 = k9Var.M;
                b1 b1Var = l9Var3.w;
                k9Var.d = true;
                o8 o8Var = k9Var.c;
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
                        int i19 = 0;
                        while (i19 < size) {
                            Object obj2 = arrayList3.get(i19);
                            i19++;
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
                        int i20 = storyItem.id;
                        o8Var.f = i20;
                        a1Var.H = i20;
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
                        if (k9Var.b) {
                            l9Var3.R = z13;
                            l9Var3.S = null;
                            return;
                        }
                        return;
                    }
                }
                z13 = false;
                if (k9Var.b) {
                }
                break;
            case 4:
                y9 y9Var2 = (y9) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                long j18 = this.b;
                MessagesStorage messagesStorage = y9Var2.b;
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
                ((y9) this.c).l(this.b, (TL_stories.StoryItem) this.d);
                return;
            case 6:
                ha haVar = (ha) this.c;
                View view = (View) this.d;
                long j19 = this.b;
                haVar.getClass();
                view.invalidate();
                MessagesController.getInstance(haVar.a).getStoriesController().e0(j19, false);
                return;
            case 7:
                ba baVar = (ba) this.c;
                long j20 = this.b;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.d;
                baVar.getClass();
                baVar.d(j20, chatFull.participants);
                return;
            case 8:
                long[] jArr = (long[]) this.c;
                long j21 = this.b;
                l3 l3Var = (l3) this.d;
                jArr[0] = j21;
                l3Var.run();
                return;
            case 9:
                oi.f fVar2 = (oi.f) this.c;
                oi.e eVar = (oi.e) this.d;
                long j22 = this.b;
                if (((oi.e) fVar2.b) != eVar) {
                    return;
                }
                oi.c cVar = (oi.c) fVar2.d;
                if (cVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(cVar);
                    fVar2.d = null;
                }
                synchronized (oi.k.v) {
                    try {
                        oi.k kVar = oi.k.x;
                        if (kVar != null) {
                            kVar.n();
                            oi.k.x = null;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                fVar2.b = null;
                eVar.c.run(j22);
                fVar2.K();
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
                zn znVar = (zn) this.c;
                znVar.getMessagesController().lambda$checkDeletingTask$84(this.b, znVar.T5, ((MessageObject) this.d).getId());
                return;
            case 15:
                ln lnVar = (ln) this.c;
                ArrayList<MessageObject> arrayList6 = (ArrayList) this.d;
                long j23 = this.b;
                zn znVar2 = lnVar.a;
                i11 = ((n2) znVar2).currentAccount;
                d5.t0(SendMessagesHelper.getInstance(i11).sendMessage(arrayList6, j23, false, false, true, 0, 0, null, -1, 0L, znVar2.N8(), znVar2.g5), znVar2, null);
                return;
            case 16:
                sr srVar = (sr) this.c;
                TLRPC.User user2 = (TLRPC.User) this.d;
                long j24 = this.b;
                srVar.getMessagesController().deleteParticipantFromChat(srVar.N, user2);
                srVar.v0(j24);
                if (srVar.r == null || user2 == null || !xc.a(srVar)) {
                    return;
                }
                xc.D(srVar, user2, srVar.r.title).j();
                return;
            case 17:
                Runnable runnable = (Runnable) this.c;
                n2 n2Var = (n2) this.d;
                long j25 = this.b;
                if (runnable != null) {
                    runnable.run();
                }
                if (n2Var != null) {
                    n2Var.presentFragment(zn.R9(j25));
                    return;
                }
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                bg bgVar = (bg) this.d;
                long j26 = this.b;
                int i21 = ChatActivityEnterView.m5;
                bgVar.run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView.Q, j26, true);
                return;
            case 19:
                vi viVar = (vi) this.c;
                d5.M(viVar.getContext(), this.b, new dh(viVar, 14), (f6) this.d);
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
                n80.Xc((n80) this.c, this.b, (TLRPC.Chat) this.d);
                return;
            case 22:
                ((jv0) this.c).v1.presentFragment(zn.Q9(((MessageObject) this.d).getId(), this.b));
                return;
            case 23:
                hx0.y1((hx0) this.c, (TLRPC.TL_messages_emojiGroups) this.d, this.b);
                return;
            case 24:
                uy uyVar2 = (uy) this.c;
                long j28 = this.b;
                g0 g0Var = (g0) this.d;
                if (uyVar2.G.bot_admin_rights != null) {
                    uyVar2.getMessagesController().setUserAdminRole(-j28, uyVar2.getMessagesController().getUser(Long.valueOf(uyVar2.H)), uyVar2.G.bot_admin_rights, null, false, uyVar2, true, true, null, g0Var, new fu(g0Var, 3));
                    return;
                } else {
                    g0Var.run();
                    return;
                }
            case 25:
                i60 i60Var = (i60) this.c;
                TLRPC.Updates updates = (TLRPC.Updates) this.d;
                long j29 = this.b;
                i60Var.getClass();
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
                ChatObject.Call call = i60Var.a1;
                if (call == null || i12 == 0) {
                    return;
                }
                call.invitedUsersMessageIds.put(Long.valueOf(j29), ChatObject.Call.InvitedUser.make(i12));
                i60Var.O0(true);
                return;
            case 26:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                Long l4 = (Long) this.d;
                long j30 = this.b;
                n2 U = LaunchActivity.U();
                if (U == null) {
                    return;
                }
                zn R9 = zn.R9(l4.longValue());
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
                AndroidUtilities.runOnUIThread(new vq(launchActivity2, MessagesStorage.getInstance(launchActivity2.O).getUser(j31), ga0Var, 13));
                return;
            case 28:
                kd0 kd0Var = (kd0) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                long j32 = this.b;
                if (kd0Var.I == null) {
                    return;
                }
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                int i23 = 0;
                while (i23 < messages_messages.messages.size()) {
                    if (!(messages_messages.messages.get(i23).media instanceof TLRPC.TL_messageMediaGeoLive)) {
                        messages_messages.messages.remove(i23);
                        i23--;
                    }
                    i23++;
                }
                kd0Var.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                kd0Var.getMessagesController().putUsers(messages_messages.users, false);
                kd0Var.getMessagesController().putChats(messages_messages.chats, false);
                kd0Var.getLocationController().locationsCache.k(messages_messages.messages, j32);
                kd0Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsCacheChanged, Long.valueOf(j32));
                kd0Var.i0(messages_messages.messages);
                kd0Var.getLocationController().markLiveLoactionsAsRead(kd0Var.e0);
                if (kd0Var.J0 == null) {
                    uc0 uc0Var = new uc0(kd0Var, 4);
                    kd0Var.J0 = uc0Var;
                    AndroidUtilities.runOnUIThread(uc0Var, 5000L);
                    return;
                }
                return;
            default:
                mw0 mw0Var = (mw0) this.c;
                long j33 = this.b;
                n2 n2Var2 = (n2) this.d;
                mw0Var.getClass();
                Bundle bundle = new Bundle();
                if (j33 > 0) {
                    bundle.putLong("user_id", j33);
                } else {
                    bundle.putLong("chat_id", -j33);
                }
                n2Var2.presentFragment(new ProfileActivity(bundle, null));
                mw0Var.c(false);
                return;
        }
    }

    public /* synthetic */ h0(Object obj, Object obj2, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
    }
}
