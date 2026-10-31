package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jt0 extends org.telegram.ui.Cells.q1 {
    public final /* synthetic */ int hd;
    public final /* synthetic */ int id;
    public final /* synthetic */ int jd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jt0(Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var, int i11, int i12, int i13) {
        super(context, i10, false, null, p6Var);
        this.hd = i13;
        this.id = i11;
        this.jd = i12;
    }

    @Override // org.telegram.ui.Cells.q1
    public final void h1(Canvas canvas) {
        switch (this.hd) {
            case 0:
                this.Q4 = 0;
                this.R4 = this.O4.size() - 1;
                super.h1(canvas);
                break;
            default:
                this.Q4 = 0;
                this.R4 = this.O4.size() - 1;
                super.h1(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.hd) {
            case 0:
                setMeasuredDimension(this.id, this.jd);
                break;
            default:
                setMeasuredDimension(this.id, this.jd);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void setPressed(boolean z10) {
        int i10 = this.hd;
    }

    private final void Z3(boolean z10) {
    }

    private final void a4(boolean z10) {
    }
}
