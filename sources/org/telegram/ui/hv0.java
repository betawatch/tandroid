package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class hv0 extends org.telegram.ui.Cells.t1 {
    public final /* synthetic */ int Be;
    public final /* synthetic */ int Ce;
    public final /* synthetic */ int De;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hv0(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var, int i10, int i11, int i12) {
        super(context, i9, false, null, b6Var);
        this.Be = i12;
        this.Ce = i10;
        this.De = i11;
    }

    @Override // org.telegram.ui.Cells.t1
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

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final void onMeasure(int i9, int i10) {
        switch (this.Be) {
            case 0:
                setMeasuredDimension(this.Ce, this.De);
                break;
            default:
                setMeasuredDimension(this.Ce, this.De);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final void setPressed(boolean z10) {
        int i9 = this.Be;
    }

    private final void A4(boolean z10) {
    }

    private final void B4(boolean z10) {
    }
}
