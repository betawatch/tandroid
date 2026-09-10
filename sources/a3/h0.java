package a3;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Bundle;
import bi.cb;
import bi.kb;
import bi.va;
import di.o3;
import java.util.ArrayList;
import java.util.regex.Pattern;
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
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.hx0;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.um;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wm;
import org.telegram.ui.Components.xm;
import org.telegram.ui.Components.yi;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.eo;
import org.telegram.ui.fa0;
import org.telegram.ui.id0;
import org.telegram.ui.iu;
import org.telegram.ui.j60;
import org.telegram.ui.ow0;
import org.telegram.ui.pn;
import org.telegram.ui.sc0;
import org.telegram.ui.wr;
import org.telegram.ui.wy;
import org.telegram.ui.z90;
import org.telegram.ui.zq;
import wh.p1;
import xh.x3;
import zh.i5;
import zh.s5;
import zh.t5;
import zh.u7;
import zh.v5;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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

    /* JADX WARN: Removed duplicated region for block: B:38:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0190  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        um umVar;
        int i11;
        long j3;
        boolean z10;
        int i12;
        boolean z11;
        boolean z12;
        int i13 = 2;
        int i14 = 0;
        switch (this.a) {
            case 0:
                of.b bVar = (of.b) this.c;
                Object obj = this.d;
                long j10 = this.b;
                l0 l0Var = (l0) bVar.c;
                String str = e2.d0.a;
                i2.e0 e0Var = ((i2.b0) l0Var).a;
                j2.e eVar = e0Var.s;
                j2.a p5 = eVar.p();
                eVar.q(p5, 26, new cb(p5, obj, j10));
                if (e0Var.R == obj) {
                    e0Var.m.e(26, new i0.b(5));
                    return;
                }
                return;
            case 1:
                kb kbVar = (kb) this.c;
                long j11 = this.b;
                TLRPC.ChatFull chatFull = (TLRPC.ChatFull) this.d;
                kbVar.getClass();
                kbVar.d(j11, chatFull.participants);
                return;
            case 2:
                long[] jArr = (long[]) this.c;
                long j12 = this.b;
                o3 o3Var = (o3) this.d;
                jArr[0] = j12;
                o3Var.run();
                return;
            case 3:
                ki.f fVar = (ki.f) this.c;
                ki.e eVar2 = (ki.e) this.d;
                long j13 = this.b;
                if (((ki.e) fVar.b) != eVar2) {
                    return;
                }
                ki.c cVar = (ki.c) fVar.d;
                if (cVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(cVar);
                    fVar.d = null;
                }
                synchronized (ki.k.t) {
                    try {
                        ki.k kVar = ki.k.v;
                        if (kVar != null) {
                            kVar.m();
                            ki.k.v = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                fVar.b = null;
                eVar2.c.run(j13);
                fVar.I();
                return;
            case 4:
                ((VideoFramesRewinder) this.c).lambda$new$1((ArrayList) this.d, this.b);
                return;
            case 5:
                ((NativeInstance) this.c).lambda$onParticipantDescriptionsRequired$2(this.b, (int[]) this.d);
                return;
            case 6:
                ((VideoCapturerDevice) this.c).lambda$init$5(this.b, (String) this.d);
                return;
            case 7:
                ((VideoCapturerDevice) this.c).lambda$init$2(this.b, (Point) this.d);
                return;
            case 8:
                eo eoVar = (eo) this.c;
                eoVar.getMessagesController().lambda$checkDeletingTask$84(this.b, eoVar.T5, ((MessageObject) this.d).getId());
                return;
            case 9:
                pn pnVar = (pn) this.c;
                ArrayList<MessageObject> arrayList = (ArrayList) this.d;
                long j14 = this.b;
                eo eoVar2 = pnVar.a;
                i10 = ((p2) eoVar2).currentAccount;
                d5.t0(SendMessagesHelper.getInstance(i10).sendMessage(arrayList, j14, false, false, true, 0, 0, null, -1, 0L, eoVar2.N8(), eoVar2.g5), eoVar2, null);
                return;
            case 10:
                wr wrVar = (wr) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                long j15 = this.b;
                wrVar.getMessagesController().deleteParticipantFromChat(wrVar.N, user);
                wrVar.v0(j15);
                if (wrVar.r == null || user == null || !wc.a(wrVar)) {
                    return;
                }
                wc.D(wrVar, user, wrVar.r.title).j();
                return;
            case 11:
                Runnable runnable = (Runnable) this.c;
                p2 p2Var = (p2) this.d;
                long j16 = this.b;
                if (runnable != null) {
                    runnable.run();
                }
                if (p2Var != null) {
                    p2Var.presentFragment(eo.R9(j16));
                    return;
                }
                return;
            case 12:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                dg dgVar = (dg) this.d;
                long j17 = this.b;
                int i15 = ChatActivityEnterView.m5;
                dgVar.run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView.Q, j17, true);
                return;
            case 13:
                yi yiVar = (yi) this.c;
                d5.M(yiVar.getContext(), this.b, new gh(yiVar, 14), (f6) this.d);
                return;
            case 14:
                wm wmVar = (wm) this.c;
                long j18 = this.b;
                um umVar2 = (um) this.d;
                xm xmVar = wmVar.P;
                if (!xmVar.r.K1 && wmVar.y == j18 && (umVar = wmVar.F) == umVar2) {
                    xmVar.J = umVar;
                    xmVar.M = umVar.a.a;
                    xmVar.K = false;
                    wmVar.G = 0.0f;
                    wmVar.invalidate();
                    ValueAnimator valueAnimator = xmVar.L;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    xmVar.L = ofFloat;
                    ofFloat.addUpdateListener(new qm(wmVar, 0));
                    xmVar.L.setDuration(200L);
                    xmVar.L.start();
                    um umVar3 = xmVar.J;
                    RectF f7 = umVar3.f(umVar3.e());
                    RectF d = xmVar.J.d();
                    xmVar.G = (((xmVar.y - f7.left) / f7.width()) + 0.5f) / 2.0f;
                    xmVar.F = (xmVar.E - f7.top) / f7.height();
                    xmVar.H = d.width();
                    xmVar.I = d.height();
                    try {
                        xmVar.performHapticFeedback(0, 2);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 15:
                p80.Xc((p80) this.c, this.b, (TLRPC.Chat) this.d);
                return;
            case 16:
                ((iv0) this.c).v1.presentFragment(eo.Q9(((MessageObject) this.d).getId(), this.b));
                return;
            case 17:
                hx0.w1((hx0) this.c, (TLRPC.TL_messages_emojiGroups) this.d, this.b);
                return;
            case 18:
                wy wyVar = (wy) this.c;
                long j19 = this.b;
                g0 g0Var = (g0) this.d;
                if (wyVar.G.bot_admin_rights != null) {
                    wyVar.getMessagesController().setUserAdminRole(-j19, wyVar.getMessagesController().getUser(Long.valueOf(wyVar.H)), wyVar.G.bot_admin_rights, null, false, wyVar, true, true, null, g0Var, new iu(g0Var, i13));
                    return;
                } else {
                    g0Var.run();
                    return;
                }
            case 19:
                j60 j60Var = (j60) this.c;
                TLRPC.Updates updates = (TLRPC.Updates) this.d;
                long j20 = this.b;
                j60Var.getClass();
                TLRPC.Update update = updates.update;
                if (update instanceof TL_update.TL_updateNewMessage) {
                    TLRPC.Message message = ((TL_update.TL_updateNewMessage) update).message;
                    i11 = (message == null || !(message.action instanceof TLRPC.TL_messageActionConferenceCall)) ? 0 : message.id;
                } else if (update instanceof TL_update.TL_updateMessageID) {
                    i11 = ((TL_update.TL_updateMessageID) update).id;
                } else {
                    if (updates.updates != null) {
                        for (int i16 = 0; i16 < updates.updates.size(); i16++) {
                            TLRPC.Update update2 = updates.updates.get(i16);
                            if (update2 instanceof TL_update.TL_updateNewMessage) {
                                TLRPC.Message message2 = ((TL_update.TL_updateNewMessage) update2).message;
                                if (message2 != null && (message2.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                                    i11 = message2.id;
                                }
                            } else if (update2 instanceof TL_update.TL_updateMessageID) {
                                i11 = ((TL_update.TL_updateMessageID) update2).id;
                            }
                        }
                    }
                    i11 = 0;
                }
                ChatObject.Call call = j60Var.a1;
                if (call == null || i11 == 0) {
                    return;
                }
                call.invitedUsersMessageIds.put(Long.valueOf(j20), ChatObject.Call.InvitedUser.make(i11));
                j60Var.O0(true);
                return;
            case 20:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                Long l4 = (Long) this.d;
                long j21 = this.b;
                p2 U = LaunchActivity.U();
                if (U == null) {
                    return;
                }
                eo R9 = eo.R9(l4.longValue());
                U.presentFragment(R9);
                TLRPC.Chat chat = MessagesController.getInstance(launchActivity.O).getChat(Long.valueOf(-l4.longValue()));
                if (chat != null) {
                    AndroidUtilities.runOnUIThread(new z90(R9, j21, chat, 0), 250L);
                    return;
                }
                return;
            case 21:
                LaunchActivity launchActivity2 = (LaunchActivity) this.c;
                long j22 = this.b;
                fa0 fa0Var = (fa0) this.d;
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new zq(launchActivity2, MessagesStorage.getInstance(launchActivity2.O).getUser(j22), fa0Var, 13));
                return;
            case 22:
                id0 id0Var = (id0) this.c;
                TLObject tLObject = (TLObject) this.d;
                long j23 = this.b;
                if (id0Var.I == null) {
                    return;
                }
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                int i17 = 0;
                while (i17 < messages_messages.messages.size()) {
                    if (!(messages_messages.messages.get(i17).media instanceof TLRPC.TL_messageMediaGeoLive)) {
                        messages_messages.messages.remove(i17);
                        i17--;
                    }
                    i17++;
                }
                id0Var.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                id0Var.getMessagesController().putUsers(messages_messages.users, false);
                id0Var.getMessagesController().putChats(messages_messages.chats, false);
                id0Var.getLocationController().locationsCache.k(messages_messages.messages, j23);
                id0Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsCacheChanged, Long.valueOf(j23));
                id0Var.i0(messages_messages.messages);
                id0Var.getLocationController().markLiveLoactionsAsRead(id0Var.e0);
                if (id0Var.J0 == null) {
                    sc0 sc0Var = new sc0(id0Var, 4);
                    id0Var.J0 = sc0Var;
                    AndroidUtilities.runOnUIThread(sc0Var, 5000L);
                    return;
                }
                return;
            case 23:
                ow0 ow0Var = (ow0) this.c;
                long j24 = this.b;
                p2 p2Var2 = (p2) this.d;
                ow0Var.getClass();
                Bundle bundle = new Bundle();
                if (j24 > 0) {
                    bundle.putLong("user_id", j24);
                } else {
                    bundle.putLong("chat_id", -j24);
                }
                p2Var2.presentFragment(new ProfileActivity(bundle, null));
                ow0Var.c(false);
                return;
            case 24:
                p1 p1Var = (p1) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                long j25 = this.b;
                p1Var.getClass();
                p2 U2 = LaunchActivity.U();
                if (U2 == null) {
                    return;
                }
                p1Var.dismiss();
                if (callback != null) {
                    callback.run(Boolean.FALSE);
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", j25);
                bundle2.putBoolean("open_gifts", true);
                U2.presentFragment(new ProfileActivity(bundle2, null));
                return;
            case 25:
                x3 x3Var = (x3) this.c;
                long j26 = this.b;
                Runnable runnable2 = (Runnable) this.d;
                x3Var.p2((int) j26, x3Var.getContext(), true);
                if (runnable2 != null) {
                    runnable2.run();
                    return;
                }
                return;
            case 26:
                x3 x3Var2 = (x3) this.c;
                nf.e eVar3 = (nf.e) this.d;
                long j27 = this.b;
                x3Var2.getClass();
                eVar3.b();
                x3Var2.p2((int) j27, x3Var2.getContext(), true);
                return;
            case 27:
                h3[] h3VarArr = (h3[]) this.c;
                long j28 = this.b;
                TL_stories.Boost boost = (TL_stories.Boost) this.d;
                h3 h3Var = h3VarArr[0];
                if (h3Var != null) {
                    h3Var.dismiss();
                }
                p2 U3 = LaunchActivity.U();
                if (U3 == null) {
                    return;
                }
                U3.presentFragment(eo.Q9(boost.giveaway_msg_id, j28));
                return;
            case 28:
                zh.l lVar = (zh.l) this.c;
                zh.k kVar2 = (zh.k) this.d;
                long j29 = this.b;
                i5 i5Var = lVar.s;
                ArrayList arrayList2 = lVar.x;
                wy wyVar2 = lVar.e0;
                if (wyVar2 == null || wyVar2.getParentActivity() == null) {
                    return;
                }
                int i18 = kVar2.b;
                ArrayList arrayList3 = new ArrayList();
                int i19 = 0;
                while (true) {
                    if (i19 < arrayList2.size()) {
                        long j30 = ((zh.j) arrayList2.get(i19)).c;
                        j3 = j29;
                        if (j30 == UserConfig.getInstance(lVar.f).clientUserId || !i5Var.J(j30)) {
                            i19++;
                            j29 = j3;
                        } else {
                            z10 = false;
                        }
                    } else {
                        j3 = j29;
                        z10 = true;
                    }
                }
                if (kVar2.F && (!z10 || arrayList2.size() == 1)) {
                    arrayList3.add(Long.valueOf(kVar2.E));
                    i12 = i18;
                    z11 = true;
                } else {
                    if (!kVar2.F && i5Var.J(kVar2.E)) {
                        for (int i20 = 0; i20 < arrayList2.size(); i20++) {
                            long j31 = ((zh.j) arrayList2.get(i20)).c;
                            if (!kVar2.F && i5Var.J(j31)) {
                                arrayList3.add(Long.valueOf(j31));
                            }
                            if (j31 == kVar2.E) {
                                i18 = arrayList3.size() - 1;
                            }
                        }
                        i12 = i18;
                        z11 = false;
                        z12 = true;
                        u7 orCreateStoryViewer = wyVar2.getOrCreateStoryViewer();
                        orCreateStoryViewer.s(new va(lVar, j3, 27));
                        Context context = lVar.getContext();
                        s5 a2 = s5.a(lVar.h);
                        a2.e = new gg.d0(11, lVar, z11);
                        a2.f = lVar.b != 1;
                        a2.h = z12;
                        a2.n = z11;
                        a2.r = true;
                        orCreateStoryViewer.F(context, null, arrayList3, i12, null, null, a2, false);
                        return;
                    }
                    for (int i21 = 0; i21 < arrayList2.size(); i21++) {
                        if (i5Var.I(((zh.j) arrayList2.get(i21)).c)) {
                            arrayList3.add(Long.valueOf(((zh.j) arrayList2.get(i21)).c));
                        } else if (i21 <= i18) {
                            i18--;
                        }
                    }
                    i12 = i18;
                    z11 = false;
                }
                z12 = false;
                u7 orCreateStoryViewer2 = wyVar2.getOrCreateStoryViewer();
                orCreateStoryViewer2.s(new va(lVar, j3, 27));
                Context context2 = lVar.getContext();
                s5 a22 = s5.a(lVar.h);
                a22.e = new gg.d0(11, lVar, z11);
                a22.f = lVar.b != 1;
                a22.h = z12;
                a22.n = z11;
                a22.r = true;
                orCreateStoryViewer2.F(context2, null, arrayList3, i12, null, null, a22, false);
                return;
            default:
                i5 i5Var2 = (i5) this.c;
                long j32 = this.b;
                TLObject tLObject2 = (TLObject) this.d;
                int i22 = i5Var2.a;
                i5Var2.C.remove(Long.valueOf(j32));
                if (tLObject2 == null) {
                    return;
                }
                TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject2;
                MessagesController.getInstance(i22).putUsers(tL_stories_peerStories.users, false);
                TLRPC.User user2 = MessagesController.getInstance(i22).getUser(Long.valueOf(j32));
                TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                i5Var2.i.k(peerStories, DialogObject.getPeerDialogId(peerStories.peer));
                if (user2 != null && (i5Var2.M(user2) || user2.self)) {
                    i5Var2.g(peerStories);
                    v5 v5Var = i5Var2.k;
                    v5Var.b.getStorageQueue().postRunnable(new t5(v5Var, peerStories, i14));
                }
                StringBuilder t10 = a4.a.t(j32, "StoriesController processAllStoriesResponse dialogId=", " overwrite stories ");
                t10.append(tL_stories_peerStories.stories.stories.size());
                FileLog.d(t10.toString());
                NotificationCenter.getInstance(i22).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
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
