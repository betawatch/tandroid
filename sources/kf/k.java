package kf;

import c8.b1;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class k extends p {
    public final /* synthetic */ int g;
    public final String h;
    public final String i;

    public /* synthetic */ k(int i7, String str, String str2) {
        this.g = i7;
        this.h = str;
        this.i = str2;
    }

    @Override // kf.p
    public final void a(b1 b1Var) {
        switch (this.g) {
            case 0:
                b1Var.i(this);
                break;
            default:
                b1Var.s(this);
                break;
        }
    }

    @Override // kf.p
    public final String f() {
        switch (this.g) {
            case 0:
                return "destination=" + this.h + ", title=" + this.i;
            default:
                return "destination=" + this.h + ", title=" + this.i;
        }
    }
}
