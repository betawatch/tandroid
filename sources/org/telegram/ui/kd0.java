package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sd0 b;

    public /* synthetic */ kd0(sd0 sd0Var, int i10) {
        this.a = i10;
        this.b = sd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p();
                break;
            case 1:
                sd0 sd0Var = this.b;
                sd0Var.postDelayed(new kd0(sd0Var, 2), 150L);
                kd0 kd0Var = sd0Var.O;
                sd0Var.removeCallbacks(kd0Var);
                sd0Var.postDelayed(kd0Var, 3000L);
                sd0Var.N = true;
                break;
            case 2:
                od0 od0Var = this.b.a;
                int i10 = 0;
                od0Var.e = false;
                od0Var.f[0].requestFocus();
                while (true) {
                    wr[] wrVarArr = od0Var.f;
                    if (i10 >= wrVarArr.length) {
                        break;
                    } else {
                        wrVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                sd0 sd0Var2 = this.b;
                sd0Var2.postDelayed(new kd0(sd0Var2, 5), 150L);
                break;
            case 4:
                sd0 sd0Var3 = this.b;
                rd0 rd0Var = sd0Var3.M;
                boolean z10 = false;
                sd0Var3.N = false;
                int i11 = 0;
                while (true) {
                    wr[] wrVarArr2 = sd0Var3.a.f;
                    if (i11 >= wrVarArr2.length) {
                        if (rd0Var.getCurrentView() != sd0Var3.e) {
                            rd0Var.showNext();
                            FrameLayout frameLayout = sd0Var3.h;
                            if (sd0Var3.f.getVisibility() != 0 && sd0Var3.S.B != 3 && !sd0Var3.L) {
                                z10 = true;
                            }
                            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10, 1.0f, true);
                            break;
                        }
                    } else {
                        wrVarArr2[i11].i(0.0f);
                        i11++;
                    }
                }
                break;
            case 5:
                od0 od0Var2 = this.b.a;
                int i12 = 0;
                od0Var2.e = false;
                od0Var2.f[0].requestFocus();
                while (true) {
                    wr[] wrVarArr3 = od0Var2.f;
                    if (i12 >= wrVarArr3.length) {
                        break;
                    } else {
                        wrVarArr3[i12].i(0.0f);
                        i12++;
                    }
                }
            case 6:
                this.b.q(true);
                break;
            case 7:
                this.b.r();
                break;
            default:
                sd0 sd0Var4 = this.b;
                org.telegram.ui.Components.ri0 ri0Var = sd0Var4.w;
                ri0Var.getAnimatedDrawable().L(0, false, false);
                ri0Var.d();
                od0 od0Var3 = sd0Var4.a;
                if (od0Var3 != null && od0Var3.f != null) {
                    od0Var3.setText("");
                    od0Var3.f[0].requestFocus();
                    break;
                }
                break;
        }
    }
}
