package a3;

import ai.ia;
import ai.kc;
import ai.l9;
import ai.m9;
import ai.v9;
import ai.x9;
import ai.z9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import ci.a1;
import ci.l8;
import ci.y9;
import ci.z0;
import ei.l3;
import hg.o1;
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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.eg;
import org.telegram.ui.Components.en;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Components.yx0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ea0;
import org.telegram.ui.g60;
import org.telegram.ui.gu;
import org.telegram.ui.hd0;
import org.telegram.ui.ln;
import org.telegram.ui.mw0;
import org.telegram.ui.rc0;
import org.telegram.ui.tr;
import org.telegram.ui.ty;
import org.telegram.ui.vq;
import org.telegram.ui.z90;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
    /* JADX WARN: Removed duplicated region for block: B:204:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0680  */
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
        en enVar;
        int i12 = 2;
        int i13 = 0;
        switch (this.a) {
            case 0:
                pf.b bVar = (pf.b) this.c;
                Object obj = this.d;
                long j3 = this.b;
                l0 l0Var = (l0) bVar.c;
                String str = e2.d0.a;
                i2.f0 f0Var = ((i2.c0) l0Var).a;
                j2.f fVar = f0Var.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 26, new ah.b(p5, obj, j3));
                if (f0Var.R == obj) {
                    f0Var.m.e(26, new o1(10));
                    return;
                }
                return;
            case 1:
                ai.b0 b0Var = (ai.b0) this.c;
                ai.a0 a0Var = (ai.a0) this.d;
                long j10 = this.b;
                m9 m9Var = b0Var.s;
                ArrayList arrayList = b0Var.x;
                ty tyVar = b0Var.e0;
                if (tyVar == null || tyVar.getParentActivity() == null) {
                    return;
                }
                int i14 = a0Var.b;
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    if (i15 < arrayList.size()) {
                        long j11 = ((ai.w) arrayList.get(i15)).c;
                        if (j11 == UserConfig.getInstance(b0Var.f).clientUserId || !m9Var.J(j11)) {
                            i15++;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = true;
                    }
                }
                if (a0Var.F && (!z10 || arrayList.size() == 1)) {
                    arrayList2.add(Long.valueOf(a0Var.E));
                    z11 = true;
                    i10 = i14;
                } else {
                    if (!a0Var.F && m9Var.J(a0Var.E)) {
                        int i16 = i14;
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            long j12 = ((ai.w) arrayList.get(i17)).c;
                            if (!a0Var.F && m9Var.J(j12)) {
                                arrayList2.add(Long.valueOf(j12));
                            }
                            if (j12 == a0Var.E) {
                                i16 = arrayList2.size() - 1;
                            }
                        }
                        z12 = true;
                        i10 = i16;
                        z11 = false;
                        kc orCreateStoryViewer = tyVar.getOrCreateStoryViewer();
                        orCreateStoryViewer.s(new ai.j(b0Var, j10, 0 == true ? 1 : 0));
                        Context context = b0Var.getContext();
                        v9 a2 = v9.a(b0Var.h);
                        a2.e = new ai.k(0 == true ? 1 : 0, b0Var, z11);
                        a2.f = b0Var.b == 1;
                        a2.h = z12;
                        a2.n = z11;
                        a2.r = true;
                        orCreateStoryViewer.G(context, null, arrayList2, i10, null, null, a2, false);
                        return;
                    }
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        if (m9Var.I(((ai.w) arrayList.get(i18)).c)) {
                            arrayList2.add(Long.valueOf(((ai.w) arrayList.get(i18)).c));
                        } else if (i18 <= i14) {
                            i14--;
                        }
                    }
                    i10 = i14;
                    z11 = false;
                }
                z12 = false;
                kc orCreateStoryViewer2 = tyVar.getOrCreateStoryViewer();
                orCreateStoryViewer2.s(new ai.j(b0Var, j10, 0 == true ? 1 : 0));
                Context context2 = b0Var.getContext();
                v9 a22 = v9.a(b0Var.h);
                a22.e = new ai.k(0 == true ? 1 : 0, b0Var, z11);
                a22.f = b0Var.b == 1;
                a22.h = z12;
                a22.n = z11;
                a22.r = true;
                orCreateStoryViewer2.G(context2, null, arrayList2, i10, null, null, a22, false);
                return;
            case 2:
                m9 m9Var2 = (m9) this.c;
                long j13 = this.b;
                TLObject tLObject = (TLObject) this.d;
                int i19 = m9Var2.a;
                m9Var2.C.remove(Long.valueOf(j13));
                if (tLObject == null) {
                    return;
                }
                TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                MessagesController.getInstance(i19).putUsers(tL_stories_peerStories.users, false);
                TLRPC.User user = MessagesController.getInstance(i19).getUser(Long.valueOf(j13));
                TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                m9Var2.i.k(peerStories, DialogObject.getPeerDialogId(peerStories.peer));
                if (user != null && (m9Var2.M(user) || user.self)) {
                    m9Var2.g(peerStories);
                    z9 z9Var = m9Var2.k;
                    z9Var.b.getStorageQueue().postRunnable(new x9(z9Var, peerStories, 0));
                }
                StringBuilder u10 = a1.g.u(j13, "StoriesController processAllStoriesResponse dialogId=", " overwrite stories ");
                u10.append(tL_stories_peerStories.stories.stories.size());
                FileLog.d(u10.toString());
                NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                return;
            case 3:
                l9 l9Var = (l9) this.c;
                long j14 = this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                m9 m9Var3 = l9Var.M;
                a1 a1Var = m9Var3.w;
                l9Var.d = true;
                l8 l8Var = l9Var.c;
                if (l8Var.w) {
                    a1Var.b(l8Var);
                }
                l8Var.w = false;
                l8Var.x = null;
                if (!l8Var.b0) {
                    ArrayList arrayList3 = a1Var.b;
                    if (!l8Var.u && storyItem.media != null) {
                        ArrayList arrayList4 = new ArrayList();
                        int size = arrayList3.size();
                        int i20 = 0;
                        while (i20 < size) {
                            Object obj2 = arrayList3.get(i20);
                            i20++;
                            l8 l8Var2 = (l8) obj2;
                            if (l8Var2.g && l8Var2.f == storyItem.id) {
                                arrayList4.add(l8Var2);
                            }
                        }
                        a1Var.c(arrayList4);
                        a1Var.e(l8Var);
                        l8Var.b = Utilities.random.nextLong();
                        z0 z0Var = new z0(l8Var);
                        l8Var.g = true;
                        z0Var.G = true;
                        l8Var.e = j14;
                        z0Var.I = j14;
                        int i21 = storyItem.id;
                        l8Var.f = i21;
                        z0Var.H = i21;
                        long j15 = storyItem.expire_date * 1000;
                        l8Var.J = j15;
                        z0Var.L = j15;
                        TLRPC.MessageMedia messageMedia = storyItem.media;
                        TLRPC.Document document = messageMedia.document;
                        if (document != null) {
                            long j16 = document.id;
                            l8Var.H = j16;
                            z0Var.J = j16;
                        } else {
                            TLRPC.Photo photo = messageMedia.photo;
                            if (photo != null) {
                                long j17 = photo.id;
                                l8Var.I = j17;
                                z0Var.K = j17;
                            }
                        }
                        arrayList3.remove(l8Var);
                        z13 = false;
                        arrayList3.add(0, l8Var);
                        a1Var.a(z0Var);
                        if (l9Var.b) {
                            m9Var3.R = z13;
                            m9Var3.S = null;
                            return;
                        }
                        return;
                    }
                }
                z13 = false;
                if (l9Var.b) {
                }
                break;
            case 4:
                z9 z9Var2 = (z9) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                long j18 = this.b;
                MessagesStorage messagesStorage = z9Var2.b;
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
                ((z9) this.c).l(this.b, (TL_stories.StoryItem) this.d);
                return;
            case 6:
                ia iaVar = (ia) this.c;
                View view = (View) this.d;
                long j19 = this.b;
                iaVar.getClass();
                view.invalidate();
                MessagesController.getInstance(iaVar.a).getStoriesController().e0(j19, false);
                return;
            case 7:
                y9 y9Var = (y9) this.c;
                long j20 = this.b;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.d;
                y9Var.getClass();
                y9Var.d(j20, chatFull.participants);
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
                synchronized (oi.k.y) {
                    try {
                        oi.k kVar = oi.k.A;
                        if (kVar != null) {
                            kVar.o();
                            oi.k.A = null;
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
                znVar.getMessagesController().lambda$checkDeletingTask$83(this.b, znVar.T5, ((MessageObject) this.d).getId());
                return;
            case 15:
                ln lnVar = (ln) this.c;
                ArrayList<MessageObject> arrayList6 = (ArrayList) this.d;
                long j23 = this.b;
                zn znVar2 = lnVar.a;
                i11 = ((n2) znVar2).currentAccount;
                g5.s0(SendMessagesHelper.getInstance(i11).sendMessage(arrayList6, j23, false, false, true, 0, 0, null, -1, 0L, znVar2.S8(), znVar2.g5), znVar2, null);
                return;
            case 16:
                tr trVar = (tr) this.c;
                TLRPC.User user2 = (TLRPC.User) this.d;
                long j24 = this.b;
                trVar.getMessagesController().deleteParticipantFromChat(trVar.N, user2);
                trVar.v0(j24);
                if (trVar.r == null || user2 == null || !ad.a(trVar)) {
                    return;
                }
                ad.D(trVar, user2, trVar.r.title).j();
                return;
            case 17:
                Runnable runnable = (Runnable) this.c;
                n2 n2Var = (n2) this.d;
                long j25 = this.b;
                if (runnable != null) {
                    runnable.run();
                }
                if (n2Var != null) {
                    n2Var.presentFragment(zn.W9(j25));
                    return;
                }
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                eg egVar = (eg) this.d;
                long j26 = this.b;
                int i22 = ChatActivityEnterView.n5;
                egVar.run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView.Q, j26, true);
                return;
            case 19:
                yi yiVar = (yi) this.c;
                g5.L(yiVar.getContext(), this.b, new gh(yiVar, 14), (e6) this.d);
                return;
            case 20:
                gn gnVar = (gn) this.c;
                long j27 = this.b;
                en enVar2 = (en) this.d;
                hn hnVar = gnVar.P;
                if (!hnVar.r.I1 && gnVar.y == j27 && (enVar = gnVar.F) == enVar2) {
                    hnVar.J = enVar;
                    hnVar.M = enVar.a.a;
                    hnVar.K = false;
                    gnVar.G = 0.0f;
                    gnVar.invalidate();
                    ValueAnimator valueAnimator = hnVar.L;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    hnVar.L = ofFloat;
                    ofFloat.addUpdateListener(new bn(gnVar, 0));
                    hnVar.L.setDuration(200L);
                    hnVar.L.start();
                    en enVar3 = hnVar.J;
                    RectF f7 = enVar3.f(enVar3.e());
                    RectF d = hnVar.J.d();
                    hnVar.G = (((hnVar.y - f7.left) / f7.width()) + 0.5f) / 2.0f;
                    hnVar.F = (hnVar.E - f7.top) / f7.height();
                    hnVar.H = d.width();
                    hnVar.I = d.height();
                    try {
                        hnVar.performHapticFeedback(0, 2);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 21:
                h90.bd((h90) this.c, this.b, (TLRPC.Chat) this.d);
                return;
            case 22:
                ((bw0) this.c).v1.presentFragment(zn.V9(((MessageObject) this.d).getId(), this.b));
                return;
            case 23:
                yx0.y1((yx0) this.c, (TLRPC.TL_messages_emojiGroups) this.d, this.b);
                return;
            case 24:
                ty tyVar2 = (ty) this.c;
                long j28 = this.b;
                g0 g0Var = (g0) this.d;
                if (tyVar2.G.bot_admin_rights != null) {
                    tyVar2.getMessagesController().setUserAdminRole(-j28, tyVar2.getMessagesController().getUser(Long.valueOf(tyVar2.H)), tyVar2.G.bot_admin_rights, null, false, tyVar2, true, true, null, g0Var, new gu(g0Var, i12));
                    return;
                } else {
                    g0Var.run();
                    return;
                }
            case 25:
                g60 g60Var = (g60) this.c;
                TLRPC.Updates updates = (TLRPC.Updates) this.d;
                long j29 = this.b;
                g60Var.getClass();
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
                ChatObject.Call call = g60Var.a1;
                if (call == null || i13 == 0) {
                    return;
                }
                call.invitedUsersMessageIds.put(Long.valueOf(j29), ChatObject.Call.InvitedUser.make(i13));
                g60Var.P0(true);
                return;
            case 26:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                Long l4 = (Long) this.d;
                long j30 = this.b;
                n2 U = LaunchActivity.U();
                if (U == null) {
                    return;
                }
                zn W9 = zn.W9(l4.longValue());
                U.presentFragment(W9);
                TLRPC.Chat chat = MessagesController.getInstance(launchActivity.O).getChat(Long.valueOf(-l4.longValue()));
                if (chat != null) {
                    AndroidUtilities.runOnUIThread(new z90(W9, j30, chat, 0), 250L);
                    return;
                }
                return;
            case 27:
                LaunchActivity launchActivity2 = (LaunchActivity) this.c;
                long j31 = this.b;
                ea0 ea0Var = (ea0) this.d;
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new vq(launchActivity2, MessagesStorage.getInstance(launchActivity2.O).getUser(j31), ea0Var, 13));
                return;
            case 28:
                hd0 hd0Var = (hd0) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                long j32 = this.b;
                if (hd0Var.I == null) {
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
                hd0Var.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                hd0Var.getMessagesController().putUsers(messages_messages.users, false);
                hd0Var.getMessagesController().putChats(messages_messages.chats, false);
                hd0Var.getLocationController().locationsCache.k(messages_messages.messages, j32);
                hd0Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsCacheChanged, Long.valueOf(j32));
                hd0Var.h0(messages_messages.messages);
                hd0Var.getLocationController().markLiveLoactionsAsRead(hd0Var.e0);
                if (hd0Var.J0 == null) {
                    rc0 rc0Var = new rc0(hd0Var, 4);
                    hd0Var.J0 = rc0Var;
                    AndroidUtilities.runOnUIThread(rc0Var, 5000L);
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
