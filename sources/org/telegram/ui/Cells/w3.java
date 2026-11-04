package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.Button;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w3 extends org.telegram.ui.Components.h6 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w3(Context context, boolean z10, boolean z11, boolean z12, int i3) {
        super(context, z10, z11, z12);
        this.s = i3;
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        switch (this.s) {
            case 0:
                return Button.class.getName();
            case 1:
                return Button.class.getName();
            default:
                return super.getAccessibilityClassName();
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        switch (this.s) {
            case 5:
                return Math.round((getHeight() - getDrawable().e) / 2.0f) - getPaint().getFontMetricsInt().ascent;
            default:
                return super.getBaseline();
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.s) {
            case 4:
                if (!dh.d0.b(this)) {
                    super.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.h6, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.s) {
            case 2:
                canvas.save();
                canvas.translate(org.telegram.messenger.g0.L(17.0f), 0.0f);
                super.onDraw(canvas);
                canvas.restore();
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.h6, android.view.View
    public void onMeasure(int i3, int i10) {
        switch (this.s) {
            case 3:
                super.onMeasure(i3, i10);
                setPivotX(getMeasuredWidth());
                break;
            case 4:
            default:
                super.onMeasure(i3, i10);
                break;
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.q.x, TLObject.FLAG_31), i10);
                setMeasuredDimension(View.resolveSize((int) Math.ceil(getDrawable().c()), i3), getMeasuredHeight());
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w3(Context context, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        super(context, z10, z11, z12, z13, z14);
        this.s = 5;
    }

    @Override // android.view.View
    public void invalidate(int i3, int i10, int i11, int i12) {
        switch (this.s) {
            case 4:
                if (!dh.d0.b(this)) {
                    super.invalidate(i3, i10, i11, i12);
                    break;
                }
                break;
            default:
                super.invalidate(i3, i10, i11, i12);
                break;
        }
    }
}
