package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class j80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n2.o0 b;
    public final /* synthetic */ n80 c;

    public /* synthetic */ j80(n2.o0 o0Var, n80 n80Var, int i7) {
        this.a = i7;
        this.b = o0Var;
        this.c = n80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.m(this.c, false);
                break;
            default:
                this.b.m(this.c, false);
                break;
        }
    }
}
