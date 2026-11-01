package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class me implements o1.g {
    public boolean a = false;
    public final /* synthetic */ float b;
    public final /* synthetic */ mu0 c;

    public me(float f7, mu0 mu0Var) {
        this.b = f7;
        this.c = mu0Var;
    }

    @Override // o1.g
    public final void a(o1.j jVar, float f7, float f10) {
        if (this.a || f7 < this.b) {
            return;
        }
        this.a = true;
        try {
            this.c.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }
}
