package kf;

import c8.f1;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
    public final void a(f1 f1Var) {
        switch (this.g) {
            case 0:
                f1Var.i(this);
                break;
            default:
                f1Var.s(this);
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
