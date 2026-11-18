package oi;

import android.os.SystemClock;
import org.telegram.ui.ActionBar.n6;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class b1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1 b;

    public /* synthetic */ b1(e1 e1Var, int i7) {
        this.a = i7;
        this.b = e1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e1 e1Var = this.b;
                if (e1Var.z2 >= 0) {
                    long uptimeMillis = (e1Var.y2 + 500) - SystemClock.uptimeMillis();
                    if (uptimeMillis > 0 && e1Var.isFocused()) {
                        e1Var.postDelayed(this, uptimeMillis);
                        break;
                    } else {
                        int i7 = e1Var.z2;
                        e1Var.z2 = -1;
                        e1Var.setInputType(i7);
                        break;
                    }
                }
                break;
            default:
                boolean h12 = n6.h1();
                e1 e1Var2 = this.b;
                if (!h12) {
                    e1Var2.J();
                    break;
                } else {
                    e1Var2.postDelayed(this, 100L);
                    break;
                }
        }
    }
}
