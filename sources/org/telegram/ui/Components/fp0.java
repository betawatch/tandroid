package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fp0 implements ah.n {
    public final /* synthetic */ int a;
    public final /* synthetic */ ml0 b;

    public /* synthetic */ fp0(ml0 ml0Var, int i10) {
        this.a = i10;
        this.b = ml0Var;
    }

    @Override // ah.n
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.a) {
            case 0:
                return ((kp0) this.b).drawChild(canvas, view, j3);
            default:
                return ((rt0) this.b).drawChild(canvas, view, j3);
        }
    }
}
