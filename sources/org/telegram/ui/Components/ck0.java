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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ck0 extends org.telegram.messenger.fu implements o71 {
    public static final AtomicInteger s0 = new AtomicInteger();
    public final TL_iv.pageBlockEmbed W;
    public org.telegram.utils.twidget.v0 X;
    public final boolean Y;
    public int Z;
    public final Path a0;
    public final float[] b0;
    public final int c0;
    public p71 d0;
    public boolean e0;
    public long f0;
    public boolean g0;
    public final ob0 h0;
    public int i0;
    public int j0;
    public String k0;
    public org.telegram.utils.twidget.n1 l0;
    public org.telegram.ui.Cells.t9[] m0;
    public boolean n0;
    public long o0;
    public boolean p0;
    public boolean q0;
    public float r0;

    /* JADX WARN: Removed duplicated region for block: B:44:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ck0(org.telegram.messenger.kv kvVar, Rect rect, int i7, TL_iv.pageBlockEmbed pageblockembed, boolean z9) {
        super(kvVar, rect, i7);
        boolean z10;
        Paint paint;
        int ceil;
        TLRPC.Message message;
        this.a0 = new Path();
        this.b0 = new float[8];
        this.c0 = s0.incrementAndGet();
        this.h0 = new ob0(this, 15);
        this.W = pageblockembed;
        this.Y = z9;
        this.X = org.telegram.utils.twidget.n0.i(pageblockembed.url);
        this.i0 = k0();
        String k10 = org.telegram.utils.twidget.n0.k(pageblockembed.url, this.X, u0());
        this.k0 = k10;
        if (k10.equals("placeholder") || this.k0.startsWith("cache of width")) {
            org.telegram.messenger.g0.h3(new org.telegram.messenger.ob(pageblockembed.url, u0(), kvVar.E()));
        }
        String str = pageblockembed.url;
        ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.n0.a;
        org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) concurrentHashMap.get(str);
        ck0 ck0Var = k0Var == null ? null : k0Var.u;
        if (ck0Var != null && ck0Var != this && ck0Var.i0 != this.i0) {
            o0(ck0Var.i0, "new layout, width " + Math.round(ck0Var.u0() / org.telegram.messenger.g0.p) + " -> " + Math.round(u0() / org.telegram.messenger.g0.p), ck0Var.k0, false);
        }
        org.telegram.utils.twidget.k0 k0Var2 = (org.telegram.utils.twidget.k0) concurrentHashMap.get(pageblockembed.url);
        if (k0Var2 != null) {
            k0Var2.u = this;
        }
        org.telegram.messenger.ij ijVar = this.a.b;
        if (this.X == null || ijVar == null || ijVar.k == null) {
            return;
        }
        if ((ijVar.P2() && !ijVar.P3()) || (!TextUtils.isEmpty(ijVar.k.message) && !ijVar.k.invert_media)) {
            this.X.k(0.0f, 0.0f, false);
            return;
        }
        if (!ijVar.p1) {
            TLRPC.Message message2 = ijVar.k;
            if (!message2.edit_hide && ((message2.flags & 32768) != 0 || ijVar.Y2())) {
                z10 = true;
                String K3 = org.telegram.ui.Cells.q1.K3(ijVar, ijVar, z10, ijVar.k.edit_date);
                paint = org.telegram.ui.ActionBar.m6.T2;
                if (paint == null) {
                    paint = new Paint(1);
                    paint.setTextSize(org.telegram.messenger.g0.L(12.0f));
                }
                ceil = (int) Math.ceil(paint.measureText(K3));
                message = ijVar.k;
                if ((message.flags & 1024) != 0 && org.telegram.ui.ActionBar.m6.M3 != null) {
                    String S = org.telegram.messenger.id.S(null, Math.max(1, message.views));
                    Drawable drawable = org.telegram.ui.ActionBar.m6.M3;
                    ceil = (int) ((((paint.getTextSize() - org.telegram.messenger.g0.L(2.0f)) * drawable.getIntrinsicWidth()) / drawable.getIntrinsicHeight()) + ((int) Math.ceil(paint.measureText(S))) + org.telegram.messenger.g0.L(10.0f) + ceil);
                }
                this.X.k(l0(org.telegram.messenger.g0.L(23.0f)), l0(t0(ceil, ijVar.P3())), false);
            }
        }
        z10 = false;
        String K32 = org.telegram.ui.Cells.q1.K3(ijVar, ijVar, z10, ijVar.k.edit_date);
        paint = org.telegram.ui.ActionBar.m6.T2;
        if (paint == null) {
        }
        ceil = (int) Math.ceil(paint.measureText(K32));
        message = ijVar.k;
        if ((message.flags & 1024) != 0) {
            String S2 = org.telegram.messenger.id.S(null, Math.max(1, message.views));
            Drawable drawable2 = org.telegram.ui.ActionBar.m6.M3;
            ceil = (int) ((((paint.getTextSize() - org.telegram.messenger.g0.L(2.0f)) * drawable2.getIntrinsicWidth()) / drawable2.getIntrinsicHeight()) + ((int) Math.ceil(paint.measureText(S2))) + org.telegram.messenger.g0.L(10.0f) + ceil);
        }
        this.X.k(l0(org.telegram.messenger.g0.L(23.0f)), l0(t0(ceil, ijVar.P3())), false);
    }

    public static int j0() {
        int i7 = org.telegram.messenger.iz.Y0;
        return (org.telegram.messenger.g0.L(9.0f) + (i7 >= 15 ? org.telegram.messenger.g0.L(2.0f) : i7 >= 11 ? org.telegram.messenger.g0.L(1.0f) : 0)) - org.telegram.messenger.g0.L(2.0f);
    }

    public static float l0(int i7) {
        return (float) Math.ceil((i7 / org.telegram.messenger.g0.p) - 0.01f);
    }

    public static int t0(int i7, boolean z9) {
        return org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.k5.D(org.telegram.messenger.iz.Y0 < 10 ? 4.0f : 6.0f, 2, org.telegram.messenger.g0.L(6.0f) + i7) + (z9 ? org.telegram.messenger.g0.L(20.0f) : 0);
    }

    @Override // org.telegram.messenger.fu
    public final int I() {
        Rect rect = this.b;
        return rect.top + this.i0 + rect.bottom;
    }

    @Override // org.telegram.messenger.fu
    public final org.telegram.ui.Cells.t9[] L() {
        return this.m0;
    }

    @Override // org.telegram.messenger.fu
    public final boolean Q() {
        p71 p71Var = this.d0;
        if (p71Var == null || !this.e0 || !p71Var.w || (p71Var.L & 3) == 2) {
            return false;
        }
        return p71Var.z || p71Var.n();
    }

    @Override // org.telegram.messenger.fu
    public final void T() {
        org.telegram.utils.twidget.v0 v0Var = this.X;
        TL_iv.pageBlockEmbed pageblockembed = this.W;
        if (v0Var == null) {
            this.X = org.telegram.utils.twidget.n0.i(pageblockembed.url);
        }
        if (this.X == null) {
            return;
        }
        if (this.d0 == null) {
            this.d0 = new p71(this, org.telegram.messenger.g0.p);
        }
        org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.a.get(pageblockembed.url);
        if (k0Var != null) {
            ArrayList arrayList = k0Var.v;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            if (org.telegram.utils.twidget.n0.q(arrayList) != this) {
                p71 p71Var = this.d0;
                org.telegram.utils.twidget.v0 v0Var2 = this.X;
                p71Var.q();
                p71Var.p = v0Var2;
                p71Var.r = v0Var2 != null;
                return;
            }
            ck0 ck0Var = k0Var.w;
            k0Var.w = this;
            if (ck0Var != null && ck0Var != this && ck0Var.e0 && ck0Var.d0 != null) {
                ck0Var.s0();
                p71 p71Var2 = ck0Var.d0;
                org.telegram.utils.twidget.v0 v0Var3 = ck0Var.X;
                p71Var2.q();
                p71Var2.p = v0Var3;
                p71Var2.r = v0Var3 != null;
                View view = ck0Var.V;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        r0();
    }

    @Override // org.telegram.messenger.fu
    public final void V() {
        p71 p71Var;
        if (this.d0 == null) {
            return;
        }
        s0();
        this.d0.q();
        org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.a.get(this.W.url);
        if (k0Var == null) {
            return;
        }
        ArrayList arrayList = k0Var.v;
        arrayList.remove(this);
        if (k0Var.w != this) {
            return;
        }
        ck0 q10 = org.telegram.utils.twidget.n0.q(arrayList);
        k0Var.w = q10;
        if (q10 == null || q10.e0 || q10.V == null || (p71Var = q10.d0) == null || q10.X == null) {
            return;
        }
        p71Var.q();
        q10.r0();
        q10.V.invalidate();
    }

    @Override // org.telegram.messenger.fu
    public final void W(Canvas canvas) {
        float f10;
        float f11;
        View view;
        org.telegram.ui.Cells.q1 q1Var;
        if (this.d0 == null) {
            return;
        }
        int i7 = this.Z;
        org.telegram.messenger.kv kvVar = this.a;
        org.telegram.ui.Cells.q1 q1Var2 = kvVar.E;
        org.telegram.ui.Cells.x1 x1Var = null;
        if (i7 != org.telegram.utils.twidget.j1.d(q1Var2 != null ? q1Var2.getResourcesProvider() : null, kvVar.E())) {
            org.telegram.ui.Cells.q1 q1Var3 = kvVar.E;
            org.telegram.ui.ActionBar.h6 resourcesProvider = q1Var3 != null ? q1Var3.getResourcesProvider() : null;
            this.Z = org.telegram.utils.twidget.j1.d(resourcesProvider, kvVar.E());
            this.X.l(org.telegram.utils.twidget.j1.a(resourcesProvider, kvVar.E()));
        }
        this.j0 = R() ? 0 : Math.max(0, Math.min(j0(), kvVar.S - org.telegram.messenger.g0.L(2.0f)));
        int u02 = u0();
        float f12 = this.i0;
        if (this.o0 != 0 && (q1Var = kvVar.E) != null) {
            x1Var = q1Var.getTransitionParams();
        }
        if (x1Var == null || !x1Var.x0) {
            if (x1Var != null && (this.p0 || SystemClock.uptimeMillis() - this.o0 > 250)) {
                this.o0 = 0L;
                this.p0 = false;
            }
            f10 = 0.0f;
            f11 = 0.0f;
        } else {
            this.p0 = true;
            f11 = x1Var.k0 + 0.0f;
            f12 += x1Var.j0;
            f10 = i0() ? x1Var.j0 : x1Var.k0;
        }
        if (i0()) {
            f10 += this.i0 - k0();
        }
        this.r0 = f12;
        canvas.save();
        canvas.translate(-this.j0, 0.0f);
        Path path = this.a0;
        path.rewind();
        int i10 = org.telegram.messenger.iz.Y0;
        if (i10 > 2) {
            i10 -= 2;
        }
        int L = org.telegram.messenger.g0.L(i10);
        int min = Math.min(org.telegram.messenger.g0.L(3.0f), L);
        boolean z9 = this.Y;
        float f13 = (!z9 || kvVar.B() || (!kvVar.E() && kvVar.G())) ? min : L;
        float f14 = (!z9 || (kvVar.E() && kvVar.G())) ? min : L;
        float[] fArr = this.b0;
        fArr[1] = f13;
        fArr[0] = f13;
        fArr[3] = f14;
        fArr[2] = f14;
        float f15 = (this.q0 && kvVar.E()) ? L : min;
        float f16 = (!this.q0 || kvVar.E()) ? min : L;
        fArr[5] = f16;
        fArr[4] = f16;
        fArr[7] = f15;
        fArr[6] = f15;
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, f11, u02, f12);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(0.0f, f10);
        if (this.d0.b(canvas, u02) && (view = this.V) != null) {
            view.postInvalidateOnAnimation();
        }
        canvas.restore();
    }

    @Override // org.telegram.messenger.fu
    public final boolean Y(MotionEvent motionEvent) {
        if (this.d0 == null || !this.e0) {
            return false;
        }
        String str = this.W.url;
        org.telegram.utils.twidget.k0 k0Var = org.telegram.utils.twidget.n0.n(str) ? (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.a.get(str) : null;
        if (k0Var != null && k0Var.k) {
            return false;
        }
        motionEvent.offsetLocation(this.j0, 0.0f);
        try {
            return this.d0.m(motionEvent);
        } finally {
            motionEvent.offsetLocation(-this.j0, 0.0f);
        }
    }

    @Override // org.telegram.ui.Components.o71
    public final void d() {
        org.telegram.ui.Cells.q1 q1Var = this.a.E;
        if (q1Var == null || q1Var.Ra == null) {
            return;
        }
        try {
            q1Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        q1Var.Ra.p0(q1Var, q1Var.g1, q1Var.h1);
    }

    @Override // org.telegram.ui.Components.o71
    public final void f(String str) {
        View view = this.V;
        if (view == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        androidx.emoji2.text.w.h(view, str);
    }

    @Override // org.telegram.ui.Components.o71
    public final void h() {
        org.telegram.utils.twidget.v0 v0Var = this.X;
        org.telegram.utils.twidget.g1 d = v0Var == null ? null : v0Var.d();
        org.telegram.utils.twidget.n1 n1Var = d == null ? null : d.f;
        if (n1Var != this.l0) {
            this.l0 = n1Var;
            if (n1Var != null) {
                ArrayList arrayList = n1Var.a;
                this.m0 = new org.telegram.ui.Cells.t9[arrayList.size()];
                int i7 = 0;
                while (true) {
                    org.telegram.ui.Cells.t9[] t9VarArr = this.m0;
                    if (i7 >= t9VarArr.length) {
                        break;
                    }
                    t9VarArr[i7] = new li.a0(this, (org.telegram.utils.twidget.l1) arrayList.get(i7));
                    i7++;
                }
            } else {
                this.m0 = null;
            }
            this.a.Q();
        }
        View view = this.V;
        if (view != null) {
            view.invalidate();
        }
    }

    public final boolean i0() {
        boolean z9;
        String str = this.W.url;
        org.telegram.utils.twidget.v0 v0Var = this.X;
        if (v0Var != null) {
            ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.n0.a;
            if (v0Var.i > 0) {
                return v0Var.l;
            }
        }
        org.telegram.utils.twidget.k0 k0Var = org.telegram.utils.twidget.n0.n(str) ? (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.a.get(str) : null;
        org.telegram.utils.twidget.l0 l0Var = k0Var != null ? (org.telegram.utils.twidget.l0) org.telegram.utils.twidget.n0.b.get(k0Var.a()) : null;
        if (l0Var != null) {
            synchronized (l0Var) {
                if (!l0Var.a.isEmpty() && ((int[]) l0Var.a.get(0)).length > 2) {
                    if (((int[]) l0Var.a.get(0))[2] != 0) {
                        z9 = true;
                    }
                }
                z9 = false;
            }
            if (z9) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.o71
    public final void j() {
        org.telegram.utils.twidget.g1 g1Var;
        ob0 ob0Var = this.h0;
        org.telegram.messenger.g0.r(ob0Var);
        if (this.g0) {
            if (SystemClock.uptimeMillis() - this.f0 < 1500) {
                org.telegram.messenger.g0.i3(ob0Var, 200L);
                return;
            } else {
                if (k0() != this.i0) {
                    q0("on screen", true);
                    return;
                }
                return;
            }
        }
        org.telegram.utils.twidget.i1 i1Var = this.X.f;
        if (i1Var == null || (g1Var = i1Var.H) == null || !(g1Var.g || i1Var.z)) {
            org.telegram.messenger.g0.i3(ob0Var, 1500L);
            return;
        }
        this.g0 = true;
        this.f0 = SystemClock.uptimeMillis();
        if (k0() != this.i0) {
            q0("on screen, loaded", true);
        }
    }

    public final int k0() {
        return org.telegram.utils.twidget.n0.d(this.W.url, this.X, u0());
    }

    public final float m0() {
        return this.b.top + this.r0;
    }

    public final float n0() {
        return u0() + (this.b.left - this.j0);
    }

    public final void o0(int i7, String str, String str2, boolean z9) {
        String str3;
        if (org.telegram.messenger.r2.a) {
            long j3 = -1;
            long uptimeMillis = this.e0 ? SystemClock.uptimeMillis() - this.f0 : -1L;
            p71 p71Var = this.d0;
            if (p71Var != null && p71Var.s != 0) {
                j3 = SystemClock.uptimeMillis() - p71Var.s;
            }
            StringBuilder sb2 = new StringBuilder("widget height ");
            sb2.append(this.W.url.substring(10));
            sb2.append(": ");
            sb2.append(str);
            sb2.append(", ");
            sb2.append(Math.round(i7 / org.telegram.messenger.g0.p));
            sb2.append(" (");
            sb2.append(str2);
            sb2.append(") -> ");
            sb2.append(Math.round(this.i0 / org.telegram.messenger.g0.p));
            sb2.append(" (");
            sb2.append(this.k0);
            sb2.append("), width ");
            sb2.append(Math.round(u0() / org.telegram.messenger.g0.p));
            String str4 = "";
            sb2.append(z9 ? ", animated" : "");
            sb2.append(this.V != null ? ", on screen" : ", off screen");
            sb2.append(uptimeMillis >= 0 ? rf.b.h(uptimeMillis, ", running ", " ms") : ", not running");
            if (this.X != null) {
                StringBuilder sb3 = new StringBuilder(", session ");
                sb3.append(this.X.q);
                sb3.append(this.X.g != null ? " (snapshot)" : "");
                org.telegram.utils.twidget.i1 i1Var = this.X.f;
                sb3.append((i1Var == null || !i1Var.C) ? ", scripts held" : "");
                str3 = sb3.toString();
            } else {
                str3 = ", no widget yet";
            }
            sb2.append(str3);
            if (j3 >= 0 && j3 < 5000) {
                str4 = rf.b.h(j3, ", touched ", " ms ago");
            }
            org.telegram.ui.Cells.f1.u(str4, sb2);
        }
    }

    public final void p0(String str) {
        if (this.V != null) {
            org.telegram.utils.twidget.v0 v0Var = this.X;
            if ((v0Var == null || v0Var.i <= 0) && k0() != this.i0) {
                q0("on screen: ".concat(str), false);
                return;
            }
            return;
        }
        int k02 = k0();
        int i7 = this.i0;
        if (k02 == i7) {
            return;
        }
        String str2 = this.k0;
        this.i0 = k02;
        this.k0 = org.telegram.utils.twidget.n0.k(this.W.url, this.X, u0());
        o0(i7, "away: ".concat(str), str2, false);
        org.telegram.messenger.kv kvVar = this.a;
        kvVar.Q();
        org.telegram.messenger.ij ijVar = kvVar.b;
        if (ijVar != null) {
            ijVar.K1 = true;
        }
        this.n0 = true;
    }

    public final void q0(String str, boolean z9) {
        int k02 = k0();
        int i7 = this.i0;
        boolean z10 = false;
        boolean z11 = k02 != i7;
        String str2 = this.k0;
        this.i0 = k02;
        this.k0 = org.telegram.utils.twidget.n0.k(this.W.url, this.X, u0());
        if (z11) {
            o0(i7, str, str2, z9);
        }
        org.telegram.messenger.kv kvVar = this.a;
        if (z11) {
            kvVar.Q();
        }
        if (z11 && z9) {
            this.o0 = SystemClock.uptimeMillis();
            this.p0 = false;
        }
        org.telegram.messenger.ij ijVar = kvVar.b;
        if (ijVar != null) {
            ijVar.K1 = true;
        }
        org.telegram.ui.Cells.q1 q1Var = kvVar.E;
        org.telegram.ui.Cells.l1 l1Var = kvVar.F;
        View view = this.V;
        if (view == null || q1Var == null || l1Var == null) {
            if (view != null) {
                view.requestLayout();
                return;
            }
            return;
        }
        if (z11 && !i0() && (q1Var.getParent() instanceof RecyclerView)) {
            View view2 = (View) q1Var.getParent();
            if (q1Var.getBottom() > view2.getPaddingTop() && q1Var.getTop() < view2.getHeight() - view2.getPaddingBottom()) {
                z10 = true;
            }
        }
        if (z9) {
            l1Var.q1(q1Var, z10, z10);
        } else {
            l1Var.E0(q1Var, z10, z10);
        }
    }

    public final void r0() {
        org.telegram.messenger.ij ijVar;
        org.telegram.utils.twidget.g1 g1Var;
        this.e0 = true;
        this.f0 = SystemClock.uptimeMillis();
        org.telegram.utils.twidget.i1 i1Var = this.X.f;
        this.g0 = (i1Var == null || (g1Var = i1Var.H) == null || (!g1Var.g && !i1Var.z)) ? false : true;
        this.X.n(u0());
        org.telegram.messenger.kv kvVar = this.a;
        org.telegram.ui.Cells.q1 q1Var = kvVar.E;
        org.telegram.ui.ActionBar.h6 resourcesProvider = q1Var != null ? q1Var.getResourcesProvider() : null;
        this.Z = org.telegram.utils.twidget.j1.d(resourcesProvider, kvVar.E());
        this.X.l(org.telegram.utils.twidget.j1.a(resourcesProvider, kvVar.E()));
        p71 p71Var = this.d0;
        org.telegram.utils.twidget.v0 v0Var = this.X;
        if (p71Var.p != v0Var) {
            p71Var.q();
            p71Var.p = v0Var;
            if (v0Var != null) {
                v0Var.h = p71Var;
                v0Var.m(p71Var.q);
            }
        }
        this.d0.p(true);
        org.telegram.utils.twidget.k0 k0Var = (org.telegram.utils.twidget.k0) org.telegram.utils.twidget.n0.a.get(this.W.url);
        if (k0Var != null) {
            k0Var.u = this;
        }
        org.telegram.utils.twidget.n0.t(this.X);
        boolean z9 = this.n0 && (ijVar = this.a.b) != null && ijVar.K1;
        this.n0 = false;
        if (z9 || k0() != this.i0) {
            org.telegram.messenger.g0.h3(new bi.k1(27, this, z9));
        }
    }

    public final void s0() {
        if (this.e0) {
            this.e0 = false;
            org.telegram.messenger.g0.r(this.h0);
            this.d0.p(false);
            this.d0.q();
            org.telegram.utils.twidget.v0 v0Var = this.X;
            if (v0Var != null) {
                org.telegram.utils.twidget.n0.s(v0Var);
            }
        }
    }

    public final int u0() {
        return (j0() * 2) + this.c;
    }
}
