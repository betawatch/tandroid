// default package

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ej8 extends k69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kj8 b;

    public /* synthetic */ ej8(kj8 kj8Var, byte b) {
        this.a = b;
        this.b = kj8Var;
    }

    @Override // k69
    public final void b(RecyclerView recyclerView, int i, int i2) {
        byte b = this.a;
        kj8 kj8Var = this.b;
        switch (b) {
            case 0:
                kj8Var.b.invalidate();
                kj8Var.D0();
                break;
            default:
                kj8Var.b.invalidate();
                kj8Var.D0();
                break;
        }
    }
}
