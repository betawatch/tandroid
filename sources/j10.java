// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class j10 {
    public boolean a;
    public boolean b;
    public boolean c;

    public j10() {
        this.a = false;
        this.b = false;
        this.c = false;
    }

    public final k10 a() {
        if (this.a || !(this.b || this.c)) {
            return new k10(this);
        }
        dq9.m("Secondary offload attribute fields are true but primary isFormatSupported is false");
        return null;
    }

    public /* synthetic */ j10(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }
}
