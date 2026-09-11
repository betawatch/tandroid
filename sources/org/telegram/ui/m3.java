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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class m3 extends FrameLayout {
    public boolean E;
    public String F;
    public String G;
    public boolean H;
    public float I;
    public z2 J;
    public final /* synthetic */ i4 K;
    public int a;
    public final di.v b;
    public final g4 c;
    public final s4.c0 d;
    public final j3 e;
    public final k3 f;
    public boolean h;
    public boolean n;
    public d3 r;
    public boolean s;
    public boolean v;
    public int w;
    public int x;
    public org.telegram.ui.web.h2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(i4 i4Var, Activity activity) {
        super(activity);
        this.K = i4Var;
        int i10 = org.telegram.ui.ActionBar.j6.Pk;
        this.w = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        this.x = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        this.E = false;
        this.I = -1.0f;
        new Matrix();
        di.v vVar = new di.v(this, activity);
        this.b = vVar;
        vVar.setClipToPadding(false);
        vVar.setPadding(0, AndroidUtilities.dp(56.0f), 0, 0);
        vVar.setTopGlowOffset(AndroidUtilities.dp(56.0f));
        ((s4.j) vVar.getItemAnimator()).C = false;
        g4 g4Var = new g4(i4Var, activity, i4Var.K != null);
        this.c = g4Var;
        vVar.setAdapter(g4Var);
        s4.c0 c0Var = new s4.c0(1, false);
        this.d = c0Var;
        vVar.setLayoutManager(c0Var);
        vVar.setOnScrollListener(new i3(this, 0));
        addView(vVar, w7.x5.c(-1.0f, -1));
        j3 j3Var = new j3(this, getContext());
        this.e = j3Var;
        j3Var.setShouldWaitWebViewScroll(true);
        j3Var.setFullSize(true);
        j3Var.setAllowFullSizeSwipe(true);
        k3 k3Var = new k3(this, getContext(), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        this.f = k3Var;
        final int i11 = 0;
        k3Var.setOnCloseRequestedListener(new Runnable(this) { // from class: org.telegram.ui.g3
            public final /* synthetic */ m3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        i4 i4Var2 = this.b.K;
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.o3 P = launchActivity.P();
                            if (P != null) {
                                boolean z10 = false;
                                int i12 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.o3.K;
                                    if (i12 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i12));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj = arrayList.get(i13);
                                                i13++;
                                                org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) obj;
                                                if (n3Var.J == i4Var2) {
                                                    z10 = P.h(i12, n3Var, true);
                                                }
                                            }
                                        }
                                        i12++;
                                    }
                                }
                                if (z10) {
                                }
                            }
                            i4Var2.o(true, true);
                            break;
                        }
                        break;
                    case 1:
                        this.b.f.o(true, false);
                        break;
                    default:
                        m3 m3Var = this.b;
                        j3 j3Var2 = m3Var.e;
                        m3Var.f.o(false, false);
                        d3 d3Var = m3Var.r;
                        if (d3Var != null) {
                            d3Var.a.setTranslationY(((j3Var2.getTopActionBarOffsetY() + (-j3Var2.getOffsetY())) - j3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        m3Var.K.f0();
                        break;
                }
            }
        });
        k3Var.setWebViewProgressListener(new h3(this, i11));
        k3Var.setDelegate(new l3(this));
        k3Var.setWebViewScrollListener(new g(this, 2));
        j3Var.addView(k3Var, w7.x5.c(-1.0f, -1));
        final int i12 = 1;
        j3Var.setScrollEndListener(new Runnable(this) { // from class: org.telegram.ui.g3
            public final /* synthetic */ m3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        i4 i4Var2 = this.b.K;
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.o3 P = launchActivity.P();
                            if (P != null) {
                                boolean z10 = false;
                                int i122 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.o3.K;
                                    if (i122 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i122));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj = arrayList.get(i13);
                                                i13++;
                                                org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) obj;
                                                if (n3Var.J == i4Var2) {
                                                    z10 = P.h(i122, n3Var, true);
                                                }
                                            }
                                        }
                                        i122++;
                                    }
                                }
                                if (z10) {
                                }
                            }
                            i4Var2.o(true, true);
                            break;
                        }
                        break;
                    case 1:
                        this.b.f.o(true, false);
                        break;
                    default:
                        m3 m3Var = this.b;
                        j3 j3Var2 = m3Var.e;
                        m3Var.f.o(false, false);
                        d3 d3Var = m3Var.r;
                        if (d3Var != null) {
                            d3Var.a.setTranslationY(((j3Var2.getTopActionBarOffsetY() + (-j3Var2.getOffsetY())) - j3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        m3Var.K.f0();
                        break;
                }
            }
        });
        j3Var.setDelegate(new z0(this, i12));
        final int i13 = 2;
        j3Var.setScrollListener(new Runnable(this) { // from class: org.telegram.ui.g3
            public final /* synthetic */ m3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        i4 i4Var2 = this.b.K;
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.o3 P = launchActivity.P();
                            if (P != null) {
                                boolean z10 = false;
                                int i122 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.o3.K;
                                    if (i122 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i122));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i132 = 0;
                                            while (i132 < size) {
                                                Object obj = arrayList.get(i132);
                                                i132++;
                                                org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) obj;
                                                if (n3Var.J == i4Var2) {
                                                    z10 = P.h(i122, n3Var, true);
                                                }
                                            }
                                        }
                                        i122++;
                                    }
                                }
                                if (z10) {
                                }
                            }
                            i4Var2.o(true, true);
                            break;
                        }
                        break;
                    case 1:
                        this.b.f.o(true, false);
                        break;
                    default:
                        m3 m3Var = this.b;
                        j3 j3Var2 = m3Var.e;
                        m3Var.f.o(false, false);
                        d3 d3Var = m3Var.r;
                        if (d3Var != null) {
                            d3Var.a.setTranslationY(((j3Var2.getTopActionBarOffsetY() + (-j3Var2.getOffsetY())) - j3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        m3Var.K.f0();
                        break;
                }
            }
        });
        j3Var.setTopActionBarOffsetY(AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight);
        addView(j3Var, w7.x5.c(-1.0f, -1));
        b();
        setType(0);
    }

    public static void a(m3 m3Var, boolean z10, int i10) {
        i4 i4Var = m3Var.K;
        v3 v3Var = i4Var.K;
        if (z10) {
            int v = org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false), i10);
            m3Var.w = v;
            if (m3Var == i4Var.u0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    i4Var.h0.d(v, true);
                }
                if (v3Var != null) {
                    v3Var.i();
                }
            }
        } else {
            int v9 = org.telegram.ui.ActionBar.j6.v(-1, i10);
            m3Var.x = v9;
            if (m3Var == i4Var.u0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    i4Var.h0.setMenuColors(v9);
                }
                if (v3Var != null) {
                    v3Var.i();
                }
            }
        }
        i4Var.f0();
    }

    public final void b() {
        this.s = false;
        this.v = false;
        setWeb(null);
        k3 k3Var = this.f;
        k3Var.i();
        k3Var.a = null;
        int i10 = org.telegram.ui.ActionBar.j6.Pk;
        this.w = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        this.x = w02;
        d3 d3Var = this.r;
        if (d3Var != null) {
            d3Var.b(AndroidUtilities.computePerceivedBrightness(w02) <= 0.721f, true);
            this.r.setBackgroundColor(this.x);
            d3 d3Var2 = this.r;
            this.n = false;
            AndroidUtilities.updateViewVisibilityAnimated(d3Var2, false, 1.0f, false);
        }
        g4 g4Var = this.c;
        g4Var.E = null;
        g4Var.e.clear();
        g4Var.f.clear();
        g4Var.s.clear();
        g4Var.v.clear();
        g4Var.h.clear();
        g4Var.r.clear();
        g4Var.n.clear();
        g4Var.x.clear();
        g4Var.w.clear();
        g4Var.F = null;
        g4Var.l();
        invalidate();
    }

    public final boolean c() {
        return this.a == 0;
    }

    public final boolean d() {
        g4 g4Var;
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        return (f() || (g4Var = this.c) == null || (webPage = g4Var.E) == null || (page = webPage.cached_page) == null || page.local == null) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e() {
        org.telegram.ui.web.z0 webView;
        String v;
        return f() && (webView = getWebView()) != null && (v = org.telegram.ui.web.d1.v(webView.getUrl())) != null && org.telegram.ui.web.d1.q(Uri.parse(v));
    }

    public final boolean f() {
        return this.a == 1;
    }

    public final void g() {
        if (c()) {
            v3 v3Var = this.K.K;
            this.d.h1(v3Var != null ? 1 : 0, v3Var != null ? AndroidUtilities.dp(32.0f) : 0);
        } else if (f()) {
            j3 j3Var = this.e;
            j3Var.setSwipeOffsetY(j3Var.getTopActionBarOffsetY() + (-j3Var.getOffsetY()));
        }
    }

    public int getActionBarColor() {
        if (f() && SharedConfig.adaptableColorInBrowser) {
            return this.w;
        }
        int i10 = org.telegram.ui.ActionBar.j6.Pk;
        this.K.getClass();
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    public g4 getAdapter() {
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

    public org.telegram.ui.Components.ll0 getListView() {
        return this.b;
    }

    public float getProgress() {
        org.telegram.ui.web.z0 webView;
        v3 v3Var = this.K.K;
        if (c()) {
            float f7 = this.I;
            if (f7 >= 0.0f) {
                return f7;
            }
            s4.c0 c0Var = this.d;
            int L0 = c0Var.L0();
            if (c0Var.m(L0) != null) {
                int[] iArr = this.c.I;
                di.v vVar = this.b;
                if (iArr != null) {
                    int i10 = L0 - 1;
                    return Utilities.clamp01((((i10 < 0 || i10 >= iArr.length) ? 0 : iArr[i10]) + ((L0 != 0 || v3Var == null) ? -r4.getTop() : 0)) / Math.max(1, r5.J - vVar.getHeight()));
                }
                int N0 = c0Var.N0();
                if (v3Var != null) {
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
        k0 k0Var;
        if (!f() || (webView = this.f.getWebView()) == null) {
            return "";
        }
        if (TextUtils.equals(this.F, webView.getUrl())) {
            return this.G;
        }
        try {
            String url = webView.getUrl();
            this.F = url;
            Uri parse = Uri.parse(org.telegram.ui.web.d1.v(url));
            String uri = (parse.getScheme() == null || !(parse.getScheme().equalsIgnoreCase("http") || parse.getScheme().equalsIgnoreCase("https"))) ? parse.toString() : parse.getSchemeSpecificPart();
            try {
                if (!e()) {
                    try {
                        Uri parse2 = Uri.parse(uri);
                        if (parse2.getHost() != null) {
                            parse = parse2;
                        }
                        String a2 = of.f.a(parse.getHost());
                        String[] split = a2.split("\\.");
                        if (split.length > 2 && (k0Var = this.K.h0) != null && di.f4.g(a2, k0Var.E) > AndroidUtilities.displaySize.x - AndroidUtilities.dp(162.0f)) {
                            a2 = split[split.length - 2] + '.' + split[split.length - 1];
                        }
                        uri = of.f.v(parse, null, "", a2, null);
                    } catch (Exception e7) {
                        FileLog.e((Throwable) e7, false);
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

    public org.telegram.ui.web.d1 getWebContainer() {
        return this.f;
    }

    public org.telegram.ui.web.z0 getWebView() {
        k3 k3Var = this.f;
        if (k3Var != null) {
            return k3Var.getWebView();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        d3 d3Var;
        super.onAttachedToWindow();
        if (!this.n || (d3Var = this.r) == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.j6.Pk;
        d3Var.b(AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, i10, false)) <= 0.721f, false);
        this.r.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
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
        i4 i4Var = this.K;
        i4Var.f0();
        if (i4Var.f0.f) {
            i4Var.g0.invalidate();
        }
        if (i4Var.f0.e) {
            i4Var.g0.invalidate();
            i4Var.X((int) (((AndroidUtilities.dp(56.0f) - i4Var.f0.h) * (f7 / getMeasuredWidth())) + i4Var.f0.h));
        }
        v3 v3Var = i4Var.K;
        if (v3Var != null) {
            v3Var.n();
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

    public void setWeb(z2 z2Var) {
        z2 z2Var2 = this.J;
        if (z2Var2 != z2Var) {
            if (z2Var2 != null) {
                z2Var2.c(this);
            }
            this.J = z2Var;
            if (z2Var != null) {
                org.telegram.ui.web.z0 z0Var = z2Var.b;
                k3 k3Var = this.f;
                if (z0Var != null) {
                    z0Var.onResume();
                    k3Var.O(UserConfig.selectedAccount, z2Var.b, z2Var.d, z2Var.x, false);
                    a(this, true, z2Var.q);
                    a(this, false, z2Var.r);
                } else {
                    String str = z2Var.x;
                    if (str != null) {
                        k3Var.u(UserConfig.selectedAccount, str, false);
                    }
                }
            }
            org.telegram.ui.web.h2 h2Var = this.y;
            if (h2Var != null) {
                h2Var.a();
                org.telegram.ui.web.h2 h2Var2 = this.y;
                TLRPC.TL_webPage tL_webPage = h2Var2.j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.j2.o(tL_webPage);
                    h2Var2.j = null;
                }
                this.y = null;
            }
        }
    }
}
