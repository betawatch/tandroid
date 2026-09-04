package eh;

import b2.z0;
import e2.m;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements d, m {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ c(int i10, int i11, int i12) {
        this.a = i12;
        this.b = i10;
        this.c = i11;
    }

    @Override // eh.d
    public int f(f6 f6Var, boolean z10) {
        return z10 ? this.b : this.c;
    }

    @Override // e2.m
    public void invoke(Object obj) {
        switch (this.a) {
            case 1:
                ((z0) obj).onSurfaceSizeChanged(this.b, this.c);
                break;
            default:
                ((z0) obj).onSurfaceSizeChanged(this.b, this.c);
                break;
        }
    }
}
