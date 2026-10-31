package ag;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.View;
import bi.n4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.b6;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.ef;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.hs;
import org.telegram.messenger.jj;
import org.telegram.messenger.o5;
import org.telegram.messenger.q20;
import org.telegram.messenger.tz;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.c7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.x4;
import org.telegram.ui.ActionBar.y4;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.im;
import org.telegram.ui.Components.j00;
import org.telegram.ui.Components.jm;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.om0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.rp0;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.ss0;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.us0;
import org.telegram.ui.Components.v01;
import org.telegram.ui.Components.xm0;
import org.telegram.ui.Components.y20;
import org.telegram.ui.Components.yn;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zt0;
import org.telegram.ui.d9;
import org.telegram.ui.h4;
import org.telegram.ui.iv;
import org.telegram.ui.lg;
import org.telegram.ui.mk;
import org.telegram.ui.nn;
import org.telegram.ui.pn;
import org.telegram.ui.sn;
import org.telegram.ui.un;
import org.telegram.ui.wo0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class g3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g3(int i10, lg.s sVar, SparseIntArray sparseIntArray, n4 n4Var) {
        this.a = 7;
        this.b = i10;
        this.c = sVar;
        this.d = sparseIntArray;
        this.e = n4Var;
    }

    private final void a() {
        sx0 sx0Var = (sx0) this.c;
        String str = (String) this.e;
        ArrayList arrayList = (ArrayList) this.d;
        if (this.b == sx0Var.K) {
            sx0Var.J = str;
            sx0Var.I = 2;
            arrayList.remove(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                sx0Var.y = true;
                sx0Var.f();
                return;
            }
            sx0Var.y = false;
            sx0Var.w = false;
            sx0Var.c();
            jg.l0 l0Var = sx0Var.d;
            if (l0Var != null) {
                l0Var.setVisibility(0);
                sx0Var.d.invalidate();
            }
            sx0Var.x = arrayList;
            fg.j jVar = sx0Var.f;
            if (jVar != null) {
                jVar.f();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:342:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c0  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r13v23, types: [org.telegram.messenger.cd] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        org.telegram.ui.ActionBar.k2 k2Var;
        int[] iArr;
        int min;
        int[] iArr2;
        int i11;
        TLRPC.UserFull userFull;
        mk mkVar;
        TLRPC.EncryptedChat encryptedChat;
        ArrayList arrayList;
        j00 j00Var;
        ?? r16;
        long C1;
        boolean z10;
        boolean z11;
        TLRPC.WebPage webPage;
        int i12;
        int i13 = this.a;
        int i14 = 9;
        ?? r11 = 0;
        int i15 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i13) {
            case 0:
                i3 i3Var = (i3) obj3;
                ArrayList arrayList2 = i3Var.b;
                TLRPC.Message message = (TLRPC.Message) obj2;
                String str = (String) obj;
                int i16 = i3Var.a;
                if ((message.flags & TLObject.FLAG_30) != 0) {
                    h3 c10 = i3Var.c(message.quick_reply_shortcut_id);
                    if (c10 == null) {
                        h3 h3Var = new h3();
                        h3Var.a = message.quick_reply_shortcut_id;
                        h3Var.d = message.id;
                        jj jjVar = new jj(i16, message, false, true);
                        h3Var.e = jjVar;
                        jjVar.r0(false);
                        if (str != null) {
                            h3Var.b = str;
                            i3Var.a(str);
                        }
                        h3Var.e.l(i15, str);
                        h3Var.f = 1;
                        arrayList2.add(h3Var);
                        for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                            ((h3) arrayList2.get(i17)).c = i17;
                        }
                        hs a02 = hs.a0(i16);
                        a02.a.c(new a1.f(11, a02, h3Var));
                        zs.f(i16).k(zs.F1, new Object[0]);
                    } else {
                        int i18 = c10.d;
                        int i19 = message.id;
                        if (i18 == i19) {
                            c10.d = i19;
                            jj jjVar2 = new jj(i16, message, false, true);
                            c10.e = jjVar2;
                            jjVar2.r0(false);
                            i3Var.l();
                            zs.f(i16).k(zs.F1, new Object[0]);
                        } else if ((message.flags & 32768) == 0) {
                            c10.f++;
                            i3Var.l();
                            zs.f(i16).k(zs.F1, new Object[0]);
                        }
                    }
                }
                if (str == null && i15 == 0) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(message);
                    hs.a0(i16).j1(arrayList3, true, true, false, b6.q(i16).l(), false, 5, message.quick_reply_shortcut_id);
                    long e = d20.i(i16).e();
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(new jj(i16, message, true, true));
                    vp.r1(i16).i5(5, e, arrayList4);
                    return;
                }
                return;
            case 1:
                ig.k1 k1Var = (ig.k1) obj3;
                ig.f1 f1Var = (ig.f1) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                ArrayList arrayList6 = k1Var.c;
                boolean z12 = f1Var != null;
                k1Var.d = z12;
                if (!z12 || i15 < 0 || i15 >= arrayList6.size()) {
                    k1Var.i = arrayList5;
                } else {
                    k1Var.a++;
                    ((ig.j1) arrayList6.get(i15)).c++;
                    k1Var.g.edit().putInt(i0.a.i(i15, "score"), ((ig.j1) arrayList6.get(i15)).c).putInt("scoreall", k1Var.a).apply();
                    k1Var.i = null;
                }
                k1Var.e.a(f1Var);
                return;
            case 2:
                jg.v2 v2Var = (jg.v2) obj3;
                v2Var.m((Bitmap) obj2, this.b, v2Var.T, v2Var.U, (wo0) obj);
                return;
            case 3:
                kg.q0 q0Var = (kg.q0) obj3;
                TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) obj;
                tk0 tk0Var = q0Var.k1;
                ArrayList arrayList7 = q0Var.s2;
                arrayList7.clear();
                ArrayList arrayList8 = q0Var.r2;
                arrayList8.clear();
                arrayList7.addAll((ArrayList) obj2);
                for (int i20 = 0; i20 < i15; i20++) {
                    arrayList8.add(tL_messages_inactiveChats.chats.get(i20));
                }
                q0Var.A2 = false;
                q0Var.B2.b(q0Var.f2 + 4);
                int i21 = 0;
                while (true) {
                    if (i21 >= tk0Var.getChildCount()) {
                        i10 = 0;
                    } else if (tk0Var.getChildAt(i21) instanceof kg.p0) {
                        i10 = tk0Var.getChildAt(i21).getTop();
                    } else {
                        i21++;
                    }
                }
                q0Var.G1();
                if (q0Var.d2 >= 0 && i10 != 0) {
                    ((s4.a0) tk0Var.getLayoutManager()).h1(q0Var.d2 + 1, i10);
                }
                if (q0Var.E2 == null) {
                    q0Var.E2 = kg.q0.o1(q0Var.Z1, q0Var.a);
                }
                int max = Math.max(arrayList8.size(), q0Var.E2.b);
                kg.o0 o0Var = q0Var.p2;
                if (o0Var != null) {
                    o0Var.i(max, false);
                    q0Var.p2.setBagePosition(max / q0Var.E2.c);
                    kg.o0 o0Var2 = q0Var.p2;
                    o0Var2.H = true;
                    o0Var2.requestLayout();
                    return;
                }
                return;
            case 4:
                List list = (List) obj2;
                m4.w wVar = (m4.w) obj;
                m4.f0 f0Var = ((m4.p0) ((a5.a) obj3).d).h;
                if (i15 == -1) {
                    f0Var.t.x0(list);
                } else {
                    f0Var.t.a0(i15, list);
                }
                new SparseBooleanArray().append(20, true);
                f0Var.p(wVar);
                return;
            case 5:
                ((CameraView) obj3).lambda$createCamera$11(i15, (CameraSession) obj2, (CameraView.CameraGLThread) obj);
                return;
            case 6:
                int i22 = 2;
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj3;
                y4 y4Var = (y4) obj2;
                Runnable runnable = (Runnable) obj;
                x4 x4Var = actionBarLayout.d0;
                boolean z13 = false;
                int i23 = 0;
                while (i23 < i15) {
                    if (i23 == 0) {
                        k2Var = actionBarLayout.getLastFragment();
                    } else {
                        if ((actionBarLayout.h || actionBarLayout.a0) && actionBarLayout.U0.size() > 1) {
                            k2Var = (org.telegram.ui.ActionBar.k2) sc.e.g(i22, actionBarLayout.U0);
                        }
                        i23++;
                        i22 = 2;
                    }
                    if (k2Var != null) {
                        if (y4Var.m != null) {
                            if (actionBarLayout.e0 == null) {
                                c5 c5Var = new c5(0, true, false, x4Var);
                                actionBarLayout.e0 = c5Var;
                                c5Var.L = true;
                                c5 c5Var2 = new c5(1, true, false, x4Var);
                                actionBarLayout.f0 = c5Var2;
                                c5Var2.L = true;
                            }
                            sn snVar = y4Var.m;
                            SparseIntArray sparseIntArray = (SparseIntArray) x4Var.b;
                            sparseIntArray.clear();
                            for (int i24 : (int[]) x4Var.c) {
                                sparseIntArray.put(i24, snVar.k(i24, false));
                            }
                        }
                        ArrayList<c7> themeDescriptions = k2Var.getThemeDescriptions();
                        actionBarLayout.d(themeDescriptions);
                        Dialog dialog = k2Var.visibleDialog;
                        if (dialog instanceof org.telegram.ui.ActionBar.z2) {
                            actionBarLayout.d(((org.telegram.ui.ActionBar.z2) dialog).V());
                        }
                        if (i23 == 0) {
                            if (y4Var.h != null) {
                                sn snVar2 = y4Var.m;
                                if (snVar2 != null) {
                                    actionBarLayout.f0(snVar2);
                                }
                                y4Var.h.run();
                            }
                            sn snVar3 = y4Var.m;
                            actionBarLayout.o0 = 0;
                            actionBarLayout.p0 = snVar3;
                            int[] iArr3 = actionBarLayout.k0;
                            if (iArr3 != null) {
                                try {
                                    try {
                                        min = Math.min(t6.f5, iArr3.length);
                                        iArr2 = actionBarLayout.l0;
                                    } catch (Exception e7) {
                                        f8.g(e7, true);
                                        actionBarLayout.o0 = 0;
                                        iArr = null;
                                    }
                                    if (iArr2 != null) {
                                        if (iArr2.length < min) {
                                        }
                                        for (i11 = 0; i11 < min; i11++) {
                                            int h = snVar3 != null ? snVar3.h(i11) : t6.x0(null, i11, true);
                                            int i25 = actionBarLayout.k0[i11];
                                            if (h != i25 && ActionBarLayout.y(i11, i25, h)) {
                                                int[] iArr4 = actionBarLayout.l0;
                                                int i26 = actionBarLayout.o0;
                                                iArr4[i26] = i11;
                                                actionBarLayout.m0[i26] = actionBarLayout.k0[i11];
                                                actionBarLayout.n0[i26] = h;
                                                actionBarLayout.o0 = i26 + 1;
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
                        Dialog dialog2 = k2Var.visibleDialog;
                        if (dialog2 instanceof org.telegram.ui.ActionBar.z2) {
                            actionBarLayout.b(((org.telegram.ui.ActionBar.z2) dialog2).V());
                        }
                        z13 = true;
                    }
                    i23++;
                    i22 = 2;
                }
                if (z13) {
                    if (!y4Var.e) {
                        int size = actionBarLayout.U0.size() - ((actionBarLayout.h || actionBarLayout.a0) ? 2 : 1);
                        for (int i27 = 0; i27 < size; i27++) {
                            org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) actionBarLayout.U0.get(i27);
                            k2Var2.clearViews();
                            k2Var2.setParentLayout(actionBarLayout);
                        }
                    }
                    if (y4Var.d) {
                        actionBarLayout.setThemeAnimationValue(1.0f);
                        actionBarLayout.h0.clear();
                        actionBarLayout.b0.clear();
                        actionBarLayout.c0.clear();
                        actionBarLayout.j0.clear();
                        actionBarLayout.j();
                        actionBarLayout.i0 = null;
                        actionBarLayout.g0 = null;
                        nn nnVar = y4Var.j;
                        if (nnVar != null) {
                            nnVar.run();
                        }
                        if (runnable != null) {
                            runnable.run();
                            return;
                        }
                        return;
                    }
                    int i28 = t6.a;
                    t6.jm = new SparseIntArray();
                    actionBarLayout.setThemeAnimationValue(0.0f);
                    nn nnVar2 = y4Var.i;
                    if (nnVar2 != null) {
                        nnVar2.run();
                    }
                    pn pnVar = y4Var.k;
                    actionBarLayout.g0 = pnVar;
                    if (pnVar != null) {
                        sn snVar4 = pnVar.a;
                        snVar4.G.z0.invalidate();
                        snVar4.t.K = 0.0f;
                        snVar4.u.K = 0.0f;
                        snVar4.u(0.0f);
                    }
                    actionBarLayout.r0.d();
                    AnimatorSet animatorSet = new AnimatorSet();
                    actionBarLayout.q0 = animatorSet;
                    animatorSet.addListener(new bg.f(9, actionBarLayout, y4Var));
                    actionBarLayout.q0.playTogether(ObjectAnimator.ofFloat(actionBarLayout, "themeAnimationValue", 0.0f, 1.0f));
                    actionBarLayout.q0.setDuration(y4Var.l);
                    actionBarLayout.q0.start();
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                lg.s sVar = (lg.s) obj3;
                SparseIntArray sparseIntArray2 = (SparseIntArray) obj2;
                n4 n4Var = (n4) obj;
                if (i15 != t6.tm) {
                    sVar.run();
                    return;
                } else {
                    t6.hm = sparseIntArray2;
                    n4Var.run();
                    return;
                }
            case 8:
                ((org.telegram.ui.c1) obj3).a(0, false);
                s4.e0(i15, (TLRPC.TL_error) obj2, null, (TLRPC.TL_channels_joinChannel) obj, Boolean.TRUE);
                return;
            case 9:
                h4 h4Var = (h4) obj3;
                ArrayList arrayList9 = (ArrayList) obj2;
                String str2 = (String) obj;
                if (i15 == h4Var.X0) {
                    h4Var.b0(true);
                    h4Var.E = arrayList9;
                    h4Var.F = str2;
                    h4Var.u0[0].c.D.clear();
                    h4Var.u0[0].b.g1();
                    h4Var.U(0);
                    return;
                }
                return;
            case 10:
                d9 d9Var = (d9) obj3;
                TLObject tLObject = (TLObject) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (tLObject instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
                    vp.r1(i15).V3(tL_users_userFull.users, false);
                    vp.r1(i15).P3(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.voip.m1.m(user, false, userFull != null && userFull.video_calls_available, d9Var.getParentActivity(), userFull, org.telegram.messenger.c.a(i15));
                return;
            case 11:
                un unVar = (un) obj3;
                unVar.getNotificationCenter().k(56, Long.valueOf(unVar.j6), (ArrayList) obj2, Boolean.TRUE, (ArrayList) obj, null, 0, Integer.valueOf(i15), Boolean.valueOf(unVar.e5));
                unVar.O3 = null;
                return;
            case 12:
                un unVar2 = (un) obj3;
                boolean[] zArr = (boolean[]) obj2;
                un unVar3 = (un) obj;
                if (zArr[0] || i15 != unVar2.Dc || !unVar2.T3 || unVar2.isFinishing()) {
                    return;
                }
                zArr[0] = true;
                org.telegram.messenger.i0.h3(new lg(unVar2, 22), 200L);
                unVar2.presentFragment(unVar3);
                if (!unVar2.J9() || unVar3.hideKeyboardOnShow() || (mkVar = unVar3.Z) == null || mkVar.getEditField() == null) {
                    return;
                }
                unVar3.Z.getEditField().requestFocus();
                return;
            case 13:
                un unVar4 = (un) obj3;
                hs hsVar = (hs) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                unVar4.getClass();
                long j10 = i15;
                hsVar.getClass();
                try {
                    arrayList = new ArrayList();
                    hsVar.V("" + j10, arrayList, null);
                } catch (Exception e10) {
                    hsVar.o(e10, true);
                }
                if (!arrayList.isEmpty()) {
                    encryptedChat = (TLRPC.EncryptedChat) arrayList.get(0);
                    unVar4.h = encryptedChat;
                    countDownLatch.countDown();
                    return;
                }
                encryptedChat = null;
                unVar4.h = encryptedChat;
                countDownLatch.countDown();
                return;
            case 14:
                aj ajVar = (aj) obj3;
                ArrayList arrayList10 = (ArrayList) obj2;
                ArrayList arrayList11 = (ArrayList) obj;
                ej ejVar = ajVar.n;
                b1 b1Var = ejVar.s;
                if (i15 != ajVar.h) {
                    return;
                }
                if (i15 != -1) {
                    s4.g0 adapter = b1Var.getAdapter();
                    aj ajVar2 = ejVar.F;
                    if (adapter != ajVar2) {
                        b1Var.setAdapter(ajVar2);
                    }
                }
                ajVar.d = arrayList10;
                ajVar.e = arrayList11;
                ajVar.f();
                return;
            case 15:
                im imVar = (im) obj3;
                hm hmVar = (hm) obj2;
                ef efVar = (ef) obj;
                jm jmVar = imVar.P;
                ValueAnimator valueAnimator = jmVar.L;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                jmVar.J = null;
                imVar.G = 0.0f;
                imVar.f(hmVar, efVar, i15);
                imVar.j();
                imVar.i(jmVar.P, false);
                return;
            case 16:
                s4.F(((z60) obj3).e, (p6) obj2, new i2.q(i15, (yn) obj, i14));
                return;
            case 17:
                int[] iArr5 = (int[]) obj3;
                Runnable[] runnableArr = (Runnable[]) obj2;
                int[] iArr6 = (int[]) obj;
                iArr5[0] = iArr5[0] + 1;
                Runnable runnable2 = runnableArr[0];
                if (runnable2 != null) {
                    org.telegram.messenger.i0.r(runnable2);
                    runnableArr[0] = null;
                }
                if (iArr6[0] >= 0) {
                    ConnectionsManager.getInstance(i15).cancelRequest(iArr6[0], true);
                    iArr6[0] = -1;
                    return;
                }
                return;
            case 18:
                org.telegram.ui.ActionBar.k2 k2Var3 = (org.telegram.ui.ActionBar.k2) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                q20 q20Var = (q20) obj;
                if (k2Var3.getParentActivity() == null) {
                    return;
                }
                if (tLObject2 instanceof Vector) {
                    Vector vector = (Vector) tLObject2;
                    ArrayList arrayList12 = new ArrayList();
                    for (int i29 = 0; i29 < vector.objects.size(); i29++) {
                        try {
                            arrayList12.add(Long.valueOf(o5.o((TLRPC.Peer) vector.objects.get(i29))));
                        } catch (Exception unused) {
                        }
                    }
                    j00Var = new j00(k2Var3, i15, arrayList12);
                } else {
                    j00Var = new j00(k2Var3, i15, null);
                }
                j00Var.t2 = q20Var;
                k2Var3.showDialog(j00Var);
                return;
            case 19:
                y20 y20Var = (y20) obj3;
                ArrayList arrayList13 = (ArrayList) obj2;
                y20Var.getClass();
                String lowerCase = ((String) obj).trim().toLowerCase();
                int i30 = 26;
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.i0.g3(new o0(y20Var, i15, new ArrayList(), i30));
                    return;
                }
                String R0 = cd.D0().R0(lowerCase, true, false);
                if (lowerCase.equals(R0) || R0.length() == 0) {
                    R0 = null;
                }
                int i31 = (R0 != null ? 1 : 0) + 1;
                String[] strArr = new String[i31];
                strArr[0] = lowerCase;
                if (R0 != null) {
                    strArr[1] = R0;
                }
                ArrayList arrayList14 = new ArrayList();
                int size2 = arrayList13.size();
                int i32 = 0;
                while (i32 < size2) {
                    TLObject tLObject3 = (TLObject) arrayList13.get(i32);
                    if (tLObject3 instanceof TLRPC.ChatParticipant) {
                        r16 = 2;
                        C1 = ((TLRPC.ChatParticipant) tLObject3).user_id;
                    } else {
                        r16 = 2;
                        if (tLObject3 instanceof TLRPC.ChannelParticipant) {
                            C1 = jj.C1(((TLRPC.ChannelParticipant) tLObject3).peer);
                        }
                        z10 = r10;
                        z11 = r11;
                        i32++;
                        r11 = z11;
                        r10 = z10;
                    }
                    TLRPC.User Z1 = vp.r1(y20Var.x.a).Z1(Long.valueOf(C1));
                    if (!h20.B(Z1)) {
                        String lowerCase2 = h20.p(Z1).toLowerCase();
                        String R02 = cd.D0().R0(lowerCase2, r10, r11);
                        if (lowerCase2.equals(R02)) {
                            R02 = null;
                        }
                        boolean z14 = r11;
                        z11 = z14;
                        int i33 = r11;
                        while (true) {
                            z10 = r10;
                            if (i33 < i31) {
                                String str3 = strArr[i33];
                                if (lowerCase2.startsWith(str3) || sc.e.y(" ", str3, lowerCase2) || (R02 != null && (R02.startsWith(str3) || sc.e.y(" ", str3, R02)))) {
                                    z14 = z10;
                                } else {
                                    String n10 = h20.n(Z1);
                                    if (n10 != null && n10.startsWith(str3)) {
                                        z14 = r16;
                                    }
                                }
                                if (z14) {
                                    arrayList14.add(tLObject3);
                                } else {
                                    r10 = z10;
                                    i33++;
                                }
                            }
                        }
                        i32++;
                        r11 = z11;
                        r10 = z10;
                    }
                    z10 = r10;
                    z11 = r11;
                    i32++;
                    r11 = z11;
                    r10 = z10;
                }
                org.telegram.messenger.i0.g3(new o0(y20Var, i15, arrayList14, 26));
                return;
            case 20:
                m30 m30Var = (m30) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                String str4 = (String) obj;
                int i34 = m30Var.P;
                ArrayList arrayList15 = m30Var.Q;
                if (i15 != m30Var.V) {
                    return;
                }
                boolean isEmpty = arrayList15.isEmpty();
                m30Var.U = false;
                if (tLObject4 instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject4;
                    if (messages_messages instanceof TLRPC.TL_messages_messages) {
                        m30Var.Y = ((TLRPC.TL_messages_messages) messages_messages).messages.size();
                    } else if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        m30Var.Y = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
                    }
                    m30Var.b0 = messages_messages.next_rate;
                    vp.r1(i34).V3(messages_messages.users, false);
                    vp.r1(i34).P3(messages_messages.chats, false);
                    for (int i35 = 0; i35 < messages_messages.messages.size(); i35++) {
                        jj jjVar3 = new jj(i34, messages_messages.messages.get(i35), false, true);
                        jjVar3.J5(str4, true);
                        arrayList15.add(jjVar3);
                    }
                    m30Var.X = arrayList15.size() >= m30Var.Y;
                    m30Var.X();
                } else {
                    m30Var.X = true;
                    m30Var.Y = arrayList15.size();
                }
                m30Var.O(true);
                if (isEmpty) {
                    ((xm0) m30Var).e0.v0.h1(0, 0);
                    return;
                }
                return;
            case 21:
                rm0.c(((rm0) obj3).getContext(), i15, ((om0) obj2).a.g(), (p6) obj);
                return;
            case 22:
                sp0 sp0Var = (sp0) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                String str5 = (String) obj;
                HashMap hashMap = sp0Var.w;
                if (i15 != sp0Var.D) {
                    return;
                }
                sp0Var.y = 0;
                if (tLObject5 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject5;
                    vp.r1(sp0Var.c).V3(webpagepreview.users, false);
                    vp.r1(sp0Var.c).P3(webpagepreview.chats, false);
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
                            hashMap.put(str5, webPage);
                            sp0Var.x = webPage;
                            sp0.a(sp0Var.a[0], webPage, str5);
                            return;
                        }
                        if (webPage instanceof TLRPC.TL_webPagePending) {
                            sp0Var.x = webPage;
                            return;
                        }
                        if (webPage instanceof TLRPC.TL_webPageEmpty) {
                            sp0Var.x = null;
                            if (sp0Var.b != 0) {
                                sp0Var.b = 0;
                                rp0 rp0Var = sp0Var.H;
                                if (rp0Var != null) {
                                    ((iv) rp0Var).i(0);
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
            case 23:
                ((zt0) obj3).P0((jj) obj2, (View) obj, i15, false);
                return;
            case 24:
                zt0.e((zt0) obj3, i15, (TL_stories.StoryItem) obj2, (String) obj);
                return;
            case 25:
                s4.e0(i15, (TLRPC.TL_error) obj2, ((zt0) obj3).x1, (TLRPC.TL_messages_editMessage) obj, new Object[0]);
                return;
            case 26:
                us0 us0Var = (us0) obj3;
                ArrayList arrayList16 = (ArrayList) obj2;
                String str6 = (String) obj;
                zt0 zt0Var = us0Var.w;
                if (us0Var.h != 0) {
                    if (i15 == us0Var.n) {
                        int b10 = us0Var.b();
                        us0Var.f = arrayList16;
                        us0Var.s--;
                        int b11 = us0Var.b();
                        if (us0Var.s == 0 || b11 != 0) {
                            zt0Var.w1(false);
                        }
                        int i36 = 0;
                        while (true) {
                            ss0[] ss0VarArr = zt0Var.m0;
                            if (i36 < ss0VarArr.length) {
                                ss0 ss0Var = ss0VarArr[i36];
                                if (ss0Var.E == us0Var.r) {
                                    if (us0Var.s == 0 && b11 == 0) {
                                        ss0Var.w.d.setText(cd.a0("NoResultFoundFor", null, 2131748182, str6));
                                        ss0VarArr[i36].w.f.setVisibility(8);
                                        ss0VarArr[i36].w.e(false, true);
                                    } else if (b10 == 0) {
                                        zt0Var.C(ss0Var.h, 0, null);
                                    }
                                }
                                i36++;
                            } else {
                                us0Var.f();
                            }
                        }
                    }
                    us0Var.h = 0;
                    return;
                }
                return;
            case 27:
                sx0 sx0Var = (sx0) obj3;
                String[] strArr2 = (String[]) obj2;
                String str7 = (String) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList17 = new ArrayList();
                int i37 = sx0Var.a;
                ui.b0(i37).U(strArr2, str7, true, new jg.q2(sx0Var, this.b, str7, hashSet, arrayList17, 2), tz.F && d20.i(i37).q());
                return;
            case 28:
                a();
                return;
            default:
                v01 v01Var = (v01) obj3;
                ArrayList arrayList18 = (ArrayList) obj2;
                ArrayList arrayList19 = (ArrayList) obj;
                ThemeEditorView.EditorAlert editorAlert = v01Var.r;
                n01 n01Var = editorAlert.j1;
                if (i15 != v01Var.d) {
                    return;
                }
                v01 v01Var2 = editorAlert.p1;
                if (n01Var.getAdapter() != v01Var2) {
                    editorAlert.w1 = ThemeEditorView.EditorAlert.J0(editorAlert);
                    n01Var.setAdapter(v01Var2);
                    v01Var2.f();
                }
                boolean z15 = !v01Var.e.isEmpty() && arrayList18.isEmpty();
                r10 = v01Var.e.isEmpty() && arrayList18.isEmpty();
                if (z15) {
                    editorAlert.w1 = ThemeEditorView.EditorAlert.J0(editorAlert);
                }
                v01Var.e = arrayList18;
                v01Var.f = arrayList19;
                v01Var.f();
                if (!r10 && !z15 && (i12 = editorAlert.w1) > 0) {
                    editorAlert.n1.h1(0, -i12);
                    editorAlert.w1 = -1000;
                }
                editorAlert.l1.c();
                return;
        }
    }

    public /* synthetic */ g3(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ g3(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
        this.e = obj3;
    }

    public /* synthetic */ g3(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i10;
    }

    public /* synthetic */ g3(y20 y20Var, String str, int i10, ArrayList arrayList) {
        this.a = 19;
        this.c = y20Var;
        this.e = str;
        this.b = i10;
        this.d = arrayList;
    }

    public /* synthetic */ g3(sx0 sx0Var, int i10, String str, ArrayList arrayList) {
        this.a = 28;
        this.c = sx0Var;
        this.b = i10;
        this.e = str;
        this.d = arrayList;
    }
}
