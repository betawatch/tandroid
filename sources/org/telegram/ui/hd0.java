package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pd0 b;

    public /* synthetic */ hd0(pd0 pd0Var, int i9) {
        this.a = i9;
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
                pd0Var.postDelayed(new hd0(pd0Var, 2), 150L);
                hd0 hd0Var = pd0Var.O;
                pd0Var.removeCallbacks(hd0Var);
                pd0Var.postDelayed(hd0Var, 3000L);
                pd0Var.N = true;
                break;
            case 2:
                ld0 ld0Var = this.b.a;
                int i9 = 0;
                ld0Var.e = false;
                ld0Var.f[0].requestFocus();
                while (true) {
                    vr[] vrVarArr = ld0Var.f;
                    if (i9 >= vrVarArr.length) {
                        break;
                    } else {
                        vrVarArr[i9].i(0.0f);
                        i9++;
                    }
                }
            case 3:
                pd0 pd0Var2 = this.b;
                pd0Var2.postDelayed(new hd0(pd0Var2, 5), 150L);
                break;
            case 4:
                pd0 pd0Var3 = this.b;
                od0 od0Var = pd0Var3.M;
                boolean z10 = false;
                pd0Var3.N = false;
                int i10 = 0;
                while (true) {
                    vr[] vrVarArr2 = pd0Var3.a.f;
                    if (i10 >= vrVarArr2.length) {
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
                        vrVarArr2[i10].i(0.0f);
                        i10++;
                    }
                }
                break;
            case 5:
                ld0 ld0Var2 = this.b.a;
                int i11 = 0;
                ld0Var2.e = false;
                ld0Var2.f[0].requestFocus();
                while (true) {
                    vr[] vrVarArr3 = ld0Var2.f;
                    if (i11 >= vrVarArr3.length) {
                        break;
                    } else {
                        vrVarArr3[i11].i(0.0f);
                        i11++;
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
                org.telegram.ui.Components.pi0 pi0Var = pd0Var4.w;
                pi0Var.getAnimatedDrawable().L(0, false, false);
                pi0Var.d();
                ld0 ld0Var3 = pd0Var4.a;
                if (ld0Var3 != null && ld0Var3.f != null) {
                    ld0Var3.setText("");
                    ld0Var3.f[0].requestFocus();
                    break;
                }
                break;
        }
    }
}
