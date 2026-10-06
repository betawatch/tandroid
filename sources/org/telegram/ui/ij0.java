package org.telegram.ui;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ij0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oj0 b;

    public /* synthetic */ ij0(oj0 oj0Var, int i10) {
        this.a = i10;
        this.b = oj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            case 1:
                this.b.S(true, false);
                break;
            default:
                this.b.S(true, false);
                break;
        }
    }
}
