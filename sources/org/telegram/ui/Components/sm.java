package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class sm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;
    public final /* synthetic */ int c;

    public /* synthetic */ sm(rn rnVar, int i7, int i10) {
        this.a = i10;
        this.b = rnVar;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.j0(this.c, null);
                break;
            case 1:
                this.b.g0(this.c);
                break;
            default:
                this.b.j0(this.c, null);
                break;
        }
    }
}
