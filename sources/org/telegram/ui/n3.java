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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class n3 extends FrameLayout {
    public boolean E;
    public String F;
    public String G;
    public boolean H;
    public float I;
    public a3 J;
    public final /* synthetic */ j4 K;
    public int a;
    public final bi.z b;
    public final h4 c;
    public final s4.c0 d;
    public final k3 e;
    public final l3 f;
    public boolean h;
    public boolean n;
    public e3 r;
    public boolean s;
    public boolean v;
    public int w;
    public int x;
    public org.telegram.ui.web.i2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(j4 j4Var, Activity activity) {
        super(activity);
        this.K = j4Var;
        int i10 = org.telegram.ui.ActionBar.j6.Pk;
        this.w = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        this.x = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        this.E = false;
        this.I = -1.0f;
        new Matrix();
        bi.z zVar = new bi.z(this, activity);
        this.b = zVar;
        zVar.setClipToPadding(false);
        zVar.setPadding(0, AndroidUtilities.dp(56.0f), 0, 0);
        zVar.setTopGlowOffset(AndroidUtilities.dp(56.0f));
        ((s4.j) zVar.getItemAnimator()).C = false;
        h4 h4Var = new h4(j4Var, activity, j4Var.K != null);
        this.c = h4Var;
        zVar.setAdapter(h4Var);
        s4.c0 c0Var = new s4.c0(1, false);
        this.d = c0Var;
        zVar.setLayoutManager(c0Var);
        zVar.setOnScrollListener(new j3(this, 0));
        addView(zVar, w7.a6.c(-1.0f, -1));
        k3 k3Var = new k3(this, getContext());
        this.e = k3Var;
        k3Var.setShouldWaitWebViewScroll(true);
        k3Var.setFullSize(true);
        k3Var.setAllowFullSizeSwipe(true);
        l3 l3Var = new l3(this, getContext(), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
        this.f = l3Var;
        final int i11 = 0;
        l3Var.setOnCloseRequestedListener(new Runnable(this) { // from class: org.telegram.ui.h3
            public final /* synthetic */ n3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        j4 j4Var2 = this.b.K;
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.q3 P = launchActivity.P();
                            if (P != null) {
                                boolean z10 = false;
                                int i12 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.q3.K;
                                    if (i12 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i12));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj = arrayList.get(i13);
                                                i13++;
                                                org.telegram.ui.ActionBar.p3 p3Var = (org.telegram.ui.ActionBar.p3) obj;
                                                if (p3Var.J == j4Var2) {
                                                    z10 = P.h(i12, p3Var, true);
                                                }
                                            }
                                        }
                                        i12++;
                                    }
                                }
                                if (z10) {
                                }
                            }
                            j4Var2.o(true, true);
                            break;
                        }
                        break;
                    case 1:
                        this.b.f.o(true, false);
                        break;
                    default:
                        n3 n3Var = this.b;
                        k3 k3Var2 = n3Var.e;
                        n3Var.f.o(false, false);
                        e3 e3Var = n3Var.r;
                        if (e3Var != null) {
                            e3Var.a.setTranslationY(((k3Var2.getTopActionBarOffsetY() + (-k3Var2.getOffsetY())) - k3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        n3Var.K.f0();
                        break;
                }
            }
        });
        l3Var.setWebViewProgressListener(new i3(this, i11));
        l3Var.setDelegate(new m3(this));
        l3Var.setWebViewScrollListener(new g(this, 2));
        k3Var.addView(l3Var, w7.a6.c(-1.0f, -1));
        final int i12 = 1;
        k3Var.setScrollEndListener(new Runnable(this) { // from class: org.telegram.ui.h3
            public final /* synthetic */ n3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        j4 j4Var2 = this.b.K;
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.q3 P = launchActivity.P();
                            if (P != null) {
                                boolean z10 = false;
                                int i122 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.q3.K;
                                    if (i122 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i122));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj = arrayList.get(i13);
                                                i13++;
                                                org.telegram.ui.ActionBar.p3 p3Var = (org.telegram.ui.ActionBar.p3) obj;
                                                if (p3Var.J == j4Var2) {
                                                    z10 = P.h(i122, p3Var, true);
                                                }
                                            }
                                        }
                                        i122++;
                                    }
                                }
                                if (z10) {
                                }
                            }
                            j4Var2.o(true, true);
                            break;
                        }
                        break;
                    case 1:
                        this.b.f.o(true, false);
                        break;
                    default:
                        n3 n3Var = this.b;
                        k3 k3Var2 = n3Var.e;
                        n3Var.f.o(false, false);
                        e3 e3Var = n3Var.r;
                        if (e3Var != null) {
                            e3Var.a.setTranslationY(((k3Var2.getTopActionBarOffsetY() + (-k3Var2.getOffsetY())) - k3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        n3Var.K.f0();
                        break;
                }
            }
        });
        k3Var.setDelegate(new a1(this, i12));
        final int i13 = 2;
        k3Var.setScrollListener(new Runnable(this) { // from class: org.telegram.ui.h3
            public final /* synthetic */ n3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        j4 j4Var2 = this.b.K;
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.q3 P = launchActivity.P();
                            if (P != null) {
                                boolean z10 = false;
                                int i122 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.q3.K;
                                    if (i122 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i122));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i132 = 0;
                                            while (i132 < size) {
                                                Object obj = arrayList.get(i132);
                                                i132++;
                                                org.telegram.ui.ActionBar.p3 p3Var = (org.telegram.ui.ActionBar.p3) obj;
                                                if (p3Var.J == j4Var2) {
                                                    z10 = P.h(i122, p3Var, true);
                                                }
                                            }
                                        }
                                        i122++;
                                    }
                                }
                                if (z10) {
                                }
                            }
                            j4Var2.o(true, true);
                            break;
                        }
                        break;
                    case 1:
                        this.b.f.o(true, false);
                        break;
                    default:
                        n3 n3Var = this.b;
                        k3 k3Var2 = n3Var.e;
                        n3Var.f.o(false, false);
                        e3 e3Var = n3Var.r;
                        if (e3Var != null) {
                            e3Var.a.setTranslationY(((k3Var2.getTopActionBarOffsetY() + (-k3Var2.getOffsetY())) - k3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        n3Var.K.f0();
                        break;
                }
            }
        });
        k3Var.setTopActionBarOffsetY(AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight);
        addView(k3Var, w7.a6.c(-1.0f, -1));
        b();
        setType(0);
    }

    public static void a(n3 n3Var, boolean z10, int i10) {
        j4 j4Var = n3Var.K;
        w3 w3Var = j4Var.K;
        if (z10) {
            int v = org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false), i10);
            n3Var.w = v;
            if (n3Var == j4Var.u0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    j4Var.h0.d(v, true);
                }
                if (w3Var != null) {
                    w3Var.i();
                }
            }
        } else {
            int v9 = org.telegram.ui.ActionBar.j6.v(-1, i10);
            n3Var.x = v9;
            if (n3Var == j4Var.u0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    j4Var.h0.setMenuColors(v9);
                }
                if (w3Var != null) {
                    w3Var.i();
                }
            }
        }
        j4Var.f0();
    }

    public final void b() {
        this.s = false;
        this.v = false;
        setWeb(null);
        l3 l3Var = this.f;
        l3Var.i();
        l3Var.a = null;
        int i10 = org.telegram.ui.ActionBar.j6.Pk;
        this.w = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        this.x = w02;
        e3 e3Var = this.r;
        if (e3Var != null) {
            e3Var.b(AndroidUtilities.computePerceivedBrightness(w02) <= 0.721f, true);
            this.r.setBackgroundColor(this.x);
            e3 e3Var2 = this.r;
            this.n = false;
            AndroidUtilities.updateViewVisibilityAnimated(e3Var2, false, 1.0f, false);
        }
        h4 h4Var = this.c;
        h4Var.E = null;
        h4Var.e.clear();
        h4Var.f.clear();
        h4Var.s.clear();
        h4Var.v.clear();
        h4Var.h.clear();
        h4Var.r.clear();
        h4Var.n.clear();
        h4Var.x.clear();
        h4Var.w.clear();
        h4Var.F = null;
        h4Var.l();
        invalidate();
    }

    public final boolean c() {
        return this.a == 0;
    }

    public final boolean d() {
        h4 h4Var;
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        return (f() || (h4Var = this.c) == null || (webPage = h4Var.E) == null || (page = webPage.cached_page) == null || page.local == null) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e() {
        org.telegram.ui.web.y0 webView;
        String v;
        return f() && (webView = getWebView()) != null && (v = org.telegram.ui.web.c1.v(webView.getUrl())) != null && org.telegram.ui.web.c1.q(Uri.parse(v));
    }

    public final boolean f() {
        return this.a == 1;
    }

    public final void g() {
        if (c()) {
            w3 w3Var = this.K.K;
            this.d.h1(w3Var != null ? 1 : 0, w3Var != null ? AndroidUtilities.dp(32.0f) : 0);
        } else if (f()) {
            k3 k3Var = this.e;
            k3Var.setSwipeOffsetY(k3Var.getTopActionBarOffsetY() + (-k3Var.getOffsetY()));
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

    public h4 getAdapter() {
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
        bi.z zVar = this.b;
        float height = zVar.getHeight();
        for (int i11 = 0; i11 < zVar.getChildCount(); i11++) {
            View childAt = zVar.getChildAt(i11);
            if (zVar.getLayoutManager() == null) {
                i10 = 0;
            } else {
                zVar.getLayoutManager().getClass();
                i10 = RecyclerView.U(childAt).f;
            }
            height = i10 == 2147483646 ? Math.min(height, childAt.getBottom()) : Math.min(height, childAt.getTop());
        }
        return height;
    }

    public org.telegram.ui.Components.vl0 getListView() {
        return this.b;
    }

    public float getProgress() {
        org.telegram.ui.web.y0 webView;
        w3 w3Var = this.K.K;
        if (c()) {
            float f7 = this.I;
            if (f7 >= 0.0f) {
                return f7;
            }
            s4.c0 c0Var = this.d;
            int L0 = c0Var.L0();
            if (c0Var.m(L0) != null) {
                int[] iArr = this.c.I;
                bi.z zVar = this.b;
                if (iArr != null) {
                    int i10 = L0 - 1;
                    return Utilities.clamp01((((i10 < 0 || i10 >= iArr.length) ? 0 : iArr[i10]) + ((L0 != 0 || w3Var == null) ? -r4.getTop() : 0)) / Math.max(1, r5.J - zVar.getHeight()));
                }
                int N0 = c0Var.N0();
                if (w3Var != null) {
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
                    return ((L0 * width) + (N0 >= B ? (((B - L0) * width) * (zVar.getMeasuredHeight() - m10.getTop())) / measuredHeight : (1.0f - ((Math.min(0, m10.getTop() - zVar.getPaddingTop()) + measuredHeight) / measuredHeight)) * width)) / getWidth();
                }
            }
        } else if (f() && (webView = this.f.getWebView()) != null) {
            return webView.getScrollProgress();
        }
        return 0.0f;
    }

    public String getSubtitle() {
        org.telegram.ui.web.y0 webView;
        l0 l0Var;
        if (!f() || (webView = this.f.getWebView()) == null) {
            return "";
        }
        if (TextUtils.equals(this.F, webView.getUrl())) {
            return this.G;
        }
        try {
            String url = webView.getUrl();
            this.F = url;
            Uri parse = Uri.parse(org.telegram.ui.web.c1.v(url));
            String uri = (parse.getScheme() == null || !(parse.getScheme().equalsIgnoreCase("http") || parse.getScheme().equalsIgnoreCase("https"))) ? parse.toString() : parse.getSchemeSpecificPart();
            try {
                if (!e()) {
                    try {
                        Uri parse2 = Uri.parse(uri);
                        if (parse2.getHost() != null) {
                            parse = parse2;
                        }
                        String a2 = nf.f.a(parse.getHost());
                        String[] split = a2.split("\\.");
                        if (split.length > 2 && (l0Var = this.K.h0) != null && bi.x4.g(a2, l0Var.E) > AndroidUtilities.displaySize.x - AndroidUtilities.dp(162.0f)) {
                            a2 = split[split.length - 2] + '.' + split[split.length - 1];
                        }
                        uri = nf.f.v(parse, null, "", a2, null);
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
        org.telegram.ui.web.y0 webView;
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

    public org.telegram.ui.web.y0 getWebView() {
        l3 l3Var = this.f;
        if (l3Var != null) {
            return l3Var.getWebView();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        e3 e3Var;
        super.onAttachedToWindow();
        if (!this.n || (e3Var = this.r) == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.j6.Pk;
        e3Var.b(AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, i10, false)) <= 0.721f, false);
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
        j4 j4Var = this.K;
        j4Var.f0();
        if (j4Var.f0.f) {
            j4Var.g0.invalidate();
        }
        if (j4Var.f0.e) {
            j4Var.g0.invalidate();
            j4Var.X((int) (((AndroidUtilities.dp(56.0f) - j4Var.f0.h) * (f7 / getMeasuredWidth())) + j4Var.f0.h));
        }
        w3 w3Var = j4Var.K;
        if (w3Var != null) {
            w3Var.n();
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

    public void setWeb(a3 a3Var) {
        a3 a3Var2 = this.J;
        if (a3Var2 != a3Var) {
            if (a3Var2 != null) {
                a3Var2.c(this);
            }
            this.J = a3Var;
            if (a3Var != null) {
                org.telegram.ui.web.y0 y0Var = a3Var.b;
                l3 l3Var = this.f;
                if (y0Var != null) {
                    y0Var.onResume();
                    l3Var.O(UserConfig.selectedAccount, a3Var.b, a3Var.d, a3Var.x, false);
                    a(this, true, a3Var.q);
                    a(this, false, a3Var.r);
                } else {
                    String str = a3Var.x;
                    if (str != null) {
                        l3Var.u(UserConfig.selectedAccount, str, false);
                    }
                }
            }
            org.telegram.ui.web.i2 i2Var = this.y;
            if (i2Var != null) {
                i2Var.a();
                org.telegram.ui.web.i2 i2Var2 = this.y;
                TLRPC.TL_webPage tL_webPage = i2Var2.j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.k2.o(tL_webPage);
                    i2Var2.j = null;
                }
                this.y = null;
            }
        }
    }
}
