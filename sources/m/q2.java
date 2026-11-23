package m;

import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class q2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchView b;

    public /* synthetic */ q2(SearchView searchView, int i7) {
        this.a = i7;
        this.b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.r();
                break;
            default:
                i1.a aVar = this.b.i0;
                if (aVar instanceof y2) {
                    aVar.b(null);
                    break;
                }
                break;
        }
    }
}
