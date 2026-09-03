package c2;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
