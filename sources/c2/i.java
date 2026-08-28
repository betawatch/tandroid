package c2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i extends r {
    public final String a;
    public final h b;

    public i(String str, h hVar) {
        this.a = str;
        this.b = hVar;
    }

    @Override // c2.r
    public final void f(int i9) {
        h hVar;
        String str = this.a;
        if (str == null || (hVar = this.b) == null) {
            return;
        }
        hVar.q(i9, str);
    }

    @Override // c2.r
    public final void i(int i9) {
        h hVar;
        String str = this.a;
        if (str == null || (hVar = this.b) == null) {
            return;
        }
        hVar.r(i9, str);
    }
}
