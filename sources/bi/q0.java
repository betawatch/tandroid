package bi;

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
import b8.kg;
import ci.j1;
import ci.l6;
import ci.u8;
import ei.h9;
import ei.r6;
import ei.z6;
import gi.e5;
import ii.o4;
import j$.util.Objects;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import k2.p1;
import lg.t1;
import lg.u1;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.m5;
import org.telegram.messenger.qr;
import org.telegram.messenger.u10;
import org.telegram.messenger.ye;
import org.telegram.messenger.z5;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p4;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.ActionBar.t4;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.w3;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.am;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.pn;
import org.telegram.ui.Components.q20;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.qo0;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.voip.n1;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.Components.yl;
import org.telegram.ui.Components.zl;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.b9;
import org.telegram.ui.du;
import org.telegram.ui.ew;
import org.telegram.ui.f4;
import org.telegram.ui.i4;
import org.telegram.ui.mj;
import org.telegram.ui.pm;
import org.telegram.ui.rm;
import org.telegram.ui.tf;
import org.telegram.ui.um;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q0(int i3, Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = i3;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
    }

    private final void a() {
        tl0 tl0Var = (tl0) this.b;
        ql0 ql0Var = (ql0) this.d;
        e6 e6Var = (e6) this.e;
        tl0.c(tl0Var.getContext(), this.c, ql0Var.a.g(), e6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        TLRPC.WebPage webPage;
        ro0 ro0Var = (ro0) this.b;
        TLObject tLObject = (TLObject) this.e;
        String str = (String) this.d;
        HashMap hashMap = ro0Var.w;
        if (this.c != ro0Var.E) {
            return;
        }
        ro0Var.y = 0;
        if (tLObject instanceof TL_account.webPagePreview) {
            TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
            hp.s1(ro0Var.c).Y3(webpagepreview.users, false);
            hp.s1(ro0Var.c).S3(webpagepreview.chats, false);
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
                    ro0Var.x = webPage;
                    ro0.a(ro0Var.a[0], webPage, str);
                    return;
                }
                if (webPage instanceof TLRPC.TL_webPagePending) {
                    ro0Var.x = webPage;
                    return;
                }
                if (webPage instanceof TLRPC.TL_webPageEmpty) {
                    ro0Var.x = null;
                    if (ro0Var.b != 0) {
                        ro0Var.b = 0;
                        qo0 qo0Var = ro0Var.I;
                        if (qo0Var != null) {
                            ((du) qo0Var).i(0);
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
    /* JADX WARN: Removed duplicated region for block: B:237:0x04c6  */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [android.view.View, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r11v20, types: [org.telegram.messenger.bd] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i3;
        ?? r10;
        int i10;
        d2 d2Var;
        int[] iArr;
        int min;
        int[] iArr2;
        int i11;
        TLRPC.UserFull userFull;
        mj mjVar;
        TLRPC.EncryptedChat encryptedChat;
        ArrayList arrayList;
        rz rzVar;
        ?? r18;
        long C1;
        boolean z10;
        boolean z11;
        int i12 = this.a;
        int i13 = 8;
        boolean z12 = true;
        ?? r13 = 0;
        int i14 = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.b;
        switch (i12) {
            case 0:
                ((a1) obj3).d1(i14, (String) obj2, (String) obj);
                return;
            case 1:
                a1 a1Var = (a1) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                int[] iArr3 = (int[]) obj;
                a1Var.W4 = false;
                if (a1Var.X4 == null) {
                    a1Var.X4 = bitmap;
                    a1Var.Y4 = iArr3;
                    a1Var.Z4 = i14;
                    return;
                }
                return;
            case 2:
                int i15 = this.c;
                l6 l6Var = new l6((Context) obj3, i15, h10.i(i15).e(), (e6) obj2, null);
                l6Var.j2((TL_stars.SavedStarGift) obj, null);
                l6Var.show();
                return;
            case 3:
                r6 r6Var = (r6) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) obj;
                AbstractSet abstractSet = r6Var.k;
                int i16 = r6Var.f;
                AbstractSet abstractSet2 = r6Var.l;
                r6Var.A = -1;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i17 = r6Var.e;
                sb2.append(i17);
                sb2.append("{");
                long j10 = r6Var.d;
                sb2.append(j10);
                sb2.append("} loaded {");
                sb2.append(z6.a(arrayList2));
                p1.w("}", sb2);
                ArrayList arrayList3 = r6Var.g;
                arrayList3.clear();
                arrayList3.addAll(tL_stories_stories.pinned_to_top);
                int i18 = r6Var.c;
                boolean z13 = false;
                hp.s1(i18).Y3(tL_stories_stories.users, false);
                hp.s1(i18).S3(tL_stories_stories.chats, false);
                qr.a0(i18).m1(tL_stories_stories.users, tL_stories_stories.chats, true, true);
                r6Var.u = false;
                r6Var.s = tL_stories_stories.count;
                int i19 = 0;
                while (i19 < arrayList2.size()) {
                    r6Var.t((zi) arrayList2.get(i19), z13);
                    i19++;
                    z13 = false;
                }
                boolean z14 = abstractSet2.size() >= r6Var.s;
                r6Var.r = z14;
                if (z14) {
                    Iterator it = abstractSet.iterator();
                    while (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        int intValue = num.intValue();
                        if (!abstractSet2.contains(num)) {
                            it.remove();
                            r6Var.u(intValue, false);
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
                                    i3 = intValue2;
                                    i14 = i3;
                                }
                            }
                        }
                        i3 = -1;
                        i14 = i3;
                    }
                    int n4 = r6Var.n();
                    Iterator it2 = abstractSet.iterator();
                    while (it2.hasNext()) {
                        Integer num3 = (Integer) it2.next();
                        int intValue3 = num3.intValue();
                        if (!abstractSet2.contains(num3) && intValue3 >= i14 && intValue3 <= n4) {
                            it2.remove();
                            r6Var.u(intValue3, false);
                        }
                    }
                }
                r6Var.d(true);
                if (r6Var.r) {
                    if (r6.B == null) {
                        r6.B = new HashMap();
                    }
                    r6.B.put(Integer.valueOf(Objects.hash(Integer.valueOf(i18), Integer.valueOf(i17), Long.valueOf(j10), Integer.valueOf(i16))), Long.valueOf(System.currentTimeMillis()));
                } else {
                    r6Var.w();
                }
                r6Var.x();
                return;
            case 4:
                org.telegram.messenger.g0.h3(new h9(qr.a0(i14).l0((ArrayList) obj3), (HashMap) obj2, (u10) obj));
                return;
            case 5:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj3;
                org.telegram.ui.web.p pVar = (org.telegram.ui.web.p) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (userFull2 == null) {
                    pVar.a(Boolean.FALSE, "cancelled");
                    return;
                } else {
                    o4.b(i14, user, userFull2, pVar);
                    return;
                }
            case 6:
                kg.c cVar = (kg.c) obj3;
                String str = (String) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                ArrayList arrayList6 = cVar.f;
                if (i14 != cVar.s) {
                    return;
                }
                cVar.w = false;
                cVar.h = str;
                arrayList6.clear();
                arrayList6.addAll(arrayList5);
                kg.b bVar = cVar.n;
                if (bVar != null) {
                    bVar.a();
                }
                cVar.f();
                return;
            case 7:
                kg.e0 e0Var = (kg.e0) obj3;
                ArrayList arrayList7 = (ArrayList) obj2;
                x3 x3Var = (x3) obj;
                ArrayList arrayList8 = e0Var.L;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - e0Var.o0 < 300) {
                    return;
                }
                e0Var.o0 = elapsedRealtime;
                int size = arrayList8.size();
                int size2 = arrayList7.size();
                int i21 = (arrayList7.isEmpty() && arrayList8.isEmpty()) ? 0 : size2 + size;
                int min2 = Math.min(3, size2) + size;
                int b10 = e0Var.b();
                boolean z15 = e0Var.H0;
                boolean z16 = b10 > ((z15 ? min2 : i21) + i14) + 1;
                u4.k kVar = e0Var.j0;
                if (kVar != null) {
                    kVar.c = z16 ? 45L : 200L;
                    kVar.d = z16 ? 80L : 200L;
                    kVar.l = z16 ? 270L : 0L;
                }
                e0Var.H0 = !z15;
                x3Var.setRightTextMargin(16);
                if (e0Var.H0) {
                    i10 = 2131745349;
                    r10 = 0;
                } else {
                    r10 = 0;
                    i10 = 2131745350;
                }
                String M0 = bd.M0(i10, r10);
                boolean z17 = e0Var.H0;
                w3 w3Var = x3Var.b;
                w3Var.c(M0, true, z17);
                w3Var.setVisibility(0);
                e0Var.p0 = r10;
                View view = (View) x3Var.getParent();
                if (view instanceof RecyclerView) {
                    RecyclerView recyclerView = (RecyclerView) view;
                    int i22 = (!e0Var.H0 ? i14 + min2 : i21 + i14) + 1;
                    int i23 = 0;
                    while (true) {
                        if (i23 < recyclerView.getChildCount()) {
                            View childAt = recyclerView.getChildAt(i23);
                            if (RecyclerView.R(childAt) == i22) {
                                e0Var.p0 = childAt;
                            } else {
                                i23++;
                            }
                        }
                    }
                }
                int i24 = i14 + min2;
                int i25 = i24 + 1;
                int max = Math.max(0, size2 - 3);
                if (e0Var.H0) {
                    e0Var.p(i25, max);
                    if (z16) {
                        org.telegram.messenger.g0.i3(new cg.l0(e0Var, i24, 11), 350L);
                    } else {
                        e0Var.g(i24);
                    }
                } else {
                    e0Var.g(i24);
                    e0Var.o(i25, max);
                }
                ii.e eVar = e0Var.q0;
                if (eVar != null) {
                    org.telegram.messenger.g0.r(eVar);
                }
                if (!z16) {
                    e0Var.n0 = false;
                    return;
                }
                e0Var.n0 = true;
                ii.e eVar2 = new ii.e(12, e0Var, view);
                e0Var.q0 = eVar2;
                org.telegram.messenger.g0.i3(eVar2, 400L);
                return;
            case 8:
                kg.e0 e0Var2 = (kg.e0) obj3;
                TLObject tLObject = (TLObject) obj;
                String str2 = (String) obj2;
                int i26 = e0Var2.t0;
                if (i14 == e0Var2.e0 && (tLObject instanceof TLRPC.messages_Messages)) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    e0Var2.w = messages_messages instanceof TLRPC.TL_messages_messages ? ((TLRPC.TL_messages_messages) messages_messages).messages.size() : messages_messages instanceof TLRPC.TL_messages_messagesSlice ? ((TLRPC.TL_messages_messagesSlice) messages_messages).count : 0;
                    e0Var2.x = messages_messages.next_rate;
                    e0Var2.E = str2;
                    boolean z18 = false;
                    hp.s1(i26).Y3(messages_messages.users, false);
                    hp.s1(i26).S3(messages_messages.chats, false);
                    int i27 = 0;
                    while (i27 < messages_messages.messages.size()) {
                        e0Var2.y.add(new zi(i26, messages_messages.messages.get(i27), z18, true));
                        i27++;
                        z18 = false;
                    }
                    ew ewVar = e0Var2.V;
                    if (ewVar != null) {
                        ewVar.d(e0Var2.E0 > 0, true);
                    }
                    e0Var2.f();
                    return;
                }
                return;
            case 9:
                u1 u1Var = (u1) obj3;
                ArrayList arrayList9 = u1Var.b;
                TLRPC.Message message = (TLRPC.Message) obj;
                String str3 = (String) obj2;
                int i28 = u1Var.a;
                if ((message.flags & TLObject.FLAG_30) != 0) {
                    t1 c2 = u1Var.c(message.quick_reply_shortcut_id);
                    if (c2 == null) {
                        t1 t1Var = new t1();
                        t1Var.a = message.quick_reply_shortcut_id;
                        t1Var.d = message.id;
                        zi ziVar = new zi(i28, message, false, true);
                        t1Var.e = ziVar;
                        ziVar.r0(false);
                        if (str3 != null) {
                            t1Var.b = str3;
                            u1Var.a(str3);
                        }
                        t1Var.e.l(i14, str3);
                        t1Var.f = 1;
                        arrayList9.add(t1Var);
                        for (int i29 = 0; i29 < arrayList9.size(); i29++) {
                            ((t1) arrayList9.get(i29)).c = i29;
                        }
                        qr a02 = qr.a0(i28);
                        a02.a.c(new ii.e(26, a02, t1Var));
                        hs.f(i28).k(hs.F1, new Object[0]);
                    } else {
                        int i30 = c2.d;
                        int i31 = message.id;
                        if (i30 == i31) {
                            c2.d = i31;
                            zi ziVar2 = new zi(i28, message, false, true);
                            c2.e = ziVar2;
                            ziVar2.r0(false);
                            u1Var.l();
                            hs.f(i28).k(hs.F1, new Object[0]);
                        } else if ((message.flags & 32768) == 0) {
                            c2.f++;
                            u1Var.l();
                            hs.f(i28).k(hs.F1, new Object[0]);
                        }
                    }
                }
                if (str3 == null && i14 == 0) {
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.add(message);
                    qr.a0(i28).j1(arrayList10, true, true, false, z5.q(i28).l(), false, 5, message.quick_reply_shortcut_id);
                    long e10 = h10.i(i28).e();
                    ArrayList arrayList11 = new ArrayList();
                    arrayList11.add(new zi(i28, message, true, true));
                    hp.s1(i28).l5(5, e10, arrayList11);
                    return;
                }
                return;
            case 10:
                List list = (List) obj2;
                o4.v vVar = (o4.v) obj;
                o4.e0 e0Var3 = ((o4.o0) ((kg) obj3).d).h;
                if (i14 == -1) {
                    e0Var3.t.w0(list);
                } else {
                    e0Var3.t.Z(i14, list);
                }
                new SparseBooleanArray().append(20, true);
                e0Var3.p(vVar);
                return;
            case 11:
                ((CameraView) obj3).lambda$createCamera$11(i14, (CameraSession) obj2, (CameraView.CameraGLThread) obj);
                return;
            case 12:
                int i32 = 2;
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj3;
                p4 p4Var = (p4) obj2;
                Runnable runnable = (Runnable) obj;
                e5 e5Var = actionBarLayout.e0;
                boolean z19 = false;
                int i33 = 0;
                while (i33 < i14) {
                    if (i33 == 0) {
                        d2Var = actionBarLayout.getLastFragment();
                    } else {
                        if ((actionBarLayout.h || actionBarLayout.b0) && actionBarLayout.V0.size() > 1) {
                            d2Var = (d2) t4.c.d(i32, actionBarLayout.V0);
                        }
                        i33++;
                        i32 = 2;
                    }
                    if (d2Var != null) {
                        if (p4Var.m != null) {
                            if (actionBarLayout.f0 == null) {
                                t4 t4Var = new t4(0, true, false, e5Var);
                                actionBarLayout.f0 = t4Var;
                                t4Var.L = true;
                                t4 t4Var2 = new t4(1, true, false, e5Var);
                                actionBarLayout.g0 = t4Var2;
                                t4Var2.L = true;
                            }
                            um umVar = p4Var.m;
                            SparseIntArray sparseIntArray = (SparseIntArray) e5Var.b;
                            sparseIntArray.clear();
                            for (int i34 : (int[]) e5Var.c) {
                                sparseIntArray.put(i34, umVar.k(i34, false));
                            }
                        }
                        ArrayList<t6> themeDescriptions = d2Var.getThemeDescriptions();
                        actionBarLayout.d(themeDescriptions);
                        Dialog dialog = d2Var.visibleDialog;
                        if (dialog instanceof t2) {
                            actionBarLayout.d(((t2) dialog).U());
                        }
                        if (i33 == 0) {
                            if (p4Var.h != null) {
                                um umVar2 = p4Var.m;
                                if (umVar2 != null) {
                                    actionBarLayout.g0(umVar2);
                                }
                                p4Var.h.run();
                            }
                            um umVar3 = p4Var.m;
                            actionBarLayout.p0 = 0;
                            actionBarLayout.q0 = umVar3;
                            int[] iArr4 = actionBarLayout.l0;
                            if (iArr4 != null) {
                                try {
                                    try {
                                        min = Math.min(k6.f5, iArr4.length);
                                        iArr2 = actionBarLayout.m0;
                                    } catch (Throwable th2) {
                                        actionBarLayout.l0 = null;
                                        throw th2;
                                    }
                                } catch (Exception e11) {
                                    a8.g(e11, true);
                                    actionBarLayout.p0 = 0;
                                    iArr = null;
                                }
                                if (iArr2 != null) {
                                    if (iArr2.length < min) {
                                    }
                                    for (i11 = 0; i11 < min; i11++) {
                                        int h = umVar3 != null ? umVar3.h(i11) : k6.x0(null, i11, true);
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
                            }
                        }
                        actionBarLayout.b(themeDescriptions);
                        Dialog dialog2 = d2Var.visibleDialog;
                        if (dialog2 instanceof t2) {
                            actionBarLayout.b(((t2) dialog2).U());
                        }
                        z19 = true;
                    }
                    i33++;
                    i32 = 2;
                }
                if (z19) {
                    if (!p4Var.e) {
                        int size3 = actionBarLayout.V0.size() - ((actionBarLayout.h || actionBarLayout.b0) ? 2 : 1);
                        for (int i37 = 0; i37 < size3; i37++) {
                            d2 d2Var2 = (d2) actionBarLayout.V0.get(i37);
                            d2Var2.clearViews();
                            d2Var2.setParentLayout(actionBarLayout);
                        }
                    }
                    if (p4Var.d) {
                        actionBarLayout.setThemeAnimationValue(1.0f);
                        actionBarLayout.i0.clear();
                        actionBarLayout.c0.clear();
                        actionBarLayout.d0.clear();
                        actionBarLayout.k0.clear();
                        actionBarLayout.j();
                        actionBarLayout.j0 = null;
                        actionBarLayout.h0 = null;
                        pm pmVar = p4Var.j;
                        if (pmVar != null) {
                            pmVar.run();
                        }
                        if (runnable != null) {
                            runnable.run();
                            return;
                        }
                        return;
                    }
                    int i38 = k6.a;
                    k6.jm = new SparseIntArray();
                    actionBarLayout.setThemeAnimationValue(0.0f);
                    pm pmVar2 = p4Var.i;
                    if (pmVar2 != null) {
                        pmVar2.run();
                    }
                    rm rmVar = p4Var.k;
                    actionBarLayout.h0 = rmVar;
                    if (rmVar != null) {
                        um umVar4 = rmVar.a;
                        umVar4.G.A0.invalidate();
                        umVar4.t.K = 0.0f;
                        umVar4.u.K = 0.0f;
                        umVar4.u(0.0f);
                    }
                    actionBarLayout.s0.d();
                    AnimatorSet animatorSet = new AnimatorSet();
                    actionBarLayout.r0 = animatorSet;
                    animatorSet.addListener(new bh.j(13, actionBarLayout, p4Var));
                    actionBarLayout.r0.playTogether(ObjectAnimator.ofFloat(actionBarLayout, "themeAnimationValue", 0.0f, 1.0f));
                    actionBarLayout.r0.setDuration(p4Var.l);
                    actionBarLayout.r0.start();
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 13:
                lg.n nVar = (lg.n) obj3;
                SparseIntArray sparseIntArray2 = (SparseIntArray) obj2;
                u8 u8Var = (u8) obj;
                if (i14 != k6.tm) {
                    nVar.run();
                    return;
                } else {
                    k6.hm = sparseIntArray2;
                    u8Var.run();
                    return;
                }
            case 14:
                ((org.telegram.ui.b1) obj3).a(0, false);
                org.telegram.ui.Components.t4.e0(i14, (TLRPC.TL_error) obj2, null, (TLRPC.TL_channels_joinChannel) obj, Boolean.TRUE);
                return;
            case 15:
                i4 i4Var = (i4) obj3;
                ArrayList arrayList12 = (ArrayList) obj;
                String str4 = (String) obj2;
                if (i14 == i4Var.Y0) {
                    i4Var.b0(true);
                    i4Var.F = arrayList12;
                    i4Var.G = str4;
                    i4Var.v0[0].c.E.clear();
                    i4Var.v0[0].b.g1();
                    i4Var.U(0);
                    return;
                }
                return;
            case 16:
                b9 b9Var = (b9) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tLObject2 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject2;
                    hp.s1(i14).Y3(tL_users_userFull.users, false);
                    hp.s1(i14).S3(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                n1.m(user2, false, userFull != null && userFull.video_calls_available, b9Var.getParentActivity(), userFull, org.telegram.messenger.c.a(i14));
                return;
            case 17:
                wm wmVar = (wm) obj3;
                wmVar.getNotificationCenter().k(56, Long.valueOf(wmVar.k6), (ArrayList) obj2, Boolean.TRUE, (ArrayList) obj, null, 0, Integer.valueOf(i14), Boolean.valueOf(wmVar.f5));
                wmVar.P3 = null;
                return;
            case 18:
                wm wmVar2 = (wm) obj3;
                boolean[] zArr = (boolean[]) obj2;
                wm wmVar3 = (wm) obj;
                if (zArr[0] || i14 != wmVar2.Mc || !wmVar2.U3 || wmVar2.isFinishing()) {
                    return;
                }
                zArr[0] = true;
                org.telegram.messenger.g0.i3(new tf(wmVar2, 22), 200L);
                wmVar2.presentFragment(wmVar3);
                if (!wmVar2.T9() || wmVar3.hideKeyboardOnShow() || (mjVar = wmVar3.a0) == null || mjVar.getEditField() == null) {
                    return;
                }
                wmVar3.a0.getEditField().requestFocus();
                return;
            case 19:
                wm wmVar4 = (wm) obj3;
                qr qrVar = (qr) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                wmVar4.getClass();
                long j11 = i14;
                qrVar.getClass();
                try {
                    arrayList = new ArrayList();
                    qrVar.V("" + j11, arrayList, null);
                } catch (Exception e12) {
                    qrVar.o(e12, true);
                }
                if (!arrayList.isEmpty()) {
                    encryptedChat = (TLRPC.EncryptedChat) arrayList.get(0);
                    wmVar4.h = encryptedChat;
                    countDownLatch.countDown();
                    return;
                }
                encryptedChat = null;
                wmVar4.h = encryptedChat;
                countDownLatch.countDown();
                return;
            case 20:
                aj ajVar = (aj) obj3;
                ArrayList arrayList13 = (ArrayList) obj2;
                ArrayList arrayList14 = (ArrayList) obj;
                ej ejVar = ajVar.n;
                j1 j1Var = ejVar.s;
                if (i14 != ajVar.h) {
                    return;
                }
                if (i14 != -1) {
                    u4.h0 adapter = j1Var.getAdapter();
                    aj ajVar2 = ejVar.G;
                    if (adapter != ajVar2) {
                        j1Var.setAdapter(ajVar2);
                    }
                }
                ajVar.d = arrayList13;
                ajVar.e = arrayList14;
                ajVar.f();
                return;
            case 21:
                zl zlVar = (zl) obj3;
                yl ylVar = (yl) obj2;
                ye yeVar = (ye) obj;
                am amVar = zlVar.Q;
                ValueAnimator valueAnimator = amVar.M;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                amVar.K = null;
                zlVar.H = 0.0f;
                zlVar.f(ylVar, yeVar, i14);
                zlVar.j();
                zlVar.i(amVar.Q, false);
                return;
            case 22:
                org.telegram.ui.Components.t4.F(((f60) obj3).e, (e6) obj2, new k2.q(i14, (pn) obj, i13));
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
                d2 d2Var3 = (d2) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                u10 u10Var = (u10) obj;
                if (d2Var3.getParentActivity() == null) {
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
                    rzVar = new rz(d2Var3, i14, arrayList15);
                } else {
                    rzVar = new rz(d2Var3, i14, null);
                }
                rzVar.u2 = u10Var;
                d2Var3.showDialog(rzVar);
                return;
            case 25:
                c20 c20Var = (c20) obj3;
                ArrayList arrayList16 = (ArrayList) obj;
                c20Var.getClass();
                String lowerCase = ((String) obj2).trim().toLowerCase();
                int i40 = 10;
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.h3(new f4(c20Var, i14, new ArrayList(), i40));
                    return;
                }
                String S0 = bd.E0().S0(lowerCase, true, false);
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
                        C1 = ((TLRPC.ChatParticipant) tLObject4).user_id;
                    } else {
                        r18 = 2;
                        if (tLObject4 instanceof TLRPC.ChannelParticipant) {
                            C1 = zi.C1(((TLRPC.ChannelParticipant) tLObject4).peer);
                        }
                        z10 = z12;
                        z11 = r13;
                        i42++;
                        r13 = z11;
                        z12 = z10;
                    }
                    TLRPC.User a22 = hp.s1(c20Var.x.a).a2(Long.valueOf(C1));
                    if (!l10.B(a22)) {
                        String lowerCase2 = l10.p(a22).toLowerCase();
                        String S02 = bd.E0().S0(lowerCase2, z12, r13);
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
                                if (lowerCase2.startsWith(str5) || p1.z(" ", str5, lowerCase2) || (S02 != null && (S02.startsWith(str5) || p1.z(" ", str5, S02)))) {
                                    z20 = z10;
                                } else {
                                    String n10 = l10.n(a22);
                                    if (n10 != null && n10.startsWith(str5)) {
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
                org.telegram.messenger.g0.h3(new f4(c20Var, i14, arrayList17, 10));
                return;
            case 26:
                q20 q20Var = (q20) obj3;
                TLObject tLObject5 = (TLObject) obj;
                String str6 = (String) obj2;
                int i44 = q20Var.Q;
                ArrayList arrayList18 = q20Var.R;
                if (i14 != q20Var.W) {
                    return;
                }
                boolean isEmpty = arrayList18.isEmpty();
                q20Var.V = false;
                if (tLObject5 instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject5;
                    if (messages_messages2 instanceof TLRPC.TL_messages_messages) {
                        q20Var.Z = ((TLRPC.TL_messages_messages) messages_messages2).messages.size();
                    } else if (messages_messages2 instanceof TLRPC.TL_messages_messagesSlice) {
                        q20Var.Z = ((TLRPC.TL_messages_messagesSlice) messages_messages2).count;
                    }
                    q20Var.c0 = messages_messages2.next_rate;
                    hp.s1(i44).Y3(messages_messages2.users, false);
                    hp.s1(i44).S3(messages_messages2.chats, false);
                    for (int i45 = 0; i45 < messages_messages2.messages.size(); i45++) {
                        zi ziVar3 = new zi(i44, messages_messages2.messages.get(i45), false, true);
                        ziVar3.L5(str6, true);
                        arrayList18.add(ziVar3);
                    }
                    q20Var.Y = arrayList18.size() >= q20Var.Z;
                    q20Var.X();
                } else {
                    q20Var.Y = true;
                    q20Var.Z = arrayList18.size();
                }
                q20Var.O(true);
                if (isEmpty) {
                    ((zl0) q20Var).f0.w0.h1(0, 0);
                    return;
                }
                return;
            case 27:
                a();
                return;
            case 28:
                b();
                return;
            default:
                ((ws0) obj3).S0((zi) obj2, (View) obj, i14, false);
                return;
        }
    }

    public /* synthetic */ q0(Object obj, int i3, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = i3;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ q0(Object obj, int i3, Object obj2, String str, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = i3;
        this.e = obj2;
        this.d = str;
    }

    public /* synthetic */ q0(Object obj, Object obj2, int i3, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.c = i3;
        this.e = obj3;
    }

    public /* synthetic */ q0(Object obj, Object obj2, Object obj3, int i3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = i3;
    }

    public /* synthetic */ q0(u1 u1Var, TLRPC.Message message, String str, int i3) {
        this.a = 9;
        this.b = u1Var;
        this.e = message;
        this.d = str;
        this.c = i3;
    }
}
