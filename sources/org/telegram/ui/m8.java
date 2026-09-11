package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class m8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;

    public /* synthetic */ m8(int i10, boolean[] zArr) {
        this.a = i10;
        this.b = zArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                boolean z10 = !zArr[0];
                zArr[0] = z10;
                ((org.telegram.ui.Cells.z1) view).c(z10, true);
                break;
            case 1:
                boolean[] zArr2 = this.b;
                boolean z11 = !zArr2[1];
                zArr2[1] = z11;
                ((org.telegram.ui.Cells.z1) view).c(z11, true);
                break;
            case 2:
                boolean[] zArr3 = this.b;
                boolean z12 = !zArr3[0];
                zArr3[0] = z12;
                ((org.telegram.ui.Cells.z1) view).c(z12, true);
                break;
            case 3:
                boolean[] zArr4 = this.b;
                boolean z13 = !zArr4[0];
                zArr4[0] = z13;
                ((org.telegram.ui.Cells.z1) view).c(z13, true);
                break;
            case 4:
                if (view.isEnabled()) {
                    boolean[] zArr5 = this.b;
                    boolean z14 = !zArr5[0];
                    zArr5[0] = z14;
                    ((org.telegram.ui.Cells.z1) view).c(z14, true);
                    break;
                }
                break;
            case 5:
                boolean[] zArr6 = this.b;
                boolean z15 = !zArr6[0];
                zArr6[0] = z15;
                ((org.telegram.ui.Cells.z1) view).c(z15, true);
                break;
            default:
                if (view.isEnabled()) {
                    boolean[] zArr7 = this.b;
                    boolean z16 = !zArr7[0];
                    zArr7[0] = z16;
                    ((org.telegram.ui.Cells.z1) view).c(z16, true);
                    break;
                }
                break;
        }
    }
}
