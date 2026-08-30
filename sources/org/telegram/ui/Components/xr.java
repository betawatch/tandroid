package org.telegram.ui.Components;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ es b;

    public /* synthetic */ xr(es esVar, int i10) {
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
