package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gq0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ mr0 b;

    public /* synthetic */ gq0(mr0 mr0Var, int i10) {
        this.a = i10;
        this.b = mr0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.X0(true);
                break;
            case 1:
                mr0 mr0Var = this.b;
                mr0Var.f0.a(!r0.a.q, true);
                mr0Var.c1();
                break;
            case 2:
                mr0 mr0Var2 = this.b;
                org.telegram.ui.ActionBar.o1 o1Var = mr0Var2.K0;
                if (o1Var != null && o1Var.isShowing()) {
                    mr0Var2.K0.d(true);
                }
                mr0Var2.X0(false);
                break;
            case 3:
                mr0 mr0Var3 = this.b;
                org.telegram.ui.ActionBar.o1 o1Var2 = mr0Var3.K0;
                if (o1Var2 != null && o1Var2.isShowing()) {
                    mr0Var3.K0.d(true);
                }
                mr0Var3.X0(true);
                break;
            case 4:
                mr0 mr0Var4 = this.b;
                String[] strArr = mr0Var4.p0;
                if (mr0Var4.V.m() == 0) {
                    if (mr0Var4.o0 || strArr[0] != null) {
                        mr0Var4.dismiss();
                        PhotoViewer.u1().H0(true, false);
                        if (strArr[0] != null || !mr0Var4.m0) {
                            mr0Var4.getContext();
                            mr0Var4.O0();
                            break;
                        } else {
                            mr0Var4.n0 = true;
                            Toast.makeText(mr0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                mr0 mr0Var5 = this.b;
                String[] strArr2 = mr0Var5.p0;
                if (mr0Var5.V.m() == 0) {
                    if (mr0Var5.o0 || strArr2[0] != null) {
                        mr0Var5.dismiss();
                        if (strArr2[0] != null || !mr0Var5.m0) {
                            mr0Var5.getContext();
                            mr0Var5.O0();
                            break;
                        } else {
                            mr0Var5.n0 = true;
                            Toast.makeText(mr0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            default:
                mr0 mr0Var6 = this.b;
                String[] strArr3 = mr0Var6.p0;
                if (mr0Var6.V.m() == 0) {
                    if (mr0Var6.o0 || strArr3[0] != null) {
                        mr0Var6.dismiss();
                        if (strArr3[0] != null || !mr0Var6.m0) {
                            mr0Var6.getContext();
                            mr0Var6.O0();
                            break;
                        } else {
                            mr0Var6.n0 = true;
                            Toast.makeText(mr0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
