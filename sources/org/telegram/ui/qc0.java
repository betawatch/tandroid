package org.telegram.ui;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class qc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wc0 b;

    public /* synthetic */ qc0(wc0 wc0Var, int i10) {
        this.a = i10;
        this.b = wc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.o();
                break;
            case 1:
                wc0 wc0Var = this.b;
                wc0Var.postDelayed(new qc0(wc0Var, 2), 150L);
                qc0 qc0Var = wc0Var.S;
                wc0Var.removeCallbacks(qc0Var);
                wc0Var.postDelayed(qc0Var, 3000L);
                wc0Var.R = true;
                break;
            case 2:
                uc0 uc0Var = this.b.a;
                int i10 = 0;
                uc0Var.e = false;
                uc0Var.f[0].requestFocus();
                while (true) {
                    bs[] bsVarArr = uc0Var.f;
                    if (i10 >= bsVarArr.length) {
                        break;
                    } else {
                        bsVarArr[i10].z(0.0f);
                        i10++;
                    }
                }
            case 3:
                wc0 wc0Var2 = this.b;
                wc0Var2.postDelayed(new qc0(wc0Var2, 5), 150L);
                break;
            case 4:
                wc0 wc0Var3 = this.b;
                vc0 vc0Var = wc0Var3.Q;
                boolean z10 = false;
                wc0Var3.R = false;
                int i11 = 0;
                while (true) {
                    bs[] bsVarArr2 = wc0Var3.a.f;
                    if (i11 >= bsVarArr2.length) {
                        if (vc0Var.getCurrentView() != wc0Var3.e) {
                            vc0Var.showNext();
                            FrameLayout frameLayout = wc0Var3.h;
                            if (wc0Var3.f.getVisibility() != 0 && wc0Var3.W.F != 3 && !wc0Var3.P) {
                                z10 = true;
                            }
                            org.telegram.messenger.i0.Y3(frameLayout, z10, 1.0f, true, true);
                            break;
                        }
                    } else {
                        bsVarArr2[i11].z(0.0f);
                        i11++;
                    }
                }
                break;
            case 5:
                uc0 uc0Var2 = this.b.a;
                int i12 = 0;
                uc0Var2.e = false;
                uc0Var2.f[0].requestFocus();
                while (true) {
                    bs[] bsVarArr3 = uc0Var2.f;
                    if (i12 >= bsVarArr3.length) {
                        break;
                    } else {
                        bsVarArr3[i12].z(0.0f);
                        i12++;
                    }
                }
            case 6:
                this.b.p(true);
                break;
            case 7:
                this.b.q();
                break;
            default:
                wc0 wc0Var4 = this.b;
                org.telegram.ui.Components.ei0 ei0Var = wc0Var4.x;
                ei0Var.getAnimatedDrawable().N(0, false, false);
                ei0Var.d();
                uc0 uc0Var3 = wc0Var4.a;
                if (uc0Var3 != null && uc0Var3.f != null) {
                    uc0Var3.setText("");
                    uc0Var3.f[0].requestFocus();
                    break;
                }
                break;
        }
    }
}
