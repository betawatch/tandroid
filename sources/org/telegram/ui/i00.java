package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class i00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h10 b;

    public /* synthetic */ i00(h10 h10Var, int i10) {
        this.a = i10;
        this.b = h10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h10.V(this.b);
                break;
            default:
                h10.W(this.b);
                break;
        }
    }
}
