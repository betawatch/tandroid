package m;

import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
