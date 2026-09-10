package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;

    public /* synthetic */ c(g0 g0Var, int i10) {
        this.a = i10;
        this.b = g0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            case 1:
                g0 g0Var = this.b;
                org.telegram.ui.Cells.i3 i3Var = g0Var.A0;
                AndroidUtilities.hideKeyboard(i3Var.b);
                g0Var.I0 = i3Var.getText().toString();
                g0Var.q0();
                g0Var.p0(true);
                g0Var.k0();
                break;
            case 2:
                g0 g0Var2 = this.b;
                if (g0Var2.k0 != null) {
                    TL_iv.RichMessage g02 = g0Var2.g0();
                    if (g02 != null) {
                        g0Var2.k0.run(g02);
                    }
                } else if (g0Var2.j0 != null && g0Var2.h0() != null) {
                    g0Var2.j0.run(g0Var2.h0());
                }
                g0Var2.dismiss();
                break;
            case 3:
                this.b.dismiss();
                break;
            case 4:
                g0 g0Var3 = this.b;
                g0Var3.P0 = false;
                g0Var3.J();
                g0Var3.O0.N(true);
                g0Var3.s();
                break;
            case 5:
                g0.Y(this.b, view);
                break;
            case 6:
                g0.R(this.b, view);
                break;
            case 7:
                g0 g0Var4 = this.b;
                if (!g0Var4.R0) {
                    AndroidUtilities.addToClipboard(g0Var4.h0());
                    break;
                }
                break;
            case 8:
                this.b.dismiss();
                break;
            default:
                g0 g0Var5 = this.b;
                g0Var5.l0(0, 0, true);
                g0Var5.dismiss();
                break;
        }
    }
}
