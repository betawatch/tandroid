// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class kg7 extends Exception {
    public final byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg7(String str, Throwable th) {
        super(str, th);
        xve.g(str, "Provided message must not be empty.");
        this.a = (byte) 13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kg7(String str, int i) {
        super(str);
        xve.g(str, "Provided message must not be empty.");
        this.a = i;
    }
}
