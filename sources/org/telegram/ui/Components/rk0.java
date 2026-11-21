package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class rk0 extends org.telegram.messenger.zt implements c81 {
    public static final AtomicInteger t0 = new AtomicInteger();
    public final TL_iv.pageBlockEmbed X;
    public org.telegram.utils.twidget.d1 Y;
    public final boolean Z;
    public int a0;
    public final Path b0;
    public final float[] c0;
    public final int d0;
    public d81 e0;
    public boolean f0;
    public long g0;
    public boolean h0;
    public final hb0 i0;
    public int j0;
    public int k0;
    public String l0;
    public org.telegram.utils.twidget.v1 m0;
    public org.telegram.ui.Cells.u9[] n0;
    public boolean o0;
    public long p0;
    public boolean q0;
    public boolean r0;
    public float s0;

    /* JADX WARN: Removed duplicated region for block: B:44:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rk0(org.telegram.messenger.ev evVar, Rect rect, int i7, TL_iv.pageBlockEmbed pageblockembed, boolean z10) {
        super(evVar, rect, i7);
        boolean z11;
        Paint paint;
        int ceil;
        TLRPC.Message message;
        this.b0 = new Path();
        this.c0 = new float[8];
        this.d0 = t0.incrementAndGet();
        this.i0 = new hb0(this, 18);
        this.X = pageblockembed;
        this.Z = z10;
        this.Y = org.telegram.utils.twidget.n0.i(pageblockembed.url);
        this.j0 = k0();
        String k10 = org.telegram.utils.twidget.n0.k(pageblockembed.url, this.Y, u0());
        this.l0 = k10;
        if (k10.equals("placeholder") || this.l0.startsWith("cache of width")) {
            org.telegram.messenger.g0.g3(new org.telegram.messenger.mb(pageblockembed.url, u0(), evVar.E()));
        }
        String str = pageblockembed.url;
        ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.n0.a;
        org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) concurrentHashMap.get(str);
        rk0 rk0Var = k0Var == null ? null : k0Var.u;
        if (rk0Var != null && rk0Var != this && rk0Var.j0 != this.j0) {
            o0(rk0Var.j0, "new layout, width " + Math.round(rk0Var.u0() / org.telegram.messenger.g0.p) + " -> " + Math.round(u0() / org.telegram.messenger.g0.p), rk0Var.l0, false);
        }
        org.telegram.utils.twidget.k0 k0Var2 = (org.telegram.utils.twidget.k0) concurrentHashMap.get(pageblockembed.url);
        if (k0Var2 != null) {
            k0Var2.u = this;
        }
        org.telegram.messenger.fj fjVar = this.a.b;
        if (this.Y == null || fjVar == null || fjVar.k == null) {
            return;
        }
        if ((fjVar.P2() && !fjVar.P3()) || (!TextUtils.isEmpty(fjVar.k.message) && !fjVar.k.invert_media)) {
            this.Y.i(0.0f, 0.0f, false);
            return;
        }
        if (!fjVar.r1) {
            TLRPC.Message message2 = fjVar.k;
            if (!message2.edit_hide && ((message2.flags & 32768) != 0 || fjVar.Y2())) {
                z11 = true;
                String M3 = org.telegram.ui.Cells.r1.M3(fjVar, fjVar, z11, fjVar.k.edit_date);
                paint = org.telegram.ui.ActionBar.m6.T2;
                if (paint == null) {
                    paint = new Paint(1);
                    paint.setTextSize(org.telegram.messenger.g0.L(12.0f));
                }
                ceil = (int) Math.ceil(paint.measureText(M3));
                message = fjVar.k;
                if ((message.flags & 1024) != 0 && org.telegram.ui.ActionBar.m6.M3 != null) {
                    String S = org.telegram.messenger.gd.S(null, Math.max(1, message.views));
                    Drawable drawable = org.telegram.ui.ActionBar.m6.M3;
                    ceil = (int) ((((paint.getTextSize() - org.telegram.messenger.g0.L(2.0f)) * drawable.getIntrinsicWidth()) / drawable.getIntrinsicHeight()) + ((int) Math.ceil(paint.measureText(S))) + org.telegram.messenger.g0.L(10.0f) + ceil);
                }
                this.Y.i(l0(org.telegram.messenger.g0.L(23.0f)), l0(t0(ceil, fjVar.P3())), false);
            }
        }
        z11 = false;
        String M32 = org.telegram.ui.Cells.r1.M3(fjVar, fjVar, z11, fjVar.k.edit_date);
        paint = org.telegram.ui.ActionBar.m6.T2;
        if (paint == null) {
        }
        ceil = (int) Math.ceil(paint.measureText(M32));
        message = fjVar.k;
        if ((message.flags & 1024) != 0) {
            String S2 = org.telegram.messenger.gd.S(null, Math.max(1, message.views));
            Drawable drawable2 = org.telegram.ui.ActionBar.m6.M3;
            ceil = (int) ((((paint.getTextSize() - org.telegram.messenger.g0.L(2.0f)) * drawable2.getIntrinsicWidth()) / drawable2.getIntrinsicHeight()) + ((int) Math.ceil(paint.measureText(S2))) + org.telegram.messenger.g0.L(10.0f) + ceil);
        }
        this.Y.i(l0(org.telegram.messenger.g0.L(23.0f)), l0(t0(ceil, fjVar.P3())), false);
    }

    public static int j0() {
        int i7 = org.telegram.messenger.bz.Y0;
        return (org.telegram.messenger.g0.L(9.0f) + (i7 >= 15 ? org.telegram.messenger.g0.L(2.0f) : i7 >= 11 ? org.telegram.messenger.g0.L(1.0f) : 0)) - org.telegram.messenger.g0.L(2.0f);
    }

    public static float l0(int i7) {
        return (float) Math.ceil((i7 / org.telegram.messenger.g0.p) - 0.01f);
    }

    public static int t0(int i7, boolean z10) {
        return org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.f3.D(org.telegram.messenger.bz.Y0 < 10 ? 4.0f : 6.0f, 2, org.telegram.messenger.g0.L(6.0f) + i7) + (z10 ? org.telegram.messenger.g0.L(20.0f) : 0);
    }

    @Override // org.telegram.messenger.zt
    public final int I() {
        Rect rect = this.b;
        return rect.top + this.j0 + rect.bottom;
    }

    @Override // org.telegram.messenger.zt
    public final org.telegram.ui.Cells.u9[] L() {
        return this.n0;
    }

    @Override // org.telegram.messenger.zt
    public final boolean Q() {
        d81 d81Var = this.e0;
        if (d81Var == null || !this.f0 || !d81Var.w || (d81Var.L & 3) == 2) {
            return false;
        }
        return d81Var.z || d81Var.o();
    }

    @Override // org.telegram.messenger.zt
    public final void T() {
        org.telegram.utils.twidget.d1 d1Var = this.Y;
        TL_iv.pageBlockEmbed pageblockembed = this.X;
        if (d1Var == null) {
            this.Y = org.telegram.utils.twidget.n0.i(pageblockembed.url);
        }
        if (this.Y == null) {
            return;
        }
        if (this.e0 == null) {
            this.e0 = new d81(this, org.telegram.messenger.g0.p);
        }
        org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.a.get(pageblockembed.url);
        if (k0Var != null) {
            ArrayList arrayList = k0Var.v;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            if (org.telegram.utils.twidget.n0.q(arrayList) != this) {
                d81 d81Var = this.e0;
                org.telegram.utils.twidget.d1 d1Var2 = this.Y;
                d81Var.r();
                d81Var.p = d1Var2;
                d81Var.r = d1Var2 != null;
                return;
            }
            rk0 rk0Var = k0Var.w;
            k0Var.w = this;
            if (rk0Var != null && rk0Var != this && rk0Var.f0 && rk0Var.e0 != null) {
                rk0Var.s0();
                d81 d81Var2 = rk0Var.e0;
                org.telegram.utils.twidget.d1 d1Var3 = rk0Var.Y;
                d81Var2.r();
                d81Var2.p = d1Var3;
                d81Var2.r = d1Var3 != null;
                View view = rk0Var.W;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        r0();
    }

    @Override // org.telegram.messenger.zt
    public final void V() {
        d81 d81Var;
        if (this.e0 == null) {
            return;
        }
        s0();
        this.e0.r();
        org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.a.get(this.X.url);
        if (k0Var == null) {
            return;
        }
        ArrayList arrayList = k0Var.v;
        arrayList.remove(this);
        if (k0Var.w != this) {
            return;
        }
        rk0 q10 = org.telegram.utils.twidget.n0.q(arrayList);
        k0Var.w = q10;
        if (q10 == null || q10.f0 || q10.W == null || (d81Var = q10.e0) == null || q10.Y == null) {
            return;
        }
        d81Var.r();
        q10.r0();
        q10.W.invalidate();
    }

    @Override // org.telegram.messenger.zt
    public final void W(Canvas canvas) {
        float f10;
        float f11;
        View view;
        org.telegram.ui.Cells.r1 r1Var;
        if (this.e0 == null) {
            return;
        }
        int i7 = this.a0;
        org.telegram.messenger.ev evVar = this.a;
        org.telegram.ui.Cells.r1 r1Var2 = evVar.E;
        org.telegram.ui.Cells.y1 y1Var = null;
        if (i7 != org.telegram.utils.twidget.q1.e(r1Var2 != null ? r1Var2.getResourcesProvider() : null, evVar.E())) {
            org.telegram.ui.Cells.r1 r1Var3 = evVar.E;
            org.telegram.ui.ActionBar.h6 resourcesProvider = r1Var3 != null ? r1Var3.getResourcesProvider() : null;
            this.a0 = org.telegram.utils.twidget.q1.e(resourcesProvider, evVar.E());
            this.Y.j(org.telegram.utils.twidget.q1.a(resourcesProvider, evVar.E()));
        }
        this.k0 = R() ? 0 : Math.max(0, Math.min(j0(), evVar.S - org.telegram.messenger.g0.L(2.0f)));
        int u02 = u0();
        float f12 = this.j0;
        if (this.p0 != 0 && (r1Var = evVar.E) != null) {
            y1Var = r1Var.getTransitionParams();
        }
        if (y1Var == null || !y1Var.x0) {
            if (y1Var != null && (this.q0 || SystemClock.uptimeMillis() - this.p0 > 250)) {
                this.p0 = 0L;
                this.q0 = false;
            }
            f10 = 0.0f;
            f11 = 0.0f;
        } else {
            this.q0 = true;
            f11 = y1Var.k0 + 0.0f;
            f12 += y1Var.j0;
            f10 = i0() ? y1Var.j0 : y1Var.k0;
        }
        if (i0()) {
            f10 += this.j0 - k0();
        }
        this.s0 = f12;
        canvas.save();
        canvas.translate(-this.k0, 0.0f);
        Path path = this.b0;
        path.rewind();
        int i10 = org.telegram.messenger.bz.Y0;
        if (i10 > 2) {
            i10 -= 2;
        }
        int L = org.telegram.messenger.g0.L(i10);
        int min = Math.min(org.telegram.messenger.g0.L(3.0f), L);
        boolean z10 = this.Z;
        float f13 = (!z10 || evVar.B() || (!evVar.E() && evVar.G())) ? min : L;
        float f14 = (!z10 || (evVar.E() && evVar.G())) ? min : L;
        float[] fArr = this.c0;
        fArr[1] = f13;
        fArr[0] = f13;
        fArr[3] = f14;
        fArr[2] = f14;
        float f15 = (this.r0 && evVar.E()) ? L : min;
        float f16 = (!this.r0 || evVar.E()) ? min : L;
        fArr[5] = f16;
        fArr[4] = f16;
        fArr[7] = f15;
        fArr[6] = f15;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, f11, u02, f12);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(0.0f, f10);
        if (this.e0.c(canvas, u02) && (view = this.W) != null) {
            view.postInvalidateOnAnimation();
        }
        canvas.restore();
    }

    @Override // org.telegram.messenger.zt
    public final boolean Y(MotionEvent motionEvent) {
        if (this.e0 == null || !this.f0) {
            return false;
        }
        String str = this.X.url;
        org.telegram.utils.twidget.k0 k0Var = org.telegram.utils.twidget.n0.n(str) ? (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.a.get(str) : null;
        if (k0Var != null && k0Var.k) {
            return false;
        }
        motionEvent.offsetLocation(this.k0, 0.0f);
        try {
            return this.e0.n(motionEvent);
        } finally {
            motionEvent.offsetLocation(-this.k0, 0.0f);
        }
    }

    @Override // org.telegram.ui.Components.c81
    public final void d() {
        org.telegram.ui.Cells.r1 r1Var = this.a.E;
        if (r1Var == null || r1Var.Sa == null) {
            return;
        }
        try {
            r1Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        r1Var.Sa.q0(r1Var, r1Var.h1, r1Var.i1);
    }

    @Override // org.telegram.ui.Components.c81
    public final void f(String str) {
        View view = this.W;
        if (view == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        androidx.emoji2.text.x.h(view, str);
    }

    @Override // org.telegram.ui.Components.c81
    public final void h() {
        org.telegram.utils.twidget.d1 d1Var = this.Y;
        org.telegram.utils.twidget.n1 d = d1Var == null ? null : d1Var.d();
        org.telegram.utils.twidget.v1 v1Var = d == null ? null : d.g;
        if (v1Var != this.m0) {
            this.m0 = v1Var;
            if (v1Var != null) {
                ArrayList arrayList = v1Var.a;
                this.n0 = new org.telegram.ui.Cells.u9[arrayList.size()];
                int i7 = 0;
                while (true) {
                    org.telegram.ui.Cells.u9[] u9VarArr = this.n0;
                    if (i7 >= u9VarArr.length) {
                        break;
                    }
                    u9VarArr[i7] = new oi.z(this, (org.telegram.utils.twidget.t1) arrayList.get(i7));
                    i7++;
                }
            } else {
                this.n0 = null;
            }
            this.a.Q();
        }
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    public final boolean i0() {
        boolean z10;
        String str = this.X.url;
        org.telegram.utils.twidget.d1 d1Var = this.Y;
        if (d1Var != null) {
            ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.n0.a;
            if (d1Var.i > 0) {
                return d1Var.l;
            }
        }
        org.telegram.utils.twidget.k0 k0Var = org.telegram.utils.twidget.n0.n(str) ? (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.a.get(str) : null;
        org.telegram.utils.twidget.l0 l0Var = k0Var != null ? (org.telegram.utils.twidget.l0) org.telegram.utils.twidget.n0.b.get(k0Var.a()) : null;
        if (l0Var != null) {
            synchronized (l0Var) {
                if (!l0Var.a.isEmpty() && ((int[]) l0Var.a.get(0)).length > 2) {
                    if (((int[]) l0Var.a.get(0))[2] != 0) {
                        z10 = true;
                    }
                }
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.c81
    public final void j() {
        org.telegram.utils.twidget.n1 n1Var;
        hb0 hb0Var = this.i0;
        org.telegram.messenger.g0.r(hb0Var);
        if (this.h0) {
            if (SystemClock.uptimeMillis() - this.g0 < 1500) {
                org.telegram.messenger.g0.h3(hb0Var, 200L);
                return;
            } else {
                if (k0() != this.j0) {
                    q0("on screen", true);
                    return;
                }
                return;
            }
        }
        org.telegram.utils.twidget.p1 p1Var = this.Y.f;
        if (p1Var == null || (n1Var = p1Var.N) == null || !(n1Var.h || p1Var.F)) {
            org.telegram.messenger.g0.h3(hb0Var, 1500L);
            return;
        }
        this.h0 = true;
        this.g0 = SystemClock.uptimeMillis();
        if (k0() != this.j0) {
            q0("on screen, loaded", true);
        }
    }

    public final int k0() {
        return org.telegram.utils.twidget.n0.d(this.X.url, this.Y, u0());
    }

    public final float m0() {
        return this.b.top + this.s0;
    }

    public final float n0() {
        return u0() + (this.b.left - this.k0);
    }

    public final void o0(int i7, String str, String str2, boolean z10) {
        String str3;
        if (org.telegram.messenger.s2.a) {
            long j3 = -1;
            long uptimeMillis = this.f0 ? SystemClock.uptimeMillis() - this.g0 : -1L;
            d81 d81Var = this.e0;
            if (d81Var != null && d81Var.s != 0) {
                j3 = SystemClock.uptimeMillis() - d81Var.s;
            }
            StringBuilder sb2 = new StringBuilder("widget height ");
            sb2.append(this.X.url.substring(10));
            sb2.append(": ");
            sb2.append(str);
            sb2.append(", ");
            sb2.append(Math.round(i7 / org.telegram.messenger.g0.p));
            sb2.append(" (");
            sb2.append(str2);
            sb2.append(") -> ");
            sb2.append(Math.round(this.j0 / org.telegram.messenger.g0.p));
            sb2.append(" (");
            sb2.append(this.l0);
            sb2.append("), width ");
            sb2.append(Math.round(u0() / org.telegram.messenger.g0.p));
            String str4 = "";
            sb2.append(z10 ? ", animated" : "");
            sb2.append(this.W != null ? ", on screen" : ", off screen");
            sb2.append(uptimeMillis >= 0 ? p5.c.j(uptimeMillis, ", running ", " ms") : ", not running");
            if (this.Y != null) {
                StringBuilder sb3 = new StringBuilder(", session ");
                sb3.append(this.Y.q);
                sb3.append(this.Y.g != null ? " (snapshot)" : "");
                org.telegram.utils.twidget.p1 p1Var = this.Y.f;
                sb3.append((p1Var == null || !p1Var.I) ? ", scripts held" : "");
                str3 = sb3.toString();
            } else {
                str3 = ", no widget yet";
            }
            sb2.append(str3);
            if (j3 >= 0 && j3 < 5000) {
                str4 = p5.c.j(j3, ", touched ", " ms ago");
            }
            p5.c.s(str4, sb2);
        }
    }

    public final void p0(String str) {
        if (this.W != null) {
            org.telegram.utils.twidget.d1 d1Var = this.Y;
            if ((d1Var == null || d1Var.i <= 0) && k0() != this.j0) {
                q0("on screen: ".concat(str), false);
                return;
            }
            return;
        }
        int k02 = k0();
        int i7 = this.j0;
        if (k02 == i7) {
            return;
        }
        String str2 = this.l0;
        this.j0 = k02;
        this.l0 = org.telegram.utils.twidget.n0.k(this.X.url, this.Y, u0());
        o0(i7, "away: ".concat(str), str2, false);
        org.telegram.messenger.ev evVar = this.a;
        evVar.Q();
        org.telegram.messenger.fj fjVar = evVar.b;
        if (fjVar != null) {
            fjVar.M1 = true;
        }
        this.o0 = true;
    }

    public final void q0(String str, boolean z10) {
        int k02 = k0();
        int i7 = this.j0;
        boolean z11 = false;
        boolean z12 = k02 != i7;
        String str2 = this.l0;
        this.j0 = k02;
        this.l0 = org.telegram.utils.twidget.n0.k(this.X.url, this.Y, u0());
        if (z12) {
            o0(i7, str, str2, z10);
        }
        org.telegram.messenger.ev evVar = this.a;
        if (z12) {
            evVar.Q();
        }
        if (z12 && z10) {
            this.p0 = SystemClock.uptimeMillis();
            this.q0 = false;
        }
        org.telegram.messenger.fj fjVar = evVar.b;
        if (fjVar != null) {
            fjVar.M1 = true;
        }
        org.telegram.ui.Cells.r1 r1Var = evVar.E;
        org.telegram.ui.Cells.m1 m1Var = evVar.F;
        View view = this.W;
        if (view == null || r1Var == null || m1Var == null) {
            if (view != null) {
                view.requestLayout();
                return;
            }
            return;
        }
        if (z12 && !i0() && (r1Var.getParent() instanceof RecyclerView)) {
            View view2 = (View) r1Var.getParent();
            if (r1Var.getBottom() > view2.getPaddingTop() && r1Var.getTop() < view2.getHeight() - view2.getPaddingBottom()) {
                z11 = true;
            }
        }
        if (z10) {
            m1Var.B1(r1Var, z11, z11);
        } else {
            m1Var.H0(r1Var, z11, z11);
        }
    }

    public final void r0() {
        org.telegram.messenger.fj fjVar;
        org.telegram.utils.twidget.n1 n1Var;
        this.f0 = true;
        this.g0 = SystemClock.uptimeMillis();
        org.telegram.utils.twidget.p1 p1Var = this.Y.f;
        this.h0 = (p1Var == null || (n1Var = p1Var.N) == null || (!n1Var.h && !p1Var.F)) ? false : true;
        this.Y.l(u0());
        org.telegram.messenger.ev evVar = this.a;
        org.telegram.ui.Cells.r1 r1Var = evVar.E;
        org.telegram.ui.ActionBar.h6 resourcesProvider = r1Var != null ? r1Var.getResourcesProvider() : null;
        this.a0 = org.telegram.utils.twidget.q1.e(resourcesProvider, evVar.E());
        this.Y.j(org.telegram.utils.twidget.q1.a(resourcesProvider, evVar.E()));
        this.e0.b(this.Y);
        this.e0.q(true);
        org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.a.get(this.X.url);
        if (k0Var != null) {
            k0Var.u = this;
        }
        org.telegram.utils.twidget.n0.t(this.Y);
        boolean z10 = this.o0 && (fjVar = this.a.b) != null && fjVar.M1;
        this.o0 = false;
        if (z10 || k0() != this.j0) {
            org.telegram.messenger.g0.g3(new ch.k(28, this, z10));
        }
    }

    public final void s0() {
        if (this.f0) {
            this.f0 = false;
            org.telegram.messenger.g0.r(this.i0);
            this.e0.q(false);
            this.e0.r();
            org.telegram.utils.twidget.d1 d1Var = this.Y;
            if (d1Var != null) {
                org.telegram.utils.twidget.n0.s(d1Var);
            }
        }
    }

    public final int u0() {
        return (j0() * 2) + this.c;
    }
}
