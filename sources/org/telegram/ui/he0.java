package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class he0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ je0 b;

    public /* synthetic */ he0(je0 je0Var, int i10) {
        this.a = i10;
        this.b = je0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                je0 je0Var = this.b;
                org.telegram.ui.Components.ak0 ak0Var = je0Var.e;
                ak0Var.getAnimatedDrawable().N(0, false, false);
                ak0Var.d();
                ld0 ld0Var = je0Var.a;
                if (ld0Var != null) {
                    ld0Var.f[0].requestFocus();
                    break;
                }
                break;
            case 1:
                je0 je0Var2 = this.b;
                int i10 = 0;
                je0Var2.w = false;
                while (true) {
                    xr[] xrVarArr = je0Var2.a.f;
                    if (i10 >= xrVarArr.length) {
                        break;
                    } else {
                        xrVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 2:
                je0 je0Var3 = this.b;
                je0Var3.postDelayed(new he0(je0Var3, 3), 150L);
                he0 he0Var = je0Var3.x;
                je0Var3.removeCallbacks(he0Var);
                je0Var3.postDelayed(he0Var, 3000L);
                je0Var3.w = true;
                break;
            default:
                ld0 ld0Var2 = this.b.a;
                int i11 = 0;
                ld0Var2.e = false;
                ld0Var2.f[0].requestFocus();
                while (true) {
                    xr[] xrVarArr2 = ld0Var2.f;
                    if (i11 >= xrVarArr2.length) {
                        break;
                    } else {
                        xrVarArr2[i11].i(0.0f);
                        i11++;
                    }
                }
        }
    }
}
