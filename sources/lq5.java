// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lq5 implements lv8, l0a {
    public final Object a;

    public /* synthetic */ lq5(Object obj) {
        this.a = obj;
    }

    public static lq5 a(Object obj) {
        if (obj != null) {
            return new lq5(obj);
        }
        gxc.d("instance cannot be null");
        return null;
    }

    @Override // mv8
    public final Object get() {
        return this.a;
    }
}
