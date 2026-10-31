package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class gl0 extends org.telegram.messenger.qu implements p81 {
    public static final AtomicInteger u0 = new AtomicInteger();
    public static Paint v0;
    public static Drawable w0;
    public final TL_iv.pageBlockEmbed W;
    public org.telegram.utils.twidget.w X;
    public final boolean Y;
    public int Z;
    public final Path a0;
    public final float[] b0;
    public final int c0;
    public q81 d0;
    public boolean e0;
    public long f0;
    public boolean g0;
    public final eb0 h0;
    public int i0;
    public int j0;
    public String k0;
    public org.telegram.utils.twidget.q0 l0;
    public org.telegram.ui.Cells.u9[] m0;
    public boolean n0;
    public long o0;
    public boolean p0;
    public final RectF q0;
    public boolean r0;
    public boolean s0;
    public float t0;

    /* JADX WARN: Removed duplicated region for block: B:44:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gl0(org.telegram.messenger.vv vvVar, Rect rect, int i10, TL_iv.pageBlockEmbed pageblockembed, boolean z10) {
        super(vvVar, rect, i10);
        boolean z11;
        Paint paint;
        int ceil;
        TLRPC.Message message;
        this.a0 = new Path();
        this.b0 = new float[8];
        this.c0 = u0.incrementAndGet();
        this.h0 = new eb0(this, 20);
        this.q0 = new RectF();
        this.W = pageblockembed;
        this.Y = z10;
        this.X = org.telegram.utils.twidget.p.i(pageblockembed.url);
        this.i0 = j0();
        String k10 = org.telegram.utils.twidget.p.k(pageblockembed.url, this.X, u0());
        this.k0 = k10;
        if (k10.equals("placeholder") || this.k0.startsWith("cache of width")) {
            org.telegram.messenger.i0.g3(new org.telegram.messenger.ob(pageblockembed.url, u0(), vvVar.E()));
        }
        String str = pageblockembed.url;
        ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.p.a;
        org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) concurrentHashMap.get(str);
        gl0 gl0Var = mVar == null ? null : mVar.v;
        if (gl0Var != null && gl0Var != this && gl0Var.i0 != this.i0) {
            n0(gl0Var.i0, "new layout, width " + Math.round(gl0Var.u0() / org.telegram.messenger.i0.p) + " -> " + Math.round(u0() / org.telegram.messenger.i0.p), gl0Var.k0, false);
        }
        org.telegram.utils.twidget.m mVar2 = (org.telegram.utils.twidget.m) concurrentHashMap.get(pageblockembed.url);
        if (mVar2 != null) {
            mVar2.v = this;
        }
        org.telegram.messenger.jj jjVar = this.a.b;
        if (this.X == null || jjVar == null || jjVar.k == null) {
            return;
        }
        if ((jjVar.P2() && !jjVar.P3()) || (!TextUtils.isEmpty(jjVar.k.message) && !jjVar.k.invert_media)) {
            this.X.k(0.0f, 0.0f, false);
            return;
        }
        if (!jjVar.p1) {
            TLRPC.Message message2 = jjVar.k;
            if (!message2.edit_hide && ((message2.flags & 32768) != 0 || jjVar.Y2())) {
                z11 = true;
                String G3 = org.telegram.ui.Cells.q1.G3(jjVar, jjVar, z11, jjVar.k.edit_date);
                paint = org.telegram.ui.ActionBar.t6.T2;
                if (paint == null) {
                    paint = new Paint(1);
                    paint.setTextSize(org.telegram.messenger.i0.L(12.0f));
                }
                ceil = (int) Math.ceil(paint.measureText(G3));
                message = jjVar.k;
                if ((message.flags & 1024) != 0 && org.telegram.ui.ActionBar.t6.M3 != null) {
                    String S = org.telegram.messenger.cd.S(null, Math.max(1, message.views));
                    Drawable drawable = org.telegram.ui.ActionBar.t6.M3;
                    ceil = (int) ((((paint.getTextSize() - org.telegram.messenger.i0.L(2.0f)) * drawable.getIntrinsicWidth()) / drawable.getIntrinsicHeight()) + ((int) Math.ceil(paint.measureText(S))) + org.telegram.messenger.i0.L(10.0f) + ceil);
                }
                this.X.k(k0(org.telegram.messenger.i0.L(23.0f)), k0(t0(ceil, jjVar.P3())), false);
            }
        }
        z11 = false;
        String G32 = org.telegram.ui.Cells.q1.G3(jjVar, jjVar, z11, jjVar.k.edit_date);
        paint = org.telegram.ui.ActionBar.t6.T2;
        if (paint == null) {
        }
        ceil = (int) Math.ceil(paint.measureText(G32));
        message = jjVar.k;
        if ((message.flags & 1024) != 0) {
            String S2 = org.telegram.messenger.cd.S(null, Math.max(1, message.views));
            Drawable drawable2 = org.telegram.ui.ActionBar.t6.M3;
            ceil = (int) ((((paint.getTextSize() - org.telegram.messenger.i0.L(2.0f)) * drawable2.getIntrinsicWidth()) / drawable2.getIntrinsicHeight()) + ((int) Math.ceil(paint.measureText(S2))) + org.telegram.messenger.i0.L(10.0f) + ceil);
        }
        this.X.k(k0(org.telegram.messenger.i0.L(23.0f)), k0(t0(ceil, jjVar.P3())), false);
    }

    public static int i0() {
        int i10 = org.telegram.messenger.tz.Y0;
        return (org.telegram.messenger.i0.L(9.0f) + (i10 >= 15 ? org.telegram.messenger.i0.L(2.0f) : i10 >= 11 ? org.telegram.messenger.i0.L(1.0f) : 0)) - org.telegram.messenger.i0.L(2.0f);
    }

    public static float k0(int i10) {
        return (float) Math.ceil((i10 / org.telegram.messenger.i0.p) - 0.01f);
    }

    public static int t0(int i10, boolean z10) {
        return org.telegram.messenger.i0.L(4.0f) + org.telegram.messenger.m5.D(org.telegram.messenger.tz.Y0 < 10 ? 4.0f : 6.0f, 2, org.telegram.messenger.i0.L(6.0f) + i10) + (z10 ? org.telegram.messenger.i0.L(20.0f) : 0);
    }

    @Override // org.telegram.messenger.qu
    public final int H() {
        Rect rect = this.b;
        return rect.top + this.i0 + rect.bottom;
    }

    @Override // org.telegram.messenger.qu
    public final org.telegram.ui.Cells.u9[] K() {
        return this.m0;
    }

    @Override // org.telegram.messenger.qu
    public final boolean P() {
        q81 q81Var = this.d0;
        if (q81Var == null || !this.e0 || !q81Var.w || (q81Var.L & 3) == 2) {
            return false;
        }
        return q81Var.z || q81Var.o();
    }

    @Override // org.telegram.messenger.qu
    public final void S() {
        org.telegram.utils.twidget.w wVar = this.X;
        TL_iv.pageBlockEmbed pageblockembed = this.W;
        if (wVar == null) {
            this.X = org.telegram.utils.twidget.p.i(pageblockembed.url);
        }
        if (this.X == null) {
            return;
        }
        if (this.d0 == null) {
            this.d0 = new q81(this, org.telegram.messenger.i0.p);
        }
        org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.a.get(pageblockembed.url);
        if (mVar != null) {
            ArrayList arrayList = mVar.w;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            if (org.telegram.utils.twidget.p.p(arrayList) != this) {
                q81 q81Var = this.d0;
                org.telegram.utils.twidget.w wVar2 = this.X;
                q81Var.r();
                q81Var.p = wVar2;
                q81Var.r = wVar2 != null;
                return;
            }
            gl0 gl0Var = mVar.x;
            mVar.x = this;
            if (gl0Var != null && gl0Var != this && gl0Var.e0 && gl0Var.d0 != null) {
                gl0Var.s0();
                q81 q81Var2 = gl0Var.d0;
                org.telegram.utils.twidget.w wVar3 = gl0Var.X;
                q81Var2.r();
                q81Var2.p = wVar3;
                q81Var2.r = wVar3 != null;
                View view = gl0Var.V;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        r0();
    }

    @Override // org.telegram.messenger.qu
    public final void U() {
        q81 q81Var;
        if (this.d0 == null) {
            return;
        }
        s0();
        this.d0.r();
        org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.a.get(this.W.url);
        if (mVar == null) {
            return;
        }
        ArrayList arrayList = mVar.w;
        arrayList.remove(this);
        if (mVar.x != this) {
            return;
        }
        gl0 p5 = org.telegram.utils.twidget.p.p(arrayList);
        mVar.x = p5;
        if (p5 == null || p5.e0 || p5.V == null || (q81Var = p5.d0) == null || p5.X == null) {
            return;
        }
        q81Var.r();
        p5.r0();
        p5.V.invalidate();
    }

    @Override // org.telegram.messenger.qu
    public final void V(Canvas canvas) {
        float f7;
        float f10;
        View view;
        org.telegram.ui.Cells.q1 q1Var;
        if (this.d0 == null) {
            return;
        }
        int i10 = this.Z;
        org.telegram.ui.Cells.q1 q1Var2 = this.a.E;
        if (i10 != org.telegram.utils.twidget.l0.e(q1Var2 != null ? q1Var2.getResourcesProvider() : null, this.a.E())) {
            org.telegram.messenger.vv vvVar = this.a;
            org.telegram.ui.Cells.q1 q1Var3 = vvVar.E;
            org.telegram.ui.ActionBar.p6 resourcesProvider = q1Var3 != null ? q1Var3.getResourcesProvider() : null;
            this.Z = org.telegram.utils.twidget.l0.e(resourcesProvider, vvVar.E());
            this.X.l(org.telegram.utils.twidget.l0.a(resourcesProvider, vvVar.E()));
        }
        this.j0 = Q() ? 0 : Math.max(0, Math.min(i0(), this.a.S - org.telegram.messenger.i0.L(2.0f)));
        int u02 = u0();
        float f11 = this.i0;
        org.telegram.ui.Cells.x1 transitionParams = (this.o0 == 0 || (q1Var = this.a.E) == null) ? null : q1Var.getTransitionParams();
        if (transitionParams == null || !transitionParams.x0) {
            if (transitionParams != null && (this.p0 || SystemClock.uptimeMillis() - this.o0 > 250)) {
                this.o0 = 0L;
                this.p0 = false;
            }
            f7 = 0.0f;
            f10 = 0.0f;
        } else {
            this.p0 = true;
            f10 = transitionParams.k0 + 0.0f;
            f11 += transitionParams.j0;
            f7 = h0() ? transitionParams.j0 : transitionParams.k0;
        }
        if (h0()) {
            f7 += this.i0 - j0();
        }
        this.t0 = f11;
        canvas.save();
        canvas.translate(-this.j0, 0.0f);
        this.a0.rewind();
        float[] fArr = this.b0;
        boolean z10 = this.Y;
        org.telegram.messenger.vv vvVar2 = this.a;
        int i11 = org.telegram.messenger.tz.Y0;
        if (i11 > 2) {
            i11 -= 2;
        }
        int L = org.telegram.messenger.i0.L(i11);
        int min = Math.min(org.telegram.messenger.i0.L(3.0f), L);
        float f12 = (!z10 || vvVar2.B() || (!vvVar2.E() && vvVar2.G())) ? min : L;
        float f13 = (!z10 || (vvVar2.E() && vvVar2.G())) ? min : L;
        fArr[1] = f12;
        fArr[0] = f12;
        fArr[3] = f13;
        fArr[2] = f13;
        float f14 = (this.s0 && vvVar2.E()) ? L : min;
        float f15 = (!this.s0 || vvVar2.E()) ? min : L;
        fArr[5] = f15;
        fArr[4] = f15;
        fArr[7] = f14;
        fArr[6] = f14;
        RectF rectF = org.telegram.messenger.i0.P;
        float f16 = u02;
        rectF.set(0.0f, f10, f16, f11);
        this.a0.addRoundRect(rectF, this.b0, Path.Direction.CW);
        canvas.clipPath(this.a0);
        canvas.translate(0.0f, f7);
        if (this.d0.c(canvas, u02) && (view = this.V) != null) {
            view.postInvalidateOnAnimation();
        }
        canvas.restore();
        String str = this.W.url;
        org.telegram.utils.twidget.m mVar = org.telegram.utils.twidget.p.n(str) ? (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.a.get(str) : null;
        if (mVar != null) {
            long j10 = mVar.c;
            if (mVar.i) {
                if (mVar.o == null && org.telegram.messenger.o5.E(j10)) {
                    TLRPC.User Z1 = org.telegram.messenger.vp.r1(mVar.b).Z1(Long.valueOf(j10));
                    if (Z1 != null) {
                        mVar.o = Boolean.valueOf(Z1.bot);
                    }
                } else if (mVar.o == null) {
                    mVar.o = Boolean.FALSE;
                }
                Boolean bool = mVar.o;
                if (bool == null || !bool.booleanValue()) {
                    if (v0 == null) {
                        v0 = new Paint(1);
                        Drawable f17 = i0.a.f(org.telegram.messenger.w0.b, R.drawable.msg_language);
                        w0 = f17;
                        f17.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                    }
                    float L2 = org.telegram.messenger.i0.L(10.0f);
                    float L3 = org.telegram.messenger.i0.L(7.0f);
                    float f18 = org.telegram.messenger.cd.X ? L3 + L2 : (f16 - L3) - L2;
                    float max = Math.max(0.0f, f10) + L3 + L2;
                    this.q0.set(f18 - L2, max - L2, f18 + L2, max + L2);
                    canvas.save();
                    canvas.translate(-this.j0, 0.0f);
                    v0.setColor(this.r0 ? 1929379840 : 1291845632);
                    canvas.drawCircle(f18, max, L2, v0);
                    float L4 = org.telegram.messenger.i0.L(14.0f) / 2.0f;
                    w0.setBounds((int) (f18 - L4), (int) (max - L4), (int) (f18 + L4), (int) (max + L4));
                    w0.draw(canvas);
                    canvas.restore();
                    return;
                }
            }
        }
        this.q0.setEmpty();
    }

    @Override // org.telegram.messenger.qu
    public final boolean X(MotionEvent motionEvent) {
        if (this.d0 == null || !this.e0) {
            return false;
        }
        String str = this.W.url;
        org.telegram.utils.twidget.m mVar = org.telegram.utils.twidget.p.n(str) ? (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.a.get(str) : null;
        if (mVar != null && mVar.k) {
            return false;
        }
        motionEvent.offsetLocation(this.j0, 0.0f);
        try {
            if (!o0(motionEvent)) {
                return this.d0.n(motionEvent);
            }
            motionEvent.offsetLocation(-this.j0, 0.0f);
            return true;
        } finally {
            motionEvent.offsetLocation(-this.j0, 0.0f);
        }
    }

    @Override // org.telegram.ui.Components.p81
    public final void d() {
        org.telegram.ui.Cells.q1 q1Var = this.a.E;
        if (q1Var == null || q1Var.Qa == null) {
            return;
        }
        try {
            q1Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        q1Var.Qa.o0(q1Var, q1Var.g1, q1Var.h1);
    }

    @Override // org.telegram.ui.Components.p81
    public final void f(String str) {
        View view = this.V;
        if (view == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        androidx.emoji2.text.w.h(view, str);
    }

    @Override // org.telegram.ui.Components.p81
    public final void h() {
        org.telegram.utils.twidget.w wVar = this.X;
        org.telegram.utils.twidget.i0 c10 = wVar == null ? null : wVar.c();
        org.telegram.utils.twidget.q0 q0Var = c10 == null ? null : c10.g;
        if (q0Var != this.l0) {
            this.l0 = q0Var;
            if (q0Var != null) {
                ArrayList arrayList = q0Var.a;
                this.m0 = new org.telegram.ui.Cells.u9[arrayList.size()];
                int i10 = 0;
                while (true) {
                    org.telegram.ui.Cells.u9[] u9VarArr = this.m0;
                    if (i10 >= u9VarArr.length) {
                        break;
                    }
                    u9VarArr[i10] = new bi.e0(this, (org.telegram.utils.twidget.o0) arrayList.get(i10));
                    i10++;
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

    public final boolean h0() {
        boolean z10;
        String str = this.W.url;
        org.telegram.utils.twidget.w wVar = this.X;
        if (wVar != null) {
            ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.p.a;
            if (wVar.i > 0) {
                return wVar.l;
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

    @Override // org.telegram.ui.Components.p81
    public final void j() {
        org.telegram.utils.twidget.i0 i0Var;
        eb0 eb0Var = this.h0;
        org.telegram.messenger.i0.r(eb0Var);
        if (this.g0) {
            if (SystemClock.uptimeMillis() - this.f0 < 1500) {
                org.telegram.messenger.i0.h3(eb0Var, 200L);
                return;
            } else {
                if (j0() != this.i0) {
                    q0("on screen", true);
                    return;
                }
                return;
            }
        }
        org.telegram.utils.twidget.k0 k0Var = this.X.f;
        if (k0Var == null || (i0Var = k0Var.F) == null || !(i0Var.h || k0Var.x)) {
            org.telegram.messenger.i0.h3(eb0Var, 1500L);
            return;
        }
        this.g0 = true;
        this.f0 = SystemClock.uptimeMillis();
        if (j0() != this.i0) {
            q0("on screen, loaded", true);
        }
    }

    public final int j0() {
        return org.telegram.utils.twidget.p.d(this.W.url, this.X, u0());
    }

    public final float l0() {
        return this.b.top + this.t0;
    }

    public final float m0() {
        return u0() + (this.b.left - this.j0);
    }

    public final void n0(int i10, String str, String str2, boolean z10) {
        String str3;
        if (org.telegram.messenger.v2.a) {
            long j10 = -1;
            long uptimeMillis = this.e0 ? SystemClock.uptimeMillis() - this.f0 : -1L;
            q81 q81Var = this.d0;
            if (q81Var != null && q81Var.s != 0) {
                j10 = SystemClock.uptimeMillis() - q81Var.s;
            }
            StringBuilder sb2 = new StringBuilder("widget height ");
            sb2.append(this.W.url.substring(10));
            sb2.append(": ");
            sb2.append(str);
            sb2.append(", ");
            sb2.append(Math.round(i10 / org.telegram.messenger.i0.p));
            sb2.append(" (");
            sb2.append(str2);
            sb2.append(") -> ");
            sb2.append(Math.round(this.i0 / org.telegram.messenger.i0.p));
            sb2.append(" (");
            sb2.append(this.k0);
            sb2.append("), width ");
            sb2.append(Math.round(u0() / org.telegram.messenger.i0.p));
            String str4 = "";
            sb2.append(z10 ? ", animated" : "");
            sb2.append(this.V != null ? ", on screen" : ", off screen");
            sb2.append(uptimeMillis >= 0 ? org.telegram.ui.Cells.f1.n(uptimeMillis, ", running ", " ms") : ", not running");
            if (this.X != null) {
                StringBuilder sb3 = new StringBuilder(", session ");
                sb3.append(this.X.q);
                sb3.append(this.X.g != null ? " (snapshot)" : "");
                org.telegram.utils.twidget.k0 k0Var = this.X.f;
                sb3.append((k0Var == null || !k0Var.A) ? ", scripts held" : "");
                str3 = sb3.toString();
            } else {
                str3 = ", no widget yet";
            }
            sb2.append(str3);
            if (j10 >= 0 && j10 < 5000) {
                str4 = org.telegram.ui.Cells.f1.n(j10, ", touched ", " ms ago");
            }
            a1.g.z(str4, sb2);
        }
    }

    public final boolean o0(MotionEvent motionEvent) {
        View view;
        int actionMasked = motionEvent.getActionMasked();
        boolean z10 = false;
        if (actionMasked == 0) {
            float L = org.telegram.messenger.i0.L(6.0f);
            RectF rectF = this.q0;
            if (!rectF.isEmpty() && motionEvent.getX() >= rectF.left - L && motionEvent.getX() <= rectF.right + L && motionEvent.getY() >= rectF.top - L && motionEvent.getY() <= rectF.bottom + L) {
                z10 = true;
            }
            this.r0 = z10;
            if (z10 && (view = this.V) != null) {
                view.invalidate();
            }
            return this.r0;
        }
        if (!this.r0) {
            return false;
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.r0 = false;
            View view2 = this.V;
            if (view2 != null) {
                view2.invalidate();
            }
            org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
            if (actionMasked == 1 && T != null) {
                org.telegram.messenger.m5.n(null, 2131742899, cc.a0(T), R.raw.info, 36);
            }
        }
        return true;
    }

    public final void p0(String str) {
        if (this.V != null) {
            org.telegram.utils.twidget.w wVar = this.X;
            if ((wVar == null || wVar.i <= 0) && j0() != this.i0) {
                q0("on screen: ".concat(str), false);
                return;
            }
            return;
        }
        int j02 = j0();
        int i10 = this.i0;
        if (j02 == i10) {
            return;
        }
        String str2 = this.k0;
        this.i0 = j02;
        this.k0 = org.telegram.utils.twidget.p.k(this.W.url, this.X, u0());
        n0(i10, "away: ".concat(str), str2, false);
        org.telegram.messenger.vv vvVar = this.a;
        vvVar.Q();
        org.telegram.messenger.jj jjVar = vvVar.b;
        if (jjVar != null) {
            jjVar.K1 = true;
        }
        this.n0 = true;
    }

    public final void q0(String str, boolean z10) {
        int j02 = j0();
        int i10 = this.i0;
        boolean z11 = false;
        boolean z12 = j02 != i10;
        String str2 = this.k0;
        this.i0 = j02;
        this.k0 = org.telegram.utils.twidget.p.k(this.W.url, this.X, u0());
        if (z12) {
            n0(i10, str, str2, z10);
        }
        org.telegram.messenger.vv vvVar = this.a;
        if (z12) {
            vvVar.Q();
        }
        if (z12 && z10) {
            this.o0 = SystemClock.uptimeMillis();
            this.p0 = false;
        }
        org.telegram.messenger.jj jjVar = vvVar.b;
        if (jjVar != null) {
            jjVar.K1 = true;
        }
        org.telegram.ui.Cells.q1 q1Var = vvVar.E;
        org.telegram.ui.Cells.l1 l1Var = vvVar.F;
        View view = this.V;
        if (view == null || q1Var == null || l1Var == null) {
            if (view != null) {
                view.requestLayout();
                return;
            }
            return;
        }
        if (z12 && !h0() && (q1Var.getParent() instanceof RecyclerView)) {
            View view2 = (View) q1Var.getParent();
            if (q1Var.getBottom() > view2.getPaddingTop() && q1Var.getTop() < view2.getHeight() - view2.getPaddingBottom()) {
                z11 = true;
            }
        }
        if (z10) {
            l1Var.l1(q1Var, z11, z11);
        } else {
            l1Var.D0(q1Var, z11, z11);
        }
    }

    public final void r0() {
        org.telegram.messenger.jj jjVar;
        org.telegram.utils.twidget.i0 i0Var;
        this.e0 = true;
        this.f0 = SystemClock.uptimeMillis();
        org.telegram.utils.twidget.k0 k0Var = this.X.f;
        this.g0 = (k0Var == null || (i0Var = k0Var.F) == null || (!i0Var.h && !k0Var.x)) ? false : true;
        this.X.n(u0());
        org.telegram.messenger.vv vvVar = this.a;
        org.telegram.ui.Cells.q1 q1Var = vvVar.E;
        org.telegram.ui.ActionBar.p6 resourcesProvider = q1Var != null ? q1Var.getResourcesProvider() : null;
        this.Z = org.telegram.utils.twidget.l0.e(resourcesProvider, vvVar.E());
        this.X.l(org.telegram.utils.twidget.l0.a(resourcesProvider, vvVar.E()));
        this.d0.b(this.X);
        this.d0.q(true);
        org.telegram.utils.twidget.m mVar = (org.telegram.utils.twidget.m) org.telegram.utils.twidget.p.a.get(this.W.url);
        if (mVar != null) {
            mVar.v = this;
        }
        org.telegram.utils.twidget.p.s(this.X);
        boolean z10 = this.n0 && (jjVar = this.a.b) != null && jjVar.K1;
        this.n0 = false;
        if (z10 || j0() != this.i0) {
            org.telegram.messenger.i0.g3(new k2.v(17, this, z10));
        }
    }

    public final void s0() {
        if (this.e0) {
            this.e0 = false;
            org.telegram.messenger.i0.r(this.h0);
            this.d0.q(false);
            this.d0.r();
            org.telegram.utils.twidget.w wVar = this.X;
            if (wVar != null) {
                org.telegram.utils.twidget.p.r(wVar);
            }
        }
    }

    public final int u0() {
        return (i0() * 2) + this.c;
    }
}
