package org.telegram.messenger;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class sc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zf b;
    public final /* synthetic */ cd c;

    public /* synthetic */ sc(zf zfVar, cd cdVar, int i7) {
        this.a = i7;
        this.b = zfVar;
        this.c = cdVar;
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
