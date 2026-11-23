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
import bi.a5;
import bi.o4;
import bi.r4;
import di.f6;
import fi.h6;
import fi.p6;
import hi.n5;
import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import ki.d4;
import org.telegram.messenger.a6;
import org.telegram.messenger.a8;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.ef;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.tr;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.u4;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.dp0;
import org.telegram.ui.Components.em0;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.g00;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.nm;
import org.telegram.ui.Components.om;
import org.telegram.ui.Components.pm;
import org.telegram.ui.Components.qj;
import org.telegram.ui.Components.r20;
import org.telegram.ui.Components.uj;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.bn;
import org.telegram.ui.d9;
import org.telegram.ui.g4;
import org.telegram.ui.iu;
import org.telegram.ui.lw;
import org.telegram.ui.rj;
import org.telegram.ui.um;
import org.telegram.ui.vf;
import org.telegram.ui.wm;
import org.telegram.ui.zm;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x0(int i7, Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = i7;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
    }

    private final void a() {
        f30 f30Var = (f30) this.d;
        TLObject tLObject = (TLObject) this.e;
        String str = (String) this.b;
        int i7 = f30Var.Q;
        ArrayList arrayList = f30Var.R;
        if (this.c != f30Var.W) {
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
            ((km0) f30Var).f0.w0.h1(0, 0);
        }
    }

    private final void b() {
        em0 em0Var = (em0) this.d;
        bm0 bm0Var = (bm0) this.e;
        i6 i6Var = (i6) this.b;
        em0.c(em0Var.getContext(), this.c, bm0Var.a.g(), i6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [android.view.View, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r12v24, types: [org.telegram.messenger.gd] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v21 */
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
        org.telegram.ui.ActionBar.g2 g2Var;
        int[] iArr;
        int min;
        int[] iArr2;
        int i10;
        TLRPC.UserFull userFull;
        TLRPC.EncryptedChat encryptedChat;
        ArrayList arrayList;
        rj rjVar;
        g00 g00Var;
        ?? r19;
        long B1;
        boolean z10;
        boolean z11;
        TLRPC.WebPage webPage;
        int i11 = this.a;
        int i12 = 6;
        boolean z12 = true;
        ?? r14 = 0;
        int i13 = this.c;
        Object obj = this.b;
        Object obj2 = this.e;
        int i14 = 7;
        Object obj3 = this.d;
        switch (i11) {
            case 0:
                DictationLid.c(i13, (z0) obj2, (String) obj, (byte[]) obj3);
                return;
            case 1:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj2;
                ((di.k1) obj3).run();
                a5.s(tL_starGiftUnique, gd.a0(null, null, 2131749511, (String) obj));
                String str = tL_starGiftUnique.slug;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                org.telegram.messenger.g0.h3(new r4(this.c, 0, 0L, str, false), a5.a[0]);
                return;
            case 2:
                ((ci.z0) obj3).d1(i13, (String) obj, (String) obj2);
                return;
            case 3:
                ci.z0 z0Var = (ci.z0) obj3;
                Bitmap bitmap = (Bitmap) obj2;
                int[] iArr3 = (int[]) obj;
                z0Var.W4 = false;
                if (z0Var.X4 == null) {
                    z0Var.X4 = bitmap;
                    z0Var.Y4 = iArr3;
                    z0Var.Z4 = i13;
                    return;
                }
                return;
            case 4:
                int i15 = this.c;
                f6 f6Var = new f6((Context) obj3, i15, i10.i(i15).e(), (i6) obj2, null);
                f6Var.w2((TL_stars.SavedStarGift) obj, null);
                f6Var.show();
                return;
            case 5:
                h6 h6Var = (h6) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) obj;
                AbstractSet abstractSet = h6Var.k;
                int i16 = h6Var.f;
                AbstractSet abstractSet2 = h6Var.l;
                h6Var.A = -1;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i17 = h6Var.e;
                sb2.append(i17);
                sb2.append("{");
                long j3 = h6Var.d;
                sb2.append(j3);
                sb2.append("} loaded {");
                sb2.append(p6.a(arrayList2));
                p5.c.s("}", sb2);
                ArrayList arrayList3 = h6Var.g;
                arrayList3.clear();
                arrayList3.addAll(tL_stories_stories.pinned_to_top);
                int i18 = h6Var.c;
                boolean z13 = false;
                mp.u1(i18).f4(tL_stories_stories.users, false);
                mp.u1(i18).Z3(tL_stories_stories.chats, false);
                tr.a0(i18).m1(tL_stories_stories.users, tL_stories_stories.chats, true, true);
                h6Var.u = false;
                h6Var.s = tL_stories_stories.count;
                int i19 = 0;
                while (i19 < arrayList2.size()) {
                    h6Var.t((fj) arrayList2.get(i19), z13);
                    i19++;
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
                } else if (i16 <= 0) {
                    if (i13 == -1) {
                        if (!abstractSet2.isEmpty()) {
                            ArrayList arrayList4 = new ArrayList(abstractSet2);
                            for (int i20 = 0; i20 < arrayList4.size(); i20++) {
                                Integer num2 = (Integer) arrayList4.get(i20);
                                intValue = num2.intValue();
                                if (!arrayList3.contains(num2)) {
                                    i13 = intValue;
                                }
                            }
                        }
                        intValue = -1;
                        i13 = intValue;
                    }
                    int n10 = h6Var.n();
                    Iterator it2 = abstractSet.iterator();
                    while (it2.hasNext()) {
                        Integer num3 = (Integer) it2.next();
                        int intValue3 = num3.intValue();
                        if (!abstractSet2.contains(num3) && intValue3 >= i13 && intValue3 <= n10) {
                            it2.remove();
                            h6Var.u(intValue3, false);
                        }
                    }
                }
                h6Var.d(true);
                if (h6Var.r) {
                    if (h6.B == null) {
                        h6.B = new HashMap();
                    }
                    h6.B.put(Integer.valueOf(Objects.hash(Integer.valueOf(i18), Integer.valueOf(i17), Long.valueOf(j3), Integer.valueOf(i16))), Long.valueOf(System.currentTimeMillis()));
                } else {
                    h6Var.w();
                }
                h6Var.x();
                return;
            case 6:
                jg.c cVar = (jg.c) obj3;
                String str2 = (String) obj;
                ArrayList arrayList5 = (ArrayList) obj2;
                ArrayList arrayList6 = cVar.f;
                if (i13 != cVar.s) {
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
                int i21 = (arrayList7.isEmpty() && arrayList8.isEmpty()) ? 0 : size2 + size;
                int min2 = Math.min(3, size2) + size;
                int b10 = h0Var.b();
                boolean z15 = h0Var.H0;
                boolean z16 = b10 > ((z15 ? min2 : i21) + i13) + 1;
                v4.l lVar = h0Var.j0;
                if (lVar != null) {
                    lVar.c = z16 ? 45L : 200L;
                    lVar.d = z16 ? 80L : 200L;
                    lVar.l = z16 ? 270L : 0L;
                }
                h0Var.H0 = !z15;
                y3Var.setRightTextMargin(16);
                if (h0Var.H0) {
                    i7 = 2131745143;
                    r11 = 0;
                } else {
                    r11 = 0;
                    i7 = 2131745144;
                }
                String N0 = gd.N0(i7, r11);
                boolean z17 = h0Var.H0;
                x3 x3Var = y3Var.b;
                x3Var.c(N0, true, z17);
                x3Var.setVisibility(0);
                h0Var.p0 = r11;
                View view = (View) y3Var.getParent();
                if (view instanceof RecyclerView) {
                    RecyclerView recyclerView = (RecyclerView) view;
                    int i22 = (!h0Var.H0 ? i13 + min2 : i21 + i13) + 1;
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
                int i24 = i13 + min2;
                int i25 = i24 + 1;
                int max = Math.max(0, size2 - 3);
                if (h0Var.H0) {
                    h0Var.p(i25, max);
                    if (z16) {
                        org.telegram.messenger.g0.h3(new u0(h0Var, i24, 15), 350L);
                    } else {
                        h0Var.g(i24);
                    }
                } else {
                    h0Var.g(i24);
                    h0Var.o(i25, max);
                }
                hi.c cVar2 = h0Var.q0;
                if (cVar2 != null) {
                    org.telegram.messenger.g0.r(cVar2);
                }
                if (!z16) {
                    h0Var.n0 = false;
                    return;
                }
                h0Var.n0 = true;
                hi.c cVar3 = new hi.c(25, h0Var, view);
                h0Var.q0 = cVar3;
                org.telegram.messenger.g0.h3(cVar3, 400L);
                return;
            case 8:
                jg.h0 h0Var2 = (jg.h0) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str3 = (String) obj;
                int i26 = h0Var2.t0;
                if (i13 == h0Var2.e0 && (tLObject instanceof TLRPC.messages_Messages)) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    h0Var2.w = messages_messages instanceof TLRPC.TL_messages_messages ? ((TLRPC.TL_messages_messages) messages_messages).messages.size() : messages_messages instanceof TLRPC.TL_messages_messagesSlice ? ((TLRPC.TL_messages_messagesSlice) messages_messages).count : 0;
                    h0Var2.x = messages_messages.next_rate;
                    h0Var2.E = str3;
                    boolean z18 = false;
                    mp.u1(i26).f4(messages_messages.users, false);
                    mp.u1(i26).Z3(messages_messages.chats, false);
                    int i27 = 0;
                    while (i27 < messages_messages.messages.size()) {
                        h0Var2.y.add(new fj(i26, messages_messages.messages.get(i27), z18, true));
                        i27++;
                        z18 = false;
                    }
                    lw lwVar = h0Var2.V;
                    if (lwVar != null) {
                        lwVar.d(h0Var2.E0 > 0, true);
                    }
                    h0Var2.f();
                    return;
                }
                return;
            case 9:
                kg.w1 w1Var = (kg.w1) obj3;
                ArrayList arrayList9 = w1Var.b;
                TLRPC.Message message = (TLRPC.Message) obj2;
                String str4 = (String) obj;
                int i28 = w1Var.a;
                if ((message.flags & TLObject.FLAG_30) != 0) {
                    kg.v1 c10 = w1Var.c(message.quick_reply_shortcut_id);
                    if (c10 == null) {
                        kg.v1 v1Var = new kg.v1();
                        v1Var.a = message.quick_reply_shortcut_id;
                        v1Var.d = message.id;
                        fj fjVar = new fj(i28, message, false, true);
                        v1Var.e = fjVar;
                        fjVar.r0(false);
                        if (str4 != null) {
                            v1Var.b = str4;
                            w1Var.a(str4);
                        }
                        v1Var.e.l(i13, str4);
                        v1Var.f = 1;
                        arrayList9.add(v1Var);
                        for (int i29 = 0; i29 < arrayList9.size(); i29++) {
                            ((kg.v1) arrayList9.get(i29)).c = i29;
                        }
                        tr a02 = tr.a0(i28);
                        a02.a.c(new ji.f(i14, a02, v1Var));
                        ks.f(i28).k(ks.F1, new Object[0]);
                    } else {
                        int i30 = c10.d;
                        int i31 = message.id;
                        if (i30 == i31) {
                            c10.d = i31;
                            fj fjVar2 = new fj(i28, message, false, true);
                            c10.e = fjVar2;
                            fjVar2.r0(false);
                            w1Var.l();
                            ks.f(i28).k(ks.F1, new Object[0]);
                        } else if ((message.flags & 32768) == 0) {
                            c10.f++;
                            w1Var.l();
                            ks.f(i28).k(ks.F1, new Object[0]);
                        }
                    }
                }
                if (str4 == null && i13 == 0) {
                    ArrayList arrayList10 = new ArrayList();
                    arrayList10.add(message);
                    tr.a0(i28).j1(arrayList10, true, true, false, a6.q(i28).l(), false, 5, message.quick_reply_shortcut_id);
                    long e10 = i10.i(i28).e();
                    ArrayList arrayList11 = new ArrayList();
                    arrayList11.add(new fj(i28, message, true, true));
                    mp.u1(i28).x5(5, e10, arrayList11);
                    return;
                }
                return;
            case 10:
                org.telegram.messenger.g0.g3(new kg.x(tr.a0(i13).l0((ArrayList) obj3), (HashMap) obj2, (w10) obj, i12));
                return;
            case 11:
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) obj3;
                org.telegram.ui.web.o oVar = (org.telegram.ui.web.o) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (userFull2 == null) {
                    oVar.a(Boolean.FALSE, "cancelled");
                    return;
                } else {
                    d4.b(i13, user, userFull2, oVar);
                    return;
                }
            case 12:
                ((CameraView) obj3).lambda$createCamera$11(i13, (CameraSession) obj2, (CameraView.CameraGLThread) obj);
                return;
            case 13:
                int i32 = 2;
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj3;
                q4 q4Var = (q4) obj2;
                Runnable runnable = (Runnable) obj;
                n5 n5Var = actionBarLayout.e0;
                boolean z19 = false;
                int i33 = 0;
                while (i33 < i13) {
                    if (i33 == 0) {
                        g2Var = actionBarLayout.getLastFragment();
                    } else {
                        if ((actionBarLayout.h || actionBarLayout.b0) && actionBarLayout.V0.size() > 1) {
                            g2Var = (org.telegram.ui.ActionBar.g2) p5.c.h(i32, actionBarLayout.V0);
                        }
                        i33++;
                        i32 = 2;
                    }
                    if (g2Var != null) {
                        if (q4Var.m != null) {
                            if (actionBarLayout.f0 == null) {
                                u4 u4Var = new u4(0, true, false, n5Var);
                                actionBarLayout.f0 = u4Var;
                                u4Var.L = true;
                                u4 u4Var2 = new u4(1, true, false, n5Var);
                                actionBarLayout.g0 = u4Var2;
                                u4Var2.L = true;
                            }
                            zm zmVar = q4Var.m;
                            SparseIntArray sparseIntArray = (SparseIntArray) n5Var.b;
                            sparseIntArray.clear();
                            for (int i34 : (int[]) n5Var.c) {
                                sparseIntArray.put(i34, zmVar.a(i34, false));
                            }
                        }
                        ArrayList<w6> themeDescriptions = g2Var.getThemeDescriptions();
                        actionBarLayout.d(themeDescriptions);
                        Dialog dialog = g2Var.visibleDialog;
                        if (dialog instanceof w2) {
                            actionBarLayout.d(((w2) dialog).V());
                        }
                        if (i33 == 0) {
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
                                        min = Math.min(n6.f5, iArr4.length);
                                        iArr2 = actionBarLayout.m0;
                                    } catch (Exception e11) {
                                        a8.g(e11, true);
                                        actionBarLayout.p0 = 0;
                                        iArr = null;
                                    }
                                    if (iArr2 != null) {
                                        if (iArr2.length < min) {
                                        }
                                        for (i10 = 0; i10 < min; i10++) {
                                            int i35 = zmVar3 != null ? zmVar3.i(i10) : n6.x0(null, i10, true);
                                            int i36 = actionBarLayout.l0[i10];
                                            if (i35 != i36 && ActionBarLayout.z(i10, i36, i35)) {
                                                int[] iArr5 = actionBarLayout.m0;
                                                int i37 = actionBarLayout.p0;
                                                iArr5[i37] = i10;
                                                actionBarLayout.n0[i37] = actionBarLayout.l0[i10];
                                                actionBarLayout.o0[i37] = i35;
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
                        Dialog dialog2 = g2Var.visibleDialog;
                        if (dialog2 instanceof w2) {
                            actionBarLayout.b(((w2) dialog2).V());
                        }
                        z19 = true;
                    }
                    i33++;
                    i32 = 2;
                }
                if (z19) {
                    if (!q4Var.e) {
                        int size3 = actionBarLayout.V0.size() - ((actionBarLayout.h || actionBarLayout.b0) ? 2 : 1);
                        for (int i38 = 0; i38 < size3; i38++) {
                            org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) actionBarLayout.V0.get(i38);
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
                    int i39 = n6.a;
                    n6.mm = new SparseIntArray();
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
                if (i13 != n6.wm) {
                    c2Var.run();
                    return;
                } else {
                    n6.km = sparseIntArray2;
                    c0Var.run();
                    return;
                }
            case 15:
                ((org.telegram.ui.a1) obj3).a(0, false);
                b5.c0(i13, (TLRPC.TL_error) obj2, null, (TLRPC.TL_channels_joinChannel) obj, Boolean.TRUE);
                return;
            case 16:
                g4 g4Var = (g4) obj3;
                ArrayList arrayList12 = (ArrayList) obj2;
                String str5 = (String) obj;
                if (i13 == g4Var.Y0) {
                    g4Var.b0(true);
                    g4Var.F = arrayList12;
                    g4Var.G = str5;
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
                    mp.u1(i13).f4(tL_users_userFull.users, false);
                    mp.u1(i13).Z3(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                org.telegram.ui.Components.voip.c2.m(user2, false, userFull != null && userFull.video_calls_available, d9Var.getParentActivity(), userFull, org.telegram.messenger.c.a(i13));
                return;
            case 18:
                bn bnVar = (bn) obj3;
                tr trVar = (tr) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                bnVar.getClass();
                long j10 = i13;
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
            case 19:
                bn bnVar2 = (bn) obj3;
                bnVar2.getNotificationCenter().k(56, Long.valueOf(bnVar2.l6), (ArrayList) obj2, Boolean.TRUE, (ArrayList) obj, null, 0, Integer.valueOf(i13), Boolean.valueOf(bnVar2.g5));
                bnVar2.P3 = null;
                return;
            case 20:
                bn bnVar3 = (bn) obj3;
                boolean[] zArr = (boolean[]) obj2;
                bn bnVar4 = (bn) obj;
                if (zArr[0] || i13 != bnVar3.Pc || !bnVar3.U3 || bnVar3.isFinishing()) {
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
                qj qjVar = (qj) obj3;
                ArrayList arrayList13 = (ArrayList) obj2;
                ArrayList arrayList14 = (ArrayList) obj;
                uj ujVar = qjVar.n;
                di.b1 b1Var = ujVar.s;
                if (i13 != qjVar.h) {
                    return;
                }
                if (i13 != -1) {
                    v4.i0 adapter = b1Var.getAdapter();
                    qj qjVar2 = ujVar.G;
                    if (adapter != qjVar2) {
                        b1Var.setAdapter(qjVar2);
                    }
                }
                qjVar.d = arrayList13;
                qjVar.e = arrayList14;
                qjVar.f();
                return;
            case 22:
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
                omVar.f(nmVar, efVar, i13);
                omVar.j();
                omVar.i(pmVar.Q, false);
                return;
            case 23:
                b5.D(((x60) obj3).e, (i6) obj2, new n1(i13, (o4) obj, 9));
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
                    ConnectionsManager.getInstance(i13).cancelRequest(iArr7[0], true);
                    iArr7[0] = -1;
                    return;
                }
                return;
            case 25:
                org.telegram.ui.ActionBar.g2 g2Var3 = (org.telegram.ui.ActionBar.g2) obj3;
                TLObject tLObject3 = (TLObject) obj2;
                w10 w10Var = (w10) obj;
                if (g2Var3.getParentActivity() == null) {
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
                    g00Var = new g00(g2Var3, i13, arrayList15);
                } else {
                    g00Var = new g00(g2Var3, i13, null);
                }
                g00Var.x2 = w10Var;
                g2Var3.showDialog(g00Var);
                return;
            case 26:
                r20 r20Var = (r20) obj3;
                ArrayList arrayList16 = (ArrayList) obj2;
                r20Var.getClass();
                String lowerCase = ((String) obj).trim().toLowerCase();
                int i41 = 12;
                if (lowerCase.length() == 0) {
                    org.telegram.messenger.g0.g3(new org.telegram.ui.f0(r20Var, i13, new ArrayList(), i41));
                    return;
                }
                String T0 = gd.E0().T0(lowerCase, true, false);
                if (lowerCase.equals(T0) || T0.length() == 0) {
                    T0 = null;
                }
                int i42 = (T0 != null ? 1 : 0) + 1;
                String[] strArr = new String[i42];
                strArr[0] = lowerCase;
                if (T0 != null) {
                    strArr[1] = T0;
                }
                ArrayList arrayList17 = new ArrayList();
                int size4 = arrayList16.size();
                int i43 = 0;
                while (i43 < size4) {
                    TLObject tLObject4 = (TLObject) arrayList16.get(i43);
                    if (tLObject4 instanceof TLRPC.ChatParticipant) {
                        r19 = 2;
                        B1 = ((TLRPC.ChatParticipant) tLObject4).user_id;
                    } else {
                        r19 = 2;
                        if (tLObject4 instanceof TLRPC.ChannelParticipant) {
                            B1 = fj.B1(((TLRPC.ChannelParticipant) tLObject4).peer);
                        }
                        z10 = z12;
                        z11 = r14;
                        i43++;
                        r14 = z11;
                        z12 = z10;
                    }
                    TLRPC.User c22 = mp.u1(r20Var.x.a).c2(Long.valueOf(B1));
                    if (!n10.C(c22)) {
                        String lowerCase2 = n10.q(c22).toLowerCase();
                        String T02 = gd.E0().T0(lowerCase2, z12, r14);
                        if (lowerCase2.equals(T02)) {
                            T02 = null;
                        }
                        boolean z20 = r14;
                        z11 = z20;
                        int i44 = r14;
                        while (true) {
                            z10 = z12;
                            if (i44 < i42) {
                                String str6 = strArr[i44];
                                if (lowerCase2.startsWith(str6) || i5.c.B(" ", str6, lowerCase2) || (T02 != null && (T02.startsWith(str6) || i5.c.B(" ", str6, T02)))) {
                                    z20 = z10;
                                } else {
                                    String o4 = n10.o(c22);
                                    if (o4 != null && o4.startsWith(str6)) {
                                        z20 = r19;
                                    }
                                }
                                if (z20) {
                                    arrayList17.add(tLObject4);
                                } else {
                                    z12 = z10;
                                    i44++;
                                }
                            }
                        }
                        i43++;
                        r14 = z11;
                        z12 = z10;
                    }
                    z10 = z12;
                    z11 = r14;
                    i43++;
                    r14 = z11;
                    z12 = z10;
                }
                org.telegram.messenger.g0.g3(new org.telegram.ui.f0(r20Var, i13, arrayList17, 12));
                return;
            case 27:
                a();
                return;
            case 28:
                b();
                return;
            default:
                dp0 dp0Var = (dp0) obj3;
                TLObject tLObject5 = (TLObject) obj2;
                String str7 = (String) obj;
                HashMap hashMap = dp0Var.w;
                if (i13 != dp0Var.E) {
                    return;
                }
                dp0Var.y = 0;
                if (tLObject5 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject5;
                    mp.u1(dp0Var.c).f4(webpagepreview.users, false);
                    mp.u1(dp0Var.c).Z3(webpagepreview.chats, false);
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
                            hashMap.put(str7, webPage);
                            dp0Var.x = webPage;
                            dp0.a(dp0Var.a[0], webPage, str7);
                            return;
                        }
                        if (webPage instanceof TLRPC.TL_webPagePending) {
                            dp0Var.x = webPage;
                            return;
                        }
                        if (webPage instanceof TLRPC.TL_webPageEmpty) {
                            dp0Var.x = null;
                            if (dp0Var.b != 0) {
                                dp0Var.b = 0;
                                cp0 cp0Var = dp0Var.I;
                                if (cp0Var != null) {
                                    ((iu) cp0Var).e(0);
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

    public /* synthetic */ x0(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = i7;
        this.e = obj2;
        this.b = obj3;
    }

    public /* synthetic */ x0(Object obj, int i7, String str, Serializable serializable, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = i7;
        this.b = str;
        this.e = serializable;
    }

    public /* synthetic */ x0(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.c = i7;
        this.b = obj3;
    }

    public /* synthetic */ x0(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.c = i7;
    }

    public /* synthetic */ x0(r20 r20Var, String str, int i7, ArrayList arrayList) {
        this.a = 26;
        this.d = r20Var;
        this.b = str;
        this.c = i7;
        this.e = arrayList;
    }
}
