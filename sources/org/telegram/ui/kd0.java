package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kd0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rd0 b;

    public /* synthetic */ kd0(rd0 rd0Var, int i10) {
        this.a = i10;
        this.b = rd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.o();
                break;
            case 1:
                rd0 rd0Var = this.b;
                rd0Var.postDelayed(new kd0(rd0Var, 2), 150L);
                kd0 kd0Var = rd0Var.S;
                rd0Var.removeCallbacks(kd0Var);
                rd0Var.postDelayed(kd0Var, 3000L);
                rd0Var.R = true;
                break;
            case 2:
                od0 od0Var = this.b.a;
                int i10 = 0;
                od0Var.e = false;
                od0Var.f[0].requestFocus();
                while (true) {
                    vr[] vrVarArr = od0Var.f;
                    if (i10 >= vrVarArr.length) {
                        break;
                    } else {
                        vrVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                rd0 rd0Var2 = this.b;
                rd0Var2.postDelayed(new kd0(rd0Var2, 5), 150L);
                break;
            case 4:
                rd0 rd0Var3 = this.b;
                qd0 qd0Var = rd0Var3.Q;
                boolean z10 = false;
                rd0Var3.R = false;
                int i11 = 0;
                while (true) {
                    vr[] vrVarArr2 = rd0Var3.a.f;
                    if (i11 >= vrVarArr2.length) {
                        if (qd0Var.getCurrentView() != rd0Var3.e) {
                            qd0Var.showNext();
                            FrameLayout frameLayout = rd0Var3.h;
                            if (rd0Var3.f.getVisibility() != 0 && rd0Var3.W.F != 3 && !rd0Var3.P) {
                                z10 = true;
                            }
                            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10, 1.0f, true);
                            break;
                        }
                    } else {
                        vrVarArr2[i11].i(0.0f);
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
                    vr[] vrVarArr3 = od0Var2.f;
                    if (i12 >= vrVarArr3.length) {
                        break;
                    } else {
                        vrVarArr3[i12].i(0.0f);
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
                rd0 rd0Var4 = this.b;
                org.telegram.ui.Components.bk0 bk0Var = rd0Var4.w;
                bk0Var.getAnimatedDrawable().N(0, false, false);
                bk0Var.d();
                od0 od0Var3 = rd0Var4.a;
                if (od0Var3 != null && od0Var3.f != null) {
                    od0Var3.setText("");
                    od0Var3.f[0].requestFocus();
                    break;
                }
                break;
        }
    }
}
