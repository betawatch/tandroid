package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tp0 implements ah.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ yl0 b;

    public /* synthetic */ tp0(yl0 yl0Var, int i10) {
        this.a = i10;
        this.b = yl0Var;
    }

    @Override // ah.m
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 0:
                return ((yp0) this.b).drawChild(canvas, view, j3);
            default:
                return ((du0) this.b).drawChild(canvas, view, j3);
        }
    }
}
