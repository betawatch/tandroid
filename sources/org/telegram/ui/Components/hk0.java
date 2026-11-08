package org.telegram.ui.Components;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jk0 b;

    public /* synthetic */ hk0(jk0 jk0Var, int i7) {
        this.a = i7;
        this.b = jk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jk0 jk0Var = this.b;
                jk0Var.getClass();
                org.telegram.messenger.g0.h3(new hk0(jk0Var, 2));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new hk0(this.b, 3));
                break;
            case 2:
                super/*android.app.Dialog*/.dismiss();
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
