package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ep0 implements ah.m {
    public final /* synthetic */ int a;
    public final /* synthetic */ ll0 b;

    public /* synthetic */ ep0(ll0 ll0Var, int i10) {
        this.a = i10;
        this.b = ll0Var;
    }

    @Override // ah.m
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 0:
                return ((jp0) this.b).drawChild(canvas, view, j3);
            default:
                return ((qt0) this.b).drawChild(canvas, view, j3);
        }
    }
}
