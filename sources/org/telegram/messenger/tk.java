package org.telegram.messenger;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class tk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Runnable[] c;

    public /* synthetic */ tk(boolean[] zArr, Runnable[] runnableArr, int i7) {
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
