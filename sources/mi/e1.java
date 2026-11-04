package mi;

import android.os.SystemClock;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class e1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h1 b;

    public /* synthetic */ e1(h1 h1Var, int i3) {
        this.a = i3;
        this.b = h1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h1 h1Var = this.b;
                if (h1Var.u2 >= 0) {
                    long uptimeMillis = (h1Var.t2 + 500) - SystemClock.uptimeMillis();
                    if (uptimeMillis > 0 && h1Var.isFocused()) {
                        h1Var.postDelayed(this, uptimeMillis);
                        break;
                    } else {
                        int i3 = h1Var.u2;
                        h1Var.u2 = -1;
                        h1Var.setInputType(i3);
                        break;
                    }
                }
                break;
            default:
                boolean h12 = k6.h1();
                h1 h1Var2 = this.b;
                if (!h12) {
                    h1Var2.I();
                    break;
                } else {
                    h1Var2.postDelayed(this, 100L);
                    break;
                }
        }
    }
}
