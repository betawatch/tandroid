package a3;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import bi.g9;
import bi.i9;
import bi.k9;
import bi.r9;
import bi.sb;
import bi.w8;
import bi.x8;
import di.a1;
import di.k8;
import di.x9;
import di.z0;
import fi.c2;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.dn;
import org.telegram.ui.Components.eh;
import org.telegram.ui.Components.en;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.ym;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.br;
import org.telegram.ui.ea0;
import org.telegram.ui.fo;
import org.telegram.ui.ja0;
import org.telegram.ui.mu;
import org.telegram.ui.n60;
import org.telegram.ui.nd0;
import org.telegram.ui.qn;
import org.telegram.ui.sw0;
import org.telegram.ui.xc0;
import org.telegram.ui.yr;
import org.telegram.ui.yy;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
        bn bnVar;
        int i12 = 2;
        int i13 = 0;
        switch (this.a) {
            case 0:
                n4.s sVar = (n4.s) this.c;
                Object obj = this.d;
                long j10 = this.b;
                m0 m0Var = (m0) sVar.c;
                String str = e2.m0.a;
                i2.h0 h0Var = ((i2.b0) m0Var).a;
                j2.f fVar = h0Var.s;
                j2.a p5 = fVar.p();
                fVar.q(p5, 26, new ah.h0(p5, obj, j10));
                if (h0Var.T == obj) {
                    h0Var.m.e(26, new c2(21));
                    return;
                }
                return;
            case 1:
                bi.v vVar = (bi.v) this.c;
                bi.u uVar = (bi.u) this.d;
                long j11 = this.b;
                x8 x8Var = vVar.s;
                ArrayList arrayList = vVar.x;
                yy yyVar = vVar.e0;
                if (yyVar == null || yyVar.getParentActivity() == null) {
                    return;
                }
                int i14 = uVar.b;
                ArrayList arrayList2 = new ArrayList();
                int i15 = 0;
                while (true) {
                    if (i15 < arrayList.size()) {
                        long j12 = ((bi.r) arrayList.get(i15)).c;
                        if (j12 == UserConfig.getInstance(vVar.f).clientUserId || !x8Var.J(j12)) {
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
                    z11 = true;
                    i10 = i14;
                } else {
                    if (!uVar.F && x8Var.J(uVar.E)) {
                        int i16 = i14;
                        for (int i17 = 0; i17 < arrayList.size(); i17++) {
                            long j13 = ((bi.r) arrayList.get(i17)).c;
                            if (!uVar.F && x8Var.J(j13)) {
                                arrayList2.add(Long.valueOf(j13));
                            }
                            if (j13 == uVar.E) {
                                i16 = arrayList2.size() - 1;
                            }
                        }
                        z12 = true;
                        i10 = i16;
                        z11 = false;
                        sb orCreateStoryViewer = yyVar.getOrCreateStoryViewer();
                        orCreateStoryViewer.s(new bi.g(vVar, j11, 0 == true ? 1 : 0));
                        Context context = vVar.getContext();
                        g9 a2 = g9.a(vVar.h);
                        a2.e = new bi.h(0 == true ? 1 : 0, vVar, z11);
                        a2.f = vVar.b == 1;
                        a2.h = z12;
                        a2.n = z11;
                        a2.r = true;
                        orCreateStoryViewer.G(context, null, arrayList2, i10, null, null, a2, false);
                        return;
                    }
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        if (x8Var.I(((bi.r) arrayList.get(i18)).c)) {
                            arrayList2.add(Long.valueOf(((bi.r) arrayList.get(i18)).c));
                        } else if (i18 <= i14) {
                            i14--;
                        }
                    }
                    i10 = i14;
                    z11 = false;
                }
                z12 = false;
                sb orCreateStoryViewer2 = yyVar.getOrCreateStoryViewer();
                orCreateStoryViewer2.s(new bi.g(vVar, j11, 0 == true ? 1 : 0));
                Context context2 = vVar.getContext();
                g9 a22 = g9.a(vVar.h);
                a22.e = new bi.h(0 == true ? 1 : 0, vVar, z11);
                a22.f = vVar.b == 1;
                a22.h = z12;
                a22.n = z11;
                a22.r = true;
                orCreateStoryViewer2.G(context2, null, arrayList2, i10, null, null, a22, false);
                return;
            case 2:
                x8 x8Var2 = (x8) this.c;
                long j14 = this.b;
                TLObject tLObject = (TLObject) this.d;
                int i19 = x8Var2.a;
                x8Var2.C.remove(Long.valueOf(j14));
                if (tLObject == null) {
                    return;
                }
                TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                MessagesController.getInstance(i19).putUsers(tL_stories_peerStories.users, false);
                TLRPC.User user = MessagesController.getInstance(i19).getUser(Long.valueOf(j14));
                TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                x8Var2.i.k(peerStories, DialogObject.getPeerDialogId(peerStories.peer));
                if (user != null && (x8Var2.M(user) || user.self)) {
                    x8Var2.g(peerStories);
                    k9 k9Var = x8Var2.k;
                    k9Var.b.getStorageQueue().postRunnable(new i9(k9Var, peerStories, 0));
                }
                StringBuilder t10 = a1.g.t(j14, "StoriesController processAllStoriesResponse dialogId=", " overwrite stories ");
                t10.append(tL_stories_peerStories.stories.stories.size());
                FileLog.d(t10.toString());
                NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                return;
            case 3:
                w8 w8Var = (w8) this.c;
                long j15 = this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                x8 x8Var3 = w8Var.M;
                a1 a1Var = x8Var3.w;
                w8Var.d = true;
                k8 k8Var = w8Var.c;
                if (k8Var.w) {
                    a1Var.b(k8Var);
                }
                k8Var.w = false;
                k8Var.x = null;
                if (!k8Var.b0) {
                    ArrayList arrayList3 = a1Var.b;
                    if (!k8Var.u && storyItem.media != null) {
                        ArrayList arrayList4 = new ArrayList();
                        int size = arrayList3.size();
                        int i20 = 0;
                        while (i20 < size) {
                            Object obj2 = arrayList3.get(i20);
                            i20++;
                            k8 k8Var2 = (k8) obj2;
                            if (k8Var2.g && k8Var2.f == storyItem.id) {
                                arrayList4.add(k8Var2);
                            }
                        }
                        a1Var.c(arrayList4);
                        a1Var.e(k8Var);
                        k8Var.b = Utilities.random.nextLong();
                        z0 z0Var = new z0(k8Var);
                        k8Var.g = true;
                        z0Var.G = true;
                        k8Var.e = j15;
                        z0Var.I = j15;
                        int i21 = storyItem.id;
                        k8Var.f = i21;
                        z0Var.H = i21;
                        long j16 = storyItem.expire_date * 1000;
                        k8Var.J = j16;
                        z0Var.L = j16;
                        TLRPC.MessageMedia messageMedia = storyItem.media;
                        TLRPC.Document document = messageMedia.document;
                        if (document != null) {
                            long j17 = document.id;
                            k8Var.H = j17;
                            z0Var.J = j17;
                        } else {
                            TLRPC.Photo photo = messageMedia.photo;
                            if (photo != null) {
                                long j18 = photo.id;
                                k8Var.I = j18;
                                z0Var.K = j18;
                            }
                        }
                        arrayList3.remove(k8Var);
                        z13 = false;
                        arrayList3.add(0, k8Var);
                        a1Var.a(z0Var);
                        if (w8Var.b) {
                            x8Var3.R = z13;
                            x8Var3.S = null;
                            return;
                        }
                        return;
                    }
                }
                z13 = false;
                if (w8Var.b) {
                }
                break;
            case 4:
                k9 k9Var2 = (k9) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                long j19 = this.b;
                MessagesStorage messagesStorage = k9Var2.b;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    String join = TextUtils.join(", ", arrayList5);
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM stories WHERE dialog_id = " + j19 + " AND story_id IN (" + join + ")").stepThis().dispose();
                    return;
                } catch (Throwable th2) {
                    messagesStorage.checkSQLException(th2);
                    return;
                }
            case 5:
                ((k9) this.c).l(this.b, (TL_stories.StoryItem) this.d);
                return;
            case 6:
                r9 r9Var = (r9) this.c;
                View view = (View) this.d;
                long j20 = this.b;
                r9Var.getClass();
                view.invalidate();
                MessagesController.getInstance(r9Var.a).getStoriesController().e0(j20, false);
                return;
            case 7:
                x9 x9Var = (x9) this.c;
                long j21 = this.b;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.d;
                x9Var.getClass();
                x9Var.d(j21, chatFull.participants);
                return;
            case 8:
                long[] jArr = (long[]) this.c;
                long j22 = this.b;
                l3 l3Var = (l3) this.d;
                jArr[0] = j22;
                l3Var.run();
                return;
            case 9:
                ((VideoFramesRewinder) this.c).lambda$new$1((ArrayList) this.d, this.b);
                return;
            case 10:
                ((NativeInstance) this.c).lambda$onParticipantDescriptionsRequired$2(this.b, (int[]) this.d);
                return;
            case 11:
                ((VideoCapturerDevice) this.c).lambda$init$5(this.b, (String) this.d);
                return;
            case 12:
                ((VideoCapturerDevice) this.c).lambda$init$2(this.b, (Point) this.d);
                return;
            case 13:
                fo foVar = (fo) this.c;
                foVar.getMessagesController().lambda$checkDeletingTask$83(this.b, foVar.T5, ((MessageObject) this.d).getId());
                return;
            case 14:
                qn qnVar = (qn) this.c;
                ArrayList<MessageObject> arrayList6 = (ArrayList) this.d;
                long j23 = this.b;
                fo foVar2 = qnVar.a;
                i11 = ((m2) foVar2).currentAccount;
                g5.s0(SendMessagesHelper.getInstance(i11).sendMessage(arrayList6, j23, false, false, true, 0, 0, null, -1, 0L, foVar2.S8(), foVar2.g5), foVar2, null);
                return;
            case 15:
                yr yrVar = (yr) this.c;
                TLRPC.User user2 = (TLRPC.User) this.d;
                long j24 = this.b;
                yrVar.getMessagesController().deleteParticipantFromChat(yrVar.N, user2);
                yrVar.v0(j24);
                if (yrVar.r == null || user2 == null || !zc.a(yrVar)) {
                    return;
                }
                zc.D(yrVar, user2, yrVar.r.title).j();
                return;
            case 16:
                Runnable runnable = (Runnable) this.c;
                m2 m2Var = (m2) this.d;
                long j25 = this.b;
                if (runnable != null) {
                    runnable.run();
                }
                if (m2Var != null) {
                    m2Var.presentFragment(fo.W9(j25));
                    return;
                }
                return;
            case 17:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                dg dgVar = (dg) this.d;
                long j26 = this.b;
                int i22 = ChatActivityEnterView.n5;
                dgVar.run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView.Q, j26, true);
                return;
            case 18:
                vi viVar = (vi) this.c;
                g5.L(viVar.getContext(), this.b, new eh(viVar, 14), (c6) this.d);
                return;
            case 19:
                dn dnVar = (dn) this.c;
                long j27 = this.b;
                bn bnVar2 = (bn) this.d;
                en enVar = dnVar.P;
                if (!enVar.r.I1 && dnVar.y == j27 && (bnVar = dnVar.F) == bnVar2) {
                    enVar.J = bnVar;
                    enVar.M = bnVar.a.a;
                    enVar.K = false;
                    dnVar.G = 0.0f;
                    dnVar.invalidate();
                    ValueAnimator valueAnimator = enVar.L;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    enVar.L = ofFloat;
                    ofFloat.addUpdateListener(new ym(dnVar, 0));
                    enVar.L.setDuration(200L);
                    enVar.L.start();
                    bn bnVar3 = enVar.J;
                    RectF f7 = bnVar3.f(bnVar3.e());
                    RectF d = enVar.J.d();
                    enVar.G = (((enVar.y - f7.left) / f7.width()) + 0.5f) / 2.0f;
                    enVar.F = (enVar.E - f7.top) / f7.height();
                    enVar.H = d.width();
                    enVar.I = d.height();
                    try {
                        enVar.performHapticFeedback(0, 2);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 20:
                f90.bd((f90) this.c, this.b, (TLRPC.Chat) this.d);
                return;
            case 21:
                ((xv0) this.c).v1.presentFragment(fo.V9(((MessageObject) this.d).getId(), this.b));
                return;
            case 22:
                ux0.y1((ux0) this.c, (TLRPC.TL_messages_emojiGroups) this.d, this.b);
                return;
            case 23:
                yy yyVar2 = (yy) this.c;
                long j28 = this.b;
                h0 h0Var2 = (h0) this.d;
                if (yyVar2.G.bot_admin_rights != null) {
                    yyVar2.getMessagesController().setUserAdminRole(-j28, yyVar2.getMessagesController().getUser(Long.valueOf(yyVar2.H)), yyVar2.G.bot_admin_rights, null, false, yyVar2, true, true, null, h0Var2, new mu(h0Var2, i12));
                    return;
                } else {
                    h0Var2.run();
                    return;
                }
            case 24:
                n60 n60Var = (n60) this.c;
                TLRPC.Updates updates = (TLRPC.Updates) this.d;
                long j29 = this.b;
                n60Var.getClass();
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
                ChatObject.Call call = n60Var.a1;
                if (call == null || i13 == 0) {
                    return;
                }
                call.invitedUsersMessageIds.put(Long.valueOf(j29), ChatObject.Call.InvitedUser.make(i13));
                n60Var.P0(true);
                return;
            case 25:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                Long l4 = (Long) this.d;
                long j30 = this.b;
                m2 U = LaunchActivity.U();
                if (U == null) {
                    return;
                }
                fo W9 = fo.W9(l4.longValue());
                U.presentFragment(W9);
                TLRPC.Chat chat = MessagesController.getInstance(launchActivity.O).getChat(Long.valueOf(-l4.longValue()));
                if (chat != null) {
                    AndroidUtilities.runOnUIThread(new ea0(W9, j30, chat, 0), 250L);
                    return;
                }
                return;
            case 26:
                LaunchActivity launchActivity2 = (LaunchActivity) this.c;
                long j31 = this.b;
                ja0 ja0Var = (ja0) this.d;
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new br(launchActivity2, MessagesStorage.getInstance(launchActivity2.O).getUser(j31), ja0Var, 13));
                return;
            case 27:
                nd0 nd0Var = (nd0) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                long j32 = this.b;
                if (nd0Var.I == null) {
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
                nd0Var.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                nd0Var.getMessagesController().putUsers(messages_messages.users, false);
                nd0Var.getMessagesController().putChats(messages_messages.chats, false);
                nd0Var.getLocationController().locationsCache.k(messages_messages.messages, j32);
                nd0Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsCacheChanged, Long.valueOf(j32));
                nd0Var.h0(messages_messages.messages);
                nd0Var.getLocationController().markLiveLoactionsAsRead(nd0Var.e0);
                if (nd0Var.J0 == null) {
                    xc0 xc0Var = new xc0(nd0Var, 4);
                    nd0Var.J0 = xc0Var;
                    AndroidUtilities.runOnUIThread(xc0Var, 5000L);
                    return;
                }
                return;
            case 28:
                sw0 sw0Var = (sw0) this.c;
                long j33 = this.b;
                m2 m2Var2 = (m2) this.d;
                sw0Var.getClass();
                Bundle bundle = new Bundle();
                if (j33 > 0) {
                    bundle.putLong("user_id", j33);
                } else {
                    bundle.putLong("chat_id", -j33);
                }
                m2Var2.presentFragment(new ProfileActivity(bundle, null));
                sw0Var.c(false);
                return;
            default:
                qi.e eVar = (qi.e) this.c;
                qi.d dVar = (qi.d) this.d;
                long j34 = this.b;
                if (((qi.d) eVar.b) != dVar) {
                    return;
                }
                qi.b bVar = (qi.b) eVar.d;
                if (bVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(bVar);
                    eVar.d = null;
                }
                synchronized (qi.i.y) {
                    try {
                        qi.i iVar = qi.i.A;
                        if (iVar != null) {
                            iVar.o();
                            qi.i.A = null;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                eVar.b = null;
                dVar.c.run(j34);
                eVar.B();
                return;
        }
    }

    public /* synthetic */ i0(Object obj, Object obj2, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }
}
