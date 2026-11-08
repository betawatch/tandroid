package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zy0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bz0 b;
    public final /* synthetic */ az0 c;

    public /* synthetic */ zy0(bz0 bz0Var, az0 az0Var, int i7) {
        this.a = i7;
        this.b = bz0Var;
        this.c = az0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(this.c);
                break;
            case 1:
                this.b.a(this.c);
                break;
            default:
                this.b.a(this.c);
                break;
        }
    }
}
