package c2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i extends r {
    public final String a;
    public final h b;

    public i(String str, h hVar) {
        this.a = str;
        this.b = hVar;
    }

    @Override // c2.r
    public final void f(int i10) {
        h hVar;
        String str = this.a;
        if (str == null || (hVar = this.b) == null) {
            return;
        }
        hVar.q(i10, str);
    }

    @Override // c2.r
    public final void i(int i10) {
        h hVar;
        String str = this.a;
        if (str == null || (hVar = this.b) == null) {
            return;
        }
        hVar.r(i10, str);
    }
}
