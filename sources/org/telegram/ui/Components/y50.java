package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.TextureView;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class y50 extends TextureView {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y50(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View
    public void invalidate() {
        ki.q0 q0Var;
        switch (this.a) {
            case 0:
                b60 b60Var = (b60) this.b;
                if (!b60Var.x0 && (q0Var = b60Var.O) != null && q0Var.a == 3) {
                    b60Var.x0 = true;
                    try {
                        b60Var.v0 = SystemClock.elapsedRealtimeNanos();
                        b60Var.v();
                    } finally {
                        b60Var.x0 = false;
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
                vh.f fVar = (vh.f) this.b;
                setMeasuredDimension(fVar.g, fVar.h);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }
}
