package org.telegram.ui.Components.voip;

import org.telegram.ui.Components.fi0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jg.b1 b;
    public final /* synthetic */ fi0 c;

    public /* synthetic */ u0(jg.b1 b1Var, fi0 fi0Var, int i10) {
        this.a = i10;
        this.b = b1Var;
        this.c = fi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.i0.g3(new u0(this.b, this.c, 1));
                break;
            default:
                this.b.removeView(this.c);
                break;
        }
    }
}
