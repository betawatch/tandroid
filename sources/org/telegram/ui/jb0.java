package org.telegram.ui;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class jb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qb0 b;

    public /* synthetic */ jb0(qb0 qb0Var, int i7) {
        this.a = i7;
        this.b = qb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.o();
                break;
            case 1:
                qb0 qb0Var = this.b;
                qb0Var.postDelayed(new jb0(qb0Var, 2), 150L);
                jb0 jb0Var = qb0Var.S;
                qb0Var.removeCallbacks(jb0Var);
                qb0Var.postDelayed(jb0Var, 3000L);
                qb0Var.R = true;
                break;
            case 2:
                nb0 nb0Var = this.b.a;
                int i7 = 0;
                nb0Var.e = false;
                nb0Var.f[0].requestFocus();
                while (true) {
                    dr[] drVarArr = nb0Var.f;
                    if (i7 >= drVarArr.length) {
                        break;
                    } else {
                        drVarArr[i7].z(0.0f);
                        i7++;
                    }
                }
            case 3:
                qb0 qb0Var2 = this.b;
                qb0Var2.postDelayed(new jb0(qb0Var2, 5), 150L);
                break;
            case 4:
                qb0 qb0Var3 = this.b;
                pb0 pb0Var = qb0Var3.Q;
                boolean z9 = false;
                qb0Var3.R = false;
                int i10 = 0;
                while (true) {
                    dr[] drVarArr2 = qb0Var3.a.f;
                    if (i10 >= drVarArr2.length) {
                        if (pb0Var.getCurrentView() != qb0Var3.e) {
                            pb0Var.showNext();
                            FrameLayout frameLayout = qb0Var3.h;
                            if (qb0Var3.f.getVisibility() != 0 && qb0Var3.W.F != 3 && !qb0Var3.P) {
                                z9 = true;
                            }
                            org.telegram.messenger.g0.Z3(frameLayout, z9, 1.0f, true, true);
                            break;
                        }
                    } else {
                        drVarArr2[i10].z(0.0f);
                        i10++;
                    }
                }
                break;
            case 5:
                nb0 nb0Var2 = this.b.a;
                int i11 = 0;
                nb0Var2.e = false;
                nb0Var2.f[0].requestFocus();
                while (true) {
                    dr[] drVarArr3 = nb0Var2.f;
                    if (i11 >= drVarArr3.length) {
                        break;
                    } else {
                        drVarArr3[i11].z(0.0f);
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
                qb0 qb0Var4 = this.b;
                org.telegram.ui.Components.dh0 dh0Var = qb0Var4.x;
                dh0Var.getAnimatedDrawable().N(0, false, false);
                dh0Var.d();
                nb0 nb0Var3 = qb0Var4.a;
                if (nb0Var3 != null && nb0Var3.f != null) {
                    nb0Var3.setText("");
                    nb0Var3.f[0].requestFocus();
                    break;
                }
                break;
        }
    }
}
