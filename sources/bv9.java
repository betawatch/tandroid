// default package

import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bv9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SearchView b;

    public /* synthetic */ bv9(SearchView searchView, byte b) {
        this.a = b;
        this.b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        SearchView searchView = this.b;
        switch (b) {
            case 0:
                searchView.r();
                break;
            default:
                o53 o53Var = searchView.i0;
                if (o53Var instanceof mdb) {
                    o53Var.b(null);
                    break;
                }
                break;
        }
    }
}
