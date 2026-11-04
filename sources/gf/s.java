package gf;

import b8.lc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class s extends p {
    public String g;

    public s(String str) {
        this.g = str;
    }

    @Override // gf.p
    public final void a(lc lcVar) {
        lcVar.o(this);
    }

    @Override // gf.p
    public final String f() {
        return "literal=" + this.g;
    }
}
