package org.telegram.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class dz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ez b;

    public /* synthetic */ dz(ez ezVar, int i7) {
        this.a = i7;
        this.b = ezVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d();
                break;
            case 1:
                this.b.a();
                break;
            default:
                ez ezVar = this.b;
                ezVar.b(ezVar.E);
                break;
        }
    }
}
