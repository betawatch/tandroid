package c2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class i extends s {
    public final String a;
    public final h b;

    public i(String str, h hVar) {
        this.a = str;
        this.b = hVar;
    }

    @Override // c2.s
    public final void f(int i10) {
        h hVar;
        String str = this.a;
        if (str == null || (hVar = this.b) == null) {
            return;
        }
        hVar.q(i10, str);
    }

    @Override // c2.s
    public final void i(int i10) {
        h hVar;
        String str = this.a;
        if (str == null || (hVar = this.b) == null) {
            return;
        }
        hVar.r(i10, str);
    }
}
