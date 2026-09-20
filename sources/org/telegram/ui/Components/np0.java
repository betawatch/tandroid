package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class np0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ uq0 b;

    public /* synthetic */ np0(uq0 uq0Var, int i10) {
        this.a = i10;
        this.b = uq0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                uq0 uq0Var = this.b;
                uq0Var.e0.a(!r0.a.q, true);
                uq0Var.Z0();
                break;
            case 1:
                uq0 uq0Var2 = this.b;
                org.telegram.ui.ActionBar.n1 n1Var = uq0Var2.J0;
                if (n1Var != null && n1Var.isShowing()) {
                    uq0Var2.J0.d(true);
                }
                uq0Var2.V0(false);
                break;
            case 2:
                uq0 uq0Var3 = this.b;
                org.telegram.ui.ActionBar.n1 n1Var2 = uq0Var3.J0;
                if (n1Var2 != null && n1Var2.isShowing()) {
                    uq0Var3.J0.d(true);
                }
                uq0Var3.V0(true);
                break;
            case 3:
                uq0 uq0Var4 = this.b;
                String[] strArr = uq0Var4.o0;
                if (uq0Var4.U.m() == 0) {
                    if (uq0Var4.n0 || strArr[0] != null) {
                        uq0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] != null || !uq0Var4.l0) {
                            uq0Var4.getContext();
                            uq0Var4.M0();
                            break;
                        } else {
                            uq0Var4.m0 = true;
                            Toast.makeText(uq0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 4:
                uq0 uq0Var5 = this.b;
                String[] strArr2 = uq0Var5.o0;
                if (uq0Var5.U.m() == 0) {
                    if (uq0Var5.n0 || strArr2[0] != null) {
                        uq0Var5.dismiss();
                        if (strArr2[0] != null || !uq0Var5.l0) {
                            uq0Var5.getContext();
                            uq0Var5.M0();
                            break;
                        } else {
                            uq0Var5.m0 = true;
                            Toast.makeText(uq0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                uq0 uq0Var6 = this.b;
                String[] strArr3 = uq0Var6.o0;
                if (uq0Var6.U.m() == 0) {
                    if (uq0Var6.n0 || strArr3[0] != null) {
                        uq0Var6.dismiss();
                        if (strArr3[0] != null || !uq0Var6.l0) {
                            uq0Var6.getContext();
                            uq0Var6.M0();
                            break;
                        } else {
                            uq0Var6.m0 = true;
                            Toast.makeText(uq0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            default:
                this.b.V0(true);
                break;
        }
    }
}
