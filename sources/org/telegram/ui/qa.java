package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qa implements mg.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qa(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // mg.a
    public final void e(Canvas canvas, RectF rectF) {
        switch (this.a) {
            case 0:
                ((lb) this.b).Z(canvas, rectF);
                break;
            default:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                org.telegram.ui.Components.jl0 jl0Var = premiumPreviewFragment.a;
                rg.c.b(jl0Var, canvas, rectF, jl0Var, premiumPreviewFragment.Z);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // mg.a
    public final void g(g.x xVar, RectF rectF) {
        switch (this.a) {
        }
        xVar.b = true;
    }
}
