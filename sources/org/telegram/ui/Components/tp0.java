package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
