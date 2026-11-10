package org.telegram.messenger;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class wc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ id b;
    public final /* synthetic */ int c;

    public /* synthetic */ wc(id idVar, int i7, int i10) {
        this.a = i10;
        this.b = idVar;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                id idVar = this.b;
                idVar.P = false;
                idVar.j(this.c);
                break;
            case 1:
                id idVar2 = this.b;
                idVar2.P = false;
                idVar2.j(this.c);
                break;
            case 2:
                this.b.Z0(this.c, null, true, null);
                break;
            default:
                this.b.Z0(this.c, null, true, null);
                break;
        }
    }
}
