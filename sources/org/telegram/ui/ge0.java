package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ge0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ie0 b;

    public /* synthetic */ ge0(ie0 ie0Var, int i10) {
        this.a = i10;
        this.b = ie0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ie0 ie0Var = this.b;
                org.telegram.ui.Components.aj0 aj0Var = ie0Var.e;
                aj0Var.getAnimatedDrawable().L(0, false, false);
                aj0Var.d();
                md0 md0Var = ie0Var.a;
                if (md0Var != null) {
                    md0Var.f[0].requestFocus();
                    break;
                }
                break;
            case 1:
                ie0 ie0Var2 = this.b;
                int i10 = 0;
                ie0Var2.w = false;
                while (true) {
                    ur[] urVarArr = ie0Var2.a.f;
                    if (i10 >= urVarArr.length) {
                        break;
                    } else {
                        urVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 2:
                ie0 ie0Var3 = this.b;
                ie0Var3.postDelayed(new ge0(ie0Var3, 3), 150L);
                ge0 ge0Var = ie0Var3.x;
                ie0Var3.removeCallbacks(ge0Var);
                ie0Var3.postDelayed(ge0Var, 3000L);
                ie0Var3.w = true;
                break;
            default:
                md0 md0Var2 = this.b.a;
                int i11 = 0;
                md0Var2.e = false;
                md0Var2.f[0].requestFocus();
                while (true) {
                    ur[] urVarArr2 = md0Var2.f;
                    if (i11 >= urVarArr2.length) {
                        break;
                    } else {
                        urVarArr2[i11].i(0.0f);
                        i11++;
                    }
                }
        }
    }
}
