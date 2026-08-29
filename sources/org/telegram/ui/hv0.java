package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hv0 extends org.telegram.ui.Cells.s1 {
    public final /* synthetic */ int Be;
    public final /* synthetic */ int Ce;
    public final /* synthetic */ int De;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hv0(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, int i12, int i13) {
        super(context, i10, false, null, c6Var);
        this.Be = i13;
        this.Ce = i11;
        this.De = i12;
    }

    @Override // org.telegram.ui.Cells.s1
    public final void Y1(Canvas canvas) {
        switch (this.Be) {
            case 0:
                this.e6 = 0;
                this.f6 = this.U5.size() - 1;
                super.Y1(canvas);
                break;
            default:
                this.e6 = 0;
                this.f6 = this.U5.size() - 1;
                super.Y1(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.s1, android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.Be) {
            case 0:
                setMeasuredDimension(this.Ce, this.De);
                break;
            default:
                setMeasuredDimension(this.Ce, this.De);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.s1, android.view.View
    public final void setPressed(boolean z10) {
        int i10 = this.Be;
    }

    private final void A4(boolean z10) {
    }

    private final void B4(boolean z10) {
    }
}
