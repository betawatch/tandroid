package m;

import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class q2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchView b;

    public /* synthetic */ q2(SearchView searchView, int i10) {
        this.a = i10;
        this.b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.r();
                break;
            default:
                h1.b bVar = this.b.h0;
                if (bVar instanceof z2) {
                    bVar.b(null);
                    break;
                }
                break;
        }
    }
}
