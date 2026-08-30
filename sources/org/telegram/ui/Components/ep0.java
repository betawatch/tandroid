package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ep0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ lq0 b;

    public /* synthetic */ ep0(lq0 lq0Var, int i10) {
        this.a = i10;
        this.b = lq0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                lq0 lq0Var = this.b;
                lq0Var.b0.a(!r0.a.q, true);
                lq0Var.Z0();
                break;
            case 1:
                lq0 lq0Var2 = this.b;
                org.telegram.ui.ActionBar.p1 p1Var = lq0Var2.G0;
                if (p1Var != null && p1Var.isShowing()) {
                    lq0Var2.G0.d(true);
                }
                lq0Var2.V0(false);
                break;
            case 2:
                lq0 lq0Var3 = this.b;
                org.telegram.ui.ActionBar.p1 p1Var2 = lq0Var3.G0;
                if (p1Var2 != null && p1Var2.isShowing()) {
                    lq0Var3.G0.d(true);
                }
                lq0Var3.V0(true);
                break;
            case 3:
                lq0 lq0Var4 = this.b;
                String[] strArr = lq0Var4.l0;
                if (lq0Var4.R.m() == 0) {
                    if (lq0Var4.k0 || strArr[0] != null) {
                        lq0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] != null || !lq0Var4.i0) {
                            lq0Var4.getContext();
                            lq0Var4.M0();
                            break;
                        } else {
                            lq0Var4.j0 = true;
                            Toast.makeText(lq0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 4:
                lq0 lq0Var5 = this.b;
                String[] strArr2 = lq0Var5.l0;
                if (lq0Var5.R.m() == 0) {
                    if (lq0Var5.k0 || strArr2[0] != null) {
                        lq0Var5.dismiss();
                        if (strArr2[0] != null || !lq0Var5.i0) {
                            lq0Var5.getContext();
                            lq0Var5.M0();
                            break;
                        } else {
                            lq0Var5.j0 = true;
                            Toast.makeText(lq0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                lq0 lq0Var6 = this.b;
                String[] strArr3 = lq0Var6.l0;
                if (lq0Var6.R.m() == 0) {
                    if (lq0Var6.k0 || strArr3[0] != null) {
                        lq0Var6.dismiss();
                        if (strArr3[0] != null || !lq0Var6.i0) {
                            lq0Var6.getContext();
                            lq0Var6.M0();
                            break;
                        } else {
                            lq0Var6.j0 = true;
                            Toast.makeText(lq0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
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
