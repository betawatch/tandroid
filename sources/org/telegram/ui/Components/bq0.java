package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
                ir0Var.f0.a(!r0.a.q, true);
                ir0Var.f1();
                break;
            case 1:
                ir0 ir0Var2 = this.b;
                org.telegram.ui.ActionBar.m1 m1Var = ir0Var2.K0;
                if (m1Var != null && m1Var.isShowing()) {
                    ir0Var2.K0.d(true);
                }
                ir0Var2.a1(false);
                break;
            case 2:
                ir0 ir0Var3 = this.b;
                org.telegram.ui.ActionBar.m1 m1Var2 = ir0Var3.K0;
                if (m1Var2 != null && m1Var2.isShowing()) {
                    ir0Var3.K0.d(true);
                }
                ir0Var3.a1(true);
                break;
            case 3:
                ir0 ir0Var4 = this.b;
                String[] strArr = ir0Var4.p0;
                if (ir0Var4.V.m() == 0) {
                    if (ir0Var4.o0 || strArr[0] != null) {
                        ir0Var4.dismiss();
                        PhotoViewer.u1().H0(true, false);
                        if (strArr[0] != null || !ir0Var4.m0) {
                            ir0Var4.getContext();
                            ir0Var4.R0();
                            break;
                        } else {
                            ir0Var4.n0 = true;
                            Toast.makeText(ir0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 4:
                ir0 ir0Var5 = this.b;
                String[] strArr2 = ir0Var5.p0;
                if (ir0Var5.V.m() == 0) {
                    if (ir0Var5.o0 || strArr2[0] != null) {
                        ir0Var5.dismiss();
                        if (strArr2[0] != null || !ir0Var5.m0) {
                            ir0Var5.getContext();
                            ir0Var5.R0();
                            break;
                        } else {
                            ir0Var5.n0 = true;
                            Toast.makeText(ir0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                ir0 ir0Var6 = this.b;
                String[] strArr3 = ir0Var6.p0;
                if (ir0Var6.V.m() == 0) {
                    if (ir0Var6.o0 || strArr3[0] != null) {
                        ir0Var6.dismiss();
                        if (strArr3[0] != null || !ir0Var6.m0) {
                            ir0Var6.getContext();
                            ir0Var6.R0();
                            break;
                        } else {
                            ir0Var6.n0 = true;
                            Toast.makeText(ir0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            default:
                this.b.a1(true);
                break;
        }
    }
}
