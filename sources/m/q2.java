package m;

import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
