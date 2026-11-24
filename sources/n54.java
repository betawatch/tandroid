// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class n54 implements lv8 {
    public final /* synthetic */ byte a;
    public final lq5 b;

    public /* synthetic */ n54(lq5 lq5Var, byte b) {
        this.a = b;
        this.b = lq5Var;
    }

    @Override // mv8
    public final Object get() {
        byte b = this.a;
        lq5 lq5Var = this.b;
        switch (b) {
            case 0:
                return new m54((nv8) lq5Var.a);
            default:
                return new va6((Context) lq5Var.a);
        }
    }
}
