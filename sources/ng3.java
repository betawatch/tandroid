// default package

import android.animation.ValueAnimator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class ng3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ og3 b;

    public /* synthetic */ ng3(og3 og3Var, byte b) {
        this.a = b;
        this.b = og3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        og3 og3Var = this.b;
        switch (b) {
            case 0:
                ii3 ii3Var = og3Var.c0;
                ValueAnimator valueAnimator = ii3Var.k0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                ii3Var.l0 = null;
                break;
            default:
                og3Var.x = false;
                og3Var.invalidate();
                break;
        }
    }
}
