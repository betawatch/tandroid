package org.telegram.ui;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class be0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ie0 b;

    public /* synthetic */ be0(ie0 ie0Var, int i10) {
        this.a = i10;
        this.b = ie0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p();
                break;
            case 1:
                ie0 ie0Var = this.b;
                ie0Var.postDelayed(new be0(ie0Var, 2), 150L);
                be0 be0Var = ie0Var.S;
                ie0Var.removeCallbacks(be0Var);
                ie0Var.postDelayed(be0Var, 3000L);
                ie0Var.R = true;
                break;
            case 2:
                fe0 fe0Var = this.b.a;
                int i10 = 0;
                fe0Var.e = false;
                fe0Var.f[0].requestFocus();
                while (true) {
                    gs[] gsVarArr = fe0Var.f;
                    if (i10 >= gsVarArr.length) {
                        break;
                    } else {
                        gsVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 3:
                ie0 ie0Var2 = this.b;
                ie0Var2.postDelayed(new be0(ie0Var2, 5), 150L);
                break;
            case 4:
                ie0 ie0Var3 = this.b;
                he0 he0Var = ie0Var3.Q;
                boolean z10 = false;
                ie0Var3.R = false;
                int i11 = 0;
                while (true) {
                    gs[] gsVarArr2 = ie0Var3.a.f;
                    if (i11 >= gsVarArr2.length) {
                        if (he0Var.getCurrentView() != ie0Var3.e) {
                            he0Var.showNext();
                            FrameLayout frameLayout = ie0Var3.h;
                            if (ie0Var3.f.getVisibility() != 0 && ie0Var3.W.F != 3 && !ie0Var3.P) {
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
                fe0 fe0Var2 = this.b.a;
                int i12 = 0;
                fe0Var2.e = false;
                fe0Var2.f[0].requestFocus();
                while (true) {
                    gs[] gsVarArr3 = fe0Var2.f;
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
                ie0 ie0Var4 = this.b;
                org.telegram.ui.Components.nj0 nj0Var = ie0Var4.w;
                nj0Var.getAnimatedDrawable().N(0, false, false);
                nj0Var.d();
                fe0 fe0Var3 = ie0Var4.a;
                if (fe0Var3 != null && fe0Var3.f != null) {
                    fe0Var3.setText("");
                    fe0Var3.f[0].requestFocus();
                    break;
                }
                break;
        }
    }
}
