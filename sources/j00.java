// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class j00 {
    public boolean a;
    public boolean b;
    public boolean c;

    public j00() {
        this.a = false;
        this.b = false;
        this.c = false;
    }

    public final k00 a() {
        if (this.a || !(this.b || this.c)) {
            return new k00(this);
        }
        sc8.j("Secondary offload attribute fields are true but primary isFormatSupported is false");
        return null;
    }

    public /* synthetic */ j00(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }
}
