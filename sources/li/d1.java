package li;

import android.os.SystemClock;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class d1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1 b;

    public /* synthetic */ d1(g1 g1Var, int i7) {
        this.a = i7;
        this.b = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g1 g1Var = this.b;
                if (g1Var.t2 >= 0) {
                    long uptimeMillis = (g1Var.s2 + 500) - SystemClock.uptimeMillis();
                    if (uptimeMillis > 0 && g1Var.isFocused()) {
                        g1Var.postDelayed(this, uptimeMillis);
                        break;
                    } else {
                        int i7 = g1Var.t2;
                        g1Var.t2 = -1;
                        g1Var.setInputType(i7);
                        break;
                    }
                }
                break;
            default:
                boolean h12 = k6.h1();
                g1 g1Var2 = this.b;
                if (!h12) {
                    g1Var2.I();
                    break;
                } else {
                    g1Var2.postDelayed(this, 100L);
                    break;
                }
        }
    }
}
