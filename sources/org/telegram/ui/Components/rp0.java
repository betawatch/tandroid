package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class rp0 implements ah.n {
    public final /* synthetic */ int a;
    public final /* synthetic */ vl0 b;

    public /* synthetic */ rp0(vl0 vl0Var, int i10) {
        this.a = i10;
        this.b = vl0Var;
    }

    @Override // ah.n
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 0:
                return ((wp0) this.b).drawChild(canvas, view, j3);
            default:
                return ((bu0) this.b).drawChild(canvas, view, j3);
        }
    }
}
