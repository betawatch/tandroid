package org.telegram.ui.Components;

import android.view.View;
import android.widget.Toast;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fp0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ mq0 b;

    public /* synthetic */ fp0(mq0 mq0Var, int i10) {
        this.a = i10;
        this.b = mq0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                mq0 mq0Var = this.b;
                mq0Var.b0.a(!r0.a.q, true);
                mq0Var.Z0();
                break;
            case 1:
                mq0 mq0Var2 = this.b;
                org.telegram.ui.ActionBar.p1 p1Var = mq0Var2.G0;
                if (p1Var != null && p1Var.isShowing()) {
                    mq0Var2.G0.d(true);
                }
                mq0Var2.V0(false);
                break;
            case 2:
                mq0 mq0Var3 = this.b;
                org.telegram.ui.ActionBar.p1 p1Var2 = mq0Var3.G0;
                if (p1Var2 != null && p1Var2.isShowing()) {
                    mq0Var3.G0.d(true);
                }
                mq0Var3.V0(true);
                break;
            case 3:
                mq0 mq0Var4 = this.b;
                String[] strArr = mq0Var4.l0;
                if (mq0Var4.R.m() == 0) {
                    if (mq0Var4.k0 || strArr[0] != null) {
                        mq0Var4.dismiss();
                        PhotoViewer.t1().G0(true, false);
                        if (strArr[0] != null || !mq0Var4.i0) {
                            mq0Var4.getContext();
                            mq0Var4.M0();
                            break;
                        } else {
                            mq0Var4.j0 = true;
                            Toast.makeText(mq0Var4.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 4:
                mq0 mq0Var5 = this.b;
                String[] strArr2 = mq0Var5.l0;
                if (mq0Var5.R.m() == 0) {
                    if (mq0Var5.k0 || strArr2[0] != null) {
                        mq0Var5.dismiss();
                        if (strArr2[0] != null || !mq0Var5.i0) {
                            mq0Var5.getContext();
                            mq0Var5.M0();
                            break;
                        } else {
                            mq0Var5.j0 = true;
                            Toast.makeText(mq0Var5.getContext(), LocaleController.getString(R.string.Loading), 0).show();
                            break;
                        }
                    }
                }
                break;
            case 5:
                mq0 mq0Var6 = this.b;
                String[] strArr3 = mq0Var6.l0;
                if (mq0Var6.R.m() == 0) {
                    if (mq0Var6.k0 || strArr3[0] != null) {
                        mq0Var6.dismiss();
                        if (strArr3[0] != null || !mq0Var6.i0) {
                            mq0Var6.getContext();
                            mq0Var6.M0();
                            break;
                        } else {
                            mq0Var6.j0 = true;
                            Toast.makeText(mq0Var6.getContext(), LocaleController.getString(R.string.Loading), 0).show();
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
