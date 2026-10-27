package ai;

import a8.ng;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bi.ce;
import bi.h7;
import bi.s9;
import di.z6;
import hi.a5;
import hi.u2;
import j$.util.Objects;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import jg.b2;
import jg.c2;
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
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.b40;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.cn;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.n10;
import org.telegram.ui.Components.p40;
import org.telegram.ui.Components.po0;
import org.telegram.ui.Components.qr0;
import org.telegram.ui.Components.rr0;
import org.telegram.ui.Components.tj;
import org.telegram.ui.Components.vo0;
import org.telegram.ui.Components.voip.g2;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xj;
import org.telegram.ui.g4;
import org.telegram.ui.h9;
import org.telegram.ui.ig;
import org.telegram.ui.j4;
import org.telegram.ui.jk;
import org.telegram.ui.kv;
import org.telegram.ui.ox;
import org.telegram.ui.pn;
import org.telegram.ui.rn;
import org.telegram.ui.un;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h1(int i10, Object obj, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = i10;
        this.b = obj;
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
        rr0 rr0Var = (rr0) this.b;
        TLObject tLObject = (TLObject) this.e;
        String str = (String) this.d;
        HashMap hashMap = rr0Var.v;
        if (this.c != rr0Var.y) {
            return;
        }
        rr0Var.x = 0;
        if (tLObject instanceof TL_account.webPagePreview) {
            TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
            MessagesController.getInstance(rr0Var.c).putUsers(webpagepreview.users, false);
            MessagesController.getInstance(rr0Var.c).putChats(webpagepreview.chats, false);
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
                    rr0Var.w = webPage;
                    rr0.a(rr0Var.a[0], webPage, str);
                    return;
                }
                if (webPage instanceof TLRPC.TL_webPagePending) {
                    rr0Var.w = webPage;
                    return;
                }
                if (webPage instanceof TLRPC.TL_webPageEmpty) {
                    rr0Var.w = null;
                    if (rr0Var.b != 0) {
                        rr0Var.b = 0;
                        qr0 qr0Var = rr0Var.H;
                        if (qr0Var != null) {
                            ((kv) qr0Var).i(0);
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

    /* JADX WARN: Removed duplicated region for block: B:230:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d0 A[LOOP:2: B:66:0x0194->B:82:0x01d0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01cc A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        r2 r2Var;
        int[] iArr;
        int min;
        int[] iArr2;
        int i11;
        TLRPC.UserFull userFull;
        jk jkVar;
        n10 n10Var;
        int i12;
        long peerId;
        int i13;
        int i14;
        int i15;
        int i16 = this.a;
        int i17 = 24;
        int i18 = 8;
        int i19 = 10;
        int i20 = 1;
        int i21 = 0;
        int i22 = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        int i23 = 2;
        Object obj3 = this.b;
        switch (i16) {
            case 0:
                ((t1) obj3).d1(i22, (String) obj2, (String) obj);
                return;
            case 1:
                t1 t1Var = (t1) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                int[] iArr3 = (int[]) obj;
                t1Var.W4 = false;
                if (t1Var.X4 == null) {
                    t1Var.X4 = bitmap;
                    t1Var.Y4 = iArr3;
                    t1Var.Z4 = i22;
                    return;
                }
                return;
            case 2:
                int i24 = this.c;
                h7 h7Var = new h7((Context) obj3, i24, UserConfig.getInstance(i24).getClientUserId(), (u6) obj2, null);
                h7Var.L2((TL_stars.SavedStarGift) obj, null);
                h7Var.show();
                return;
            case 3:
                z6 z6Var = (z6) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) obj;
                AbstractSet abstractSet = z6Var.k;
                int i25 = z6Var.f;
                AbstractSet abstractSet2 = z6Var.l;
                z6Var.A = -1;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i26 = z6Var.e;
                sb2.append(i26);
                sb2.append("{");
                long j10 = z6Var.d;
                sb2.append(j10);
                sb2.append("} loaded {");
                sb2.append(di.h7.a(arrayList));
                ic.a.w("}", sb2);
                ArrayList arrayList2 = z6Var.g;
                arrayList2.clear();
                arrayList2.addAll(tL_stories_stories.pinned_to_top);
                int i27 = z6Var.c;
                boolean z10 = false;
                MessagesController.getInstance(i27).putUsers(tL_stories_stories.users, false);
                MessagesController.getInstance(i27).putChats(tL_stories_stories.chats, false);
                MessagesStorage.getInstance(i27).putUsersAndChats(tL_stories_stories.users, tL_stories_stories.chats, true, true);
                z6Var.u = false;
                z6Var.s = tL_stories_stories.count;
                int i28 = 0;
                while (i28 < arrayList.size()) {
                    z6Var.t((MessageObject) arrayList.get(i28), z10);
                    i28++;
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
                } else if (i25 <= 0) {
                    if (i22 == -1) {
                        if (!abstractSet2.isEmpty()) {
                            ArrayList arrayList3 = new ArrayList(abstractSet2);
                            for (int i29 = 0; i29 < arrayList3.size(); i29++) {
                                Integer num2 = (Integer) arrayList3.get(i29);
                                int intValue2 = num2.intValue();
                                if (!arrayList2.contains(num2)) {
                                    i10 = intValue2;
                                    i22 = i10;
                                }
                            }
                        }
                        i10 = -1;
                        i22 = i10;
                    }
                    int n10 = z6Var.n();
                    Iterator it2 = abstractSet.iterator();
                    while (it2.hasNext()) {
                        Integer num3 = (Integer) it2.next();
                        int intValue3 = num3.intValue();
                        if (!abstractSet2.contains(num3) && intValue3 >= i22 && intValue3 <= n10) {
                            it2.remove();
                            z6Var.u(intValue3, false);
                        }
                    }
                }
                z6Var.d(true);
                if (z6Var.r) {
                    if (z6.B == null) {
                        z6.B = new HashMap();
                    }
                    z6.B.put(Integer.valueOf(Objects.hash(Integer.valueOf(i27), Integer.valueOf(i26), Long.valueOf(j10), Integer.valueOf(i25))), Long.valueOf(System.currentTimeMillis()));
                } else {
                    z6Var.w();
                }
                z6Var.x();
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new e2.m0(MessagesStorage.getInstance(i22).getUsers((ArrayList) obj3), (HashMap) obj2, (Utilities.Callback) obj, 10));
                return;
            case 5:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj3;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (userFull2 == null) {
                    rVar.run(Boolean.FALSE, "cancelled");
                    return;
                } else {
                    a5.b(i22, user, userFull2, rVar);
                    return;
                }
            case 6:
                ig.i0 i0Var = (ig.i0) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                z3 z3Var = (z3) obj;
                ArrayList arrayList5 = i0Var.K;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - i0Var.n0 < 300) {
                    return;
                }
                i0Var.n0 = elapsedRealtime;
                int size = arrayList5.size();
                int size2 = arrayList4.size();
                int i30 = (arrayList4.isEmpty() && arrayList5.isEmpty()) ? 0 : size2 + size;
                int min2 = Math.min(3, size2) + size;
                int h = i0Var.h();
                boolean z12 = i0Var.G0;
                boolean z13 = h > ((z12 ? min2 : i30) + i22) + 1;
                s4.l lVar = i0Var.i0;
                if (lVar != null) {
                    lVar.c = z13 ? 45L : 200L;
                    lVar.d = z13 ? 80L : 200L;
                    lVar.l = z13 ? 270L : 0L;
                }
                i0Var.G0 = !z12;
                z3Var.setRightTextMargin(16);
                String string = LocaleController.getString(i0Var.G0 ? R.string.ShowMore : R.string.ShowLess);
                boolean z14 = i0Var.G0;
                y3 y3Var = z3Var.b;
                y3Var.c(string, true, z14);
                y3Var.setVisibility(0);
                i0Var.o0 = null;
                View view = (View) z3Var.getParent();
                if (view instanceof RecyclerView) {
                    RecyclerView recyclerView = (RecyclerView) view;
                    int i31 = (!i0Var.G0 ? i22 + min2 : i30 + i22) + 1;
                    int i32 = 0;
                    while (true) {
                        if (i32 < recyclerView.getChildCount()) {
                            View childAt = recyclerView.getChildAt(i32);
                            if (RecyclerView.R(childAt) == i31) {
                                i0Var.o0 = childAt;
                            } else {
                                i32++;
                            }
                        }
                    }
                }
                int i33 = i22 + min2;
                int i34 = i33 + 1;
                int max = Math.max(0, size2 - 3);
                if (i0Var.G0) {
                    i0Var.t(i34, max);
                    if (z13) {
                        AndroidUtilities.runOnUIThread(new ag.r0(i0Var, i33, 12), 350L);
                    } else {
                        i0Var.m(i33);
                    }
                } else {
                    i0Var.m(i33);
                    i0Var.s(i34, max);
                }
                u2 u2Var = i0Var.p0;
                if (u2Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(u2Var);
                }
                if (!z13) {
                    i0Var.m0 = false;
                    return;
                }
                i0Var.m0 = true;
                u2 u2Var2 = new u2(i18, i0Var, view);
                i0Var.p0 = u2Var2;
                AndroidUtilities.runOnUIThread(u2Var2, 400L);
                return;
            case 7:
                ig.i0 i0Var2 = (ig.i0) obj3;
                TLObject tLObject = (TLObject) obj;
                String str = (String) obj2;
                int i35 = i0Var2.s0;
                if (i22 == i0Var2.d0 && (tLObject instanceof TLRPC.messages_Messages)) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    i0Var2.v = messages_messages instanceof TLRPC.TL_messages_messages ? ((TLRPC.TL_messages_messages) messages_messages).messages.size() : messages_messages instanceof TLRPC.TL_messages_messagesSlice ? ((TLRPC.TL_messages_messagesSlice) messages_messages).count : 0;
                    i0Var2.w = messages_messages.next_rate;
                    i0Var2.y = str;
                    boolean z15 = false;
                    MessagesController.getInstance(i35).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i35).putChats(messages_messages.chats, false);
                    int i36 = 0;
                    while (i36 < messages_messages.messages.size()) {
                        i0Var2.x.add(new MessageObject(i35, messages_messages.messages.get(i36), z15, true));
                        i36++;
                        z15 = false;
                    }
                    ox oxVar = i0Var2.U;
                    if (oxVar != null) {
                        oxVar.d(i0Var2.D0 > 0, true);
                    }
                    i0Var2.l();
                    return;
                }
                return;
            case 8:
                c2 c2Var = (c2) obj3;
                ArrayList arrayList6 = c2Var.b;
                TLRPC.Message message = (TLRPC.Message) obj;
                String str2 = (String) obj2;
                int i37 = c2Var.a;
                if ((message.flags & TLObject.FLAG_30) != 0) {
                    b2 c10 = c2Var.c(message.quick_reply_shortcut_id);
                    if (c10 == null) {
                        b2 b2Var = new b2();
                        b2Var.a = message.quick_reply_shortcut_id;
                        b2Var.d = message.id;
                        MessageObject messageObject = new MessageObject(i37, message, false, true);
                        b2Var.e = messageObject;
                        messageObject.generateThumbs(false);
                        if (str2 != null) {
                            b2Var.b = str2;
                            c2Var.a(str2);
                        }
                        b2Var.e.applyQuickReply(str2, i22);
                        b2Var.f = 1;
                        arrayList6.add(b2Var);
                        for (int i38 = 0; i38 < arrayList6.size(); i38++) {
                            ((b2) arrayList6.get(i38)).c = i38;
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i37);
                        messagesStorage.getStorageQueue().postRunnable(new u2(i17, messagesStorage, b2Var));
                        NotificationCenter.getInstance(i37).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                    } else {
                        int i39 = c10.d;
                        int i40 = message.id;
                        if (i39 == i40) {
                            c10.d = i40;
                            MessageObject messageObject2 = new MessageObject(i37, message, false, true);
                            c10.e = messageObject2;
                            messageObject2.generateThumbs(false);
                            c2Var.l();
                            NotificationCenter.getInstance(i37).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        } else if ((message.flags & 32768) == 0) {
                            c10.f++;
                            c2Var.l();
                            NotificationCenter.getInstance(i37).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        }
                    }
                }
                if (str2 == null && i22 == 0) {
                    ArrayList<TLRPC.Message> arrayList7 = new ArrayList<>();
                    arrayList7.add(message);
                    MessagesStorage.getInstance(i37).putMessages(arrayList7, true, true, false, DownloadController.getInstance(i37).getAutodownloadMask(), 5, message.quick_reply_shortcut_id);
                    long clientUserId = UserConfig.getInstance(i37).getClientUserId();
                    ArrayList<MessageObject> arrayList8 = new ArrayList<>();
                    arrayList8.add(new MessageObject(i37, message, true, true));
                    MessagesController.getInstance(i37).updateInterfaceWithMessages(clientUserId, arrayList8, 5);
                    return;
                }
                return;
            case 9:
                List list = (List) obj2;
                m4.w wVar = (m4.w) obj;
                m4.f0 f0Var = ((m4.p0) ((ng) obj3).d).g;
                if (i22 == -1) {
                    f0Var.t.x0(list);
                } else {
                    f0Var.t.b0(i22, list);
                }
                new SparseBooleanArray().append(20, true);
                f0Var.p(wVar);
                return;
            case 10:
                ((CameraView) obj3).lambda$createCamera$11(i22, (CameraSession) obj2, (CameraView.CameraGLThread) obj);
                return;
            case 11:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj3;
                i5 i5Var = (i5) obj2;
                Runnable runnable = (Runnable) obj;
                h5 h5Var = actionBarLayout.d0;
                boolean z16 = false;
                int i41 = 0;
                while (i41 < i22) {
                    if (i41 == 0) {
                        r2Var = actionBarLayout.getLastFragment();
                    } else {
                        if ((actionBarLayout.h || actionBarLayout.a0) && actionBarLayout.U0.size() > 1) {
                            r2Var = (r2) b10.h(i23, actionBarLayout.U0);
                        }
                        i41++;
                        i23 = 2;
                    }
                    if (r2Var != null) {
                        if (i5Var.m != null) {
                            if (actionBarLayout.e0 == null) {
                                l5 l5Var = new l5(0, true, false, h5Var);
                                actionBarLayout.e0 = l5Var;
                                l5Var.L = true;
                                l5 l5Var2 = new l5(1, true, false, h5Var);
                                actionBarLayout.f0 = l5Var2;
                                l5Var2.L = true;
                            }
                            un unVar = i5Var.m;
                            SparseIntArray sparseIntArray = h5Var.b;
                            sparseIntArray.clear();
                            for (int i42 : (int[]) h5Var.c) {
                                sparseIntArray.put(i42, unVar.j(i42, false));
                            }
                        }
                        ArrayList<org.telegram.ui.ActionBar.h7> themeDescriptions = r2Var.getThemeDescriptions();
                        actionBarLayout.d(themeDescriptions);
                        Dialog dialog = r2Var.visibleDialog;
                        if (dialog instanceof k3) {
                            actionBarLayout.d(((k3) dialog).getThemeDescriptions());
                        }
                        if (i41 == 0) {
                            if (i5Var.h != null) {
                                un unVar2 = i5Var.m;
                                if (unVar2 != null) {
                                    actionBarLayout.f0(unVar2);
                                }
                                i5Var.h.run();
                            }
                            un unVar3 = i5Var.m;
                            actionBarLayout.o0 = 0;
                            actionBarLayout.p0 = unVar3;
                            int[] iArr4 = actionBarLayout.k0;
                            if (iArr4 != null) {
                                try {
                                    try {
                                        min = Math.min(y6.f5, iArr4.length);
                                        iArr2 = actionBarLayout.l0;
                                    } catch (Throwable th2) {
                                        actionBarLayout.k0 = null;
                                        throw th2;
                                    }
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    actionBarLayout.o0 = 0;
                                    iArr = null;
                                }
                                if (iArr2 != null) {
                                    if (iArr2.length < min) {
                                    }
                                    for (i11 = 0; i11 < min; i11++) {
                                        int g7 = unVar3 != null ? unVar3.g(i11) : y6.x0(null, i11, true);
                                        int i43 = actionBarLayout.k0[i11];
                                        if (g7 != i43 && ActionBarLayout.y(i11, i43, g7)) {
                                            int[] iArr5 = actionBarLayout.l0;
                                            int i44 = actionBarLayout.o0;
                                            iArr5[i44] = i11;
                                            actionBarLayout.m0[i44] = actionBarLayout.k0[i11];
                                            actionBarLayout.n0[i44] = g7;
                                            actionBarLayout.o0 = i44 + 1;
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
                            }
                        }
                        actionBarLayout.b(themeDescriptions);
                        Dialog dialog2 = r2Var.visibleDialog;
                        if (dialog2 instanceof k3) {
                            actionBarLayout.b(((k3) dialog2).getThemeDescriptions());
                        }
                        z16 = true;
                    }
                    i41++;
                    i23 = 2;
                }
                if (z16) {
                    if (!i5Var.e) {
                        int size3 = actionBarLayout.U0.size() - ((actionBarLayout.h || actionBarLayout.a0) ? 2 : 1);
                        for (int i45 = 0; i45 < size3; i45++) {
                            r2 r2Var2 = (r2) actionBarLayout.U0.get(i45);
                            r2Var2.clearViews();
                            r2Var2.setParentLayout(actionBarLayout);
                        }
                    }
                    if (i5Var.d) {
                        actionBarLayout.setThemeAnimationValue(1.0f);
                        actionBarLayout.h0.clear();
                        actionBarLayout.b0.clear();
                        actionBarLayout.c0.clear();
                        actionBarLayout.j0.clear();
                        actionBarLayout.j();
                        actionBarLayout.i0 = null;
                        actionBarLayout.g0 = null;
                        pn pnVar = i5Var.j;
                        if (pnVar != null) {
                            pnVar.run();
                        }
                        if (runnable != null) {
                            runnable.run();
                            return;
                        }
                        return;
                    }
                    int i46 = y6.a;
                    y6.vl = new SparseIntArray();
                    actionBarLayout.setThemeAnimationValue(0.0f);
                    pn pnVar2 = i5Var.i;
                    if (pnVar2 != null) {
                        pnVar2.run();
                    }
                    rn rnVar = i5Var.k;
                    actionBarLayout.g0 = rnVar;
                    if (rnVar != null) {
                        un unVar4 = rnVar.a;
                        unVar4.F.x0.invalidate();
                        unVar4.s.K = 0.0f;
                        unVar4.t.K = 0.0f;
                        unVar4.s(0.0f);
                    }
                    actionBarLayout.r0.lock();
                    AnimatorSet animatorSet = new AnimatorSet();
                    actionBarLayout.q0 = animatorSet;
                    animatorSet.addListener(new ce(12, actionBarLayout, i5Var));
                    actionBarLayout.q0.playTogether(ObjectAnimator.ofFloat(actionBarLayout, "themeAnimationValue", 0.0f, 1.0f));
                    actionBarLayout.q0.setDuration(i5Var.l);
                    actionBarLayout.q0.start();
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.ActionBar.q qVar = (org.telegram.ui.ActionBar.q) obj3;
                SparseIntArray sparseIntArray2 = (SparseIntArray) obj2;
                s9 s9Var = (s9) obj;
                if (i22 != y6.Fl) {
                    qVar.run();
                    return;
                } else {
                    y6.tl = sparseIntArray2;
                    s9Var.run();
                    return;
                }
            case 13:
                ((org.telegram.ui.c1) obj3).a(0, false);
                g5.e0(i22, (TLRPC.TL_error) obj2, null, (TLRPC.TL_channels_joinChannel) obj, Boolean.TRUE);
                return;
            case 14:
                j4 j4Var = (j4) obj3;
                ArrayList arrayList9 = (ArrayList) obj;
                String str3 = (String) obj2;
                if (i22 == j4Var.X0) {
                    j4Var.d0(true);
                    j4Var.E = arrayList9;
                    j4Var.F = str3;
                    j4Var.u0[0].c.y.clear();
                    j4Var.u0[0].b.g1();
                    j4Var.W(0);
                    return;
                }
                return;
            case 15:
                h9 h9Var = (h9) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tLObject2 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject2;
                    MessagesController.getInstance(i22).putUsers(tL_users_userFull.users, false);
                    MessagesController.getInstance(i22).putChats(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                g2.m(user2, false, userFull != null && userFull.video_calls_available, h9Var.getParentActivity(), userFull, AccountInstance.getInstance(i22));
                return;
            case 16:
                wn wnVar = (wn) obj3;
                wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(wnVar.j6), (ArrayList) obj2, Boolean.TRUE, (ArrayList) obj, null, 0, Integer.valueOf(i22), Boolean.valueOf(wnVar.e5));
                wnVar.M3 = null;
                return;
            case 17:
                wn wnVar2 = (wn) obj3;
                boolean[] zArr = (boolean[]) obj2;
                wn wnVar3 = (wn) obj;
                if (zArr[0] || i22 != wnVar2.Ic || !wnVar2.R3 || wnVar2.isFinishing()) {
                    return;
                }
                zArr[0] = true;
                AndroidUtilities.runOnUIThread(new ig(wnVar2, i17), 200L);
                wnVar2.presentFragment(wnVar3);
                if (!wnVar2.I9() || wnVar3.hideKeyboardOnShow() || (jkVar = wnVar3.Y) == null || jkVar.getEditField() == null) {
                    return;
                }
                wnVar3.Y.getEditField().requestFocus();
                return;
            case 18:
                wn wnVar4 = (wn) obj3;
                wnVar4.getClass();
                wnVar4.h = ((MessagesStorage) obj2).getEncryptedChat(i22);
                ((CountDownLatch) obj).countDown();
                return;
            case 19:
                tj tjVar = (tj) obj3;
                ArrayList arrayList10 = (ArrayList) obj2;
                ArrayList arrayList11 = (ArrayList) obj;
                xj xjVar = tjVar.n;
                bi.r1 r1Var = xjVar.s;
                if (i22 != tjVar.h) {
                    return;
                }
                if (i22 != -1) {
                    s4.h0 adapter = r1Var.getAdapter();
                    tj tjVar2 = xjVar.F;
                    if (adapter != tjVar2) {
                        r1Var.setAdapter(tjVar2);
                    }
                }
                tjVar.d = arrayList10;
                tjVar.e = arrayList11;
                tjVar.l();
                return;
            case 20:
                bn bnVar = (bn) obj3;
                an anVar = (an) obj2;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                cn cnVar = bnVar.P;
                ValueAnimator valueAnimator = cnVar.L;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                cnVar.J = null;
                bnVar.G = 0.0f;
                bnVar.f(anVar, photoEntry, i22);
                bnVar.j();
                bnVar.i(cnVar.P, false);
                return;
            case 21:
                g5.F(((l80) obj3).e, (u6) obj2, new i2.r(i22, (wo) obj, i18));
                return;
            case 22:
                int[] iArr6 = (int[]) obj3;
                Runnable[] runnableArr = (Runnable[]) obj2;
                int[] iArr7 = (int[]) obj;
                iArr6[0] = iArr6[0] + 1;
                Runnable runnable2 = runnableArr[0];
                if (runnable2 != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable2);
                    runnableArr[0] = null;
                }
                if (iArr7[0] >= 0) {
                    ConnectionsManager.getInstance(i22).cancelRequest(iArr7[0], true);
                    iArr7[0] = -1;
                    return;
                }
                return;
            case 23:
                r2 r2Var3 = (r2) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                if (r2Var3.getParentActivity() == null) {
                    return;
                }
                if (tLObject3 instanceof Vector) {
                    Vector vector = (Vector) tLObject3;
                    ArrayList arrayList12 = new ArrayList();
                    for (int i47 = 0; i47 < vector.objects.size(); i47++) {
                        try {
                            arrayList12.add(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.Peer) vector.objects.get(i47))));
                        } catch (Exception unused) {
                        }
                    }
                    n10Var = new n10(r2Var3, i22, arrayList12);
                } else {
                    n10Var = new n10(r2Var3, i22, null);
                }
                n10Var.B0 = callback;
                r2Var3.showDialog(n10Var);
                return;
            case 24:
                b40 b40Var = (b40) obj3;
                ArrayList arrayList13 = (ArrayList) obj;
                b40Var.getClass();
                String lowerCase = ((String) obj2).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new g4(b40Var, i22, new ArrayList(), i19));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (lowerCase.equals(translitString) || translitString.length() == 0) {
                    translitString = null;
                }
                int i48 = (translitString != null ? 1 : 0) + 1;
                String[] strArr = new String[i48];
                strArr[0] = lowerCase;
                if (translitString != null) {
                    strArr[1] = translitString;
                }
                ArrayList arrayList14 = new ArrayList();
                int size4 = arrayList13.size();
                int i49 = 0;
                while (i49 < size4) {
                    TLObject tLObject4 = (TLObject) arrayList13.get(i49);
                    if (tLObject4 instanceof TLRPC.ChatParticipant) {
                        i12 = i20;
                        peerId = ((TLRPC.ChatParticipant) tLObject4).user_id;
                    } else {
                        i12 = i20;
                        if (tLObject4 instanceof TLRPC.ChannelParticipant) {
                            peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject4).peer);
                        }
                        i14 = size4;
                        i13 = i21;
                        i49++;
                        size4 = i14;
                        i20 = i12;
                        i21 = i13;
                    }
                    i15 = ((k3) b40Var.w).currentAccount;
                    TLRPC.User user3 = MessagesController.getInstance(i15).getUser(Long.valueOf(peerId));
                    if (!UserObject.isUserSelf(user3)) {
                        String lowerCase2 = UserObject.getUserName(user3).toLowerCase();
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                        if (lowerCase2.equals(translitString2)) {
                            translitString2 = null;
                        }
                        int i50 = i21;
                        i13 = i50;
                        while (true) {
                            if (i21 < i48) {
                                String str4 = strArr[i21];
                                if (lowerCase2.startsWith(str4)) {
                                    i14 = size4;
                                } else {
                                    i14 = size4;
                                    if (!wh.u(" ", str4, lowerCase2) && (translitString2 == null || (!translitString2.startsWith(str4) && !wh.u(" ", str4, translitString2)))) {
                                        String publicUsername = UserObject.getPublicUsername(user3);
                                        if (publicUsername != null && publicUsername.startsWith(str4)) {
                                            i50 = 2;
                                        }
                                        if (i50 == 0) {
                                            arrayList14.add(tLObject4);
                                        } else {
                                            i21++;
                                            size4 = i14;
                                        }
                                    }
                                }
                                i50 = i12;
                                if (i50 == 0) {
                                }
                            } else {
                                i14 = size4;
                            }
                        }
                        i49++;
                        size4 = i14;
                        i20 = i12;
                        i21 = i13;
                    }
                    i14 = size4;
                    i13 = i21;
                    i49++;
                    size4 = i14;
                    i20 = i12;
                    i21 = i13;
                }
                AndroidUtilities.runOnUIThread(new g4(b40Var, i22, arrayList14, 10));
                return;
            case 25:
                p40 p40Var = (p40) obj3;
                TLObject tLObject5 = (TLObject) obj;
                String str5 = (String) obj2;
                int i51 = p40Var.P;
                ArrayList arrayList15 = p40Var.Q;
                if (i22 != p40Var.V) {
                    return;
                }
                boolean isEmpty = arrayList15.isEmpty();
                p40Var.U = false;
                if (tLObject5 instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject5;
                    if (messages_messages2 instanceof TLRPC.TL_messages_messages) {
                        p40Var.Y = ((TLRPC.TL_messages_messages) messages_messages2).messages.size();
                    } else if (messages_messages2 instanceof TLRPC.TL_messages_messagesSlice) {
                        p40Var.Y = ((TLRPC.TL_messages_messagesSlice) messages_messages2).count;
                    }
                    p40Var.b0 = messages_messages2.next_rate;
                    MessagesController.getInstance(i51).putUsers(messages_messages2.users, false);
                    MessagesController.getInstance(i51).putChats(messages_messages2.chats, false);
                    for (int i52 = 0; i52 < messages_messages2.messages.size(); i52++) {
                        MessageObject messageObject3 = new MessageObject(i51, messages_messages2.messages.get(i52), false, true);
                        messageObject3.setQuery(str5);
                        arrayList15.add(messageObject3);
                    }
                    p40Var.X = arrayList15.size() >= p40Var.Y;
                    p40Var.X();
                } else {
                    p40Var.X = true;
                    p40Var.Y = arrayList15.size();
                }
                p40Var.O(true);
                if (isEmpty) {
                    ((vo0) p40Var).e0.v0.h1(0, 0);
                    return;
                }
                return;
            case 26:
                po0.c(((po0) obj3).getContext(), i22, ((mo0) obj2).a.g(), (u6) obj);
                return;
            case 27:
                a();
                return;
            case 28:
                g5.e0(i22, (TLRPC.TL_error) obj2, ((bw0) obj3).x1, (TLRPC.TL_messages_editMessage) obj, new Object[0]);
                return;
            default:
                ((bw0) obj3).O0((MessageObject) obj2, (View) obj, i22, false);
                return;
        }
    }

    public /* synthetic */ h1(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.b = obj;
        this.c = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ h1(Object obj, int i10, Object obj2, String str, int i11) {
        this.a = i11;
        this.b = obj;
        this.c = i10;
        this.e = obj2;
        this.d = str;
    }

    public /* synthetic */ h1(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.b = obj;
        this.d = obj2;
        this.c = i10;
        this.e = obj3;
    }

    public /* synthetic */ h1(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = i10;
    }

    public /* synthetic */ h1(c2 c2Var, TLRPC.Message message, String str, int i10) {
        this.a = 8;
        this.b = c2Var;
        this.e = message;
        this.d = str;
        this.c = i10;
    }
}
