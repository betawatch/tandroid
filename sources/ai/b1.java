package ai;

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
import bi.l4;
import bi.o4;
import bi.x4;
import di.f6;
import fi.p6;
import hi.c5;
import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import ki.c4;
import org.telegram.messenger.a6;
import org.telegram.messenger.a8;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.ff;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.n5;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.ur;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.u4;
import org.telegram.ui.ActionBar.v6;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.dp0;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.ep0;
import org.telegram.ui.Components.i00;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.pm;
import org.telegram.ui.Components.qm;
import org.telegram.ui.Components.rm;
import org.telegram.ui.Components.u20;
import org.telegram.ui.Components.vj;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.bn;
import org.telegram.ui.d9;
import org.telegram.ui.g4;
import org.telegram.ui.ju;
import org.telegram.ui.mw;
import org.telegram.ui.rj;
import org.telegram.ui.um;
import org.telegram.ui.vf;
import org.telegram.ui.wm;
import org.telegram.ui.zm;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b1(int i7, Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = i7;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
    }

    private final void a() {
        i30 i30Var = (i30) this.d;
        TLObject tLObject = (TLObject) this.e;
        String str = (String) this.b;
        int i7 = i30Var.Q;
        ArrayList arrayList = i30Var.R;
        if (this.c != i30Var.W) {
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        i30Var.V = false;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            if (messages_messages instanceof TLRPC.TL_messages_messages) {
                i30Var.Z = ((TLRPC.TL_messages_messages) messages_messages).messages.size();
            } else if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                i30Var.Z = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
            }
            i30Var.c0 = messages_messages.next_rate;
            np.u1(i7).f4(messages_messages.users, false);
            np.u1(i7).Z3(messages_messages.chats, false);
            for (int i10 = 0; i10 < messages_messages.messages.size(); i10++) {
                gj gjVar = new gj(i7, messages_messages.messages.get(i10), false, true);
                gjVar.K5(str, true);
                arrayList.add(gjVar);
            }
            i30Var.Y = arrayList.size() >= i30Var.Z;
            i30Var.X();
        } else {
            i30Var.Y = true;
            i30Var.Z = arrayList.size();
        }
        i30Var.O(true);
        if (isEmpty) {
            ((lm0) i30Var).f0.w0.h1(0, 0);
        }
    }

    private final void b() {
        em0 em0Var = (em0) this.d;
        bm0 bm0Var = (bm0) this.e;
        h6 h6Var = (h6) this.b;
        em0.c(em0Var.getContext(), this.c, bm0Var.a.g(), h6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [android.view.View, java.lang.String] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        ?? r42;
        int i10;
        org.telegram.ui.ActionBar.g2 g2Var;
        int[] iArr;
        int min;
        int[] iArr2;
        int i11;
        TLRPC.UserFull userFull;
        TLRPC.EncryptedChat encryptedChat;
        ArrayList arrayList;
        rj rjVar;
        i00 i00Var;
        int i12;
        long B1;
        boolean z10;
        boolean z11;
        int i13;
        TLRPC.WebPage webPage;
        int i14 = this.a;
        int i15 = 5;
        String str = null;
        boolean z12 = true;
        boolean z13 = 0;
        int i16 = this.c;
        Object obj = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i14) {
            case 0:
                DictationLid.c(i16, (e1) obj2, (String) obj, (byte[]) obj3);
                return;
            case 1:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj2;
                ((di.k1) obj3).run();
                x4.s(tL_starGiftUnique, hd.a0(null, null, 2131749511, (String) obj));
                String str2 = tL_starGiftUnique.slug;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                org.telegram.messenger.g0.h3(new o4(this.c, 0, 0L, str2, false), x4.a[0]);
                return;
            case 2:
                ((ci.z0) obj3).d1(i16, (String) obj, (String) obj2);
                return;
            case 3:
                ci.z0 z0Var = (ci.z0) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                int[] iArr3 = (int[]) obj;
                z0Var.W4 = false;
                if (z0Var.X4 == null) {
                    z0Var.X4 = bitmap;
                    z0Var.Y4 = iArr3;
                    z0Var.Z4 = i16;
                    return;
                }
                return;
            case 4:
                int i17 = this.c;
                f6 f6Var = new f6((Context) obj3, i17, k10.i(i17).e(), (h6) obj2, null);
                f6Var.w2((TL_stars.SavedStarGift) obj, null);
                f6Var.show();
                return;
            case 5:
                fi.h6 h6Var = (fi.h6) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) obj;
                AbstractSet abstractSet = h6Var.k;
                int i18 = h6Var.f;
                AbstractSet abstractSet2 = h6Var.l;
                h6Var.A = -1;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i19 = h6Var.e;
                sb2.append(i19);
                sb2.append("{");
                long j3 = h6Var.d;
                sb2.append(j3);
                sb2.append("} loaded {");
                sb2.append(p6.a(arrayList2));
                p5.c.s("}", sb2);
                ArrayList arrayList3 = h6Var.g;
                arrayList3.clear();
                arrayList3.addAll(tL_stories_stories.pinned_to_top);
                int i20 = h6Var.c;
                boolean z14 = false;
                np.u1(i20).f4(tL_stories_stories.users, false);
                np.u1(i20).Z3(tL_stories_stories.chats, false);
                ur.a0(i20).m1(tL_stories_stories.users, tL_stories_stories.chats, true, true);
                h6Var.u = false;
                h6Var.s = tL_stories_stories.count;
                int i21 = 0;
                while (i21 < arrayList2.size()) {
                    h6Var.t((gj) arrayList2.get(i21), z14);
                    i21++;
                    z14 = false;
                }
                boolean z15 = abstractSet2.size() >= h6Var.s;
                h6Var.r = z15;
                if (z15) {
                    Iterator it = abstractSet.iterator();
                    while (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        int intValue = num.intValue();
                        if (!abstractSet2.contains(num)) {
                            it.remove();
                            h6Var.u(intValue, false);
                        }
                    }
                } else if (i18 <= 0) {
                    if (i16 == -1) {
                        if (!abstractSet2.isEmpty()) {
                            ArrayList arrayList4 = new ArrayList(abstractSet2);
                            for (int i22 = 0; i22 < arrayList4.size(); i22++) {
                                Integer num2 = (Integer) arrayList4.get(i22);
                                int intValue2 = num2.intValue();
                                if (!arrayList3.contains(num2)) {
                                    i7 = intValue2;
                                    i16 = i7;
                                }
                            }
                        }
                        i7 = -1;
                        i16 = i7;
                    }
                    int n10 = h6Var.n();
                    Iterator it2 = abstractSet.iterator();
                    while (it2.hasNext()) {
                        Integer num3 = (Integer) it2.next();
                        int intValue3 = num3.intValue();
                        if (!abstractSet2.contains(num3) && intValue3 >= i16 && intValue3 <= n10) {
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
                    fi.h6.B.put(Integer.valueOf(Objects.hash(Integer.valueOf(i20), Integer.valueOf(i19), Long.valueOf(j3), Integer.valueOf(i18))), Long.valueOf(System.currentTimeMillis()));
                } else {
                    h6Var.w();
                }
                h6Var.x();
                return;
            case 6:
                jg.c cVar = (jg.c) obj3;
                String str3 = (String) obj;
                ArrayList arrayList5 = (ArrayList) obj2;
                ArrayList arrayList6 = cVar.f;
                if (i16 != cVar.s) {
                    return;
                }
                cVar.w = false;
                cVar.h = str3;
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
                ArrayList arrayList7 = (ArrayList) obj2;
                y3 y3Var = (y3) obj;
                ArrayList arrayList8 = h0Var.L;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - h0Var.o0 < 300) {
                    return;
                }
                h0Var.o0 = elapsedRealtime;
                int size = arrayList8.size();
                int size2 = arrayList7.size();
                int i23 = (arrayList7.isEmpty() && arrayList8.isEmpty()) ? 0 : size2 + size;
                int min2 = Math.min(3, size2) + size;
                int b10 = h0Var.b();
                boolean z16 = h0Var.H0;
                boolean z17 = b10 > ((z16 ? min2 : i23) + i16) + 1;
                v4.k kVar = h0Var.j0;
                if (kVar != null) {
                    kVar.c = z17 ? 45L : 200L;
                    kVar.d = z17 ? 80L : 200L;
                    kVar.l = z17 ? 270L : 0L;
                }
                h0Var.H0 = !z16;
                y3Var.setRightTextMargin(16);
                if (h0Var.H0) {
                    i10 = 2131745143;
                    r42 = 0;
                } else {
                    r42 = 0;
                    i10 = 2131745144;
                }
                String N0 = hd.N0(i10, r42);
                boolean z18 = h0Var.H0;
                x3 x3Var = y3Var.b;
                x3Var.c(N0, true, z18);
                x3Var.setVisibility(0);
                h0Var.p0 = r42;
                View view = (View) y3Var.getParent();
                if (view instanceof RecyclerView) {
                    RecyclerView recyclerView = (RecyclerView) view;
                    int i24 = (!h0Var.H0 ? i16 + min2 : i23 + i16) + 1;
                    int i25 = 0;
                    while (true) {
                        if (i25 < recyclerView.getChildCount()) {
                            View childAt = recyclerView.getChildAt(i25);
                            if (RecyclerView.R(childAt) == i24) {
                                h0Var.p0 = childAt;
                            } else {
                                i25++;
                            }
                        }
                    }
                }
                int i26 = i16 + min2;
                int i27 = i26 + 1;
                int max = Math.max(0, size2 - 3);
                if (h0Var.H0) {
                    h0Var.p(i27, max);
                    if (z17) {
                        org.telegram.messenger.g0.h3(new c1(h0Var, i26, 13), 350L);
                    } else {
                        h0Var.g(i26);
                    }
                } else {
                    h0Var.g(i26);
                    h0Var.o(i27, max);
                }
                hi.c cVar2 = h0Var.q0;
                if (cVar2 != null) {
                    org.telegram.messenger.g0.r(cVar2);
                }
                if (!z17) {
                    h0Var.n0 = false;
                    return;
                }
                h0Var.n0 = true;
                hi.c cVar3 = new hi.c(23, h0Var, view);
                h0Var.q0 = cVar3;
                org.telegram.messenger.g0.h3(cVar3, 400L);
                return;
            case 8:
                jg.h0 h0Var2 = (jg.h0) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str4 = (String) obj;
                int i28 = h0Var2.t0;
                if (i16 == h0Var2.e0 && (tLObject instanceof TLRPC.messages_Messages)) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    h0Var2.w = messages_messages instanceof TLRPC.TL_messages_messages ? ((TLRPC.TL_messages_messages) messages_messages).messages.size() : messages_messages instanceof TLRPC.TL_messages_messagesSlice ? ((TLRPC.TL_messages_messagesSlice) messages_messages).count : 0;
                    h0Var2.x = messages_messages.next_rate;
                    h0Var2.E = str4;
                    boolean z19 = false;
                    np.u1(i28).f4(messages_messages.users, false);
                    np.u1(i28).Z3(messages_messages.chats, false);
                    int i29 = 0;
                    while (i29 < messages_messages.messages.size()) {
                        h0Var2.y.add(new gj(i28, messages_messages.messages.get(i29), z19, true));
                        i29++;
                        z19 = false;
                    }
                    mw mwVar = h0Var2.V;
                    if (mwVar != null) {
                        mwVar.d(h0Var2.E0 > 0, true);
                    }
                    h0Var2.f();
                    return;
                }
                return;
            case 9:
                kg.v1 v1Var = (kg.v1) obj3;
                ArrayList arrayList9 = v1Var.b;
                TLRPC.Message message = (TLRPC.Message) obj2;
                String str5 = (String) obj;
                int i30 = v1Var.a;
                if ((message.flags & TLObject.FLAG_30) != 0) {
                    kg.u1 c10 = v1Var.c(message.quick_reply_shortcut_id);
                    if (c10 == null) {
                        kg.u1 u1Var = new kg.u1();
                        u1Var.a = message.quick_reply_shortcut_id;
                        u1Var.d = message.id;
                        gj gjVar = new gj(i30, message, false, true);
                        u1Var.e = gjVar;
                        gjVar.r0(false);
                        if (str5 != null) {
                            u1Var.b = str5;
                            v1Var.a(str5);
                        }
                        u1Var.e.l(i16, str5);
                        u1Var.f = 1;
                        arrayList9.add(u1Var);
                        for (int i31 = 0; i31 < arrayList9.size(); i31++) {
                            ((kg.u1) arrayList9.get(i31)).c = i31;
                        }
                        ur a02 = ur.a0(i30);
                        a02.a.c(new ji.i(i15, a02, u1Var));
                        ls.f(i30).k(ls.F1, new Object[0]);
                    } else {
                        int i32 = c10.d;
                        int i33 = message.id;
                        if (i32 == i33) {
                            c10.d = i33;
                            gj gjVar2 = new gj(i30, message, false, true);
                            c10.e = gjVar2;
                            gjVar2.r0(false);
                            v1Var.l();
                            ls.f(i30).k(ls.F1, new Object[0]);
                        } else if ((message.flags & 32768) == 0) {
                            c10.f++;
                            v1Var.l();
                            ls.f(i30).k(ls.F1, new Object[0]);
                        }
                    }
                }
                if (str5 == null && i16 == 0) {
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.add(message);
                    ur.a0(i30).j1(arrayList10, true, true, false, a6.q(i30).l(), false, 5, message.quick_reply_shortcut_id);
                    long e10 = k10.i(i30).e();
                    ArrayList arrayList11 = new ArrayList();
                    arrayList11.add(new gj(i30, message, true, true));
                    np.u1(i30).x5(5, e10, arrayList11);
                    return;
                }
                return;
            case 10:
                org.telegram.messenger.g0.g3(new kg.y(ur.a0(i16).l0((ArrayList) obj3), (HashMap) obj2, (y10) obj, i15));
                return;
            case 11:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj3;
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (userFull2 == null) {
                    oVar.a(Boolean.FALSE, "cancelled");
                    return;
                } else {
                    c4.b(i16, user, userFull2, oVar);
                    return;
                }
            case 12:
                ((CameraView) obj3).lambda$createCamera$11(i16, (CameraSession) obj2, (CameraView.CameraGLThread) obj);
                return;
            case 13:
                int i34 = 2;
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj3;
                q4 q4Var = (q4) obj2;
                Runnable runnable = (Runnable) obj;
                c5 c5Var = actionBarLayout.e0;
                boolean z20 = false;
                int i35 = 0;
                while (i35 < i16) {
                    if (i35 == 0) {
                        g2Var = actionBarLayout.getLastFragment();
                    } else {
                        if ((actionBarLayout.h || actionBarLayout.b0) && actionBarLayout.V0.size() > 1) {
                            g2Var = (org.telegram.ui.ActionBar.g2) p5.c.h(i34, actionBarLayout.V0);
                        }
                        i35++;
                        i34 = 2;
                    }
                    if (g2Var != null) {
                        if (q4Var.m != null) {
                            if (actionBarLayout.f0 == null) {
                                u4 u4Var = new u4(0, true, false, c5Var);
                                actionBarLayout.f0 = u4Var;
                                u4Var.L = true;
                                u4 u4Var2 = new u4(1, true, false, c5Var);
                                actionBarLayout.g0 = u4Var2;
                                u4Var2.L = true;
                            }
                            zm zmVar = q4Var.m;
                            SparseIntArray sparseIntArray = (SparseIntArray) c5Var.b;
                            sparseIntArray.clear();
                            for (int i36 : (int[]) c5Var.c) {
                                sparseIntArray.put(i36, zmVar.a(i36, false));
                            }
                        }
                        ArrayList<v6> themeDescriptions = g2Var.getThemeDescriptions();
                        actionBarLayout.d(themeDescriptions);
                        Dialog dialog = g2Var.visibleDialog;
                        if (dialog instanceof org.telegram.ui.ActionBar.w2) {
                            actionBarLayout.d(((org.telegram.ui.ActionBar.w2) dialog).V());
                        }
                        if (i35 == 0) {
                            if (q4Var.h != null) {
                                zm zmVar2 = q4Var.m;
                                if (zmVar2 != null) {
                                    actionBarLayout.g0(zmVar2);
                                }
                                q4Var.h.run();
                            }
                            zm zmVar3 = q4Var.m;
                            actionBarLayout.p0 = 0;
                            actionBarLayout.q0 = zmVar3;
                            int[] iArr4 = actionBarLayout.l0;
                            if (iArr4 != null) {
                                try {
                                    try {
                                        min = Math.min(m6.f5, iArr4.length);
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
                                        int k10 = zmVar3 != null ? zmVar3.k(i11) : m6.x0(null, i11, true);
                                        int i37 = actionBarLayout.l0[i11];
                                        if (k10 != i37 && ActionBarLayout.z(i11, i37, k10)) {
                                            int[] iArr5 = actionBarLayout.m0;
                                            int i38 = actionBarLayout.p0;
                                            iArr5[i38] = i11;
                                            actionBarLayout.n0[i38] = actionBarLayout.l0[i11];
                                            actionBarLayout.o0[i38] = k10;
                                            actionBarLayout.p0 = i38 + 1;
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
                        Dialog dialog2 = g2Var.visibleDialog;
                        if (dialog2 instanceof org.telegram.ui.ActionBar.w2) {
                            actionBarLayout.b(((org.telegram.ui.ActionBar.w2) dialog2).V());
                        }
                        z20 = true;
                    }
                    i35++;
                    i34 = 2;
                }
                if (z20) {
                    if (!q4Var.e) {
                        int size3 = actionBarLayout.V0.size() - ((actionBarLayout.h || actionBarLayout.b0) ? 2 : 1);
                        for (int i39 = 0; i39 < size3; i39++) {
                            org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) actionBarLayout.V0.get(i39);
                            g2Var2.clearViews();
                            g2Var2.setParentLayout(actionBarLayout);
                        }
                    }
                    if (q4Var.d) {
                        actionBarLayout.setThemeAnimationValue(1.0f);
                        actionBarLayout.i0.clear();
                        actionBarLayout.c0.clear();
                        actionBarLayout.d0.clear();
                        actionBarLayout.k0.clear();
                        actionBarLayout.j();
                        actionBarLayout.j0 = null;
                        actionBarLayout.h0 = null;
                        um umVar = q4Var.j;
                        if (umVar != null) {
                            umVar.run();
                        }
                        if (runnable != null) {
                            runnable.run();
                            return;
                        }
                        return;
                    }
                    int i40 = m6.a;
                    m6.mm = new SparseIntArray();
                    actionBarLayout.setThemeAnimationValue(0.0f);
                    um umVar2 = q4Var.i;
                    if (umVar2 != null) {
                        umVar2.run();
                    }
                    wm wmVar = q4Var.k;
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
                    animatorSet.addListener(new ah.l(14, actionBarLayout, q4Var));
                    actionBarLayout.r0.playTogether(ObjectAnimator.ofFloat(actionBarLayout, "themeAnimationValue", 0.0f, 1.0f));
                    actionBarLayout.r0.setDuration(q4Var.l);
                    actionBarLayout.r0.start();
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 14:
                oi.c2 c2Var = (oi.c2) obj3;
                SparseIntArray sparseIntArray2 = (SparseIntArray) obj2;
                aa.c0 c0Var = (aa.c0) obj;
                if (i16 != m6.wm) {
                    c2Var.run();
                    return;
                } else {
                    m6.km = sparseIntArray2;
                    c0Var.run();
                    return;
                }
            case 15:
                ((org.telegram.ui.a1) obj3).a(0, false);
                org.telegram.ui.Components.c5.c0(i16, (TLRPC.TL_error) obj2, null, (TLRPC.TL_channels_joinChannel) obj, Boolean.TRUE);
                return;
            case 16:
                g4 g4Var = (g4) obj3;
                ArrayList arrayList12 = (ArrayList) obj2;
                String str6 = (String) obj;
                if (i16 == g4Var.Y0) {
                    g4Var.b0(true);
                    g4Var.F = arrayList12;
                    g4Var.G = str6;
                    g4Var.v0[0].c.E.clear();
                    g4Var.v0[0].b.g1();
                    g4Var.U(0);
                    return;
                }
                return;
            case 17:
                d9 d9Var = (d9) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (tLObject2 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject2;
                    np.u1(i16).f4(tL_users_userFull.users, false);
                    np.u1(i16).Z3(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.voip.b2.m(user2, false, userFull != null && userFull.video_calls_available, d9Var.getParentActivity(), userFull, org.telegram.messenger.c.a(i16));
                return;
            case 18:
                bn bnVar = (bn) obj3;
                ur urVar = (ur) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                bnVar.getClass();
                long j10 = i16;
                urVar.getClass();
                try {
                    arrayList = new ArrayList();
                    urVar.V("" + j10, arrayList, null);
                } catch (Exception e12) {
                    urVar.o(e12, true);
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
            case 19:
                bn bnVar2 = (bn) obj3;
                bnVar2.getNotificationCenter().k(56, Long.valueOf(bnVar2.l6), (ArrayList) obj2, Boolean.TRUE, (ArrayList) obj, null, 0, Integer.valueOf(i16), Boolean.valueOf(bnVar2.g5));
                bnVar2.P3 = null;
                return;
            case 20:
                bn bnVar3 = (bn) obj3;
                boolean[] zArr = (boolean[]) obj2;
                bn bnVar4 = (bn) obj;
                if (zArr[0] || i16 != bnVar3.Pc || !bnVar3.U3 || bnVar3.isFinishing()) {
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
            case 21:
                org.telegram.ui.Components.rj rjVar2 = (org.telegram.ui.Components.rj) obj3;
                ArrayList arrayList13 = (ArrayList) obj2;
                ArrayList arrayList14 = (ArrayList) obj;
                vj vjVar = rjVar2.n;
                di.b1 b1Var = vjVar.s;
                if (i16 != rjVar2.h) {
                    return;
                }
                if (i16 != -1) {
                    v4.i0 adapter = b1Var.getAdapter();
                    org.telegram.ui.Components.rj rjVar3 = vjVar.G;
                    if (adapter != rjVar3) {
                        b1Var.setAdapter(rjVar3);
                    }
                }
                rjVar2.d = arrayList13;
                rjVar2.e = arrayList14;
                rjVar2.f();
                return;
            case 22:
                qm qmVar = (qm) obj3;
                pm pmVar = (pm) obj2;
                ff ffVar = (ff) obj;
                rm rmVar = qmVar.Q;
                ValueAnimator valueAnimator = rmVar.M;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                rmVar.K = null;
                qmVar.H = 0.0f;
                qmVar.f(pmVar, ffVar, i16);
                qmVar.j();
                qmVar.i(rmVar.Q, false);
                return;
            case 23:
                org.telegram.ui.Components.c5.D(((a70) obj3).e, (h6) obj2, new v1(i16, (l4) obj, 10));
                return;
            case 24:
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
                    ConnectionsManager.getInstance(i16).cancelRequest(iArr7[0], true);
                    iArr7[0] = -1;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.ActionBar.g2 g2Var3 = (org.telegram.ui.ActionBar.g2) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                y10 y10Var = (y10) obj;
                if (g2Var3.getParentActivity() == null) {
                    return;
                }
                if (tLObject3 instanceof Vector) {
                    Vector vector = (Vector) tLObject3;
                    ArrayList arrayList15 = new ArrayList();
                    for (int i41 = 0; i41 < vector.objects.size(); i41++) {
                        try {
                            arrayList15.add(Long.valueOf(n5.o((TLRPC.Peer) vector.objects.get(i41))));
                        } catch (Exception unused) {
                        }
                    }
                    i00Var = new i00(g2Var3, i16, arrayList15);
                } else {
                    i00Var = new i00(g2Var3, i16, null);
                }
                i00Var.x2 = y10Var;
                g2Var3.showDialog(i00Var);
                return;
            case 26:
                u20 u20Var = (u20) obj3;
                ArrayList arrayList16 = (ArrayList) obj2;
                u20Var.getClass();
                String lowerCase = ((String) obj).trim().toLowerCase();
                int i42 = 12;
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.g3(new org.telegram.ui.f0(u20Var, i16, new ArrayList(), i42));
                    return;
                }
                String T0 = hd.E0().T0(lowerCase, true, false);
                if (lowerCase.equals(T0) || T0.length() == 0) {
                    T0 = null;
                }
                int i43 = (T0 != null ? 1 : 0) + 1;
                String[] strArr = new String[i43];
                strArr[0] = lowerCase;
                if (T0 != null) {
                    strArr[1] = T0;
                }
                ArrayList arrayList17 = new ArrayList();
                int size4 = arrayList16.size();
                int i44 = 0;
                while (i44 < size4) {
                    TLObject tLObject4 = (TLObject) arrayList16.get(i44);
                    if (tLObject4 instanceof TLRPC.ChatParticipant) {
                        i12 = i43;
                        B1 = ((TLRPC.ChatParticipant) tLObject4).user_id;
                    } else {
                        i12 = i43;
                        if (tLObject4 instanceof TLRPC.ChannelParticipant) {
                            B1 = gj.B1(((TLRPC.ChannelParticipant) tLObject4).peer);
                        }
                        z10 = z12;
                        z11 = z13;
                        i13 = i12;
                        i44++;
                        i43 = i13;
                        z13 = z11;
                        z12 = z10;
                        str = null;
                    }
                    TLRPC.User c22 = np.u1(u20Var.x.a).c2(Long.valueOf(B1));
                    if (!p10.C(c22)) {
                        String lowerCase2 = p10.q(c22).toLowerCase();
                        String T02 = hd.E0().T0(lowerCase2, z12, z13);
                        if (lowerCase2.equals(T02)) {
                            T02 = str;
                        }
                        z11 = z13;
                        i13 = i12;
                        boolean z21 = z11;
                        int i45 = z13;
                        while (true) {
                            z10 = z12;
                            if (i45 < i13) {
                                String str7 = strArr[i45];
                                if (lowerCase2.startsWith(str7) || i5.c.B(" ", str7, lowerCase2) || (T02 != null && (T02.startsWith(str7) || i5.c.B(" ", str7, T02)))) {
                                    z21 = z10;
                                } else {
                                    String o4 = p10.o(c22);
                                    if (o4 != null && o4.startsWith(str7)) {
                                        z21 = 2;
                                    }
                                }
                                if (z21) {
                                    arrayList17.add(tLObject4);
                                } else {
                                    z12 = z10;
                                    i45++;
                                }
                            }
                        }
                        i44++;
                        i43 = i13;
                        z13 = z11;
                        z12 = z10;
                        str = null;
                    }
                    z10 = z12;
                    z11 = z13;
                    i13 = i12;
                    i44++;
                    i43 = i13;
                    z13 = z11;
                    z12 = z10;
                    str = null;
                }
                org.telegram.messenger.g0.g3(new org.telegram.ui.f0(u20Var, i16, arrayList17, 12));
                return;
            case 27:
                a();
                return;
            case 28:
                b();
                return;
            default:
                ep0 ep0Var = (ep0) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                String str8 = (String) obj;
                HashMap hashMap = ep0Var.w;
                if (i16 != ep0Var.E) {
                    return;
                }
                ep0Var.y = 0;
                if (tLObject5 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject5;
                    np.u1(ep0Var.c).f4(webpagepreview.users, false);
                    np.u1(ep0Var.c).Z3(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        webPage = ((TLRPC.TL_messageMediaWebPage) messageMedia).webpage;
                        if (!(webPage instanceof TLRPC.TL_webPage)) {
                            if (hashMap.size() > 5) {
                                Iterator it3 = hashMap.keySet().iterator();
                                while (it3.hasNext() && hashMap.size() > 5) {
                                    it3.next();
                                    it3.remove();
                                }
                            }
                            hashMap.put(str8, webPage);
                            ep0Var.x = webPage;
                            ep0.a(ep0Var.a[0], webPage, str8);
                            return;
                        }
                        if (webPage instanceof TLRPC.TL_webPagePending) {
                            ep0Var.x = webPage;
                            return;
                        }
                        if (webPage instanceof TLRPC.TL_webPageEmpty) {
                            ep0Var.x = null;
                            if (ep0Var.b != 0) {
                                ep0Var.b = 0;
                                dp0 dp0Var = ep0Var.I;
                                if (dp0Var != null) {
                                    ((ju) dp0Var).g(0);
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
    }

    public /* synthetic */ b1(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = i7;
        this.e = obj2;
        this.b = obj3;
    }

    public /* synthetic */ b1(Object obj, int i7, String str, Serializable serializable, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = i7;
        this.b = str;
        this.e = serializable;
    }

    public /* synthetic */ b1(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.c = i7;
        this.b = obj3;
    }

    public /* synthetic */ b1(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.c = i7;
    }

    public /* synthetic */ b1(u20 u20Var, String str, int i7, ArrayList arrayList) {
        this.a = 26;
        this.d = u20Var;
        this.b = str;
        this.c = i7;
        this.e = arrayList;
    }
}
