package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ae0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ he0 b;

    public /* synthetic */ ae0(he0 he0Var, int i10) {
        this.a = i10;
        this.b = he0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p();
                break;
            case 1:
                he0 he0Var = this.b;
                he0Var.postDelayed(new ae0(he0Var, 2), 150L);
                ae0 ae0Var = he0Var.S;
                he0Var.removeCallbacks(ae0Var);
                he0Var.postDelayed(ae0Var, 3000L);
                he0Var.R = true;
                break;
            case 2:
                ee0 ee0Var = this.b.a;
                int i10 = 0;
                ee0Var.e = false;
                ee0Var.f[0].requestFocus();
                while (true) {
                    gs[] gsVarArr = ee0Var.f;
                    if (i10 >= gsVarArr.length) {
                        break;
                    } else {
                        gsVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                he0 he0Var2 = this.b;
                he0Var2.postDelayed(new ae0(he0Var2, 5), 150L);
                break;
            case 4:
                he0 he0Var3 = this.b;
                ge0 ge0Var = he0Var3.Q;
                boolean z10 = false;
                he0Var3.R = false;
                int i11 = 0;
                while (true) {
                    gs[] gsVarArr2 = he0Var3.a.f;
                    if (i11 >= gsVarArr2.length) {
                        if (ge0Var.getCurrentView() != he0Var3.e) {
                            ge0Var.showNext();
                            FrameLayout frameLayout = he0Var3.h;
                            if (he0Var3.f.getVisibility() != 0 && he0Var3.W.F != 3 && !he0Var3.P) {
                                z10 = true;
                            }
                            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10, 1.0f, true);
                            break;
                        }
                    } else {
                        gsVarArr2[i11].i(0.0f);
                        i11++;
                    }
                }
                break;
            case 5:
                ee0 ee0Var2 = this.b.a;
                int i12 = 0;
                ee0Var2.e = false;
                ee0Var2.f[0].requestFocus();
                while (true) {
                    gs[] gsVarArr3 = ee0Var2.f;
                    if (i12 >= gsVarArr3.length) {
                        break;
                    } else {
                        gsVarArr3[i12].i(0.0f);
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
                he0 he0Var4 = this.b;
                org.telegram.ui.Components.lj0 lj0Var = he0Var4.w;
                lj0Var.getAnimatedDrawable().N(0, false, false);
                lj0Var.d();
                ee0 ee0Var3 = he0Var4.a;
                if (ee0Var3 != null && ee0Var3.f != null) {
                    ee0Var3.setText("");
                    ee0Var3.f[0].requestFocus();
                    break;
                }
                break;
        }
    }
}
