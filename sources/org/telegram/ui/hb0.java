package org.telegram.ui;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ob0 b;

    public /* synthetic */ hb0(ob0 ob0Var, int i7) {
        this.a = i7;
        this.b = ob0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.o();
                break;
            case 1:
                ob0 ob0Var = this.b;
                ob0Var.postDelayed(new hb0(ob0Var, 2), 150L);
                hb0 hb0Var = ob0Var.S;
                ob0Var.removeCallbacks(hb0Var);
                ob0Var.postDelayed(hb0Var, 3000L);
                ob0Var.R = true;
                break;
            case 2:
                lb0 lb0Var = this.b.a;
                int i7 = 0;
                lb0Var.e = false;
                lb0Var.f[0].requestFocus();
                while (true) {
                    br[] brVarArr = lb0Var.f;
                    if (i7 >= brVarArr.length) {
                        break;
                    } else {
                        brVarArr[i7].z(0.0f);
                        i7++;
                    }
                }
            case 3:
                ob0 ob0Var2 = this.b;
                ob0Var2.postDelayed(new hb0(ob0Var2, 5), 150L);
                break;
            case 4:
                ob0 ob0Var3 = this.b;
                nb0 nb0Var = ob0Var3.Q;
                boolean z9 = false;
                ob0Var3.R = false;
                int i10 = 0;
                while (true) {
                    br[] brVarArr2 = ob0Var3.a.f;
                    if (i10 >= brVarArr2.length) {
                        if (nb0Var.getCurrentView() != ob0Var3.e) {
                            nb0Var.showNext();
                            FrameLayout frameLayout = ob0Var3.h;
                            if (ob0Var3.f.getVisibility() != 0 && ob0Var3.W.F != 3 && !ob0Var3.P) {
                                z9 = true;
                            }
                            org.telegram.messenger.g0.Z3(frameLayout, z9, 1.0f, true, true);
                            break;
                        }
                    } else {
                        brVarArr2[i10].z(0.0f);
                        i10++;
                    }
                }
                break;
            case 5:
                lb0 lb0Var2 = this.b.a;
                int i11 = 0;
                lb0Var2.e = false;
                lb0Var2.f[0].requestFocus();
                while (true) {
                    br[] brVarArr3 = lb0Var2.f;
                    if (i11 >= brVarArr3.length) {
                        break;
                    } else {
                        brVarArr3[i11].z(0.0f);
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
                ob0 ob0Var4 = this.b;
                org.telegram.ui.Components.ch0 ch0Var = ob0Var4.x;
                ch0Var.getAnimatedDrawable().N(0, false, false);
                ch0Var.d();
                lb0 lb0Var3 = ob0Var4.a;
                if (lb0Var3 != null && lb0Var3.f != null) {
                    lb0Var3.setText("");
                    lb0Var3.f[0].requestFocus();
                    break;
                }
                break;
        }
    }
}
