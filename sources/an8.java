// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class an8 implements lv8 {
    public final /* synthetic */ byte a = 0;
    public final lv8 b;
    public final lq5 c;

    public an8(lq5 lq5Var, lv8 lv8Var) {
        this.c = lq5Var;
        this.b = lv8Var;
    }

    @Override // mv8
    public final Object get() {
        byte b = this.a;
        lq5 lq5Var = this.c;
        lv8 lv8Var = this.b;
        switch (b) {
            case 0:
                return new zm8((Context) lq5Var.a, (wac) lv8Var.get());
            default:
                return new r89((ss) lv8Var.get(), (cy2) lq5Var.a);
        }
    }

    public an8(lv8 lv8Var, lq5 lq5Var) {
        this.b = lv8Var;
        this.c = lq5Var;
    }
}
