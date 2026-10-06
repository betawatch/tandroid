package org.telegram.ui.Components;

import android.content.Context;
import android.os.SystemClock;
import android.view.TextureView;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class b60 extends TextureView {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b60(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View
    public void invalidate() {
        ki.r0 r0Var;
        switch (this.a) {
            case 0:
                e60 e60Var = (e60) this.b;
                if (!e60Var.A0 && (r0Var = e60Var.R) != null && r0Var.a == 3) {
                    e60Var.A0 = true;
                    try {
                        e60Var.y0 = SystemClock.elapsedRealtimeNanos();
                        e60Var.w();
                    } finally {
                        e60Var.A0 = false;
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
