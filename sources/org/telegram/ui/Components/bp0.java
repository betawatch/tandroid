package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class bp0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hq0 b;

    public /* synthetic */ bp0(hq0 hq0Var, int i10) {
        this.a = i10;
        this.b = hq0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                hq0 hq0Var = this.b;
                hq0Var.e0.a(!r0.a.q, true);
                hq0Var.Z0();
                break;
            case 1:
                hq0 hq0Var2 = this.b;
                org.telegram.ui.ActionBar.n1 n1Var = hq0Var2.J0;
                if (n1Var != null && n1Var.isShowing()) {
                    hq0Var2.J0.d(true);
                }
                hq0Var2.V0(false);
                break;
            case 2:
                hq0 hq0Var3 = this.b;
                org.telegram.ui.ActionBar.n1 n1Var2 = hq0Var3.J0;
                if (n1Var2 != null && n1Var2.isShowing()) {
                    hq0Var3.J0.d(true);
                }
                hq0Var3.V0(true);
                break;
            case 3:
                hq0 hq0Var4 = this.b;
                String[] strArr = hq0Var4.o0;
                if (hq0Var4.U.m() == 0) {
                    if (hq0Var4.n0 || strArr[0] != null) {
                        hq0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] != null || !hq0Var4.l0) {
                            hq0Var4.getContext();
                            hq0Var4.M0();
                            break;
                        } else {
                            hq0Var4.m0 = true;
                            Toast.makeText(hq0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 4:
                hq0 hq0Var5 = this.b;
                String[] strArr2 = hq0Var5.o0;
                if (hq0Var5.U.m() == 0) {
                    if (hq0Var5.n0 || strArr2[0] != null) {
                        hq0Var5.dismiss();
                        if (strArr2[0] != null || !hq0Var5.l0) {
                            hq0Var5.getContext();
                            hq0Var5.M0();
                            break;
                        } else {
                            hq0Var5.m0 = true;
                            Toast.makeText(hq0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                hq0 hq0Var6 = this.b;
                String[] strArr3 = hq0Var6.o0;
                if (hq0Var6.U.m() == 0) {
                    if (hq0Var6.n0 || strArr3[0] != null) {
                        hq0Var6.dismiss();
                        if (strArr3[0] != null || !hq0Var6.l0) {
                            hq0Var6.getContext();
                            hq0Var6.M0();
                            break;
                        } else {
                            hq0Var6.m0 = true;
                            Toast.makeText(hq0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
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
