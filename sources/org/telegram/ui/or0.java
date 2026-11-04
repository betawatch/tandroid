package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class or0 extends org.telegram.ui.Cells.q1 {
    public final /* synthetic */ int kd;
    public final /* synthetic */ int ld;
    public final /* synthetic */ int md;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ or0(Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var, int i10, int i11, int i12) {
        super(context, i3, false, null, e6Var);
        this.kd = i12;
        this.ld = i10;
        this.md = i11;
    }

    @Override // org.telegram.ui.Cells.q1
    public final void j1(Canvas canvas) {
        switch (this.kd) {
            case 0:
                this.R4 = 0;
                this.S4 = this.P4.size() - 1;
                super.j1(canvas);
                break;
            default:
                this.R4 = 0;
                this.S4 = this.P4.size() - 1;
                super.j1(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void onMeasure(int i3, int i10) {
        switch (this.kd) {
            case 0:
                setMeasuredDimension(this.ld, this.md);
                break;
            default:
                setMeasuredDimension(this.ld, this.md);
                break;
        }
    }

    @Override // org.telegram.ui.Cells.q1, android.view.View
    public final void setPressed(boolean z10) {
        int i3 = this.kd;
    }

    private final void b4(boolean z10) {
    }

    private final void c4(boolean z10) {
    }
}
