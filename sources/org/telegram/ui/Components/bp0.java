package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bp0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ iq0 b;

    public /* synthetic */ bp0(iq0 iq0Var, int i10) {
        this.a = i10;
        this.b = iq0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                iq0 iq0Var = this.b;
                iq0Var.e0.a(!r0.a.q, true);
                iq0Var.Z0();
                break;
            case 1:
                iq0 iq0Var2 = this.b;
                org.telegram.ui.ActionBar.o1 o1Var = iq0Var2.J0;
                if (o1Var != null && o1Var.isShowing()) {
                    iq0Var2.J0.d(true);
                }
                iq0Var2.V0(false);
                break;
            case 2:
                iq0 iq0Var3 = this.b;
                org.telegram.ui.ActionBar.o1 o1Var2 = iq0Var3.J0;
                if (o1Var2 != null && o1Var2.isShowing()) {
                    iq0Var3.J0.d(true);
                }
                iq0Var3.V0(true);
                break;
            case 3:
                iq0 iq0Var4 = this.b;
                String[] strArr = iq0Var4.o0;
                if (iq0Var4.U.m() == 0) {
                    if (iq0Var4.n0 || strArr[0] != null) {
                        iq0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] != null || !iq0Var4.l0) {
                            iq0Var4.getContext();
                            iq0Var4.M0();
                            break;
                        } else {
                            iq0Var4.m0 = true;
                            Toast.makeText(iq0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 4:
                iq0 iq0Var5 = this.b;
                String[] strArr2 = iq0Var5.o0;
                if (iq0Var5.U.m() == 0) {
                    if (iq0Var5.n0 || strArr2[0] != null) {
                        iq0Var5.dismiss();
                        if (strArr2[0] != null || !iq0Var5.l0) {
                            iq0Var5.getContext();
                            iq0Var5.M0();
                            break;
                        } else {
                            iq0Var5.m0 = true;
                            Toast.makeText(iq0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                iq0 iq0Var6 = this.b;
                String[] strArr3 = iq0Var6.o0;
                if (iq0Var6.U.m() == 0) {
                    if (iq0Var6.n0 || strArr3[0] != null) {
                        iq0Var6.dismiss();
                        if (strArr3[0] != null || !iq0Var6.l0) {
                            iq0Var6.getContext();
                            iq0Var6.M0();
                            break;
                        } else {
                            iq0Var6.m0 = true;
                            Toast.makeText(iq0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
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
