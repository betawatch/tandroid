package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fq0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ mr0 b;

    public /* synthetic */ fq0(mr0 mr0Var, int i10) {
        this.a = i10;
        this.b = mr0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                mr0 mr0Var = this.b;
                mr0Var.e0.a(!r0.a.q, true);
                mr0Var.a1();
                break;
            case 1:
                mr0 mr0Var2 = this.b;
                org.telegram.ui.ActionBar.n1 n1Var = mr0Var2.J0;
                if (n1Var != null && n1Var.isShowing()) {
                    mr0Var2.J0.d(true);
                }
                mr0Var2.W0(false);
                break;
            case 2:
                mr0 mr0Var3 = this.b;
                org.telegram.ui.ActionBar.n1 n1Var2 = mr0Var3.J0;
                if (n1Var2 != null && n1Var2.isShowing()) {
                    mr0Var3.J0.d(true);
                }
                mr0Var3.W0(true);
                break;
            case 3:
                mr0 mr0Var4 = this.b;
                String[] strArr = mr0Var4.o0;
                if (mr0Var4.U.m() == 0) {
                    if (mr0Var4.n0 || strArr[0] != null) {
                        mr0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] != null || !mr0Var4.l0) {
                            mr0Var4.getContext();
                            mr0Var4.N0();
                            break;
                        } else {
                            mr0Var4.m0 = true;
                            Toast.makeText(mr0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 4:
                mr0 mr0Var5 = this.b;
                String[] strArr2 = mr0Var5.o0;
                if (mr0Var5.U.m() == 0) {
                    if (mr0Var5.n0 || strArr2[0] != null) {
                        mr0Var5.dismiss();
                        if (strArr2[0] != null || !mr0Var5.l0) {
                            mr0Var5.getContext();
                            mr0Var5.N0();
                            break;
                        } else {
                            mr0Var5.m0 = true;
                            Toast.makeText(mr0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                mr0 mr0Var6 = this.b;
                String[] strArr3 = mr0Var6.o0;
                if (mr0Var6.U.m() == 0) {
                    if (mr0Var6.n0 || strArr3[0] != null) {
                        mr0Var6.dismiss();
                        if (strArr3[0] != null || !mr0Var6.l0) {
                            mr0Var6.getContext();
                            mr0Var6.N0();
                            break;
                        } else {
                            mr0Var6.m0 = true;
                            Toast.makeText(mr0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            default:
                this.b.W0(true);
                break;
        }
    }
}
