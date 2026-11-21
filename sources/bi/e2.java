package bi;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import c8.ma;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.o10;
import org.telegram.messenger.ri;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.sa;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class e2 extends sa implements fs {
    public static e2 t2;
    public final boolean T1;
    public final org.telegram.messenger.t1 U1;
    public final a2 V1;
    public final c2 W1;
    public oq X1;
    public oq Y1;
    public oq Z1;
    public final LinkedHashMap a2;
    public final hi.e b2;
    public final ArrayList c2;
    public final HashMap d2;
    public final ArrayList e2;
    public final ArrayList f2;
    public final ArrayList g2;
    public final ArrayList h2;
    public final ArrayList i2;
    public c51 j2;
    public final boolean k2;
    public String l2;
    public int m2;
    public boolean n2;
    public int o2;
    public int p2;
    public final org.telegram.ui.ActionBar.z4 q2;
    public final si.f r2;
    public final n1 s2;

    public e2(Context context, int i7, boolean z10, org.telegram.messenger.t1 t1Var, a2 a2Var, c2 c2Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null, true, false, h6Var);
        boolean z11;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a2 = linkedHashMap;
        ArrayList arrayList = new ArrayList();
        this.c2 = arrayList;
        HashMap hashMap = new HashMap();
        this.d2 = hashMap;
        ArrayList arrayList2 = new ArrayList();
        this.e2 = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f2 = arrayList3;
        this.g2 = new ArrayList();
        this.h2 = new ArrayList();
        this.i2 = new ArrayList();
        this.m2 = -1;
        this.s2 = new n1(this, 0);
        this.a = i7;
        this.T1 = z10;
        this.U1 = a2Var != null ? null : t1Var;
        this.V1 = a2Var;
        this.W1 = c2Var;
        this.v1 = 0.35f;
        int i10 = org.telegram.ui.ActionBar.m6.a7;
        w0(i10);
        Q(i10);
        org.telegram.messenger.g0.E2(this.p1);
        this.w1 = false;
        ri.a aVar = new ri.a(this.Y0, new a1.c(this, 15));
        ek0 ek0Var = this.o1;
        int i11 = this.u0;
        ek0Var.setPadding(i11, 0, i11, 0);
        this.o1.r1();
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(nr.h);
        kVar.n(350L);
        this.o1.setItemAnimator(kVar);
        int i12 = 0;
        this.o1.setOnScrollListener(new u1(this, i12));
        this.o1.addOnLayoutChangeListener(new s1(this, i12));
        this.o1.setOnItemClickListener(new t1(this, c2Var, a2Var, i12));
        org.telegram.ui.ActionBar.z4 z4Var = new org.telegram.ui.ActionBar.z4(context, h6Var);
        this.q2 = z4Var;
        z4Var.setBackButtonImage(R.drawable.ic_ab_back);
        z4Var.setTitle(P0());
        if (a2Var != null) {
            z4Var.setSubtitle(null);
        }
        z4Var.setActionBarMenuOnItemClick(new v1(this, 0));
        org.telegram.ui.ActionBar.g5 b10 = z4Var.t().b(2, R.drawable.outline_header_search);
        b10.setContentDescription(gd.N0(2131745640, null));
        b10.O();
        b10.C0 = new w1(this, 0);
        z4Var.setSearchFieldHint(gd.N0(2131745640, null));
        aVar.f((FrameLayout) this.b, this.o1, z4Var, h6Var);
        int i13 = this.u0;
        org.telegram.messenger.g0.z3(z4Var, i13, 0, i13, 0);
        si.f a10 = aVar.a(z4Var);
        this.r2 = a10;
        z4Var.setBackground(a10);
        this.Y0.i(this.b);
        int i14 = 1;
        if (a2Var != null) {
            int L = org.telegram.messenger.g0.L(72.0f);
            ek0 ek0Var2 = this.o1;
            int i15 = this.u0;
            ek0Var2.setPadding(i15, 0, i15, L);
            this.o1.setClipToPadding(false);
            lh.f fVar = new lh.f(context);
            fVar.setupColorKey(i10);
            fVar.setFadeZoneBottom(L);
            fVar.setFadeHeightBottom(org.telegram.messenger.g0.L(24.0f));
            ViewGroup viewGroup = this.b;
            int i16 = this.u0;
            viewGroup.addView(fVar, ma.f(72.0f, -1, 80, i16, 0, i16, 0));
            hi.e g10 = n10.g(24, context, h6Var, true);
            this.b2 = g10;
            g10.setShowZero(false);
            g10.i(a2Var.b, false, true);
            g10.setOnClickListener(new ah.d(this, 5));
            this.b.addView(g10, ma.f(48.0f, -1, 80, org.telegram.messenger.g0.L(12.0f) + this.u0, 0, org.telegram.messenger.g0.L(12.0f) + this.u0, org.telegram.messenger.g0.L(12.0f)));
            g10.c(linkedHashMap.size(), false);
            g10.setEnabled(!linkedHashMap.isEmpty());
        }
        arrayList.addAll(org.telegram.messenger.i5.r(i7).f0);
        hashMap.putAll(org.telegram.messenger.i5.r(i7).h0);
        arrayList2.addAll(org.telegram.messenger.i5.r(i7).i0);
        arrayList3.addAll(ri.d0(i7).j1);
        if (!z10 && a2Var == null && c2Var == null) {
            wg.s.j(i7, null, new p1(this, i14));
            z11 = false;
            di.y8.y(i7, false).T();
        } else {
            z11 = false;
        }
        this.k2 = true;
        this.j2.O(z11);
    }

    public static void e1(e2 e2Var, String str) {
        n1 n1Var = e2Var.s2;
        if (TextUtils.equals(e2Var.l2, str)) {
            return;
        }
        e2Var.l2 = str;
        org.telegram.messenger.g0.r(n1Var);
        if (e2Var.m2 > 0) {
            ConnectionsManager.getInstance(e2Var.a).cancelRequest(e2Var.m2, true);
        }
        e2Var.m2 = -1;
        e2Var.g2.clear();
        e2Var.h2.clear();
        if (!TextUtils.isEmpty(e2Var.l2)) {
            e2Var.m2 = 0;
            org.telegram.messenger.g0.h3(n1Var, 350L);
        }
        e2Var.j2.O(true);
    }

    public static boolean j1(Intent intent) {
        String path;
        Uri data = intent.getData();
        if (data != null && data.getScheme() != null) {
            String scheme = data.getScheme();
            if (scheme.equals("http") || scheme.equals("https")) {
                String lowerCase = data.getHost() == null ? "" : data.getHost().toLowerCase();
                if ((lowerCase.equals("telegram.me") || lowerCase.equals("t.me") || lowerCase.equals("telegram.dog")) && (path = data.getPath()) != null && path.startsWith("/premium_multigift")) {
                    l1(false, null);
                    return true;
                }
            } else if (scheme.equals("tg")) {
                String uri = data.toString();
                if (uri.startsWith("tg:premium_multigift") || uri.startsWith("tg://premium_multigift")) {
                    l1(false, null);
                    return true;
                }
            }
        }
        return false;
    }

    public static e2 k1(org.telegram.ui.ActionBar.g2 g2Var, boolean z10, org.telegram.messenger.t1 t1Var, a2 a2Var) {
        if (g2Var == null || g2Var.getContext() == null) {
            return null;
        }
        e2 e2Var = t2;
        if (e2Var != null) {
            return e2Var;
        }
        e2 e2Var2 = new e2(g2Var.getContext(), g2Var.getCurrentAccount(), z10, t1Var, a2Var, null, g2Var.getResourceProvider());
        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(g2Var)) {
            e2Var2.a0(g2Var);
        }
        g2Var.showDialog(e2Var2);
        t2 = e2Var2;
        return e2Var2;
    }

    public static e2 l1(boolean z10, org.telegram.messenger.t1 t1Var) {
        return k1(LaunchActivity.Q(), z10, t1Var, null);
    }

    public static void m1(org.telegram.messenger.t1 t1Var) {
        l1(true, t1Var);
    }

    public static int o1(CharSequence charSequence, ArrayList arrayList) {
        int i7;
        if (arrayList.size() > 1) {
            arrayList.add(o41.C(null));
            i7 = org.telegram.messenger.g0.L(12.0f);
        } else {
            i7 = 0;
        }
        if (charSequence == null) {
            return i7;
        }
        arrayList.add(o41.u(charSequence));
        return org.telegram.messenger.g0.L(40.0f) + i7;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void L() {
        super.L();
        t2 = null;
        org.telegram.messenger.g0.r(this.s2);
        if (this.m2 > 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.m2, true);
        }
        this.m2 = -1;
    }

    @Override // org.telegram.ui.Components.sa
    public final dk0 M0(ek0 ek0Var) {
        c51 c51Var = new c51(ek0Var, getContext(), this.a, 0, false, new b(this, 5), this.J0);
        this.j2 = c51Var;
        c51Var.r = false;
        return c51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        a2 a2Var = this.V1;
        if (a2Var != null) {
            return a2Var.a;
        }
        c2 c2Var = this.W1;
        if (c2Var != null) {
            return (String) c2Var.d;
        }
        return gd.N0(this.T1 ? 2131749431 : 2131749425, null);
    }

    @Override // org.telegram.ui.Components.sa
    public final void T0(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        if (size != this.o2) {
            this.o2 = size;
            this.p2 = 0;
        }
        int max = Math.max(this.p2, this.r1);
        this.p2 = max;
        this.r1 = max;
    }

    @Override // org.telegram.ui.Components.sa
    public final void X0(Canvas canvas, View view) {
        p1();
        super.X0(canvas, view);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void c0(Configuration configuration) {
        this.j2.O(false);
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.U2) {
            dismiss();
            return;
        }
        if (i7 == ks.O) {
            ArrayList arrayList = this.c2;
            if (arrayList.isEmpty()) {
                org.telegram.messenger.i5 r10 = org.telegram.messenger.i5.r(this.a);
                arrayList.addAll(r10.f0);
                this.d2.putAll(r10.h0);
                this.e2.addAll(r10.i0);
                this.j2.O(true);
                return;
            }
            return;
        }
        if (i7 != ks.S0) {
            if (i7 == ks.E0) {
                this.j2.O(true);
            }
        } else {
            ArrayList arrayList2 = this.f2;
            if (arrayList2.isEmpty()) {
                arrayList2.addAll(ri.d0(this.a).j1);
                this.j2.O(true);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        org.telegram.messenger.g0.v1(this.q2);
        super.dismiss();
    }

    public final void f1(ArrayList arrayList, HashSet hashSet) {
        mp u12 = mp.u1(this.a);
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            long o4 = org.telegram.messenger.n5.o((TLRPC.Peer) obj);
            if (o4 != 0 && hashSet.add(Long.valueOf(o4))) {
                if (o4 < 0) {
                    TLRPC.Chat O0 = u12.O0(Long.valueOf(-o4));
                    if (this.W1 != null && O0 != null && org.telegram.messenger.v3.V(O0)) {
                        this.h2.add(O0);
                    }
                } else {
                    TLRPC.User c22 = u12.c2(Long.valueOf(o4));
                    if (c22 != null) {
                        this.g2.add(c22);
                    }
                }
            }
        }
    }

    public final int g1(ArrayList arrayList, int i7, String str, List list, String str2) {
        a2 a2Var;
        Iterator it = list.iterator();
        boolean z10 = true;
        int i10 = 0;
        while (it.hasNext()) {
            TLRPC.User user = (TLRPC.User) it.next();
            if (user != null && !user.bot && !o10.B(user.id) && ((a2Var = this.V1) == null || (!user.self && !o10.y(user)))) {
                if (z10) {
                    i10 += o1(str, arrayList);
                    z10 = false;
                }
                if (a2Var != null) {
                    boolean containsKey = this.a2.containsKey(Long.valueOf(user.id));
                    int i11 = z1.b;
                    o41 K = o41.K(z1.class);
                    K.d = i7;
                    K.y = user.id;
                    K.H = user;
                    K.e = containsKey;
                    arrayList.add(K);
                } else {
                    ai.x2 x2Var = (str2 == null && this.W1 == null) ? new ai.x2(2, this, user) : null;
                    int i12 = d2.b;
                    o41 K2 = o41.K(d2.class);
                    K2.d = i7;
                    K2.y = user.id;
                    K2.H = user;
                    K2.n = str2;
                    K2.E = x2Var;
                    arrayList.add(K2);
                }
                i10 += org.telegram.messenger.g0.L(56.0f);
            }
        }
        return i10;
    }

    public final oq h1(int i7, int i10) {
        Drawable mutate = getContext().getResources().getDrawable(i7).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        oq oqVar = new oq(org.telegram.ui.ActionBar.m6.L(org.telegram.messenger.g0.L(40.0f), i10), mutate);
        int L = org.telegram.messenger.g0.L(24.0f);
        int L2 = org.telegram.messenger.g0.L(24.0f);
        oqVar.e = L;
        oqVar.f = L2;
        return oqVar;
    }

    public final float i1() {
        float f10 = Float.MAX_VALUE;
        int i7 = 0;
        while (true) {
            ek0 ek0Var = this.o1;
            if (i7 >= ek0Var.getChildCount()) {
                return f10;
            }
            View childAt = ek0Var.getChildAt(i7);
            int R = RecyclerView.R(childAt);
            if (R == 1) {
                return ek0Var.getY() + childAt.getY();
            }
            if (R > 1) {
                f10 = -3.4028235E38f;
            }
            i7++;
        }
    }

    public final void n1(long j3) {
        org.telegram.messenger.g0.v1(this.q2);
        x10 x10Var = (x10) this.W1.e;
        if (x10Var != null) {
            x10Var.a(Long.valueOf(j3));
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks f10 = ks.f(this.a);
        f10.c(this, ks.U2);
        f10.c(this, ks.E0);
        f10.c(this, ks.O);
        f10.c(this, ks.S0);
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onBackPressed() {
        if (this.q2.A()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks f10 = ks.f(this.a);
        f10.n(this, ks.U2);
        f10.n(this, ks.E0);
        f10.n(this, ks.O);
        f10.n(this, ks.S0);
    }

    public final void p1() {
        float i12 = i1();
        if (i12 == Float.MAX_VALUE) {
            i12 = this.o1.getHeight();
        }
        float max = Math.max(0.0f, i12 - org.telegram.messenger.g0.m);
        this.q2.setTranslationY(max);
        this.r2.setAlpha((int) (Utilities.l(1.0f - (max / org.telegram.messenger.g0.L(24.0f))) * 255.0f));
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        super.s0();
        if (this.X1 == null && this.Y1 == null && this.Z1 == null) {
            return;
        }
        this.Z1 = null;
        this.Y1 = null;
        this.X1 = null;
        this.j2.O(false);
    }
}
