// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class be7 extends Exception {
    public final byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be7(String str, Throwable th) {
        super(str, th);
        fre.g(str, "Provided message must not be empty.");
        this.a = (byte) 13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public be7(String str, int i) {
        super(str);
        fre.g(str, "Provided message must not be empty.");
        this.a = i;
    }
}
