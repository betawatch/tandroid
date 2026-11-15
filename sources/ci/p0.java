package ci;

import ai.r1;
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
import di.c6;
import fi.k6;
import fi.s6;
import hi.e5;
import hi.h4;
import j$.util.Objects;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import kg.j1;
import kg.t1;
import kg.u1;
import kg.v1;
import ki.i4;
import org.telegram.messenger.a8;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.ff;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.vr;
import org.telegram.messenger.z10;
import org.telegram.messenger.z5;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n4;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.u2;
import org.telegram.ui.Cells.w3;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.gm;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.ij;
import org.telegram.ui.Components.im;
import org.telegram.ui.Components.j20;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.mj;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.to0;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.voip.c2;
import org.telegram.ui.Components.x20;
import org.telegram.ui.Components.yn;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.an;
import org.telegram.ui.c9;
import org.telegram.ui.g4;
import org.telegram.ui.hu;
import org.telegram.ui.jw;
import org.telegram.ui.qj;
import org.telegram.ui.tm;
import org.telegram.ui.uf;
import org.telegram.ui.vm;
import org.telegram.ui.ym;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p0(int i7, Object obj, Object obj2, Object obj3, int i10) {
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
        to0 to0Var = (to0) this.b;
        TLObject tLObject = (TLObject) this.e;
        String str = (String) this.d;
        HashMap hashMap = to0Var.w;
        if (this.c != to0Var.E) {
            return;
        }
        to0Var.y = 0;
        if (tLObject instanceof TL_account.webPagePreview) {
            TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
            np.s1(to0Var.c).Y3(webpagepreview.users, false);
            np.s1(to0Var.c).S3(webpagepreview.chats, false);
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
                    to0Var.x = webPage;
                    to0.a(to0Var.a[0], webPage, str);
                    return;
                }
                if (webPage instanceof TLRPC.TL_webPagePending) {
                    to0Var.x = webPage;
                    return;
                }
                if (webPage instanceof TLRPC.TL_webPageEmpty) {
                    to0Var.x = null;
                    if (to0Var.b != 0) {
                        to0Var.b = 0;
                        so0 so0Var = to0Var.I;
                        if (so0Var != null) {
                            ((hu) so0Var).g(0);
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
    /* JADX WARN: Removed duplicated region for block: B:239:0x04e2  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r15v32, types: [org.telegram.messenger.hd] */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.view.View, java.lang.String] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        ?? r52;
        int i10;
        e2 e2Var;
        int[] iArr;
        int min;
        int[] iArr2;
        int i11;
        TLRPC.UserFull userFull;
        TLRPC.EncryptedChat encryptedChat;
        ArrayList arrayList;
        qj qjVar;
        zz zzVar;
        ?? r18;
        long B1;
        boolean z10;
        boolean z11;
        int i12 = this.a;
        int i13 = 10;
        boolean z12 = true;
        ?? r13 = 0;
        int i14 = this.c;
        Object obj = this.d;
        Object obj2 = this.e;
        Object obj3 = this.b;
        switch (i12) {
            case 0:
                ((z0) obj3).d1(i14, (String) obj, (String) obj2);
                return;
            case 1:
                z0 z0Var = (z0) obj3;
                Bitmap bitmap = (Bitmap) obj;
                int[] iArr3 = (int[]) obj2;
                z0Var.W4 = false;
                if (z0Var.X4 == null) {
                    z0Var.X4 = bitmap;
                    z0Var.Y4 = iArr3;
                    z0Var.Z4 = i14;
                    return;
                }
                return;
            case 2:
                int i15 = this.c;
                c6 c6Var = new c6((Context) obj3, i15, m10.i(i15).e(), (e6) obj, null);
                c6Var.k2((TL_stars.SavedStarGift) obj2, null);
                c6Var.show();
                return;
            case 3:
                k6 k6Var = (k6) obj3;
                ArrayList arrayList2 = (ArrayList) obj;
                TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) obj2;
                AbstractSet abstractSet = k6Var.k;
                int i16 = k6Var.f;
                AbstractSet abstractSet2 = k6Var.l;
                k6Var.A = -1;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i17 = k6Var.e;
                sb2.append(i17);
                sb2.append("{");
                long j3 = k6Var.d;
                sb2.append(j3);
                sb2.append("} loaded {");
                sb2.append(s6.a(arrayList2));
                org.telegram.ui.Cells.y0.t("}", sb2);
                ArrayList arrayList3 = k6Var.g;
                arrayList3.clear();
                arrayList3.addAll(tL_stories_stories.pinned_to_top);
                int i18 = k6Var.c;
                boolean z13 = false;
                np.s1(i18).Y3(tL_stories_stories.users, false);
                np.s1(i18).S3(tL_stories_stories.chats, false);
                vr.a0(i18).m1(tL_stories_stories.users, tL_stories_stories.chats, true, true);
                k6Var.u = false;
                k6Var.s = tL_stories_stories.count;
                int i19 = 0;
                while (i19 < arrayList2.size()) {
                    k6Var.t((gj) arrayList2.get(i19), z13);
                    i19++;
                    z13 = false;
                }
                boolean z14 = abstractSet2.size() >= k6Var.s;
                k6Var.r = z14;
                if (z14) {
                    Iterator it = abstractSet.iterator();
                    while (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        int intValue = num.intValue();
                        if (!abstractSet2.contains(num)) {
                            it.remove();
                            k6Var.u(intValue, false);
                        }
                    }
                } else if (i16 <= 0) {
                    if (i14 == -1) {
                        if (!abstractSet2.isEmpty()) {
                            ArrayList arrayList4 = new ArrayList(abstractSet2);
                            for (int i20 = 0; i20 < arrayList4.size(); i20++) {
                                Integer num2 = (Integer) arrayList4.get(i20);
                                int intValue2 = num2.intValue();
                                if (!arrayList3.contains(num2)) {
                                    i7 = intValue2;
                                    i14 = i7;
                                }
                            }
                        }
                        i7 = -1;
                        i14 = i7;
                    }
                    int n10 = k6Var.n();
                    Iterator it2 = abstractSet.iterator();
                    while (it2.hasNext()) {
                        Integer num3 = (Integer) it2.next();
                        int intValue3 = num3.intValue();
                        if (!abstractSet2.contains(num3) && intValue3 >= i14 && intValue3 <= n10) {
                            it2.remove();
                            k6Var.u(intValue3, false);
                        }
                    }
                }
                k6Var.d(true);
                if (k6Var.r) {
                    if (k6.B == null) {
                        k6.B = new HashMap();
                    }
                    k6.B.put(Integer.valueOf(Objects.hash(Integer.valueOf(i18), Integer.valueOf(i17), Long.valueOf(j3), Integer.valueOf(i16))), Long.valueOf(System.currentTimeMillis()));
                } else {
                    k6Var.w();
                }
                k6Var.x();
                return;
            case 4:
                jg.c cVar = (jg.c) obj3;
                String str = (String) obj;
                ArrayList arrayList5 = (ArrayList) obj2;
                ArrayList arrayList6 = cVar.f;
                if (i14 != cVar.s) {
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
            case 5:
                jg.h0 h0Var = (jg.h0) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                x3 x3Var = (x3) obj2;
                ArrayList arrayList8 = h0Var.L;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - h0Var.o0 < 300) {
                    return;
                }
                h0Var.o0 = elapsedRealtime;
                int size = arrayList8.size();
                int size2 = arrayList7.size();
                int i21 = (arrayList7.isEmpty() && arrayList8.isEmpty()) ? 0 : size2 + size;
                int min2 = Math.min(3, size2) + size;
                int b10 = h0Var.b();
                boolean z15 = h0Var.H0;
                boolean z16 = b10 > ((z15 ? min2 : i21) + i14) + 1;
                v4.k kVar = h0Var.j0;
                if (kVar != null) {
                    kVar.c = z16 ? 45L : 200L;
                    kVar.d = z16 ? 80L : 200L;
                    kVar.l = z16 ? 270L : 0L;
                }
                h0Var.H0 = !z15;
                x3Var.setRightTextMargin(16);
                if (h0Var.H0) {
                    i10 = 2131745339;
                    r52 = 0;
                } else {
                    r52 = 0;
                    i10 = 2131745340;
                }
                String M0 = hd.M0(i10, r52);
                boolean z17 = h0Var.H0;
                w3 w3Var = x3Var.b;
                w3Var.c(M0, true, z17);
                w3Var.setVisibility(0);
                h0Var.p0 = r52;
                View view = (View) x3Var.getParent();
                if (view instanceof RecyclerView) {
                    RecyclerView recyclerView = (RecyclerView) view;
                    int i22 = (!h0Var.H0 ? i14 + min2 : i21 + i14) + 1;
                    int i23 = 0;
                    while (true) {
                        if (i23 < recyclerView.getChildCount()) {
                            View childAt = recyclerView.getChildAt(i23);
                            if (RecyclerView.R(childAt) == i22) {
                                h0Var.p0 = childAt;
                            } else {
                                i23++;
                            }
                        }
                    }
                }
                int i24 = i14 + min2;
                int i25 = i24 + 1;
                int max = Math.max(0, size2 - 3);
                if (h0Var.H0) {
                    h0Var.p(i25, max);
                    if (z16) {
                        org.telegram.messenger.g0.i3(new ai.v0(h0Var, i24, i13), 350L);
                    } else {
                        h0Var.g(i24);
                    }
                } else {
                    h0Var.g(i24);
                    h0Var.o(i25, max);
                }
                h4 h4Var = h0Var.q0;
                if (h4Var != null) {
                    org.telegram.messenger.g0.r(h4Var);
                }
                if (!z16) {
                    h0Var.n0 = false;
                    return;
                }
                h0Var.n0 = true;
                h4 h4Var2 = new h4(18, h0Var, view);
                h0Var.q0 = h4Var2;
                org.telegram.messenger.g0.i3(h4Var2, 400L);
                return;
            case 6:
                jg.h0 h0Var2 = (jg.h0) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str2 = (String) obj;
                int i26 = h0Var2.t0;
                if (i14 == h0Var2.e0 && (tLObject instanceof TLRPC.messages_Messages)) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    h0Var2.w = messages_messages instanceof TLRPC.TL_messages_messages ? ((TLRPC.TL_messages_messages) messages_messages).messages.size() : messages_messages instanceof TLRPC.TL_messages_messagesSlice ? ((TLRPC.TL_messages_messagesSlice) messages_messages).count : 0;
                    h0Var2.x = messages_messages.next_rate;
                    h0Var2.E = str2;
                    boolean z18 = false;
                    np.s1(i26).Y3(messages_messages.users, false);
                    np.s1(i26).S3(messages_messages.chats, false);
                    int i27 = 0;
                    while (i27 < messages_messages.messages.size()) {
                        h0Var2.y.add(new gj(i26, messages_messages.messages.get(i27), z18, true));
                        i27++;
                        z18 = false;
                    }
                    jw jwVar = h0Var2.V;
                    if (jwVar != null) {
                        jwVar.d(h0Var2.E0 > 0, true);
                    }
                    h0Var2.f();
                    return;
                }
                return;
            case 7:
                v1 v1Var = (v1) obj3;
                ArrayList arrayList9 = v1Var.b;
                TLRPC.Message message = (TLRPC.Message) obj2;
                String str3 = (String) obj;
                int i28 = v1Var.a;
                if ((message.flags & TLObject.FLAG_30) != 0) {
                    u1 c10 = v1Var.c(message.quick_reply_shortcut_id);
                    if (c10 == null) {
                        u1 u1Var = new u1();
                        u1Var.a = message.quick_reply_shortcut_id;
                        u1Var.d = message.id;
                        gj gjVar = new gj(i28, message, false, true);
                        u1Var.e = gjVar;
                        gjVar.r0(false);
                        if (str3 != null) {
                            u1Var.b = str3;
                            v1Var.a(str3);
                        }
                        u1Var.e.l(i14, str3);
                        u1Var.f = 1;
                        arrayList9.add(u1Var);
                        for (int i29 = 0; i29 < arrayList9.size(); i29++) {
                            ((u1) arrayList9.get(i29)).c = i29;
                        }
                        vr a02 = vr.a0(i28);
                        a02.a.c(new t1(0, a02, u1Var));
                        ns.f(i28).k(ns.F1, new Object[0]);
                    } else {
                        int i30 = c10.d;
                        int i31 = message.id;
                        if (i30 == i31) {
                            c10.d = i31;
                            gj gjVar2 = new gj(i28, message, false, true);
                            c10.e = gjVar2;
                            gjVar2.r0(false);
                            v1Var.l();
                            ns.f(i28).k(ns.F1, new Object[0]);
                        } else if ((message.flags & 32768) == 0) {
                            c10.f++;
                            v1Var.l();
                            ns.f(i28).k(ns.F1, new Object[0]);
                        }
                    }
                }
                if (str3 == null && i14 == 0) {
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.add(message);
                    vr.a0(i28).j1(arrayList10, true, true, false, z5.q(i28).l(), false, 5, message.quick_reply_shortcut_id);
                    long e10 = m10.i(i28).e();
                    ArrayList arrayList11 = new ArrayList();
                    arrayList11.add(new gj(i28, message, true, true));
                    np.s1(i28).m5(5, e10, arrayList11);
                    return;
                }
                return;
            case 8:
                org.telegram.messenger.g0.h3(new ki.n(vr.a0(i14).l0((ArrayList) obj3), (HashMap) obj, (z10) obj2, 0));
                return;
            case 9:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj3;
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) obj;
                TLRPC.User user = (TLRPC.User) obj2;
                if (userFull2 == null) {
                    oVar.a(Boolean.FALSE, "cancelled");
                    return;
                } else {
                    i4.b(i14, user, userFull2, oVar);
                    return;
                }
            case 10:
                ((CameraView) obj3).lambda$createCamera$11(i14, (CameraSession) obj, (CameraView.CameraGLThread) obj2);
                return;
            case 11:
                int i32 = 2;
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj3;
                n4 n4Var = (n4) obj;
                Runnable runnable = (Runnable) obj2;
                e5 e5Var = actionBarLayout.e0;
                boolean z19 = false;
                int i33 = 0;
                while (i33 < i14) {
                    if (i33 == 0) {
                        e2Var = actionBarLayout.getLastFragment();
                    } else {
                        if ((actionBarLayout.h || actionBarLayout.b0) && actionBarLayout.V0.size() > 1) {
                            e2Var = (e2) r.b.h(i32, actionBarLayout.V0);
                        }
                        i33++;
                        i32 = 2;
                    }
                    if (e2Var != null) {
                        if (n4Var.m != null) {
                            if (actionBarLayout.f0 == null) {
                                r4 r4Var = new r4(0, true, false, e5Var);
                                actionBarLayout.f0 = r4Var;
                                r4Var.L = true;
                                r4 r4Var2 = new r4(1, true, false, e5Var);
                                actionBarLayout.g0 = r4Var2;
                                r4Var2.L = true;
                            }
                            ym ymVar = n4Var.m;
                            SparseIntArray sparseIntArray = (SparseIntArray) e5Var.b;
                            sparseIntArray.clear();
                            for (int i34 : (int[]) e5Var.c) {
                                sparseIntArray.put(i34, ymVar.k(i34, false));
                            }
                        }
                        ArrayList<org.telegram.ui.ActionBar.s6> themeDescriptions = e2Var.getThemeDescriptions();
                        actionBarLayout.d(themeDescriptions);
                        Dialog dialog = e2Var.visibleDialog;
                        if (dialog instanceof u2) {
                            actionBarLayout.d(((u2) dialog).V());
                        }
                        if (i33 == 0) {
                            if (n4Var.h != null) {
                                ym ymVar2 = n4Var.m;
                                if (ymVar2 != null) {
                                    actionBarLayout.g0(ymVar2);
                                }
                                n4Var.h.run();
                            }
                            ym ymVar3 = n4Var.m;
                            actionBarLayout.p0 = 0;
                            actionBarLayout.q0 = ymVar3;
                            int[] iArr4 = actionBarLayout.l0;
                            if (iArr4 != null) {
                                try {
                                    try {
                                        min = Math.min(j6.f5, iArr4.length);
                                        iArr2 = actionBarLayout.m0;
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                        actionBarLayout.p0 = 0;
                                        iArr = null;
                                    }
                                    if (iArr2 != null) {
                                        if (iArr2.length < min) {
                                        }
                                        for (i11 = 0; i11 < min; i11++) {
                                            int h = ymVar3 != null ? ymVar3.h(i11) : j6.x0(null, i11, true);
                                            int i35 = actionBarLayout.l0[i11];
                                            if (h != i35 && ActionBarLayout.z(i11, i35, h)) {
                                                int[] iArr5 = actionBarLayout.m0;
                                                int i36 = actionBarLayout.p0;
                                                iArr5[i36] = i11;
                                                actionBarLayout.n0[i36] = actionBarLayout.l0[i11];
                                                actionBarLayout.o0[i36] = h;
                                                actionBarLayout.p0 = i36 + 1;
                                            }
                                        }
                                        iArr = null;
                                        actionBarLayout.l0 = iArr;
                                    }
                                    actionBarLayout.m0 = new int[min];
                                    actionBarLayout.n0 = new int[min];
                                    actionBarLayout.o0 = new int[min];
                                    while (i11 < min) {
                                    }
                                    iArr = null;
                                    actionBarLayout.l0 = iArr;
                                } catch (Throwable th2) {
                                    actionBarLayout.l0 = null;
                                    throw th2;
                                }
                            }
                        }
                        actionBarLayout.b(themeDescriptions);
                        Dialog dialog2 = e2Var.visibleDialog;
                        if (dialog2 instanceof u2) {
                            actionBarLayout.b(((u2) dialog2).V());
                        }
                        z19 = true;
                    }
                    i33++;
                    i32 = 2;
                }
                if (z19) {
                    if (!n4Var.e) {
                        int size3 = actionBarLayout.V0.size() - ((actionBarLayout.h || actionBarLayout.b0) ? 2 : 1);
                        for (int i37 = 0; i37 < size3; i37++) {
                            e2 e2Var2 = (e2) actionBarLayout.V0.get(i37);
                            e2Var2.clearViews();
                            e2Var2.setParentLayout(actionBarLayout);
                        }
                    }
                    if (n4Var.d) {
                        actionBarLayout.setThemeAnimationValue(1.0f);
                        actionBarLayout.i0.clear();
                        actionBarLayout.c0.clear();
                        actionBarLayout.d0.clear();
                        actionBarLayout.k0.clear();
                        actionBarLayout.j();
                        actionBarLayout.j0 = null;
                        actionBarLayout.h0 = null;
                        tm tmVar = n4Var.j;
                        if (tmVar != null) {
                            tmVar.run();
                        }
                        if (runnable != null) {
                            runnable.run();
                            return;
                        }
                        return;
                    }
                    int i38 = j6.a;
                    j6.mm = new SparseIntArray();
                    actionBarLayout.setThemeAnimationValue(0.0f);
                    tm tmVar2 = n4Var.i;
                    if (tmVar2 != null) {
                        tmVar2.run();
                    }
                    vm vmVar = n4Var.k;
                    actionBarLayout.h0 = vmVar;
                    if (vmVar != null) {
                        ym ymVar4 = vmVar.a;
                        ymVar4.G.A0.invalidate();
                        ymVar4.t.K = 0.0f;
                        ymVar4.u.K = 0.0f;
                        ymVar4.u(0.0f);
                    }
                    actionBarLayout.s0.d();
                    AnimatorSet animatorSet = new AnimatorSet();
                    actionBarLayout.r0 = animatorSet;
                    animatorSet.addListener(new ah.l(14, actionBarLayout, n4Var));
                    actionBarLayout.r0.playTogether(ObjectAnimator.ofFloat(actionBarLayout, "themeAnimationValue", 0.0f, 1.0f));
                    actionBarLayout.r0.setDuration(n4Var.l);
                    actionBarLayout.r0.start();
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 12:
                j1 j1Var = (j1) obj3;
                SparseIntArray sparseIntArray2 = (SparseIntArray) obj;
                aa.c0 c0Var = (aa.c0) obj2;
                if (i14 != j6.wm) {
                    j1Var.run();
                    return;
                } else {
                    j6.km = sparseIntArray2;
                    c0Var.run();
                    return;
                }
            case 13:
                ((org.telegram.ui.a1) obj3).a(0, false);
                t4.c0(i14, (TLRPC.TL_error) obj, null, (TLRPC.TL_channels_joinChannel) obj2, Boolean.TRUE);
                return;
            case 14:
                g4 g4Var = (g4) obj3;
                ArrayList arrayList12 = (ArrayList) obj2;
                String str4 = (String) obj;
                if (i14 == g4Var.Y0) {
                    g4Var.b0(true);
                    g4Var.F = arrayList12;
                    g4Var.G = str4;
                    g4Var.v0[0].c.E.clear();
                    g4Var.v0[0].b.g1();
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
                    np.s1(i14).Y3(tL_users_userFull.users, false);
                    np.s1(i14).S3(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                c2.m(user2, false, userFull != null && userFull.video_calls_available, c9Var.getParentActivity(), userFull, org.telegram.messenger.c.a(i14));
                return;
            case 16:
                an anVar = (an) obj3;
                vr vrVar = (vr) obj;
                CountDownLatch countDownLatch = (CountDownLatch) obj2;
                anVar.getClass();
                long j10 = i14;
                vrVar.getClass();
                try {
                    arrayList = new ArrayList();
                    vrVar.V("" + j10, arrayList, null);
                } catch (Exception e12) {
                    vrVar.o(e12, true);
                }
                if (!arrayList.isEmpty()) {
                    encryptedChat = (TLRPC.EncryptedChat) arrayList.get(0);
                    anVar.h = encryptedChat;
                    countDownLatch.countDown();
                    return;
                }
                encryptedChat = null;
                anVar.h = encryptedChat;
                countDownLatch.countDown();
                return;
            case 17:
                an anVar2 = (an) obj3;
                anVar2.getNotificationCenter().k(56, Long.valueOf(anVar2.k6), (ArrayList) obj, Boolean.TRUE, (ArrayList) obj2, null, 0, Integer.valueOf(i14), Boolean.valueOf(anVar2.f5));
                anVar2.P3 = null;
                return;
            case 18:
                an anVar3 = (an) obj3;
                boolean[] zArr = (boolean[]) obj;
                an anVar4 = (an) obj2;
                if (zArr[0] || i14 != anVar3.Oc || !anVar3.U3 || anVar3.isFinishing()) {
                    return;
                }
                zArr[0] = true;
                org.telegram.messenger.g0.i3(new uf(anVar3, 22), 200L);
                anVar3.presentFragment(anVar4);
                if (!anVar3.V9() || anVar4.hideKeyboardOnShow() || (qjVar = anVar4.a0) == null || qjVar.getEditField() == null) {
                    return;
                }
                anVar4.a0.getEditField().requestFocus();
                return;
            case 19:
                ij ijVar = (ij) obj3;
                ArrayList arrayList13 = (ArrayList) obj;
                ArrayList arrayList14 = (ArrayList) obj2;
                mj mjVar = ijVar.n;
                di.c1 c1Var = mjVar.s;
                if (i14 != ijVar.h) {
                    return;
                }
                if (i14 != -1) {
                    v4.h0 adapter = c1Var.getAdapter();
                    ij ijVar2 = mjVar.G;
                    if (adapter != ijVar2) {
                        c1Var.setAdapter(ijVar2);
                    }
                }
                ijVar.d = arrayList13;
                ijVar.e = arrayList14;
                ijVar.f();
                return;
            case 20:
                hm hmVar = (hm) obj3;
                gm gmVar = (gm) obj;
                ff ffVar = (ff) obj2;
                im imVar = hmVar.Q;
                ValueAnimator valueAnimator = imVar.M;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                imVar.K = null;
                hmVar.H = 0.0f;
                hmVar.f(gmVar, ffVar, i14);
                hmVar.j();
                hmVar.i(imVar.Q, false);
                return;
            case 21:
                t4.D(((m60) obj3).e, (e6) obj, new r1(i14, (yn) obj2, i13));
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
                    ConnectionsManager.getInstance(i14).cancelRequest(iArr7[0], true);
                    iArr7[0] = -1;
                    return;
                }
                return;
            case 23:
                e2 e2Var3 = (e2) obj3;
                TLObject tLObject3 = (TLObject) obj;
                z10 z10Var = (z10) obj2;
                if (e2Var3.getParentActivity() == null) {
                    return;
                }
                if (tLObject3 instanceof Vector) {
                    Vector vector = (Vector) tLObject3;
                    ArrayList arrayList15 = new ArrayList();
                    for (int i39 = 0; i39 < vector.objects.size(); i39++) {
                        try {
                            arrayList15.add(Long.valueOf(m5.o((TLRPC.Peer) vector.objects.get(i39))));
                        } catch (Exception unused) {
                        }
                    }
                    zzVar = new zz(e2Var3, i14, arrayList15);
                } else {
                    zzVar = new zz(e2Var3, i14, null);
                }
                zzVar.x2 = z10Var;
                e2Var3.showDialog(zzVar);
                return;
            case 24:
                j20 j20Var = (j20) obj3;
                ArrayList arrayList16 = (ArrayList) obj2;
                j20Var.getClass();
                String lowerCase = ((String) obj).trim().toLowerCase();
                int i40 = 12;
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.f0(j20Var, i14, new ArrayList(), i40));
                    return;
                }
                String S0 = hd.E0().S0(lowerCase, true, false);
                if (lowerCase.equals(S0) || S0.length() == 0) {
                    S0 = null;
                }
                int i41 = (S0 != null ? 1 : 0) + 1;
                String[] strArr = new String[i41];
                strArr[0] = lowerCase;
                if (S0 != null) {
                    strArr[1] = S0;
                }
                ArrayList arrayList17 = new ArrayList();
                int size4 = arrayList16.size();
                int i42 = 0;
                while (i42 < size4) {
                    TLObject tLObject4 = (TLObject) arrayList16.get(i42);
                    if (tLObject4 instanceof TLRPC.ChatParticipant) {
                        r18 = 2;
                        B1 = ((TLRPC.ChatParticipant) tLObject4).user_id;
                    } else {
                        r18 = 2;
                        if (tLObject4 instanceof TLRPC.ChannelParticipant) {
                            B1 = gj.B1(((TLRPC.ChannelParticipant) tLObject4).peer);
                        }
                        z10 = z12;
                        z11 = r13;
                        i42++;
                        r13 = z11;
                        z12 = z10;
                    }
                    TLRPC.User a22 = np.s1(j20Var.x.a).a2(Long.valueOf(B1));
                    if (!q10.B(a22)) {
                        String lowerCase2 = q10.p(a22).toLowerCase();
                        String S02 = hd.E0().S0(lowerCase2, z12, r13);
                        if (lowerCase2.equals(S02)) {
                            S02 = null;
                        }
                        boolean z20 = r13;
                        z11 = z20;
                        int i43 = r13;
                        while (true) {
                            z10 = z12;
                            if (i43 < i41) {
                                String str5 = strArr[i43];
                                if (lowerCase2.startsWith(str5) || i5.c.A(" ", str5, lowerCase2) || (S02 != null && (S02.startsWith(str5) || i5.c.A(" ", str5, S02)))) {
                                    z20 = z10;
                                } else {
                                    String n11 = q10.n(a22);
                                    if (n11 != null && n11.startsWith(str5)) {
                                        z20 = r18;
                                    }
                                }
                                if (z20) {
                                    arrayList17.add(tLObject4);
                                } else {
                                    z12 = z10;
                                    i43++;
                                }
                            }
                        }
                        i42++;
                        r13 = z11;
                        z12 = z10;
                    }
                    z10 = z12;
                    z11 = r13;
                    i42++;
                    r13 = z11;
                    z12 = z10;
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.f0(j20Var, i14, arrayList17, 12));
                return;
            case 25:
                x20 x20Var = (x20) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                String str6 = (String) obj;
                int i44 = x20Var.Q;
                ArrayList arrayList18 = x20Var.R;
                if (i14 != x20Var.W) {
                    return;
                }
                boolean isEmpty = arrayList18.isEmpty();
                x20Var.V = false;
                if (tLObject5 instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject5;
                    if (messages_messages2 instanceof TLRPC.TL_messages_messages) {
                        x20Var.Z = ((TLRPC.TL_messages_messages) messages_messages2).messages.size();
                    } else if (messages_messages2 instanceof TLRPC.TL_messages_messagesSlice) {
                        x20Var.Z = ((TLRPC.TL_messages_messagesSlice) messages_messages2).count;
                    }
                    x20Var.c0 = messages_messages2.next_rate;
                    np.s1(i44).Y3(messages_messages2.users, false);
                    np.s1(i44).S3(messages_messages2.chats, false);
                    for (int i45 = 0; i45 < messages_messages2.messages.size(); i45++) {
                        gj gjVar3 = new gj(i44, messages_messages2.messages.get(i45), false, true);
                        gjVar3.K5(str6, true);
                        arrayList18.add(gjVar3);
                    }
                    x20Var.Y = arrayList18.size() >= x20Var.Z;
                    x20Var.X();
                } else {
                    x20Var.Y = true;
                    x20Var.Z = arrayList18.size();
                }
                x20Var.O(true);
                if (isEmpty) {
                    ((am0) x20Var).f0.w0.h1(0, 0);
                    return;
                }
                return;
            case 26:
                ul0.c(((ul0) obj3).getContext(), i14, ((rl0) obj).a.g(), (e6) obj2);
                return;
            case 27:
                a();
                return;
            case 28:
                ((ys0) obj3).T0((gj) obj, (View) obj2, i14, false);
                return;
            default:
                ys0.d((ys0) obj3, i14, (TL_stories.StoryItem) obj2, (String) obj);
                return;
        }
    }

    public /* synthetic */ p0(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = i7;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ p0(Object obj, int i7, Object obj2, String str, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = i7;
        this.e = obj2;
        this.d = str;
    }

    public /* synthetic */ p0(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = i7;
        this.e = obj3;
    }

    public /* synthetic */ p0(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = i7;
    }

    public /* synthetic */ p0(v1 v1Var, TLRPC.Message message, String str, int i7) {
        this.a = 7;
        this.b = v1Var;
        this.e = message;
        this.d = str;
        this.c = i7;
    }
}
