package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ae0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ me0 b;

    public /* synthetic */ ae0(me0 me0Var, int i10) {
        this.a = i10;
        this.b = me0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bs[] bsVarArr;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        me0 me0Var = this.b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.ei0 ei0Var = me0Var.G;
                zr zrVar = me0Var.f;
                int i13 = me0Var.h0;
                if (i13 != 3 && (bsVarArr = zrVar.f) != null) {
                    for (int length = bsVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || zrVar.f[length].length() != 0) {
                            zrVar.f[length].requestFocus();
                            bs bsVar = zrVar.f[length];
                            bsVar.setSelection(bsVar.length());
                            hf0.Z0(me0Var.u0, zrVar.f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.bi0 bi0Var = me0Var.a;
                if (bi0Var != null) {
                    bi0Var.start();
                }
                if (i13 == 15) {
                    ei0Var.getAnimatedDrawable().N(0, false, false);
                    ei0Var.getAnimatedDrawable().start();
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.i0.g3(new ae0(me0Var, 6));
                break;
            case 2:
                vc0 vc0Var = me0Var.x;
                me0Var.s0 = false;
                while (true) {
                    bs[] bsVarArr2 = me0Var.f.f;
                    if (i12 < bsVarArr2.length) {
                        bsVarArr2[i12].z(0.0f);
                        i12++;
                    } else if (vc0Var.getCurrentView() != (me0Var.h0 == 15 ? me0Var.F : me0Var.D)) {
                        vc0Var.showNext();
                        break;
                    }
                }
                break;
            case 3:
                org.telegram.messenger.i0.g3(new ae0(me0Var, 4));
                break;
            case 4:
                org.telegram.ui.Components.ei0 ei0Var2 = me0Var.s;
                ei0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.bi0 bi0Var2 = me0Var.Q;
                bi0Var2.N(0, false, false);
                bi0Var2.K(1);
                ei0Var2.setAnimation(bi0Var2);
                ei0Var2.d();
                break;
            case 5:
                try {
                    me0Var.u0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(me0Var.getContext());
                String L0 = org.telegram.messenger.cd.L0(2131742823, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.cd.a0(null, null, 2131752534, org.telegram.messenger.m5.h(new StringBuilder("+"), me0Var.d, af.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                x1Var.setOnDismissListener(new ie0(me0Var, i11));
                alertDialog$Builder.p();
                break;
            case 6:
                org.telegram.ui.Components.bi0 bi0Var3 = me0Var.R;
                bi0Var3.t0 = new ae0(me0Var, 8);
                org.telegram.ui.Components.ei0 ei0Var3 = me0Var.s;
                ei0Var3.setAutoRepeat(false);
                bi0Var3.N(0, false, false);
                ei0Var3.setAnimation(bi0Var3);
                ei0Var3.d();
                break;
            case 7:
                me0Var.postDelayed(new ae0(me0Var, 9), 150L);
                break;
            case 8:
                org.telegram.messenger.i0.g3(new ae0(me0Var, 10));
                break;
            case 9:
                zr zrVar2 = me0Var.f;
                zrVar2.e = false;
                zrVar2.f[0].requestFocus();
                while (true) {
                    bs[] bsVarArr3 = zrVar2.f;
                    if (i12 >= bsVarArr3.length) {
                        break;
                    } else {
                        bsVarArr3[i12].z(0.0f);
                        i12++;
                    }
                }
            default:
                org.telegram.ui.Components.ei0 ei0Var4 = me0Var.s;
                ei0Var4.setAutoRepeat(false);
                ei0Var4.setAnimation(me0Var.a);
                break;
        }
    }
}
