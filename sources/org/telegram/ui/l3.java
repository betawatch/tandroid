package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l3 extends FrameLayout {
    public int D;
    public org.telegram.ui.web.w1 E;
    public boolean F;
    public String G;
    public String H;
    public boolean I;
    public float J;
    public x2 K;
    public final /* synthetic */ h4 L;
    public int a;
    public final g3 b;
    public final f4 c;
    public final s4.a0 d;
    public final i3 e;
    public final j3 f;
    public boolean h;
    public boolean n;
    public b3 r;
    public boolean s;
    public boolean w;
    public int x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(h4 h4Var, Activity activity) {
        super(activity);
        this.L = h4Var;
        int i10 = org.telegram.ui.ActionBar.t6.Dl;
        this.x = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        this.y = x02;
        this.D = x02;
        this.F = false;
        this.J = -1.0f;
        new Matrix();
        g3 g3Var = new g3(this, activity);
        this.b = g3Var;
        g3Var.setClipToPadding(false);
        g3Var.setPadding(0, org.telegram.messenger.i0.L(56.0f), 0, 0);
        g3Var.setTopGlowOffset(org.telegram.messenger.i0.L(56.0f));
        ((s4.j) g3Var.getItemAnimator()).C = false;
        f4 f4Var = new f4(h4Var, activity, h4Var.K != null);
        this.c = f4Var;
        g3Var.setAdapter(f4Var);
        s4.a0 a0Var = new s4.a0(1, false);
        this.d = a0Var;
        g3Var.setLayoutManager(a0Var);
        g3Var.setOnScrollListener(new h3(this, 0));
        addView(g3Var, w7.b6.c(-1.0f, -1));
        i3 i3Var = new i3(this, getContext());
        this.e = i3Var;
        i3Var.setShouldWaitWebViewScroll(true);
        i3Var.setFullSize(true);
        i3Var.setAllowFullSizeSwipe(true);
        j3 j3Var = new j3(this, getContext(), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false));
        this.f = j3Var;
        final int i11 = 0;
        j3Var.setOnCloseRequestedListener(new Runnable(this) { // from class: org.telegram.ui.e3
            public final /* synthetic */ l3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        h4 h4Var2 = this.b.L;
                        LaunchActivity launchActivity = LaunchActivity.I1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.i3 O = launchActivity.O();
                            if (O != null) {
                                boolean z10 = false;
                                int i12 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.i3.K;
                                    if (i12 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i12));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj = arrayList.get(i13);
                                                i13++;
                                                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj;
                                                if (h3Var.J == h4Var2) {
                                                    z10 = O.h(i12, h3Var, true);
                                                }
                                            }
                                        }
                                        i12++;
                                    }
                                }
                                if (z10) {
                                }
                            }
                            h4Var2.m(true, true);
                            break;
                        }
                        break;
                    case 1:
                        this.b.f.n(true, false);
                        break;
                    default:
                        l3 l3Var = this.b;
                        i3 i3Var2 = l3Var.e;
                        l3Var.f.n(false, false);
                        b3 b3Var = l3Var.r;
                        if (b3Var != null) {
                            b3Var.a.setTranslationY(((i3Var2.getTopActionBarOffsetY() + (-i3Var2.getOffsetY())) - i3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        l3Var.L.d0();
                        break;
                }
            }
        });
        j3Var.setWebViewProgressListener(new f3(this, i11));
        j3Var.setDelegate(new k3(this));
        j3Var.setWebViewScrollListener(new e(this, 2));
        i3Var.addView(j3Var, w7.b6.c(-1.0f, -1));
        final int i12 = 1;
        i3Var.setScrollEndListener(new Runnable(this) { // from class: org.telegram.ui.e3
            public final /* synthetic */ l3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        h4 h4Var2 = this.b.L;
                        LaunchActivity launchActivity = LaunchActivity.I1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.i3 O = launchActivity.O();
                            if (O != null) {
                                boolean z10 = false;
                                int i122 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.i3.K;
                                    if (i122 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i122));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj = arrayList.get(i13);
                                                i13++;
                                                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj;
                                                if (h3Var.J == h4Var2) {
                                                    z10 = O.h(i122, h3Var, true);
                                                }
                                            }
                                        }
                                        i122++;
                                    }
                                }
                                if (z10) {
                                }
                            }
                            h4Var2.m(true, true);
                            break;
                        }
                        break;
                    case 1:
                        this.b.f.n(true, false);
                        break;
                    default:
                        l3 l3Var = this.b;
                        i3 i3Var2 = l3Var.e;
                        l3Var.f.n(false, false);
                        b3 b3Var = l3Var.r;
                        if (b3Var != null) {
                            b3Var.a.setTranslationY(((i3Var2.getTopActionBarOffsetY() + (-i3Var2.getOffsetY())) - i3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        l3Var.L.d0();
                        break;
                }
            }
        });
        i3Var.setDelegate(new y0(this, i12));
        final int i13 = 2;
        i3Var.setScrollListener(new Runnable(this) { // from class: org.telegram.ui.e3
            public final /* synthetic */ l3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        h4 h4Var2 = this.b.L;
                        LaunchActivity launchActivity = LaunchActivity.I1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.i3 O = launchActivity.O();
                            if (O != null) {
                                boolean z10 = false;
                                int i122 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.i3.K;
                                    if (i122 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i122));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i132 = 0;
                                            while (i132 < size) {
                                                Object obj = arrayList.get(i132);
                                                i132++;
                                                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj;
                                                if (h3Var.J == h4Var2) {
                                                    z10 = O.h(i122, h3Var, true);
                                                }
                                            }
                                        }
                                        i122++;
                                    }
                                }
                                if (z10) {
                                }
                            }
                            h4Var2.m(true, true);
                            break;
                        }
                        break;
                    case 1:
                        this.b.f.n(true, false);
                        break;
                    default:
                        l3 l3Var = this.b;
                        i3 i3Var2 = l3Var.e;
                        l3Var.f.n(false, false);
                        b3 b3Var = l3Var.r;
                        if (b3Var != null) {
                            b3Var.a.setTranslationY(((i3Var2.getTopActionBarOffsetY() + (-i3Var2.getOffsetY())) - i3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        l3Var.L.d0();
                        break;
                }
            }
        });
        i3Var.setTopActionBarOffsetY(org.telegram.messenger.i0.L(56.0f) + org.telegram.messenger.i0.m);
        addView(i3Var, w7.b6.c(-1.0f, -1));
        b();
        setType(0);
    }

    public static void a(l3 l3Var, boolean z10, int i10) {
        h4 h4Var = l3Var.L;
        u3 u3Var = h4Var.K;
        if (z10) {
            int w9 = org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false), i10);
            l3Var.x = w9;
            if (l3Var == h4Var.u0[0]) {
                if (org.telegram.messenger.tz.v0) {
                    h4Var.h0.d(w9, true);
                }
                if (u3Var != null) {
                    u3Var.u();
                }
            }
        } else {
            int w10 = org.telegram.ui.ActionBar.t6.w(-1, i10);
            l3Var.y = w10;
            if (l3Var == h4Var.u0[0]) {
                if (org.telegram.messenger.tz.v0) {
                    h4Var.h0.setMenuColors(w10);
                }
                if (u3Var != null) {
                    u3Var.u();
                }
            }
        }
        h4Var.d0();
    }

    public final void b() {
        this.s = false;
        this.w = false;
        setWeb(null);
        j3 j3Var = this.f;
        j3Var.h();
        j3Var.a = null;
        int i10 = org.telegram.ui.ActionBar.t6.Dl;
        this.x = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        this.y = x02;
        this.D = x02;
        b3 b3Var = this.r;
        if (b3Var != null) {
            b3Var.b(org.telegram.messenger.i0.B(x02) <= 0.721f, true);
            this.r.setBackgroundColor(this.y);
            b3 b3Var2 = this.r;
            this.n = false;
            org.telegram.messenger.i0.Y3(b3Var2, false, 1.0f, true, false);
        }
        f4 f4Var = this.c;
        f4Var.E = null;
        f4Var.e.clear();
        f4Var.f.clear();
        f4Var.s.clear();
        f4Var.w.clear();
        f4Var.h.clear();
        f4Var.r.clear();
        f4Var.n.clear();
        f4Var.y.clear();
        f4Var.x.clear();
        f4Var.F = null;
        f4Var.f();
        invalidate();
    }

    public final boolean c() {
        return this.a == 0;
    }

    public final boolean d() {
        f4 f4Var;
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        return (f() || (f4Var = this.c) == null || (webPage = f4Var.E) == null || (page = webPage.cached_page) == null || page.local == null) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e() {
        org.telegram.ui.web.v0 webView;
        String u10;
        return f() && (webView = getWebView()) != null && (u10 = org.telegram.ui.web.z0.u(webView.getUrl())) != null && org.telegram.ui.web.z0.p(Uri.parse(u10));
    }

    public final boolean f() {
        return this.a == 1;
    }

    public final void g() {
        if (c()) {
            u3 u3Var = this.L.K;
            this.d.h1(u3Var != null ? 1 : 0, u3Var != null ? org.telegram.messenger.i0.L(32.0f) : 0);
        } else if (f()) {
            i3 i3Var = this.e;
            i3Var.setSwipeOffsetY(i3Var.getTopActionBarOffsetY() + (-i3Var.getOffsetY()));
        }
    }

    public int getActionBarColor() {
        if (f() && org.telegram.messenger.tz.v0) {
            return this.x;
        }
        int i10 = org.telegram.ui.ActionBar.t6.Dl;
        this.L.getClass();
        return org.telegram.ui.ActionBar.t6.v0(i10);
    }

    public f4 getAdapter() {
        return this.c;
    }

    public int getBackgroundColor() {
        return (f() && org.telegram.messenger.tz.v0) ? this.n ? org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false) : this.y : org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false);
    }

    public float getListTop() {
        int i10;
        if (!c()) {
            if (f()) {
                return this.e.getTranslationY();
            }
            return 0.0f;
        }
        g3 g3Var = this.b;
        float height = g3Var.getHeight();
        for (int i11 = 0; i11 < g3Var.getChildCount(); i11++) {
            View childAt = g3Var.getChildAt(i11);
            if (g3Var.getLayoutManager() == null) {
                i10 = 0;
            } else {
                g3Var.getLayoutManager().getClass();
                i10 = RecyclerView.U(childAt).f;
            }
            height = i10 == 2147483646 ? Math.min(height, childAt.getBottom()) : Math.min(height, childAt.getTop());
        }
        return height;
    }

    public org.telegram.ui.Components.tk0 getListView() {
        return this.b;
    }

    public float getProgress() {
        org.telegram.ui.web.v0 webView;
        u3 u3Var = this.L.K;
        if (c()) {
            float f7 = this.J;
            if (f7 >= 0.0f) {
                return f7;
            }
            s4.a0 a0Var = this.d;
            int L0 = a0Var.L0();
            if (a0Var.m(L0) != null) {
                int[] iArr = this.c.J;
                g3 g3Var = this.b;
                if (iArr != null) {
                    int i10 = L0 - 1;
                    return Utilities.l((((i10 < 0 || i10 >= iArr.length) ? 0 : iArr[i10]) + ((L0 != 0 || u3Var == null) ? -r4.getTop() : 0)) / Math.max(1, r5.K - g3Var.getHeight()));
                }
                int N0 = a0Var.N0();
                if (u3Var != null) {
                    if (L0 < 1) {
                        L0 = 1;
                    }
                    if (N0 < 1) {
                        N0 = 1;
                    }
                }
                int B = a0Var.B() - 2;
                View m10 = N0 >= B ? a0Var.m(B) : a0Var.m(L0);
                if (m10 != null) {
                    float width = getWidth() / (r0 - 1);
                    float measuredHeight = m10.getMeasuredHeight();
                    return ((L0 * width) + (N0 >= B ? (((B - L0) * width) * (g3Var.getMeasuredHeight() - m10.getTop())) / measuredHeight : (1.0f - ((Math.min(0, m10.getTop() - g3Var.getPaddingTop()) + measuredHeight) / measuredHeight)) * width)) / getWidth();
                }
            }
        } else if (f() && (webView = this.f.getWebView()) != null) {
            return webView.getScrollProgress();
        }
        return 0.0f;
    }

    public String getSubtitle() {
        org.telegram.ui.web.v0 webView;
        m0 m0Var;
        if (!f() || (webView = this.f.getWebView()) == null) {
            return "";
        }
        if (TextUtils.equals(this.G, webView.getUrl())) {
            return this.H;
        }
        try {
            String url = webView.getUrl();
            this.G = url;
            Uri parse = Uri.parse(org.telegram.ui.web.z0.u(url));
            String uri = (parse.getScheme() == null || !(parse.getScheme().equalsIgnoreCase("http") || parse.getScheme().equalsIgnoreCase("https"))) ? parse.toString() : parse.getSchemeSpecificPart();
            try {
                if (!e()) {
                    try {
                        Uri parse2 = Uri.parse(uri);
                        if (parse2.getHost() != null) {
                            parse = parse2;
                        }
                        String a2 = gf.f.a(parse.getHost());
                        String[] split = a2.split("\\.");
                        if (split.length > 2 && (m0Var = this.L.h0) != null && vh.p2.g(a2, m0Var.E) > org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(162.0f)) {
                            a2 = split[split.length - 2] + '.' + split[split.length - 1];
                        }
                        uri = gf.f.u(parse, null, "", a2, null);
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, false);
                    }
                    uri = URLDecoder.decode(uri.replaceAll("\\+", "%2b"), "UTF-8");
                }
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
            }
            if (uri.startsWith("//")) {
                uri = uri.substring(2);
            }
            if (uri.startsWith("www.")) {
                uri = uri.substring(4);
            }
            if (uri.endsWith("/")) {
                uri = uri.substring(0, uri.length() - 1);
            }
            int indexOf = uri.indexOf("#");
            if (indexOf >= 0) {
                uri = uri.substring(0, indexOf);
            }
            this.H = uri;
            return uri;
        } catch (Exception unused) {
            return webView.getUrl();
        }
    }

    public String getTitle() {
        org.telegram.ui.web.v0 webView;
        String str;
        String str2;
        if (c()) {
            TLRPC.WebPage webPage = this.c.E;
            if (webPage != null && (str2 = webPage.site_name) != null) {
                return str2;
            }
            if (webPage != null && (str = webPage.title) != null) {
                return str;
            }
        }
        return (!f() || (webView = this.f.getWebView()) == null) ? "" : webView.getTitle();
    }

    public org.telegram.ui.web.z0 getWebContainer() {
        return this.f;
    }

    public org.telegram.ui.web.v0 getWebView() {
        j3 j3Var = this.f;
        if (j3Var != null) {
            return j3Var.getWebView();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        b3 b3Var;
        super.onAttachedToWindow();
        if (!this.n || (b3Var = this.r) == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.t6.Dl;
        b3Var.b(org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.x0(null, i10, false)) <= 0.721f, false);
        org.telegram.ui.ActionBar.a7.i(i10, this.r, null);
    }

    public void setLastVisible(boolean z10) {
        if (this.I != z10) {
            this.I = z10;
            this.f.setKeyboardFocusable(z10);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        h4 h4Var = this.L;
        h4Var.d0();
        if (h4Var.f0.f) {
            h4Var.g0.invalidate();
        }
        if (h4Var.f0.e) {
            h4Var.g0.invalidate();
            h4Var.V((int) (((org.telegram.messenger.i0.L(56.0f) - h4Var.f0.h) * (f7 / getMeasuredWidth())) + h4Var.f0.h));
        }
        u3 u3Var = h4Var.K;
        if (u3Var != null) {
            u3Var.A();
        }
    }

    public void setType(int i10) {
        if (this.a != i10) {
            b();
        }
        this.a = i10;
        this.b.setVisibility(c() ? 0 : 8);
        this.e.setVisibility(f() ? 0 : 8);
    }

    public void setWeb(x2 x2Var) {
        x2 x2Var2 = this.K;
        if (x2Var2 != x2Var) {
            if (x2Var2 != null) {
                x2Var2.c(this);
            }
            this.K = x2Var;
            if (x2Var != null) {
                org.telegram.ui.web.v0 v0Var = x2Var.b;
                j3 j3Var = this.f;
                if (v0Var != null) {
                    v0Var.onResume();
                    j3Var.N(org.telegram.messenger.d20.s0, x2Var.b, x2Var.d, x2Var.x, false);
                    a(this, true, x2Var.q);
                    a(this, false, x2Var.r);
                } else {
                    String str = x2Var.x;
                    if (str != null) {
                        j3Var.t(org.telegram.messenger.d20.s0, str, false);
                    }
                }
            }
            org.telegram.ui.web.w1 w1Var = this.E;
            if (w1Var != null) {
                w1Var.a();
                org.telegram.ui.web.w1 w1Var2 = this.E;
                TLRPC.TL_webPage tL_webPage = w1Var2.j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.y1.o(tL_webPage);
                    w1Var2.j = null;
                }
                this.E = null;
            }
        }
    }
}
