package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class up0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ br0 b;

    public /* synthetic */ up0(br0 br0Var, int i10) {
        this.a = i10;
        this.b = br0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.S0(true);
                break;
            case 1:
                br0 br0Var = this.b;
                br0Var.e0.a(!r0.a.q, true);
                br0Var.W0();
                break;
            case 2:
                br0 br0Var2 = this.b;
                org.telegram.ui.ActionBar.n1 n1Var = br0Var2.J0;
                if (n1Var != null && n1Var.isShowing()) {
                    br0Var2.J0.d(true);
                }
                br0Var2.S0(false);
                break;
            case 3:
                br0 br0Var3 = this.b;
                org.telegram.ui.ActionBar.n1 n1Var2 = br0Var3.J0;
                if (n1Var2 != null && n1Var2.isShowing()) {
                    br0Var3.J0.d(true);
                }
                br0Var3.S0(true);
                break;
            case 4:
                br0 br0Var4 = this.b;
                String[] strArr = br0Var4.o0;
                if (br0Var4.U.m() == 0) {
                    if (br0Var4.n0 || strArr[0] != null) {
                        br0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] != null || !br0Var4.l0) {
                            br0Var4.getContext();
                            br0Var4.J0();
                            break;
                        } else {
                            br0Var4.m0 = true;
                            Toast.makeText(br0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                br0 br0Var5 = this.b;
                String[] strArr2 = br0Var5.o0;
                if (br0Var5.U.m() == 0) {
                    if (br0Var5.n0 || strArr2[0] != null) {
                        br0Var5.dismiss();
                        if (strArr2[0] != null || !br0Var5.l0) {
                            br0Var5.getContext();
                            br0Var5.J0();
                            break;
                        } else {
                            br0Var5.m0 = true;
                            Toast.makeText(br0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            default:
                br0 br0Var6 = this.b;
                String[] strArr3 = br0Var6.o0;
                if (br0Var6.U.m() == 0) {
                    if (br0Var6.n0 || strArr3[0] != null) {
                        br0Var6.dismiss();
                        if (strArr3[0] != null || !br0Var6.l0) {
                            br0Var6.getContext();
                            br0Var6.J0();
                            break;
                        } else {
                            br0Var6.m0 = true;
                            Toast.makeText(br0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
