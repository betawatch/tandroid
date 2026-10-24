package org.telegram.ui.Wallet;

import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g7 b;

    public /* synthetic */ j7(g7 g7Var, int i10) {
        this.a = i10;
        this.b = g7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.animate().rotation(0.0f).setDuration(120L).start();
                break;
            default:
                this.b.animate().scaleX(1.0f).scaleY(1.0f).setDuration(260L).setInterpolator(new OvershootInterpolator(2.0f)).start();
                break;
        }
    }
}
