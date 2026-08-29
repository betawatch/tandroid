package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class id0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pd0 b;

    public /* synthetic */ id0(pd0 pd0Var, int i10) {
        this.a = i10;
        this.b = pd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p();
                break;
            case 1:
                pd0 pd0Var = this.b;
                pd0Var.postDelayed(new id0(pd0Var, 2), 150L);
                id0 id0Var = pd0Var.O;
                pd0Var.removeCallbacks(id0Var);
                pd0Var.postDelayed(id0Var, 3000L);
                pd0Var.N = true;
                break;
            case 2:
                md0 md0Var = this.b.a;
                int i10 = 0;
                md0Var.e = false;
                md0Var.f[0].requestFocus();
                while (true) {
                    ur[] urVarArr = md0Var.f;
                    if (i10 >= urVarArr.length) {
                        break;
                    } else {
                        urVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                pd0 pd0Var2 = this.b;
                pd0Var2.postDelayed(new id0(pd0Var2, 5), 150L);
                break;
            case 4:
                pd0 pd0Var3 = this.b;
                od0 od0Var = pd0Var3.M;
                boolean z10 = false;
                pd0Var3.N = false;
                int i11 = 0;
                while (true) {
                    ur[] urVarArr2 = pd0Var3.a.f;
                    if (i11 >= urVarArr2.length) {
                        if (od0Var.getCurrentView() != pd0Var3.e) {
                            od0Var.showNext();
                            FrameLayout frameLayout = pd0Var3.h;
                            if (pd0Var3.f.getVisibility() != 0 && pd0Var3.S.B != 3 && !pd0Var3.L) {
                                z10 = true;
                            }
                            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10, 1.0f, true);
                            break;
                        }
                    } else {
                        urVarArr2[i11].i(0.0f);
                        i11++;
                    }
                }
                break;
            case 5:
                md0 md0Var2 = this.b.a;
                int i12 = 0;
                md0Var2.e = false;
                md0Var2.f[0].requestFocus();
                while (true) {
                    ur[] urVarArr3 = md0Var2.f;
                    if (i12 >= urVarArr3.length) {
                        break;
                    } else {
                        urVarArr3[i12].i(0.0f);
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
                pd0 pd0Var4 = this.b;
                org.telegram.ui.Components.aj0 aj0Var = pd0Var4.w;
                aj0Var.getAnimatedDrawable().L(0, false, false);
                aj0Var.d();
                md0 md0Var3 = pd0Var4.a;
                if (md0Var3 != null && md0Var3.f != null) {
                    md0Var3.setText("");
                    md0Var3.f[0].requestFocus();
                    break;
                }
                break;
        }
    }
}
