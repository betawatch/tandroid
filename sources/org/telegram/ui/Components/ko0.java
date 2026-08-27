package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ko0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sp0 b;

    public /* synthetic */ ko0(sp0 sp0Var, int i10) {
        this.a = i10;
        this.b = sp0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                sp0 sp0Var = this.b;
                sp0Var.a0.a(!r0.a.q, true);
                sp0Var.Z0();
                break;
            case 1:
                sp0 sp0Var2 = this.b;
                org.telegram.ui.ActionBar.n1 n1Var = sp0Var2.F0;
                if (n1Var != null && n1Var.isShowing()) {
                    sp0Var2.F0.d(true);
                }
                sp0Var2.V0(false);
                break;
            case 2:
                sp0 sp0Var3 = this.b;
                org.telegram.ui.ActionBar.n1 n1Var2 = sp0Var3.F0;
                if (n1Var2 != null && n1Var2.isShowing()) {
                    sp0Var3.F0.d(true);
                }
                sp0Var3.V0(true);
                break;
            case 3:
                sp0 sp0Var4 = this.b;
                String[] strArr = sp0Var4.k0;
                if (sp0Var4.Q.m() == 0) {
                    if (sp0Var4.j0 || strArr[0] != null) {
                        sp0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] != null || !sp0Var4.h0) {
                            sp0Var4.getContext();
                            sp0Var4.M0();
                            break;
                        } else {
                            sp0Var4.i0 = true;
                            Toast.makeText(sp0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 4:
                sp0 sp0Var5 = this.b;
                String[] strArr2 = sp0Var5.k0;
                if (sp0Var5.Q.m() == 0) {
                    if (sp0Var5.j0 || strArr2[0] != null) {
                        sp0Var5.dismiss();
                        if (strArr2[0] != null || !sp0Var5.h0) {
                            sp0Var5.getContext();
                            sp0Var5.M0();
                            break;
                        } else {
                            sp0Var5.i0 = true;
                            Toast.makeText(sp0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                sp0 sp0Var6 = this.b;
                String[] strArr3 = sp0Var6.k0;
                if (sp0Var6.Q.m() == 0) {
                    if (sp0Var6.j0 || strArr3[0] != null) {
                        sp0Var6.dismiss();
                        if (strArr3[0] != null || !sp0Var6.h0) {
                            sp0Var6.getContext();
                            sp0Var6.M0();
                            break;
                        } else {
                            sp0Var6.i0 = true;
                            Toast.makeText(sp0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
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
