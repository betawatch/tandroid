package gg;

import org.telegram.ui.py;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ f(m mVar, int i10) {
        this.a = i10;
        this.b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                for (py pyVar : this.b.R.e0) {
                    ((s4.c0) pyVar.a.getLayoutManager()).u = false;
                }
                break;
            default:
                this.b.J();
                break;
        }
    }
}
