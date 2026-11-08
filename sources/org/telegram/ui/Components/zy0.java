package org.telegram.ui.Components;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
