// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
