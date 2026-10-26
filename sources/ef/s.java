package ef;

import a8.bc;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class s extends p {
    public String g;

    public s(String str) {
        this.g = str;
    }

    @Override // ef.p
    public final void a(bc bcVar) {
        bcVar.o(this);
    }

    @Override // ef.p
    public final String f() {
        return "literal=" + this.g;
    }
}
