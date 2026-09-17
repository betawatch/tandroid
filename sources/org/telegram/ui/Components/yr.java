package org.telegram.ui.Components;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
