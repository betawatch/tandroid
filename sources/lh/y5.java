package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.pv0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class y5 extends pv0 {
    public int t0;
    public final /* synthetic */ e6 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(e6 e6Var, Context context) {
        super(context, null);
        this.u0 = e6Var;
        this.t0 = -1;
    }

    @Override // org.telegram.ui.Components.pv0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.pv0
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Components.pv0
    public final void T() {
        this.u0.d.invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.I) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.pv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        e6 e6Var = this.u0;
        e6Var.f0.setTranslationY(((i13 - i11) - r4.getMeasuredHeight()) / 2.0f);
        e6Var.h0.W(e6Var.h0.getY() + e6Var.f0.getY(), getBackgroundSizeY());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.t0 != -1) {
            super.onMeasure(i10, i11);
            int measuredHeight = getMeasuredHeight();
            int i12 = this.t0;
            if (measuredHeight < i12) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max(i12, getMeasuredHeight()), TLObject.FLAG_31);
            }
        }
        super.onMeasure(i10, i11);
        int i13 = this.t0;
        if (i13 == -1) {
            this.t0 = Math.max(i13, getMeasuredHeight());
        }
    }
}
