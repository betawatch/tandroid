// default package

import android.location.Location;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class i52 implements gu2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n52 b;

    public /* synthetic */ i52(n52 n52Var, byte b) {
        this.a = b;
        this.b = n52Var;
    }

    @Override // gu2
    public final void accept(Object obj) {
        byte b = this.a;
        n52 n52Var = this.b;
        switch (b) {
            case 0:
                n52Var.S((s05) obj);
                break;
            default:
                n52Var.a0((Location) obj);
                break;
        }
    }
}
