package org.telegram.ui.Components;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ es b;

    public /* synthetic */ yr(es esVar, int i10) {
        this.a = i10;
        this.b = esVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.W(false);
                break;
            default:
                es.Q(this.b);
                break;
        }
    }
}
