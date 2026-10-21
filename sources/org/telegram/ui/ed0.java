package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ed0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ md0 b;

    public /* synthetic */ ed0(md0 md0Var, int i10) {
        this.a = i10;
        this.b = md0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p();
                break;
            case 1:
                md0 md0Var = this.b;
                md0Var.postDelayed(new ed0(md0Var, 2), 150L);
                ed0 ed0Var = md0Var.S;
                md0Var.removeCallbacks(ed0Var);
                md0Var.postDelayed(ed0Var, 3000L);
                md0Var.R = true;
                break;
            case 2:
                id0 id0Var = this.b.a;
                int i10 = 0;
                id0Var.e = false;
                id0Var.f[0].requestFocus();
                while (true) {
                    tr[] trVarArr = id0Var.f;
                    if (i10 >= trVarArr.length) {
                        break;
                    } else {
                        trVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                md0 md0Var2 = this.b;
                md0Var2.postDelayed(new ed0(md0Var2, 5), 150L);
                break;
            case 4:
                md0 md0Var3 = this.b;
                ld0 ld0Var = md0Var3.Q;
                boolean z10 = false;
                md0Var3.R = false;
                int i11 = 0;
                while (true) {
                    tr[] trVarArr2 = md0Var3.a.f;
                    if (i11 >= trVarArr2.length) {
                        if (ld0Var.getCurrentView() != md0Var3.e) {
                            ld0Var.showNext();
                            FrameLayout frameLayout = md0Var3.h;
                            if (md0Var3.f.getVisibility() != 0 && md0Var3.W.F != 3 && !md0Var3.P) {
                                z10 = true;
                            }
                            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10, 1.0f, true);
                            break;
                        }
                    } else {
                        trVarArr2[i11].i(0.0f);
                        i11++;
                    }
                }
                break;
            case 5:
                id0 id0Var2 = this.b.a;
                int i12 = 0;
                id0Var2.e = false;
                id0Var2.f[0].requestFocus();
                while (true) {
                    tr[] trVarArr3 = id0Var2.f;
                    if (i12 >= trVarArr3.length) {
                        break;
                    } else {
                        trVarArr3[i12].i(0.0f);
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
                md0 md0Var4 = this.b;
                org.telegram.ui.Components.yj0 yj0Var = md0Var4.w;
                yj0Var.getAnimatedDrawable().N(0, false, false);
                yj0Var.d();
                id0 id0Var3 = md0Var4.a;
                if (id0Var3 != null && id0Var3.f != null) {
                    id0Var3.setText("");
                    id0Var3.f[0].requestFocus();
                    break;
                }
                break;
        }
    }
}
