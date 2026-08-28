package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;

    public /* synthetic */ b(e0 e0Var, int i9) {
        this.a = i9;
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
                org.telegram.ui.Cells.j3 j3Var = e0Var.w0;
                AndroidUtilities.hideKeyboard(j3Var.b);
                e0Var.E0 = j3Var.getText().toString();
                e0Var.p0();
                e0Var.o0(true);
                e0Var.j0();
                break;
            case 2:
                e0 e0Var2 = this.b;
                if (e0Var2.g0 != null) {
                    TL_iv.RichMessage f02 = e0Var2.f0();
                    if (f02 != null) {
                        e0Var2.g0.run(f02);
                    }
                } else if (e0Var2.f0 != null && e0Var2.g0() != null) {
                    e0Var2.f0.run(e0Var2.g0());
                }
                e0Var2.dismiss();
                break;
            case 3:
                this.b.dismiss();
                break;
            case 4:
                e0 e0Var3 = this.b;
                e0Var3.L0 = false;
                e0Var3.I();
                e0Var3.K0.N(true);
                e0Var3.s();
                break;
            case 5:
                e0.X(this.b, view);
                break;
            case 6:
                e0.Q(this.b, view);
                break;
            case 7:
                e0 e0Var4 = this.b;
                if (!e0Var4.N0) {
                    AndroidUtilities.addToClipboard(e0Var4.g0());
                    break;
                }
                break;
            case 8:
                this.b.dismiss();
                break;
            default:
                e0 e0Var5 = this.b;
                e0Var5.k0(0, 0, true);
                e0Var5.dismiss();
                break;
        }
    }
}
