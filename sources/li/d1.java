package li;

import android.os.SystemClock;
import org.telegram.ui.ActionBar.m6;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                boolean h12 = m6.h1();
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
