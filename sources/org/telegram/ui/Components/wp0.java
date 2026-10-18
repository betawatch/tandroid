package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wp0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dr0 b;

    public /* synthetic */ wp0(dr0 dr0Var, int i10) {
        this.a = i10;
        this.b = dr0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                dr0 dr0Var = this.b;
                dr0Var.e0.a(!r0.a.q, true);
                dr0Var.a1();
                break;
            case 1:
                dr0 dr0Var2 = this.b;
                org.telegram.ui.ActionBar.m1 m1Var = dr0Var2.J0;
                if (m1Var != null && m1Var.isShowing()) {
                    dr0Var2.J0.d(true);
                }
                dr0Var2.W0(false);
                break;
            case 2:
                dr0 dr0Var3 = this.b;
                org.telegram.ui.ActionBar.m1 m1Var2 = dr0Var3.J0;
                if (m1Var2 != null && m1Var2.isShowing()) {
                    dr0Var3.J0.d(true);
                }
                dr0Var3.W0(true);
                break;
            case 3:
                dr0 dr0Var4 = this.b;
                String[] strArr = dr0Var4.o0;
                if (dr0Var4.U.m() == 0) {
                    if (dr0Var4.n0 || strArr[0] != null) {
                        dr0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] != null || !dr0Var4.l0) {
                            dr0Var4.getContext();
                            dr0Var4.N0();
                            break;
                        } else {
                            dr0Var4.m0 = true;
                            Toast.makeText(dr0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 4:
                dr0 dr0Var5 = this.b;
                String[] strArr2 = dr0Var5.o0;
                if (dr0Var5.U.m() == 0) {
                    if (dr0Var5.n0 || strArr2[0] != null) {
                        dr0Var5.dismiss();
                        if (strArr2[0] != null || !dr0Var5.l0) {
                            dr0Var5.getContext();
                            dr0Var5.N0();
                            break;
                        } else {
                            dr0Var5.m0 = true;
                            Toast.makeText(dr0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                dr0 dr0Var6 = this.b;
                String[] strArr3 = dr0Var6.o0;
                if (dr0Var6.U.m() == 0) {
                    if (dr0Var6.n0 || strArr3[0] != null) {
                        dr0Var6.dismiss();
                        if (strArr3[0] != null || !dr0Var6.l0) {
                            dr0Var6.getContext();
                            dr0Var6.N0();
                            break;
                        } else {
                            dr0Var6.m0 = true;
                            Toast.makeText(dr0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            default:
                this.b.W0(true);
                break;
        }
    }
}
