package m;

import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
