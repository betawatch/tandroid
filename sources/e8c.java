// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class e8c extends UnsupportedOperationException {
    public final o94 a;

    public e8c(o94 o94Var) {
        this.a = o94Var;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.a));
    }
}
