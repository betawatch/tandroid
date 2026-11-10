package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dz b;

    public /* synthetic */ cz(dz dzVar, int i7) {
        this.a = i7;
        this.b = dzVar;
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
                dz dzVar = this.b;
                dzVar.b(dzVar.D);
                break;
        }
    }
}
