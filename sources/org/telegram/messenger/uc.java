package org.telegram.messenger;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class uc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ng b;
    public final /* synthetic */ ed c;

    public /* synthetic */ uc(ng ngVar, ed edVar, int i7) {
        this.a = i7;
        this.b = ngVar;
        this.c = edVar;
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
