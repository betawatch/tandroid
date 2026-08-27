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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class q3 extends FrameLayout {
    public boolean A;
    public String B;
    public String C;
    public boolean D;
    public float E;
    public d3 F;
    public final /* synthetic */ m4 G;
    public int a;
    public final lh.w b;
    public final k4 c;
    public final f2.k0 d;
    public final n3 e;
    public final o3 f;
    public boolean h;
    public boolean n;
    public h3 r;
    public boolean s;
    public boolean v;
    public int w;
    public int x;
    public org.telegram.ui.web.c2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(m4 m4Var, Activity activity) {
        super(activity);
        this.G = m4Var;
        int i10 = org.telegram.ui.ActionBar.g6.Pk;
        this.w = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        this.x = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        this.A = false;
        this.E = -1.0f;
        new Matrix();
        lh.w wVar = new lh.w(this, activity);
        this.b = wVar;
        wVar.setClipToPadding(false);
        wVar.setPadding(0, AndroidUtilities.dp(56.0f), 0, 0);
        wVar.setTopGlowOffset(AndroidUtilities.dp(56.0f));
        ((f2.l) wVar.getItemAnimator()).C = false;
        k4 k4Var = new k4(m4Var, activity, m4Var.G != null);
        this.c = k4Var;
        wVar.setAdapter(k4Var);
        f2.k0 k0Var = new f2.k0(1, false);
        this.d = k0Var;
        wVar.setLayoutManager(k0Var);
        wVar.setOnScrollListener(new m3(this, 0));
        addView(wVar, h7.z5.c(-1.0f, -1));
        n3 n3Var = new n3(this, getContext());
        this.e = n3Var;
        n3Var.setShouldWaitWebViewScroll(true);
        n3Var.setFullSize(true);
        n3Var.setAllowFullSizeSwipe(true);
        o3 o3Var = new o3(this, getContext(), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        this.f = o3Var;
        final int i11 = 0;
        o3Var.setOnCloseRequestedListener(new Runnable(this) { // from class: org.telegram.ui.k3
            public final /* synthetic */ q3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        m4 m4Var2 = this.b.G;
                        LaunchActivity launchActivity = LaunchActivity.C1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.m3 P = launchActivity.P();
                            if (P != null) {
                                boolean z10 = false;
                                int i12 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.m3.G;
                                    if (i12 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i12));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj = arrayList.get(i13);
                                                i13++;
                                                org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) obj;
                                                if (l3Var.H == m4Var2) {
                                                    z10 = P.h(i12, l3Var, true);
                                                }
                                            }
                                        }
                                        i12++;
                                    }
                                }
                                if (z10) {
                                }
                            }
                            m4Var2.o(true, true);
                            break;
                        }
                        break;
                    case 1:
                        this.b.f.n(true, false);
                        break;
                    default:
                        q3 q3Var = this.b;
                        n3 n3Var2 = q3Var.e;
                        q3Var.f.n(false, false);
                        h3 h3Var = q3Var.r;
                        if (h3Var != null) {
                            h3Var.a.setTranslationY(((n3Var2.getTopActionBarOffsetY() + (-n3Var2.getOffsetY())) - n3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        q3Var.G.f0();
                        break;
                }
            }
        });
        o3Var.setWebViewProgressListener(new l3(this, i11));
        o3Var.setDelegate(new p3(this));
        o3Var.setWebViewScrollListener(new g(this, 2));
        n3Var.addView(o3Var, h7.z5.c(-1.0f, -1));
        final int i12 = 1;
        n3Var.setScrollEndListener(new Runnable(this) { // from class: org.telegram.ui.k3
            public final /* synthetic */ q3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        m4 m4Var2 = this.b.G;
                        LaunchActivity launchActivity = LaunchActivity.C1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.m3 P = launchActivity.P();
                            if (P != null) {
                                boolean z10 = false;
                                int i122 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.m3.G;
                                    if (i122 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i122));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj = arrayList.get(i13);
                                                i13++;
                                                org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) obj;
                                                if (l3Var.H == m4Var2) {
                                                    z10 = P.h(i122, l3Var, true);
                                                }
                                            }
                                        }
                                        i122++;
                                    }
                                }
                                if (z10) {
                                }
                            }
                            m4Var2.o(true, true);
                            break;
                        }
                        break;
                    case 1:
                        this.b.f.n(true, false);
                        break;
                    default:
                        q3 q3Var = this.b;
                        n3 n3Var2 = q3Var.e;
                        q3Var.f.n(false, false);
                        h3 h3Var = q3Var.r;
                        if (h3Var != null) {
                            h3Var.a.setTranslationY(((n3Var2.getTopActionBarOffsetY() + (-n3Var2.getOffsetY())) - n3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        q3Var.G.f0();
                        break;
                }
            }
        });
        n3Var.setDelegate(new c1(this, i12));
        final int i13 = 2;
        n3Var.setScrollListener(new Runnable(this) { // from class: org.telegram.ui.k3
            public final /* synthetic */ q3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        m4 m4Var2 = this.b.G;
                        LaunchActivity launchActivity = LaunchActivity.C1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.m3 P = launchActivity.P();
                            if (P != null) {
                                boolean z10 = false;
                                int i122 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.m3.G;
                                    if (i122 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i122));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i132 = 0;
                                            while (i132 < size) {
                                                Object obj = arrayList.get(i132);
                                                i132++;
                                                org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) obj;
                                                if (l3Var.H == m4Var2) {
                                                    z10 = P.h(i122, l3Var, true);
                                                }
                                            }
                                        }
                                        i122++;
                                    }
                                }
                                if (z10) {
                                }
                            }
                            m4Var2.o(true, true);
                            break;
                        }
                        break;
                    case 1:
                        this.b.f.n(true, false);
                        break;
                    default:
                        q3 q3Var = this.b;
                        n3 n3Var2 = q3Var.e;
                        q3Var.f.n(false, false);
                        h3 h3Var = q3Var.r;
                        if (h3Var != null) {
                            h3Var.a.setTranslationY(((n3Var2.getTopActionBarOffsetY() + (-n3Var2.getOffsetY())) - n3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        q3Var.G.f0();
                        break;
                }
            }
        });
        n3Var.setTopActionBarOffsetY(AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight);
        addView(n3Var, h7.z5.c(-1.0f, -1));
        b();
        setType(0);
    }

    public static void a(q3 q3Var, boolean z10, int i10) {
        m4 m4Var = q3Var.G;
        z3 z3Var = m4Var.G;
        if (z10) {
            int v = org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false), i10);
            q3Var.w = v;
            if (q3Var == m4Var.q0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    m4Var.d0.d(v, true);
                }
                if (z3Var != null) {
                    z3Var.i();
                }
            }
        } else {
            int v4 = org.telegram.ui.ActionBar.g6.v(-1, i10);
            q3Var.x = v4;
            if (q3Var == m4Var.q0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    m4Var.d0.setMenuColors(v4);
                }
                if (z3Var != null) {
                    z3Var.i();
                }
            }
        }
        m4Var.f0();
    }

    public final void b() {
        this.s = false;
        this.v = false;
        setWeb(null);
        o3 o3Var = this.f;
        o3Var.h();
        o3Var.a = null;
        int i10 = org.telegram.ui.ActionBar.g6.Pk;
        this.w = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        this.x = w02;
        h3 h3Var = this.r;
        if (h3Var != null) {
            h3Var.b(AndroidUtilities.computePerceivedBrightness(w02) <= 0.721f, true);
            this.r.setBackgroundColor(this.x);
            h3 h3Var2 = this.r;
            this.n = false;
            AndroidUtilities.updateViewVisibilityAnimated(h3Var2, false, 1.0f, false);
        }
        k4 k4Var = this.c;
        k4Var.A = null;
        k4Var.e.clear();
        k4Var.f.clear();
        k4Var.s.clear();
        k4Var.v.clear();
        k4Var.h.clear();
        k4Var.r.clear();
        k4Var.n.clear();
        k4Var.x.clear();
        k4Var.w.clear();
        k4Var.B = null;
        k4Var.l();
        invalidate();
    }

    public final boolean c() {
        return this.a == 0;
    }

    public final boolean d() {
        k4 k4Var;
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        return (f() || (k4Var = this.c) == null || (webPage = k4Var.A) == null || (page = webPage.cached_page) == null || page.local == null) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e() {
        org.telegram.ui.web.w0 webView;
        String s10;
        return f() && (webView = getWebView()) != null && (s10 = org.telegram.ui.web.z0.s(webView.getUrl())) != null && org.telegram.ui.web.z0.o(Uri.parse(s10));
    }

    public final boolean f() {
        return this.a == 1;
    }

    public final void g() {
        if (c()) {
            z3 z3Var = this.G.G;
            this.d.h1(z3Var != null ? 1 : 0, z3Var != null ? AndroidUtilities.dp(32.0f) : 0);
        } else if (f()) {
            n3 n3Var = this.e;
            n3Var.setSwipeOffsetY(n3Var.getTopActionBarOffsetY() + (-n3Var.getOffsetY()));
        }
    }

    public int getActionBarColor() {
        if (f() && SharedConfig.adaptableColorInBrowser) {
            return this.w;
        }
        int i10 = org.telegram.ui.ActionBar.g6.Pk;
        this.G.getClass();
        return org.telegram.ui.ActionBar.g6.w0(null, i10, false);
    }

    public k4 getAdapter() {
        return this.c;
    }

    public int getBackgroundColor() {
        return (f() && SharedConfig.adaptableColorInBrowser) ? this.n ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false) : this.x : org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false);
    }

    public float getListTop() {
        int i10;
        if (!c()) {
            if (f()) {
                return this.e.getTranslationY();
            }
            return 0.0f;
        }
        lh.w wVar = this.b;
        float height = wVar.getHeight();
        for (int i11 = 0; i11 < wVar.getChildCount(); i11++) {
            View childAt = wVar.getChildAt(i11);
            if (wVar.getLayoutManager() == null) {
                i10 = 0;
            } else {
                wVar.getLayoutManager().getClass();
                i10 = RecyclerView.U(childAt).f;
            }
            height = i10 == 2147483646 ? Math.min(height, childAt.getBottom()) : Math.min(height, childAt.getTop());
        }
        return height;
    }

    public org.telegram.ui.Components.zk0 getListView() {
        return this.b;
    }

    public float getProgress() {
        org.telegram.ui.web.w0 webView;
        z3 z3Var = this.G.G;
        if (c()) {
            float f10 = this.E;
            if (f10 >= 0.0f) {
                return f10;
            }
            f2.k0 k0Var = this.d;
            int L0 = k0Var.L0();
            if (k0Var.m(L0) != null) {
                int[] iArr = this.c.E;
                lh.w wVar = this.b;
                if (iArr != null) {
                    int i10 = L0 - 1;
                    return Utilities.clamp01((((i10 < 0 || i10 >= iArr.length) ? 0 : iArr[i10]) + ((L0 != 0 || z3Var == null) ? -r4.getTop() : 0)) / Math.max(1, r5.F - wVar.getHeight()));
                }
                int N0 = k0Var.N0();
                if (z3Var != null) {
                    if (L0 < 1) {
                        L0 = 1;
                    }
                    if (N0 < 1) {
                        N0 = 1;
                    }
                }
                int B = k0Var.B() - 2;
                View m10 = N0 >= B ? k0Var.m(B) : k0Var.m(L0);
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
        org.telegram.ui.web.w0 webView;
        o0 o0Var;
        if (!f() || (webView = this.f.getWebView()) == null) {
            return "";
        }
        if (TextUtils.equals(this.B, webView.getUrl())) {
            return this.C;
        }
        try {
            String url = webView.getUrl();
            this.B = url;
            Uri parse = Uri.parse(org.telegram.ui.web.z0.s(url));
            String uri = (parse.getScheme() == null || !(parse.getScheme().equalsIgnoreCase("http") || parse.getScheme().equalsIgnoreCase("https"))) ? parse.toString() : parse.getSchemeSpecificPart();
            try {
                if (!e()) {
                    try {
                        Uri parse2 = Uri.parse(uri);
                        if (parse2.getHost() != null) {
                            parse = parse2;
                        }
                        String a2 = we.e.a(parse.getHost());
                        String[] split = a2.split("\\.");
                        if (split.length > 2 && (o0Var = this.G.d0) != null && lh.w3.g(a2, o0Var.A) > AndroidUtilities.displaySize.x - AndroidUtilities.dp(162.0f)) {
                            a2 = split[split.length - 2] + '.' + split[split.length - 1];
                        }
                        uri = we.e.v(parse, null, "", a2, null);
                    } catch (Exception e9) {
                        FileLog.e((Throwable) e9, false);
                    }
                    uri = URLDecoder.decode(uri.replaceAll("\\+", "%2b"), "UTF-8");
                }
            } catch (Exception e10) {
                FileLog.e(e10);
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
        org.telegram.ui.web.w0 webView;
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

    public org.telegram.ui.web.z0 getWebContainer() {
        return this.f;
    }

    public org.telegram.ui.web.w0 getWebView() {
        o3 o3Var = this.f;
        if (o3Var != null) {
            return o3Var.getWebView();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        h3 h3Var;
        super.onAttachedToWindow();
        if (!this.n || (h3Var = this.r) == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.g6.Pk;
        h3Var.b(AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(null, i10, false)) <= 0.721f, false);
        this.r.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
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
        m4 m4Var = this.G;
        m4Var.f0();
        if (m4Var.b0.f) {
            m4Var.c0.invalidate();
        }
        if (m4Var.b0.e) {
            m4Var.c0.invalidate();
            m4Var.X((int) (((AndroidUtilities.dp(56.0f) - m4Var.b0.h) * (f10 / getMeasuredWidth())) + m4Var.b0.h));
        }
        z3 z3Var = m4Var.G;
        if (z3Var != null) {
            z3Var.n();
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

    public void setWeb(d3 d3Var) {
        d3 d3Var2 = this.F;
        if (d3Var2 != d3Var) {
            if (d3Var2 != null) {
                d3Var2.c(this);
            }
            this.F = d3Var;
            if (d3Var != null) {
                org.telegram.ui.web.w0 w0Var = d3Var.b;
                o3 o3Var = this.f;
                if (w0Var != null) {
                    w0Var.onResume();
                    int i10 = UserConfig.selectedAccount;
                    org.telegram.ui.web.w0 w0Var2 = d3Var.b;
                    Object obj = d3Var.d;
                    o3Var.I = i10;
                    o3Var.Q(w0Var2, obj);
                    if (o3Var.k0) {
                        o3Var.v("visibility_changed", org.telegram.ui.web.z0.x(Boolean.TRUE, "is_visible"));
                    }
                    a(this, true, d3Var.o);
                    a(this, false, d3Var.p);
                } else {
                    String str = d3Var.v;
                    if (str != null) {
                        o3Var.r(UserConfig.selectedAccount, str);
                    }
                }
            }
            org.telegram.ui.web.c2 c2Var = this.y;
            if (c2Var != null) {
                c2Var.a();
                org.telegram.ui.web.c2 c2Var2 = this.y;
                TLRPC.TL_webPage tL_webPage = c2Var2.j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.e2.o(tL_webPage);
                    c2Var2.j = null;
                }
                this.y = null;
            }
        }
    }
}
