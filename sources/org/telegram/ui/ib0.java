package org.telegram.ui;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ib0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pb0 b;

    public /* synthetic */ ib0(pb0 pb0Var, int i7) {
        this.a = i7;
        this.b = pb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.o();
                break;
            case 1:
                pb0 pb0Var = this.b;
                pb0Var.postDelayed(new ib0(pb0Var, 2), 150L);
                ib0 ib0Var = pb0Var.T;
                pb0Var.removeCallbacks(ib0Var);
                pb0Var.postDelayed(ib0Var, 3000L);
                pb0Var.S = true;
                break;
            case 2:
                mb0 mb0Var = this.b.a;
                int i7 = 0;
                mb0Var.e = false;
                mb0Var.f[0].requestFocus();
                while (true) {
                    er[] erVarArr = mb0Var.f;
                    if (i7 >= erVarArr.length) {
                        break;
                    } else {
                        erVarArr[i7].A(0.0f);
                        i7++;
                    }
                }
            case 3:
                pb0 pb0Var2 = this.b;
                pb0Var2.postDelayed(new ib0(pb0Var2, 5), 150L);
                break;
            case 4:
                pb0 pb0Var3 = this.b;
                ob0 ob0Var = pb0Var3.R;
                boolean z10 = false;
                pb0Var3.S = false;
                int i10 = 0;
                while (true) {
                    er[] erVarArr2 = pb0Var3.a.f;
                    if (i10 >= erVarArr2.length) {
                        if (ob0Var.getCurrentView() != pb0Var3.e) {
                            ob0Var.showNext();
                            FrameLayout frameLayout = pb0Var3.h;
                            if (pb0Var3.f.getVisibility() != 0 && pb0Var3.a0.G != 3 && !pb0Var3.Q) {
                                z10 = true;
                            }
                            org.telegram.messenger.g0.X3(frameLayout, z10, 1.0f, true, true);
                            break;
                        }
                    } else {
                        erVarArr2[i10].A(0.0f);
                        i10++;
                    }
                }
                break;
            case 5:
                mb0 mb0Var2 = this.b.a;
                int i11 = 0;
                mb0Var2.e = false;
                mb0Var2.f[0].requestFocus();
                while (true) {
                    er[] erVarArr3 = mb0Var2.f;
                    if (i11 >= erVarArr3.length) {
                        break;
                    } else {
                        erVarArr3[i11].A(0.0f);
                        i11++;
                    }
                }
            case 6:
                this.b.p(true);
                break;
            case 7:
                this.b.q();
                break;
            default:
                pb0 pb0Var4 = this.b;
                org.telegram.ui.Components.rh0 rh0Var = pb0Var4.x;
                rh0Var.getAnimatedDrawable().N(0, false, false);
                rh0Var.d();
                mb0 mb0Var3 = pb0Var4.a;
                if (mb0Var3 != null && mb0Var3.f != null) {
                    mb0Var3.setText("");
                    mb0Var3.f[0].requestFocus();
                    break;
                }
                break;
        }
    }
}
