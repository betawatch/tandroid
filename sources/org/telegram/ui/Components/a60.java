package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.TextureView;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class a60 extends TextureView {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a60(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View
    public void invalidate() {
        ki.r0 r0Var;
        switch (this.a) {
            case 0:
                d60 d60Var = (d60) this.b;
                if (!d60Var.A0 && (r0Var = d60Var.R) != null && r0Var.a == 3) {
                    d60Var.A0 = true;
                    try {
                        d60Var.y0 = SystemClock.elapsedRealtimeNanos();
                        d60Var.w();
                    } finally {
                        d60Var.A0 = false;
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
