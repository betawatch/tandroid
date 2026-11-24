// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class bnd {
    public static void a(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            u36.h(i3, ts2.o("fromIndex: ", i, ", toIndex: ", i2, ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            u36.j(b10.g(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }
}
