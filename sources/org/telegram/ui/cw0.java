package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class cw0 extends org.telegram.ui.Cells.u1 {
    public final /* synthetic */ int Ge;
    public final /* synthetic */ int He;
    public final /* synthetic */ int Ie;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cw0(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11, int i12, int i13) {
        super(context, i10, false, null, d6Var);
        this.Ge = i13;
        this.He = i11;
        this.Ie = i12;
    }

    @Override // org.telegram.ui.Cells.u1
    public final void Y1(Canvas canvas) {
        switch (this.Ge) {
            case 0:
                this.i6 = 0;
                this.j6 = this.Y5.size() - 1;
                super.Y1(canvas);
                break;
            default:
                this.i6 = 0;
                this.j6 = this.Y5.size() - 1;
                super.Y1(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.u1, android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.Ge) {
            case 0:
                setMeasuredDimension(this.He, this.Ie);
                break;
            default:
                setMeasuredDimension(this.He, this.Ie);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.u1, android.view.View
    public final void setPressed(boolean z10) {
        int i10 = this.Ge;
    }

    private final void A4(boolean z10) {
    }

    private final void B4(boolean z10) {
    }
}
