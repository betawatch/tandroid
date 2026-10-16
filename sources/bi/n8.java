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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.cn;
import org.telegram.ui.Components.d40;
import org.telegram.ui.Components.dn;
import org.telegram.ui.Components.en;
import org.telegram.ui.Components.ho0;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.ko0;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.lz0;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.o10;
import org.telegram.ui.Components.qo0;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.vj;
import org.telegram.ui.Components.xo;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.zj;
import org.telegram.ui.aw;
import org.telegram.ui.co;
import org.telegram.ui.fo;
import org.telegram.ui.gm;
import org.telegram.ui.ky;
import org.telegram.ui.sk;
import org.telegram.ui.xg;
import org.telegram.ui.xn;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n8(int i10, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback) {
        this.a = 1;
        this.b = i10;
        this.c = arrayList;
        this.d = hashMap;
        this.e = callback;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0194  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        org.telegram.ui.ActionBar.m2 m2Var;
        Runnable runnable;
        TLRPC.UserFull userFull;
        sk skVar;
        o10 o10Var;
        int i11;
        int i12;
        long peerId;
        int i13;
        int i14;
        TLRPC.WebPage webPage;
        int i15 = this.a;
        int i16 = 6;
        int i17 = 8;
        int i18 = 2;
        String str = null;
        int i19 = 1;
        int i20 = 0;
        int i21 = this.b;
        int i22 = 7;
        Object obj = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i15) {
            case 0:
                o8 o8Var = (o8) obj3;
                ArrayList arrayList = (ArrayList) obj;
                TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) obj2;
                AbstractSet abstractSet = o8Var.k;
                int i23 = o8Var.f;
                AbstractSet abstractSet2 = o8Var.l;
                o8Var.A = -1;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i24 = o8Var.e;
                sb2.append(i24);
                sb2.append("{");
                long j10 = o8Var.d;
                sb2.append(j10);
                sb2.append("} loaded {");
                sb2.append(x8.a(arrayList));
                i2.d.v("}", sb2);
                ArrayList arrayList2 = o8Var.g;
                arrayList2.clear();
                arrayList2.addAll(tL_stories_stories.pinned_to_top);
                int i25 = o8Var.c;
                boolean z10 = false;
                MessagesController.getInstance(i25).putUsers(tL_stories_stories.users, false);
                MessagesController.getInstance(i25).putChats(tL_stories_stories.chats, false);
                MessagesStorage.getInstance(i25).putUsersAndChats(tL_stories_stories.users, tL_stories_stories.chats, true, true);
                o8Var.u = false;
                o8Var.s = tL_stories_stories.count;
                int i26 = 0;
                while (i26 < arrayList.size()) {
                    o8Var.t((MessageObject) arrayList.get(i26), z10);
                    i26++;
                    z10 = false;
                }
                boolean z11 = abstractSet2.size() >= o8Var.s;
                o8Var.r = z11;
                if (z11) {
                    Iterator it = abstractSet.iterator();
                    while (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        int intValue = num.intValue();
                        if (!abstractSet2.contains(num)) {
                            it.remove();
                            o8Var.u(intValue, false);
                        }
                    }
                } else if (i23 <= 0) {
                    if (i21 == -1) {
                        if (!abstractSet2.isEmpty()) {
                            ArrayList arrayList3 = new ArrayList(abstractSet2);
                            for (int i27 = 0; i27 < arrayList3.size(); i27++) {
                                Integer num2 = (Integer) arrayList3.get(i27);
                                int intValue2 = num2.intValue();
                                if (!arrayList2.contains(num2)) {
                                    i10 = intValue2;
                                    i21 = i10;
                                }
                            }
                        }
                        i10 = -1;
                        i21 = i10;
                    }
                    int n10 = o8Var.n();
                    Iterator it2 = abstractSet.iterator();
                    while (it2.hasNext()) {
                        Integer num3 = (Integer) it2.next();
                        int intValue3 = num3.intValue();
                        if (!abstractSet2.contains(num3) && intValue3 >= i21 && intValue3 <= n10) {
                            it2.remove();
                            o8Var.u(intValue3, false);
                        }
                    }
                }
                o8Var.d(true);
                if (o8Var.r) {
                    if (o8.B == null) {
                        o8.B = new HashMap();
                    }
                    o8.B.put(Integer.valueOf(Objects.hash(Integer.valueOf(i25), Integer.valueOf(i24), Long.valueOf(j10), Integer.valueOf(i23))), Long.valueOf(System.currentTimeMillis()));
                } else {
                    o8Var.w();
                }
                o8Var.x();
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new a3.l0(MessagesStorage.getInstance(i21).getUsers((ArrayList) obj), (HashMap) obj3, (Utilities.Callback) obj2, 24));
                break;
            case 2:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj3;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) obj;
                TLRPC.User user = (TLRPC.User) obj2;
                if (userFull2 == null) {
                    qVar.run(Boolean.FALSE, "cancelled");
                    break;
                } else {
                    fi.c5.b(i21, user, userFull2, qVar);
                    break;
                }
            case 3:
                hg.h0 h0Var = (hg.h0) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) obj2;
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
                    boolean z13 = h > ((z12 ? min : i28) + i21) + 1;
                    s4.k kVar = h0Var.i0;
                    if (kVar != null) {
                        kVar.c = z13 ? 45L : 200L;
                        kVar.d = z13 ? 80L : 200L;
                        kVar.l = z13 ? 270L : 0L;
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
                        int i29 = (!h0Var.G0 ? i21 + min : i28 + i21) + 1;
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
                    int i31 = i21 + min;
                    int i32 = i31 + 1;
                    int max = Math.max(0, size2 - 3);
                    if (h0Var.G0) {
                        h0Var.t(i32, max);
                        if (z13) {
                            AndroidUtilities.runOnUIThread(new ah.g(h0Var, i31, i17), 350L);
                        } else {
                            h0Var.m(i31);
                        }
                    } else {
                        h0Var.m(i31);
                        h0Var.s(i32, max);
                    }
                    fi.q3 q3Var = h0Var.p0;
                    if (q3Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(q3Var);
                    }
                    if (z13) {
                        h0Var.m0 = true;
                        fi.q3 q3Var2 = new fi.q3(i22, h0Var, view);
                        h0Var.p0 = q3Var2;
                        AndroidUtilities.runOnUIThread(q3Var2, 400L);
                        break;
                    } else {
                        h0Var.m0 = false;
                        break;
                    }
                }
                break;
            case 4:
                hg.h0 h0Var2 = (hg.h0) obj3;
                TLObject tLObject = (TLObject) obj;
                String str2 = (String) obj2;
                int i33 = h0Var2.s0;
                if (i21 == h0Var2.d0 && (tLObject instanceof TLRPC.messages_Messages)) {
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
                    ky kyVar = h0Var2.U;
                    if (kyVar != null) {
                        kyVar.d(h0Var2.D0 > 0, true);
                    }
                    h0Var2.l();
                    break;
                }
                break;
            case 5:
                ig.b2 b2Var = (ig.b2) obj3;
                ArrayList arrayList6 = b2Var.b;
                TLRPC.Message message = (TLRPC.Message) obj;
                String str3 = (String) obj2;
                int i35 = b2Var.a;
                if ((message.flags & TLObject.FLAG_30) != 0) {
                    ig.a2 c10 = b2Var.c(message.quick_reply_shortcut_id);
                    if (c10 == null) {
                        ig.a2 a2Var = new ig.a2();
                        a2Var.a = message.quick_reply_shortcut_id;
                        a2Var.d = message.id;
                        MessageObject messageObject = new MessageObject(i35, message, false, true);
                        a2Var.e = messageObject;
                        messageObject.generateThumbs(false);
                        if (str3 != null) {
                            a2Var.b = str3;
                            b2Var.a(str3);
                        }
                        a2Var.e.applyQuickReply(str3, i21);
                        a2Var.f = 1;
                        arrayList6.add(a2Var);
                        for (int i36 = 0; i36 < arrayList6.size(); i36++) {
                            ((ig.a2) arrayList6.get(i36)).c = i36;
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i35);
                        messagesStorage.getStorageQueue().postRunnable(new fi.q3(18, messagesStorage, a2Var));
                        NotificationCenter.getInstance(i35).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                    } else {
                        int i37 = c10.d;
                        int i38 = message.id;
                        if (i37 == i38) {
                            c10.d = i38;
                            MessageObject messageObject2 = new MessageObject(i35, message, false, true);
                            c10.e = messageObject2;
                            messageObject2.generateThumbs(false);
                            b2Var.l();
                            NotificationCenter.getInstance(i35).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        } else if ((message.flags & 32768) == 0) {
                            c10.f++;
                            b2Var.l();
                            NotificationCenter.getInstance(i35).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        }
                    }
                }
                if (str3 == null && i21 == 0) {
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
            case 6:
                List list = (List) obj;
                m4.v vVar = (m4.v) obj2;
                m4.e0 e0Var = ((m4.p0) ((a5.a) obj3).d).g;
                if (i21 == -1) {
                    e0Var.t.x0(list);
                } else {
                    e0Var.t.b0(i21, list);
                }
                new SparseBooleanArray().append(20, true);
                e0Var.p(vVar);
                break;
            case 7:
                ((CameraView) obj3).lambda$createCamera$11(i21, (CameraSession) obj, (CameraView.CameraGLThread) obj2);
                break;
            case 8:
                int i39 = 2;
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj3;
                org.telegram.ui.ActionBar.a5 a5Var = (org.telegram.ui.ActionBar.a5) obj;
                Runnable runnable2 = (Runnable) obj2;
                m2.t tVar = actionBarLayout.d0;
                int i40 = 0;
                boolean z16 = false;
                while (i40 < i21) {
                    if (i40 == 0) {
                        m2Var = actionBarLayout.getLastFragment();
                    } else {
                        if ((actionBarLayout.h || actionBarLayout.a0) && actionBarLayout.O0.size() > 1) {
                            m2Var = (org.telegram.ui.ActionBar.m2) t8.b.g(i39, actionBarLayout.O0);
                        }
                        i40++;
                        i39 = 2;
                    }
                    if (m2Var != null) {
                        if (a5Var.m != null) {
                            if (actionBarLayout.e0 == null) {
                                org.telegram.ui.ActionBar.d5 d5Var = new org.telegram.ui.ActionBar.d5(0, true, false, tVar);
                                actionBarLayout.e0 = d5Var;
                                d5Var.L = true;
                                org.telegram.ui.ActionBar.d5 d5Var2 = new org.telegram.ui.ActionBar.d5(1, true, false, tVar);
                                actionBarLayout.f0 = d5Var2;
                                d5Var2.L = true;
                            }
                            org.telegram.ui.ActionBar.c6 c6Var = a5Var.m;
                            SparseIntArray sparseIntArray = (SparseIntArray) tVar.b;
                            sparseIntArray.clear();
                            for (int i41 : (int[]) tVar.c) {
                                sparseIntArray.put(i41, c6Var.f1(i41));
                            }
                        }
                        ArrayList<org.telegram.ui.ActionBar.i6> themeDescriptions = m2Var.getThemeDescriptions();
                        actionBarLayout.d(themeDescriptions);
                        Dialog dialog = m2Var.visibleDialog;
                        if (dialog instanceof org.telegram.ui.ActionBar.e3) {
                            actionBarLayout.d(((org.telegram.ui.ActionBar.e3) dialog).getThemeDescriptions());
                        }
                        if (i40 == 0 && (runnable = a5Var.h) != null) {
                            runnable.run();
                        }
                        actionBarLayout.b(themeDescriptions);
                        Dialog dialog2 = m2Var.visibleDialog;
                        if (dialog2 instanceof org.telegram.ui.ActionBar.e3) {
                            actionBarLayout.b(((org.telegram.ui.ActionBar.e3) dialog2).getThemeDescriptions());
                        }
                        z16 = true;
                    }
                    i40++;
                    i39 = 2;
                }
                if (z16) {
                    if (!a5Var.e) {
                        int size3 = actionBarLayout.O0.size() - ((actionBarLayout.h || actionBarLayout.a0) ? 2 : 1);
                        for (int i42 = 0; i42 < size3; i42++) {
                            org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) actionBarLayout.O0.get(i42);
                            m2Var2.clearViews();
                            m2Var2.setParentLayout(actionBarLayout);
                        }
                    }
                    if (a5Var.d) {
                        actionBarLayout.setThemeAnimationValue(1.0f);
                        actionBarLayout.h0.clear();
                        actionBarLayout.b0.clear();
                        actionBarLayout.c0.clear();
                        actionBarLayout.j0.clear();
                        actionBarLayout.i0 = null;
                        actionBarLayout.g0 = null;
                        xn xnVar = a5Var.j;
                        if (xnVar != null) {
                            xnVar.run();
                        }
                        if (runnable2 != null) {
                            runnable2.run();
                            break;
                        }
                    } else {
                        int i43 = org.telegram.ui.ActionBar.g6.a;
                        org.telegram.ui.ActionBar.g6.vl = new SparseIntArray();
                        actionBarLayout.setThemeAnimationValue(0.0f);
                        xn xnVar2 = a5Var.i;
                        if (xnVar2 != null) {
                            xnVar2.run();
                        }
                        zn znVar = a5Var.k;
                        actionBarLayout.g0 = znVar;
                        if (znVar != null) {
                            co coVar = znVar.a;
                            coVar.V.x0.invalidate();
                            coVar.I.K = 0.0f;
                            coVar.J.K = 0.0f;
                            coVar.k(0.0f);
                        }
                        actionBarLayout.l0.lock();
                        AnimatorSet animatorSet = new AnimatorSet();
                        actionBarLayout.k0 = animatorSet;
                        animatorSet.addListener(new t(11, actionBarLayout, a5Var));
                        actionBarLayout.k0.playTogether(ObjectAnimator.ofFloat(actionBarLayout, "themeAnimationValue", 0.0f, 1.0f));
                        actionBarLayout.k0.setDuration(a5Var.l);
                        actionBarLayout.k0.start();
                    }
                }
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
            case 9:
                ((org.telegram.ui.f1) obj3).a(0, false);
                org.telegram.ui.Components.g5.e0(i21, (TLRPC.TL_error) obj, null, (TLRPC.TL_channels_joinChannel) obj2, Boolean.TRUE);
                break;
            case 10:
                org.telegram.ui.k4 k4Var = (org.telegram.ui.k4) obj3;
                ArrayList arrayList9 = (ArrayList) obj;
                String str4 = (String) obj2;
                if (i21 == k4Var.W0) {
                    k4Var.d0(true);
                    k4Var.E = arrayList9;
                    k4Var.F = str4;
                    k4Var.u0[0].c.y.clear();
                    k4Var.u0[0].b.f1();
                    k4Var.W(0);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.g9 g9Var = (org.telegram.ui.g9) obj3;
                TLObject tLObject2 = (TLObject) obj;
                TLRPC.User user2 = (TLRPC.User) obj2;
                if (tLObject2 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject2;
                    MessagesController.getInstance(i21).putUsers(tL_users_userFull.users, false);
                    MessagesController.getInstance(i21).putChats(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.voip.d2.m(user2, false, userFull != null && userFull.video_calls_available, g9Var.getParentActivity(), userFull, AccountInstance.getInstance(i21));
                break;
            case 12:
                fo foVar = (fo) obj3;
                foVar.getClass();
                foVar.h = ((MessagesStorage) obj).getEncryptedChat(i21);
                ((CountDownLatch) obj2).countDown();
                break;
            case 13:
                fo foVar2 = (fo) obj3;
                foVar2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(foVar2.T5), (ArrayList) obj, Boolean.TRUE, (ArrayList) obj2, null, 0, Integer.valueOf(i21), Boolean.valueOf(foVar2.S4));
                foVar2.A3 = null;
                break;
            case 14:
                fo foVar3 = (fo) obj3;
                boolean[] zArr = (boolean[]) obj;
                fo foVar4 = (fo) obj2;
                if (!zArr[0] && i21 == foVar3.ic && foVar3.F3 && !foVar3.isFinishing()) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new xg(foVar3, 21), 200L);
                    foVar3.presentFragment(foVar4);
                    if (foVar3.C9() && !foVar4.hideKeyboardOnShow() && (skVar = foVar4.Y) != null && skVar.getEditField() != null) {
                        foVar4.Y.getEditField().requestFocus();
                        break;
                    }
                }
                break;
            case 15:
                vj vjVar = (vj) obj3;
                ArrayList arrayList10 = (ArrayList) obj;
                ArrayList arrayList11 = (ArrayList) obj2;
                zj zjVar = vjVar.n;
                o0 o0Var = zjVar.s;
                if (i21 == vjVar.h) {
                    if (i21 != -1) {
                        s4.g0 adapter = o0Var.getAdapter();
                        vj vjVar2 = zjVar.F;
                        if (adapter != vjVar2) {
                            o0Var.setAdapter(vjVar2);
                        }
                    }
                    vjVar.d = arrayList10;
                    vjVar.e = arrayList11;
                    vjVar.l();
                    break;
                }
                break;
            case 16:
                dn dnVar = (dn) obj3;
                cn cnVar = (cn) obj;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj2;
                en enVar = dnVar.P;
                ValueAnimator valueAnimator = enVar.L;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                enVar.J = null;
                dnVar.G = 0.0f;
                dnVar.f(cnVar, photoEntry, i21);
                dnVar.j();
                dnVar.i(enVar.P, false);
                break;
            case 17:
                org.telegram.ui.Components.g5.F(((l80) obj3).e, (org.telegram.ui.ActionBar.c6) obj, new i2.r(i21, (xo) obj2, i17));
                break;
            case 18:
                int[] iArr = (int[]) obj3;
                Runnable[] runnableArr = (Runnable[]) obj;
                int[] iArr2 = (int[]) obj2;
                iArr[0] = iArr[0] + 1;
                Runnable runnable3 = runnableArr[0];
                if (runnable3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable3);
                    runnableArr[0] = null;
                }
                if (iArr2[0] >= 0) {
                    ConnectionsManager.getInstance(i21).cancelRequest(iArr2[0], true);
                    iArr2[0] = -1;
                    break;
                }
                break;
            case 19:
                org.telegram.ui.ActionBar.m2 m2Var3 = (org.telegram.ui.ActionBar.m2) obj3;
                TLObject tLObject3 = (TLObject) obj;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                if (m2Var3.getParentActivity() != null) {
                    if (tLObject3 instanceof Vector) {
                        Vector vector = (Vector) tLObject3;
                        ArrayList arrayList12 = new ArrayList();
                        for (int i44 = 0; i44 < vector.objects.size(); i44++) {
                            try {
                                arrayList12.add(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.Peer) vector.objects.get(i44))));
                            } catch (Exception unused) {
                            }
                        }
                        o10Var = new o10(m2Var3, i21, arrayList12);
                    } else {
                        o10Var = new o10(m2Var3, i21, null);
                    }
                    o10Var.B0 = callback;
                    m2Var3.showDialog(o10Var);
                    break;
                }
                break;
            case 20:
                d40 d40Var = (d40) obj3;
                ArrayList arrayList13 = (ArrayList) obj;
                d40Var.getClass();
                String lowerCase = ((String) obj2).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new gm(d40Var, i21, new ArrayList(), i16));
                    break;
                } else {
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (lowerCase.equals(translitString) || translitString.length() == 0) {
                        translitString = null;
                    }
                    int i45 = (translitString != null ? 1 : 0) + 1;
                    String[] strArr = new String[i45];
                    strArr[0] = lowerCase;
                    if (translitString != null) {
                        strArr[1] = translitString;
                    }
                    ArrayList arrayList14 = new ArrayList();
                    int size4 = arrayList13.size();
                    int i46 = 0;
                    while (i46 < size4) {
                        TLObject tLObject4 = (TLObject) arrayList13.get(i46);
                        if (tLObject4 instanceof TLRPC.ChatParticipant) {
                            i11 = i19;
                            i12 = i20;
                            peerId = ((TLRPC.ChatParticipant) tLObject4).user_id;
                        } else {
                            i11 = i19;
                            i12 = i20;
                            if (tLObject4 instanceof TLRPC.ChannelParticipant) {
                                peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject4).peer);
                            }
                            i13 = i18;
                            i46++;
                            i20 = i12;
                            i19 = i11;
                            i18 = i13;
                            str = null;
                        }
                        i14 = ((org.telegram.ui.ActionBar.e3) d40Var.w).currentAccount;
                        TLRPC.User user3 = MessagesController.getInstance(i14).getUser(Long.valueOf(peerId));
                        if (!UserObject.isUserSelf(user3)) {
                            String lowerCase2 = UserObject.getUserName(user3).toLowerCase();
                            String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                            if (lowerCase2.equals(translitString2)) {
                                translitString2 = str;
                            }
                            i13 = i18;
                            int i47 = i12;
                            int i48 = i47;
                            while (true) {
                                if (i47 < i45) {
                                    String str5 = strArr[i47];
                                    if (lowerCase2.startsWith(str5) || org.telegram.messenger.g0.w(" ", str5, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str5) || org.telegram.messenger.g0.w(" ", str5, translitString2)))) {
                                        i48 = i11;
                                    } else {
                                        String publicUsername = UserObject.getPublicUsername(user3);
                                        if (publicUsername != null && publicUsername.startsWith(str5)) {
                                            i48 = i13;
                                        }
                                    }
                                    if (i48 != 0) {
                                        arrayList14.add(tLObject4);
                                    } else {
                                        i47++;
                                    }
                                }
                            }
                            i46++;
                            i20 = i12;
                            i19 = i11;
                            i18 = i13;
                            str = null;
                        }
                        i13 = i18;
                        i46++;
                        i20 = i12;
                        i19 = i11;
                        i18 = i13;
                        str = null;
                    }
                    AndroidUtilities.runOnUIThread(new gm(d40Var, i21, arrayList14, 6));
                    break;
                }
                break;
            case 21:
                r40 r40Var = (r40) obj3;
                TLObject tLObject5 = (TLObject) obj;
                String str6 = (String) obj2;
                int i49 = r40Var.N;
                ArrayList arrayList15 = r40Var.O;
                if (i21 == r40Var.T) {
                    boolean isEmpty = arrayList15.isEmpty();
                    r40Var.S = false;
                    if (tLObject5 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject5;
                        if (messages_messages2 instanceof TLRPC.TL_messages_messages) {
                            r40Var.W = ((TLRPC.TL_messages_messages) messages_messages2).messages.size();
                        } else if (messages_messages2 instanceof TLRPC.TL_messages_messagesSlice) {
                            r40Var.W = ((TLRPC.TL_messages_messagesSlice) messages_messages2).count;
                        }
                        r40Var.Z = messages_messages2.next_rate;
                        MessagesController.getInstance(i49).putUsers(messages_messages2.users, false);
                        MessagesController.getInstance(i49).putChats(messages_messages2.chats, false);
                        for (int i50 = 0; i50 < messages_messages2.messages.size(); i50++) {
                            MessageObject messageObject3 = new MessageObject(i49, messages_messages2.messages.get(i50), false, true);
                            messageObject3.setQuery(str6);
                            arrayList15.add(messageObject3);
                        }
                        r40Var.V = arrayList15.size() >= r40Var.W;
                        r40Var.W();
                    } else {
                        r40Var.V = true;
                        r40Var.W = arrayList15.size();
                    }
                    r40Var.N(true);
                    if (isEmpty) {
                        ((qo0) r40Var).c0.t0.h1(0, 0);
                        break;
                    }
                }
                break;
            case 22:
                ko0.c(((ko0) obj3).getContext(), i21, ((ho0) obj).a.g(), (org.telegram.ui.ActionBar.c6) obj2);
                break;
            case 23:
                nr0 nr0Var = (nr0) obj3;
                TLObject tLObject6 = (TLObject) obj;
                String str7 = (String) obj2;
                HashMap hashMap = nr0Var.v;
                if (i21 == nr0Var.y) {
                    nr0Var.x = 0;
                    if (tLObject6 instanceof TL_account.webPagePreview) {
                        TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject6;
                        MessagesController.getInstance(nr0Var.c).putUsers(webpagepreview.users, false);
                        MessagesController.getInstance(nr0Var.c).putChats(webpagepreview.chats, false);
                        TLRPC.MessageMedia messageMedia = webpagepreview.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                            webPage = ((TLRPC.TL_messageMediaWebPage) messageMedia).webpage;
                            if (webPage instanceof TLRPC.TL_webPage) {
                                if (webPage instanceof TLRPC.TL_webPagePending) {
                                    nr0Var.w = webPage;
                                    break;
                                } else if (webPage instanceof TLRPC.TL_webPageEmpty) {
                                    nr0Var.w = null;
                                    if (nr0Var.b != 0) {
                                        nr0Var.b = 0;
                                        mr0 mr0Var = nr0Var.H;
                                        if (mr0Var != null) {
                                            ((aw) mr0Var).h(0);
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
                                nr0Var.w = webPage;
                                nr0.a(nr0Var.a[0], webPage, str7);
                                break;
                            }
                        }
                    }
                    webPage = null;
                    if (webPage instanceof TLRPC.TL_webPage) {
                    }
                }
                break;
            case 24:
                ((xv0) obj3).I0((MessageObject) obj, (View) obj2, i21, false);
                break;
            case 25:
                xv0.d((xv0) obj3, i21, (TL_stories.StoryItem) obj, (String) obj2);
                break;
            case 26:
                org.telegram.ui.Components.g5.e0(i21, (TLRPC.TL_error) obj, ((xv0) obj3).v1, (TLRPC.TL_messages_editMessage) obj2, new Object[0]);
                break;
            case 27:
                tu0 tu0Var = (tu0) obj3;
                ArrayList arrayList16 = (ArrayList) obj;
                String str8 = (String) obj2;
                xv0 xv0Var = tu0Var.v;
                if (tu0Var.h != 0) {
                    if (i21 == tu0Var.n) {
                        int h10 = tu0Var.h();
                        tu0Var.f = arrayList16;
                        tu0Var.s--;
                        int h11 = tu0Var.h();
                        if (tu0Var.s == 0 || h11 != 0) {
                            xv0Var.n1(false);
                        }
                        int i51 = 0;
                        while (true) {
                            qu0[] qu0VarArr = xv0Var.k0;
                            if (i51 < qu0VarArr.length) {
                                qu0 qu0Var = qu0VarArr[i51];
                                if (qu0Var.F == tu0Var.r) {
                                    if (tu0Var.s == 0 && h11 == 0) {
                                        qu0Var.w.d.setText(LocaleController.formatString("NoResultFoundFor", R.string.NoResultFoundFor, str8));
                                        qu0VarArr[i51].w.f.setVisibility(8);
                                        qu0VarArr[i51].w.e(false, true);
                                    } else if (h10 == 0) {
                                        xv0Var.z(qu0Var.h, 0, null);
                                    }
                                }
                                i51++;
                            } else {
                                tu0Var.l();
                            }
                        }
                    }
                    tu0Var.h = 0;
                    break;
                }
                break;
            case 28:
                lz0 lz0Var = (lz0) obj3;
                String[] strArr2 = (String[]) obj;
                String str9 = (String) obj2;
                HashSet hashSet = new HashSet();
                ArrayList arrayList17 = new ArrayList();
                int i52 = lz0Var.a;
                MediaDataController.getInstance(i52).getEmojiSuggestions(strArr2, str9, true, new org.telegram.ui.Components.e2(lz0Var, this.b, str9, hashSet, arrayList17, 1), SharedConfig.suggestAnimatedEmoji && UserConfig.getInstance(i52).isPremium());
                break;
            default:
                lz0 lz0Var2 = (lz0) obj3;
                String str10 = (String) obj2;
                ArrayList arrayList18 = (ArrayList) obj;
                if (i21 == lz0Var2.I) {
                    lz0Var2.H = str10;
                    lz0Var2.G = 2;
                    arrayList18.remove(arrayList18.size() - 1);
                    if (arrayList18.isEmpty()) {
                        lz0Var2.x = true;
                        lz0Var2.f();
                        break;
                    } else {
                        lz0Var2.x = false;
                        lz0Var2.v = false;
                        lz0Var2.c();
                        ah.x xVar = lz0Var2.d;
                        if (xVar != null) {
                            xVar.setVisibility(0);
                            lz0Var2.d.invalidate();
                        }
                        lz0Var2.w = arrayList18;
                        iz0 iz0Var = lz0Var2.f;
                        if (iz0Var != null) {
                            iz0Var.l();
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ n8(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.c = obj2;
        this.e = obj3;
    }

    public /* synthetic */ n8(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = obj2;
        this.b = i10;
        this.e = obj3;
    }

    public /* synthetic */ n8(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
        this.b = i10;
    }

    public /* synthetic */ n8(d40 d40Var, String str, int i10, ArrayList arrayList) {
        this.a = 20;
        this.d = d40Var;
        this.e = str;
        this.b = i10;
        this.c = arrayList;
    }

    public /* synthetic */ n8(lz0 lz0Var, int i10, String str, ArrayList arrayList) {
        this.a = 29;
        this.d = lz0Var;
        this.b = i10;
        this.e = str;
        this.c = arrayList;
    }
}
