package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.Button;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u3 extends org.telegram.ui.Components.j6 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u3(Context context, boolean z10, boolean z11, boolean z12, int i9) {
        super(context, z10, z11, z12);
        this.s = i9;
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
                if (!hg.h0.b(this)) {
                    super.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.j6, android.view.View
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

    @Override // org.telegram.ui.Components.j6, android.view.View
    public void onMeasure(int i9, int i10) {
        switch (this.s) {
            case 3:
                super.onMeasure(i9, i10);
                setPivotX(getMeasuredWidth());
                break;
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }

    @Override // android.view.View
    public void invalidate(int i9, int i10, int i11, int i12) {
        switch (this.s) {
            case 4:
                if (!hg.h0.b(this)) {
                    super.invalidate(i9, i10, i11, i12);
                    break;
                }
                break;
            default:
                super.invalidate(i9, i10, i11, i12);
                break;
        }
    }
}
