package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rp0 implements ah.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ wl0 b;

    public /* synthetic */ rp0(wl0 wl0Var, int i10) {
        this.a = i10;
        this.b = wl0Var;
    }

    @Override // ah.m
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 0:
                return ((wp0) this.b).drawChild(canvas, view, j3);
            default:
                return ((bu0) this.b).drawChild(canvas, view, j3);
        }
    }
}
