package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.TextureView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class l60 extends TextureView {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l60(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View
    public void invalidate() {
        vi.t0 t0Var;
        switch (this.a) {
            case 0:
                o60 o60Var = (o60) this.b;
                if (!o60Var.H0 && (t0Var = o60Var.Q) != null && t0Var.a == 3) {
                    o60Var.H0 = true;
                    try {
                        o60Var.F0 = SystemClock.elapsedRealtimeNanos();
                        o60Var.D();
                    } finally {
                        o60Var.H0 = false;
                    }
                }
                super.invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 1:
                xh.f fVar = (xh.f) this.b;
                setMeasuredDimension(fVar.g, fVar.h);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }
}
