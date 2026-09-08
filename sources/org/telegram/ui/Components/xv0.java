package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class xv0 extends s4.d0 {
    public final pr r;
    public int s;
    public float t;

    public xv0(Context context) {
        super(context);
        this.r = pr.f;
        this.t = 1.0f;
    }

    @Override // s4.d0, s4.y0
    public final void g(View view, s4.x0 x0Var) {
        int j3 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j3 * j3)));
        if (m10 > 0) {
            x0Var.b(-j3, -k10, m10, this.r);
        }
        AndroidUtilities.runOnUIThread(new jq0(this, 8), Math.max(0, m10));
    }

    @Override // s4.d0
    public final int k(int i10, View view) {
        return super.k(i10, view) - this.s;
    }

    @Override // s4.d0
    public final int m(int i10) {
        return Math.round(Math.min(super.m(i10), 500) * this.t);
    }

    @Override // s4.d0
    public final int n(int i10) {
        return Math.round(Math.min(super.n(i10), ImageReceiver.DEFAULT_CROSSFADE_DURATION) * this.t);
    }

    @Override // s4.d0
    public final void q(s4.x0 x0Var) {
        PointF a2 = a(this.a);
        if (a2 == null || (a2.x == 0.0f && a2.y == 0.0f)) {
            x0Var.d = this.a;
            h();
            return;
        }
        s4.y0.b(a2);
        this.k = a2;
        this.o = (int) (a2.x * 10000.0f);
        this.p = (int) (a2.y * 10000.0f);
        x0Var.b((int) (this.o * 1.2f), (int) (this.p * 1.2f), (int) (n(10000) * 1.2f), this.r);
    }
}
