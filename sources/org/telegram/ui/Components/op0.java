package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class op0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vq0 b;

    public /* synthetic */ op0(vq0 vq0Var, int i10) {
        this.a = i10;
        this.b = vq0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                vq0 vq0Var = this.b;
                vq0Var.e0.a(!r0.a.q, true);
                vq0Var.Z0();
                break;
            case 1:
                vq0 vq0Var2 = this.b;
                org.telegram.ui.ActionBar.n1 n1Var = vq0Var2.J0;
                if (n1Var != null && n1Var.isShowing()) {
                    vq0Var2.J0.d(true);
                }
                vq0Var2.V0(false);
                break;
            case 2:
                vq0 vq0Var3 = this.b;
                org.telegram.ui.ActionBar.n1 n1Var2 = vq0Var3.J0;
                if (n1Var2 != null && n1Var2.isShowing()) {
                    vq0Var3.J0.d(true);
                }
                vq0Var3.V0(true);
                break;
            case 3:
                vq0 vq0Var4 = this.b;
                String[] strArr = vq0Var4.o0;
                if (vq0Var4.U.m() == 0) {
                    if (vq0Var4.n0 || strArr[0] != null) {
                        vq0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] != null || !vq0Var4.l0) {
                            vq0Var4.getContext();
                            vq0Var4.M0();
                            break;
                        } else {
                            vq0Var4.m0 = true;
                            Toast.makeText(vq0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 4:
                vq0 vq0Var5 = this.b;
                String[] strArr2 = vq0Var5.o0;
                if (vq0Var5.U.m() == 0) {
                    if (vq0Var5.n0 || strArr2[0] != null) {
                        vq0Var5.dismiss();
                        if (strArr2[0] != null || !vq0Var5.l0) {
                            vq0Var5.getContext();
                            vq0Var5.M0();
                            break;
                        } else {
                            vq0Var5.m0 = true;
                            Toast.makeText(vq0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                vq0 vq0Var6 = this.b;
                String[] strArr3 = vq0Var6.o0;
                if (vq0Var6.U.m() == 0) {
                    if (vq0Var6.n0 || strArr3[0] != null) {
                        vq0Var6.dismiss();
                        if (strArr3[0] != null || !vq0Var6.l0) {
                            vq0Var6.getContext();
                            vq0Var6.M0();
                            break;
                        } else {
                            vq0Var6.m0 = true;
                            Toast.makeText(vq0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
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
