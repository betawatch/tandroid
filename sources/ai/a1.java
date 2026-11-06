package ai;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bi.k7;
import bi.q1;
import di.q6;
import di.y6;
import fi.g5;
import fi.x1;
import hi.o4;
import j$.util.Objects;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import kg.s1;
import kg.t1;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.gf;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.yr;
import org.telegram.messenger.z5;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p4;
import org.telegram.ui.ActionBar.t4;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.Cells.w3;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.am;
import org.telegram.ui.Components.bj;
import org.telegram.ui.Components.bm;
import org.telegram.ui.Components.fj;
import org.telegram.ui.Components.g20;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.Components.po0;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.u20;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.voip.y1;
import org.telegram.ui.Components.vz;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xs0;
import org.telegram.ui.Components.zl;
import org.telegram.ui.an;
import org.telegram.ui.c9;
import org.telegram.ui.fu;
import org.telegram.ui.g4;
import org.telegram.ui.hw;
import org.telegram.ui.q8;
import org.telegram.ui.qj;
import org.telegram.ui.tm;
import org.telegram.ui.vm;
import org.telegram.ui.xf;
import org.telegram.ui.ym;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a1(int i7, Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = i7;
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
        po0 po0Var = (po0) this.b;
        TLObject tLObject = (TLObject) this.e;
        String str = (String) this.d;
        HashMap hashMap = po0Var.w;
        if (this.c != po0Var.D) {
            return;
        }
        po0Var.y = 0;
        if (tLObject instanceof TL_account.webPagePreview) {
            TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
            qp.s1(po0Var.c).Y3(webpagepreview.users, false);
            qp.s1(po0Var.c).S3(webpagepreview.chats, false);
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
                    po0Var.x = webPage;
                    po0.a(po0Var.a[0], webPage, str);
                    return;
                }
                if (webPage instanceof TLRPC.TL_webPagePending) {
                    po0Var.x = webPage;
                    return;
                }
                if (webPage instanceof TLRPC.TL_webPageEmpty) {
                    po0Var.x = null;
                    if (po0Var.b != 0) {
                        po0Var.b = 0;
                        oo0 oo0Var = po0Var.H;
                        if (oo0Var != null) {
                            ((fu) oo0Var).i(0);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04e0  */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [android.view.View, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r12v20, types: [org.telegram.messenger.hd] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int intValue;
        ?? r11;
        int i7;
        f2 f2Var;
        int[] iArr;
        int min;
        int[] iArr2;
        int i10;
        TLRPC.UserFull userFull;
        qj qjVar;
        TLRPC.EncryptedChat encryptedChat;
        ArrayList arrayList;
        vz vzVar;
        ?? r19;
        long C1;
        boolean z9;
        boolean z10;
        int i11 = this.a;
        int i12 = 7;
        boolean z11 = true;
        ?? r14 = 0;
        int i13 = this.c;
        Object obj = this.d;
        Object obj2 = this.e;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                ((l1) obj3).d1(i13, (String) obj, (String) obj2);
                return;
            case 1:
                l1 l1Var = (l1) obj3;
                Bitmap bitmap = (Bitmap) obj;
                int[] iArr3 = (int[]) obj2;
                l1Var.V4 = false;
                if (l1Var.W4 == null) {
                    l1Var.W4 = bitmap;
                    l1Var.X4 = iArr3;
                    l1Var.Y4 = i13;
                    return;
                }
                return;
            case 2:
                int i14 = this.c;
                k7 k7Var = new k7((Context) obj3, i14, p10.i(i14).e(), (f6) obj, null);
                k7Var.j2((TL_stars.SavedStarGift) obj2, null);
                k7Var.show();
                return;
            case 3:
                q6 q6Var = (q6) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) obj2;
                AbstractSet abstractSet = q6Var.k;
                int i15 = q6Var.f;
                AbstractSet abstractSet2 = q6Var.l;
                q6Var.A = -1;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i16 = q6Var.e;
                sb2.append(i16);
                sb2.append("{");
                long j3 = q6Var.d;
                sb2.append(j3);
                sb2.append("} loaded {");
                sb2.append(y6.a(arrayList2));
                org.telegram.ui.Cells.f1.u("}", sb2);
                ArrayList arrayList3 = q6Var.g;
                arrayList3.clear();
                arrayList3.addAll(tL_stories_stories.pinned_to_top);
                int i17 = q6Var.c;
                boolean z12 = false;
                qp.s1(i17).Y3(tL_stories_stories.users, false);
                qp.s1(i17).S3(tL_stories_stories.chats, false);
                yr.a0(i17).m1(tL_stories_stories.users, tL_stories_stories.chats, true, true);
                q6Var.u = false;
                q6Var.s = tL_stories_stories.count;
                int i18 = 0;
                while (i18 < arrayList2.size()) {
                    q6Var.t((ij) arrayList2.get(i18), z12);
                    i18++;
                    z12 = false;
                }
                boolean z13 = abstractSet2.size() >= q6Var.s;
                q6Var.r = z13;
                if (z13) {
                    Iterator it = abstractSet.iterator();
                    while (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        int intValue2 = num.intValue();
                        if (!abstractSet2.contains(num)) {
                            it.remove();
                            q6Var.u(intValue2, false);
                        }
                    }
                } else if (i15 <= 0) {
                    if (i13 == -1) {
                        if (!abstractSet2.isEmpty()) {
                            ArrayList arrayList4 = new ArrayList(abstractSet2);
                            for (int i19 = 0; i19 < arrayList4.size(); i19++) {
                                Integer num2 = (Integer) arrayList4.get(i19);
                                intValue = num2.intValue();
                                if (!arrayList3.contains(num2)) {
                                    i13 = intValue;
                                }
                            }
                        }
                        intValue = -1;
                        i13 = intValue;
                    }
                    int n10 = q6Var.n();
                    Iterator it2 = abstractSet.iterator();
                    while (it2.hasNext()) {
                        Integer num3 = (Integer) it2.next();
                        int intValue3 = num3.intValue();
                        if (!abstractSet2.contains(num3) && intValue3 >= i13 && intValue3 <= n10) {
                            it2.remove();
                            q6Var.u(intValue3, false);
                        }
                    }
                }
                q6Var.d(true);
                if (q6Var.r) {
                    if (q6.B == null) {
                        q6.B = new HashMap();
                    }
                    q6.B.put(Integer.valueOf(Objects.hash(Integer.valueOf(i17), Integer.valueOf(i16), Long.valueOf(j3), Integer.valueOf(i15))), Long.valueOf(System.currentTimeMillis()));
                } else {
                    q6Var.w();
                }
                q6Var.x();
                return;
            case 4:
                org.telegram.messenger.g0.h3(new x1(yr.a0(i13).l0((ArrayList) obj3), (HashMap) obj, (c20) obj2, 11));
                return;
            case 5:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj3;
                org.telegram.ui.web.n nVar = (org.telegram.ui.web.n) obj;
                TLRPC.User user = (TLRPC.User) obj2;
                if (userFull2 == null) {
                    nVar.a(Boolean.FALSE, "cancelled");
                    return;
                } else {
                    o4.b(i13, user, userFull2, nVar);
                    return;
                }
            case 6:
                jg.c cVar = (jg.c) obj3;
                String str = (String) obj;
                ArrayList arrayList5 = (ArrayList) obj2;
                ArrayList arrayList6 = cVar.f;
                if (i13 != cVar.s) {
                    return;
                }
                cVar.w = false;
                cVar.h = str;
                arrayList6.clear();
                arrayList6.addAll(arrayList5);
                jg.b bVar = cVar.n;
                if (bVar != null) {
                    bVar.a();
                }
                cVar.f();
                return;
            case 7:
                jg.h0 h0Var = (jg.h0) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                x3 x3Var = (x3) obj2;
                ArrayList arrayList8 = h0Var.K;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - h0Var.n0 < 300) {
                    return;
                }
                h0Var.n0 = elapsedRealtime;
                int size = arrayList8.size();
                int size2 = arrayList7.size();
                int i20 = (arrayList7.isEmpty() && arrayList8.isEmpty()) ? 0 : size2 + size;
                int min2 = Math.min(3, size2) + size;
                int b10 = h0Var.b();
                boolean z14 = h0Var.G0;
                boolean z15 = b10 > ((z14 ? min2 : i20) + i13) + 1;
                v4.k kVar = h0Var.i0;
                if (kVar != null) {
                    kVar.c = z15 ? 45L : 200L;
                    kVar.d = z15 ? 80L : 200L;
                    kVar.l = z15 ? 270L : 0L;
                }
                h0Var.G0 = !z14;
                x3Var.setRightTextMargin(16);
                if (h0Var.G0) {
                    i7 = 2131745340;
                    r11 = 0;
                } else {
                    r11 = 0;
                    i7 = 2131745341;
                }
                String M0 = hd.M0(i7, r11);
                boolean z16 = h0Var.G0;
                w3 w3Var = x3Var.b;
                w3Var.c(M0, true, z16);
                w3Var.setVisibility(0);
                h0Var.o0 = r11;
                View view = (View) x3Var.getParent();
                if (view instanceof RecyclerView) {
                    RecyclerView recyclerView = (RecyclerView) view;
                    int i21 = (!h0Var.G0 ? i13 + min2 : i20 + i13) + 1;
                    int i22 = 0;
                    while (true) {
                        if (i22 < recyclerView.getChildCount()) {
                            View childAt = recyclerView.getChildAt(i22);
                            if (RecyclerView.R(childAt) == i21) {
                                h0Var.o0 = childAt;
                            } else {
                                i22++;
                            }
                        }
                    }
                }
                int i23 = i13 + min2;
                int i24 = i23 + 1;
                int max = Math.max(0, size2 - 3);
                if (h0Var.G0) {
                    h0Var.p(i24, max);
                    if (z15) {
                        org.telegram.messenger.g0.i3(new bg.m0(h0Var, i23, 10), 350L);
                    } else {
                        h0Var.g(i23);
                    }
                } else {
                    h0Var.g(i23);
                    h0Var.o(i24, max);
                }
                ha.b bVar2 = h0Var.p0;
                if (bVar2 != null) {
                    org.telegram.messenger.g0.r(bVar2);
                }
                if (!z15) {
                    h0Var.m0 = false;
                    return;
                }
                h0Var.m0 = true;
                ha.b bVar3 = new ha.b(11, h0Var, view);
                h0Var.p0 = bVar3;
                org.telegram.messenger.g0.i3(bVar3, 400L);
                return;
            case 8:
                jg.h0 h0Var2 = (jg.h0) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str2 = (String) obj;
                int i25 = h0Var2.s0;
                if (i13 == h0Var2.d0 && (tLObject instanceof TLRPC.messages_Messages)) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    h0Var2.w = messages_messages instanceof TLRPC.TL_messages_messages ? ((TLRPC.TL_messages_messages) messages_messages).messages.size() : messages_messages instanceof TLRPC.TL_messages_messagesSlice ? ((TLRPC.TL_messages_messagesSlice) messages_messages).count : 0;
                    h0Var2.x = messages_messages.next_rate;
                    h0Var2.D = str2;
                    boolean z17 = false;
                    qp.s1(i25).Y3(messages_messages.users, false);
                    qp.s1(i25).S3(messages_messages.chats, false);
                    int i26 = 0;
                    while (i26 < messages_messages.messages.size()) {
                        h0Var2.y.add(new ij(i25, messages_messages.messages.get(i26), z17, true));
                        i26++;
                        z17 = false;
                    }
                    hw hwVar = h0Var2.U;
                    if (hwVar != null) {
                        hwVar.d(h0Var2.D0 > 0, true);
                    }
                    h0Var2.f();
                    return;
                }
                return;
            case 9:
                t1 t1Var = (t1) obj3;
                ArrayList arrayList9 = t1Var.b;
                TLRPC.Message message = (TLRPC.Message) obj2;
                String str3 = (String) obj;
                int i27 = t1Var.a;
                if ((message.flags & TLObject.FLAG_30) != 0) {
                    s1 c10 = t1Var.c(message.quick_reply_shortcut_id);
                    if (c10 == null) {
                        s1 s1Var = new s1();
                        s1Var.a = message.quick_reply_shortcut_id;
                        s1Var.d = message.id;
                        ij ijVar = new ij(i27, message, false, true);
                        s1Var.e = ijVar;
                        ijVar.r0(false);
                        if (str3 != null) {
                            s1Var.b = str3;
                            t1Var.a(str3);
                        }
                        s1Var.e.l(i13, str3);
                        s1Var.f = 1;
                        arrayList9.add(s1Var);
                        for (int i28 = 0; i28 < arrayList9.size(); i28++) {
                            ((s1) arrayList9.get(i28)).c = i28;
                        }
                        yr a02 = yr.a0(i27);
                        a02.a.c(new ha.b(20, a02, s1Var));
                        qs.f(i27).k(qs.F1, new Object[0]);
                    } else {
                        int i29 = c10.d;
                        int i30 = message.id;
                        if (i29 == i30) {
                            c10.d = i30;
                            ij ijVar2 = new ij(i27, message, false, true);
                            c10.e = ijVar2;
                            ijVar2.r0(false);
                            t1Var.l();
                            qs.f(i27).k(qs.F1, new Object[0]);
                        } else if ((message.flags & 32768) == 0) {
                            c10.f++;
                            t1Var.l();
                            qs.f(i27).k(qs.F1, new Object[0]);
                        }
                    }
                }
                if (str3 == null && i13 == 0) {
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.add(message);
                    yr.a0(i27).j1(arrayList10, true, true, false, z5.q(i27).l(), false, 5, message.quick_reply_shortcut_id);
                    long e10 = p10.i(i27).e();
                    ArrayList arrayList11 = new ArrayList();
                    arrayList11.add(new ij(i27, message, true, true));
                    qp.s1(i27).l5(5, e10, arrayList11);
                    return;
                }
                return;
            case 10:
                ((CameraView) obj3).lambda$createCamera$11(i13, (CameraSession) obj, (CameraView.CameraGLThread) obj2);
                return;
            case 11:
                int i31 = 2;
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj3;
                p4 p4Var = (p4) obj;
                Runnable runnable = (Runnable) obj2;
                g5 g5Var = actionBarLayout.d0;
                boolean z18 = false;
                int i32 = 0;
                while (i32 < i13) {
                    if (i32 == 0) {
                        f2Var = actionBarLayout.getLastFragment();
                    } else {
                        if ((actionBarLayout.h || actionBarLayout.a0) && actionBarLayout.U0.size() > 1) {
                            f2Var = (f2) rf.b.g(i31, actionBarLayout.U0);
                        }
                        i32++;
                        i31 = 2;
                    }
                    if (f2Var != null) {
                        if (p4Var.m != null) {
                            if (actionBarLayout.e0 == null) {
                                t4 t4Var = new t4(0, true, false, g5Var);
                                actionBarLayout.e0 = t4Var;
                                t4Var.L = true;
                                t4 t4Var2 = new t4(1, true, false, g5Var);
                                actionBarLayout.f0 = t4Var2;
                                t4Var2.L = true;
                            }
                            ym ymVar = p4Var.m;
                            SparseIntArray sparseIntArray = (SparseIntArray) g5Var.b;
                            sparseIntArray.clear();
                            for (int i33 : (int[]) g5Var.c) {
                                sparseIntArray.put(i33, ymVar.k(i33, false));
                            }
                        }
                        ArrayList<t6> themeDescriptions = f2Var.getThemeDescriptions();
                        actionBarLayout.d(themeDescriptions);
                        Dialog dialog = f2Var.visibleDialog;
                        if (dialog instanceof v2) {
                            actionBarLayout.d(((v2) dialog).U());
                        }
                        if (i32 == 0) {
                            if (p4Var.h != null) {
                                ym ymVar2 = p4Var.m;
                                if (ymVar2 != null) {
                                    actionBarLayout.g0(ymVar2);
                                }
                                p4Var.h.run();
                            }
                            ym ymVar3 = p4Var.m;
                            actionBarLayout.o0 = 0;
                            actionBarLayout.p0 = ymVar3;
                            int[] iArr4 = actionBarLayout.k0;
                            if (iArr4 != null) {
                                try {
                                    try {
                                        min = Math.min(k6.f5, iArr4.length);
                                        iArr2 = actionBarLayout.l0;
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                        actionBarLayout.o0 = 0;
                                        iArr = null;
                                    }
                                    if (iArr2 != null) {
                                        if (iArr2.length < min) {
                                        }
                                        for (i10 = 0; i10 < min; i10++) {
                                            int h = ymVar3 != null ? ymVar3.h(i10) : k6.x0(null, i10, true);
                                            int i34 = actionBarLayout.k0[i10];
                                            if (h != i34 && ActionBarLayout.z(i10, i34, h)) {
                                                int[] iArr5 = actionBarLayout.l0;
                                                int i35 = actionBarLayout.o0;
                                                iArr5[i35] = i10;
                                                actionBarLayout.m0[i35] = actionBarLayout.k0[i10];
                                                actionBarLayout.n0[i35] = h;
                                                actionBarLayout.o0 = i35 + 1;
                                            }
                                        }
                                        iArr = null;
                                        actionBarLayout.k0 = iArr;
                                    }
                                    actionBarLayout.l0 = new int[min];
                                    actionBarLayout.m0 = new int[min];
                                    actionBarLayout.n0 = new int[min];
                                    while (i10 < min) {
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
                        Dialog dialog2 = f2Var.visibleDialog;
                        if (dialog2 instanceof v2) {
                            actionBarLayout.b(((v2) dialog2).U());
                        }
                        z18 = true;
                    }
                    i32++;
                    i31 = 2;
                }
                if (z18) {
                    if (!p4Var.e) {
                        int size3 = actionBarLayout.U0.size() - ((actionBarLayout.h || actionBarLayout.a0) ? 2 : 1);
                        for (int i36 = 0; i36 < size3; i36++) {
                            f2 f2Var2 = (f2) actionBarLayout.U0.get(i36);
                            f2Var2.clearViews();
                            f2Var2.setParentLayout(actionBarLayout);
                        }
                    }
                    if (p4Var.d) {
                        actionBarLayout.setThemeAnimationValue(1.0f);
                        actionBarLayout.h0.clear();
                        actionBarLayout.b0.clear();
                        actionBarLayout.c0.clear();
                        actionBarLayout.j0.clear();
                        actionBarLayout.j();
                        actionBarLayout.i0 = null;
                        actionBarLayout.g0 = null;
                        tm tmVar = p4Var.j;
                        if (tmVar != null) {
                            tmVar.run();
                        }
                        if (runnable != null) {
                            runnable.run();
                            return;
                        }
                        return;
                    }
                    int i37 = k6.a;
                    k6.jm = new SparseIntArray();
                    actionBarLayout.setThemeAnimationValue(0.0f);
                    tm tmVar2 = p4Var.i;
                    if (tmVar2 != null) {
                        tmVar2.run();
                    }
                    vm vmVar = p4Var.k;
                    actionBarLayout.g0 = vmVar;
                    if (vmVar != null) {
                        ym ymVar4 = vmVar.a;
                        ymVar4.G.z0.invalidate();
                        ymVar4.t.K = 0.0f;
                        ymVar4.u.K = 0.0f;
                        ymVar4.u(0.0f);
                    }
                    actionBarLayout.r0.d();
                    AnimatorSet animatorSet = new AnimatorSet();
                    actionBarLayout.q0 = animatorSet;
                    animatorSet.addListener(new ah.l(14, actionBarLayout, p4Var));
                    actionBarLayout.q0.playTogether(ObjectAnimator.ofFloat(actionBarLayout, "themeAnimationValue", 0.0f, 1.0f));
                    actionBarLayout.q0.setDuration(p4Var.l);
                    actionBarLayout.q0.start();
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 12:
                l2.w wVar = (l2.w) obj3;
                SparseIntArray sparseIntArray2 = (SparseIntArray) obj;
                aa.d0 d0Var = (aa.d0) obj2;
                if (i13 != k6.tm) {
                    wVar.run();
                    return;
                } else {
                    k6.hm = sparseIntArray2;
                    d0Var.run();
                    return;
                }
            case 13:
                ((org.telegram.ui.a1) obj3).a(0, false);
                v4.c0(i13, (TLRPC.TL_error) obj, null, (TLRPC.TL_channels_joinChannel) obj2, Boolean.TRUE);
                return;
            case 14:
                g4 g4Var = (g4) obj3;
                ArrayList arrayList12 = (ArrayList) obj2;
                String str4 = (String) obj;
                if (i13 == g4Var.X0) {
                    g4Var.b0(true);
                    g4Var.E = arrayList12;
                    g4Var.F = str4;
                    g4Var.u0[0].c.D.clear();
                    g4Var.u0[0].b.g1();
                    g4Var.U(0);
                    return;
                }
                return;
            case 15:
                c9 c9Var = (c9) obj3;
                TLObject tLObject2 = (TLObject) obj;
                TLRPC.User user2 = (TLRPC.User) obj2;
                if (tLObject2 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject2;
                    qp.s1(i13).Y3(tL_users_userFull.users, false);
                    qp.s1(i13).S3(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                y1.m(user2, false, userFull != null && userFull.video_calls_available, c9Var.getParentActivity(), userFull, org.telegram.messenger.c.a(i13));
                return;
            case 16:
                an anVar = (an) obj3;
                anVar.getNotificationCenter().k(56, Long.valueOf(anVar.j6), (ArrayList) obj, Boolean.TRUE, (ArrayList) obj2, null, 0, Integer.valueOf(i13), Boolean.valueOf(anVar.e5));
                anVar.O3 = null;
                return;
            case 17:
                an anVar2 = (an) obj3;
                boolean[] zArr = (boolean[]) obj;
                an anVar3 = (an) obj2;
                if (zArr[0] || i13 != anVar2.Lc || !anVar2.T3 || anVar2.isFinishing()) {
                    return;
                }
                zArr[0] = true;
                org.telegram.messenger.g0.i3(new xf(anVar2, 22), 200L);
                anVar2.presentFragment(anVar3);
                if (!anVar2.T9() || anVar3.hideKeyboardOnShow() || (qjVar = anVar3.Z) == null || qjVar.getEditField() == null) {
                    return;
                }
                anVar3.Z.getEditField().requestFocus();
                return;
            case 18:
                an anVar4 = (an) obj3;
                yr yrVar = (yr) obj;
                CountDownLatch countDownLatch = (CountDownLatch) obj2;
                anVar4.getClass();
                long j10 = i13;
                yrVar.getClass();
                try {
                    arrayList = new ArrayList();
                    yrVar.V("" + j10, arrayList, null);
                } catch (Exception e12) {
                    yrVar.o(e12, true);
                }
                if (!arrayList.isEmpty()) {
                    encryptedChat = (TLRPC.EncryptedChat) arrayList.get(0);
                    anVar4.h = encryptedChat;
                    countDownLatch.countDown();
                    return;
                }
                encryptedChat = null;
                anVar4.h = encryptedChat;
                countDownLatch.countDown();
                return;
            case 19:
                bj bjVar = (bj) obj3;
                ArrayList arrayList13 = (ArrayList) obj;
                ArrayList arrayList14 = (ArrayList) obj2;
                fj fjVar = bjVar.n;
                q1 q1Var = fjVar.s;
                if (i13 != bjVar.h) {
                    return;
                }
                if (i13 != -1) {
                    v4.g0 adapter = q1Var.getAdapter();
                    bj bjVar2 = fjVar.F;
                    if (adapter != bjVar2) {
                        q1Var.setAdapter(bjVar2);
                    }
                }
                bjVar.d = arrayList13;
                bjVar.e = arrayList14;
                bjVar.f();
                return;
            case 20:
                am amVar = (am) obj3;
                zl zlVar = (zl) obj;
                gf gfVar = (gf) obj2;
                bm bmVar = amVar.P;
                ValueAnimator valueAnimator = bmVar.L;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                bmVar.J = null;
                amVar.G = 0.0f;
                amVar.f(zlVar, gfVar, i13);
                amVar.j();
                amVar.i(bmVar.P, false);
                return;
            case 21:
                v4.D(((k60) obj3).e, (f6) obj, new l2.q(i13, (qn) obj2, i12));
                return;
            case 22:
                int[] iArr6 = (int[]) obj3;
                Runnable[] runnableArr = (Runnable[]) obj;
                int[] iArr7 = (int[]) obj2;
                iArr6[0] = iArr6[0] + 1;
                Runnable runnable2 = runnableArr[0];
                if (runnable2 != null) {
                    org.telegram.messenger.g0.r(runnable2);
                    runnableArr[0] = null;
                }
                if (iArr7[0] >= 0) {
                    ConnectionsManager.getInstance(i13).cancelRequest(iArr7[0], true);
                    iArr7[0] = -1;
                    return;
                }
                return;
            case 23:
                f2 f2Var3 = (f2) obj3;
                TLObject tLObject3 = (TLObject) obj;
                c20 c20Var = (c20) obj2;
                if (f2Var3.getParentActivity() == null) {
                    return;
                }
                if (tLObject3 instanceof Vector) {
                    Vector vector = (Vector) tLObject3;
                    ArrayList arrayList15 = new ArrayList();
                    for (int i38 = 0; i38 < vector.objects.size(); i38++) {
                        try {
                            arrayList15.add(Long.valueOf(m5.o((TLRPC.Peer) vector.objects.get(i38))));
                        } catch (Exception unused) {
                        }
                    }
                    vzVar = new vz(f2Var3, i13, arrayList15);
                } else {
                    vzVar = new vz(f2Var3, i13, null);
                }
                vzVar.t2 = c20Var;
                f2Var3.showDialog(vzVar);
                return;
            case 24:
                g20 g20Var = (g20) obj3;
                ArrayList arrayList16 = (ArrayList) obj2;
                g20Var.getClass();
                String lowerCase = ((String) obj).trim().toLowerCase();
                int i39 = 9;
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new q8(g20Var, i13, new ArrayList(), i39));
                    return;
                }
                String S0 = hd.E0().S0(lowerCase, true, false);
                if (lowerCase.equals(S0) || S0.length() == 0) {
                    S0 = null;
                }
                int i40 = (S0 != null ? 1 : 0) + 1;
                String[] strArr = new String[i40];
                strArr[0] = lowerCase;
                if (S0 != null) {
                    strArr[1] = S0;
                }
                ArrayList arrayList17 = new ArrayList();
                int size4 = arrayList16.size();
                int i41 = 0;
                while (i41 < size4) {
                    TLObject tLObject4 = (TLObject) arrayList16.get(i41);
                    if (tLObject4 instanceof TLRPC.ChatParticipant) {
                        r19 = 2;
                        C1 = ((TLRPC.ChatParticipant) tLObject4).user_id;
                    } else {
                        r19 = 2;
                        if (tLObject4 instanceof TLRPC.ChannelParticipant) {
                            C1 = ij.C1(((TLRPC.ChannelParticipant) tLObject4).peer);
                        }
                        z9 = z11;
                        z10 = r14;
                        i41++;
                        r14 = z10;
                        z11 = z9;
                    }
                    TLRPC.User a22 = qp.s1(g20Var.x.a).a2(Long.valueOf(C1));
                    if (!t10.B(a22)) {
                        String lowerCase2 = t10.p(a22).toLowerCase();
                        String S02 = hd.E0().S0(lowerCase2, z11, r14);
                        if (lowerCase2.equals(S02)) {
                            S02 = null;
                        }
                        boolean z19 = r14;
                        z10 = z19;
                        int i42 = r14;
                        while (true) {
                            z9 = z11;
                            if (i42 < i40) {
                                String str5 = strArr[i42];
                                if (lowerCase2.startsWith(str5) || jg.g.A(" ", str5, lowerCase2) || (S02 != null && (S02.startsWith(str5) || jg.g.A(" ", str5, S02)))) {
                                    z19 = z9;
                                } else {
                                    String n11 = t10.n(a22);
                                    if (n11 != null && n11.startsWith(str5)) {
                                        z19 = r19;
                                    }
                                }
                                if (z19) {
                                    arrayList17.add(tLObject4);
                                } else {
                                    z11 = z9;
                                    i42++;
                                }
                            }
                        }
                        i41++;
                        r14 = z10;
                        z11 = z9;
                    }
                    z9 = z11;
                    z10 = r14;
                    i41++;
                    r14 = z10;
                    z11 = z9;
                }
                org.telegram.messenger.g0.h3(new q8(g20Var, i13, arrayList17, 9));
                return;
            case 25:
                u20 u20Var = (u20) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                String str6 = (String) obj;
                int i43 = u20Var.P;
                ArrayList arrayList18 = u20Var.Q;
                if (i13 != u20Var.V) {
                    return;
                }
                boolean isEmpty = arrayList18.isEmpty();
                u20Var.U = false;
                if (tLObject5 instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject5;
                    if (messages_messages2 instanceof TLRPC.TL_messages_messages) {
                        u20Var.Y = ((TLRPC.TL_messages_messages) messages_messages2).messages.size();
                    } else if (messages_messages2 instanceof TLRPC.TL_messages_messagesSlice) {
                        u20Var.Y = ((TLRPC.TL_messages_messagesSlice) messages_messages2).count;
                    }
                    u20Var.b0 = messages_messages2.next_rate;
                    qp.s1(i43).Y3(messages_messages2.users, false);
                    qp.s1(i43).S3(messages_messages2.chats, false);
                    for (int i44 = 0; i44 < messages_messages2.messages.size(); i44++) {
                        ij ijVar3 = new ij(i43, messages_messages2.messages.get(i44), false, true);
                        ijVar3.L5(str6, true);
                        arrayList18.add(ijVar3);
                    }
                    u20Var.X = arrayList18.size() >= u20Var.Y;
                    u20Var.X();
                } else {
                    u20Var.X = true;
                    u20Var.Y = arrayList18.size();
                }
                u20Var.O(true);
                if (isEmpty) {
                    ((wl0) u20Var).e0.v0.h1(0, 0);
                    return;
                }
                return;
            case 26:
                ql0.c(((ql0) obj3).getContext(), i13, ((nl0) obj).a.g(), (f6) obj2);
                return;
            case 27:
                a();
                return;
            case 28:
                ((xs0) obj3).S0((ij) obj, (View) obj2, i13, false);
                return;
            default:
                xs0.d((xs0) obj3, i13, (TL_stories.StoryItem) obj2, (String) obj);
                return;
        }
    }

    public /* synthetic */ a1(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = i7;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ a1(Object obj, int i7, Object obj2, String str, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = i7;
        this.e = obj2;
        this.d = str;
    }

    public /* synthetic */ a1(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = i7;
        this.e = obj3;
    }

    public /* synthetic */ a1(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = i7;
    }

    public /* synthetic */ a1(t1 t1Var, TLRPC.Message message, String str, int i7) {
        this.a = 9;
        this.b = t1Var;
        this.e = message;
        this.d = str;
        this.c = i7;
    }
}
