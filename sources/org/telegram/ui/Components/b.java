package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;

    public /* synthetic */ b(g0 g0Var, int i10) {
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
                org.telegram.ui.Cells.g3 g3Var = g0Var.w0;
                AndroidUtilities.hideKeyboard(g3Var.b);
                g0Var.E0 = g3Var.getText().toString();
                g0Var.q0();
                g0Var.p0(true);
                g0Var.k0();
                break;
            case 2:
                g0 g0Var2 = this.b;
                if (g0Var2.g0 != null) {
                    TL_iv.RichMessage g02 = g0Var2.g0();
                    if (g02 != null) {
                        g0Var2.g0.run(g02);
                    }
                } else if (g0Var2.f0 != null && g0Var2.h0() != null) {
                    g0Var2.f0.run(g0Var2.h0());
                }
                g0Var2.dismiss();
                break;
            case 3:
                this.b.dismiss();
                break;
            case 4:
                g0 g0Var3 = this.b;
                g0Var3.L0 = false;
                g0Var3.I();
                g0Var3.K0.N(true);
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
                if (!g0Var4.N0) {
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
