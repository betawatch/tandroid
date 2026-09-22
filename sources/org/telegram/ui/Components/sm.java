package org.telegram.ui.Components;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class sm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ int c;

    public /* synthetic */ sm(un unVar, int i10, int i11) {
        this.a = i11;
        this.b = unVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e0(this.c, null);
                break;
            case 1:
                this.b.b0(this.c);
                break;
            default:
                this.b.e0(this.c, null);
                break;
        }
    }
}
