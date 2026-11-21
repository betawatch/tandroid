package hi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p20;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class k8 extends FrameLayout implements View.OnClickListener, fs {
    public final org.telegram.ui.Cells.y3 E;
    public final x7 F;
    public boolean G;
    public org.telegram.ui.ActionBar.t1 H;
    public long I;
    public String J;
    public final ArrayList K;
    public final ArrayList L;
    public final ArrayList M;
    public boolean N;
    public boolean O;
    public float P;
    public ValueAnimator Q;
    public boolean R;
    public int S;
    public boolean T;
    public int U;
    public boolean V;
    public boolean W;
    public int a;
    public final /* synthetic */ p8 a0;
    public final a0.h b;
    public final ArrayList c;
    public final HashMap d;
    public final FrameLayout e;
    public final ek0 f;
    public final v4.c0 h;
    public final g8 n;
    public final i8 r;
    public final View s;
    public final e w;
    public final e x;
    public final d8 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(p8 p8Var, Context context) {
        super(context);
        this.a0 = p8Var;
        this.b = new a0.h();
        this.c = new ArrayList();
        this.d = new HashMap();
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.S = -1;
        int i7 = p8.Y1;
        org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(context, p8Var.J0);
        this.E = y3Var;
        d8 d8Var = new d8(this, context, p8Var.J0, new a8(this, 4));
        this.y = d8Var;
        int i10 = org.telegram.ui.ActionBar.m6.h5;
        org.telegram.ui.ActionBar.t6.h(i10, d8Var, p8Var.J0);
        d8Var.setOnSearchTextChange(new b8(this, 3));
        x7 x7Var = new x7(context, p8Var.J0);
        this.F = x7Var;
        x7Var.h = new a8(this, 5);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        int i11 = 0;
        frameLayout.setPadding(0, org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, c8.ma.e(-1, -1, ks.E1));
        ek0 ek0Var = new ek0(context, p8Var.J0);
        this.f = ek0Var;
        ek0Var.setClipToPadding(false);
        ek0Var.setTranslateSelector(true);
        g8 g8Var = new g8(this, context, p8Var.J0, d8Var, new fi.o3(p8Var, 2));
        this.n = g8Var;
        ek0Var.setAdapter(g8Var);
        g8Var.h = ek0Var;
        v4.c0 c0Var = new v4.c0();
        this.h = c0Var;
        ek0Var.setLayoutManager(c0Var);
        ek0Var.setOnScrollListener(new e8(i11, this));
        ek0Var.setOnItemClickListener(new ab.g(18, this, context));
        frameLayout.addView(ek0Var, c8.ma.c(-1.0f, -1));
        f8 f8Var = new f8(this);
        f8Var.n(350L);
        f8Var.o(nr.h);
        f8Var.C = false;
        f8Var.m = false;
        ek0Var.setItemAnimator(f8Var);
        frameLayout.addView(d8Var, c8.ma.e(-1, -2, 55));
        frameLayout.addView(y3Var, c8.ma.e(-1, 32, 55));
        addView(x7Var, c8.ma.e(-1, -2, 55));
        i8 i8Var = new i8(this, context);
        this.r = i8Var;
        i8Var.setClickable(true);
        i8Var.setOrientation(1);
        i8Var.setPadding(org.telegram.messenger.g0.L(10.0f) + p8Var.u0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f) + p8Var.u0, org.telegram.messenger.g0.L(10.0f));
        org.telegram.ui.ActionBar.t6.h(i10, i8Var, p8Var.J0);
        e eVar = new e(context, p8Var.J0, true);
        this.w = eVar;
        eVar.setOnClickListener(new z7(this, i11));
        eVar.f();
        i8Var.addView(eVar, c8.ma.r(-1, 48, 87));
        e eVar2 = new e(context, p8Var.J0, false);
        this.x = eVar2;
        eVar2.setOnClickListener(new z7(this, 1));
        eVar2.f();
        i8Var.addView(eVar2, c8.ma.t(-1, 48, 87, 0, 8, 0, 0));
        View view = new View(context);
        this.s = view;
        org.telegram.ui.ActionBar.t6.h(i10, view, p8Var.J0);
        addView(view, c8.ma.d(-1, 500.0f, 87, 0.0f, 0.0f, 0.0f, -500.0f));
        addView(i8Var, c8.ma.e(-1, -2, 87));
    }

    public static boolean d(String str, TLObject tLObject) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            String lowerCase = org.telegram.messenger.g0.M3(o10.q(user)).toLowerCase();
            if (lowerCase.startsWith(str) || i5.c.B(" ", str, lowerCase)) {
                return true;
            }
            String lowerCase2 = org.telegram.messenger.g0.M3(o10.o(user)).toLowerCase();
            if (lowerCase2.startsWith(str) || i5.c.B(" ", str, lowerCase2)) {
                return true;
            }
            ArrayList<TLRPC.TL_username> arrayList = user.usernames;
            if (arrayList != null) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    TLRPC.TL_username tL_username = arrayList.get(i7);
                    if (tL_username.active && org.telegram.messenger.g0.M3(tL_username.username).toLowerCase().startsWith(str)) {
                        return true;
                    }
                }
            }
        } else if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            String lowerCase3 = org.telegram.messenger.g0.M3(chat.title).toLowerCase();
            if (lowerCase3.startsWith(str) || i5.c.B(" ", str, lowerCase3)) {
                return true;
            }
            String lowerCase4 = org.telegram.messenger.g0.M3(org.telegram.messenger.v3.K(chat, false)).toLowerCase();
            if (lowerCase4.startsWith(str) || i5.c.B(" ", str, lowerCase4)) {
                return true;
            }
            ArrayList<TLRPC.TL_username> arrayList2 = chat.usernames;
            if (arrayList2 != null) {
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    TLRPC.TL_username tL_username2 = arrayList2.get(i10);
                    if (tL_username2.active && org.telegram.messenger.g0.M3(tL_username2.username).toLowerCase().startsWith(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void a(boolean z10) {
        if (this.a != 6) {
            return;
        }
        ArrayList arrayList = this.c;
        arrayList.clear();
        int i7 = p8.Y1;
        arrayList.addAll(mp.u1(this.a0.a).R1().L);
        int i10 = 0;
        while (true) {
            a0.h hVar = this.b;
            if (i10 >= hVar.m()) {
                break;
            }
            long j3 = hVar.j(i10);
            if (!((Boolean) hVar.n(i10)).booleanValue()) {
                arrayList.remove(Long.valueOf(j3));
            } else if (!arrayList.contains(Long.valueOf(j3))) {
                arrayList.add(Long.valueOf(j3));
            }
            i10++;
        }
        if (z10) {
            h(true);
            f(true);
            g(true);
        }
    }

    public final void b(int i7) {
        this.a = i7;
        this.b.b();
        ArrayList arrayList = this.c;
        arrayList.clear();
        HashMap hashMap = this.d;
        hashMap.clear();
        p8 p8Var = this.a0;
        if (i7 == 4) {
            arrayList.addAll(p8Var.o1);
            hashMap.putAll(p8Var.p1);
        } else if (i7 == 5) {
            arrayList.addAll(p8Var.E1);
        } else if (i7 == 1) {
            ArrayList K0 = p8.K0(p8Var);
            for (int i10 = 0; i10 < K0.size(); i10 = com.google.android.gms.internal.vision.e2.g(i10, 1, ((TLRPC.User) K0.get(i10)).id, arrayList)) {
            }
        } else if (i7 == 2) {
            arrayList.addAll(p8Var.r1);
        } else if (i7 == 3) {
            arrayList.addAll(p8Var.s1);
            hashMap.putAll(p8Var.t1);
        } else if (i7 == 6) {
            a(false);
        }
        this.n.getClass();
        this.h.k1(false);
        j(false);
        d8 d8Var = this.y;
        d8Var.setText("");
        d8Var.setVisibility(i7 == 0 ? 8 : 0);
        d8Var.M = true;
        this.J = null;
        h(false);
        f(false);
        g(false);
        int i11 = this.a;
        ek0 ek0Var = this.f;
        if (i11 != 0) {
            ek0Var.v0(0);
        }
        ek0Var.requestLayout();
        this.S = -1;
    }

    public final float c() {
        int i7 = 0;
        float f10 = -i5.c.d(150.0f, Math.min(org.telegram.messenger.g0.L(150.0f), this.y.L), 0);
        while (true) {
            ek0 ek0Var = this.f;
            if (i7 >= ek0Var.getChildCount()) {
                return f10;
            }
            View childAt = ek0Var.getChildAt(i7);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 34) {
                return Math.max(f10, childAt.getY());
            }
            i7++;
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.ChatFull chatFull;
        org.telegram.ui.ActionBar.t1 t1Var;
        if (i7 != ks.T || (chatFull = (TLRPC.ChatFull) objArr[0]) == null || (t1Var = this.H) == null || this.I != chatFull.id) {
            return;
        }
        t1Var.c(350L);
        this.H = null;
        this.I = -1L;
        e(chatFull.id, chatFull.participants);
    }

    public final void e(long j3, TLRPC.ChatParticipants chatParticipants) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i7 = this.a;
        int i10 = 0;
        boolean z10 = i7 == 1 || i7 == 2;
        p8 p8Var = this.a0;
        if (chatParticipants != null && chatParticipants.participants != null) {
            for (int i11 = 0; i11 < chatParticipants.participants.size(); i11++) {
                long j10 = chatParticipants.participants.get(i11).user_id;
                int i12 = p8.Y1;
                TLRPC.User c22 = mp.u1(p8Var.a).c2(Long.valueOf(j10));
                if (c22 != null && !o10.C(c22) && !c22.bot && c22.id != 777000 && j10 != 0) {
                    if (!z10 || c22.contact) {
                        arrayList.add(Long.valueOf(j10));
                    } else {
                        arrayList2.add(Long.valueOf(j10));
                    }
                    this.c.remove(Long.valueOf(j10));
                }
            }
        }
        if (arrayList2.isEmpty()) {
            this.d.put(Long.valueOf(j3), arrayList);
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                this.b.k(Boolean.TRUE, ((Long) obj).longValue());
            }
            j(true);
            f(true);
            g(true);
            this.y.M = true;
            return;
        }
        if (arrayList.isEmpty()) {
            Context context = getContext();
            int i13 = p8.Y1;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p8Var.J0);
            alertDialog$Builder.a.U = gd.N0(2131744297, null);
            i5.c.y(null, 2131752577, alertDialog$Builder, null);
            return;
        }
        Context context2 = getContext();
        int i14 = p8.Y1;
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, context2, p8Var.J0);
        alertDialog$Builder2.a.U = gd.G(arrayList2.size(), "StoryPrivacyGroupNonContacts", new Object[0]);
        alertDialog$Builder2.k(gd.G(arrayList.size(), "StoryPrivacyGroupAddContacts", new Object[0]), new di.h(this, j3, arrayList, 2));
        i5.c.y(null, 2131752577, alertDialog$Builder2, null);
    }

    public final void f(boolean z10) {
        int i7 = this.a;
        p8 p8Var = this.a0;
        e eVar = this.x;
        int i10 = 0;
        e eVar2 = this.w;
        if (i7 == 0) {
            eVar2.setShowZero(false);
            eVar2.setEnabled(true);
            eVar2.c(0, z10);
            if (p8Var.G1) {
                eVar2.i(gd.N0(2131744313, null), z10, true);
            } else if (p8Var.U1) {
                eVar2.i(gd.N0(2131744313, null), z10, true);
            } else {
                int i11 = p8Var.D1;
                if (i11 == 1) {
                    eVar2.i(gd.N0(p8Var.F1 ? 2131744378 : 2131744317, null), z10, true);
                } else {
                    eVar2.i(gd.H(',', "StoryPrivacyButtonPostMultiple", i11), z10, true);
                }
            }
            eVar.setVisibility(8);
            return;
        }
        ArrayList arrayList = this.c;
        if (i7 == 1) {
            eVar2.setShowZero(false);
            eVar2.setEnabled(true);
            eVar2.i(gd.N0(2131744312, null), z10, true);
            eVar2.c(arrayList.size(), z10);
            eVar.setVisibility(8);
            return;
        }
        i8 i8Var = this.r;
        if (i7 == 3) {
            int size = p8.S0(arrayList, this.d).size();
            p8Var.u1 = size;
            eVar2.i(gd.N0(2131744313, null), z10, true);
            eVar2.setShowZero(false);
            i8Var.b(size <= 0, z10);
            eVar2.c(size, z10);
            eVar2.setEnabled(size > 0);
            eVar.setVisibility(8);
            return;
        }
        if (i7 == 2) {
            eVar2.setShowZero(false);
            eVar2.setEnabled(true);
            if (arrayList.isEmpty()) {
                eVar2.i(gd.N0(2131744313, null), z10, true);
                eVar2.c(0, z10);
            } else {
                eVar2.i(gd.N0(2131744318, null), z10, true);
                eVar2.c(arrayList.size(), z10);
            }
            eVar.setVisibility(8);
            return;
        }
        if (i7 == 5) {
            eVar2.setShowZero(true);
            eVar2.setEnabled(!arrayList.isEmpty());
            eVar2.c(arrayList.size(), z10);
            eVar.setVisibility(8);
            return;
        }
        if (i7 != 6) {
            if (i7 == 4) {
                int size2 = p8.S0(p8Var.o1, p8Var.p1).size();
                p8Var.q1 = size2;
                eVar2.i(gd.N0(2131744313, null), z10, true);
                eVar2.setShowZero(false);
                i8Var.b(false, z10);
                eVar2.c(size2, z10);
                eVar2.setEnabled(true);
                eVar.setVisibility(8);
                return;
            }
            return;
        }
        eVar2.setShowZero(false);
        eVar2.setEnabled(true);
        eVar2.i(gd.N0(2131744312, null), z10, true);
        int i12 = p8.Y1;
        fi.p6 R1 = mp.u1(p8Var.a).R1();
        if (!R1.O) {
            while (true) {
                a0.h hVar = this.b;
                if (i10 >= hVar.m()) {
                    break;
                }
                long j3 = hVar.j(i10);
                ((Boolean) hVar.n(i10)).getClass();
                R1.L.contains(Long.valueOf(j3));
                i10++;
            }
        } else {
            eVar2.c(arrayList.size(), z10);
        }
        eVar.setVisibility(8);
    }

    public final void g(boolean z10) {
        ArrayList arrayList;
        int R;
        p8 p8Var = this.a0;
        ArrayList arrayList2 = p8Var.E1;
        HashMap hashMap = p8Var.t1;
        ArrayList arrayList3 = p8Var.s1;
        ArrayList arrayList4 = p8Var.r1;
        HashMap hashMap2 = p8Var.p1;
        ArrayList arrayList5 = p8Var.o1;
        int i7 = this.a;
        HashMap hashMap3 = this.d;
        ArrayList arrayList6 = this.c;
        if (i7 == 4) {
            arrayList5.clear();
            hashMap2.clear();
            arrayList5.addAll(arrayList6);
            hashMap2.putAll(hashMap3);
        } else if (i7 == 2) {
            arrayList4.clear();
            arrayList4.addAll(arrayList6);
        } else if (i7 == 3) {
            arrayList3.clear();
            hashMap.clear();
            arrayList3.addAll(arrayList6);
            hashMap.putAll(hashMap3);
        } else if (i7 == 0) {
            arrayList2.clear();
            arrayList2.addAll(arrayList6);
        }
        if (this.a == 3 && (p8Var.I1 != 3 || (arrayList6.isEmpty() && hashMap3.isEmpty()))) {
            if (arrayList6.isEmpty() && hashMap3.isEmpty()) {
                int i10 = this.S;
                if (i10 != -1) {
                    p8Var.I1 = i10;
                }
            } else {
                this.S = p8Var.I1;
                p8Var.I1 = 3;
            }
        }
        HashSet S0 = p8.S0(arrayList6, hashMap3);
        int i11 = 0;
        while (true) {
            arrayList = this.M;
            if (i11 >= arrayList.size()) {
                break;
            }
            y7 y7Var = (y7) arrayList.get(i11);
            if (y7Var != null) {
                int i12 = y7Var.i;
                if (i12 > 0) {
                    y7Var.k = p8Var.I1 == i12;
                    y7Var.l = false;
                } else {
                    TLRPC.User user = y7Var.g;
                    if (user != null) {
                        boolean contains = arrayList6.contains(Long.valueOf(user.id));
                        y7Var.k = contains;
                        y7Var.l = !contains && S0.contains(Long.valueOf(y7Var.g.id));
                    } else {
                        TLRPC.Chat chat = y7Var.h;
                        if (chat != null) {
                            y7Var.k = hashMap3.containsKey(Long.valueOf(chat.id));
                            y7Var.l = false;
                        }
                    }
                }
            }
            i11++;
        }
        int i13 = 0;
        while (true) {
            ek0 ek0Var = this.f;
            if (i13 >= ek0Var.getChildCount()) {
                i(z10);
                return;
            }
            View childAt = ek0Var.getChildAt(i13);
            if ((childAt instanceof o8) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                y7 y7Var2 = (y7) arrayList.get(R);
                o8 o8Var = (o8) childAt;
                o8Var.c(y7Var2.k || y7Var2.l, z10);
                TLRPC.Chat chat2 = y7Var2.h;
                if (chat2 != null) {
                    o8Var.b(z10, p8.L0(p8Var, chat2) > 200 ? 0.3f : 1.0f);
                } else {
                    if (y7Var2.l && !y7Var2.k) {
                        r8 = 0.5f;
                    }
                    o8Var.b(z10, r8);
                }
            }
            i13++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0cbe  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0cc5  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(boolean z10) {
        float L;
        float L2;
        g8 g8Var;
        ArrayList arrayList;
        long j3;
        boolean z11;
        float f10;
        boolean z12;
        float f11;
        TLRPC.User c22;
        TLRPC.Chat O0;
        int i7;
        ArrayList arrayList2;
        int i10;
        int i11;
        TLRPC.Chat O02;
        boolean z13;
        boolean z14;
        String G;
        float f12;
        boolean z15;
        boolean z16;
        boolean z17;
        String G2;
        String G3;
        p8 p8Var = this.a0;
        ArrayList arrayList3 = p8Var.s1;
        ArrayList arrayList4 = p8Var.o1;
        ArrayList arrayList5 = p8Var.r1;
        HashSet hashSet = p8Var.v1;
        ArrayList arrayList6 = this.L;
        arrayList6.clear();
        ArrayList arrayList7 = this.M;
        arrayList6.addAll(arrayList7);
        arrayList7.clear();
        int i12 = this.a;
        org.telegram.ui.Cells.y3 y3Var = this.E;
        if (i12 != 0) {
            x7 x7Var = this.F;
            if (i12 == 1) {
                x7Var.e(gd.N0(2131744332, null));
                x7Var.d(true);
                ((org.telegram.ui.ActionBar.x1) x7Var.e).c(false, 0.0f);
                arrayList7.add(y7.d());
                arrayList7.add(y7.c());
                arrayList7.size();
                arrayList7.add(y7.e());
                arrayList7.add(y7.f());
                L2 = org.telegram.messenger.g0.L(32.0f) + org.telegram.messenger.g0.L(56.0f) + 0.0f + org.telegram.messenger.g0.L(150.0f);
                y3Var.setText(gd.N0(2131744333, null));
                i(z10);
                this.G = true;
            } else if (i12 == 2) {
                x7Var.e(gd.N0(2131744327, null));
                x7Var.d(true);
                ((org.telegram.ui.ActionBar.x1) x7Var.e).c(false, 0.0f);
                arrayList7.add(y7.d());
                arrayList7.add(y7.c());
                arrayList7.size();
                arrayList7.add(y7.e());
                arrayList7.add(y7.f());
                L2 = org.telegram.messenger.g0.L(32.0f) + org.telegram.messenger.g0.L(56.0f) + 0.0f + org.telegram.messenger.g0.L(150.0f);
                y3Var.setText(gd.N0(2131744328, null));
                i(z10);
                this.G = true;
            } else if (i12 == 3) {
                x7Var.e(gd.N0(2131744325, null));
                x7Var.d(true);
                ((org.telegram.ui.ActionBar.x1) x7Var.e).c(false, 0.0f);
                arrayList7.add(y7.d());
                arrayList7.add(y7.c());
                arrayList7.size();
                arrayList7.add(y7.e());
                arrayList7.add(y7.f());
                L2 = org.telegram.messenger.g0.L(32.0f) + org.telegram.messenger.g0.L(56.0f) + 0.0f + org.telegram.messenger.g0.L(150.0f);
                y3Var.setText(gd.N0(2131744326, null));
                i(z10);
                this.G = true;
            } else if (i12 == 5) {
                x7Var.e(gd.N0(2131744336, null));
                x7Var.d(p8Var.J1);
                ((org.telegram.ui.ActionBar.x1) x7Var.e).c(false, 0.0f);
                arrayList7.add(y7.d());
                arrayList7.add(y7.c());
                arrayList7.size();
                arrayList7.add(y7.e());
                arrayList7.add(y7.f());
                L2 = org.telegram.messenger.g0.L(32.0f) + org.telegram.messenger.g0.L(56.0f) + 0.0f + org.telegram.messenger.g0.L(150.0f);
                y3Var.setText(gd.N0(2131744337, null));
                i(z10);
                this.G = true;
            } else if (i12 == 6) {
                x7Var.e(gd.N0(2131744334, null));
                x7Var.d(true);
                ((org.telegram.ui.ActionBar.x1) x7Var.e).c(false, 0.0f);
                arrayList7.add(y7.d());
                arrayList7.add(y7.c());
                arrayList7.size();
                arrayList7.add(y7.e());
                arrayList7.add(y7.f());
                L2 = org.telegram.messenger.g0.L(32.0f) + org.telegram.messenger.g0.L(56.0f) + 0.0f + org.telegram.messenger.g0.L(150.0f);
                y3Var.setText(gd.N0(2131744335, null));
                i(z10);
                this.G = true;
            } else if (i12 == 4) {
                x7Var.e(gd.N0(2131744329, null));
                x7Var.d(true);
                ((org.telegram.ui.ActionBar.x1) x7Var.e).c(false, 0.0f);
                arrayList7.add(y7.d());
                arrayList7.add(y7.c());
                arrayList7.size();
                arrayList7.add(y7.e());
                arrayList7.add(y7.f());
                L = org.telegram.messenger.g0.L(56.0f) + 0.0f + org.telegram.messenger.g0.L(150.0f) + org.telegram.messenger.g0.L(32.0f);
                y3Var.setText(gd.N0(2131744330, null));
                i(z10);
                this.G = true;
                boolean isEmpty = TextUtils.isEmpty(this.J);
                if (this.a != 0) {
                    String lowerCase = org.telegram.messenger.g0.M3(this.J).toLowerCase();
                    int i13 = this.a;
                    if (i13 == 5) {
                        ArrayList arrayList8 = new ArrayList();
                        mp u12 = mp.u1(p8Var.a);
                        ArrayList arrayList9 = u12.y;
                        for (int i14 = 0; i14 < arrayList9.size(); i14++) {
                            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList9.get(i14);
                            if (u12.y(dialog)) {
                                if (org.telegram.messenger.n5.E(dialog.id)) {
                                    TLRPC.User c23 = u12.c2(Long.valueOf(dialog.id));
                                    if (c23 != null && !c23.bot && c23.id != 777000 && !o10.C(c23)) {
                                        arrayList8.add(c23);
                                    }
                                } else if (org.telegram.messenger.n5.z(dialog.id) && (O02 = u12.O0(Long.valueOf(-dialog.id))) != null && !org.telegram.messenger.v3.c0(O02)) {
                                    arrayList8.add(O02);
                                }
                            }
                        }
                        z11 = isEmpty;
                        arrayList = arrayList8;
                        f11 = L;
                    } else {
                        boolean z18 = i13 == 1 || i13 == 2;
                        boolean z19 = p8Var.T1 && (i13 == 3 || i13 == 6);
                        mp u13 = mp.u1(p8Var.a);
                        HashMap hashMap = new HashMap();
                        arrayList = new ArrayList();
                        ArrayList arrayList10 = u13.y;
                        ConcurrentHashMap concurrentHashMap = org.telegram.messenger.i5.r(p8Var.a).g0;
                        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
                            j3 = 777000;
                            if (p8Var.V1) {
                                z11 = isEmpty;
                                f10 = L;
                                z12 = z19;
                            } else {
                                f10 = L;
                                z12 = z19;
                                z11 = isEmpty;
                                org.telegram.messenger.i5.r(p8Var.a).A(0L, false);
                            }
                            p8Var.V1 = true;
                        } else {
                            z11 = isEmpty;
                            z12 = z19;
                            j3 = 777000;
                            f10 = L;
                        }
                        int i15 = 0;
                        while (i15 < arrayList10.size()) {
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList10.get(i15);
                            float f13 = f10;
                            if (org.telegram.messenger.n5.E(dialog2.id)) {
                                TLRPC.User c24 = u13.c2(Long.valueOf(dialog2.id));
                                if (c24 != null && !c24.bot && c24.id != j3 && !o10.C(c24) && !c24.deleted && (!z18 || (concurrentHashMap != null && concurrentHashMap.get(Long.valueOf(c24.id)) != null))) {
                                    hashMap.put(Long.valueOf(c24.id), Boolean.TRUE);
                                    arrayList.add(c24);
                                }
                            } else if (z12 && org.telegram.messenger.n5.z(dialog2.id) && (O0 = u13.O0(Long.valueOf(-dialog2.id))) != null && !org.telegram.messenger.v3.V(O0)) {
                                hashMap.put(Long.valueOf(-O0.id), Boolean.TRUE);
                                arrayList.add(O0);
                            }
                            i15++;
                            f10 = f13;
                        }
                        f11 = f10;
                        if (concurrentHashMap != null) {
                            Iterator it = concurrentHashMap.entrySet().iterator();
                            while (it.hasNext()) {
                                Long l10 = (Long) ((Map.Entry) it.next()).getKey();
                                l10.getClass();
                                if (!hashMap.containsKey(l10) && (c22 = u13.c2(l10)) != null && !c22.bot && c22.id != j3 && !o10.C(c22)) {
                                    arrayList.add(c22);
                                    hashMap.put(Long.valueOf(c22.id), Boolean.TRUE);
                                }
                            }
                        }
                    }
                    ArrayList arrayList11 = this.c;
                    HashMap hashMap2 = this.d;
                    HashSet S0 = p8.S0(arrayList11, hashMap2);
                    ArrayList arrayList12 = this.K;
                    if (z11) {
                        if (!z10) {
                            arrayList12.clear();
                            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                TLObject tLObject = (TLObject) arrayList.get(i16);
                                if (tLObject instanceof TLRPC.User ? arrayList11.contains(Long.valueOf(((TLRPC.User) tLObject).id)) : tLObject instanceof TLRPC.Chat ? hashMap2.containsKey(Long.valueOf(((TLRPC.Chat) tLObject).id)) : false) {
                                    arrayList12.add(tLObject);
                                }
                            }
                        }
                        int i17 = 0;
                        int i18 = 0;
                        while (i17 < arrayList12.size()) {
                            TLObject tLObject2 = (TLObject) arrayList12.get(i17);
                            if (tLObject2 instanceof TLRPC.User) {
                                TLRPC.User user = (TLRPC.User) tLObject2;
                                boolean contains = arrayList11.contains(Long.valueOf(user.id));
                                i10 = i17;
                                i11 = i18;
                                y7 i19 = y7.i(user, contains, !contains && S0.contains(Long.valueOf(user.id)));
                                int i20 = this.a;
                                i19.m = i20 == 2 || i20 == 4;
                                arrayList7.add(i19);
                                f11 += org.telegram.messenger.g0.L(56.0f);
                            } else {
                                i10 = i17;
                                i11 = i18;
                                if (tLObject2 instanceof TLRPC.Chat) {
                                    TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                                    boolean containsKey = hashMap2.containsKey(Long.valueOf(chat.id));
                                    float f14 = f11;
                                    y7 y7Var = new y7(3, true);
                                    y7Var.h = chat;
                                    y7Var.k = containsKey;
                                    int i21 = this.a;
                                    y7Var.m = i21 == 2 || i21 == 4;
                                    arrayList7.add(y7Var);
                                    f11 = f14 + org.telegram.messenger.g0.L(56.0f);
                                } else {
                                    i18 = i11;
                                    i17 = i10 + 1;
                                }
                            }
                            i18 = i11 + 1;
                            i17 = i10 + 1;
                        }
                        i7 = i18;
                    } else {
                        i7 = 0;
                    }
                    int i22 = 0;
                    while (i22 < arrayList.size()) {
                        TLObject tLObject3 = (TLObject) arrayList.get(i22);
                        if ((!z11 || !arrayList12.contains(tLObject3)) && d(lowerCase, tLObject3)) {
                            if (tLObject3 instanceof TLRPC.User) {
                                TLRPC.User user2 = (TLRPC.User) tLObject3;
                                boolean contains2 = arrayList11.contains(Long.valueOf(user2.id));
                                y7 i23 = y7.i(user2, contains2, !contains2 && S0.contains(Long.valueOf(user2.id)));
                                int i24 = this.a;
                                i23.m = i24 == 2 || i24 == 4;
                                arrayList7.add(i23);
                                f11 += org.telegram.messenger.g0.L(56.0f);
                                i7++;
                            } else if (tLObject3 instanceof TLRPC.Chat) {
                                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject3;
                                boolean containsKey2 = hashMap2.containsKey(Long.valueOf(chat2.id));
                                arrayList2 = arrayList11;
                                y7 y7Var2 = new y7(3, true);
                                y7Var2.h = chat2;
                                y7Var2.k = containsKey2;
                                int i25 = this.a;
                                y7Var2.m = i25 == 2 || i25 == 4;
                                arrayList7.add(y7Var2);
                                f11 += org.telegram.messenger.g0.L(56.0f);
                                i7++;
                                i22++;
                                arrayList11 = arrayList2;
                            }
                        }
                        arrayList2 = arrayList11;
                        i22++;
                        arrayList11 = arrayList2;
                    }
                    if (!z11) {
                        if (i7 == 0) {
                            arrayList7.add(new y7(5, false));
                            f11 += org.telegram.messenger.g0.L(150.0f);
                        }
                        ek0 ek0Var = this.f;
                        float measuredHeight = (ek0Var != null ? ((ek0Var.getMeasuredHeight() - ek0Var.getPaddingTop()) - ek0Var.getPaddingBottom()) + (p8Var.d ? this.U : 0) : ((org.telegram.messenger.g0.q.y - org.telegram.messenger.g0.L(56.0f)) - org.telegram.messenger.g0.n) - org.telegram.messenger.g0.L(42.0f)) - f11;
                        if (measuredHeight > 0.0f) {
                            y7 y7Var3 = new y7(-1, false);
                            y7Var3.p = (int) measuredHeight;
                            arrayList7.add(y7Var3);
                        }
                    }
                }
                if (this.h.t) {
                    Collections.reverse(arrayList7);
                }
                g8Var = this.n;
                if (g8Var != null) {
                    if (!z10 || p8Var.I1 == 0) {
                        g8Var.f();
                    } else {
                        g8Var.E(arrayList6, arrayList7);
                    }
                }
                this.e.invalidate();
            }
            L = L2;
            boolean isEmpty2 = TextUtils.isEmpty(this.J);
            if (this.a != 0) {
            }
            if (this.h.t) {
            }
            g8Var = this.n;
            if (g8Var != null) {
            }
            this.e.invalidate();
        }
        this.G = false;
        y3Var.setVisibility(8);
        int i26 = p8.Y1;
        ArrayList arrayList13 = mp.u1(p8Var.a).R1().T;
        y7 y7Var4 = new y7(-1, false);
        y7Var4.o = 24;
        arrayList7.add(y7Var4);
        if (p8Var.G1) {
            String N0 = gd.N0(2131748596, null);
            y7 y7Var5 = new y7(11, false);
            y7Var5.e = N0;
            arrayList7.add(y7Var5);
            y7Var4.o = org.telegram.messenger.g0.L(72.0f) + y7Var4.o;
        } else if (p8Var.A1 && (p8Var.U1 || arrayList13 == null || arrayList13.size() <= 1)) {
            String N02 = p8Var.U1 ? gd.N0(2131744331, null) : gd.N0(p8Var.F1 ? 2131744379 : 2131744320, null);
            if (p8Var.F1) {
                G = gd.N0(2131744380, null);
            } else {
                int i27 = p8Var.L1;
                G = i27 != Integer.MAX_VALUE ? gd.G(i27 / 3600, "StoryPrivacyAlertSubtitle", new Object[0]) : gd.N0(2131744323, null);
            }
            y7 y7Var6 = new y7(4, false);
            y7Var6.e = N02;
            y7Var6.f = G;
            arrayList7.add(y7Var6);
            y7Var4.o = org.telegram.messenger.g0.L(72.0f) + y7Var4.o;
        } else {
            String N03 = gd.N0(p8Var.F1 ? 2131744377 : 2131744277, null);
            y7 y7Var7 = new y7(8, false);
            y7Var7.e = N03;
            arrayList7.add(y7Var7);
            y7Var4.o = org.telegram.messenger.g0.L(50.0f) + y7Var4.o;
            TLRPC.InputPeer inputPeer = p8Var.n1;
            if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                y7 i28 = y7.i(j10.i(p8Var.a).f(), false, false);
                i28.n = true;
                arrayList7.add(i28);
                y7Var4.o = org.telegram.messenger.g0.L(62.0f) + y7Var4.o;
            } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                y7 i29 = y7.i(mp.u1(p8Var.a).c2(Long.valueOf(p8Var.n1.user_id)), false, false);
                i29.n = true;
                arrayList7.add(i29);
                y7Var4.o = org.telegram.messenger.g0.L(62.0f) + y7Var4.o;
            } else {
                if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                    TLRPC.Chat O03 = mp.u1(p8Var.a).O0(Long.valueOf(p8Var.n1.channel_id));
                    y7 y7Var8 = new y7(3, true);
                    y7Var8.h = O03;
                    y7Var8.k = false;
                    y7Var8.n = true;
                    arrayList7.add(y7Var8);
                    z14 = org.telegram.messenger.v3.V(O03);
                    y7Var4.o = org.telegram.messenger.g0.L(104.0f) + y7Var4.o;
                    z13 = false;
                } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                    TLRPC.Chat O04 = mp.u1(p8Var.a).O0(Long.valueOf(p8Var.n1.chat_id));
                    y7 y7Var9 = new y7(3, true);
                    y7Var9.h = O04;
                    y7Var9.k = false;
                    y7Var9.n = true;
                    arrayList7.add(y7Var9);
                    y7Var4.o = org.telegram.messenger.g0.L(104.0f) + y7Var4.o;
                    z14 = false;
                    z13 = false;
                }
                y7 g10 = y7.g(null);
                g10.c = !z13 ? 1 : 2;
                arrayList7.add(g10);
                y7Var4.o = org.telegram.messenger.g0.L(12.0f) + y7Var4.o;
                if (z13) {
                    String N04 = gd.N0(p8Var.F1 ? 2131744376 : 2131744272, null);
                    y7 y7Var10 = new y7(8, false);
                    y7Var10.e = N04;
                    arrayList7.add(y7Var10);
                    y7Var4.o = org.telegram.messenger.g0.L(40.0f) + y7Var4.o;
                }
                if (z13 || p8Var.G1) {
                    f12 = 80.0f;
                } else {
                    f12 = 80.0f;
                    y7 h = y7.h(4, p8Var.q1, p8Var.I1 == 4);
                    arrayList7.add(h);
                    y7Var4.o = org.telegram.messenger.g0.L(56.0f) + y7Var4.o;
                    if (p8Var.q1 == 1) {
                        if (arrayList4.size() != 1) {
                            Iterator it2 = p8Var.p1.values().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList14 = (ArrayList) it2.next();
                                if (arrayList14.size() >= 1) {
                                    h.g = mp.u1(p8Var.a).c2((Long) arrayList14.get(0));
                                    break;
                                }
                            }
                        } else {
                            h.g = mp.u1(p8Var.a).c2((Long) arrayList4.get(0));
                        }
                    }
                    y7 h7 = y7.h(2, arrayList5.size(), p8Var.I1 == 2);
                    arrayList7.add(h7);
                    y7Var4.o = org.telegram.messenger.g0.L(56.0f) + y7Var4.o;
                    if (arrayList5.size() == 1) {
                        h7.g = mp.u1(p8Var.a).c2((Long) arrayList5.get(0));
                    }
                    ArrayList K0 = p8.K0(p8Var);
                    y7 h10 = y7.h(1, K0.size(), p8Var.I1 == 1);
                    arrayList7.add(h10);
                    y7Var4.o = org.telegram.messenger.g0.L(56.0f) + y7Var4.o;
                    if (K0.size() == 1 && (K0.get(0) instanceof TLRPC.User)) {
                        h10.g = (TLRPC.User) K0.get(0);
                    }
                    y7 h11 = y7.h(3, p8Var.u1, p8Var.I1 == 3);
                    arrayList7.add(h11);
                    y7Var4.o = org.telegram.messenger.g0.L(56.0f) + y7Var4.o;
                    if (p8Var.u1 == 1) {
                        if (arrayList3.size() != 1) {
                            Iterator it3 = p8Var.t1.values().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                ArrayList arrayList15 = (ArrayList) it3.next();
                                if (arrayList15.size() >= 1) {
                                    h11.g = mp.u1(p8Var.a).c2((Long) arrayList15.get(0));
                                    break;
                                }
                            }
                        } else {
                            h11.g = mp.u1(p8Var.a).c2((Long) arrayList3.get(0));
                        }
                    }
                    int i30 = mp.u1(p8Var.a).R1().N;
                    arrayList7.add(y7.g(org.telegram.messenger.g0.R2(i30 <= 0 ? gd.N0(p8Var.F1 ? 2131744387 : 2131744475, null) : gd.G(i30, p8Var.F1 ? "StoryLiveBlockList" : "StoryBlockList", new Object[0]), org.telegram.ui.ActionBar.m6.Xc, 0, new a8(this, 3), p8Var.J0)));
                    y7Var4.o = org.telegram.messenger.g0.L(80.0f) + y7Var4.o;
                }
                if (!p8Var.U1) {
                    if (p8Var.F1 && !p8Var.G1) {
                        if (p8Var.B1) {
                            arrayList7.add(y7.b(gd.N0(2131748604, null), "", 5));
                            y7Var4.o = org.telegram.messenger.g0.L(50.0f) + y7Var4.o;
                            arrayList7.add(y7.b(gd.N0(2131748610, null), "", 6));
                            y7Var4.o = org.telegram.messenger.g0.L(50.0f) + y7Var4.o;
                            arrayList7.add(y7.g(null));
                            y7Var4.o = org.telegram.messenger.g0.L(12.0f) + y7Var4.o;
                        } else {
                            arrayList7.add(y7.b(gd.N0(2131748609, null), "", 5));
                            y7Var4.o = org.telegram.messenger.g0.L(50.0f) + y7Var4.o;
                            arrayList7.add(y7.g(gd.N0(2131748608, null)));
                            y7Var4.o = org.telegram.messenger.g0.L(30.0f) + y7Var4.o;
                        }
                    }
                    if (p8Var.F1) {
                        String N05 = gd.N0(2131744389, null);
                        boolean z20 = p8Var.w1;
                        y7 y7Var11 = new y7(7, false);
                        y7Var11.c = 2;
                        y7Var11.e = N05;
                        y7Var11.k = z20;
                        arrayList7.add(y7Var11);
                        y7Var4.o = org.telegram.messenger.g0.L(50.0f) + y7Var4.o;
                    }
                    if (!p8Var.G1) {
                        String N06 = gd.N0(2131744488, null);
                        boolean z21 = p8Var.x1;
                        y7 y7Var12 = new y7(7, false);
                        y7Var12.c = 0;
                        y7Var12.e = N06;
                        y7Var12.k = z21;
                        arrayList7.add(y7Var12);
                        y7Var4.o = org.telegram.messenger.g0.L(50.0f) + y7Var4.o;
                    }
                    if (!p8Var.F1 && !p8Var.G1) {
                        String N07 = gd.N0(z13 ? 2131744417 : z14 ? 2131744416 : 2131744411, null);
                        boolean z22 = p8Var.y1;
                        y7 y7Var13 = new y7(7, false);
                        y7Var13.c = 1;
                        y7Var13.e = N07;
                        y7Var13.k = z22;
                        arrayList7.add(y7Var13);
                        y7Var4.o = org.telegram.messenger.g0.L(50.0f) + y7Var4.o;
                    }
                }
                z15 = p8Var.F1;
                String str = "StoryKeepGroupInfo";
                if (!z15 || p8Var.G1) {
                    arrayList7.add(y7.g(null));
                    y7Var4.o = org.telegram.messenger.g0.L(12.0f) + y7Var4.o;
                } else if (!p8Var.U1 && p8Var.z1 && p8Var.X1 != null) {
                    if (z15) {
                        G3 = gd.N0(z13 ? 2131744382 : z14 ? 2131744384 : 2131744383, null);
                    } else {
                        String str2 = z13 ? "StoryKeepInfo" : z14 ? "StoryKeepChannelInfo" : "StoryKeepGroupInfo";
                        int i31 = p8Var.L1;
                        if (i31 == Integer.MAX_VALUE) {
                            i31 = 86400;
                        }
                        G3 = gd.G(i31 / 3600, str2, new Object[0]);
                    }
                    arrayList7.add(y7.g(G3));
                    y7Var4.o = org.telegram.messenger.g0.L(f12) + y7Var4.o;
                }
                if (p8Var.y1 || p8Var.F1 || p8Var.G1) {
                    z16 = z14;
                } else {
                    TLRPC.InputPeer inputPeer2 = p8Var.n1;
                    long n10 = inputPeer2 != null ? org.telegram.messenger.n5.n(inputPeer2) : j10.i(p8Var.a).e();
                    mp.u1(p8Var.a).R1().B(n10, true);
                    StringBuilder sb2 = new StringBuilder();
                    if (hashSet.isEmpty()) {
                        sb2.append(gd.N0(2131744545, null));
                    } else if (hashSet.size() < 3) {
                        Iterator it4 = hashSet.iterator();
                        while (it4.hasNext()) {
                            Iterator it5 = it4;
                            boolean z23 = z14;
                            fi.i6 b10 = mp.u1(p8Var.a).R1().B(n10, true).b(((Integer) it4.next()).intValue());
                            if (b10 != null) {
                                if (sb2.length() != 0) {
                                    sb2.append(", ");
                                }
                                sb2.append(b10.b);
                            }
                            it4 = it5;
                            z14 = z23;
                        }
                    } else {
                        z16 = z14;
                        sb2.append(gd.G(hashSet.size(), "StoriesAlbumCount", new Object[0]));
                        arrayList7.add(y7.b(gd.N0(2131744567, null), sb2, 1));
                        y7Var4.o = org.telegram.messenger.g0.L(50.0f) + y7Var4.o;
                    }
                    z16 = z14;
                    arrayList7.add(y7.b(gd.N0(2131744567, null), sb2, 1));
                    y7Var4.o = org.telegram.messenger.g0.L(50.0f) + y7Var4.o;
                }
                if (!p8Var.U1 && ((!p8Var.z1 || p8Var.X1 == null) && !(z17 = p8Var.F1) && !p8Var.G1)) {
                    if (z17) {
                        if (z13) {
                            str = "StoryKeepInfo";
                        } else if (z16) {
                            str = "StoryKeepChannelInfo";
                        }
                        int i32 = p8Var.L1;
                        G2 = gd.G((i32 == Integer.MAX_VALUE ? 86400 : i32) / 3600, str, new Object[0]);
                    } else {
                        G2 = gd.N0(z13 ? 2131744382 : z16 ? 2131744384 : 2131744383, null);
                    }
                    arrayList7.add(y7.g(G2));
                    y7Var4.o = org.telegram.messenger.g0.L(f12) + y7Var4.o;
                }
                if (p8Var.y1 && p8Var.z1 && p8Var.X1 != null) {
                    String N08 = gd.N0(2131744435, null);
                    BitmapDrawable bitmapDrawable = p8Var.W1;
                    y7 y7Var14 = new y7(9, false);
                    y7Var14.e = N08;
                    y7Var14.d = bitmapDrawable;
                    y7Var14.q = 0;
                    arrayList7.add(y7Var14);
                    y7Var4.o = org.telegram.messenger.g0.L(50.0f) + y7Var4.o;
                    arrayList7.add(y7.g(gd.N0(2131744434, null)));
                    y7Var4.o = org.telegram.messenger.g0.L(72.0f) + y7Var4.o;
                }
                if (p8Var.G1) {
                    arrayList7.add(y7.b(gd.N0(2131748604, null), "", 5));
                    y7Var4.o = org.telegram.messenger.g0.L(50.0f) + y7Var4.o;
                    arrayList7.add(y7.g(null));
                    y7Var4.o = org.telegram.messenger.g0.L(52.0f) + y7Var4.o;
                }
                if (p8Var.F1 && p8Var.w1) {
                    String N09 = gd.N0(2131748613, null);
                    y7 y7Var15 = new y7(8, false);
                    y7Var15.e = N09;
                    arrayList7.add(y7Var15);
                    y7Var4.o = org.telegram.messenger.g0.L(40.0f) + y7Var4.o;
                    y7 y7Var16 = new y7(10, false);
                    y7Var16.q = 8;
                    arrayList7.add(y7Var16);
                    y7Var4.o = org.telegram.messenger.g0.L(75.0f) + y7Var4.o;
                    arrayList7.add(y7.g(gd.N0(2131748611, null)));
                    y7Var4.o = org.telegram.messenger.g0.L(50.0f) + y7Var4.o;
                }
            }
            z14 = false;
            z13 = true;
            y7 g102 = y7.g(null);
            g102.c = !z13 ? 1 : 2;
            arrayList7.add(g102);
            y7Var4.o = org.telegram.messenger.g0.L(12.0f) + y7Var4.o;
            if (z13) {
            }
            if (z13) {
            }
            f12 = 80.0f;
            if (!p8Var.U1) {
            }
            z15 = p8Var.F1;
            String str3 = "StoryKeepGroupInfo";
            if (z15) {
            }
            arrayList7.add(y7.g(null));
            y7Var4.o = org.telegram.messenger.g0.L(12.0f) + y7Var4.o;
            if (p8Var.y1) {
            }
            z16 = z14;
            if (!p8Var.U1) {
                if (z17) {
                }
                arrayList7.add(y7.g(G2));
                y7Var4.o = org.telegram.messenger.g0.L(f12) + y7Var4.o;
            }
            if (p8Var.y1) {
                String N082 = gd.N0(2131744435, null);
                BitmapDrawable bitmapDrawable2 = p8Var.W1;
                y7 y7Var142 = new y7(9, false);
                y7Var142.e = N082;
                y7Var142.d = bitmapDrawable2;
                y7Var142.q = 0;
                arrayList7.add(y7Var142);
                y7Var4.o = org.telegram.messenger.g0.L(50.0f) + y7Var4.o;
                arrayList7.add(y7.g(gd.N0(2131744434, null)));
                y7Var4.o = org.telegram.messenger.g0.L(72.0f) + y7Var4.o;
            }
            if (p8Var.G1) {
            }
            if (p8Var.F1) {
                String N092 = gd.N0(2131748613, null);
                y7 y7Var152 = new y7(8, false);
                y7Var152.e = N092;
                arrayList7.add(y7Var152);
                y7Var4.o = org.telegram.messenger.g0.L(40.0f) + y7Var4.o;
                y7 y7Var162 = new y7(10, false);
                y7Var162.q = 8;
                arrayList7.add(y7Var162);
                y7Var4.o = org.telegram.messenger.g0.L(75.0f) + y7Var4.o;
                arrayList7.add(y7.g(gd.N0(2131748611, null)));
                y7Var4.o = org.telegram.messenger.g0.L(50.0f) + y7Var4.o;
            }
        }
        z14 = false;
        z13 = true;
        if (z13) {
        }
        f12 = 80.0f;
        if (!p8Var.U1) {
        }
        z15 = p8Var.F1;
        String str32 = "StoryKeepGroupInfo";
        if (z15) {
        }
        arrayList7.add(y7.g(null));
        y7Var4.o = org.telegram.messenger.g0.L(12.0f) + y7Var4.o;
        if (p8Var.y1) {
        }
        z16 = z14;
        if (!p8Var.U1) {
        }
        if (p8Var.y1) {
        }
        if (p8Var.G1) {
        }
        if (p8Var.F1) {
        }
        L = 0.0f;
        boolean isEmpty22 = TextUtils.isEmpty(this.J);
        if (this.a != 0) {
        }
        if (this.h.t) {
        }
        g8Var = this.n;
        if (g8Var != null) {
        }
        this.e.invalidate();
    }

    public final void i(boolean z10) {
        org.telegram.ui.Cells.y3 y3Var = this.E;
        if (y3Var == null) {
            return;
        }
        if (p8.S0(this.c, this.d).size() > 0) {
            y3Var.a(gd.N0(2131743387, null), new z7(this, 2));
            return;
        }
        if (z10) {
            y3Var.setRightText(null);
            return;
        }
        org.telegram.ui.Cells.x3 x3Var = y3Var.b;
        x3Var.c(null, false, true);
        x3Var.setOnClickListener(null);
        x3Var.setVisibility(0);
    }

    public final void j(boolean z10) {
        d8 d8Var;
        ArrayList arrayList;
        Property property;
        Property property2;
        Property property3;
        HashSet S0 = p8.S0(this.c, this.d);
        int i7 = this.a;
        p8 p8Var = this.a0;
        if (i7 == 3) {
            p8Var.u1 = S0.size();
        } else if (i7 == 4) {
            p8Var.q1 = S0.size();
        }
        mp u12 = mp.u1(p8Var.a);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            d8Var = this.y;
            ArrayList arrayList4 = d8Var.e;
            arrayList = d8Var.e;
            if (i11 >= arrayList4.size()) {
                break;
            }
            p20 p20Var = (p20) arrayList.get(i11);
            if (!S0.contains(Long.valueOf(p20Var.getUid()))) {
                arrayList2.add(p20Var);
            }
            i11++;
        }
        Iterator it = S0.iterator();
        while (it.hasNext()) {
            Long l10 = (Long) it.next();
            long longValue = l10.longValue();
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList.size()) {
                    Object c22 = longValue >= 0 ? u12.c2(l10) : u12.O0(l10);
                    if (c22 != null) {
                        p20 p20Var2 = new p20(getContext(), c22, null, true, p8Var.J0);
                        p20Var2.setOnClickListener(this);
                        arrayList3.add(p20Var2);
                    }
                } else if (((p20) arrayList.get(i12)).getUid() == longValue) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        if (arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return;
        }
        ah.n nVar = d8Var.d;
        ArrayList arrayList5 = nVar.e;
        ArrayList arrayList6 = nVar.d;
        ArrayList arrayList7 = nVar.f;
        m8 m8Var = (m8) nVar.n;
        m8Var.I = true;
        ArrayList arrayList8 = m8Var.e;
        arrayList8.removeAll(arrayList2);
        arrayList8.addAll(arrayList3);
        ArrayList arrayList9 = nVar.h;
        arrayList9.clear();
        arrayList9.addAll(arrayList2);
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            ((p20) arrayList2.get(i13)).setOnClickListener(null);
        }
        nVar.c();
        if (z10) {
            nVar.c = false;
            AnimatorSet animatorSet = new AnimatorSet();
            nVar.b = animatorSet;
            animatorSet.addListener(new l8(nVar, arrayList2, i10));
            arrayList7.clear();
            arrayList6.clear();
            arrayList5.clear();
            int i14 = 0;
            while (true) {
                int size = arrayList2.size();
                property = View.ALPHA;
                property2 = View.SCALE_Y;
                property3 = View.SCALE_X;
                if (i14 >= size) {
                    break;
                }
                p20 p20Var3 = (p20) arrayList2.get(i14);
                arrayList5.add(p20Var3);
                arrayList7.add(ObjectAnimator.ofFloat(p20Var3, (Property<p20, Float>) property3, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(p20Var3, (Property<p20, Float>) property2, 1.0f, 0.01f));
                arrayList7.add(ObjectAnimator.ofFloat(p20Var3, (Property<p20, Float>) property, 1.0f, 0.0f));
                i14++;
            }
            for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                p20 p20Var4 = (p20) arrayList3.get(i15);
                arrayList6.add(p20Var4);
                arrayList7.add(ObjectAnimator.ofFloat(p20Var4, (Property<p20, Float>) property3, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(p20Var4, (Property<p20, Float>) property2, 0.01f, 1.0f));
                arrayList7.add(ObjectAnimator.ofFloat(p20Var4, (Property<p20, Float>) property, 0.0f, 1.0f));
            }
        } else {
            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                nVar.removeView((View) arrayList2.get(i16));
            }
            arrayList9.clear();
            nVar.b = null;
            nVar.c = false;
            m8Var.b.setAllowDrawCursor(true);
        }
        while (i10 < arrayList3.size()) {
            nVar.addView((View) arrayList3.get(i10));
            i10++;
        }
        nVar.requestLayout();
    }

    public final void k() {
        float c10 = c();
        boolean z10 = this.N;
        boolean z11 = false;
        d8 d8Var = this.y;
        if (z10 || this.V || getTranslationX() != 0.0f) {
            this.O = false;
            ValueAnimator valueAnimator = this.Q;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.Q = null;
            }
            d8Var.setTranslationY(c10);
        } else if (!this.O || Math.abs(this.P - c10) > 1.0f) {
            this.O = true;
            ValueAnimator valueAnimator2 = this.Q;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.Q = null;
            }
            float translationY = d8Var.getTranslationY();
            this.P = c10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, c10);
            this.Q = ofFloat;
            ofFloat.addUpdateListener(new j3(this, 6));
            this.Q.addListener(new ai.k0(this, 26));
            this.Q.setInterpolator(new LinearInterpolator());
            this.Q.setDuration(180L);
            this.Q.start();
        }
        boolean z12 = this.G;
        x7 x7Var = this.F;
        if (!z12) {
            x7Var.setVisibility(8);
            return;
        }
        x7Var.setVisibility(0);
        float f10 = -x7Var.getHeight();
        int i7 = 0;
        while (true) {
            ek0 ek0Var = this.f;
            if (i7 >= ek0Var.getChildCount()) {
                z11 = true;
                break;
            }
            View childAt = ek0Var.getChildAt(i7);
            if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                f10 = this.e.getPaddingTop() + childAt.getY();
                break;
            }
            i7++;
        }
        if (this.R != z11) {
            this.R = z11;
            ((org.telegram.ui.ActionBar.x1) x7Var.e).c(true, (z11 || this.a != 0) ? 0.0f : 1.0f);
        }
        x7Var.setTranslationY(Math.max(org.telegram.messenger.g0.m, f10));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = p8.Y1;
        ks.f(this.a0.a).c(this, ks.T);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d8 d8Var = this.y;
        if (!d8Var.e.contains(view)) {
            return;
        }
        p20 p20Var = (p20) view;
        if (!p20Var.E) {
            p20 p20Var2 = d8Var.f;
            if (p20Var2 != null) {
                p20Var2.a();
                d8Var.f = null;
            }
            d8Var.f = p20Var;
            p20Var.b();
            return;
        }
        d8Var.f = null;
        ah.n nVar = d8Var.d;
        m8 m8Var = (m8) nVar.n;
        m8Var.I = true;
        m8Var.e.remove(p20Var);
        p20Var.setOnClickListener(null);
        nVar.c();
        nVar.c = false;
        AnimatorSet animatorSet = new AnimatorSet();
        nVar.b = animatorSet;
        animatorSet.addListener(new ah.l(7, nVar, p20Var));
        ArrayList arrayList = nVar.h;
        arrayList.clear();
        arrayList.add(p20Var);
        ArrayList arrayList2 = nVar.d;
        arrayList2.clear();
        nVar.e.clear();
        arrayList2.add(p20Var);
        ArrayList arrayList3 = nVar.f;
        arrayList3.clear();
        arrayList3.add(ObjectAnimator.ofFloat(p20Var, (Property<p20, Float>) View.SCALE_X, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(p20Var, (Property<p20, Float>) View.SCALE_Y, 1.0f, 0.01f));
        arrayList3.add(ObjectAnimator.ofFloat(p20Var, (Property<p20, Float>) View.ALPHA, 1.0f, 0.0f));
        nVar.requestLayout();
        long uid = p20Var.getUid();
        Iterator it = this.d.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            ArrayList arrayList4 = this.c;
            if (!hasNext) {
                arrayList4.remove(Long.valueOf(uid));
                g(true);
                f(true);
                return;
            } else {
                Map.Entry entry = (Map.Entry) it.next();
                if (((ArrayList) entry.getValue()).contains(Long.valueOf(uid))) {
                    it.remove();
                    arrayList4.addAll((Collection) entry.getValue());
                    arrayList4.remove(Long.valueOf(uid));
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = p8.Y1;
        ks.f(this.a0.a).n(this, ks.T);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11 = p8.Y1;
        p8 p8Var = this.a0;
        int i12 = p8Var.f;
        if (i12 > 0) {
            this.U = i12;
        }
        super.onMeasure(i7, i10);
        this.e.setPadding(0, org.telegram.messenger.g0.m + (this.a == 0 ? 0 : org.telegram.messenger.g0.L(56.0f)), 0, 0);
        boolean z10 = this.W;
        boolean z11 = p8Var.d;
        ek0 ek0Var = this.f;
        i8 i8Var = this.r;
        if (z10 != z11) {
            float c10 = c();
            int i13 = 2;
            if (p8Var.d && c10 + Math.min(org.telegram.messenger.g0.L(150.0f), this.y.L) > ek0Var.getPaddingTop()) {
                pi.l lVar = new pi.l(getContext(), 2, 0.7f);
                lVar.a = 1;
                lVar.p = -org.telegram.messenger.g0.L(56.0f);
                this.h.w0(lVar);
            }
            int i14 = this.a;
            View view = this.s;
            if (i14 == 0) {
                i8Var.setTranslationY(p8Var.d ? this.U : 0.0f);
                view.setTranslationY(p8Var.d ? this.U : 0.0f);
            } else {
                float f10 = p8Var.d ? this.U : -this.U;
                ValueAnimator valueAnimator = i8Var.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    i8Var.d = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                i8Var.d = ofFloat;
                ofFloat.addUpdateListener(new h8(i8Var, 1));
                i8Var.d.addListener(new ai.k0(i8Var, 27));
                i8Var.d.setDuration(250L);
                ValueAnimator valueAnimator2 = i8Var.d;
                nr nrVar = org.telegram.ui.ActionBar.i1.w;
                valueAnimator2.setInterpolator(nrVar);
                i8Var.d.start();
                view.setTranslationY(p8Var.d ? this.U : -this.U);
                this.V = true;
                view.animate().translationY(0.0f).setDuration(250L).setInterpolator(nrVar).withEndAction(new a8(this, i13)).start();
            }
            this.W = p8Var.d;
        }
        ek0Var.setPadding(0, 0, 0, i8Var.getMeasuredHeight());
    }
}
