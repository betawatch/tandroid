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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class k3 extends FrameLayout {
    public int D;
    public org.telegram.ui.web.u1 E;
    public boolean F;
    public String G;
    public String H;
    public boolean I;
    public float J;
    public x2 K;
    public final /* synthetic */ g4 L;
    public int a;
    public final fi.v b;
    public final e4 c;
    public final v4.b0 d;
    public final h3 e;
    public final i3 f;
    public boolean h;
    public boolean n;
    public b3 r;
    public boolean s;
    public boolean w;
    public int x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(g4 g4Var, Activity activity) {
        super(activity);
        this.L = g4Var;
        int i7 = org.telegram.ui.ActionBar.l6.Dl;
        this.x = org.telegram.ui.ActionBar.l6.x0(null, i7, false);
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, i7, false);
        this.y = x02;
        this.D = x02;
        this.F = false;
        this.J = -1.0f;
        new Matrix();
        fi.v vVar = new fi.v(this, activity);
        this.b = vVar;
        vVar.setClipToPadding(false);
        vVar.setPadding(0, org.telegram.messenger.g0.L(56.0f), 0, 0);
        vVar.setTopGlowOffset(org.telegram.messenger.g0.L(56.0f));
        ((v4.k) vVar.getItemAnimator()).C = false;
        e4 e4Var = new e4(g4Var, activity, g4Var.K != null);
        this.c = e4Var;
        vVar.setAdapter(e4Var);
        v4.b0 b0Var = new v4.b0(1, false);
        this.d = b0Var;
        vVar.setLayoutManager(b0Var);
        vVar.setOnScrollListener(new g3(this, 0));
        addView(vVar, c8.ha.c(-1.0f, -1));
        h3 h3Var = new h3(this, getContext());
        this.e = h3Var;
        h3Var.setShouldWaitWebViewScroll(true);
        h3Var.setFullSize(true);
        h3Var.setAllowFullSizeSwipe(true);
        i3 i3Var = new i3(this, getContext(), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.d6, false));
        this.f = i3Var;
        final int i10 = 0;
        i3Var.setOnCloseRequestedListener(new Runnable(this) { // from class: org.telegram.ui.e3
            public final /* synthetic */ k3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        g4 g4Var2 = this.b.L;
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.d3 O = launchActivity.O();
                            if (O != null) {
                                boolean z9 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.d3.K;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.c3 c3Var = (org.telegram.ui.ActionBar.c3) obj;
                                                if (c3Var.J == g4Var2) {
                                                    z9 = O.h(i11, c3Var, true);
                                                }
                                            }
                                        }
                                        i11++;
                                    }
                                }
                                if (z9) {
                                }
                            }
                            g4Var2.m(true, true);
                            break;
                        }
                        break;
                    case 1:
                        this.b.f.n(true, false);
                        break;
                    default:
                        k3 k3Var = this.b;
                        h3 h3Var2 = k3Var.e;
                        k3Var.f.n(false, false);
                        b3 b3Var = k3Var.r;
                        if (b3Var != null) {
                            b3Var.a.setTranslationY(((h3Var2.getTopActionBarOffsetY() + (-h3Var2.getOffsetY())) - h3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        k3Var.L.d0();
                        break;
                }
            }
        });
        i3Var.setWebViewProgressListener(new f3(this, i10));
        i3Var.setDelegate(new j3(this));
        i3Var.setWebViewScrollListener(new f(this, 2));
        h3Var.addView(i3Var, c8.ha.c(-1.0f, -1));
        final int i11 = 1;
        h3Var.setScrollEndListener(new Runnable(this) { // from class: org.telegram.ui.e3
            public final /* synthetic */ k3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        g4 g4Var2 = this.b.L;
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.d3 O = launchActivity.O();
                            if (O != null) {
                                boolean z9 = false;
                                int i112 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.d3.K;
                                    if (i112 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i112));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.c3 c3Var = (org.telegram.ui.ActionBar.c3) obj;
                                                if (c3Var.J == g4Var2) {
                                                    z9 = O.h(i112, c3Var, true);
                                                }
                                            }
                                        }
                                        i112++;
                                    }
                                }
                                if (z9) {
                                }
                            }
                            g4Var2.m(true, true);
                            break;
                        }
                        break;
                    case 1:
                        this.b.f.n(true, false);
                        break;
                    default:
                        k3 k3Var = this.b;
                        h3 h3Var2 = k3Var.e;
                        k3Var.f.n(false, false);
                        b3 b3Var = k3Var.r;
                        if (b3Var != null) {
                            b3Var.a.setTranslationY(((h3Var2.getTopActionBarOffsetY() + (-h3Var2.getOffsetY())) - h3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        k3Var.L.d0();
                        break;
                }
            }
        });
        h3Var.setDelegate(new w0(this, i11));
        final int i12 = 2;
        h3Var.setScrollListener(new Runnable(this) { // from class: org.telegram.ui.e3
            public final /* synthetic */ k3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        g4 g4Var2 = this.b.L;
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.d3 O = launchActivity.O();
                            if (O != null) {
                                boolean z9 = false;
                                int i112 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.d3.K;
                                    if (i112 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i112));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i122 = 0;
                                            while (i122 < size) {
                                                Object obj = arrayList.get(i122);
                                                i122++;
                                                org.telegram.ui.ActionBar.c3 c3Var = (org.telegram.ui.ActionBar.c3) obj;
                                                if (c3Var.J == g4Var2) {
                                                    z9 = O.h(i112, c3Var, true);
                                                }
                                            }
                                        }
                                        i112++;
                                    }
                                }
                                if (z9) {
                                }
                            }
                            g4Var2.m(true, true);
                            break;
                        }
                        break;
                    case 1:
                        this.b.f.n(true, false);
                        break;
                    default:
                        k3 k3Var = this.b;
                        h3 h3Var2 = k3Var.e;
                        k3Var.f.n(false, false);
                        b3 b3Var = k3Var.r;
                        if (b3Var != null) {
                            b3Var.a.setTranslationY(((h3Var2.getTopActionBarOffsetY() + (-h3Var2.getOffsetY())) - h3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        k3Var.L.d0();
                        break;
                }
            }
        });
        h3Var.setTopActionBarOffsetY(org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.m);
        addView(h3Var, c8.ha.c(-1.0f, -1));
        b();
        setType(0);
    }

    public static void a(k3 k3Var, boolean z9, int i7) {
        g4 g4Var = k3Var.L;
        t3 t3Var = g4Var.K;
        if (z9) {
            int w10 = org.telegram.ui.ActionBar.l6.w(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Dl, false), i7);
            k3Var.x = w10;
            if (k3Var == g4Var.u0[0]) {
                if (org.telegram.messenger.iz.v0) {
                    g4Var.h0.d(w10, true);
                }
                if (t3Var != null) {
                    t3Var.u();
                }
            }
        } else {
            int w11 = org.telegram.ui.ActionBar.l6.w(-1, i7);
            k3Var.y = w11;
            if (k3Var == g4Var.u0[0]) {
                if (org.telegram.messenger.iz.v0) {
                    g4Var.h0.setMenuColors(w11);
                }
                if (t3Var != null) {
                    t3Var.u();
                }
            }
        }
        g4Var.d0();
    }

    public final void b() {
        this.s = false;
        this.w = false;
        setWeb(null);
        i3 i3Var = this.f;
        i3Var.h();
        i3Var.a = null;
        int i7 = org.telegram.ui.ActionBar.l6.Dl;
        this.x = org.telegram.ui.ActionBar.l6.x0(null, i7, false);
        int x02 = org.telegram.ui.ActionBar.l6.x0(null, i7, false);
        this.y = x02;
        this.D = x02;
        b3 b3Var = this.r;
        if (b3Var != null) {
            b3Var.b(org.telegram.messenger.g0.B(x02) <= 0.721f, true);
            this.r.setBackgroundColor(this.y);
            b3 b3Var2 = this.r;
            this.n = false;
            org.telegram.messenger.g0.Z3(b3Var2, false, 1.0f, true, false);
        }
        e4 e4Var = this.c;
        e4Var.E = null;
        e4Var.e.clear();
        e4Var.f.clear();
        e4Var.s.clear();
        e4Var.w.clear();
        e4Var.h.clear();
        e4Var.r.clear();
        e4Var.n.clear();
        e4Var.y.clear();
        e4Var.x.clear();
        e4Var.F = null;
        e4Var.f();
        invalidate();
    }

    public final boolean c() {
        return this.a == 0;
    }

    public final boolean d() {
        e4 e4Var;
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        return (f() || (e4Var = this.c) == null || (webPage = e4Var.E) == null || (page = webPage.cached_page) == null || page.local == null) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e() {
        org.telegram.ui.web.u0 webView;
        String u10;
        return f() && (webView = getWebView()) != null && (u10 = org.telegram.ui.web.x0.u(webView.getUrl())) != null && org.telegram.ui.web.x0.p(Uri.parse(u10));
    }

    public final boolean f() {
        return this.a == 1;
    }

    public final void g() {
        if (c()) {
            t3 t3Var = this.L.K;
            this.d.h1(t3Var != null ? 1 : 0, t3Var != null ? org.telegram.messenger.g0.L(32.0f) : 0);
        } else if (f()) {
            h3 h3Var = this.e;
            h3Var.setSwipeOffsetY(h3Var.getTopActionBarOffsetY() + (-h3Var.getOffsetY()));
        }
    }

    public int getActionBarColor() {
        if (f() && org.telegram.messenger.iz.v0) {
            return this.x;
        }
        int i7 = org.telegram.ui.ActionBar.l6.Dl;
        this.L.getClass();
        return org.telegram.ui.ActionBar.l6.v0(i7);
    }

    public e4 getAdapter() {
        return this.c;
    }

    public int getBackgroundColor() {
        return (f() && org.telegram.messenger.iz.v0) ? this.n ? org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Dl, false) : this.y : org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Dl, false);
    }

    public float getListTop() {
        int i7;
        if (!c()) {
            if (f()) {
                return this.e.getTranslationY();
            }
            return 0.0f;
        }
        fi.v vVar = this.b;
        float height = vVar.getHeight();
        for (int i10 = 0; i10 < vVar.getChildCount(); i10++) {
            View childAt = vVar.getChildAt(i10);
            if (vVar.getLayoutManager() == null) {
                i7 = 0;
            } else {
                vVar.getLayoutManager().getClass();
                i7 = RecyclerView.U(childAt).f;
            }
            height = i7 == 2147483646 ? Math.min(height, childAt.getBottom()) : Math.min(height, childAt.getTop());
        }
        return height;
    }

    public org.telegram.ui.Components.qj0 getListView() {
        return this.b;
    }

    public float getProgress() {
        org.telegram.ui.web.u0 webView;
        t3 t3Var = this.L.K;
        if (c()) {
            float f10 = this.J;
            if (f10 >= 0.0f) {
                return f10;
            }
            v4.b0 b0Var = this.d;
            int L0 = b0Var.L0();
            if (b0Var.m(L0) != null) {
                int[] iArr = this.c.J;
                fi.v vVar = this.b;
                if (iArr != null) {
                    int i7 = L0 - 1;
                    return Utilities.l((((i7 < 0 || i7 >= iArr.length) ? 0 : iArr[i7]) + ((L0 != 0 || t3Var == null) ? -r4.getTop() : 0)) / Math.max(1, r5.K - vVar.getHeight()));
                }
                int N0 = b0Var.N0();
                if (t3Var != null) {
                    if (L0 < 1) {
                        L0 = 1;
                    }
                    if (N0 < 1) {
                        N0 = 1;
                    }
                }
                int B = b0Var.B() - 2;
                View m10 = N0 >= B ? b0Var.m(B) : b0Var.m(L0);
                if (m10 != null) {
                    float width = getWidth() / (r0 - 1);
                    float measuredHeight = m10.getMeasuredHeight();
                    return ((L0 * width) + (N0 >= B ? (((B - L0) * width) * (vVar.getMeasuredHeight() - m10.getTop())) / measuredHeight : (1.0f - ((Math.min(0, m10.getTop() - vVar.getPaddingTop()) + measuredHeight) / measuredHeight)) * width)) / getWidth();
                }
            }
        } else if (f() && (webView = this.f.getWebView()) != null) {
            return webView.getScrollProgress();
        }
        return 0.0f;
    }

    public String getSubtitle() {
        org.telegram.ui.web.u0 webView;
        l0 l0Var;
        if (!f() || (webView = this.f.getWebView()) == null) {
            return "";
        }
        if (TextUtils.equals(this.G, webView.getUrl())) {
            return this.H;
        }
        try {
            String url = webView.getUrl();
            this.G = url;
            Uri parse = Uri.parse(org.telegram.ui.web.x0.u(url));
            String uri = (parse.getScheme() == null || !(parse.getScheme().equalsIgnoreCase("http") || parse.getScheme().equalsIgnoreCase("https"))) ? parse.toString() : parse.getSchemeSpecificPart();
            try {
                if (!e()) {
                    try {
                        Uri parse2 = Uri.parse(uri);
                        if (parse2.getHost() != null) {
                            parse = parse2;
                        }
                        String a10 = vf.c.a(parse.getHost());
                        String[] split = a10.split("\\.");
                        if (split.length > 2 && (l0Var = this.L.h0) != null && fi.m3.h(a10, l0Var.E) > org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(162.0f)) {
                            a10 = split[split.length - 2] + '.' + split[split.length - 1];
                        }
                        uri = vf.c.w(parse, null, "", a10, null);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, false);
                    }
                    uri = URLDecoder.decode(uri.replaceAll("\\+", "%2b"), "UTF-8");
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
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
        org.telegram.ui.web.u0 webView;
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

    public org.telegram.ui.web.x0 getWebContainer() {
        return this.f;
    }

    public org.telegram.ui.web.u0 getWebView() {
        i3 i3Var = this.f;
        if (i3Var != null) {
            return i3Var.getWebView();
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
        int i7 = org.telegram.ui.ActionBar.l6.Dl;
        b3Var.b(org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.x0(null, i7, false)) <= 0.721f, false);
        org.telegram.ui.ActionBar.s6.h(i7, this.r, null);
    }

    public void setLastVisible(boolean z9) {
        if (this.I != z9) {
            this.I = z9;
            this.f.setKeyboardFocusable(z9);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        g4 g4Var = this.L;
        g4Var.d0();
        if (g4Var.f0.f) {
            g4Var.g0.invalidate();
        }
        if (g4Var.f0.e) {
            g4Var.g0.invalidate();
            g4Var.V((int) (((org.telegram.messenger.g0.L(56.0f) - g4Var.f0.h) * (f10 / getMeasuredWidth())) + g4Var.f0.h));
        }
        t3 t3Var = g4Var.K;
        if (t3Var != null) {
            t3Var.A();
        }
    }

    public void setType(int i7) {
        if (this.a != i7) {
            b();
        }
        this.a = i7;
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
                org.telegram.ui.web.u0 u0Var = x2Var.b;
                i3 i3Var = this.f;
                if (u0Var != null) {
                    u0Var.onResume();
                    i3Var.O(org.telegram.messenger.p10.s0, x2Var.b, x2Var.d, x2Var.x, false);
                    a(this, true, x2Var.q);
                    a(this, false, x2Var.r);
                } else {
                    String str = x2Var.x;
                    if (str != null) {
                        i3Var.t(org.telegram.messenger.p10.s0, str, false);
                    }
                }
            }
            org.telegram.ui.web.u1 u1Var = this.E;
            if (u1Var != null) {
                u1Var.a();
                org.telegram.ui.web.u1 u1Var2 = this.E;
                TLRPC.TL_webPage tL_webPage = u1Var2.j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.w1.o(tL_webPage);
                    u1Var2.j = null;
                }
                this.E = null;
            }
        }
    }
}
