package ai;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.os.SystemClock;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.do0;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.jr0;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.kr0;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.nu0;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.tj;
import org.telegram.ui.Components.uo;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.Components.xj;
import org.telegram.ui.Components.z30;
import org.telegram.ui.Components.zm;
import org.telegram.ui.fk;
import org.telegram.ui.hv;
import org.telegram.ui.jn;
import org.telegram.ui.kg;
import org.telegram.ui.ln;
import org.telegram.ui.nx;
import org.telegram.ui.on;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class cb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ cb(int i10, Object obj, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0161  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        org.telegram.ui.ActionBar.n2 n2Var;
        x9 x9Var;
        TLRPC.UserFull userFull;
        fk fkVar;
        k10 k10Var;
        int i11;
        int i12;
        long peerId;
        int i13;
        TLRPC.WebPage webPage;
        int i14 = this.a;
        int i15 = 10;
        int i16 = 8;
        String str = null;
        int i17 = 1;
        int i18 = 0;
        int i19 = this.b;
        Object obj = this.e;
        int i20 = 7;
        Object obj2 = this.d;
        int i21 = 2;
        Object obj3 = this.c;
        switch (i14) {
            case 0:
                int i22 = this.b;
                l7 l7Var = new l7((Context) obj3, i22, UserConfig.getInstance(i22).getClientUserId(), (org.telegram.ui.ActionBar.d6) obj2, null);
                l7Var.M2((TL_stars.SavedStarGift) obj, null);
                l7Var.show();
                break;
            case 1:
                ci.a7 a7Var = (ci.a7) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) obj;
                AbstractSet abstractSet = a7Var.k;
                int i23 = a7Var.f;
                AbstractSet abstractSet2 = a7Var.l;
                a7Var.A = -1;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i24 = a7Var.e;
                sb2.append(i24);
                sb2.append("{");
                long j10 = a7Var.d;
                sb2.append(j10);
                sb2.append("} loaded {");
                sb2.append(ci.i7.a(arrayList));
                i2.e.v("}", sb2);
                ArrayList arrayList2 = a7Var.g;
                arrayList2.clear();
                arrayList2.addAll(tL_stories_stories.pinned_to_top);
                int i25 = a7Var.c;
                boolean z10 = false;
                MessagesController.getInstance(i25).putUsers(tL_stories_stories.users, false);
                MessagesController.getInstance(i25).putChats(tL_stories_stories.chats, false);
                MessagesStorage.getInstance(i25).putUsersAndChats(tL_stories_stories.users, tL_stories_stories.chats, true, true);
                a7Var.u = false;
                a7Var.s = tL_stories_stories.count;
                int i26 = 0;
                while (i26 < arrayList.size()) {
                    a7Var.t((MessageObject) arrayList.get(i26), z10);
                    i26++;
                    z10 = false;
                }
                boolean z11 = abstractSet2.size() >= a7Var.s;
                a7Var.r = z11;
                if (z11) {
                    Iterator it = abstractSet.iterator();
                    while (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        int intValue = num.intValue();
                        if (!abstractSet2.contains(num)) {
                            it.remove();
                            a7Var.u(intValue, false);
                        }
                    }
                } else if (i23 <= 0) {
                    if (i19 == -1) {
                        if (!abstractSet2.isEmpty()) {
                            ArrayList arrayList3 = new ArrayList(abstractSet2);
                            for (int i27 = 0; i27 < arrayList3.size(); i27++) {
                                Integer num2 = (Integer) arrayList3.get(i27);
                                int intValue2 = num2.intValue();
                                if (!arrayList2.contains(num2)) {
                                    i10 = intValue2;
                                    i19 = i10;
                                }
                            }
                        }
                        i10 = -1;
                        i19 = i10;
                    }
                    int n10 = a7Var.n();
                    Iterator it2 = abstractSet.iterator();
                    while (it2.hasNext()) {
                        Integer num3 = (Integer) it2.next();
                        int intValue3 = num3.intValue();
                        if (!abstractSet2.contains(num3) && intValue3 >= i19 && intValue3 <= n10) {
                            it2.remove();
                            a7Var.u(intValue3, false);
                        }
                    }
                }
                a7Var.d(true);
                if (a7Var.r) {
                    if (ci.a7.B == null) {
                        ci.a7.B = new HashMap();
                    }
                    ci.a7.B.put(Integer.valueOf(Objects.hash(Integer.valueOf(i25), Integer.valueOf(i24), Long.valueOf(j10), Integer.valueOf(i23))), Long.valueOf(System.currentTimeMillis()));
                } else {
                    a7Var.w();
                }
                a7Var.x();
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ei.z1(MessagesStorage.getInstance(i19).getUsers((ArrayList) obj3), (HashMap) obj2, (Utilities.Callback) obj, 9));
                break;
            case 3:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj3;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (userFull2 == null) {
                    rVar.run(Boolean.FALSE, "cancelled");
                    break;
                } else {
                    gi.r4.b(i19, user, userFull2, rVar);
                    break;
                }
            case 4:
                hg.h0 h0Var = (hg.h0) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) obj;
                ArrayList arrayList5 = h0Var.K;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - h0Var.n0 >= 300) {
                    h0Var.n0 = elapsedRealtime;
                    int size = arrayList5.size();
                    int size2 = arrayList4.size();
                    int i28 = (arrayList4.isEmpty() && arrayList5.isEmpty()) ? 0 : size2 + size;
                    int min = Math.min(3, size2) + size;
                    int h = h0Var.h();
                    boolean z12 = h0Var.G0;
                    boolean z13 = h > ((z12 ? min : i28) + i19) + 1;
                    s4.k kVar = h0Var.i0;
                    if (kVar != null) {
                        kVar.c = z13 ? 45L : 200L;
                        kVar.d = z13 ? 80L : 200L;
                        kVar.l = z13 ? 270L : 0L;
                    }
                    h0Var.G0 = !z12;
                    u3Var.setRightTextMargin(16);
                    String string = LocaleController.getString(h0Var.G0 ? R.string.ShowMore : R.string.ShowLess);
                    boolean z14 = h0Var.G0;
                    org.telegram.ui.Cells.t3 t3Var = u3Var.b;
                    t3Var.c(string, true, z14);
                    t3Var.setVisibility(0);
                    h0Var.o0 = null;
                    View view = (View) u3Var.getParent();
                    if (view instanceof RecyclerView) {
                        RecyclerView recyclerView = (RecyclerView) view;
                        int i29 = (!h0Var.G0 ? i19 + min : i28 + i19) + 1;
                        int i30 = 0;
                        while (true) {
                            if (i30 < recyclerView.getChildCount()) {
                                View childAt = recyclerView.getChildAt(i30);
                                if (RecyclerView.R(childAt) == i29) {
                                    h0Var.o0 = childAt;
                                } else {
                                    i30++;
                                }
                            }
                        }
                    }
                    int i31 = i19 + min;
                    int i32 = i31 + 1;
                    int max = Math.max(0, size2 - 3);
                    if (h0Var.G0) {
                        h0Var.t(i32, max);
                        if (z13) {
                            AndroidUtilities.runOnUIThread(new ah.g(h0Var, i31, 10), 350L);
                        } else {
                            h0Var.m(i31);
                        }
                    } else {
                        h0Var.m(i31);
                        h0Var.s(i32, max);
                    }
                    ei.p6 p6Var = h0Var.p0;
                    if (p6Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(p6Var);
                    }
                    if (z13) {
                        h0Var.m0 = true;
                        ei.p6 p6Var2 = new ei.p6(24, h0Var, view);
                        h0Var.p0 = p6Var2;
                        AndroidUtilities.runOnUIThread(p6Var2, 400L);
                        break;
                    } else {
                        h0Var.m0 = false;
                        break;
                    }
                }
                break;
            case 5:
                hg.h0 h0Var2 = (hg.h0) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str2 = (String) obj;
                int i33 = h0Var2.s0;
                if (i19 == h0Var2.d0 && (tLObject instanceof TLRPC.messages_Messages)) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    h0Var2.v = messages_messages instanceof TLRPC.TL_messages_messages ? ((TLRPC.TL_messages_messages) messages_messages).messages.size() : messages_messages instanceof TLRPC.TL_messages_messagesSlice ? ((TLRPC.TL_messages_messagesSlice) messages_messages).count : 0;
                    h0Var2.w = messages_messages.next_rate;
                    h0Var2.y = str2;
                    boolean z15 = false;
                    MessagesController.getInstance(i33).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i33).putChats(messages_messages.chats, false);
                    int i34 = 0;
                    while (i34 < messages_messages.messages.size()) {
                        h0Var2.x.add(new MessageObject(i33, messages_messages.messages.get(i34), z15, true));
                        i34++;
                        z15 = false;
                    }
                    nx nxVar = h0Var2.U;
                    if (nxVar != null) {
                        nxVar.d(h0Var2.D0 > 0, true);
                    }
                    h0Var2.l();
                    break;
                }
                break;
            case 6:
                ig.a2 a2Var = (ig.a2) obj3;
                ArrayList arrayList6 = a2Var.b;
                TLRPC.Message message = (TLRPC.Message) obj2;
                String str3 = (String) obj;
                int i35 = a2Var.a;
                if ((message.flags & TLObject.FLAG_30) != 0) {
                    ig.z1 c10 = a2Var.c(message.quick_reply_shortcut_id);
                    if (c10 == null) {
                        ig.z1 z1Var = new ig.z1();
                        z1Var.a = message.quick_reply_shortcut_id;
                        z1Var.d = message.id;
                        MessageObject messageObject = new MessageObject(i35, message, false, true);
                        z1Var.e = messageObject;
                        messageObject.generateThumbs(false);
                        if (str3 != null) {
                            z1Var.b = str3;
                            a2Var.a(str3);
                        }
                        z1Var.e.applyQuickReply(str3, i19);
                        z1Var.f = 1;
                        arrayList6.add(z1Var);
                        for (int i36 = 0; i36 < arrayList6.size(); i36++) {
                            ((ig.z1) arrayList6.get(i36)).c = i36;
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i35);
                        messagesStorage.getStorageQueue().postRunnable(new hi.t(i20, messagesStorage, z1Var));
                        NotificationCenter.getInstance(i35).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                    } else {
                        int i37 = c10.d;
                        int i38 = message.id;
                        if (i37 == i38) {
                            c10.d = i38;
                            MessageObject messageObject2 = new MessageObject(i35, message, false, true);
                            c10.e = messageObject2;
                            messageObject2.generateThumbs(false);
                            a2Var.l();
                            NotificationCenter.getInstance(i35).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        } else if ((message.flags & 32768) == 0) {
                            c10.f++;
                            a2Var.l();
                            NotificationCenter.getInstance(i35).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        }
                    }
                }
                if (str3 == null && i19 == 0) {
                    ArrayList<TLRPC.Message> arrayList7 = new ArrayList<>();
                    arrayList7.add(message);
                    MessagesStorage.getInstance(i35).putMessages(arrayList7, true, true, false, DownloadController.getInstance(i35).getAutodownloadMask(), 5, message.quick_reply_shortcut_id);
                    long clientUserId = UserConfig.getInstance(i35).getClientUserId();
                    ArrayList<MessageObject> arrayList8 = new ArrayList<>();
                    arrayList8.add(new MessageObject(i35, message, true, true));
                    MessagesController.getInstance(i35).updateInterfaceWithMessages(clientUserId, arrayList8, 5);
                    break;
                }
                break;
            case 7:
                List list = (List) obj2;
                m4.v vVar = (m4.v) obj;
                m4.f0 f0Var = ((m4.p0) ((a5.a) obj3).d).g;
                if (i19 == -1) {
                    f0Var.t.x0(list);
                } else {
                    f0Var.t.b0(i19, list);
                }
                new SparseBooleanArray().append(20, true);
                f0Var.p(vVar);
                break;
            case 8:
                ((CameraView) obj3).lambda$createCamera$11(i19, (CameraSession) obj2, (CameraView.CameraGLThread) obj);
                break;
            case 9:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj3;
                org.telegram.ui.ActionBar.c5 c5Var = (org.telegram.ui.ActionBar.c5) obj2;
                Runnable runnable = (Runnable) obj;
                mi.q qVar = actionBarLayout.d0;
                int i39 = 0;
                boolean z16 = false;
                while (i39 < i19) {
                    if (i39 == 0) {
                        n2Var = actionBarLayout.getLastFragment();
                    } else {
                        if ((actionBarLayout.h || actionBarLayout.a0) && actionBarLayout.O0.size() > 1) {
                            n2Var = (org.telegram.ui.ActionBar.n2) r4.c.f(i21, actionBarLayout.O0);
                        }
                        i39++;
                        i21 = 2;
                    }
                    if (n2Var != null) {
                        if (c5Var.m != null) {
                            if (actionBarLayout.e0 == null) {
                                org.telegram.ui.ActionBar.f5 f5Var = new org.telegram.ui.ActionBar.f5(0, true, false, qVar);
                                actionBarLayout.e0 = f5Var;
                                f5Var.L = true;
                                org.telegram.ui.ActionBar.f5 f5Var2 = new org.telegram.ui.ActionBar.f5(1, true, false, qVar);
                                actionBarLayout.f0 = f5Var2;
                                f5Var2.L = true;
                            }
                            on onVar = c5Var.m;
                            SparseIntArray sparseIntArray = (SparseIntArray) qVar.b;
                            sparseIntArray.clear();
                            for (int i40 : (int[]) qVar.c) {
                                sparseIntArray.put(i40, onVar.b(i40, false));
                            }
                        }
                        ArrayList<org.telegram.ui.ActionBar.j6> themeDescriptions = n2Var.getThemeDescriptions();
                        actionBarLayout.d(themeDescriptions);
                        Dialog dialog = n2Var.visibleDialog;
                        if (dialog instanceof org.telegram.ui.ActionBar.f3) {
                            actionBarLayout.d(((org.telegram.ui.ActionBar.f3) dialog).getThemeDescriptions());
                        }
                        if (i39 == 0 && (x9Var = c5Var.h) != null) {
                            x9Var.run();
                        }
                        actionBarLayout.b(themeDescriptions);
                        Dialog dialog2 = n2Var.visibleDialog;
                        if (dialog2 instanceof org.telegram.ui.ActionBar.f3) {
                            actionBarLayout.b(((org.telegram.ui.ActionBar.f3) dialog2).getThemeDescriptions());
                        }
                        z16 = true;
                    }
                    i39++;
                    i21 = 2;
                }
                if (z16) {
                    if (!c5Var.e) {
                        int size3 = actionBarLayout.O0.size() - ((actionBarLayout.h || actionBarLayout.a0) ? 2 : 1);
                        for (int i41 = 0; i41 < size3; i41++) {
                            org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) actionBarLayout.O0.get(i41);
                            n2Var2.clearViews();
                            n2Var2.setParentLayout(actionBarLayout);
                        }
                    }
                    if (c5Var.d) {
                        actionBarLayout.setThemeAnimationValue(1.0f);
                        actionBarLayout.h0.clear();
                        actionBarLayout.b0.clear();
                        actionBarLayout.c0.clear();
                        actionBarLayout.j0.clear();
                        actionBarLayout.i0 = null;
                        actionBarLayout.g0 = null;
                        jn jnVar = c5Var.j;
                        if (jnVar != null) {
                            jnVar.run();
                        }
                        if (runnable != null) {
                            runnable.run();
                            break;
                        }
                    } else {
                        int i42 = org.telegram.ui.ActionBar.h6.a;
                        org.telegram.ui.ActionBar.h6.vl = new SparseIntArray();
                        actionBarLayout.setThemeAnimationValue(0.0f);
                        jn jnVar2 = c5Var.i;
                        if (jnVar2 != null) {
                            jnVar2.run();
                        }
                        ln lnVar = c5Var.k;
                        actionBarLayout.g0 = lnVar;
                        if (lnVar != null) {
                            on onVar2 = lnVar.a;
                            onVar2.V.x0.invalidate();
                            onVar2.I.K = 0.0f;
                            onVar2.J.K = 0.0f;
                            onVar2.m(0.0f);
                        }
                        actionBarLayout.l0.lock();
                        AnimatorSet animatorSet = new AnimatorSet();
                        actionBarLayout.k0 = animatorSet;
                        animatorSet.addListener(new me(12, actionBarLayout, c5Var));
                        actionBarLayout.k0.playTogether(ObjectAnimator.ofFloat(actionBarLayout, "themeAnimationValue", 0.0f, 1.0f));
                        actionBarLayout.k0.setDuration(c5Var.l);
                        actionBarLayout.k0.start();
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 10:
                ((org.telegram.ui.f1) obj3).a(0, false);
                org.telegram.ui.Components.f5.e0(i19, (TLRPC.TL_error) obj2, null, (TLRPC.TL_channels_joinChannel) obj, Boolean.TRUE);
                break;
            case 11:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) obj3;
                ArrayList arrayList9 = (ArrayList) obj2;
                String str4 = (String) obj;
                if (i19 == l4Var.W0) {
                    l4Var.d0(true);
                    l4Var.E = arrayList9;
                    l4Var.F = str4;
                    l4Var.u0[0].c.y.clear();
                    l4Var.u0[0].b.f1();
                    l4Var.W(0);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.f9 f9Var = (org.telegram.ui.f9) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tLObject2 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject2;
                    MessagesController.getInstance(i19).putUsers(tL_users_userFull.users, false);
                    MessagesController.getInstance(i19).putChats(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.voip.d2.m(user2, false, userFull != null && userFull.video_calls_available, f9Var.getParentActivity(), userFull, AccountInstance.getInstance(i19));
                break;
            case 13:
                qn qnVar = (qn) obj3;
                qnVar.getClass();
                qnVar.h = ((MessagesStorage) obj2).getEncryptedChat(i19);
                ((CountDownLatch) obj).countDown();
                break;
            case 14:
                qn qnVar2 = (qn) obj3;
                qnVar2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(qnVar2.T5), (ArrayList) obj2, Boolean.TRUE, (ArrayList) obj, null, 0, Integer.valueOf(i19), Boolean.valueOf(qnVar2.S4));
                qnVar2.A3 = null;
                break;
            case 15:
                qn qnVar3 = (qn) obj3;
                boolean[] zArr = (boolean[]) obj2;
                qn qnVar4 = (qn) obj;
                if (!zArr[0] && i19 == qnVar3.ic && qnVar3.F3 && !qnVar3.isFinishing()) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new kg(qnVar3, 21), 200L);
                    qnVar3.presentFragment(qnVar4);
                    if (qnVar3.C9() && !qnVar4.hideKeyboardOnShow() && (fkVar = qnVar4.Y) != null && fkVar.getEditField() != null) {
                        qnVar4.Y.getEditField().requestFocus();
                        break;
                    }
                }
                break;
            case 16:
                tj tjVar = (tj) obj3;
                ArrayList arrayList10 = (ArrayList) obj2;
                ArrayList arrayList11 = (ArrayList) obj;
                xj xjVar = tjVar.n;
                u1 u1Var = xjVar.s;
                if (i19 == tjVar.h) {
                    if (i19 != -1) {
                        s4.g0 adapter = u1Var.getAdapter();
                        tj tjVar2 = xjVar.F;
                        if (adapter != tjVar2) {
                            u1Var.setAdapter(tjVar2);
                        }
                    }
                    tjVar.d = arrayList10;
                    tjVar.e = arrayList11;
                    tjVar.l();
                    break;
                }
                break;
            case 17:
                an anVar = (an) obj3;
                zm zmVar = (zm) obj2;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                bn bnVar = anVar.P;
                ValueAnimator valueAnimator = bnVar.L;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                bnVar.J = null;
                anVar.G = 0.0f;
                anVar.f(zmVar, photoEntry, i19);
                anVar.j();
                anVar.i(bnVar.P, false);
                break;
            case 18:
                org.telegram.ui.Components.f5.F(((i80) obj3).e, (org.telegram.ui.ActionBar.d6) obj2, new i2.s(i19, (uo) obj, i16));
                break;
            case 19:
                int[] iArr = (int[]) obj3;
                Runnable[] runnableArr = (Runnable[]) obj2;
                int[] iArr2 = (int[]) obj;
                iArr[0] = iArr[0] + 1;
                Runnable runnable2 = runnableArr[0];
                if (runnable2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable2);
                    runnableArr[0] = null;
                }
                if (iArr2[0] >= 0) {
                    ConnectionsManager.getInstance(i19).cancelRequest(iArr2[0], true);
                    iArr2[0] = -1;
                    break;
                }
                break;
            case 20:
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                if (n2Var3.getParentActivity() != null) {
                    if (tLObject3 instanceof Vector) {
                        Vector vector = (Vector) tLObject3;
                        ArrayList arrayList12 = new ArrayList();
                        for (int i43 = 0; i43 < vector.objects.size(); i43++) {
                            try {
                                arrayList12.add(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.Peer) vector.objects.get(i43))));
                            } catch (Exception unused) {
                            }
                        }
                        k10Var = new k10(n2Var3, i19, arrayList12);
                    } else {
                        k10Var = new k10(n2Var3, i19, null);
                    }
                    k10Var.B0 = callback;
                    n2Var3.showDialog(k10Var);
                    break;
                }
                break;
            case 21:
                z30 z30Var = (z30) obj3;
                ArrayList arrayList13 = (ArrayList) obj;
                z30Var.getClass();
                String lowerCase = ((String) obj2).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.i4(z30Var, i19, new ArrayList(), i15));
                    break;
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i44 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i44];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList14 = new ArrayList();
                    int size4 = arrayList13.size();
                    int i45 = 0;
                    while (i45 < size4) {
                        TLObject tLObject4 = (TLObject) arrayList13.get(i45);
                        if (tLObject4 instanceof TLRPC.ChatParticipant) {
                            peerId = ((TLRPC.ChatParticipant) tLObject4).user_id;
                        } else if (tLObject4 instanceof TLRPC.ChannelParticipant) {
                            peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject4).peer);
                        } else {
                            i11 = i17;
                            i12 = i18;
                            i45++;
                            i18 = i12;
                            i17 = i11;
                            str = null;
                        }
                        i12 = i18;
                        i13 = ((org.telegram.ui.ActionBar.f3) z30Var.w).currentAccount;
                        TLRPC.User user3 = MessagesController.getInstance(i13).getUser(Long.valueOf(peerId));
                        if (UserObject.isUserSelf(user3)) {
                            i11 = i17;
                        } else {
                            String lowerCase2 = UserObject.getUserName(user3).toLowerCase();
                            String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                            if (lowerCase2.equals(translitString2)) {
                                translitString2 = str;
                            }
                            i11 = i17;
                            int i46 = i12;
                            int i47 = i46;
                            while (true) {
                                if (i46 < i44) {
                                    String str5 = strArr[i46];
                                    if (lowerCase2.startsWith(str5) || org.telegram.messenger.g0.w(" ", str5, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str5) || org.telegram.messenger.g0.w(" ", str5, translitString2)))) {
                                        i47 = i11;
                                    } else {
                                        String publicUsername = UserObject.getPublicUsername(user3);
                                        if (publicUsername != null && publicUsername.startsWith(str5)) {
                                            i47 = 2;
                                        }
                                    }
                                    if (i47 != 0) {
                                        arrayList14.add(tLObject4);
                                    } else {
                                        i46++;
                                    }
                                }
                            }
                        }
                        i45++;
                        i18 = i12;
                        i17 = i11;
                        str = null;
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.i4(z30Var, i19, arrayList14, 10));
                    break;
                }
            case 22:
                n40 n40Var = (n40) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                String str6 = (String) obj;
                int i48 = n40Var.N;
                ArrayList arrayList15 = n40Var.O;
                if (i19 == n40Var.T) {
                    boolean isEmpty = arrayList15.isEmpty();
                    n40Var.S = false;
                    if (tLObject5 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject5;
                        if (messages_messages2 instanceof TLRPC.TL_messages_messages) {
                            n40Var.W = ((TLRPC.TL_messages_messages) messages_messages2).messages.size();
                        } else if (messages_messages2 instanceof TLRPC.TL_messages_messagesSlice) {
                            n40Var.W = ((TLRPC.TL_messages_messagesSlice) messages_messages2).count;
                        }
                        n40Var.Z = messages_messages2.next_rate;
                        MessagesController.getInstance(i48).putUsers(messages_messages2.users, false);
                        MessagesController.getInstance(i48).putChats(messages_messages2.chats, false);
                        for (int i49 = 0; i49 < messages_messages2.messages.size(); i49++) {
                            MessageObject messageObject3 = new MessageObject(i48, messages_messages2.messages.get(i49), false, true);
                            messageObject3.setQuery(str6);
                            arrayList15.add(messageObject3);
                        }
                        n40Var.V = arrayList15.size() >= n40Var.W;
                        n40Var.W();
                    } else {
                        n40Var.V = true;
                        n40Var.W = arrayList15.size();
                    }
                    n40Var.N(true);
                    if (isEmpty) {
                        ((no0) n40Var).c0.t0.h1(0, 0);
                        break;
                    }
                }
                break;
            case 23:
                go0.c(((go0) obj3).getContext(), i19, ((do0) obj).a.g(), (org.telegram.ui.ActionBar.d6) obj2);
                break;
            case 24:
                kr0 kr0Var = (kr0) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                String str7 = (String) obj;
                HashMap hashMap = kr0Var.v;
                if (i19 == kr0Var.y) {
                    kr0Var.x = 0;
                    if (tLObject6 instanceof TL_account.webPagePreview) {
                        TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject6;
                        MessagesController.getInstance(kr0Var.c).putUsers(webpagepreview.users, false);
                        MessagesController.getInstance(kr0Var.c).putChats(webpagepreview.chats, false);
                        TLRPC.MessageMedia messageMedia = webpagepreview.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            webPage = ((TLRPC.TL_messageMediaWebPage) messageMedia).webpage;
                            if (webPage instanceof TLRPC.TL_webPage) {
                                if (webPage instanceof TLRPC.TL_webPagePending) {
                                    kr0Var.w = webPage;
                                    break;
                                } else if (webPage instanceof TLRPC.TL_webPageEmpty) {
                                    kr0Var.w = null;
                                    if (kr0Var.b != 0) {
                                        kr0Var.b = 0;
                                        jr0 jr0Var = kr0Var.H;
                                        if (jr0Var != null) {
                                            ((hv) jr0Var).h(0);
                                            break;
                                        }
                                    }
                                }
                            } else {
                                if (hashMap.size() > 5) {
                                    Iterator it3 = hashMap.keySet().iterator();
                                    while (it3.hasNext() && hashMap.size() > 5) {
                                        it3.next();
                                        it3.remove();
                                    }
                                }
                                hashMap.put(str7, webPage);
                                kr0Var.w = webPage;
                                kr0.a(kr0Var.a[0], webPage, str7);
                                break;
                            }
                        }
                    }
                    webPage = null;
                    if (webPage instanceof TLRPC.TL_webPage) {
                    }
                }
                break;
            case 25:
                ((uv0) obj3).J0((MessageObject) obj2, (View) obj, i19, false);
                break;
            case 26:
                uv0.d((uv0) obj3, i19, (TL_stories.StoryItem) obj2, (String) obj);
                break;
            case 27:
                org.telegram.ui.Components.f5.e0(i19, (TLRPC.TL_error) obj2, ((uv0) obj3).v1, (TLRPC.TL_messages_editMessage) obj, new Object[0]);
                break;
            case 28:
                qu0 qu0Var = (qu0) obj3;
                ArrayList arrayList16 = (ArrayList) obj2;
                String str8 = (String) obj;
                uv0 uv0Var = qu0Var.v;
                if (qu0Var.h != 0) {
                    if (i19 == qu0Var.n) {
                        int h10 = qu0Var.h();
                        qu0Var.f = arrayList16;
                        qu0Var.s--;
                        int h11 = qu0Var.h();
                        if (qu0Var.s == 0 || h11 != 0) {
                            uv0Var.o1(false);
                        }
                        int i50 = 0;
                        while (true) {
                            nu0[] nu0VarArr = uv0Var.k0;
                            if (i50 < nu0VarArr.length) {
                                nu0 nu0Var = nu0VarArr[i50];
                                if (nu0Var.F == qu0Var.r) {
                                    if (qu0Var.s == 0 && h11 == 0) {
                                        nu0Var.w.d.setText(LocaleController.formatString("NoResultFoundFor", R.string.NoResultFoundFor, str8));
                                        nu0VarArr[i50].w.f.setVisibility(8);
                                        nu0VarArr[i50].w.e(false, true);
                                    } else if (h10 == 0) {
                                        uv0Var.z(nu0Var.h, 0, null);
                                    }
                                }
                                i50++;
                            } else {
                                qu0Var.l();
                            }
                        }
                    }
                    qu0Var.h = 0;
                    break;
                }
                break;
            default:
                iz0 iz0Var = (iz0) obj3;
                String[] strArr2 = (String[]) obj2;
                String str9 = (String) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList17 = new ArrayList();
                int i51 = iz0Var.a;
                MediaDataController.getInstance(i51).getEmojiSuggestions(strArr2, str9, true, new j6(iz0Var, this.b, str9, hashSet, arrayList17, 2), SharedConfig.suggestAnimatedEmoji && UserConfig.getInstance(i51).isPremium());
                break;
        }
    }

    public /* synthetic */ cb(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ cb(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
    }

    public /* synthetic */ cb(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
    }

    public /* synthetic */ cb(go0 go0Var, int i10, do0 do0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.a = 23;
        this.c = go0Var;
        this.b = i10;
        this.e = do0Var;
        this.d = d6Var;
    }
}
