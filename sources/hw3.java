// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class hw3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ kw3 c;

    public hw3(kw3 kw3Var, int i, int i2) {
        this.c = kw3Var;
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rc2 rc2Var;
        yv1 yv1Var;
        kw3 kw3Var = this.c;
        vr1 vr1Var = kw3Var.I;
        if (kw3Var.n) {
            int i = 0;
            while (true) {
                if (i >= vr1Var.getChildCount()) {
                    rc2Var = null;
                    break;
                }
                View childAt = vr1Var.getChildAt(i);
                if (childAt instanceof rc2) {
                    rc2Var = (rc2) childAt;
                    String V1 = rc2Var.getMessageObject().V1();
                    if (V1 == null) {
                        V1 = rc2Var.getMessageObject().k.message;
                    }
                    if (rc2Var.getPhotoImage().E() && V1 != null && rc2Var.getMessageObject().e1() == this.a) {
                        break;
                    }
                }
                i++;
            }
            if (rc2Var == null || (yv1Var = kw3Var.a) == null) {
                return;
            }
            yv1Var.hb(rc2Var);
            String V12 = rc2Var.getMessageObject().V1();
            if (!zx3.a(V12) && !"🍑".equals(V12) && !"⚰".equals(V12) && !rc2Var.getMessageObject().V3() && !rc2Var.getMessageObject().F2()) {
                try {
                    rc2Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
            kw3Var.n(rc2Var, this.b, false, true);
        }
    }
}
