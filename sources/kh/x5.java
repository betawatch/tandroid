package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.qv0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class x5 extends qv0 {
    public int t0;
    public final /* synthetic */ d6 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(d6 d6Var, Context context) {
        super(context, null);
        this.u0 = d6Var;
        this.t0 = -1;
    }

    @Override // org.telegram.ui.Components.qv0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.qv0
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Components.qv0
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

    @Override // org.telegram.ui.Components.qv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        d6 d6Var = this.u0;
        d6Var.f0.setTranslationY(((i13 - i11) - r4.getMeasuredHeight()) / 2.0f);
        d6Var.h0.W(d6Var.h0.getY() + d6Var.f0.getY(), getBackgroundSizeY());
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
