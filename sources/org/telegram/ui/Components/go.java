package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class go extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    public final /* synthetic */ int U;
    public Object V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ go(int i7, int i10, int i11, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i7, i10, context, e6Var);
        this.U = i11;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.U) {
            case 0:
                canvas.save();
                Path path = (Path) this.V;
                path.rewind();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                path.addRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            case 1:
                canvas.save();
                Path path2 = (Path) this.V;
                path2.rewind();
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                path2.addRoundRect(rectF2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), Path.Direction.CW);
                canvas.clipPath(path2);
                boolean drawChild2 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild2;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override // org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        int i11;
        switch (this.U) {
            case 2:
                m60 m60Var = (m60) this.V;
                if (this == m60Var.A && (i11 = m60Var.X) > 0) {
                    i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i11, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getMode(i10));
                }
                super.onMeasure(i7, i10);
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public go(m60 m60Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(R.drawable.popup_fixed_alert4, i7, context, e6Var);
        this.U = 2;
        this.V = m60Var;
    }
}
