package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.qt0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w6 extends qt0 {
    public int g0;
    public final /* synthetic */ d7 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(d7 d7Var, Context context) {
        super(context, null);
        this.h0 = d7Var;
        this.g0 = -1;
    }

    @Override // org.telegram.ui.Components.qt0
    public final boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.qt0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.qt0
    public final void S() {
        this.h0.l1.invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.M) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.qt0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        d7 d7Var = this.h0;
        d7Var.b2.setTranslationY(((i12 - i10) - r4.getMeasuredHeight()) / 2.0f);
        d7Var.d2.h0(d7Var.d2.getY() + d7Var.b2.getY(), getBackgroundSizeY());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        if (this.g0 != -1) {
            super.onMeasure(i3, i10);
            int measuredHeight = getMeasuredHeight();
            int i11 = this.g0;
            if (measuredHeight < i11) {
                i10 = View.MeasureSpec.makeMeasureSpec(Math.max(i11, getMeasuredHeight()), TLObject.FLAG_31);
            }
        }
        super.onMeasure(i3, i10);
        int i12 = this.g0;
        if (i12 == -1) {
            this.g0 = Math.max(i12, getMeasuredHeight());
        }
    }
}
