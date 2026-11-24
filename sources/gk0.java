// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class gk0 extends tg6 {
    @Override // tg6
    public final void e(tg6 tg6Var) {
        if (tg6Var instanceof gk0) {
            this.b = tg6Var;
        } else {
            w26.j("Parent of block must also be block (can not be inline)");
        }
    }
}
