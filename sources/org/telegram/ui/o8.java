package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;

    public /* synthetic */ o8(int i10, boolean[] zArr) {
        this.a = i10;
        this.b = zArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                boolean z4 = !zArr[0];
                zArr[0] = z4;
                ((org.telegram.ui.Cells.z1) view).c(z4, true);
                break;
            case 1:
                boolean[] zArr2 = this.b;
                boolean z10 = !zArr2[1];
                zArr2[1] = z10;
                ((org.telegram.ui.Cells.z1) view).c(z10, true);
                break;
            case 2:
                boolean[] zArr3 = this.b;
                boolean z11 = !zArr3[0];
                zArr3[0] = z11;
                ((org.telegram.ui.Cells.z1) view).c(z11, true);
                break;
            case 3:
                boolean[] zArr4 = this.b;
                boolean z12 = !zArr4[0];
                zArr4[0] = z12;
                ((org.telegram.ui.Cells.z1) view).c(z12, true);
                break;
            case 4:
                if (view.isEnabled()) {
                    boolean[] zArr5 = this.b;
                    boolean z13 = !zArr5[0];
                    zArr5[0] = z13;
                    ((org.telegram.ui.Cells.z1) view).c(z13, true);
                    break;
                }
                break;
            case 5:
                boolean[] zArr6 = this.b;
                boolean z14 = !zArr6[0];
                zArr6[0] = z14;
                ((org.telegram.ui.Cells.z1) view).c(z14, true);
                break;
            default:
                if (view.isEnabled()) {
                    boolean[] zArr7 = this.b;
                    boolean z15 = !zArr7[0];
                    zArr7[0] = z15;
                    ((org.telegram.ui.Cells.z1) view).c(z15, true);
                    break;
                }
                break;
        }
    }
}
