package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.ic;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
        int i7;
        boolean z9;
        q1 q1Var = this.a;
        q1Var.B0(0);
        if (this.b) {
            boolean z10 = this.d;
            if (this.c) {
                boolean z11 = (z10 ? 1 : 0) | 2;
                i7 = (z10 ? 1 : 0) + 1;
                z9 = z11;
            } else {
                i7 = z10 ? 1 : 0;
                z9 = z10;
            }
            boolean z12 = z9;
            if (this.e) {
                i7++;
                z12 = (z9 ? 1 : 0) | 4;
            }
            if (i7 == 0) {
                this.g = null;
                this.f = 0;
                return;
            }
            q1Var.u0 = org.telegram.messenger.g0.L(60.0f) + q1Var.u0;
            if (z12 != this.f) {
                this.f = 0;
                int y10 = org.telegram.messenger.camera.q.y(75.0f, q1Var.a7, i7);
                float N = (q1Var.a7 - org.telegram.messenger.g0.N(37.0f)) / i7;
                ArrayList arrayList = this.g;
                if (arrayList == null) {
                    this.g = new ArrayList(i7);
                } else {
                    arrayList.clear();
                }
                if (this.d) {
                    this.f |= 1;
                    this.g.add(q1.x0(5, id.M0(2131743556, "ViewContact"), y10, N));
                }
                if (this.c) {
                    this.f |= 2;
                    this.g.add(q1.x0(30, id.M0(2131745417, "SharedContactMessage"), y10, N));
                }
                if (this.e) {
                    this.f |= 4;
                    this.g.add(q1.x0(31, id.M0(2131745418, "SharedContactAdd"), y10, N));
                }
            }
        }
    }

    public final void b(Canvas canvas) {
        float f10;
        boolean z9;
        boolean z10;
        float f11;
        ic icVar;
        q1 q1Var = this.a;
        Drawable[] drawableArr = q1Var.I2;
        di.z2 z2Var = q1Var.T0;
        if (q1Var.p8 == null) {
            q1Var.p8 = new ak0(q1Var);
        }
        int a10 = q1Var.p8.a(q1Var.P5, q1Var.ia, q1Var.ja, q1Var.Pb, 4);
        if (q1Var.Fa == null) {
            q1Var.Fa = new ic(q1Var, 2.0f, 2.0f);
        }
        int L = (int) (z2Var.K0 - org.telegram.messenger.g0.L(13.0f));
        int L2 = q1Var.d7 - org.telegram.messenger.g0.L(62.0f);
        ch.p0 p0Var = q1Var.N;
        if (!p0Var.p) {
            L2 -= p0Var.n;
        }
        if (q1Var.w7) {
            L2 -= org.telegram.messenger.g0.L(q1Var.F3() ? 39.3f : 41.0f);
        }
        int i7 = L2;
        if (q1Var.u2 == null) {
            q1Var.u2 = new RectF();
        }
        float backgroundDrawableRight = (q1Var.getBackgroundDrawableRight() - (org.telegram.messenger.g0.L(10.0f) + ((!q1Var.P5.P3() || q1Var.B6 || q1Var.J) ? 0 : org.telegram.messenger.g0.L(6.0f)))) - q1Var.getExtraTextX();
        x1 x1Var = q1Var.hb;
        if (x1Var.x0) {
            backgroundDrawableRight += x1Var.i0;
        }
        q1Var.u2.set(L, z2Var.L0 - org.telegram.messenger.g0.L(9.0f), backgroundDrawableRight, org.telegram.messenger.g0.L(38.0f) + i7);
        float a11 = q1Var.Fa.a(0.0125f);
        boolean z11 = a11 != 1.0f;
        if (z11) {
            canvas.save();
            canvas.scale(a11, a11, q1Var.u2.centerX(), q1Var.u2.centerY());
        }
        Drawable drawable = drawableArr[0];
        if (drawable != null) {
            q1Var.K2[0] = 0;
            f10 = 2.0f;
            drawable.setBounds(L, (int) (z2Var.L0 - org.telegram.messenger.g0.L(9.0f)), (int) backgroundDrawableRight, org.telegram.messenger.g0.L(38.0f) + i7);
            if (q1Var.H2 != org.telegram.ui.ActionBar.l6.r1(0.1f, q1Var.p8.i())) {
                Drawable drawable2 = drawableArr[0];
                int r12 = org.telegram.ui.ActionBar.l6.r1(0.1f, q1Var.p8.i());
                q1Var.H2 = r12;
                org.telegram.ui.ActionBar.l6.H1(drawable2, r12, true);
            }
            drawableArr[0].draw(canvas);
        } else {
            f10 = 2.0f;
        }
        float floor = (float) Math.floor(iz.Y0 / 3.0f);
        int i10 = (int) floor;
        float f12 = 1.0f;
        q1Var.p8.c(floor, floor, floor, 1.0f, canvas, q1Var.u2);
        q1Var.p8.f(canvas, q1Var.u2, 1.0f);
        org.telegram.ui.ActionBar.l6.R2.setColor(a10);
        org.telegram.ui.ActionBar.l6.S2.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ud, q1Var.Pb));
        if (q1Var.P5.P3()) {
            org.telegram.ui.ActionBar.l6.S2.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Tc, q1Var.Pb));
        } else {
            org.telegram.ui.ActionBar.l6.S2.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Sc, q1Var.Pb));
        }
        if (q1Var.n2 != null) {
            canvas.save();
            canvas.translate(z2Var.K0 + z2Var.M0 + org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(27.0f) + q1Var.Ta);
            xh.f.f(canvas, q1Var.n2);
            canvas.restore();
        }
        if (q1Var.d3 != null) {
            canvas.save();
            canvas.translate(z2Var.K0 + z2Var.M0 + org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(50.0f) + q1Var.Ta);
            xh.f.f(canvas, q1Var.d3);
            canvas.restore();
        }
        ArrayList arrayList = this.g;
        if (arrayList != null && arrayList.size() > 0) {
            org.telegram.ui.ActionBar.l6.M2.setColor(a10);
            org.telegram.ui.ActionBar.l6.Y1.setColor(org.telegram.ui.ActionBar.l6.r1(0.1f, a10));
            int alpha = org.telegram.ui.ActionBar.l6.M2.getAlpha();
            org.telegram.ui.ActionBar.l6.M2.setAlpha((int) (alpha * 0.18f));
            canvas.drawRect(q1Var.u2.left + org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(f10) + i7, q1Var.u2.right - org.telegram.messenger.g0.L(7.0f), Math.max(1, org.telegram.messenger.g0.L(0.66f)) + org.telegram.messenger.g0.L(f10) + i7, org.telegram.ui.ActionBar.l6.M2);
            org.telegram.ui.ActionBar.l6.M2.setAlpha(alpha);
            int L3 = org.telegram.messenger.g0.L(f10) + i7;
            float L4 = org.telegram.messenger.g0.L(3.0f) + L;
            ArrayList arrayList2 = this.g;
            boolean z12 = arrayList2 != null && arrayList2.size() > 1;
            int i11 = q1Var.p8.x;
            int i12 = 0;
            while (i12 < this.g.size()) {
                n1 n1Var = (n1) this.g.get(i12);
                float f13 = n1Var.b;
                RectF rectF = n1Var.e;
                float min = Math.min(f13 + L4, q1Var.u2.right);
                rectF.set(L4, L3, min, org.telegram.messenger.g0.L(36.0f) + L3);
                if (z12 && n1Var.g == null) {
                    q1Var.Qa = i11;
                    z9 = false;
                    y c02 = org.telegram.ui.ActionBar.l6.c0(i11, 0, 0, i12 == this.g.size() - 1 ? i10 : 0, 0);
                    n1Var.g = c02;
                    c02.setCallback(q1Var);
                } else {
                    z9 = false;
                }
                y yVar = n1Var.g;
                float f14 = f12;
                if (yVar != null) {
                    yVar.setBounds((int) L4, L3, (int) min, org.telegram.messenger.g0.L(36.0f) + L3);
                    n1Var.g.draw(canvas);
                }
                if (z11 || (icVar = n1Var.f) == null) {
                    z10 = z9;
                    f11 = f14;
                } else {
                    f11 = icVar.a(0.02f);
                    z10 = f11 != f14 ? true : z9;
                }
                if (z10) {
                    canvas.save();
                    canvas.scale(f11, f11, rectF.centerX(), rectF.centerY());
                }
                if (n1Var.d != null) {
                    canvas.save();
                    canvas.translate(n1Var.c + L4, org.telegram.messenger.g0.L(10.5f) + L3);
                    n1Var.d.draw(canvas);
                    canvas.restore();
                }
                if (z10) {
                    canvas.restore();
                }
                L4 += n1Var.b;
                i12++;
                f12 = f14;
            }
        }
        if (z11) {
            canvas.restore();
        }
    }
}
