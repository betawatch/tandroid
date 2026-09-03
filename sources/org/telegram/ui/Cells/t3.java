package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class t3 extends org.telegram.ui.Components.k6 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3(Context context, boolean z4, boolean z10, boolean z11, int i10) {
        super(context, z4, z10, z11);
        this.s = i10;
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
    public void invalidate() {
        switch (this.s) {
            case 4:
                if (!ng.g0.b(this)) {
                    super.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.k6, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.s) {
            case 2:
                canvas.save();
                canvas.translate(AndroidUtilities.dp(17.0f), 0.0f);
                super.onDraw(canvas);
                canvas.restore();
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.k6, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.s) {
            case 3:
                super.onMeasure(i10, i11);
                setPivotX(getMeasuredWidth());
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.s) {
            case 4:
                if (!ng.g0.b(this)) {
                    super.invalidate(i10, i11, i12, i13);
                    break;
                }
                break;
            default:
                super.invalidate(i10, i11, i12, i13);
                break;
        }
    }
}
