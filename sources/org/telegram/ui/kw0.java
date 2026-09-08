package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class kw0 extends org.telegram.ui.Cells.t1 {
    public final /* synthetic */ int Fe;
    public final /* synthetic */ int Ge;
    public final /* synthetic */ int He;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kw0(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11, int i12, int i13) {
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
