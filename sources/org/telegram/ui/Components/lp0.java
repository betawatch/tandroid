package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class lp0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sq0 b;

    public /* synthetic */ lp0(sq0 sq0Var, int i10) {
        this.a = i10;
        this.b = sq0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                sq0 sq0Var = this.b;
                sq0Var.e0.a(!r0.a.q, true);
                sq0Var.Z0();
                break;
            case 1:
                sq0 sq0Var2 = this.b;
                org.telegram.ui.ActionBar.p1 p1Var = sq0Var2.J0;
                if (p1Var != null && p1Var.isShowing()) {
                    sq0Var2.J0.d(true);
                }
                sq0Var2.V0(false);
                break;
            case 2:
                sq0 sq0Var3 = this.b;
                org.telegram.ui.ActionBar.p1 p1Var2 = sq0Var3.J0;
                if (p1Var2 != null && p1Var2.isShowing()) {
                    sq0Var3.J0.d(true);
                }
                sq0Var3.V0(true);
                break;
            case 3:
                sq0 sq0Var4 = this.b;
                String[] strArr = sq0Var4.o0;
                if (sq0Var4.U.m() == 0) {
                    if (sq0Var4.n0 || strArr[0] != null) {
                        sq0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] != null || !sq0Var4.l0) {
                            sq0Var4.getContext();
                            sq0Var4.M0();
                            break;
                        } else {
                            sq0Var4.m0 = true;
                            Toast.makeText(sq0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 4:
                sq0 sq0Var5 = this.b;
                String[] strArr2 = sq0Var5.o0;
                if (sq0Var5.U.m() == 0) {
                    if (sq0Var5.n0 || strArr2[0] != null) {
                        sq0Var5.dismiss();
                        if (strArr2[0] != null || !sq0Var5.l0) {
                            sq0Var5.getContext();
                            sq0Var5.M0();
                            break;
                        } else {
                            sq0Var5.m0 = true;
                            Toast.makeText(sq0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                sq0 sq0Var6 = this.b;
                String[] strArr3 = sq0Var6.o0;
                if (sq0Var6.U.m() == 0) {
                    if (sq0Var6.n0 || strArr3[0] != null) {
                        sq0Var6.dismiss();
                        if (strArr3[0] != null || !sq0Var6.l0) {
                            sq0Var6.getContext();
                            sq0Var6.M0();
                            break;
                        } else {
                            sq0Var6.m0 = true;
                            Toast.makeText(sq0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
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
