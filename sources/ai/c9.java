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
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.e40;
import org.telegram.ui.Components.fu0;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.ko;
import org.telegram.ui.Components.om;
import org.telegram.ui.Components.pm;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.r11;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.uj;
import org.telegram.ui.Components.un0;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.wm;
import org.telegram.ui.Components.yj;
import org.telegram.ui.Components.yq0;
import org.telegram.ui.Components.yy0;
import org.telegram.ui.Components.z11;
import org.telegram.ui.Components.zq0;
import org.telegram.ui.gy;
import org.telegram.ui.lk;
import org.telegram.ui.sn;
import org.telegram.ui.ug;
import org.telegram.ui.un;
import org.telegram.ui.xn;
import org.telegram.ui.xv;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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

    /* JADX WARN: Removed duplicated region for block: B:110:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d6  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        org.telegram.ui.ActionBar.n2 n2Var;
        Runnable runnable;
        TLRPC.UserFull userFull;
        lk lkVar;
        c10 c10Var;
        int i11;
        long peerId;
        int i12;
        TLRPC.WebPage webPage;
        int i13;
        int i14 = this.a;
        int i15 = 7;
        int i16 = 4;
        String str = null;
        int i17 = this.b;
        Object obj = this.e;
        Object obj2 = this.c;
        Object obj3 = this.d;
        switch (i14) {
            case 0:
                d9 d9Var = (d9) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) obj;
                AbstractSet abstractSet = d9Var.k;
                int i18 = d9Var.f;
                AbstractSet abstractSet2 = d9Var.l;
                d9Var.A = -1;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i19 = d9Var.e;
                sb2.append(i19);
                sb2.append("{");
                long j3 = d9Var.d;
                sb2.append(j3);
                sb2.append("} loaded {");
                sb2.append(l9.a(arrayList));
                com.google.android.gms.internal.vision.e2.t("}", sb2);
                ArrayList arrayList2 = d9Var.g;
                arrayList2.clear();
                arrayList2.addAll(tL_stories_stories.pinned_to_top);
                int i20 = d9Var.c;
                boolean z10 = false;
                MessagesController.getInstance(i20).putUsers(tL_stories_stories.users, false);
                MessagesController.getInstance(i20).putChats(tL_stories_stories.chats, false);
                MessagesStorage.getInstance(i20).putUsersAndChats(tL_stories_stories.users, tL_stories_stories.chats, true, true);
                d9Var.u = false;
                d9Var.s = tL_stories_stories.count;
                int i21 = 0;
                while (i21 < arrayList.size()) {
                    d9Var.t((MessageObject) arrayList.get(i21), z10);
                    i21++;
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
                } else if (i18 <= 0) {
                    if (i17 == -1) {
                        if (!abstractSet2.isEmpty()) {
                            ArrayList arrayList3 = new ArrayList(abstractSet2);
                            for (int i22 = 0; i22 < arrayList3.size(); i22++) {
                                Integer num2 = (Integer) arrayList3.get(i22);
                                int intValue2 = num2.intValue();
                                if (!arrayList2.contains(num2)) {
                                    i10 = intValue2;
                                    i17 = i10;
                                }
                            }
                        }
                        i10 = -1;
                        i17 = i10;
                    }
                    int n10 = d9Var.n();
                    Iterator it2 = abstractSet.iterator();
                    while (it2.hasNext()) {
                        Integer num3 = (Integer) it2.next();
                        int intValue3 = num3.intValue();
                        if (!abstractSet2.contains(num3) && intValue3 >= i17 && intValue3 <= n10) {
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
                    d9.B.put(Integer.valueOf(Objects.hash(Integer.valueOf(i20), Integer.valueOf(i19), Long.valueOf(j3), Integer.valueOf(i18))), Long.valueOf(System.currentTimeMillis()));
                } else {
                    d9Var.w();
                }
                d9Var.x();
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new a3.k0(MessagesStorage.getInstance(i17).getUsers((ArrayList) obj2), (HashMap) obj3, (Utilities.Callback) obj, 24));
                break;
            case 2:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj3;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (userFull2 == null) {
                    rVar.run(Boolean.FALSE, "cancelled");
                    break;
                } else {
                    ei.c5.b(i17, user, userFull2, rVar);
                    break;
                }
            case 3:
                gg.i0 i0Var = (gg.i0) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) obj;
                ArrayList arrayList5 = i0Var.K;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - i0Var.n0 >= 300) {
                    i0Var.n0 = elapsedRealtime;
                    int size = arrayList5.size();
                    int size2 = arrayList4.size();
                    int i23 = (arrayList4.isEmpty() && arrayList5.isEmpty()) ? 0 : size2 + size;
                    int min = Math.min(3, size2) + size;
                    int h = i0Var.h();
                    boolean z12 = i0Var.G0;
                    boolean z13 = h > ((z12 ? min : i23) + i17) + 1;
                    s4.j jVar = i0Var.i0;
                    if (jVar != null) {
                        jVar.c = z13 ? 45L : 200L;
                        jVar.d = z13 ? 80L : 200L;
                        jVar.l = z13 ? 270L : 0L;
                    }
                    i0Var.G0 = !z12;
                    w3Var.setRightTextMargin(16);
                    String string = LocaleController.getString(i0Var.G0 ? R.string.ShowMore : R.string.ShowLess);
                    boolean z14 = i0Var.G0;
                    org.telegram.ui.Cells.v3 v3Var = w3Var.b;
                    v3Var.c(string, true, z14);
                    v3Var.setVisibility(0);
                    i0Var.o0 = null;
                    View view = (View) w3Var.getParent();
                    if (view instanceof RecyclerView) {
                        RecyclerView recyclerView = (RecyclerView) view;
                        int i24 = (!i0Var.G0 ? i17 + min : i23 + i17) + 1;
                        int i25 = 0;
                        while (true) {
                            if (i25 < recyclerView.getChildCount()) {
                                View childAt = recyclerView.getChildAt(i25);
                                if (RecyclerView.S(childAt) == i24) {
                                    i0Var.o0 = childAt;
                                } else {
                                    i25++;
                                }
                            }
                        }
                    }
                    int i26 = i17 + min;
                    int i27 = i26 + 1;
                    int max = Math.max(0, size2 - 3);
                    if (i0Var.G0) {
                        i0Var.t(i27, max);
                        if (z13) {
                            AndroidUtilities.runOnUIThread(new n8(i0Var, i26, i15), 350L);
                        } else {
                            i0Var.m(i26);
                        }
                    } else {
                        i0Var.m(i26);
                        i0Var.s(i27, max);
                    }
                    ci.b9 b9Var = i0Var.p0;
                    if (b9Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(b9Var);
                    }
                    if (z13) {
                        i0Var.m0 = true;
                        ci.b9 b9Var2 = new ci.b9(27, i0Var, view);
                        i0Var.p0 = b9Var2;
                        AndroidUtilities.runOnUIThread(b9Var2, 400L);
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
                int i28 = i0Var2.s0;
                if (i17 == i0Var2.d0 && (tLObject instanceof TLRPC.messages_Messages)) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    i0Var2.v = messages_messages instanceof TLRPC.TL_messages_messages ? ((TLRPC.TL_messages_messages) messages_messages).messages.size() : messages_messages instanceof TLRPC.TL_messages_messagesSlice ? ((TLRPC.TL_messages_messagesSlice) messages_messages).count : 0;
                    i0Var2.w = messages_messages.next_rate;
                    i0Var2.y = str2;
                    boolean z15 = false;
                    MessagesController.getInstance(i28).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i28).putChats(messages_messages.chats, false);
                    int i29 = 0;
                    while (i29 < messages_messages.messages.size()) {
                        i0Var2.x.add(new MessageObject(i28, messages_messages.messages.get(i29), z15, true));
                        i29++;
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
                hg.b2 b2Var = (hg.b2) obj3;
                ArrayList arrayList6 = b2Var.b;
                TLRPC.Message message = (TLRPC.Message) obj2;
                String str3 = (String) obj;
                int i30 = b2Var.a;
                if ((message.flags & TLObject.FLAG_30) != 0) {
                    hg.a2 c10 = b2Var.c(message.quick_reply_shortcut_id);
                    if (c10 == null) {
                        hg.a2 a2Var = new hg.a2();
                        a2Var.a = message.quick_reply_shortcut_id;
                        a2Var.d = message.id;
                        MessageObject messageObject = new MessageObject(i30, message, false, true);
                        a2Var.e = messageObject;
                        messageObject.generateThumbs(false);
                        if (str3 != null) {
                            a2Var.b = str3;
                            b2Var.a(str3);
                        }
                        a2Var.e.applyQuickReply(str3, i17);
                        a2Var.f = 1;
                        arrayList6.add(a2Var);
                        for (int i31 = 0; i31 < arrayList6.size(); i31++) {
                            ((hg.a2) arrayList6.get(i31)).c = i31;
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i30);
                        messagesStorage.getStorageQueue().postRunnable(new gg.x1(6, messagesStorage, a2Var));
                        NotificationCenter.getInstance(i30).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                    } else {
                        int i32 = c10.d;
                        int i33 = message.id;
                        if (i32 == i33) {
                            c10.d = i33;
                            MessageObject messageObject2 = new MessageObject(i30, message, false, true);
                            c10.e = messageObject2;
                            messageObject2.generateThumbs(false);
                            b2Var.l();
                            NotificationCenter.getInstance(i30).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        } else if ((message.flags & 32768) == 0) {
                            c10.f++;
                            b2Var.l();
                            NotificationCenter.getInstance(i30).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        }
                    }
                }
                if (str3 == null && i17 == 0) {
                    ArrayList<TLRPC.Message> arrayList7 = new ArrayList<>();
                    arrayList7.add(message);
                    MessagesStorage.getInstance(i30).putMessages(arrayList7, true, true, false, DownloadController.getInstance(i30).getAutodownloadMask(), 5, message.quick_reply_shortcut_id);
                    long clientUserId = UserConfig.getInstance(i30).getClientUserId();
                    ArrayList<MessageObject> arrayList8 = new ArrayList<>();
                    arrayList8.add(new MessageObject(i30, message, true, true));
                    MessagesController.getInstance(i30).updateInterfaceWithMessages(clientUserId, arrayList8, 5);
                    break;
                }
                break;
            case 6:
                List list = (List) obj2;
                m4.r rVar2 = (m4.r) obj;
                m4.a0 a0Var = ((m4.k0) ((a5.a) obj3).d).g;
                if (i17 == -1) {
                    a0Var.t.v0(list);
                } else {
                    a0Var.t.b0(i17, list);
                }
                new SparseBooleanArray().append(20, true);
                a0Var.p(rVar2);
                break;
            case 7:
                ((CameraView) obj3).lambda$createCamera$11(i17, (CameraSession) obj2, (CameraView.CameraGLThread) obj);
                break;
            case 8:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj3;
                org.telegram.ui.ActionBar.c5 c5Var = (org.telegram.ui.ActionBar.c5) obj2;
                Runnable runnable2 = (Runnable) obj;
                n4.y yVar = actionBarLayout.d0;
                boolean z16 = false;
                for (int i34 = 0; i34 < i17; i34++) {
                    if (i34 == 0) {
                        n2Var = actionBarLayout.getLastFragment();
                    } else {
                        if ((actionBarLayout.h || actionBarLayout.a0) && actionBarLayout.O0.size() > 1) {
                            n2Var = (org.telegram.ui.ActionBar.n2) org.telegram.ui.Cells.c1.i(2, actionBarLayout.O0);
                        }
                    }
                    if (n2Var != null) {
                        if (c5Var.m != null) {
                            if (actionBarLayout.e0 == null) {
                                org.telegram.ui.ActionBar.f5 f5Var = new org.telegram.ui.ActionBar.f5(0, true, false, yVar);
                                actionBarLayout.e0 = f5Var;
                                f5Var.J = true;
                                org.telegram.ui.ActionBar.f5 f5Var2 = new org.telegram.ui.ActionBar.f5(1, true, false, yVar);
                                actionBarLayout.f0 = f5Var2;
                                f5Var2.J = true;
                            }
                            org.telegram.ui.ActionBar.f6 f6Var = c5Var.m;
                            SparseIntArray sparseIntArray = (SparseIntArray) yVar.a;
                            sparseIntArray.clear();
                            for (int i35 : (int[]) yVar.b) {
                                sparseIntArray.put(i35, f6Var.g1(i35));
                            }
                        }
                        ArrayList<org.telegram.ui.ActionBar.l6> themeDescriptions = n2Var.getThemeDescriptions();
                        actionBarLayout.d(themeDescriptions);
                        Dialog dialog = n2Var.visibleDialog;
                        if (dialog instanceof org.telegram.ui.ActionBar.f3) {
                            actionBarLayout.d(((org.telegram.ui.ActionBar.f3) dialog).getThemeDescriptions());
                        }
                        if (i34 == 0 && (runnable = c5Var.h) != null) {
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
                        for (int i36 = 0; i36 < size3; i36++) {
                            org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) actionBarLayout.O0.get(i36);
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
                        int i37 = org.telegram.ui.ActionBar.j6.a;
                        org.telegram.ui.ActionBar.j6.sl = new SparseIntArray();
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
                            xnVar.I.I = 0.0f;
                            xnVar.J.I = 0.0f;
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
                ((org.telegram.ui.c1) obj3).a(0, false);
                org.telegram.ui.Components.d5.f0(i17, (TLRPC.TL_error) obj2, null, (TLRPC.TL_channels_joinChannel) obj, Boolean.TRUE);
                break;
            case 10:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) obj3;
                ArrayList arrayList9 = (ArrayList) obj2;
                String str4 = (String) obj;
                if (i17 == h4Var.W0) {
                    h4Var.d0(true);
                    h4Var.E = arrayList9;
                    h4Var.F = str4;
                    h4Var.u0[0].c.y.clear();
                    h4Var.u0[0].b.g1();
                    h4Var.W(0);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.e9 e9Var = (org.telegram.ui.e9) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tLObject2 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject2;
                    MessagesController.getInstance(i17).putUsers(tL_users_userFull.users, false);
                    MessagesController.getInstance(i17).putChats(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.voip.f2.m(user2, false, userFull != null && userFull.video_calls_available, e9Var.getParentActivity(), userFull, AccountInstance.getInstance(i17));
                break;
            case 12:
                zn znVar = (zn) obj3;
                znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(znVar.T5), (ArrayList) obj2, Boolean.TRUE, (ArrayList) obj, null, 0, Integer.valueOf(i17), Boolean.valueOf(znVar.S4));
                znVar.A3 = null;
                break;
            case 13:
                zn znVar2 = (zn) obj3;
                boolean[] zArr = (boolean[]) obj2;
                zn znVar3 = (zn) obj;
                if (!zArr[0] && i17 == znVar2.hc && znVar2.F3 && !znVar2.isFinishing()) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new ug(znVar2, 20), 200L);
                    znVar2.presentFragment(znVar3);
                    if (znVar2.x9() && !znVar3.hideKeyboardOnShow() && (lkVar = znVar3.Y) != null && lkVar.getEditField() != null) {
                        znVar3.Y.getEditField().requestFocus();
                        break;
                    }
                }
                break;
            case 14:
                zn znVar4 = (zn) obj3;
                znVar4.getClass();
                znVar4.h = ((MessagesStorage) obj2).getEncryptedChat(i17);
                ((CountDownLatch) obj).countDown();
                break;
            case 15:
                uj ujVar = (uj) obj3;
                ArrayList arrayList10 = (ArrayList) obj2;
                ArrayList arrayList11 = (ArrayList) obj;
                yj yjVar = ujVar.n;
                w0 w0Var = yjVar.s;
                if (i17 == ujVar.h) {
                    if (i17 != -1) {
                        s4.h0 adapter = w0Var.getAdapter();
                        uj ujVar2 = yjVar.F;
                        if (adapter != ujVar2) {
                            w0Var.setAdapter(ujVar2);
                        }
                    }
                    ujVar.d = arrayList10;
                    ujVar.e = arrayList11;
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
                pmVar.f(omVar, photoEntry, i17);
                pmVar.j();
                pmVar.i(qmVar.P, false);
                break;
            case 17:
                org.telegram.ui.Components.d5.G(((v70) obj3).e, (org.telegram.ui.ActionBar.f6) obj2, new i2.s(i17, (ko) obj, i15));
                break;
            case 18:
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                if (n2Var3.getParentActivity() != null) {
                    if (tLObject3 instanceof Vector) {
                        Vector vector = (Vector) tLObject3;
                        ArrayList arrayList12 = new ArrayList();
                        for (int i38 = 0; i38 < vector.objects.size(); i38++) {
                            try {
                                arrayList12.add(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.Peer) vector.objects.get(i38))));
                            } catch (Exception unused) {
                            }
                        }
                        c10Var = new c10(n2Var3, i17, arrayList12);
                    } else {
                        c10Var = new c10(n2Var3, i17, null);
                    }
                    c10Var.B0 = callback;
                    n2Var3.showDialog(c10Var);
                    break;
                }
                break;
            case 19:
                q30 q30Var = (q30) obj3;
                ArrayList arrayList13 = (ArrayList) obj2;
                q30Var.getClass();
                String lowerCase = ((String) obj).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new wm(q30Var, i17, new ArrayList(), i16));
                    break;
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i39 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i39];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList14 = new ArrayList();
                    int size4 = arrayList13.size();
                    int i40 = 0;
                    while (i40 < size4) {
                        TLObject tLObject4 = (TLObject) arrayList13.get(i40);
                        if (tLObject4 instanceof TLRPC.ChatParticipant) {
                            i11 = i40;
                            peerId = ((TLRPC.ChatParticipant) tLObject4).user_id;
                        } else {
                            i11 = i40;
                            if (tLObject4 instanceof TLRPC.ChannelParticipant) {
                                peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject4).peer);
                            }
                            i40 = i11 + 1;
                            str = null;
                        }
                        i12 = ((org.telegram.ui.ActionBar.f3) q30Var.w).currentAccount;
                        TLRPC.User user3 = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
                        if (!UserObject.isUserSelf(user3)) {
                            String lowerCase2 = UserObject.getUserName(user3).toLowerCase();
                            String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                            if (lowerCase2.equals(translitString2)) {
                                translitString2 = str;
                            }
                            int i41 = 0;
                            char c11 = 0;
                            while (true) {
                                if (i41 < i39) {
                                    String str5 = strArr[i41];
                                    if (lowerCase2.startsWith(str5) || org.telegram.messenger.l0.v(" ", str5, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str5) || org.telegram.messenger.l0.v(" ", str5, translitString2)))) {
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
                                        i41++;
                                    }
                                }
                            }
                            i40 = i11 + 1;
                            str = null;
                        }
                        i40 = i11 + 1;
                        str = null;
                    }
                    AndroidUtilities.runOnUIThread(new wm(q30Var, i17, arrayList14, i16));
                    break;
                }
                break;
            case 20:
                e40 e40Var = (e40) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                String str6 = (String) obj;
                int i42 = e40Var.N;
                ArrayList arrayList15 = e40Var.O;
                if (i17 == e40Var.T) {
                    boolean isEmpty = arrayList15.isEmpty();
                    e40Var.S = false;
                    if (tLObject5 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject5;
                        if (messages_messages2 instanceof TLRPC.TL_messages_messages) {
                            e40Var.W = ((TLRPC.TL_messages_messages) messages_messages2).messages.size();
                        } else if (messages_messages2 instanceof TLRPC.TL_messages_messagesSlice) {
                            e40Var.W = ((TLRPC.TL_messages_messagesSlice) messages_messages2).count;
                        }
                        e40Var.Z = messages_messages2.next_rate;
                        MessagesController.getInstance(i42).putUsers(messages_messages2.users, false);
                        MessagesController.getInstance(i42).putChats(messages_messages2.chats, false);
                        for (int i43 = 0; i43 < messages_messages2.messages.size(); i43++) {
                            MessageObject messageObject3 = new MessageObject(i42, messages_messages2.messages.get(i43), false, true);
                            messageObject3.setQuery(str6);
                            arrayList15.add(messageObject3);
                        }
                        e40Var.V = arrayList15.size() >= e40Var.W;
                        e40Var.W();
                    } else {
                        e40Var.V = true;
                        e40Var.W = arrayList15.size();
                    }
                    e40Var.N(true);
                    if (isEmpty) {
                        ((co0) e40Var).c0.u0.h1(0, 0);
                        break;
                    }
                }
                break;
            case 21:
                un0.c(((un0) obj3).getContext(), i17, ((rn0) obj2).a.g(), (org.telegram.ui.ActionBar.f6) obj);
                break;
            case 22:
                zq0 zq0Var = (zq0) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                String str7 = (String) obj;
                HashMap hashMap = zq0Var.v;
                if (i17 == zq0Var.y) {
                    zq0Var.x = 0;
                    if (tLObject6 instanceof TL_account.webPagePreview) {
                        TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject6;
                        MessagesController.getInstance(zq0Var.c).putUsers(webpagepreview.users, false);
                        MessagesController.getInstance(zq0Var.c).putChats(webpagepreview.chats, false);
                        TLRPC.MessageMedia messageMedia = webpagepreview.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            webPage = ((TLRPC.TL_messageMediaWebPage) messageMedia).webpage;
                            if (webPage instanceof TLRPC.TL_webPage) {
                                if (webPage instanceof TLRPC.TL_webPagePending) {
                                    zq0Var.w = webPage;
                                    break;
                                } else if (webPage instanceof TLRPC.TL_webPageEmpty) {
                                    zq0Var.w = null;
                                    if (zq0Var.b != 0) {
                                        zq0Var.b = 0;
                                        yq0 yq0Var = zq0Var.H;
                                        if (yq0Var != null) {
                                            ((xv) yq0Var).g(0);
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
                                zq0Var.w = webPage;
                                zq0.a(zq0Var.a[0], webPage, str7);
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
                ((jv0) obj3).H0((MessageObject) obj2, (View) obj, i17, false);
                break;
            case 24:
                jv0.g((jv0) obj3, i17, (TL_stories.StoryItem) obj2, (String) obj);
                break;
            case 25:
                org.telegram.ui.Components.d5.f0(i17, (TLRPC.TL_error) obj2, ((jv0) obj3).v1, (TLRPC.TL_messages_editMessage) obj, new Object[0]);
                break;
            case 26:
                fu0 fu0Var = (fu0) obj3;
                ArrayList arrayList16 = (ArrayList) obj2;
                String str8 = (String) obj;
                jv0 jv0Var = fu0Var.v;
                if (fu0Var.h != 0) {
                    if (i17 == fu0Var.n) {
                        int h10 = fu0Var.h();
                        fu0Var.f = arrayList16;
                        fu0Var.s--;
                        int h11 = fu0Var.h();
                        if (fu0Var.s == 0 || h11 != 0) {
                            jv0Var.m1(false);
                        }
                        int i44 = 0;
                        while (true) {
                            cu0[] cu0VarArr = jv0Var.k0;
                            if (i44 < cu0VarArr.length) {
                                cu0 cu0Var = cu0VarArr[i44];
                                if (cu0Var.F == fu0Var.r) {
                                    if (fu0Var.s == 0 && h11 == 0) {
                                        cu0Var.w.d.setText(LocaleController.formatString("NoResultFoundFor", R.string.NoResultFoundFor, str8));
                                        cu0VarArr[i44].w.f.setVisibility(8);
                                        cu0VarArr[i44].w.e(false, true);
                                    } else if (h10 == 0) {
                                        jv0Var.z(cu0Var.h, 0, null);
                                    }
                                }
                                i44++;
                            } else {
                                fu0Var.l();
                            }
                        }
                    }
                    fu0Var.h = 0;
                    break;
                }
                break;
            case 27:
                yy0 yy0Var = (yy0) obj3;
                String[] strArr2 = (String[]) obj2;
                String str9 = (String) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList17 = new ArrayList();
                int i45 = yy0Var.a;
                MediaDataController.getInstance(i45).getEmojiSuggestions(strArr2, str9, true, new org.telegram.ui.Components.d2(yy0Var, this.b, str9, hashSet, arrayList17, 1), SharedConfig.suggestAnimatedEmoji && UserConfig.getInstance(i45).isPremium());
                break;
            case 28:
                yy0 yy0Var2 = (yy0) obj3;
                String str10 = (String) obj;
                ArrayList arrayList18 = (ArrayList) obj2;
                if (i17 == yy0Var2.I) {
                    yy0Var2.H = str10;
                    yy0Var2.G = 2;
                    arrayList18.remove(arrayList18.size() - 1);
                    if (arrayList18.isEmpty()) {
                        yy0Var2.x = true;
                        yy0Var2.f();
                        break;
                    } else {
                        yy0Var2.x = false;
                        yy0Var2.v = false;
                        yy0Var2.c();
                        f0 f0Var = yy0Var2.d;
                        if (f0Var != null) {
                            f0Var.setVisibility(0);
                            yy0Var2.d.invalidate();
                        }
                        yy0Var2.w = arrayList18;
                        vy0 vy0Var = yy0Var2.f;
                        if (vy0Var != null) {
                            vy0Var.l();
                            break;
                        }
                    }
                }
                break;
            default:
                z11 z11Var = (z11) obj3;
                ArrayList arrayList19 = (ArrayList) obj2;
                ArrayList arrayList20 = (ArrayList) obj;
                ThemeEditorView.EditorAlert editorAlert = z11Var.r;
                r11 r11Var = editorAlert.c;
                if (i17 == z11Var.d) {
                    z11 z11Var2 = editorAlert.r;
                    if (r11Var.getAdapter() != z11Var2) {
                        editorAlert.F = ThemeEditorView.EditorAlert.J(editorAlert);
                        r11Var.setAdapter(z11Var2);
                        z11Var2.l();
                    }
                    boolean z17 = !z11Var.e.isEmpty() && arrayList19.isEmpty();
                    boolean z18 = z11Var.e.isEmpty() && arrayList19.isEmpty();
                    if (z17) {
                        editorAlert.F = ThemeEditorView.EditorAlert.J(editorAlert);
                    }
                    z11Var.e = arrayList19;
                    z11Var.f = arrayList20;
                    z11Var.l();
                    if (!z18 && !z17 && (i13 = editorAlert.F) > 0) {
                        editorAlert.h.h1(0, -i13);
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

    public /* synthetic */ c9(q30 q30Var, String str, int i10, ArrayList arrayList) {
        this.a = 19;
        this.d = q30Var;
        this.e = str;
        this.b = i10;
        this.c = arrayList;
    }

    public /* synthetic */ c9(yy0 yy0Var, int i10, String str, ArrayList arrayList) {
        this.a = 28;
        this.d = yy0Var;
        this.b = i10;
        this.e = str;
        this.c = arrayList;
    }
}
