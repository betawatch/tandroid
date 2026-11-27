// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class bod extends Throwable {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bod(String str, byte b) {
        super(str);
        this.a = b;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        byte b = this.a;
        return this;
    }
}
