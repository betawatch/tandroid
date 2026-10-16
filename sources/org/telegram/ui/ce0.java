package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ce0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ je0 b;

    public /* synthetic */ ce0(je0 je0Var, int i10) {
        this.a = i10;
        this.b = je0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p();
                break;
            case 1:
                je0 je0Var = this.b;
                je0Var.postDelayed(new ce0(je0Var, 2), 150L);
                ce0 ce0Var = je0Var.S;
                je0Var.removeCallbacks(ce0Var);
                je0Var.postDelayed(ce0Var, 3000L);
                je0Var.R = true;
                break;
            case 2:
                ge0 ge0Var = this.b.a;
                int i10 = 0;
                ge0Var.e = false;
                ge0Var.f[0].requestFocus();
                while (true) {
                    ks[] ksVarArr = ge0Var.f;
                    if (i10 >= ksVarArr.length) {
                        break;
                    } else {
                        ksVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                je0 je0Var2 = this.b;
                je0Var2.postDelayed(new ce0(je0Var2, 5), 150L);
                break;
            case 4:
                je0 je0Var3 = this.b;
                ie0 ie0Var = je0Var3.Q;
                boolean z10 = false;
                je0Var3.R = false;
                int i11 = 0;
                while (true) {
                    ks[] ksVarArr2 = je0Var3.a.f;
                    if (i11 >= ksVarArr2.length) {
                        if (ie0Var.getCurrentView() != je0Var3.e) {
                            ie0Var.showNext();
                            FrameLayout frameLayout = je0Var3.h;
                            if (je0Var3.f.getVisibility() != 0 && je0Var3.W.F != 3 && !je0Var3.P) {
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
                ge0 ge0Var2 = this.b.a;
                int i12 = 0;
                ge0Var2.e = false;
                ge0Var2.f[0].requestFocus();
                while (true) {
                    ks[] ksVarArr3 = ge0Var2.f;
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
                je0 je0Var4 = this.b;
                org.telegram.ui.Components.bk0 bk0Var = je0Var4.w;
                bk0Var.getAnimatedDrawable().N(0, false, false);
                bk0Var.d();
                ge0 ge0Var3 = je0Var4.a;
                if (ge0Var3 != null && ge0Var3.f != null) {
                    ge0Var3.setText("");
                    ge0Var3.f[0].requestFocus();
                    break;
                }
                break;
        }
    }
}
