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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class m3 extends FrameLayout {
    public org.telegram.ui.web.f2 E;
    public boolean F;
    public String G;
    public String H;
    public boolean I;
    public float J;
    public y2 K;
    public final /* synthetic */ j4 L;
    public int a;
    public final fi.v b;
    public final h4 c;
    public final s4.c0 d;
    public final j3 e;
    public final k3 f;
    public boolean h;
    public boolean n;
    public c3 r;
    public boolean s;
    public boolean v;
    public int w;
    public int x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(j4 j4Var, Activity activity) {
        super(activity);
        this.L = j4Var;
        int i10 = org.telegram.ui.ActionBar.y6.Pk;
        this.w = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        this.x = x02;
        this.y = x02;
        this.F = false;
        this.J = -1.0f;
        new Matrix();
        fi.v vVar = new fi.v(this, activity);
        this.b = vVar;
        vVar.setClipToPadding(false);
        vVar.setPadding(0, AndroidUtilities.dp(56.0f), 0, 0);
        vVar.setTopGlowOffset(AndroidUtilities.dp(56.0f));
        ((s4.l) vVar.getItemAnimator()).C = false;
        h4 h4Var = new h4(j4Var, activity, j4Var.K != null);
        this.c = h4Var;
        vVar.setAdapter(h4Var);
        s4.c0 c0Var = new s4.c0(1, false);
        this.d = c0Var;
        vVar.setLayoutManager(c0Var);
        vVar.setOnScrollListener(new i3(this, 0));
        addView(vVar, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        j3 j3Var = new j3(this, getContext());
        this.e = j3Var;
        j3Var.setShouldWaitWebViewScroll(true);
        j3Var.setFullSize(true);
        j3Var.setAllowFullSizeSwipe(true);
        k3 k3Var = new k3(this, getContext(), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false));
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
                        j4 j4Var2 = this.b.L;
                        LaunchActivity launchActivity = LaunchActivity.I1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.s3 P = launchActivity.P();
                            if (P != null) {
                                boolean z10 = false;
                                int i12 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.s3.K;
                                    if (i12 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i12));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj = arrayList.get(i13);
                                                i13++;
                                                org.telegram.ui.ActionBar.r3 r3Var = (org.telegram.ui.ActionBar.r3) obj;
                                                if (r3Var.J == j4Var2) {
                                                    z10 = P.h(i12, r3Var, true);
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
                        this.b.f.n(true, false);
                        break;
                    default:
                        m3 m3Var = this.b;
                        j3 j3Var2 = m3Var.e;
                        m3Var.f.n(false, false);
                        c3 c3Var = m3Var.r;
                        if (c3Var != null) {
                            c3Var.a.setTranslationY(((j3Var2.getTopActionBarOffsetY() + (-j3Var2.getOffsetY())) - j3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        m3Var.L.f0();
                        break;
                }
            }
        });
        k3Var.setWebViewProgressListener(new h3(this, i11));
        k3Var.setDelegate(new l3(this));
        k3Var.setWebViewScrollListener(new f(this, 2));
        j3Var.addView(k3Var, org.telegram.ui.Components.gb1.g(-1.0f, -1));
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
                        j4 j4Var2 = this.b.L;
                        LaunchActivity launchActivity = LaunchActivity.I1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.s3 P = launchActivity.P();
                            if (P != null) {
                                boolean z10 = false;
                                int i122 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.s3.K;
                                    if (i122 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i122));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i13 = 0;
                                            while (i13 < size) {
                                                Object obj = arrayList.get(i13);
                                                i13++;
                                                org.telegram.ui.ActionBar.r3 r3Var = (org.telegram.ui.ActionBar.r3) obj;
                                                if (r3Var.J == j4Var2) {
                                                    z10 = P.h(i122, r3Var, true);
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
                        this.b.f.n(true, false);
                        break;
                    default:
                        m3 m3Var = this.b;
                        j3 j3Var2 = m3Var.e;
                        m3Var.f.n(false, false);
                        c3 c3Var = m3Var.r;
                        if (c3Var != null) {
                            c3Var.a.setTranslationY(((j3Var2.getTopActionBarOffsetY() + (-j3Var2.getOffsetY())) - j3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        m3Var.L.f0();
                        break;
                }
            }
        });
        j3Var.setDelegate(new y0(this, i12));
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
                        j4 j4Var2 = this.b.L;
                        LaunchActivity launchActivity = LaunchActivity.I1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.s3 P = launchActivity.P();
                            if (P != null) {
                                boolean z10 = false;
                                int i122 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.s3.K;
                                    if (i122 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i122));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i132 = 0;
                                            while (i132 < size) {
                                                Object obj = arrayList.get(i132);
                                                i132++;
                                                org.telegram.ui.ActionBar.r3 r3Var = (org.telegram.ui.ActionBar.r3) obj;
                                                if (r3Var.J == j4Var2) {
                                                    z10 = P.h(i122, r3Var, true);
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
                        this.b.f.n(true, false);
                        break;
                    default:
                        m3 m3Var = this.b;
                        j3 j3Var2 = m3Var.e;
                        m3Var.f.n(false, false);
                        c3 c3Var = m3Var.r;
                        if (c3Var != null) {
                            c3Var.a.setTranslationY(((j3Var2.getTopActionBarOffsetY() + (-j3Var2.getOffsetY())) - j3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        m3Var.L.f0();
                        break;
                }
            }
        });
        j3Var.setTopActionBarOffsetY(AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight);
        addView(j3Var, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        b();
        setType(0);
    }

    public static void a(m3 m3Var, boolean z10, int i10) {
        j4 j4Var = m3Var.L;
        v3 v3Var = j4Var.K;
        if (z10) {
            int v = org.telegram.ui.ActionBar.y6.v(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Pk, false), i10);
            m3Var.w = v;
            if (m3Var == j4Var.u0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    j4Var.h0.d(v, true);
                }
                if (v3Var != null) {
                    v3Var.i();
                }
            }
        } else {
            int v10 = org.telegram.ui.ActionBar.y6.v(-1, i10);
            m3Var.x = v10;
            if (m3Var == j4Var.u0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    j4Var.h0.setMenuColors(v10);
                }
                if (v3Var != null) {
                    v3Var.i();
                }
            }
        }
        j4Var.f0();
    }

    public final void b() {
        this.s = false;
        this.v = false;
        setWeb(null);
        k3 k3Var = this.f;
        k3Var.h();
        k3Var.a = null;
        int i10 = org.telegram.ui.ActionBar.y6.Pk;
        this.w = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        this.x = x02;
        this.y = x02;
        c3 c3Var = this.r;
        if (c3Var != null) {
            c3Var.b(AndroidUtilities.computePerceivedBrightness(x02) <= 0.721f, true);
            this.r.setBackgroundColor(this.x);
            c3 c3Var2 = this.r;
            this.n = false;
            AndroidUtilities.updateViewVisibilityAnimated(c3Var2, false, 1.0f, false);
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
        org.telegram.ui.web.x0 webView;
        String u10;
        return f() && (webView = getWebView()) != null && (u10 = org.telegram.ui.web.a1.u(webView.getUrl())) != null && org.telegram.ui.web.a1.p(Uri.parse(u10));
    }

    public final boolean f() {
        return this.a == 1;
    }

    public final void g() {
        if (c()) {
            v3 v3Var = this.L.K;
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
        int i10 = org.telegram.ui.ActionBar.y6.Pk;
        this.L.getClass();
        return org.telegram.ui.ActionBar.y6.x0(null, i10, false);
    }

    public h4 getAdapter() {
        return this.c;
    }

    public int getBackgroundColor() {
        return (f() && SharedConfig.adaptableColorInBrowser) ? this.n ? org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Pk, false) : this.x : org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Pk, false);
    }

    public float getListTop() {
        int i10;
        if (!c()) {
            if (f()) {
                return this.e.getTranslationY();
            }
            return 0.0f;
        }
        fi.v vVar = this.b;
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
        org.telegram.ui.web.x0 webView;
        v3 v3Var = this.L.K;
        if (c()) {
            float f7 = this.J;
            if (f7 >= 0.0f) {
                return f7;
            }
            s4.c0 c0Var = this.d;
            int L0 = c0Var.L0();
            if (c0Var.m(L0) != null) {
                int[] iArr = this.c.I;
                fi.v vVar = this.b;
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
        org.telegram.ui.web.x0 webView;
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
            Uri parse = Uri.parse(org.telegram.ui.web.a1.u(url));
            String uri = (parse.getScheme() == null || !(parse.getScheme().equalsIgnoreCase("http") || parse.getScheme().equalsIgnoreCase("https"))) ? parse.toString() : parse.getSchemeSpecificPart();
            try {
                if (!e()) {
                    try {
                        Uri parse2 = Uri.parse(uri);
                        if (parse2.getHost() != null) {
                            parse = parse2;
                        }
                        String a2 = qf.d.a(parse.getHost());
                        String[] split = a2.split("\\.");
                        if (split.length > 2 && (l0Var = this.L.h0) != null && fi.v3.g(a2, l0Var.E) > AndroidUtilities.displaySize.x - AndroidUtilities.dp(162.0f)) {
                            a2 = split[split.length - 2] + '.' + split[split.length - 1];
                        }
                        uri = qf.d.u(parse, null, "", a2, null);
                    } catch (Exception e) {
                        FileLog.e((Throwable) e, false);
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
            this.H = uri;
            return uri;
        } catch (Exception unused) {
            return webView.getUrl();
        }
    }

    public String getTitle() {
        org.telegram.ui.web.x0 webView;
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

    public org.telegram.ui.web.a1 getWebContainer() {
        return this.f;
    }

    public org.telegram.ui.web.x0 getWebView() {
        k3 k3Var = this.f;
        if (k3Var != null) {
            return k3Var.getWebView();
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
        int i10 = org.telegram.ui.ActionBar.y6.Pk;
        c3Var.b(AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.x0(null, i10, false)) <= 0.721f, false);
        org.telegram.ui.ActionBar.f7.i(i10, this.r, null);
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
        j4 j4Var = this.L;
        j4Var.f0();
        if (j4Var.f0.f) {
            j4Var.g0.invalidate();
        }
        if (j4Var.f0.e) {
            j4Var.g0.invalidate();
            j4Var.X((int) (((AndroidUtilities.dp(56.0f) - j4Var.f0.h) * (f7 / getMeasuredWidth())) + j4Var.f0.h));
        }
        v3 v3Var = j4Var.K;
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

    public void setWeb(y2 y2Var) {
        y2 y2Var2 = this.K;
        if (y2Var2 != y2Var) {
            if (y2Var2 != null) {
                y2Var2.c(this);
            }
            this.K = y2Var;
            if (y2Var != null) {
                org.telegram.ui.web.x0 x0Var = y2Var.b;
                if (x0Var != null) {
                    x0Var.onResume();
                    this.f.N(UserConfig.selectedAccount, y2Var.b, y2Var.d, y2Var.x, false);
                    a(this, true, y2Var.q);
                    a(this, false, y2Var.r);
                } else {
                    String str = y2Var.x;
                    if (str != null) {
                        this.f.t(UserConfig.selectedAccount, str, false);
                    }
                }
            }
            org.telegram.ui.web.f2 f2Var = this.E;
            if (f2Var != null) {
                f2Var.a();
                org.telegram.ui.web.f2 f2Var2 = this.E;
                TLRPC.TL_webPage tL_webPage = f2Var2.j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.h2.o(tL_webPage);
                    f2Var2.j = null;
                }
                this.E = null;
            }
        }
    }
}
