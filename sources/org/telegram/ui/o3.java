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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class o3 extends FrameLayout {
    public boolean E;
    public String F;
    public String G;
    public boolean H;
    public float I;
    public b3 J;
    public final /* synthetic */ k4 K;
    public int a;
    public final di.v b;
    public final i4 c;
    public final s4.b0 d;
    public final l3 e;
    public final m3 f;
    public boolean h;
    public boolean n;
    public f3 r;
    public boolean s;
    public boolean v;
    public int w;
    public int x;
    public org.telegram.ui.web.g2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(k4 k4Var, Activity activity) {
        super(activity);
        this.K = k4Var;
        int i10 = org.telegram.ui.ActionBar.g6.Pk;
        this.w = org.telegram.ui.ActionBar.g6.x0(null, i10, false);
        this.x = org.telegram.ui.ActionBar.g6.x0(null, i10, false);
        this.E = false;
        this.I = -1.0f;
        new Matrix();
        di.v vVar = new di.v(this, activity);
        this.b = vVar;
        vVar.setClipToPadding(false);
        vVar.setPadding(0, AndroidUtilities.dp(56.0f), 0, 0);
        vVar.setTopGlowOffset(AndroidUtilities.dp(56.0f));
        ((s4.k) vVar.getItemAnimator()).C = false;
        i4 i4Var = new i4(k4Var, activity, k4Var.K != null);
        this.c = i4Var;
        vVar.setAdapter(i4Var);
        s4.b0 b0Var = new s4.b0(1, false);
        this.d = b0Var;
        vVar.setLayoutManager(b0Var);
        vVar.setOnScrollListener(new k3(this, 0));
        addView(vVar, w7.z5.d(-1.0f, -1));
        l3 l3Var = new l3(this, getContext());
        this.e = l3Var;
        l3Var.setShouldWaitWebViewScroll(true);
        l3Var.setFullSize(true);
        l3Var.setAllowFullSizeSwipe(true);
        m3 m3Var = new m3(this, getContext(), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
        this.f = m3Var;
        final int i11 = 0;
        m3Var.setOnCloseRequestedListener(new Runnable(this) { // from class: org.telegram.ui.i3
            public final /* synthetic */ o3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        k4 k4Var2 = this.b.K;
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.m3 P = launchActivity.P();
                            if (P != null) {
                                boolean z10 = false;
                                int i12 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.m3.K;
                                    if (i12 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i12));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj = arrayList.get(i13);
                                                i13++;
                                                org.telegram.ui.ActionBar.l3 l3Var2 = (org.telegram.ui.ActionBar.l3) obj;
                                                if (l3Var2.J == k4Var2) {
                                                    z10 = P.h(i12, l3Var2, true);
                                                }
                                            }
                                        }
                                        i12++;
                                    }
                                }
                                if (z10) {
                                }
                            }
                            k4Var2.o(true, true);
                            break;
                        }
                        break;
                    case 1:
                        this.b.f.n(true, false);
                        break;
                    default:
                        o3 o3Var = this.b;
                        l3 l3Var3 = o3Var.e;
                        o3Var.f.n(false, false);
                        f3 f3Var = o3Var.r;
                        if (f3Var != null) {
                            f3Var.a.setTranslationY(((l3Var3.getTopActionBarOffsetY() + (-l3Var3.getOffsetY())) - l3Var3.getSwipeOffsetY()) / 2.0f);
                        }
                        o3Var.K.f0();
                        break;
                }
            }
        });
        m3Var.setWebViewProgressListener(new j3(this, i11));
        m3Var.setDelegate(new n3(this));
        m3Var.setWebViewScrollListener(new g(this, 2));
        l3Var.addView(m3Var, w7.z5.d(-1.0f, -1));
        final int i12 = 1;
        l3Var.setScrollEndListener(new Runnable(this) { // from class: org.telegram.ui.i3
            public final /* synthetic */ o3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        k4 k4Var2 = this.b.K;
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.m3 P = launchActivity.P();
                            if (P != null) {
                                boolean z10 = false;
                                int i122 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.m3.K;
                                    if (i122 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i122));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj = arrayList.get(i13);
                                                i13++;
                                                org.telegram.ui.ActionBar.l3 l3Var2 = (org.telegram.ui.ActionBar.l3) obj;
                                                if (l3Var2.J == k4Var2) {
                                                    z10 = P.h(i122, l3Var2, true);
                                                }
                                            }
                                        }
                                        i122++;
                                    }
                                }
                                if (z10) {
                                }
                            }
                            k4Var2.o(true, true);
                            break;
                        }
                        break;
                    case 1:
                        this.b.f.n(true, false);
                        break;
                    default:
                        o3 o3Var = this.b;
                        l3 l3Var3 = o3Var.e;
                        o3Var.f.n(false, false);
                        f3 f3Var = o3Var.r;
                        if (f3Var != null) {
                            f3Var.a.setTranslationY(((l3Var3.getTopActionBarOffsetY() + (-l3Var3.getOffsetY())) - l3Var3.getSwipeOffsetY()) / 2.0f);
                        }
                        o3Var.K.f0();
                        break;
                }
            }
        });
        l3Var.setDelegate(new b1(this, i12));
        final int i13 = 2;
        l3Var.setScrollListener(new Runnable(this) { // from class: org.telegram.ui.i3
            public final /* synthetic */ o3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        k4 k4Var2 = this.b.K;
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.m3 P = launchActivity.P();
                            if (P != null) {
                                boolean z10 = false;
                                int i122 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.m3.K;
                                    if (i122 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i122));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i132 = 0;
                                            while (i132 < size) {
                                                Object obj = arrayList.get(i132);
                                                i132++;
                                                org.telegram.ui.ActionBar.l3 l3Var2 = (org.telegram.ui.ActionBar.l3) obj;
                                                if (l3Var2.J == k4Var2) {
                                                    z10 = P.h(i122, l3Var2, true);
                                                }
                                            }
                                        }
                                        i122++;
                                    }
                                }
                                if (z10) {
                                }
                            }
                            k4Var2.o(true, true);
                            break;
                        }
                        break;
                    case 1:
                        this.b.f.n(true, false);
                        break;
                    default:
                        o3 o3Var = this.b;
                        l3 l3Var3 = o3Var.e;
                        o3Var.f.n(false, false);
                        f3 f3Var = o3Var.r;
                        if (f3Var != null) {
                            f3Var.a.setTranslationY(((l3Var3.getTopActionBarOffsetY() + (-l3Var3.getOffsetY())) - l3Var3.getSwipeOffsetY()) / 2.0f);
                        }
                        o3Var.K.f0();
                        break;
                }
            }
        });
        l3Var.setTopActionBarOffsetY(AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight);
        addView(l3Var, w7.z5.d(-1.0f, -1));
        b();
        setType(0);
    }

    public static void a(o3 o3Var, boolean z10, int i10) {
        k4 k4Var = o3Var.K;
        x3 x3Var = k4Var.K;
        if (z10) {
            int v = org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Pk, false), i10);
            o3Var.w = v;
            if (o3Var == k4Var.u0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    k4Var.h0.d(v, true);
                }
                if (x3Var != null) {
                    x3Var.i();
                }
            }
        } else {
            int v10 = org.telegram.ui.ActionBar.g6.v(-1, i10);
            o3Var.x = v10;
            if (o3Var == k4Var.u0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    k4Var.h0.setMenuColors(v10);
                }
                if (x3Var != null) {
                    x3Var.i();
                }
            }
        }
        k4Var.f0();
    }

    public final void b() {
        this.s = false;
        this.v = false;
        setWeb(null);
        m3 m3Var = this.f;
        m3Var.h();
        m3Var.a = null;
        int i10 = org.telegram.ui.ActionBar.g6.Pk;
        this.w = org.telegram.ui.ActionBar.g6.x0(null, i10, false);
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, i10, false);
        this.x = x02;
        f3 f3Var = this.r;
        if (f3Var != null) {
            f3Var.b(AndroidUtilities.computePerceivedBrightness(x02) <= 0.721f, true);
            this.r.setBackgroundColor(this.x);
            f3 f3Var2 = this.r;
            this.n = false;
            AndroidUtilities.updateViewVisibilityAnimated(f3Var2, false, 1.0f, false);
        }
        i4 i4Var = this.c;
        i4Var.E = null;
        i4Var.e.clear();
        i4Var.f.clear();
        i4Var.s.clear();
        i4Var.v.clear();
        i4Var.h.clear();
        i4Var.r.clear();
        i4Var.n.clear();
        i4Var.x.clear();
        i4Var.w.clear();
        i4Var.F = null;
        i4Var.l();
        invalidate();
    }

    public final boolean c() {
        return this.a == 0;
    }

    public final boolean d() {
        i4 i4Var;
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        return (f() || (i4Var = this.c) == null || (webPage = i4Var.E) == null || (page = webPage.cached_page) == null || page.local == null) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e() {
        org.telegram.ui.web.z0 webView;
        String u10;
        return f() && (webView = getWebView()) != null && (u10 = org.telegram.ui.web.c1.u(webView.getUrl())) != null && org.telegram.ui.web.c1.p(Uri.parse(u10));
    }

    public final boolean f() {
        return this.a == 1;
    }

    public final void g() {
        if (c()) {
            x3 x3Var = this.K.K;
            this.d.h1(x3Var != null ? 1 : 0, x3Var != null ? AndroidUtilities.dp(32.0f) : 0);
        } else if (f()) {
            l3 l3Var = this.e;
            l3Var.setSwipeOffsetY(l3Var.getTopActionBarOffsetY() + (-l3Var.getOffsetY()));
        }
    }

    public int getActionBarColor() {
        if (f() && SharedConfig.adaptableColorInBrowser) {
            return this.w;
        }
        int i10 = org.telegram.ui.ActionBar.g6.Pk;
        this.K.getClass();
        return org.telegram.ui.ActionBar.g6.x0(null, i10, false);
    }

    public i4 getAdapter() {
        return this.c;
    }

    public int getBackgroundColor() {
        return (f() && SharedConfig.adaptableColorInBrowser) ? this.n ? org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Pk, false) : this.x : org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Pk, false);
    }

    public float getListTop() {
        int i10;
        if (!c()) {
            if (f()) {
                return this.e.getTranslationY();
            }
            return 0.0f;
        }
        di.v vVar = this.b;
        float height = vVar.getHeight();
        for (int i11 = 0; i11 < vVar.getChildCount(); i11++) {
            View childAt = vVar.getChildAt(i11);
            if (vVar.getLayoutManager() == null) {
                i10 = 0;
            } else {
                vVar.getLayoutManager().getClass();
                i10 = RecyclerView.U(childAt).f;
            }
            height = i10 == 2147483646 ? Math.min(height, childAt.getBottom()) : Math.min(height, childAt.getTop());
        }
        return height;
    }

    public org.telegram.ui.Components.mm0 getListView() {
        return this.b;
    }

    public float getProgress() {
        org.telegram.ui.web.z0 webView;
        x3 x3Var = this.K.K;
        if (c()) {
            float f7 = this.I;
            if (f7 >= 0.0f) {
                return f7;
            }
            s4.b0 b0Var = this.d;
            int L0 = b0Var.L0();
            if (b0Var.m(L0) != null) {
                int[] iArr = this.c.I;
                di.v vVar = this.b;
                if (iArr != null) {
                    int i10 = L0 - 1;
                    return Utilities.clamp01((((i10 < 0 || i10 >= iArr.length) ? 0 : iArr[i10]) + ((L0 != 0 || x3Var == null) ? -r4.getTop() : 0)) / Math.max(1, r5.J - vVar.getHeight()));
                }
                int N0 = b0Var.N0();
                if (x3Var != null) {
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
        org.telegram.ui.web.z0 webView;
        m0 m0Var;
        if (!f() || (webView = this.f.getWebView()) == null) {
            return "";
        }
        if (TextUtils.equals(this.F, webView.getUrl())) {
            return this.G;
        }
        try {
            String url = webView.getUrl();
            this.F = url;
            Uri parse = Uri.parse(org.telegram.ui.web.c1.u(url));
            String uri = (parse.getScheme() == null || !(parse.getScheme().equalsIgnoreCase("http") || parse.getScheme().equalsIgnoreCase("https"))) ? parse.toString() : parse.getSchemeSpecificPart();
            try {
                if (!e()) {
                    try {
                        Uri parse2 = Uri.parse(uri);
                        if (parse2.getHost() != null) {
                            parse = parse2;
                        }
                        String a2 = pf.d.a(parse.getHost());
                        String[] split = a2.split("\\.");
                        if (split.length > 2 && (m0Var = this.K.h0) != null && di.d4.g(a2, m0Var.E) > AndroidUtilities.displaySize.x - AndroidUtilities.dp(162.0f)) {
                            a2 = split[split.length - 2] + '.' + split[split.length - 1];
                        }
                        uri = pf.d.u(parse, null, "", a2, null);
                    } catch (Exception e) {
                        FileLog.e((Throwable) e, false);
                    }
                    uri = URLDecoder.decode(uri.replaceAll("\\+", "%2b"), "UTF-8");
                }
            } catch (Exception e7) {
                FileLog.e(e7);
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
            this.G = uri;
            return uri;
        } catch (Exception unused) {
            return webView.getUrl();
        }
    }

    public String getTitle() {
        org.telegram.ui.web.z0 webView;
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

    public org.telegram.ui.web.c1 getWebContainer() {
        return this.f;
    }

    public org.telegram.ui.web.z0 getWebView() {
        m3 m3Var = this.f;
        if (m3Var != null) {
            return m3Var.getWebView();
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
        int i10 = org.telegram.ui.ActionBar.g6.Pk;
        f3Var.b(AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.x0(null, i10, false)) <= 0.721f, false);
        this.r.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
    }

    public void setLastVisible(boolean z10) {
        if (this.H != z10) {
            this.H = z10;
            this.f.setKeyboardFocusable(z10);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        k4 k4Var = this.K;
        k4Var.f0();
        if (k4Var.f0.f) {
            k4Var.g0.invalidate();
        }
        if (k4Var.f0.e) {
            k4Var.g0.invalidate();
            k4Var.X((int) (((AndroidUtilities.dp(56.0f) - k4Var.f0.h) * (f7 / getMeasuredWidth())) + k4Var.f0.h));
        }
        x3 x3Var = k4Var.K;
        if (x3Var != null) {
            x3Var.n();
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
        b3 b3Var2 = this.J;
        if (b3Var2 != b3Var) {
            if (b3Var2 != null) {
                b3Var2.c(this);
            }
            this.J = b3Var;
            if (b3Var != null) {
                org.telegram.ui.web.z0 z0Var = b3Var.b;
                m3 m3Var = this.f;
                if (z0Var != null) {
                    z0Var.onResume();
                    m3Var.N(UserConfig.selectedAccount, b3Var.b, b3Var.d, b3Var.x, false);
                    a(this, true, b3Var.q);
                    a(this, false, b3Var.r);
                } else {
                    String str = b3Var.x;
                    if (str != null) {
                        m3Var.t(UserConfig.selectedAccount, str, false);
                    }
                }
            }
            org.telegram.ui.web.g2 g2Var = this.y;
            if (g2Var != null) {
                g2Var.a();
                org.telegram.ui.web.g2 g2Var2 = this.y;
                TLRPC.TL_webPage tL_webPage = g2Var2.j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.i2.o(tL_webPage);
                    g2Var2.j = null;
                }
                this.y = null;
            }
        }
    }
}
