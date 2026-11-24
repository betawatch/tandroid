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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class m extends FrameLayout {
    public int E;
    public atc F;
    public boolean G;
    public String H;
    public String I;
    public boolean J;
    public float K;
    public zv L;
    public final /* synthetic */ o M;
    public int a;
    public final hw b;
    public final dx c;
    public final t26 d;
    public final iw e;
    public final l f;
    public boolean h;
    public boolean n;
    public cw r;
    public boolean s;
    public boolean w;
    public int x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, Activity activity) {
        super(activity);
        this.M = oVar;
        int i = bkb.Fl;
        final byte b = 0;
        this.x = bkb.w0(null, i, false);
        int w0 = bkb.w0(null, i, false);
        this.y = w0;
        this.E = w0;
        this.G = false;
        this.K = -1.0f;
        hw hwVar = new hw(this, activity);
        this.b = hwVar;
        hwVar.setClipToPadding(false);
        hwVar.setPadding(0, gl.L(56.0f), 0, 0);
        hwVar.setTopGlowOffset(gl.L(56.0f));
        ((gb3) hwVar.getItemAnimator()).C = false;
        final byte b2 = 1;
        dx dxVar = new dx(oVar, activity, oVar.L != null);
        this.c = dxVar;
        hwVar.setAdapter(dxVar);
        t26 t26Var = new t26(1, false);
        this.d = t26Var;
        hwVar.setLayoutManager(t26Var);
        hwVar.setOnScrollListener(new y(this, (byte) 4));
        addView(hwVar, nme.c(-1.0f, -1));
        iw iwVar = new iw(getContext());
        this.e = iwVar;
        iwVar.setShouldWaitWebViewScroll(true);
        iwVar.setFullSize(true);
        iwVar.setAllowFullSizeSwipe(true);
        l lVar = new l(this, getContext(), bkb.w0(null, bkb.c6, false));
        this.f = lVar;
        lVar.setOnCloseRequestedListener(new Runnable(this) { // from class: fw
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
                            qx0 O = launchActivity.O();
                            if (O != null) {
                                int i2 = 0;
                                while (true) {
                                    HashMap hashMap = qx0.L;
                                    if (i2 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i2));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i3 = 0;
                                            while (i3 < size) {
                                                Object obj = arrayList.get(i3);
                                                i3++;
                                                px0 px0Var = (px0) obj;
                                                if (px0Var.J == oVar2) {
                                                    z = O.h(i2, px0Var, true);
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
                        iw iwVar2 = mVar.e;
                        mVar.f.l(false, false);
                        cw cwVar = mVar.r;
                        if (cwVar != null) {
                            cwVar.a.setTranslationY(((iwVar2.getTopActionBarOffsetY() + (-iwVar2.getOffsetY())) - iwVar2.getSwipeOffsetY()) / 2.0f);
                        }
                        mVar.M.d0();
                        break;
                }
            }
        });
        lVar.setWebViewProgressListener(new gw(this, b));
        lVar.setDelegate(new jw(this));
        lVar.setWebViewScrollListener(new lj9((Object) this, (byte) 6));
        iwVar.addView(lVar, nme.c(-1.0f, -1));
        iwVar.setScrollEndListener(new Runnable(this) { // from class: fw
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
                            qx0 O = launchActivity.O();
                            if (O != null) {
                                int i2 = 0;
                                while (true) {
                                    HashMap hashMap = qx0.L;
                                    if (i2 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i2));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i3 = 0;
                                            while (i3 < size) {
                                                Object obj = arrayList.get(i3);
                                                i3++;
                                                px0 px0Var = (px0) obj;
                                                if (px0Var.J == oVar2) {
                                                    z = O.h(i2, px0Var, true);
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
                        iw iwVar2 = mVar.e;
                        mVar.f.l(false, false);
                        cw cwVar = mVar.r;
                        if (cwVar != null) {
                            cwVar.a.setTranslationY(((iwVar2.getTopActionBarOffsetY() + (-iwVar2.getOffsetY())) - iwVar2.getSwipeOffsetY()) / 2.0f);
                        }
                        mVar.M.d0();
                        break;
                }
            }
        });
        iwVar.setDelegate(new l0(this, (byte) 20));
        final byte b3 = 2;
        iwVar.setScrollListener(new Runnable(this) { // from class: fw
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
                            qx0 O = launchActivity.O();
                            if (O != null) {
                                int i2 = 0;
                                while (true) {
                                    HashMap hashMap = qx0.L;
                                    if (i2 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i2));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i3 = 0;
                                            while (i3 < size) {
                                                Object obj = arrayList.get(i3);
                                                i3++;
                                                px0 px0Var = (px0) obj;
                                                if (px0Var.J == oVar2) {
                                                    z = O.h(i2, px0Var, true);
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
                        iw iwVar2 = mVar.e;
                        mVar.f.l(false, false);
                        cw cwVar = mVar.r;
                        if (cwVar != null) {
                            cwVar.a.setTranslationY(((iwVar2.getTopActionBarOffsetY() + (-iwVar2.getOffsetY())) - iwVar2.getSwipeOffsetY()) / 2.0f);
                        }
                        mVar.M.d0();
                        break;
                }
            }
        });
        iwVar.setTopActionBarOffsetY(gl.L(56.0f) + gl.m);
        addView(iwVar, nme.c(-1.0f, -1));
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
        int i = bkb.Fl;
        this.x = bkb.w0(null, i, false);
        int w0 = bkb.w0(null, i, false);
        this.y = w0;
        this.E = w0;
        cw cwVar = this.r;
        if (cwVar != null) {
            cwVar.b(gl.B(w0) <= 0.721f, true);
            this.r.setBackgroundColor(this.y);
            cw cwVar2 = this.r;
            this.n = false;
            gl.T3(cwVar2, false, 1.0f, true, false);
        }
        dx dxVar = this.c;
        dxVar.F = null;
        dxVar.e.clear();
        dxVar.f.clear();
        dxVar.s.clear();
        dxVar.w.clear();
        dxVar.h.clear();
        dxVar.r.clear();
        dxVar.n.clear();
        dxVar.y.clear();
        dxVar.x.clear();
        dxVar.G = null;
        dxVar.f();
        invalidate();
    }

    public final boolean b() {
        return this.a == 0;
    }

    public final boolean c() {
        dx dxVar;
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        return (e() || (dxVar = this.c) == null || (webPage = dxVar.F) == null || (page = webPage.cached_page) == null || page.local == null) ? false : true;
    }

    public final boolean d() {
        cv0 webView;
        String r;
        return e() && (webView = getWebView()) != null && (r = hv0.r(webView.getUrl())) != null && hv0.n(Uri.parse(r));
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
            sw swVar = this.M.L;
            this.d.g1(swVar != null ? 1 : 0, swVar != null ? gl.L(32.0f) : 0);
        } else if (e()) {
            iw iwVar = this.e;
            iwVar.setSwipeOffsetY(iwVar.getTopActionBarOffsetY() + (-iwVar.getOffsetY()));
        }
    }

    public final void g(int i, boolean z) {
        o oVar = this.M;
        sw swVar = oVar.L;
        if (z) {
            int v = bkb.v(bkb.w0(null, bkb.Fl, false), i);
            this.x = v;
            if (this == oVar.v0[0]) {
                if (gba.s0) {
                    oVar.i0.d(v, true);
                }
                if (swVar != null) {
                    swVar.s();
                }
            }
        } else {
            int v2 = bkb.v(-1, i);
            this.y = v2;
            if (this == oVar.v0[0]) {
                if (gba.s0) {
                    oVar.i0.setMenuColors(v2);
                }
                if (swVar != null) {
                    swVar.s();
                }
            }
        }
        oVar.d0();
    }

    public int getActionBarColor() {
        return (e() && gba.s0) ? this.x : bkb.w0(null, bkb.Fl, false);
    }

    public dx getAdapter() {
        return this.c;
    }

    public int getBackgroundColor() {
        return (e() && gba.s0) ? this.n ? bkb.w0(null, bkb.Fl, false) : this.y : bkb.w0(null, bkb.Fl, false);
    }

    public float getListTop() {
        int i;
        if (!b()) {
            if (e()) {
                return this.e.getTranslationY();
            }
            return 0.0f;
        }
        hw hwVar = this.b;
        float height = hwVar.getHeight();
        for (int i2 = 0; i2 < hwVar.getChildCount(); i2++) {
            View childAt = hwVar.getChildAt(i2);
            if (hwVar.getLayoutManager() == null) {
                i = 0;
            } else {
                hwVar.getLayoutManager().getClass();
                i = RecyclerView.U(childAt).f;
            }
            height = i == 2147483646 ? Math.min(height, childAt.getBottom()) : Math.min(height, childAt.getTop());
        }
        return height;
    }

    public o39 getListView() {
        return this.b;
    }

    public float getProgress() {
        cv0 webView;
        sw swVar = this.M.L;
        if (b()) {
            float f = this.K;
            if (f >= 0.0f) {
                return f;
            }
            t26 t26Var = this.d;
            int K0 = t26Var.K0();
            if (t26Var.m(K0) != null) {
                int[] iArr = this.c.K;
                hw hwVar = this.b;
                if (iArr != null) {
                    int i = K0 - 1;
                    return Utilities.l((((i < 0 || i >= iArr.length) ? 0 : iArr[i]) + ((K0 != 0 || swVar == null) ? -r4.getTop() : 0)) / Math.max(1, r5.L - hwVar.getHeight()));
                }
                int M0 = t26Var.M0();
                if (swVar != null) {
                    if (K0 < 1) {
                        K0 = 1;
                    }
                    if (M0 < 1) {
                        M0 = 1;
                    }
                }
                int A = t26Var.A() - 2;
                View m = M0 >= A ? t26Var.m(A) : t26Var.m(K0);
                if (m != null) {
                    float width = getWidth() / (r0 - 1);
                    float measuredHeight = m.getMeasuredHeight();
                    return ((K0 * width) + (M0 >= A ? (((A - K0) * width) * (hwVar.getMeasuredHeight() - m.getTop())) / measuredHeight : (1.0f - ((Math.min(0, m.getTop() - hwVar.getPaddingTop()) + measuredHeight) / measuredHeight)) * width)) / getWidth();
                }
            }
        } else if (e() && (webView = this.f.getWebView()) != null) {
            return webView.getScrollProgress();
        }
        return 0.0f;
    }

    public String getSubtitle() {
        cv0 webView;
        wt wtVar;
        if (!e() || (webView = this.f.getWebView()) == null) {
            return "";
        }
        if (TextUtils.equals(this.H, webView.getUrl())) {
            return this.I;
        }
        try {
            String url = webView.getUrl();
            this.H = url;
            Uri parse = Uri.parse(hv0.r(url));
            String uri = (parse.getScheme() == null || !(parse.getScheme().equalsIgnoreCase("http") || parse.getScheme().equalsIgnoreCase("https"))) ? parse.toString() : parse.getSchemeSpecificPart();
            try {
                if (!d()) {
                    try {
                        Uri parse2 = Uri.parse(uri);
                        if (parse2.getHost() != null) {
                            parse = parse2;
                        }
                        String a = d01.a(parse.getHost());
                        String[] split = a.split("\\.");
                        if (split.length > 2 && (wtVar = this.M.i0) != null && je5.h(a, wtVar.F) > gl.q.x - gl.L(162.0f)) {
                            a = split[split.length - 2] + '.' + split[split.length - 1];
                        }
                        uri = d01.w(parse, null, "", a, null);
                    } catch (Exception e) {
                        fa4.g(e, false);
                    }
                    uri = URLDecoder.decode(uri.replaceAll("\\+", "%2b"), "UTF-8");
                }
            } catch (Exception e2) {
                fa4.g(e2, true);
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
        cv0 webView;
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

    public hv0 getWebContainer() {
        return this.f;
    }

    public cv0 getWebView() {
        l lVar = this.f;
        if (lVar != null) {
            return lVar.getWebView();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        cw cwVar;
        super.onAttachedToWindow();
        if (!this.n || (cwVar = this.r) == null) {
            return;
        }
        int i = bkb.Fl;
        cwVar.b(gl.B(bkb.w0(null, i, false)) <= 0.721f, false);
        zkb.h(i, null, this.r);
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
            oVar.V((int) (((gl.L(56.0f) - oVar.g0.h) * (f / getMeasuredWidth())) + oVar.g0.h));
        }
        sw swVar = oVar.L;
        if (swVar != null) {
            swVar.A();
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

    public void setWeb(zv zvVar) {
        zv zvVar2 = this.L;
        if (zvVar2 != zvVar) {
            if (zvVar2 != null) {
                zvVar2.c(this);
            }
            this.L = zvVar;
            if (zvVar != null) {
                cv0 cv0Var = zvVar.b;
                l lVar = this.f;
                if (cv0Var != null) {
                    cv0Var.onResume();
                    lVar.L(y6c.t0, zvVar.b, zvVar.d, zvVar.x, false);
                    g(zvVar.q, true);
                    g(zvVar.r, false);
                } else {
                    String str = zvVar.x;
                    if (str != null) {
                        lVar.q(y6c.t0, str, false);
                    }
                }
            }
            atc atcVar = this.F;
            if (atcVar != null) {
                atcVar.a();
                atc atcVar2 = this.F;
                TLRPC.TL_webPage tL_webPage = atcVar2.j;
                if (tL_webPage != null) {
                    ctc.o(tL_webPage);
                    atcVar2.j = null;
                }
                this.F = null;
            }
        }
    }
}
