// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class cn7 extends yu9 {
    public final /* synthetic */ hn7 d;

    public cn7(hn7 hn7Var) {
        this.d = hn7Var;
    }

    @Override // yu9
    public final void c(boolean z) {
        this.d.a(!z);
    }

    @Override // yu9
    public final CharSequence d() {
        hn7 hn7Var = this.d;
        q8c q8cVar = hn7Var.v0;
        int i = hn7Var.I;
        return q8cVar != null ? (CharSequence) q8cVar.a(Integer.valueOf(i)) : hn7Var.d(i);
    }
}
