// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class dg7 extends Exception {
    public final byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg7(String str, Throwable th) {
        super(str, th);
        ite.g(str, "Provided message must not be empty.");
        this.a = (byte) 13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public dg7(String str, int i) {
        super(str);
        ite.g(str, "Provided message must not be empty.");
        this.a = i;
    }
}
