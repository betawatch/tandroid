package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;

    public /* synthetic */ b(e0 e0Var, int i10) {
        this.a = i10;
        this.b = e0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            case 1:
                e0 e0Var = this.b;
                org.telegram.ui.Cells.j3 j3Var = e0Var.A0;
                AndroidUtilities.hideKeyboard(j3Var.b);
                e0Var.I0 = j3Var.getText().toString();
                e0Var.q0();
                e0Var.p0(true);
                e0Var.k0();
                break;
            case 2:
                e0 e0Var2 = this.b;
                if (e0Var2.k0 != null) {
                    TL_iv.RichMessage g02 = e0Var2.g0();
                    if (g02 != null) {
                        e0Var2.k0.run(g02);
                    }
                } else if (e0Var2.j0 != null && e0Var2.h0() != null) {
                    e0Var2.j0.run(e0Var2.h0());
                }
                e0Var2.dismiss();
                break;
            case 3:
                this.b.dismiss();
                break;
            case 4:
                e0 e0Var3 = this.b;
                e0Var3.P0 = false;
                e0Var3.J();
                e0Var3.O0.N(true);
                e0Var3.s();
                break;
            case 5:
                e0.Y(this.b, view);
                break;
            case 6:
                e0.R(this.b, view);
                break;
            case 7:
                e0 e0Var4 = this.b;
                if (!e0Var4.R0) {
                    AndroidUtilities.addToClipboard(e0Var4.h0());
                    break;
                }
                break;
            case 8:
                this.b.dismiss();
                break;
            default:
                e0 e0Var5 = this.b;
                e0Var5.l0(0, 0, true);
                e0Var5.dismiss();
                break;
        }
    }
}
