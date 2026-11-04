package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.gc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r1 {
    public final q1 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f = 0;
    public ArrayList g;
    public boolean h;

    public r1(q1 q1Var) {
        this.a = q1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        int i3;
        boolean z10;
        q1 q1Var = this.a;
        q1Var.A0(0);
        if (this.b) {
            boolean z11 = this.d;
            if (this.c) {
                boolean z12 = (z11 ? 1 : 0) | 2;
                i3 = (z11 ? 1 : 0) + 1;
                z10 = z12;
            } else {
                i3 = z11 ? 1 : 0;
                z10 = z11;
            }
            boolean z13 = z10;
            if (this.e) {
                i3++;
                z13 = (z10 ? 1 : 0) | 4;
            }
            if (i3 == 0) {
                this.g = null;
                this.f = 0;
                return;
            }
            q1Var.v0 = org.telegram.messenger.g0.L(60.0f) + q1Var.v0;
            if (z13 != this.f) {
                this.f = 0;
                int y9 = org.telegram.messenger.camera.q.y(75.0f, q1Var.a7, i3);
                float N = (q1Var.a7 - org.telegram.messenger.g0.N(37.0f)) / i3;
                ArrayList arrayList = this.g;
                if (arrayList == null) {
                    this.g = new ArrayList(i3);
                } else {
                    arrayList.clear();
                }
                if (this.d) {
                    this.f |= 1;
                    this.g.add(q1.w0(5, bd.M0(2131743566, "ViewContact"), y9, N));
                }
                if (this.c) {
                    this.f |= 2;
                    this.g.add(q1.w0(30, bd.M0(2131745427, "SharedContactMessage"), y9, N));
                }
                if (this.e) {
                    this.f |= 4;
                    this.g.add(q1.w0(31, bd.M0(2131745428, "SharedContactAdd"), y9, N));
                }
            }
        }
    }

    public final void b(Canvas canvas) {
        float f10;
        boolean z10;
        boolean z11;
        float f11;
        gc gcVar;
        q1 q1Var = this.a;
        Drawable[] drawableArr = q1Var.I2;
        ei.c3 c3Var = q1Var.U0;
        if (q1Var.p8 == null) {
            q1Var.p8 = new dk0(q1Var);
        }
        int a10 = q1Var.p8.a(q1Var.P5, q1Var.ia, q1Var.ja, q1Var.Pb, 4);
        if (q1Var.Fa == null) {
            q1Var.Fa = new gc(q1Var, 2.0f, 2.0f);
        }
        int L = (int) (c3Var.L0 - org.telegram.messenger.g0.L(13.0f));
        int L2 = q1Var.d7 - org.telegram.messenger.g0.L(62.0f);
        dh.o0 o0Var = q1Var.O;
        if (!o0Var.p) {
            L2 -= o0Var.n;
        }
        if (q1Var.w7) {
            L2 -= org.telegram.messenger.g0.L(q1Var.D3() ? 39.3f : 41.0f);
        }
        int i3 = L2;
        if (q1Var.u2 == null) {
            q1Var.u2 = new RectF();
        }
        float backgroundDrawableRight = (q1Var.getBackgroundDrawableRight() - (org.telegram.messenger.g0.L(10.0f) + ((!q1Var.P5.Q3() || q1Var.B6 || q1Var.K) ? 0 : org.telegram.messenger.g0.L(6.0f)))) - q1Var.getExtraTextX();
        x1 x1Var = q1Var.hb;
        if (x1Var.x0) {
            backgroundDrawableRight += x1Var.i0;
        }
        q1Var.u2.set(L, c3Var.M0 - org.telegram.messenger.g0.L(9.0f), backgroundDrawableRight, org.telegram.messenger.g0.L(38.0f) + i3);
        float a11 = q1Var.Fa.a(0.0125f);
        boolean z12 = a11 != 1.0f;
        if (z12) {
            canvas.save();
            canvas.scale(a11, a11, q1Var.u2.centerX(), q1Var.u2.centerY());
        }
        Drawable drawable = drawableArr[0];
        if (drawable != null) {
            q1Var.K2[0] = 0;
            f10 = 2.0f;
            drawable.setBounds(L, (int) (c3Var.M0 - org.telegram.messenger.g0.L(9.0f)), (int) backgroundDrawableRight, org.telegram.messenger.g0.L(38.0f) + i3);
            if (q1Var.H2 != org.telegram.ui.ActionBar.k6.r1(0.1f, q1Var.p8.i())) {
                Drawable drawable2 = drawableArr[0];
                int r12 = org.telegram.ui.ActionBar.k6.r1(0.1f, q1Var.p8.i());
                q1Var.H2 = r12;
                org.telegram.ui.ActionBar.k6.H1(drawable2, r12, true);
            }
            drawableArr[0].draw(canvas);
        } else {
            f10 = 2.0f;
        }
        float floor = (float) Math.floor(az.Y0 / 3.0f);
        int i10 = (int) floor;
        float f12 = 1.0f;
        q1Var.p8.c(floor, floor, floor, 1.0f, canvas, q1Var.u2);
        q1Var.p8.f(canvas, q1Var.u2, 1.0f);
        org.telegram.ui.ActionBar.k6.R2.setColor(a10);
        org.telegram.ui.ActionBar.k6.S2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ud, q1Var.Pb));
        if (q1Var.P5.Q3()) {
            org.telegram.ui.ActionBar.k6.S2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Tc, q1Var.Pb));
        } else {
            org.telegram.ui.ActionBar.k6.S2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Sc, q1Var.Pb));
        }
        if (q1Var.n2 != null) {
            canvas.save();
            canvas.translate(c3Var.L0 + c3Var.N0 + org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(27.0f) + q1Var.Ta);
            yh.f.f(canvas, q1Var.n2);
            canvas.restore();
        }
        if (q1Var.d3 != null) {
            canvas.save();
            canvas.translate(c3Var.L0 + c3Var.N0 + org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(50.0f) + q1Var.Ta);
            yh.f.f(canvas, q1Var.d3);
            canvas.restore();
        }
        ArrayList arrayList = this.g;
        if (arrayList != null && arrayList.size() > 0) {
            org.telegram.ui.ActionBar.k6.M2.setColor(a10);
            org.telegram.ui.ActionBar.k6.Y1.setColor(org.telegram.ui.ActionBar.k6.r1(0.1f, a10));
            int alpha = org.telegram.ui.ActionBar.k6.M2.getAlpha();
            org.telegram.ui.ActionBar.k6.M2.setAlpha((int) (alpha * 0.18f));
            canvas.drawRect(q1Var.u2.left + org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(f10) + i3, q1Var.u2.right - org.telegram.messenger.g0.L(7.0f), Math.max(1, org.telegram.messenger.g0.L(0.66f)) + org.telegram.messenger.g0.L(f10) + i3, org.telegram.ui.ActionBar.k6.M2);
            org.telegram.ui.ActionBar.k6.M2.setAlpha(alpha);
            int L3 = org.telegram.messenger.g0.L(f10) + i3;
            float L4 = org.telegram.messenger.g0.L(3.0f) + L;
            ArrayList arrayList2 = this.g;
            boolean z13 = arrayList2 != null && arrayList2.size() > 1;
            int i11 = q1Var.p8.x;
            int i12 = 0;
            while (i12 < this.g.size()) {
                n1 n1Var = (n1) this.g.get(i12);
                float f13 = n1Var.b;
                RectF rectF = n1Var.e;
                float min = Math.min(f13 + L4, q1Var.u2.right);
                rectF.set(L4, L3, min, org.telegram.messenger.g0.L(36.0f) + L3);
                if (z13 && n1Var.g == null) {
                    q1Var.Qa = i11;
                    z10 = false;
                    y c02 = org.telegram.ui.ActionBar.k6.c0(i11, 0, 0, i12 == this.g.size() - 1 ? i10 : 0, 0);
                    n1Var.g = c02;
                    c02.setCallback(q1Var);
                } else {
                    z10 = false;
                }
                y yVar = n1Var.g;
                float f14 = f12;
                if (yVar != null) {
                    yVar.setBounds((int) L4, L3, (int) min, org.telegram.messenger.g0.L(36.0f) + L3);
                    n1Var.g.draw(canvas);
                }
                if (z12 || (gcVar = n1Var.f) == null) {
                    z11 = z10;
                    f11 = f14;
                } else {
                    f11 = gcVar.a(0.02f);
                    z11 = f11 != f14 ? true : z10;
                }
                if (z11) {
                    canvas.save();
                    canvas.scale(f11, f11, rectF.centerX(), rectF.centerY());
                }
                if (n1Var.d != null) {
                    canvas.save();
                    canvas.translate(n1Var.c + L4, org.telegram.messenger.g0.L(10.5f) + L3);
                    n1Var.d.draw(canvas);
                    canvas.restore();
                }
                if (z11) {
                    canvas.restore();
                }
                L4 += n1Var.b;
                i12++;
                f12 = f14;
            }
        }
        if (z12) {
            canvas.restore();
        }
    }
}
