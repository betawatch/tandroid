// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class mw0 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mw0(Object obj, int i, int i2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i;
        j79 adapter;
        byte b = this.a;
        Object obj = this.d;
        int i2 = this.c;
        int i3 = this.b;
        switch (b) {
            case 0:
                xw0 xw0Var = (xw0) obj;
                xw0Var.T = vm2.f(1.0f, i3, i2);
                xw0Var.h();
                break;
            case 1:
                o95 o95Var = (o95) obj;
                o95Var.M = i3;
                o95Var.N = i2;
                o95Var.G.setColorFilter(new PorterDuffColorFilter(o95Var.M, PorterDuff.Mode.MULTIPLY));
                o95Var.F.setColor(o95Var.M);
                o95Var.r.setColor(o95Var.N);
                o95Var.K.d(vm2.o(o95Var.N, 38));
                break;
            case 2:
                ka5 ka5Var = (ka5) obj;
                ka5Var.B0 = i3;
                ka5Var.C0 = i3;
                ka5Var.D0 = i2;
                ka5Var.T.setColor(i2);
                if (ka5Var.S > 0.0f) {
                    ka5Var.invalidate();
                    break;
                }
                break;
            case 3:
                eja ejaVar = (eja) obj;
                zha[] zhaVarArr = ejaVar.n0;
                ejaVar.M1.e();
                ejaVar.r1 = false;
                int[] iArr = ejaVar.p1;
                iArr[i3] = i2;
                for (int i4 = 0; i4 < zhaVarArr.length; i4++) {
                    zha zhaVar = zhaVarArr[i4];
                    if (zhaVar != null && zhaVar.h != null && (((i = zhaVar.F) == 0 || eja.j0(i)) && (adapter = zhaVarArr[i4].h.getAdapter()) != null)) {
                        int b2 = adapter.b();
                        if (i4 == 0) {
                            ejaVar.w1[0].g(false);
                        }
                        zhaVarArr[i4].x.x1(iArr[i3]);
                        zhaVarArr[i4].h.c0();
                        if (adapter.b() == b2) {
                            hl.V3(zhaVarArr[i4].h);
                        } else {
                            adapter.f();
                        }
                        zhaVarArr[i4].n.setVisibility(8);
                    }
                }
                ejaVar.e1();
                break;
            default:
                if (i3 != i2) {
                    ((rbb) obj).P(i3, i2);
                    break;
                }
                break;
        }
    }
}
