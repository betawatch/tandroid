package bi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.ef;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.tr;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.bp0;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.g00;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.nm;
import org.telegram.ui.Components.om;
import org.telegram.ui.Components.pj;
import org.telegram.ui.Components.pm;
import org.telegram.ui.Components.r20;
import org.telegram.ui.Components.tj;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.bn;
import org.telegram.ui.c9;
import org.telegram.ui.ju;
import org.telegram.ui.mw;
import org.telegram.ui.rj;
import org.telegram.ui.um;
import org.telegram.ui.vf;
import org.telegram.ui.wm;
import org.telegram.ui.zm;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class t4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t4(int i7, Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = i7;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    private final void a() {
        f30 f30Var = (f30) this.d;
        TLObject tLObject = (TLObject) this.e;
        String str = (String) this.c;
        int i7 = f30Var.Q;
        ArrayList arrayList = f30Var.R;
        if (this.b != f30Var.W) {
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        f30Var.V = false;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            if (messages_messages instanceof TLRPC.TL_messages_messages) {
                f30Var.Z = ((TLRPC.TL_messages_messages) messages_messages).messages.size();
            } else if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                f30Var.Z = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
            }
            f30Var.c0 = messages_messages.next_rate;
            mp.u1(i7).f4(messages_messages.users, false);
            mp.u1(i7).Z3(messages_messages.chats, false);
            for (int i10 = 0; i10 < messages_messages.messages.size(); i10++) {
                fj fjVar = new fj(i7, messages_messages.messages.get(i10), false, true);
                fjVar.K5(str, true);
                arrayList.add(fjVar);
            }
            f30Var.Y = arrayList.size() >= f30Var.Z;
            f30Var.X();
        } else {
            f30Var.Y = true;
            f30Var.Z = arrayList.size();
        }
        f30Var.O(true);
        if (isEmpty) {
            ((im0) f30Var).f0.w0.h1(0, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        TLRPC.WebPage webPage;
        cp0 cp0Var = (cp0) this.d;
        TLObject tLObject = (TLObject) this.e;
        String str = (String) this.c;
        HashMap hashMap = cp0Var.w;
        if (this.b != cp0Var.E) {
            return;
        }
        cp0Var.y = 0;
        if (tLObject instanceof TL_account.webPagePreview) {
            TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
            mp.u1(cp0Var.c).f4(webpagepreview.users, false);
            mp.u1(cp0Var.c).Z3(webpagepreview.chats, false);
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
                    cp0Var.x = webPage;
                    cp0.a(cp0Var.a[0], webPage, str);
                    return;
                }
                if (webPage instanceof TLRPC.TL_webPagePending) {
                    cp0Var.x = webPage;
                    return;
                }
                if (webPage instanceof TLRPC.TL_webPageEmpty) {
                    cp0Var.x = null;
                    if (cp0Var.b != 0) {
                        cp0Var.b = 0;
                        bp0 bp0Var = cp0Var.I;
                        if (bp0Var != null) {
                            ((ju) bp0Var).g(0);
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
    /* JADX WARN: Removed duplicated region for block: B:212:0x0443  */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [android.view.View, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r15v30, types: [org.telegram.messenger.gd] */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int intValue;
        ?? r10;
        int i7;
        org.telegram.ui.ActionBar.h2 h2Var;
        int[] iArr;
        int min;
        int[] iArr2;
        int i10;
        TLRPC.UserFull userFull;
        TLRPC.EncryptedChat encryptedChat;
        ArrayList arrayList;
        rj rjVar;
        g00 g00Var;
        ?? r18;
        long B1;
        boolean z10;
        boolean z11;
        int i11 = this.a;
        int i12 = 4;
        int i13 = 13;
        boolean z12 = true;
        ?? r13 = 0;
        int i14 = this.b;
        Object obj = this.c;
        Object obj2 = this.e;
        int i15 = 3;
        Object obj3 = this.d;
        switch (i11) {
            case 0:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj2;
                ((di.k1) obj3).run();
                u4.s(tL_starGiftUnique, gd.a0(null, null, 2131749512, (String) obj));
                String str = tL_starGiftUnique.slug;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                org.telegram.messenger.g0.h3(new k4(this.b, 0, 0L, str, false), u4.a[0]);
                return;
            case 1:
                ((ci.z0) obj3).d1(i14, (String) obj, (String) obj2);
                return;
            case 2:
                ci.z0 z0Var = (ci.z0) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                int[] iArr3 = (int[]) obj;
                z0Var.W4 = false;
                if (z0Var.X4 == null) {
                    z0Var.X4 = bitmap;
                    z0Var.Y4 = iArr3;
                    z0Var.Z4 = i14;
                    return;
                }
                return;
            case 3:
                int i16 = this.b;
                di.f6 f6Var = new di.f6((Context) obj3, i16, j10.i(i16).e(), (org.telegram.ui.ActionBar.i6) obj2, null);
                f6Var.w2((TL_stars.SavedStarGift) obj, null);
                f6Var.show();
                return;
            case 4:
                fi.h6 h6Var = (fi.h6) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) obj;
                AbstractSet abstractSet = h6Var.k;
                int i17 = h6Var.f;
                AbstractSet abstractSet2 = h6Var.l;
                h6Var.A = -1;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i18 = h6Var.e;
                sb2.append(i18);
                sb2.append("{");
                long j3 = h6Var.d;
                sb2.append(j3);
                sb2.append("} loaded {");
                sb2.append(fi.p6.a(arrayList2));
                p5.c.s("}", sb2);
                ArrayList arrayList3 = h6Var.g;
                arrayList3.clear();
                arrayList3.addAll(tL_stories_stories.pinned_to_top);
                int i19 = h6Var.c;
                boolean z13 = false;
                mp.u1(i19).f4(tL_stories_stories.users, false);
                mp.u1(i19).Z3(tL_stories_stories.chats, false);
                tr.a0(i19).m1(tL_stories_stories.users, tL_stories_stories.chats, true, true);
                h6Var.u = false;
                h6Var.s = tL_stories_stories.count;
                int i20 = 0;
                while (i20 < arrayList2.size()) {
                    h6Var.t((fj) arrayList2.get(i20), z13);
                    i20++;
                    z13 = false;
                }
                boolean z14 = abstractSet2.size() >= h6Var.s;
                h6Var.r = z14;
                if (z14) {
                    Iterator it = abstractSet.iterator();
                    while (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        int intValue2 = num.intValue();
                        if (!abstractSet2.contains(num)) {
                            it.remove();
                            h6Var.u(intValue2, false);
                        }
                    }
                } else if (i17 <= 0) {
                    if (i14 == -1) {
                        if (!abstractSet2.isEmpty()) {
                            ArrayList arrayList4 = new ArrayList(abstractSet2);
                            for (int i21 = 0; i21 < arrayList4.size(); i21++) {
                                Integer num2 = (Integer) arrayList4.get(i21);
                                intValue = num2.intValue();
                                if (!arrayList3.contains(num2)) {
                                    i14 = intValue;
                                }
                            }
                        }
                        intValue = -1;
                        i14 = intValue;
                    }
                    int n10 = h6Var.n();
                    Iterator it2 = abstractSet.iterator();
                    while (it2.hasNext()) {
                        Integer num3 = (Integer) it2.next();
                        int intValue3 = num3.intValue();
                        if (!abstractSet2.contains(num3) && intValue3 >= i14 && intValue3 <= n10) {
                            it2.remove();
                            h6Var.u(intValue3, false);
                        }
                    }
                }
                h6Var.d(true);
                if (h6Var.r) {
                    if (fi.h6.B == null) {
                        fi.h6.B = new HashMap();
                    }
                    fi.h6.B.put(Integer.valueOf(Objects.hash(Integer.valueOf(i19), Integer.valueOf(i18), Long.valueOf(j3), Integer.valueOf(i17))), Long.valueOf(System.currentTimeMillis()));
                } else {
                    h6Var.w();
                }
                h6Var.x();
                return;
            case 5:
                jg.c cVar = (jg.c) obj3;
                String str2 = (String) obj;
                ArrayList arrayList5 = (ArrayList) obj2;
                ArrayList arrayList6 = cVar.f;
                if (i14 != cVar.s) {
                    return;
                }
                cVar.w = false;
                cVar.h = str2;
                arrayList6.clear();
                arrayList6.addAll(arrayList5);
                jg.b bVar = cVar.n;
                if (bVar != null) {
                    bVar.a();
                }
                cVar.f();
                return;
            case 6:
                jg.h0 h0Var = (jg.h0) obj3;
                ArrayList arrayList7 = (ArrayList) obj2;
                org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) obj;
                ArrayList arrayList8 = h0Var.L;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - h0Var.o0 < 300) {
                    return;
                }
                h0Var.o0 = elapsedRealtime;
                int size = arrayList8.size();
                int size2 = arrayList7.size();
                int i22 = (arrayList7.isEmpty() && arrayList8.isEmpty()) ? 0 : size2 + size;
                int min2 = Math.min(3, size2) + size;
                int b10 = h0Var.b();
                boolean z15 = h0Var.H0;
                boolean z16 = b10 > ((z15 ? min2 : i22) + i14) + 1;
                v4.k kVar = h0Var.j0;
                if (kVar != null) {
                    kVar.c = z16 ? 45L : 200L;
                    kVar.d = z16 ? 80L : 200L;
                    kVar.l = z16 ? 270L : 0L;
                }
                h0Var.H0 = !z15;
                y3Var.setRightTextMargin(16);
                if (h0Var.H0) {
                    i7 = 2131745144;
                    r10 = 0;
                } else {
                    r10 = 0;
                    i7 = 2131745145;
                }
                String M0 = gd.M0(i7, r10);
                boolean z17 = h0Var.H0;
                org.telegram.ui.Cells.x3 x3Var = y3Var.b;
                x3Var.c(M0, true, z17);
                x3Var.setVisibility(0);
                h0Var.p0 = r10;
                View view = (View) y3Var.getParent();
                if (view instanceof RecyclerView) {
                    RecyclerView recyclerView = (RecyclerView) view;
                    int i23 = (!h0Var.H0 ? i14 + min2 : i22 + i14) + 1;
                    int i24 = 0;
                    while (true) {
                        if (i24 < recyclerView.getChildCount()) {
                            View childAt = recyclerView.getChildAt(i24);
                            if (RecyclerView.R(childAt) == i23) {
                                h0Var.p0 = childAt;
                            } else {
                                i24++;
                            }
                        }
                    }
                }
                int i25 = i14 + min2;
                int i26 = i25 + 1;
                int max = Math.max(0, size2 - 3);
                if (h0Var.H0) {
                    h0Var.p(i26, max);
                    if (z16) {
                        org.telegram.messenger.g0.h3(new ai.w0(h0Var, i25, 13), 350L);
                    } else {
                        h0Var.g(i25);
                    }
                } else {
                    h0Var.g(i25);
                    h0Var.o(i26, max);
                }
                hi.r1 r1Var = h0Var.q0;
                if (r1Var != null) {
                    org.telegram.messenger.g0.r(r1Var);
                }
                if (!z16) {
                    h0Var.n0 = false;
                    return;
                }
                h0Var.n0 = true;
                hi.r1 r1Var2 = new hi.r1(21, h0Var, view);
                h0Var.q0 = r1Var2;
                org.telegram.messenger.g0.h3(r1Var2, 400L);
                return;
            case 7:
                jg.h0 h0Var2 = (jg.h0) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str3 = (String) obj;
                int i27 = h0Var2.t0;
                if (i14 == h0Var2.e0 && (tLObject instanceof TLRPC.messages_Messages)) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    h0Var2.w = messages_messages instanceof TLRPC.TL_messages_messages ? ((TLRPC.TL_messages_messages) messages_messages).messages.size() : messages_messages instanceof TLRPC.TL_messages_messagesSlice ? ((TLRPC.TL_messages_messagesSlice) messages_messages).count : 0;
                    h0Var2.x = messages_messages.next_rate;
                    h0Var2.E = str3;
                    boolean z18 = false;
                    mp.u1(i27).f4(messages_messages.users, false);
                    mp.u1(i27).Z3(messages_messages.chats, false);
                    int i28 = 0;
                    while (i28 < messages_messages.messages.size()) {
                        h0Var2.y.add(new fj(i27, messages_messages.messages.get(i28), z18, true));
                        i28++;
                        z18 = false;
                    }
                    mw mwVar = h0Var2.V;
                    if (mwVar != null) {
                        mwVar.d(h0Var2.E0 > 0, true);
                    }
                    h0Var2.f();
                    return;
                }
                return;
            case 8:
                kg.w1 w1Var = (kg.w1) obj3;
                ArrayList arrayList9 = w1Var.b;
                TLRPC.Message message = (TLRPC.Message) obj2;
                String str4 = (String) obj;
                int i29 = w1Var.a;
                if ((message.flags & TLObject.FLAG_30) != 0) {
                    kg.v1 c10 = w1Var.c(message.quick_reply_shortcut_id);
                    if (c10 == null) {
                        kg.v1 v1Var = new kg.v1();
                        v1Var.a = message.quick_reply_shortcut_id;
                        v1Var.d = message.id;
                        fj fjVar = new fj(i29, message, false, true);
                        v1Var.e = fjVar;
                        fjVar.r0(false);
                        if (str4 != null) {
                            v1Var.b = str4;
                            w1Var.a(str4);
                        }
                        v1Var.e.l(i14, str4);
                        v1Var.f = 1;
                        arrayList9.add(v1Var);
                        for (int i30 = 0; i30 < arrayList9.size(); i30++) {
                            ((kg.v1) arrayList9.get(i30)).c = i30;
                        }
                        tr a02 = tr.a0(i29);
                        a02.a.c(new kg.h0(i15, a02, v1Var));
                        ks.f(i29).k(ks.F1, new Object[0]);
                    } else {
                        int i31 = c10.d;
                        int i32 = message.id;
                        if (i31 == i32) {
                            c10.d = i32;
                            fj fjVar2 = new fj(i29, message, false, true);
                            c10.e = fjVar2;
                            fjVar2.r0(false);
                            w1Var.l();
                            ks.f(i29).k(ks.F1, new Object[0]);
                        } else if ((message.flags & 32768) == 0) {
                            c10.f++;
                            w1Var.l();
                            ks.f(i29).k(ks.F1, new Object[0]);
                        }
                    }
                }
                if (str4 == null && i14 == 0) {
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.add(message);
                    tr.a0(i29).j1(arrayList10, true, true, false, org.telegram.messenger.a6.q(i29).l(), false, 5, message.quick_reply_shortcut_id);
                    long e10 = j10.i(i29).e();
                    ArrayList arrayList11 = new ArrayList();
                    arrayList11.add(new fj(i29, message, true, true));
                    mp.u1(i29).x5(5, e10, arrayList11);
                    return;
                }
                return;
            case 9:
                org.telegram.messenger.g0.g3(new kg.i0(tr.a0(i14).l0((ArrayList) obj3), (HashMap) obj2, (x10) obj, i12));
                return;
            case 10:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj3;
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (userFull2 == null) {
                    oVar.a(Boolean.FALSE, "cancelled");
                    return;
                } else {
                    ki.d4.b(i14, user, userFull2, oVar);
                    return;
                }
            case 11:
                ((CameraView) obj3).lambda$createCamera$11(i14, (CameraSession) obj2, (CameraView.CameraGLThread) obj);
                return;
            case 12:
                int i33 = 2;
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj3;
                org.telegram.ui.ActionBar.r4 r4Var = (org.telegram.ui.ActionBar.r4) obj2;
                Runnable runnable = (Runnable) obj;
                hi.d5 d5Var = actionBarLayout.e0;
                boolean z19 = false;
                int i34 = 0;
                while (i34 < i14) {
                    if (i34 == 0) {
                        h2Var = actionBarLayout.getLastFragment();
                    } else {
                        if ((actionBarLayout.h || actionBarLayout.b0) && actionBarLayout.V0.size() > 1) {
                            h2Var = (org.telegram.ui.ActionBar.h2) p5.c.h(i33, actionBarLayout.V0);
                        }
                        i34++;
                        i33 = 2;
                    }
                    if (h2Var != null) {
                        if (r4Var.m != null) {
                            if (actionBarLayout.f0 == null) {
                                org.telegram.ui.ActionBar.v4 v4Var = new org.telegram.ui.ActionBar.v4(0, true, false, d5Var);
                                actionBarLayout.f0 = v4Var;
                                v4Var.L = true;
                                org.telegram.ui.ActionBar.v4 v4Var2 = new org.telegram.ui.ActionBar.v4(1, true, false, d5Var);
                                actionBarLayout.g0 = v4Var2;
                                v4Var2.L = true;
                            }
                            zm zmVar = r4Var.m;
                            SparseIntArray sparseIntArray = (SparseIntArray) d5Var.b;
                            sparseIntArray.clear();
                            for (int i35 : (int[]) d5Var.c) {
                                sparseIntArray.put(i35, zmVar.a(i35, false));
                            }
                        }
                        ArrayList<org.telegram.ui.ActionBar.w6> themeDescriptions = h2Var.getThemeDescriptions();
                        actionBarLayout.d(themeDescriptions);
                        Dialog dialog = h2Var.visibleDialog;
                        if (dialog instanceof org.telegram.ui.ActionBar.x2) {
                            actionBarLayout.d(((org.telegram.ui.ActionBar.x2) dialog).V());
                        }
                        if (i34 == 0) {
                            if (r4Var.h != null) {
                                zm zmVar2 = r4Var.m;
                                if (zmVar2 != null) {
                                    actionBarLayout.g0(zmVar2);
                                }
                                r4Var.h.run();
                            }
                            zm zmVar3 = r4Var.m;
                            actionBarLayout.p0 = 0;
                            actionBarLayout.q0 = zmVar3;
                            int[] iArr4 = actionBarLayout.l0;
                            if (iArr4 != null) {
                                try {
                                    try {
                                        min = Math.min(org.telegram.ui.ActionBar.n6.f5, iArr4.length);
                                        iArr2 = actionBarLayout.m0;
                                    } catch (Exception e11) {
                                        org.telegram.messenger.a8.g(e11, true);
                                        actionBarLayout.p0 = 0;
                                        iArr = null;
                                    }
                                    if (iArr2 != null) {
                                        if (iArr2.length < min) {
                                        }
                                        for (i10 = 0; i10 < min; i10++) {
                                            int k10 = zmVar3 != null ? zmVar3.k(i10) : org.telegram.ui.ActionBar.n6.x0(null, i10, true);
                                            int i36 = actionBarLayout.l0[i10];
                                            if (k10 != i36 && ActionBarLayout.z(i10, i36, k10)) {
                                                int[] iArr5 = actionBarLayout.m0;
                                                int i37 = actionBarLayout.p0;
                                                iArr5[i37] = i10;
                                                actionBarLayout.n0[i37] = actionBarLayout.l0[i10];
                                                actionBarLayout.o0[i37] = k10;
                                                actionBarLayout.p0 = i37 + 1;
                                            }
                                        }
                                        iArr = null;
                                        actionBarLayout.l0 = iArr;
                                    }
                                    actionBarLayout.m0 = new int[min];
                                    actionBarLayout.n0 = new int[min];
                                    actionBarLayout.o0 = new int[min];
                                    while (i10 < min) {
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
                        Dialog dialog2 = h2Var.visibleDialog;
                        if (dialog2 instanceof org.telegram.ui.ActionBar.x2) {
                            actionBarLayout.b(((org.telegram.ui.ActionBar.x2) dialog2).V());
                        }
                        z19 = true;
                    }
                    i34++;
                    i33 = 2;
                }
                if (z19) {
                    if (!r4Var.e) {
                        int size3 = actionBarLayout.V0.size() - ((actionBarLayout.h || actionBarLayout.b0) ? 2 : 1);
                        for (int i38 = 0; i38 < size3; i38++) {
                            org.telegram.ui.ActionBar.h2 h2Var2 = (org.telegram.ui.ActionBar.h2) actionBarLayout.V0.get(i38);
                            h2Var2.clearViews();
                            h2Var2.setParentLayout(actionBarLayout);
                        }
                    }
                    if (r4Var.d) {
                        actionBarLayout.setThemeAnimationValue(1.0f);
                        actionBarLayout.i0.clear();
                        actionBarLayout.c0.clear();
                        actionBarLayout.d0.clear();
                        actionBarLayout.k0.clear();
                        actionBarLayout.j();
                        actionBarLayout.j0 = null;
                        actionBarLayout.h0 = null;
                        um umVar = r4Var.j;
                        if (umVar != null) {
                            umVar.run();
                        }
                        if (runnable != null) {
                            runnable.run();
                            return;
                        }
                        return;
                    }
                    int i39 = org.telegram.ui.ActionBar.n6.a;
                    org.telegram.ui.ActionBar.n6.mm = new SparseIntArray();
                    actionBarLayout.setThemeAnimationValue(0.0f);
                    um umVar2 = r4Var.i;
                    if (umVar2 != null) {
                        umVar2.run();
                    }
                    wm wmVar = r4Var.k;
                    actionBarLayout.h0 = wmVar;
                    if (wmVar != null) {
                        zm zmVar4 = wmVar.a;
                        zmVar4.G.A0.invalidate();
                        zmVar4.t.K = 0.0f;
                        zmVar4.u.K = 0.0f;
                        zmVar4.u(0.0f);
                    }
                    actionBarLayout.s0.d();
                    AnimatorSet animatorSet = new AnimatorSet();
                    actionBarLayout.r0 = animatorSet;
                    animatorSet.addListener(new ah.l(14, actionBarLayout, r4Var));
                    actionBarLayout.r0.playTogether(ObjectAnimator.ofFloat(actionBarLayout, "themeAnimationValue", 0.0f, 1.0f));
                    actionBarLayout.r0.setDuration(r4Var.l);
                    actionBarLayout.r0.start();
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 13:
                oi.a2 a2Var = (oi.a2) obj3;
                SparseIntArray sparseIntArray2 = (SparseIntArray) obj2;
                aa.c0 c0Var = (aa.c0) obj;
                if (i14 != org.telegram.ui.ActionBar.n6.wm) {
                    a2Var.run();
                    return;
                } else {
                    org.telegram.ui.ActionBar.n6.km = sparseIntArray2;
                    c0Var.run();
                    return;
                }
            case 14:
                ((org.telegram.ui.a1) obj3).a(0, false);
                org.telegram.ui.Components.b5.c0(i14, (TLRPC.TL_error) obj2, null, (TLRPC.TL_channels_joinChannel) obj, Boolean.TRUE);
                return;
            case 15:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) obj3;
                ArrayList arrayList12 = (ArrayList) obj2;
                String str5 = (String) obj;
                if (i14 == g4Var.Y0) {
                    g4Var.b0(true);
                    g4Var.F = arrayList12;
                    g4Var.G = str5;
                    g4Var.v0[0].c.E.clear();
                    g4Var.v0[0].b.g1();
                    g4Var.U(0);
                    return;
                }
                return;
            case 16:
                c9 c9Var = (c9) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tLObject2 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject2;
                    mp.u1(i14).f4(tL_users_userFull.users, false);
                    mp.u1(i14).Z3(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.voip.b2.m(user2, false, userFull != null && userFull.video_calls_available, c9Var.getParentActivity(), userFull, org.telegram.messenger.c.a(i14));
                return;
            case 17:
                bn bnVar = (bn) obj3;
                tr trVar = (tr) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                bnVar.getClass();
                long j10 = i14;
                trVar.getClass();
                try {
                    arrayList = new ArrayList();
                    trVar.V("" + j10, arrayList, null);
                } catch (Exception e12) {
                    trVar.o(e12, true);
                }
                if (!arrayList.isEmpty()) {
                    encryptedChat = (TLRPC.EncryptedChat) arrayList.get(0);
                    bnVar.h = encryptedChat;
                    countDownLatch.countDown();
                    return;
                }
                encryptedChat = null;
                bnVar.h = encryptedChat;
                countDownLatch.countDown();
                return;
            case 18:
                bn bnVar2 = (bn) obj3;
                bnVar2.getNotificationCenter().k(56, Long.valueOf(bnVar2.l6), (ArrayList) obj2, Boolean.TRUE, (ArrayList) obj, null, 0, Integer.valueOf(i14), Boolean.valueOf(bnVar2.g5));
                bnVar2.P3 = null;
                return;
            case 19:
                bn bnVar3 = (bn) obj3;
                boolean[] zArr = (boolean[]) obj2;
                bn bnVar4 = (bn) obj;
                if (zArr[0] || i14 != bnVar3.Pc || !bnVar3.U3 || bnVar3.isFinishing()) {
                    return;
                }
                zArr[0] = true;
                org.telegram.messenger.g0.h3(new vf(bnVar3, 22), 200L);
                bnVar3.presentFragment(bnVar4);
                if (!bnVar3.V9() || bnVar4.hideKeyboardOnShow() || (rjVar = bnVar4.a0) == null || rjVar.getEditField() == null) {
                    return;
                }
                bnVar4.a0.getEditField().requestFocus();
                return;
            case 20:
                pj pjVar = (pj) obj3;
                ArrayList arrayList13 = (ArrayList) obj2;
                ArrayList arrayList14 = (ArrayList) obj;
                tj tjVar = pjVar.n;
                di.b1 b1Var = tjVar.s;
                if (i14 != pjVar.h) {
                    return;
                }
                if (i14 != -1) {
                    v4.i0 adapter = b1Var.getAdapter();
                    pj pjVar2 = tjVar.G;
                    if (adapter != pjVar2) {
                        b1Var.setAdapter(pjVar2);
                    }
                }
                pjVar.d = arrayList13;
                pjVar.e = arrayList14;
                pjVar.f();
                return;
            case 21:
                om omVar = (om) obj3;
                nm nmVar = (nm) obj2;
                ef efVar = (ef) obj;
                pm pmVar = omVar.Q;
                ValueAnimator valueAnimator = pmVar.M;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                pmVar.K = null;
                omVar.H = 0.0f;
                omVar.f(nmVar, efVar, i14);
                omVar.j();
                omVar.i(pmVar.Q, false);
                return;
            case 22:
                org.telegram.ui.Components.b5.D(((y60) obj3).e, (org.telegram.ui.ActionBar.i6) obj2, new ai.s1(i14, (h4) obj, 10));
                return;
            case 23:
                int[] iArr6 = (int[]) obj3;
                Runnable[] runnableArr = (Runnable[]) obj2;
                int[] iArr7 = (int[]) obj;
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
            case 24:
                org.telegram.ui.ActionBar.h2 h2Var3 = (org.telegram.ui.ActionBar.h2) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                x10 x10Var = (x10) obj;
                if (h2Var3.getParentActivity() == null) {
                    return;
                }
                if (tLObject3 instanceof Vector) {
                    Vector vector = (Vector) tLObject3;
                    ArrayList arrayList15 = new ArrayList();
                    for (int i40 = 0; i40 < vector.objects.size(); i40++) {
                        try {
                            arrayList15.add(Long.valueOf(org.telegram.messenger.n5.o((TLRPC.Peer) vector.objects.get(i40))));
                        } catch (Exception unused) {
                        }
                    }
                    g00Var = new g00(h2Var3, i14, arrayList15);
                } else {
                    g00Var = new g00(h2Var3, i14, null);
                }
                g00Var.x2 = x10Var;
                h2Var3.showDialog(g00Var);
                return;
            case 25:
                r20 r20Var = (r20) obj3;
                ArrayList arrayList16 = (ArrayList) obj2;
                r20Var.getClass();
                String lowerCase = ((String) obj).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.g3(new org.telegram.ui.b0(r20Var, i14, new ArrayList(), i13));
                    return;
                }
                String S0 = gd.E0().S0(lowerCase, true, false);
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
                            B1 = fj.B1(((TLRPC.ChannelParticipant) tLObject4).peer);
                        }
                        z10 = z12;
                        z11 = r13;
                        i42++;
                        r13 = z11;
                        z12 = z10;
                    }
                    TLRPC.User c22 = mp.u1(r20Var.x.a).c2(Long.valueOf(B1));
                    if (!o10.C(c22)) {
                        String lowerCase2 = o10.q(c22).toLowerCase();
                        String S02 = gd.E0().S0(lowerCase2, z12, r13);
                        if (lowerCase2.equals(S02)) {
                            S02 = null;
                        }
                        boolean z20 = r13;
                        z11 = z20;
                        int i43 = r13;
                        while (true) {
                            z10 = z12;
                            if (i43 < i41) {
                                String str6 = strArr[i43];
                                if (lowerCase2.startsWith(str6) || i5.c.B(" ", str6, lowerCase2) || (S02 != null && (S02.startsWith(str6) || i5.c.B(" ", str6, S02)))) {
                                    z20 = z10;
                                } else {
                                    String o4 = o10.o(c22);
                                    if (o4 != null && o4.startsWith(str6)) {
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
                org.telegram.messenger.g0.g3(new org.telegram.ui.b0(r20Var, i14, arrayList17, 13));
                return;
            case 26:
                a();
                return;
            case 27:
                cm0.c(((cm0) obj3).getContext(), i14, ((zl0) obj2).a.g(), (org.telegram.ui.ActionBar.i6) obj);
                return;
            case 28:
                b();
                return;
            default:
                ((gt0) obj3).T0((fj) obj2, (View) obj, i14, false);
                return;
        }
    }

    public /* synthetic */ t4(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = i7;
        this.e = obj2;
        this.c = obj3;
    }

    public /* synthetic */ t4(Object obj, int i7, String str, Serializable serializable, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = i7;
        this.c = str;
        this.e = serializable;
    }

    public /* synthetic */ t4(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = i7;
        this.c = obj3;
    }

    public /* synthetic */ t4(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.b = i7;
    }

    public /* synthetic */ t4(r20 r20Var, String str, int i7, ArrayList arrayList) {
        this.a = 25;
        this.d = r20Var;
        this.c = str;
        this.b = i7;
        this.e = arrayList;
    }
}
