package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uo0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dq0 b;

    public /* synthetic */ uo0(dq0 dq0Var, int i10) {
        this.a = i10;
        this.b = dq0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                dq0 dq0Var = this.b;
                dq0Var.a0.a(!r0.a.q, true);
                dq0Var.Z0();
                break;
            case 1:
                dq0 dq0Var2 = this.b;
                org.telegram.ui.ActionBar.o1 o1Var = dq0Var2.F0;
                if (o1Var != null && o1Var.isShowing()) {
                    dq0Var2.F0.d(true);
                }
                dq0Var2.V0(false);
                break;
            case 2:
                dq0 dq0Var3 = this.b;
                org.telegram.ui.ActionBar.o1 o1Var2 = dq0Var3.F0;
                if (o1Var2 != null && o1Var2.isShowing()) {
                    dq0Var3.F0.d(true);
                }
                dq0Var3.V0(true);
                break;
            case 3:
                dq0 dq0Var4 = this.b;
                String[] strArr = dq0Var4.k0;
                if (dq0Var4.Q.m() == 0) {
                    if (dq0Var4.j0 || strArr[0] != null) {
                        dq0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] != null || !dq0Var4.h0) {
                            dq0Var4.getContext();
                            dq0Var4.M0();
                            break;
                        } else {
                            dq0Var4.i0 = true;
                            Toast.makeText(dq0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 4:
                dq0 dq0Var5 = this.b;
                String[] strArr2 = dq0Var5.k0;
                if (dq0Var5.Q.m() == 0) {
                    if (dq0Var5.j0 || strArr2[0] != null) {
                        dq0Var5.dismiss();
                        if (strArr2[0] != null || !dq0Var5.h0) {
                            dq0Var5.getContext();
                            dq0Var5.M0();
                            break;
                        } else {
                            dq0Var5.i0 = true;
                            Toast.makeText(dq0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                dq0 dq0Var6 = this.b;
                String[] strArr3 = dq0Var6.k0;
                if (dq0Var6.Q.m() == 0) {
                    if (dq0Var6.j0 || strArr3[0] != null) {
                        dq0Var6.dismiss();
                        if (strArr3[0] != null || !dq0Var6.h0) {
                            dq0Var6.getContext();
                            dq0Var6.M0();
                            break;
                        } else {
                            dq0Var6.i0 = true;
                            Toast.makeText(dq0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
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
