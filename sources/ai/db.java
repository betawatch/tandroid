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
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
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
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.qo0;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.tj;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.uo;
import org.telegram.ui.Components.xj;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.z30;
import org.telegram.ui.Components.zm;
import org.telegram.ui.gk;
import org.telegram.ui.jv;
import org.telegram.ui.kg;
import org.telegram.ui.ln;
import org.telegram.ui.nn;
import org.telegram.ui.px;
import org.telegram.ui.qn;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class db implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ db(int i10, Object obj, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        TLRPC.WebPage webPage;
        nr0 nr0Var = (nr0) this.c;
        TLObject tLObject = (TLObject) this.d;
        String str = (String) this.e;
        HashMap hashMap = nr0Var.v;
        if (this.b != nr0Var.y) {
            return;
        }
        nr0Var.x = 0;
        if (tLObject instanceof TL_account.webPagePreview) {
            TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
            MessagesController.getInstance(nr0Var.c).putUsers(webpagepreview.users, false);
            MessagesController.getInstance(nr0Var.c).putChats(webpagepreview.chats, false);
            TLRPC.MessageMedia messageMedia = webpagepreview.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                webPage = ((TLRPC.TL_messageMediaWebPage) messageMedia).webpage;
                if (!(webPage instanceof TLRPC.TL_webPage)) {
                    if (hashMap.size() > 5) {
                        Iterator it = hashMap.keySet().iterator();
                        while (it.hasNext() && hashMap.size() > 5) {
                            it.next();
                            it.remove();
                        }
                    }
                    hashMap.put(str, webPage);
                    nr0Var.w = webPage;
                    nr0.a(nr0Var.a[0], webPage, str);
                    return;
                }
                if (webPage instanceof TLRPC.TL_webPagePending) {
                    nr0Var.w = webPage;
                    return;
                }
                if (webPage instanceof TLRPC.TL_webPageEmpty) {
                    nr0Var.w = null;
                    if (nr0Var.b != 0) {
                        nr0Var.b = 0;
                        mr0 mr0Var = nr0Var.H;
                        if (mr0Var != null) {
                            ((jv) mr0Var).h(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        webPage = null;
        if (!(webPage instanceof TLRPC.TL_webPage)) {
        }
    }

    private final void b() {
        xv0.g((xv0) this.c, this.b, (TL_stories.StoryItem) this.d, (String) this.e);
    }

    private final void c() {
        xv0 xv0Var = (xv0) this.c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) this.e;
        org.telegram.ui.Components.f5.f0(this.b, tL_error, xv0Var.v1, tL_messages_editMessage, new Object[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:258:0x051e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        org.telegram.ui.ActionBar.o2 o2Var;
        int[] iArr;
        int min;
        int[] iArr2;
        int i11;
        TLRPC.UserFull userFull;
        gk gkVar;
        k10 k10Var;
        int i12;
        int i13;
        long peerId;
        int i14;
        int i15 = this.a;
        int i16 = 10;
        int i17 = 8;
        String str = null;
        int i18 = 1;
        int i19 = 0;
        int i20 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        int i21 = 7;
        Object obj3 = this.c;
        switch (i15) {
            case 0:
                int i22 = this.b;
                l7 l7Var = new l7((Context) obj3, i22, UserConfig.getInstance(i22).getClientUserId(), (org.telegram.ui.ActionBar.g6) obj2, null);
                l7Var.L2((TL_stars.SavedStarGift) obj, null);
                l7Var.show();
                return;
            case 1:
                ci.z6 z6Var = (ci.z6) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) obj;
                AbstractSet abstractSet = z6Var.k;
                int i23 = z6Var.f;
                AbstractSet abstractSet2 = z6Var.l;
                z6Var.A = -1;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i24 = z6Var.e;
                sb2.append(i24);
                sb2.append("{");
                long j10 = z6Var.d;
                sb2.append(j10);
                sb2.append("} loaded {");
                sb2.append(ci.h7.a(arrayList));
                i2.o1.w("}", sb2);
                ArrayList arrayList2 = z6Var.g;
                arrayList2.clear();
                arrayList2.addAll(tL_stories_stories.pinned_to_top);
                int i25 = z6Var.c;
                boolean z10 = false;
                MessagesController.getInstance(i25).putUsers(tL_stories_stories.users, false);
                MessagesController.getInstance(i25).putChats(tL_stories_stories.chats, false);
                MessagesStorage.getInstance(i25).putUsersAndChats(tL_stories_stories.users, tL_stories_stories.chats, true, true);
                z6Var.u = false;
                z6Var.s = tL_stories_stories.count;
                int i26 = 0;
                while (i26 < arrayList.size()) {
                    z6Var.t((MessageObject) arrayList.get(i26), z10);
                    i26++;
                    z10 = false;
                }
                boolean z11 = abstractSet2.size() >= z6Var.s;
                z6Var.r = z11;
                if (z11) {
                    Iterator it = abstractSet.iterator();
                    while (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        int intValue = num.intValue();
                        if (!abstractSet2.contains(num)) {
                            it.remove();
                            z6Var.u(intValue, false);
                        }
                    }
                } else if (i23 <= 0) {
                    if (i20 == -1) {
                        if (!abstractSet2.isEmpty()) {
                            ArrayList arrayList3 = new ArrayList(abstractSet2);
                            for (int i27 = 0; i27 < arrayList3.size(); i27++) {
                                Integer num2 = (Integer) arrayList3.get(i27);
                                int intValue2 = num2.intValue();
                                if (!arrayList2.contains(num2)) {
                                    i10 = intValue2;
                                    i20 = i10;
                                }
                            }
                        }
                        i10 = -1;
                        i20 = i10;
                    }
                    int n10 = z6Var.n();
                    Iterator it2 = abstractSet.iterator();
                    while (it2.hasNext()) {
                        Integer num3 = (Integer) it2.next();
                        int intValue3 = num3.intValue();
                        if (!abstractSet2.contains(num3) && intValue3 >= i20 && intValue3 <= n10) {
                            it2.remove();
                            z6Var.u(intValue3, false);
                        }
                    }
                }
                z6Var.d(true);
                if (z6Var.r) {
                    if (ci.z6.B == null) {
                        ci.z6.B = new HashMap();
                    }
                    ci.z6.B.put(Integer.valueOf(Objects.hash(Integer.valueOf(i25), Integer.valueOf(i24), Long.valueOf(j10), Integer.valueOf(i23))), Long.valueOf(System.currentTimeMillis()));
                } else {
                    z6Var.w();
                }
                z6Var.x();
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ei.z1(MessagesStorage.getInstance(i20).getUsers((ArrayList) obj3), (HashMap) obj2, (Utilities.Callback) obj, 9));
                return;
            case 3:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj3;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (userFull2 == null) {
                    rVar.run(Boolean.FALSE, "cancelled");
                    return;
                } else {
                    gi.r4.b(i20, user, userFull2, rVar);
                    return;
                }
            case 4:
                hg.h0 h0Var = (hg.h0) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.Cells.u3 u3Var = (org.telegram.ui.Cells.u3) obj;
                ArrayList arrayList5 = h0Var.K;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - h0Var.n0 < 300) {
                    return;
                }
                h0Var.n0 = elapsedRealtime;
                int size = arrayList5.size();
                int size2 = arrayList4.size();
                int i28 = (arrayList4.isEmpty() && arrayList5.isEmpty()) ? 0 : size2 + size;
                int min2 = Math.min(3, size2) + size;
                int h = h0Var.h();
                boolean z12 = h0Var.G0;
                boolean z13 = h > ((z12 ? min2 : i28) + i20) + 1;
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
                    int i29 = (!h0Var.G0 ? i20 + min2 : i28 + i20) + 1;
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
                int i31 = i20 + min2;
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
                if (!z13) {
                    h0Var.m0 = false;
                    return;
                }
                h0Var.m0 = true;
                ei.p6 p6Var2 = new ei.p6(24, h0Var, view);
                h0Var.p0 = p6Var2;
                AndroidUtilities.runOnUIThread(p6Var2, 400L);
                return;
            case 5:
                hg.h0 h0Var2 = (hg.h0) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str2 = (String) obj;
                int i33 = h0Var2.s0;
                if (i20 == h0Var2.d0 && (tLObject instanceof TLRPC.messages_Messages)) {
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
                    px pxVar = h0Var2.U;
                    if (pxVar != null) {
                        pxVar.d(h0Var2.D0 > 0, true);
                    }
                    h0Var2.l();
                    return;
                }
                return;
            case 6:
                ig.z1 z1Var = (ig.z1) obj3;
                ArrayList arrayList6 = z1Var.b;
                TLRPC.Message message = (TLRPC.Message) obj2;
                String str3 = (String) obj;
                int i35 = z1Var.a;
                if ((message.flags & TLObject.FLAG_30) != 0) {
                    ig.y1 c10 = z1Var.c(message.quick_reply_shortcut_id);
                    if (c10 == null) {
                        ig.y1 y1Var = new ig.y1();
                        y1Var.a = message.quick_reply_shortcut_id;
                        y1Var.d = message.id;
                        MessageObject messageObject = new MessageObject(i35, message, false, true);
                        y1Var.e = messageObject;
                        messageObject.generateThumbs(false);
                        if (str3 != null) {
                            y1Var.b = str3;
                            z1Var.a(str3);
                        }
                        y1Var.e.applyQuickReply(str3, i20);
                        y1Var.f = 1;
                        arrayList6.add(y1Var);
                        for (int i36 = 0; i36 < arrayList6.size(); i36++) {
                            ((ig.y1) arrayList6.get(i36)).c = i36;
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i35);
                        messagesStorage.getStorageQueue().postRunnable(new hi.t(i21, messagesStorage, y1Var));
                        NotificationCenter.getInstance(i35).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                    } else {
                        int i37 = c10.d;
                        int i38 = message.id;
                        if (i37 == i38) {
                            c10.d = i38;
                            MessageObject messageObject2 = new MessageObject(i35, message, false, true);
                            c10.e = messageObject2;
                            messageObject2.generateThumbs(false);
                            z1Var.l();
                            NotificationCenter.getInstance(i35).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        } else if ((message.flags & 32768) == 0) {
                            c10.f++;
                            z1Var.l();
                            NotificationCenter.getInstance(i35).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        }
                    }
                }
                if (str3 == null && i20 == 0) {
                    ArrayList<TLRPC.Message> arrayList7 = new ArrayList<>();
                    arrayList7.add(message);
                    MessagesStorage.getInstance(i35).putMessages(arrayList7, true, true, false, DownloadController.getInstance(i35).getAutodownloadMask(), 5, message.quick_reply_shortcut_id);
                    long clientUserId = UserConfig.getInstance(i35).getClientUserId();
                    ArrayList<MessageObject> arrayList8 = new ArrayList<>();
                    arrayList8.add(new MessageObject(i35, message, true, true));
                    MessagesController.getInstance(i35).updateInterfaceWithMessages(clientUserId, arrayList8, 5);
                    return;
                }
                return;
            case 7:
                List list = (List) obj2;
                m4.v vVar = (m4.v) obj;
                m4.f0 f0Var = ((m4.p0) ((a5.a) obj3).d).g;
                if (i20 == -1) {
                    f0Var.t.x0(list);
                } else {
                    f0Var.t.b0(i20, list);
                }
                new SparseBooleanArray().append(20, true);
                f0Var.p(vVar);
                return;
            case 8:
                ((CameraView) obj3).lambda$createCamera$11(i20, (CameraSession) obj2, (CameraView.CameraGLThread) obj);
                return;
            case 9:
                int i39 = 2;
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj3;
                org.telegram.ui.ActionBar.g5 g5Var = (org.telegram.ui.ActionBar.g5) obj2;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.ActionBar.f5 f5Var = actionBarLayout.d0;
                boolean z16 = false;
                int i40 = 0;
                while (i40 < i20) {
                    if (i40 == 0) {
                        o2Var = actionBarLayout.getLastFragment();
                    } else {
                        if ((actionBarLayout.h || actionBarLayout.a0) && actionBarLayout.U0.size() > 1) {
                            o2Var = (org.telegram.ui.ActionBar.o2) si.o0.g(i39, actionBarLayout.U0);
                        }
                        i40++;
                        i39 = 2;
                    }
                    if (o2Var != null) {
                        if (g5Var.m != null) {
                            if (actionBarLayout.e0 == null) {
                                org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(0, true, false, f5Var);
                                actionBarLayout.e0 = j5Var;
                                j5Var.L = true;
                                org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(1, true, false, f5Var);
                                actionBarLayout.f0 = j5Var2;
                                j5Var2.L = true;
                            }
                            qn qnVar = g5Var.m;
                            SparseIntArray sparseIntArray = f5Var.b;
                            sparseIntArray.clear();
                            for (int i41 : (int[]) f5Var.c) {
                                sparseIntArray.put(i41, qnVar.j(i41, false));
                            }
                        }
                        ArrayList<org.telegram.ui.ActionBar.t6> themeDescriptions = o2Var.getThemeDescriptions();
                        actionBarLayout.d(themeDescriptions);
                        Dialog dialog = o2Var.visibleDialog;
                        if (dialog instanceof org.telegram.ui.ActionBar.h3) {
                            actionBarLayout.d(((org.telegram.ui.ActionBar.h3) dialog).getThemeDescriptions());
                        }
                        if (i40 == 0) {
                            if (g5Var.h != null) {
                                qn qnVar2 = g5Var.m;
                                if (qnVar2 != null) {
                                    actionBarLayout.e0(qnVar2);
                                }
                                g5Var.h.run();
                            }
                            qn qnVar3 = g5Var.m;
                            actionBarLayout.o0 = 0;
                            actionBarLayout.p0 = qnVar3;
                            int[] iArr3 = actionBarLayout.k0;
                            if (iArr3 != null) {
                                try {
                                    try {
                                        min = Math.min(org.telegram.ui.ActionBar.k6.f5, iArr3.length);
                                        iArr2 = actionBarLayout.l0;
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        actionBarLayout.o0 = 0;
                                        iArr = null;
                                    }
                                    if (iArr2 != null) {
                                        if (iArr2.length < min) {
                                        }
                                        for (i11 = 0; i11 < min; i11++) {
                                            int g10 = qnVar3 != null ? qnVar3.g(i11) : org.telegram.ui.ActionBar.k6.x0(null, i11, true);
                                            int i42 = actionBarLayout.k0[i11];
                                            if (g10 != i42 && ActionBarLayout.y(i11, i42, g10)) {
                                                int[] iArr4 = actionBarLayout.l0;
                                                int i43 = actionBarLayout.o0;
                                                iArr4[i43] = i11;
                                                actionBarLayout.m0[i43] = actionBarLayout.k0[i11];
                                                actionBarLayout.n0[i43] = g10;
                                                actionBarLayout.o0 = i43 + 1;
                                            }
                                        }
                                        iArr = null;
                                        actionBarLayout.k0 = iArr;
                                    }
                                    actionBarLayout.l0 = new int[min];
                                    actionBarLayout.m0 = new int[min];
                                    actionBarLayout.n0 = new int[min];
                                    while (i11 < min) {
                                    }
                                    iArr = null;
                                    actionBarLayout.k0 = iArr;
                                } catch (Throwable th2) {
                                    actionBarLayout.k0 = null;
                                    throw th2;
                                }
                            }
                        }
                        actionBarLayout.b(themeDescriptions);
                        Dialog dialog2 = o2Var.visibleDialog;
                        if (dialog2 instanceof org.telegram.ui.ActionBar.h3) {
                            actionBarLayout.b(((org.telegram.ui.ActionBar.h3) dialog2).getThemeDescriptions());
                        }
                        z16 = true;
                    }
                    i40++;
                    i39 = 2;
                }
                if (z16) {
                    if (!g5Var.e) {
                        int size3 = actionBarLayout.U0.size() - ((actionBarLayout.h || actionBarLayout.a0) ? 2 : 1);
                        for (int i44 = 0; i44 < size3; i44++) {
                            org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) actionBarLayout.U0.get(i44);
                            o2Var2.clearViews();
                            o2Var2.setParentLayout(actionBarLayout);
                        }
                    }
                    if (g5Var.d) {
                        actionBarLayout.setThemeAnimationValue(1.0f);
                        actionBarLayout.h0.clear();
                        actionBarLayout.b0.clear();
                        actionBarLayout.c0.clear();
                        actionBarLayout.j0.clear();
                        actionBarLayout.j();
                        actionBarLayout.i0 = null;
                        actionBarLayout.g0 = null;
                        ln lnVar = g5Var.j;
                        if (lnVar != null) {
                            lnVar.run();
                        }
                        if (runnable != null) {
                            runnable.run();
                            return;
                        }
                        return;
                    }
                    int i45 = org.telegram.ui.ActionBar.k6.a;
                    org.telegram.ui.ActionBar.k6.vl = new SparseIntArray();
                    actionBarLayout.setThemeAnimationValue(0.0f);
                    ln lnVar2 = g5Var.i;
                    if (lnVar2 != null) {
                        lnVar2.run();
                    }
                    nn nnVar = g5Var.k;
                    actionBarLayout.g0 = nnVar;
                    if (nnVar != null) {
                        qn qnVar4 = nnVar.a;
                        qnVar4.F.x0.invalidate();
                        qnVar4.s.K = 0.0f;
                        qnVar4.t.K = 0.0f;
                        qnVar4.s(0.0f);
                    }
                    actionBarLayout.r0.lock();
                    AnimatorSet animatorSet = new AnimatorSet();
                    actionBarLayout.q0 = animatorSet;
                    animatorSet.addListener(new ne(12, actionBarLayout, g5Var));
                    actionBarLayout.q0.playTogether(ObjectAnimator.ofFloat(actionBarLayout, "themeAnimationValue", 0.0f, 1.0f));
                    actionBarLayout.q0.setDuration(g5Var.l);
                    actionBarLayout.q0.start();
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 10:
                org.telegram.ui.ActionBar.p pVar = (org.telegram.ui.ActionBar.p) obj3;
                SparseIntArray sparseIntArray2 = (SparseIntArray) obj2;
                x9 x9Var = (x9) obj;
                if (i20 != org.telegram.ui.ActionBar.k6.Fl) {
                    pVar.run();
                    return;
                } else {
                    org.telegram.ui.ActionBar.k6.tl = sparseIntArray2;
                    x9Var.run();
                    return;
                }
            case 11:
                ((org.telegram.ui.e1) obj3).a(0, false);
                org.telegram.ui.Components.f5.f0(i20, (TLRPC.TL_error) obj2, null, (TLRPC.TL_channels_joinChannel) obj, Boolean.TRUE);
                return;
            case 12:
                org.telegram.ui.k4 k4Var = (org.telegram.ui.k4) obj3;
                ArrayList arrayList9 = (ArrayList) obj2;
                String str4 = (String) obj;
                if (i20 == k4Var.X0) {
                    k4Var.d0(true);
                    k4Var.E = arrayList9;
                    k4Var.F = str4;
                    k4Var.u0[0].c.y.clear();
                    k4Var.u0[0].b.g1();
                    k4Var.W(0);
                    return;
                }
                return;
            case 13:
                org.telegram.ui.f9 f9Var = (org.telegram.ui.f9) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tLObject2 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject2;
                    MessagesController.getInstance(i20).putUsers(tL_users_userFull.users, false);
                    MessagesController.getInstance(i20).putChats(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.voip.d2.m(user2, false, userFull != null && userFull.video_calls_available, f9Var.getParentActivity(), userFull, AccountInstance.getInstance(i20));
                return;
            case 14:
                sn snVar = (sn) obj3;
                snVar.getClass();
                snVar.h = ((MessagesStorage) obj2).getEncryptedChat(i20);
                ((CountDownLatch) obj).countDown();
                return;
            case 15:
                sn snVar2 = (sn) obj3;
                snVar2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(snVar2.f6), (ArrayList) obj2, Boolean.TRUE, (ArrayList) obj, null, 0, Integer.valueOf(i20), Boolean.valueOf(snVar2.e5));
                snVar2.M3 = null;
                return;
            case 16:
                sn snVar3 = (sn) obj3;
                boolean[] zArr = (boolean[]) obj2;
                sn snVar4 = (sn) obj;
                if (zArr[0] || i20 != snVar3.vc || !snVar3.R3 || snVar3.isFinishing()) {
                    return;
                }
                zArr[0] = true;
                AndroidUtilities.runOnUIThread(new kg(snVar3, 21), 200L);
                snVar3.presentFragment(snVar4);
                if (!snVar3.C9() || snVar4.hideKeyboardOnShow() || (gkVar = snVar4.Y) == null || gkVar.getEditField() == null) {
                    return;
                }
                snVar4.Y.getEditField().requestFocus();
                return;
            case 17:
                tj tjVar = (tj) obj3;
                ArrayList arrayList10 = (ArrayList) obj2;
                ArrayList arrayList11 = (ArrayList) obj;
                xj xjVar = tjVar.n;
                u1 u1Var = xjVar.s;
                if (i20 != tjVar.h) {
                    return;
                }
                if (i20 != -1) {
                    s4.g0 adapter = u1Var.getAdapter();
                    tj tjVar2 = xjVar.F;
                    if (adapter != tjVar2) {
                        u1Var.setAdapter(tjVar2);
                    }
                }
                tjVar.d = arrayList10;
                tjVar.e = arrayList11;
                tjVar.l();
                return;
            case 18:
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
                anVar.f(zmVar, photoEntry, i20);
                anVar.j();
                anVar.i(bnVar.P, false);
                return;
            case 19:
                org.telegram.ui.Components.f5.G(((j80) obj3).e, (org.telegram.ui.ActionBar.g6) obj2, new i2.r(i20, (uo) obj, i17));
                return;
            case 20:
                int[] iArr5 = (int[]) obj3;
                Runnable[] runnableArr = (Runnable[]) obj2;
                int[] iArr6 = (int[]) obj;
                iArr5[0] = iArr5[0] + 1;
                Runnable runnable2 = runnableArr[0];
                if (runnable2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable2);
                    runnableArr[0] = null;
                }
                if (iArr6[0] >= 0) {
                    ConnectionsManager.getInstance(i20).cancelRequest(iArr6[0], true);
                    iArr6[0] = -1;
                    return;
                }
                return;
            case 21:
                org.telegram.ui.ActionBar.o2 o2Var3 = (org.telegram.ui.ActionBar.o2) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                if (o2Var3.getParentActivity() == null) {
                    return;
                }
                if (tLObject3 instanceof Vector) {
                    Vector vector = (Vector) tLObject3;
                    ArrayList arrayList12 = new ArrayList();
                    for (int i46 = 0; i46 < vector.objects.size(); i46++) {
                        try {
                            arrayList12.add(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.Peer) vector.objects.get(i46))));
                        } catch (Exception unused) {
                        }
                    }
                    k10Var = new k10(o2Var3, i20, arrayList12);
                } else {
                    k10Var = new k10(o2Var3, i20, null);
                }
                k10Var.B0 = callback;
                o2Var3.showDialog(k10Var);
                return;
            case 22:
                z30 z30Var = (z30) obj3;
                ArrayList arrayList13 = (ArrayList) obj;
                z30Var.getClass();
                String lowerCase = ((String) obj2).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.h4(z30Var, i20, new ArrayList(), i16));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (lowerCase.equals(translitString) || translitString.length() == 0) {
                    translitString = null;
                }
                int i47 = (translitString != null ? 1 : 0) + 1;
                String[] strArr = new String[i47];
                strArr[0] = lowerCase;
                if (translitString != null) {
                    strArr[1] = translitString;
                }
                ArrayList arrayList14 = new ArrayList();
                int size4 = arrayList13.size();
                int i48 = 0;
                while (i48 < size4) {
                    TLObject tLObject4 = (TLObject) arrayList13.get(i48);
                    if (tLObject4 instanceof TLRPC.ChatParticipant) {
                        i12 = i18;
                        i13 = i19;
                        peerId = ((TLRPC.ChatParticipant) tLObject4).user_id;
                    } else {
                        i12 = i18;
                        i13 = i19;
                        if (tLObject4 instanceof TLRPC.ChannelParticipant) {
                            peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject4).peer);
                        }
                        i48++;
                        i19 = i13;
                        i18 = i12;
                        str = null;
                    }
                    i14 = ((org.telegram.ui.ActionBar.h3) z30Var.w).currentAccount;
                    TLRPC.User user3 = MessagesController.getInstance(i14).getUser(Long.valueOf(peerId));
                    if (!UserObject.isUserSelf(user3)) {
                        String lowerCase2 = UserObject.getUserName(user3).toLowerCase();
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                        if (lowerCase2.equals(translitString2)) {
                            translitString2 = str;
                        }
                        int i49 = i13;
                        int i50 = i49;
                        while (true) {
                            if (i49 < i47) {
                                String str5 = strArr[i49];
                                if (lowerCase2.startsWith(str5) || org.telegram.messenger.v0.w(" ", str5, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str5) || org.telegram.messenger.v0.w(" ", str5, translitString2)))) {
                                    i50 = i12;
                                } else {
                                    String publicUsername = UserObject.getPublicUsername(user3);
                                    if (publicUsername != null && publicUsername.startsWith(str5)) {
                                        i50 = 2;
                                    }
                                }
                                if (i50 != 0) {
                                    arrayList14.add(tLObject4);
                                } else {
                                    i49++;
                                }
                            }
                        }
                        i48++;
                        i19 = i13;
                        i18 = i12;
                        str = null;
                    }
                    i48++;
                    i19 = i13;
                    i18 = i12;
                    str = null;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.h4(z30Var, i20, arrayList14, 10));
                return;
            case 23:
                n40 n40Var = (n40) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                String str6 = (String) obj;
                int i51 = n40Var.P;
                ArrayList arrayList15 = n40Var.Q;
                if (i20 != n40Var.V) {
                    return;
                }
                boolean isEmpty = arrayList15.isEmpty();
                n40Var.U = false;
                if (tLObject5 instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject5;
                    if (messages_messages2 instanceof TLRPC.TL_messages_messages) {
                        n40Var.Y = ((TLRPC.TL_messages_messages) messages_messages2).messages.size();
                    } else if (messages_messages2 instanceof TLRPC.TL_messages_messagesSlice) {
                        n40Var.Y = ((TLRPC.TL_messages_messagesSlice) messages_messages2).count;
                    }
                    n40Var.b0 = messages_messages2.next_rate;
                    MessagesController.getInstance(i51).putUsers(messages_messages2.users, false);
                    MessagesController.getInstance(i51).putChats(messages_messages2.chats, false);
                    for (int i52 = 0; i52 < messages_messages2.messages.size(); i52++) {
                        MessageObject messageObject3 = new MessageObject(i51, messages_messages2.messages.get(i52), false, true);
                        messageObject3.setQuery(str6);
                        arrayList15.add(messageObject3);
                    }
                    n40Var.X = arrayList15.size() >= n40Var.Y;
                    n40Var.W();
                } else {
                    n40Var.X = true;
                    n40Var.Y = arrayList15.size();
                }
                n40Var.N(true);
                if (isEmpty) {
                    ((qo0) n40Var).e0.t0.h1(0, 0);
                    return;
                }
                return;
            case 24:
                jo0.c(((jo0) obj3).getContext(), i20, ((go0) obj).a.g(), (org.telegram.ui.ActionBar.g6) obj2);
                return;
            case 25:
                a();
                return;
            case 26:
                ((xv0) obj3).K0((MessageObject) obj2, (View) obj, i20, false);
                return;
            case 27:
                b();
                return;
            case 28:
                c();
                return;
            default:
                tu0 tu0Var = (tu0) obj3;
                ArrayList arrayList16 = (ArrayList) obj2;
                String str7 = (String) obj;
                xv0 xv0Var = tu0Var.v;
                if (tu0Var.h != 0) {
                    if (i20 == tu0Var.n) {
                        int h10 = tu0Var.h();
                        tu0Var.f = arrayList16;
                        tu0Var.s--;
                        int h11 = tu0Var.h();
                        if (tu0Var.s == 0 || h11 != 0) {
                            xv0Var.p1(false);
                        }
                        int i53 = 0;
                        while (true) {
                            qu0[] qu0VarArr = xv0Var.k0;
                            if (i53 < qu0VarArr.length) {
                                qu0 qu0Var = qu0VarArr[i53];
                                if (qu0Var.F == tu0Var.r) {
                                    if (tu0Var.s == 0 && h11 == 0) {
                                        qu0Var.w.d.setText(LocaleController.formatString("NoResultFoundFor", R.string.NoResultFoundFor, str7));
                                        qu0VarArr[i53].w.f.setVisibility(8);
                                        qu0VarArr[i53].w.e(false, true);
                                    } else if (h10 == 0) {
                                        xv0Var.z(qu0Var.h, 0, null);
                                    }
                                }
                                i53++;
                            } else {
                                tu0Var.l();
                            }
                        }
                    }
                    tu0Var.h = 0;
                    return;
                }
                return;
        }
    }

    public /* synthetic */ db(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ db(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
    }

    public /* synthetic */ db(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
    }

    public /* synthetic */ db(jo0 jo0Var, int i10, go0 go0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.a = 24;
        this.c = jo0Var;
        this.b = i10;
        this.e = go0Var;
        this.d = g6Var;
    }
}
