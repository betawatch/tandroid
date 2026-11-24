// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
