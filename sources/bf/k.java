package bf;

import v7.i0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class k extends p {
    public final /* synthetic */ int g;
    public final String h;
    public final String i;

    public /* synthetic */ k(int i10, String str, String str2) {
        this.g = i10;
        this.h = str;
        this.i = str2;
    }

    @Override // bf.p
    public final void a(i0 i0Var) {
        switch (this.g) {
            case 0:
                i0Var.i(this);
                break;
            default:
                i0Var.s(this);
                break;
        }
    }

    @Override // bf.p
    public final String f() {
        switch (this.g) {
            case 0:
                return "destination=" + this.h + ", title=" + this.i;
            default:
                return "destination=" + this.h + ", title=" + this.i;
        }
    }
}
