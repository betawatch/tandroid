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
import org.telegram.ui.Components.ao0;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.bk;
import org.telegram.ui.Components.c21;
import org.telegram.ui.Components.er0;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.Components.ho0;
import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.ju0;
import org.telegram.ui.Components.jz0;
import org.telegram.ui.Components.k21;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.Components.no;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.rm;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.tm;
import org.telegram.ui.Components.u30;
import org.telegram.ui.Components.xj;
import org.telegram.ui.Components.xn0;
import org.telegram.ui.Components.zm;
import org.telegram.ui.fy;
import org.telegram.ui.jk;
import org.telegram.ui.rn;
import org.telegram.ui.tn;
import org.telegram.ui.ug;
import org.telegram.ui.wn;
import org.telegram.ui.xv;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final /* synthetic */ class c9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c9(int i10, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback) {
        this.a = 1;
        this.b = i10;
        this.c = arrayList;
        this.d = hashMap;
        this.e = callback;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d1  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        org.telegram.ui.ActionBar.n2 n2Var;
        Runnable runnable;
        TLRPC.UserFull userFull;
        jk jkVar;
        f10 f10Var;
        long peerId;
        int i11;
        TLRPC.WebPage webPage;
        int i12;
        int i13 = this.a;
        int i14 = 8;
        int i15 = 4;
        String str = null;
        int i16 = this.b;
        Object obj = this.e;
        Object obj2 = this.c;
        Object obj3 = this.d;
        switch (i13) {
            case 0:
                d9 d9Var = (d9) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) obj;
                AbstractSet abstractSet = d9Var.k;
                int i17 = d9Var.f;
                AbstractSet abstractSet2 = d9Var.l;
                d9Var.A = -1;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i18 = d9Var.e;
                sb2.append(i18);
                sb2.append("{");
                long j3 = d9Var.d;
                sb2.append(j3);
                sb2.append("} loaded {");
                sb2.append(l9.a(arrayList));
                com.google.android.gms.internal.vision.e2.t("}", sb2);
                ArrayList arrayList2 = d9Var.g;
                arrayList2.clear();
                arrayList2.addAll(tL_stories_stories.pinned_to_top);
                int i19 = d9Var.c;
                boolean z10 = false;
                MessagesController.getInstance(i19).putUsers(tL_stories_stories.users, false);
                MessagesController.getInstance(i19).putChats(tL_stories_stories.chats, false);
                MessagesStorage.getInstance(i19).putUsersAndChats(tL_stories_stories.users, tL_stories_stories.chats, true, true);
                d9Var.u = false;
                d9Var.s = tL_stories_stories.count;
                int i20 = 0;
                while (i20 < arrayList.size()) {
                    d9Var.t((MessageObject) arrayList.get(i20), z10);
                    i20++;
                    z10 = false;
                }
                boolean z11 = abstractSet2.size() >= d9Var.s;
                d9Var.r = z11;
                if (z11) {
                    Iterator it = abstractSet.iterator();
                    while (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        int intValue = num.intValue();
                        if (!abstractSet2.contains(num)) {
                            it.remove();
                            d9Var.u(intValue, false);
                        }
                    }
                } else if (i17 <= 0) {
                    if (i16 == -1) {
                        if (!abstractSet2.isEmpty()) {
                            ArrayList arrayList3 = new ArrayList(abstractSet2);
                            for (int i21 = 0; i21 < arrayList3.size(); i21++) {
                                Integer num2 = (Integer) arrayList3.get(i21);
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
                    int n10 = d9Var.n();
                    Iterator it2 = abstractSet.iterator();
                    while (it2.hasNext()) {
                        Integer num3 = (Integer) it2.next();
                        int intValue3 = num3.intValue();
                        if (!abstractSet2.contains(num3) && intValue3 >= i16 && intValue3 <= n10) {
                            it2.remove();
                            d9Var.u(intValue3, false);
                        }
                    }
                }
                d9Var.d(true);
                if (d9Var.r) {
                    if (d9.B == null) {
                        d9.B = new HashMap();
                    }
                    d9.B.put(Integer.valueOf(Objects.hash(Integer.valueOf(i19), Integer.valueOf(i18), Long.valueOf(j3), Integer.valueOf(i17))), Long.valueOf(System.currentTimeMillis()));
                } else {
                    d9Var.w();
                }
                d9Var.x();
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
                    ei.d5.b(i16, user, userFull2, qVar);
                    break;
                }
            case 3:
                gg.i0 i0Var = (gg.i0) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) obj;
                ArrayList arrayList5 = i0Var.K;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - i0Var.n0 >= 300) {
                    i0Var.n0 = elapsedRealtime;
                    int size = arrayList5.size();
                    int size2 = arrayList4.size();
                    int i22 = (arrayList4.isEmpty() && arrayList5.isEmpty()) ? 0 : size2 + size;
                    int min = Math.min(3, size2) + size;
                    int h = i0Var.h();
                    boolean z12 = i0Var.G0;
                    boolean z13 = h > ((z12 ? min : i22) + i16) + 1;
                    s4.j jVar = i0Var.i0;
                    if (jVar != null) {
                        jVar.c = z13 ? 45L : 200L;
                        jVar.d = z13 ? 80L : 200L;
                        jVar.l = z13 ? 270L : 0L;
                    }
                    i0Var.G0 = !z12;
                    v3Var.setRightTextMargin(16);
                    String string = LocaleController.getString(i0Var.G0 ? R.string.ShowMore : R.string.ShowLess);
                    boolean z14 = i0Var.G0;
                    org.telegram.ui.Cells.u3 u3Var = v3Var.b;
                    u3Var.c(string, true, z14);
                    u3Var.setVisibility(0);
                    i0Var.o0 = null;
                    View view = (View) v3Var.getParent();
                    if (view instanceof RecyclerView) {
                        RecyclerView recyclerView = (RecyclerView) view;
                        int i23 = (!i0Var.G0 ? i16 + min : i22 + i16) + 1;
                        int i24 = 0;
                        while (true) {
                            if (i24 < recyclerView.getChildCount()) {
                                View childAt = recyclerView.getChildAt(i24);
                                if (RecyclerView.R(childAt) == i23) {
                                    i0Var.o0 = childAt;
                                } else {
                                    i24++;
                                }
                            }
                        }
                    }
                    int i25 = i16 + min;
                    int i26 = i25 + 1;
                    int max = Math.max(0, size2 - 3);
                    if (i0Var.G0) {
                        i0Var.t(i26, max);
                        if (z13) {
                            AndroidUtilities.runOnUIThread(new o8(i0Var, i25, 7), 350L);
                        } else {
                            i0Var.m(i25);
                        }
                    } else {
                        i0Var.m(i25);
                        i0Var.s(i26, max);
                    }
                    ci.x8 x8Var = i0Var.p0;
                    if (x8Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(x8Var);
                    }
                    if (z13) {
                        i0Var.m0 = true;
                        ci.x8 x8Var2 = new ci.x8(27, i0Var, view);
                        i0Var.p0 = x8Var2;
                        AndroidUtilities.runOnUIThread(x8Var2, 400L);
                        break;
                    } else {
                        i0Var.m0 = false;
                        break;
                    }
                }
                break;
            case 4:
                gg.i0 i0Var2 = (gg.i0) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str2 = (String) obj;
                int i27 = i0Var2.s0;
                if (i16 == i0Var2.d0 && (tLObject instanceof TLRPC.messages_Messages)) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    i0Var2.v = messages_messages instanceof TLRPC.TL_messages_messages ? ((TLRPC.TL_messages_messages) messages_messages).messages.size() : messages_messages instanceof TLRPC.TL_messages_messagesSlice ? ((TLRPC.TL_messages_messagesSlice) messages_messages).count : 0;
                    i0Var2.w = messages_messages.next_rate;
                    i0Var2.y = str2;
                    boolean z15 = false;
                    MessagesController.getInstance(i27).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i27).putChats(messages_messages.chats, false);
                    int i28 = 0;
                    while (i28 < messages_messages.messages.size()) {
                        i0Var2.x.add(new MessageObject(i27, messages_messages.messages.get(i28), z15, true));
                        i28++;
                        z15 = false;
                    }
                    fy fyVar = i0Var2.U;
                    if (fyVar != null) {
                        fyVar.d(i0Var2.D0 > 0, true);
                    }
                    i0Var2.l();
                    break;
                }
                break;
            case 5:
                hg.b2 b2Var = (hg.b2) obj3;
                ArrayList arrayList6 = b2Var.b;
                TLRPC.Message message = (TLRPC.Message) obj2;
                String str3 = (String) obj;
                int i29 = b2Var.a;
                if ((message.flags & TLObject.FLAG_30) != 0) {
                    hg.a2 c10 = b2Var.c(message.quick_reply_shortcut_id);
                    if (c10 == null) {
                        hg.a2 a2Var = new hg.a2();
                        a2Var.a = message.quick_reply_shortcut_id;
                        a2Var.d = message.id;
                        MessageObject messageObject = new MessageObject(i29, message, false, true);
                        a2Var.e = messageObject;
                        messageObject.generateThumbs(false);
                        if (str3 != null) {
                            a2Var.b = str3;
                            b2Var.a(str3);
                        }
                        a2Var.e.applyQuickReply(str3, i16);
                        a2Var.f = 1;
                        arrayList6.add(a2Var);
                        for (int i30 = 0; i30 < arrayList6.size(); i30++) {
                            ((hg.a2) arrayList6.get(i30)).c = i30;
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i29);
                        messagesStorage.getStorageQueue().postRunnable(new gg.x1(6, messagesStorage, a2Var));
                        NotificationCenter.getInstance(i29).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                    } else {
                        int i31 = c10.d;
                        int i32 = message.id;
                        if (i31 == i32) {
                            c10.d = i32;
                            MessageObject messageObject2 = new MessageObject(i29, message, false, true);
                            c10.e = messageObject2;
                            messageObject2.generateThumbs(false);
                            b2Var.l();
                            NotificationCenter.getInstance(i29).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        } else if ((message.flags & 32768) == 0) {
                            c10.f++;
                            b2Var.l();
                            NotificationCenter.getInstance(i29).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        }
                    }
                }
                if (str3 == null && i16 == 0) {
                    ArrayList<TLRPC.Message> arrayList7 = new ArrayList<>();
                    arrayList7.add(message);
                    MessagesStorage.getInstance(i29).putMessages(arrayList7, true, true, false, DownloadController.getInstance(i29).getAutodownloadMask(), 5, message.quick_reply_shortcut_id);
                    long clientUserId = UserConfig.getInstance(i29).getClientUserId();
                    ArrayList<MessageObject> arrayList8 = new ArrayList<>();
                    arrayList8.add(new MessageObject(i29, message, true, true));
                    MessagesController.getInstance(i29).updateInterfaceWithMessages(clientUserId, arrayList8, 5);
                    break;
                }
                break;
            case 6:
                List list = (List) obj2;
                m4.r rVar = (m4.r) obj;
                m4.a0 a0Var = ((m4.k0) ((a5.a) obj3).d).g;
                if (i16 == -1) {
                    a0Var.t.v0(list);
                } else {
                    a0Var.t.b0(i16, list);
                }
                new SparseBooleanArray().append(20, true);
                a0Var.p(rVar);
                break;
            case 7:
                ((CameraView) obj3).lambda$createCamera$11(i16, (CameraSession) obj2, (CameraView.CameraGLThread) obj);
                break;
            case 8:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj3;
                org.telegram.ui.ActionBar.b5 b5Var = (org.telegram.ui.ActionBar.b5) obj2;
                Runnable runnable2 = (Runnable) obj;
                n7.z0 z0Var = actionBarLayout.d0;
                boolean z16 = false;
                for (int i33 = 0; i33 < i16; i33++) {
                    if (i33 == 0) {
                        n2Var = actionBarLayout.getLastFragment();
                    } else {
                        if ((actionBarLayout.h || actionBarLayout.a0) && actionBarLayout.O0.size() > 1) {
                            n2Var = (org.telegram.ui.ActionBar.n2) sa.e.h(2, actionBarLayout.O0);
                        }
                    }
                    if (n2Var != null) {
                        if (b5Var.m != null) {
                            if (actionBarLayout.e0 == null) {
                                org.telegram.ui.ActionBar.e5 e5Var = new org.telegram.ui.ActionBar.e5(0, true, false, z0Var);
                                actionBarLayout.e0 = e5Var;
                                e5Var.J = true;
                                org.telegram.ui.ActionBar.e5 e5Var2 = new org.telegram.ui.ActionBar.e5(1, true, false, z0Var);
                                actionBarLayout.f0 = e5Var2;
                                e5Var2.J = true;
                            }
                            org.telegram.ui.ActionBar.d6 d6Var = b5Var.m;
                            SparseIntArray sparseIntArray = (SparseIntArray) z0Var.b;
                            sparseIntArray.clear();
                            for (int i34 : (int[]) z0Var.c) {
                                sparseIntArray.put(i34, d6Var.j1(i34));
                            }
                        }
                        ArrayList<org.telegram.ui.ActionBar.k6> themeDescriptions = n2Var.getThemeDescriptions();
                        actionBarLayout.d(themeDescriptions);
                        Dialog dialog = n2Var.visibleDialog;
                        if (dialog instanceof org.telegram.ui.ActionBar.f3) {
                            actionBarLayout.d(((org.telegram.ui.ActionBar.f3) dialog).getThemeDescriptions());
                        }
                        if (i33 == 0 && (runnable = b5Var.h) != null) {
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
                    if (!b5Var.e) {
                        int size3 = actionBarLayout.O0.size() - ((actionBarLayout.h || actionBarLayout.a0) ? 2 : 1);
                        for (int i35 = 0; i35 < size3; i35++) {
                            org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) actionBarLayout.O0.get(i35);
                            n2Var2.clearViews();
                            n2Var2.setParentLayout(actionBarLayout);
                        }
                    }
                    if (b5Var.d) {
                        actionBarLayout.setThemeAnimationValue(1.0f);
                        actionBarLayout.h0.clear();
                        actionBarLayout.b0.clear();
                        actionBarLayout.c0.clear();
                        actionBarLayout.j0.clear();
                        actionBarLayout.i0 = null;
                        actionBarLayout.g0 = null;
                        rn rnVar = b5Var.j;
                        if (rnVar != null) {
                            rnVar.run();
                        }
                        if (runnable2 != null) {
                            runnable2.run();
                            break;
                        }
                    } else {
                        int i36 = org.telegram.ui.ActionBar.i6.a;
                        org.telegram.ui.ActionBar.i6.sl = new SparseIntArray();
                        actionBarLayout.setThemeAnimationValue(0.0f);
                        rn rnVar2 = b5Var.i;
                        if (rnVar2 != null) {
                            rnVar2.run();
                        }
                        tn tnVar = b5Var.k;
                        actionBarLayout.g0 = tnVar;
                        if (tnVar != null) {
                            wn wnVar = tnVar.a;
                            wnVar.V.v0.invalidate();
                            wnVar.I.I = 0.0f;
                            wnVar.J.I = 0.0f;
                            wnVar.k(0.0f);
                        }
                        actionBarLayout.l0.lock();
                        AnimatorSet animatorSet = new AnimatorSet();
                        actionBarLayout.k0 = animatorSet;
                        animatorSet.addListener(new z(11, actionBarLayout, b5Var));
                        actionBarLayout.k0.playTogether(ObjectAnimator.ofFloat(actionBarLayout, "themeAnimationValue", 0.0f, 1.0f));
                        actionBarLayout.k0.setDuration(b5Var.l);
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
                org.telegram.ui.Components.e5.f0(i16, (TLRPC.TL_error) obj2, null, (TLRPC.TL_channels_joinChannel) obj, Boolean.TRUE);
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
                    i4Var.u0[0].b.g1();
                    i4Var.W(0);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.f9 f9Var = (org.telegram.ui.f9) obj3;
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
                org.telegram.ui.Components.voip.g2.m(user2, false, userFull != null && userFull.video_calls_available, f9Var.getParentActivity(), userFull, AccountInstance.getInstance(i16));
                break;
            case 12:
                yn ynVar = (yn) obj3;
                ynVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(ynVar.R5), (ArrayList) obj2, Boolean.TRUE, (ArrayList) obj, null, 0, Integer.valueOf(i16), Boolean.valueOf(ynVar.Q4));
                ynVar.y3 = null;
                break;
            case 13:
                yn ynVar2 = (yn) obj3;
                boolean[] zArr = (boolean[]) obj2;
                yn ynVar3 = (yn) obj;
                if (!zArr[0] && i16 == ynVar2.fc && ynVar2.D3 && !ynVar2.isFinishing()) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new ug(ynVar2, 17), 200L);
                    ynVar2.presentFragment(ynVar3);
                    if (ynVar2.w9() && !ynVar3.hideKeyboardOnShow() && (jkVar = ynVar3.W) != null && jkVar.getEditField() != null) {
                        ynVar3.W.getEditField().requestFocus();
                        break;
                    }
                }
                break;
            case 14:
                yn ynVar4 = (yn) obj3;
                ynVar4.getClass();
                ynVar4.h = ((MessagesStorage) obj2).getEncryptedChat(i16);
                ((CountDownLatch) obj).countDown();
                break;
            case 15:
                xj xjVar = (xj) obj3;
                ArrayList arrayList10 = (ArrayList) obj2;
                ArrayList arrayList11 = (ArrayList) obj;
                bk bkVar = xjVar.n;
                w0 w0Var = bkVar.s;
                if (i16 == xjVar.h) {
                    if (i16 != -1) {
                        s4.h0 adapter = w0Var.getAdapter();
                        xj xjVar2 = bkVar.F;
                        if (adapter != xjVar2) {
                            w0Var.setAdapter(xjVar2);
                        }
                    }
                    xjVar.d = arrayList10;
                    xjVar.e = arrayList11;
                    xjVar.l();
                    break;
                }
                break;
            case 16:
                sm smVar = (sm) obj3;
                rm rmVar = (rm) obj2;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                tm tmVar = smVar.P;
                ValueAnimator valueAnimator = tmVar.L;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                tmVar.J = null;
                smVar.G = 0.0f;
                smVar.f(rmVar, photoEntry, i16);
                smVar.j();
                smVar.i(tmVar.P, false);
                break;
            case 17:
                org.telegram.ui.Components.e5.G(((b80) obj3).e, (org.telegram.ui.ActionBar.d6) obj2, new i2.s(i16, (no) obj, i14));
                break;
            case 18:
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                if (n2Var3.getParentActivity() != null) {
                    if (tLObject3 instanceof Vector) {
                        Vector vector = (Vector) tLObject3;
                        ArrayList arrayList12 = new ArrayList();
                        for (int i37 = 0; i37 < vector.objects.size(); i37++) {
                            try {
                                arrayList12.add(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.Peer) vector.objects.get(i37))));
                            } catch (Exception unused) {
                            }
                        }
                        f10Var = new f10(n2Var3, i16, arrayList12);
                    } else {
                        f10Var = new f10(n2Var3, i16, null);
                    }
                    f10Var.B0 = callback;
                    n2Var3.showDialog(f10Var);
                    break;
                }
                break;
            case 19:
                u30 u30Var = (u30) obj3;
                ArrayList arrayList13 = (ArrayList) obj2;
                u30Var.getClass();
                String lowerCase = ((String) obj).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new zm(u30Var, i16, new ArrayList(), i15));
                    break;
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i38 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i38];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList14 = new ArrayList();
                    int size4 = arrayList13.size();
                    int i39 = 0;
                    while (i39 < size4) {
                        TLObject tLObject4 = (TLObject) arrayList13.get(i39);
                        if (tLObject4 instanceof TLRPC.ChatParticipant) {
                            peerId = ((TLRPC.ChatParticipant) tLObject4).user_id;
                        } else {
                            if (tLObject4 instanceof TLRPC.ChannelParticipant) {
                                peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject4).peer);
                            }
                            i39++;
                            str = null;
                        }
                        i11 = ((org.telegram.ui.ActionBar.f3) u30Var.w).currentAccount;
                        TLRPC.User user3 = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
                        if (!UserObject.isUserSelf(user3)) {
                            String lowerCase2 = UserObject.getUserName(user3).toLowerCase();
                            String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                            if (lowerCase2.equals(translitString2)) {
                                translitString2 = str;
                            }
                            int i40 = 0;
                            char c11 = 0;
                            while (true) {
                                if (i40 < i38) {
                                    String str5 = strArr[i40];
                                    if (lowerCase2.startsWith(str5) || bi.u(" ", str5, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str5) || bi.u(" ", str5, translitString2)))) {
                                        c11 = 1;
                                    } else {
                                        String publicUsername = UserObject.getPublicUsername(user3);
                                        if (publicUsername != null && publicUsername.startsWith(str5)) {
                                            c11 = 2;
                                        }
                                    }
                                    if (c11 != 0) {
                                        arrayList14.add(tLObject4);
                                    } else {
                                        i40++;
                                    }
                                }
                            }
                            i39++;
                            str = null;
                        }
                        i39++;
                        str = null;
                    }
                    AndroidUtilities.runOnUIThread(new zm(u30Var, i16, arrayList14, 4));
                    break;
                }
                break;
            case 20:
                i40 i40Var = (i40) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                String str6 = (String) obj;
                int i41 = i40Var.N;
                ArrayList arrayList15 = i40Var.O;
                if (i16 == i40Var.T) {
                    boolean isEmpty = arrayList15.isEmpty();
                    i40Var.S = false;
                    if (tLObject5 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject5;
                        if (messages_messages2 instanceof TLRPC.TL_messages_messages) {
                            i40Var.W = ((TLRPC.TL_messages_messages) messages_messages2).messages.size();
                        } else if (messages_messages2 instanceof TLRPC.TL_messages_messagesSlice) {
                            i40Var.W = ((TLRPC.TL_messages_messagesSlice) messages_messages2).count;
                        }
                        i40Var.Z = messages_messages2.next_rate;
                        MessagesController.getInstance(i41).putUsers(messages_messages2.users, false);
                        MessagesController.getInstance(i41).putChats(messages_messages2.chats, false);
                        for (int i42 = 0; i42 < messages_messages2.messages.size(); i42++) {
                            MessageObject messageObject3 = new MessageObject(i41, messages_messages2.messages.get(i42), false, true);
                            messageObject3.setQuery(str6);
                            arrayList15.add(messageObject3);
                        }
                        i40Var.V = arrayList15.size() >= i40Var.W;
                        i40Var.W();
                    } else {
                        i40Var.V = true;
                        i40Var.W = arrayList15.size();
                    }
                    i40Var.N(true);
                    if (isEmpty) {
                        ((ho0) i40Var).c0.v0.h1(0, 0);
                        break;
                    }
                }
                break;
            case 21:
                ao0.c(((ao0) obj3).getContext(), i16, ((xn0) obj2).a.g(), (org.telegram.ui.ActionBar.d6) obj);
                break;
            case 22:
                fr0 fr0Var = (fr0) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                String str7 = (String) obj;
                HashMap hashMap = fr0Var.v;
                if (i16 == fr0Var.y) {
                    fr0Var.x = 0;
                    if (tLObject6 instanceof TL_account.webPagePreview) {
                        TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject6;
                        MessagesController.getInstance(fr0Var.c).putUsers(webpagepreview.users, false);
                        MessagesController.getInstance(fr0Var.c).putChats(webpagepreview.chats, false);
                        TLRPC.MessageMedia messageMedia = webpagepreview.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            webPage = ((TLRPC.TL_messageMediaWebPage) messageMedia).webpage;
                            if (webPage instanceof TLRPC.TL_webPage) {
                                if (webPage instanceof TLRPC.TL_webPagePending) {
                                    fr0Var.w = webPage;
                                    break;
                                } else if (webPage instanceof TLRPC.TL_webPageEmpty) {
                                    fr0Var.w = null;
                                    if (fr0Var.b != 0) {
                                        fr0Var.b = 0;
                                        er0 er0Var = fr0Var.H;
                                        if (er0Var != null) {
                                            ((xv) er0Var).i(0);
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
                                fr0Var.w = webPage;
                                fr0.a(fr0Var.a[0], webPage, str7);
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
                ((qv0) obj3).H0((MessageObject) obj2, (View) obj, i16, false);
                break;
            case 24:
                qv0.g((qv0) obj3, i16, (TL_stories.StoryItem) obj2, (String) obj);
                break;
            case 25:
                org.telegram.ui.Components.e5.f0(i16, (TLRPC.TL_error) obj2, ((qv0) obj3).v1, (TLRPC.TL_messages_editMessage) obj, new Object[0]);
                break;
            case 26:
                mu0 mu0Var = (mu0) obj3;
                ArrayList arrayList16 = (ArrayList) obj2;
                String str8 = (String) obj;
                qv0 qv0Var = mu0Var.v;
                if (mu0Var.h != 0) {
                    if (i16 == mu0Var.n) {
                        int h10 = mu0Var.h();
                        mu0Var.f = arrayList16;
                        mu0Var.s--;
                        int h11 = mu0Var.h();
                        if (mu0Var.s == 0 || h11 != 0) {
                            qv0Var.m1(false);
                        }
                        int i43 = 0;
                        while (true) {
                            ju0[] ju0VarArr = qv0Var.k0;
                            if (i43 < ju0VarArr.length) {
                                ju0 ju0Var = ju0VarArr[i43];
                                if (ju0Var.F == mu0Var.r) {
                                    if (mu0Var.s == 0 && h11 == 0) {
                                        ju0Var.w.d.setText(LocaleController.formatString("NoResultFoundFor", R.string.NoResultFoundFor, str8));
                                        ju0VarArr[i43].w.f.setVisibility(8);
                                        ju0VarArr[i43].w.e(false, true);
                                    } else if (h10 == 0) {
                                        qv0Var.z(ju0Var.h, 0, null);
                                    }
                                }
                                i43++;
                            } else {
                                mu0Var.l();
                            }
                        }
                    }
                    mu0Var.h = 0;
                    break;
                }
                break;
            case 27:
                jz0 jz0Var = (jz0) obj3;
                String[] strArr2 = (String[]) obj2;
                String str9 = (String) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList17 = new ArrayList();
                int i44 = jz0Var.a;
                MediaDataController.getInstance(i44).getEmojiSuggestions(strArr2, str9, true, new org.telegram.ui.Components.e2(jz0Var, this.b, str9, hashSet, arrayList17, 1), SharedConfig.suggestAnimatedEmoji && UserConfig.getInstance(i44).isPremium());
                break;
            case 28:
                jz0 jz0Var2 = (jz0) obj3;
                String str10 = (String) obj;
                ArrayList arrayList18 = (ArrayList) obj2;
                if (i16 == jz0Var2.I) {
                    jz0Var2.H = str10;
                    jz0Var2.G = 2;
                    arrayList18.remove(arrayList18.size() - 1);
                    if (arrayList18.isEmpty()) {
                        jz0Var2.x = true;
                        jz0Var2.f();
                        break;
                    } else {
                        jz0Var2.x = false;
                        jz0Var2.v = false;
                        jz0Var2.c();
                        f0 f0Var = jz0Var2.d;
                        if (f0Var != null) {
                            f0Var.setVisibility(0);
                            jz0Var2.d.invalidate();
                        }
                        jz0Var2.w = arrayList18;
                        gz0 gz0Var = jz0Var2.f;
                        if (gz0Var != null) {
                            gz0Var.l();
                            break;
                        }
                    }
                }
                break;
            default:
                k21 k21Var = (k21) obj3;
                ArrayList arrayList19 = (ArrayList) obj2;
                ArrayList arrayList20 = (ArrayList) obj;
                ThemeEditorView.EditorAlert editorAlert = k21Var.r;
                c21 c21Var = editorAlert.c;
                if (i16 == k21Var.d) {
                    k21 k21Var2 = editorAlert.r;
                    if (c21Var.getAdapter() != k21Var2) {
                        editorAlert.F = ThemeEditorView.EditorAlert.H(editorAlert);
                        c21Var.setAdapter(k21Var2);
                        k21Var2.l();
                    }
                    boolean z17 = !k21Var.e.isEmpty() && arrayList19.isEmpty();
                    boolean z18 = k21Var.e.isEmpty() && arrayList19.isEmpty();
                    if (z17) {
                        editorAlert.F = ThemeEditorView.EditorAlert.H(editorAlert);
                    }
                    k21Var.e = arrayList19;
                    k21Var.f = arrayList20;
                    k21Var.l();
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

    public /* synthetic */ c9(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = obj2;
        this.e = obj3;
    }

    public /* synthetic */ c9(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = obj2;
        this.b = i10;
        this.e = obj3;
    }

    public /* synthetic */ c9(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
        this.b = i10;
    }

    public /* synthetic */ c9(u30 u30Var, String str, int i10, ArrayList arrayList) {
        this.a = 19;
        this.d = u30Var;
        this.e = str;
        this.b = i10;
        this.c = arrayList;
    }

    public /* synthetic */ c9(jz0 jz0Var, int i10, String str, ArrayList arrayList) {
        this.a = 28;
        this.d = jz0Var;
        this.b = i10;
        this.e = str;
        this.c = arrayList;
    }
}
