package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class aq0 implements bh.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ im0 b;

    public /* synthetic */ aq0(im0 im0Var, int i10) {
        this.a = i10;
        this.b = im0Var;
    }

    @Override // bh.k
    public final boolean a(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 0:
                return ((gq0) this.b).drawChild(canvas, view, j10);
            default:
                return ((lu0) this.b).drawChild(canvas, view, j10);
        }
    }
}
