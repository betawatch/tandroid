package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ee0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ le0 b;

    public /* synthetic */ ee0(le0 le0Var, int i10) {
        this.a = i10;
        this.b = le0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p();
                break;
            case 1:
                le0 le0Var = this.b;
                le0Var.postDelayed(new ee0(le0Var, 2), 150L);
                ee0 ee0Var = le0Var.S;
                le0Var.removeCallbacks(ee0Var);
                le0Var.postDelayed(ee0Var, 3000L);
                le0Var.R = true;
                break;
            case 2:
                ie0 ie0Var = this.b.a;
                int i10 = 0;
                ie0Var.e = false;
                ie0Var.f[0].requestFocus();
                while (true) {
                    ks[] ksVarArr = ie0Var.f;
                    if (i10 >= ksVarArr.length) {
                        break;
                    } else {
                        ksVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                le0 le0Var2 = this.b;
                le0Var2.postDelayed(new ee0(le0Var2, 5), 150L);
                break;
            case 4:
                le0 le0Var3 = this.b;
                ke0 ke0Var = le0Var3.Q;
                boolean z10 = false;
                le0Var3.R = false;
                int i11 = 0;
                while (true) {
                    ks[] ksVarArr2 = le0Var3.a.f;
                    if (i11 >= ksVarArr2.length) {
                        if (ke0Var.getCurrentView() != le0Var3.e) {
                            ke0Var.showNext();
                            FrameLayout frameLayout = le0Var3.h;
                            if (le0Var3.f.getVisibility() != 0 && le0Var3.W.F != 3 && !le0Var3.P) {
                                z10 = true;
                            }
                            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10, 1.0f, true);
                            break;
                        }
                    } else {
                        ksVarArr2[i11].i(0.0f);
                        i11++;
                    }
                }
                break;
            case 5:
                ie0 ie0Var2 = this.b.a;
                int i12 = 0;
                ie0Var2.e = false;
                ie0Var2.f[0].requestFocus();
                while (true) {
                    ks[] ksVarArr3 = ie0Var2.f;
                    if (i12 >= ksVarArr3.length) {
                        break;
                    } else {
                        ksVarArr3[i12].i(0.0f);
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
                le0 le0Var4 = this.b;
                org.telegram.ui.Components.bk0 bk0Var = le0Var4.w;
                bk0Var.getAnimatedDrawable().N(0, false, false);
                bk0Var.d();
                ie0 ie0Var3 = le0Var4.a;
                if (ie0Var3 != null && ie0Var3.f != null) {
                    ie0Var3.setText("");
                    ie0Var3.f[0].requestFocus();
                    break;
                }
                break;
        }
    }
}
