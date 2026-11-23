package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class lu0 extends v4.d0 {
    public final kr r;
    public int s;
    public float t;

    public lu0(Context context) {
        super(context);
        this.r = kr.f;
        this.t = 1.0f;
    }

    @Override // v4.d0, v4.b1
    public final void g(View view, v4.a1 a1Var) {
        int j3 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j3 * j3)));
        if (m10 > 0) {
            a1Var.b(-j3, -k10, m10, this.r);
        }
        org.telegram.messenger.g0.h3(new bp0(this, 8), Math.max(0, m10));
    }

    @Override // v4.d0
    public final int k(int i7, View view) {
        return super.k(i7, view) - this.s;
    }

    @Override // v4.d0
    public final int m(int i7) {
        return Math.round(Math.min(super.m(i7), 500) * this.t);
    }

    @Override // v4.d0
    public final int n(int i7) {
        return Math.round(Math.min(super.n(i7), org.telegram.messenger.ks.g2) * this.t);
    }

    @Override // v4.d0
    public final void q(v4.a1 a1Var) {
        PointF a10 = a(this.a);
        if (a10 == null || (a10.x == 0.0f && a10.y == 0.0f)) {
            a1Var.d = this.a;
            h();
            return;
        }
        v4.b1.b(a10);
        this.k = a10;
        this.o = (int) (a10.x * 10000.0f);
        this.p = (int) (a10.y * 10000.0f);
        a1Var.b((int) (this.o * 1.2f), (int) (this.p * 1.2f), (int) (n(10000) * 1.2f), this.r);
    }
}
