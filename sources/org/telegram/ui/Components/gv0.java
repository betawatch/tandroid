package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class gv0 extends f2.n0 {
    public final gr r;
    public int s;
    public float t;

    public gv0(Context context) {
        super(context);
        this.r = gr.f;
        this.t = 1.0f;
    }

    @Override // f2.n0, f2.m1
    public final void g(View view, f2.l1 l1Var) {
        int j10 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j10 * j10)));
        if (m10 > 0) {
            l1Var.b(-j10, -k10, m10, this.r);
        }
        AndroidUtilities.runOnUIThread(new tp0(this, 8), Math.max(0, m10));
    }

    @Override // f2.n0
    public final int k(int i9, View view) {
        return super.k(i9, view) - this.s;
    }

    @Override // f2.n0
    public final int m(int i9) {
        return Math.round(Math.min(super.m(i9), 500) * this.t);
    }

    @Override // f2.n0
    public final int n(int i9) {
        return Math.round(Math.min(super.n(i9), ImageReceiver.DEFAULT_CROSSFADE_DURATION) * this.t);
    }

    @Override // f2.n0
    public final void q(f2.l1 l1Var) {
        PointF a2 = a(this.a);
        if (a2 == null || (a2.x == 0.0f && a2.y == 0.0f)) {
            l1Var.d = this.a;
            h();
            return;
        }
        f2.m1.b(a2);
        this.k = a2;
        this.o = (int) (a2.x * 10000.0f);
        this.p = (int) (a2.y * 10000.0f);
        l1Var.b((int) (this.o * 1.2f), (int) (this.p * 1.2f), (int) (n(10000) * 1.2f), this.r);
    }
}
