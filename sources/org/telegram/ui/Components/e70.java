package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f70 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ e70(f70 f70Var, boolean z9, boolean z10, int i7) {
        this.a = i7;
        this.b = f70Var;
        this.c = z9;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new e70(this.b, this.c, this.d, 1));
                break;
            default:
                f70 f70Var = this.b;
                f70Var.setJoinRequest(this.c);
                f70Var.setJoinToSend(this.d);
                break;
        }
    }
}
