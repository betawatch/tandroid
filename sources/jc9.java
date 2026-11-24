// default package

import android.os.SystemClock;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class jc9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mc9 b;

    public /* synthetic */ jc9(mc9 mc9Var, byte b) {
        this.a = b;
        this.b = mc9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        mc9 mc9Var = this.b;
        switch (b) {
            case 0:
                if (mc9Var.z2 >= 0) {
                    long uptimeMillis = (mc9Var.y2 + 500) - SystemClock.uptimeMillis();
                    if (uptimeMillis > 0 && mc9Var.isFocused()) {
                        mc9Var.postDelayed(this, uptimeMillis);
                        break;
                    } else {
                        int i = mc9Var.z2;
                        mc9Var.z2 = -1;
                        mc9Var.setInputType(i);
                        break;
                    }
                }
                break;
            default:
                if (!bkb.f1()) {
                    mc9Var.J();
                    break;
                } else {
                    mc9Var.postDelayed(this, 100L);
                    break;
                }
        }
    }
}
