package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;

    public /* synthetic */ b(f0 f0Var, int i10) {
        this.a = i10;
        this.b = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            case 1:
                f0 f0Var = this.b;
                org.telegram.ui.Cells.h3 h3Var = f0Var.x0;
                AndroidUtilities.hideKeyboard(h3Var.b);
                f0Var.F0 = h3Var.getText().toString();
                f0Var.q0();
                f0Var.p0(true);
                f0Var.k0();
                break;
            case 2:
                f0 f0Var2 = this.b;
                if (f0Var2.h0 != null) {
                    TL_iv.RichMessage g02 = f0Var2.g0();
                    if (g02 != null) {
                        f0Var2.h0.run(g02);
                    }
                } else if (f0Var2.g0 != null && f0Var2.h0() != null) {
                    f0Var2.g0.run(f0Var2.h0());
                }
                f0Var2.dismiss();
                break;
            case 3:
                this.b.dismiss();
                break;
            case 4:
                f0 f0Var3 = this.b;
                f0Var3.M0 = false;
                f0Var3.I();
                f0Var3.L0.N(true);
                f0Var3.s();
                break;
            case 5:
                f0.Y(this.b, view);
                break;
            case 6:
                f0.R(this.b, view);
                break;
            case 7:
                f0 f0Var4 = this.b;
                if (!f0Var4.O0) {
                    AndroidUtilities.addToClipboard(f0Var4.h0());
                    break;
                }
                break;
            case 8:
                this.b.dismiss();
                break;
            default:
                f0 f0Var5 = this.b;
                f0Var5.l0(0, 0, true);
                f0Var5.dismiss();
                break;
        }
    }
}
