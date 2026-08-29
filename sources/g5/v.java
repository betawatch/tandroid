package g5;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import eg.z1;
import f5.d0;
import ih.h2;
import j3.h0;
import j3.k0;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;
import jh.a9;
import jh.h5;
import lh.b7;
import lh.c7;
import lh.f7;
import lh.i9;
import lh.k7;
import lh.r6;
import lh.s6;
import nh.a1;
import nh.o7;
import nh.y8;
import nh.z0;
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
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.fm;
import org.telegram.ui.Components.im;
import org.telegram.ui.Components.km;
import org.telegram.ui.Components.lm;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.vf;
import org.telegram.ui.Components.wg;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fn;
import org.telegram.ui.fy;
import org.telegram.ui.jr;
import org.telegram.ui.lq;
import org.telegram.ui.o90;
import org.telegram.ui.r50;
import org.telegram.ui.tn;
import org.telegram.ui.xt;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    /* JADX WARN: Removed duplicated region for block: B:158:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04fe  */
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
        im imVar;
        int i12 = this.a;
        int i13 = 2;
        int i14 = 1;
        int i15 = 0;
        long j10 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i12) {
            case 0:
                h0 h0Var = (h0) ((ze.b) obj2).b;
                int i16 = d0.a;
                k0 k0Var = h0Var.a;
                k3.f fVar = k0Var.r;
                k3.a k9 = fVar.k();
                fVar.l(k9, 26, new a9.s(k9, obj, j10));
                if (k0Var.R == obj) {
                    k0Var.l.e(26, new j3.d0(0));
                    break;
                }
                break;
            case 1:
                h2 h2Var = (h2) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                h2Var.getClass();
                o2 U = LaunchActivity.U();
                if (U != null) {
                    h2Var.dismiss();
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
                h5 h5Var = (h5) obj2;
                Runnable runnable = (Runnable) obj;
                h5Var.p2((int) j10, h5Var.getContext(), true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 3:
                h5 h5Var2 = (h5) obj2;
                h5Var2.getClass();
                ((ye.c) obj).b();
                h5Var2.p2((int) j10, h5Var2.getContext(), true);
                break;
            case 4:
                TL_stories.Boost boost = (TL_stories.Boost) obj;
                f3 f3Var = ((f3[]) obj2)[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                o2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(tn.Q9(boost.giveaway_msg_id, j10));
                    break;
                }
                break;
            case 5:
                lh.p pVar = (lh.p) obj2;
                lh.o oVar = (lh.o) obj;
                s6 s6Var = pVar.s;
                ArrayList arrayList = pVar.x;
                fy fyVar = pVar.a0;
                if (fyVar != null && fyVar.getParentActivity() != null) {
                    int i17 = oVar.b;
                    ArrayList arrayList2 = new ArrayList();
                    int i18 = 0;
                    while (true) {
                        if (i18 < arrayList.size()) {
                            long j11 = ((lh.m) arrayList.get(i18)).c;
                            if (j11 == UserConfig.getInstance(pVar.f).clientUserId || !s6Var.J(j11)) {
                                i18++;
                            } else {
                                z10 = false;
                            }
                        } else {
                            z10 = true;
                        }
                    }
                    if (oVar.B && (!z10 || arrayList.size() == 1)) {
                        arrayList2.add(Long.valueOf(oVar.A));
                        i10 = i17;
                        z11 = true;
                    } else if (!oVar.B && s6Var.J(oVar.A)) {
                        for (int i19 = 0; i19 < arrayList.size(); i19++) {
                            long j12 = ((lh.m) arrayList.get(i19)).c;
                            if (!oVar.B && s6Var.J(j12)) {
                                arrayList2.add(Long.valueOf(j12));
                            }
                            if (j12 == oVar.A) {
                                i17 = arrayList2.size() - 1;
                            }
                        }
                        i10 = i17;
                        z11 = false;
                        z12 = true;
                        i9 orCreateStoryViewer = fyVar.getOrCreateStoryViewer();
                        orCreateStoryViewer.s(new z1(pVar, j10, 4));
                        Context context = pVar.getContext();
                        b7 a2 = b7.a(pVar.h);
                        a2.e = new gh.q(i14, pVar, z11);
                        a2.f = pVar.b != 1;
                        a2.h = z12;
                        a2.n = z11;
                        a2.r = true;
                        orCreateStoryViewer.F(context, null, arrayList2, i10, null, null, a2, false);
                        break;
                    } else {
                        for (int i20 = 0; i20 < arrayList.size(); i20++) {
                            if (s6Var.I(((lh.m) arrayList.get(i20)).c)) {
                                arrayList2.add(Long.valueOf(((lh.m) arrayList.get(i20)).c));
                            } else if (i20 <= i17) {
                                i17--;
                            }
                        }
                        i10 = i17;
                        z11 = false;
                    }
                    z12 = false;
                    i9 orCreateStoryViewer2 = fyVar.getOrCreateStoryViewer();
                    orCreateStoryViewer2.s(new z1(pVar, j10, 4));
                    Context context2 = pVar.getContext();
                    b7 a22 = b7.a(pVar.h);
                    a22.e = new gh.q(i14, pVar, z11);
                    a22.f = pVar.b != 1;
                    a22.h = z12;
                    a22.n = z11;
                    a22.r = true;
                    orCreateStoryViewer2.F(context2, null, arrayList2, i10, null, null, a22, false);
                }
                break;
            case 6:
                s6 s6Var2 = (s6) obj2;
                TLObject tLObject = (TLObject) obj;
                int i21 = s6Var2.a;
                s6Var2.C.remove(Long.valueOf(j10));
                if (tLObject != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                    MessagesController.getInstance(i21).putUsers(tL_stories_peerStories.users, false);
                    TLRPC.User user = MessagesController.getInstance(i21).getUser(Long.valueOf(j10));
                    TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                    s6Var2.i.k(peerStories, DialogObject.getPeerDialogId(peerStories.peer));
                    if (user != null && (s6Var2.M(user) || user.self)) {
                        s6Var2.g(peerStories);
                        f7 f7Var = s6Var2.k;
                        f7Var.b.getStorageQueue().postRunnable(new c7(f7Var, peerStories, 0));
                    }
                    StringBuilder r6 = a4.w.r(j10, "StoriesController processAllStoriesResponse dialogId=", " overwrite stories ");
                    r6.append(tL_stories_peerStories.stories.stories.size());
                    FileLog.d(r6.toString());
                    NotificationCenter.getInstance(i21).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    break;
                }
                break;
            case 7:
                r6 r6Var = (r6) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                s6 s6Var3 = r6Var.I;
                a1 a1Var = s6Var3.w;
                r6Var.d = true;
                o7 o7Var = r6Var.c;
                if (o7Var.w) {
                    a1Var.c(o7Var);
                }
                o7Var.w = false;
                o7Var.x = null;
                if (!o7Var.b0) {
                    ArrayList arrayList3 = a1Var.b;
                    if (!o7Var.u && storyItem.media != null) {
                        ArrayList arrayList4 = new ArrayList();
                        int size = arrayList3.size();
                        int i22 = 0;
                        while (i22 < size) {
                            Object obj3 = arrayList3.get(i22);
                            i22++;
                            o7 o7Var2 = (o7) obj3;
                            if (o7Var2.g && o7Var2.f == storyItem.id) {
                                arrayList4.add(o7Var2);
                            }
                        }
                        a1Var.b(arrayList4);
                        a1Var.e(o7Var);
                        o7Var.b = Utilities.random.nextLong();
                        z0 z0Var = new z0(o7Var);
                        o7Var.g = true;
                        z0Var.G = true;
                        o7Var.e = j10;
                        z0Var.I = j10;
                        int i23 = storyItem.id;
                        o7Var.f = i23;
                        z0Var.H = i23;
                        long j13 = storyItem.expire_date * 1000;
                        o7Var.J = j13;
                        z0Var.L = j13;
                        TLRPC.MessageMedia messageMedia = storyItem.media;
                        TLRPC.Document document = messageMedia.document;
                        if (document != null) {
                            long j14 = document.id;
                            o7Var.H = j14;
                            z0Var.J = j14;
                        } else {
                            TLRPC.Photo photo = messageMedia.photo;
                            if (photo != null) {
                                long j15 = photo.id;
                                o7Var.I = j15;
                                z0Var.K = j15;
                            }
                        }
                        arrayList3.remove(o7Var);
                        z13 = false;
                        arrayList3.add(0, o7Var);
                        a1Var.a(z0Var);
                        if (r6Var.b) {
                            s6Var3.R = z13;
                            s6Var3.S = null;
                            break;
                        }
                    }
                }
                z13 = false;
                if (r6Var.b) {
                }
                break;
            case 8:
                ArrayList arrayList5 = (ArrayList) obj;
                MessagesStorage messagesStorage = ((f7) obj2).b;
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
            case 9:
                ((f7) obj2).l(j10, (TL_stories.StoryItem) obj);
                break;
            case 10:
                k7 k7Var = (k7) obj2;
                k7Var.getClass();
                ((View) obj).invalidate();
                MessagesController.getInstance(k7Var.a).getStoriesController().e0(j10, false);
                break;
            case 11:
                y8 y8Var = (y8) obj2;
                y8Var.getClass();
                y8Var.d(j10, ((TLRPC.ChatFull) obj).participants);
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
                tn tnVar = (tn) obj2;
                tnVar.getMessagesController().lambda$checkDeletingTask$84(this.b, tnVar.P5, ((MessageObject) obj).getId());
                break;
            case 17:
                tn tnVar2 = ((fn) obj2).a;
                i11 = ((o2) tnVar2).currentAccount;
                c5.t0(SendMessagesHelper.getInstance(i11).sendMessage((ArrayList) obj, this.b, false, false, true, 0, 0, null, -1, 0L, tnVar2.N8(), tnVar2.c5), tnVar2, null);
                break;
            case 18:
                jr jrVar = (jr) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                jrVar.getMessagesController().deleteParticipantFromChat(jrVar.J, user2);
                jrVar.v0(j10);
                if (jrVar.r != null && user2 != null && tc.a(jrVar)) {
                    tc.D(jrVar, user2, jrVar.r.title).j();
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
                    o2Var.presentFragment(tn.R9(j10));
                    break;
                }
                break;
            case 20:
                int i24 = ChatActivityEnterView.i5;
                ((vf) obj).run();
                SharedPrefsHelper.setWebViewConfirmShown(((ChatActivityEnterView) obj2).M, j10, true);
                break;
            case 21:
                ni niVar = (ni) obj2;
                c5.M(niVar.getContext(), j10, new wg(niVar, 14), (c6) obj);
                break;
            case 22:
                km kmVar = (km) obj2;
                im imVar2 = (im) obj;
                lm lmVar = kmVar.L;
                if (!lmVar.r.G1 && kmVar.y == j10 && (imVar = kmVar.B) == imVar2) {
                    lmVar.F = imVar;
                    lmVar.I = imVar.a.a;
                    lmVar.G = false;
                    kmVar.C = 0.0f;
                    kmVar.invalidate();
                    ValueAnimator valueAnimator = lmVar.H;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    lmVar.H = ofFloat;
                    ofFloat.addUpdateListener(new fm(kmVar, 0));
                    lmVar.H.setDuration(200L);
                    lmVar.H.start();
                    im imVar3 = lmVar.F;
                    RectF f9 = imVar3.f(imVar3.e());
                    RectF d = lmVar.F.d();
                    lmVar.C = (((lmVar.y - f9.left) / f9.width()) + 0.5f) / 2.0f;
                    lmVar.B = (lmVar.A - f9.top) / f9.height();
                    lmVar.D = d.width();
                    lmVar.E = d.height();
                    try {
                        lmVar.performHapticFeedback(0, 2);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 23:
                b80.Xc((b80) obj2, j10, (TLRPC.Chat) obj);
                break;
            case 24:
                ((qu0) obj2).r1.presentFragment(tn.Q9(((MessageObject) obj).getId(), j10));
                break;
            case 25:
                ow0.x1((ow0) obj2, (TLRPC.TL_messages_emojiGroups) obj, j10);
                break;
            case 26:
                fy fyVar2 = (fy) obj2;
                x xVar = (x) obj;
                if (fyVar2.C.bot_admin_rights != null) {
                    fyVar2.getMessagesController().setUserAdminRole(-j10, fyVar2.getMessagesController().getUser(Long.valueOf(fyVar2.D)), fyVar2.C.bot_admin_rights, null, false, fyVar2, true, true, null, xVar, new xt(xVar, i13));
                    break;
                } else {
                    xVar.run();
                    break;
                }
            case 27:
                r50 r50Var = (r50) obj2;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                r50Var.getClass();
                TLRPC.Update update = updates.update;
                if (update instanceof TL_update.TL_updateNewMessage) {
                    TLRPC.Message message = ((TL_update.TL_updateNewMessage) update).message;
                    if (message != null && (message.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                        i15 = message.id;
                    }
                } else if (update instanceof TL_update.TL_updateMessageID) {
                    i15 = ((TL_update.TL_updateMessageID) update).id;
                } else if (updates.updates != null) {
                    int i25 = 0;
                    while (true) {
                        if (i25 < updates.updates.size()) {
                            TLRPC.Update update2 = updates.updates.get(i25);
                            if (update2 instanceof TL_update.TL_updateNewMessage) {
                                TLRPC.Message message2 = ((TL_update.TL_updateNewMessage) update2).message;
                                if (message2 != null && (message2.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                                    i15 = message2.id;
                                }
                                i25++;
                            } else if (update2 instanceof TL_update.TL_updateMessageID) {
                                i15 = ((TL_update.TL_updateMessageID) update2).id;
                            } else {
                                i25++;
                            }
                        }
                    }
                }
                ChatObject.Call call = r50Var.W0;
                if (call != null && i15 != 0) {
                    call.invitedUsersMessageIds.put(Long.valueOf(j10), ChatObject.Call.InvitedUser.make(i15));
                    r50Var.O0(true);
                    break;
                }
                break;
            case 28:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                Long l10 = (Long) obj;
                o2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    tn R9 = tn.R9(l10.longValue());
                    U3.presentFragment(R9);
                    TLRPC.Chat chat = MessagesController.getInstance(launchActivity.K).getChat(Long.valueOf(-l10.longValue()));
                    if (chat != null) {
                        AndroidUtilities.runOnUIThread(new a9(R9, this.b, chat, 1), 250L);
                        break;
                    }
                }
                break;
            default:
                LaunchActivity launchActivity2 = (LaunchActivity) obj2;
                Pattern pattern = LaunchActivity.x1;
                AndroidUtilities.runOnUIThread(new lq(launchActivity2, MessagesStorage.getInstance(launchActivity2.K).getUser(j10), (o90) obj, 13));
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
