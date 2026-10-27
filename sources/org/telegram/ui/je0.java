package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class je0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ le0 b;

    public /* synthetic */ je0(le0 le0Var, int i10) {
        this.a = i10;
        this.b = le0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                le0 le0Var = this.b;
                org.telegram.ui.Components.bk0 bk0Var = le0Var.e;
                bk0Var.getAnimatedDrawable().N(0, false, false);
                bk0Var.d();
                nd0 nd0Var = le0Var.a;
                if (nd0Var != null) {
                    nd0Var.f[0].requestFocus();
                    break;
                }
                break;
            case 1:
                le0 le0Var2 = this.b;
                int i10 = 0;
                le0Var2.w = false;
                while (true) {
                    zr[] zrVarArr = le0Var2.a.f;
                    if (i10 >= zrVarArr.length) {
                        break;
                    } else {
                        zrVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 2:
                le0 le0Var3 = this.b;
                le0Var3.postDelayed(new je0(le0Var3, 3), 150L);
                je0 je0Var = le0Var3.x;
                le0Var3.removeCallbacks(je0Var);
                le0Var3.postDelayed(je0Var, 3000L);
                le0Var3.w = true;
                break;
            default:
                nd0 nd0Var2 = this.b.a;
                int i11 = 0;
                nd0Var2.e = false;
                nd0Var2.f[0].requestFocus();
                while (true) {
                    zr[] zrVarArr2 = nd0Var2.f;
                    if (i11 >= zrVarArr2.length) {
                        break;
                    } else {
                        zrVarArr2[i11].i(0.0f);
                        i11++;
                    }
                }
        }
    }
}
