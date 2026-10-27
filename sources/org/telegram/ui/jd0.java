package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qd0 b;

    public /* synthetic */ jd0(qd0 qd0Var, int i10) {
        this.a = i10;
        this.b = qd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.o();
                break;
            case 1:
                qd0 qd0Var = this.b;
                qd0Var.postDelayed(new jd0(qd0Var, 2), 150L);
                jd0 jd0Var = qd0Var.S;
                qd0Var.removeCallbacks(jd0Var);
                qd0Var.postDelayed(jd0Var, 3000L);
                qd0Var.R = true;
                break;
            case 2:
                nd0 nd0Var = this.b.a;
                int i10 = 0;
                nd0Var.e = false;
                nd0Var.f[0].requestFocus();
                while (true) {
                    zr[] zrVarArr = nd0Var.f;
                    if (i10 >= zrVarArr.length) {
                        break;
                    } else {
                        zrVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                qd0 qd0Var2 = this.b;
                qd0Var2.postDelayed(new jd0(qd0Var2, 5), 150L);
                break;
            case 4:
                qd0 qd0Var3 = this.b;
                pd0 pd0Var = qd0Var3.Q;
                boolean z10 = false;
                qd0Var3.R = false;
                int i11 = 0;
                while (true) {
                    zr[] zrVarArr2 = qd0Var3.a.f;
                    if (i11 >= zrVarArr2.length) {
                        if (pd0Var.getCurrentView() != qd0Var3.e) {
                            pd0Var.showNext();
                            FrameLayout frameLayout = qd0Var3.h;
                            if (qd0Var3.f.getVisibility() != 0 && qd0Var3.W.F != 3 && !qd0Var3.P) {
                                z10 = true;
                            }
                            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10, 1.0f, true);
                            break;
                        }
                    } else {
                        zrVarArr2[i11].i(0.0f);
                        i11++;
                    }
                }
                break;
            case 5:
                nd0 nd0Var2 = this.b.a;
                int i12 = 0;
                nd0Var2.e = false;
                nd0Var2.f[0].requestFocus();
                while (true) {
                    zr[] zrVarArr3 = nd0Var2.f;
                    if (i12 >= zrVarArr3.length) {
                        break;
                    } else {
                        zrVarArr3[i12].i(0.0f);
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
                qd0 qd0Var4 = this.b;
                org.telegram.ui.Components.bk0 bk0Var = qd0Var4.w;
                bk0Var.getAnimatedDrawable().N(0, false, false);
                bk0Var.d();
                nd0 nd0Var3 = qd0Var4.a;
                if (nd0Var3 != null && nd0Var3.f != null) {
                    nd0Var3.setText("");
                    nd0Var3.f[0].requestFocus();
                    break;
                }
                break;
        }
    }
}
