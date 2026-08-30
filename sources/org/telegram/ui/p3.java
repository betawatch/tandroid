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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class p3 extends FrameLayout {
    public boolean B;
    public String C;
    public String D;
    public boolean E;
    public float F;
    public b3 G;
    public final /* synthetic */ l4 H;
    public int a;
    public final k3 b;
    public final j4 c;
    public final f2.i0 d;
    public final m3 e;
    public final n3 f;
    public boolean h;
    public boolean n;
    public f3 r;
    public boolean s;
    public boolean v;
    public int w;
    public int x;
    public org.telegram.ui.web.e2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(l4 l4Var, Activity activity) {
        super(activity);
        this.H = l4Var;
        int i10 = org.telegram.ui.ActionBar.j6.Pk;
        this.w = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        this.x = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        this.B = false;
        this.F = -1.0f;
        new Matrix();
        k3 k3Var = new k3(this, activity);
        this.b = k3Var;
        k3Var.setClipToPadding(false);
        k3Var.setPadding(0, AndroidUtilities.dp(56.0f), 0, 0);
        k3Var.setTopGlowOffset(AndroidUtilities.dp(56.0f));
        ((f2.l) k3Var.getItemAnimator()).C = false;
        j4 j4Var = new j4(l4Var, activity, l4Var.H != null);
        this.c = j4Var;
        k3Var.setAdapter(j4Var);
        f2.i0 i0Var = new f2.i0(1, false);
        this.d = i0Var;
        k3Var.setLayoutManager(i0Var);
        k3Var.setOnScrollListener(new l3(this, 0));
        addView(k3Var, k7.b6.c(-1.0f, -1));
        m3 m3Var = new m3(this, getContext());
        this.e = m3Var;
        m3Var.setShouldWaitWebViewScroll(true);
        m3Var.setFullSize(true);
        m3Var.setAllowFullSizeSwipe(true);
        n3 n3Var = new n3(this, getContext(), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        this.f = n3Var;
        final int i11 = 0;
        n3Var.setOnCloseRequestedListener(new Runnable(this) { // from class: org.telegram.ui.i3
            public final /* synthetic */ p3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        l4 l4Var2 = this.b.H;
                        LaunchActivity launchActivity = LaunchActivity.D1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.n3 P = launchActivity.P();
                            if (P != null) {
                                boolean z4 = false;
                                int i12 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.n3.H;
                                    if (i12 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i12));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj = arrayList.get(i13);
                                                i13++;
                                                org.telegram.ui.ActionBar.m3 m3Var2 = (org.telegram.ui.ActionBar.m3) obj;
                                                if (m3Var2.H == l4Var2) {
                                                    z4 = P.h(i12, m3Var2, true);
                                                }
                                            }
                                        }
                                        i12++;
                                    }
                                }
                                if (z4) {
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
                        m3 m3Var3 = p3Var.e;
                        p3Var.f.n(false, false);
                        f3 f3Var = p3Var.r;
                        if (f3Var != null) {
                            f3Var.a.setTranslationY(((m3Var3.getTopActionBarOffsetY() + (-m3Var3.getOffsetY())) - m3Var3.getSwipeOffsetY()) / 2.0f);
                        }
                        p3Var.H.f0();
                        break;
                }
            }
        });
        n3Var.setWebViewProgressListener(new j3(this, i11));
        n3Var.setDelegate(new o3(this));
        n3Var.setWebViewScrollListener(new h(this, 2));
        m3Var.addView(n3Var, k7.b6.c(-1.0f, -1));
        final int i12 = 1;
        m3Var.setScrollEndListener(new Runnable(this) { // from class: org.telegram.ui.i3
            public final /* synthetic */ p3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        l4 l4Var2 = this.b.H;
                        LaunchActivity launchActivity = LaunchActivity.D1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.n3 P = launchActivity.P();
                            if (P != null) {
                                boolean z4 = false;
                                int i122 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.n3.H;
                                    if (i122 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i122));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj = arrayList.get(i13);
                                                i13++;
                                                org.telegram.ui.ActionBar.m3 m3Var2 = (org.telegram.ui.ActionBar.m3) obj;
                                                if (m3Var2.H == l4Var2) {
                                                    z4 = P.h(i122, m3Var2, true);
                                                }
                                            }
                                        }
                                        i122++;
                                    }
                                }
                                if (z4) {
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
                        m3 m3Var3 = p3Var.e;
                        p3Var.f.n(false, false);
                        f3 f3Var = p3Var.r;
                        if (f3Var != null) {
                            f3Var.a.setTranslationY(((m3Var3.getTopActionBarOffsetY() + (-m3Var3.getOffsetY())) - m3Var3.getSwipeOffsetY()) / 2.0f);
                        }
                        p3Var.H.f0();
                        break;
                }
            }
        });
        m3Var.setDelegate(new a1(this, i12));
        final int i13 = 2;
        m3Var.setScrollListener(new Runnable(this) { // from class: org.telegram.ui.i3
            public final /* synthetic */ p3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        l4 l4Var2 = this.b.H;
                        LaunchActivity launchActivity = LaunchActivity.D1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.n3 P = launchActivity.P();
                            if (P != null) {
                                boolean z4 = false;
                                int i122 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.n3.H;
                                    if (i122 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i122));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i132 = 0;
                                            while (i132 < size) {
                                                Object obj = arrayList.get(i132);
                                                i132++;
                                                org.telegram.ui.ActionBar.m3 m3Var2 = (org.telegram.ui.ActionBar.m3) obj;
                                                if (m3Var2.H == l4Var2) {
                                                    z4 = P.h(i122, m3Var2, true);
                                                }
                                            }
                                        }
                                        i122++;
                                    }
                                }
                                if (z4) {
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
                        m3 m3Var3 = p3Var.e;
                        p3Var.f.n(false, false);
                        f3 f3Var = p3Var.r;
                        if (f3Var != null) {
                            f3Var.a.setTranslationY(((m3Var3.getTopActionBarOffsetY() + (-m3Var3.getOffsetY())) - m3Var3.getSwipeOffsetY()) / 2.0f);
                        }
                        p3Var.H.f0();
                        break;
                }
            }
        });
        m3Var.setTopActionBarOffsetY(AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight);
        addView(m3Var, k7.b6.c(-1.0f, -1));
        b();
        setType(0);
    }

    public static void a(p3 p3Var, boolean z4, int i10) {
        l4 l4Var = p3Var.H;
        y3 y3Var = l4Var.H;
        if (z4) {
            int v = org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false), i10);
            p3Var.w = v;
            if (p3Var == l4Var.r0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    l4Var.e0.d(v, true);
                }
                if (y3Var != null) {
                    y3Var.i();
                }
            }
        } else {
            int v10 = org.telegram.ui.ActionBar.j6.v(-1, i10);
            p3Var.x = v10;
            if (p3Var == l4Var.r0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    l4Var.e0.setMenuColors(v10);
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
        int i10 = org.telegram.ui.ActionBar.j6.Pk;
        this.w = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        this.x = w02;
        f3 f3Var = this.r;
        if (f3Var != null) {
            f3Var.b(AndroidUtilities.computePerceivedBrightness(w02) <= 0.721f, true);
            this.r.setBackgroundColor(this.x);
            f3 f3Var2 = this.r;
            this.n = false;
            AndroidUtilities.updateViewVisibilityAnimated(f3Var2, false, 1.0f, false);
        }
        j4 j4Var = this.c;
        j4Var.B = null;
        j4Var.e.clear();
        j4Var.f.clear();
        j4Var.s.clear();
        j4Var.v.clear();
        j4Var.h.clear();
        j4Var.r.clear();
        j4Var.n.clear();
        j4Var.x.clear();
        j4Var.w.clear();
        j4Var.C = null;
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
        return (f() || (j4Var = this.c) == null || (webPage = j4Var.B) == null || (page = webPage.cached_page) == null || page.local == null) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e() {
        org.telegram.ui.web.w0 webView;
        String s6;
        return f() && (webView = getWebView()) != null && (s6 = org.telegram.ui.web.a1.s(webView.getUrl())) != null && org.telegram.ui.web.a1.o(Uri.parse(s6));
    }

    public final boolean f() {
        return this.a == 1;
    }

    public final void g() {
        if (c()) {
            y3 y3Var = this.H.H;
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
        int i10 = org.telegram.ui.ActionBar.j6.Pk;
        this.H.getClass();
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    public j4 getAdapter() {
        return this.c;
    }

    public int getBackgroundColor() {
        return (f() && SharedConfig.adaptableColorInBrowser) ? this.n ? org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false) : this.x : org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
    }

    public float getListTop() {
        int i10;
        if (!c()) {
            if (f()) {
                return this.e.getTranslationY();
            }
            return 0.0f;
        }
        k3 k3Var = this.b;
        float height = k3Var.getHeight();
        for (int i11 = 0; i11 < k3Var.getChildCount(); i11++) {
            View childAt = k3Var.getChildAt(i11);
            if (k3Var.getLayoutManager() == null) {
                i10 = 0;
            } else {
                k3Var.getLayoutManager().getClass();
                i10 = RecyclerView.U(childAt).f;
            }
            height = i10 == 2147483646 ? Math.min(height, childAt.getBottom()) : Math.min(height, childAt.getTop());
        }
        return height;
    }

    public org.telegram.ui.Components.sl0 getListView() {
        return this.b;
    }

    public float getProgress() {
        org.telegram.ui.web.w0 webView;
        y3 y3Var = this.H.H;
        if (c()) {
            float f10 = this.F;
            if (f10 >= 0.0f) {
                return f10;
            }
            f2.i0 i0Var = this.d;
            int L0 = i0Var.L0();
            if (i0Var.m(L0) != null) {
                int[] iArr = this.c.F;
                k3 k3Var = this.b;
                if (iArr != null) {
                    int i10 = L0 - 1;
                    return Utilities.clamp01((((i10 < 0 || i10 >= iArr.length) ? 0 : iArr[i10]) + ((L0 != 0 || y3Var == null) ? -r4.getTop() : 0)) / Math.max(1, r5.G - k3Var.getHeight()));
                }
                int N0 = i0Var.N0();
                if (y3Var != null) {
                    if (L0 < 1) {
                        L0 = 1;
                    }
                    if (N0 < 1) {
                        N0 = 1;
                    }
                }
                int B = i0Var.B() - 2;
                View m9 = N0 >= B ? i0Var.m(B) : i0Var.m(L0);
                if (m9 != null) {
                    float width = getWidth() / (r0 - 1);
                    float measuredHeight = m9.getMeasuredHeight();
                    return ((L0 * width) + (N0 >= B ? (((B - L0) * width) * (k3Var.getMeasuredHeight() - m9.getTop())) / measuredHeight : (1.0f - ((Math.min(0, m9.getTop() - k3Var.getPaddingTop()) + measuredHeight) / measuredHeight)) * width)) / getWidth();
                }
            }
        } else if (f() && (webView = this.f.getWebView()) != null) {
            return webView.getScrollProgress();
        }
        return 0.0f;
    }

    public String getSubtitle() {
        org.telegram.ui.web.w0 webView;
        m0 m0Var;
        if (!f() || (webView = this.f.getWebView()) == null) {
            return "";
        }
        if (TextUtils.equals(this.C, webView.getUrl())) {
            return this.D;
        }
        try {
            String url = webView.getUrl();
            this.C = url;
            Uri parse = Uri.parse(org.telegram.ui.web.a1.s(url));
            String uri = (parse.getScheme() == null || !(parse.getScheme().equalsIgnoreCase("http") || parse.getScheme().equalsIgnoreCase("https"))) ? parse.toString() : parse.getSchemeSpecificPart();
            try {
                if (!e()) {
                    try {
                        Uri parse2 = Uri.parse(uri);
                        if (parse2.getHost() != null) {
                            parse = parse2;
                        }
                        String a2 = af.g.a(parse.getHost());
                        String[] split = a2.split("\\.");
                        if (split.length > 2 && (m0Var = this.H.e0) != null && ph.f3.g(a2, m0Var.B) > AndroidUtilities.displaySize.x - AndroidUtilities.dp(162.0f)) {
                            a2 = split[split.length - 2] + '.' + split[split.length - 1];
                        }
                        uri = af.g.v(parse, null, "", a2, null);
                    } catch (Exception e) {
                        FileLog.e((Throwable) e, false);
                    }
                    uri = URLDecoder.decode(uri.replaceAll("\\+", "%2b"), "UTF-8");
                }
            } catch (Exception e6) {
                FileLog.e(e6);
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
            this.D = uri;
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
            TLRPC.WebPage webPage = this.c.B;
            if (webPage != null && (str2 = webPage.site_name) != null) {
                return str2;
            }
            if (webPage != null && (str = webPage.title) != null) {
                return str;
            }
        }
        return (!f() || (webView = this.f.getWebView()) == null) ? "" : webView.getTitle();
    }

    public org.telegram.ui.web.a1 getWebContainer() {
        return this.f;
    }

    public org.telegram.ui.web.w0 getWebView() {
        n3 n3Var = this.f;
        if (n3Var != null) {
            return n3Var.getWebView();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        f3 f3Var;
        super.onAttachedToWindow();
        if (!this.n || (f3Var = this.r) == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.j6.Pk;
        f3Var.b(AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, i10, false)) <= 0.721f, false);
        this.r.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
    }

    public void setLastVisible(boolean z4) {
        if (this.E != z4) {
            this.E = z4;
            this.f.setKeyboardFocusable(z4);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        l4 l4Var = this.H;
        l4Var.f0();
        if (l4Var.c0.f) {
            l4Var.d0.invalidate();
        }
        if (l4Var.c0.e) {
            l4Var.d0.invalidate();
            l4Var.X((int) (((AndroidUtilities.dp(56.0f) - l4Var.c0.h) * (f10 / getMeasuredWidth())) + l4Var.c0.h));
        }
        y3 y3Var = l4Var.H;
        if (y3Var != null) {
            y3Var.n();
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

    public void setWeb(b3 b3Var) {
        b3 b3Var2 = this.G;
        if (b3Var2 != b3Var) {
            if (b3Var2 != null) {
                b3Var2.c(this);
            }
            this.G = b3Var;
            if (b3Var != null) {
                org.telegram.ui.web.w0 w0Var = b3Var.b;
                n3 n3Var = this.f;
                if (w0Var != null) {
                    w0Var.onResume();
                    int i10 = UserConfig.selectedAccount;
                    org.telegram.ui.web.w0 w0Var2 = b3Var.b;
                    Object obj = b3Var.d;
                    n3Var.J = i10;
                    n3Var.Q(w0Var2, obj);
                    if (n3Var.l0) {
                        n3Var.v("visibility_changed", org.telegram.ui.web.a1.x(Boolean.TRUE, "is_visible"));
                    }
                    a(this, true, b3Var.o);
                    a(this, false, b3Var.p);
                } else {
                    String str = b3Var.v;
                    if (str != null) {
                        n3Var.r(UserConfig.selectedAccount, str);
                    }
                }
            }
            org.telegram.ui.web.e2 e2Var = this.y;
            if (e2Var != null) {
                e2Var.a();
                org.telegram.ui.web.e2 e2Var2 = this.y;
                TLRPC.TL_webPage tL_webPage = e2Var2.j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.g2.o(tL_webPage);
                    e2Var2.j = null;
                }
                this.y = null;
            }
        }
    }
}
