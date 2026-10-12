package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class bq0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ jr0 b;

    public /* synthetic */ bq0(jr0 jr0Var, int i10) {
        this.a = i10;
        this.b = jr0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                jr0 jr0Var = this.b;
                jr0Var.e0.a(!r0.a.q, true);
                jr0Var.a1();
                break;
            case 1:
                jr0 jr0Var2 = this.b;
                org.telegram.ui.ActionBar.m1 m1Var = jr0Var2.J0;
                if (m1Var != null && m1Var.isShowing()) {
                    jr0Var2.J0.d(true);
                }
                jr0Var2.W0(false);
                break;
            case 2:
                jr0 jr0Var3 = this.b;
                org.telegram.ui.ActionBar.m1 m1Var2 = jr0Var3.J0;
                if (m1Var2 != null && m1Var2.isShowing()) {
                    jr0Var3.J0.d(true);
                }
                jr0Var3.W0(true);
                break;
            case 3:
                jr0 jr0Var4 = this.b;
                String[] strArr = jr0Var4.o0;
                if (jr0Var4.U.m() == 0) {
                    if (jr0Var4.n0 || strArr[0] != null) {
                        jr0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] != null || !jr0Var4.l0) {
                            jr0Var4.getContext();
                            jr0Var4.N0();
                            break;
                        } else {
                            jr0Var4.m0 = true;
                            Toast.makeText(jr0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 4:
                jr0 jr0Var5 = this.b;
                String[] strArr2 = jr0Var5.o0;
                if (jr0Var5.U.m() == 0) {
                    if (jr0Var5.n0 || strArr2[0] != null) {
                        jr0Var5.dismiss();
                        if (strArr2[0] != null || !jr0Var5.l0) {
                            jr0Var5.getContext();
                            jr0Var5.N0();
                            break;
                        } else {
                            jr0Var5.m0 = true;
                            Toast.makeText(jr0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                jr0 jr0Var6 = this.b;
                String[] strArr3 = jr0Var6.o0;
                if (jr0Var6.U.m() == 0) {
                    if (jr0Var6.n0 || strArr3[0] != null) {
                        jr0Var6.dismiss();
                        if (strArr3[0] != null || !jr0Var6.l0) {
                            jr0Var6.getContext();
                            jr0Var6.N0();
                            break;
                        } else {
                            jr0Var6.m0 = true;
                            Toast.makeText(jr0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
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
