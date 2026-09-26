package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
