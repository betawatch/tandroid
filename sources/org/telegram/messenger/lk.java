package org.telegram.messenger;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class lk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;

    public /* synthetic */ lk(int i7, boolean[] zArr) {
        this.a = i7;
        this.b = zArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b[0] = true;
                break;
            default:
                this.b[0] = true;
                break;
        }
    }
}
