package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class zv0 extends f2.j0 {
    public final mr r;
    public int s;
    public float t;

    public zv0(Context context) {
        super(context);
        this.r = mr.f;
        this.t = 1.0f;
    }

    @Override // f2.j0, f2.h1
    public final void g(View view, f2.g1 g1Var) {
        int j10 = j(o(), view);
        int k10 = k(p(), view);
        int m9 = m((int) Math.sqrt((k10 * k10) + (j10 * j10)));
        if (m9 > 0) {
            g1Var.b(-j10, -k10, m9, this.r);
        }
        AndroidUtilities.runOnUIThread(new nq0(this, 8), Math.max(0, m9));
    }

    @Override // f2.j0
    public final int k(int i10, View view) {
        return super.k(i10, view) - this.s;
    }

    @Override // f2.j0
    public final int m(int i10) {
        return Math.round(Math.min(super.m(i10), 500) * this.t);
    }

    @Override // f2.j0
    public final int n(int i10) {
        return Math.round(Math.min(super.n(i10), ImageReceiver.DEFAULT_CROSSFADE_DURATION) * this.t);
    }

    @Override // f2.j0
    public final void q(f2.g1 g1Var) {
        PointF a2 = a(this.a);
        if (a2 == null || (a2.x == 0.0f && a2.y == 0.0f)) {
            g1Var.d = this.a;
            h();
            return;
        }
        f2.h1.b(a2);
        this.k = a2;
        this.o = (int) (a2.x * 10000.0f);
        this.p = (int) (a2.y * 10000.0f);
        g1Var.b((int) (this.o * 1.2f), (int) (this.p * 1.2f), (int) (n(10000) * 1.2f), this.r);
    }
}
