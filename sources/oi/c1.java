package oi;

import android.os.SystemClock;
import org.telegram.ui.ActionBar.m6;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class c1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;

    public /* synthetic */ c1(f1 f1Var, int i7) {
        this.a = i7;
        this.b = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f1 f1Var = this.b;
                if (f1Var.z2 >= 0) {
                    long uptimeMillis = (f1Var.y2 + 500) - SystemClock.uptimeMillis();
                    if (uptimeMillis > 0 && f1Var.isFocused()) {
                        f1Var.postDelayed(this, uptimeMillis);
                        break;
                    } else {
                        int i7 = f1Var.z2;
                        f1Var.z2 = -1;
                        f1Var.setInputType(i7);
                        break;
                    }
                }
                break;
            default:
                boolean h12 = m6.h1();
                f1 f1Var2 = this.b;
                if (!h12) {
                    f1Var2.J();
                    break;
                } else {
                    f1Var2.postDelayed(this, 100L);
                    break;
                }
        }
    }
}
