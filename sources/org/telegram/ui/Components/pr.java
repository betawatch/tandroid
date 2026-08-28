package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wr b;

    public /* synthetic */ pr(wr wrVar, int i9) {
        this.a = i9;
        this.b = wrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.V(false);
                break;
            default:
                wr.P(this.b);
                break;
        }
    }
}
