package m;

import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class r2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchView b;

    public /* synthetic */ r2(SearchView searchView, int i10) {
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
                if (bVar instanceof b3) {
                    bVar.b(null);
                    break;
                }
                break;
        }
    }
}
