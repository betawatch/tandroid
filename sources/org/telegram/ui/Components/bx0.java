package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class bx0 extends s4.e0 {
    public final hs r;
    public int s;
    public float t;

    public bx0(Context context) {
        super(context);
        this.r = hs.f;
        this.t = 1.0f;
    }

    @Override // s4.e0, s4.z0
    public final void g(View view, s4.y0 y0Var) {
        int j3 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j3 * j3)));
        if (m10 > 0) {
            y0Var.b(-j3, -k10, m10, this.r);
        }
        AndroidUtilities.runOnUIThread(new or0(this, 8), Math.max(0, m10));
    }

    @Override // s4.e0
    public final int k(int i10, View view) {
        return super.k(i10, view) - this.s;
    }

    @Override // s4.e0
    public final int m(int i10) {
        return Math.round(Math.min(super.m(i10), 500) * this.t);
    }

    @Override // s4.e0
    public final int n(int i10) {
        return Math.round(Math.min(super.n(i10), ImageReceiver.DEFAULT_CROSSFADE_DURATION) * this.t);
    }

    @Override // s4.e0
    public final void q(s4.y0 y0Var) {
        PointF a2 = a(this.a);
        if (a2 == null || (a2.x == 0.0f && a2.y == 0.0f)) {
            y0Var.d = this.a;
            h();
            return;
        }
        s4.z0.b(a2);
        this.k = a2;
        this.o = (int) (a2.x * 10000.0f);
        this.p = (int) (a2.y * 10000.0f);
        y0Var.b((int) (this.o * 1.2f), (int) (this.p * 1.2f), (int) (n(10000) * 1.2f), this.r);
    }
}
