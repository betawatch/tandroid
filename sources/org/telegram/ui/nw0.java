package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class nw0 extends org.telegram.ui.Cells.t1 {
    public final /* synthetic */ int Fe;
    public final /* synthetic */ int Ge;
    public final /* synthetic */ int He;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nw0(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11, int i12, int i13) {
        super(context, i10, false, null, f6Var);
        this.Fe = i13;
        this.Ge = i11;
        this.He = i12;
    }

    @Override // org.telegram.ui.Cells.t1
    public final void Y1(Canvas canvas) {
        switch (this.Fe) {
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

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.Fe) {
            case 0:
                setMeasuredDimension(this.Ge, this.He);
                break;
            default:
                setMeasuredDimension(this.Ge, this.He);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.t1, android.view.View
    public final void setPressed(boolean z10) {
        int i10 = this.Fe;
    }

    private final void A4(boolean z10) {
    }

    private final void B4(boolean z10) {
    }
}
