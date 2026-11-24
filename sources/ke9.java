// default package

import android.os.SystemClock;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class ke9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ne9 b;

    public /* synthetic */ ke9(ne9 ne9Var, byte b) {
        this.a = b;
        this.b = ne9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ne9 ne9Var = this.b;
        switch (b) {
            case 0:
                if (ne9Var.z2 >= 0) {
                    long uptimeMillis = (ne9Var.y2 + 500) - SystemClock.uptimeMillis();
                    if (uptimeMillis > 0 && ne9Var.isFocused()) {
                        ne9Var.postDelayed(this, uptimeMillis);
                        break;
                    } else {
                        int i = ne9Var.z2;
                        ne9Var.z2 = -1;
                        ne9Var.setInputType(i);
                        break;
                    }
                }
                break;
            default:
                if (!cmb.f1()) {
                    ne9Var.J();
                    break;
                } else {
                    ne9Var.postDelayed(this, 100L);
                    break;
                }
        }
    }
}
