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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l3 extends FrameLayout {
    public int E;
    public org.telegram.ui.web.s1 F;
    public boolean G;
    public String H;
    public String I;
    public boolean J;
    public float K;
    public y2 L;
    public final /* synthetic */ i4 M;
    public int a;
    public final gi.v b;
    public final g4 c;
    public final u4.b0 d;
    public final i3 e;
    public final j3 f;
    public boolean h;
    public boolean n;
    public c3 r;
    public boolean s;
    public boolean w;
    public int x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(i4 i4Var, Activity activity) {
        super(activity);
        this.M = i4Var;
        int i3 = org.telegram.ui.ActionBar.k6.Dl;
        this.x = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        this.y = x02;
        this.E = x02;
        this.G = false;
        this.K = -1.0f;
        new Matrix();
        gi.v vVar = new gi.v(this, activity);
        this.b = vVar;
        vVar.setClipToPadding(false);
        vVar.setPadding(0, org.telegram.messenger.g0.L(56.0f), 0, 0);
        vVar.setTopGlowOffset(org.telegram.messenger.g0.L(56.0f));
        ((u4.k) vVar.getItemAnimator()).C = false;
        g4 g4Var = new g4(i4Var, activity, i4Var.L != null);
        this.c = g4Var;
        vVar.setAdapter(g4Var);
        u4.b0 b0Var = new u4.b0(1, false);
        this.d = b0Var;
        vVar.setLayoutManager(b0Var);
        vVar.setOnScrollListener(new h3(this, 0));
        addView(vVar, b8.mf.c(-1.0f, -1));
        i3 i3Var = new i3(this, getContext());
        this.e = i3Var;
        i3Var.setShouldWaitWebViewScroll(true);
        i3Var.setFullSize(true);
        i3Var.setAllowFullSizeSwipe(true);
        j3 j3Var = new j3(this, getContext(), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
        this.f = j3Var;
        final int i10 = 0;
        j3Var.setOnCloseRequestedListener(new Runnable(this) { // from class: org.telegram.ui.f3
            public final /* synthetic */ l3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        i4 i4Var2 = this.b.M;
                        LaunchActivity launchActivity = LaunchActivity.K1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.b3 O = launchActivity.O();
                            if (O != null) {
                                boolean z10 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.b3.L;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) obj;
                                                if (a3Var.J == i4Var2) {
                                                    z10 = O.h(i11, a3Var, true);
                                                }
                                            }
                                        }
                                        i11++;
                                    }
                                }
                                if (z10) {
                                }
                            }
                            i4Var2.m(true, true);
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
                        c3 c3Var = l3Var.r;
                        if (c3Var != null) {
                            c3Var.a.setTranslationY(((i3Var2.getTopActionBarOffsetY() + (-i3Var2.getOffsetY())) - i3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        l3Var.M.d0();
                        break;
                }
            }
        });
        j3Var.setWebViewProgressListener(new g3(this, i10));
        j3Var.setDelegate(new k3(this));
        j3Var.setWebViewScrollListener(new f(this, 2));
        i3Var.addView(j3Var, b8.mf.c(-1.0f, -1));
        final int i11 = 1;
        i3Var.setScrollEndListener(new Runnable(this) { // from class: org.telegram.ui.f3
            public final /* synthetic */ l3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        i4 i4Var2 = this.b.M;
                        LaunchActivity launchActivity = LaunchActivity.K1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.b3 O = launchActivity.O();
                            if (O != null) {
                                boolean z10 = false;
                                int i112 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.b3.L;
                                    if (i112 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i112));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) obj;
                                                if (a3Var.J == i4Var2) {
                                                    z10 = O.h(i112, a3Var, true);
                                                }
                                            }
                                        }
                                        i112++;
                                    }
                                }
                                if (z10) {
                                }
                            }
                            i4Var2.m(true, true);
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
                        c3 c3Var = l3Var.r;
                        if (c3Var != null) {
                            c3Var.a.setTranslationY(((i3Var2.getTopActionBarOffsetY() + (-i3Var2.getOffsetY())) - i3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        l3Var.M.d0();
                        break;
                }
            }
        });
        i3Var.setDelegate(new x0(this, i11));
        final int i12 = 2;
        i3Var.setScrollListener(new Runnable(this) { // from class: org.telegram.ui.f3
            public final /* synthetic */ l3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        i4 i4Var2 = this.b.M;
                        LaunchActivity launchActivity = LaunchActivity.K1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.b3 O = launchActivity.O();
                            if (O != null) {
                                boolean z10 = false;
                                int i112 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.b3.L;
                                    if (i112 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i112));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i122 = 0;
                                            while (i122 < size) {
                                                Object obj = arrayList.get(i122);
                                                i122++;
                                                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) obj;
                                                if (a3Var.J == i4Var2) {
                                                    z10 = O.h(i112, a3Var, true);
                                                }
                                            }
                                        }
                                        i112++;
                                    }
                                }
                                if (z10) {
                                }
                            }
                            i4Var2.m(true, true);
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
                        c3 c3Var = l3Var.r;
                        if (c3Var != null) {
                            c3Var.a.setTranslationY(((i3Var2.getTopActionBarOffsetY() + (-i3Var2.getOffsetY())) - i3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        l3Var.M.d0();
                        break;
                }
            }
        });
        i3Var.setTopActionBarOffsetY(org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.m);
        addView(i3Var, b8.mf.c(-1.0f, -1));
        b();
        setType(0);
    }

    public static void a(l3 l3Var, boolean z10, int i3) {
        i4 i4Var = l3Var.M;
        u3 u3Var = i4Var.L;
        if (z10) {
            int w10 = org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false), i3);
            l3Var.x = w10;
            if (l3Var == i4Var.v0[0]) {
                if (org.telegram.messenger.az.v0) {
                    i4Var.i0.d(w10, true);
                }
                if (u3Var != null) {
                    u3Var.u();
                }
            }
        } else {
            int w11 = org.telegram.ui.ActionBar.k6.w(-1, i3);
            l3Var.y = w11;
            if (l3Var == i4Var.v0[0]) {
                if (org.telegram.messenger.az.v0) {
                    i4Var.i0.setMenuColors(w11);
                }
                if (u3Var != null) {
                    u3Var.u();
                }
            }
        }
        i4Var.d0();
    }

    public final void b() {
        this.s = false;
        this.w = false;
        setWeb(null);
        j3 j3Var = this.f;
        j3Var.h();
        j3Var.a = null;
        int i3 = org.telegram.ui.ActionBar.k6.Dl;
        this.x = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        this.y = x02;
        this.E = x02;
        c3 c3Var = this.r;
        if (c3Var != null) {
            c3Var.b(org.telegram.messenger.g0.B(x02) <= 0.721f, true);
            this.r.setBackgroundColor(this.y);
            c3 c3Var2 = this.r;
            this.n = false;
            org.telegram.messenger.g0.Z3(c3Var2, false, 1.0f, true, false);
        }
        g4 g4Var = this.c;
        g4Var.F = null;
        g4Var.e.clear();
        g4Var.f.clear();
        g4Var.s.clear();
        g4Var.w.clear();
        g4Var.h.clear();
        g4Var.r.clear();
        g4Var.n.clear();
        g4Var.y.clear();
        g4Var.x.clear();
        g4Var.G = null;
        g4Var.f();
        invalidate();
    }

    public final boolean c() {
        return this.a == 0;
    }

    public final boolean d() {
        g4 g4Var;
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        return (f() || (g4Var = this.c) == null || (webPage = g4Var.F) == null || (page = webPage.cached_page) == null || page.local == null) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e() {
        org.telegram.ui.web.t0 webView;
        String u10;
        return f() && (webView = getWebView()) != null && (u10 = org.telegram.ui.web.w0.u(webView.getUrl())) != null && org.telegram.ui.web.w0.p(Uri.parse(u10));
    }

    public final boolean f() {
        return this.a == 1;
    }

    public final void g() {
        if (c()) {
            u3 u3Var = this.M.L;
            this.d.h1(u3Var != null ? 1 : 0, u3Var != null ? org.telegram.messenger.g0.L(32.0f) : 0);
        } else if (f()) {
            i3 i3Var = this.e;
            i3Var.setSwipeOffsetY(i3Var.getTopActionBarOffsetY() + (-i3Var.getOffsetY()));
        }
    }

    public int getActionBarColor() {
        if (f() && org.telegram.messenger.az.v0) {
            return this.x;
        }
        int i3 = org.telegram.ui.ActionBar.k6.Dl;
        this.M.getClass();
        return org.telegram.ui.ActionBar.k6.v0(i3);
    }

    public g4 getAdapter() {
        return this.c;
    }

    public int getBackgroundColor() {
        return (f() && org.telegram.messenger.az.v0) ? this.n ? org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false) : this.y : org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false);
    }

    public float getListTop() {
        int i3;
        if (!c()) {
            if (f()) {
                return this.e.getTranslationY();
            }
            return 0.0f;
        }
        gi.v vVar = this.b;
        float height = vVar.getHeight();
        for (int i10 = 0; i10 < vVar.getChildCount(); i10++) {
            View childAt = vVar.getChildAt(i10);
            if (vVar.getLayoutManager() == null) {
                i3 = 0;
            } else {
                vVar.getLayoutManager().getClass();
                i3 = RecyclerView.U(childAt).f;
            }
            height = i3 == 2147483646 ? Math.min(height, childAt.getBottom()) : Math.min(height, childAt.getTop());
        }
        return height;
    }

    public org.telegram.ui.Components.tj0 getListView() {
        return this.b;
    }

    public float getProgress() {
        org.telegram.ui.web.t0 webView;
        u3 u3Var = this.M.L;
        if (c()) {
            float f10 = this.K;
            if (f10 >= 0.0f) {
                return f10;
            }
            u4.b0 b0Var = this.d;
            int L0 = b0Var.L0();
            if (b0Var.m(L0) != null) {
                int[] iArr = this.c.K;
                gi.v vVar = this.b;
                if (iArr != null) {
                    int i3 = L0 - 1;
                    return Utilities.l((((i3 < 0 || i3 >= iArr.length) ? 0 : iArr[i3]) + ((L0 != 0 || u3Var == null) ? -r4.getTop() : 0)) / Math.max(1, r5.L - vVar.getHeight()));
                }
                int N0 = b0Var.N0();
                if (u3Var != null) {
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
        org.telegram.ui.web.t0 webView;
        m0 m0Var;
        if (!f() || (webView = this.f.getWebView()) == null) {
            return "";
        }
        if (TextUtils.equals(this.H, webView.getUrl())) {
            return this.I;
        }
        try {
            String url = webView.getUrl();
            this.H = url;
            Uri parse = Uri.parse(org.telegram.ui.web.w0.u(url));
            String uri = (parse.getScheme() == null || !(parse.getScheme().equalsIgnoreCase("http") || parse.getScheme().equalsIgnoreCase("https"))) ? parse.toString() : parse.getSchemeSpecificPart();
            try {
                if (!e()) {
                    try {
                        Uri parse2 = Uri.parse(uri);
                        if (parse2.getHost() != null) {
                            parse = parse2;
                        }
                        String a10 = sf.c.a(parse.getHost());
                        String[] split = a10.split("\\.");
                        if (split.length > 2 && (m0Var = this.M.i0) != null && gi.l3.h(a10, m0Var.F) > org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(162.0f)) {
                            a10 = split[split.length - 2] + '.' + split[split.length - 1];
                        }
                        uri = sf.c.w(parse, null, "", a10, null);
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
        org.telegram.ui.web.t0 webView;
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

    public org.telegram.ui.web.w0 getWebContainer() {
        return this.f;
    }

    public org.telegram.ui.web.t0 getWebView() {
        j3 j3Var = this.f;
        if (j3Var != null) {
            return j3Var.getWebView();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        c3 c3Var;
        super.onAttachedToWindow();
        if (!this.n || (c3Var = this.r) == null) {
            return;
        }
        int i3 = org.telegram.ui.ActionBar.k6.Dl;
        c3Var.b(org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.x0(null, i3, false)) <= 0.721f, false);
        org.telegram.ui.ActionBar.r6.i(i3, this.r, null);
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
        i4 i4Var = this.M;
        i4Var.d0();
        if (i4Var.g0.f) {
            i4Var.h0.invalidate();
        }
        if (i4Var.g0.e) {
            i4Var.h0.invalidate();
            i4Var.V((int) (((org.telegram.messenger.g0.L(56.0f) - i4Var.g0.h) * (f10 / getMeasuredWidth())) + i4Var.g0.h));
        }
        u3 u3Var = i4Var.L;
        if (u3Var != null) {
            u3Var.A();
        }
    }

    public void setType(int i3) {
        if (this.a != i3) {
            b();
        }
        this.a = i3;
        this.b.setVisibility(c() ? 0 : 8);
        this.e.setVisibility(f() ? 0 : 8);
    }

    public void setWeb(y2 y2Var) {
        y2 y2Var2 = this.L;
        if (y2Var2 != y2Var) {
            if (y2Var2 != null) {
                y2Var2.c(this);
            }
            this.L = y2Var;
            if (y2Var != null) {
                org.telegram.ui.web.t0 t0Var = y2Var.b;
                j3 j3Var = this.f;
                if (t0Var != null) {
                    t0Var.onResume();
                    j3Var.N(org.telegram.messenger.h10.t0, y2Var.b, y2Var.d, y2Var.x, false);
                    a(this, true, y2Var.q);
                    a(this, false, y2Var.r);
                } else {
                    String str = y2Var.x;
                    if (str != null) {
                        j3Var.t(org.telegram.messenger.h10.t0, str, false);
                    }
                }
            }
            org.telegram.ui.web.s1 s1Var = this.F;
            if (s1Var != null) {
                s1Var.a();
                org.telegram.ui.web.s1 s1Var2 = this.F;
                TLRPC.TL_webPage tL_webPage = s1Var2.j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.u1.o(tL_webPage);
                    s1Var2.j = null;
                }
                this.F = null;
            }
        }
    }
}
