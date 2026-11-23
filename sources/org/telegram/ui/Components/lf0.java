package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class lf0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ of0 b;

    public /* synthetic */ lf0(of0 of0Var, int i7) {
        this.a = i7;
        this.b = of0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(true);
                break;
            default:
                this.b.d();
                break;
        }
    }
}
