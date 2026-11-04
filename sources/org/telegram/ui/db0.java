package org.telegram.ui;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class db0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lb0 b;

    public /* synthetic */ db0(lb0 lb0Var, int i3) {
        this.a = i3;
        this.b = lb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.o();
                break;
            case 1:
                lb0 lb0Var = this.b;
                lb0Var.postDelayed(new db0(lb0Var, 2), 150L);
                db0 db0Var = lb0Var.T;
                lb0Var.removeCallbacks(db0Var);
                lb0Var.postDelayed(db0Var, 3000L);
                lb0Var.S = true;
                break;
            case 2:
                ib0 ib0Var = this.b.a;
                int i3 = 0;
                ib0Var.e = false;
                ib0Var.f[0].requestFocus();
                while (true) {
                    zq[] zqVarArr = ib0Var.f;
                    if (i3 >= zqVarArr.length) {
                        break;
                    } else {
                        zqVarArr[i3].z(0.0f);
                        i3++;
                    }
                }
            case 3:
                lb0 lb0Var2 = this.b;
                lb0Var2.postDelayed(new db0(lb0Var2, 5), 150L);
                break;
            case 4:
                lb0 lb0Var3 = this.b;
                kb0 kb0Var = lb0Var3.R;
                boolean z10 = false;
                lb0Var3.S = false;
                int i10 = 0;
                while (true) {
                    zq[] zqVarArr2 = lb0Var3.a.f;
                    if (i10 >= zqVarArr2.length) {
                        if (kb0Var.getCurrentView() != lb0Var3.e) {
                            kb0Var.showNext();
                            FrameLayout frameLayout = lb0Var3.h;
                            if (lb0Var3.f.getVisibility() != 0 && lb0Var3.a0.G != 3 && !lb0Var3.Q) {
                                z10 = true;
                            }
                            org.telegram.messenger.g0.Z3(frameLayout, z10, 1.0f, true, true);
                            break;
                        }
                    } else {
                        zqVarArr2[i10].z(0.0f);
                        i10++;
                    }
                }
                break;
            case 5:
                ib0 ib0Var2 = this.b.a;
                int i11 = 0;
                ib0Var2.e = false;
                ib0Var2.f[0].requestFocus();
                while (true) {
                    zq[] zqVarArr3 = ib0Var2.f;
                    if (i11 >= zqVarArr3.length) {
                        break;
                    } else {
                        zqVarArr3[i11].z(0.0f);
                        i11++;
                    }
                }
            case 6:
                this.b.p(true);
                break;
            case 7:
                this.b.q();
                break;
            default:
                lb0 lb0Var4 = this.b;
                org.telegram.ui.Components.fh0 fh0Var = lb0Var4.x;
                fh0Var.getAnimatedDrawable().N(0, false, false);
                fh0Var.d();
                ib0 ib0Var3 = lb0Var4.a;
                if (ib0Var3 != null && ib0Var3.f != null) {
                    ib0Var3.setText("");
                    ib0Var3.f[0].requestFocus();
                    break;
                }
                break;
        }
    }
}
