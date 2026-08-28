package fh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.xu0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o6 extends xu0 {
    public int s0;
    public final /* synthetic */ u6 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(u6 u6Var, Context context) {
        super(context, null);
        this.t0 = u6Var;
        this.s0 = -1;
    }

    @Override // org.telegram.ui.Components.xu0
    public final boolean P() {
        return false;
    }

    @Override // org.telegram.ui.Components.xu0
    public final boolean Q() {
        return false;
    }

    @Override // org.telegram.ui.Components.xu0
    public final void T() {
        this.t0.d.invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.H) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.xu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        u6 u6Var = this.t0;
        u6Var.e0.setTranslationY(((i12 - i10) - r4.getMeasuredHeight()) / 2.0f);
        u6Var.g0.V(u6Var.g0.getY() + u6Var.e0.getY(), getBackgroundSizeY());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        if (this.s0 != -1) {
            super.onMeasure(i9, i10);
            int measuredHeight = getMeasuredHeight();
            int i11 = this.s0;
            if (measuredHeight < i11) {
                i10 = View.MeasureSpec.makeMeasureSpec(Math.max(i11, getMeasuredHeight()), TLObject.FLAG_31);
            }
        }
        super.onMeasure(i9, i10);
        int i12 = this.s0;
        if (i12 == -1) {
            this.s0 = Math.max(i12, getMeasuredHeight());
        }
    }
}
