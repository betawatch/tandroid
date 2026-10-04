package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class tp0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zq0 b;

    public /* synthetic */ tp0(zq0 zq0Var, int i10) {
        this.a = i10;
        this.b = zq0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.S0(true);
                break;
            case 1:
                zq0 zq0Var = this.b;
                zq0Var.e0.a(!r0.a.q, true);
                zq0Var.W0();
                break;
            case 2:
                zq0 zq0Var2 = this.b;
                org.telegram.ui.ActionBar.n1 n1Var = zq0Var2.J0;
                if (n1Var != null && n1Var.isShowing()) {
                    zq0Var2.J0.d(true);
                }
                zq0Var2.S0(false);
                break;
            case 3:
                zq0 zq0Var3 = this.b;
                org.telegram.ui.ActionBar.n1 n1Var2 = zq0Var3.J0;
                if (n1Var2 != null && n1Var2.isShowing()) {
                    zq0Var3.J0.d(true);
                }
                zq0Var3.S0(true);
                break;
            case 4:
                zq0 zq0Var4 = this.b;
                String[] strArr = zq0Var4.o0;
                if (zq0Var4.U.m() == 0) {
                    if (zq0Var4.n0 || strArr[0] != null) {
                        zq0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] != null || !zq0Var4.l0) {
                            zq0Var4.getContext();
                            zq0Var4.J0();
                            break;
                        } else {
                            zq0Var4.m0 = true;
                            Toast.makeText(zq0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                zq0 zq0Var5 = this.b;
                String[] strArr2 = zq0Var5.o0;
                if (zq0Var5.U.m() == 0) {
                    if (zq0Var5.n0 || strArr2[0] != null) {
                        zq0Var5.dismiss();
                        if (strArr2[0] != null || !zq0Var5.l0) {
                            zq0Var5.getContext();
                            zq0Var5.J0();
                            break;
                        } else {
                            zq0Var5.m0 = true;
                            Toast.makeText(zq0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            default:
                zq0 zq0Var6 = this.b;
                String[] strArr3 = zq0Var6.o0;
                if (zq0Var6.U.m() == 0) {
                    if (zq0Var6.n0 || strArr3[0] != null) {
                        zq0Var6.dismiss();
                        if (strArr3[0] != null || !zq0Var6.l0) {
                            zq0Var6.getContext();
                            zq0Var6.J0();
                            break;
                        } else {
                            zq0Var6.m0 = true;
                            Toast.makeText(zq0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
