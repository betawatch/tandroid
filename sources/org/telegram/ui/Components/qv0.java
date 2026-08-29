package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class qv0 extends f2.k0 {
    public final jr r;
    public int s;
    public float t;

    public qv0(Context context) {
        super(context);
        this.r = jr.f;
        this.t = 1.0f;
    }

    @Override // f2.k0, f2.j1
    public final void g(View view, f2.i1 i1Var) {
        int j10 = j(o(), view);
        int k9 = k(p(), view);
        int m10 = m((int) Math.sqrt((k9 * k9) + (j10 * j10)));
        if (m10 > 0) {
            i1Var.b(-j10, -k9, m10, this.r);
        }
        AndroidUtilities.runOnUIThread(new fq0(this, 8), Math.max(0, m10));
    }

    @Override // f2.k0
    public final int k(int i10, View view) {
        return super.k(i10, view) - this.s;
    }

    @Override // f2.k0
    public final int m(int i10) {
        return Math.round(Math.min(super.m(i10), 500) * this.t);
    }

    @Override // f2.k0
    public final int n(int i10) {
        return Math.round(Math.min(super.n(i10), ImageReceiver.DEFAULT_CROSSFADE_DURATION) * this.t);
    }

    @Override // f2.k0
    public final void q(f2.i1 i1Var) {
        PointF a2 = a(this.a);
        if (a2 == null || (a2.x == 0.0f && a2.y == 0.0f)) {
            i1Var.d = this.a;
            h();
            return;
        }
        f2.j1.b(a2);
        this.k = a2;
        this.o = (int) (a2.x * 10000.0f);
        this.p = (int) (a2.y * 10000.0f);
        i1Var.b((int) (this.o * 1.2f), (int) (this.p * 1.2f), (int) (n(10000) * 1.2f), this.r);
    }
}
