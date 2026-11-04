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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class gk0 extends org.telegram.messenger.xt implements g71 {
    public static final AtomicInteger t0 = new AtomicInteger();
    public final TL_iv.pageBlockEmbed X;
    public org.telegram.utils.twidget.u Y;
    public final boolean Z;
    public int a0;
    public final Path b0;
    public final float[] c0;
    public final int d0;
    public h71 e0;
    public boolean f0;
    public long g0;
    public boolean h0;
    public final jb0 i0;
    public int j0;
    public int k0;
    public String l0;
    public org.telegram.utils.twidget.m0 m0;
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
    public gk0(org.telegram.messenger.cv cvVar, Rect rect, int i3, TL_iv.pageBlockEmbed pageblockembed, boolean z10) {
        super(cvVar, rect, i3);
        boolean z11;
        Paint paint;
        int ceil;
        TLRPC.Message message;
        this.b0 = new Path();
        this.c0 = new float[8];
        this.d0 = t0.incrementAndGet();
        this.i0 = new jb0(this, 17);
        this.X = pageblockembed;
        this.Z = z10;
        this.Y = org.telegram.utils.twidget.p.i(pageblockembed.url);
        this.j0 = k0();
        String k10 = org.telegram.utils.twidget.p.k(pageblockembed.url, this.Y, u0());
        this.l0 = k10;
        if (k10.equals("placeholder") || this.l0.startsWith("cache of width")) {
            org.telegram.messenger.g0.h3(new org.telegram.messenger.hb(pageblockembed.url, u0(), cvVar.E()));
        }
        String str = pageblockembed.url;
        ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.p.a;
        org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) concurrentHashMap.get(str);
        gk0 gk0Var = mVar == null ? null : mVar.u;
        if (gk0Var != null && gk0Var != this && gk0Var.j0 != this.j0) {
            o0(gk0Var.j0, "new layout, width " + Math.round(gk0Var.u0() / org.telegram.messenger.g0.p) + " -> " + Math.round(u0() / org.telegram.messenger.g0.p), gk0Var.l0, false);
        }
        org.telegram.utils.twidget.m mVar2 = (org.telegram.utils.twidget.m) concurrentHashMap.get(pageblockembed.url);
        if (mVar2 != null) {
            mVar2.u = this;
        }
        org.telegram.messenger.zi ziVar = this.a.b;
        if (this.Y == null || ziVar == null || ziVar.k == null) {
            return;
        }
        if ((ziVar.Q2() && !ziVar.Q3()) || (!TextUtils.isEmpty(ziVar.k.message) && !ziVar.k.invert_media)) {
            this.Y.k(0.0f, 0.0f, false);
            return;
        }
        if (!ziVar.p1) {
            TLRPC.Message message2 = ziVar.k;
            if (!message2.edit_hide && ((message2.flags & 32768) != 0 || ziVar.Z2())) {
                z11 = true;
                String I3 = org.telegram.ui.Cells.q1.I3(ziVar, ziVar, z11, ziVar.k.edit_date);
                paint = org.telegram.ui.ActionBar.k6.T2;
                if (paint == null) {
                    paint = new Paint(1);
                    paint.setTextSize(org.telegram.messenger.g0.L(12.0f));
                }
                ceil = (int) Math.ceil(paint.measureText(I3));
                message = ziVar.k;
                if ((message.flags & 1024) != 0 && org.telegram.ui.ActionBar.k6.M3 != null) {
                    String S = org.telegram.messenger.bd.S(null, Math.max(1, message.views));
                    Drawable drawable = org.telegram.ui.ActionBar.k6.M3;
                    ceil = (int) ((((paint.getTextSize() - org.telegram.messenger.g0.L(2.0f)) * drawable.getIntrinsicWidth()) / drawable.getIntrinsicHeight()) + ((int) Math.ceil(paint.measureText(S))) + org.telegram.messenger.g0.L(10.0f) + ceil);
                }
                this.Y.k(l0(org.telegram.messenger.g0.L(23.0f)), l0(t0(ceil, ziVar.Q3())), false);
            }
        }
        z11 = false;
        String I32 = org.telegram.ui.Cells.q1.I3(ziVar, ziVar, z11, ziVar.k.edit_date);
        paint = org.telegram.ui.ActionBar.k6.T2;
        if (paint == null) {
        }
        ceil = (int) Math.ceil(paint.measureText(I32));
        message = ziVar.k;
        if ((message.flags & 1024) != 0) {
            String S2 = org.telegram.messenger.bd.S(null, Math.max(1, message.views));
            Drawable drawable2 = org.telegram.ui.ActionBar.k6.M3;
            ceil = (int) ((((paint.getTextSize() - org.telegram.messenger.g0.L(2.0f)) * drawable2.getIntrinsicWidth()) / drawable2.getIntrinsicHeight()) + ((int) Math.ceil(paint.measureText(S2))) + org.telegram.messenger.g0.L(10.0f) + ceil);
        }
        this.Y.k(l0(org.telegram.messenger.g0.L(23.0f)), l0(t0(ceil, ziVar.Q3())), false);
    }

    public static int j0() {
        int i3 = org.telegram.messenger.az.Y0;
        return (org.telegram.messenger.g0.L(9.0f) + (i3 >= 15 ? org.telegram.messenger.g0.L(2.0f) : i3 >= 11 ? org.telegram.messenger.g0.L(1.0f) : 0)) - org.telegram.messenger.g0.L(2.0f);
    }

    public static float l0(int i3) {
        return (float) Math.ceil((i3 / org.telegram.messenger.g0.p) - 0.01f);
    }

    public static int t0(int i3, boolean z10) {
        return org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.k5.D(org.telegram.messenger.az.Y0 < 10 ? 4.0f : 6.0f, 2, org.telegram.messenger.g0.L(6.0f) + i3) + (z10 ? org.telegram.messenger.g0.L(20.0f) : 0);
    }

    @Override // org.telegram.messenger.xt
    public final int I() {
        Rect rect = this.b;
        return rect.top + this.j0 + rect.bottom;
    }

    @Override // org.telegram.messenger.xt
    public final org.telegram.ui.Cells.s9[] L() {
        return this.n0;
    }

    @Override // org.telegram.messenger.xt
    public final boolean Q() {
        h71 h71Var = this.e0;
        if (h71Var == null || !this.f0 || !h71Var.w || (h71Var.L & 3) == 2) {
            return false;
        }
        return h71Var.z || h71Var.n();
    }

    @Override // org.telegram.messenger.xt
    public final void T() {
        org.telegram.utils.twidget.u uVar = this.Y;
        TL_iv.pageBlockEmbed pageblockembed = this.X;
        if (uVar == null) {
            this.Y = org.telegram.utils.twidget.p.i(pageblockembed.url);
        }
        if (this.Y == null) {
            return;
        }
        if (this.e0 == null) {
            this.e0 = new h71(this, org.telegram.messenger.g0.p);
        }
        org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.a.get(pageblockembed.url);
        if (mVar != null) {
            ArrayList arrayList = mVar.v;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            if (org.telegram.utils.twidget.p.p(arrayList) != this) {
                h71 h71Var = this.e0;
                org.telegram.utils.twidget.u uVar2 = this.Y;
                h71Var.q();
                h71Var.p = uVar2;
                h71Var.r = uVar2 != null;
                return;
            }
            gk0 gk0Var = mVar.w;
            mVar.w = this;
            if (gk0Var != null && gk0Var != this && gk0Var.f0 && gk0Var.e0 != null) {
                gk0Var.s0();
                h71 h71Var2 = gk0Var.e0;
                org.telegram.utils.twidget.u uVar3 = gk0Var.Y;
                h71Var2.q();
                h71Var2.p = uVar3;
                h71Var2.r = uVar3 != null;
                View view = gk0Var.W;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        r0();
    }

    @Override // org.telegram.messenger.xt
    public final void V() {
        h71 h71Var;
        if (this.e0 == null) {
            return;
        }
        s0();
        this.e0.q();
        org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.a.get(this.X.url);
        if (mVar == null) {
            return;
        }
        ArrayList arrayList = mVar.v;
        arrayList.remove(this);
        if (mVar.w != this) {
            return;
        }
        gk0 p10 = org.telegram.utils.twidget.p.p(arrayList);
        mVar.w = p10;
        if (p10 == null || p10.f0 || p10.W == null || (h71Var = p10.e0) == null || p10.Y == null) {
            return;
        }
        h71Var.q();
        p10.r0();
        p10.W.invalidate();
    }

    @Override // org.telegram.messenger.xt
    public final void W(Canvas canvas) {
        float f10;
        float f11;
        View view;
        org.telegram.ui.Cells.q1 q1Var;
        if (this.e0 == null) {
            return;
        }
        int i3 = this.a0;
        org.telegram.messenger.cv cvVar = this.a;
        org.telegram.ui.Cells.q1 q1Var2 = cvVar.E;
        org.telegram.ui.Cells.x1 x1Var = null;
        if (i3 != org.telegram.utils.twidget.i0.d(q1Var2 != null ? q1Var2.getResourcesProvider() : null, cvVar.E())) {
            org.telegram.ui.Cells.q1 q1Var3 = cvVar.E;
            org.telegram.ui.ActionBar.e6 resourcesProvider = q1Var3 != null ? q1Var3.getResourcesProvider() : null;
            this.a0 = org.telegram.utils.twidget.i0.d(resourcesProvider, cvVar.E());
            this.Y.l(org.telegram.utils.twidget.i0.a(resourcesProvider, cvVar.E()));
        }
        this.k0 = R() ? 0 : Math.max(0, Math.min(j0(), cvVar.S - org.telegram.messenger.g0.L(2.0f)));
        int u02 = u0();
        float f12 = this.j0;
        if (this.p0 != 0 && (q1Var = cvVar.E) != null) {
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
        int i10 = org.telegram.messenger.az.Y0;
        if (i10 > 2) {
            i10 -= 2;
        }
        int L = org.telegram.messenger.g0.L(i10);
        int min = Math.min(org.telegram.messenger.g0.L(3.0f), L);
        boolean z10 = this.Z;
        float f13 = (!z10 || cvVar.B() || (!cvVar.E() && cvVar.G())) ? min : L;
        float f14 = (!z10 || (cvVar.E() && cvVar.G())) ? min : L;
        float[] fArr = this.c0;
        fArr[1] = f13;
        fArr[0] = f13;
        fArr[3] = f14;
        fArr[2] = f14;
        float f15 = (this.r0 && cvVar.E()) ? L : min;
        float f16 = (!this.r0 || cvVar.E()) ? min : L;
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

    @Override // org.telegram.messenger.xt
    public final boolean Y(MotionEvent motionEvent) {
        if (this.e0 == null || !this.f0) {
            return false;
        }
        String str = this.X.url;
        org.telegram.utils.twidget.m mVar = org.telegram.utils.twidget.p.n(str) ? (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.a.get(str) : null;
        if (mVar != null && mVar.k) {
            return false;
        }
        motionEvent.offsetLocation(this.k0, 0.0f);
        try {
            return this.e0.m(motionEvent);
        } finally {
            motionEvent.offsetLocation(-this.k0, 0.0f);
        }
    }

    @Override // org.telegram.ui.Components.g71
    public final void d() {
        org.telegram.ui.Cells.q1 q1Var = this.a.E;
        if (q1Var == null || q1Var.Ra == null) {
            return;
        }
        try {
            q1Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        q1Var.Ra.p0(q1Var, q1Var.h1, q1Var.i1);
    }

    @Override // org.telegram.ui.Components.g71
    public final void f(String str) {
        View view = this.W;
        if (view == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        androidx.emoji2.text.x.h(view, str);
    }

    @Override // org.telegram.ui.Components.g71
    public final void h() {
        org.telegram.utils.twidget.u uVar = this.Y;
        org.telegram.utils.twidget.f0 c2 = uVar == null ? null : uVar.c();
        org.telegram.utils.twidget.m0 m0Var = c2 == null ? null : c2.f;
        if (m0Var != this.m0) {
            this.m0 = m0Var;
            if (m0Var != null) {
                ArrayList arrayList = m0Var.a;
                this.n0 = new org.telegram.ui.Cells.s9[arrayList.size()];
                int i3 = 0;
                while (true) {
                    org.telegram.ui.Cells.s9[] s9VarArr = this.n0;
                    if (i3 >= s9VarArr.length) {
                        break;
                    }
                    s9VarArr[i3] = new mi.z(this, (org.telegram.utils.twidget.k0) arrayList.get(i3));
                    i3++;
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
        org.telegram.utils.twidget.u uVar = this.Y;
        if (uVar != null) {
            ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.p.a;
            if (uVar.i > 0) {
                return uVar.l;
            }
        }
        org.telegram.utils.twidget.m mVar = org.telegram.utils.twidget.p.n(str) ? (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.a.get(str) : null;
        org.telegram.utils.twidget.n nVar = mVar != null ? (org.telegram.utils.twidget.n) org.telegram.utils.twidget.p.b.get(mVar.a()) : null;
        if (nVar != null) {
            synchronized (nVar) {
                if (!nVar.a.isEmpty() && ((int[]) nVar.a.get(0)).length > 2) {
                    if (((int[]) nVar.a.get(0))[2] != 0) {
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

    @Override // org.telegram.ui.Components.g71
    public final void j() {
        org.telegram.utils.twidget.f0 f0Var;
        jb0 jb0Var = this.i0;
        org.telegram.messenger.g0.r(jb0Var);
        if (this.h0) {
            if (SystemClock.uptimeMillis() - this.g0 < 1500) {
                org.telegram.messenger.g0.i3(jb0Var, 200L);
                return;
            } else {
                if (k0() != this.j0) {
                    q0("on screen", true);
                    return;
                }
                return;
            }
        }
        org.telegram.utils.twidget.h0 h0Var = this.Y.f;
        if (h0Var == null || (f0Var = h0Var.F) == null || !(f0Var.g || h0Var.x)) {
            org.telegram.messenger.g0.i3(jb0Var, 1500L);
            return;
        }
        this.h0 = true;
        this.g0 = SystemClock.uptimeMillis();
        if (k0() != this.j0) {
            q0("on screen, loaded", true);
        }
    }

    public final int k0() {
        return org.telegram.utils.twidget.p.d(this.X.url, this.Y, u0());
    }

    public final float m0() {
        return this.b.top + this.s0;
    }

    public final float n0() {
        return u0() + (this.b.left - this.k0);
    }

    public final void o0(int i3, String str, String str2, boolean z10) {
        String str3;
        if (org.telegram.messenger.r2.a) {
            long j10 = -1;
            long uptimeMillis = this.f0 ? SystemClock.uptimeMillis() - this.g0 : -1L;
            h71 h71Var = this.e0;
            if (h71Var != null && h71Var.s != 0) {
                j10 = SystemClock.uptimeMillis() - h71Var.s;
            }
            StringBuilder sb2 = new StringBuilder("widget height ");
            sb2.append(this.X.url.substring(10));
            sb2.append(": ");
            sb2.append(str);
            sb2.append(", ");
            sb2.append(Math.round(i3 / org.telegram.messenger.g0.p));
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
            sb2.append(uptimeMillis >= 0 ? t4.c.e(uptimeMillis, ", running ", " ms") : ", not running");
            if (this.Y != null) {
                StringBuilder sb3 = new StringBuilder(", session ");
                sb3.append(this.Y.q);
                sb3.append(this.Y.g != null ? " (snapshot)" : "");
                org.telegram.utils.twidget.h0 h0Var = this.Y.f;
                sb3.append((h0Var == null || !h0Var.A) ? ", scripts held" : "");
                str3 = sb3.toString();
            } else {
                str3 = ", no widget yet";
            }
            sb2.append(str3);
            if (j10 >= 0 && j10 < 5000) {
                str4 = t4.c.e(j10, ", touched ", " ms ago");
            }
            k2.p1.w(str4, sb2);
        }
    }

    public final void p0(String str) {
        if (this.W != null) {
            org.telegram.utils.twidget.u uVar = this.Y;
            if ((uVar == null || uVar.i <= 0) && k0() != this.j0) {
                q0("on screen: ".concat(str), false);
                return;
            }
            return;
        }
        int k02 = k0();
        int i3 = this.j0;
        if (k02 == i3) {
            return;
        }
        String str2 = this.l0;
        this.j0 = k02;
        this.l0 = org.telegram.utils.twidget.p.k(this.X.url, this.Y, u0());
        o0(i3, "away: ".concat(str), str2, false);
        org.telegram.messenger.cv cvVar = this.a;
        cvVar.Q();
        org.telegram.messenger.zi ziVar = cvVar.b;
        if (ziVar != null) {
            ziVar.K1 = true;
        }
        this.o0 = true;
    }

    public final void q0(String str, boolean z10) {
        int k02 = k0();
        int i3 = this.j0;
        boolean z11 = false;
        boolean z12 = k02 != i3;
        String str2 = this.l0;
        this.j0 = k02;
        this.l0 = org.telegram.utils.twidget.p.k(this.X.url, this.Y, u0());
        if (z12) {
            o0(i3, str, str2, z10);
        }
        org.telegram.messenger.cv cvVar = this.a;
        if (z12) {
            cvVar.Q();
        }
        if (z12 && z10) {
            this.p0 = SystemClock.uptimeMillis();
            this.q0 = false;
        }
        org.telegram.messenger.zi ziVar = cvVar.b;
        if (ziVar != null) {
            ziVar.K1 = true;
        }
        org.telegram.ui.Cells.q1 q1Var = cvVar.E;
        org.telegram.ui.Cells.l1 l1Var = cvVar.F;
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
            l1Var.r1(q1Var, z11, z11);
        } else {
            l1Var.E0(q1Var, z11, z11);
        }
    }

    public final void r0() {
        org.telegram.messenger.zi ziVar;
        org.telegram.utils.twidget.f0 f0Var;
        this.f0 = true;
        this.g0 = SystemClock.uptimeMillis();
        org.telegram.utils.twidget.h0 h0Var = this.Y.f;
        this.h0 = (h0Var == null || (f0Var = h0Var.F) == null || (!f0Var.g && !h0Var.x)) ? false : true;
        this.Y.n(u0());
        org.telegram.messenger.cv cvVar = this.a;
        org.telegram.ui.Cells.q1 q1Var = cvVar.E;
        org.telegram.ui.ActionBar.e6 resourcesProvider = q1Var != null ? q1Var.getResourcesProvider() : null;
        this.a0 = org.telegram.utils.twidget.i0.d(resourcesProvider, cvVar.E());
        this.Y.l(org.telegram.utils.twidget.i0.a(resourcesProvider, cvVar.E()));
        h71 h71Var = this.e0;
        org.telegram.utils.twidget.u uVar = this.Y;
        if (h71Var.p != uVar) {
            h71Var.q();
            h71Var.p = uVar;
            if (uVar != null) {
                uVar.h = h71Var;
                uVar.m(h71Var.q);
            }
        }
        this.e0.p(true);
        org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.a.get(this.X.url);
        if (mVar != null) {
            mVar.u = this;
        }
        org.telegram.utils.twidget.p.s(this.Y);
        boolean z10 = this.o0 && (ziVar = this.a.b) != null && ziVar.K1;
        this.o0 = false;
        if (z10 || k0() != this.j0) {
            org.telegram.messenger.g0.h3(new ci.e1(27, this, z10));
        }
    }

    public final void s0() {
        if (this.f0) {
            this.f0 = false;
            org.telegram.messenger.g0.r(this.i0);
            this.e0.p(false);
            this.e0.q();
            org.telegram.utils.twidget.u uVar = this.Y;
            if (uVar != null) {
                org.telegram.utils.twidget.p.r(uVar);
            }
        }
    }

    public final int u0() {
        return (j0() * 2) + this.c;
    }
}
