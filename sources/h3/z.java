package h3;

import org.telegram.ui.ActionBar.b6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements d5.k, lg.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ z(int i9, int i10, int i11) {
        this.a = i11;
        this.b = i9;
        this.c = i10;
    }

    @Override // lg.c
    public int g(b6 b6Var, boolean z10) {
        return z10 ? this.b : this.c;
    }

    @Override // d5.k
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((a2) obj).onSurfaceSizeChanged(this.b, this.c);
                break;
            default:
                ((a2) obj).onSurfaceSizeChanged(this.b, this.c);
                break;
        }
    }
}
