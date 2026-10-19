package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class wp0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ er0 b;

    public /* synthetic */ wp0(er0 er0Var, int i10) {
        this.a = i10;
        this.b = er0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                er0 er0Var = this.b;
                er0Var.f0.a(!r0.a.q, true);
                er0Var.b1();
                break;
            case 1:
                er0 er0Var2 = this.b;
                org.telegram.ui.ActionBar.m1 m1Var = er0Var2.K0;
                if (m1Var != null && m1Var.isShowing()) {
                    er0Var2.K0.d(true);
                }
                er0Var2.X0(false);
                break;
            case 2:
                er0 er0Var3 = this.b;
                org.telegram.ui.ActionBar.m1 m1Var2 = er0Var3.K0;
                if (m1Var2 != null && m1Var2.isShowing()) {
                    er0Var3.K0.d(true);
                }
                er0Var3.X0(true);
                break;
            case 3:
                er0 er0Var4 = this.b;
                String[] strArr = er0Var4.p0;
                if (er0Var4.V.m() == 0) {
                    if (er0Var4.o0 || strArr[0] != null) {
                        er0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] != null || !er0Var4.m0) {
                            er0Var4.getContext();
                            er0Var4.O0();
                            break;
                        } else {
                            er0Var4.n0 = true;
                            Toast.makeText(er0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 4:
                er0 er0Var5 = this.b;
                String[] strArr2 = er0Var5.p0;
                if (er0Var5.V.m() == 0) {
                    if (er0Var5.o0 || strArr2[0] != null) {
                        er0Var5.dismiss();
                        if (strArr2[0] != null || !er0Var5.m0) {
                            er0Var5.getContext();
                            er0Var5.O0();
                            break;
                        } else {
                            er0Var5.n0 = true;
                            Toast.makeText(er0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                er0 er0Var6 = this.b;
                String[] strArr3 = er0Var6.p0;
                if (er0Var6.V.m() == 0) {
                    if (er0Var6.o0 || strArr3[0] != null) {
                        er0Var6.dismiss();
                        if (strArr3[0] != null || !er0Var6.m0) {
                            er0Var6.getContext();
                            er0Var6.O0();
                            break;
                        } else {
                            er0Var6.n0 = true;
                            Toast.makeText(er0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            default:
                this.b.X0(true);
                break;
        }
    }
}
