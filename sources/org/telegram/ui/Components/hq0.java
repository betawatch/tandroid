package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hq0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ nr0 b;

    public /* synthetic */ hq0(nr0 nr0Var, int i10) {
        this.a = i10;
        this.b = nr0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.X0(true);
                break;
            case 1:
                nr0 nr0Var = this.b;
                nr0Var.f0.a(!r0.a.q, true);
                nr0Var.c1();
                break;
            case 2:
                nr0 nr0Var2 = this.b;
                org.telegram.ui.ActionBar.o1 o1Var = nr0Var2.K0;
                if (o1Var != null && o1Var.isShowing()) {
                    nr0Var2.K0.d(true);
                }
                nr0Var2.X0(false);
                break;
            case 3:
                nr0 nr0Var3 = this.b;
                org.telegram.ui.ActionBar.o1 o1Var2 = nr0Var3.K0;
                if (o1Var2 != null && o1Var2.isShowing()) {
                    nr0Var3.K0.d(true);
                }
                nr0Var3.X0(true);
                break;
            case 4:
                nr0 nr0Var4 = this.b;
                String[] strArr = nr0Var4.p0;
                if (nr0Var4.V.m() == 0) {
                    if (nr0Var4.o0 || strArr[0] != null) {
                        nr0Var4.dismiss();
                        PhotoViewer.v1().H0(true, false);
                        if (strArr[0] != null || !nr0Var4.m0) {
                            nr0Var4.getContext();
                            nr0Var4.O0();
                            break;
                        } else {
                            nr0Var4.n0 = true;
                            Toast.makeText(nr0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                nr0 nr0Var5 = this.b;
                String[] strArr2 = nr0Var5.p0;
                if (nr0Var5.V.m() == 0) {
                    if (nr0Var5.o0 || strArr2[0] != null) {
                        nr0Var5.dismiss();
                        if (strArr2[0] != null || !nr0Var5.m0) {
                            nr0Var5.getContext();
                            nr0Var5.O0();
                            break;
                        } else {
                            nr0Var5.n0 = true;
                            Toast.makeText(nr0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            default:
                nr0 nr0Var6 = this.b;
                String[] strArr3 = nr0Var6.p0;
                if (nr0Var6.V.m() == 0) {
                    if (nr0Var6.o0 || strArr3[0] != null) {
                        nr0Var6.dismiss();
                        if (strArr3[0] != null || !nr0Var6.m0) {
                            nr0Var6.getContext();
                            nr0Var6.O0();
                            break;
                        } else {
                            nr0Var6.n0 = true;
                            Toast.makeText(nr0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
        }
    }
}
