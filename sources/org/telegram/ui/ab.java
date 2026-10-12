package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                gq0 gq0Var = (gq0) this.b;
                l0 l0Var = gq0Var.d;
                rp0 rp0Var = gq0Var.h.b;
                hh.d.a(rp0Var, canvas, rectF, rp0Var, l0Var);
                rp0 rp0Var2 = gq0Var.n.b;
                hh.d.a(rp0Var2, canvas, rectF, rp0Var2, l0Var);
                break;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                org.telegram.ui.Components.mm0 mm0Var = premiumPreviewFragment.a;
                hh.d.a(mm0Var, canvas, rectF, mm0Var, premiumPreviewFragment.d0);
                break;
        }
    }
}
