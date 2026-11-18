package org.telegram.messenger;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class tm implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0.a b;
    public final /* synthetic */ int c;

    public /* synthetic */ tm(q0.a aVar, int i7, int i10) {
        this.a = i10;
        this.b = aVar;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.accept(Integer.valueOf(this.c));
                break;
            default:
                this.b.accept(Integer.valueOf(this.c));
                break;
        }
    }
}
