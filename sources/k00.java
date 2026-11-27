// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class k00 {
    public boolean a;
    public boolean b;
    public boolean c;

    public k00() {
        this.a = false;
        this.b = false;
        this.c = false;
    }

    public final l00 a() {
        if (this.a || !(this.b || this.c)) {
            return new l00(this);
        }
        grb.i("Secondary offload attribute fields are true but primary isFormatSupported is false");
        return null;
    }

    public /* synthetic */ k00(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }
}
