package org.telegram.messenger;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class rk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Runnable[] c;

    public /* synthetic */ rk(boolean[] zArr, Runnable[] runnableArr, int i7) {
        this.a = i7;
        this.b = zArr;
        this.c = runnableArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b[0] = true;
                Runnable runnable = this.c[0];
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                this.b[0] = true;
                Runnable runnable2 = this.c[0];
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
        }
    }
}
