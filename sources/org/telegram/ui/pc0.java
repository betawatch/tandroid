package org.telegram.ui;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vc0 b;

    public /* synthetic */ pc0(vc0 vc0Var, int i10) {
        this.a = i10;
        this.b = vc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.o();
                break;
            case 1:
                vc0 vc0Var = this.b;
                vc0Var.postDelayed(new pc0(vc0Var, 2), 150L);
                pc0 pc0Var = vc0Var.S;
                vc0Var.removeCallbacks(pc0Var);
                vc0Var.postDelayed(pc0Var, 3000L);
                vc0Var.R = true;
                break;
            case 2:
                tc0 tc0Var = this.b.a;
                int i10 = 0;
                tc0Var.e = false;
                tc0Var.f[0].requestFocus();
                while (true) {
                    bs[] bsVarArr = tc0Var.f;
                    if (i10 >= bsVarArr.length) {
                        break;
                    } else {
                        bsVarArr[i10].z(0.0f);
                        i10++;
                    }
                }
            case 3:
                vc0 vc0Var2 = this.b;
                vc0Var2.postDelayed(new pc0(vc0Var2, 5), 150L);
                break;
            case 4:
                vc0 vc0Var3 = this.b;
                uc0 uc0Var = vc0Var3.Q;
                boolean z10 = false;
                vc0Var3.R = false;
                int i11 = 0;
                while (true) {
                    bs[] bsVarArr2 = vc0Var3.a.f;
                    if (i11 >= bsVarArr2.length) {
                        if (uc0Var.getCurrentView() != vc0Var3.e) {
                            uc0Var.showNext();
                            FrameLayout frameLayout = vc0Var3.h;
                            if (vc0Var3.f.getVisibility() != 0 && vc0Var3.W.F != 3 && !vc0Var3.P) {
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
                tc0 tc0Var2 = this.b.a;
                int i12 = 0;
                tc0Var2.e = false;
                tc0Var2.f[0].requestFocus();
                while (true) {
                    bs[] bsVarArr3 = tc0Var2.f;
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
                vc0 vc0Var4 = this.b;
                org.telegram.ui.Components.fi0 fi0Var = vc0Var4.x;
                fi0Var.getAnimatedDrawable().N(0, false, false);
                fi0Var.d();
                tc0 tc0Var3 = vc0Var4.a;
                if (tc0Var3 != null && tc0Var3.f != null) {
                    tc0Var3.setText("");
                    tc0Var3.f[0].requestFocus();
                    break;
                }
                break;
        }
    }
}
