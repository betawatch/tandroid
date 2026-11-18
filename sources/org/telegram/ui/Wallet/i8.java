package org.telegram.ui.Wallet;

import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class i8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e8 b;

    public /* synthetic */ i8(e8 e8Var, int i7) {
        this.a = i7;
        this.b = e8Var;
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
