package bi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.e40;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.jo;
import org.telegram.ui.Components.jy0;
import org.telegram.ui.Components.k11;
import org.telegram.ui.Components.lq0;
import org.telegram.ui.Components.mq0;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.om;
import org.telegram.ui.Components.pm;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.Components.uj;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.Components.yj;
import org.telegram.ui.ao;
import org.telegram.ui.co;
import org.telegram.ui.dm;
import org.telegram.ui.gy;
import org.telegram.ui.mk;
import org.telegram.ui.ug;
import org.telegram.ui.vn;
import org.telegram.ui.xn;
import org.telegram.ui.xv;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class k8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k8(int i10, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback) {
        this.a = 1;
        this.b = i10;
        this.c = arrayList;
        this.d = hashMap;
        this.e = callback;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d3  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        org.telegram.ui.ActionBar.n2 n2Var;
        Runnable runnable;
        TLRPC.UserFull userFull;
        mk mkVar;
        c10 c10Var;
        ArrayList arrayList;
        long peerId;
        int i11;
        TLRPC.WebPage webPage;
        int i12;
        int i13 = this.a;
        int i14 = 20;
        int i15 = 7;
        int i16 = 8;
        int i17 = 5;
        String str = null;
        int i18 = this.b;
        Object obj = this.e;
        Object obj2 = this.c;
        Object obj3 = this.d;
        switch (i13) {
            case 0:
                l8 l8Var = (l8) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) obj;
                AbstractSet abstractSet = l8Var.k;
                int i19 = l8Var.f;
                AbstractSet abstractSet2 = l8Var.l;
                l8Var.A = -1;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i20 = l8Var.e;
                sb2.append(i20);
                sb2.append("{");
                long j3 = l8Var.d;
                sb2.append(j3);
                sb2.append("} loaded {");
                sb2.append(u8.a(arrayList2));
                com.google.android.gms.internal.vision.e2.t("}", sb2);
                ArrayList arrayList3 = l8Var.g;
                arrayList3.clear();
                arrayList3.addAll(tL_stories_stories.pinned_to_top);
                int i21 = l8Var.c;
                boolean z10 = false;
                MessagesController.getInstance(i21).putUsers(tL_stories_stories.users, false);
                MessagesController.getInstance(i21).putChats(tL_stories_stories.chats, false);
                MessagesStorage.getInstance(i21).putUsersAndChats(tL_stories_stories.users, tL_stories_stories.chats, true, true);
                l8Var.u = false;
                l8Var.s = tL_stories_stories.count;
                int i22 = 0;
                while (i22 < arrayList2.size()) {
                    l8Var.t((MessageObject) arrayList2.get(i22), z10);
                    i22++;
                    z10 = false;
                }
                boolean z11 = abstractSet2.size() >= l8Var.s;
                l8Var.r = z11;
                if (z11) {
                    Iterator it = abstractSet.iterator();
                    while (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        int intValue = num.intValue();
                        if (!abstractSet2.contains(num)) {
                            it.remove();
                            l8Var.u(intValue, false);
                        }
                    }
                } else if (i19 <= 0) {
                    if (i18 == -1) {
                        if (!abstractSet2.isEmpty()) {
                            ArrayList arrayList4 = new ArrayList(abstractSet2);
                            for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                                Integer num2 = (Integer) arrayList4.get(i23);
                                int intValue2 = num2.intValue();
                                if (!arrayList3.contains(num2)) {
                                    i10 = intValue2;
                                    i18 = i10;
                                }
                            }
                        }
                        i10 = -1;
                        i18 = i10;
                    }
                    int n10 = l8Var.n();
                    Iterator it2 = abstractSet.iterator();
                    while (it2.hasNext()) {
                        Integer num3 = (Integer) it2.next();
                        int intValue3 = num3.intValue();
                        if (!abstractSet2.contains(num3) && intValue3 >= i18 && intValue3 <= n10) {
                            it2.remove();
                            l8Var.u(intValue3, false);
                        }
                    }
                }
                l8Var.d(true);
                if (l8Var.r) {
                    if (l8.B == null) {
                        l8.B = new HashMap();
                    }
                    l8.B.put(Integer.valueOf(Objects.hash(Integer.valueOf(i21), Integer.valueOf(i20), Long.valueOf(j3), Integer.valueOf(i19))), Long.valueOf(System.currentTimeMillis()));
                } else {
                    l8Var.w();
                }
                l8Var.x();
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new a3.k0(MessagesStorage.getInstance(i18).getUsers((ArrayList) obj2), (HashMap) obj3, (Utilities.Callback) obj, 24));
                break;
            case 2:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj3;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (userFull2 == null) {
                    sVar.run(Boolean.FALSE, "cancelled");
                    break;
                } else {
                    fi.d5.b(i18, user, userFull2, sVar);
                    break;
                }
            case 3:
                hg.i0 i0Var = (hg.i0) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) obj;
                ArrayList arrayList6 = i0Var.K;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - i0Var.n0 >= 300) {
                    i0Var.n0 = elapsedRealtime;
                    int size = arrayList6.size();
                    int size2 = arrayList5.size();
                    int i24 = (arrayList5.isEmpty() && arrayList6.isEmpty()) ? 0 : size2 + size;
                    int min = Math.min(3, size2) + size;
                    int h = i0Var.h();
                    boolean z12 = i0Var.G0;
                    boolean z13 = h > ((z12 ? min : i24) + i18) + 1;
                    s4.j jVar = i0Var.i0;
                    if (jVar != null) {
                        jVar.c = z13 ? 45L : 200L;
                        jVar.d = z13 ? 80L : 200L;
                        jVar.l = z13 ? 270L : 0L;
                    }
                    i0Var.G0 = !z12;
                    u3Var.setRightTextMargin(16);
                    String string = LocaleController.getString(i0Var.G0 ? R.string.ShowMore : R.string.ShowLess);
                    boolean z14 = i0Var.G0;
                    org.telegram.ui.Cells.t3 t3Var = u3Var.b;
                    t3Var.c(string, true, z14);
                    t3Var.setVisibility(0);
                    i0Var.o0 = null;
                    View view = (View) u3Var.getParent();
                    if (view instanceof RecyclerView) {
                        RecyclerView recyclerView = (RecyclerView) view;
                        int i25 = (!i0Var.G0 ? i18 + min : i24 + i18) + 1;
                        int i26 = 0;
                        while (true) {
                            if (i26 < recyclerView.getChildCount()) {
                                View childAt = recyclerView.getChildAt(i26);
                                if (RecyclerView.R(childAt) == i25) {
                                    i0Var.o0 = childAt;
                                } else {
                                    i26++;
                                }
                            }
                        }
                    }
                    int i27 = i18 + min;
                    int i28 = i27 + 1;
                    int max = Math.max(0, size2 - 3);
                    if (i0Var.G0) {
                        i0Var.t(i28, max);
                        if (z13) {
                            AndroidUtilities.runOnUIThread(new ah.g(i0Var, i27, i16), 350L);
                        } else {
                            i0Var.m(i27);
                        }
                    } else {
                        i0Var.m(i27);
                        i0Var.s(i28, max);
                    }
                    fi.j4 j4Var = i0Var.p0;
                    if (j4Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(j4Var);
                    }
                    if (z13) {
                        i0Var.m0 = true;
                        fi.j4 j4Var2 = new fi.j4(6, i0Var, view);
                        i0Var.p0 = j4Var2;
                        AndroidUtilities.runOnUIThread(j4Var2, 400L);
                        break;
                    } else {
                        i0Var.m0 = false;
                        break;
                    }
                }
                break;
            case 4:
                hg.i0 i0Var2 = (hg.i0) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str2 = (String) obj;
                int i29 = i0Var2.s0;
                if (i18 == i0Var2.d0 && (tLObject instanceof TLRPC.messages_Messages)) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    i0Var2.v = messages_messages instanceof TLRPC.TL_messages_messages ? ((TLRPC.TL_messages_messages) messages_messages).messages.size() : messages_messages instanceof TLRPC.TL_messages_messagesSlice ? ((TLRPC.TL_messages_messagesSlice) messages_messages).count : 0;
                    i0Var2.w = messages_messages.next_rate;
                    i0Var2.y = str2;
                    boolean z15 = false;
                    MessagesController.getInstance(i29).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i29).putChats(messages_messages.chats, false);
                    int i30 = 0;
                    while (i30 < messages_messages.messages.size()) {
                        i0Var2.x.add(new MessageObject(i29, messages_messages.messages.get(i30), z15, true));
                        i30++;
                        z15 = false;
                    }
                    gy gyVar = i0Var2.U;
                    if (gyVar != null) {
                        gyVar.d(i0Var2.D0 > 0, true);
                    }
                    i0Var2.l();
                    break;
                }
                break;
            case 5:
                ig.b2 b2Var = (ig.b2) obj3;
                ArrayList arrayList7 = b2Var.b;
                TLRPC.Message message = (TLRPC.Message) obj2;
                String str3 = (String) obj;
                int i31 = b2Var.a;
                if ((message.flags & TLObject.FLAG_30) != 0) {
                    ig.a2 c10 = b2Var.c(message.quick_reply_shortcut_id);
                    if (c10 == null) {
                        ig.a2 a2Var = new ig.a2();
                        a2Var.a = message.quick_reply_shortcut_id;
                        a2Var.d = message.id;
                        MessageObject messageObject = new MessageObject(i31, message, false, true);
                        a2Var.e = messageObject;
                        messageObject.generateThumbs(false);
                        if (str3 != null) {
                            a2Var.b = str3;
                            b2Var.a(str3);
                        }
                        a2Var.e.applyQuickReply(str3, i18);
                        a2Var.f = 1;
                        arrayList7.add(a2Var);
                        for (int i32 = 0; i32 < arrayList7.size(); i32++) {
                            ((ig.a2) arrayList7.get(i32)).c = i32;
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i31);
                        messagesStorage.getStorageQueue().postRunnable(new fi.j4(16, messagesStorage, a2Var));
                        NotificationCenter.getInstance(i31).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                    } else {
                        int i33 = c10.d;
                        int i34 = message.id;
                        if (i33 == i34) {
                            c10.d = i34;
                            MessageObject messageObject2 = new MessageObject(i31, message, false, true);
                            c10.e = messageObject2;
                            messageObject2.generateThumbs(false);
                            b2Var.l();
                            NotificationCenter.getInstance(i31).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        } else if ((message.flags & 32768) == 0) {
                            c10.f++;
                            b2Var.l();
                            NotificationCenter.getInstance(i31).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        }
                    }
                }
                if (str3 == null && i18 == 0) {
                    ArrayList<TLRPC.Message> arrayList8 = new ArrayList<>();
                    arrayList8.add(message);
                    MessagesStorage.getInstance(i31).putMessages(arrayList8, true, true, false, DownloadController.getInstance(i31).getAutodownloadMask(), 5, message.quick_reply_shortcut_id);
                    long clientUserId = UserConfig.getInstance(i31).getClientUserId();
                    ArrayList<MessageObject> arrayList9 = new ArrayList<>();
                    arrayList9.add(new MessageObject(i31, message, true, true));
                    MessagesController.getInstance(i31).updateInterfaceWithMessages(clientUserId, arrayList9, 5);
                    break;
                }
                break;
            case 6:
                List list = (List) obj2;
                m4.r rVar = (m4.r) obj;
                m4.a0 a0Var = ((m4.k0) ((a5.a) obj3).d).g;
                if (i18 == -1) {
                    a0Var.t.v0(list);
                } else {
                    a0Var.t.b0(i18, list);
                }
                new SparseBooleanArray().append(20, true);
                a0Var.p(rVar);
                break;
            case 7:
                ((CameraView) obj3).lambda$createCamera$11(i18, (CameraSession) obj2, (CameraView.CameraGLThread) obj);
                break;
            case 8:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj3;
                org.telegram.ui.ActionBar.c5 c5Var = (org.telegram.ui.ActionBar.c5) obj2;
                Runnable runnable2 = (Runnable) obj;
                n7.z0 z0Var = actionBarLayout.d0;
                boolean z16 = false;
                for (int i35 = 0; i35 < i18; i35++) {
                    if (i35 == 0) {
                        n2Var = actionBarLayout.getLastFragment();
                    } else {
                        if ((actionBarLayout.h || actionBarLayout.a0) && actionBarLayout.O0.size() > 1) {
                            n2Var = (org.telegram.ui.ActionBar.n2) org.telegram.ui.Cells.p6.g(2, actionBarLayout.O0);
                        }
                    }
                    if (n2Var != null) {
                        if (c5Var.m != null) {
                            if (actionBarLayout.e0 == null) {
                                org.telegram.ui.ActionBar.f5 f5Var = new org.telegram.ui.ActionBar.f5(0, true, false, z0Var);
                                actionBarLayout.e0 = f5Var;
                                f5Var.J = true;
                                org.telegram.ui.ActionBar.f5 f5Var2 = new org.telegram.ui.ActionBar.f5(1, true, false, z0Var);
                                actionBarLayout.f0 = f5Var2;
                                f5Var2.J = true;
                            }
                            org.telegram.ui.ActionBar.f6 f6Var = c5Var.m;
                            SparseIntArray sparseIntArray = (SparseIntArray) z0Var.b;
                            sparseIntArray.clear();
                            for (int i36 : (int[]) z0Var.c) {
                                sparseIntArray.put(i36, f6Var.h1(i36));
                            }
                        }
                        ArrayList<org.telegram.ui.ActionBar.l6> themeDescriptions = n2Var.getThemeDescriptions();
                        actionBarLayout.d(themeDescriptions);
                        Dialog dialog = n2Var.visibleDialog;
                        if (dialog instanceof org.telegram.ui.ActionBar.f3) {
                            actionBarLayout.d(((org.telegram.ui.ActionBar.f3) dialog).getThemeDescriptions());
                        }
                        if (i35 == 0 && (runnable = c5Var.h) != null) {
                            runnable.run();
                        }
                        actionBarLayout.b(themeDescriptions);
                        Dialog dialog2 = n2Var.visibleDialog;
                        if (dialog2 instanceof org.telegram.ui.ActionBar.f3) {
                            actionBarLayout.b(((org.telegram.ui.ActionBar.f3) dialog2).getThemeDescriptions());
                        }
                        z16 = true;
                    }
                }
                if (z16) {
                    if (!c5Var.e) {
                        int size3 = actionBarLayout.O0.size() - ((actionBarLayout.h || actionBarLayout.a0) ? 2 : 1);
                        for (int i37 = 0; i37 < size3; i37++) {
                            org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) actionBarLayout.O0.get(i37);
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
                        vn vnVar = c5Var.j;
                        if (vnVar != null) {
                            vnVar.run();
                        }
                        if (runnable2 != null) {
                            runnable2.run();
                            break;
                        }
                    } else {
                        int i38 = org.telegram.ui.ActionBar.j6.a;
                        org.telegram.ui.ActionBar.j6.sl = new SparseIntArray();
                        actionBarLayout.setThemeAnimationValue(0.0f);
                        vn vnVar2 = c5Var.i;
                        if (vnVar2 != null) {
                            vnVar2.run();
                        }
                        xn xnVar = c5Var.k;
                        actionBarLayout.g0 = xnVar;
                        if (xnVar != null) {
                            ao aoVar = xnVar.a;
                            aoVar.V.x0.invalidate();
                            aoVar.I.I = 0.0f;
                            aoVar.J.I = 0.0f;
                            aoVar.k(0.0f);
                        }
                        actionBarLayout.l0.lock();
                        AnimatorSet animatorSet = new AnimatorSet();
                        actionBarLayout.k0 = animatorSet;
                        animatorSet.addListener(new t(11, actionBarLayout, c5Var));
                        actionBarLayout.k0.playTogether(ObjectAnimator.ofFloat(actionBarLayout, "themeAnimationValue", 0.0f, 1.0f));
                        actionBarLayout.k0.setDuration(c5Var.l);
                        actionBarLayout.k0.start();
                    }
                }
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
            case 9:
                ((org.telegram.ui.d1) obj3).a(0, false);
                org.telegram.ui.Components.e5.f0(i18, (TLRPC.TL_error) obj2, null, (TLRPC.TL_channels_joinChannel) obj, Boolean.TRUE);
                break;
            case 10:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) obj3;
                ArrayList arrayList10 = (ArrayList) obj2;
                String str4 = (String) obj;
                if (i18 == i4Var.W0) {
                    i4Var.d0(true);
                    i4Var.E = arrayList10;
                    i4Var.F = str4;
                    i4Var.u0[0].c.y.clear();
                    i4Var.u0[0].b.e1();
                    i4Var.W(0);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.d9 d9Var = (org.telegram.ui.d9) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tLObject2 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject2;
                    MessagesController.getInstance(i18).putUsers(tL_users_userFull.users, false);
                    MessagesController.getInstance(i18).putChats(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.voip.d2.m(user2, false, userFull != null && userFull.video_calls_available, d9Var.getParentActivity(), userFull, AccountInstance.getInstance(i18));
                break;
            case 12:
                co coVar = (co) obj3;
                coVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(coVar.T5), (ArrayList) obj2, Boolean.TRUE, (ArrayList) obj, null, 0, Integer.valueOf(i18), Boolean.valueOf(coVar.S4));
                coVar.A3 = null;
                break;
            case 13:
                co coVar2 = (co) obj3;
                boolean[] zArr = (boolean[]) obj2;
                co coVar3 = (co) obj;
                if (!zArr[0] && i18 == coVar2.ic && coVar2.F3 && !coVar2.isFinishing()) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new ug(coVar2, i14), 200L);
                    coVar2.presentFragment(coVar3);
                    if (coVar2.x9() && !coVar3.hideKeyboardOnShow() && (mkVar = coVar3.Y) != null && mkVar.getEditField() != null) {
                        coVar3.Y.getEditField().requestFocus();
                        break;
                    }
                }
                break;
            case 14:
                co coVar4 = (co) obj3;
                coVar4.getClass();
                coVar4.h = ((MessagesStorage) obj2).getEncryptedChat(i18);
                ((CountDownLatch) obj).countDown();
                break;
            case 15:
                uj ujVar = (uj) obj3;
                ArrayList arrayList11 = (ArrayList) obj2;
                ArrayList arrayList12 = (ArrayList) obj;
                yj yjVar = ujVar.n;
                o0 o0Var = yjVar.s;
                if (i18 == ujVar.h) {
                    if (i18 != -1) {
                        s4.h0 adapter = o0Var.getAdapter();
                        uj ujVar2 = yjVar.F;
                        if (adapter != ujVar2) {
                            o0Var.setAdapter(ujVar2);
                        }
                    }
                    ujVar.d = arrayList11;
                    ujVar.e = arrayList12;
                    ujVar.l();
                    break;
                }
                break;
            case 16:
                pm pmVar = (pm) obj3;
                om omVar = (om) obj2;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                qm qmVar = pmVar.P;
                ValueAnimator valueAnimator = qmVar.L;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                qmVar.J = null;
                pmVar.G = 0.0f;
                pmVar.f(omVar, photoEntry, i18);
                pmVar.j();
                pmVar.i(qmVar.P, false);
                break;
            case 17:
                org.telegram.ui.Components.e5.G(((n70) obj3).e, (org.telegram.ui.ActionBar.f6) obj2, new i2.t(i18, (jo) obj, i15));
                break;
            case 18:
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                if (n2Var3.getParentActivity() != null) {
                    if (tLObject3 instanceof Vector) {
                        Vector vector = (Vector) tLObject3;
                        ArrayList arrayList13 = new ArrayList();
                        for (int i39 = 0; i39 < vector.objects.size(); i39++) {
                            try {
                                arrayList13.add(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.Peer) vector.objects.get(i39))));
                            } catch (Exception unused) {
                            }
                        }
                        c10Var = new c10(n2Var3, i18, arrayList13);
                    } else {
                        c10Var = new c10(n2Var3, i18, null);
                    }
                    c10Var.B0 = callback;
                    n2Var3.showDialog(c10Var);
                    break;
                }
                break;
            case 19:
                q30 q30Var = (q30) obj3;
                ArrayList arrayList14 = (ArrayList) obj2;
                q30Var.getClass();
                String lowerCase = ((String) obj).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new dm(q30Var, i18, new ArrayList(), i17));
                    break;
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i40 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i40];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList15 = new ArrayList();
                    int size4 = arrayList14.size();
                    int i41 = 0;
                    while (i41 < size4) {
                        TLObject tLObject4 = (TLObject) arrayList14.get(i41);
                        if (tLObject4 instanceof TLRPC.ChatParticipant) {
                            arrayList = arrayList14;
                            peerId = ((TLRPC.ChatParticipant) tLObject4).user_id;
                        } else {
                            arrayList = arrayList14;
                            if (tLObject4 instanceof TLRPC.ChannelParticipant) {
                                peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject4).peer);
                            }
                            i41++;
                            arrayList14 = arrayList;
                            str = null;
                        }
                        i11 = ((org.telegram.ui.ActionBar.f3) q30Var.w).currentAccount;
                        TLRPC.User user3 = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
                        if (!UserObject.isUserSelf(user3)) {
                            String lowerCase2 = UserObject.getUserName(user3).toLowerCase();
                            String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                            if (lowerCase2.equals(translitString2)) {
                                translitString2 = str;
                            }
                            int i42 = 0;
                            char c11 = 0;
                            while (true) {
                                if (i42 < i40) {
                                    String str5 = strArr[i42];
                                    if (lowerCase2.startsWith(str5) || org.telegram.messenger.w1.w(" ", str5, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str5) || org.telegram.messenger.w1.w(" ", str5, translitString2)))) {
                                        c11 = 1;
                                    } else {
                                        String publicUsername = UserObject.getPublicUsername(user3);
                                        if (publicUsername != null && publicUsername.startsWith(str5)) {
                                            c11 = 2;
                                        }
                                    }
                                    if (c11 != 0) {
                                        arrayList15.add(tLObject4);
                                    } else {
                                        i42++;
                                    }
                                }
                            }
                            i41++;
                            arrayList14 = arrayList;
                            str = null;
                        }
                        i41++;
                        arrayList14 = arrayList;
                        str = null;
                    }
                    AndroidUtilities.runOnUIThread(new dm(q30Var, i18, arrayList15, i17));
                    break;
                }
                break;
            case 20:
                e40 e40Var = (e40) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                String str6 = (String) obj;
                int i43 = e40Var.N;
                ArrayList arrayList16 = e40Var.O;
                if (i18 == e40Var.T) {
                    boolean isEmpty = arrayList16.isEmpty();
                    e40Var.S = false;
                    if (tLObject5 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject5;
                        if (messages_messages2 instanceof TLRPC.TL_messages_messages) {
                            e40Var.W = ((TLRPC.TL_messages_messages) messages_messages2).messages.size();
                        } else if (messages_messages2 instanceof TLRPC.TL_messages_messagesSlice) {
                            e40Var.W = ((TLRPC.TL_messages_messagesSlice) messages_messages2).count;
                        }
                        e40Var.Z = messages_messages2.next_rate;
                        MessagesController.getInstance(i43).putUsers(messages_messages2.users, false);
                        MessagesController.getInstance(i43).putChats(messages_messages2.chats, false);
                        for (int i44 = 0; i44 < messages_messages2.messages.size(); i44++) {
                            MessageObject messageObject3 = new MessageObject(i43, messages_messages2.messages.get(i44), false, true);
                            messageObject3.setQuery(str6);
                            arrayList16.add(messageObject3);
                        }
                        e40Var.V = arrayList16.size() >= e40Var.W;
                        e40Var.W();
                    } else {
                        e40Var.V = true;
                        e40Var.W = arrayList16.size();
                    }
                    e40Var.N(true);
                    if (isEmpty) {
                        ((pn0) e40Var).c0.t0.h1(0, 0);
                        break;
                    }
                }
                break;
            case 21:
                hn0.c(((hn0) obj3).getContext(), i18, ((en0) obj2).a.g(), (org.telegram.ui.ActionBar.f6) obj);
                break;
            case 22:
                mq0 mq0Var = (mq0) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                String str7 = (String) obj;
                HashMap hashMap = mq0Var.v;
                if (i18 == mq0Var.y) {
                    mq0Var.x = 0;
                    if (tLObject6 instanceof TL_account.webPagePreview) {
                        TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject6;
                        MessagesController.getInstance(mq0Var.c).putUsers(webpagepreview.users, false);
                        MessagesController.getInstance(mq0Var.c).putChats(webpagepreview.chats, false);
                        TLRPC.MessageMedia messageMedia = webpagepreview.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            webPage = ((TLRPC.TL_messageMediaWebPage) messageMedia).webpage;
                            if (webPage instanceof TLRPC.TL_webPage) {
                                if (webPage instanceof TLRPC.TL_webPagePending) {
                                    mq0Var.w = webPage;
                                    break;
                                } else if (webPage instanceof TLRPC.TL_webPageEmpty) {
                                    mq0Var.w = null;
                                    if (mq0Var.b != 0) {
                                        mq0Var.b = 0;
                                        lq0 lq0Var = mq0Var.H;
                                        if (lq0Var != null) {
                                            ((xv) lq0Var).h(0);
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
                                mq0Var.w = webPage;
                                mq0.a(mq0Var.a[0], webPage, str7);
                                break;
                            }
                        }
                    }
                    webPage = null;
                    if (webPage instanceof TLRPC.TL_webPage) {
                    }
                }
                break;
            case 23:
                ((xu0) obj3).H0((MessageObject) obj2, (View) obj, i18, false);
                break;
            case 24:
                xu0.g((xu0) obj3, i18, (TL_stories.StoryItem) obj2, (String) obj);
                break;
            case 25:
                org.telegram.ui.Components.e5.f0(i18, (TLRPC.TL_error) obj2, ((xu0) obj3).v1, (TLRPC.TL_messages_editMessage) obj, new Object[0]);
                break;
            case 26:
                tt0 tt0Var = (tt0) obj3;
                ArrayList arrayList17 = (ArrayList) obj2;
                String str8 = (String) obj;
                xu0 xu0Var = tt0Var.v;
                if (tt0Var.h != 0) {
                    if (i18 == tt0Var.n) {
                        int h10 = tt0Var.h();
                        tt0Var.f = arrayList17;
                        tt0Var.s--;
                        int h11 = tt0Var.h();
                        if (tt0Var.s == 0 || h11 != 0) {
                            xu0Var.m1(false);
                        }
                        int i45 = 0;
                        while (true) {
                            qt0[] qt0VarArr = xu0Var.k0;
                            if (i45 < qt0VarArr.length) {
                                qt0 qt0Var = qt0VarArr[i45];
                                if (qt0Var.F == tt0Var.r) {
                                    if (tt0Var.s == 0 && h11 == 0) {
                                        qt0Var.w.d.setText(LocaleController.formatString("NoResultFoundFor", R.string.NoResultFoundFor, str8));
                                        qt0VarArr[i45].w.f.setVisibility(8);
                                        qt0VarArr[i45].w.e(false, true);
                                    } else if (h10 == 0) {
                                        xu0Var.z(qt0Var.h, 0, null);
                                    }
                                }
                                i45++;
                            } else {
                                tt0Var.l();
                            }
                        }
                    }
                    tt0Var.h = 0;
                    break;
                }
                break;
            case 27:
                my0 my0Var = (my0) obj3;
                String[] strArr2 = (String[]) obj2;
                String str9 = (String) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList18 = new ArrayList();
                int i46 = my0Var.a;
                MediaDataController.getInstance(i46).getEmojiSuggestions(strArr2, str9, true, new org.telegram.ui.Components.e2(my0Var, this.b, str9, hashSet, arrayList18, 1), SharedConfig.suggestAnimatedEmoji && UserConfig.getInstance(i46).isPremium());
                break;
            case 28:
                my0 my0Var2 = (my0) obj3;
                String str10 = (String) obj;
                ArrayList arrayList19 = (ArrayList) obj2;
                if (i18 == my0Var2.I) {
                    my0Var2.H = str10;
                    my0Var2.G = 2;
                    arrayList19.remove(arrayList19.size() - 1);
                    if (arrayList19.isEmpty()) {
                        my0Var2.x = true;
                        my0Var2.f();
                        break;
                    } else {
                        my0Var2.x = false;
                        my0Var2.v = false;
                        my0Var2.c();
                        ah.y yVar = my0Var2.d;
                        if (yVar != null) {
                            yVar.setVisibility(0);
                            my0Var2.d.invalidate();
                        }
                        my0Var2.w = arrayList19;
                        jy0 jy0Var = my0Var2.f;
                        if (jy0Var != null) {
                            jy0Var.l();
                            break;
                        }
                    }
                }
                break;
            default:
                k11 k11Var = (k11) obj3;
                ArrayList arrayList20 = (ArrayList) obj2;
                ArrayList arrayList21 = (ArrayList) obj;
                ThemeEditorView.EditorAlert editorAlert = k11Var.r;
                c11 c11Var = editorAlert.c;
                if (i18 == k11Var.d) {
                    k11 k11Var2 = editorAlert.r;
                    if (c11Var.getAdapter() != k11Var2) {
                        editorAlert.F = ThemeEditorView.EditorAlert.J(editorAlert);
                        c11Var.setAdapter(k11Var2);
                        k11Var2.l();
                    }
                    boolean z17 = !k11Var.e.isEmpty() && arrayList20.isEmpty();
                    boolean z18 = k11Var.e.isEmpty() && arrayList20.isEmpty();
                    if (z17) {
                        editorAlert.F = ThemeEditorView.EditorAlert.J(editorAlert);
                    }
                    k11Var.e = arrayList20;
                    k11Var.f = arrayList21;
                    k11Var.l();
                    if (!z18 && !z17 && (i12 = editorAlert.F) > 0) {
                        editorAlert.h.h1(0, -i12);
                        editorAlert.F = -1000;
                    }
                    editorAlert.e.c();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ k8(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = obj2;
        this.e = obj3;
    }

    public /* synthetic */ k8(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = obj2;
        this.b = i10;
        this.e = obj3;
    }

    public /* synthetic */ k8(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
        this.b = i10;
    }

    public /* synthetic */ k8(q30 q30Var, String str, int i10, ArrayList arrayList) {
        this.a = 19;
        this.d = q30Var;
        this.e = str;
        this.b = i10;
        this.c = arrayList;
    }

    public /* synthetic */ k8(my0 my0Var, int i10, String str, ArrayList arrayList) {
        this.a = 28;
        this.d = my0Var;
        this.b = i10;
        this.e = str;
        this.c = arrayList;
    }
}
