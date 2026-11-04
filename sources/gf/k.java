package gf;

import b8.lc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k extends p {
    public final /* synthetic */ int g;
    public final String h;
    public final String i;

    public /* synthetic */ k(int i3, String str, String str2) {
        this.g = i3;
        this.h = str;
        this.i = str2;
    }

    @Override // gf.p
    public final void a(lc lcVar) {
        switch (this.g) {
            case 0:
                lcVar.i(this);
                break;
            default:
                lcVar.s(this);
                break;
        }
    }

    @Override // gf.p
    public final String f() {
        switch (this.g) {
            case 0:
                return "destination=" + this.h + ", title=" + this.i;
            default:
                return "destination=" + this.h + ", title=" + this.i;
        }
    }
}
