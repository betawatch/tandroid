// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class nba implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nfa b;

    public /* synthetic */ nba(nfa nfaVar, byte b) {
        this.a = b;
        this.b = nfaVar;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        nfa nfaVar = this.b;
        z1b z1bVar = (z1b) obj;
        switch (b) {
            case 0:
                gl.e3(new t7a(nfaVar, z1bVar, (byte) 2), 100L);
                break;
            default:
                int[] iArr = nfa.t2;
                gl.e3(new t7a(nfaVar, z1bVar, (byte) 2), 100L);
                break;
        }
    }
}
