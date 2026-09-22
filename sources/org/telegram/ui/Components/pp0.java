package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class pp0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wq0 b;

    public /* synthetic */ pp0(wq0 wq0Var, int i10) {
        this.a = i10;
        this.b = wq0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                wq0 wq0Var = this.b;
                wq0Var.e0.a(!r0.a.q, true);
                wq0Var.Z0();
                break;
            case 1:
                wq0 wq0Var2 = this.b;
                org.telegram.ui.ActionBar.n1 n1Var = wq0Var2.J0;
                if (n1Var != null && n1Var.isShowing()) {
                    wq0Var2.J0.d(true);
                }
                wq0Var2.V0(false);
                break;
            case 2:
                wq0 wq0Var3 = this.b;
                org.telegram.ui.ActionBar.n1 n1Var2 = wq0Var3.J0;
                if (n1Var2 != null && n1Var2.isShowing()) {
                    wq0Var3.J0.d(true);
                }
                wq0Var3.V0(true);
                break;
            case 3:
                wq0 wq0Var4 = this.b;
                String[] strArr = wq0Var4.o0;
                if (wq0Var4.U.m() == 0) {
                    if (wq0Var4.n0 || strArr[0] != null) {
                        wq0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] != null || !wq0Var4.l0) {
                            wq0Var4.getContext();
                            wq0Var4.M0();
                            break;
                        } else {
                            wq0Var4.m0 = true;
                            Toast.makeText(wq0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 4:
                wq0 wq0Var5 = this.b;
                String[] strArr2 = wq0Var5.o0;
                if (wq0Var5.U.m() == 0) {
                    if (wq0Var5.n0 || strArr2[0] != null) {
                        wq0Var5.dismiss();
                        if (strArr2[0] != null || !wq0Var5.l0) {
                            wq0Var5.getContext();
                            wq0Var5.M0();
                            break;
                        } else {
                            wq0Var5.m0 = true;
                            Toast.makeText(wq0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                wq0 wq0Var6 = this.b;
                String[] strArr3 = wq0Var6.o0;
                if (wq0Var6.U.m() == 0) {
                    if (wq0Var6.n0 || strArr3[0] != null) {
                        wq0Var6.dismiss();
                        if (strArr3[0] != null || !wq0Var6.l0) {
                            wq0Var6.getContext();
                            wq0Var6.M0();
                            break;
                        } else {
                            wq0Var6.m0 = true;
                            Toast.makeText(wq0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
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
