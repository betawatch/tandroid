package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
