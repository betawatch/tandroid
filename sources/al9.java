// default package

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
import org.telegram.utils.twidget.z;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class al9 extends qi9 implements gyc {
    public static final AtomicInteger t0 = new AtomicInteger();
    public final TL_iv.pageBlockEmbed X;
    public cyc Y;
    public final boolean Z;
    public int a0;
    public final Path b0;
    public final float[] c0;
    public final int d0;
    public hyc e0;
    public boolean f0;
    public long g0;
    public boolean h0;
    public final kf9 i0;
    public int j0;
    public int k0;
    public String l0;
    public syc m0;
    public qkb[] n0;
    public boolean o0;
    public long p0;
    public boolean q0;
    public boolean r0;
    public float s0;

    /* JADX WARN: Removed duplicated region for block: B:44:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public al9(uj9 uj9Var, Rect rect, int i, TL_iv.pageBlockEmbed pageblockembed, boolean z) {
        super(uj9Var, rect, i);
        boolean z2;
        Paint paint;
        int ceil;
        TLRPC.Message message;
        this.b0 = new Path();
        this.c0 = new float[8];
        this.d0 = t0.incrementAndGet();
        this.i0 = new kf9(this, (byte) 6);
        this.X = pageblockembed;
        this.Z = z;
        this.Y = wxc.h(pageblockembed.url);
        this.j0 = j0();
        String j = wxc.j(pageblockembed.url, this.Y, t0());
        this.l0 = j;
        if (j.equals("placeholder") || this.l0.startsWith("cache of width")) {
            gm.c3(new om5(pageblockembed.url, t0(), uj9Var.D()));
        }
        String str = pageblockembed.url;
        ConcurrentHashMap concurrentHashMap = wxc.a;
        txc txcVar = (txc) concurrentHashMap.get(str);
        al9 al9Var = txcVar == null ? null : txcVar.w;
        if (al9Var != null && al9Var != this && al9Var.j0 != this.j0) {
            n0(al9Var.j0, "new layout, width " + Math.round(al9Var.t0() / gm.p) + " -> " + Math.round(t0() / gm.p), al9Var.l0, false);
        }
        txc txcVar2 = (txc) concurrentHashMap.get(pageblockembed.url);
        if (txcVar2 != null) {
            txcVar2.w = this;
        }
        k47 k47Var = this.a.b;
        if (this.Y == null || k47Var == null || k47Var.k == null) {
            return;
        }
        if ((k47Var.P2() && !k47Var.O3()) || (!TextUtils.isEmpty(k47Var.k.message) && !k47Var.k.invert_media)) {
            this.Y.j(0.0f, 0.0f, false);
            return;
        }
        if (!k47Var.r1) {
            TLRPC.Message message2 = k47Var.k;
            if (!message2.edit_hide && ((message2.flags & 32768) != 0 || k47Var.Y2())) {
                z2 = true;
                String N3 = rc2.N3(k47Var, k47Var, z2, k47Var.k.edit_date);
                paint = cmb.S2;
                if (paint == null) {
                    paint = new Paint(1);
                    paint.setTextSize(gm.L(12.0f));
                }
                ceil = (int) Math.ceil(paint.measureText(N3));
                message = k47Var.k;
                if ((message.flags & 1024) != 0 && cmb.L3 != null) {
                    String S = jb6.S(null, Math.max(1, message.views));
                    Drawable drawable = cmb.L3;
                    ceil = (int) ((((paint.getTextSize() - gm.L(2.0f)) * drawable.getIntrinsicWidth()) / drawable.getIntrinsicHeight()) + ((int) Math.ceil(paint.measureText(S))) + gm.L(10.0f) + ceil);
                }
                this.Y.j(k0(gm.L(23.0f)), k0(s0(ceil, k47Var.O3())), false);
            }
        }
        z2 = false;
        String N32 = rc2.N3(k47Var, k47Var, z2, k47Var.k.edit_date);
        paint = cmb.S2;
        if (paint == null) {
        }
        ceil = (int) Math.ceil(paint.measureText(N32));
        message = k47Var.k;
        if ((message.flags & 1024) != 0) {
            String S2 = jb6.S(null, Math.max(1, message.views));
            Drawable drawable2 = cmb.L3;
            ceil = (int) ((((paint.getTextSize() - gm.L(2.0f)) * drawable2.getIntrinsicWidth()) / drawable2.getIntrinsicHeight()) + ((int) Math.ceil(paint.measureText(S2))) + gm.L(10.0f) + ceil);
        }
        this.Y.j(k0(gm.L(23.0f)), k0(s0(ceil, k47Var.O3())), false);
    }

    public static int i0() {
        int i = gda.U0;
        return (gm.L(9.0f) + (i >= 15 ? gm.L(2.0f) : i >= 11 ? gm.L(1.0f) : 0)) - gm.L(2.0f);
    }

    public static float k0(int i) {
        return (float) Math.ceil((i / gm.p) - 0.01f);
    }

    public static int s0(int i, boolean z) {
        return gm.L(4.0f) + gm.L(6.0f) + i + (gm.L(gda.U0 < 10 ? 4.0f : 6.0f) << 1) + (z ? gm.L(20.0f) : 0);
    }

    @Override // qi9
    public final int H() {
        Rect rect = this.b;
        return rect.top + this.j0 + rect.bottom;
    }

    @Override // qi9
    public final qkb[] K() {
        return this.n0;
    }

    @Override // qi9
    public final boolean P() {
        hyc hycVar = this.e0;
        if (hycVar == null || !this.f0 || !hycVar.w || (hycVar.L & 3) == 2) {
            return false;
        }
        return hycVar.z || hycVar.o();
    }

    @Override // qi9
    public final void S() {
        cyc cycVar = this.Y;
        TL_iv.pageBlockEmbed pageblockembed = this.X;
        if (cycVar == null) {
            cycVar = wxc.h(pageblockembed.url);
            this.Y = cycVar;
        }
        if (cycVar == null) {
            return;
        }
        if (this.e0 == null) {
            this.e0 = new hyc(this, gm.p);
        }
        txc txcVar = (txc) wxc.a.get(pageblockembed.url);
        if (txcVar != null) {
            ArrayList arrayList = txcVar.x;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            if (wxc.p(arrayList) != this) {
                hyc hycVar = this.e0;
                cyc cycVar2 = this.Y;
                hycVar.r();
                hycVar.p = cycVar2;
                hycVar.r = cycVar2 != null;
                return;
            }
            al9 al9Var = txcVar.y;
            txcVar.y = this;
            if (al9Var != null && al9Var != this && al9Var.f0 && al9Var.e0 != null) {
                al9Var.r0();
                hyc hycVar2 = al9Var.e0;
                cyc cycVar3 = al9Var.Y;
                hycVar2.r();
                hycVar2.p = cycVar3;
                hycVar2.r = cycVar3 != null;
                View view = al9Var.W;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        q0();
    }

    @Override // qi9
    public final void U() {
        hyc hycVar;
        if (this.e0 != null) {
            r0();
            this.e0.r();
            txc txcVar = (txc) wxc.a.get(this.X.url);
            if (txcVar != null) {
                ArrayList arrayList = txcVar.x;
                arrayList.remove(this);
                if (txcVar.y == this) {
                    al9 p = wxc.p(arrayList);
                    txcVar.y = p;
                    if (p == null || p.f0 || p.W == null || (hycVar = p.e0) == null || p.Y == null) {
                        return;
                    }
                    hycVar.r();
                    p.q0();
                    p.W.invalidate();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d2  */
    @Override // qi9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(Canvas canvas) {
        float f;
        float f2;
        int i;
        View view;
        rc2 rc2Var;
        if (this.e0 == null) {
            return;
        }
        int i2 = this.a0;
        uj9 uj9Var = this.a;
        rc2 rc2Var2 = uj9Var.E;
        yc2 yc2Var = null;
        if (i2 != nyc.e(rc2Var2 != null ? rc2Var2.getResourcesProvider() : null, uj9Var.D())) {
            rc2 rc2Var3 = uj9Var.E;
            ylb resourcesProvider = rc2Var3 != null ? rc2Var3.getResourcesProvider() : null;
            this.a0 = nyc.e(resourcesProvider, uj9Var.D());
            this.Y.k(nyc.a(resourcesProvider, uj9Var.D()));
        }
        this.k0 = Q() ? 0 : Math.max(0, Math.min(i0(), uj9Var.S - gm.L(2.0f)));
        int t02 = t0();
        float f3 = this.j0;
        if (this.p0 != 0 && (rc2Var = uj9Var.E) != null) {
            yc2Var = rc2Var.getTransitionParams();
        }
        if (yc2Var != null) {
            if (yc2Var.x0) {
                this.q0 = true;
                f2 = yc2Var.k0 + 0.0f;
                f3 += yc2Var.j0;
                f = h0() ? yc2Var.j0 : yc2Var.k0;
                if (h0()) {
                    f += this.j0 - j0();
                }
                this.s0 = f3;
                canvas.save();
                canvas.translate(-this.k0, 0.0f);
                Path path = this.b0;
                path.rewind();
                i = gda.U0;
                if (i > 2) {
                    i -= 2;
                }
                int L = gm.L(i);
                int min = Math.min(gm.L(3.0f), L);
                boolean z = this.Z;
                float f4 = (z || uj9Var.A() || (!uj9Var.D() && uj9Var.F())) ? min : L;
                float f5 = (z || (uj9Var.D() && uj9Var.F())) ? min : L;
                float[] fArr = this.c0;
                fArr[1] = f4;
                fArr[0] = f4;
                fArr[3] = f5;
                fArr[2] = f5;
                float f6 = (this.r0 || !uj9Var.D()) ? min : L;
                float f7 = (this.r0 || uj9Var.D()) ? min : L;
                fArr[5] = f7;
                fArr[4] = f7;
                fArr[7] = f6;
                fArr[6] = f6;
                RectF rectF = gm.P;
                rectF.set(0.0f, f2, t02, f3);
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.translate(0.0f, f);
                if (this.e0.c(canvas, t02) && (view = this.W) != null) {
                    view.postInvalidateOnAnimation();
                }
                canvas.restore();
            }
            if (this.q0 || SystemClock.uptimeMillis() - this.p0 > 250) {
                this.p0 = 0L;
                this.q0 = false;
            }
        }
        f = 0.0f;
        f2 = 0.0f;
        if (h0()) {
        }
        this.s0 = f3;
        canvas.save();
        canvas.translate(-this.k0, 0.0f);
        Path path2 = this.b0;
        path2.rewind();
        i = gda.U0;
        if (i > 2) {
        }
        int L2 = gm.L(i);
        int min2 = Math.min(gm.L(3.0f), L2);
        boolean z2 = this.Z;
        if (z2) {
        }
        if (z2) {
        }
        float[] fArr2 = this.c0;
        fArr2[1] = f4;
        fArr2[0] = f4;
        fArr2[3] = f5;
        fArr2[2] = f5;
        if (this.r0) {
        }
        if (this.r0) {
        }
        fArr2[5] = f7;
        fArr2[4] = f7;
        fArr2[7] = f6;
        fArr2[6] = f6;
        RectF rectF2 = gm.P;
        rectF2.set(0.0f, f2, t02, f3);
        path2.addRoundRect(rectF2, fArr2, Path.Direction.CW);
        canvas.clipPath(path2);
        canvas.translate(0.0f, f);
        if (this.e0.c(canvas, t02)) {
            view.postInvalidateOnAnimation();
        }
        canvas.restore();
    }

    @Override // qi9
    public final boolean X(MotionEvent motionEvent) {
        if (this.e0 == null || !this.f0) {
            return false;
        }
        String str = this.X.url;
        txc txcVar = wxc.m(str) ? (txc) wxc.a.get(str) : null;
        if (txcVar != null && txcVar.k) {
            return false;
        }
        motionEvent.offsetLocation(this.k0, 0.0f);
        try {
            return this.e0.n(motionEvent);
        } finally {
            motionEvent.offsetLocation(-this.k0, 0.0f);
        }
    }

    @Override // gyc
    public final void d() {
        rc2 rc2Var = this.a.E;
        if (rc2Var == null || rc2Var.eb == null) {
            return;
        }
        try {
            rc2Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        rc2Var.eb.u(rc2Var, rc2Var.h1, rc2Var.i1);
    }

    @Override // gyc
    public final void f() {
        cyc cycVar = this.Y;
        lyc d = cycVar == null ? null : cycVar.d();
        syc sycVar = d == null ? null : d.g;
        if (sycVar != this.m0) {
            this.m0 = sycVar;
            if (sycVar != null) {
                ArrayList arrayList = sycVar.a;
                this.n0 = new qkb[arrayList.size()];
                int i = 0;
                while (true) {
                    qkb[] qkbVarArr = this.n0;
                    if (i >= qkbVarArr.length) {
                        break;
                    }
                    qkbVarArr[i] = new kd9(this, (qyc) arrayList.get(i));
                    i++;
                }
            } else {
                this.n0 = null;
            }
            this.a.P();
        }
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // gyc
    public final void h() {
        kf9 kf9Var = this.i0;
        gm.r(kf9Var);
        if (this.h0) {
            if (SystemClock.uptimeMillis() - this.g0 < 1500) {
                gm.d3(kf9Var, 200L);
                return;
            } else {
                if (j0() != this.j0) {
                    p0("on screen", true);
                    return;
                }
                return;
            }
        }
        if (!this.Y.e()) {
            gm.d3(kf9Var, 1500L);
            return;
        }
        this.h0 = true;
        this.g0 = SystemClock.uptimeMillis();
        if (j0() != this.j0) {
            p0("on screen, loaded", true);
        }
    }

    public final boolean h0() {
        boolean z;
        String str = this.X.url;
        cyc cycVar = this.Y;
        ConcurrentHashMap concurrentHashMap = wxc.a;
        if (cycVar != null && cycVar.h > 0) {
            return cycVar.k;
        }
        txc txcVar = wxc.m(str) ? (txc) wxc.a.get(str) : null;
        uxc uxcVar = txcVar != null ? (uxc) wxc.b.get(txcVar.a()) : null;
        if (uxcVar != null) {
            synchronized (uxcVar) {
                if (!uxcVar.a.isEmpty() && ((int[]) uxcVar.a.get(0)).length > 2) {
                    if (((int[]) uxcVar.a.get(0))[2] != 0) {
                        z = true;
                    }
                }
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final int j0() {
        return wxc.c(this.X.url, this.Y, t0());
    }

    public final float l0() {
        return this.b.top + this.s0;
    }

    public final float m0() {
        return t0() + (this.b.left - this.k0);
    }

    public final void n0(int i, String str, String str2, boolean z) {
        String str3;
        if (e21.a) {
            long j = -1;
            long uptimeMillis = this.f0 ? SystemClock.uptimeMillis() - this.g0 : -1L;
            hyc hycVar = this.e0;
            if (hycVar != null && hycVar.s != 0) {
                j = SystemClock.uptimeMillis() - hycVar.s;
            }
            StringBuilder sb = new StringBuilder("widget height ");
            sb.append(this.X.url.substring(10));
            sb.append(": ");
            sb.append(str);
            sb.append(", ");
            sb.append(Math.round(i / gm.p));
            sb.append(" (");
            sb.append(str2);
            sb.append(") -> ");
            sb.append(Math.round(this.j0 / gm.p));
            sb.append(" (");
            sb.append(this.l0);
            sb.append("), width ");
            sb.append(Math.round(t0() / gm.p));
            String str4 = "";
            sb.append(z ? ", animated" : "");
            sb.append(this.W != null ? ", on screen" : ", off screen");
            sb.append(uptimeMillis >= 0 ? wi8.n(uptimeMillis, ", running ", " ms") : ", not running");
            if (this.Y != null) {
                StringBuilder sb2 = new StringBuilder(", session ");
                sb2.append(this.Y.p);
                sb2.append(this.Y.f != null ? " (snapshot)" : "");
                z zVar = this.Y.e;
                sb2.append((zVar == null || !zVar.I) ? ", scripts held" : "");
                str3 = sb2.toString();
            } else {
                str3 = ", no widget yet";
            }
            sb.append(str3);
            if (j >= 0 && j < 5000) {
                str4 = wi8.n(j, ", touched ", " ms ago");
            }
            hg9.r(str4, sb);
        }
    }

    public final void o0(String str) {
        if (this.W != null) {
            cyc cycVar = this.Y;
            if ((cycVar == null || cycVar.h <= 0) && j0() != this.j0) {
                p0("on screen: ".concat(str), false);
                return;
            }
            return;
        }
        int j0 = j0();
        int i = this.j0;
        if (j0 == i) {
            return;
        }
        String str2 = this.l0;
        this.j0 = j0;
        this.l0 = wxc.j(this.X.url, this.Y, t0());
        n0(i, "away: ".concat(str), str2, false);
        uj9 uj9Var = this.a;
        uj9Var.P();
        k47 k47Var = uj9Var.b;
        if (k47Var != null) {
            k47Var.M1 = true;
        }
        this.o0 = true;
    }

    public final void p0(String str, boolean z) {
        int j0 = j0();
        int i = this.j0;
        boolean z2 = false;
        boolean z3 = j0 != i;
        String str2 = this.l0;
        this.j0 = j0;
        this.l0 = wxc.j(this.X.url, this.Y, t0());
        uj9 uj9Var = this.a;
        if (z3) {
            n0(i, str, str2, z);
            uj9Var.P();
            if (z) {
                this.p0 = SystemClock.uptimeMillis();
                this.q0 = false;
            }
        }
        k47 k47Var = uj9Var.b;
        if (k47Var != null) {
            k47Var.M1 = true;
        }
        rc2 rc2Var = uj9Var.E;
        mc2 mc2Var = uj9Var.F;
        View view = this.W;
        if (view == null || rc2Var == null || mc2Var == null) {
            if (view != null) {
                view.requestLayout();
                return;
            }
            return;
        }
        if (z3 && !h0() && (rc2Var.getParent() instanceof RecyclerView)) {
            View view2 = (View) rc2Var.getParent();
            if (rc2Var.getBottom() > view2.getPaddingTop() && rc2Var.getTop() < view2.getHeight() - view2.getPaddingBottom()) {
                z2 = true;
            }
        }
        if (z) {
            mc2Var.u1(rc2Var, z2, z2);
        } else {
            mc2Var.l2(rc2Var, z2, z2);
        }
    }

    public final void q0() {
        k47 k47Var;
        this.f0 = true;
        this.g0 = SystemClock.uptimeMillis();
        this.h0 = this.Y.e();
        this.Y.m(t0());
        uj9 uj9Var = this.a;
        rc2 rc2Var = uj9Var.E;
        ylb resourcesProvider = rc2Var != null ? rc2Var.getResourcesProvider() : null;
        this.a0 = nyc.e(resourcesProvider, uj9Var.D());
        this.Y.k(nyc.a(resourcesProvider, uj9Var.D()));
        this.e0.b(this.Y);
        this.e0.q(true);
        txc txcVar = (txc) wxc.a.get(this.X.url);
        if (txcVar != null) {
            txcVar.w = this;
        }
        wxc.u(this.Y);
        boolean z = this.o0 && (k47Var = uj9Var.b) != null && k47Var.M1;
        this.o0 = false;
        if (z || j0() != this.j0) {
            gm.c3(new n28((byte) 6, (Object) this, z));
        }
    }

    public final void r0() {
        if (this.f0) {
            this.f0 = false;
            gm.r(this.i0);
            this.e0.q(false);
            this.e0.r();
            cyc cycVar = this.Y;
            if (cycVar != null) {
                wxc.r(cycVar);
            }
        }
    }

    @Override // gyc
    public final void setCursor(String str) {
        View view = this.W;
        if (view == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        ki0.k(view, str);
    }

    public final int t0() {
        return this.c + (i0() << 1);
    }
}
