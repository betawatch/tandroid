package org.telegram.messenger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class om implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0.a b;
    public final /* synthetic */ int c;

    public /* synthetic */ om(q0.a aVar, int i3, int i10) {
        this.a = i10;
        this.b = aVar;
        this.c = i3;
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
