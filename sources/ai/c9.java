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
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.f40;
import org.telegram.ui.Components.fu0;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.lo;
import org.telegram.ui.Components.pm;
import org.telegram.ui.Components.q11;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.r30;
import org.telegram.ui.Components.rm;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.Components.un0;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.vj;
import org.telegram.ui.Components.xm;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.y11;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.yq0;
import org.telegram.ui.Components.zj;
import org.telegram.ui.Components.zq0;
import org.telegram.ui.cy;
import org.telegram.ui.jk;
import org.telegram.ui.pn;
import org.telegram.ui.rg;
import org.telegram.ui.rn;
import org.telegram.ui.sv;
import org.telegram.ui.un;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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

    /* JADX WARN: Removed duplicated region for block: B:109:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d4  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        org.telegram.ui.ActionBar.m2 m2Var;
        Runnable runnable;
        TLRPC.UserFull userFull;
        jk jkVar;
        d10 d10Var;
        int i11;
        long peerId;
        int i12;
        TLRPC.WebPage webPage;
        int i13;
        int i14 = this.a;
        int i15 = 20;
        int i16 = 8;
        int i17 = 4;
        String str = null;
        int i18 = this.b;
        Object obj = this.e;
        Object obj2 = this.c;
        Object obj3 = this.d;
        switch (i14) {
            case 0:
                d9 d9Var = (d9) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) obj;
                AbstractSet abstractSet = d9Var.k;
                int i19 = d9Var.f;
                AbstractSet abstractSet2 = d9Var.l;
                d9Var.A = -1;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i20 = d9Var.e;
                sb2.append(i20);
                sb2.append("{");
                long j3 = d9Var.d;
                sb2.append(j3);
                sb2.append("} loaded {");
                sb2.append(l9.a(arrayList));
                com.google.android.gms.internal.vision.e2.t("}", sb2);
                ArrayList arrayList2 = d9Var.g;
                arrayList2.clear();
                arrayList2.addAll(tL_stories_stories.pinned_to_top);
                int i21 = d9Var.c;
                boolean z10 = false;
                MessagesController.getInstance(i21).putUsers(tL_stories_stories.users, false);
                MessagesController.getInstance(i21).putChats(tL_stories_stories.chats, false);
                MessagesStorage.getInstance(i21).putUsersAndChats(tL_stories_stories.users, tL_stories_stories.chats, true, true);
                d9Var.u = false;
                d9Var.s = tL_stories_stories.count;
                int i22 = 0;
                while (i22 < arrayList.size()) {
                    d9Var.t((MessageObject) arrayList.get(i22), z10);
                    i22++;
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
                } else if (i19 <= 0) {
                    if (i18 == -1) {
                        if (!abstractSet2.isEmpty()) {
                            ArrayList arrayList3 = new ArrayList(abstractSet2);
                            for (int i23 = 0; i23 < arrayList3.size(); i23++) {
                                Integer num2 = (Integer) arrayList3.get(i23);
                                int intValue2 = num2.intValue();
                                if (!arrayList2.contains(num2)) {
                                    i10 = intValue2;
                                    i18 = i10;
                                }
                            }
                        }
                        i10 = -1;
                        i18 = i10;
                    }
                    int n10 = d9Var.n();
                    Iterator it2 = abstractSet.iterator();
                    while (it2.hasNext()) {
                        Integer num3 = (Integer) it2.next();
                        int intValue3 = num3.intValue();
                        if (!abstractSet2.contains(num3) && intValue3 >= i18 && intValue3 <= n10) {
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
                    d9.B.put(Integer.valueOf(Objects.hash(Integer.valueOf(i21), Integer.valueOf(i20), Long.valueOf(j3), Integer.valueOf(i19))), Long.valueOf(System.currentTimeMillis()));
                } else {
                    d9Var.w();
                }
                d9Var.x();
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new a3.k0(MessagesStorage.getInstance(i18).getUsers((ArrayList) obj2), (HashMap) obj3, (Utilities.Callback) obj, 24));
                break;
            case 2:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj3;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (userFull2 == null) {
                    qVar.run(Boolean.FALSE, "cancelled");
                    break;
                } else {
                    ei.c5.b(i18, user, userFull2, qVar);
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
                    int i24 = (arrayList4.isEmpty() && arrayList5.isEmpty()) ? 0 : size2 + size;
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
                            AndroidUtilities.runOnUIThread(new o8(i0Var, i27, 7), 350L);
                        } else {
                            i0Var.m(i27);
                        }
                    } else {
                        i0Var.m(i27);
                        i0Var.s(i28, max);
                    }
                    ci.y8 y8Var = i0Var.p0;
                    if (y8Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(y8Var);
                    }
                    if (z13) {
                        i0Var.m0 = true;
                        ci.y8 y8Var2 = new ci.y8(27, i0Var, view);
                        i0Var.p0 = y8Var2;
                        AndroidUtilities.runOnUIThread(y8Var2, 400L);
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
                    cy cyVar = i0Var2.U;
                    if (cyVar != null) {
                        cyVar.d(i0Var2.D0 > 0, true);
                    }
                    i0Var2.l();
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
                    hg.b2 c10 = c2Var.c(message.quick_reply_shortcut_id);
                    if (c10 == null) {
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
                        b2Var.e.applyQuickReply(str3, i18);
                        b2Var.f = 1;
                        arrayList6.add(b2Var);
                        for (int i32 = 0; i32 < arrayList6.size(); i32++) {
                            ((hg.b2) arrayList6.get(i32)).c = i32;
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i31);
                        messagesStorage.getStorageQueue().postRunnable(new gg.x1(6, messagesStorage, b2Var));
                        NotificationCenter.getInstance(i31).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                    } else {
                        int i33 = c10.d;
                        int i34 = message.id;
                        if (i33 == i34) {
                            c10.d = i34;
                            MessageObject messageObject2 = new MessageObject(i31, message, false, true);
                            c10.e = messageObject2;
                            messageObject2.generateThumbs(false);
                            c2Var.l();
                            NotificationCenter.getInstance(i31).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        } else if ((message.flags & 32768) == 0) {
                            c10.f++;
                            c2Var.l();
                            NotificationCenter.getInstance(i31).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        }
                    }
                }
                if (str3 == null && i18 == 0) {
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
                org.telegram.ui.ActionBar.a5 a5Var = (org.telegram.ui.ActionBar.a5) obj2;
                Runnable runnable2 = (Runnable) obj;
                n7.z0 z0Var = actionBarLayout.d0;
                boolean z16 = false;
                for (int i35 = 0; i35 < i18; i35++) {
                    if (i35 == 0) {
                        m2Var = actionBarLayout.getLastFragment();
                    } else {
                        if ((actionBarLayout.h || actionBarLayout.a0) && actionBarLayout.O0.size() > 1) {
                            m2Var = (org.telegram.ui.ActionBar.m2) org.telegram.ui.Cells.c1.i(2, actionBarLayout.O0);
                        }
                    }
                    if (m2Var != null) {
                        if (a5Var.m != null) {
                            if (actionBarLayout.e0 == null) {
                                org.telegram.ui.ActionBar.d5 d5Var = new org.telegram.ui.ActionBar.d5(0, true, false, z0Var);
                                actionBarLayout.e0 = d5Var;
                                d5Var.J = true;
                                org.telegram.ui.ActionBar.d5 d5Var2 = new org.telegram.ui.ActionBar.d5(1, true, false, z0Var);
                                actionBarLayout.f0 = d5Var2;
                                d5Var2.J = true;
                            }
                            org.telegram.ui.ActionBar.d6 d6Var = a5Var.m;
                            SparseIntArray sparseIntArray = (SparseIntArray) z0Var.b;
                            sparseIntArray.clear();
                            for (int i36 : (int[]) z0Var.c) {
                                sparseIntArray.put(i36, d6Var.g1(i36));
                            }
                        }
                        ArrayList<org.telegram.ui.ActionBar.j6> themeDescriptions = m2Var.getThemeDescriptions();
                        actionBarLayout.d(themeDescriptions);
                        Dialog dialog = m2Var.visibleDialog;
                        if (dialog instanceof org.telegram.ui.ActionBar.e3) {
                            actionBarLayout.d(((org.telegram.ui.ActionBar.e3) dialog).getThemeDescriptions());
                        }
                        if (i35 == 0 && (runnable = a5Var.h) != null) {
                            runnable.run();
                        }
                        actionBarLayout.b(themeDescriptions);
                        Dialog dialog2 = m2Var.visibleDialog;
                        if (dialog2 instanceof org.telegram.ui.ActionBar.e3) {
                            actionBarLayout.b(((org.telegram.ui.ActionBar.e3) dialog2).getThemeDescriptions());
                        }
                        z16 = true;
                    }
                }
                if (z16) {
                    if (!a5Var.e) {
                        int size3 = actionBarLayout.O0.size() - ((actionBarLayout.h || actionBarLayout.a0) ? 2 : 1);
                        for (int i37 = 0; i37 < size3; i37++) {
                            org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) actionBarLayout.O0.get(i37);
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
                        pn pnVar = a5Var.j;
                        if (pnVar != null) {
                            pnVar.run();
                        }
                        if (runnable2 != null) {
                            runnable2.run();
                            break;
                        }
                    } else {
                        int i38 = org.telegram.ui.ActionBar.h6.a;
                        org.telegram.ui.ActionBar.h6.sl = new SparseIntArray();
                        actionBarLayout.setThemeAnimationValue(0.0f);
                        pn pnVar2 = a5Var.i;
                        if (pnVar2 != null) {
                            pnVar2.run();
                        }
                        rn rnVar = a5Var.k;
                        actionBarLayout.g0 = rnVar;
                        if (rnVar != null) {
                            un unVar = rnVar.a;
                            unVar.V.x0.invalidate();
                            unVar.I.I = 0.0f;
                            unVar.J.I = 0.0f;
                            unVar.k(0.0f);
                        }
                        actionBarLayout.l0.lock();
                        AnimatorSet animatorSet = new AnimatorSet();
                        actionBarLayout.k0 = animatorSet;
                        animatorSet.addListener(new z(11, actionBarLayout, a5Var));
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
                ((org.telegram.ui.d1) obj3).a(0, false);
                org.telegram.ui.Components.e5.f0(i18, (TLRPC.TL_error) obj2, null, (TLRPC.TL_channels_joinChannel) obj, Boolean.TRUE);
                break;
            case 10:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) obj3;
                ArrayList arrayList9 = (ArrayList) obj2;
                String str4 = (String) obj;
                if (i18 == i4Var.W0) {
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
                org.telegram.ui.d9 d9Var2 = (org.telegram.ui.d9) obj3;
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
                org.telegram.ui.Components.voip.g2.m(user2, false, userFull != null && userFull.video_calls_available, d9Var2.getParentActivity(), userFull, AccountInstance.getInstance(i18));
                break;
            case 12:
                wn wnVar = (wn) obj3;
                wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(wnVar.T5), (ArrayList) obj2, Boolean.TRUE, (ArrayList) obj, null, 0, Integer.valueOf(i18), Boolean.valueOf(wnVar.S4));
                wnVar.A3 = null;
                break;
            case 13:
                wn wnVar2 = (wn) obj3;
                boolean[] zArr = (boolean[]) obj2;
                wn wnVar3 = (wn) obj;
                if (!zArr[0] && i18 == wnVar2.hc && wnVar2.F3 && !wnVar2.isFinishing()) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new rg(wnVar2, i15), 200L);
                    wnVar2.presentFragment(wnVar3);
                    if (wnVar2.x9() && !wnVar3.hideKeyboardOnShow() && (jkVar = wnVar3.Y) != null && jkVar.getEditField() != null) {
                        wnVar3.Y.getEditField().requestFocus();
                        break;
                    }
                }
                break;
            case 14:
                wn wnVar4 = (wn) obj3;
                wnVar4.getClass();
                wnVar4.h = ((MessagesStorage) obj2).getEncryptedChat(i18);
                ((CountDownLatch) obj).countDown();
                break;
            case 15:
                vj vjVar = (vj) obj3;
                ArrayList arrayList10 = (ArrayList) obj2;
                ArrayList arrayList11 = (ArrayList) obj;
                zj zjVar = vjVar.n;
                w0 w0Var = zjVar.s;
                if (i18 == vjVar.h) {
                    if (i18 != -1) {
                        s4.h0 adapter = w0Var.getAdapter();
                        vj vjVar2 = zjVar.F;
                        if (adapter != vjVar2) {
                            w0Var.setAdapter(vjVar2);
                        }
                    }
                    vjVar.d = arrayList10;
                    vjVar.e = arrayList11;
                    vjVar.l();
                    break;
                }
                break;
            case 16:
                qm qmVar = (qm) obj3;
                pm pmVar = (pm) obj2;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                rm rmVar = qmVar.P;
                ValueAnimator valueAnimator = rmVar.L;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                rmVar.J = null;
                qmVar.G = 0.0f;
                qmVar.f(pmVar, photoEntry, i18);
                qmVar.j();
                qmVar.i(rmVar.P, false);
                break;
            case 17:
                org.telegram.ui.Components.e5.G(((y70) obj3).e, (org.telegram.ui.ActionBar.d6) obj2, new i2.s(i18, (lo) obj, i16));
                break;
            case 18:
                org.telegram.ui.ActionBar.m2 m2Var3 = (org.telegram.ui.ActionBar.m2) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                if (m2Var3.getParentActivity() != null) {
                    if (tLObject3 instanceof Vector) {
                        Vector vector = (Vector) tLObject3;
                        ArrayList arrayList12 = new ArrayList();
                        for (int i39 = 0; i39 < vector.objects.size(); i39++) {
                            try {
                                arrayList12.add(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.Peer) vector.objects.get(i39))));
                            } catch (Exception unused) {
                            }
                        }
                        d10Var = new d10(m2Var3, i18, arrayList12);
                    } else {
                        d10Var = new d10(m2Var3, i18, null);
                    }
                    d10Var.B0 = callback;
                    m2Var3.showDialog(d10Var);
                    break;
                }
                break;
            case 19:
                r30 r30Var = (r30) obj3;
                ArrayList arrayList13 = (ArrayList) obj2;
                r30Var.getClass();
                String lowerCase = ((String) obj).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new xm(r30Var, i18, new ArrayList(), i17));
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
                    ArrayList arrayList14 = new ArrayList();
                    int size4 = arrayList13.size();
                    int i41 = 0;
                    while (i41 < size4) {
                        TLObject tLObject4 = (TLObject) arrayList13.get(i41);
                        if (tLObject4 instanceof TLRPC.ChatParticipant) {
                            i11 = size4;
                            peerId = ((TLRPC.ChatParticipant) tLObject4).user_id;
                        } else {
                            i11 = size4;
                            if (tLObject4 instanceof TLRPC.ChannelParticipant) {
                                peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject4).peer);
                            }
                            i41++;
                            size4 = i11;
                            str = null;
                        }
                        i12 = ((org.telegram.ui.ActionBar.e3) r30Var.w).currentAccount;
                        TLRPC.User user3 = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
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
                                    if (lowerCase2.startsWith(str5) || org.telegram.messenger.f0.w(" ", str5, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str5) || org.telegram.messenger.f0.w(" ", str5, translitString2)))) {
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
                                        i42++;
                                    }
                                }
                            }
                            i41++;
                            size4 = i11;
                            str = null;
                        }
                        i41++;
                        size4 = i11;
                        str = null;
                    }
                    AndroidUtilities.runOnUIThread(new xm(r30Var, i18, arrayList14, i17));
                    break;
                }
                break;
            case 20:
                f40 f40Var = (f40) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                String str6 = (String) obj;
                int i43 = f40Var.N;
                ArrayList arrayList15 = f40Var.O;
                if (i18 == f40Var.T) {
                    boolean isEmpty = arrayList15.isEmpty();
                    f40Var.S = false;
                    if (tLObject5 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject5;
                        if (messages_messages2 instanceof TLRPC.TL_messages_messages) {
                            f40Var.W = ((TLRPC.TL_messages_messages) messages_messages2).messages.size();
                        } else if (messages_messages2 instanceof TLRPC.TL_messages_messagesSlice) {
                            f40Var.W = ((TLRPC.TL_messages_messagesSlice) messages_messages2).count;
                        }
                        f40Var.Z = messages_messages2.next_rate;
                        MessagesController.getInstance(i43).putUsers(messages_messages2.users, false);
                        MessagesController.getInstance(i43).putChats(messages_messages2.chats, false);
                        for (int i44 = 0; i44 < messages_messages2.messages.size(); i44++) {
                            MessageObject messageObject3 = new MessageObject(i43, messages_messages2.messages.get(i44), false, true);
                            messageObject3.setQuery(str6);
                            arrayList15.add(messageObject3);
                        }
                        f40Var.V = arrayList15.size() >= f40Var.W;
                        f40Var.W();
                    } else {
                        f40Var.V = true;
                        f40Var.W = arrayList15.size();
                    }
                    f40Var.N(true);
                    if (isEmpty) {
                        ((co0) f40Var).c0.t0.h1(0, 0);
                        break;
                    }
                }
                break;
            case 21:
                un0.c(((un0) obj3).getContext(), i18, ((rn0) obj2).a.g(), (org.telegram.ui.ActionBar.d6) obj);
                break;
            case 22:
                zq0 zq0Var = (zq0) obj3;
                TLObject tLObject6 = (TLObject) obj2;
                String str7 = (String) obj;
                HashMap hashMap = zq0Var.v;
                if (i18 == zq0Var.y) {
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
                                            ((sv) yq0Var).h(0);
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
                ((jv0) obj3).H0((MessageObject) obj2, (View) obj, i18, false);
                break;
            case 24:
                jv0.g((jv0) obj3, i18, (TL_stories.StoryItem) obj2, (String) obj);
                break;
            case 25:
                org.telegram.ui.Components.e5.f0(i18, (TLRPC.TL_error) obj2, ((jv0) obj3).v1, (TLRPC.TL_messages_editMessage) obj, new Object[0]);
                break;
            case 26:
                fu0 fu0Var = (fu0) obj3;
                ArrayList arrayList16 = (ArrayList) obj2;
                String str8 = (String) obj;
                jv0 jv0Var = fu0Var.v;
                if (fu0Var.h != 0) {
                    if (i18 == fu0Var.n) {
                        int h10 = fu0Var.h();
                        fu0Var.f = arrayList16;
                        fu0Var.s--;
                        int h11 = fu0Var.h();
                        if (fu0Var.s == 0 || h11 != 0) {
                            jv0Var.m1(false);
                        }
                        int i45 = 0;
                        while (true) {
                            cu0[] cu0VarArr = jv0Var.k0;
                            if (i45 < cu0VarArr.length) {
                                cu0 cu0Var = cu0VarArr[i45];
                                if (cu0Var.F == fu0Var.r) {
                                    if (fu0Var.s == 0 && h11 == 0) {
                                        cu0Var.w.d.setText(LocaleController.formatString("NoResultFoundFor", R.string.NoResultFoundFor, str8));
                                        cu0VarArr[i45].w.f.setVisibility(8);
                                        cu0VarArr[i45].w.e(false, true);
                                    } else if (h10 == 0) {
                                        jv0Var.z(cu0Var.h, 0, null);
                                    }
                                }
                                i45++;
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
                xy0 xy0Var = (xy0) obj3;
                String[] strArr2 = (String[]) obj2;
                String str9 = (String) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList17 = new ArrayList();
                int i46 = xy0Var.a;
                MediaDataController.getInstance(i46).getEmojiSuggestions(strArr2, str9, true, new org.telegram.ui.Components.e2(xy0Var, this.b, str9, hashSet, arrayList17, 1), SharedConfig.suggestAnimatedEmoji && UserConfig.getInstance(i46).isPremium());
                break;
            case 28:
                xy0 xy0Var2 = (xy0) obj3;
                String str10 = (String) obj;
                ArrayList arrayList18 = (ArrayList) obj2;
                if (i18 == xy0Var2.I) {
                    xy0Var2.H = str10;
                    xy0Var2.G = 2;
                    arrayList18.remove(arrayList18.size() - 1);
                    if (arrayList18.isEmpty()) {
                        xy0Var2.x = true;
                        xy0Var2.f();
                        break;
                    } else {
                        xy0Var2.x = false;
                        xy0Var2.v = false;
                        xy0Var2.c();
                        f0 f0Var = xy0Var2.d;
                        if (f0Var != null) {
                            f0Var.setVisibility(0);
                            xy0Var2.d.invalidate();
                        }
                        xy0Var2.w = arrayList18;
                        uy0 uy0Var = xy0Var2.f;
                        if (uy0Var != null) {
                            uy0Var.l();
                            break;
                        }
                    }
                }
                break;
            default:
                y11 y11Var = (y11) obj3;
                ArrayList arrayList19 = (ArrayList) obj2;
                ArrayList arrayList20 = (ArrayList) obj;
                ThemeEditorView.EditorAlert editorAlert = y11Var.r;
                q11 q11Var = editorAlert.c;
                if (i18 == y11Var.d) {
                    y11 y11Var2 = editorAlert.r;
                    if (q11Var.getAdapter() != y11Var2) {
                        editorAlert.F = ThemeEditorView.EditorAlert.J(editorAlert);
                        q11Var.setAdapter(y11Var2);
                        y11Var2.l();
                    }
                    boolean z17 = !y11Var.e.isEmpty() && arrayList19.isEmpty();
                    boolean z18 = y11Var.e.isEmpty() && arrayList19.isEmpty();
                    if (z17) {
                        editorAlert.F = ThemeEditorView.EditorAlert.J(editorAlert);
                    }
                    y11Var.e = arrayList19;
                    y11Var.f = arrayList20;
                    y11Var.l();
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

    public /* synthetic */ c9(r30 r30Var, String str, int i10, ArrayList arrayList) {
        this.a = 19;
        this.d = r30Var;
        this.e = str;
        this.b = i10;
        this.c = arrayList;
    }

    public /* synthetic */ c9(xy0 xy0Var, int i10, String str, ArrayList arrayList) {
        this.a = 28;
        this.d = xy0Var;
        this.b = i10;
        this.e = str;
        this.c = arrayList;
    }
}
