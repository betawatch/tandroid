package a3;

import ai.ha;
import ai.jc;
import ai.k9;
import ai.l9;
import ai.u9;
import ai.w9;
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
import ci.l8;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.dh;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.g80;
import org.telegram.ui.Components.lm;
import org.telegram.ui.Components.om;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.rm;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ba0;
import org.telegram.ui.dd0;
import org.telegram.ui.eu;
import org.telegram.ui.f60;
import org.telegram.ui.fw0;
import org.telegram.ui.jn;
import org.telegram.ui.nc0;
import org.telegram.ui.qr;
import org.telegram.ui.ry;
import org.telegram.ui.tq;
import org.telegram.ui.w90;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        om omVar;
        int i12 = 2;
        int i13 = 0;
        switch (this.a) {
            case 0:
                of.b bVar = (of.b) this.c;
                Object obj = this.d;
                long j3 = this.b;
                l0 l0Var = (l0) bVar.c;
                String str = e2.d0.a;
                i2.f0 f0Var = ((i2.c0) l0Var).a;
                j2.f fVar = f0Var.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 26, new ah.b(p5, obj, j3));
                if (f0Var.R == obj) {
                    f0Var.m.e(26, new hg.r(11));
                    return;
                }
                return;
            case 1:
                ai.b0 b0Var = (ai.b0) this.c;
                ai.a0 a0Var = (ai.a0) this.d;
                long j10 = this.b;
                l9 l9Var = b0Var.s;
                ArrayList arrayList = b0Var.x;
                ry ryVar = b0Var.e0;
                if (ryVar == null || ryVar.getParentActivity() == null) {
                    return;
                }
                int i14 = a0Var.b;
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    if (i15 < arrayList.size()) {
                        long j11 = ((ai.w) arrayList.get(i15)).c;
                        if (j11 == UserConfig.getInstance(b0Var.f).clientUserId || !l9Var.J(j11)) {
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
                    i10 = i14;
                    z11 = true;
                } else {
                    if (!a0Var.F && l9Var.J(a0Var.E)) {
                        int i16 = i14;
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            long j12 = ((ai.w) arrayList.get(i17)).c;
                            if (!a0Var.F && l9Var.J(j12)) {
                                arrayList2.add(Long.valueOf(j12));
                            }
                            if (j12 == a0Var.E) {
                                i16 = arrayList2.size() - 1;
                            }
                        }
                        i10 = i16;
                        z11 = false;
                        z12 = true;
                        jc orCreateStoryViewer = ryVar.getOrCreateStoryViewer();
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
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        if (l9Var.I(((ai.w) arrayList.get(i18)).c)) {
                            arrayList2.add(Long.valueOf(((ai.w) arrayList.get(i18)).c));
                        } else if (i18 <= i14) {
                            i14--;
                        }
                    }
                    i10 = i14;
                    z11 = false;
                }
                z12 = false;
                jc orCreateStoryViewer2 = ryVar.getOrCreateStoryViewer();
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
                int i19 = l9Var2.a;
                l9Var2.C.remove(Long.valueOf(j13));
                if (tLObject == null) {
                    return;
                }
                TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                MessagesController.getInstance(i19).putUsers(tL_stories_peerStories.users, false);
                TLRPC.User user = MessagesController.getInstance(i19).getUser(Long.valueOf(j13));
                TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                l9Var2.i.k(peerStories, DialogObject.getPeerDialogId(peerStories.peer));
                if (user != null && (l9Var2.M(user) || user.self)) {
                    l9Var2.g(peerStories);
                    y9 y9Var = l9Var2.k;
                    y9Var.b.getStorageQueue().postRunnable(new w9(y9Var, peerStories, 0));
                }
                StringBuilder u10 = a4.a.u(j13, "StoriesController processAllStoriesResponse dialogId=", " overwrite stories ");
                u10.append(tL_stories_peerStories.stories.stories.size());
                FileLog.d(u10.toString());
                NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                return;
            case 3:
                k9 k9Var = (k9) this.c;
                long j14 = this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                l9 l9Var3 = k9Var.M;
                b1 b1Var = l9Var3.w;
                k9Var.d = true;
                l8 l8Var = k9Var.c;
                if (l8Var.w) {
                    b1Var.b(l8Var);
                }
                l8Var.w = false;
                l8Var.x = null;
                if (!l8Var.b0) {
                    ArrayList arrayList3 = b1Var.b;
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
                        b1Var.c(arrayList4);
                        b1Var.e(l8Var);
                        l8Var.b = Utilities.random.nextLong();
                        a1 a1Var = new a1(l8Var);
                        l8Var.g = true;
                        a1Var.G = true;
                        l8Var.e = j14;
                        a1Var.I = j14;
                        int i21 = storyItem.id;
                        l8Var.f = i21;
                        a1Var.H = i21;
                        long j15 = storyItem.expire_date * 1000;
                        l8Var.J = j15;
                        a1Var.L = j15;
                        TLRPC.MessageMedia messageMedia = storyItem.media;
                        TLRPC.Document document = messageMedia.document;
                        if (document != null) {
                            long j16 = document.id;
                            l8Var.H = j16;
                            a1Var.J = j16;
                        } else {
                            TLRPC.Photo photo = messageMedia.photo;
                            if (photo != null) {
                                long j17 = photo.id;
                                l8Var.I = j17;
                                a1Var.K = j17;
                            }
                        }
                        arrayList3.remove(l8Var);
                        z13 = false;
                        arrayList3.add(0, l8Var);
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
                ci.y9 y9Var3 = (ci.y9) this.c;
                long j20 = this.b;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.d;
                y9Var3.getClass();
                y9Var3.d(j20, chatFull.participants);
                return;
            case 8:
                long[] jArr = (long[]) this.c;
                long j21 = this.b;
                l3 l3Var = (l3) this.d;
                jArr[0] = j21;
                l3Var.run();
                return;
            case 9:
                ni.f fVar2 = (ni.f) this.c;
                ni.e eVar = (ni.e) this.d;
                long j22 = this.b;
                if (((ni.e) fVar2.b) != eVar) {
                    return;
                }
                ni.c cVar = (ni.c) fVar2.d;
                if (cVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(cVar);
                    fVar2.d = null;
                }
                synchronized (ni.k.v) {
                    try {
                        ni.k kVar = ni.k.x;
                        if (kVar != null) {
                            kVar.n();
                            ni.k.x = null;
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
                xn xnVar = (xn) this.c;
                xnVar.getMessagesController().lambda$checkDeletingTask$84(this.b, xnVar.T5, ((MessageObject) this.d).getId());
                return;
            case 15:
                jn jnVar = (jn) this.c;
                ArrayList<MessageObject> arrayList6 = (ArrayList) this.d;
                long j23 = this.b;
                xn xnVar2 = jnVar.a;
                i11 = ((n2) xnVar2).currentAccount;
                e5.t0(SendMessagesHelper.getInstance(i11).sendMessage(arrayList6, j23, false, false, true, 0, 0, null, -1, 0L, xnVar2.N8(), xnVar2.g5), xnVar2, null);
                return;
            case 16:
                qr qrVar = (qr) this.c;
                TLRPC.User user2 = (TLRPC.User) this.d;
                long j24 = this.b;
                qrVar.getMessagesController().deleteParticipantFromChat(qrVar.N, user2);
                qrVar.v0(j24);
                if (qrVar.r == null || user2 == null || !xc.a(qrVar)) {
                    return;
                }
                xc.D(qrVar, user2, qrVar.r.title).j();
                return;
            case 17:
                Runnable runnable = (Runnable) this.c;
                n2 n2Var = (n2) this.d;
                long j25 = this.b;
                if (runnable != null) {
                    runnable.run();
                }
                if (n2Var != null) {
                    n2Var.presentFragment(xn.R9(j25));
                    return;
                }
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                bg bgVar = (bg) this.d;
                long j26 = this.b;
                int i22 = ChatActivityEnterView.n5;
                bgVar.run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView.Q, j26, true);
                return;
            case 19:
                wi wiVar = (wi) this.c;
                e5.M(wiVar.getContext(), this.b, new dh(wiVar, 14), (d6) this.d);
                return;
            case 20:
                qm qmVar = (qm) this.c;
                long j27 = this.b;
                om omVar2 = (om) this.d;
                rm rmVar = qmVar.P;
                if (!rmVar.r.K1 && qmVar.y == j27 && (omVar = qmVar.F) == omVar2) {
                    rmVar.J = omVar;
                    rmVar.M = omVar.a.a;
                    rmVar.K = false;
                    qmVar.G = 0.0f;
                    qmVar.invalidate();
                    ValueAnimator valueAnimator = rmVar.L;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    rmVar.L = ofFloat;
                    ofFloat.addUpdateListener(new lm(qmVar, 0));
                    rmVar.L.setDuration(200L);
                    rmVar.L.start();
                    om omVar3 = rmVar.J;
                    RectF f7 = omVar3.f(omVar3.e());
                    RectF d = rmVar.J.d();
                    rmVar.G = (((rmVar.y - f7.left) / f7.width()) + 0.5f) / 2.0f;
                    rmVar.F = (rmVar.E - f7.top) / f7.height();
                    rmVar.H = d.width();
                    rmVar.I = d.height();
                    try {
                        rmVar.performHapticFeedback(0, 2);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 21:
                g80.Xc((g80) this.c, this.b, (TLRPC.Chat) this.d);
                return;
            case 22:
                ((yu0) this.c).v1.presentFragment(xn.Q9(((MessageObject) this.d).getId(), this.b));
                return;
            case 23:
                vw0.x1((vw0) this.c, (TLRPC.TL_messages_emojiGroups) this.d, this.b);
                return;
            case 24:
                ry ryVar2 = (ry) this.c;
                long j28 = this.b;
                g0 g0Var = (g0) this.d;
                if (ryVar2.G.bot_admin_rights != null) {
                    ryVar2.getMessagesController().setUserAdminRole(-j28, ryVar2.getMessagesController().getUser(Long.valueOf(ryVar2.H)), ryVar2.G.bot_admin_rights, null, false, ryVar2, true, true, null, g0Var, new eu(g0Var, i12));
                    return;
                } else {
                    g0Var.run();
                    return;
                }
            case 25:
                f60 f60Var = (f60) this.c;
                TLRPC.Updates updates = (TLRPC.Updates) this.d;
                long j29 = this.b;
                f60Var.getClass();
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
                ChatObject.Call call = f60Var.a1;
                if (call == null || i13 == 0) {
                    return;
                }
                call.invitedUsersMessageIds.put(Long.valueOf(j29), ChatObject.Call.InvitedUser.make(i13));
                f60Var.O0(true);
                return;
            case 26:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                Long l4 = (Long) this.d;
                long j30 = this.b;
                n2 U = LaunchActivity.U();
                if (U == null) {
                    return;
                }
                xn R9 = xn.R9(l4.longValue());
                U.presentFragment(R9);
                TLRPC.Chat chat = MessagesController.getInstance(launchActivity.O).getChat(Long.valueOf(-l4.longValue()));
                if (chat != null) {
                    AndroidUtilities.runOnUIThread(new w90(R9, j30, chat, 0), 250L);
                    return;
                }
                return;
            case 27:
                LaunchActivity launchActivity2 = (LaunchActivity) this.c;
                long j31 = this.b;
                ba0 ba0Var = (ba0) this.d;
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new tq(launchActivity2, MessagesStorage.getInstance(launchActivity2.O).getUser(j31), ba0Var, 13));
                return;
            case 28:
                dd0 dd0Var = (dd0) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                long j32 = this.b;
                if (dd0Var.I == null) {
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
                dd0Var.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                dd0Var.getMessagesController().putUsers(messages_messages.users, false);
                dd0Var.getMessagesController().putChats(messages_messages.chats, false);
                dd0Var.getLocationController().locationsCache.k(messages_messages.messages, j32);
                dd0Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsCacheChanged, Long.valueOf(j32));
                dd0Var.i0(messages_messages.messages);
                dd0Var.getLocationController().markLiveLoactionsAsRead(dd0Var.e0);
                if (dd0Var.J0 == null) {
                    nc0 nc0Var = new nc0(dd0Var, 4);
                    dd0Var.J0 = nc0Var;
                    AndroidUtilities.runOnUIThread(nc0Var, 5000L);
                    return;
                }
                return;
            default:
                fw0 fw0Var = (fw0) this.c;
                long j33 = this.b;
                n2 n2Var2 = (n2) this.d;
                fw0Var.getClass();
                Bundle bundle = new Bundle();
                if (j33 > 0) {
                    bundle.putLong("user_id", j33);
                } else {
                    bundle.putLong("chat_id", -j33);
                }
                n2Var2.presentFragment(new ProfileActivity(bundle, null));
                fw0Var.c(false);
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
