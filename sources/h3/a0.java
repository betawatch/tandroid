package h3;

import org.telegram.ui.ActionBar.c6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements d5.k, mg.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ a0(int i10, int i11, int i12) {
        this.a = i12;
        this.b = i10;
        this.c = i11;
    }

    @Override // mg.c
    public int i(c6 c6Var, boolean z10) {
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
