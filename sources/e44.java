// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class e44 extends g44 {
    public final na1 c;
    public final /* synthetic */ i44 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e44(i44 i44Var, long j, na1 na1Var) {
        super(j);
        this.d = i44Var;
        this.c = na1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.C(this.d);
    }

    @Override // g44
    public final String toString() {
        return super.toString() + this.c;
    }
}
