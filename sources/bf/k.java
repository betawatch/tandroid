package bf;

import v7.i0;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
