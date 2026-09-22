package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class tp0 implements ah.n {
    public final /* synthetic */ int a;
    public final /* synthetic */ yl0 b;

    public /* synthetic */ tp0(yl0 yl0Var, int i10) {
        this.a = i10;
        this.b = yl0Var;
    }

    @Override // ah.n
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 0:
                return ((yp0) this.b).drawChild(canvas, view, j3);
            default:
                return ((du0) this.b).drawChild(canvas, view, j3);
        }
    }
}
