package org.telegram.ui.Components;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class o7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m8 b;

    public /* synthetic */ o7(m8 m8Var, int i10) {
        this.a = i10;
        this.b = m8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m8.o(this.b);
                break;
            default:
                m8.H(this.b);
                break;
        }
    }
}
