package org.telegram.ui.Wallet;

import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p7 b;

    public /* synthetic */ s7(p7 p7Var, int i7) {
        this.a = i7;
        this.b = p7Var;
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
