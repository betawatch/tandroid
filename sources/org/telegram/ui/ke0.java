package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ke0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ me0 b;

    public /* synthetic */ ke0(me0 me0Var, int i10) {
        this.a = i10;
        this.b = me0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                me0 me0Var = this.b;
                org.telegram.ui.Components.ri0 ri0Var = me0Var.e;
                ri0Var.getAnimatedDrawable().L(0, false, false);
                ri0Var.d();
                od0 od0Var = me0Var.a;
                if (od0Var != null) {
                    od0Var.f[0].requestFocus();
                    break;
                }
                break;
            case 1:
                me0 me0Var2 = this.b;
                int i10 = 0;
                me0Var2.w = false;
                while (true) {
                    wr[] wrVarArr = me0Var2.a.f;
                    if (i10 >= wrVarArr.length) {
                        break;
                    } else {
                        wrVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 2:
                me0 me0Var3 = this.b;
                me0Var3.postDelayed(new ke0(me0Var3, 3), 150L);
                ke0 ke0Var = me0Var3.x;
                me0Var3.removeCallbacks(ke0Var);
                me0Var3.postDelayed(ke0Var, 3000L);
                me0Var3.w = true;
                break;
            default:
                od0 od0Var2 = this.b.a;
                int i11 = 0;
                od0Var2.e = false;
                od0Var2.f[0].requestFocus();
                while (true) {
                    wr[] wrVarArr2 = od0Var2.f;
                    if (i11 >= wrVarArr2.length) {
                        break;
                    } else {
                        wrVarArr2[i11].i(0.0f);
                        i11++;
                    }
                }
        }
    }
}
