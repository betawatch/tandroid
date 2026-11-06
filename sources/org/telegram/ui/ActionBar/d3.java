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
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.qj;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class d3 extends FrameLayout {
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
    public final b3 e;
    public int f;
    public final org.telegram.ui.Components.z4 h;
    public int n;
    public final org.telegram.ui.Components.z4 r;
    public boolean s;
    public final org.telegram.ui.Components.w5 w;
    public int x;
    public boolean y;

    public d3(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.a = new Paint(1);
        this.b = true;
        this.c = false;
        xq xqVar = xq.h;
        this.h = new org.telegram.ui.Components.z4(this, 200L, xqVar, 0);
        this.r = new org.telegram.ui.Components.z4(this, 200L, xqVar, 0);
        this.w = new org.telegram.ui.Components.w5(this, 0L, 200L, xqVar);
        this.x = p10.s0;
        this.E = new RectF();
        this.I = new HashSet();
        this.J = new HashSet();
        this.d = actionBarLayout;
        setNavigationBarColor(k6.x0(null, k6.a7, false));
        b3 b3Var = new b3(this, this);
        this.e = b3Var;
        r0.i0.j(this, b3Var);
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
        ArrayList<c3> tabs = getTabs();
        int size = tabs.size();
        if (size == 0) {
            return;
        }
        c3 c3Var = (c3) jg.g.i(1, tabs);
        LaunchActivity launchActivity = LaunchActivity.G1;
        k3 k3Var = launchActivity == null ? null : launchActivity.w0;
        if (k3Var != null && (valueAnimator = k3Var.d) != null) {
            valueAnimator.cancel();
            k3Var.d = null;
        }
        if (size == 1 || k3Var == null) {
            e(c3Var);
        } else {
            k3Var.f();
        }
    }

    public final a3 c(c3 c3Var) {
        ArrayList<a3> tabDrawables = getTabDrawables();
        for (int i7 = 0; i7 < tabDrawables.size(); i7++) {
            if (tabDrawables.get(i7).a == c3Var) {
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
        ArrayList<a3> tabDrawables = getTabDrawables();
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
                a3 a3Var = tabDrawables.get(i7);
                float c10 = a3Var.c();
                float b10 = a3Var.b();
                if (b10 > 0.0f && c10 <= 1.99f) {
                    RectF rectF = this.E;
                    d(rectF, c10);
                    a3Var.w = 0.0f;
                    boolean z9 = d > 0.5f;
                    a3Var.m = a10;
                    a3Var.o = z9;
                    canvas2 = canvas;
                    a3Var.a(canvas2, rectF, org.telegram.messenger.g0.L(18.0f), b10, 1.0f);
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
        b3 b3Var;
        if (!this.b || getTabs().isEmpty() || (b3Var = this.e) == null || !b3Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final void e(c3 c3Var) {
        an anVar;
        qj qjVar;
        f2 Q = LaunchActivity.Q();
        if (Q == null || Q.getParentActivity() == null) {
            return;
        }
        boolean z9 = Q instanceof an;
        if (z9 && (qjVar = (anVar = (an) Q).Z) != null) {
            qjVar.L();
            anVar.Z.j0();
        }
        if (c3Var.J == null) {
            new org.telegram.messenger.voip.k(1, this, c3Var).a(Q);
            if (c3Var.C) {
                if (z9 && ((an) Q).a() == c3Var.a.c) {
                    return;
                }
                this.c = true;
                org.telegram.messenger.g0.i3(new l2.z0(this, Q, an.ra(c3Var.a.c), 19), 220L);
                return;
            }
            return;
        }
        f2 sheetFragment = this.d.getSheetFragment();
        org.telegram.ui.g4 g4Var = c3Var.J;
        org.telegram.ui.t3 t3Var = g4Var.K;
        z2.b(t3Var);
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
        h(this.x, c3Var, false);
    }

    public final void f() {
        ArrayList<c3> tabs = getTabs();
        ArrayList<a3> tabDrawables = getTabDrawables();
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

    public final void g(c3 c3Var, c20 c20Var) {
        String str;
        if (c3Var == null) {
            c20Var.a(Boolean.TRUE);
            return;
        }
        if (!c3Var.y) {
            h(this.x, c3Var, true);
            c20Var.a(Boolean.TRUE);
            return;
        }
        TLRPC.User a22 = qp.s1(c3Var.a.a).a2(Long.valueOf(c3Var.a.c));
        if (a22 != null) {
            str = org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name);
        } else {
            hi.q4 q4Var = c3Var.a;
            str = q4Var.g == 6 ? q4Var.e : null;
        }
        boolean[] zArr = {false};
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        u1 u1Var = alertDialog$Builder.a;
        u1Var.R = str;
        u1Var.T = hd.M0(2131752917, null);
        alertDialog$Builder.k(hd.M0(2131752916, null), new q7(this, zArr, c3Var, c20Var, r9));
        alertDialog$Builder.h(hd.M0(2131752589, null), new a3.h(zArr, c20Var, r9, 17));
        u1[] u1VarArr = {u1Var};
        u1Var.setOnDismissListener(new q8(zArr, c20Var));
        u1VarArr[0].show();
        r6.V((TextView) u1VarArr[0].d(-1), k6.q7, null);
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

    public ArrayList<a3> getTabDrawables() {
        int i7 = this.x;
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = L;
        ArrayList<a3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList != null) {
            return arrayList;
        }
        Integer valueOf2 = Integer.valueOf(i7);
        ArrayList<a3> arrayList2 = new ArrayList<>();
        hashMap.put(valueOf2, arrayList2);
        return arrayList2;
    }

    public ArrayList<c3> getTabs() {
        int i7 = this.x;
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = K;
        ArrayList<c3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList != null) {
            return arrayList;
        }
        Integer valueOf2 = Integer.valueOf(i7);
        ArrayList<c3> arrayList2 = new ArrayList<>();
        hashMap.put(valueOf2, arrayList2);
        return arrayList2;
    }

    public final boolean h(int i7, c3 c3Var, boolean z9) {
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
        arrayList.remove(c3Var);
        if (z9) {
            c3Var.a();
        }
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            a3 a3Var = (a3) arrayList3.get(i10);
            int indexOf = arrayList.indexOf(a3Var.a);
            a3Var.d = indexOf;
            if (indexOf >= 0) {
                a3Var.c = indexOf;
            }
        }
        n();
        org.telegram.messenger.g0.i3(new l2.z0(this, arrayList3, c3Var, 20), 320L);
        o(true);
        invalidate();
        b3 b3Var = this.e;
        if (b3Var != null) {
            b3Var.i();
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
            int w10 = k6.w(i7, k6.r1((org.telegram.messenger.g0.B(i7) > 0.721f ? 1 : (org.telegram.messenger.g0.B(i7) == 0.721f ? 0 : -1)) < 0 ? 0.08f : 0.75f, -1));
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
        ArrayList<c3> tabs = getTabs();
        ArrayList<a3> tabDrawables = getTabDrawables();
        if (this.b) {
            c3 c3Var = tabs.isEmpty() ? null : tabs.get(0);
            a3 c10 = c(c3Var);
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
                        g(c3Var, new di.e(6));
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

    public final c3 k(hi.q4 q4Var) {
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
            c3 c3Var = (c3) arrayList.get(i7);
            if (q4Var.equals(c3Var.a)) {
                e(c3Var);
                return c3Var;
            }
        }
        return null;
    }

    public final c3 l(ij ijVar) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (ijVar == null || (message = ijVar.k) == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null) {
            return null;
        }
        return m(webPage);
    }

    public final c3 m(TLRPC.WebPage webPage) {
        if (webPage == null) {
            return null;
        }
        ArrayList<c3> tabs = getTabs();
        for (int i7 = 0; i7 < tabs.size(); i7++) {
            c3 c3Var = tabs.get(i7);
            org.telegram.ui.g4 g4Var = c3Var.J;
            if (g4Var != null && !g4Var.d0.isEmpty()) {
                Object i10 = jg.g.i(1, c3Var.J.d0);
                if ((i10 instanceof TLRPC.WebPage) && ((TLRPC.WebPage) i10).id == webPage.id) {
                    e(c3Var);
                    return c3Var;
                }
            }
        }
        return null;
    }

    public final void n() {
        CharSequence m10;
        ArrayList<c3> tabs = getTabs();
        ArrayList<a3> tabDrawables = getTabDrawables();
        CharSequence charSequence = null;
        for (int i7 = 0; i7 < tabDrawables.size(); i7++) {
            a3 a3Var = tabDrawables.get(i7);
            if (tabs.size() <= 1 || a3Var.c != 0) {
                m10 = org.telegram.messenger.i6.m(a3Var.a.b(), getTextPaint().getFontMetricsInt(), false, null, 0);
                a3Var.v = null;
            } else {
                m10 = org.telegram.messenger.i6.m(hd.G(tabs.size() - 1, "BotMoreTabs", a3Var.a.b()), getTextPaint().getFontMetricsInt(), false, null, 0);
                if (m10 == null) {
                    a3Var.v = null;
                } else {
                    a3Var.v = new my0(m10, 17.0f, org.telegram.messenger.g0.o());
                }
            }
            charSequence = m10;
        }
        if (tabs.isEmpty()) {
            setImportantForAccessibility(2);
            setContentDescription(hd.a0(null, null, 2131754749, ""));
        } else {
            setImportantForAccessibility(1);
            if (charSequence == null) {
                charSequence = "";
            }
            setContentDescription(hd.a0(null, null, 2131754749, charSequence));
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

    public void setupTab(a3 a3Var) {
        int a10 = this.r.a(this.n, false);
        float d = this.w.d(this.s);
        a3Var.w = 0.0f;
        boolean z9 = d > 0.5f;
        a3Var.m = a10;
        a3Var.o = z9;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }
}
