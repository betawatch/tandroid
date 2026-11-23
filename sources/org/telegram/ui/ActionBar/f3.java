package org.telegram.ui.ActionBar;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.rj;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class f3 extends FrameLayout {
    public static final HashMap L = new HashMap();
    public static final HashMap M = new HashMap();
    public static TextPaint N;
    public boolean E;
    public final RectF F;
    public ValueAnimator G;
    public float H;
    public int I;
    public final HashSet J;
    public final HashSet K;
    public final Paint a;
    public boolean b;
    public boolean c;
    public final ActionBarLayout d;
    public final d3 e;
    public int f;
    public final org.telegram.ui.Components.g5 h;
    public int n;
    public final org.telegram.ui.Components.g5 r;
    public boolean s;
    public final org.telegram.ui.Components.d6 w;
    public int x;
    public boolean y;

    public f3(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.a = new Paint(1);
        this.b = true;
        this.c = false;
        nr nrVar = nr.h;
        this.h = new org.telegram.ui.Components.g5(this, 200L, nrVar, 0);
        this.r = new org.telegram.ui.Components.g5(this, 200L, nrVar, 0);
        this.w = new org.telegram.ui.Components.d6(this, 0L, 200L, nrVar);
        this.x = k10.t0;
        this.F = new RectF();
        this.J = new HashSet();
        this.K = new HashSet();
        this.d = actionBarLayout;
        setNavigationBarColor(m6.x0(null, m6.a7, false));
        d3 d3Var = new d3(this, this);
        this.e = d3Var;
        r0.i0.j(this, d3Var);
        n();
        o(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TextPaint getTextPaint() {
        if (N == null) {
            TextPaint textPaint = new TextPaint(1);
            N = textPaint;
            textPaint.setTypeface(org.telegram.messenger.g0.o());
            N.setTextSize(org.telegram.messenger.g0.L(17.0f));
        }
        return N;
    }

    public static String p(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(35);
        return indexOf >= 0 ? str.substring(0, indexOf + 1) : str;
    }

    public final void b() {
        ValueAnimator valueAnimator;
        ArrayList<e3> tabs = getTabs();
        int size = tabs.size();
        if (size == 0) {
            return;
        }
        e3 e3Var = (e3) i5.c.h(1, tabs);
        LaunchActivity launchActivity = LaunchActivity.H1;
        m3 m3Var = launchActivity == null ? null : launchActivity.x0;
        if (m3Var != null && (valueAnimator = m3Var.d) != null) {
            valueAnimator.cancel();
            m3Var.d = null;
        }
        if (size == 1 || m3Var == null) {
            e(e3Var);
        } else {
            m3Var.f();
        }
    }

    public final c3 c(e3 e3Var) {
        ArrayList<c3> tabDrawables = getTabDrawables();
        for (int i7 = 0; i7 < tabDrawables.size(); i7++) {
            if (tabDrawables.get(i7).a == e3Var) {
                return tabDrawables.get(i7);
            }
        }
        return null;
    }

    public final void d(RectF rectF, float f10) {
        rectF.set(org.telegram.messenger.g0.L(4.0f), (getHeight() - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(50.0f), getWidth() - org.telegram.messenger.g0.L(4.0f), getHeight() - org.telegram.messenger.g0.L(4.0f));
        rectF.offset(0.0f, (-org.telegram.messenger.g0.L(8.0f)) * f10);
        float T1 = org.telegram.messenger.g0.T1(1.0f, 0.95f, Math.abs(f10));
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float width = rectF.width();
        float height = rectF.height();
        float f11 = (width / 2.0f) * T1;
        rectF.left = centerX - f11;
        rectF.right = centerX + f11;
        float f12 = (height / 2.0f) * T1;
        rectF.top = centerY - f12;
        rectF.bottom = centerY + f12;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        getTabs();
        ArrayList<c3> tabDrawables = getTabDrawables();
        if (this.H <= 0.0f) {
            return;
        }
        this.a.setColor(this.h.a(this.f, false));
        super.dispatchDraw(canvas);
        int a10 = this.r.a(this.n, false);
        float d = this.w.d(this.s);
        if (this.b) {
            int i7 = 0;
            while (i7 < tabDrawables.size()) {
                c3 c3Var = tabDrawables.get(i7);
                float c10 = c3Var.c();
                float b10 = c3Var.b();
                if (b10 > 0.0f && c10 <= 1.99f) {
                    RectF rectF = this.F;
                    d(rectF, c10);
                    c3Var.w = 0.0f;
                    boolean z10 = d > 0.5f;
                    c3Var.m = a10;
                    c3Var.o = z10;
                    canvas2 = canvas;
                    c3Var.a(canvas2, rectF, org.telegram.messenger.g0.L(18.0f), b10, 1.0f);
                } else {
                    canvas2 = canvas;
                }
                i7++;
                canvas = canvas2;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        d3 d3Var;
        if (!this.b || getTabs().isEmpty() || (d3Var = this.e) == null || !d3Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final void e(e3 e3Var) {
        bn bnVar;
        rj rjVar;
        g2 Q = LaunchActivity.Q();
        if (Q == null || Q.getParentActivity() == null) {
            return;
        }
        boolean z10 = Q instanceof bn;
        if (z10 && (rjVar = (bnVar = (bn) Q).a0) != null) {
            rjVar.U();
            bnVar.a0.L0(true, false, true);
        }
        if (e3Var.J == null) {
            new b3(0, this, e3Var).a(Q);
            if (e3Var.C) {
                if (z10 && ((bn) Q).a() == e3Var.a.c) {
                    return;
                }
                this.c = true;
                org.telegram.messenger.g0.h3(new kg.y(this, Q, bn.ua(e3Var.a.c), 24), 220L);
                return;
            }
            return;
        }
        g2 sheetFragment = this.d.getSheetFragment();
        org.telegram.ui.g4 g4Var = e3Var.J;
        org.telegram.ui.t3 t3Var = g4Var.L;
        a3.b(t3Var);
        sheetFragment.addSheet(t3Var);
        org.telegram.ui.s3 s3Var = t3Var.c;
        t3Var.h = false;
        t3Var.n = false;
        ValueAnimator valueAnimator = t3Var.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = t3Var.F;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        t3Var.y = 0.0f;
        t3Var.x = 0.0f;
        t3Var.r();
        t3Var.A();
        s3Var.invalidate();
        s3Var.requestLayout();
        g4Var.W(sheetFragment.getParentActivity(), sheetFragment);
        t3Var.q(sheetFragment);
        t3Var.o();
        h(this.x, e3Var, false);
    }

    public final void f() {
        ArrayList<e3> tabs = getTabs();
        ArrayList<c3> tabDrawables = getTabDrawables();
        for (int i7 = 0; i7 < tabs.size(); i7++) {
            tabs.get(i7).a();
        }
        tabs.clear();
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            tabDrawables.get(i10).d = -1;
        }
        n();
        o(true);
        invalidate();
        tabs.isEmpty();
    }

    public final void g(e3 e3Var, y10 y10Var) {
        String str;
        if (e3Var == null) {
            y10Var.a(Boolean.TRUE);
            return;
        }
        if (!e3Var.y) {
            h(this.x, e3Var, true);
            y10Var.a(Boolean.TRUE);
            return;
        }
        TLRPC.User c22 = np.u1(e3Var.a.a).c2(Long.valueOf(e3Var.a.c));
        if (c22 != null) {
            str = org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name);
        } else {
            ki.e4 e4Var = e3Var.a;
            str = e4Var.g == 6 ? e4Var.e : null;
        }
        boolean[] zArr = {false};
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        t1 t1Var = alertDialog$Builder.a;
        t1Var.S = str;
        t1Var.U = hd.N0(2131752905, null);
        alertDialog$Builder.k(hd.N0(2131752904, null), new di.l6(this, zArr, e3Var, y10Var, r9));
        alertDialog$Builder.h(hd.N0(2131752577, null), new a3.h(zArr, y10Var, r9, 18));
        t1[] t1VarArr = {t1Var};
        t1Var.setOnDismissListener(new y1(2, zArr, y10Var));
        t1VarArr[0].show();
        t6.U((TextView) t1VarArr[0].d(-1), m6.q7, null);
    }

    public Paint getBackgroundPaint() {
        return this.a;
    }

    public int getExpandedHeight() {
        int size = getTabs().size();
        if (size == 0) {
            return 0;
        }
        return size == 1 ? org.telegram.messenger.g0.L(60.0f) : org.telegram.messenger.g0.L(68.0f);
    }

    public ArrayList<c3> getTabDrawables() {
        int i7 = this.x;
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = M;
        ArrayList<c3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList != null) {
            return arrayList;
        }
        Integer valueOf2 = Integer.valueOf(i7);
        ArrayList<c3> arrayList2 = new ArrayList<>();
        hashMap.put(valueOf2, arrayList2);
        return arrayList2;
    }

    public ArrayList<e3> getTabs() {
        int i7 = this.x;
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = L;
        ArrayList<e3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList != null) {
            return arrayList;
        }
        Integer valueOf2 = Integer.valueOf(i7);
        ArrayList<e3> arrayList2 = new ArrayList<>();
        hashMap.put(valueOf2, arrayList2);
        return arrayList2;
    }

    public final boolean h(int i7, e3 e3Var, boolean z10) {
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = L;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i7);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        Integer valueOf3 = Integer.valueOf(i7);
        HashMap hashMap2 = M;
        ArrayList arrayList3 = (ArrayList) hashMap2.get(valueOf3);
        if (arrayList3 == null) {
            Integer valueOf4 = Integer.valueOf(i7);
            arrayList3 = new ArrayList();
            hashMap2.put(valueOf4, arrayList3);
        }
        arrayList.remove(e3Var);
        if (z10) {
            e3Var.a();
        }
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            c3 c3Var = (c3) arrayList3.get(i10);
            int indexOf = arrayList.indexOf(c3Var.a);
            c3Var.d = indexOf;
            if (indexOf >= 0) {
                c3Var.c = indexOf;
            }
        }
        n();
        org.telegram.messenger.g0.h3(new kg.y(this, arrayList3, e3Var, 25), 320L);
        o(true);
        invalidate();
        d3 d3Var = this.e;
        if (d3Var != null) {
            d3Var.i();
        }
        return arrayList.isEmpty();
    }

    public final void i(int i7, boolean z10) {
        if (i7 != this.f) {
            ActionBarLayout actionBarLayout = this.d;
            if (!actionBarLayout.R || actionBarLayout.U) {
                z10 = false;
            }
            this.f = i7;
            int w10 = m6.w(i7, m6.r1((org.telegram.messenger.g0.B(i7) > 0.721f ? 1 : (org.telegram.messenger.g0.B(i7) == 0.721f ? 0 : -1)) < 0 ? 0.08f : 0.75f, -1));
            this.n = w10;
            this.s = org.telegram.messenger.g0.B(w10) < 0.721f;
            if (!z10) {
                this.h.a(this.f, true);
                this.r.a(this.n, true);
                this.w.f(this.s, true);
            }
            invalidate();
        }
    }

    public final boolean j(float f10, float f11, int i7) {
        ArrayList<e3> tabs = getTabs();
        ArrayList<c3> tabDrawables = getTabDrawables();
        if (this.b) {
            e3 e3Var = tabs.isEmpty() ? null : tabs.get(0);
            c3 c10 = c(e3Var);
            if (c10 != null) {
                org.telegram.ui.Cells.y yVar = c10.l;
                float c11 = c10.c();
                RectF rectF = this.F;
                d(rectF, c11);
                if (i7 == 0 || i7 == 2) {
                    boolean contains = yVar.getBounds().contains((int) (f10 - rectF.left), (int) (f11 - rectF.centerY()));
                    this.y = contains;
                    this.E = !contains && rectF.contains(f10, f11);
                    yVar.setState(this.y ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : new int[0]);
                } else if (i7 == 1 || i7 == 3) {
                    if (this.E && i7 == 1) {
                        b();
                    } else if (this.y && i7 == 1) {
                        g(e3Var, new fi.e(6));
                    }
                    this.y = false;
                    this.E = false;
                    yVar.setState(new int[0]);
                }
                for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
                    if (tabDrawables.get(i10) != c10) {
                        tabDrawables.get(i10).l.setState(new int[0]);
                    }
                }
            } else {
                this.E = false;
                this.y = false;
            }
        } else {
            this.E = false;
            this.y = false;
        }
        return this.E || this.y;
    }

    public final e3 k(ki.e4 e4Var) {
        Integer valueOf = Integer.valueOf(this.x);
        HashMap hashMap = L;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(this.x);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            e3 e3Var = (e3) arrayList.get(i7);
            if (e4Var.equals(e3Var.a)) {
                e(e3Var);
                return e3Var;
            }
        }
        return null;
    }

    public final e3 l(gj gjVar) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (gjVar == null || (message = gjVar.k) == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null) {
            return null;
        }
        return m(webPage);
    }

    public final e3 m(TLRPC.WebPage webPage) {
        if (webPage == null) {
            return null;
        }
        ArrayList<e3> tabs = getTabs();
        for (int i7 = 0; i7 < tabs.size(); i7++) {
            e3 e3Var = tabs.get(i7);
            org.telegram.ui.g4 g4Var = e3Var.J;
            if (g4Var != null && !g4Var.e0.isEmpty()) {
                Object h = i5.c.h(1, e3Var.J.e0);
                if ((h instanceof TLRPC.WebPage) && ((TLRPC.WebPage) h).id == webPage.id) {
                    e(e3Var);
                    return e3Var;
                }
            }
        }
        return null;
    }

    public final void n() {
        CharSequence m10;
        ArrayList<e3> tabs = getTabs();
        ArrayList<c3> tabDrawables = getTabDrawables();
        CharSequence charSequence = null;
        for (int i7 = 0; i7 < tabDrawables.size(); i7++) {
            c3 c3Var = tabDrawables.get(i7);
            if (tabs.size() <= 1 || c3Var.c != 0) {
                m10 = org.telegram.messenger.j6.m(c3Var.a.b(), getTextPaint().getFontMetricsInt(), false, null, 0);
                c3Var.v = null;
            } else {
                m10 = org.telegram.messenger.j6.m(hd.G(tabs.size() - 1, "BotMoreTabs", c3Var.a.b()), getTextPaint().getFontMetricsInt(), false, null, 0);
                if (m10 == null) {
                    c3Var.v = null;
                } else {
                    c3Var.v = new xy0(m10, 17.0f, org.telegram.messenger.g0.o());
                }
            }
            charSequence = m10;
        }
        if (tabs.isEmpty()) {
            setImportantForAccessibility(2);
            setContentDescription(hd.a0(null, null, 2131754748, ""));
        } else {
            setImportantForAccessibility(1);
            if (charSequence == null) {
                charSequence = "";
            }
            setContentDescription(hd.a0(null, null, 2131754748, charSequence));
        }
    }

    public final void o(boolean z10) {
        if (this.I == getExpandedHeight()) {
            return;
        }
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            this.G = null;
            valueAnimator.cancel();
        }
        this.I = getExpandedHeight();
        Iterator it = this.K.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H, this.I);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new hi.j3(this, 14));
            this.G.addListener(new ki.m3(this, 11));
            this.G.setDuration(250L);
            this.G.setInterpolator(i1.w);
            this.G.start();
        } else {
            this.H = this.I;
            invalidate();
        }
        Object parent = getParent();
        if (parent instanceof View) {
            WeakHashMap weakHashMap = r0.i0.a;
            r0.y.c((View) parent);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return j(motionEvent.getX(), motionEvent.getY(), motionEvent.getAction()) || super.onTouchEvent(motionEvent);
    }

    public void setCurrentAccount(int i7) {
        if (this.x != i7) {
            this.x = i7;
            o(false);
            invalidate();
        }
    }

    public void setNavigationBarColor(int i7) {
        i(i7, true);
    }

    public void setupTab(c3 c3Var) {
        int a10 = this.r.a(this.n, false);
        float d = this.w.d(this.s);
        c3Var.w = 0.0f;
        boolean z10 = d > 0.5f;
        c3Var.m = a10;
        c3Var.o = z10;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }
}
