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
import bi.q7;
import bi.q8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.wq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
import org.telegram.ui.sj;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class e3 extends FrameLayout {
    public static final HashMap K = new HashMap();
    public static final HashMap L = new HashMap();
    public static TextPaint M;
    public boolean D;
    public final RectF E;
    public ValueAnimator F;
    public float G;
    public int H;
    public final HashSet I;
    public final HashSet J;
    public final Paint a;
    public boolean b;
    public boolean c;
    public final ActionBarLayout d;
    public final c3 e;
    public int f;
    public final org.telegram.ui.Components.y4 h;
    public int n;
    public final org.telegram.ui.Components.y4 r;
    public boolean s;
    public final org.telegram.ui.Components.v5 w;
    public int x;
    public boolean y;

    public e3(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.a = new Paint(1);
        this.b = true;
        this.c = false;
        wq wqVar = wq.h;
        this.h = new org.telegram.ui.Components.y4(this, 200L, wqVar, 0);
        this.r = new org.telegram.ui.Components.y4(this, 200L, wqVar, 0);
        this.w = new org.telegram.ui.Components.v5(this, 0L, 200L, wqVar);
        this.x = p10.s0;
        this.E = new RectF();
        this.I = new HashSet();
        this.J = new HashSet();
        this.d = actionBarLayout;
        setNavigationBarColor(m6.x0(null, m6.a7, false));
        c3 c3Var = new c3(this, this);
        this.e = c3Var;
        r0.i0.j(this, c3Var);
        n();
        o(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TextPaint getTextPaint() {
        if (M == null) {
            TextPaint textPaint = new TextPaint(1);
            M = textPaint;
            textPaint.setTypeface(org.telegram.messenger.g0.o());
            M.setTextSize(org.telegram.messenger.g0.L(17.0f));
        }
        return M;
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
        ArrayList<d3> tabs = getTabs();
        int size = tabs.size();
        if (size == 0) {
            return;
        }
        d3 d3Var = (d3) jg.g.i(1, tabs);
        LaunchActivity launchActivity = LaunchActivity.G1;
        l3 l3Var = launchActivity == null ? null : launchActivity.w0;
        if (l3Var != null && (valueAnimator = l3Var.d) != null) {
            valueAnimator.cancel();
            l3Var.d = null;
        }
        if (size == 1 || l3Var == null) {
            e(d3Var);
        } else {
            l3Var.f();
        }
    }

    public final b3 c(d3 d3Var) {
        ArrayList<b3> tabDrawables = getTabDrawables();
        for (int i7 = 0; i7 < tabDrawables.size(); i7++) {
            if (tabDrawables.get(i7).a == d3Var) {
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
        ArrayList<b3> tabDrawables = getTabDrawables();
        if (this.G <= 0.0f) {
            return;
        }
        this.a.setColor(this.h.a(this.f, false));
        super.dispatchDraw(canvas);
        int a10 = this.r.a(this.n, false);
        float d = this.w.d(this.s);
        if (this.b) {
            int i7 = 0;
            while (i7 < tabDrawables.size()) {
                b3 b3Var = tabDrawables.get(i7);
                float c10 = b3Var.c();
                float b10 = b3Var.b();
                if (b10 > 0.0f && c10 <= 1.99f) {
                    RectF rectF = this.E;
                    d(rectF, c10);
                    b3Var.w = 0.0f;
                    boolean z9 = d > 0.5f;
                    b3Var.m = a10;
                    b3Var.o = z9;
                    canvas2 = canvas;
                    b3Var.a(canvas2, rectF, org.telegram.messenger.g0.L(18.0f), b10, 1.0f);
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
        c3 c3Var;
        if (!this.b || getTabs().isEmpty() || (c3Var = this.e) == null || !c3Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final void e(d3 d3Var) {
        cn cnVar;
        sj sjVar;
        f2 Q = LaunchActivity.Q();
        if (Q == null || Q.getParentActivity() == null) {
            return;
        }
        boolean z9 = Q instanceof cn;
        if (z9 && (sjVar = (cnVar = (cn) Q).Z) != null) {
            sjVar.L();
            cnVar.Z.j0();
        }
        if (d3Var.J == null) {
            new org.telegram.messenger.voip.k(1, this, d3Var).a(Q);
            if (d3Var.C) {
                if (z9 && ((cn) Q).a() == d3Var.a.c) {
                    return;
                }
                this.c = true;
                org.telegram.messenger.g0.i3(new l2.z0(this, Q, cn.ta(d3Var.a.c), 19), 220L);
                return;
            }
            return;
        }
        f2 sheetFragment = this.d.getSheetFragment();
        org.telegram.ui.g4 g4Var = d3Var.J;
        org.telegram.ui.t3 t3Var = g4Var.K;
        a3.b(t3Var);
        sheetFragment.addSheet(t3Var);
        org.telegram.ui.s3 s3Var = t3Var.c;
        t3Var.h = false;
        t3Var.n = false;
        ValueAnimator valueAnimator = t3Var.D;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = t3Var.E;
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
        h(this.x, d3Var, false);
    }

    public final void f() {
        ArrayList<d3> tabs = getTabs();
        ArrayList<b3> tabDrawables = getTabDrawables();
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

    public final void g(d3 d3Var, c20 c20Var) {
        String str;
        if (d3Var == null) {
            c20Var.a(Boolean.TRUE);
            return;
        }
        if (!d3Var.y) {
            h(this.x, d3Var, true);
            c20Var.a(Boolean.TRUE);
            return;
        }
        TLRPC.User a22 = qp.s1(d3Var.a.a).a2(Long.valueOf(d3Var.a.c));
        if (a22 != null) {
            str = org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name);
        } else {
            hi.q4 q4Var = d3Var.a;
            str = q4Var.g == 6 ? q4Var.e : null;
        }
        boolean[] zArr = {false};
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        u1 u1Var = alertDialog$Builder.a;
        u1Var.R = str;
        u1Var.T = id.M0(2131752917, null);
        alertDialog$Builder.k(id.M0(2131752916, null), new q7(this, zArr, d3Var, c20Var, r9));
        alertDialog$Builder.h(id.M0(2131752589, null), new a3.h(zArr, c20Var, r9, 17));
        u1[] u1VarArr = {u1Var};
        u1Var.setOnDismissListener(new q8(zArr, c20Var));
        u1VarArr[0].show();
        t6.U((TextView) u1VarArr[0].d(-1), m6.q7, null);
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

    public ArrayList<b3> getTabDrawables() {
        int i7 = this.x;
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = L;
        ArrayList<b3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList != null) {
            return arrayList;
        }
        Integer valueOf2 = Integer.valueOf(i7);
        ArrayList<b3> arrayList2 = new ArrayList<>();
        hashMap.put(valueOf2, arrayList2);
        return arrayList2;
    }

    public ArrayList<d3> getTabs() {
        int i7 = this.x;
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = K;
        ArrayList<d3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList != null) {
            return arrayList;
        }
        Integer valueOf2 = Integer.valueOf(i7);
        ArrayList<d3> arrayList2 = new ArrayList<>();
        hashMap.put(valueOf2, arrayList2);
        return arrayList2;
    }

    public final boolean h(int i7, d3 d3Var, boolean z9) {
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = K;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i7);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        Integer valueOf3 = Integer.valueOf(i7);
        HashMap hashMap2 = L;
        ArrayList arrayList3 = (ArrayList) hashMap2.get(valueOf3);
        if (arrayList3 == null) {
            Integer valueOf4 = Integer.valueOf(i7);
            arrayList3 = new ArrayList();
            hashMap2.put(valueOf4, arrayList3);
        }
        arrayList.remove(d3Var);
        if (z9) {
            d3Var.a();
        }
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            b3 b3Var = (b3) arrayList3.get(i10);
            int indexOf = arrayList.indexOf(b3Var.a);
            b3Var.d = indexOf;
            if (indexOf >= 0) {
                b3Var.c = indexOf;
            }
        }
        n();
        org.telegram.messenger.g0.i3(new l2.z0(this, arrayList3, d3Var, 20), 320L);
        o(true);
        invalidate();
        c3 c3Var = this.e;
        if (c3Var != null) {
            c3Var.i();
        }
        return arrayList.isEmpty();
    }

    public final void i(int i7, boolean z9) {
        if (i7 != this.f) {
            ActionBarLayout actionBarLayout = this.d;
            if (!actionBarLayout.Q || actionBarLayout.T) {
                z9 = false;
            }
            this.f = i7;
            int w10 = m6.w(i7, m6.r1((org.telegram.messenger.g0.B(i7) > 0.721f ? 1 : (org.telegram.messenger.g0.B(i7) == 0.721f ? 0 : -1)) < 0 ? 0.08f : 0.75f, -1));
            this.n = w10;
            this.s = org.telegram.messenger.g0.B(w10) < 0.721f;
            if (!z9) {
                this.h.a(this.f, true);
                this.r.a(this.n, true);
                this.w.f(this.s, true);
            }
            invalidate();
        }
    }

    public final boolean j(float f10, float f11, int i7) {
        ArrayList<d3> tabs = getTabs();
        ArrayList<b3> tabDrawables = getTabDrawables();
        if (this.b) {
            d3 d3Var = tabs.isEmpty() ? null : tabs.get(0);
            b3 c10 = c(d3Var);
            if (c10 != null) {
                org.telegram.ui.Cells.y yVar = c10.l;
                float c11 = c10.c();
                RectF rectF = this.E;
                d(rectF, c11);
                if (i7 == 0 || i7 == 2) {
                    boolean contains = yVar.getBounds().contains((int) (f10 - rectF.left), (int) (f11 - rectF.centerY()));
                    this.y = contains;
                    this.D = !contains && rectF.contains(f10, f11);
                    yVar.setState(this.y ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : new int[0]);
                } else if (i7 == 1 || i7 == 3) {
                    if (this.D && i7 == 1) {
                        b();
                    } else if (this.y && i7 == 1) {
                        g(d3Var, new di.e(6));
                    }
                    this.y = false;
                    this.D = false;
                    yVar.setState(new int[0]);
                }
                for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
                    if (tabDrawables.get(i10) != c10) {
                        tabDrawables.get(i10).l.setState(new int[0]);
                    }
                }
            } else {
                this.D = false;
                this.y = false;
            }
        } else {
            this.D = false;
            this.y = false;
        }
        return this.D || this.y;
    }

    public final d3 k(hi.q4 q4Var) {
        Integer valueOf = Integer.valueOf(this.x);
        HashMap hashMap = K;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(this.x);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            d3 d3Var = (d3) arrayList.get(i7);
            if (q4Var.equals(d3Var.a)) {
                e(d3Var);
                return d3Var;
            }
        }
        return null;
    }

    public final d3 l(ij ijVar) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (ijVar == null || (message = ijVar.k) == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null) {
            return null;
        }
        return m(webPage);
    }

    public final d3 m(TLRPC.WebPage webPage) {
        if (webPage == null) {
            return null;
        }
        ArrayList<d3> tabs = getTabs();
        for (int i7 = 0; i7 < tabs.size(); i7++) {
            d3 d3Var = tabs.get(i7);
            org.telegram.ui.g4 g4Var = d3Var.J;
            if (g4Var != null && !g4Var.d0.isEmpty()) {
                Object i10 = jg.g.i(1, d3Var.J.d0);
                if ((i10 instanceof TLRPC.WebPage) && ((TLRPC.WebPage) i10).id == webPage.id) {
                    e(d3Var);
                    return d3Var;
                }
            }
        }
        return null;
    }

    public final void n() {
        CharSequence m10;
        ArrayList<d3> tabs = getTabs();
        ArrayList<b3> tabDrawables = getTabDrawables();
        CharSequence charSequence = null;
        for (int i7 = 0; i7 < tabDrawables.size(); i7++) {
            b3 b3Var = tabDrawables.get(i7);
            if (tabs.size() <= 1 || b3Var.c != 0) {
                m10 = org.telegram.messenger.i6.m(b3Var.a.b(), getTextPaint().getFontMetricsInt(), false, null, 0);
                b3Var.v = null;
            } else {
                m10 = org.telegram.messenger.i6.m(id.G(tabs.size() - 1, "BotMoreTabs", b3Var.a.b()), getTextPaint().getFontMetricsInt(), false, null, 0);
                if (m10 == null) {
                    b3Var.v = null;
                } else {
                    b3Var.v = new my0(m10, 17.0f, org.telegram.messenger.g0.o());
                }
            }
            charSequence = m10;
        }
        if (tabs.isEmpty()) {
            setImportantForAccessibility(2);
            setContentDescription(id.a0(null, null, 2131754749, ""));
        } else {
            setImportantForAccessibility(1);
            if (charSequence == null) {
                charSequence = "";
            }
            setContentDescription(id.a0(null, null, 2131754749, charSequence));
        }
    }

    public final void o(boolean z9) {
        if (this.H == getExpandedHeight()) {
            return;
        }
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            this.F = null;
            valueAnimator.cancel();
        }
        this.H = getExpandedHeight();
        Iterator it = this.J.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        if (z9) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, this.H);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new fi.v3(this, 14));
            this.F.addListener(new m.a(this, 10));
            this.F.setDuration(250L);
            this.F.setInterpolator(i1.w);
            this.F.start();
        } else {
            this.G = this.H;
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

    public void setupTab(b3 b3Var) {
        int a10 = this.r.a(this.n, false);
        float d = this.w.d(this.s);
        b3Var.w = 0.0f;
        boolean z9 = d > 0.5f;
        b3Var.m = a10;
        b3Var.o = z9;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }
}
