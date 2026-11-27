// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class lg7 extends Exception {
    public final byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg7(String str, Throwable th) {
        super(str, th);
        xve.g(str, "Provided message must not be empty.");
        this.a = (byte) 13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lg7(String str, int i) {
        super(str);
        xve.g(str, "Provided message must not be empty.");
        this.a = i;
    }
}
