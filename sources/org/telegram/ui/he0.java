package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class he0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ je0 b;

    public /* synthetic */ he0(je0 je0Var, int i9) {
        this.a = i9;
        this.b = je0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                je0 je0Var = this.b;
                org.telegram.ui.Components.pi0 pi0Var = je0Var.e;
                pi0Var.getAnimatedDrawable().L(0, false, false);
                pi0Var.d();
                ld0 ld0Var = je0Var.a;
                if (ld0Var != null) {
                    ld0Var.f[0].requestFocus();
                    break;
                }
                break;
            case 1:
                je0 je0Var2 = this.b;
                int i9 = 0;
                je0Var2.w = false;
                while (true) {
                    vr[] vrVarArr = je0Var2.a.f;
                    if (i9 >= vrVarArr.length) {
                        break;
                    } else {
                        vrVarArr[i9].i(0.0f);
                        i9++;
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
                int i10 = 0;
                ld0Var2.e = false;
                ld0Var2.f[0].requestFocus();
                while (true) {
                    vr[] vrVarArr2 = ld0Var2.f;
                    if (i10 >= vrVarArr2.length) {
                        break;
                    } else {
                        vrVarArr2[i10].i(0.0f);
                        i10++;
                    }
                }
        }
    }
}
