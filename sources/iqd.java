// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class iqd {
    public static boolean a(int i, int i2) {
        return (i & i2) != 0;
    }

    public static int b(int i, int i2, boolean z) {
        return z ? i | i2 : i & (~i2);
    }
}
