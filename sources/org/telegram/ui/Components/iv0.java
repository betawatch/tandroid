package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class iv0 extends f2.l0 {
    public final er r;
    public int s;
    public float t;

    public iv0(Context context) {
        super(context);
        this.r = er.f;
        this.t = 1.0f;
    }

    @Override // f2.l0, f2.k1
    public final void g(View view, f2.j1 j1Var) {
        int j10 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j10 * j10)));
        if (m10 > 0) {
            j1Var.b(-j10, -k10, m10, this.r);
        }
        AndroidUtilities.runOnUIThread(new up0(this, 8), Math.max(0, m10));
    }

    @Override // f2.l0
    public final int k(int i10, View view) {
        return super.k(i10, view) - this.s;
    }

    @Override // f2.l0
    public final int m(int i10) {
        return Math.round(Math.min(super.m(i10), 500) * this.t);
    }

    @Override // f2.l0
    public final int n(int i10) {
        return Math.round(Math.min(super.n(i10), ImageReceiver.DEFAULT_CROSSFADE_DURATION) * this.t);
    }

    @Override // f2.l0
    public final void q(f2.j1 j1Var) {
        PointF a2 = a(this.a);
        if (a2 == null || (a2.x == 0.0f && a2.y == 0.0f)) {
            j1Var.d = this.a;
            h();
            return;
        }
        f2.k1.b(a2);
        this.k = a2;
        this.o = (int) (a2.x * 10000.0f);
        this.p = (int) (a2.y * 10000.0f);
        j1Var.b((int) (this.o * 1.2f), (int) (this.p * 1.2f), (int) (n(10000) * 1.2f), this.r);
    }
}
