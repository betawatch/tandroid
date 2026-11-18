package org.telegram.messenger;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class rc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yf b;
    public final /* synthetic */ bd c;

    public /* synthetic */ rc(yf yfVar, bd bdVar, int i7) {
        this.a = i7;
        this.b = yfVar;
        this.c = bdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.run();
                this.c.a();
                break;
            default:
                this.b.run();
                this.c.a();
                break;
        }
    }
}
