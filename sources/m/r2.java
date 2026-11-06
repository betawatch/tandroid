package m;

import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class r2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchView b;

    public /* synthetic */ r2(SearchView searchView, int i7) {
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
                i1.a aVar = this.b.h0;
                if (aVar instanceof z2) {
                    aVar.b(null);
                    break;
                }
                break;
        }
    }
}
