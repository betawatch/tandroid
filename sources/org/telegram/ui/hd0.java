package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ od0 b;

    public /* synthetic */ hd0(od0 od0Var, int i10) {
        this.a = i10;
        this.b = od0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.o();
                break;
            case 1:
                od0 od0Var = this.b;
                od0Var.postDelayed(new hd0(od0Var, 2), 150L);
                hd0 hd0Var = od0Var.S;
                od0Var.removeCallbacks(hd0Var);
                od0Var.postDelayed(hd0Var, 3000L);
                od0Var.R = true;
                break;
            case 2:
                ld0 ld0Var = this.b.a;
                int i10 = 0;
                ld0Var.e = false;
                ld0Var.f[0].requestFocus();
                while (true) {
                    xr[] xrVarArr = ld0Var.f;
                    if (i10 >= xrVarArr.length) {
                        break;
                    } else {
                        xrVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                od0 od0Var2 = this.b;
                od0Var2.postDelayed(new hd0(od0Var2, 5), 150L);
                break;
            case 4:
                od0 od0Var3 = this.b;
                nd0 nd0Var = od0Var3.Q;
                boolean z10 = false;
                od0Var3.R = false;
                int i11 = 0;
                while (true) {
                    xr[] xrVarArr2 = od0Var3.a.f;
                    if (i11 >= xrVarArr2.length) {
                        if (nd0Var.getCurrentView() != od0Var3.e) {
                            nd0Var.showNext();
                            FrameLayout frameLayout = od0Var3.h;
                            if (od0Var3.f.getVisibility() != 0 && od0Var3.W.F != 3 && !od0Var3.P) {
                                z10 = true;
                            }
                            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10, 1.0f, true);
                            break;
                        }
                    } else {
                        xrVarArr2[i11].i(0.0f);
                        i11++;
                    }
                }
                break;
            case 5:
                ld0 ld0Var2 = this.b.a;
                int i12 = 0;
                ld0Var2.e = false;
                ld0Var2.f[0].requestFocus();
                while (true) {
                    xr[] xrVarArr3 = ld0Var2.f;
                    if (i12 >= xrVarArr3.length) {
                        break;
                    } else {
                        xrVarArr3[i12].i(0.0f);
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
                od0 od0Var4 = this.b;
                org.telegram.ui.Components.ak0 ak0Var = od0Var4.w;
                ak0Var.getAnimatedDrawable().N(0, false, false);
                ak0Var.d();
                ld0 ld0Var3 = od0Var4.a;
                if (ld0Var3 != null && ld0Var3.f != null) {
                    ld0Var3.setText("");
                    ld0Var3.f[0].requestFocus();
                    break;
                }
                break;
        }
    }
}
