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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class nm9 extends dk9 implements u0d {
    public static final AtomicInteger t0 = new AtomicInteger();
    public final TL_iv.pageBlockEmbed X;
    public q0d Y;
    public final boolean Z;
    public int a0;
    public final Path b0;
    public final float[] c0;
    public final int d0;
    public v0d e0;
    public boolean f0;
    public long g0;
    public boolean h0;
    public final v59 i0;
    public int j0;
    public int k0;
    public String l0;
    public h1d m0;
    public kmb[] n0;
    public boolean o0;
    public long p0;
    public boolean q0;
    public boolean r0;
    public float s0;

    /* JADX WARN: Removed duplicated region for block: B:44:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nm9(hl9 hl9Var, Rect rect, int i, TL_iv.pageBlockEmbed pageblockembed, boolean z) {
        super(hl9Var, rect, i);
        boolean z2;
        Paint paint;
        int ceil;
        TLRPC.Message message;
        this.b0 = new Path();
        this.c0 = new float[8];
        this.d0 = t0.incrementAndGet();
        this.i0 = new v59(this, (byte) 14);
        this.X = pageblockembed;
        this.Z = z;
        this.Y = k0d.h(pageblockembed.url);
        this.j0 = j0();
        String j = k0d.j(pageblockembed.url, this.Y, t0());
        this.l0 = j;
        if (j.equals("placeholder") || this.l0.startsWith("cache of width")) {
            hl.c3(new rm5(pageblockembed.url, t0(), hl9Var.D()));
        }
        String str = pageblockembed.url;
        ConcurrentHashMap concurrentHashMap = k0d.a;
        h0d h0dVar = (h0d) concurrentHashMap.get(str);
        nm9 nm9Var = h0dVar == null ? null : h0dVar.w;
        if (nm9Var != null && nm9Var != this && nm9Var.j0 != this.j0) {
            n0(nm9Var.j0, "new layout, width " + Math.round(nm9Var.t0() / hl.p) + " -> " + Math.round(t0() / hl.p), nm9Var.l0, false);
        }
        h0d h0dVar2 = (h0d) concurrentHashMap.get(pageblockembed.url);
        if (h0dVar2 != null) {
            h0dVar2.w = this;
        }
        r47 r47Var = this.a.b;
        if (this.Y == null || r47Var == null || r47Var.k == null) {
            return;
        }
        if ((r47Var.P2() && !r47Var.O3()) || (!TextUtils.isEmpty(r47Var.k.message) && !r47Var.k.invert_media)) {
            this.Y.j(0.0f, 0.0f, false);
            return;
        }
        if (!r47Var.r1) {
            TLRPC.Message message2 = r47Var.k;
            if (!message2.edit_hide && ((message2.flags & 32768) != 0 || r47Var.Y2())) {
                z2 = true;
                String N3 = wb2.N3(r47Var, r47Var, z2, r47Var.k.edit_date);
                paint = aob.T2;
                if (paint == null) {
                    paint = new Paint(1);
                    paint.setTextSize(hl.L(12.0f));
                }
                ceil = (int) Math.ceil(paint.measureText(N3));
                message = r47Var.k;
                if ((message.flags & 1024) != 0 && aob.M3 != null) {
                    String S = ob6.S(null, Math.max(1, message.views));
                    Drawable drawable = aob.M3;
                    ceil = (int) ((((paint.getTextSize() - hl.L(2.0f)) * drawable.getIntrinsicWidth()) / drawable.getIntrinsicHeight()) + ((int) Math.ceil(paint.measureText(S))) + hl.L(10.0f) + ceil);
                }
                this.Y.j(k0(hl.L(23.0f)), k0(s0(ceil, r47Var.O3())), false);
            }
        }
        z2 = false;
        String N32 = wb2.N3(r47Var, r47Var, z2, r47Var.k.edit_date);
        paint = aob.T2;
        if (paint == null) {
        }
        ceil = (int) Math.ceil(paint.measureText(N32));
        message = r47Var.k;
        if ((message.flags & 1024) != 0) {
            String S2 = ob6.S(null, Math.max(1, message.views));
            Drawable drawable2 = aob.M3;
            ceil = (int) ((((paint.getTextSize() - hl.L(2.0f)) * drawable2.getIntrinsicWidth()) / drawable2.getIntrinsicHeight()) + ((int) Math.ceil(paint.measureText(S2))) + hl.L(10.0f) + ceil);
        }
        this.Y.j(k0(hl.L(23.0f)), k0(s0(ceil, r47Var.O3())), false);
    }

    public static int i0() {
        int i = xea.U0;
        return (hl.L(9.0f) + (i >= 15 ? hl.L(2.0f) : i >= 11 ? hl.L(1.0f) : 0)) - hl.L(2.0f);
    }

    public static float k0(int i) {
        return (float) Math.ceil((i / hl.p) - 0.01f);
    }

    public static int s0(int i, boolean z) {
        return hl.L(4.0f) + hl.L(6.0f) + i + (hl.L(xea.U0 < 10 ? 4.0f : 6.0f) << 1) + (z ? hl.L(20.0f) : 0);
    }

    @Override // dk9
    public final int H() {
        Rect rect = this.b;
        return rect.top + this.j0 + rect.bottom;
    }

    @Override // dk9
    public final kmb[] K() {
        return this.n0;
    }

    @Override // dk9
    public final boolean P() {
        v0d v0dVar = this.e0;
        if (v0dVar == null || !this.f0 || !v0dVar.w || (v0dVar.L & 3) == 2) {
            return false;
        }
        return v0dVar.z || v0dVar.o();
    }

    @Override // dk9
    public final void S() {
        q0d q0dVar = this.Y;
        TL_iv.pageBlockEmbed pageblockembed = this.X;
        if (q0dVar == null) {
            q0dVar = k0d.h(pageblockembed.url);
            this.Y = q0dVar;
        }
        if (q0dVar == null) {
            return;
        }
        if (this.e0 == null) {
            this.e0 = new v0d(this, hl.p);
        }
        h0d h0dVar = (h0d) k0d.a.get(pageblockembed.url);
        if (h0dVar != null) {
            ArrayList arrayList = h0dVar.x;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            if (k0d.p(arrayList) != this) {
                v0d v0dVar = this.e0;
                q0d q0dVar2 = this.Y;
                v0dVar.r();
                v0dVar.p = q0dVar2;
                v0dVar.r = q0dVar2 != null;
                return;
            }
            nm9 nm9Var = h0dVar.y;
            h0dVar.y = this;
            if (nm9Var != null && nm9Var != this && nm9Var.f0 && nm9Var.e0 != null) {
                nm9Var.r0();
                v0d v0dVar2 = nm9Var.e0;
                q0d q0dVar3 = nm9Var.Y;
                v0dVar2.r();
                v0dVar2.p = q0dVar3;
                v0dVar2.r = q0dVar3 != null;
                View view = nm9Var.W;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        q0();
    }

    @Override // dk9
    public final void U() {
        v0d v0dVar;
        if (this.e0 != null) {
            r0();
            this.e0.r();
            h0d h0dVar = (h0d) k0d.a.get(this.X.url);
            if (h0dVar != null) {
                ArrayList arrayList = h0dVar.x;
                arrayList.remove(this);
                if (h0dVar.y == this) {
                    nm9 p = k0d.p(arrayList);
                    h0dVar.y = p;
                    if (p == null || p.f0 || p.W == null || (v0dVar = p.e0) == null || p.Y == null) {
                        return;
                    }
                    v0dVar.r();
                    p.q0();
                    p.W.invalidate();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d2  */
    @Override // dk9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(Canvas canvas) {
        float f;
        float f2;
        int i;
        View view;
        wb2 wb2Var;
        if (this.e0 == null) {
            return;
        }
        int i2 = this.a0;
        hl9 hl9Var = this.a;
        wb2 wb2Var2 = hl9Var.E;
        dc2 dc2Var = null;
        if (i2 != c1d.e(wb2Var2 != null ? wb2Var2.getResourcesProvider() : null, hl9Var.D())) {
            wb2 wb2Var3 = hl9Var.E;
            vnb resourcesProvider = wb2Var3 != null ? wb2Var3.getResourcesProvider() : null;
            this.a0 = c1d.e(resourcesProvider, hl9Var.D());
            this.Y.k(c1d.a(resourcesProvider, hl9Var.D()));
        }
        this.k0 = Q() ? 0 : Math.max(0, Math.min(i0(), hl9Var.S - hl.L(2.0f)));
        int t02 = t0();
        float f3 = this.j0;
        if (this.p0 != 0 && (wb2Var = hl9Var.E) != null) {
            dc2Var = wb2Var.getTransitionParams();
        }
        if (dc2Var != null) {
            if (dc2Var.x0) {
                this.q0 = true;
                f2 = dc2Var.k0 + 0.0f;
                f3 += dc2Var.j0;
                f = h0() ? dc2Var.j0 : dc2Var.k0;
                if (h0()) {
                    f += this.j0 - j0();
                }
                this.s0 = f3;
                canvas.save();
                canvas.translate(-this.k0, 0.0f);
                Path path = this.b0;
                path.rewind();
                i = xea.U0;
                if (i > 2) {
                    i -= 2;
                }
                int L = hl.L(i);
                int min = Math.min(hl.L(3.0f), L);
                boolean z = this.Z;
                float f4 = (z || hl9Var.A() || (!hl9Var.D() && hl9Var.F())) ? min : L;
                float f5 = (z || (hl9Var.D() && hl9Var.F())) ? min : L;
                float[] fArr = this.c0;
                fArr[1] = f4;
                fArr[0] = f4;
                fArr[3] = f5;
                fArr[2] = f5;
                float f6 = (this.r0 || !hl9Var.D()) ? min : L;
                float f7 = (this.r0 || hl9Var.D()) ? min : L;
                fArr[5] = f7;
                fArr[4] = f7;
                fArr[7] = f6;
                fArr[6] = f6;
                RectF rectF = hl.P;
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
        i = xea.U0;
        if (i > 2) {
        }
        int L2 = hl.L(i);
        int min2 = Math.min(hl.L(3.0f), L2);
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
        RectF rectF2 = hl.P;
        rectF2.set(0.0f, f2, t02, f3);
        path2.addRoundRect(rectF2, fArr2, Path.Direction.CW);
        canvas.clipPath(path2);
        canvas.translate(0.0f, f);
        if (this.e0.c(canvas, t02)) {
            view.postInvalidateOnAnimation();
        }
        canvas.restore();
    }

    @Override // dk9
    public final boolean X(MotionEvent motionEvent) {
        if (this.e0 == null || !this.f0) {
            return false;
        }
        String str = this.X.url;
        h0d h0dVar = k0d.m(str) ? (h0d) k0d.a.get(str) : null;
        if (h0dVar != null && h0dVar.k) {
            return false;
        }
        motionEvent.offsetLocation(this.k0, 0.0f);
        try {
            return this.e0.n(motionEvent);
        } finally {
            motionEvent.offsetLocation(-this.k0, 0.0f);
        }
    }

    @Override // u0d
    public final void d() {
        wb2 wb2Var = this.a.E;
        if (wb2Var == null || wb2Var.eb == null) {
            return;
        }
        try {
            wb2Var.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        wb2Var.eb.v(wb2Var, wb2Var.h1, wb2Var.i1);
    }

    @Override // u0d
    public final void f() {
        q0d q0dVar = this.Y;
        a1d d = q0dVar == null ? null : q0dVar.d();
        h1d h1dVar = d == null ? null : d.g;
        if (h1dVar != this.m0) {
            this.m0 = h1dVar;
            if (h1dVar != null) {
                ArrayList arrayList = h1dVar.a;
                this.n0 = new kmb[arrayList.size()];
                int i = 0;
                while (true) {
                    kmb[] kmbVarArr = this.n0;
                    if (i >= kmbVarArr.length) {
                        break;
                    }
                    kmbVarArr[i] = new af9(this, (f1d) arrayList.get(i));
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

    @Override // u0d
    public final void h() {
        v59 v59Var = this.i0;
        hl.r(v59Var);
        if (this.h0) {
            if (SystemClock.uptimeMillis() - this.g0 < 1500) {
                hl.d3(v59Var, 200L);
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
            hl.d3(v59Var, 1500L);
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
        q0d q0dVar = this.Y;
        ConcurrentHashMap concurrentHashMap = k0d.a;
        if (q0dVar != null && q0dVar.h > 0) {
            return q0dVar.k;
        }
        h0d h0dVar = k0d.m(str) ? (h0d) k0d.a.get(str) : null;
        i0d i0dVar = h0dVar != null ? (i0d) k0d.b.get(h0dVar.a()) : null;
        if (i0dVar != null) {
            synchronized (i0dVar) {
                if (!i0dVar.a.isEmpty() && ((int[]) i0dVar.a.get(0)).length > 2) {
                    if (((int[]) i0dVar.a.get(0))[2] != 0) {
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
        return k0d.c(this.X.url, this.Y, t0());
    }

    public final float l0() {
        return this.b.top + this.s0;
    }

    public final float m0() {
        return t0() + (this.b.left - this.k0);
    }

    public final void n0(int i, String str, String str2, boolean z) {
        String str3;
        if (f11.a) {
            long j = -1;
            long uptimeMillis = this.f0 ? SystemClock.uptimeMillis() - this.g0 : -1L;
            v0d v0dVar = this.e0;
            if (v0dVar != null && v0dVar.s != 0) {
                j = SystemClock.uptimeMillis() - v0dVar.s;
            }
            StringBuilder sb = new StringBuilder("widget height ");
            sb.append(this.X.url.substring(10));
            sb.append(": ");
            sb.append(str);
            sb.append(", ");
            sb.append(Math.round(i / hl.p));
            sb.append(" (");
            sb.append(str2);
            sb.append(") -> ");
            sb.append(Math.round(this.j0 / hl.p));
            sb.append(" (");
            sb.append(this.l0);
            sb.append("), width ");
            sb.append(Math.round(t0() / hl.p));
            String str4 = "";
            sb.append(z ? ", animated" : "");
            sb.append(this.W != null ? ", on screen" : ", off screen");
            sb.append(uptimeMillis >= 0 ? ik8.n(uptimeMillis, ", running ", " ms") : ", not running");
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
                str4 = ik8.n(j, ", touched ", " ms ago");
            }
            uh9.s(str4, sb);
        }
    }

    public final void o0(String str) {
        if (this.W != null) {
            q0d q0dVar = this.Y;
            if ((q0dVar == null || q0dVar.h <= 0) && j0() != this.j0) {
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
        this.l0 = k0d.j(this.X.url, this.Y, t0());
        n0(i, "away: ".concat(str), str2, false);
        hl9 hl9Var = this.a;
        hl9Var.P();
        r47 r47Var = hl9Var.b;
        if (r47Var != null) {
            r47Var.M1 = true;
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
        this.l0 = k0d.j(this.X.url, this.Y, t0());
        hl9 hl9Var = this.a;
        if (z3) {
            n0(i, str, str2, z);
            hl9Var.P();
            if (z) {
                this.p0 = SystemClock.uptimeMillis();
                this.q0 = false;
            }
        }
        r47 r47Var = hl9Var.b;
        if (r47Var != null) {
            r47Var.M1 = true;
        }
        wb2 wb2Var = hl9Var.E;
        rb2 rb2Var = hl9Var.F;
        View view = this.W;
        if (view == null || wb2Var == null || rb2Var == null) {
            if (view != null) {
                view.requestLayout();
                return;
            }
            return;
        }
        if (z3 && !h0() && (wb2Var.getParent() instanceof RecyclerView)) {
            View view2 = (View) wb2Var.getParent();
            if (wb2Var.getBottom() > view2.getPaddingTop() && wb2Var.getTop() < view2.getHeight() - view2.getPaddingBottom()) {
                z2 = true;
            }
        }
        if (z) {
            rb2Var.r1(wb2Var, z2, z2);
        } else {
            rb2Var.h2(wb2Var, z2, z2);
        }
    }

    public final void q0() {
        r47 r47Var;
        this.f0 = true;
        this.g0 = SystemClock.uptimeMillis();
        this.h0 = this.Y.e();
        this.Y.m(t0());
        hl9 hl9Var = this.a;
        wb2 wb2Var = hl9Var.E;
        vnb resourcesProvider = wb2Var != null ? wb2Var.getResourcesProvider() : null;
        this.a0 = c1d.e(resourcesProvider, hl9Var.D());
        this.Y.k(c1d.a(resourcesProvider, hl9Var.D()));
        this.e0.b(this.Y);
        this.e0.q(true);
        h0d h0dVar = (h0d) k0d.a.get(this.X.url);
        if (h0dVar != null) {
            h0dVar.w = this;
        }
        k0d.u(this.Y);
        boolean z = this.o0 && (r47Var = hl9Var.b) != null && r47Var.M1;
        this.o0 = false;
        if (z || j0() != this.j0) {
            hl.c3(new q38((byte) 6, (Object) this, z));
        }
    }

    public final void r0() {
        if (this.f0) {
            this.f0 = false;
            hl.r(this.i0);
            this.e0.q(false);
            this.e0.r();
            q0d q0dVar = this.Y;
            if (q0dVar != null) {
                k0d.r(q0dVar);
            }
        }
    }

    @Override // u0d
    public final void setCursor(String str) {
        View view = this.W;
        if (view == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        lh0.k(view, str);
    }

    public final int t0() {
        return this.c + (i0() << 1);
    }
}
