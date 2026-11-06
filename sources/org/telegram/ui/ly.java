package org.telegram.ui;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ly implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gz b;

    public /* synthetic */ ly(gz gzVar, int i7) {
        this.a = i7;
        this.b = gzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gz.a0(this.b);
                break;
            default:
                gz.b0(this.b);
                break;
        }
    }
}
