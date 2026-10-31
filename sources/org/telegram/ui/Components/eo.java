package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class eo extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public final /* synthetic */ int T;
    public Object U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eo(int i10, int i11, int i12, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(i10, i11, context, p6Var);
        this.T = i12;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.T) {
            case 0:
                canvas.save();
                Path path = (Path) this.U;
                path.rewind();
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                path.addRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            case 1:
                canvas.save();
                Path path2 = (Path) this.U;
                path2.rewind();
                RectF rectF2 = org.telegram.messenger.i0.P;
                rectF2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                path2.addRoundRect(rectF2, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild2;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        switch (this.T) {
            case 2:
                z60 z60Var = (z60) this.U;
                if (this == z60Var.A && (i12 = z60Var.X) > 0) {
                    i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), View.MeasureSpec.getMode(i11));
                }
                super.onMeasure(i10, i11);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo(z60 z60Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(R.drawable.popup_fixed_alert4, i10, context, p6Var);
        this.T = 2;
        this.U = z60Var;
    }
}
