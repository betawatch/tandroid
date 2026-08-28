package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jo0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rp0 b;

    public /* synthetic */ jo0(rp0 rp0Var, int i9) {
        this.a = i9;
        this.b = rp0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                rp0 rp0Var = this.b;
                rp0Var.a0.a(!r0.a.q, true);
                rp0Var.Z0();
                break;
            case 1:
                rp0 rp0Var2 = this.b;
                org.telegram.ui.ActionBar.o1 o1Var = rp0Var2.F0;
                if (o1Var != null && o1Var.isShowing()) {
                    rp0Var2.F0.d(true);
                }
                rp0Var2.V0(false);
                break;
            case 2:
                rp0 rp0Var3 = this.b;
                org.telegram.ui.ActionBar.o1 o1Var2 = rp0Var3.F0;
                if (o1Var2 != null && o1Var2.isShowing()) {
                    rp0Var3.F0.d(true);
                }
                rp0Var3.V0(true);
                break;
            case 3:
                rp0 rp0Var4 = this.b;
                String[] strArr = rp0Var4.k0;
                if (rp0Var4.Q.m() == 0) {
                    if (rp0Var4.j0 || strArr[0] != null) {
                        rp0Var4.dismiss();
                        PhotoViewer.t1().F0(true, false);
                        if (strArr[0] != null || !rp0Var4.h0) {
                            rp0Var4.getContext();
                            rp0Var4.M0();
                            break;
                        } else {
                            rp0Var4.i0 = true;
                            Toast.makeText(rp0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 4:
                rp0 rp0Var5 = this.b;
                String[] strArr2 = rp0Var5.k0;
                if (rp0Var5.Q.m() == 0) {
                    if (rp0Var5.j0 || strArr2[0] != null) {
                        rp0Var5.dismiss();
                        if (strArr2[0] != null || !rp0Var5.h0) {
                            rp0Var5.getContext();
                            rp0Var5.M0();
                            break;
                        } else {
                            rp0Var5.i0 = true;
                            Toast.makeText(rp0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                rp0 rp0Var6 = this.b;
                String[] strArr3 = rp0Var6.k0;
                if (rp0Var6.Q.m() == 0) {
                    if (rp0Var6.j0 || strArr3[0] != null) {
                        rp0Var6.dismiss();
                        if (strArr3[0] != null || !rp0Var6.h0) {
                            rp0Var6.getContext();
                            rp0Var6.M0();
                            break;
                        } else {
                            rp0Var6.i0 = true;
                            Toast.makeText(rp0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
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
