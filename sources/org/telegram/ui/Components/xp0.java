package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xp0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fr0 b;

    public /* synthetic */ xp0(fr0 fr0Var, int i10) {
        this.a = i10;
        this.b = fr0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                fr0 fr0Var = this.b;
                fr0Var.f0.a(!r0.a.q, true);
                fr0Var.b1();
                break;
            case 1:
                fr0 fr0Var2 = this.b;
                org.telegram.ui.ActionBar.m1 m1Var = fr0Var2.K0;
                if (m1Var != null && m1Var.isShowing()) {
                    fr0Var2.K0.d(true);
                }
                fr0Var2.X0(false);
                break;
            case 2:
                fr0 fr0Var3 = this.b;
                org.telegram.ui.ActionBar.m1 m1Var2 = fr0Var3.K0;
                if (m1Var2 != null && m1Var2.isShowing()) {
                    fr0Var3.K0.d(true);
                }
                fr0Var3.X0(true);
                break;
            case 3:
                fr0 fr0Var4 = this.b;
                String[] strArr = fr0Var4.p0;
                if (fr0Var4.V.m() == 0) {
                    if (fr0Var4.o0 || strArr[0] != null) {
                        fr0Var4.dismiss();
                        PhotoViewer.u1().H0(true, false);
                        if (strArr[0] != null || !fr0Var4.m0) {
                            fr0Var4.getContext();
                            fr0Var4.O0();
                            break;
                        } else {
                            fr0Var4.n0 = true;
                            Toast.makeText(fr0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 4:
                fr0 fr0Var5 = this.b;
                String[] strArr2 = fr0Var5.p0;
                if (fr0Var5.V.m() == 0) {
                    if (fr0Var5.o0 || strArr2[0] != null) {
                        fr0Var5.dismiss();
                        if (strArr2[0] != null || !fr0Var5.m0) {
                            fr0Var5.getContext();
                            fr0Var5.O0();
                            break;
                        } else {
                            fr0Var5.n0 = true;
                            Toast.makeText(fr0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                fr0 fr0Var6 = this.b;
                String[] strArr3 = fr0Var6.p0;
                if (fr0Var6.V.m() == 0) {
                    if (fr0Var6.o0 || strArr3[0] != null) {
                        fr0Var6.dismiss();
                        if (strArr3[0] != null || !fr0Var6.m0) {
                            fr0Var6.getContext();
                            fr0Var6.O0();
                            break;
                        } else {
                            fr0Var6.n0 = true;
                            Toast.makeText(fr0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            default:
                this.b.X0(true);
                break;
        }
    }
}
