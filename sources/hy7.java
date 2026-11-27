// default package

import java.io.IOException;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class hy7 extends IOException {
    public final boolean a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public hy7(String str, Exception exc, boolean z, int i) {
        super(str, exc);
        this.a = z;
        this.b = i;
    }

    public static hy7 a(String str, Exception exc) {
        return new hy7(str, exc, true, 1);
    }

    public static hy7 b(String str, Exception exc) {
        return new hy7(str, exc, true, 4);
    }

    public static hy7 c(String str) {
        return new hy7(str, null, true, 8);
    }

    public static hy7 d(String str) {
        return new hy7(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder(message != null ? message.concat(" ") : "");
        sb.append("{contentIsMalformed=");
        sb.append(this.a);
        sb.append(", dataType=");
        return uh9.l(sb, this.b, "}");
    }
}
