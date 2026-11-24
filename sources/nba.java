// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
                gl.d3(new t7a(nfaVar, z1bVar, (byte) 2), 100L);
                break;
            default:
                int[] iArr = nfa.t2;
                gl.d3(new t7a(nfaVar, z1bVar, (byte) 2), 100L);
                break;
        }
    }
}
