package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ab implements ch.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ab(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // ch.a
    public final void e(bh.a aVar, RectF rectF) {
        switch (this.a) {
        }
        aVar.a = true;
    }

    @Override // ch.a
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.a) {
            case 0:
                ((xb) this.b).Z(canvas, rectF);
                break;
            case 1:
                eq0 eq0Var = (eq0) this.b;
                l0 l0Var = eq0Var.d;
                pp0 pp0Var = eq0Var.h.b;
                hh.d.a(pp0Var, canvas, rectF, pp0Var, l0Var);
                pp0 pp0Var2 = eq0Var.n.b;
                hh.d.a(pp0Var2, canvas, rectF, pp0Var2, l0Var);
                break;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                org.telegram.ui.Components.mm0 mm0Var = premiumPreviewFragment.a;
                hh.d.a(mm0Var, canvas, rectF, mm0Var, premiumPreviewFragment.d0);
                break;
        }
    }
}
