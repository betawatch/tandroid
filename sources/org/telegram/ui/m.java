package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class m extends FrameLayout {
    public int E;
    public bvc F;
    public boolean G;
    public String H;
    public String I;
    public boolean J;
    public float K;
    public zw L;
    public final /* synthetic */ o M;
    public int a;
    public final hx b;
    public final ey c;
    public final u46 d;
    public final ix e;
    public final l f;
    public boolean h;
    public boolean n;
    public cx r;
    public boolean s;
    public boolean w;
    public int x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, Activity activity) {
        super(activity);
        this.M = oVar;
        int i = cmb.Fl;
        final byte b = 0;
        this.x = cmb.w0(null, i, false);
        int w0 = cmb.w0(null, i, false);
        this.y = w0;
        this.E = w0;
        this.G = false;
        this.K = -1.0f;
        hx hxVar = new hx(this, activity);
        this.b = hxVar;
        hxVar.setClipToPadding(false);
        hxVar.setPadding(0, gm.L(56.0f), 0, 0);
        hxVar.setTopGlowOffset(gm.L(56.0f));
        ((sc3) hxVar.getItemAnimator()).C = false;
        final byte b2 = 1;
        ey eyVar = new ey(oVar, activity, oVar.L != null);
        this.c = eyVar;
        hxVar.setAdapter(eyVar);
        u46 u46Var = new u46(1, false);
        this.d = u46Var;
        hxVar.setLayoutManager(u46Var);
        hxVar.setOnScrollListener(new y(this, (byte) 5));
        addView(hxVar, qoe.c(-1.0f, -1));
        ix ixVar = new ix(getContext());
        this.e = ixVar;
        ixVar.setShouldWaitWebViewScroll(true);
        ixVar.setFullSize(true);
        ixVar.setAllowFullSizeSwipe(true);
        l lVar = new l(this, getContext(), cmb.w0(null, cmb.c6, false));
        this.f = lVar;
        lVar.setOnCloseRequestedListener(new Runnable(this) { // from class: fx
            public final /* synthetic */ m b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b;
                boolean z = false;
                m mVar = this.b;
                switch (b3) {
                    case 0:
                        o oVar2 = mVar.M;
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity != null) {
                            xy0 O = launchActivity.O();
                            if (O != null) {
                                int i2 = 0;
                                while (true) {
                                    HashMap hashMap = xy0.L;
                                    if (i2 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i2));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i3 = 0;
                                            while (i3 < size) {
                                                Object obj = arrayList.get(i3);
                                                i3++;
                                                wy0 wy0Var = (wy0) obj;
                                                if (wy0Var.J == oVar2) {
                                                    z = O.h(i2, wy0Var, true);
                                                }
                                            }
                                        }
                                        i2++;
                                    }
                                }
                                if (z) {
                                }
                            }
                            oVar2.l(true, true);
                            break;
                        }
                        break;
                    case 1:
                        mVar.f.l(true, false);
                        break;
                    default:
                        ix ixVar2 = mVar.e;
                        mVar.f.l(false, false);
                        cx cxVar = mVar.r;
                        if (cxVar != null) {
                            cxVar.a.setTranslationY(((ixVar2.getTopActionBarOffsetY() + (-ixVar2.getOffsetY())) - ixVar2.getSwipeOffsetY()) / 2.0f);
                        }
                        mVar.M.d0();
                        break;
                }
            }
        });
        lVar.setWebViewProgressListener(new gx(this, b));
        lVar.setDelegate(new jx(this));
        lVar.setWebViewScrollListener(new nl9((Object) this, (byte) 6));
        ixVar.addView(lVar, qoe.c(-1.0f, -1));
        ixVar.setScrollEndListener(new Runnable(this) { // from class: fx
            public final /* synthetic */ m b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b3 = b2;
                boolean z = false;
                m mVar = this.b;
                switch (b3) {
                    case 0:
                        o oVar2 = mVar.M;
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity != null) {
                            xy0 O = launchActivity.O();
                            if (O != null) {
                                int i2 = 0;
                                while (true) {
                                    HashMap hashMap = xy0.L;
                                    if (i2 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i2));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i3 = 0;
                                            while (i3 < size) {
                                                Object obj = arrayList.get(i3);
                                                i3++;
                                                wy0 wy0Var = (wy0) obj;
                                                if (wy0Var.J == oVar2) {
                                                    z = O.h(i2, wy0Var, true);
                                                }
                                            }
                                        }
                                        i2++;
                                    }
                                }
                                if (z) {
                                }
                            }
                            oVar2.l(true, true);
                            break;
                        }
                        break;
                    case 1:
                        mVar.f.l(true, false);
                        break;
                    default:
                        ix ixVar2 = mVar.e;
                        mVar.f.l(false, false);
                        cx cxVar = mVar.r;
                        if (cxVar != null) {
                            cxVar.a.setTranslationY(((ixVar2.getTopActionBarOffsetY() + (-ixVar2.getOffsetY())) - ixVar2.getSwipeOffsetY()) / 2.0f);
                        }
                        mVar.M.d0();
                        break;
                }
            }
        });
        ixVar.setDelegate(new l0(this, (byte) 22));
        final byte b3 = 2;
        ixVar.setScrollListener(new Runnable(this) { // from class: fx
            public final /* synthetic */ m b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b32 = b3;
                boolean z = false;
                m mVar = this.b;
                switch (b32) {
                    case 0:
                        o oVar2 = mVar.M;
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity != null) {
                            xy0 O = launchActivity.O();
                            if (O != null) {
                                int i2 = 0;
                                while (true) {
                                    HashMap hashMap = xy0.L;
                                    if (i2 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i2));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i3 = 0;
                                            while (i3 < size) {
                                                Object obj = arrayList.get(i3);
                                                i3++;
                                                wy0 wy0Var = (wy0) obj;
                                                if (wy0Var.J == oVar2) {
                                                    z = O.h(i2, wy0Var, true);
                                                }
                                            }
                                        }
                                        i2++;
                                    }
                                }
                                if (z) {
                                }
                            }
                            oVar2.l(true, true);
                            break;
                        }
                        break;
                    case 1:
                        mVar.f.l(true, false);
                        break;
                    default:
                        ix ixVar2 = mVar.e;
                        mVar.f.l(false, false);
                        cx cxVar = mVar.r;
                        if (cxVar != null) {
                            cxVar.a.setTranslationY(((ixVar2.getTopActionBarOffsetY() + (-ixVar2.getOffsetY())) - ixVar2.getSwipeOffsetY()) / 2.0f);
                        }
                        mVar.M.d0();
                        break;
                }
            }
        });
        ixVar.setTopActionBarOffsetY(gm.L(56.0f) + gm.m);
        addView(ixVar, qoe.c(-1.0f, -1));
        a();
        setType(0);
    }

    public final void a() {
        this.s = false;
        this.w = false;
        setWeb(null);
        l lVar = this.f;
        lVar.f();
        lVar.a = null;
        int i = cmb.Fl;
        this.x = cmb.w0(null, i, false);
        int w0 = cmb.w0(null, i, false);
        this.y = w0;
        this.E = w0;
        cx cxVar = this.r;
        if (cxVar != null) {
            cxVar.b(gm.B(w0) <= 0.721f, true);
            this.r.setBackgroundColor(this.y);
            cx cxVar2 = this.r;
            this.n = false;
            gm.T3(cxVar2, false, 1.0f, true, false);
        }
        ey eyVar = this.c;
        eyVar.F = null;
        eyVar.e.clear();
        eyVar.f.clear();
        eyVar.s.clear();
        eyVar.w.clear();
        eyVar.h.clear();
        eyVar.r.clear();
        eyVar.n.clear();
        eyVar.y.clear();
        eyVar.x.clear();
        eyVar.G = null;
        eyVar.f();
        invalidate();
    }

    public final boolean b() {
        return this.a == 0;
    }

    public final boolean c() {
        ey eyVar;
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        return (e() || (eyVar = this.c) == null || (webPage = eyVar.F) == null || (page = webPage.cached_page) == null || page.local == null) ? false : true;
    }

    public final boolean d() {
        mw0 webView;
        String r;
        return e() && (webView = getWebView()) != null && (r = qw0.r(webView.getUrl())) != null && qw0.n(Uri.parse(r));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e() {
        return this.a == 1;
    }

    public final void f() {
        if (b()) {
            sx sxVar = this.M.L;
            this.d.g1(sxVar != null ? 1 : 0, sxVar != null ? gm.L(32.0f) : 0);
        } else if (e()) {
            ix ixVar = this.e;
            ixVar.setSwipeOffsetY(ixVar.getTopActionBarOffsetY() + (-ixVar.getOffsetY()));
        }
    }

    public final void g(int i, boolean z) {
        o oVar = this.M;
        sx sxVar = oVar.L;
        if (z) {
            int v = cmb.v(cmb.w0(null, cmb.Fl, false), i);
            this.x = v;
            if (this == oVar.v0[0]) {
                if (gda.s0) {
                    oVar.i0.d(v, true);
                }
                if (sxVar != null) {
                    sxVar.u();
                }
            }
        } else {
            int v2 = cmb.v(-1, i);
            this.y = v2;
            if (this == oVar.v0[0]) {
                if (gda.s0) {
                    oVar.i0.setMenuColors(v2);
                }
                if (sxVar != null) {
                    sxVar.u();
                }
            }
        }
        oVar.d0();
    }

    public int getActionBarColor() {
        return (e() && gda.s0) ? this.x : cmb.w0(null, cmb.Fl, false);
    }

    public ey getAdapter() {
        return this.c;
    }

    public int getBackgroundColor() {
        return (e() && gda.s0) ? this.n ? cmb.w0(null, cmb.Fl, false) : this.y : cmb.w0(null, cmb.Fl, false);
    }

    public float getListTop() {
        int i;
        if (!b()) {
            if (e()) {
                return this.e.getTranslationY();
            }
            return 0.0f;
        }
        hx hxVar = this.b;
        float height = hxVar.getHeight();
        for (int i2 = 0; i2 < hxVar.getChildCount(); i2++) {
            View childAt = hxVar.getChildAt(i2);
            if (hxVar.getLayoutManager() == null) {
                i = 0;
            } else {
                hxVar.getLayoutManager().getClass();
                i = RecyclerView.U(childAt).f;
            }
            height = i == 2147483646 ? Math.min(height, childAt.getBottom()) : Math.min(height, childAt.getTop());
        }
        return height;
    }

    public r59 getListView() {
        return this.b;
    }

    public float getProgress() {
        mw0 webView;
        sx sxVar = this.M.L;
        if (b()) {
            float f = this.K;
            if (f >= 0.0f) {
                return f;
            }
            u46 u46Var = this.d;
            int K0 = u46Var.K0();
            if (u46Var.m(K0) != null) {
                int[] iArr = this.c.K;
                hx hxVar = this.b;
                if (iArr != null) {
                    int i = K0 - 1;
                    return Utilities.l((((i < 0 || i >= iArr.length) ? 0 : iArr[i]) + ((K0 != 0 || sxVar == null) ? -r4.getTop() : 0)) / Math.max(1, r5.L - hxVar.getHeight()));
                }
                int M0 = u46Var.M0();
                if (sxVar != null) {
                    if (K0 < 1) {
                        K0 = 1;
                    }
                    if (M0 < 1) {
                        M0 = 1;
                    }
                }
                int A = u46Var.A() - 2;
                View m = M0 >= A ? u46Var.m(A) : u46Var.m(K0);
                if (m != null) {
                    float width = getWidth() / (r0 - 1);
                    float measuredHeight = m.getMeasuredHeight();
                    return ((K0 * width) + (M0 >= A ? (((A - K0) * width) * (hxVar.getMeasuredHeight() - m.getTop())) / measuredHeight : (1.0f - ((Math.min(0, m.getTop() - hxVar.getPaddingTop()) + measuredHeight) / measuredHeight)) * width)) / getWidth();
                }
            }
        } else if (e() && (webView = this.f.getWebView()) != null) {
            return webView.getScrollProgress();
        }
        return 0.0f;
    }

    public String getSubtitle() {
        mw0 webView;
        wu wuVar;
        if (!e() || (webView = this.f.getWebView()) == null) {
            return "";
        }
        if (TextUtils.equals(this.H, webView.getUrl())) {
            return this.I;
        }
        try {
            String url = webView.getUrl();
            this.H = url;
            Uri parse = Uri.parse(qw0.r(url));
            String uri = (parse.getScheme() == null || !(parse.getScheme().equalsIgnoreCase("http") || parse.getScheme().equalsIgnoreCase("https"))) ? parse.toString() : parse.getSchemeSpecificPart();
            try {
                if (!d()) {
                    try {
                        Uri parse2 = Uri.parse(uri);
                        if (parse2.getHost() != null) {
                            parse = parse2;
                        }
                        String a = l11.a(parse.getHost());
                        String[] split = a.split("\\.");
                        if (split.length > 2 && (wuVar = this.M.i0) != null && hg5.h(a, wuVar.F) > gm.q.x - gm.L(162.0f)) {
                            a = split[split.length - 2] + '.' + split[split.length - 1];
                        }
                        uri = l11.x(parse, null, "", a, null);
                    } catch (Exception e) {
                        fc4.g(e, false);
                    }
                    uri = URLDecoder.decode(uri.replaceAll("\\+", "%2b"), "UTF-8");
                }
            } catch (Exception e2) {
                fc4.g(e2, true);
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
        mw0 webView;
        TLRPC.WebPage webPage;
        if (b() && (webPage = this.c.F) != null) {
            String str = webPage.site_name;
            if (str != null) {
                return str;
            }
            String str2 = webPage.title;
            if (str2 != null) {
                return str2;
            }
        }
        return (!e() || (webView = this.f.getWebView()) == null) ? "" : webView.getTitle();
    }

    public qw0 getWebContainer() {
        return this.f;
    }

    public mw0 getWebView() {
        l lVar = this.f;
        if (lVar != null) {
            return lVar.getWebView();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        cx cxVar;
        super.onAttachedToWindow();
        if (!this.n || (cxVar = this.r) == null) {
            return;
        }
        int i = cmb.Fl;
        cxVar.b(gm.B(cmb.w0(null, i, false)) <= 0.721f, false);
        anb.h(i, null, this.r);
    }

    public void setLastVisible(boolean z) {
        if (this.J != z) {
            this.J = z;
            this.f.setKeyboardFocusable(z);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        o oVar = this.M;
        oVar.d0();
        if (oVar.g0.f) {
            oVar.h0.invalidate();
        }
        if (oVar.g0.e) {
            oVar.h0.invalidate();
            oVar.V((int) (((gm.L(56.0f) - oVar.g0.h) * (f / getMeasuredWidth())) + oVar.g0.h));
        }
        sx sxVar = oVar.L;
        if (sxVar != null) {
            sxVar.A();
        }
    }

    public void setType(int i) {
        if (this.a != i) {
            a();
        }
        this.a = i;
        this.b.setVisibility(b() ? 0 : 8);
        this.e.setVisibility(e() ? 0 : 8);
    }

    public void setWeb(zw zwVar) {
        zw zwVar2 = this.L;
        if (zwVar2 != zwVar) {
            if (zwVar2 != null) {
                zwVar2.c(this);
            }
            this.L = zwVar;
            if (zwVar != null) {
                mw0 mw0Var = zwVar.b;
                l lVar = this.f;
                if (mw0Var != null) {
                    mw0Var.onResume();
                    lVar.L(z8c.t0, zwVar.b, zwVar.d, zwVar.x, false);
                    g(zwVar.q, true);
                    g(zwVar.r, false);
                } else {
                    String str = zwVar.x;
                    if (str != null) {
                        lVar.q(z8c.t0, str, false);
                    }
                }
            }
            bvc bvcVar = this.F;
            if (bvcVar != null) {
                bvcVar.a();
                bvc bvcVar2 = this.F;
                TLRPC.TL_webPage tL_webPage = bvcVar2.j;
                if (tL_webPage != null) {
                    dvc.o(tL_webPage);
                    bvcVar2.j = null;
                }
                this.F = null;
            }
        }
    }
}
