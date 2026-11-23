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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class k3 extends FrameLayout {
    public int E;
    public org.telegram.ui.web.u1 F;
    public boolean G;
    public String H;
    public String I;
    public boolean J;
    public float K;
    public x2 L;
    public final /* synthetic */ g4 M;
    public int a;
    public final hi.e0 b;
    public final e4 c;
    public final v4.c0 d;
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
        this.M = g4Var;
        int i7 = org.telegram.ui.ActionBar.n6.Gl;
        this.x = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        this.y = x02;
        this.E = x02;
        this.G = false;
        this.K = -1.0f;
        new Matrix();
        hi.e0 e0Var = new hi.e0(this, activity);
        this.b = e0Var;
        e0Var.setClipToPadding(false);
        e0Var.setPadding(0, org.telegram.messenger.g0.L(56.0f), 0, 0);
        e0Var.setTopGlowOffset(org.telegram.messenger.g0.L(56.0f));
        ((v4.l) e0Var.getItemAnimator()).C = false;
        e4 e4Var = new e4(g4Var, activity, g4Var.L != null);
        this.c = e4Var;
        e0Var.setAdapter(e4Var);
        v4.c0 c0Var = new v4.c0(1, false);
        this.d = c0Var;
        e0Var.setLayoutManager(c0Var);
        e0Var.setOnScrollListener(new g3(this, 0));
        addView(e0Var, c8.na.c(-1.0f, -1));
        h3 h3Var = new h3(this, getContext());
        this.e = h3Var;
        h3Var.setShouldWaitWebViewScroll(true);
        h3Var.setFullSize(true);
        h3Var.setAllowFullSizeSwipe(true);
        i3 i3Var = new i3(this, getContext(), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d6, false));
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
                        g4 g4Var2 = this.b.M;
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.f3 N = launchActivity.N();
                            if (N != null) {
                                boolean z10 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.f3.L;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj;
                                                if (e3Var.J == g4Var2) {
                                                    z10 = N.h(i11, e3Var, true);
                                                }
                                            }
                                        }
                                        i11++;
                                    }
                                }
                                if (z10) {
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
                        k3Var.M.d0();
                        break;
                }
            }
        });
        i3Var.setWebViewProgressListener(new f3(this, i10));
        i3Var.setDelegate(new j3(this));
        i3Var.setWebViewScrollListener(new f(this, 2));
        h3Var.addView(i3Var, c8.na.c(-1.0f, -1));
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
                        g4 g4Var2 = this.b.M;
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.f3 N = launchActivity.N();
                            if (N != null) {
                                boolean z10 = false;
                                int i112 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.f3.L;
                                    if (i112 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i112));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj;
                                                if (e3Var.J == g4Var2) {
                                                    z10 = N.h(i112, e3Var, true);
                                                }
                                            }
                                        }
                                        i112++;
                                    }
                                }
                                if (z10) {
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
                        k3Var.M.d0();
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
                        g4 g4Var2 = this.b.M;
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.f3 N = launchActivity.N();
                            if (N != null) {
                                boolean z10 = false;
                                int i112 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.f3.L;
                                    if (i112 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i112));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i122 = 0;
                                            while (i122 < size) {
                                                Object obj = arrayList.get(i122);
                                                i122++;
                                                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj;
                                                if (e3Var.J == g4Var2) {
                                                    z10 = N.h(i112, e3Var, true);
                                                }
                                            }
                                        }
                                        i112++;
                                    }
                                }
                                if (z10) {
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
                        k3Var.M.d0();
                        break;
                }
            }
        });
        h3Var.setTopActionBarOffsetY(org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.m);
        addView(h3Var, c8.na.c(-1.0f, -1));
        b();
        setType(0);
    }

    public static void a(k3 k3Var, boolean z10, int i7) {
        g4 g4Var = k3Var.M;
        t3 t3Var = g4Var.L;
        if (z10) {
            int w10 = org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gl, false), i7);
            k3Var.x = w10;
            if (k3Var == g4Var.v0[0]) {
                if (org.telegram.messenger.bz.v0) {
                    g4Var.i0.d(w10, true);
                }
                if (t3Var != null) {
                    t3Var.u();
                }
            }
        } else {
            int w11 = org.telegram.ui.ActionBar.n6.w(-1, i7);
            k3Var.y = w11;
            if (k3Var == g4Var.v0[0]) {
                if (org.telegram.messenger.bz.v0) {
                    g4Var.i0.setMenuColors(w11);
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
        int i7 = org.telegram.ui.ActionBar.n6.Gl;
        this.x = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        this.y = x02;
        this.E = x02;
        b3 b3Var = this.r;
        if (b3Var != null) {
            b3Var.b(org.telegram.messenger.g0.B(x02) <= 0.721f, true);
            this.r.setBackgroundColor(this.y);
            b3 b3Var2 = this.r;
            this.n = false;
            org.telegram.messenger.g0.X3(b3Var2, false, 1.0f, true, false);
        }
        e4 e4Var = this.c;
        e4Var.F = null;
        e4Var.e.clear();
        e4Var.f.clear();
        e4Var.s.clear();
        e4Var.w.clear();
        e4Var.h.clear();
        e4Var.r.clear();
        e4Var.n.clear();
        e4Var.y.clear();
        e4Var.x.clear();
        e4Var.G = null;
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
        return (f() || (e4Var = this.c) == null || (webPage = e4Var.F) == null || (page = webPage.cached_page) == null || page.local == null) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e() {
        org.telegram.ui.web.s0 webView;
        String u10;
        return f() && (webView = getWebView()) != null && (u10 = org.telegram.ui.web.v0.u(webView.getUrl())) != null && org.telegram.ui.web.v0.p(Uri.parse(u10));
    }

    public final boolean f() {
        return this.a == 1;
    }

    public final void g() {
        if (c()) {
            t3 t3Var = this.M.L;
            this.d.h1(t3Var != null ? 1 : 0, t3Var != null ? org.telegram.messenger.g0.L(32.0f) : 0);
        } else if (f()) {
            h3 h3Var = this.e;
            h3Var.setSwipeOffsetY(h3Var.getTopActionBarOffsetY() + (-h3Var.getOffsetY()));
        }
    }

    public int getActionBarColor() {
        if (f() && org.telegram.messenger.bz.v0) {
            return this.x;
        }
        int i7 = org.telegram.ui.ActionBar.n6.Gl;
        this.M.getClass();
        return org.telegram.ui.ActionBar.n6.v0(i7);
    }

    public e4 getAdapter() {
        return this.c;
    }

    public int getBackgroundColor() {
        return (f() && org.telegram.messenger.bz.v0) ? this.n ? org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gl, false) : this.y : org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Gl, false);
    }

    public float getListTop() {
        int i7;
        if (!c()) {
            if (f()) {
                return this.e.getTranslationY();
            }
            return 0.0f;
        }
        hi.e0 e0Var = this.b;
        float height = e0Var.getHeight();
        for (int i10 = 0; i10 < e0Var.getChildCount(); i10++) {
            View childAt = e0Var.getChildAt(i10);
            if (e0Var.getLayoutManager() == null) {
                i7 = 0;
            } else {
                e0Var.getLayoutManager().getClass();
                i7 = RecyclerView.U(childAt).f;
            }
            height = i7 == 2147483646 ? Math.min(height, childAt.getBottom()) : Math.min(height, childAt.getTop());
        }
        return height;
    }

    public org.telegram.ui.Components.ek0 getListView() {
        return this.b;
    }

    public float getProgress() {
        org.telegram.ui.web.s0 webView;
        t3 t3Var = this.M.L;
        if (c()) {
            float f10 = this.K;
            if (f10 >= 0.0f) {
                return f10;
            }
            v4.c0 c0Var = this.d;
            int L0 = c0Var.L0();
            if (c0Var.m(L0) != null) {
                int[] iArr = this.c.K;
                hi.e0 e0Var = this.b;
                if (iArr != null) {
                    int i7 = L0 - 1;
                    return Utilities.l((((i7 < 0 || i7 >= iArr.length) ? 0 : iArr[i7]) + ((L0 != 0 || t3Var == null) ? -r4.getTop() : 0)) / Math.max(1, r5.L - e0Var.getHeight()));
                }
                int N0 = c0Var.N0();
                if (t3Var != null) {
                    if (L0 < 1) {
                        L0 = 1;
                    }
                    if (N0 < 1) {
                        N0 = 1;
                    }
                }
                int B = c0Var.B() - 2;
                View m10 = N0 >= B ? c0Var.m(B) : c0Var.m(L0);
                if (m10 != null) {
                    float width = getWidth() / (r0 - 1);
                    float measuredHeight = m10.getMeasuredHeight();
                    return ((L0 * width) + (N0 >= B ? (((B - L0) * width) * (e0Var.getMeasuredHeight() - m10.getTop())) / measuredHeight : (1.0f - ((Math.min(0, m10.getTop() - e0Var.getPaddingTop()) + measuredHeight) / measuredHeight)) * width)) / getWidth();
                }
            }
        } else if (f() && (webView = this.f.getWebView()) != null) {
            return webView.getScrollProgress();
        }
        return 0.0f;
    }

    public String getSubtitle() {
        org.telegram.ui.web.s0 webView;
        l0 l0Var;
        if (!f() || (webView = this.f.getWebView()) == null) {
            return "";
        }
        if (TextUtils.equals(this.H, webView.getUrl())) {
            return this.I;
        }
        try {
            String url = webView.getUrl();
            this.H = url;
            Uri parse = Uri.parse(org.telegram.ui.web.v0.u(url));
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
                        if (split.length > 2 && (l0Var = this.M.i0) != null && hi.u3.h(a10, l0Var.F) > org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(162.0f)) {
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
            this.I = uri;
            return uri;
        } catch (Exception unused) {
            return webView.getUrl();
        }
    }

    public String getTitle() {
        org.telegram.ui.web.s0 webView;
        String str;
        String str2;
        if (c()) {
            TLRPC.WebPage webPage = this.c.F;
            if (webPage != null && (str2 = webPage.site_name) != null) {
                return str2;
            }
            if (webPage != null && (str = webPage.title) != null) {
                return str;
            }
        }
        return (!f() || (webView = this.f.getWebView()) == null) ? "" : webView.getTitle();
    }

    public org.telegram.ui.web.v0 getWebContainer() {
        return this.f;
    }

    public org.telegram.ui.web.s0 getWebView() {
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
        int i7 = org.telegram.ui.ActionBar.n6.Gl;
        b3Var.b(org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.x0(null, i7, false)) <= 0.721f, false);
        org.telegram.ui.ActionBar.u6.h(i7, this.r, null);
    }

    public void setLastVisible(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            this.f.setKeyboardFocusable(z10);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        g4 g4Var = this.M;
        g4Var.d0();
        if (g4Var.g0.f) {
            g4Var.h0.invalidate();
        }
        if (g4Var.g0.e) {
            g4Var.h0.invalidate();
            g4Var.V((int) (((org.telegram.messenger.g0.L(56.0f) - g4Var.g0.h) * (f10 / getMeasuredWidth())) + g4Var.g0.h));
        }
        t3 t3Var = g4Var.L;
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
        x2 x2Var2 = this.L;
        if (x2Var2 != x2Var) {
            if (x2Var2 != null) {
                x2Var2.c(this);
            }
            this.L = x2Var;
            if (x2Var != null) {
                org.telegram.ui.web.s0 s0Var = x2Var.b;
                i3 i3Var = this.f;
                if (s0Var != null) {
                    s0Var.onResume();
                    i3Var.O(org.telegram.messenger.i10.t0, x2Var.b, x2Var.d, x2Var.x, false);
                    a(this, true, x2Var.q);
                    a(this, false, x2Var.r);
                } else {
                    String str = x2Var.x;
                    if (str != null) {
                        i3Var.t(org.telegram.messenger.i10.t0, str, false);
                    }
                }
            }
            org.telegram.ui.web.u1 u1Var = this.F;
            if (u1Var != null) {
                u1Var.a();
                org.telegram.ui.web.u1 u1Var2 = this.F;
                TLRPC.TL_webPage tL_webPage = u1Var2.j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.w1.o(tL_webPage);
                    u1Var2.j = null;
                }
                this.F = null;
            }
        }
    }
}
