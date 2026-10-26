package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class ex0 extends s4.d0 {
    public final ds r;
    public int s;
    public float t;

    public ex0(Context context) {
        super(context);
        this.r = ds.f;
        this.t = 1.0f;
    }

    @Override // s4.d0, s4.a1
    public final void g(View view, s4.z0 z0Var) {
        int j10 = j(o(), view);
        int k10 = k(p(), view);
        int m10 = m((int) Math.sqrt((k10 * k10) + (j10 * j10)));
        if (m10 > 0) {
            z0Var.b(-j10, -k10, m10, this.r);
        }
        AndroidUtilities.runOnUIThread(new mp0(this, 13), Math.max(0, m10));
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
    public final void q(s4.z0 z0Var) {
        PointF a2 = a(this.a);
        if (a2 == null || (a2.x == 0.0f && a2.y == 0.0f)) {
            z0Var.d = this.a;
            h();
            return;
        }
        s4.a1.b(a2);
        this.k = a2;
        this.o = (int) (a2.x * 10000.0f);
        this.p = (int) (a2.y * 10000.0f);
        z0Var.b((int) (this.o * 1.2f), (int) (this.p * 1.2f), (int) (n(10000) * 1.2f), this.r);
    }
}
