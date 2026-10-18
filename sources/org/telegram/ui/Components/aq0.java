package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                return ((fq0) this.b).drawChild(canvas, view, j10);
            default:
                return ((ku0) this.b).drawChild(canvas, view, j10);
        }
    }
}
