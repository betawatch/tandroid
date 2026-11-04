package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class zt0 extends u4.c0 {
    public final xq r;
    public int s;
    public float t;

    public zt0(Context context) {
        super(context);
        this.r = xq.f;
        this.t = 1.0f;
    }

    @Override // u4.c0, u4.z0
    public final void g(View view, u4.y0 y0Var) {
        int j10 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j10 * j10)));
        if (m10 > 0) {
            y0Var.b(-j10, -k10, m10, this.r);
        }
        org.telegram.messenger.g0.i3(new sp0(this, 7), Math.max(0, m10));
    }

    @Override // u4.c0
    public final int k(int i3, View view) {
        return super.k(i3, view) - this.s;
    }

    @Override // u4.c0
    public final int m(int i3) {
        return Math.round(Math.min(super.m(i3), 500) * this.t);
    }

    @Override // u4.c0
    public final int n(int i3) {
        return Math.round(Math.min(super.n(i3), org.telegram.messenger.hs.g2) * this.t);
    }

    @Override // u4.c0
    public final void q(u4.y0 y0Var) {
        PointF a10 = a(this.a);
        if (a10 == null || (a10.x == 0.0f && a10.y == 0.0f)) {
            y0Var.d = this.a;
            h();
            return;
        }
        u4.z0.b(a10);
        this.k = a10;
        this.o = (int) (a10.x * 10000.0f);
        this.p = (int) (a10.y * 10000.0f);
        y0Var.b((int) (this.o * 1.2f), (int) (this.p * 1.2f), (int) (n(10000) * 1.2f), this.r);
    }
}
