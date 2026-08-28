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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p3 extends FrameLayout {
    public boolean A;
    public String B;
    public String C;
    public boolean D;
    public float E;
    public c3 F;
    public final /* synthetic */ l4 G;
    public int a;
    public final kh.w b;
    public final j4 c;
    public final f2.m0 d;
    public final m3 e;
    public final n3 f;
    public boolean h;
    public boolean n;
    public g3 r;
    public boolean s;
    public boolean v;
    public int w;
    public int x;
    public org.telegram.ui.web.b2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(l4 l4Var, Activity activity) {
        super(activity);
        this.G = l4Var;
        int i9 = org.telegram.ui.ActionBar.f6.Pk;
        this.w = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        this.x = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        this.A = false;
        this.E = -1.0f;
        new Matrix();
        kh.w wVar = new kh.w(this, activity);
        this.b = wVar;
        wVar.setClipToPadding(false);
        wVar.setPadding(0, AndroidUtilities.dp(56.0f), 0, 0);
        wVar.setTopGlowOffset(AndroidUtilities.dp(56.0f));
        ((f2.n) wVar.getItemAnimator()).C = false;
        j4 j4Var = new j4(l4Var, activity, l4Var.G != null);
        this.c = j4Var;
        wVar.setAdapter(j4Var);
        f2.m0 m0Var = new f2.m0(1, false);
        this.d = m0Var;
        wVar.setLayoutManager(m0Var);
        wVar.setOnScrollListener(new l3(this, 0));
        addView(wVar, g7.e6.c(-1.0f, -1));
        m3 m3Var = new m3(this, getContext());
        this.e = m3Var;
        m3Var.setShouldWaitWebViewScroll(true);
        m3Var.setFullSize(true);
        m3Var.setAllowFullSizeSwipe(true);
        n3 n3Var = new n3(this, getContext(), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
        this.f = n3Var;
        final int i10 = 0;
        n3Var.setOnCloseRequestedListener(new Runnable(this) { // from class: org.telegram.ui.j3
            public final /* synthetic */ p3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        l4 l4Var2 = this.b.G;
                        LaunchActivity launchActivity = LaunchActivity.C1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.m3 P = launchActivity.P();
                            if (P != null) {
                                boolean z10 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.m3.G;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) obj;
                                                if (l3Var.H == l4Var2) {
                                                    z10 = P.h(i11, l3Var, true);
                                                }
                                            }
                                        }
                                        i11++;
                                    }
                                }
                                if (z10) {
                                }
                            }
                            l4Var2.o(true, true);
                            break;
                        }
                        break;
                    case 1:
                        this.b.f.n(true, false);
                        break;
                    default:
                        p3 p3Var = this.b;
                        m3 m3Var2 = p3Var.e;
                        p3Var.f.n(false, false);
                        g3 g3Var = p3Var.r;
                        if (g3Var != null) {
                            g3Var.a.setTranslationY(((m3Var2.getTopActionBarOffsetY() + (-m3Var2.getOffsetY())) - m3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        p3Var.G.f0();
                        break;
                }
            }
        });
        n3Var.setWebViewProgressListener(new k3(this, i10));
        n3Var.setDelegate(new o3(this));
        n3Var.setWebViewScrollListener(new g(this, 2));
        m3Var.addView(n3Var, g7.e6.c(-1.0f, -1));
        final int i11 = 1;
        m3Var.setScrollEndListener(new Runnable(this) { // from class: org.telegram.ui.j3
            public final /* synthetic */ p3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        l4 l4Var2 = this.b.G;
                        LaunchActivity launchActivity = LaunchActivity.C1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.m3 P = launchActivity.P();
                            if (P != null) {
                                boolean z10 = false;
                                int i112 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.m3.G;
                                    if (i112 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i112));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) obj;
                                                if (l3Var.H == l4Var2) {
                                                    z10 = P.h(i112, l3Var, true);
                                                }
                                            }
                                        }
                                        i112++;
                                    }
                                }
                                if (z10) {
                                }
                            }
                            l4Var2.o(true, true);
                            break;
                        }
                        break;
                    case 1:
                        this.b.f.n(true, false);
                        break;
                    default:
                        p3 p3Var = this.b;
                        m3 m3Var2 = p3Var.e;
                        p3Var.f.n(false, false);
                        g3 g3Var = p3Var.r;
                        if (g3Var != null) {
                            g3Var.a.setTranslationY(((m3Var2.getTopActionBarOffsetY() + (-m3Var2.getOffsetY())) - m3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        p3Var.G.f0();
                        break;
                }
            }
        });
        m3Var.setDelegate(new b1(this, i11));
        final int i12 = 2;
        m3Var.setScrollListener(new Runnable(this) { // from class: org.telegram.ui.j3
            public final /* synthetic */ p3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        l4 l4Var2 = this.b.G;
                        LaunchActivity launchActivity = LaunchActivity.C1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.m3 P = launchActivity.P();
                            if (P != null) {
                                boolean z10 = false;
                                int i112 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.m3.G;
                                    if (i112 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i112));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i122 = 0;
                                            while (i122 < size) {
                                                Object obj = arrayList.get(i122);
                                                i122++;
                                                org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) obj;
                                                if (l3Var.H == l4Var2) {
                                                    z10 = P.h(i112, l3Var, true);
                                                }
                                            }
                                        }
                                        i112++;
                                    }
                                }
                                if (z10) {
                                }
                            }
                            l4Var2.o(true, true);
                            break;
                        }
                        break;
                    case 1:
                        this.b.f.n(true, false);
                        break;
                    default:
                        p3 p3Var = this.b;
                        m3 m3Var2 = p3Var.e;
                        p3Var.f.n(false, false);
                        g3 g3Var = p3Var.r;
                        if (g3Var != null) {
                            g3Var.a.setTranslationY(((m3Var2.getTopActionBarOffsetY() + (-m3Var2.getOffsetY())) - m3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        p3Var.G.f0();
                        break;
                }
            }
        });
        m3Var.setTopActionBarOffsetY(AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight);
        addView(m3Var, g7.e6.c(-1.0f, -1));
        b();
        setType(0);
    }

    public static void a(p3 p3Var, boolean z10, int i9) {
        l4 l4Var = p3Var.G;
        y3 y3Var = l4Var.G;
        if (z10) {
            int v = org.telegram.ui.ActionBar.f6.v(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Pk, false), i9);
            p3Var.w = v;
            if (p3Var == l4Var.q0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    l4Var.d0.d(v, true);
                }
                if (y3Var != null) {
                    y3Var.i();
                }
            }
        } else {
            int v4 = org.telegram.ui.ActionBar.f6.v(-1, i9);
            p3Var.x = v4;
            if (p3Var == l4Var.q0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    l4Var.d0.setMenuColors(v4);
                }
                if (y3Var != null) {
                    y3Var.i();
                }
            }
        }
        l4Var.f0();
    }

    public final void b() {
        this.s = false;
        this.v = false;
        setWeb(null);
        n3 n3Var = this.f;
        n3Var.h();
        n3Var.a = null;
        int i9 = org.telegram.ui.ActionBar.f6.Pk;
        this.w = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        this.x = w02;
        g3 g3Var = this.r;
        if (g3Var != null) {
            g3Var.b(AndroidUtilities.computePerceivedBrightness(w02) <= 0.721f, true);
            this.r.setBackgroundColor(this.x);
            g3 g3Var2 = this.r;
            this.n = false;
            AndroidUtilities.updateViewVisibilityAnimated(g3Var2, false, 1.0f, false);
        }
        j4 j4Var = this.c;
        j4Var.A = null;
        j4Var.e.clear();
        j4Var.f.clear();
        j4Var.s.clear();
        j4Var.v.clear();
        j4Var.h.clear();
        j4Var.r.clear();
        j4Var.n.clear();
        j4Var.x.clear();
        j4Var.w.clear();
        j4Var.B = null;
        j4Var.l();
        invalidate();
    }

    public final boolean c() {
        return this.a == 0;
    }

    public final boolean d() {
        j4 j4Var;
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        return (f() || (j4Var = this.c) == null || (webPage = j4Var.A) == null || (page = webPage.cached_page) == null || page.local == null) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e() {
        org.telegram.ui.web.v0 webView;
        String s10;
        return f() && (webView = getWebView()) != null && (s10 = org.telegram.ui.web.y0.s(webView.getUrl())) != null && org.telegram.ui.web.y0.o(Uri.parse(s10));
    }

    public final boolean f() {
        return this.a == 1;
    }

    public final void g() {
        if (c()) {
            y3 y3Var = this.G.G;
            this.d.h1(y3Var != null ? 1 : 0, y3Var != null ? AndroidUtilities.dp(32.0f) : 0);
        } else if (f()) {
            m3 m3Var = this.e;
            m3Var.setSwipeOffsetY(m3Var.getTopActionBarOffsetY() + (-m3Var.getOffsetY()));
        }
    }

    public int getActionBarColor() {
        if (f() && SharedConfig.adaptableColorInBrowser) {
            return this.w;
        }
        int i9 = org.telegram.ui.ActionBar.f6.Pk;
        this.G.getClass();
        return org.telegram.ui.ActionBar.f6.w0(null, i9, false);
    }

    public j4 getAdapter() {
        return this.c;
    }

    public int getBackgroundColor() {
        return (f() && SharedConfig.adaptableColorInBrowser) ? this.n ? org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Pk, false) : this.x : org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Pk, false);
    }

    public float getListTop() {
        int i9;
        if (!c()) {
            if (f()) {
                return this.e.getTranslationY();
            }
            return 0.0f;
        }
        kh.w wVar = this.b;
        float height = wVar.getHeight();
        for (int i10 = 0; i10 < wVar.getChildCount(); i10++) {
            View childAt = wVar.getChildAt(i10);
            if (wVar.getLayoutManager() == null) {
                i9 = 0;
            } else {
                wVar.getLayoutManager().getClass();
                i9 = RecyclerView.U(childAt).f;
            }
            height = i9 == 2147483646 ? Math.min(height, childAt.getBottom()) : Math.min(height, childAt.getTop());
        }
        return height;
    }

    public org.telegram.ui.Components.wk0 getListView() {
        return this.b;
    }

    public float getProgress() {
        org.telegram.ui.web.v0 webView;
        y3 y3Var = this.G.G;
        if (c()) {
            float f10 = this.E;
            if (f10 >= 0.0f) {
                return f10;
            }
            f2.m0 m0Var = this.d;
            int L0 = m0Var.L0();
            if (m0Var.m(L0) != null) {
                int[] iArr = this.c.E;
                kh.w wVar = this.b;
                if (iArr != null) {
                    int i9 = L0 - 1;
                    return Utilities.clamp01((((i9 < 0 || i9 >= iArr.length) ? 0 : iArr[i9]) + ((L0 != 0 || y3Var == null) ? -r4.getTop() : 0)) / Math.max(1, r5.F - wVar.getHeight()));
                }
                int N0 = m0Var.N0();
                if (y3Var != null) {
                    if (L0 < 1) {
                        L0 = 1;
                    }
                    if (N0 < 1) {
                        N0 = 1;
                    }
                }
                int B = m0Var.B() - 2;
                View m10 = N0 >= B ? m0Var.m(B) : m0Var.m(L0);
                if (m10 != null) {
                    float width = getWidth() / (r0 - 1);
                    float measuredHeight = m10.getMeasuredHeight();
                    return ((L0 * width) + (N0 >= B ? (((B - L0) * width) * (wVar.getMeasuredHeight() - m10.getTop())) / measuredHeight : (1.0f - ((Math.min(0, m10.getTop() - wVar.getPaddingTop()) + measuredHeight) / measuredHeight)) * width)) / getWidth();
                }
            }
        } else if (f() && (webView = this.f.getWebView()) != null) {
            return webView.getScrollProgress();
        }
        return 0.0f;
    }

    public String getSubtitle() {
        org.telegram.ui.web.v0 webView;
        n0 n0Var;
        if (!f() || (webView = this.f.getWebView()) == null) {
            return "";
        }
        if (TextUtils.equals(this.B, webView.getUrl())) {
            return this.C;
        }
        try {
            String url = webView.getUrl();
            this.B = url;
            Uri parse = Uri.parse(org.telegram.ui.web.y0.s(url));
            String uri = (parse.getScheme() == null || !(parse.getScheme().equalsIgnoreCase("http") || parse.getScheme().equalsIgnoreCase("https"))) ? parse.toString() : parse.getSchemeSpecificPart();
            try {
                if (!e()) {
                    try {
                        Uri parse2 = Uri.parse(uri);
                        if (parse2.getHost() != null) {
                            parse = parse2;
                        }
                        String a2 = ve.e.a(parse.getHost());
                        String[] split = a2.split("\\.");
                        if (split.length > 2 && (n0Var = this.G.d0) != null && kh.x3.g(a2, n0Var.A) > AndroidUtilities.displaySize.x - AndroidUtilities.dp(162.0f)) {
                            a2 = split[split.length - 2] + '.' + split[split.length - 1];
                        }
                        uri = ve.e.v(parse, null, "", a2, null);
                    } catch (Exception e10) {
                        FileLog.e((Throwable) e10, false);
                    }
                    uri = URLDecoder.decode(uri.replaceAll("\\+", "%2b"), "UTF-8");
                }
            } catch (Exception e11) {
                FileLog.e(e11);
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
            this.C = uri;
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
            TLRPC.WebPage webPage = this.c.A;
            if (webPage != null && (str2 = webPage.site_name) != null) {
                return str2;
            }
            if (webPage != null && (str = webPage.title) != null) {
                return str;
            }
        }
        return (!f() || (webView = this.f.getWebView()) == null) ? "" : webView.getTitle();
    }

    public org.telegram.ui.web.y0 getWebContainer() {
        return this.f;
    }

    public org.telegram.ui.web.v0 getWebView() {
        n3 n3Var = this.f;
        if (n3Var != null) {
            return n3Var.getWebView();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        g3 g3Var;
        super.onAttachedToWindow();
        if (!this.n || (g3Var = this.r) == null) {
            return;
        }
        int i9 = org.telegram.ui.ActionBar.f6.Pk;
        g3Var.b(AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.w0(null, i9, false)) <= 0.721f, false);
        this.r.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
    }

    public void setLastVisible(boolean z10) {
        if (this.D != z10) {
            this.D = z10;
            this.f.setKeyboardFocusable(z10);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        l4 l4Var = this.G;
        l4Var.f0();
        if (l4Var.b0.f) {
            l4Var.c0.invalidate();
        }
        if (l4Var.b0.e) {
            l4Var.c0.invalidate();
            l4Var.X((int) (((AndroidUtilities.dp(56.0f) - l4Var.b0.h) * (f10 / getMeasuredWidth())) + l4Var.b0.h));
        }
        y3 y3Var = l4Var.G;
        if (y3Var != null) {
            y3Var.n();
        }
    }

    public void setType(int i9) {
        if (this.a != i9) {
            b();
        }
        this.a = i9;
        this.b.setVisibility(c() ? 0 : 8);
        this.e.setVisibility(f() ? 0 : 8);
    }

    public void setWeb(c3 c3Var) {
        c3 c3Var2 = this.F;
        if (c3Var2 != c3Var) {
            if (c3Var2 != null) {
                c3Var2.c(this);
            }
            this.F = c3Var;
            if (c3Var != null) {
                org.telegram.ui.web.v0 v0Var = c3Var.b;
                n3 n3Var = this.f;
                if (v0Var != null) {
                    v0Var.onResume();
                    int i9 = UserConfig.selectedAccount;
                    org.telegram.ui.web.v0 v0Var2 = c3Var.b;
                    Object obj = c3Var.d;
                    n3Var.I = i9;
                    n3Var.Q(v0Var2, obj);
                    if (n3Var.k0) {
                        n3Var.v("visibility_changed", org.telegram.ui.web.y0.x(Boolean.TRUE, "is_visible"));
                    }
                    a(this, true, c3Var.o);
                    a(this, false, c3Var.p);
                } else {
                    String str = c3Var.v;
                    if (str != null) {
                        n3Var.r(UserConfig.selectedAccount, str);
                    }
                }
            }
            org.telegram.ui.web.b2 b2Var = this.y;
            if (b2Var != null) {
                b2Var.a();
                org.telegram.ui.web.b2 b2Var2 = this.y;
                TLRPC.TL_webPage tL_webPage = b2Var2.j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.d2.o(tL_webPage);
                    b2Var2.j = null;
                }
                this.y = null;
            }
        }
    }
}
