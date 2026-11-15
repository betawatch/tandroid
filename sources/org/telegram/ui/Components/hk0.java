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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class hk0 extends org.telegram.messenger.cu implements p71 {
    public static final AtomicInteger t0 = new AtomicInteger();
    public final TL_iv.pageBlockEmbed X;
    public org.telegram.utils.twidget.y0 Y;
    public final boolean Z;
    public int a0;
    public final Path b0;
    public final float[] c0;
    public final int d0;
    public q71 e0;
    public boolean f0;
    public long g0;
    public boolean h0;
    public final wa0 i0;
    public int j0;
    public int k0;
    public String l0;
    public org.telegram.utils.twidget.q1 m0;
    public org.telegram.ui.Cells.s9[] n0;
    public boolean o0;
    public long p0;
    public boolean q0;
    public boolean r0;
    public float s0;

    /* JADX WARN: Removed duplicated region for block: B:44:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hk0(org.telegram.messenger.iv ivVar, Rect rect, int i7, TL_iv.pageBlockEmbed pageblockembed, boolean z10) {
        super(ivVar, rect, i7);
        boolean z11;
        Paint paint;
        int ceil;
        TLRPC.Message message;
        this.b0 = new Path();
        this.c0 = new float[8];
        this.d0 = t0.incrementAndGet();
        this.i0 = new wa0(this, 18);
        this.X = pageblockembed;
        this.Z = z10;
        this.Y = org.telegram.utils.twidget.n0.i(pageblockembed.url);
        this.j0 = k0();
        String k10 = org.telegram.utils.twidget.n0.k(pageblockembed.url, this.Y, u0());
        this.l0 = k10;
        if (k10.equals("placeholder") || this.l0.startsWith("cache of width")) {
            org.telegram.messenger.g0.h3(new org.telegram.messenger.nb(pageblockembed.url, u0(), ivVar.E()));
        }
        String str = pageblockembed.url;
        ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.n0.a;
        org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) concurrentHashMap.get(str);
        hk0 hk0Var = k0Var == null ? null : k0Var.u;
        if (hk0Var != null && hk0Var != this && hk0Var.j0 != this.j0) {
            o0(hk0Var.j0, "new layout, width " + Math.round(hk0Var.u0() / org.telegram.messenger.g0.p) + " -> " + Math.round(u0() / org.telegram.messenger.g0.p), hk0Var.l0, false);
        }
        org.telegram.utils.twidget.k0 k0Var2 = (org.telegram.utils.twidget.k0) concurrentHashMap.get(pageblockembed.url);
        if (k0Var2 != null) {
            k0Var2.u = this;
        }
        org.telegram.messenger.gj gjVar = this.a.b;
        if (this.Y == null || gjVar == null || gjVar.k == null) {
            return;
        }
        if ((gjVar.P2() && !gjVar.P3()) || (!TextUtils.isEmpty(gjVar.k.message) && !gjVar.k.invert_media)) {
            this.Y.k(0.0f, 0.0f, false);
            return;
        }
        if (!gjVar.r1) {
            TLRPC.Message message2 = gjVar.k;
            if (!message2.edit_hide && ((message2.flags & 32768) != 0 || gjVar.Y2())) {
                z11 = true;
                String L3 = org.telegram.ui.Cells.q1.L3(gjVar, gjVar, z11, gjVar.k.edit_date);
                paint = org.telegram.ui.ActionBar.j6.T2;
                if (paint == null) {
                    paint = new Paint(1);
                    paint.setTextSize(org.telegram.messenger.g0.L(12.0f));
                }
                ceil = (int) Math.ceil(paint.measureText(L3));
                message = gjVar.k;
                if ((message.flags & 1024) != 0 && org.telegram.ui.ActionBar.j6.M3 != null) {
                    String S = org.telegram.messenger.hd.S(null, Math.max(1, message.views));
                    Drawable drawable = org.telegram.ui.ActionBar.j6.M3;
                    ceil = (int) ((((paint.getTextSize() - org.telegram.messenger.g0.L(2.0f)) * drawable.getIntrinsicWidth()) / drawable.getIntrinsicHeight()) + ((int) Math.ceil(paint.measureText(S))) + org.telegram.messenger.g0.L(10.0f) + ceil);
                }
                this.Y.k(l0(org.telegram.messenger.g0.L(23.0f)), l0(t0(ceil, gjVar.P3())), false);
            }
        }
        z11 = false;
        String L32 = org.telegram.ui.Cells.q1.L3(gjVar, gjVar, z11, gjVar.k.edit_date);
        paint = org.telegram.ui.ActionBar.j6.T2;
        if (paint == null) {
        }
        ceil = (int) Math.ceil(paint.measureText(L32));
        message = gjVar.k;
        if ((message.flags & 1024) != 0) {
            String S2 = org.telegram.messenger.hd.S(null, Math.max(1, message.views));
            Drawable drawable2 = org.telegram.ui.ActionBar.j6.M3;
            ceil = (int) ((((paint.getTextSize() - org.telegram.messenger.g0.L(2.0f)) * drawable2.getIntrinsicWidth()) / drawable2.getIntrinsicHeight()) + ((int) Math.ceil(paint.measureText(S2))) + org.telegram.messenger.g0.L(10.0f) + ceil);
        }
        this.Y.k(l0(org.telegram.messenger.g0.L(23.0f)), l0(t0(ceil, gjVar.P3())), false);
    }

    public static int j0() {
        int i7 = org.telegram.messenger.gz.Y0;
        return (org.telegram.messenger.g0.L(9.0f) + (i7 >= 15 ? org.telegram.messenger.g0.L(2.0f) : i7 >= 11 ? org.telegram.messenger.g0.L(1.0f) : 0)) - org.telegram.messenger.g0.L(2.0f);
    }

    public static float l0(int i7) {
        return (float) Math.ceil((i7 / org.telegram.messenger.g0.p) - 0.01f);
    }

    public static int t0(int i7, boolean z10) {
        return org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.k5.D(org.telegram.messenger.gz.Y0 < 10 ? 4.0f : 6.0f, 2, org.telegram.messenger.g0.L(6.0f) + i7) + (z10 ? org.telegram.messenger.g0.L(20.0f) : 0);
    }

    @Override // org.telegram.messenger.cu
    public final int I() {
        Rect rect = this.b;
        return rect.top + this.j0 + rect.bottom;
    }

    @Override // org.telegram.messenger.cu
    public final org.telegram.ui.Cells.s9[] L() {
        return this.n0;
    }

    @Override // org.telegram.messenger.cu
    public final boolean Q() {
        q71 q71Var = this.e0;
        if (q71Var == null || !this.f0 || !q71Var.w || (q71Var.L & 3) == 2) {
            return false;
        }
        return q71Var.z || q71Var.n();
    }

    @Override // org.telegram.messenger.cu
    public final void T() {
        org.telegram.utils.twidget.y0 y0Var = this.Y;
        TL_iv.pageBlockEmbed pageblockembed = this.X;
        if (y0Var == null) {
            this.Y = org.telegram.utils.twidget.n0.i(pageblockembed.url);
        }
        if (this.Y == null) {
            return;
        }
        if (this.e0 == null) {
            this.e0 = new q71(this, org.telegram.messenger.g0.p);
        }
        org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.a.get(pageblockembed.url);
        if (k0Var != null) {
            ArrayList arrayList = k0Var.v;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            if (org.telegram.utils.twidget.n0.q(arrayList) != this) {
                q71 q71Var = this.e0;
                org.telegram.utils.twidget.y0 y0Var2 = this.Y;
                q71Var.q();
                q71Var.p = y0Var2;
                q71Var.r = y0Var2 != null;
                return;
            }
            hk0 hk0Var = k0Var.w;
            k0Var.w = this;
            if (hk0Var != null && hk0Var != this && hk0Var.f0 && hk0Var.e0 != null) {
                hk0Var.s0();
                q71 q71Var2 = hk0Var.e0;
                org.telegram.utils.twidget.y0 y0Var3 = hk0Var.Y;
                q71Var2.q();
                q71Var2.p = y0Var3;
                q71Var2.r = y0Var3 != null;
                View view = hk0Var.W;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        r0();
    }

    @Override // org.telegram.messenger.cu
    public final void V() {
        q71 q71Var;
        if (this.e0 == null) {
            return;
        }
        s0();
        this.e0.q();
        org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.a.get(this.X.url);
        if (k0Var == null) {
            return;
        }
        ArrayList arrayList = k0Var.v;
        arrayList.remove(this);
        if (k0Var.w != this) {
            return;
        }
        hk0 q10 = org.telegram.utils.twidget.n0.q(arrayList);
        k0Var.w = q10;
        if (q10 == null || q10.f0 || q10.W == null || (q71Var = q10.e0) == null || q10.Y == null) {
            return;
        }
        q71Var.q();
        q10.r0();
        q10.W.invalidate();
    }

    @Override // org.telegram.messenger.cu
    public final void W(Canvas canvas) {
        float f10;
        float f11;
        View view;
        org.telegram.ui.Cells.q1 q1Var;
        if (this.e0 == null) {
            return;
        }
        int i7 = this.a0;
        org.telegram.messenger.iv ivVar = this.a;
        org.telegram.ui.Cells.q1 q1Var2 = ivVar.E;
        org.telegram.ui.Cells.x1 x1Var = null;
        if (i7 != org.telegram.utils.twidget.m1.d(q1Var2 != null ? q1Var2.getResourcesProvider() : null, ivVar.E())) {
            org.telegram.ui.Cells.q1 q1Var3 = ivVar.E;
            org.telegram.ui.ActionBar.e6 resourcesProvider = q1Var3 != null ? q1Var3.getResourcesProvider() : null;
            this.a0 = org.telegram.utils.twidget.m1.d(resourcesProvider, ivVar.E());
            this.Y.l(org.telegram.utils.twidget.m1.a(resourcesProvider, ivVar.E()));
        }
        this.k0 = R() ? 0 : Math.max(0, Math.min(j0(), ivVar.S - org.telegram.messenger.g0.L(2.0f)));
        int u02 = u0();
        float f12 = this.j0;
        if (this.p0 != 0 && (q1Var = ivVar.E) != null) {
            x1Var = q1Var.getTransitionParams();
        }
        if (x1Var == null || !x1Var.x0) {
            if (x1Var != null && (this.q0 || SystemClock.uptimeMillis() - this.p0 > 250)) {
                this.p0 = 0L;
                this.q0 = false;
            }
            f10 = 0.0f;
            f11 = 0.0f;
        } else {
            this.q0 = true;
            f11 = x1Var.k0 + 0.0f;
            f12 += x1Var.j0;
            f10 = i0() ? x1Var.j0 : x1Var.k0;
        }
        if (i0()) {
            f10 += this.j0 - k0();
        }
        this.s0 = f12;
        canvas.save();
        canvas.translate(-this.k0, 0.0f);
        Path path = this.b0;
        path.rewind();
        int i10 = org.telegram.messenger.gz.Y0;
        if (i10 > 2) {
            i10 -= 2;
        }
        int L = org.telegram.messenger.g0.L(i10);
        int min = Math.min(org.telegram.messenger.g0.L(3.0f), L);
        boolean z10 = this.Z;
        float f13 = (!z10 || ivVar.B() || (!ivVar.E() && ivVar.G())) ? min : L;
        float f14 = (!z10 || (ivVar.E() && ivVar.G())) ? min : L;
        float[] fArr = this.c0;
        fArr[1] = f13;
        fArr[0] = f13;
        fArr[3] = f14;
        fArr[2] = f14;
        float f15 = (this.r0 && ivVar.E()) ? L : min;
        float f16 = (!this.r0 || ivVar.E()) ? min : L;
        fArr[5] = f16;
        fArr[4] = f16;
        fArr[7] = f15;
        fArr[6] = f15;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, f11, u02, f12);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(0.0f, f10);
        if (this.e0.b(canvas, u02) && (view = this.W) != null) {
            view.postInvalidateOnAnimation();
        }
        canvas.restore();
    }

    @Override // org.telegram.messenger.cu
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
            return this.e0.m(motionEvent);
        } finally {
            motionEvent.offsetLocation(-this.k0, 0.0f);
        }
    }

    @Override // org.telegram.ui.Components.p71
    public final void d() {
        org.telegram.ui.Cells.q1 q1Var = this.a.E;
        if (q1Var == null || q1Var.Sa == null) {
            return;
        }
        try {
            q1Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        q1Var.Sa.q0(q1Var, q1Var.h1, q1Var.i1);
    }

    @Override // org.telegram.ui.Components.p71
    public final void f(String str) {
        View view = this.W;
        if (view == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        androidx.emoji2.text.x.h(view, str);
    }

    @Override // org.telegram.ui.Components.p71
    public final void h() {
        org.telegram.utils.twidget.y0 y0Var = this.Y;
        org.telegram.utils.twidget.j1 d = y0Var == null ? null : y0Var.d();
        org.telegram.utils.twidget.q1 q1Var = d == null ? null : d.f;
        if (q1Var != this.m0) {
            this.m0 = q1Var;
            if (q1Var != null) {
                ArrayList arrayList = q1Var.a;
                this.n0 = new org.telegram.ui.Cells.s9[arrayList.size()];
                int i7 = 0;
                while (true) {
                    org.telegram.ui.Cells.s9[] s9VarArr = this.n0;
                    if (i7 >= s9VarArr.length) {
                        break;
                    }
                    s9VarArr[i7] = new oi.y(this, (org.telegram.utils.twidget.o1) arrayList.get(i7));
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
        org.telegram.utils.twidget.y0 y0Var = this.Y;
        if (y0Var != null) {
            ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.n0.a;
            if (y0Var.i > 0) {
                return y0Var.l;
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

    @Override // org.telegram.ui.Components.p71
    public final void j() {
        org.telegram.utils.twidget.j1 j1Var;
        wa0 wa0Var = this.i0;
        org.telegram.messenger.g0.r(wa0Var);
        if (this.h0) {
            if (SystemClock.uptimeMillis() - this.g0 < 1500) {
                org.telegram.messenger.g0.i3(wa0Var, 200L);
                return;
            } else {
                if (k0() != this.j0) {
                    q0("on screen", true);
                    return;
                }
                return;
            }
        }
        org.telegram.utils.twidget.l1 l1Var = this.Y.f;
        if (l1Var == null || (j1Var = l1Var.H) == null || !(j1Var.g || l1Var.z)) {
            org.telegram.messenger.g0.i3(wa0Var, 1500L);
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
        if (org.telegram.messenger.r2.a) {
            long j3 = -1;
            long uptimeMillis = this.f0 ? SystemClock.uptimeMillis() - this.g0 : -1L;
            q71 q71Var = this.e0;
            if (q71Var != null && q71Var.s != 0) {
                j3 = SystemClock.uptimeMillis() - q71Var.s;
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
            sb2.append(uptimeMillis >= 0 ? r.b.j(uptimeMillis, ", running ", " ms") : ", not running");
            if (this.Y != null) {
                StringBuilder sb3 = new StringBuilder(", session ");
                sb3.append(this.Y.q);
                sb3.append(this.Y.g != null ? " (snapshot)" : "");
                org.telegram.utils.twidget.l1 l1Var = this.Y.f;
                sb3.append((l1Var == null || !l1Var.C) ? ", scripts held" : "");
                str3 = sb3.toString();
            } else {
                str3 = ", no widget yet";
            }
            sb2.append(str3);
            if (j3 >= 0 && j3 < 5000) {
                str4 = r.b.j(j3, ", touched ", " ms ago");
            }
            org.telegram.ui.Cells.y0.t(str4, sb2);
        }
    }

    public final void p0(String str) {
        if (this.W != null) {
            org.telegram.utils.twidget.y0 y0Var = this.Y;
            if ((y0Var == null || y0Var.i <= 0) && k0() != this.j0) {
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
        org.telegram.messenger.iv ivVar = this.a;
        ivVar.Q();
        org.telegram.messenger.gj gjVar = ivVar.b;
        if (gjVar != null) {
            gjVar.M1 = true;
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
        org.telegram.messenger.iv ivVar = this.a;
        if (z12) {
            ivVar.Q();
        }
        if (z12 && z10) {
            this.p0 = SystemClock.uptimeMillis();
            this.q0 = false;
        }
        org.telegram.messenger.gj gjVar = ivVar.b;
        if (gjVar != null) {
            gjVar.M1 = true;
        }
        org.telegram.ui.Cells.q1 q1Var = ivVar.E;
        org.telegram.ui.Cells.l1 l1Var = ivVar.F;
        View view = this.W;
        if (view == null || q1Var == null || l1Var == null) {
            if (view != null) {
                view.requestLayout();
                return;
            }
            return;
        }
        if (z12 && !i0() && (q1Var.getParent() instanceof RecyclerView)) {
            View view2 = (View) q1Var.getParent();
            if (q1Var.getBottom() > view2.getPaddingTop() && q1Var.getTop() < view2.getHeight() - view2.getPaddingBottom()) {
                z11 = true;
            }
        }
        if (z10) {
            l1Var.B1(q1Var, z11, z11);
        } else {
            l1Var.H0(q1Var, z11, z11);
        }
    }

    public final void r0() {
        org.telegram.messenger.gj gjVar;
        org.telegram.utils.twidget.j1 j1Var;
        this.f0 = true;
        this.g0 = SystemClock.uptimeMillis();
        org.telegram.utils.twidget.l1 l1Var = this.Y.f;
        this.h0 = (l1Var == null || (j1Var = l1Var.H) == null || (!j1Var.g && !l1Var.z)) ? false : true;
        this.Y.n(u0());
        org.telegram.messenger.iv ivVar = this.a;
        org.telegram.ui.Cells.q1 q1Var = ivVar.E;
        org.telegram.ui.ActionBar.e6 resourcesProvider = q1Var != null ? q1Var.getResourcesProvider() : null;
        this.a0 = org.telegram.utils.twidget.m1.d(resourcesProvider, ivVar.E());
        this.Y.l(org.telegram.utils.twidget.m1.a(resourcesProvider, ivVar.E()));
        q71 q71Var = this.e0;
        org.telegram.utils.twidget.y0 y0Var = this.Y;
        if (q71Var.p != y0Var) {
            q71Var.q();
            q71Var.p = y0Var;
            if (y0Var != null) {
                y0Var.h = q71Var;
                y0Var.m(q71Var.q);
            }
        }
        this.e0.p(true);
        org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.a.get(this.X.url);
        if (k0Var != null) {
            k0Var.u = this;
        }
        org.telegram.utils.twidget.n0.t(this.Y);
        boolean z10 = this.o0 && (gjVar = this.a.b) != null && gjVar.M1;
        this.o0 = false;
        if (z10 || k0() != this.j0) {
            org.telegram.messenger.g0.h3(new ai.q(28, this, z10));
        }
    }

    public final void s0() {
        if (this.f0) {
            this.f0 = false;
            org.telegram.messenger.g0.r(this.i0);
            this.e0.p(false);
            this.e0.q();
            org.telegram.utils.twidget.y0 y0Var = this.Y;
            if (y0Var != null) {
                org.telegram.utils.twidget.n0.s(y0Var);
            }
        }
    }

    public final int u0() {
        return (j0() * 2) + this.c;
    }
}
