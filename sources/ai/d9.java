package ai;

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
import org.telegram.messenger.bi;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.ap;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.fn;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.h40;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.i21;
import org.telegram.ui.Components.ko0;
import org.telegram.ui.Components.lz0;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.oz0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.q21;
import org.telegram.ui.Components.qr0;
import org.telegram.ui.Components.rr0;
import org.telegram.ui.Components.s10;
import org.telegram.ui.Components.uo0;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.v40;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.Components.yj;
import org.telegram.ui.Components.zk;
import org.telegram.ui.fy;
import org.telegram.ui.ok;
import org.telegram.ui.sn;
import org.telegram.ui.tg;
import org.telegram.ui.un;
import org.telegram.ui.vv;
import org.telegram.ui.xn;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d9(int i10, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback) {
        this.a = 1;
        this.b = i10;
        this.c = arrayList;
        this.d = hashMap;
        this.e = callback;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d9  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        org.telegram.ui.ActionBar.n2 n2Var;
        Runnable runnable;
        TLRPC.UserFull userFull;
        ok okVar;
        s10 s10Var;
        char c10;
        long peerId;
        char c11;
        int i11;
        TLRPC.WebPage webPage;
        int i12;
        int i13 = this.a;
        int i14 = 8;
        int i15 = 5;
        char c12 = 2;
        String str = null;
        int i16 = this.b;
        int i17 = 7;
        Object obj = this.e;
        Object obj2 = this.c;
        int i18 = 6;
        Object obj3 = this.d;
        switch (i13) {
            case 0:
                e9 e9Var = (e9) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) obj;
                AbstractSet abstractSet = e9Var.k;
                int i19 = e9Var.f;
                AbstractSet abstractSet2 = e9Var.l;
                e9Var.A = -1;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i20 = e9Var.e;
                sb2.append(i20);
                sb2.append("{");
                long j3 = e9Var.d;
                sb2.append(j3);
                sb2.append("} loaded {");
                sb2.append(m9.a(arrayList));
                hg.c.t("}", sb2);
                ArrayList arrayList2 = e9Var.g;
                arrayList2.clear();
                arrayList2.addAll(tL_stories_stories.pinned_to_top);
                int i21 = e9Var.c;
                boolean z10 = false;
                MessagesController.getInstance(i21).putUsers(tL_stories_stories.users, false);
                MessagesController.getInstance(i21).putChats(tL_stories_stories.chats, false);
                MessagesStorage.getInstance(i21).putUsersAndChats(tL_stories_stories.users, tL_stories_stories.chats, true, true);
                e9Var.u = false;
                e9Var.s = tL_stories_stories.count;
                int i22 = 0;
                while (i22 < arrayList.size()) {
                    e9Var.t((MessageObject) arrayList.get(i22), z10);
                    i22++;
                    z10 = false;
                }
                boolean z11 = abstractSet2.size() >= e9Var.s;
                e9Var.r = z11;
                if (z11) {
                    Iterator it = abstractSet.iterator();
                    while (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        int intValue = num.intValue();
                        if (!abstractSet2.contains(num)) {
                            it.remove();
                            e9Var.u(intValue, false);
                        }
                    }
                } else if (i19 <= 0) {
                    if (i16 == -1) {
                        if (!abstractSet2.isEmpty()) {
                            ArrayList arrayList3 = new ArrayList(abstractSet2);
                            for (int i23 = 0; i23 < arrayList3.size(); i23++) {
                                Integer num2 = (Integer) arrayList3.get(i23);
                                int intValue2 = num2.intValue();
                                if (!arrayList2.contains(num2)) {
                                    i10 = intValue2;
                                    i16 = i10;
                                }
                            }
                        }
                        i10 = -1;
                        i16 = i10;
                    }
                    int n10 = e9Var.n();
                    Iterator it2 = abstractSet.iterator();
                    while (it2.hasNext()) {
                        Integer num3 = (Integer) it2.next();
                        int intValue3 = num3.intValue();
                        if (!abstractSet2.contains(num3) && intValue3 >= i16 && intValue3 <= n10) {
                            it2.remove();
                            e9Var.u(intValue3, false);
                        }
                    }
                }
                e9Var.d(true);
                if (e9Var.r) {
                    if (e9.B == null) {
                        e9.B = new HashMap();
                    }
                    e9.B.put(Integer.valueOf(Objects.hash(Integer.valueOf(i21), Integer.valueOf(i20), Long.valueOf(j3), Integer.valueOf(i19))), Long.valueOf(System.currentTimeMillis()));
                } else {
                    e9Var.w();
                }
                e9Var.x();
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new a3.k0(MessagesStorage.getInstance(i16).getUsers((ArrayList) obj2), (HashMap) obj3, (Utilities.Callback) obj, 24));
                break;
            case 2:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj3;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (userFull2 == null) {
                    qVar.run(Boolean.FALSE, "cancelled");
                    break;
                } else {
                    ei.b5.b(i16, user, userFull2, qVar);
                    break;
                }
            case 3:
                gg.h0 h0Var = (gg.h0) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) obj;
                ArrayList arrayList5 = h0Var.K;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - h0Var.n0 >= 300) {
                    h0Var.n0 = elapsedRealtime;
                    int size = arrayList5.size();
                    int size2 = arrayList4.size();
                    int i24 = (arrayList4.isEmpty() && arrayList5.isEmpty()) ? 0 : size2 + size;
                    int min = Math.min(3, size2) + size;
                    int h = h0Var.h();
                    boolean z12 = h0Var.G0;
                    boolean z13 = h > ((z12 ? min : i24) + i16) + 1;
                    s4.j jVar = h0Var.i0;
                    if (jVar != null) {
                        jVar.c = z13 ? 45L : 200L;
                        jVar.d = z13 ? 80L : 200L;
                        jVar.l = z13 ? 270L : 0L;
                    }
                    h0Var.G0 = !z12;
                    v3Var.setRightTextMargin(16);
                    String string = LocaleController.getString(h0Var.G0 ? R.string.ShowMore : R.string.ShowLess);
                    boolean z14 = h0Var.G0;
                    org.telegram.ui.Cells.u3 u3Var = v3Var.b;
                    u3Var.c(string, true, z14);
                    u3Var.setVisibility(0);
                    h0Var.o0 = null;
                    View view = (View) v3Var.getParent();
                    if (view instanceof RecyclerView) {
                        RecyclerView recyclerView = (RecyclerView) view;
                        int i25 = (!h0Var.G0 ? i16 + min : i24 + i16) + 1;
                        int i26 = 0;
                        while (true) {
                            if (i26 < recyclerView.getChildCount()) {
                                View childAt = recyclerView.getChildAt(i26);
                                if (RecyclerView.R(childAt) == i25) {
                                    h0Var.o0 = childAt;
                                } else {
                                    i26++;
                                }
                            }
                        }
                    }
                    int i27 = i16 + min;
                    int i28 = i27 + 1;
                    int max = Math.max(0, size2 - 3);
                    if (h0Var.G0) {
                        h0Var.t(i28, max);
                        if (z13) {
                            AndroidUtilities.runOnUIThread(new p8(h0Var, i27, i17), 350L);
                        } else {
                            h0Var.m(i27);
                        }
                    } else {
                        h0Var.m(i27);
                        h0Var.s(i28, max);
                    }
                    ci.y8 y8Var = h0Var.p0;
                    if (y8Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(y8Var);
                    }
                    if (z13) {
                        h0Var.m0 = true;
                        ci.y8 y8Var2 = new ci.y8(26, h0Var, view);
                        h0Var.p0 = y8Var2;
                        AndroidUtilities.runOnUIThread(y8Var2, 400L);
                        break;
                    } else {
                        h0Var.m0 = false;
                        break;
                    }
                }
                break;
            case 4:
                gg.h0 h0Var2 = (gg.h0) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str2 = (String) obj;
                int i29 = h0Var2.s0;
                if (i16 == h0Var2.d0 && (tLObject instanceof TLRPC.messages_Messages)) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    h0Var2.v = messages_messages instanceof TLRPC.TL_messages_messages ? ((TLRPC.TL_messages_messages) messages_messages).messages.size() : messages_messages instanceof TLRPC.TL_messages_messagesSlice ? ((TLRPC.TL_messages_messagesSlice) messages_messages).count : 0;
                    h0Var2.w = messages_messages.next_rate;
                    h0Var2.y = str2;
                    boolean z15 = false;
                    MessagesController.getInstance(i29).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i29).putChats(messages_messages.chats, false);
                    int i30 = 0;
                    while (i30 < messages_messages.messages.size()) {
                        h0Var2.x.add(new MessageObject(i29, messages_messages.messages.get(i30), z15, true));
                        i30++;
                        z15 = false;
                    }
                    fy fyVar = h0Var2.U;
                    if (fyVar != null) {
                        fyVar.d(h0Var2.D0 > 0, true);
                    }
                    h0Var2.l();
                    break;
                }
                break;
            case 5:
                hg.c2 c2Var = (hg.c2) obj3;
                ArrayList arrayList6 = c2Var.b;
                TLRPC.Message message = (TLRPC.Message) obj2;
                String str3 = (String) obj;
                int i31 = c2Var.a;
                if ((message.flags & TLObject.FLAG_30) != 0) {
                    hg.b2 c13 = c2Var.c(message.quick_reply_shortcut_id);
                    if (c13 == null) {
                        hg.b2 b2Var = new hg.b2();
                        b2Var.a = message.quick_reply_shortcut_id;
                        b2Var.d = message.id;
                        MessageObject messageObject = new MessageObject(i31, message, false, true);
                        b2Var.e = messageObject;
                        messageObject.generateThumbs(false);
                        if (str3 != null) {
                            b2Var.b = str3;
                            c2Var.a(str3);
                        }
                        b2Var.e.applyQuickReply(str3, i16);
                        b2Var.f = 1;
                        arrayList6.add(b2Var);
                        for (int i32 = 0; i32 < arrayList6.size(); i32++) {
                            ((hg.b2) arrayList6.get(i32)).c = i32;
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i31);
                        messagesStorage.getStorageQueue().postRunnable(new gg.w1(i18, messagesStorage, b2Var));
                        NotificationCenter.getInstance(i31).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                    } else {
                        int i33 = c13.d;
                        int i34 = message.id;
                        if (i33 == i34) {
                            c13.d = i34;
                            MessageObject messageObject2 = new MessageObject(i31, message, false, true);
                            c13.e = messageObject2;
                            messageObject2.generateThumbs(false);
                            c2Var.l();
                            NotificationCenter.getInstance(i31).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        } else if ((message.flags & 32768) == 0) {
                            c13.f++;
                            c2Var.l();
                            NotificationCenter.getInstance(i31).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        }
                    }
                }
                if (str3 == null && i16 == 0) {
                    ArrayList<TLRPC.Message> arrayList7 = new ArrayList<>();
                    arrayList7.add(message);
                    MessagesStorage.getInstance(i31).putMessages(arrayList7, true, true, false, DownloadController.getInstance(i31).getAutodownloadMask(), 5, message.quick_reply_shortcut_id);
                    long clientUserId = UserConfig.getInstance(i31).getClientUserId();
                    ArrayList<MessageObject> arrayList8 = new ArrayList<>();
                    arrayList8.add(new MessageObject(i31, message, true, true));
                    MessagesController.getInstance(i31).updateInterfaceWithMessages(clientUserId, arrayList8, 5);
                    break;
                }
                break;
            case 6:
                List list = (List) obj2;
                m4.r rVar = (m4.r) obj;
                m4.b0 b0Var = ((m4.l0) ((a5.a) obj3).d).g;
                if (i16 == -1) {
                    b0Var.t.v0(list);
                } else {
                    b0Var.t.b0(i16, list);
                }
                new SparseBooleanArray().append(20, true);
                b0Var.p(rVar);
                break;
            case 7:
                ((CameraView) obj3).lambda$createCamera$11(i16, (CameraSession) obj2, (CameraView.CameraGLThread) obj);
                break;
            case 8:
                int i35 = 2;
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj3;
                org.telegram.ui.ActionBar.c5 c5Var = (org.telegram.ui.ActionBar.c5) obj2;
                Runnable runnable2 = (Runnable) obj;
                org.telegram.ui.ActionBar.b5 b5Var = actionBarLayout.d0;
                int i36 = 0;
                boolean z16 = false;
                while (i36 < i16) {
                    if (i36 == 0) {
                        n2Var = actionBarLayout.getLastFragment();
                    } else {
                        if ((actionBarLayout.h || actionBarLayout.a0) && actionBarLayout.O0.size() > 1) {
                            n2Var = (org.telegram.ui.ActionBar.n2) sc.v.h(i35, actionBarLayout.O0);
                        }
                        i36++;
                        i35 = 2;
                    }
                    if (n2Var != null) {
                        if (c5Var.m != null) {
                            if (actionBarLayout.e0 == null) {
                                org.telegram.ui.ActionBar.f5 f5Var = new org.telegram.ui.ActionBar.f5(0, true, false, b5Var);
                                actionBarLayout.e0 = f5Var;
                                f5Var.L = true;
                                org.telegram.ui.ActionBar.f5 f5Var2 = new org.telegram.ui.ActionBar.f5(1, true, false, b5Var);
                                actionBarLayout.f0 = f5Var2;
                                f5Var2.L = true;
                            }
                            org.telegram.ui.ActionBar.e6 e6Var = c5Var.m;
                            SparseIntArray sparseIntArray = (SparseIntArray) b5Var.b;
                            sparseIntArray.clear();
                            for (int i37 : (int[]) b5Var.c) {
                                sparseIntArray.put(i37, e6Var.a1(i37));
                            }
                        }
                        ArrayList<org.telegram.ui.ActionBar.k6> themeDescriptions = n2Var.getThemeDescriptions();
                        actionBarLayout.d(themeDescriptions);
                        Dialog dialog = n2Var.visibleDialog;
                        if (dialog instanceof org.telegram.ui.ActionBar.f3) {
                            actionBarLayout.d(((org.telegram.ui.ActionBar.f3) dialog).getThemeDescriptions());
                        }
                        if (i36 == 0 && (runnable = c5Var.h) != null) {
                            runnable.run();
                        }
                        actionBarLayout.b(themeDescriptions);
                        Dialog dialog2 = n2Var.visibleDialog;
                        if (dialog2 instanceof org.telegram.ui.ActionBar.f3) {
                            actionBarLayout.b(((org.telegram.ui.ActionBar.f3) dialog2).getThemeDescriptions());
                        }
                        z16 = true;
                    }
                    i36++;
                    i35 = 2;
                }
                if (z16) {
                    if (!c5Var.e) {
                        int size3 = actionBarLayout.O0.size() - ((actionBarLayout.h || actionBarLayout.a0) ? 2 : 1);
                        for (int i38 = 0; i38 < size3; i38++) {
                            org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) actionBarLayout.O0.get(i38);
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
                        sn snVar = c5Var.j;
                        if (snVar != null) {
                            snVar.run();
                        }
                        if (runnable2 != null) {
                            runnable2.run();
                            break;
                        }
                    } else {
                        int i39 = org.telegram.ui.ActionBar.i6.a;
                        org.telegram.ui.ActionBar.i6.vl = new SparseIntArray();
                        actionBarLayout.setThemeAnimationValue(0.0f);
                        sn snVar2 = c5Var.i;
                        if (snVar2 != null) {
                            snVar2.run();
                        }
                        un unVar = c5Var.k;
                        actionBarLayout.g0 = unVar;
                        if (unVar != null) {
                            xn xnVar = unVar.a;
                            xnVar.V.x0.invalidate();
                            xnVar.I.K = 0.0f;
                            xnVar.J.K = 0.0f;
                            xnVar.k(0.0f);
                        }
                        actionBarLayout.l0.lock();
                        AnimatorSet animatorSet = new AnimatorSet();
                        actionBarLayout.k0 = animatorSet;
                        animatorSet.addListener(new z(11, actionBarLayout, c5Var));
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
                org.telegram.ui.Components.g5.e0(i16, (TLRPC.TL_error) obj2, null, (TLRPC.TL_channels_joinChannel) obj, Boolean.TRUE);
                break;
            case 10:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) obj3;
                ArrayList arrayList9 = (ArrayList) obj2;
                String str4 = (String) obj;
                if (i16 == i4Var.W0) {
                    i4Var.d0(true);
                    i4Var.E = arrayList9;
                    i4Var.F = str4;
                    i4Var.u0[0].c.y.clear();
                    i4Var.u0[0].b.f1();
                    i4Var.W(0);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.c9 c9Var = (org.telegram.ui.c9) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tLObject2 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject2;
                    MessagesController.getInstance(i16).putUsers(tL_users_userFull.users, false);
                    MessagesController.getInstance(i16).putChats(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.voip.f2.m(user2, false, userFull != null && userFull.video_calls_available, c9Var.getParentActivity(), userFull, AccountInstance.getInstance(i16));
                break;
            case 12:
                zn znVar = (zn) obj3;
                znVar.getClass();
                znVar.h = ((MessagesStorage) obj2).getEncryptedChat(i16);
                ((CountDownLatch) obj).countDown();
                break;
            case 13:
                zn znVar2 = (zn) obj3;
                znVar2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(znVar2.T5), (ArrayList) obj2, Boolean.TRUE, (ArrayList) obj, null, 0, Integer.valueOf(i16), Boolean.valueOf(znVar2.S4));
                znVar2.A3 = null;
                break;
            case 14:
                zn znVar3 = (zn) obj3;
                boolean[] zArr = (boolean[]) obj2;
                zn znVar4 = (zn) obj;
                if (!zArr[0] && i16 == znVar3.ic && znVar3.F3 && !znVar3.isFinishing()) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new tg(znVar3, 21), 200L);
                    znVar3.presentFragment(znVar4);
                    if (znVar3.C9() && !znVar4.hideKeyboardOnShow() && (okVar = znVar4.Y) != null && okVar.getEditField() != null) {
                        znVar4.Y.getEditField().requestFocus();
                        break;
                    }
                }
                break;
            case 15:
                yj yjVar = (yj) obj3;
                ArrayList arrayList10 = (ArrayList) obj2;
                ArrayList arrayList11 = (ArrayList) obj;
                ck ckVar = yjVar.n;
                w0 w0Var = ckVar.s;
                if (i16 == yjVar.h) {
                    if (i16 != -1) {
                        s4.i0 adapter = w0Var.getAdapter();
                        yj yjVar2 = ckVar.F;
                        if (adapter != yjVar2) {
                            w0Var.setAdapter(yjVar2);
                        }
                    }
                    yjVar.d = arrayList10;
                    yjVar.e = arrayList11;
                    yjVar.l();
                    break;
                }
                break;
            case 16:
                gn gnVar = (gn) obj3;
                fn fnVar = (fn) obj2;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                hn hnVar = gnVar.P;
                ValueAnimator valueAnimator = hnVar.L;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                hnVar.J = null;
                gnVar.G = 0.0f;
                gnVar.f(fnVar, photoEntry, i16);
                gnVar.j();
                gnVar.i(hnVar.P, false);
                break;
            case 17:
                org.telegram.ui.Components.g5.F(((p80) obj3).e, (org.telegram.ui.ActionBar.e6) obj2, new i2.s(i16, (ap) obj, i14));
                break;
            case 18:
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                if (n2Var3.getParentActivity() != null) {
                    if (tLObject3 instanceof Vector) {
                        Vector vector = (Vector) tLObject3;
                        ArrayList arrayList12 = new ArrayList();
                        for (int i40 = 0; i40 < vector.objects.size(); i40++) {
                            try {
                                arrayList12.add(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.Peer) vector.objects.get(i40))));
                            } catch (Exception unused) {
                            }
                        }
                        s10Var = new s10(n2Var3, i16, arrayList12);
                    } else {
                        s10Var = new s10(n2Var3, i16, null);
                    }
                    s10Var.B0 = callback;
                    n2Var3.showDialog(s10Var);
                    break;
                }
                break;
            case 19:
                h40 h40Var = (h40) obj3;
                ArrayList arrayList13 = (ArrayList) obj2;
                h40Var.getClass();
                String lowerCase = ((String) obj).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new zk(h40Var, i16, new ArrayList(), i15));
                    break;
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i41 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i41];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList14 = new ArrayList();
                    int size4 = arrayList13.size();
                    int i42 = 0;
                    while (i42 < size4) {
                        TLObject tLObject4 = (TLObject) arrayList13.get(i42);
                        if (tLObject4 instanceof TLRPC.ChatParticipant) {
                            c10 = r14;
                            peerId = ((TLRPC.ChatParticipant) tLObject4).user_id;
                        } else {
                            c10 = r14;
                            if (tLObject4 instanceof TLRPC.ChannelParticipant) {
                                peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject4).peer);
                            }
                            c11 = c12;
                            i42++;
                            r14 = c10;
                            c12 = c11;
                            str = null;
                        }
                        i11 = ((org.telegram.ui.ActionBar.f3) h40Var.w).currentAccount;
                        TLRPC.User user3 = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
                        if (!UserObject.isUserSelf(user3)) {
                            String lowerCase2 = UserObject.getUserName(user3).toLowerCase();
                            String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                            if (lowerCase2.equals(translitString2)) {
                                translitString2 = str;
                            }
                            c11 = c12;
                            int i43 = 0;
                            char c14 = 0;
                            while (true) {
                                if (i43 < i41) {
                                    String str5 = strArr[i43];
                                    if (lowerCase2.startsWith(str5) || bi.w(" ", str5, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str5) || bi.w(" ", str5, translitString2)))) {
                                        c14 = c10;
                                    } else {
                                        String publicUsername = UserObject.getPublicUsername(user3);
                                        if (publicUsername != null && publicUsername.startsWith(str5)) {
                                            c14 = c11;
                                        }
                                    }
                                    if (c14 != 0) {
                                        arrayList14.add(tLObject4);
                                    } else {
                                        i43++;
                                    }
                                }
                            }
                            i42++;
                            r14 = c10;
                            c12 = c11;
                            str = null;
                        }
                        c11 = c12;
                        i42++;
                        r14 = c10;
                        c12 = c11;
                        str = null;
                    }
                    AndroidUtilities.runOnUIThread(new zk(h40Var, i16, arrayList14, 5));
                    break;
                }
                break;
            case 20:
                v40 v40Var = (v40) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                String str6 = (String) obj;
                int i44 = v40Var.N;
                ArrayList arrayList15 = v40Var.O;
                if (i16 == v40Var.T) {
                    boolean isEmpty = arrayList15.isEmpty();
                    v40Var.S = false;
                    if (tLObject5 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject5;
                        if (messages_messages2 instanceof TLRPC.TL_messages_messages) {
                            v40Var.W = ((TLRPC.TL_messages_messages) messages_messages2).messages.size();
                        } else if (messages_messages2 instanceof TLRPC.TL_messages_messagesSlice) {
                            v40Var.W = ((TLRPC.TL_messages_messagesSlice) messages_messages2).count;
                        }
                        v40Var.Z = messages_messages2.next_rate;
                        MessagesController.getInstance(i44).putUsers(messages_messages2.users, false);
                        MessagesController.getInstance(i44).putChats(messages_messages2.chats, false);
                        for (int i45 = 0; i45 < messages_messages2.messages.size(); i45++) {
                            MessageObject messageObject3 = new MessageObject(i44, messages_messages2.messages.get(i45), false, true);
                            messageObject3.setQuery(str6);
                            arrayList15.add(messageObject3);
                        }
                        v40Var.V = arrayList15.size() >= v40Var.W;
                        v40Var.W();
                    } else {
                        v40Var.V = true;
                        v40Var.W = arrayList15.size();
                    }
                    v40Var.N(true);
                    if (isEmpty) {
                        ((uo0) v40Var).c0.t0.h1(0, 0);
                        break;
                    }
                }
                break;
            case 21:
                no0.c(((no0) obj3).getContext(), i16, ((ko0) obj2).a.g(), (org.telegram.ui.ActionBar.e6) obj);
                break;
            case 22:
                rr0 rr0Var = (rr0) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                String str7 = (String) obj;
                HashMap hashMap = rr0Var.v;
                if (i16 == rr0Var.y) {
                    rr0Var.x = 0;
                    if (tLObject6 instanceof TL_account.webPagePreview) {
                        TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject6;
                        MessagesController.getInstance(rr0Var.c).putUsers(webpagepreview.users, false);
                        MessagesController.getInstance(rr0Var.c).putChats(webpagepreview.chats, false);
                        TLRPC.MessageMedia messageMedia = webpagepreview.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            webPage = ((TLRPC.TL_messageMediaWebPage) messageMedia).webpage;
                            if (webPage instanceof TLRPC.TL_webPage) {
                                if (webPage instanceof TLRPC.TL_webPagePending) {
                                    rr0Var.w = webPage;
                                    break;
                                } else if (webPage instanceof TLRPC.TL_webPageEmpty) {
                                    rr0Var.w = null;
                                    if (rr0Var.b != 0) {
                                        rr0Var.b = 0;
                                        qr0 qr0Var = rr0Var.H;
                                        if (qr0Var != null) {
                                            ((vv) qr0Var).h(0);
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
                                rr0Var.w = webPage;
                                rr0.a(rr0Var.a[0], webPage, str7);
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
                ((bw0) obj3).H0((MessageObject) obj2, (View) obj, i16, false);
                break;
            case 24:
                bw0.e((bw0) obj3, i16, (TL_stories.StoryItem) obj2, (String) obj);
                break;
            case 25:
                org.telegram.ui.Components.g5.e0(i16, (TLRPC.TL_error) obj2, ((bw0) obj3).v1, (TLRPC.TL_messages_editMessage) obj, new Object[0]);
                break;
            case 26:
                xu0 xu0Var = (xu0) obj3;
                ArrayList arrayList16 = (ArrayList) obj2;
                String str8 = (String) obj;
                bw0 bw0Var = xu0Var.v;
                if (xu0Var.h != 0) {
                    if (i16 == xu0Var.n) {
                        int h10 = xu0Var.h();
                        xu0Var.f = arrayList16;
                        xu0Var.s--;
                        int h11 = xu0Var.h();
                        if (xu0Var.s == 0 || h11 != 0) {
                            bw0Var.m1(false);
                        }
                        int i46 = 0;
                        while (true) {
                            uu0[] uu0VarArr = bw0Var.k0;
                            if (i46 < uu0VarArr.length) {
                                uu0 uu0Var = uu0VarArr[i46];
                                if (uu0Var.F == xu0Var.r) {
                                    if (xu0Var.s == 0 && h11 == 0) {
                                        uu0Var.w.d.setText(LocaleController.formatString("NoResultFoundFor", R.string.NoResultFoundFor, str8));
                                        uu0VarArr[i46].w.f.setVisibility(8);
                                        uu0VarArr[i46].w.e(false, true);
                                    } else if (h10 == 0) {
                                        bw0Var.z(uu0Var.h, 0, null);
                                    }
                                }
                                i46++;
                            } else {
                                xu0Var.l();
                            }
                        }
                    }
                    xu0Var.h = 0;
                    break;
                }
                break;
            case 27:
                oz0 oz0Var = (oz0) obj3;
                String[] strArr2 = (String[]) obj2;
                String str9 = (String) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList17 = new ArrayList();
                int i47 = oz0Var.a;
                MediaDataController.getInstance(i47).getEmojiSuggestions(strArr2, str9, true, new org.telegram.ui.Components.e2(oz0Var, this.b, str9, hashSet, arrayList17, 1), SharedConfig.suggestAnimatedEmoji && UserConfig.getInstance(i47).isPremium());
                break;
            case 28:
                oz0 oz0Var2 = (oz0) obj3;
                String str10 = (String) obj;
                ArrayList arrayList18 = (ArrayList) obj2;
                if (i16 == oz0Var2.I) {
                    oz0Var2.H = str10;
                    oz0Var2.G = 2;
                    arrayList18.remove(arrayList18.size() - 1);
                    if (arrayList18.isEmpty()) {
                        oz0Var2.x = true;
                        oz0Var2.f();
                        break;
                    } else {
                        oz0Var2.x = false;
                        oz0Var2.v = false;
                        oz0Var2.c();
                        f0 f0Var = oz0Var2.d;
                        if (f0Var != null) {
                            f0Var.setVisibility(0);
                            oz0Var2.d.invalidate();
                        }
                        oz0Var2.w = arrayList18;
                        lz0 lz0Var = oz0Var2.f;
                        if (lz0Var != null) {
                            lz0Var.l();
                            break;
                        }
                    }
                }
                break;
            default:
                q21 q21Var = (q21) obj3;
                ArrayList arrayList19 = (ArrayList) obj2;
                ArrayList arrayList20 = (ArrayList) obj;
                ThemeEditorView.EditorAlert editorAlert = q21Var.r;
                i21 i21Var = editorAlert.c;
                if (i16 == q21Var.d) {
                    q21 q21Var2 = editorAlert.r;
                    if (i21Var.getAdapter() != q21Var2) {
                        editorAlert.F = ThemeEditorView.EditorAlert.K(editorAlert);
                        i21Var.setAdapter(q21Var2);
                        q21Var2.l();
                    }
                    boolean z17 = !q21Var.e.isEmpty() && arrayList19.isEmpty();
                    r14 = (q21Var.e.isEmpty() && arrayList19.isEmpty()) ? (char) 1 : (char) 0;
                    if (z17) {
                        editorAlert.F = ThemeEditorView.EditorAlert.K(editorAlert);
                    }
                    q21Var.e = arrayList19;
                    q21Var.f = arrayList20;
                    q21Var.l();
                    if (r14 == 0 && !z17 && (i12 = editorAlert.F) > 0) {
                        editorAlert.h.h1(0, -i12);
                        editorAlert.F = -1000;
                    }
                    editorAlert.e.c();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d9(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = obj2;
        this.e = obj3;
    }

    public /* synthetic */ d9(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = obj2;
        this.b = i10;
        this.e = obj3;
    }

    public /* synthetic */ d9(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
        this.b = i10;
    }

    public /* synthetic */ d9(h40 h40Var, String str, int i10, ArrayList arrayList) {
        this.a = 19;
        this.d = h40Var;
        this.e = str;
        this.b = i10;
        this.c = arrayList;
    }

    public /* synthetic */ d9(oz0 oz0Var, int i10, String str, ArrayList arrayList) {
        this.a = 28;
        this.d = oz0Var;
        this.b = i10;
        this.e = str;
        this.c = arrayList;
    }
}
