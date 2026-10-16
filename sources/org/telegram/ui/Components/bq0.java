package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bq0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ir0 b;

    public /* synthetic */ bq0(ir0 ir0Var, int i10) {
        this.a = i10;
        this.b = ir0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ir0 ir0Var = this.b;
                ir0Var.e0.a(!r0.a.q, true);
                ir0Var.a1();
                break;
            case 1:
                ir0 ir0Var2 = this.b;
                org.telegram.ui.ActionBar.m1 m1Var = ir0Var2.J0;
                if (m1Var != null && m1Var.isShowing()) {
                    ir0Var2.J0.d(true);
                }
                ir0Var2.W0(false);
                break;
            case 2:
                ir0 ir0Var3 = this.b;
                org.telegram.ui.ActionBar.m1 m1Var2 = ir0Var3.J0;
                if (m1Var2 != null && m1Var2.isShowing()) {
                    ir0Var3.J0.d(true);
                }
                ir0Var3.W0(true);
                break;
            case 3:
                ir0 ir0Var4 = this.b;
                String[] strArr = ir0Var4.o0;
                if (ir0Var4.U.m() == 0) {
                    if (ir0Var4.n0 || strArr[0] != null) {
                        ir0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] != null || !ir0Var4.l0) {
                            ir0Var4.getContext();
                            ir0Var4.N0();
                            break;
                        } else {
                            ir0Var4.m0 = true;
                            Toast.makeText(ir0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 4:
                ir0 ir0Var5 = this.b;
                String[] strArr2 = ir0Var5.o0;
                if (ir0Var5.U.m() == 0) {
                    if (ir0Var5.n0 || strArr2[0] != null) {
                        ir0Var5.dismiss();
                        if (strArr2[0] != null || !ir0Var5.l0) {
                            ir0Var5.getContext();
                            ir0Var5.N0();
                            break;
                        } else {
                            ir0Var5.m0 = true;
                            Toast.makeText(ir0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                ir0 ir0Var6 = this.b;
                String[] strArr3 = ir0Var6.o0;
                if (ir0Var6.U.m() == 0) {
                    if (ir0Var6.n0 || strArr3[0] != null) {
                        ir0Var6.dismiss();
                        if (strArr3[0] != null || !ir0Var6.l0) {
                            ir0Var6.getContext();
                            ir0Var6.N0();
                            break;
                        } else {
                            ir0Var6.m0 = true;
                            Toast.makeText(ir0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
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
