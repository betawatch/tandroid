package org.telegram.ui;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rb0 b;

    public /* synthetic */ kb0(rb0 rb0Var, int i7) {
        this.a = i7;
        this.b = rb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.o();
                break;
            case 1:
                rb0 rb0Var = this.b;
                rb0Var.postDelayed(new kb0(rb0Var, 2), 150L);
                kb0 kb0Var = rb0Var.S;
                rb0Var.removeCallbacks(kb0Var);
                rb0Var.postDelayed(kb0Var, 3000L);
                rb0Var.R = true;
                break;
            case 2:
                ob0 ob0Var = this.b.a;
                int i7 = 0;
                ob0Var.e = false;
                ob0Var.f[0].requestFocus();
                while (true) {
                    er[] erVarArr = ob0Var.f;
                    if (i7 >= erVarArr.length) {
                        break;
                    } else {
                        erVarArr[i7].z(0.0f);
                        i7++;
                    }
                }
            case 3:
                rb0 rb0Var2 = this.b;
                rb0Var2.postDelayed(new kb0(rb0Var2, 5), 150L);
                break;
            case 4:
                rb0 rb0Var3 = this.b;
                qb0 qb0Var = rb0Var3.Q;
                boolean z9 = false;
                rb0Var3.R = false;
                int i10 = 0;
                while (true) {
                    er[] erVarArr2 = rb0Var3.a.f;
                    if (i10 >= erVarArr2.length) {
                        if (qb0Var.getCurrentView() != rb0Var3.e) {
                            qb0Var.showNext();
                            FrameLayout frameLayout = rb0Var3.h;
                            if (rb0Var3.f.getVisibility() != 0 && rb0Var3.W.F != 3 && !rb0Var3.P) {
                                z9 = true;
                            }
                            org.telegram.messenger.g0.Z3(frameLayout, z9, 1.0f, true, true);
                            break;
                        }
                    } else {
                        erVarArr2[i10].z(0.0f);
                        i10++;
                    }
                }
                break;
            case 5:
                ob0 ob0Var2 = this.b.a;
                int i11 = 0;
                ob0Var2.e = false;
                ob0Var2.f[0].requestFocus();
                while (true) {
                    er[] erVarArr3 = ob0Var2.f;
                    if (i11 >= erVarArr3.length) {
                        break;
                    } else {
                        erVarArr3[i11].z(0.0f);
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
                rb0 rb0Var4 = this.b;
                org.telegram.ui.Components.ch0 ch0Var = rb0Var4.x;
                ch0Var.getAnimatedDrawable().N(0, false, false);
                ch0Var.d();
                ob0 ob0Var3 = rb0Var4.a;
                if (ob0Var3 != null && ob0Var3.f != null) {
                    ob0Var3.setText("");
                    ob0Var3.f[0].requestFocus();
                    break;
                }
                break;
        }
    }
}
